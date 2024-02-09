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

package co.elastic.clients.elasticsearch.synonyms;

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

// typedef: synonyms.put_synonym_rule.Request

/**
 * Creates or updates a synonym rule in a synonym set
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#synonyms.put_synonym_rule.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutSynonymRuleRequest extends RequestBase implements JsonpSerializable {
	private final String ruleId;

	private final String setId;

	private final String synonyms;

	// ---------------------------------------------------------------------------------------------

	private PutSynonymRuleRequest(Builder builder) {

		this.ruleId = ApiTypeHelper.requireNonNull(builder.ruleId, this, "ruleId");
		this.setId = ApiTypeHelper.requireNonNull(builder.setId, this, "setId");
		this.synonyms = ApiTypeHelper.requireNonNull(builder.synonyms, this, "synonyms");

	}

	public static PutSynonymRuleRequest of(Function<Builder, ObjectBuilder<PutSynonymRuleRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The id of the synonym rule to be updated or created
	 * <p>
	 * API name: {@code rule_id}
	 */
	public final String ruleId() {
		return this.ruleId;
	}

	/**
	 * Required - The id of the synonym set to be updated with the synonym rule
	 * <p>
	 * API name: {@code set_id}
	 */
	public final String setId() {
		return this.setId;
	}

	/**
	 * Required - API name: {@code synonyms}
	 */
	public final String synonyms() {
		return this.synonyms;
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

		generator.writeKey("synonyms");
		generator.write(this.synonyms);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutSynonymRuleRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PutSynonymRuleRequest> {
		private String ruleId;

		private String setId;

		private String synonyms;

		/**
		 * Required - The id of the synonym rule to be updated or created
		 * <p>
		 * API name: {@code rule_id}
		 */
		public final Builder ruleId(String value) {
			this.ruleId = value;
			return this;
		}

		/**
		 * Required - The id of the synonym set to be updated with the synonym rule
		 * <p>
		 * API name: {@code set_id}
		 */
		public final Builder setId(String value) {
			this.setId = value;
			return this;
		}

		/**
		 * Required - API name: {@code synonyms}
		 */
		public final Builder synonyms(String value) {
			this.synonyms = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutSynonymRuleRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutSynonymRuleRequest build() {
			_checkSingleUse();

			return new PutSynonymRuleRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutSynonymRuleRequest}
	 */
	public static final JsonpDeserializer<PutSynonymRuleRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutSynonymRuleRequest::setupPutSynonymRuleRequestDeserializer);

	protected static void setupPutSynonymRuleRequestDeserializer(ObjectDeserializer<PutSynonymRuleRequest.Builder> op) {

		op.add(Builder::synonyms, JsonpDeserializer.stringDeserializer(), "synonyms");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code synonyms.put_synonym_rule}".
	 */
	public static final Endpoint<PutSynonymRuleRequest, PutSynonymRuleResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/synonyms.put_synonym_rule",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _ruleId = 1 << 0;
				final int _setId = 1 << 1;

				int propsSet = 0;

				propsSet |= _ruleId;
				propsSet |= _setId;

				if (propsSet == (_setId | _ruleId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_synonyms");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.setId, buf);
					buf.append("/");
					SimpleEndpoint.pathEncode(request.ruleId, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _ruleId = 1 << 0;
				final int _setId = 1 << 1;

				int propsSet = 0;

				propsSet |= _ruleId;
				propsSet |= _setId;

				if (propsSet == (_setId | _ruleId)) {
					params.put("setId", request.setId);
					params.put("ruleId", request.ruleId);
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, PutSynonymRuleResponse._DESERIALIZER);
}
