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

import co.elastic.clients.json.BuildFunctionDeserializer;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.TaggedUnion;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.Object;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.FunctionScoreContainer
public class FunctionScore extends TaggedUnion<Object> implements JsonpSerializable {

	public static final String EXP = "exp";
	public static final String GAUSS = "gauss";
	public static final String LINEAR = "linear";
	public static final String FIELD_VALUE_FACTOR = "field_value_factor";
	public static final String RANDOM_SCORE = "random_score";
	public static final String SCRIPT_SCORE = "script_score";

	@Nullable
	private final Query filter;

	@Nullable
	private final Number weight;

	private FunctionScore(Builder builder) {
		super(builder.$tag, builder.$variant);
		this.filter = builder.filter;
		this.weight = builder.weight;

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
	public Number weight() {
		return this.weight;
	}

	/**
	 * Get the {@code exp} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code exp} kind.
	 */
	public JsonValue exp() {
		return _get(EXP);
	}

	/**
	 * Get the {@code gauss} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code gauss} kind.
	 */
	public JsonValue gauss() {
		return _get(GAUSS);
	}

	/**
	 * Get the {@code linear} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code linear} kind.
	 */
	public JsonValue linear() {
		return _get(LINEAR);
	}

	/**
	 * Get the {@code field_value_factor} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code field_value_factor}
	 *             kind.
	 */
	public FieldValueFactorScoreFunction fieldValueFactor() {
		return _get(FIELD_VALUE_FACTOR);
	}

	/**
	 * Get the {@code random_score} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code random_score} kind.
	 */
	public RandomScoreFunction randomScore() {
		return _get(RANDOM_SCORE);
	}

	/**
	 * Get the {@code script_score} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code script_score} kind.
	 */
	public ScriptScoreFunction scriptScore() {
		return _get(SCRIPT_SCORE);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		generator.writeKey(_type);
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_type) {
				case EXP :
					generator.write(this.<JsonValue>_get(EXP));

					break;
				case GAUSS :
					generator.write(this.<JsonValue>_get(GAUSS));

					break;
				case LINEAR :
					generator.write(this.<JsonValue>_get(LINEAR));

					break;
			}
		}

		if (this.filter != null) {

			generator.writeKey("filter");
			this.filter.serialize(generator, mapper);

		}
		if (this.weight != null) {

			generator.writeKey("weight");
			generator.write(this.weight.doubleValue());

		}

		generator.writeEnd();
	}
	public static class Builder {
		private String $tag;
		private Object $variant;

		@Nullable
		private Query filter;

		@Nullable
		private Number weight;

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
		public Builder weight(@Nullable Number value) {
			this.weight = value;
			return this;
		}

		public ContainerBuilder exp(JsonValue v) {
			this.$variant = v;
			this.$tag = EXP;
			return new ContainerBuilder();
		}

		public ContainerBuilder gauss(JsonValue v) {
			this.$variant = v;
			this.$tag = GAUSS;
			return new ContainerBuilder();
		}

		public ContainerBuilder linear(JsonValue v) {
			this.$variant = v;
			this.$tag = LINEAR;
			return new ContainerBuilder();
		}

		public ContainerBuilder fieldValueFactor(FieldValueFactorScoreFunction v) {
			this.$variant = v;
			this.$tag = FIELD_VALUE_FACTOR;
			return new ContainerBuilder();
		}

		public ContainerBuilder fieldValueFactor(
				Function<FieldValueFactorScoreFunction.Builder, ObjectBuilder<FieldValueFactorScoreFunction>> f) {
			return this.fieldValueFactor(f.apply(new FieldValueFactorScoreFunction.Builder()).build());
		}

		public ContainerBuilder randomScore(RandomScoreFunction v) {
			this.$variant = v;
			this.$tag = RANDOM_SCORE;
			return new ContainerBuilder();
		}

		public ContainerBuilder randomScore(
				Function<RandomScoreFunction.Builder, ObjectBuilder<RandomScoreFunction>> f) {
			return this.randomScore(f.apply(new RandomScoreFunction.Builder()).build());
		}

		public ContainerBuilder scriptScore(ScriptScoreFunction v) {
			this.$variant = v;
			this.$tag = SCRIPT_SCORE;
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
			public ContainerBuilder weight(@Nullable Number value) {
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
		op.add(Builder::fieldValueFactor, FieldValueFactorScoreFunction.DESERIALIZER, "field_value_factor");
		op.add(Builder::randomScore, RandomScoreFunction.DESERIALIZER, "random_score");
		op.add(Builder::scriptScore, ScriptScoreFunction.DESERIALIZER, "script_score");
		op.add(Builder::filter, Query.DESERIALIZER, "filter");
		op.add(Builder::weight, JsonpDeserializer.numberDeserializer(), "weight");

	}

	// Variants can be recursive data structures. Building the union's deserializer
	// lazily avoids cyclic dependencies between static class initialization code,
	// which can lead to unwanted things like NPEs or stack overflows

	public static final JsonpDeserializer<FunctionScore> DESERIALIZER = JsonpDeserializer.lazy(Builder::new,
			FunctionScore::setupFunctionScoreDeserializer, Builder::build);
}
