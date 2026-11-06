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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.util.Objects;
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

// typedef: inference._types.PredicateDecisionAnswer

/**
 * The answer to a <code>predicate</code> question.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.PredicateDecisionAnswer">API
 *      specification</a>
 */
@JsonpDeserializable
public class PredicateDecisionAnswer implements DecisionAnswerVariant, JsonpSerializable {
	private final double probability;

	// ---------------------------------------------------------------------------------------------

	private PredicateDecisionAnswer(Builder builder) {

		this.probability = ApiTypeHelper.requireNonNull(builder.probability, this, "probability", 0);

	}

	public static PredicateDecisionAnswer of(Function<Builder, ObjectBuilder<PredicateDecisionAnswer>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * DecisionAnswer variant kind.
	 */
	@Override
	public DecisionAnswer.Kind _decisionAnswerKind() {
		return DecisionAnswer.Kind.Predicate;
	}

	/**
	 * Required - The probability that the statement in the question is true.
	 * <p>
	 * API name: {@code probability}
	 */
	public final double probability() {
		return this.probability;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "predicate");

		generator.writeKey("probability");
		generator.write(this.probability);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PredicateDecisionAnswer}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<PredicateDecisionAnswer> {
		private Double probability;

		public Builder() {
		}
		private Builder(PredicateDecisionAnswer instance) {
			this.probability = instance.probability;

		}
		/**
		 * Required - The probability that the statement in the question is true.
		 * <p>
		 * API name: {@code probability}
		 */
		public final Builder probability(double value) {
			this.probability = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PredicateDecisionAnswer}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PredicateDecisionAnswer build() {
			_checkSingleUse();

			return new PredicateDecisionAnswer(this);
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
	 * Json deserializer for {@link PredicateDecisionAnswer}
	 */
	public static final JsonpDeserializer<PredicateDecisionAnswer> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PredicateDecisionAnswer::setupPredicateDecisionAnswerDeserializer);

	protected static void setupPredicateDecisionAnswerDeserializer(
			ObjectDeserializer<PredicateDecisionAnswer.Builder> op) {

		op.add(Builder::probability, JsonpDeserializer.doubleDeserializer(), "probability");

		op.ignore("type");
	}

}
