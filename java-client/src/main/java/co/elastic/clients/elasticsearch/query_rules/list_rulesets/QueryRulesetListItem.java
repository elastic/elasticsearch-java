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

package co.elastic.clients.elasticsearch.query_rules.list_rulesets;

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
import java.lang.Integer;
import java.lang.String;
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

// typedef: query_rules.list_rulesets.QueryRulesetListItem

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#query_rules.list_rulesets.QueryRulesetListItem">API
 *      specification</a>
 */
@JsonpDeserializable
public class QueryRulesetListItem implements JsonpSerializable {
	private final String rulesetId;

	private final int ruleTotalCount;

	private final Map<String, Integer> ruleCriteriaTypesCounts;

	// ---------------------------------------------------------------------------------------------

	private QueryRulesetListItem(Builder builder) {

		this.rulesetId = ApiTypeHelper.requireNonNull(builder.rulesetId, this, "rulesetId");
		this.ruleTotalCount = ApiTypeHelper.requireNonNull(builder.ruleTotalCount, this, "ruleTotalCount");
		this.ruleCriteriaTypesCounts = ApiTypeHelper.unmodifiableRequired(builder.ruleCriteriaTypesCounts, this,
				"ruleCriteriaTypesCounts");

	}

	public static QueryRulesetListItem of(Function<Builder, ObjectBuilder<QueryRulesetListItem>> fn) {
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
	 * Required - The number of rules associated with this ruleset
	 * <p>
	 * API name: {@code rule_total_count}
	 */
	public final int ruleTotalCount() {
		return this.ruleTotalCount;
	}

	/**
	 * Required - A map of criteria type to the number of rules of that type
	 * <p>
	 * API name: {@code rule_criteria_types_counts}
	 */
	public final Map<String, Integer> ruleCriteriaTypesCounts() {
		return this.ruleCriteriaTypesCounts;
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

		generator.writeKey("rule_total_count");
		generator.write(this.ruleTotalCount);

		if (ApiTypeHelper.isDefined(this.ruleCriteriaTypesCounts)) {
			generator.writeKey("rule_criteria_types_counts");
			generator.writeStartObject();
			for (Map.Entry<String, Integer> item0 : this.ruleCriteriaTypesCounts.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link QueryRulesetListItem}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<QueryRulesetListItem> {
		private String rulesetId;

		private Integer ruleTotalCount;

		private Map<String, Integer> ruleCriteriaTypesCounts;

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
		 * Required - The number of rules associated with this ruleset
		 * <p>
		 * API name: {@code rule_total_count}
		 */
		public final Builder ruleTotalCount(int value) {
			this.ruleTotalCount = value;
			return this;
		}

		/**
		 * Required - A map of criteria type to the number of rules of that type
		 * <p>
		 * API name: {@code rule_criteria_types_counts}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>ruleCriteriaTypesCounts</code>.
		 */
		public final Builder ruleCriteriaTypesCounts(Map<String, Integer> map) {
			this.ruleCriteriaTypesCounts = _mapPutAll(this.ruleCriteriaTypesCounts, map);
			return this;
		}

		/**
		 * Required - A map of criteria type to the number of rules of that type
		 * <p>
		 * API name: {@code rule_criteria_types_counts}
		 * <p>
		 * Adds an entry to <code>ruleCriteriaTypesCounts</code>.
		 */
		public final Builder ruleCriteriaTypesCounts(String key, Integer value) {
			this.ruleCriteriaTypesCounts = _mapPut(this.ruleCriteriaTypesCounts, key, value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link QueryRulesetListItem}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public QueryRulesetListItem build() {
			_checkSingleUse();

			return new QueryRulesetListItem(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link QueryRulesetListItem}
	 */
	public static final JsonpDeserializer<QueryRulesetListItem> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, QueryRulesetListItem::setupQueryRulesetListItemDeserializer);

	protected static void setupQueryRulesetListItemDeserializer(ObjectDeserializer<QueryRulesetListItem.Builder> op) {

		op.add(Builder::rulesetId, JsonpDeserializer.stringDeserializer(), "ruleset_id");
		op.add(Builder::ruleTotalCount, JsonpDeserializer.integerDeserializer(), "rule_total_count");
		op.add(Builder::ruleCriteriaTypesCounts,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.integerDeserializer()),
				"rule_criteria_types_counts");

	}

}
