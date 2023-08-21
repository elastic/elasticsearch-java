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

package co.elastic.clients.transport.netty;

import co.elastic.clients.transport.DefaultTransportOptions;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.transport.http.TransportHttpClient;
import co.elastic.clients.util.BinaryData;
import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufInputStream;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.http.DefaultFullHttpRequest;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.HttpClientCodec;
import io.netty.handler.codec.http.HttpContent;
import io.netty.handler.codec.http.HttpHeaderNames;
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.HttpMethod;
import io.netty.handler.codec.http.HttpObject;
import io.netty.handler.codec.http.HttpResponse;
import io.netty.handler.codec.http.HttpVersion;
import io.netty.handler.codec.http.LastHttpContent;
import io.netty.handler.ssl.SslContext;
import io.netty.handler.ssl.SslContextBuilder;
import io.netty.handler.ssl.util.InsecureTrustManagerFactory;
import io.netty.util.concurrent.Future;

import javax.annotation.Nullable;
import javax.net.ssl.SSLException;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

/**
 * Prototype implementation of {@link TransportHttpClient} based on Netty. Not production-ready.
 */
public class NettyTransportHttpClient implements TransportHttpClient {

    private final NioEventLoopGroup workerGroup = new NioEventLoopGroup();
    private final SslContext sslContext;

