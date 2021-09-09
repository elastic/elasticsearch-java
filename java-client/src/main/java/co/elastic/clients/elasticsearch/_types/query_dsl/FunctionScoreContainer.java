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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.StringEnum;
import co.elastic.clients.util.TaggedUnion;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.Object;
import java.util.function.Function;
import javax.annotation.Nullable;

public class FunctionScoreContainer extends TaggedUnion<FunctionScoreContainer.Tag, Object> implements ToJsonp {

	public enum Tag implements StringEnum {

		exp("exp"),

		gauss("gauss"),

		linear("linear"),

		fieldValueFactor("field_value_factor"),

		randomScore("random_score"),

		scriptScore("script_score"),

		;

		private final String jsonValue;

		Tag(String jsonValue) {
			this.jsonValue = jsonValue;
		}

		public String jsonValue() {
			return this.jsonValue;
		}

		public static StringEnum.Deserializer<Tag> DESERIALIZER = new StringEnum.Deserializer<>(Tag.values());
	}

	@Nullable
	private final QueryContainer filter;

	@Nullable
	private final Number weight;

	private FunctionScoreContainer(Builder builder) {
		super(builder.$tag, builder.$variant);
		this.filter = builder.filter;
		this.weight = builder.weight;

	}

	/**
	 * API name: {@code filter}
	 */
	@Nullable
	public QueryContainer filter() {
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
	 * Is this {@link FunctionScoreContainer} of a {@code exp} kind?
	 */
	public boolean isExp() {
		return is(Tag.exp);
	}

	/**
	 * Get the {@code exp} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code exp} kind.
	 */
	public JsonValue exp() {
		return get(Tag.exp);
	}

	/**
	 * Is this {@link FunctionScoreContainer} of a {@code gauss} kind?
	 */
	public boolean isGauss() {
		return is(Tag.gauss);
	}

	/**
	 * Get the {@code gauss} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code gauss} kind.
	 */
	public JsonValue gauss() {
		return get(Tag.gauss);
	}

	/**
	 * Is this {@link FunctionScoreContainer} of a {@code linear} kind?
	 */
	public boolean isLinear() {
		return is(Tag.linear);
	}

	/**
	 * Get the {@code linear} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code linear} kind.
	 */
	public JsonValue linear() {
		return get(Tag.linear);
	}

	/**
	 * Is this {@link FunctionScoreContainer} of a {@code field_value_factor} kind?
	 */
	public boolean isFieldValueFactor() {
		return is(Tag.fieldValueFactor);
	}

	/**
	 * Get the {@code field_value_factor} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code field_value_factor}
	 *             kind.
	 */
	public FieldValueFactorScoreFunction fieldValueFactor() {
		return get(Tag.fieldValueFactor);
	}

	/**
	 * Is this {@link FunctionScoreContainer} of a {@code random_score} kind?
	 */
	public boolean isRandomScore() {
		return is(Tag.randomScore);
	}

	/**
	 * Get the {@code random_score} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code random_score} kind.
	 */
	public RandomScoreFunction randomScore() {
		return get(Tag.randomScore);
	}

	/**
	 * Is this {@link FunctionScoreContainer} of a {@code script_score} kind?
	 */
	public boolean isScriptScore() {
		return is(Tag.scriptScore);
	}

	/**
	 * Get the {@code script_score} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code script_score} kind.
	 */
	public ScriptScoreFunction scriptScore() {
		return get(Tag.scriptScore);
	}

	@Override
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		generator.writeKey(tag.jsonValue);
		if (value instanceof ToJsonp) {
			((ToJsonp) value).toJsonp(generator, mapper);
		} else {
			switch (this.tag) {
				case exp :
					generator.write(this.<JsonValue>get(Tag.exp));

					break;
				case gauss :
					generator.write(this.<JsonValue>get(Tag.gauss));

					break;
				case linear :
					generator.write(this.<JsonValue>get(Tag.linear));

					break;
			}
		}

		if (this.filter != null) {

			generator.writeKey("filter");
			this.filter.toJsonp(generator, mapper);

		}
		if (this.weight != null) {

			generator.writeKey("weight");
			generator.write(this.weight.doubleValue());

		}

		generator.writeEnd();
	}
	public static class Builder {
		private Tag $tag;
		private Object $variant;

		@Nullable
		private QueryContainer filter;

		@Nullable
		private Number weight;

