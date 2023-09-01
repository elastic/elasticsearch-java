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
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: async_search.get.Request

/**
 * Retrieves the results of a previously submitted async search request given
 * its identifier. If the Elasticsearch security features are enabled, access to
 * the results of a specific async search is restricted to the user or API key
 * that submitted it.
 * 
 * @see <a href="../doc-files/api-spec.html#async_search.get.Request">API
 *      specification</a>
 */

public class GetAsyncSearchRequest extends RequestBase {
	private final String id;

	@Nullable
	private final Time keepAlive;

	@Nullable
	private final Time waitForCompletionTimeout;

	// ---------------------------------------------------------------------------------------------

	private GetAsyncSearchRequest(Builder builder) {

		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.keepAlive = builder.keepAlive;
		this.waitForCompletionTimeout = builder.waitForCompletionTimeout;

	}

	public static GetAsyncSearchRequest of(Function<Builder, ObjectBuilder<GetAsyncSearchRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - A unique identifier for the async search.
	 * <p>
	 * API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Specifies how long the async search should be available in the cluster. When
	 * not specified, the <code>keep_alive</code> set with the corresponding submit
	 * async request will be used. Otherwise, it is possible to override the value
	 * and extend the validity of the request. When this period expires, the search,
	 * if still running, is cancelled. If the search is completed, its saved results
	 * are deleted.
	 * <p>
	 * API name: {@code keep_alive}
	 */
	@Nullable
	public final Time keepAlive() {
		return this.keepAlive;
	}

	/**
	 * Specifies to wait for the search to be completed up until the provided
	 * timeout. Final results will be returned if available before the timeout
	 * expires, otherwise the currently available results will be returned once the
	 * timeout expires. By default no timeout is set meaning that the currently
	 * available results will be returned without any additional wait.
	 * <p>
	 * API name: {@code wait_for_completion_timeout}
	 */
	@Nullable
	public final Time waitForCompletionTimeout() {
		return this.waitForCompletionTimeout;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetAsyncSearchRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GetAsyncSearchRequest> {
		private String id;

		@Nullable
		private Time keepAlive;

		@Nullable
		private Time waitForCompletionTimeout;

		/**
		 * Required - A unique identifier for the async search.
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Specifies how long the async search should be available in the cluster. When
		 * not specified, the <code>keep_alive</code> set with the corresponding submit
		 * async request will be used. Otherwise, it is possible to override the value
		 * and extend the validity of the request. When this period expires, the search,
		 * if still running, is cancelled. If the search is completed, its saved results
		 * are deleted.
		 * <p>
		 * API name: {@code keep_alive}
		 */
		public final Builder keepAlive(@Nullable Time value) {
			this.keepAlive = value;
			return this;
		}

		/**
		 * Specifies how long the async search should be available in the cluster. When
		 * not specified, the <code>keep_alive</code> set with the corresponding submit
		 * async request will be used. Otherwise, it is possible to override the value
		 * and extend the validity of the request. When this period expires, the search,
		 * if still running, is cancelled. If the search is completed, its saved results
		 * are deleted.
		 * <p>
		 * API name: {@code keep_alive}
		 */
		public final Builder keepAlive(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.keepAlive(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Specifies to wait for the search to be completed up until the provided
		 * timeout. Final results will be returned if available before the timeout
		 * expires, otherwise the currently available results will be returned once the
		 * timeout expires. By default no timeout is set meaning that the currently
		 * available results will be returned without any additional wait.
		 * <p>
		 * API name: {@code wait_for_completion_timeout}
		 */
		public final Builder waitForCompletionTimeout(@Nullable Time value) {
			this.waitForCompletionTimeout = value;
			return this;
		}

		/**
		 * Specifies to wait for the search to be completed up until the provided
		 * timeout. Final results will be returned if available before the timeout
		 * expires, otherwise the currently available results will be returned once the
		 * timeout expires. By default no timeout is set meaning that the currently
		 * available results will be returned without any additional wait.
		 * <p>
		 * API name: {@code wait_for_completion_timeout}
		 */
		public final Builder waitForCompletionTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.waitForCompletionTimeout(fn.apply(new Time.Builder()).build());
		}

		@Override
		protected Builder self() {
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
	public static final SimpleEndpoint<GetAsyncSearchRequest, ?> _ENDPOINT = new SimpleEndpoint<>("es/async_search.get",

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

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _id = 1 << 0;

				int propsSet = 0;

				propsSet |= _id;

				if (propsSet == (_id)) {
					params.put("id", request.id);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				params.put("typed_keys", "true");
				if (request.keepAlive != null) {
					params.put("keep_alive", request.keepAlive._toJsonString());
				}
				if (request.waitForCompletionTimeout != null) {
					params.put("wait_for_completion_timeout", request.waitForCompletionTimeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, GetAsyncSearchResponse._DESERIALIZER);

	/**
	 * Create an "{@code async_search.get}" endpoint.
	 */
	public static <TDocument> Endpoint<GetAsyncSearchRequest, GetAsyncSearchResponse<TDocument>, ErrorResponse> createGetEndpoint(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return _ENDPOINT.withResponseDeserializer(
				GetAsyncSearchResponse.createGetAsyncSearchResponseDeserializer(tDocumentDeserializer));
	}
}
