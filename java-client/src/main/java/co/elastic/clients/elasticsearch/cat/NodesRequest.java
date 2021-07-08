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

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

// typedef: cat.nodes.Request
public final class NodesRequest extends CatRequestBase {
	@Nullable
	private final JsonValue bytes;

	@Nullable
	private final JsonValue fullId;

	// ---------------------------------------------------------------------------------------------

	protected NodesRequest(Builder builder) {

		this.bytes = builder.bytes;
		this.fullId = builder.fullId;

	}

	/**
	 * API name: {@code bytes}
	 */
	@Nullable
	public JsonValue bytes() {
		return this.bytes;
	}

	/**
	 * API name: {@code full_id}
	 */
	@Nullable
	public JsonValue fullId() {
		return this.fullId;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodesRequest}.
	 */
	public static class Builder implements ObjectBuilder<NodesRequest> {
		@Nullable
		private JsonValue bytes;

		@Nullable
		private JsonValue fullId;

		/**
		 * API name: {@code bytes}
		 */
		public Builder bytes(@Nullable JsonValue value) {
			this.bytes = value;
			return this;
		}

		/**
		 * API name: {@code full_id}
		 */
		public Builder fullId(@Nullable JsonValue value) {
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

			return new NodesRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code cat.nodes}".
	 */
	public static final Endpoint<NodesRequest, NodesResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
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
				if (request.bytes != null) {
					params.put("bytes", request.bytes.toString());
				}
				if (request.fullId != null) {
					params.put("full_id", request.fullId.toString());
				}
				return params;

			}, Endpoint.Simple.emptyMap(), false, NodesResponse.DESERIALIZER);
}
