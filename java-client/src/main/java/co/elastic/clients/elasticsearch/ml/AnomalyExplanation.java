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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.AnomalyExplanation

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml._types.AnomalyExplanation">API
 *      specification</a>
 */
@JsonpDeserializable
public class AnomalyExplanation implements JsonpSerializable {
	@Nullable
	private final Integer anomalyCharacteristicsImpact;

	@Nullable
	private final Integer anomalyLength;

	@Nullable
	private final String anomalyType;

	@Nullable
	private final Boolean highVariancePenalty;

	@Nullable
	private final Boolean incompleteBucketPenalty;

	@Nullable
	private final Double lowerConfidenceBound;

	@Nullable
	private final Integer multiBucketImpact;

	@Nullable
	private final Integer singleBucketImpact;

	@Nullable
	private final Double typicalValue;

	@Nullable
	private final Double upperConfidenceBound;

	// ---------------------------------------------------------------------------------------------

	private AnomalyExplanation(Builder builder) {

		this.anomalyCharacteristicsImpact = builder.anomalyCharacteristicsImpact;
		this.anomalyLength = builder.anomalyLength;
		this.anomalyType = builder.anomalyType;
		this.highVariancePenalty = builder.highVariancePenalty;
		this.incompleteBucketPenalty = builder.incompleteBucketPenalty;
		this.lowerConfidenceBound = builder.lowerConfidenceBound;
		this.multiBucketImpact = builder.multiBucketImpact;
		this.singleBucketImpact = builder.singleBucketImpact;
		this.typicalValue = builder.typicalValue;
		this.upperConfidenceBound = builder.upperConfidenceBound;

	}

