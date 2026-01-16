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

package co.elastic.clients.elasticsearch.project_routing;

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

// typedef: project_routing.create_many.Request

/**
 * Create of update named project routing expressions.
 * <p>
 * Create or update named project routing expressions.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#project_routing.create_many.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class CreateManyRequest extends RequestBase implements JsonpSerializable {
	private final Map<String, ProjectRoutingExpression> expressions;

	// ---------------------------------------------------------------------------------------------

	private CreateManyRequest(Builder builder) {

		this.expressions = ApiTypeHelper.unmodifiableRequired(builder.expressions, this, "expressions");

	}

	public static CreateManyRequest of(Function<Builder, ObjectBuilder<CreateManyRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Request body.
	 */
	public final Map<String, ProjectRoutingExpression> expressions() {
		return this.expressions;
	}

	/**
	 * Get an element of {@code expressions}.
	 */
	public final @Nullable ProjectRoutingExpression get(String key) {
		return this.expressions.get(key);
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		for (Map.Entry<String, ProjectRoutingExpression> item0 : this.expressions.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CreateManyRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<CreateManyRequest> {
		private Map<String, ProjectRoutingExpression> expressions = new HashMap<>();

		public Builder() {
		}
		private Builder(CreateManyRequest instance) {
			this.expressions = instance.expressions;

		}
		/**
		 * Required - Request body.
		 * <p>
		 * Adds all entries of <code>map</code> to <code>expressions</code>.
		 */
		public final Builder expressions(Map<String, ProjectRoutingExpression> map) {
			this.expressions = _mapPutAll(this.expressions, map);
			return this;
		}

		/**
		 * Required - Request body.
		 * <p>
		 * Adds an entry to <code>expressions</code>.
		 */
		public final Builder expressions(String key, ProjectRoutingExpression value) {
			this.expressions = _mapPut(this.expressions, key, value);
			return this;
		}

		/**
		 * Required - Request body.
		 * <p>
		 * Adds an entry to <code>expressions</code> using a builder lambda.
		 */
		public final Builder expressions(String key,
				Function<ProjectRoutingExpression.Builder, ObjectBuilder<ProjectRoutingExpression>> fn) {
			return expressions(key, fn.apply(new ProjectRoutingExpression.Builder()).build());
		}

		@Override
		public Builder withJson(JsonParser parser, JsonpMapper mapper) {

			@SuppressWarnings("unchecked")
			Map<String, ProjectRoutingExpression> value = (Map<String, ProjectRoutingExpression>) JsonpDeserializer
					.stringMapDeserializer(ProjectRoutingExpression._DESERIALIZER).deserialize(parser, mapper);
			return this.expressions(value);
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CreateManyRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CreateManyRequest build() {
			_checkSingleUse();

			return new CreateManyRequest(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	public static final JsonpDeserializer<CreateManyRequest> _DESERIALIZER = createCreateManyRequestDeserializer();
	protected static JsonpDeserializer<CreateManyRequest> createCreateManyRequestDeserializer() {

		JsonpDeserializer<Map<String, ProjectRoutingExpression>> valueDeserializer = JsonpDeserializer
				.stringMapDeserializer(ProjectRoutingExpression._DESERIALIZER);

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(), (parser, mapper, event) -> new Builder()
				.expressions(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code project_routing.create_many}".
	 */
	public static final Endpoint<CreateManyRequest, CreateManyResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/project_routing.create_many",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				return "/_project_routing";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, CreateManyResponse._DESERIALIZER);
}
