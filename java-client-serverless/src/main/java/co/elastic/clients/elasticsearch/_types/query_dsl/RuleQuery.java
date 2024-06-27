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

package co.elastic.clients.elasticsearch._types.query_dsl;

import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.List;
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

// typedef: _types.query_dsl.RuleQuery

/**
 *
 * @see <a href="../../doc-files/api-spec.html#_types.query_dsl.RuleQuery">API
 *      specification</a>
 */
@JsonpDeserializable
public class RuleQuery extends QueryBase implements QueryVariant {
	private final Query organic;

	private final List<String> rulesetIds;

	private final JsonData matchCriteria;

	// ---------------------------------------------------------------------------------------------

	private RuleQuery(Builder builder) {
		super(builder);

		this.organic = ApiTypeHelper.requireNonNull(builder.organic, this, "organic");
		this.rulesetIds = ApiTypeHelper.unmodifiableRequired(builder.rulesetIds, this, "rulesetIds");
		this.matchCriteria = ApiTypeHelper.requireNonNull(builder.matchCriteria, this, "matchCriteria");

	}

	public static RuleQuery of(Function<Builder, ObjectBuilder<RuleQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Query variant kind.
	 */
	@Override
	public Query.Kind _queryKind() {
		return Query.Kind.Rule;
	}

	/**
	 * Required - API name: {@code organic}
	 */
	public final Query organic() {
		return this.organic;
	}

	/**
	 * Required - API name: {@code ruleset_ids}
	 */
	public final List<String> rulesetIds() {
		return this.rulesetIds;
	}

	/**
	 * Required - API name: {@code match_criteria}
	 */
	public final JsonData matchCriteria() {
		return this.matchCriteria;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("organic");
		this.organic.serialize(generator, mapper);

		if (ApiTypeHelper.isDefined(this.rulesetIds)) {
			generator.writeKey("ruleset_ids");
			generator.writeStartArray();
			for (String item0 : this.rulesetIds) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		generator.writeKey("match_criteria");
		this.matchCriteria.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RuleQuery}.
	 */

	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<RuleQuery> {
		private Query organic;

		private List<String> rulesetIds;

		private JsonData matchCriteria;

		/**
		 * Required - API name: {@code organic}
		 */
		public final Builder organic(Query value) {
			this.organic = value;
			return this;
		}

		/**
		 * Required - API name: {@code organic}
		 */
		public final Builder organic(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.organic(fn.apply(new Query.Builder()).build());
		}

		/**
		 * Required - API name: {@code ruleset_ids}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>rulesetIds</code>.
		 */
		public final Builder rulesetIds(List<String> list) {
			this.rulesetIds = _listAddAll(this.rulesetIds, list);
			return this;
		}

		/**
		 * Required - API name: {@code ruleset_ids}
		 * <p>
		 * Adds one or more values to <code>rulesetIds</code>.
		 */
		public final Builder rulesetIds(String value, String... values) {
			this.rulesetIds = _listAdd(this.rulesetIds, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code match_criteria}
		 */
		public final Builder matchCriteria(JsonData value) {
			this.matchCriteria = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RuleQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RuleQuery build() {
			_checkSingleUse();

			return new RuleQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RuleQuery}
	 */
	public static final JsonpDeserializer<RuleQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RuleQuery::setupRuleQueryDeserializer);

	protected static void setupRuleQueryDeserializer(ObjectDeserializer<RuleQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::organic, Query._DESERIALIZER, "organic");
		op.add(Builder::rulesetIds, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"ruleset_ids");
		op.add(Builder::matchCriteria, JsonData._DESERIALIZER, "match_criteria");

	}

}
