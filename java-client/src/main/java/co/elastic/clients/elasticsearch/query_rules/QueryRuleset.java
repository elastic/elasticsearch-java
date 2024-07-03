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

// typedef: query_rules._types.QueryRuleset

/**
 *
 * @see <a href="../doc-files/api-spec.html#query_rules._types.QueryRuleset">API
 *      specification</a>
 */

public abstract class QueryRuleset implements JsonpSerializable {
	private final String rulesetId;

	private final List<QueryRule> rules;

	// ---------------------------------------------------------------------------------------------

	protected QueryRuleset(AbstractBuilder<?> builder) {

		this.rulesetId = ApiTypeHelper.requireNonNull(builder.rulesetId, this, "rulesetId");
		this.rules = ApiTypeHelper.unmodifiableRequired(builder.rules, this, "rules");

	}

	/**
	 * Required - Query Ruleset unique identifier
	 * <p>
	 * API name: {@code ruleset_id}
	 */
	public final String rulesetId() {
		return this.rulesetId;
	}

	/**
	 * Required - Rules associated with the query ruleset
	 * <p>
	 * API name: {@code rules}
	 */
	public final List<QueryRule> rules() {
		return this.rules;
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

		if (ApiTypeHelper.isDefined(this.rules)) {
			generator.writeKey("rules");
			generator.writeStartArray();
			for (QueryRule item0 : this.rules) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				WithJsonObjectBuilderBase<BuilderT> {
		private String rulesetId;

		private List<QueryRule> rules;

		/**
		 * Required - Query Ruleset unique identifier
		 * <p>
		 * API name: {@code ruleset_id}
		 */
		public final BuilderT rulesetId(String value) {
			this.rulesetId = value;
			return self();
		}

		/**
		 * Required - Rules associated with the query ruleset
		 * <p>
		 * API name: {@code rules}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>rules</code>.
		 */
		public final BuilderT rules(List<QueryRule> list) {
			this.rules = _listAddAll(this.rules, list);
			return self();
		}

		/**
		 * Required - Rules associated with the query ruleset
		 * <p>
		 * API name: {@code rules}
		 * <p>
		 * Adds one or more values to <code>rules</code>.
		 */
		public final BuilderT rules(QueryRule value, QueryRule... values) {
			this.rules = _listAdd(this.rules, value, values);
			return self();
		}

		/**
		 * Required - Rules associated with the query ruleset
		 * <p>
		 * API name: {@code rules}
		 * <p>
		 * Adds a value to <code>rules</code> using a builder lambda.
		 */
		public final BuilderT rules(Function<QueryRule.Builder, ObjectBuilder<QueryRule>> fn) {
			return rules(fn.apply(new QueryRule.Builder()).build());
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupQueryRulesetDeserializer(
			ObjectDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::rulesetId, JsonpDeserializer.stringDeserializer(), "ruleset_id");
		op.add(AbstractBuilder::rules, JsonpDeserializer.arrayDeserializer(QueryRule._DESERIALIZER), "rules");

	}

}
