/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package co.elastic.clients.transport.rest5_client.low_level;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.hc.client5.http.ClientProtocolException;
import org.apache.hc.client5.http.ConnectTimeoutException;
import org.apache.hc.client5.http.async.HttpAsyncClient;
import org.apache.hc.client5.http.classic.methods.HttpHead;
import org.apache.hc.client5.http.classic.methods.HttpOptions;
import org.apache.hc.client5.http.classic.methods.HttpPatch;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.classic.methods.HttpPut;
import org.apache.hc.client5.http.classic.methods.HttpTrace;
import org.apache.hc.client5.http.classic.methods.HttpUriRequestBase;
import org.apache.hc.client5.http.config.RequestConfig;
import org.apache.hc.client5.http.entity.GzipCompressingEntity;
import org.apache.hc.client5.http.entity.GzipDecompressingEntity;
import org.apache.hc.client5.http.impl.async.CloseableHttpAsyncClient;
import org.apache.hc.client5.http.protocol.HttpClientContext;
import org.apache.hc.core5.concurrent.FutureCallback;
import org.apache.hc.core5.http.ClassicHttpResponse;
import org.apache.hc.core5.http.ConnectionClosedException;
import org.apache.hc.core5.http.ContentTooLongException;
import org.apache.hc.core5.http.Header;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.HttpHost;
import org.apache.hc.core5.http.HttpRequest;
import org.apache.hc.core5.http.ProtocolException;
import org.apache.hc.core5.http.message.RequestLine;
import org.apache.hc.core5.http.nio.AsyncRequestProducer;
import org.apache.hc.core5.http.nio.AsyncResponseConsumer;
import org.apache.hc.core5.http.nio.support.AsyncRequestBuilder;
import org.apache.hc.core5.net.URIBuilder;
import org.apache.hc.core5.reactor.IOReactorStatus;

import javax.net.ssl.SSLHandshakeException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import static java.util.Collections.singletonList;
import static org.apache.hc.core5.http.HttpHeaders.CONTENT_ENCODING;
import static org.apache.hc.core5.http.HttpHeaders.CONTENT_LENGTH;

/**
 * Client that connects to an Elasticsearch cluster through HTTP.
 * <p>
 * Must be created using {@link Rest5ClientBuilder}, which allows to set all the different options or just
 * rely on defaults.
 * The hosts that are part of the cluster need to be provided at creation time, but can also be replaced later
 * by calling {@link #setNodes(Collection)}.
 * <p>
 * The method {@link #performRequest(Request)} allows to send a request to the cluster. When
 * sending a request, a host gets selected out of the provided ones in a round-robin fashion. Failing hosts
 * are marked dead and
 * retried after a certain amount of time (minimum 1 minute, maximum 30 minutes), depending on how many
 * times they previously
 * failed (the more failures, the later they will be retried). In case of failures all of the alive nodes
 * (or dead nodes that
 * deserve a retry) are retried until one responds or none of them does, in which case an
 * {@link IOException} will be thrown.
 * <p>
 * Requests can be either synchronous or asynchronous. The asynchronous variants all end with {@code Async}.
 * <p>
 * Requests can be traced by enabling trace logging for "tracer". The trace logger outputs requests and
 * responses in curl format.
 */
public class Rest5Client implements Closeable {

    public static final String IGNORE_RESPONSE_CODES_PARAM = "ignore";

    private static final Log logger = LogFactory.getLog(Rest5Client.class);

    private final CloseableHttpAsyncClient client;
    // We don't rely on default headers supported by HttpAsyncClient as those cannot be replaced.
    // These are package private for tests.
    final List<Header> defaultHeaders;
    private final String pathPrefix;
    private final AtomicInteger lastNodeIndex = new AtomicInteger(0);
    private final ConcurrentMap<HttpHost, DeadHostState> blacklist = new ConcurrentHashMap<>();
    private final FailureListener failureListener;
    private final NodeSelector nodeSelector;
    private volatile List<Node> nodes;
    private final WarningsHandler warningsHandler;
    private final boolean compressionEnabled;
    private final boolean metaHeaderEnabled;
    private final ScheduledExecutorService healthCheckExecutor;
    private volatile boolean closed = false;

