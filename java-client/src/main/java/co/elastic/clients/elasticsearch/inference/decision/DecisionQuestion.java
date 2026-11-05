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

import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
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

// typedef: inference.decision.DecisionQuestion

/**
 * A question answered by the <code>decision</code> task. The type of the
 * question determines the type of its answer.
 * 
 * @see <a href=
 *      "../../doc-files/api-spec.html#inference.decision.DecisionQuestion">API
 *      specification</a>
 */
@JsonpDeserializable
public class DecisionQuestion
		implements
			TaggedUnion<DecisionQuestion.Kind, DecisionQuestionVariant>,
			JsonpSerializable {

	/**
	 * {@link DecisionQuestion} variant kinds.
	 * 
	 * @see <a href=
	 *      "../../doc-files/api-spec.html#inference.decision.DecisionQuestion">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		Choice("choice"),

		Predicate("predicate"),

		Score("score"),

		;

		private final String jsonValue;

		Kind(String jsonValue) {
			this.jsonValue = jsonValue;
		}

		public String jsonValue() {
			return this.jsonValue;
		}

	}

	private final Kind _kind;
	private final DecisionQuestionVariant _value;

	@Override
	public final Kind _kind() {
		return _kind;
	}

	@Override
	public final DecisionQuestionVariant _get() {
		return _value;
	}

	public DecisionQuestion(DecisionQuestionVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._decisionQuestionKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private DecisionQuestion(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static DecisionQuestion of(Function<Builder, ObjectBuilder<DecisionQuestion>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code choice}?
	 */
	public boolean isChoice() {
		return _kind == Kind.Choice;
	}

	/**
	 * Get the {@code choice} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code choice} kind.
	 */
	public ChoiceDecisionQuestion choice() {
		return TaggedUnionUtils.get(this, Kind.Choice);
	}

	/**
	 * Is this variant instance of kind {@code predicate}?
	 */
	public boolean isPredicate() {
		return _kind == Kind.Predicate;
	}

	/**
	 * Get the {@code predicate} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code predicate} kind.
	 */
	public PredicateDecisionQuestion predicate() {
		return TaggedUnionUtils.get(this, Kind.Predicate);
	}

	/**
	 * Is this variant instance of kind {@code score}?
	 */
	public boolean isScore() {
		return _kind == Kind.Score;
	}

	/**
	 * Get the {@code score} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code score} kind.
	 */
	public ScoreDecisionQuestion score() {
		return TaggedUnionUtils.get(this, Kind.Score);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		mapper.serialize(_value, generator);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<DecisionQuestion> {
		private Kind _kind;
		private DecisionQuestionVariant _value;

		@Override
		protected Builder self() {
			return this;
		}
		public ObjectBuilder<DecisionQuestion> choice(ChoiceDecisionQuestion v) {
			this._kind = Kind.Choice;
			this._value = v;
			return this;
		}

		public ObjectBuilder<DecisionQuestion> choice(
				Function<ChoiceDecisionQuestion.Builder, ObjectBuilder<ChoiceDecisionQuestion>> fn) {
			return this.choice(fn.apply(new ChoiceDecisionQuestion.Builder()).build());
		}

		public ObjectBuilder<DecisionQuestion> predicate(PredicateDecisionQuestion v) {
			this._kind = Kind.Predicate;
			this._value = v;
			return this;
		}

		public ObjectBuilder<DecisionQuestion> predicate(
				Function<PredicateDecisionQuestion.Builder, ObjectBuilder<PredicateDecisionQuestion>> fn) {
			return this.predicate(fn.apply(new PredicateDecisionQuestion.Builder()).build());
		}

		public ObjectBuilder<DecisionQuestion> score(ScoreDecisionQuestion v) {
			this._kind = Kind.Score;
			this._value = v;
			return this;
		}

		public ObjectBuilder<DecisionQuestion> score(
				Function<ScoreDecisionQuestion.Builder, ObjectBuilder<ScoreDecisionQuestion>> fn) {
			return this.score(fn.apply(new ScoreDecisionQuestion.Builder()).build());
		}

		public DecisionQuestion build() {
			_checkSingleUse();
			return new DecisionQuestion(this);
		}

	}

	protected static void setupDecisionQuestionDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::choice, ChoiceDecisionQuestion._DESERIALIZER, "choice");
		op.add(Builder::predicate, PredicateDecisionQuestion._DESERIALIZER, "predicate");
		op.add(Builder::score, ScoreDecisionQuestion._DESERIALIZER, "score");

		op.setTypeProperty("type", null);

	}

	public static final JsonpDeserializer<DecisionQuestion> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			DecisionQuestion::setupDecisionQuestionDeserializer, Builder::build);
}
