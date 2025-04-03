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

import co.elastic.clients.elasticsearch.query_rules.test.QueryRulesetMatchedRule;
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

// typedef: query_rules.test.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#query_rules.test.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class TestResponse implements JsonpSerializable {
	private final int totalMatchedRules;

	private final List<QueryRulesetMatchedRule> matchedRules;

	// ---------------------------------------------------------------------------------------------

	private TestResponse(Builder builder) {

		this.totalMatchedRules = ApiTypeHelper.requireNonNullWithDefault(builder.totalMatchedRules, this,
				"totalMatchedRules", this.totalMatchedRules());
		this.matchedRules = ApiTypeHelper.unmodifiableRequired(builder.matchedRules, this, "matchedRules");

	}

	public static TestResponse of(Function<Builder, ObjectBuilder<TestResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code total_matched_rules}
	 */
	public final int totalMatchedRules() {
		return this.totalMatchedRules;
	}

	/**
	 * Required - API name: {@code matched_rules}
	 */
	public final List<QueryRulesetMatchedRule> matchedRules() {
		return this.matchedRules;
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

		generator.writeKey("total_matched_rules");
		generator.write(this.totalMatchedRules);

		if (ApiTypeHelper.isDefined(this.matchedRules)) {
			generator.writeKey("matched_rules");
			generator.writeStartArray();
			for (QueryRulesetMatchedRule item0 : this.matchedRules) {
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
	 * Builder for {@link TestResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<TestResponse> {
		private Integer totalMatchedRules;

		private List<QueryRulesetMatchedRule> matchedRules;

		/**
		 * Required - API name: {@code total_matched_rules}
		 */
		public final Builder totalMatchedRules(int value) {
			this.totalMatchedRules = value;
			return this;
		}

		/**
		 * Required - API name: {@code matched_rules}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>matchedRules</code>.
		 */
		public final Builder matchedRules(List<QueryRulesetMatchedRule> list) {
			this.matchedRules = _listAddAll(this.matchedRules, list);
			return this;
		}

		/**
		 * Required - API name: {@code matched_rules}
		 * <p>
		 * Adds one or more values to <code>matchedRules</code>.
		 */
		public final Builder matchedRules(QueryRulesetMatchedRule value, QueryRulesetMatchedRule... values) {
			this.matchedRules = _listAdd(this.matchedRules, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code matched_rules}
		 * <p>
		 * Adds a value to <code>matchedRules</code> using a builder lambda.
		 */
		public final Builder matchedRules(
				Function<QueryRulesetMatchedRule.Builder, ObjectBuilder<QueryRulesetMatchedRule>> fn) {
			return matchedRules(fn.apply(new QueryRulesetMatchedRule.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TestResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TestResponse build() {
			_checkSingleUse();

			return new TestResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TestResponse}
	 */
	public static final JsonpDeserializer<TestResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			TestResponse::setupTestResponseDeserializer);

	protected static void setupTestResponseDeserializer(ObjectDeserializer<TestResponse.Builder> op) {

		op.add(Builder::totalMatchedRules, JsonpDeserializer.integerDeserializer(), "total_matched_rules");
		op.add(Builder::matchedRules, JsonpDeserializer.arrayDeserializer(QueryRulesetMatchedRule._DESERIALIZER),
				"matched_rules");

	}

}
