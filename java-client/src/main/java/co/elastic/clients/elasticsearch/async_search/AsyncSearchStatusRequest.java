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

// typedef: async_search.status.Request

/**
 * Get the async search status.
 * <p>
 * Get the status of a previously submitted async search request given its
 * identifier, without retrieving search results. If the Elasticsearch security
 * features are enabled, the access to the status of a specific async search is
 * restricted to:
 * <ul>
 * <li>The user or API key that submitted the original async search
 * request.</li>
 * <li>Users that have the <code>monitor</code> cluster privilege or greater
 * privileges.</li>
 * </ul>
 *
 * @see <a href="../doc-files/api-spec.html#async_search.status.Request">API
 *      specification</a>
 */

public class AsyncSearchStatusRequest extends RequestBase {
	private final String id;

	@Nullable
	private final Time keepAlive;

	// ---------------------------------------------------------------------------------------------

	private AsyncSearchStatusRequest(Builder builder) {

		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.keepAlive = builder.keepAlive;

	}

	public static AsyncSearchStatusRequest of(Function<Builder, ObjectBuilder<AsyncSearchStatusRequest>> fn) {
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
	 * The length of time that the async search needs to be available. Ongoing async
	 * searches and any saved search results are deleted after this period.
	 * <p>
	 * API name: {@code keep_alive}
	 */
	@Nullable
	public final Time keepAlive() {
		return this.keepAlive;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AsyncSearchStatusRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<AsyncSearchStatusRequest> {
		private String id;

		@Nullable
		private Time keepAlive;

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
		 * The length of time that the async search needs to be available. Ongoing async
		 * searches and any saved search results are deleted after this period.
		 * <p>
		 * API name: {@code keep_alive}
		 */
		public final Builder keepAlive(@Nullable Time value) {
			this.keepAlive = value;
			return this;
		}

		/**
		 * The length of time that the async search needs to be available. Ongoing async
		 * searches and any saved search results are deleted after this period.
		 * <p>
		 * API name: {@code keep_alive}
		 */
		public final Builder keepAlive(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.keepAlive(fn.apply(new Time.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AsyncSearchStatusRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AsyncSearchStatusRequest build() {
			_checkSingleUse();

			return new AsyncSearchStatusRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code async_search.status}".
	 */
	public static final Endpoint<AsyncSearchStatusRequest, AsyncSearchStatusResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/async_search.status",

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
					buf.append("/status");
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
				return params;

			}, SimpleEndpoint.emptyMap(), false, AsyncSearchStatusResponse._DESERIALIZER);
}
