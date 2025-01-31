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

package co.elastic.clients.elasticsearch.shutdown;

import co.elastic.clients.ApiClient;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.JsonEndpoint;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.util.ObjectBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

/**
 * Client for the shutdown namespace.
 */
public class ElasticsearchShutdownAsyncClient
		extends
			ApiClient<ElasticsearchTransport, ElasticsearchShutdownAsyncClient> {

	public ElasticsearchShutdownAsyncClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchShutdownAsyncClient(ElasticsearchTransport transport,
			@Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchShutdownAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchShutdownAsyncClient(this.transport, transportOptions);
	}

	// ----- Endpoint: shutdown.delete_node

	/**
	 * Cancel node shutdown preparations. Remove a node from the shutdown list so it
	 * can resume normal operations. You must explicitly clear the shutdown request
	 * when a node rejoins the cluster or when a node has permanently left the
	 * cluster. Shutdown requests are never removed automatically by Elasticsearch.
	 * <p>
	 * NOTE: This feature is designed for indirect use by Elastic Cloud, Elastic
	 * Cloud Enterprise, and Elastic Cloud on Kubernetes. Direct use is not
	 * supported.
	 * <p>
	 * If the operator privileges feature is enabled, you must be an operator to use
	 * this API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.19/delete-shutdown.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteNodeResponse> deleteNode(DeleteNodeRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteNodeRequest, DeleteNodeResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteNodeRequest, DeleteNodeResponse, ErrorResponse>) DeleteNodeRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Cancel node shutdown preparations. Remove a node from the shutdown list so it
	 * can resume normal operations. You must explicitly clear the shutdown request
	 * when a node rejoins the cluster or when a node has permanently left the
	 * cluster. Shutdown requests are never removed automatically by Elasticsearch.
	 * <p>
	 * NOTE: This feature is designed for indirect use by Elastic Cloud, Elastic
	 * Cloud Enterprise, and Elastic Cloud on Kubernetes. Direct use is not
	 * supported.
	 * <p>
	 * If the operator privileges feature is enabled, you must be an operator to use
	 * this API.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteNodeRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.19/delete-shutdown.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteNodeResponse> deleteNode(
			Function<DeleteNodeRequest.Builder, ObjectBuilder<DeleteNodeRequest>> fn) {
		return deleteNode(fn.apply(new DeleteNodeRequest.Builder()).build());
	}

	// ----- Endpoint: shutdown.get_node

	/**
	 * Get the shutdown status.
	 * <p>
	 * Get information about nodes that are ready to be shut down, have shut down
	 * preparations still in progress, or have stalled. The API returns status
	 * information for each part of the shut down process.
	 * <p>
	 * NOTE: This feature is designed for indirect use by Elasticsearch Service,
	 * Elastic Cloud Enterprise, and Elastic Cloud on Kubernetes. Direct use is not
	 * supported.
	 * <p>
	 * If the operator privileges feature is enabled, you must be an operator to use
	 * this API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.19/get-shutdown.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetNodeResponse> getNode(GetNodeRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetNodeRequest, GetNodeResponse, ErrorResponse> endpoint = (JsonEndpoint<GetNodeRequest, GetNodeResponse, ErrorResponse>) GetNodeRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get the shutdown status.
	 * <p>
	 * Get information about nodes that are ready to be shut down, have shut down
	 * preparations still in progress, or have stalled. The API returns status
	 * information for each part of the shut down process.
	 * <p>
	 * NOTE: This feature is designed for indirect use by Elasticsearch Service,
	 * Elastic Cloud Enterprise, and Elastic Cloud on Kubernetes. Direct use is not
	 * supported.
	 * <p>
	 * If the operator privileges feature is enabled, you must be an operator to use
	 * this API.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetNodeRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.19/get-shutdown.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetNodeResponse> getNode(
			Function<GetNodeRequest.Builder, ObjectBuilder<GetNodeRequest>> fn) {
		return getNode(fn.apply(new GetNodeRequest.Builder()).build());
	}

	/**
	 * Get the shutdown status.
	 * <p>
	 * Get information about nodes that are ready to be shut down, have shut down
	 * preparations still in progress, or have stalled. The API returns status
	 * information for each part of the shut down process.
	 * <p>
	 * NOTE: This feature is designed for indirect use by Elasticsearch Service,
	 * Elastic Cloud Enterprise, and Elastic Cloud on Kubernetes. Direct use is not
	 * supported.
	 * <p>
	 * If the operator privileges feature is enabled, you must be an operator to use
	 * this API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.19/get-shutdown.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetNodeResponse> getNode() {
		return this.transport.performRequestAsync(new GetNodeRequest.Builder().build(), GetNodeRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: shutdown.put_node

	/**
	 * Prepare a node to be shut down.
	 * <p>
	 * NOTE: This feature is designed for indirect use by Elastic Cloud, Elastic
	 * Cloud Enterprise, and Elastic Cloud on Kubernetes. Direct use is not
	 * supported.
	 * <p>
	 * If you specify a node that is offline, it will be prepared for shut down when
	 * it rejoins the cluster.
	 * <p>
	 * If the operator privileges feature is enabled, you must be an operator to use
	 * this API.
	 * <p>
	 * The API migrates ongoing tasks and index shards to other nodes as needed to
	 * prepare a node to be restarted or shut down and removed from the cluster.
	 * This ensures that Elasticsearch can be stopped safely with minimal disruption
	 * to the cluster.
	 * <p>
	 * You must specify the type of shutdown: <code>restart</code>,
	 * <code>remove</code>, or <code>replace</code>. If a node is already being
	 * prepared for shutdown, you can use this API to change the shutdown type.
	 * <p>
	 * IMPORTANT: This API does NOT terminate the Elasticsearch process. Monitor the
	 * node shutdown status to determine when it is safe to stop Elasticsearch.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.19/put-shutdown.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutNodeResponse> putNode(PutNodeRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutNodeRequest, PutNodeResponse, ErrorResponse> endpoint = (JsonEndpoint<PutNodeRequest, PutNodeResponse, ErrorResponse>) PutNodeRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Prepare a node to be shut down.
	 * <p>
	 * NOTE: This feature is designed for indirect use by Elastic Cloud, Elastic
	 * Cloud Enterprise, and Elastic Cloud on Kubernetes. Direct use is not
	 * supported.
	 * <p>
	 * If you specify a node that is offline, it will be prepared for shut down when
	 * it rejoins the cluster.
	 * <p>
	 * If the operator privileges feature is enabled, you must be an operator to use
	 * this API.
	 * <p>
	 * The API migrates ongoing tasks and index shards to other nodes as needed to
	 * prepare a node to be restarted or shut down and removed from the cluster.
	 * This ensures that Elasticsearch can be stopped safely with minimal disruption
	 * to the cluster.
	 * <p>
	 * You must specify the type of shutdown: <code>restart</code>,
	 * <code>remove</code>, or <code>replace</code>. If a node is already being
	 * prepared for shutdown, you can use this API to change the shutdown type.
	 * <p>
	 * IMPORTANT: This API does NOT terminate the Elasticsearch process. Monitor the
	 * node shutdown status to determine when it is safe to stop Elasticsearch.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutNodeRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.19/put-shutdown.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutNodeResponse> putNode(
			Function<PutNodeRequest.Builder, ObjectBuilder<PutNodeRequest>> fn) {
		return putNode(fn.apply(new PutNodeRequest.Builder()).build());
	}

}