    Rest5Client(
        CloseableHttpAsyncClient client,
        Header[] defaultHeaders,
        List<Node> nodes,
        String pathPrefix,
        FailureListener failureListener,
        NodeSelector nodeSelector,
        boolean strictDeprecationMode,
        boolean compressionEnabled,
        boolean metaHeaderEnabled
    ) {
        this.client = client;
        this.defaultHeaders = Collections.unmodifiableList(Arrays.asList(defaultHeaders));
        this.failureListener = failureListener;
        this.pathPrefix = pathPrefix;
        this.nodeSelector = nodeSelector;
        this.warningsHandler = strictDeprecationMode ? WarningsHandler.STRICT : WarningsHandler.PERMISSIVE;
        this.compressionEnabled = compressionEnabled;
        this.metaHeaderEnabled = metaHeaderEnabled;
        setNodes(nodes);
        
        // 初始化连接池健康检查执行器
        this.healthCheckExecutor = new ScheduledThreadPoolExecutor(1, r -> {
            Thread thread = new Thread(r, "elasticsearch-rest-client-health-check");
            thread.setDaemon(true);
            return thread;
        });
        
        // 启动定期健康检查（每30秒执行一次）
        this.healthCheckExecutor.scheduleAtFixedRate(
            this::performHealthCheck,
            30, 30, TimeUnit.SECONDS
        );
    }

    /**
     * Returns a new {@link Rest5ClientBuilder} to help with {@link Rest5Client} creation.
     * Creates a new builder instance and sets the hosts that the client will send requests to.
     */
    public static Rest5ClientBuilder builder(URI... uris) {
        return builder(Arrays.asList(uris));
    }

    /**
     * Returns a new {@link Rest5ClientBuilder} to help with {@link Rest5Client} creation.
     * Creates a new builder instance and sets the hosts that the client will send requests to.
     */
    public static Rest5ClientBuilder builder(List<URI> uris) {
        if (uris == null || uris.isEmpty()) {
            throw new IllegalArgumentException("uris must not be null nor empty");
        }
        String prefix = uris.get(0).getPath();

        List<Node> nodes = uris.stream().map(u -> {
            if (!u.isAbsolute()) {
                throw new IllegalArgumentException("Expecting an absolute url: [" + u + "]");
            }
            if (!Objects.equals(u.getPath(), prefix)) {
                throw new IllegalArgumentException(
                    "All hosts must have the same URL path (" +
                        uris.get(0) + " and " + u + ")"
                );
            }
            return new Node(HttpHost.create(u));
        }).toList();

        Rest5ClientBuilder result = new Rest5ClientBuilder(nodes);

        if (prefix != null && !prefix.isEmpty()) {
            result.setPathPrefix(prefix);
        }
        return result;
    }

    /**
     * Returns a new {@link Rest5ClientBuilder} to help with {@link Rest5Client} creation.
     * Creates a new builder instance and sets the hosts that the client will send requests to.
     * <p>
     * Prefer this to {@link #builder(HttpHost...)} if you have metadata up front about the nodes.
     * If you don't either one is fine.
     */
    public static Rest5ClientBuilder builder(Node... nodes) {
        return new Rest5ClientBuilder(nodes == null ? null : Arrays.asList(nodes));
    }

    /**
     * Returns a new {@link Rest5ClientBuilder} to help with {@link Rest5Client} creation.
     * Creates a new builder instance and sets the nodes that the client will send requests to.
     * <p>
     * You can use this if you do not have metadata up front about the nodes. If you do, prefer
     * {@link #builder(Node...)}.
     *
     * @see Node#Node(HttpHost)
     */
    public static Rest5ClientBuilder builder(HttpHost... hosts) {
        if (hosts == null || hosts.length == 0) {
            throw new IllegalArgumentException("hosts must not be null nor empty");
        }
        List<Node> nodes = Arrays.stream(hosts).map(Node::new).collect(Collectors.toList());
        return new Rest5ClientBuilder(nodes);
    }

    /**
     * Get the underlying HTTP client.
     */
    public HttpAsyncClient getHttpClient() {
        return this.client;
    }

    /**
     * Replaces the nodes with which the client communicates.
     */
    public synchronized void setNodes(Collection<Node> nodes) {
        if (nodes == null || nodes.isEmpty()) {
            throw new IllegalArgumentException("node list must not be null or empty");
        }

        Map<HttpHost, Node> nodesByHost = new LinkedHashMap<>();
        for (Node node : nodes) {
            Objects.requireNonNull(node, "node cannot be null");
            nodesByHost.put(node.getHost(), node);
        }
        this.nodes = new ArrayList<>(nodesByHost.values());
        this.blacklist.clear();
    }

    /**
     * Get the list of nodes that the client knows about. The list is
     * unmodifiable.
     */
    public List<Node> getNodes() {
        return nodes;
    }

    /**
     * check client running status
     *
     * @return client running status
     */
    public boolean isRunning() {
        return client.getStatus() == IOReactorStatus.ACTIVE;
    }

