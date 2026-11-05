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

// typedef: inference._types.ChoiceDecisionProbability

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.ChoiceDecisionProbability">API
 *      specification</a>
 */
@JsonpDeserializable
public class ChoiceDecisionProbability implements JsonpSerializable {
	private final String value;

	private final double probability;

	// ---------------------------------------------------------------------------------------------

	private ChoiceDecisionProbability(Builder builder) {

		this.value = ApiTypeHelper.requireNonNull(builder.value, this, "value");
		this.probability = ApiTypeHelper.requireNonNull(builder.probability, this, "probability", 0);

	}

	public static ChoiceDecisionProbability of(Function<Builder, ObjectBuilder<ChoiceDecisionProbability>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The option.
	 * <p>
	 * API name: {@code value}
	 */
	public final String value() {
		return this.value;
	}

	/**
	 * Required - The probability of the option.
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

		generator.writeKey("probability");
		generator.write(this.probability);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ChoiceDecisionProbability}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ChoiceDecisionProbability> {
		private String value;

		private Double probability;

		public Builder() {
		}
		private Builder(ChoiceDecisionProbability instance) {
			this.value = instance.value;
			this.probability = instance.probability;

		}
		/**
		 * Required - The option.
		 * <p>
		 * API name: {@code value}
		 */
		public final Builder value(String value) {
			this.value = value;
			return this;
		}

		/**
		 * Required - The probability of the option.
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
		 * Builds a {@link ChoiceDecisionProbability}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ChoiceDecisionProbability build() {
			_checkSingleUse();

			return new ChoiceDecisionProbability(this);
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
	 * Json deserializer for {@link ChoiceDecisionProbability}
	 */
	public static final JsonpDeserializer<ChoiceDecisionProbability> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ChoiceDecisionProbability::setupChoiceDecisionProbabilityDeserializer);

	protected static void setupChoiceDecisionProbabilityDeserializer(
			ObjectDeserializer<ChoiceDecisionProbability.Builder> op) {

		op.add(Builder::value, JsonpDeserializer.stringDeserializer(), "value");
		op.add(Builder::probability, JsonpDeserializer.doubleDeserializer(), "probability");

	}

}
