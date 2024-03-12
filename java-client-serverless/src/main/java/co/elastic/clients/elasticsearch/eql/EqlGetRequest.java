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

package co.elastic.clients.elasticsearch.eql;

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

// typedef: eql.get.Request

/**
 * Returns the current status and available results for an async EQL search or a
 * stored synchronous EQL search.
 * 
 * @see <a href="../doc-files/api-spec.html#eql.get.Request">API
 *      specification</a>
 */

public class EqlGetRequest extends RequestBase {
	private final String id;

	@Nullable
	private final Time keepAlive;

	@Nullable
	private final Time waitForCompletionTimeout;

	// ---------------------------------------------------------------------------------------------

	private EqlGetRequest(Builder builder) {

		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.keepAlive = builder.keepAlive;
		this.waitForCompletionTimeout = builder.waitForCompletionTimeout;

	}

	public static EqlGetRequest of(Function<Builder, ObjectBuilder<EqlGetRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Identifier for the search.
	 * <p>
	 * API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Period for which the search and its results are stored on the cluster.
	 * Defaults to the keep_alive value set by the search’s EQL search API request.
	 * <p>
	 * API name: {@code keep_alive}
	 */
	@Nullable
	public final Time keepAlive() {
		return this.keepAlive;
	}

	/**
	 * Timeout duration to wait for the request to finish. Defaults to no timeout,
	 * meaning the request waits for complete search results.
	 * <p>
	 * API name: {@code wait_for_completion_timeout}
	 */
	@Nullable
	public final Time waitForCompletionTimeout() {
		return this.waitForCompletionTimeout;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link EqlGetRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder> implements ObjectBuilder<EqlGetRequest> {
		private String id;

		@Nullable
		private Time keepAlive;

		@Nullable
		private Time waitForCompletionTimeout;

		/**
		 * Required - Identifier for the search.
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Period for which the search and its results are stored on the cluster.
		 * Defaults to the keep_alive value set by the search’s EQL search API request.
		 * <p>
		 * API name: {@code keep_alive}
		 */
		public final Builder keepAlive(@Nullable Time value) {
			this.keepAlive = value;
			return this;
		}

		/**
		 * Period for which the search and its results are stored on the cluster.
		 * Defaults to the keep_alive value set by the search’s EQL search API request.
		 * <p>
		 * API name: {@code keep_alive}
		 */
		public final Builder keepAlive(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.keepAlive(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Timeout duration to wait for the request to finish. Defaults to no timeout,
		 * meaning the request waits for complete search results.
		 * <p>
		 * API name: {@code wait_for_completion_timeout}
		 */
		public final Builder waitForCompletionTimeout(@Nullable Time value) {
			this.waitForCompletionTimeout = value;
			return this;
		}

		/**
		 * Timeout duration to wait for the request to finish. Defaults to no timeout,
		 * meaning the request waits for complete search results.
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
		 * Builds a {@link EqlGetRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public EqlGetRequest build() {
			_checkSingleUse();

			return new EqlGetRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code eql.get}".
	 */
	public static final SimpleEndpoint<EqlGetRequest, ?> _ENDPOINT = new SimpleEndpoint<>("es/eql.get",

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
					buf.append("/_eql");
					buf.append("/search");
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
				if (request.keepAlive != null) {
					params.put("keep_alive", request.keepAlive._toJsonString());
				}
				if (request.waitForCompletionTimeout != null) {
					params.put("wait_for_completion_timeout", request.waitForCompletionTimeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, EqlGetResponse._DESERIALIZER);

	/**
	 * Create an "{@code eql.get}" endpoint.
	 */
	public static <TEvent> Endpoint<EqlGetRequest, EqlGetResponse<TEvent>, ErrorResponse> createGetEndpoint(
			JsonpDeserializer<TEvent> tEventDeserializer) {
		return _ENDPOINT.withResponseDeserializer(EqlGetResponse.createEqlGetResponseDeserializer(tEventDeserializer));
	}
}