    /**
     * Sends a request to the Elasticsearch cluster that the client points to.
     * Blocks until the request is completed and returns its response or fails
     * by throwing an exception. Selects a host out of the provided ones in a
     * round-robin fashion. Failing hosts are marked dead and retried after a
     * certain amount of time (minimum 1 minute, maximum 30 minutes), depending
     * on how many times they previously failed (the more failures, the later
     * they will be retried). In case of failures all of the alive nodes (or
     * dead nodes that deserve a retry) are retried until one responds or none
     * of them does, in which case an {@link IOException} will be thrown.
     * <p>
     * This method works by performing an asynchronous call and waiting
     * for the result. If the asynchronous call throws an exception we wrap
     * it and rethrow it so that the stack trace attached to the exception
     * contains the call site. While we attempt to preserve the original
     * exception this isn't always possible and likely haven't covered all of
     * the cases. You can get the original exception from
     * {@link Exception#getCause()}.
     * <p>
     * Differently from the legacy RestClient, this method does not throw exception
     * in case of 4xx errors from the server, since often the server returns 4xx exceptions with
     * bodies as part of the standard workflow.
     *
     * @param request the request to perform
     * @return the response returned by Elasticsearch
     * @throws IOException             in case of a problem or the connection was aborted
     * @throws ClientProtocolException in case of an http protocol error
     * @throws ResponseException       in case Elasticsearch responded with a 5xx status code that indicated an
     *                                 error
     */
    public Response performRequest(Request request) throws IOException {
        InternalRequest internalRequest = new InternalRequest(request);
        return performRequest(nextNodes(), internalRequest, null);
    }

    private Response performRequest(final Iterator<Node> nodes, final InternalRequest request,
                                    Exception previousException)
        throws IOException {
        RequestContext context = request.createContextForNextAttempt(nodes.next());
        ClassicHttpResponse httpResponse;
        try {
            httpResponse = client.execute(context.requestProducer,
                context.asyncResponseConsumer,
                context.context, null).get();
        } catch (Exception e) {
            RequestLogger.logFailedRequest(logger, request.httpRequest, context.node, e);
            onFailure(context.node);
            Exception cause = extractAndWrapCause(e);
            addSuppressedException(previousException, cause);
            if (isRetryableException(e) && nodes.hasNext()) {
                return performRequest(nodes, request, cause);
            }
            if (cause instanceof IOException) {
                throw (IOException) cause;
            }
            if (cause instanceof RuntimeException) {
                throw (RuntimeException) cause;
            }
            throw new IllegalStateException("unexpected exception type: must be either RuntimeException or " +
                "IOException", cause);
        }
        ResponseOrResponseException responseOrResponseException = convertResponse(request, context.node,
            httpResponse);
        if (responseOrResponseException.responseException == null) {
            return responseOrResponseException.response;
        }
        addSuppressedException(previousException, responseOrResponseException.responseException);
        if (nodes.hasNext()) {
            return performRequest(nodes, request, responseOrResponseException.responseException);
        }
        throw responseOrResponseException.responseException;
    }

    private ResponseOrResponseException convertResponse(InternalRequest request, Node node,
                                                        ClassicHttpResponse httpResponse) throws IOException {
        RequestLogger.logResponse(logger, request.httpRequest, node.getHost(), httpResponse);
        int statusCode = httpResponse.getCode();

        HttpEntity entity = httpResponse.getEntity();
        if (entity != null) {
            Header encoding = null;
            try {
                encoding = httpResponse.getHeader(CONTENT_ENCODING);
            } catch (ProtocolException e) {
                throw new IOException("Couldn't retrieve content encoding: " + e);
            }
            if (encoding != null && "gzip".equals(encoding.getValue())) {
                // Decompress and cleanup response headers
                httpResponse.setEntity(new GzipDecompressingEntity(entity));
                httpResponse.removeHeaders(CONTENT_ENCODING);
                httpResponse.removeHeaders(CONTENT_LENGTH);
            }
        }

        Response response = new Response(new RequestLine(request.httpRequest), node.getHost(), httpResponse);
        if (isCorrectServerResponse(statusCode)) {
            onResponse(node);
            if (request.warningsHandler.warningsShouldFailRequest(response.getWarnings())) {
                throw new WarningFailureException(response);
            }
            return new ResponseOrResponseException(response);
        }
        ResponseException responseException = new ResponseException(response);
        if (isRetryStatus(statusCode)) {
            // mark host dead and retry against next one
            onFailure(node);
            return new ResponseOrResponseException(responseException);
        }
        // mark host alive and don't retry, as the error should be a request problem
        onResponse(node);
        throw responseException;
    }

