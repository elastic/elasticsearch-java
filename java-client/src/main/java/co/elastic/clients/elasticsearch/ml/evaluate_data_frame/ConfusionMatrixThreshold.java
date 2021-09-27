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

package co.elastic.clients.elasticsearch.ml.evaluate_data_frame;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml.evaluate_data_frame.ConfusionMatrixThreshold
@JsonpDeserializable
public final class ConfusionMatrixThreshold implements JsonpSerializable {
	private final Integer truePositive;

	private final Integer falsePositive;

	private final Integer trueNegative;

	private final Integer falseNegative;

	// ---------------------------------------------------------------------------------------------

	public ConfusionMatrixThreshold(Builder builder) {

		this.truePositive = Objects.requireNonNull(builder.truePositive, "tp");
		this.falsePositive = Objects.requireNonNull(builder.falsePositive, "fp");
		this.trueNegative = Objects.requireNonNull(builder.trueNegative, "tn");
		this.falseNegative = Objects.requireNonNull(builder.falseNegative, "fn");

	}

	/**
	 * True Positive
	 * <p>
	 * API name: {@code tp}
	 */
	public Integer truePositive() {
		return this.truePositive;
	}

	/**
	 * False Positive
	 * <p>
	 * API name: {@code fp}
	 */
	public Integer falsePositive() {
		return this.falsePositive;
	}

	/**
	 * True Negative
	 * <p>
	 * API name: {@code tn}
	 */
	public Integer trueNegative() {
		return this.trueNegative;
	}

	/**
	 * False Negative
	 * <p>
	 * API name: {@code fn}
	 */
	public Integer falseNegative() {
		return this.falseNegative;
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

		generator.writeKey("tp");
		generator.write(this.truePositive);

		generator.writeKey("fp");
		generator.write(this.falsePositive);

		generator.writeKey("tn");
		generator.write(this.trueNegative);

		generator.writeKey("fn");
		generator.write(this.falseNegative);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ConfusionMatrixThreshold}.
	 */
	public static class Builder implements ObjectBuilder<ConfusionMatrixThreshold> {
		private Integer truePositive;

		private Integer falsePositive;

		private Integer trueNegative;

		private Integer falseNegative;

		/**
		 * True Positive
		 * <p>
		 * API name: {@code tp}
		 */
		public Builder truePositive(Integer value) {
			this.truePositive = value;
			return this;
		}

		/**
		 * False Positive
		 * <p>
		 * API name: {@code fp}
		 */
		public Builder falsePositive(Integer value) {
			this.falsePositive = value;
			return this;
		}

		/**
		 * True Negative
		 * <p>
		 * API name: {@code tn}
		 */
		public Builder trueNegative(Integer value) {
			this.trueNegative = value;
			return this;
		}

		/**
		 * False Negative
		 * <p>
		 * API name: {@code fn}
		 */
		public Builder falseNegative(Integer value) {
			this.falseNegative = value;
			return this;
		}

		/**
		 * Builds a {@link ConfusionMatrixThreshold}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ConfusionMatrixThreshold build() {

			return new ConfusionMatrixThreshold(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ConfusionMatrixThreshold}
	 */
	public static final JsonpDeserializer<ConfusionMatrixThreshold> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ConfusionMatrixThreshold::setupConfusionMatrixThresholdDeserializer, Builder::build);

	protected static void setupConfusionMatrixThresholdDeserializer(
			DelegatingDeserializer<ConfusionMatrixThreshold.Builder> op) {

		op.add(Builder::truePositive, JsonpDeserializer.integerDeserializer(), "tp");
		op.add(Builder::falsePositive, JsonpDeserializer.integerDeserializer(), "fp");
		op.add(Builder::trueNegative, JsonpDeserializer.integerDeserializer(), "tn");
		op.add(Builder::falseNegative, JsonpDeserializer.integerDeserializer(), "fn");

	}

}
