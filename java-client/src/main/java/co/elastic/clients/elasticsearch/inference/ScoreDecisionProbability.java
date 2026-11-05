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
import java.lang.Integer;
import java.lang.String;
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

// typedef: inference._types.ScoreDecisionProbability

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.ScoreDecisionProbability">API
 *      specification</a>
 */
@JsonpDeserializable
public class ScoreDecisionProbability implements JsonpSerializable {
	private final int value;

	private final String label;

	private final double probability;

	// ---------------------------------------------------------------------------------------------

	private ScoreDecisionProbability(Builder builder) {

		this.value = ApiTypeHelper.requireNonNull(builder.value, this, "value", 0);
		this.label = ApiTypeHelper.requireNonNull(builder.label, this, "label");
		this.probability = ApiTypeHelper.requireNonNull(builder.probability, this, "probability", 0);

	}

	public static ScoreDecisionProbability of(Function<Builder, ObjectBuilder<ScoreDecisionProbability>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The zero-based position of the level, which is also its position
	 * in the array.
	 * <p>
	 * API name: {@code value}
	 */
	public final int value() {
		return this.value;
	}

	/**
	 * Required - The label of the level.
	 * <p>
	 * API name: {@code label}
	 */
	public final String label() {
		return this.label;
	}

	/**
	 * Required - The probability of the level.
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

		generator.writeKey("value");
		generator.write(this.value);

		generator.writeKey("label");
		generator.write(this.label);

		generator.writeKey("probability");
		generator.write(this.probability);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ScoreDecisionProbability}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ScoreDecisionProbability> {
		private Integer value;

		private String label;

		private Double probability;

		public Builder() {
		}
		private Builder(ScoreDecisionProbability instance) {
			this.value = instance.value;
			this.label = instance.label;
			this.probability = instance.probability;

		}
		/**
		 * Required - The zero-based position of the level, which is also its position
		 * in the array.
		 * <p>
		 * API name: {@code value}
		 */
		public final Builder value(int value) {
			this.value = value;
			return this;
		}

		/**
		 * Required - The label of the level.
		 * <p>
		 * API name: {@code label}
		 */
		public final Builder label(String value) {
			this.label = value;
			return this;
		}

		/**
		 * Required - The probability of the level.
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
		 * Builds a {@link ScoreDecisionProbability}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ScoreDecisionProbability build() {
			_checkSingleUse();

			return new ScoreDecisionProbability(this);
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
	 * Json deserializer for {@link ScoreDecisionProbability}
	 */
	public static final JsonpDeserializer<ScoreDecisionProbability> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ScoreDecisionProbability::setupScoreDecisionProbabilityDeserializer);

	protected static void setupScoreDecisionProbabilityDeserializer(
			ObjectDeserializer<ScoreDecisionProbability.Builder> op) {

		op.add(Builder::value, JsonpDeserializer.integerDeserializer(), "value");
		op.add(Builder::label, JsonpDeserializer.stringDeserializer(), "label");
		op.add(Builder::probability, JsonpDeserializer.doubleDeserializer(), "probability");

	}

}
