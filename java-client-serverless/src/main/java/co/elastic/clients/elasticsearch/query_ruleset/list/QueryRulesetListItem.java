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

package co.elastic.clients.elasticsearch.query_ruleset.list;

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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: query_ruleset.list.QueryRulesetListItem

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#query_ruleset.list.QueryRulesetListItem">API
 *      specification</a>
 */
@JsonpDeserializable
public class QueryRulesetListItem implements JsonpSerializable {
	private final String rulesetId;

	private final int rulesCount;

	// ---------------------------------------------------------------------------------------------

	private QueryRulesetListItem(Builder builder) {

		this.rulesetId = ApiTypeHelper.requireNonNull(builder.rulesetId, this, "rulesetId");
		this.rulesCount = ApiTypeHelper.requireNonNull(builder.rulesCount, this, "rulesCount");

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
	 * API name: {@code rules_count}
	 */
	public final int rulesCount() {
		return this.rulesCount;
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

		generator.writeKey("rules_count");
		generator.write(this.rulesCount);

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

		private Integer rulesCount;

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
		 * API name: {@code rules_count}
		 */
		public final Builder rulesCount(int value) {
			this.rulesCount = value;
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
		op.add(Builder::rulesCount, JsonpDeserializer.integerDeserializer(), "rules_count");

	}

}
