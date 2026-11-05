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

import co.elastic.clients.json.JsonData;
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
import co.elastic.clients.util.OpenTaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
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

// typedef: inference._types.DecisionAnswer

/**
 * The answer to a single question of a decision request. The type of the answer
 * matches the type of the question it answers.
 * 
 * @see <a href="../doc-files/api-spec.html#inference._types.DecisionAnswer">API
 *      specification</a>
 */
@JsonpDeserializable
public class DecisionAnswer implements OpenTaggedUnion<DecisionAnswer.Kind, Object>, JsonpSerializable {

	/**
	 * {@link DecisionAnswer} variant kinds.
	 * 
	 * @see <a href="../doc-files/api-spec.html#inference._types.DecisionAnswer">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		Choice("choice"),

		Predicate("predicate"),

		Score("score"),

		/** A custom {@code DecisionAnswer} defined by a plugin */
		_Custom(null)

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
	private final Object _value;

	@Override
	public final Kind _kind() {
		return _kind;
	}

	@Override
	public final Object _get() {
		return _value;
	}

	public DecisionAnswer(DecisionAnswerVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._decisionAnswerKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");
		this._customKind = null;

	}

	private DecisionAnswer(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");
		this._customKind = builder._customKind;

	}

	public static DecisionAnswer of(Function<Builder, ObjectBuilder<DecisionAnswer>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Build a custom plugin-defined {@code DecisionAnswer}, given its kind and some
	 * JSON data
	 */
	public DecisionAnswer(String kind, JsonData value) {
		this._kind = Kind._Custom;
		this._value = value;
		this._customKind = kind;
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
	public ChoiceDecisionAnswer choice() {
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
	public PredicateDecisionAnswer predicate() {
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
	public ScoreDecisionAnswer score() {
		return TaggedUnionUtils.get(this, Kind.Score);
	}

	@Nullable
	private final String _customKind;

	/**
	 * Is this a custom {@code DecisionAnswer} defined by a plugin?
	 */
	public boolean _isCustom() {
		return _kind == Kind._Custom;
	}

	/**
	 * Get the actual kind when {@code _kind()} equals {@link Kind#_Custom}
	 * (plugin-defined variant).
	 */
	@Nullable
	public final String _customKind() {
		return _customKind;
	}

	/**
	 * Get the custom plugin-defined variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not {@link Kind#_Custom}.
	 */
	public JsonData _custom() {
		return TaggedUnionUtils.get(this, Kind._Custom);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		mapper.serialize(_value, generator);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<DecisionAnswer> {
		private Kind _kind;
		private Object _value;
		private String _customKind;

		@Override
		protected Builder self() {
			return this;
		}
		public ObjectBuilder<DecisionAnswer> choice(ChoiceDecisionAnswer v) {
			this._kind = Kind.Choice;
			this._value = v;
			return this;
		}

		public ObjectBuilder<DecisionAnswer> choice(
				Function<ChoiceDecisionAnswer.Builder, ObjectBuilder<ChoiceDecisionAnswer>> fn) {
			return this.choice(fn.apply(new ChoiceDecisionAnswer.Builder()).build());
		}

		public ObjectBuilder<DecisionAnswer> predicate(PredicateDecisionAnswer v) {
			this._kind = Kind.Predicate;
			this._value = v;
			return this;
		}

		public ObjectBuilder<DecisionAnswer> predicate(
				Function<PredicateDecisionAnswer.Builder, ObjectBuilder<PredicateDecisionAnswer>> fn) {
			return this.predicate(fn.apply(new PredicateDecisionAnswer.Builder()).build());
		}

		public ObjectBuilder<DecisionAnswer> score(ScoreDecisionAnswer v) {
			this._kind = Kind.Score;
			this._value = v;
			return this;
		}

		public ObjectBuilder<DecisionAnswer> score(
				Function<ScoreDecisionAnswer.Builder, ObjectBuilder<ScoreDecisionAnswer>> fn) {
			return this.score(fn.apply(new ScoreDecisionAnswer.Builder()).build());
		}

		/**
		 * Define this {@code DecisionAnswer} as a plugin-defined variant.
		 *
		 * @param name
		 *            the plugin-defined identifier
		 * @param data
		 *            the data for this custom {@code DecisionAnswer}. It is converted
		 *            internally to {@link JsonData}.
		 */
		public ObjectBuilder<DecisionAnswer> _custom(String name, Object data) {
			this._kind = Kind._Custom;
			this._customKind = name;
			this._value = JsonData.of(data);
			return this;
		}

		public DecisionAnswer build() {
			_checkSingleUse();
			return new DecisionAnswer(this);
		}

	}

	protected static void setupDecisionAnswerDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::choice, ChoiceDecisionAnswer._DESERIALIZER, "choice");
		op.add(Builder::predicate, PredicateDecisionAnswer._DESERIALIZER, "predicate");
		op.add(Builder::score, ScoreDecisionAnswer._DESERIALIZER, "score");

		op.setUnknownFieldHandler((builder, name, parser, mapper) -> {
			JsonpUtils.ensureCustomVariantsAllowed(parser, mapper);
			builder._custom(name, JsonData._DESERIALIZER.deserialize(parser, mapper));
		});

		op.setTypeProperty("type", null);

	}

	public static final JsonpDeserializer<DecisionAnswer> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			DecisionAnswer::setupDecisionAnswerDeserializer, Builder::build);
}