    public NettyTransportHttpClient() {
        try {
            // Trust any certificate. DO NOT USE IN PRODUCTION!
            this.sslContext = SslContextBuilder
                .forClient()
                .trustManager(InsecureTrustManagerFactory.INSTANCE)
                .build();
        } catch (SSLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public DefaultTransportOptions createOptions(@Nullable TransportOptions options) {
        return DefaultTransportOptions.of(options);
    }

    @Override
    public Response performRequest(String endpointId, Node node, Request request, TransportOptions options) throws IOException {
        try {
            return performRequestAsync(endpointId, node, request, options).get();
        } catch (InterruptedException ie) {
            throw new RuntimeException(ie);
        } catch (ExecutionException ee) {
            // Remove one nesting level
            throw new RuntimeException(ee.getCause());
        }
    }

    @Override
    public CompletableFuture<Response> performRequestAsync(String endpointId, Node node, Request request, TransportOptions options) {

        CompletableFuture<Response> promise = new CompletableFuture<Response>() {
            @Override
            public boolean cancel(boolean mayInterruptIfRunning) {
                // TODO: cancel pending request
                return super.cancel(mayInterruptIfRunning);
            }
        };

        Bootstrap bootstrap = new Bootstrap();
        bootstrap.group(workerGroup)
            .channel(NioSocketChannel.class)
            .option(ChannelOption.SO_KEEPALIVE, true)
            .handler(new ChannelInitializer<SocketChannel>() {
                @Override
                protected void initChannel(SocketChannel ch) throws Exception {
                    ChannelPipeline pipeline = ch.pipeline();
                    if (node.uri().getScheme().equals("https")) {
                        pipeline.addLast(sslContext.newHandler(ch.alloc()));
                    }
                    pipeline.addLast(new HttpClientCodec());
                    pipeline.addLast(new ChannelHandler(node, promise));
                }
            });

        String uri = request.path();

        // If the node is not at the server root, prepend its path.
        String nodePath = node.uri().getRawPath();
        if (nodePath.length() > 1) {
            if (uri.charAt(0) == '/') {
                uri = uri.substring(1);
            }
            uri = nodePath + uri;
        }

        // Append query parameters
        String queryString = queryString(request, options);
        if (queryString != null) {
            uri = uri + "?" + queryString;
        }

        ByteBuf nettyBody;
        Iterable<ByteBuffer> body = request.body();
        if (body == null) {
            nettyBody = Unpooled.buffer(0);
        } else {
            List<ByteBuffer> bufs;
            if (body instanceof List) {
                bufs = (List<ByteBuffer>)body;
            } else {
                bufs = new ArrayList<>();
                for (ByteBuffer buf: body) {
                    bufs.add(buf);
                }
            }
            nettyBody = Unpooled.wrappedBuffer(bufs.toArray(new ByteBuffer[bufs.size()]));
        }

        FullHttpRequest nettyRequest = new DefaultFullHttpRequest(
            HttpVersion.HTTP_1_1,
            HttpMethod.valueOf(request.method()),
            uri,
            nettyBody
        );

        HttpHeaders nettyHeaders = nettyRequest.headers();
        // Netty doesn't set Content-Length automatically with FullRequest.
        nettyHeaders.set(HttpHeaderNames.CONTENT_LENGTH, nettyBody.readableBytes());

        int port = node.uri().getPort();
        if (port == -1) {
            port = node.uri().getScheme().equals("https") ? 443 : 80;
        }

        nettyHeaders.set(HttpHeaderNames.HOST, node.uri().getHost() + ":" + port);

        request.headers().forEach(nettyHeaders::set);
        options.headers().stream().forEach((kv) -> nettyHeaders.set(kv.getKey(), kv.getValue()));

        ChannelFuture future0 = bootstrap.connect(node.uri().getHost(), port);
        future0.addListener((ChannelFutureListener) future1 -> {
            if (checkSuccess(future1, promise)) {
                ChannelFuture future2 = future1.channel().writeAndFlush(nettyRequest);
                future2.addListener((ChannelFutureListener) future3 -> {
                    if (checkSuccess(future3, promise)) {
                        // Log request sent?
                    }
                });
            }
        });

        future0.addListener(future4 -> {
            if (future4.cause() != null) {
                promise.completeExceptionally(future4.cause());
            } else if (future4.isCancelled()) {
                promise.completeExceptionally(new RuntimeException("Request was cancelled"));
            }
        });

        return promise;
    }

    private String queryString(Request request, TransportOptions options) {
        Map<String, String> requestParams = request.queryParams();
        Map<String, String> optionsParams = options == null ? Collections.emptyMap() : options.queryParameters();

        Map<String, String> allParams;
        if (requestParams.isEmpty()) {
            allParams = optionsParams;
        } else if (optionsParams.isEmpty()) {
            allParams = requestParams;
        } else {
            allParams = new HashMap<>(requestParams);
            allParams.putAll(optionsParams);
        }

        if (allParams.isEmpty()) {
            return null;
        } else {
            return allParams
                .entrySet()
                .stream()
                .map(e -> {
                    return URLEncoder.encode(e.getKey(), StandardCharsets.UTF_8) + "=" +
                        URLEncoder.encode(e.getValue(), StandardCharsets.UTF_8);
                })
                .collect(Collectors.joining("&"));
        }
    }

    private boolean checkSuccess(Future<?> future, CompletableFuture<?> promise) {
        if (future.isSuccess()) {
            return true;
        }

        if (future.cause() != null) {
            promise.completeExceptionally(future.cause());
        } else if (future.isCancelled()) {
            promise.completeExceptionally(new RuntimeException("Request was cancelled"));
        } else {
            promise.completeExceptionally(new RuntimeException("Unexpected future state"));
        }
        return false;
    }

    private static void dump(Future<?> future, String name) {
        System.err.println("Future " + name + " - " + future);
        System.err.println("  Done     : " + future.isDone());
        System.err.println("  Success  : " + future.isSuccess());
        System.err.println("  Cancelled: " + future.isCancelled());
        if (future.cause() != null) {
            System.err.println("  Cause    : " + future.cause());
        }
        System.err.flush();
    }

    private static class ChannelHandler extends SimpleChannelInboundHandler<HttpObject> {

        private final CompletableFuture<Response> promise;
        private final Node node;
        private volatile HttpResponse response;
        private volatile List<ByteBuf> body;

        ChannelHandler(Node node, CompletableFuture<Response> promise) {
            this.node = node;
            this.promise = promise;
        }

        @Override
        protected void channelRead0(ChannelHandlerContext ctx, HttpObject msg) throws Exception {
            if (msg instanceof HttpResponse) {
                this.response = (HttpResponse) msg;

            } else if(msg instanceof HttpContent) {
                System.err.flush();
                HttpContent content = (HttpContent) msg;
                ByteBuf buf = content.content();
                if (buf.readableBytes() > 0) {
                    buf.retain();
                    if (this.body == null) {
                        this.body = new ArrayList<>();
                    }
                    this.body.add(buf);
                }

                if(msg instanceof LastHttpContent) {
                    promise.complete(new NettyResponse(node, response, body));
                    ctx.close();
                }
            }
        }
        @Override
        public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
            promise.completeExceptionally(cause);
            ctx.close();
        }
    }

    @Override
    public void close() throws IOException {
        workerGroup.shutdownGracefully();
    }

    private static class NettyResponse implements TransportHttpClient.Response {

        private final Node node;
        private final HttpResponse response;
        @Nullable
        private final List<ByteBuf> body;

        NettyResponse(Node node, HttpResponse response, @Nullable List<ByteBuf> body) {
            this.node = node;
            this.response = response;
            this.body = body;
        }

        @Override
        public Node node() {
            return node;
        }

        @Override
        public int statusCode() {
            return response.status().code();
        }

        @Override
        public String header(String name) {
            return response.headers().get(name);
        }

        @Override
        public List<String> headers(String name) {
            return response.headers().getAll(name); // returns an empty list if no values
        }

        @Nullable
        @Override
        public BinaryData body() throws IOException {
            if (body == null) {
                return null;
            }

            ByteBuf byteBuf = Unpooled.wrappedBuffer(body.size(), body.toArray(new ByteBuf[body.size()]));
            return new InputStreamBinaryData(
                response.headers().get(HttpHeaderNames.CONTENT_TYPE),
                new ByteBufInputStream(byteBuf, true)
            );
        }

        @Nullable
        @Override
        public HttpResponse originalResponse() {
            return this.response;
        }

        @Override
        public void close() throws IOException {
            if (body != null) {
                for (ByteBuf buf: body) {
                    // May have been released already if body() was consumed
                    if (buf.refCnt() > 0) {
                        buf.release();
                    }
                }
                body.clear();
            }
        }
    }
}
