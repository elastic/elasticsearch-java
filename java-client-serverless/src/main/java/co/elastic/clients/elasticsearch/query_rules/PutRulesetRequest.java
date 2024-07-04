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

package co.elastic.clients.elasticsearch.query_rules;

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

// typedef: query_rules.put_ruleset.Request

/**
 * Creates or updates a query ruleset.
 * 
 * @see <a href="../doc-files/api-spec.html#query_rules.put_ruleset.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutRulesetRequest extends RequestBase implements JsonpSerializable {
	private final List<QueryRule> rules;

	private final String rulesetId;

	// ---------------------------------------------------------------------------------------------

	private PutRulesetRequest(Builder builder) {

		this.rules = ApiTypeHelper.unmodifiableRequired(builder.rules, this, "rules");
		this.rulesetId = ApiTypeHelper.requireNonNull(builder.rulesetId, this, "rulesetId");

	}

	public static PutRulesetRequest of(Function<Builder, ObjectBuilder<PutRulesetRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code rules}
	 */
	public final List<QueryRule> rules() {
		return this.rules;
	}

	/**
	 * Required - The unique identifier of the query ruleset to be created or
	 * updated
	 * <p>
	 * API name: {@code ruleset_id}
	 */
	public final String rulesetId() {
		return this.rulesetId;
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

		if (ApiTypeHelper.isDefined(this.rules)) {
			generator.writeKey("rules");
			generator.writeStartArray();
			for (QueryRule item0 : this.rules) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutRulesetRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PutRulesetRequest> {
		private List<QueryRule> rules;

		private String rulesetId;

		/**
		 * Required - API name: {@code rules}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>rules</code>.
		 */
		public final Builder rules(List<QueryRule> list) {
			this.rules = _listAddAll(this.rules, list);
			return this;
		}

		/**
		 * Required - API name: {@code rules}
		 * <p>
		 * Adds one or more values to <code>rules</code>.
		 */
		public final Builder rules(QueryRule value, QueryRule... values) {
			this.rules = _listAdd(this.rules, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code rules}
		 * <p>
		 * Adds a value to <code>rules</code> using a builder lambda.
		 */
		public final Builder rules(Function<QueryRule.Builder, ObjectBuilder<QueryRule>> fn) {
			return rules(fn.apply(new QueryRule.Builder()).build());
		}

		/**
		 * Required - The unique identifier of the query ruleset to be created or
		 * updated
		 * <p>
		 * API name: {@code ruleset_id}
		 */
		public final Builder rulesetId(String value) {
			this.rulesetId = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutRulesetRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutRulesetRequest build() {
			_checkSingleUse();

			return new PutRulesetRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutRulesetRequest}
	 */
	public static final JsonpDeserializer<PutRulesetRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutRulesetRequest::setupPutRulesetRequestDeserializer);

	protected static void setupPutRulesetRequestDeserializer(ObjectDeserializer<PutRulesetRequest.Builder> op) {

		op.add(Builder::rules, JsonpDeserializer.arrayDeserializer(QueryRule._DESERIALIZER), "rules");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code query_rules.put_ruleset}".
	 */
	public static final Endpoint<PutRulesetRequest, PutRulesetResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/query_rules.put_ruleset",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _rulesetId = 1 << 0;

				int propsSet = 0;

				propsSet |= _rulesetId;

				if (propsSet == (_rulesetId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_query_rules");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.rulesetId, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _rulesetId = 1 << 0;

				int propsSet = 0;

				propsSet |= _rulesetId;

				if (propsSet == (_rulesetId)) {
					params.put("rulesetId", request.rulesetId);
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, PutRulesetResponse._DESERIALIZER);
}