    /**
     * Sends a request to the Elasticsearch cluster that the client points to.
     * The request is executed asynchronously and the provided
     * {@link ResponseListener} gets notified upon request completion or
     * failure. Selects a host out of the provided ones in a round-robin
     * fashion. Failing hosts are marked dead and retried after a certain
     * amount of time (minimum 1 minute, maximum 30 minutes), depending on how
     * many times they previously failed (the more failures, the later they
     * will be retried). In case of failures all of the alive nodes (or dead
     * nodes that deserve a retry) are retried until one responds or none of
     * them does, in which case an {@link IOException} will be thrown.
     *
     * @param request          the request to perform
     * @param responseListener the {@link ResponseListener} to notify when the
     *                         request is completed or fails
     */
    public Cancellable performRequestAsync(Request request, ResponseListener responseListener) {
        try {
            FailureTrackingResponseListener failureTrackingResponseListener =
                new FailureTrackingResponseListener(responseListener);
            InternalRequest internalRequest = new InternalRequest(request);
            performRequestAsync(nextNodes(), internalRequest, failureTrackingResponseListener);
            return internalRequest.cancellable;
        } catch (Exception e) {
            responseListener.onFailure(e);
            return Cancellable.NO_OP;
        }
    }

    private void performRequestAsync(
        final Iterator<Node> nodes,
        final InternalRequest request,
        final FailureTrackingResponseListener listener
    ) {
        request.cancellable.runIfNotCancelled(() -> {
            final RequestContext context;
            context = request.createContextForNextAttempt(nodes.next());
            Future<ClassicHttpResponse> futureRef = client.execute(context.requestProducer, context.asyncResponseConsumer, context.context,
                new FutureCallback<ClassicHttpResponse>() {
                    @Override
                    public void completed(ClassicHttpResponse httpResponse) {
                        try {
                            ResponseOrResponseException responseOrResponseException = convertResponse(request,
                                context.node, httpResponse);
                            if (responseOrResponseException.responseException == null) {
                                listener.onSuccess(responseOrResponseException.response);
                            } else {
                                if (nodes.hasNext()) {
                                    listener.trackFailure(responseOrResponseException.responseException);
                                    performRequestAsync(nodes, request, listener);
                                } else {
                                    listener.onDefinitiveFailure(responseOrResponseException.responseException);
                                }
                            }
                        } catch (Exception e) {
                            listener.onDefinitiveFailure(e);
                        }
                    }

                    @Override
                    public void failed(Exception failure) {
                        try {
                            RequestLogger.logFailedRequest(logger, request.httpRequest, context.node,
                                failure);
                            onFailure(context.node);
                            if (isRetryableException(failure) && nodes.hasNext()) {
                                listener.trackFailure(failure);
                                performRequestAsync(nodes, request, listener);
                            } else {
                                listener.onDefinitiveFailure(failure);
                            }
                        } catch (Exception e) {
                            listener.onDefinitiveFailure(e);
                        }
                    }

                    @Override
                    public void cancelled() {
                        listener.onDefinitiveFailure(Cancellable.newCancellationException());
                    }
                });
            // needed to be able to cancel asnyc requests
            if (futureRef instanceof org.apache.hc.core5.concurrent.Cancellable) {
                request.httpRequest.setDependency((org.apache.hc.core5.concurrent.Cancellable) futureRef);
            }
        });
    }

    /**
     * Returns a non-empty {@link Iterator} of nodes to be used for a request
     * that match the {@link NodeSelector}.
     * <p>
     * If there are no living nodes that match the {@link NodeSelector}
     * this will return the dead node that matches the {@link NodeSelector}
     * that is closest to being revived.
     *
     * @throws IOException if no nodes are available
     */
    private Iterator<Node> nextNodes() throws IOException {
        List<Node> nodes = this.nodes;
        return selectNodes(nodes, blacklist, lastNodeIndex, nodeSelector).iterator();
    }

