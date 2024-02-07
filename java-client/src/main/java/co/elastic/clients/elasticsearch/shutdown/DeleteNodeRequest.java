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

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.TimeUnit;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
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

// typedef: shutdown.delete_node.Request

/**
 * Removes a node from the shutdown list. Designed for indirect use by ECE/ESS
 * and ECK. Direct use is not supported.
 * 
 * @see <a href="../doc-files/api-spec.html#shutdown.delete_node.Request">API
 *      specification</a>
 */

public class DeleteNodeRequest extends RequestBase {
	@Nullable
	private final TimeUnit masterTimeout;

	private final String nodeId;

	@Nullable
	private final TimeUnit timeout;

	// ---------------------------------------------------------------------------------------------

	private DeleteNodeRequest(Builder builder) {

		this.masterTimeout = builder.masterTimeout;
		this.nodeId = ApiTypeHelper.requireNonNull(builder.nodeId, this, "nodeId");
		this.timeout = builder.timeout;

	}

	public static DeleteNodeRequest of(Function<Builder, ObjectBuilder<DeleteNodeRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Period to wait for a connection to the master node. If no response is
	 * received before the timeout expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final TimeUnit masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * Required - The node id of node to be removed from the shutdown state
	 * <p>
	 * API name: {@code node_id}
	 */
	public final String nodeId() {
		return this.nodeId;
	}

	/**
	 * Period to wait for a response. If no response is received before the timeout
	 * expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final TimeUnit timeout() {
		return this.timeout;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteNodeRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DeleteNodeRequest> {
		@Nullable
		private TimeUnit masterTimeout;

		private String nodeId;

		@Nullable
		private TimeUnit timeout;

		/**
		 * Period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable TimeUnit value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Required - The node id of node to be removed from the shutdown state
		 * <p>
		 * API name: {@code node_id}
		 */
		public final Builder nodeId(String value) {
			this.nodeId = value;
			return this;
		}

		/**
		 * Period to wait for a response. If no response is received before the timeout
		 * expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable TimeUnit value) {
			this.timeout = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DeleteNodeRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteNodeRequest build() {
			_checkSingleUse();

			return new DeleteNodeRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code shutdown.delete_node}".
	 */
	public static final Endpoint<DeleteNodeRequest, DeleteNodeResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/shutdown.delete_node",

			// Request method
			request -> {
				return "DELETE";

			},

			// Request path
			request -> {
				final int _nodeId = 1 << 0;

				int propsSet = 0;

				propsSet |= _nodeId;

				if (propsSet == (_nodeId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_nodes");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.nodeId, buf);
					buf.append("/shutdown");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _nodeId = 1 << 0;

				int propsSet = 0;

				propsSet |= _nodeId;

				if (propsSet == (_nodeId)) {
					params.put("nodeId", request.nodeId);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout.jsonValue());
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout.jsonValue());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, DeleteNodeResponse._DESERIALIZER);
}
