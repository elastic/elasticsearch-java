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

package co.elastic.clients.elasticsearch.search_application;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import jakarta.json.stream.JsonParser;
import java.lang.Boolean;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: search_application.put.Request

/**
 * Creates or updates a search application.
 * 
 * @see <a href="../doc-files/api-spec.html#search_application.put.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Boolean create;

	private final String name;

	private final SearchApplication searchApplication;

	// ---------------------------------------------------------------------------------------------

	private PutRequest(Builder builder) {

		this.create = builder.create;
		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.searchApplication = ApiTypeHelper.requireNonNull(builder.searchApplication, this, "searchApplication");

	}

	public static PutRequest of(Function<Builder, ObjectBuilder<PutRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * If true, requires that a search application with the specified resource_id
	 * does not already exist. (default: false)
	 * <p>
	 * API name: {@code create}
	 */
	@Nullable
	public final Boolean create() {
		return this.create;
	}

	/**
	 * Required - The name of the search application to be created or updated
	 * <p>
	 * API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Required - Request body.
	 */
	public final SearchApplication searchApplication() {
		return this.searchApplication;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		this.searchApplication.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder> implements ObjectBuilder<PutRequest> {
		@Nullable
		private Boolean create;

		private String name;

		private SearchApplication searchApplication;

		/**
		 * If true, requires that a search application with the specified resource_id
		 * does not already exist. (default: false)
		 * <p>
		 * API name: {@code create}
		 */
		public final Builder create(@Nullable Boolean value) {
			this.create = value;
			return this;
		}

		/**
		 * Required - The name of the search application to be created or updated
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - Request body.
		 */
		public final Builder searchApplication(SearchApplication value) {
			this.searchApplication = value;
			return this;
		}

		/**
		 * Required - Request body.
		 */
		public final Builder searchApplication(
				Function<SearchApplication.Builder, ObjectBuilder<SearchApplication>> fn) {
			return this.searchApplication(fn.apply(new SearchApplication.Builder()).build());
		}

		@Override
		public Builder withJson(JsonParser parser, JsonpMapper mapper) {

			@SuppressWarnings("unchecked")
			SearchApplication value = (SearchApplication) SearchApplication._DESERIALIZER.deserialize(parser, mapper);
			return this.searchApplication(value);
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutRequest build() {
			_checkSingleUse();

			return new PutRequest(this);
		}
	}

	public static final JsonpDeserializer<PutRequest> _DESERIALIZER = createPutRequestDeserializer();
	protected static JsonpDeserializer<PutRequest> createPutRequestDeserializer() {

		JsonpDeserializer<SearchApplication> valueDeserializer = SearchApplication._DESERIALIZER;

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(), (parser, mapper, event) -> new Builder()
				.searchApplication(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code search_application.put}".
	 */
	public static final Endpoint<PutRequest, PutResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/search_application.put",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _name = 1 << 0;

				int propsSet = 0;

				propsSet |= _name;

				if (propsSet == (_name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_application");
					buf.append("/search_application");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.name, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _name = 1 << 0;

				int propsSet = 0;

				propsSet |= _name;

				if (propsSet == (_name)) {
					params.put("name", request.name);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.create != null) {
					params.put("create", String.valueOf(request.create));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, PutResponse._DESERIALIZER);
}
