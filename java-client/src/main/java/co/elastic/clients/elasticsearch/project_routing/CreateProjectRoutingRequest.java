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

// typedef: project_routing.create.Request

/**
 * Create of update a single named project routing expression.
 * <p>
 * Create of update a single named project routing expression.
 * 
 * @see <a href="../doc-files/api-spec.html#project_routing.create.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class CreateProjectRoutingRequest extends RequestBase implements JsonpSerializable {
	private final String name;

	private final ProjectRoutingExpression expressions;

	// ---------------------------------------------------------------------------------------------

	private CreateProjectRoutingRequest(Builder builder) {

		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.expressions = ApiTypeHelper.requireNonNull(builder.expressions, this, "expressions");

	}

	public static CreateProjectRoutingRequest of(Function<Builder, ObjectBuilder<CreateProjectRoutingRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The name of project routing expression
	 * <p>
	 * API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Required - Request body.
	 */
	public final ProjectRoutingExpression expressions() {
		return this.expressions;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		this.expressions.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CreateProjectRoutingRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<CreateProjectRoutingRequest> {
		private String name;

		private ProjectRoutingExpression expressions;

		public Builder() {
		}
		private Builder(CreateProjectRoutingRequest instance) {
			this.name = instance.name;
			this.expressions = instance.expressions;

		}
		/**
		 * Required - The name of project routing expression
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
		public final Builder expressions(ProjectRoutingExpression value) {
			this.expressions = value;
			return this;
		}

		/**
		 * Required - Request body.
		 */
		public final Builder expressions(
				Function<ProjectRoutingExpression.Builder, ObjectBuilder<ProjectRoutingExpression>> fn) {
			return this.expressions(fn.apply(new ProjectRoutingExpression.Builder()).build());
		}

		@Override
		public Builder withJson(JsonParser parser, JsonpMapper mapper) {

			@SuppressWarnings("unchecked")
			ProjectRoutingExpression value = (ProjectRoutingExpression) ProjectRoutingExpression._DESERIALIZER
					.deserialize(parser, mapper);
			return this.expressions(value);
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CreateProjectRoutingRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CreateProjectRoutingRequest build() {
			_checkSingleUse();

			return new CreateProjectRoutingRequest(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	public static final JsonpDeserializer<CreateProjectRoutingRequest> _DESERIALIZER = createCreateProjectRoutingRequestDeserializer();
	protected static JsonpDeserializer<CreateProjectRoutingRequest> createCreateProjectRoutingRequestDeserializer() {

		JsonpDeserializer<ProjectRoutingExpression> valueDeserializer = ProjectRoutingExpression._DESERIALIZER;

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(), (parser, mapper, event) -> new Builder()
				.expressions(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code project_routing.create}".
	 */
	public static final Endpoint<CreateProjectRoutingRequest, CreateProjectRoutingResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/project_routing.create",

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
					buf.append("/_project_routing");
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
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, CreateProjectRoutingResponse._DESERIALIZER);
}
