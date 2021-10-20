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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.shutdown;

import co.elastic.clients.base.ApiClient;
import co.elastic.clients.base.Transport;
import co.elastic.clients.elasticsearch.ElasticsearchException;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.function.Function;
import javax.annotation.Nullable;

/**
 * Client for the shutdown namespace.
 */
public class ElasticsearchShutdownClient extends ApiClient {

	public ElasticsearchShutdownClient(Transport transport) {
		super(transport);
	}

	// ----- Endpoint: shutdown.delete_node

	/**
	 * Removes a node from the shutdown list. Designed for indirect use by ECE/ESS
	 * and ECK. Direct use is not supported.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteNodeResponse deleteNode(DeleteNodeRequest request) throws IOException {
		return this.transport.performRequest(request, DeleteNodeRequest.ENDPOINT);
	}

	/**
	 * Removes a node from the shutdown list. Designed for indirect use by ECE/ESS
	 * and ECK. Direct use is not supported.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteNodeResponse deleteNode(Function<DeleteNodeRequest.Builder, ObjectBuilder<DeleteNodeRequest>> fn)
			throws IOException {
		return deleteNode(fn.apply(new DeleteNodeRequest.Builder()).build());
	}

	// ----- Endpoint: shutdown.get_node

	/**
	 * Retrieve status of a node or nodes that are currently marked as shutting
	 * down. Designed for indirect use by ECE/ESS and ECK. Direct use is not
	 * supported.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current">Documentation
	 *      on elastic.co</a>
	 */

	public GetNodeResponse getNode(GetNodeRequest request) throws IOException {
		return this.transport.performRequest(request, GetNodeRequest.ENDPOINT);
	}

	/**
	 * Retrieve status of a node or nodes that are currently marked as shutting
	 * down. Designed for indirect use by ECE/ESS and ECK. Direct use is not
	 * supported.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current">Documentation
	 *      on elastic.co</a>
	 */

	public final GetNodeResponse getNode(Function<GetNodeRequest.Builder, ObjectBuilder<GetNodeRequest>> fn)
			throws IOException {
		return getNode(fn.apply(new GetNodeRequest.Builder()).build());
	}

	/**
	 * Retrieve status of a node or nodes that are currently marked as shutting
	 * down. Designed for indirect use by ECE/ESS and ECK. Direct use is not
	 * supported.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current">Documentation
	 *      on elastic.co</a>
	 */

	public GetNodeResponse getNode() throws IOException {
		return this.transport.performRequest(new GetNodeRequest.Builder().build(), GetNodeRequest.ENDPOINT);
	}

	// ----- Endpoint: shutdown.put_node

	/**
	 * Adds a node to be shut down. Designed for indirect use by ECE/ESS and ECK.
	 * Direct use is not supported.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current">Documentation
	 *      on elastic.co</a>
	 */

	public PutNodeResponse putNode(PutNodeRequest request) throws IOException {
		return this.transport.performRequest(request, PutNodeRequest.ENDPOINT);
	}

	/**
	 * Adds a node to be shut down. Designed for indirect use by ECE/ESS and ECK.
	 * Direct use is not supported.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current">Documentation
	 *      on elastic.co</a>
	 */

	public final PutNodeResponse putNode(Function<PutNodeRequest.Builder, ObjectBuilder<PutNodeRequest>> fn)
			throws IOException {
		return putNode(fn.apply(new PutNodeRequest.Builder()).build());
	}

}