    /**
     * Select nodes to try and sorts them so that the first one will be tried initially, then the following
     * ones
     * if the previous attempt failed and so on. Package private for testing.
     */
    static Iterable<Node> selectNodes(
        List<Node> nodes,
        Map<HttpHost, DeadHostState> blacklist,
        AtomicInteger lastNodeIndex,
        NodeSelector nodeSelector
    ) throws IOException {
        /*
         * Sort the nodes into living and dead lists.
         */
        List<Node> livingNodes = new ArrayList<>(Math.max(0, nodes.size() - blacklist.size()));
        List<DeadNode> deadNodes = null;
        if (!blacklist.isEmpty()) {
            deadNodes = new ArrayList<>(blacklist.size());
            new ArrayList<>(blacklist.size());
            for (Node node : nodes) {
                DeadHostState deadness = blacklist.get(node.getHost());
                if (deadness == null || deadness.shallBeRetried()) {
                    livingNodes.add(node);
                } else {
                    deadNodes.add(new DeadNode(node, deadness));
                }
            }
        }
        // happy path when no failing nodes
        else {
            livingNodes.addAll(nodes);
        }

        if (!livingNodes.isEmpty()) {
            /*
             * Normal state: there is at least one living node. If the
             * selector is ok with any over the living nodes then use them
             * for the request.
             */
            List<Node> selectedLivingNodes = new ArrayList<>(livingNodes);
            nodeSelector.select(selectedLivingNodes);
            if (!selectedLivingNodes.isEmpty()) {
                /*
                 * Rotate the list using a global counter as the distance so subsequent
                 * requests will try the nodes in a different order.
                 */
                Collections.rotate(selectedLivingNodes, lastNodeIndex.getAndIncrement());
                return selectedLivingNodes;
            }
        }

        /*
         * Last resort: there are no good nodes to use, either because
         * the selector rejected all the living nodes or because there aren't
         * any living ones. Either way, we want to revive a single dead node
         * that the NodeSelectors are OK with. We do this by passing the dead
         * nodes through the NodeSelector so it can have its say in which nodes
         * are ok. If the selector is ok with any of the nodes then we will take
         * the one in the list that has the lowest revival time and try it.
         */
        if (deadNodes != null && !deadNodes.isEmpty()) {
            final List<DeadNode> selectedDeadNodes = new ArrayList<>(deadNodes);
            /*
             * We'd like NodeSelectors to remove items directly from deadNodes
             * so we can find the minimum after it is filtered without having
             * to compare many things. This saves us a sort on the unfiltered
             * list.
             */
            nodeSelector.select(() -> new DeadNodeIteratorAdapter(selectedDeadNodes.iterator()));
            if (!selectedDeadNodes.isEmpty()) {
                return singletonList(Collections.min(selectedDeadNodes).node);
            }
        }
        throw new IOException("NodeSelector [" + nodeSelector + "] rejected all nodes, living: " + livingNodes + " and dead: " + deadNodes);
    }

    /**
     * Called after each successful request call.
     * Receives as an argument the host that was used for the successful request.
     */
    private void onResponse(Node node) {
        DeadHostState removedHost = this.blacklist.remove(node.getHost());
        if (logger.isDebugEnabled() && removedHost != null) {
            logger.debug("removed [" + node + "] from blacklist");
        }
    }

    /**
     * Called after each failed attempt.
     * Receives as an argument the host that was used for the failed attempt.
     */
    private void onFailure(Node node) {
        DeadHostState previousDeadHostState = blacklist.putIfAbsent(
            node.getHost(),
            new DeadHostState(DeadHostState.DEFAULT_TIME_SUPPLIER)
        );
        if (previousDeadHostState == null) {
            if (logger.isDebugEnabled()) {
                logger.debug("added [" + node + "] to blacklist");
            }
        } else {
            blacklist.replace(node.getHost(), previousDeadHostState,
                new DeadHostState(previousDeadHostState));
            if (logger.isDebugEnabled()) {
                logger.debug("updated [" + node + "] already in blacklist");
            }
        }
        failureListener.onFailure(node);
    }

    @Override
    /**
     * 执行连接池健康检查
     */
    private void performHealthCheck() {
        if (closed) {
            return;
        }
        
        try {
            // 检查客户端状态
            if (client instanceof org.apache.hc.client5.http.impl.async.CloseableHttpAsyncClientImpl) {
                org.apache.hc.client5.http.impl.async.CloseableHttpAsyncClientImpl clientImpl = 
                    (org.apache.hc.client5.http.impl.async.CloseableHttpAsyncClientImpl) client;
                
                // 获取连接管理器
                org.apache.hc.client5.http.impl.nio.PoolingAsyncClientConnectionManager connectionManager = 
                    (org.apache.hc.client5.http.impl.nio.PoolingAsyncClientConnectionManager) clientImpl.getConnectionManager();
                
                // 检查连接池状态
                int totalConnections = connectionManager.getTotalStats().getAvailable() + 
                                      connectionManager.getTotalStats().getLeased() + 
                                      connectionManager.getTotalStats().getPending() + 
                                      connectionManager.getTotalStats().getMax();
                
                // 如果连接数超过阈值，输出警告日志
                if (totalConnections > connectionManager.getMaxTotal()) {
                    logger.warn("Connection pool usage exceeded maximum limit. Total connections: " + totalConnections + ", Max: " + connectionManager.getMaxTotal());
                }
                
                // 定期清理过期连接
                connectionManager.closeExpiredConnections();
                connectionManager.closeIdleConnections(Timeout.of(5, TimeUnit.MINUTES));
            }
        } catch (Exception e) {
            logger.debug("Failed to perform connection pool health check", e);
        }
    }

