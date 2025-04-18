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

import org.apache.hc.client5.http.auth.AuthCache;
import org.apache.hc.client5.http.impl.async.CloseableHttpAsyncClient;
import org.apache.hc.client5.http.impl.auth.BasicAuthCache;
import org.apache.hc.client5.http.impl.auth.BasicScheme;
import org.apache.hc.core5.http.Header;
import org.apache.hc.core5.http.HttpHost;
import org.apache.hc.core5.reactor.IOReactorStatus;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Supplier;

import static java.util.Collections.singletonList;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class RestClientTests extends RestClientTestCase {

    @Test
    public void testCloseIsIdempotent() throws IOException {
        List<Node> nodes = singletonList(new Node(new HttpHost("localhost", 9200)));
        CloseableHttpAsyncClient closeableHttpAsyncClient = mock(CloseableHttpAsyncClient.class);
        Rest5Client restClient = new Rest5Client(closeableHttpAsyncClient, new Header[0], nodes, null, null,
            null, false, false, false);
        restClient.close();
        verify(closeableHttpAsyncClient, times(1)).close();
        restClient.close();
        verify(closeableHttpAsyncClient, times(2)).close();
        restClient.close();
        verify(closeableHttpAsyncClient, times(3)).close();
    }

    @Test
    public void testPerformAsyncWithUnsupportedMethod() throws Exception {
        final CountDownLatch latch = new CountDownLatch(1);
        try (Rest5Client restClient = createRestClient()) {
            restClient.performRequestAsync(new Request("unsupported", randomAsciiLettersOfLength(5)),
                new ResponseListener() {
                @Override
                public void onSuccess(Response response) {
                    throw new UnsupportedOperationException("onSuccess cannot be called when using a mocked" +
                        " http client");
                }

                @Override
                public void onFailure(Exception exception) {
                    try {
                        assertThat(exception, instanceOf(UnsupportedOperationException.class));
                        assertEquals("http method not supported: unsupported", exception.getMessage());
                    } finally {
                        latch.countDown();
                    }
                }
            });
            assertTrue("time out waiting for request to return", latch.await(1000, TimeUnit.MILLISECONDS));
        }
    }

    @Test
    public void testPerformAsyncWithWrongEndpoint() throws Exception {
        final CountDownLatch latch = new CountDownLatch(1);
        try (Rest5Client restClient = createRestClient()) {
            restClient.performRequestAsync(new Request("GET", "::http:///"), new ResponseListener() {
                @Override
                public void onSuccess(Response response) {
                    throw new UnsupportedOperationException("onSuccess cannot be called when using a mocked" +
                        " http client");
                }

                @Override
                public void onFailure(Exception exception) {
                    try {
                        assertThat(exception, instanceOf(IllegalArgumentException.class));
                        assertEquals("Expected scheme name at index 0: ::http:///", exception.getMessage());
                    } finally {
                        latch.countDown();
                    }
                }
            });
            assertTrue("time out waiting for request to return", latch.await(1000, TimeUnit.MILLISECONDS));
        }
    }

    @Test
    public void testBuildUriLeavesPathUntouched() {
        final Map<String, String> emptyMap = Collections.emptyMap();
        {
            URI uri = Rest5Client.buildUri("/foo$bar", "/index/type/id", emptyMap);
            assertEquals("/foo$bar/index/type/id", uri.getPath());
        }
        {
            URI uri = Rest5Client.buildUri("/", "/*", emptyMap);
            assertEquals("/*", uri.getPath());
        }
        {
            URI uri = Rest5Client.buildUri("/", "*", emptyMap);
            assertEquals("/*", uri.getPath());
        }
        {
            URI uri = Rest5Client.buildUri(null, "*", emptyMap);
            assertEquals("*", uri.getPath());
        }
        {
            URI uri = Rest5Client.buildUri("", "*", emptyMap);
            assertEquals("*", uri.getPath());
        }
        {
            URI uri = Rest5Client.buildUri(null, "/*", emptyMap);
            assertEquals("/*", uri.getPath());
        }
        {
            URI uri = Rest5Client.buildUri(null, "/foo$bar/ty/pe/i/d", emptyMap);
            assertEquals("/foo$bar/ty/pe/i/d", uri.getPath());
        }
        {
            URI uri = Rest5Client.buildUri(null, "/index/type/id", Collections.singletonMap("foo$bar", "x/y" +
                "/z"));
            assertEquals("/index/type/id", uri.getPath());
            assertEquals("foo$bar=x/y/z", uri.getQuery());
        }
    }

    @Test
    public void testSetNodesWrongArguments() throws IOException {
        try (Rest5Client restClient = createRestClient()) {
            restClient.setNodes(null);
            fail("setNodes should have failed");
        } catch (IllegalArgumentException e) {
            assertEquals("node list must not be null or empty", e.getMessage());
        }
        try (Rest5Client restClient = createRestClient()) {
            restClient.setNodes(Collections.emptyList());
            fail("setNodes should have failed");
        } catch (IllegalArgumentException e) {
            assertEquals("node list must not be null or empty", e.getMessage());
        }
        try (Rest5Client restClient = createRestClient()) {
            restClient.setNodes(Collections.singletonList(null));
            fail("setNodes should have failed");
        } catch (NullPointerException e) {
            assertEquals("node cannot be null", e.getMessage());
        }
        try (Rest5Client restClient = createRestClient()) {
            restClient.setNodes(Arrays.asList(new Node(new HttpHost("localhost", 9200)), null,
                new Node(new HttpHost("localhost", 9201))));
            fail("setNodes should have failed");
        } catch (NullPointerException e) {
            assertEquals("node cannot be null", e.getMessage());
        }
    }

    @Test
    public void testSetNodesPreservesOrdering() throws Exception {
        try (Rest5Client restClient = createRestClient()) {
            List<Node> nodes = randomNodes();
            restClient.setNodes(nodes);
            assertEquals(nodes, restClient.getNodes());
        }
    }

    private static List<Node> randomNodes() {
        int numNodes = randomIntBetween(1, 10);
        List<Node> nodes = new ArrayList<>(numNodes);
        for (int i = 0; i < numNodes; i++) {
            nodes.add(new Node(new HttpHost("host-" + i, 9200)));
        }
        return nodes;
    }

    @Test
    public void testSetNodesDuplicatedHosts() throws Exception {
        try (Rest5Client restClient = createRestClient()) {
            int numNodes = randomIntBetween(1, 10);
            List<Node> nodes = new ArrayList<>(numNodes);
            Node node = new Node(new HttpHost("host", 9200));
            for (int i = 0; i < numNodes; i++) {
                nodes.add(node);
            }
            restClient.setNodes(nodes);
            assertEquals(1, restClient.getNodes().size());
            assertEquals(node, restClient.getNodes().get(0));
        }
    }

    @Test
    public void testSelectHosts() throws IOException {
        Node n1 = new Node(new HttpHost("1"), null, null, "1", null, null);
        Node n2 = new Node(new HttpHost("2"), null, null, "2", null, null);
        Node n3 = new Node(new HttpHost("3"), null, null, "3", null, null);

        NodeSelector not1 = new NodeSelector() {
            @Override
            public void select(Iterable<Node> nodes) {
                for (Iterator<Node> itr = nodes.iterator(); itr.hasNext(); ) {
                    if ("1".equals(itr.next().getVersion())) {
                        itr.remove();
                    }
                }
            }

            @Override
            public String toString() {
                return "NOT 1";
            }
        };
        NodeSelector noNodes = new NodeSelector() {
            @Override
            public void select(Iterable<Node> nodes) {
                for (Iterator<Node> itr = nodes.iterator(); itr.hasNext(); ) {
                    itr.next();
                    itr.remove();
                }
            }

            @Override
            public String toString() {
                return "NONE";
            }
        };

        List<Node> nodes = Arrays.asList(n1, n2, n3);

        Map<HttpHost, DeadHostState> emptyBlacklist = Collections.emptyMap();

        // Normal cases where the node selector doesn't reject all living nodes
        assertSelectLivingHosts(Arrays.asList(n1, n2, n3), nodes, emptyBlacklist, NodeSelector.ANY);
        assertSelectLivingHosts(Arrays.asList(n2, n3), nodes, emptyBlacklist, not1);

        /*
         * Try a NodeSelector that excludes all nodes. This should
         * throw an exception
         */
        {
            String message = "NodeSelector [NONE] rejected all nodes, living: ["
                + "[host=http://1, version=1], [host=http://2, version=2], "
                + "[host=http://3, version=3]] and dead: null";
            assertEquals(message, assertSelectAllRejected(nodes, emptyBlacklist, noNodes));
        }

        // Mark all the nodes dead for a few test cases
        {
            final AtomicLong time = new AtomicLong(0L);
            Supplier<Long> timeSupplier = time::get;
            Map<HttpHost, DeadHostState> blacklist = new HashMap<>();
            blacklist.put(n1.getHost(), new DeadHostState(timeSupplier));
            blacklist.put(n2.getHost(), new DeadHostState(new DeadHostState(timeSupplier)));
            blacklist.put(n3.getHost(),
                new DeadHostState(new DeadHostState(new DeadHostState(timeSupplier))));

            /*
             * case when fewer nodes than blacklist, won't result in any IllegalCapacityException
             */
            {
                List<Node> fewerNodeTuple = Arrays.asList(n1, n2);
                assertSelectLivingHosts(Arrays.asList(n1), fewerNodeTuple, blacklist, NodeSelector.ANY);
                assertSelectLivingHosts(Arrays.asList(n2), fewerNodeTuple, blacklist, not1);
            }

            /*
             * selectHosts will revive a single host regardless of
             * blacklist time. It'll revive the node that is closest
             * to being revived that the NodeSelector is ok with.
             */
            assertEquals(singletonList(n1), Rest5Client.selectNodes(nodes, blacklist, new AtomicInteger(),
                NodeSelector.ANY));
            assertEquals(singletonList(n2), Rest5Client.selectNodes(nodes, blacklist, new AtomicInteger(),
                not1));

            /*
             * Try a NodeSelector that excludes all nodes. This should
             * return a failure, but a different failure than when the
             * blacklist is empty so that the caller knows that all of
             * their nodes are blacklisted AND blocked.
             */
            String message = "NodeSelector [NONE] rejected all nodes, living: [] and dead: ["
                + "[host=http://1, version=1], [host=http://2, version=2], "
                + "[host=http://3, version=3]]";
            assertEquals(message, assertSelectAllRejected(nodes, blacklist, noNodes));

            /*
             * Now lets wind the clock forward, past the timeout for one of
             * the dead nodes. We should return it.
             */
            time.set(new DeadHostState(timeSupplier).getDeadUntilNanos());
            assertSelectLivingHosts(Arrays.asList(n1), nodes, blacklist, NodeSelector.ANY);

            /*
             * But if the NodeSelector rejects that node then we'll pick the
             * first on that the NodeSelector doesn't reject.
             */
            assertSelectLivingHosts(Arrays.asList(n2), nodes, blacklist, not1);

            /*
             * If we wind the clock way into the future, past any of the
             * blacklist timeouts then we function as though the nodes aren't
             * in the blacklist at all.
             */
            time.addAndGet(DeadHostState.MAX_CONNECTION_TIMEOUT_NANOS);
            assertSelectLivingHosts(Arrays.asList(n1, n2, n3), nodes, blacklist, NodeSelector.ANY);
            assertSelectLivingHosts(Arrays.asList(n2, n3), nodes, blacklist, not1);
        }
    }

    private void assertSelectLivingHosts(
        List<Node> expectedNodes,
        List<Node> nodes,
        Map<HttpHost, DeadHostState> blacklist,
        NodeSelector nodeSelector
    ) throws IOException {
        int iterations = 1000;
        AtomicInteger lastNodeIndex = new AtomicInteger(0);
        assertEquals(expectedNodes, Rest5Client.selectNodes(nodes, blacklist, lastNodeIndex, nodeSelector));
        // Calling it again rotates the set of results
        for (int i = 1; i < iterations; i++) {
            Collections.rotate(expectedNodes, 1);
            assertEquals("iteration " + i, expectedNodes, Rest5Client.selectNodes(nodes, blacklist,
                lastNodeIndex, nodeSelector));
        }
    }

    /**
     * Assert that {@link Rest5Client#selectNodes} fails on the provided arguments.
     *
     * @return the message in the exception thrown by the failure
     */
    private static String assertSelectAllRejected(
        List<Node> nodes,
        Map<HttpHost, DeadHostState> blacklist,
        NodeSelector nodeSelector
    ) {
        try {
            Rest5Client.selectNodes(nodes, blacklist, new AtomicInteger(0), nodeSelector);
            throw new AssertionError("expected selectHosts to fail");
        } catch (IOException e) {
            return e.getMessage();
        }
    }

    private static Rest5Client createRestClient() {
        List<Node> nodes = Collections.singletonList(new Node(new HttpHost("localhost", 9200)));
        return new Rest5Client(mock(CloseableHttpAsyncClient.class), new Header[]{}, nodes, null, null, null
            , false, false, false);
    }

    @Test
    public void testRoundRobin() throws IOException {
        int numNodes = randomIntBetween(2, 10);
        AuthCache authCache = new BasicAuthCache();
        List<Node> nodes = new ArrayList<>(numNodes);
        for (int i = 0; i < numNodes; i++) {
            Node node = new Node(new HttpHost("localhost", 9200 + i));
            nodes.add(node);
            authCache.put(node.getHost(), new BasicScheme());
        }

        // test the transition from negative to positive values
        AtomicInteger lastNodeIndex = new AtomicInteger(-numNodes);
        assertNodes(nodes, lastNodeIndex, 50);
        assertEquals(-numNodes + 50, lastNodeIndex.get());

        // test the highest positive values up to MAX_VALUE
        lastNodeIndex.set(Integer.MAX_VALUE - numNodes * 10);
        assertNodes(nodes, lastNodeIndex, numNodes * 10);
        assertEquals(Integer.MAX_VALUE, lastNodeIndex.get());

        // test the transition from MAX_VALUE to MIN_VALUE
        // this is the only time where there is most likely going to be a jump from a node
        // to another one that's not necessarily the next one.
        assertEquals(Integer.MIN_VALUE, lastNodeIndex.incrementAndGet());
        assertNodes(nodes, lastNodeIndex, 50);
        assertEquals(Integer.MIN_VALUE + 50, lastNodeIndex.get());
    }

    @Test
    public void testIsRunning() {
        List<Node> nodes = Collections.singletonList(new Node(new HttpHost("localhost", 9200)));
        CloseableHttpAsyncClient client = mock(CloseableHttpAsyncClient.class);
        Rest5Client restClient = new Rest5Client(client, new Header[]{}, nodes, null, null, null, false,
            false, false);

        when(client.getStatus()).thenReturn(IOReactorStatus.ACTIVE);
        assertTrue(restClient.isRunning());

        when(client.getStatus()).thenReturn(IOReactorStatus.INACTIVE);
        assertFalse(restClient.isRunning());
    }

    private static void assertNodes(List<Node> nodes, AtomicInteger lastNodeIndex, int runs) throws IOException {
        int distance = lastNodeIndex.get() % nodes.size();
        /*
         * Collections.rotate is not super intuitive: distance 1 means that the last element will become
         * the first and so on,
         * while distance -1 means that the second element will become the first and so on.
         */
        int expectedOffset = distance > 0 ? nodes.size() - distance : Math.abs(distance);
        for (int i = 0; i < runs; i++) {
            Iterable<Node> selectedNodes = Rest5Client.selectNodes(
                nodes,
                Collections.<HttpHost, DeadHostState>emptyMap(),
                lastNodeIndex,
                NodeSelector.ANY
            );
            List<Node> expectedNodes = nodes;
            int index = 0;
            for (Node actualNode : selectedNodes) {
                Node expectedNode = expectedNodes.get((index + expectedOffset) % expectedNodes.size());
                assertSame(expectedNode, actualNode);
                index++;
            }
            expectedOffset--;
            if (expectedOffset < 0) {
                expectedOffset += nodes.size();
            }
        }
    }
}
