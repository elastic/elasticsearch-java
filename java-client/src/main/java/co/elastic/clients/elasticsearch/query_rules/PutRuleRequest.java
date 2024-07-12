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
import java.lang.Integer;
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

// typedef: query_rules.put_rule.Request

/**
 * Creates or updates a query rule within a query ruleset.
 * 
 * @see <a href="../doc-files/api-spec.html#query_rules.put_rule.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutRuleRequest extends RequestBase implements JsonpSerializable {
	private final QueryRuleActions actions;

	private final List<QueryRuleCriteria> criteria;

	@Nullable
	private final Integer priority;

	private final String ruleId;

	private final String rulesetId;

	private final QueryRuleType type;

	// ---------------------------------------------------------------------------------------------

	private PutRuleRequest(Builder builder) {

		this.actions = ApiTypeHelper.requireNonNull(builder.actions, this, "actions");
		this.criteria = ApiTypeHelper.unmodifiableRequired(builder.criteria, this, "criteria");
		this.priority = builder.priority;
		this.ruleId = ApiTypeHelper.requireNonNull(builder.ruleId, this, "ruleId");
		this.rulesetId = ApiTypeHelper.requireNonNull(builder.rulesetId, this, "rulesetId");
		this.type = ApiTypeHelper.requireNonNull(builder.type, this, "type");

	}

	public static PutRuleRequest of(Function<Builder, ObjectBuilder<PutRuleRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code actions}
	 */
	public final QueryRuleActions actions() {
		return this.actions;
	}

	/**
	 * Required - API name: {@code criteria}
	 */
	public final List<QueryRuleCriteria> criteria() {
		return this.criteria;
	}

	/**
	 * API name: {@code priority}
	 */
	@Nullable
	public final Integer priority() {
		return this.priority;
	}

	/**
	 * Required - The unique identifier of the query rule within the specified
	 * ruleset to be created or updated
	 * <p>
	 * API name: {@code rule_id}
	 */
	public final String ruleId() {
		return this.ruleId;
	}

	/**
	 * Required - The unique identifier of the query ruleset containing the rule to
	 * be created or updated
	 * <p>
	 * API name: {@code ruleset_id}
	 */
	public final String rulesetId() {
		return this.rulesetId;
	}

	/**
	 * Required - API name: {@code type}
	 */
	public final QueryRuleType type() {
		return this.type;
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

		generator.writeKey("actions");
		this.actions.serialize(generator, mapper);

		if (ApiTypeHelper.isDefined(this.criteria)) {
			generator.writeKey("criteria");
			generator.writeStartArray();
			for (QueryRuleCriteria item0 : this.criteria) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.priority != null) {
			generator.writeKey("priority");
			generator.write(this.priority);

		}
		generator.writeKey("type");
		this.type.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutRuleRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder> implements ObjectBuilder<PutRuleRequest> {
		private QueryRuleActions actions;

		private List<QueryRuleCriteria> criteria;

		@Nullable
		private Integer priority;

		private String ruleId;

		private String rulesetId;

		private QueryRuleType type;

		/**
		 * Required - API name: {@code actions}
		 */
		public final Builder actions(QueryRuleActions value) {
			this.actions = value;
			return this;
		}

		/**
		 * Required - API name: {@code actions}
		 */
		public final Builder actions(Function<QueryRuleActions.Builder, ObjectBuilder<QueryRuleActions>> fn) {
			return this.actions(fn.apply(new QueryRuleActions.Builder()).build());
		}

		/**
		 * Required - API name: {@code criteria}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>criteria</code>.
		 */
		public final Builder criteria(List<QueryRuleCriteria> list) {
			this.criteria = _listAddAll(this.criteria, list);
			return this;
		}

		/**
		 * Required - API name: {@code criteria}
		 * <p>
		 * Adds one or more values to <code>criteria</code>.
		 */
		public final Builder criteria(QueryRuleCriteria value, QueryRuleCriteria... values) {
			this.criteria = _listAdd(this.criteria, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code criteria}
		 * <p>
		 * Adds a value to <code>criteria</code> using a builder lambda.
		 */
		public final Builder criteria(Function<QueryRuleCriteria.Builder, ObjectBuilder<QueryRuleCriteria>> fn) {
			return criteria(fn.apply(new QueryRuleCriteria.Builder()).build());
		}

		/**
		 * API name: {@code priority}
		 */
		public final Builder priority(@Nullable Integer value) {
			this.priority = value;
			return this;
		}

		/**
		 * Required - The unique identifier of the query rule within the specified
		 * ruleset to be created or updated
		 * <p>
		 * API name: {@code rule_id}
		 */
		public final Builder ruleId(String value) {
			this.ruleId = value;
			return this;
		}

		/**
		 * Required - The unique identifier of the query ruleset containing the rule to
		 * be created or updated
		 * <p>
		 * API name: {@code ruleset_id}
		 */
		public final Builder rulesetId(String value) {
			this.rulesetId = value;
			return this;
		}

		/**
		 * Required - API name: {@code type}
		 */
		public final Builder type(QueryRuleType value) {
			this.type = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutRuleRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutRuleRequest build() {
			_checkSingleUse();

			return new PutRuleRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutRuleRequest}
	 */
	public static final JsonpDeserializer<PutRuleRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PutRuleRequest::setupPutRuleRequestDeserializer);

	protected static void setupPutRuleRequestDeserializer(ObjectDeserializer<PutRuleRequest.Builder> op) {

		op.add(Builder::actions, QueryRuleActions._DESERIALIZER, "actions");
		op.add(Builder::criteria, JsonpDeserializer.arrayDeserializer(QueryRuleCriteria._DESERIALIZER), "criteria");
		op.add(Builder::priority, JsonpDeserializer.integerDeserializer(), "priority");
		op.add(Builder::type, QueryRuleType._DESERIALIZER, "type");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code query_rules.put_rule}".
	 */
	public static final Endpoint<PutRuleRequest, PutRuleResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/query_rules.put_rule",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _ruleId = 1 << 0;
				final int _rulesetId = 1 << 1;

				int propsSet = 0;

				propsSet |= _ruleId;
				propsSet |= _rulesetId;

				if (propsSet == (_rulesetId | _ruleId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_query_rules");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.rulesetId, buf);
					buf.append("/_rule");
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
				final int _rulesetId = 1 << 1;

				int propsSet = 0;

				propsSet |= _ruleId;
				propsSet |= _rulesetId;

				if (propsSet == (_rulesetId | _ruleId)) {
					params.put("rulesetId", request.rulesetId);
					params.put("ruleId", request.ruleId);
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, PutRuleResponse._DESERIALIZER);
}
