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

package co.elastic.clients.elasticsearch._types.query_dsl;

import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.lang.Object;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.FunctionScoreContainer
// union type: Container[]
@JsonpDeserializable
public class FunctionScore implements TaggedUnion<FunctionScore.Kind, Object>, JsonpSerializable {

	/**
	 * {@link FunctionScore} variant kinds.
	 */

	public enum Kind implements JsonEnum {
		Exp("exp"),

		Gauss("gauss"),

		Linear("linear"),

		FieldValueFactor("field_value_factor"),

		RandomScore("random_score"),

		ScriptScore("script_score"),

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

	@Nullable
	private final Query filter;

	@Nullable
	private final Double weight;

	public FunctionScore(FunctionScoreVariant value) {

		this._kind = ModelTypeHelper.requireNonNull(value._functionScoreKind(), this, "<variant kind>");
		this._value = ModelTypeHelper.requireNonNull(value, this, "<variant value>");

		this.filter = null;
		this.weight = null;

	}

	private FunctionScore(Builder builder) {

		this._kind = ModelTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

		this.filter = builder.filter;
		this.weight = builder.weight;

	}

	public static FunctionScore of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * API name: {@code filter}
	 */
	@Nullable
	public final Query filter() {
		return this.filter;
	}

	/**
	 * API name: {@code weight}
	 */
	@Nullable
	public final Double weight() {
		return this.weight;
	}

	/**
	 * Is this variant instance of kind {@code exp}?
	 */
	public boolean isExp() {
		return _kind == Kind.Exp;
	}

	/**
	 * Get the {@code exp} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code exp} kind.
	 */
	public DecayFunction exp() {
		return TaggedUnionUtils.get(this, Kind.Exp);
	}

	/**
	 * Is this variant instance of kind {@code gauss}?
	 */
	public boolean isGauss() {
		return _kind == Kind.Gauss;
	}

	/**
	 * Get the {@code gauss} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code gauss} kind.
	 */
	public DecayFunction gauss() {
		return TaggedUnionUtils.get(this, Kind.Gauss);
	}

	/**
	 * Is this variant instance of kind {@code linear}?
	 */
	public boolean isLinear() {
		return _kind == Kind.Linear;
	}

	/**
	 * Get the {@code linear} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code linear} kind.
	 */
	public DecayFunction linear() {
		return TaggedUnionUtils.get(this, Kind.Linear);
	}

	/**
	 * Is this variant instance of kind {@code field_value_factor}?
	 */
	public boolean isFieldValueFactor() {
		return _kind == Kind.FieldValueFactor;
	}

	/**
	 * Get the {@code field_value_factor} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code field_value_factor}
	 *             kind.
	 */
	public FieldValueFactorScoreFunction fieldValueFactor() {
		return TaggedUnionUtils.get(this, Kind.FieldValueFactor);
	}

	/**
	 * Is this variant instance of kind {@code random_score}?
	 */
	public boolean isRandomScore() {
		return _kind == Kind.RandomScore;
	}

	/**
	 * Get the {@code random_score} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code random_score} kind.
	 */
	public RandomScoreFunction randomScore() {
		return TaggedUnionUtils.get(this, Kind.RandomScore);
	}

	/**
	 * Is this variant instance of kind {@code script_score}?
	 */
	public boolean isScriptScore() {
		return _kind == Kind.ScriptScore;
	}

	/**
	 * Get the {@code script_score} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code script_score} kind.
	 */
	public ScriptScoreFunction scriptScore() {
		return TaggedUnionUtils.get(this, Kind.ScriptScore);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeStartObject();

		if (this.filter != null) {
			generator.writeKey("filter");
			this.filter.serialize(generator, mapper);

		}
		if (this.weight != null) {
			generator.writeKey("weight");
			generator.write(this.weight);

		}

		generator.writeKey(_kind.jsonValue());
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		}

		generator.writeEnd();

	}

	public static class Builder extends ObjectBuilderBase {
		private Kind _kind;
		private Object _value;

		@Nullable
		private Query filter;

		@Nullable
		private Double weight;

		/**
		 * API name: {@code filter}
		 */
		public final Builder filter(@Nullable Query value) {
			this.filter = value;
			return this;
		}

