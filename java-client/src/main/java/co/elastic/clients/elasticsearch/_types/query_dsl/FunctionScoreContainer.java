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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.FunctionScoreContainer
public final class FunctionScoreContainer implements ToJsonp {
	@Nullable
	private final JsonValue exp;

	@Nullable
	private final JsonValue gauss;

	@Nullable
	private final JsonValue linear;

	@Nullable
	private final FieldValueFactorScoreFunction fieldValueFactor;

	@Nullable
	private final RandomScoreFunction randomScore;

	@Nullable
	private final ScriptScoreFunction scriptScore;

	@Nullable
	private final QueryContainer filter;

	@Nullable
	private final Number weight;

	// ---------------------------------------------------------------------------------------------

	protected FunctionScoreContainer(Builder builder) {

		this.exp = builder.exp;
		this.gauss = builder.gauss;
		this.linear = builder.linear;
		this.fieldValueFactor = builder.fieldValueFactor;
		this.randomScore = builder.randomScore;
		this.scriptScore = builder.scriptScore;
		this.filter = builder.filter;
		this.weight = builder.weight;

	}

	/**
	 * API name: {@code exp}
	 */
	@Nullable
	public JsonValue exp() {
		return this.exp;
	}

	/**
	 * API name: {@code gauss}
	 */
	@Nullable
	public JsonValue gauss() {
		return this.gauss;
	}

	/**
	 * API name: {@code linear}
	 */
	@Nullable
	public JsonValue linear() {
		return this.linear;
	}

	/**
	 * API name: {@code field_value_factor}
	 */
	@Nullable
	public FieldValueFactorScoreFunction fieldValueFactor() {
		return this.fieldValueFactor;
	}

	/**
	 * API name: {@code random_score}
	 */
	@Nullable
	public RandomScoreFunction randomScore() {
		return this.randomScore;
	}

	/**
	 * API name: {@code script_score}
	 */
	@Nullable
	public ScriptScoreFunction scriptScore() {
		return this.scriptScore;
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
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.exp != null) {

			generator.writeKey("exp");
			generator.write(this.exp);

		}
		if (this.gauss != null) {

			generator.writeKey("gauss");
			generator.write(this.gauss);

		}
		if (this.linear != null) {

			generator.writeKey("linear");
			generator.write(this.linear);

		}
		if (this.fieldValueFactor != null) {

			generator.writeKey("field_value_factor");
			this.fieldValueFactor.toJsonp(generator, mapper);

		}
		if (this.randomScore != null) {

			generator.writeKey("random_score");
			this.randomScore.toJsonp(generator, mapper);

		}
		if (this.scriptScore != null) {

			generator.writeKey("script_score");
			this.scriptScore.toJsonp(generator, mapper);

		}
		if (this.filter != null) {

			generator.writeKey("filter");
			this.filter.toJsonp(generator, mapper);

		}
		if (this.weight != null) {

			generator.writeKey("weight");
			generator.write(this.weight.doubleValue());

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FunctionScoreContainer}.
	 */
	public static class Builder implements ObjectBuilder<FunctionScoreContainer> {
		@Nullable
		private JsonValue exp;

		@Nullable
		private JsonValue gauss;

		@Nullable
		private JsonValue linear;

		@Nullable
		private FieldValueFactorScoreFunction fieldValueFactor;

		@Nullable
		private RandomScoreFunction randomScore;

		@Nullable
		private ScriptScoreFunction scriptScore;

		@Nullable
		private QueryContainer filter;

		@Nullable
		private Number weight;

		/**
		 * API name: {@code exp}
		 */
		public Builder exp(@Nullable JsonValue value) {
			this.exp = value;
			return this;
		}

		/**
		 * API name: {@code gauss}
		 */
		public Builder gauss(@Nullable JsonValue value) {
			this.gauss = value;
			return this;
		}

		/**
		 * API name: {@code linear}
		 */
		public Builder linear(@Nullable JsonValue value) {
			this.linear = value;
			return this;
		}

		/**
		 * API name: {@code field_value_factor}
		 */
		public Builder fieldValueFactor(@Nullable FieldValueFactorScoreFunction value) {
			this.fieldValueFactor = value;
			return this;
		}

		/**
		 * API name: {@code field_value_factor}
		 */
		public Builder fieldValueFactor(
				Function<FieldValueFactorScoreFunction.Builder, ObjectBuilder<FieldValueFactorScoreFunction>> fn) {
			return this.fieldValueFactor(fn.apply(new FieldValueFactorScoreFunction.Builder()).build());
		}

		/**
		 * API name: {@code random_score}
		 */
		public Builder randomScore(@Nullable RandomScoreFunction value) {
			this.randomScore = value;
			return this;
		}

		/**
		 * API name: {@code random_score}
		 */
		public Builder randomScore(Function<RandomScoreFunction.Builder, ObjectBuilder<RandomScoreFunction>> fn) {
			return this.randomScore(fn.apply(new RandomScoreFunction.Builder()).build());
		}

		/**
		 * API name: {@code script_score}
		 */
		public Builder scriptScore(@Nullable ScriptScoreFunction value) {
			this.scriptScore = value;
			return this;
		}

		/**
		 * API name: {@code script_score}
		 */
		public Builder scriptScore(Function<ScriptScoreFunction.Builder, ObjectBuilder<ScriptScoreFunction>> fn) {
			return this.scriptScore(fn.apply(new ScriptScoreFunction.Builder()).build());
		}

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

		/**
		 * Builds a {@link FunctionScoreContainer}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FunctionScoreContainer build() {

			return new FunctionScoreContainer(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for FunctionScoreContainer
	 */
	public static final JsonpDeserializer<FunctionScoreContainer> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, FunctionScoreContainer::setupFunctionScoreContainerDeserializer);

	protected static void setupFunctionScoreContainerDeserializer(
			DelegatingDeserializer<FunctionScoreContainer.Builder> op) {

		op.add(Builder::exp, JsonpDeserializer.jsonValueDeserializer(), "exp");
		op.add(Builder::gauss, JsonpDeserializer.jsonValueDeserializer(), "gauss");
		op.add(Builder::linear, JsonpDeserializer.jsonValueDeserializer(), "linear");
		op.add(Builder::fieldValueFactor, FieldValueFactorScoreFunction.DESERIALIZER, "field_value_factor");
		op.add(Builder::randomScore, RandomScoreFunction.DESERIALIZER, "random_score");
		op.add(Builder::scriptScore, ScriptScoreFunction.DESERIALIZER, "script_score");
		op.add(Builder::filter, QueryContainer.DESERIALIZER, "filter");
		op.add(Builder::weight, JsonpDeserializer.numberDeserializer(), "weight");

	}

}
