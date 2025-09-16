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
import co.elastic.clients.elasticsearch._types.Time;
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

// typedef: indices.simulate_index_template.Request

/**
 * Simulate an index. Get the index configuration that would be applied to the
 * specified index from an existing index template.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#indices.simulate_index_template.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class SimulateIndexTemplateRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final String cause;

	@Nullable
	private final Boolean create;

	@Nullable
	private final Boolean includeDefaults;

	@Nullable
	private final Time masterTimeout;

	private final String name;

	private final IndexTemplate indexTemplate;

	// ---------------------------------------------------------------------------------------------

	private SimulateIndexTemplateRequest(Builder builder) {

		this.cause = builder.cause;
		this.create = builder.create;
		this.includeDefaults = builder.includeDefaults;
		this.masterTimeout = builder.masterTimeout;
		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.indexTemplate = ApiTypeHelper.requireNonNull(builder.indexTemplate, this, "indexTemplate");

	}

	public static SimulateIndexTemplateRequest of(Function<Builder, ObjectBuilder<SimulateIndexTemplateRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * User defined reason for dry-run creating the new template for simulation
	 * purposes
	 * <p>
	 * API name: {@code cause}
	 */
	@Nullable
	public final String cause() {
		return this.cause;
	}

	/**
	 * Whether the index template we optionally defined in the body should only be
	 * dry-run added if new or can also replace an existing one
	 * <p>
	 * API name: {@code create}
	 */
	@Nullable
	public final Boolean create() {
		return this.create;
	}

	/**
	 * If true, returns all relevant default configurations for the index template.
	 * <p>
	 * API name: {@code include_defaults}
	 */
	@Nullable
	public final Boolean includeDefaults() {
		return this.includeDefaults;
	}

	/**
	 * Period to wait for a connection to the master node. If no response is
	 * received before the timeout expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final Time masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * Required - Name of the index to simulate
	 * <p>
	 * API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Required - Request body.
	 */
	public final IndexTemplate indexTemplate() {
		return this.indexTemplate;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		this.indexTemplate.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SimulateIndexTemplateRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<SimulateIndexTemplateRequest> {
		@Nullable
		private String cause;

		@Nullable
		private Boolean create;

		@Nullable
		private Boolean includeDefaults;

		@Nullable
		private Time masterTimeout;

		private String name;

		private IndexTemplate indexTemplate;

		/**
		 * User defined reason for dry-run creating the new template for simulation
		 * purposes
		 * <p>
		 * API name: {@code cause}
		 */
		public final Builder cause(@Nullable String value) {
			this.cause = value;
			return this;
		}

		/**
		 * Whether the index template we optionally defined in the body should only be
		 * dry-run added if new or can also replace an existing one
		 * <p>
		 * API name: {@code create}
		 */
		public final Builder create(@Nullable Boolean value) {
			this.create = value;
			return this;
		}

		/**
		 * If true, returns all relevant default configurations for the index template.
		 * <p>
		 * API name: {@code include_defaults}
		 */
		public final Builder includeDefaults(@Nullable Boolean value) {
			this.includeDefaults = value;
			return this;
		}

		/**
		 * Period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable Time value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.masterTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - Name of the index to simulate
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
		public final Builder indexTemplate(IndexTemplate value) {
			this.indexTemplate = value;
			return this;
		}

		/**
		 * Required - Request body.
		 */
		public final Builder indexTemplate(Function<IndexTemplate.Builder, ObjectBuilder<IndexTemplate>> fn) {
			return this.indexTemplate(fn.apply(new IndexTemplate.Builder()).build());
		}

		@Override
		public Builder withJson(JsonParser parser, JsonpMapper mapper) {

			@SuppressWarnings("unchecked")
			IndexTemplate value = (IndexTemplate) IndexTemplate._DESERIALIZER.deserialize(parser, mapper);
			return this.indexTemplate(value);
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SimulateIndexTemplateRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SimulateIndexTemplateRequest build() {
			_checkSingleUse();

			return new SimulateIndexTemplateRequest(this);
		}
	}

	public static final JsonpDeserializer<SimulateIndexTemplateRequest> _DESERIALIZER = createSimulateIndexTemplateRequestDeserializer();
	protected static JsonpDeserializer<SimulateIndexTemplateRequest> createSimulateIndexTemplateRequestDeserializer() {

		JsonpDeserializer<IndexTemplate> valueDeserializer = IndexTemplate._DESERIALIZER;

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(), (parser, mapper, event) -> new Builder()
				.indexTemplate(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.simulate_index_template}".
	 */
	public static final Endpoint<SimulateIndexTemplateRequest, SimulateIndexTemplateResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/indices.simulate_index_template",

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
					buf.append("/_index_template");
					buf.append("/_simulate_index");
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
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout._toJsonString());
				}
				if (request.create != null) {
					params.put("create", String.valueOf(request.create));
				}
				if (request.cause != null) {
					params.put("cause", request.cause);
				}
				if (request.includeDefaults != null) {
					params.put("include_defaults", String.valueOf(request.includeDefaults));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, SimulateIndexTemplateResponse._DESERIALIZER);
}
