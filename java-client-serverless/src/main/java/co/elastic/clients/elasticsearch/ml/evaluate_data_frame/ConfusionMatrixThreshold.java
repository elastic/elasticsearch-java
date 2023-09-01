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
import java.lang.Integer;
import java.util.Objects;
import java.util.function.Function;

// typedef: ml.evaluate_data_frame.ConfusionMatrixThreshold

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#ml.evaluate_data_frame.ConfusionMatrixThreshold">API
 *      specification</a>
 */
@JsonpDeserializable
public class ConfusionMatrixThreshold implements JsonpSerializable {
	private final int truePositive;

	private final int falsePositive;

	private final int trueNegative;

	private final int falseNegative;

	// ---------------------------------------------------------------------------------------------

	private ConfusionMatrixThreshold(Builder builder) {

		this.truePositive = ApiTypeHelper.requireNonNull(builder.truePositive, this, "truePositive");
		this.falsePositive = ApiTypeHelper.requireNonNull(builder.falsePositive, this, "falsePositive");
		this.trueNegative = ApiTypeHelper.requireNonNull(builder.trueNegative, this, "trueNegative");
		this.falseNegative = ApiTypeHelper.requireNonNull(builder.falseNegative, this, "falseNegative");

	}

	public static ConfusionMatrixThreshold of(Function<Builder, ObjectBuilder<ConfusionMatrixThreshold>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - True Positive
	 * <p>
	 * API name: {@code tp}
	 */
	public final int truePositive() {
		return this.truePositive;
	}

	/**
	 * Required - False Positive
	 * <p>
	 * API name: {@code fp}
	 */
	public final int falsePositive() {
		return this.falsePositive;
	}

	/**
	 * Required - True Negative
	 * <p>
	 * API name: {@code tn}
	 */
	public final int trueNegative() {
		return this.trueNegative;
	}

	/**
	 * Required - False Negative
	 * <p>
	 * API name: {@code fn}
	 */
	public final int falseNegative() {
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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ConfusionMatrixThreshold}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ConfusionMatrixThreshold> {
		private Integer truePositive;

		private Integer falsePositive;

		private Integer trueNegative;

		private Integer falseNegative;

		/**
		 * Required - True Positive
		 * <p>
		 * API name: {@code tp}
		 */
		public final Builder truePositive(int value) {
			this.truePositive = value;
			return this;
		}

		/**
		 * Required - False Positive
		 * <p>
		 * API name: {@code fp}
		 */
		public final Builder falsePositive(int value) {
			this.falsePositive = value;
			return this;
		}

		/**
		 * Required - True Negative
		 * <p>
		 * API name: {@code tn}
		 */
		public final Builder trueNegative(int value) {
			this.trueNegative = value;
			return this;
		}

		/**
		 * Required - False Negative
		 * <p>
		 * API name: {@code fn}
		 */
		public final Builder falseNegative(int value) {
			this.falseNegative = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ConfusionMatrixThreshold}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ConfusionMatrixThreshold build() {
			_checkSingleUse();

			return new ConfusionMatrixThreshold(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ConfusionMatrixThreshold}
	 */
	public static final JsonpDeserializer<ConfusionMatrixThreshold> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ConfusionMatrixThreshold::setupConfusionMatrixThresholdDeserializer);

	protected static void setupConfusionMatrixThresholdDeserializer(
			ObjectDeserializer<ConfusionMatrixThreshold.Builder> op) {

		op.add(Builder::truePositive, JsonpDeserializer.integerDeserializer(), "tp");
		op.add(Builder::falsePositive, JsonpDeserializer.integerDeserializer(), "fp");
		op.add(Builder::trueNegative, JsonpDeserializer.integerDeserializer(), "tn");
		op.add(Builder::falseNegative, JsonpDeserializer.integerDeserializer(), "fn");

	}

}
