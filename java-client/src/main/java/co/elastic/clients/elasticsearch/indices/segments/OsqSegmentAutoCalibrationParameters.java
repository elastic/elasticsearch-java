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

package co.elastic.clients.elasticsearch.indices.segments;

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
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Integer;
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

// typedef: indices.segments.OsqSegmentAutoCalibrationParameters

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#indices.segments.OsqSegmentAutoCalibrationParameters">API
 *      specification</a>
 */
@JsonpDeserializable
public class OsqSegmentAutoCalibrationParameters implements JsonpSerializable {
	private final int bits;

	private final int queryBits;

	private final boolean precondition;

	private final float oversample;

	// ---------------------------------------------------------------------------------------------

	private OsqSegmentAutoCalibrationParameters(Builder builder) {

		this.bits = ApiTypeHelper.requireNonNull(builder.bits, this, "bits", 0);
		this.queryBits = ApiTypeHelper.requireNonNull(builder.queryBits, this, "queryBits", 0);
		this.precondition = ApiTypeHelper.requireNonNull(builder.precondition, this, "precondition", false);
		this.oversample = ApiTypeHelper.requireNonNull(builder.oversample, this, "oversample", 0);

	}

	public static OsqSegmentAutoCalibrationParameters of(
			Function<Builder, ObjectBuilder<OsqSegmentAutoCalibrationParameters>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The number of bits used to quantize the vectors.
	 * <p>
	 * API name: {@code bits}
	 */
	public final int bits() {
		return this.bits;
	}

	/**
	 * Required - The number of bits used to quantize the query vectors.
	 * <p>
	 * API name: {@code query_bits}
	 */
	public final int queryBits() {
		return this.queryBits;
	}

	/**
	 * Required - If <code>true</code>, the vectors are preconditioned before
	 * quantization.
	 * <p>
	 * API name: {@code precondition}
	 */
	public final boolean precondition() {
		return this.precondition;
	}

	/**
	 * Required - The oversampling factor applied when rescoring.
	 * <p>
	 * API name: {@code oversample}
	 */
	public final float oversample() {
		return this.oversample;
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

		generator.writeKey("bits");
		generator.write(this.bits);

		generator.writeKey("query_bits");
		generator.write(this.queryBits);

		generator.writeKey("precondition");
		generator.write(this.precondition);

		generator.writeKey("oversample");
		generator.write(this.oversample);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link OsqSegmentAutoCalibrationParameters}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<OsqSegmentAutoCalibrationParameters> {
		private Integer bits;

		private Integer queryBits;

		private Boolean precondition;

		private Float oversample;

		public Builder() {
		}
		private Builder(OsqSegmentAutoCalibrationParameters instance) {
			this.bits = instance.bits;
			this.queryBits = instance.queryBits;
			this.precondition = instance.precondition;
			this.oversample = instance.oversample;

		}
		/**
		 * Required - The number of bits used to quantize the vectors.
		 * <p>
		 * API name: {@code bits}
		 */
		public final Builder bits(int value) {
			this.bits = value;
			return this;
		}

		/**
		 * Required - The number of bits used to quantize the query vectors.
		 * <p>
		 * API name: {@code query_bits}
		 */
		public final Builder queryBits(int value) {
			this.queryBits = value;
			return this;
		}

		/**
		 * Required - If <code>true</code>, the vectors are preconditioned before
		 * quantization.
		 * <p>
		 * API name: {@code precondition}
		 */
		public final Builder precondition(boolean value) {
			this.precondition = value;
			return this;
		}

		/**
		 * Required - The oversampling factor applied when rescoring.
		 * <p>
		 * API name: {@code oversample}
		 */
		public final Builder oversample(float value) {
			this.oversample = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link OsqSegmentAutoCalibrationParameters}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public OsqSegmentAutoCalibrationParameters build() {
			_checkSingleUse();

			return new OsqSegmentAutoCalibrationParameters(this);
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
	 * Json deserializer for {@link OsqSegmentAutoCalibrationParameters}
	 */
	public static final JsonpDeserializer<OsqSegmentAutoCalibrationParameters> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					OsqSegmentAutoCalibrationParameters::setupOsqSegmentAutoCalibrationParametersDeserializer);

	protected static void setupOsqSegmentAutoCalibrationParametersDeserializer(
			ObjectDeserializer<OsqSegmentAutoCalibrationParameters.Builder> op) {

		op.add(Builder::bits, JsonpDeserializer.integerDeserializer(), "bits");
		op.add(Builder::queryBits, JsonpDeserializer.integerDeserializer(), "query_bits");
		op.add(Builder::precondition, JsonpDeserializer.booleanDeserializer(), "precondition");
		op.add(Builder::oversample, JsonpDeserializer.floatDeserializer(), "oversample");

	}

}
