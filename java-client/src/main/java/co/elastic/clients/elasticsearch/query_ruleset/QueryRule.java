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

package co.elastic.clients.elasticsearch.query_ruleset;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: query_ruleset._types.QueryRule

/**
 *
 * @see <a href="../doc-files/api-spec.html#query_ruleset._types.QueryRule">API
 *      specification</a>
 */
@JsonpDeserializable
public class QueryRule implements JsonpSerializable {
	private final String ruleId;

	private final QueryRuleType type;

	private final List<QueryRuleCriteria> criteria;

	private final QueryRuleActions actions;

	// ---------------------------------------------------------------------------------------------

	private QueryRule(Builder builder) {

		this.ruleId = ApiTypeHelper.requireNonNull(builder.ruleId, this, "ruleId");
		this.type = ApiTypeHelper.requireNonNull(builder.type, this, "type");
		this.criteria = ApiTypeHelper.unmodifiableRequired(builder.criteria, this, "criteria");
		this.actions = ApiTypeHelper.requireNonNull(builder.actions, this, "actions");

	}

	public static QueryRule of(Function<Builder, ObjectBuilder<QueryRule>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code rule_id}
	 */
	public final String ruleId() {
		return this.ruleId;
	}

	/**
	 * Required - API name: {@code type}
	 */
	public final QueryRuleType type() {
		return this.type;
	}

	/**
	 * Required - API name: {@code criteria}
	 */
	public final List<QueryRuleCriteria> criteria() {
		return this.criteria;
	}

	/**
	 * Required - API name: {@code actions}
	 */
	public final QueryRuleActions actions() {
		return this.actions;
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

		generator.writeKey("rule_id");
		generator.write(this.ruleId);

		generator.writeKey("type");
		this.type.serialize(generator, mapper);
		if (ApiTypeHelper.isDefined(this.criteria)) {
			generator.writeKey("criteria");
			generator.writeStartArray();
			for (QueryRuleCriteria item0 : this.criteria) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("actions");
		this.actions.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link QueryRule}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<QueryRule> {
		private String ruleId;

		private QueryRuleType type;

		private List<QueryRuleCriteria> criteria;

		private QueryRuleActions actions;

		/**
		 * Required - API name: {@code rule_id}
		 */
		public final Builder ruleId(String value) {
			this.ruleId = value;
			return this;
		}

		/**
		 * Required - API name: {@code type}
		 */
		public final Builder type(QueryRuleType value) {
			this.type = value;
			return this;
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

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link QueryRule}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public QueryRule build() {
			_checkSingleUse();

			return new QueryRule(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link QueryRule}
	 */
	public static final JsonpDeserializer<QueryRule> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			QueryRule::setupQueryRuleDeserializer);

	protected static void setupQueryRuleDeserializer(ObjectDeserializer<QueryRule.Builder> op) {

		op.add(Builder::ruleId, JsonpDeserializer.stringDeserializer(), "rule_id");
		op.add(Builder::type, QueryRuleType._DESERIALIZER, "type");
		op.add(Builder::criteria, JsonpDeserializer.arrayDeserializer(QueryRuleCriteria._DESERIALIZER), "criteria");
		op.add(Builder::actions, QueryRuleActions._DESERIALIZER, "actions");

	}

}
