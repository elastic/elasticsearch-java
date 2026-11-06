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

package co.elastic.clients.elasticsearch.inference;

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
import java.lang.Double;
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

// typedef: inference._types.ChoiceDecisionAnswer

/**
 * The answer to a <code>choice</code> question.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.ChoiceDecisionAnswer">API
 *      specification</a>
 */
@JsonpDeserializable
public class ChoiceDecisionAnswer implements DecisionAnswerVariant, JsonpSerializable {
	private final String choice;

	private final List<ChoiceDecisionProbability> probabilities;

	private final double confidence;

	// ---------------------------------------------------------------------------------------------

	private ChoiceDecisionAnswer(Builder builder) {

		this.choice = ApiTypeHelper.requireNonNull(builder.choice, this, "choice");
		this.probabilities = ApiTypeHelper.unmodifiableRequired(builder.probabilities, this, "probabilities");
		this.confidence = ApiTypeHelper.requireNonNull(builder.confidence, this, "confidence", 0);

	}

	public static ChoiceDecisionAnswer of(Function<Builder, ObjectBuilder<ChoiceDecisionAnswer>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * DecisionAnswer variant kind.
	 */
	@Override
	public DecisionAnswer.Kind _decisionAnswerKind() {
		return DecisionAnswer.Kind.Choice;
	}

	/**
	 * Required - The chosen option.
	 * <p>
	 * API name: {@code choice}
	 */
	public final String choice() {
		return this.choice;
	}

	/**
	 * Required - The probability of each option.
	 * <p>
	 * API name: {@code probabilities}
	 */
	public final List<ChoiceDecisionProbability> probabilities() {
		return this.probabilities;
	}

	/**
	 * Required - The confidence in the chosen option.
	 * <p>
	 * API name: {@code confidence}
	 */
	public final double confidence() {
		return this.confidence;
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

		generator.write("type", "choice");

		generator.writeKey("choice");
		generator.write(this.choice);

		if (ApiTypeHelper.isDefined(this.probabilities)) {
			generator.writeKey("probabilities");
			generator.writeStartArray();
			for (ChoiceDecisionProbability item0 : this.probabilities) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("confidence");
		generator.write(this.confidence);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ChoiceDecisionAnswer}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ChoiceDecisionAnswer> {
		private String choice;

		private List<ChoiceDecisionProbability> probabilities;

		private Double confidence;

		public Builder() {
		}
		private Builder(ChoiceDecisionAnswer instance) {
			this.choice = instance.choice;
			this.probabilities = instance.probabilities;
			this.confidence = instance.confidence;

		}
		/**
		 * Required - The chosen option.
		 * <p>
		 * API name: {@code choice}
		 */
		public final Builder choice(String value) {
			this.choice = value;
			return this;
		}

		/**
		 * Required - The probability of each option.
		 * <p>
		 * API name: {@code probabilities}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>probabilities</code>.
		 */
		public final Builder probabilities(List<ChoiceDecisionProbability> list) {
			this.probabilities = _listAddAll(this.probabilities, list);
			return this;
		}

		/**
		 * Required - The probability of each option.
		 * <p>
		 * API name: {@code probabilities}
		 * <p>
		 * Adds one or more values to <code>probabilities</code>.
		 */
		public final Builder probabilities(ChoiceDecisionProbability value, ChoiceDecisionProbability... values) {
			this.probabilities = _listAdd(this.probabilities, value, values);
			return this;
		}

		/**
		 * Required - The probability of each option.
		 * <p>
		 * API name: {@code probabilities}
		 * <p>
		 * Adds a value to <code>probabilities</code> using a builder lambda.
		 */
		public final Builder probabilities(
				Function<ChoiceDecisionProbability.Builder, ObjectBuilder<ChoiceDecisionProbability>> fn) {
			return probabilities(fn.apply(new ChoiceDecisionProbability.Builder()).build());
		}

		/**
		 * Required - The confidence in the chosen option.
		 * <p>
		 * API name: {@code confidence}
		 */
		public final Builder confidence(double value) {
			this.confidence = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ChoiceDecisionAnswer}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ChoiceDecisionAnswer build() {
			_checkSingleUse();

			return new ChoiceDecisionAnswer(this);
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
	 * Json deserializer for {@link ChoiceDecisionAnswer}
	 */
	public static final JsonpDeserializer<ChoiceDecisionAnswer> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ChoiceDecisionAnswer::setupChoiceDecisionAnswerDeserializer);

	protected static void setupChoiceDecisionAnswerDeserializer(ObjectDeserializer<ChoiceDecisionAnswer.Builder> op) {

		op.add(Builder::choice, JsonpDeserializer.stringDeserializer(), "choice");
		op.add(Builder::probabilities, JsonpDeserializer.arrayDeserializer(ChoiceDecisionProbability._DESERIALIZER),
				"probabilities");
		op.add(Builder::confidence, JsonpDeserializer.doubleDeserializer(), "confidence");

		op.ignore("type");
	}

}
