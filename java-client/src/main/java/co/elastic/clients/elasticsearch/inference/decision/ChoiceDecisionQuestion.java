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

package co.elastic.clients.elasticsearch.inference.decision;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
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

// typedef: inference.decision.ChoiceDecisionQuestion

/**
 * A question answered with one option out of a fixed set of choices.
 * 
 * @see <a href=
 *      "../../doc-files/api-spec.html#inference.decision.ChoiceDecisionQuestion">API
 *      specification</a>
 */
@JsonpDeserializable
public class ChoiceDecisionQuestion extends DecisionQuestionBase implements DecisionQuestionVariant {
	private final Map<String, String> choices;

	// ---------------------------------------------------------------------------------------------

	private ChoiceDecisionQuestion(Builder builder) {
		super(builder);

		this.choices = ApiTypeHelper.unmodifiableRequired(builder.choices, this, "choices");

	}

	public static ChoiceDecisionQuestion of(Function<Builder, ObjectBuilder<ChoiceDecisionQuestion>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * DecisionQuestion variant kind.
	 */
	@Override
	public DecisionQuestion.Kind _decisionQuestionKind() {
		return DecisionQuestion.Kind.Choice;
	}

	/**
	 * Required - The options to choose from, each mapped to an optional
	 * description. At least two choices are required.
	 * <p>
	 * API name: {@code choices}
	 */
	public final Map<String, String> choices() {
		return this.choices;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "choice");
		super.serializeInternal(generator, mapper);
		if (ApiTypeHelper.isDefined(this.choices)) {
			generator.writeKey("choices");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.choices.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ChoiceDecisionQuestion}.
	 */

	public static class Builder extends DecisionQuestionBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ChoiceDecisionQuestion> {
		private Map<String, String> choices;

		public Builder() {
		}
		private Builder(ChoiceDecisionQuestion instance) {
			super(instance);
			this.choices = instance.choices;

		}
		/**
		 * Required - The options to choose from, each mapped to an optional
		 * description. At least two choices are required.
		 * <p>
		 * API name: {@code choices}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>choices</code>.
		 */
		public final Builder choices(Map<String, String> map) {
			this.choices = _mapPutAll(this.choices, map);
			return this;
		}

		/**
		 * Required - The options to choose from, each mapped to an optional
		 * description. At least two choices are required.
		 * <p>
		 * API name: {@code choices}
		 * <p>
		 * Adds an entry to <code>choices</code>.
		 */
		public final Builder choices(String key, String value) {
			this.choices = _mapPut(this.choices, key, value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ChoiceDecisionQuestion}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ChoiceDecisionQuestion build() {
			_checkSingleUse();

			return new ChoiceDecisionQuestion(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ChoiceDecisionQuestion}
	 */
	public static final JsonpDeserializer<ChoiceDecisionQuestion> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ChoiceDecisionQuestion::setupChoiceDecisionQuestionDeserializer);

	protected static void setupChoiceDecisionQuestionDeserializer(
			ObjectDeserializer<ChoiceDecisionQuestion.Builder> op) {
		DecisionQuestionBase.setupDecisionQuestionBaseDeserializer(op);
		op.add(Builder::choices, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"choices");

		op.ignore("type");
	}

}
