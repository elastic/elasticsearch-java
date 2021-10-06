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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.lang.Object;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.FunctionScoreContainer
@JsonpDeserializable
public class FunctionScore implements TaggedUnion<Object>, JsonpSerializable {

	public static final String EXP = "exp";
	public static final String GAUSS = "gauss";
	public static final String LINEAR = "linear";
	public static final String FIELD_VALUE_FACTOR = "field_value_factor";
	public static final String RANDOM_SCORE = "random_score";
	public static final String SCRIPT_SCORE = "script_score";

	// Tagged union implementation

	private final String _type;
	private final Object _value;

	@Override
	public String _type() {
		return _type;
	}

	@Override
	public Object _get() {
		return _value;
	}

	@Nullable
	private final Query filter;

	@Nullable
	private final Double weight;

	public FunctionScore(FunctionScoreVariant value) {

		this._type = Objects.requireNonNull(value._variantType(), "variant type");
		this._value = Objects.requireNonNull(value, "variant value");

		this.filter = null;
		this.weight = null;

	}

	public <T extends FunctionScoreVariant> FunctionScore(ObjectBuilder<T> builder) {
		this(builder.build());
	}

	private FunctionScore(Builder builder) {

		this._type = Objects.requireNonNull(builder._type, "variant type");
		this._value = Objects.requireNonNull(builder._value, "variant value");

		this.filter = builder.filter;
		this.weight = builder.weight;

	}

	public FunctionScore(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code filter}
	 */
	@Nullable
	public Query filter() {
		return this.filter;
	}

	/**
	 * API name: {@code weight}
	 */
	@Nullable
	public Double weight() {
		return this.weight;
	}

	/**
	 * Get the {@code exp} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code exp} kind.
	 */
	public JsonValue /* _types.query_dsl.DecayFunction */ exp() {
		return TaggedUnionUtils.get(this, EXP);
	}

	/**
	 * Get the {@code gauss} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code gauss} kind.
	 */
	public JsonValue /* _types.query_dsl.DecayFunction */ gauss() {
		return TaggedUnionUtils.get(this, GAUSS);
	}

	/**
	 * Get the {@code linear} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code linear} kind.
	 */
	public JsonValue /* _types.query_dsl.DecayFunction */ linear() {
		return TaggedUnionUtils.get(this, LINEAR);
	}

	/**
	 * Get the {@code field_value_factor} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code field_value_factor}
	 *             kind.
	 */
	public FieldValueFactorScoreFunction fieldValueFactor() {
		return TaggedUnionUtils.get(this, FIELD_VALUE_FACTOR);
	}

	/**
	 * Get the {@code random_score} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code random_score} kind.
	 */
	public RandomScoreFunction randomScore() {
		return TaggedUnionUtils.get(this, RANDOM_SCORE);
	}

	/**
	 * Get the {@code script_score} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code script_score} kind.
	 */
	public ScriptScoreFunction scriptScore() {
		return TaggedUnionUtils.get(this, SCRIPT_SCORE);
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

		generator.writeKey(_type);
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_type) {
				case EXP :
					generator.write(((JsonValue /* _types.query_dsl.DecayFunction */) this._value));

					break;
				case GAUSS :
					generator.write(((JsonValue /* _types.query_dsl.DecayFunction */) this._value));

					break;
				case LINEAR :
					generator.write(((JsonValue /* _types.query_dsl.DecayFunction */) this._value));

					break;
			}
		}

		generator.writeEnd();
	}

	public static class Builder {
		private String _type;
		private Object _value;

		@Nullable
		private Query filter;

		@Nullable
		private Double weight;

		/**
		 * API name: {@code filter}
		 */
		public Builder filter(@Nullable Query value) {
			this.filter = value;
			return this;
		}

		/**
		 * API name: {@code filter}
		 */
		public Builder filter(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.filter(fn.apply(new Query.Builder()).build());
		}

		/**
		 * API name: {@code weight}
		 */
		public Builder weight(@Nullable Double value) {
			this.weight = value;
			return this;
		}

		public ContainerBuilder exp(JsonValue /* _types.query_dsl.DecayFunction */ v) {
			this._type = EXP;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder gauss(JsonValue /* _types.query_dsl.DecayFunction */ v) {
			this._type = GAUSS;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder linear(JsonValue /* _types.query_dsl.DecayFunction */ v) {
			this._type = LINEAR;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder fieldValueFactor(FieldValueFactorScoreFunction v) {
			this._type = FIELD_VALUE_FACTOR;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder fieldValueFactor(
				Function<FieldValueFactorScoreFunction.Builder, ObjectBuilder<FieldValueFactorScoreFunction>> f) {
			return this.fieldValueFactor(f.apply(new FieldValueFactorScoreFunction.Builder()).build());
		}

		public ContainerBuilder randomScore(RandomScoreFunction v) {
			this._type = RANDOM_SCORE;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder randomScore(
				Function<RandomScoreFunction.Builder, ObjectBuilder<RandomScoreFunction>> f) {
			return this.randomScore(f.apply(new RandomScoreFunction.Builder()).build());
		}

		public ContainerBuilder scriptScore(ScriptScoreFunction v) {
			this._type = SCRIPT_SCORE;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder scriptScore(
				Function<ScriptScoreFunction.Builder, ObjectBuilder<ScriptScoreFunction>> f) {
			return this.scriptScore(f.apply(new ScriptScoreFunction.Builder()).build());
		}

		protected FunctionScore build() {
			return new FunctionScore(this);
		}

		public class ContainerBuilder implements ObjectBuilder<FunctionScore> {

			/**
			 * API name: {@code filter}
			 */
			public ContainerBuilder filter(@Nullable Query value) {
				Builder.this.filter = value;
				return this;
			}

			/**
			 * API name: {@code filter}
			 */
			public ContainerBuilder filter(Function<Query.Builder, ObjectBuilder<Query>> fn) {
				return this.filter(fn.apply(new Query.Builder()).build());
			}

			/**
			 * API name: {@code weight}
			 */
			public ContainerBuilder weight(@Nullable Double value) {
				Builder.this.weight = value;
				return this;
			}

			public FunctionScore build() {
				return Builder.this.build();
			}
		}
	}

	protected static void setupFunctionScoreDeserializer(DelegatingDeserializer<Builder> op) {

		op.add(Builder::exp, JsonpDeserializer.jsonValueDeserializer(), "exp");
		op.add(Builder::gauss, JsonpDeserializer.jsonValueDeserializer(), "gauss");
		op.add(Builder::linear, JsonpDeserializer.jsonValueDeserializer(), "linear");
		op.add(Builder::fieldValueFactor, FieldValueFactorScoreFunction._DESERIALIZER, "field_value_factor");
		op.add(Builder::randomScore, RandomScoreFunction._DESERIALIZER, "random_score");
		op.add(Builder::scriptScore, ScriptScoreFunction._DESERIALIZER, "script_score");
		op.add(Builder::filter, Query._DESERIALIZER, "filter");
		op.add(Builder::weight, JsonpDeserializer.doubleDeserializer(), "weight");

	}

	public static final JsonpDeserializer<FunctionScore> _DESERIALIZER = JsonpDeserializer.lazy(Builder::new,
			FunctionScore::setupFunctionScoreDeserializer, Builder::build);
}
