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

package co.elastic.clients.elasticsearch.license;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.SimpleEndpoint;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: license.post_start_basic.Request

public final class PostStartBasicRequest extends RequestBase {
	@Nullable
	private final Boolean acknowledge;

	// ---------------------------------------------------------------------------------------------

	public PostStartBasicRequest(Builder builder) {

		this.acknowledge = builder.acknowledge;

	}

	public PostStartBasicRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * whether the user has acknowledged acknowledge messages (default: false)
	 * <p>
	 * API name: {@code acknowledge}
	 */
	@Nullable
	public Boolean acknowledge() {
		return this.acknowledge;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PostStartBasicRequest}.
	 */
	public static class Builder implements ObjectBuilder<PostStartBasicRequest> {
		@Nullable
		private Boolean acknowledge;

		/**
		 * whether the user has acknowledged acknowledge messages (default: false)
		 * <p>
		 * API name: {@code acknowledge}
		 */
		public Builder acknowledge(@Nullable Boolean value) {
			this.acknowledge = value;
			return this;
		}

		/**
		 * Builds a {@link PostStartBasicRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PostStartBasicRequest build() {

			return new PostStartBasicRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code license.post_start_basic}".
	 */
	public static final Endpoint<PostStartBasicRequest, PostStartBasicResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_license/start_basic";

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.acknowledge != null) {
					params.put("acknowledge", String.valueOf(request.acknowledge));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, PostStartBasicResponse._DESERIALIZER);
}
