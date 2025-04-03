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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch.indices.create_from.CreateFrom;
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

// typedef: indices.create_from.Request

/**
 * Create an index from a source index.
 * <p>
 * Copy the mappings and settings from the source index to a destination index
 * while allowing request settings and mappings to override the source values.
 * 
 * @see <a href="../doc-files/api-spec.html#indices.create_from.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class CreateFromRequest extends RequestBase implements JsonpSerializable {
	private final String dest;

	private final String source;

	private final CreateFrom createFrom;

	// ---------------------------------------------------------------------------------------------

	private CreateFromRequest(Builder builder) {

		this.dest = ApiTypeHelper.requireNonNullWithDefault(builder.dest, this, "dest", this.dest());
		this.source = ApiTypeHelper.requireNonNullWithDefault(builder.source, this, "source", this.source());
		this.createFrom = ApiTypeHelper.requireNonNullWithDefault(builder.createFrom, this, "createFrom",
				this.createFrom());

	}

	public static CreateFromRequest of(Function<Builder, ObjectBuilder<CreateFromRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The destination index or data stream name
	 * <p>
	 * API name: {@code dest}
	 */
	public final String dest() {
		return this.dest;
	}

	/**
	 * Required - The source index or data stream name
	 * <p>
	 * API name: {@code source}
	 */
	public final String source() {
		return this.source;
	}

	/**
	 * Required - Request body.
	 */
	public final CreateFrom createFrom() {
		return this.createFrom;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		this.createFrom.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CreateFromRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<CreateFromRequest> {
		private String dest;

		private String source;

		private CreateFrom createFrom;

		/**
		 * Required - The destination index or data stream name
		 * <p>
		 * API name: {@code dest}
		 */
		public final Builder dest(String value) {
			this.dest = value;
			return this;
		}

		/**
		 * Required - The source index or data stream name
		 * <p>
		 * API name: {@code source}
		 */
		public final Builder source(String value) {
			this.source = value;
			return this;
		}

		/**
		 * Required - Request body.
		 */
		public final Builder createFrom(CreateFrom value) {
			this.createFrom = value;
			return this;
		}

		/**
		 * Required - Request body.
		 */
		public final Builder createFrom(Function<CreateFrom.Builder, ObjectBuilder<CreateFrom>> fn) {
			return this.createFrom(fn.apply(new CreateFrom.Builder()).build());
		}

		@Override
		public Builder withJson(JsonParser parser, JsonpMapper mapper) {

			@SuppressWarnings("unchecked")
			CreateFrom value = (CreateFrom) CreateFrom._DESERIALIZER.deserialize(parser, mapper);
			return this.createFrom(value);
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CreateFromRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CreateFromRequest build() {
			_checkSingleUse();

			return new CreateFromRequest(this);
		}
	}

	public static final JsonpDeserializer<CreateFromRequest> _DESERIALIZER = createCreateFromRequestDeserializer();
	protected static JsonpDeserializer<CreateFromRequest> createCreateFromRequestDeserializer() {

		JsonpDeserializer<CreateFrom> valueDeserializer = CreateFrom._DESERIALIZER;

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(), (parser, mapper, event) -> new Builder()
				.createFrom(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.create_from}".
	 */
	public static final Endpoint<CreateFromRequest, CreateFromResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/indices.create_from",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _source = 1 << 0;
				final int _dest = 1 << 1;

				int propsSet = 0;

				propsSet |= _source;
				propsSet |= _dest;

				if (propsSet == (_source | _dest)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_create_from");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.source, buf);
					buf.append("/");
					SimpleEndpoint.pathEncode(request.dest, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _source = 1 << 0;
				final int _dest = 1 << 1;

				int propsSet = 0;

				propsSet |= _source;
				propsSet |= _dest;

				if (propsSet == (_source | _dest)) {
					params.put("source", request.source);
					params.put("dest", request.dest);
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, CreateFromResponse._DESERIALIZER);
}
