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

import co.elastic.clients.json.JsonData;
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

// typedef: query_rules._types.QueryRuleCriteria

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#query_rules._types.QueryRuleCriteria">API
 *      specification</a>
 */
@JsonpDeserializable
public class QueryRuleCriteria implements JsonpSerializable {
	private final QueryRuleCriteriaType type;

	@Nullable
	private final String metadata;

	private final List<JsonData> values;

	// ---------------------------------------------------------------------------------------------

	private QueryRuleCriteria(Builder builder) {

		this.type = ApiTypeHelper.requireNonNull(builder.type, this, "type");
		this.metadata = builder.metadata;
		this.values = ApiTypeHelper.unmodifiable(builder.values);

	}

	public static QueryRuleCriteria of(Function<Builder, ObjectBuilder<QueryRuleCriteria>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The type of criteria. The following criteria types are supported:
	 * <ul>
	 * <li><code>always</code>: Matches all queries, regardless of input.</li>
	 * <li><code>contains</code>: Matches that contain this value anywhere in the
	 * field meet the criteria defined by the rule. Only applicable for string
	 * values.</li>
	 * <li><code>exact</code>: Only exact matches meet the criteria defined by the
	 * rule. Applicable for string or numerical values.</li>
	 * <li><code>fuzzy</code>: Exact matches or matches within the allowed
	 * Levenshtein Edit Distance meet the criteria defined by the rule. Only
	 * applicable for string values.</li>
	 * <li><code>gt</code>: Matches with a value greater than this value meet the
	 * criteria defined by the rule. Only applicable for numerical values.</li>
	 * <li><code>gte</code>: Matches with a value greater than or equal to this
	 * value meet the criteria defined by the rule. Only applicable for numerical
	 * values.</li>
	 * <li><code>lt</code>: Matches with a value less than this value meet the
	 * criteria defined by the rule. Only applicable for numerical values.</li>
	 * <li><code>lte</code>: Matches with a value less than or equal to this value
	 * meet the criteria defined by the rule. Only applicable for numerical
	 * values.</li>
	 * <li><code>prefix</code>: Matches that start with this value meet the criteria
	 * defined by the rule. Only applicable for string values.</li>
	 * <li><code>suffix</code>: Matches that end with this value meet the criteria
	 * defined by the rule. Only applicable for string values.</li>
	 * </ul>
	 * <p>
	 * API name: {@code type}
	 */
	public final QueryRuleCriteriaType type() {
		return this.type;
	}

	/**
	 * The metadata field to match against. This metadata will be used to match
	 * against <code>match_criteria</code> sent in the rule. It is required for all
	 * criteria types except <code>always</code>.
	 * <p>
	 * API name: {@code metadata}
	 */
	@Nullable
	public final String metadata() {
		return this.metadata;
	}

	/**
	 * The values to match against the <code>metadata</code> field. Only one value
	 * must match for the criteria to be met. It is required for all criteria types
	 * except <code>always</code>.
	 * <p>
	 * API name: {@code values}
	 */
	public final List<JsonData> values() {
		return this.values;
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

		generator.writeKey("type");
		this.type.serialize(generator, mapper);
		if (this.metadata != null) {
			generator.writeKey("metadata");
			generator.write(this.metadata);

		}
		if (ApiTypeHelper.isDefined(this.values)) {
			generator.writeKey("values");
			generator.writeStartArray();
			for (JsonData item0 : this.values) {
				item0.serialize(generator, mapper);

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
	 * Builder for {@link QueryRuleCriteria}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<QueryRuleCriteria> {
		private QueryRuleCriteriaType type;

		@Nullable
		private String metadata;

		@Nullable
		private List<JsonData> values;

		/**
		 * Required - The type of criteria. The following criteria types are supported:
		 * <ul>
		 * <li><code>always</code>: Matches all queries, regardless of input.</li>
		 * <li><code>contains</code>: Matches that contain this value anywhere in the
		 * field meet the criteria defined by the rule. Only applicable for string
		 * values.</li>
		 * <li><code>exact</code>: Only exact matches meet the criteria defined by the
		 * rule. Applicable for string or numerical values.</li>
		 * <li><code>fuzzy</code>: Exact matches or matches within the allowed
		 * Levenshtein Edit Distance meet the criteria defined by the rule. Only
		 * applicable for string values.</li>
		 * <li><code>gt</code>: Matches with a value greater than this value meet the
		 * criteria defined by the rule. Only applicable for numerical values.</li>
		 * <li><code>gte</code>: Matches with a value greater than or equal to this
		 * value meet the criteria defined by the rule. Only applicable for numerical
		 * values.</li>
		 * <li><code>lt</code>: Matches with a value less than this value meet the
		 * criteria defined by the rule. Only applicable for numerical values.</li>
		 * <li><code>lte</code>: Matches with a value less than or equal to this value
		 * meet the criteria defined by the rule. Only applicable for numerical
		 * values.</li>
		 * <li><code>prefix</code>: Matches that start with this value meet the criteria
		 * defined by the rule. Only applicable for string values.</li>
		 * <li><code>suffix</code>: Matches that end with this value meet the criteria
		 * defined by the rule. Only applicable for string values.</li>
		 * </ul>
		 * <p>
		 * API name: {@code type}
		 */
		public final Builder type(QueryRuleCriteriaType value) {
			this.type = value;
			return this;
		}

		/**
		 * The metadata field to match against. This metadata will be used to match
		 * against <code>match_criteria</code> sent in the rule. It is required for all
		 * criteria types except <code>always</code>.
		 * <p>
		 * API name: {@code metadata}
		 */
		public final Builder metadata(@Nullable String value) {
			this.metadata = value;
			return this;
		}

		/**
		 * The values to match against the <code>metadata</code> field. Only one value
		 * must match for the criteria to be met. It is required for all criteria types
		 * except <code>always</code>.
		 * <p>
		 * API name: {@code values}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>values</code>.
		 */
		public final Builder values(List<JsonData> list) {
			this.values = _listAddAll(this.values, list);
			return this;
		}

		/**
		 * The values to match against the <code>metadata</code> field. Only one value
		 * must match for the criteria to be met. It is required for all criteria types
		 * except <code>always</code>.
		 * <p>
		 * API name: {@code values}
		 * <p>
		 * Adds one or more values to <code>values</code>.
		 */
		public final Builder values(JsonData value, JsonData... values) {
			this.values = _listAdd(this.values, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link QueryRuleCriteria}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public QueryRuleCriteria build() {
			_checkSingleUse();

			return new QueryRuleCriteria(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link QueryRuleCriteria}
	 */
	public static final JsonpDeserializer<QueryRuleCriteria> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, QueryRuleCriteria::setupQueryRuleCriteriaDeserializer);

	protected static void setupQueryRuleCriteriaDeserializer(ObjectDeserializer<QueryRuleCriteria.Builder> op) {

		op.add(Builder::type, QueryRuleCriteriaType._DESERIALIZER, "type");
		op.add(Builder::metadata, JsonpDeserializer.stringDeserializer(), "metadata");
		op.add(Builder::values, JsonpDeserializer.arrayDeserializer(JsonData._DESERIALIZER), "values");

	}

}
