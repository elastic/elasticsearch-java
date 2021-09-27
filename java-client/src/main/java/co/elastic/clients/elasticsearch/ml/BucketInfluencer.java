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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml._types.BucketInfluencer
@JsonpDeserializable
public final class BucketInfluencer implements JsonpSerializable {
	private final Long bucketSpan;

	private final Double influencerScore;

	private final String influencerFieldName;

	private final String influencerFieldValue;

	private final Double initialInfluencerScore;

	private final Boolean isInterim;

	private final String jobId;

	private final Double probability;

	private final String resultType;

	private final String timestamp;

	@Nullable
	private final String foo;

	// ---------------------------------------------------------------------------------------------

	public BucketInfluencer(Builder builder) {

		this.bucketSpan = Objects.requireNonNull(builder.bucketSpan, "bucket_span");
		this.influencerScore = Objects.requireNonNull(builder.influencerScore, "influencer_score");
		this.influencerFieldName = Objects.requireNonNull(builder.influencerFieldName, "influencer_field_name");
		this.influencerFieldValue = Objects.requireNonNull(builder.influencerFieldValue, "influencer_field_value");
		this.initialInfluencerScore = Objects.requireNonNull(builder.initialInfluencerScore,
				"initial_influencer_score");
		this.isInterim = Objects.requireNonNull(builder.isInterim, "is_interim");
		this.jobId = Objects.requireNonNull(builder.jobId, "job_id");
		this.probability = Objects.requireNonNull(builder.probability, "probability");
		this.resultType = Objects.requireNonNull(builder.resultType, "result_type");
		this.timestamp = Objects.requireNonNull(builder.timestamp, "timestamp");
		this.foo = builder.foo;

	}

	/**
	 * The length of the bucket in seconds. This value matches the bucket_span that
	 * is specified in the job.
	 * <p>
	 * API name: {@code bucket_span}
	 */
	public Long bucketSpan() {
		return this.bucketSpan;
	}

	/**
	 * A normalized score between 0-100, which is based on the probability of the
	 * influencer in this bucket aggregated across detectors. Unlike
	 * initial_influencer_score, this value will be updated by a re-normalization
	 * process as new data is analyzed.
	 * <p>
	 * API name: {@code influencer_score}
	 */
	public Double influencerScore() {
		return this.influencerScore;
	}

	/**
	 * The field name of the influencer.
	 * <p>
	 * API name: {@code influencer_field_name}
	 */
	public String influencerFieldName() {
		return this.influencerFieldName;
	}

	/**
	 * The entity that influenced, contributed to, or was to blame for the anomaly.
	 * <p>
	 * API name: {@code influencer_field_value}
	 */
	public String influencerFieldValue() {
		return this.influencerFieldValue;
	}

	/**
	 * A normalized score between 0-100, which is based on the probability of the
	 * influencer aggregated across detectors. This is the initial value that was
	 * calculated at the time the bucket was processed.
	 * <p>
	 * API name: {@code initial_influencer_score}
	 */
	public Double initialInfluencerScore() {
		return this.initialInfluencerScore;
	}

	/**
	 * If true, this is an interim result. In other words, the results are
	 * calculated based on partial input data.
	 * <p>
	 * API name: {@code is_interim}
	 */
	public Boolean isInterim() {
		return this.isInterim;
	}

	/**
	 * Identifier for the anomaly detection job.
	 * <p>
	 * API name: {@code job_id}
	 */
	public String jobId() {
		return this.jobId;
	}

	/**
	 * The probability that the influencer has this behavior, in the range 0 to 1.
	 * This value can be held to a high precision of over 300 decimal places, so the
	 * influencer_score is provided as a human-readable and friendly interpretation
	 * of this.
	 * <p>
	 * API name: {@code probability}
	 */
	public Double probability() {
		return this.probability;
	}

	/**
	 * Internal. This value is always set to influencer.
	 * <p>
	 * API name: {@code result_type}
	 */
	public String resultType() {
		return this.resultType;
	}

	/**
	 * The start time of the bucket for which these results were calculated.
	 * <p>
	 * API name: {@code timestamp}
	 */
	public String timestamp() {
		return this.timestamp;
	}