    @Override
    public void close() throws IOException {
        closed = true;
        
        // 关闭健康检查执行器
        if (healthCheckExecutor != null) {
            healthCheckExecutor.shutdown();
            try {
                if (!healthCheckExecutor.awaitTermination(5, TimeUnit.SECONDS)) {
                    healthCheckExecutor.shutdownNow();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                healthCheckExecutor.shutdownNow();
            }
        }
        
        // 关闭HTTP客户端
        if (client != null) {
            client.close();
        }
    }

    /**
     * 400 or lower responses are part of the server behavior, only considering >500 for dead nodes marking
     * purposes
     */
    private static boolean isCorrectServerResponse(int statusCode) {
        return statusCode < 500;
    }

    private static boolean isRetryStatus(int statusCode) {
        switch (statusCode) {
            case 502:
            case 503:
            case 504:
                return true;
        }
        return false;
    }

    /**
     * Should an exception cause retrying the request?
     */
    private static boolean isRetryableException(Throwable e) {
        if (e instanceof ExecutionException) {
            e = e.getCause();
        }
        if (e instanceof ContentTooLongException) {
            return false;
        }
        return true;
    }

    private static void addSuppressedException(Exception suppressedException, Exception currentException) {
        if (suppressedException != null && suppressedException != currentException) {
            currentException.addSuppressed(suppressedException);
        }
    }

    private static HttpUriRequestBase createHttpRequest(String method, URI uri, HttpEntity entity,
                                                        boolean compressionEnabled) {
        switch (method.toUpperCase(Locale.ROOT)) {
            case HttpDeleteWithEntity.METHOD_NAME:
                return addRequestBody(new HttpDeleteWithEntity(uri), entity, compressionEnabled);
            case HttpGetWithEntity.METHOD_NAME:
                return addRequestBody(new HttpGetWithEntity(uri), entity, compressionEnabled);
            case HttpHead.METHOD_NAME:
                return addRequestBody(new HttpHead(uri), entity, compressionEnabled);
            case HttpOptions.METHOD_NAME:
                return addRequestBody(new HttpOptions(uri), entity, compressionEnabled);
            case HttpPatch.METHOD_NAME:
                return addRequestBody(new HttpPatch(uri), entity, compressionEnabled);
            case HttpPost.METHOD_NAME:
                HttpPost httpPost = new HttpPost(uri);
                addRequestBody(httpPost, entity, compressionEnabled);
                return httpPost;
            case HttpPut.METHOD_NAME:
                return addRequestBody(new HttpPut(uri), entity, compressionEnabled);
            case HttpTrace.METHOD_NAME:
                return addRequestBody(new HttpTrace(uri), entity, compressionEnabled);
            default:
                throw new UnsupportedOperationException("http method not supported: " + method);
        }
    }

    private static HttpUriRequestBase addRequestBody(HttpUriRequestBase httpRequest, HttpEntity entity,
                                                     boolean compressionEnabled) {
        if (entity != null) {
            if (canHaveBody(httpRequest)) {
                if (compressionEnabled) {
                    entity = new ContentCompressingEntity(entity);
                }
                httpRequest.setEntity(entity);
            } else {
                throw new UnsupportedOperationException(httpRequest.getMethod() + " with body is not " +
                    "supported");
            }
        }
        return httpRequest;
    }

    private static boolean canHaveBody(HttpRequest httpRequest) {
        return httpRequest.getMethod().equals("PUT") || httpRequest.getMethod().equals("POST") ||
            httpRequest.getMethod().equals("PATCH") ||
            httpRequest instanceof HttpDeleteWithEntity || httpRequest instanceof HttpGetWithEntity;
    }

    static URI buildUri(String pathPrefix, String path, Map<String, String> params) {
        Objects.requireNonNull(path, "path must not be null");
        try {
            String fullPath;
            if (pathPrefix != null && pathPrefix.isEmpty() == false) {
                if (pathPrefix.endsWith("/") && path.startsWith("/")) {
                    fullPath = pathPrefix.substring(0, pathPrefix.length() - 1) + path;
                } else if (pathPrefix.endsWith("/") || path.startsWith("/")) {
                    fullPath = pathPrefix + path;
                } else {
                    fullPath = pathPrefix + "/" + path;
                }
            } else {
                fullPath = path;
            }

            URIBuilder uriBuilder = new URIBuilder(fullPath);
            for (Map.Entry<String, String> param : params.entrySet()) {
                uriBuilder.addParameter(param.getKey(), param.getValue());
            }
            return uriBuilder.build();
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e.getMessage(), e);
        }
    }

