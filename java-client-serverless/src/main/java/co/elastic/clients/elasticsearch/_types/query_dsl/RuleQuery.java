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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.RuleQuery

/**
 *
 * @see <a href="../../doc-files/api-spec.html#_types.query_dsl.RuleQuery">API
 *      specification</a>
 */
@JsonpDeserializable
public class RuleQuery extends QueryBase implements QueryVariant {
	private final Query organic;

	private final String rulesetId;

	private final JsonData matchCriteria;

	// ---------------------------------------------------------------------------------------------

	private RuleQuery(Builder builder) {
		super(builder);

		this.organic = ApiTypeHelper.requireNonNull(builder.organic, this, "organic");
		this.rulesetId = ApiTypeHelper.requireNonNull(builder.rulesetId, this, "rulesetId");
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
		return Query.Kind.RuleQuery;
	}

	/**
	 * Required - API name: {@code organic}
	 */
	public final Query organic() {
		return this.organic;
	}

	/**
	 * Required - API name: {@code ruleset_id}
	 */
	public final String rulesetId() {
		return this.rulesetId;
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

		generator.writeKey("ruleset_id");
		generator.write(this.rulesetId);

		generator.writeKey("match_criteria");
		this.matchCriteria.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RuleQuery}.
	 */

	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<RuleQuery> {
		private Query organic;

		private String rulesetId;

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
		 * Required - API name: {@code ruleset_id}
		 */
		public final Builder rulesetId(String value) {
			this.rulesetId = value;
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
		op.add(Builder::rulesetId, JsonpDeserializer.stringDeserializer(), "ruleset_id");
		op.add(Builder::matchCriteria, JsonData._DESERIALIZER, "match_criteria");

	}

}