	/**
	 * API name: {@code foo}
	 */
	@Nullable
	public String foo() {
		return this.foo;
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

		generator.writeKey("bucket_span");
		generator.write(this.bucketSpan);

		generator.writeKey("influencer_score");
		generator.write(this.influencerScore);

		generator.writeKey("influencer_field_name");
		generator.write(this.influencerFieldName);

		generator.writeKey("influencer_field_value");
		generator.write(this.influencerFieldValue);

		generator.writeKey("initial_influencer_score");
		generator.write(this.initialInfluencerScore);

		generator.writeKey("is_interim");
		generator.write(this.isInterim);

		generator.writeKey("job_id");
		generator.write(this.jobId);

		generator.writeKey("probability");
		generator.write(this.probability);

		generator.writeKey("result_type");
		generator.write(this.resultType);

		generator.writeKey("timestamp");
		generator.write(this.timestamp);

		if (this.foo != null) {

			generator.writeKey("foo");
			generator.write(this.foo);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link BucketInfluencer}.
	 */
	public static class Builder implements ObjectBuilder<BucketInfluencer> {
		private Long bucketSpan;

		private Double influencerScore;

		private String influencerFieldName;

		private String influencerFieldValue;

		private Double initialInfluencerScore;

		private Boolean isInterim;

		private String jobId;

		private Double probability;

		private String resultType;

		private String timestamp;

		@Nullable
		private String foo;

		/**
		 * The length of the bucket in seconds. This value matches the bucket_span that
		 * is specified in the job.
		 * <p>
		 * API name: {@code bucket_span}
		 */
		public Builder bucketSpan(Long value) {
			this.bucketSpan = value;
			return this;
		}

		/**
		 * A normalized score between 0-100, which is based on the probability of the
		 * influencer in this bucket aggregated across detectors. Unlike
		 * initial_influencer_score, this value will be updated by a re-normalization
		 * process as new data is analyzed.
		 * <p>
		 * API name: {@code influencer_score}
		 */
		public Builder influencerScore(Double value) {
			this.influencerScore = value;
			return this;
		}

		/**
		 * The field name of the influencer.
		 * <p>
		 * API name: {@code influencer_field_name}
		 */
		public Builder influencerFieldName(String value) {
			this.influencerFieldName = value;
			return this;
		}

		/**
		 * The entity that influenced, contributed to, or was to blame for the anomaly.
		 * <p>
		 * API name: {@code influencer_field_value}
		 */
		public Builder influencerFieldValue(String value) {
			this.influencerFieldValue = value;
			return this;
		}

		/**
		 * A normalized score between 0-100, which is based on the probability of the
		 * influencer aggregated across detectors. This is the initial value that was
		 * calculated at the time the bucket was processed.
		 * <p>
		 * API name: {@code initial_influencer_score}
		 */
		public Builder initialInfluencerScore(Double value) {
			this.initialInfluencerScore = value;
			return this;
		}

		/**
		 * If true, this is an interim result. In other words, the results are
		 * calculated based on partial input data.
		 * <p>
		 * API name: {@code is_interim}
		 */
		public Builder isInterim(Boolean value) {
			this.isInterim = value;
			return this;
		}

		/**
		 * Identifier for the anomaly detection job.
		 * <p>
		 * API name: {@code job_id}
		 */
		public Builder jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * The probability that the influencer has this behavior, in the range 0 to 1.
		 * This value can be held to a high precision of over 300 decimal places, so the
		 * influencer_score is provided as a human-readable and friendly interpretation
		 * of this.
		 * <p>
		 * API name: {@code probability}
		 */
		public Builder probability(Double value) {
			this.probability = value;
			return this;
		}

		/**
		 * Internal. This value is always set to influencer.
		 * <p>
		 * API name: {@code result_type}
		 */
		public Builder resultType(String value) {
			this.resultType = value;
			return this;
		}

		/**
		 * The start time of the bucket for which these results were calculated.
		 * <p>
		 * API name: {@code timestamp}
		 */
		public Builder timestamp(String value) {
			this.timestamp = value;
			return this;
		}

		/**
		 * API name: {@code foo}
		 */
		public Builder foo(@Nullable String value) {
			this.foo = value;
			return this;
		}

		/**
		 * Builds a {@link BucketInfluencer}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public BucketInfluencer build() {

			return new BucketInfluencer(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link BucketInfluencer}
	 */
	public static final JsonpDeserializer<BucketInfluencer> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			BucketInfluencer::setupBucketInfluencerDeserializer, Builder::build);

	protected static void setupBucketInfluencerDeserializer(DelegatingDeserializer<BucketInfluencer.Builder> op) {

		op.add(Builder::bucketSpan, JsonpDeserializer.longDeserializer(), "bucket_span");
		op.add(Builder::influencerScore, JsonpDeserializer.doubleDeserializer(), "influencer_score");
		op.add(Builder::influencerFieldName, JsonpDeserializer.stringDeserializer(), "influencer_field_name");
		op.add(Builder::influencerFieldValue, JsonpDeserializer.stringDeserializer(), "influencer_field_value");
		op.add(Builder::initialInfluencerScore, JsonpDeserializer.doubleDeserializer(), "initial_influencer_score");
		op.add(Builder::isInterim, JsonpDeserializer.booleanDeserializer(), "is_interim");
		op.add(Builder::jobId, JsonpDeserializer.stringDeserializer(), "job_id");
		op.add(Builder::probability, JsonpDeserializer.doubleDeserializer(), "probability");
		op.add(Builder::resultType, JsonpDeserializer.stringDeserializer(), "result_type");
		op.add(Builder::timestamp, JsonpDeserializer.stringDeserializer(), "timestamp");
		op.add(Builder::foo, JsonpDeserializer.stringDeserializer(), "foo");

	}

}