    /**
     * Listener used in any async call to wrap the provided user listener (or SyncResponseListener in sync
     * calls).
     * Allows to track potential failures coming from the different retry attempts and returning to the
     * original listener
     * only when we got a response (successful or not to be retried) or there are no hosts to retry against.
     */
    static class FailureTrackingResponseListener {
        private final ResponseListener responseListener;
        private volatile Exception exception;

        FailureTrackingResponseListener(ResponseListener responseListener) {
            this.responseListener = responseListener;
        }

        /**
         * Notifies the caller of a response through the wrapped listener
         */
        void onSuccess(Response response) {
            responseListener.onSuccess(response);
        }

        /**
         * Tracks one last definitive failure and returns to the caller by notifying the wrapped listener
         */
        void onDefinitiveFailure(Exception e) {
            trackFailure(e);
            responseListener.onFailure(this.exception);
        }

        /**
         * Tracks an exception, which caused a retry hence we should not return yet to the caller
         */
        void trackFailure(Exception e) {
            addSuppressedException(this.exception, e);
            this.exception = e;
        }
    }

    /**
     * Listener that allows to be notified whenever a failure happens. Useful when sniffing is enabled, so
     * that we can sniff on failure.
     * The default implementation is a no-op.
     */
    public static class FailureListener {
        /**
         * Notifies that the node provided as argument has just failed
         */
        public void onFailure(Node node) {
        }
    }

    /**
     * Contains a reference to a blacklisted node and the time until it is
     * revived. We use this so we can do a single pass over the blacklist.
     */
    private static class DeadNode implements Comparable<DeadNode> {
        final Node node;
        final DeadHostState deadness;

        DeadNode(Node node, DeadHostState deadness) {
            this.node = node;
            this.deadness = deadness;
        }

        @Override
        public String toString() {
            return node.toString();
        }

        @Override
        public int compareTo(DeadNode rhs) {
            return deadness.compareTo(rhs.deadness);
        }
    }

    /**
     * Adapts an <code>Iterator&lt;DeadNodeAndRevival&gt;</code> into an
     * <code>Iterator&lt;Node&gt;</code>.
     */
    private static class DeadNodeIteratorAdapter implements Iterator<Node> {
        private final Iterator<DeadNode> itr;

        private DeadNodeIteratorAdapter(Iterator<DeadNode> itr) {
            this.itr = itr;
        }

        @Override
        public boolean hasNext() {
            return itr.hasNext();
        }

        @Override
        public Node next() {
            return itr.next().node;
        }

        @Override
        public void remove() {
            itr.remove();
        }
    }

    private class InternalRequest {
        private final Request request;
        private final HttpUriRequestBase httpRequest;
        private final Cancellable cancellable;
        private final WarningsHandler warningsHandler;

        InternalRequest(Request request) {
            this.request = request;
            Map<String, String> params = new HashMap<>(request.getParameters());
            params.putAll(request.getOptions().getParameters());
            URI uri = buildUri(pathPrefix, request.getEndpoint(), params);
            this.httpRequest = createHttpRequest(request.getMethod(), uri, request.getEntity(),
                compressionEnabled);
            this.cancellable = Cancellable.fromRequest(httpRequest);
            setHeaders(httpRequest, request.getOptions().getHeaders());
            setRequestConfig(httpRequest, request.getOptions().getRequestConfig());
            this.warningsHandler = request.getOptions().getWarningsHandler() == null
                ? Rest5Client.this.warningsHandler
                : request.getOptions().getWarningsHandler();
        }

        private void setHeaders(HttpRequest req, Collection<Header> requestHeaders) {
            // request headers override default headers, so we don't add default headers if they exist as
            // request headers
            final Set<String> requestNames = new HashSet<>(requestHeaders.size());
            for (Header requestHeader : requestHeaders) {
                req.addHeader(requestHeader);
                requestNames.add(requestHeader.getName());
            }
            for (Header defaultHeader : defaultHeaders) {
                if (!requestNames.contains(defaultHeader.getName())) {
                    req.addHeader(defaultHeader);
                }
            }
            if (compressionEnabled) {
                req.addHeader("Accept-Encoding", "gzip");
            }
            if (metaHeaderEnabled) {
                if (!req.containsHeader(Rest5ClientBuilder.META_HEADER_NAME)) {
                    req.setHeader(Rest5ClientBuilder.META_HEADER_NAME, Rest5ClientBuilder.META_HEADER_VALUE);
                }
            } else {
                req.removeHeaders(Rest5ClientBuilder.META_HEADER_NAME);
            }
        }

