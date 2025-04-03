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

package co.elastic.clients.elasticsearch.query_rules.test;

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

// typedef: query_rules.test.QueryRulesetMatchedRule

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#query_rules.test.QueryRulesetMatchedRule">API
 *      specification</a>
 */
@JsonpDeserializable
public class QueryRulesetMatchedRule implements JsonpSerializable {
	private final String rulesetId;

	private final String ruleId;

	// ---------------------------------------------------------------------------------------------

	private QueryRulesetMatchedRule(Builder builder) {

		this.rulesetId = ApiTypeHelper.requireNonNullWithDefault(builder.rulesetId, this, "rulesetId",
				this.rulesetId());
		this.ruleId = ApiTypeHelper.requireNonNullWithDefault(builder.ruleId, this, "ruleId", this.ruleId());

	}

	public static QueryRulesetMatchedRule of(Function<Builder, ObjectBuilder<QueryRulesetMatchedRule>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Ruleset unique identifier
	 * <p>
	 * API name: {@code ruleset_id}
	 */
	public final String rulesetId() {
		return this.rulesetId;
	}

	/**
	 * Required - Rule unique identifier within that ruleset
	 * <p>
	 * API name: {@code rule_id}
	 */
	public final String ruleId() {
		return this.ruleId;
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

		generator.writeKey("ruleset_id");
		generator.write(this.rulesetId);

		generator.writeKey("rule_id");
		generator.write(this.ruleId);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link QueryRulesetMatchedRule}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<QueryRulesetMatchedRule> {
		private String rulesetId;

		private String ruleId;

		/**
		 * Required - Ruleset unique identifier
		 * <p>
		 * API name: {@code ruleset_id}
		 */
		public final Builder rulesetId(String value) {
			this.rulesetId = value;
			return this;
		}

		/**
		 * Required - Rule unique identifier within that ruleset
		 * <p>
		 * API name: {@code rule_id}
		 */
		public final Builder ruleId(String value) {
			this.ruleId = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link QueryRulesetMatchedRule}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public QueryRulesetMatchedRule build() {
			_checkSingleUse();

			return new QueryRulesetMatchedRule(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link QueryRulesetMatchedRule}
	 */
	public static final JsonpDeserializer<QueryRulesetMatchedRule> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, QueryRulesetMatchedRule::setupQueryRulesetMatchedRuleDeserializer);

	protected static void setupQueryRulesetMatchedRuleDeserializer(
			ObjectDeserializer<QueryRulesetMatchedRule.Builder> op) {

		op.add(Builder::rulesetId, JsonpDeserializer.stringDeserializer(), "ruleset_id");
		op.add(Builder::ruleId, JsonpDeserializer.stringDeserializer(), "rule_id");

	}

}