		/**
		 * API name: {@code filter}
		 */
		public Builder filter(@Nullable QueryContainer value) {
			this.filter = value;
			return this;
		}

		/**
		 * API name: {@code filter}
		 */
		public Builder filter(Function<QueryContainer.Builder, ObjectBuilder<QueryContainer>> fn) {
			return this.filter(fn.apply(new QueryContainer.Builder()).build());
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
			this.$tag = Tag.exp;
			return new ContainerBuilder();
		}

		public ContainerBuilder gauss(JsonValue v) {
			this.$variant = v;
			this.$tag = Tag.gauss;
			return new ContainerBuilder();
		}

		public ContainerBuilder linear(JsonValue v) {
			this.$variant = v;
			this.$tag = Tag.linear;
			return new ContainerBuilder();
		}

		public ContainerBuilder fieldValueFactor(FieldValueFactorScoreFunction v) {
			this.$variant = v;
			this.$tag = Tag.fieldValueFactor;
			return new ContainerBuilder();
		}

		public ContainerBuilder fieldValueFactor(
				Function<FieldValueFactorScoreFunction.Builder, ObjectBuilder<FieldValueFactorScoreFunction>> f) {
			return this.fieldValueFactor(f.apply(new FieldValueFactorScoreFunction.Builder()).build());
		}

		public ContainerBuilder randomScore(RandomScoreFunction v) {
			this.$variant = v;
			this.$tag = Tag.randomScore;
			return new ContainerBuilder();
		}

		public ContainerBuilder randomScore(
				Function<RandomScoreFunction.Builder, ObjectBuilder<RandomScoreFunction>> f) {
			return this.randomScore(f.apply(new RandomScoreFunction.Builder()).build());
		}

		public ContainerBuilder scriptScore(ScriptScoreFunction v) {
			this.$variant = v;
			this.$tag = Tag.scriptScore;
			return new ContainerBuilder();
		}

		public ContainerBuilder scriptScore(
				Function<ScriptScoreFunction.Builder, ObjectBuilder<ScriptScoreFunction>> f) {
			return this.scriptScore(f.apply(new ScriptScoreFunction.Builder()).build());
		}

		protected FunctionScoreContainer build() {
			return new FunctionScoreContainer(this);
		}

		public class ContainerBuilder implements ObjectBuilder<FunctionScoreContainer> {

			/**
			 * API name: {@code filter}
			 */
			public ContainerBuilder filter(@Nullable QueryContainer value) {
				Builder.this.filter = value;
				return this;
			}

			/**
			 * API name: {@code filter}
			 */
			public ContainerBuilder filter(Function<QueryContainer.Builder, ObjectBuilder<QueryContainer>> fn) {
				return this.filter(fn.apply(new QueryContainer.Builder()).build());
			}

			/**
			 * API name: {@code weight}
			 */
			public ContainerBuilder weight(@Nullable Number value) {
				Builder.this.weight = value;
				return this;
			}

			public FunctionScoreContainer build() {
				return Builder.this.build();
			}
		}
	}

	// Variants can be recursive data structures. Building the union's deserializer
	// lazily
	// avoids cyclic dependencies between static class initialization code, which
	// can lead to unwanted things like NPEs or stack overflows

	public static final JsonpDeserializer<FunctionScoreContainer> DESERIALIZER = JsonpDeserializer
			.lazy(FunctionScoreContainer::buildDeserializer);

	private static JsonpDeserializer<FunctionScoreContainer> buildDeserializer() {
		ObjectDeserializer<Builder> op = new ObjectDeserializer<>(Builder::new);

		op.add(Builder::exp, JsonpDeserializer.jsonValueDeserializer(), "exp");
		op.add(Builder::gauss, JsonpDeserializer.jsonValueDeserializer(), "gauss");
		op.add(Builder::linear, JsonpDeserializer.jsonValueDeserializer(), "linear");
		op.add(Builder::fieldValueFactor, FieldValueFactorScoreFunction.DESERIALIZER, "field_value_factor");
		op.add(Builder::randomScore, RandomScoreFunction.DESERIALIZER, "random_score");
		op.add(Builder::scriptScore, ScriptScoreFunction.DESERIALIZER, "script_score");
		op.add(Builder::filter, QueryContainer.DESERIALIZER, "filter");
		op.add(Builder::weight, JsonpDeserializer.numberDeserializer(), "weight");

		return new BuildFunctionDeserializer<>(op, Builder::build);
	}

}
