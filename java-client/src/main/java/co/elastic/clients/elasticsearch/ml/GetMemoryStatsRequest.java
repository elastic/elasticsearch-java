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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
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

// typedef: ml.get_memory_stats.Request

/**
 * Get machine learning memory usage info. Get information about how machine
 * learning jobs and trained models are using memory, on each node, both within
 * the JVM heap, and natively, outside of the JVM.
 * 
 * @see <a href="../doc-files/api-spec.html#ml.get_memory_stats.Request">API
 *      specification</a>
 */

public class GetMemoryStatsRequest extends RequestBase {
	@Nullable
	private final Time masterTimeout;

	@Nullable
	private final String nodeId;

	@Nullable
	private final Time timeout;

	// ---------------------------------------------------------------------------------------------

	private GetMemoryStatsRequest(Builder builder) {

		this.masterTimeout = builder.masterTimeout;
		this.nodeId = builder.nodeId;
		this.timeout = builder.timeout;

	}

	public static GetMemoryStatsRequest of(Function<Builder, ObjectBuilder<GetMemoryStatsRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Period to wait for a connection to the master node. If no response is
	 * received before the timeout expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final Time masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * The names of particular nodes in the cluster to target. For example,
	 * <code>nodeId1,nodeId2</code> or <code>ml:true</code>
	 * <p>
	 * API name: {@code node_id}
	 */
	@Nullable
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
	public final Time timeout() {
		return this.timeout;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetMemoryStatsRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GetMemoryStatsRequest> {
		@Nullable
		private Time masterTimeout;

		@Nullable
		private String nodeId;

		@Nullable
		private Time timeout;

		/**
		 * Period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable Time value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.masterTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * The names of particular nodes in the cluster to target. For example,
		 * <code>nodeId1,nodeId2</code> or <code>ml:true</code>
		 * <p>
		 * API name: {@code node_id}
		 */
		public final Builder nodeId(@Nullable String value) {
			this.nodeId = value;
			return this;
		}

		/**
		 * Period to wait for a response. If no response is received before the timeout
		 * expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Period to wait for a response. If no response is received before the timeout
		 * expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeout(fn.apply(new Time.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetMemoryStatsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetMemoryStatsRequest build() {
			_checkSingleUse();

			return new GetMemoryStatsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.get_memory_stats}".
	 */
	public static final Endpoint<GetMemoryStatsRequest, GetMemoryStatsResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ml.get_memory_stats",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _nodeId = 1 << 0;

				int propsSet = 0;

				if (request.nodeId() != null)
					propsSet |= _nodeId;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/memory");
					buf.append("/_stats");
					return buf.toString();
				}
				if (propsSet == (_nodeId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/memory");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.nodeId, buf);
					buf.append("/_stats");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _nodeId = 1 << 0;

				int propsSet = 0;

				if (request.nodeId() != null)
					propsSet |= _nodeId;

				if (propsSet == 0) {
				}
				if (propsSet == (_nodeId)) {
					params.put("nodeId", request.nodeId);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout._toJsonString());
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, GetMemoryStatsResponse._DESERIALIZER);
}
