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

import co.elastic.clients.util.ObjectBuilder;
import java.util.function.Function;

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

/**
 * Builders for {@link DecisionAnswer} variants.
 */
public class DecisionAnswerBuilders {
	private DecisionAnswerBuilders() {
	}

	/**
	 * Creates a builder for the {@link ChoiceDecisionAnswer choice}
	 * {@code DecisionAnswer} variant.
	 */
	public static ChoiceDecisionAnswer.Builder choice() {
		return new ChoiceDecisionAnswer.Builder();
	}

	/**
	 * Creates a DecisionAnswer of the {@link ChoiceDecisionAnswer choice}
	 * {@code DecisionAnswer} variant.
	 */
	public static DecisionAnswer choice(
			Function<ChoiceDecisionAnswer.Builder, ObjectBuilder<ChoiceDecisionAnswer>> fn) {
		DecisionAnswer.Builder builder = new DecisionAnswer.Builder();
		builder.choice(fn.apply(new ChoiceDecisionAnswer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link PredicateDecisionAnswer predicate}
	 * {@code DecisionAnswer} variant.
	 */
	public static PredicateDecisionAnswer.Builder predicate() {
		return new PredicateDecisionAnswer.Builder();
	}

	/**
	 * Creates a DecisionAnswer of the {@link PredicateDecisionAnswer predicate}
	 * {@code DecisionAnswer} variant.
	 */
	public static DecisionAnswer predicate(
			Function<PredicateDecisionAnswer.Builder, ObjectBuilder<PredicateDecisionAnswer>> fn) {
		DecisionAnswer.Builder builder = new DecisionAnswer.Builder();
		builder.predicate(fn.apply(new PredicateDecisionAnswer.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ScoreDecisionAnswer score}
	 * {@code DecisionAnswer} variant.
	 */
	public static ScoreDecisionAnswer.Builder score() {
		return new ScoreDecisionAnswer.Builder();
	}

	/**
	 * Creates a DecisionAnswer of the {@link ScoreDecisionAnswer score}
	 * {@code DecisionAnswer} variant.
	 */
	public static DecisionAnswer score(Function<ScoreDecisionAnswer.Builder, ObjectBuilder<ScoreDecisionAnswer>> fn) {
		DecisionAnswer.Builder builder = new DecisionAnswer.Builder();
		builder.score(fn.apply(new ScoreDecisionAnswer.Builder()).build());
		return builder.build();
	}

}
