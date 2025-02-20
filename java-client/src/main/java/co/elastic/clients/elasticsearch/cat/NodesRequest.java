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
import co.elastic.clients.elasticsearch._types.TimeUnit;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.Collections;
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

// typedef: cat.nodes.Request

/**
 * Get node information.
 * <p>
 * Get information about the nodes in a cluster. IMPORTANT: cat APIs are only
 * intended for human consumption using the command line or Kibana console. They
 * are not intended for use by applications. For application consumption, use
 * the nodes info API.
 * 
 * @see <a href="../doc-files/api-spec.html#cat.nodes.Request">API
 *      specification</a>
 */

public class NodesRequest extends CatRequestBase {
	@Nullable
	private final Bytes bytes;

	@Nullable
	private final Boolean fullId;

	@Nullable
	private final Boolean includeUnloadedSegments;

	@Nullable
	private final Time masterTimeout;

	@Nullable
	private final TimeUnit time;

	// ---------------------------------------------------------------------------------------------

	private NodesRequest(Builder builder) {

		this.bytes = builder.bytes;
		this.fullId = builder.fullId;
		this.includeUnloadedSegments = builder.includeUnloadedSegments;
		this.masterTimeout = builder.masterTimeout;
		this.time = builder.time;

	}

	public static NodesRequest of(Function<Builder, ObjectBuilder<NodesRequest>> fn) {
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
	 * If <code>true</code>, return the full node ID. If <code>false</code>, return
	 * the shortened node ID.
	 * <p>
	 * API name: {@code full_id}
	 */
	@Nullable
	public final Boolean fullId() {
		return this.fullId;
	}

	/**
	 * If true, the response includes information from segments that are not loaded
	 * into memory.
	 * <p>
	 * API name: {@code include_unloaded_segments}
	 */
	@Nullable
	public final Boolean includeUnloadedSegments() {
		return this.includeUnloadedSegments;
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
	 * Unit used to display time values.
	 * <p>
	 * API name: {@code time}
	 */
	@Nullable
	public final TimeUnit time() {
		return this.time;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodesRequest}.
	 */

	public static class Builder extends CatRequestBase.AbstractBuilder<Builder> implements ObjectBuilder<NodesRequest> {
		@Nullable
		private Bytes bytes;

		@Nullable
		private Boolean fullId;

		@Nullable
		private Boolean includeUnloadedSegments;

		@Nullable
		private Time masterTimeout;

		@Nullable
		private TimeUnit time;

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
		 * If <code>true</code>, return the full node ID. If <code>false</code>, return
		 * the shortened node ID.
		 * <p>
		 * API name: {@code full_id}
		 */
		public final Builder fullId(@Nullable Boolean value) {
			this.fullId = value;
			return this;
		}

		/**
		 * If true, the response includes information from segments that are not loaded
		 * into memory.
		 * <p>
		 * API name: {@code include_unloaded_segments}
		 */
		public final Builder includeUnloadedSegments(@Nullable Boolean value) {
			this.includeUnloadedSegments = value;
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
		 * Unit used to display time values.
		 * <p>
		 * API name: {@code time}
		 */
		public final Builder time(@Nullable TimeUnit value) {
			this.time = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link NodesRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodesRequest build() {
			_checkSingleUse();

			return new NodesRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code cat.nodes}".
	 */
	public static final Endpoint<NodesRequest, NodesResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/cat.nodes",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				return "/_cat/nodes";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
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
				if (request.includeUnloadedSegments != null) {
					params.put("include_unloaded_segments", String.valueOf(request.includeUnloadedSegments));
				}
				if (request.time != null) {
					params.put("time", request.time.jsonValue());
				}
				if (request.fullId != null) {
					params.put("full_id", String.valueOf(request.fullId));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, NodesResponse._DESERIALIZER);
}