		/**
		 * API name: {@code filter}
		 */
		public final Builder filter(Consumer<Query.Builder> fn) {
			Query.Builder builder = new Query.Builder();
			fn.accept(builder);
			return this.filter(builder.build());
		}

		/**
		 * API name: {@code weight}
		 */
		public final Builder weight(@Nullable Double value) {
			this.weight = value;
			return this;
		}

		public ContainerBuilder exp(DecayFunction v) {
			this._kind = Kind.Exp;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder exp(Consumer<DecayFunction.Builder> fn) {
			DecayFunction.Builder builder = new DecayFunction.Builder();
			fn.accept(builder);
			return this.exp(builder.build());
		}

		public ContainerBuilder gauss(DecayFunction v) {
			this._kind = Kind.Gauss;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder gauss(Consumer<DecayFunction.Builder> fn) {
			DecayFunction.Builder builder = new DecayFunction.Builder();
			fn.accept(builder);
			return this.gauss(builder.build());
		}

		public ContainerBuilder linear(DecayFunction v) {
			this._kind = Kind.Linear;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder linear(Consumer<DecayFunction.Builder> fn) {
			DecayFunction.Builder builder = new DecayFunction.Builder();
			fn.accept(builder);
			return this.linear(builder.build());
		}

		public ContainerBuilder fieldValueFactor(FieldValueFactorScoreFunction v) {
			this._kind = Kind.FieldValueFactor;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder fieldValueFactor(Consumer<FieldValueFactorScoreFunction.Builder> fn) {
			FieldValueFactorScoreFunction.Builder builder = new FieldValueFactorScoreFunction.Builder();
			fn.accept(builder);
			return this.fieldValueFactor(builder.build());
		}

		public ContainerBuilder randomScore(RandomScoreFunction v) {
			this._kind = Kind.RandomScore;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder randomScore(Consumer<RandomScoreFunction.Builder> fn) {
			RandomScoreFunction.Builder builder = new RandomScoreFunction.Builder();
			fn.accept(builder);
			return this.randomScore(builder.build());
		}

		public ContainerBuilder scriptScore(ScriptScoreFunction v) {
			this._kind = Kind.ScriptScore;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder scriptScore(Consumer<ScriptScoreFunction.Builder> fn) {
			ScriptScoreFunction.Builder builder = new ScriptScoreFunction.Builder();
			fn.accept(builder);
			return this.scriptScore(builder.build());
		}

		protected FunctionScore build() {
			_checkSingleUse();
			return new FunctionScore(this);
		}

		public class ContainerBuilder implements ObjectBuilder<FunctionScore> {

			/**
			 * API name: {@code filter}
			 */
			public final ContainerBuilder filter(@Nullable Query value) {
				Builder.this.filter = value;
				return this;
			}

			/**
			 * API name: {@code filter}
			 */
			public final ContainerBuilder filter(Consumer<Query.Builder> fn) {
				Query.Builder builder = new Query.Builder();
				fn.accept(builder);
				return this.filter(builder.build());
			}

			/**
			 * API name: {@code weight}
			 */
			public final ContainerBuilder weight(@Nullable Double value) {
				Builder.this.weight = value;
				return this;
			}

			public FunctionScore build() {
				return Builder.this.build();
			}
		}
	}

	protected static void setupFunctionScoreDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::exp, DecayFunction._DESERIALIZER, "exp");
		op.add(Builder::gauss, DecayFunction._DESERIALIZER, "gauss");
		op.add(Builder::linear, DecayFunction._DESERIALIZER, "linear");
		op.add(Builder::fieldValueFactor, FieldValueFactorScoreFunction._DESERIALIZER, "field_value_factor");
		op.add(Builder::randomScore, RandomScoreFunction._DESERIALIZER, "random_score");
		op.add(Builder::scriptScore, ScriptScoreFunction._DESERIALIZER, "script_score");
		op.add(Builder::filter, Query._DESERIALIZER, "filter");
		op.add(Builder::weight, JsonpDeserializer.doubleDeserializer(), "weight");

	}

	public static final JsonpDeserializer<FunctionScore> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			FunctionScore::setupFunctionScoreDeserializer, Builder::build);
}
