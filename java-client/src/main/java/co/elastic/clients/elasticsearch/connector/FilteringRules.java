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

package co.elastic.clients.elasticsearch.connector;

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

// typedef: connector._types.FilteringRules

/**
 *
 * @see <a href="../doc-files/api-spec.html#connector._types.FilteringRules">API
 *      specification</a>
 */
@JsonpDeserializable
public class FilteringRules implements JsonpSerializable {
	private final FilteringAdvancedSnippet advancedSnippet;

	private final List<FilteringRule> rules;

	private final FilteringRulesValidation validation;

	// ---------------------------------------------------------------------------------------------

	private FilteringRules(Builder builder) {

		this.advancedSnippet = ApiTypeHelper.requireNonNull(builder.advancedSnippet, this, "advancedSnippet");
		this.rules = ApiTypeHelper.unmodifiableRequired(builder.rules, this, "rules");
		this.validation = ApiTypeHelper.requireNonNull(builder.validation, this, "validation");

	}

	public static FilteringRules of(Function<Builder, ObjectBuilder<FilteringRules>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code advanced_snippet}
	 */
	public final FilteringAdvancedSnippet advancedSnippet() {
		return this.advancedSnippet;
	}

	/**
	 * Required - API name: {@code rules}
	 */
	public final List<FilteringRule> rules() {
		return this.rules;
	}

	/**
	 * Required - API name: {@code validation}
	 */
	public final FilteringRulesValidation validation() {
		return this.validation;
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

		generator.writeKey("advanced_snippet");
		this.advancedSnippet.serialize(generator, mapper);

		if (ApiTypeHelper.isDefined(this.rules)) {
			generator.writeKey("rules");
			generator.writeStartArray();
			for (FilteringRule item0 : this.rules) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("validation");
		this.validation.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FilteringRules}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<FilteringRules> {
		private FilteringAdvancedSnippet advancedSnippet;

		private List<FilteringRule> rules;

		private FilteringRulesValidation validation;

		/**
		 * Required - API name: {@code advanced_snippet}
		 */
		public final Builder advancedSnippet(FilteringAdvancedSnippet value) {
			this.advancedSnippet = value;
			return this;
		}

		/**
		 * Required - API name: {@code advanced_snippet}
		 */
		public final Builder advancedSnippet(
				Function<FilteringAdvancedSnippet.Builder, ObjectBuilder<FilteringAdvancedSnippet>> fn) {
			return this.advancedSnippet(fn.apply(new FilteringAdvancedSnippet.Builder()).build());
		}

		/**
		 * Required - API name: {@code rules}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>rules</code>.
		 */
		public final Builder rules(List<FilteringRule> list) {
			this.rules = _listAddAll(this.rules, list);
			return this;
		}

		/**
		 * Required - API name: {@code rules}
		 * <p>
		 * Adds one or more values to <code>rules</code>.
		 */
		public final Builder rules(FilteringRule value, FilteringRule... values) {
			this.rules = _listAdd(this.rules, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code rules}
		 * <p>
		 * Adds a value to <code>rules</code> using a builder lambda.
		 */
		public final Builder rules(Function<FilteringRule.Builder, ObjectBuilder<FilteringRule>> fn) {
			return rules(fn.apply(new FilteringRule.Builder()).build());
		}

		/**
		 * Required - API name: {@code validation}
		 */
		public final Builder validation(FilteringRulesValidation value) {
			this.validation = value;
			return this;
		}

		/**
		 * Required - API name: {@code validation}
		 */
		public final Builder validation(
				Function<FilteringRulesValidation.Builder, ObjectBuilder<FilteringRulesValidation>> fn) {
			return this.validation(fn.apply(new FilteringRulesValidation.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link FilteringRules}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FilteringRules build() {
			_checkSingleUse();

			return new FilteringRules(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FilteringRules}
	 */
	public static final JsonpDeserializer<FilteringRules> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			FilteringRules::setupFilteringRulesDeserializer);

	protected static void setupFilteringRulesDeserializer(ObjectDeserializer<FilteringRules.Builder> op) {

		op.add(Builder::advancedSnippet, FilteringAdvancedSnippet._DESERIALIZER, "advanced_snippet");
		op.add(Builder::rules, JsonpDeserializer.arrayDeserializer(FilteringRule._DESERIALIZER), "rules");
		op.add(Builder::validation, FilteringRulesValidation._DESERIALIZER, "validation");

	}

}
