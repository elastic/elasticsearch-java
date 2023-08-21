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
import co.elastic.clients.json.JsonData;
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
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: search_application.search.Request

/**
 * Perform a search against a search application
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#search_application.search.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class SearchApplicationSearchRequest extends RequestBase implements JsonpSerializable {
	private final String name;

	private final Map<String, JsonData> params;

	// ---------------------------------------------------------------------------------------------

	private SearchApplicationSearchRequest(Builder builder) {

		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.params = ApiTypeHelper.unmodifiable(builder.params);

	}

	public static SearchApplicationSearchRequest of(
			Function<Builder, ObjectBuilder<SearchApplicationSearchRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The name of the search application to be searched
	 * <p>
	 * API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * API name: {@code params}
	 */
	public final Map<String, JsonData> params() {
		return this.params;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (ApiTypeHelper.isDefined(this.params)) {
			generator.writeKey("params");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.params.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SearchApplicationSearchRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<SearchApplicationSearchRequest> {
		private String name;

		@Nullable
		private Map<String, JsonData> params;

		/**
		 * Required - The name of the search application to be searched
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code params}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>params</code>.
		 */
		public final Builder params(Map<String, JsonData> map) {
			this.params = _mapPutAll(this.params, map);
			return this;
		}

		/**
		 * API name: {@code params}
		 * <p>
		 * Adds an entry to <code>params</code>.
		 */
		public final Builder params(String key, JsonData value) {
			this.params = _mapPut(this.params, key, value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SearchApplicationSearchRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SearchApplicationSearchRequest build() {
			_checkSingleUse();

			return new SearchApplicationSearchRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SearchApplicationSearchRequest}
	 */
	public static final JsonpDeserializer<SearchApplicationSearchRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SearchApplicationSearchRequest::setupSearchApplicationSearchRequestDeserializer);

	protected static void setupSearchApplicationSearchRequestDeserializer(
			ObjectDeserializer<SearchApplicationSearchRequest.Builder> op) {

		op.add(Builder::params, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "params");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code search_application.search}".
	 */
	public static final SimpleEndpoint<SearchApplicationSearchRequest, ?> _ENDPOINT = new SimpleEndpoint<>(
			"es/search_application.search",

			// Request method
			request -> {
				return "POST";

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
					buf.append("/_search");
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
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, SearchApplicationSearchResponse._DESERIALIZER);

	/**
	 * Create an "{@code search_application.search}" endpoint.
	 */
	public static <TDocument> Endpoint<SearchApplicationSearchRequest, SearchApplicationSearchResponse<TDocument>, ErrorResponse> createSearchEndpoint(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return _ENDPOINT.withResponseDeserializer(SearchApplicationSearchResponse
				.createSearchApplicationSearchResponseDeserializer(tDocumentDeserializer));
	}
}
