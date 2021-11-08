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

package co.elastic.clients.elasticsearch.async_search;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.SimpleEndpoint;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: async_search.get.Request

public class GetAsyncSearchRequest extends RequestBase {
	private final String id;

	@Nullable
	private final String keepAlive;

	@Nullable
	private final String waitForCompletionTimeout;

	// ---------------------------------------------------------------------------------------------

	private GetAsyncSearchRequest(Builder builder) {

		this.id = ModelTypeHelper.requireNonNull(builder.id, this, "id");
		this.keepAlive = builder.keepAlive;
		this.waitForCompletionTimeout = builder.waitForCompletionTimeout;

	}

	public static GetAsyncSearchRequest of(Function<Builder, ObjectBuilder<GetAsyncSearchRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The async search ID
	 * <p>
	 * API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Specify the time interval in which the results (partial or final) for this
	 * search will be available
	 * <p>
	 * API name: {@code keep_alive}
	 */
	@Nullable
	public final String keepAlive() {
		return this.keepAlive;
	}

	/**
	 * Specify the time that the request should block waiting for the final response
	 * <p>
	 * API name: {@code wait_for_completion_timeout}
	 */
	@Nullable
	public final String waitForCompletionTimeout() {
		return this.waitForCompletionTimeout;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetAsyncSearchRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GetAsyncSearchRequest> {
		private String id;

		@Nullable
		private String keepAlive;

		@Nullable
		private String waitForCompletionTimeout;

		/**
		 * Required - The async search ID
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Specify the time interval in which the results (partial or final) for this
		 * search will be available
		 * <p>
		 * API name: {@code keep_alive}
		 */
		public final Builder keepAlive(@Nullable String value) {
			this.keepAlive = value;
			return this;
		}

		/**
		 * Specify the time that the request should block waiting for the final response
		 * <p>
		 * API name: {@code wait_for_completion_timeout}
		 */
		public final Builder waitForCompletionTimeout(@Nullable String value) {
			this.waitForCompletionTimeout = value;
			return this;
		}

		/**
		 * Builds a {@link GetAsyncSearchRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetAsyncSearchRequest build() {
			_checkSingleUse();

			return new GetAsyncSearchRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code async_search.get}".
	 */
	private static final SimpleEndpoint<GetAsyncSearchRequest, Void> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _id = 1 << 0;

				int propsSet = 0;

				propsSet |= _id;

				if (propsSet == (_id)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_async_search");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.id, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				params.put("typed_keys", "true");
				if (request.keepAlive != null) {
					params.put("keep_alive", request.keepAlive);
				}
				if (request.waitForCompletionTimeout != null) {
					params.put("wait_for_completion_timeout", request.waitForCompletionTimeout);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, null);

	/**
	 * Create an "{@code async_search.get}" endpoint.
	 */
	public static <TDocument> Endpoint<GetAsyncSearchRequest, GetAsyncSearchResponse<TDocument>, ErrorResponse> createGetEndpoint(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ENDPOINT.withResponseDeserializer(
				GetAsyncSearchResponse.createGetAsyncSearchResponseDeserializer(tDocumentDeserializer));
	}
}
