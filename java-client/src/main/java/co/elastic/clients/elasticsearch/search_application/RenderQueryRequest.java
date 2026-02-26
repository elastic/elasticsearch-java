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

// typedef: search_application.render_query.Request

/**
 * Render a search application query. Generate an Elasticsearch query using the
 * specified query parameters and the search template associated with the search
 * application or a default template if none is specified. If a parameter used
 * in the search template is not specified in <code>params</code>, the
 * parameter's default value will be used. The API returns the specific
 * Elasticsearch query that would be generated and run by calling the search
 * application search API.
 * <p>
 * You must have <code>read</code> privileges on the backing alias of the search
 * application.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#search_application.render_query.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class RenderQueryRequest extends RequestBase implements JsonpSerializable {
	private final String name;

	private final Map<String, JsonData> params;

	// ---------------------------------------------------------------------------------------------

	private RenderQueryRequest(Builder builder) {

		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.params = ApiTypeHelper.unmodifiable(builder.params);

	}

	public static RenderQueryRequest of(Function<Builder, ObjectBuilder<RenderQueryRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The name of the search application to render teh query for.
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
	 * Builder for {@link RenderQueryRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<RenderQueryRequest> {
		private String name;

		@Nullable
		private Map<String, JsonData> params;

		public Builder() {
		}
		private Builder(RenderQueryRequest instance) {
			this.name = instance.name;
			this.params = instance.params;

		}
		/**
		 * Required - The name of the search application to render teh query for.
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
		 * Builds a {@link RenderQueryRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RenderQueryRequest build() {
			_checkSingleUse();

			return new RenderQueryRequest(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RenderQueryRequest}
	 */
	public static final JsonpDeserializer<RenderQueryRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RenderQueryRequest::setupRenderQueryRequestDeserializer);

	protected static void setupRenderQueryRequestDeserializer(ObjectDeserializer<RenderQueryRequest.Builder> op) {

		op.add(Builder::params, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "params");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code search_application.render_query}".
	 */
	public static final Endpoint<RenderQueryRequest, RenderQueryResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/search_application.render_query",

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
					buf.append("/_render_query");
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

			}, SimpleEndpoint.emptyMap(), true, RenderQueryResponse._DESERIALIZER);
}
