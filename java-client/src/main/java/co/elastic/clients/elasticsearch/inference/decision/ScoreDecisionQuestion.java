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

// typedef: inference.decision.ScoreDecisionQuestion

/**
 * A question answered with the probability-weighted position on an ordered
 * scale of levels.
 * 
 * @see <a href=
 *      "../../doc-files/api-spec.html#inference.decision.ScoreDecisionQuestion">API
 *      specification</a>
 */
@JsonpDeserializable
public class ScoreDecisionQuestion extends DecisionQuestionBase implements DecisionQuestionVariant {
	private final List<DecisionScoreLevel> levels;

	// ---------------------------------------------------------------------------------------------

	private ScoreDecisionQuestion(Builder builder) {
		super(builder);

		this.levels = ApiTypeHelper.unmodifiableRequired(builder.levels, this, "levels");

	}

	public static ScoreDecisionQuestion of(Function<Builder, ObjectBuilder<ScoreDecisionQuestion>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * DecisionQuestion variant kind.
	 */
	@Override
	public DecisionQuestion.Kind _decisionQuestionKind() {
		return DecisionQuestion.Kind.Score;
	}

	/**
	 * Required - The levels of the scale, ordered from lowest to highest. At least
	 * two levels are required.
	 * <p>
	 * API name: {@code levels}
	 */
	public final List<DecisionScoreLevel> levels() {
		return this.levels;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "score");
		super.serializeInternal(generator, mapper);
		if (ApiTypeHelper.isDefined(this.levels)) {
			generator.writeKey("levels");
			generator.writeStartArray();
			for (DecisionScoreLevel item0 : this.levels) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ScoreDecisionQuestion}.
	 */

	public static class Builder extends DecisionQuestionBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ScoreDecisionQuestion> {
		private List<DecisionScoreLevel> levels;

		public Builder() {
		}
		private Builder(ScoreDecisionQuestion instance) {
			super(instance);
			this.levels = instance.levels;

		}
		/**
		 * Required - The levels of the scale, ordered from lowest to highest. At least
		 * two levels are required.
		 * <p>
		 * API name: {@code levels}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>levels</code>.
		 */
		public final Builder levels(List<DecisionScoreLevel> list) {
			this.levels = _listAddAll(this.levels, list);
			return this;
		}

		/**
		 * Required - The levels of the scale, ordered from lowest to highest. At least
		 * two levels are required.
		 * <p>
		 * API name: {@code levels}
		 * <p>
		 * Adds one or more values to <code>levels</code>.
		 */
		public final Builder levels(DecisionScoreLevel value, DecisionScoreLevel... values) {
			this.levels = _listAdd(this.levels, value, values);
			return this;
		}

		/**
		 * Required - The levels of the scale, ordered from lowest to highest. At least
		 * two levels are required.
		 * <p>
		 * API name: {@code levels}
		 * <p>
		 * Adds a value to <code>levels</code> using a builder lambda.
		 */
		public final Builder levels(Function<DecisionScoreLevel.Builder, ObjectBuilder<DecisionScoreLevel>> fn) {
			return levels(fn.apply(new DecisionScoreLevel.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ScoreDecisionQuestion}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ScoreDecisionQuestion build() {
			_checkSingleUse();

			return new ScoreDecisionQuestion(this);
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
	 * Json deserializer for {@link ScoreDecisionQuestion}
	 */
	public static final JsonpDeserializer<ScoreDecisionQuestion> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ScoreDecisionQuestion::setupScoreDecisionQuestionDeserializer);

	protected static void setupScoreDecisionQuestionDeserializer(ObjectDeserializer<ScoreDecisionQuestion.Builder> op) {
		DecisionQuestionBase.setupDecisionQuestionBaseDeserializer(op);
		op.add(Builder::levels, JsonpDeserializer.arrayDeserializer(DecisionScoreLevel._DESERIALIZER), "levels");

		op.ignore("type");
	}

}
