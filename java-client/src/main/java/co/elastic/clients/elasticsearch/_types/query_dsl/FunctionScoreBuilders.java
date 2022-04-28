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

import co.elastic.clients.util.ObjectBuilder;
import java.util.function.Function;

/**
 * Builders for {@link FunctionScore} variants.
 */
public class FunctionScoreBuilders {
	private FunctionScoreBuilders() {
	}

	/**
	 * Creates a builder for the {@link DecayFunction exp} {@code FunctionScore}
	 * variant.
	 */
	public static DecayFunction.Builder exp() {
		return new DecayFunction.Builder();
	}

	/**
	 * Creates a FunctionScore of the {@link DecayFunction exp}
	 * {@code FunctionScore} variant.
	 */
	public static FunctionScore exp(Function<DecayFunction.Builder, ObjectBuilder<DecayFunction>> fn) {
		FunctionScore.Builder builder = new FunctionScore.Builder();
		builder.exp(fn.apply(new DecayFunction.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link DecayFunction gauss} {@code FunctionScore}
	 * variant.
	 */
	public static DecayFunction.Builder gauss() {
		return new DecayFunction.Builder();
	}

	/**
	 * Creates a FunctionScore of the {@link DecayFunction gauss}
	 * {@code FunctionScore} variant.
	 */
	public static FunctionScore gauss(Function<DecayFunction.Builder, ObjectBuilder<DecayFunction>> fn) {
		FunctionScore.Builder builder = new FunctionScore.Builder();
		builder.gauss(fn.apply(new DecayFunction.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link DecayFunction linear} {@code FunctionScore}
	 * variant.
	 */
	public static DecayFunction.Builder linear() {
		return new DecayFunction.Builder();
	}

	/**
	 * Creates a FunctionScore of the {@link DecayFunction linear}
	 * {@code FunctionScore} variant.
	 */
	public static FunctionScore linear(Function<DecayFunction.Builder, ObjectBuilder<DecayFunction>> fn) {
		FunctionScore.Builder builder = new FunctionScore.Builder();
		builder.linear(fn.apply(new DecayFunction.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link FieldValueFactorScoreFunction
	 * field_value_factor} {@code FunctionScore} variant.
	 */
	public static FieldValueFactorScoreFunction.Builder fieldValueFactor() {
		return new FieldValueFactorScoreFunction.Builder();
	}

	/**
	 * Creates a FunctionScore of the {@link FieldValueFactorScoreFunction
	 * field_value_factor} {@code FunctionScore} variant.
	 */
	public static FunctionScore fieldValueFactor(
			Function<FieldValueFactorScoreFunction.Builder, ObjectBuilder<FieldValueFactorScoreFunction>> fn) {
		FunctionScore.Builder builder = new FunctionScore.Builder();
		builder.fieldValueFactor(fn.apply(new FieldValueFactorScoreFunction.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link RandomScoreFunction random_score}
	 * {@code FunctionScore} variant.
	 */
	public static RandomScoreFunction.Builder randomScore() {
		return new RandomScoreFunction.Builder();
	}

	/**
	 * Creates a FunctionScore of the {@link RandomScoreFunction random_score}
	 * {@code FunctionScore} variant.
	 */
	public static FunctionScore randomScore(
			Function<RandomScoreFunction.Builder, ObjectBuilder<RandomScoreFunction>> fn) {
		FunctionScore.Builder builder = new FunctionScore.Builder();
		builder.randomScore(fn.apply(new RandomScoreFunction.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ScriptScoreFunction script_score}
	 * {@code FunctionScore} variant.
	 */
	public static ScriptScoreFunction.Builder scriptScore() {
		return new ScriptScoreFunction.Builder();
	}

	/**
	 * Creates a FunctionScore of the {@link ScriptScoreFunction script_score}
	 * {@code FunctionScore} variant.
	 */
	public static FunctionScore scriptScore(
			Function<ScriptScoreFunction.Builder, ObjectBuilder<ScriptScoreFunction>> fn) {
		FunctionScore.Builder builder = new FunctionScore.Builder();
		builder.scriptScore(fn.apply(new ScriptScoreFunction.Builder()).build());
		return builder.build();
	}

}
