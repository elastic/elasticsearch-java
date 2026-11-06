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

// typedef: inference._types.ScoreDecisionAnswer

/**
 * The answer to a <code>score</code> question.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.ScoreDecisionAnswer">API
 *      specification</a>
 */
@JsonpDeserializable
public class ScoreDecisionAnswer implements DecisionAnswerVariant, JsonpSerializable {
	private final double score;

	private final List<ScoreDecisionProbability> probabilities;

	private final double confidence;

	// ---------------------------------------------------------------------------------------------

	private ScoreDecisionAnswer(Builder builder) {

		this.score = ApiTypeHelper.requireNonNull(builder.score, this, "score", 0);
		this.probabilities = ApiTypeHelper.unmodifiableRequired(builder.probabilities, this, "probabilities");
		this.confidence = ApiTypeHelper.requireNonNull(builder.confidence, this, "confidence", 0);

	}

	public static ScoreDecisionAnswer of(Function<Builder, ObjectBuilder<ScoreDecisionAnswer>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * DecisionAnswer variant kind.
	 */
	@Override
	public DecisionAnswer.Kind _decisionAnswerKind() {
		return DecisionAnswer.Kind.Score;
	}

	/**
	 * Required - The probability-weighted position on the scale, from
	 * <code>0</code> for the lowest level.
	 * <p>
	 * API name: {@code score}
	 */
	public final double score() {
		return this.score;
	}

	/**
	 * Required - The probability of each level, ordered from the lowest to the
	 * highest level.
	 * <p>
	 * API name: {@code probabilities}
	 */
	public final List<ScoreDecisionProbability> probabilities() {
		return this.probabilities;
	}

	/**
	 * Required - The confidence in the score.
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

		generator.write("type", "score");

		generator.writeKey("score");
		generator.write(this.score);

		if (ApiTypeHelper.isDefined(this.probabilities)) {
			generator.writeKey("probabilities");
			generator.writeStartArray();
			for (ScoreDecisionProbability item0 : this.probabilities) {
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
	 * Builder for {@link ScoreDecisionAnswer}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ScoreDecisionAnswer> {
		private Double score;

		private List<ScoreDecisionProbability> probabilities;

		private Double confidence;

		public Builder() {
		}
		private Builder(ScoreDecisionAnswer instance) {
			this.score = instance.score;
			this.probabilities = instance.probabilities;
			this.confidence = instance.confidence;

		}
		/**
		 * Required - The probability-weighted position on the scale, from
		 * <code>0</code> for the lowest level.
		 * <p>
		 * API name: {@code score}
		 */
		public final Builder score(double value) {
			this.score = value;
			return this;
		}

		/**
		 * Required - The probability of each level, ordered from the lowest to the
		 * highest level.
		 * <p>
		 * API name: {@code probabilities}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>probabilities</code>.
		 */
		public final Builder probabilities(List<ScoreDecisionProbability> list) {
			this.probabilities = _listAddAll(this.probabilities, list);
			return this;
		}

		/**
		 * Required - The probability of each level, ordered from the lowest to the
		 * highest level.
		 * <p>
		 * API name: {@code probabilities}
		 * <p>
		 * Adds one or more values to <code>probabilities</code>.
		 */
		public final Builder probabilities(ScoreDecisionProbability value, ScoreDecisionProbability... values) {
			this.probabilities = _listAdd(this.probabilities, value, values);
			return this;
		}

		/**
		 * Required - The probability of each level, ordered from the lowest to the
		 * highest level.
		 * <p>
		 * API name: {@code probabilities}
		 * <p>
		 * Adds a value to <code>probabilities</code> using a builder lambda.
		 */
		public final Builder probabilities(
				Function<ScoreDecisionProbability.Builder, ObjectBuilder<ScoreDecisionProbability>> fn) {
			return probabilities(fn.apply(new ScoreDecisionProbability.Builder()).build());
		}

		/**
		 * Required - The confidence in the score.
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
		 * Builds a {@link ScoreDecisionAnswer}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ScoreDecisionAnswer build() {
			_checkSingleUse();

			return new ScoreDecisionAnswer(this);
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
	 * Json deserializer for {@link ScoreDecisionAnswer}
	 */
	public static final JsonpDeserializer<ScoreDecisionAnswer> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ScoreDecisionAnswer::setupScoreDecisionAnswerDeserializer);

	protected static void setupScoreDecisionAnswerDeserializer(ObjectDeserializer<ScoreDecisionAnswer.Builder> op) {

		op.add(Builder::score, JsonpDeserializer.doubleDeserializer(), "score");
		op.add(Builder::probabilities, JsonpDeserializer.arrayDeserializer(ScoreDecisionProbability._DESERIALIZER),
				"probabilities");
		op.add(Builder::confidence, JsonpDeserializer.doubleDeserializer(), "confidence");

		op.ignore("type");
	}

}
