---
navigation_title: Node selector
---

# Configuring node selectors in the {{es}} Java REST 5 client

The client sends each request to one of the configured nodes in round-robin fashion. Nodes can optionally be filtered through a node selector that needs to be provided when initializing the client. This is useful when sniffing is enabled, in case no dedicated master nodes should be hit by HTTP requests. For each request the client will run the eventually configured node selector to filter the node candidates, then select the next one in the list out of the remaining ones.

% :::{include-code} src={{doc-tests-src}}/rest5_client/RestClientDocumentation.java tag=rest-client-init-allocation-aware-selector
```java
Rest5ClientBuilder builder = Rest5Client
    .builder(new HttpHost("http", "localhost", 9200));

builder.setNodeSelector(nodes -> { // <1>
    /*
     * Prefer any node that belongs to rack_one. If none is around
     * we will go to another rack till it's time to try and revive
     * some of the nodes that belong to rack_one.
     */
    boolean foundOne = false;
    for (Node node : nodes) {
        String rackId = node.getAttributes().get("rack_id").get(0);
        if ("rack_one".equals(rackId)) {
            foundOne = true;
            break;
        }
    }
    if (foundOne) {
        Iterator<Node> nodesIt = nodes.iterator();
        while (nodesIt.hasNext()) {
            Node node = nodesIt.next();
            String rackId = node.getAttributes().get("rack_id").get(0);
            if (!"rack_one".equals(rackId)) {
                nodesIt.remove();
            }
        }
    }
});
```

1. Set an allocation aware node selector that allows to pick a node in the local rack if any available, otherwise go to any other node in any rack. It acts as a preference rather than a strict requirement, given that it goes to another rack if none of the local nodes are available, rather than returning no nodes in such case which would make the client forcibly revive a local node whenever none of the nodes from the preferred rack is available.


::::{warning}
Node selectors that do not consistently select the same set of nodes will make round-robin behaviour unpredictable and possibly unfair. The preference example above is fine as it reasons about availability of nodes which already affects the predictability of round-robin. Node selection should not depend on other external factors or round-robin will not work properly.
::::


