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

package co.elastic.clients.elasticsearch.connector;

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
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
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

// typedef: connector.update_filtering.Request

/**
 * Updates the filtering field in the connector document
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#connector.update_filtering.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class UpdateFilteringRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final FilteringAdvancedSnippet advancedSnippet;

	private final String connectorId;

	private final List<FilteringConfig> filtering;

	private final List<FilteringRule> rules;

	// ---------------------------------------------------------------------------------------------

	private UpdateFilteringRequest(Builder builder) {

		this.advancedSnippet = builder.advancedSnippet;
		this.connectorId = ApiTypeHelper.requireNonNull(builder.connectorId, this, "connectorId");
		this.filtering = ApiTypeHelper.unmodifiable(builder.filtering);
		this.rules = ApiTypeHelper.unmodifiable(builder.rules);

	}

	public static UpdateFilteringRequest of(Function<Builder, ObjectBuilder<UpdateFilteringRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code advanced_snippet}
	 */
	@Nullable
	public final FilteringAdvancedSnippet advancedSnippet() {
		return this.advancedSnippet;
	}

	/**
	 * Required - The unique identifier of the connector to be updated
	 * <p>
	 * API name: {@code connector_id}
	 */
	public final String connectorId() {
		return this.connectorId;
	}

	/**
	 * API name: {@code filtering}
	 */
	public final List<FilteringConfig> filtering() {
		return this.filtering;
	}

	/**
	 * API name: {@code rules}
	 */
	public final List<FilteringRule> rules() {
		return this.rules;
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

		if (this.advancedSnippet != null) {
			generator.writeKey("advanced_snippet");
			this.advancedSnippet.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.filtering)) {
			generator.writeKey("filtering");
			generator.writeStartArray();
			for (FilteringConfig item0 : this.filtering) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.rules)) {
			generator.writeKey("rules");
			generator.writeStartArray();
			for (FilteringRule item0 : this.rules) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UpdateFilteringRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<UpdateFilteringRequest> {
		@Nullable
		private FilteringAdvancedSnippet advancedSnippet;

		private String connectorId;

		@Nullable
		private List<FilteringConfig> filtering;

		@Nullable
		private List<FilteringRule> rules;

		/**
		 * API name: {@code advanced_snippet}
		 */
		public final Builder advancedSnippet(@Nullable FilteringAdvancedSnippet value) {
			this.advancedSnippet = value;
			return this;
		}

		/**
		 * API name: {@code advanced_snippet}
		 */
		public final Builder advancedSnippet(
				Function<FilteringAdvancedSnippet.Builder, ObjectBuilder<FilteringAdvancedSnippet>> fn) {
			return this.advancedSnippet(fn.apply(new FilteringAdvancedSnippet.Builder()).build());
		}

		/**
		 * Required - The unique identifier of the connector to be updated
		 * <p>
		 * API name: {@code connector_id}
		 */
		public final Builder connectorId(String value) {
			this.connectorId = value;
			return this;
		}

		/**
		 * API name: {@code filtering}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>filtering</code>.
		 */
		public final Builder filtering(List<FilteringConfig> list) {
			this.filtering = _listAddAll(this.filtering, list);
			return this;
		}

		/**
		 * API name: {@code filtering}
		 * <p>
		 * Adds one or more values to <code>filtering</code>.
		 */
		public final Builder filtering(FilteringConfig value, FilteringConfig... values) {
			this.filtering = _listAdd(this.filtering, value, values);
			return this;
		}

		/**
		 * API name: {@code filtering}
		 * <p>
		 * Adds a value to <code>filtering</code> using a builder lambda.
		 */
		public final Builder filtering(Function<FilteringConfig.Builder, ObjectBuilder<FilteringConfig>> fn) {
			return filtering(fn.apply(new FilteringConfig.Builder()).build());
		}

		/**
		 * API name: {@code rules}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>rules</code>.
		 */
		public final Builder rules(List<FilteringRule> list) {
			this.rules = _listAddAll(this.rules, list);
			return this;
		}

		/**
		 * API name: {@code rules}
		 * <p>
		 * Adds one or more values to <code>rules</code>.
		 */
		public final Builder rules(FilteringRule value, FilteringRule... values) {
			this.rules = _listAdd(this.rules, value, values);
			return this;
		}

		/**
		 * API name: {@code rules}
		 * <p>
		 * Adds a value to <code>rules</code> using a builder lambda.
		 */
		public final Builder rules(Function<FilteringRule.Builder, ObjectBuilder<FilteringRule>> fn) {
			return rules(fn.apply(new FilteringRule.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link UpdateFilteringRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UpdateFilteringRequest build() {
			_checkSingleUse();

			return new UpdateFilteringRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link UpdateFilteringRequest}
	 */
	public static final JsonpDeserializer<UpdateFilteringRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, UpdateFilteringRequest::setupUpdateFilteringRequestDeserializer);

	protected static void setupUpdateFilteringRequestDeserializer(
			ObjectDeserializer<UpdateFilteringRequest.Builder> op) {

		op.add(Builder::advancedSnippet, FilteringAdvancedSnippet._DESERIALIZER, "advanced_snippet");
		op.add(Builder::filtering, JsonpDeserializer.arrayDeserializer(FilteringConfig._DESERIALIZER), "filtering");
		op.add(Builder::rules, JsonpDeserializer.arrayDeserializer(FilteringRule._DESERIALIZER), "rules");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code connector.update_filtering}".
	 */
	public static final Endpoint<UpdateFilteringRequest, UpdateFilteringResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/connector.update_filtering",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _connectorId = 1 << 0;

				int propsSet = 0;

				propsSet |= _connectorId;

				if (propsSet == (_connectorId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_connector");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.connectorId, buf);
					buf.append("/_filtering");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _connectorId = 1 << 0;

				int propsSet = 0;

				propsSet |= _connectorId;

				if (propsSet == (_connectorId)) {
					params.put("connectorId", request.connectorId);
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, UpdateFilteringResponse._DESERIALIZER);
}
