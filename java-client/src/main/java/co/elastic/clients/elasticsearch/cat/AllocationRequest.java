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

package co.elastic.clients.elasticsearch.cat;

import co.elastic.clients.elasticsearch._types.Bytes;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
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

// typedef: cat.allocation.Request

/**
 * Get shard allocation information.
 * <p>
 * Get a snapshot of the number of shards allocated to each data node and their
 * disk space.
 * <p>
 * IMPORTANT: CAT APIs are only intended for human consumption using the command
 * line or Kibana console. They are not intended for use by applications.
 * 
 * @see <a href="../doc-files/api-spec.html#cat.allocation.Request">API
 *      specification</a>
 */

public class AllocationRequest extends CatRequestBase {
	@Nullable
	private final Bytes bytes;

	@Nullable
	private final Boolean local;

	@Nullable
	private final Time masterTimeout;

	private final List<String> nodeId;

	// ---------------------------------------------------------------------------------------------

	private AllocationRequest(Builder builder) {

		this.bytes = builder.bytes;
		this.local = builder.local;
		this.masterTimeout = builder.masterTimeout;
		this.nodeId = ApiTypeHelper.unmodifiable(builder.nodeId);

	}

	public static AllocationRequest of(Function<Builder, ObjectBuilder<AllocationRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The unit used to display byte values.
	 * <p>
	 * API name: {@code bytes}
	 */
	@Nullable
	public final Bytes bytes() {
		return this.bytes;
	}

	/**
	 * If <code>true</code>, the request computes the list of selected nodes from
	 * the local cluster state. If <code>false</code> the list of selected nodes are
	 * computed from the cluster state of the master node. In both cases the
	 * coordinating node will send requests for further information to each selected
	 * node.
	 * <p>
	 * API name: {@code local}
	 */
	@Nullable
	public final Boolean local() {
		return this.local;
	}

	/**
	 * Period to wait for a connection to the master node.
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final Time masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * A comma-separated list of node identifiers or names used to limit the
	 * returned information.
	 * <p>
	 * API name: {@code node_id}
	 */
	public final List<String> nodeId() {
		return this.nodeId;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AllocationRequest}.
	 */

	public static class Builder extends CatRequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<AllocationRequest> {
		@Nullable
		private Bytes bytes;

		@Nullable
		private Boolean local;

		@Nullable
		private Time masterTimeout;

		@Nullable
		private List<String> nodeId;

		/**
		 * The unit used to display byte values.
		 * <p>
		 * API name: {@code bytes}
		 */
		public final Builder bytes(@Nullable Bytes value) {
			this.bytes = value;
			return this;
		}

		/**
		 * If <code>true</code>, the request computes the list of selected nodes from
		 * the local cluster state. If <code>false</code> the list of selected nodes are
		 * computed from the cluster state of the master node. In both cases the
		 * coordinating node will send requests for further information to each selected
		 * node.
		 * <p>
		 * API name: {@code local}
		 */
		public final Builder local(@Nullable Boolean value) {
			this.local = value;
			return this;
		}

		/**
		 * Period to wait for a connection to the master node.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable Time value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Period to wait for a connection to the master node.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.masterTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * A comma-separated list of node identifiers or names used to limit the
		 * returned information.
		 * <p>
		 * API name: {@code node_id}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>nodeId</code>.
		 */
		public final Builder nodeId(List<String> list) {
			this.nodeId = _listAddAll(this.nodeId, list);
			return this;
		}

		/**
		 * A comma-separated list of node identifiers or names used to limit the
		 * returned information.
		 * <p>
		 * API name: {@code node_id}
		 * <p>
		 * Adds one or more values to <code>nodeId</code>.
		 */
		public final Builder nodeId(String value, String... values) {
			this.nodeId = _listAdd(this.nodeId, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AllocationRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AllocationRequest build() {
			_checkSingleUse();

			return new AllocationRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code cat.allocation}".
	 */
	public static final Endpoint<AllocationRequest, AllocationResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/cat.allocation",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _nodeId = 1 << 0;

				int propsSet = 0;

				if (ApiTypeHelper.isDefined(request.nodeId()))
					propsSet |= _nodeId;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_cat");
					buf.append("/allocation");
					return buf.toString();
				}
				if (propsSet == (_nodeId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_cat");
					buf.append("/allocation");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.nodeId.stream().map(v -> v).collect(Collectors.joining(",")),
							buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _nodeId = 1 << 0;

				int propsSet = 0;

				if (ApiTypeHelper.isDefined(request.nodeId()))
					propsSet |= _nodeId;

				if (propsSet == 0) {
				}
				if (propsSet == (_nodeId)) {
					params.put("nodeId", request.nodeId.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				params.put("format", "json");
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout._toJsonString());
				}
				if (request.bytes != null) {
					params.put("bytes", request.bytes.jsonValue());
				}
				if (request.local != null) {
					params.put("local", String.valueOf(request.local));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, AllocationResponse._DESERIALIZER);
}