	public static AnomalyExplanation of(Function<Builder, ObjectBuilder<AnomalyExplanation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Impact from the duration and magnitude of the detected anomaly relative to
	 * the historical average.
	 * <p>
	 * API name: {@code anomaly_characteristics_impact}
	 */
	@Nullable
	public final Integer anomalyCharacteristicsImpact() {
		return this.anomalyCharacteristicsImpact;
	}

	/**
	 * Length of the detected anomaly in the number of buckets.
	 * <p>
	 * API name: {@code anomaly_length}
	 */
	@Nullable
	public final Integer anomalyLength() {
		return this.anomalyLength;
	}

	/**
	 * Type of the detected anomaly: <code>spike</code> or <code>dip</code>.
	 * <p>
	 * API name: {@code anomaly_type}
	 */
	@Nullable
	public final String anomalyType() {
		return this.anomalyType;
	}

	/**
	 * Indicates reduction of anomaly score for the bucket with large confidence
	 * intervals. If a bucket has large confidence intervals, the score is reduced.
	 * <p>
	 * API name: {@code high_variance_penalty}
	 */
	@Nullable
	public final Boolean highVariancePenalty() {
		return this.highVariancePenalty;
	}

	/**
	 * If the bucket contains fewer samples than expected, the score is reduced.
	 * <p>
	 * API name: {@code incomplete_bucket_penalty}
	 */
	@Nullable
	public final Boolean incompleteBucketPenalty() {
		return this.incompleteBucketPenalty;
	}

	/**
	 * Lower bound of the 95% confidence interval.
	 * <p>
	 * API name: {@code lower_confidence_bound}
	 */
	@Nullable
	public final Double lowerConfidenceBound() {
		return this.lowerConfidenceBound;
	}

	/**
	 * Impact of the deviation between actual and typical values in the past 12
	 * buckets.
	 * <p>
	 * API name: {@code multi_bucket_impact}
	 */
	@Nullable
	public final Integer multiBucketImpact() {
		return this.multiBucketImpact;
	}

	/**
	 * Impact of the deviation between actual and typical values in the current
	 * bucket.
	 * <p>
	 * API name: {@code single_bucket_impact}
	 */
	@Nullable
	public final Integer singleBucketImpact() {
		return this.singleBucketImpact;
	}

	/**
	 * Typical (expected) value for this bucket.
	 * <p>
	 * API name: {@code typical_value}
	 */
	@Nullable
	public final Double typicalValue() {
		return this.typicalValue;
	}

	/**
	 * Upper bound of the 95% confidence interval.
	 * <p>
	 * API name: {@code upper_confidence_bound}
	 */
	@Nullable
	public final Double upperConfidenceBound() {
		return this.upperConfidenceBound;
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

		if (this.anomalyCharacteristicsImpact != null) {
			generator.writeKey("anomaly_characteristics_impact");
			generator.write(this.anomalyCharacteristicsImpact);

		}
		if (this.anomalyLength != null) {
			generator.writeKey("anomaly_length");
			generator.write(this.anomalyLength);

		}
		if (this.anomalyType != null) {
			generator.writeKey("anomaly_type");
			generator.write(this.anomalyType);

		}
		if (this.highVariancePenalty != null) {
			generator.writeKey("high_variance_penalty");
			generator.write(this.highVariancePenalty);

		}
		if (this.incompleteBucketPenalty != null) {
			generator.writeKey("incomplete_bucket_penalty");
			generator.write(this.incompleteBucketPenalty);

		}
		if (this.lowerConfidenceBound != null) {
			generator.writeKey("lower_confidence_bound");
			generator.write(this.lowerConfidenceBound);

		}
		if (this.multiBucketImpact != null) {
			generator.writeKey("multi_bucket_impact");
			generator.write(this.multiBucketImpact);

		}
		if (this.singleBucketImpact != null) {
			generator.writeKey("single_bucket_impact");
			generator.write(this.singleBucketImpact);

		}
		if (this.typicalValue != null) {
			generator.writeKey("typical_value");
			generator.write(this.typicalValue);

		}
		if (this.upperConfidenceBound != null) {
			generator.writeKey("upper_confidence_bound");
			generator.write(this.upperConfidenceBound);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AnomalyExplanation}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<AnomalyExplanation> {
		@Nullable
		private Integer anomalyCharacteristicsImpact;

		@Nullable
		private Integer anomalyLength;

		@Nullable
		private String anomalyType;

		@Nullable
		private Boolean highVariancePenalty;

		@Nullable
		private Boolean incompleteBucketPenalty;

		@Nullable
		private Double lowerConfidenceBound;

		@Nullable
		private Integer multiBucketImpact;

		@Nullable
		private Integer singleBucketImpact;

		@Nullable
		private Double typicalValue;

		@Nullable
		private Double upperConfidenceBound;

		/**
		 * Impact from the duration and magnitude of the detected anomaly relative to
		 * the historical average.
		 * <p>
		 * API name: {@code anomaly_characteristics_impact}
		 */
		public final Builder anomalyCharacteristicsImpact(@Nullable Integer value) {
			this.anomalyCharacteristicsImpact = value;
			return this;
		}

		/**
		 * Length of the detected anomaly in the number of buckets.
		 * <p>
		 * API name: {@code anomaly_length}
		 */
		public final Builder anomalyLength(@Nullable Integer value) {
			this.anomalyLength = value;
			return this;
		}

		/**
		 * Type of the detected anomaly: <code>spike</code> or <code>dip</code>.
		 * <p>
		 * API name: {@code anomaly_type}
		 */
		public final Builder anomalyType(@Nullable String value) {
			this.anomalyType = value;
			return this;
		}

		/**
		 * Indicates reduction of anomaly score for the bucket with large confidence
		 * intervals. If a bucket has large confidence intervals, the score is reduced.
		 * <p>
		 * API name: {@code high_variance_penalty}
		 */
		public final Builder highVariancePenalty(@Nullable Boolean value) {
			this.highVariancePenalty = value;
			return this;
		}

		/**
		 * If the bucket contains fewer samples than expected, the score is reduced.
		 * <p>
		 * API name: {@code incomplete_bucket_penalty}
		 */
		public final Builder incompleteBucketPenalty(@Nullable Boolean value) {
			this.incompleteBucketPenalty = value;
			return this;
		}

		/**
		 * Lower bound of the 95% confidence interval.
		 * <p>
		 * API name: {@code lower_confidence_bound}
		 */
		public final Builder lowerConfidenceBound(@Nullable Double value) {
			this.lowerConfidenceBound = value;
			return this;
		}

		/**
		 * Impact of the deviation between actual and typical values in the past 12
		 * buckets.
		 * <p>
		 * API name: {@code multi_bucket_impact}
		 */
		public final Builder multiBucketImpact(@Nullable Integer value) {
			this.multiBucketImpact = value;
			return this;
		}

		/**
		 * Impact of the deviation between actual and typical values in the current
		 * bucket.
		 * <p>
		 * API name: {@code single_bucket_impact}
		 */
		public final Builder singleBucketImpact(@Nullable Integer value) {
			this.singleBucketImpact = value;
			return this;
		}

		/**
		 * Typical (expected) value for this bucket.
		 * <p>
		 * API name: {@code typical_value}
		 */
		public final Builder typicalValue(@Nullable Double value) {
			this.typicalValue = value;
			return this;
		}

		/**
		 * Upper bound of the 95% confidence interval.
		 * <p>
		 * API name: {@code upper_confidence_bound}
		 */
		public final Builder upperConfidenceBound(@Nullable Double value) {
			this.upperConfidenceBound = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AnomalyExplanation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AnomalyExplanation build() {
			_checkSingleUse();

			return new AnomalyExplanation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AnomalyExplanation}
	 */
	public static final JsonpDeserializer<AnomalyExplanation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, AnomalyExplanation::setupAnomalyExplanationDeserializer);

	protected static void setupAnomalyExplanationDeserializer(ObjectDeserializer<AnomalyExplanation.Builder> op) {

		op.add(Builder::anomalyCharacteristicsImpact, JsonpDeserializer.integerDeserializer(),
				"anomaly_characteristics_impact");
		op.add(Builder::anomalyLength, JsonpDeserializer.integerDeserializer(), "anomaly_length");
		op.add(Builder::anomalyType, JsonpDeserializer.stringDeserializer(), "anomaly_type");
		op.add(Builder::highVariancePenalty, JsonpDeserializer.booleanDeserializer(), "high_variance_penalty");
		op.add(Builder::incompleteBucketPenalty, JsonpDeserializer.booleanDeserializer(), "incomplete_bucket_penalty");
		op.add(Builder::lowerConfidenceBound, JsonpDeserializer.doubleDeserializer(), "lower_confidence_bound");
		op.add(Builder::multiBucketImpact, JsonpDeserializer.integerDeserializer(), "multi_bucket_impact");
		op.add(Builder::singleBucketImpact, JsonpDeserializer.integerDeserializer(), "single_bucket_impact");
		op.add(Builder::typicalValue, JsonpDeserializer.doubleDeserializer(), "typical_value");
		op.add(Builder::upperConfidenceBound, JsonpDeserializer.doubleDeserializer(), "upper_confidence_bound");

	}

}
