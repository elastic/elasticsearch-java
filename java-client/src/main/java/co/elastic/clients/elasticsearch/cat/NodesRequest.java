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

package co.elastic.clients.elasticsearch.cat;

import co.elastic.clients.elasticsearch._types.Bytes;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.SimpleEndpoint;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cat.nodes.Request

public class NodesRequest extends CatRequestBase {
	@Nullable
	private final Bytes bytes;

	@Nullable
	private final Boolean fullId;

	// ---------------------------------------------------------------------------------------------

	private NodesRequest(Builder builder) {

		this.bytes = builder.bytes;
		this.fullId = builder.fullId;

	}

	public static NodesRequest of(Function<Builder, ObjectBuilder<NodesRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The unit in which to display byte values
	 * <p>
	 * API name: {@code bytes}
	 */
	@Nullable
	public final Bytes bytes() {
		return this.bytes;
	}

	/**
	 * Return the full node ID instead of the shortened version (default: false)
	 * <p>
	 * API name: {@code full_id}
	 */
	@Nullable
	public final Boolean fullId() {
		return this.fullId;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodesRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<NodesRequest> {
		@Nullable
		private Bytes bytes;

		@Nullable
		private Boolean fullId;

		/**
		 * The unit in which to display byte values
		 * <p>
		 * API name: {@code bytes}
		 */
		public final Builder bytes(@Nullable Bytes value) {
			this.bytes = value;
			return this;
		}

		/**
		 * Return the full node ID instead of the shortened version (default: false)
		 * <p>
		 * API name: {@code full_id}
		 */
		public final Builder fullId(@Nullable Boolean value) {
			this.fullId = value;
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
	public static final Endpoint<NodesRequest, NodesResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				return "/_cat/nodes";

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				params.put("format", "json");
				if (request.bytes != null) {
					params.put("bytes", request.bytes.jsonValue());
				}
				if (request.fullId != null) {
					params.put("full_id", String.valueOf(request.fullId));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, NodesResponse._DESERIALIZER);
}