        private void setRequestConfig(HttpUriRequestBase requestBase, RequestConfig requestConfig) {
            if (requestConfig != null) {
                requestBase.setConfig(requestConfig);
            }
        }

        RequestContext createContextForNextAttempt(Node node) {
            this.httpRequest.reset();
            return new RequestContext(this, node);
        }
    }

    private static class RequestContext {
        private final Node node;
        private final AsyncRequestProducer requestProducer;
        private final AsyncResponseConsumer<ClassicHttpResponse> asyncResponseConsumer;
        private final HttpClientContext context;

        RequestContext(InternalRequest request, Node node) {
            this.node = node;
            // we stream the request body if the entity allows for it
            AsyncRequestBuilder builder = AsyncRequestBuilder
                .create(request.httpRequest.getMethod())
                .setUri(request.httpRequest.getRequestUri())
                .setHttpHost(node.getHost())
                .setHeaders(request.httpRequest.getHeaders());

            if (request.httpRequest.getEntity() != null) {
                builder.setEntity(new BasicAsyncEntityProducer(request.httpRequest.getEntity()));
            }

            this.requestProducer = builder.build();
            this.asyncResponseConsumer = request.request.getOptions()
                .getHttpAsyncResponseConsumerFactory()
                .createHttpAsyncResponseConsumer();
            this.context = HttpClientContext.create();
        }
    }

    private static class ResponseOrResponseException {
        private final Response response;
        private final ResponseException responseException;

        ResponseOrResponseException(Response response) {
            this.response = Objects.requireNonNull(response);
            this.responseException = null;
        }

        ResponseOrResponseException(ResponseException responseException) {
            this.responseException = Objects.requireNonNull(responseException);
            this.response = null;
        }
    }

    /**
     * Wrap the exception so the caller's signature shows up in the stack trace, taking care to copy the
     * original type and message
     * where possible so async and sync code don't have to check different exceptions.
     */
    private static Exception extractAndWrapCause(Exception exception) {
        if (exception instanceof InterruptedException) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("thread waiting for the response was interrupted", exception);
        }
        if (exception instanceof ExecutionException) {
            ExecutionException executionException = (ExecutionException) exception;
            Throwable t = executionException.getCause() == null ? executionException :
                executionException.getCause();
            if (t instanceof Error) {
                throw (Error) t;
            }
            exception = (Exception) t;
        }
        if (exception instanceof ConnectTimeoutException) {
            ConnectTimeoutException e = new ConnectTimeoutException(exception.getMessage());
            e.initCause(exception);
            return e;
        }
        if (exception instanceof SocketTimeoutException) {
            SocketTimeoutException e = new SocketTimeoutException(exception.getMessage());
            e.initCause(exception);
            return e;
        }
        if (exception instanceof ConnectionClosedException) {
            ConnectionClosedException e = new ConnectionClosedException(exception.getMessage(), exception);
            return e;
        }
        if (exception instanceof SSLHandshakeException) {
            SSLHandshakeException e = new SSLHandshakeException(exception.getMessage());
            e.initCause(exception);
            return e;
        }
        if (exception instanceof ConnectException) {
            ConnectException e = new ConnectException(exception.getMessage());
            e.initCause(exception);
            return e;
        }
        if (exception instanceof IOException) {
            return new IOException(exception.getMessage(), exception);
        }
        if (exception instanceof RuntimeException) {
            return new RuntimeException(exception.getMessage(), exception);
        }
        return new RuntimeException("error while performing request", exception);
    }

    /**
     * A gzip compressing entity that also implements {@code getContent()}.
     */
    public static class ContentCompressingEntity extends GzipCompressingEntity {

        public ContentCompressingEntity(HttpEntity entity) {
            super(entity);
        }

        @Override
        public InputStream getContent() throws IOException {
            ByteArrayInputOutputStream out = new ByteArrayInputOutputStream(1024);
            writeTo(out);
            return out.asInput();
        }
    }

    /**
     * A ByteArrayOutputStream that can be turned into an input stream without copying the underlying buffer.
     */
    private static class ByteArrayInputOutputStream extends ByteArrayOutputStream {
        ByteArrayInputOutputStream(int size) {
            super(size);
        }

        public InputStream asInput() {
            return new ByteArrayInputStream(this.buf, 0, this.count);
        }
    }
}
