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
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.BucketInfluencer
@JsonpDeserializable
public class BucketInfluencer implements JsonpSerializable {
	private final long bucketSpan;

	private final double influencerScore;

	private final String influencerFieldName;

	private final String influencerFieldValue;

	private final double initialInfluencerScore;

	private final boolean isInterim;

	private final String jobId;

	private final double probability;

	private final String resultType;

	private final String timestamp;

	@Nullable
	private final String foo;

	// ---------------------------------------------------------------------------------------------

	private BucketInfluencer(Builder builder) {

		this.bucketSpan = ModelTypeHelper.requireNonNull(builder.bucketSpan, this, "bucketSpan");
		this.influencerScore = ModelTypeHelper.requireNonNull(builder.influencerScore, this, "influencerScore");
		this.influencerFieldName = ModelTypeHelper.requireNonNull(builder.influencerFieldName, this,
				"influencerFieldName");
		this.influencerFieldValue = ModelTypeHelper.requireNonNull(builder.influencerFieldValue, this,
				"influencerFieldValue");
		this.initialInfluencerScore = ModelTypeHelper.requireNonNull(builder.initialInfluencerScore, this,
				"initialInfluencerScore");
		this.isInterim = ModelTypeHelper.requireNonNull(builder.isInterim, this, "isInterim");
		this.jobId = ModelTypeHelper.requireNonNull(builder.jobId, this, "jobId");
		this.probability = ModelTypeHelper.requireNonNull(builder.probability, this, "probability");
		this.resultType = ModelTypeHelper.requireNonNull(builder.resultType, this, "resultType");
		this.timestamp = ModelTypeHelper.requireNonNull(builder.timestamp, this, "timestamp");
		this.foo = builder.foo;

	}

	public static BucketInfluencer of(Function<Builder, ObjectBuilder<BucketInfluencer>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The length of the bucket in seconds. This value matches the
	 * bucket_span that is specified in the job.
	 * <p>
	 * API name: {@code bucket_span}
	 */
	public final long bucketSpan() {
		return this.bucketSpan;
	}

	/**
	 * Required - A normalized score between 0-100, which is based on the
	 * probability of the influencer in this bucket aggregated across detectors.
	 * Unlike initial_influencer_score, this value will be updated by a
	 * re-normalization process as new data is analyzed.
	 * <p>
	 * API name: {@code influencer_score}
	 */
	public final double influencerScore() {
		return this.influencerScore;
	}

	/**
	 * Required - The field name of the influencer.
	 * <p>
	 * API name: {@code influencer_field_name}
	 */
	public final String influencerFieldName() {
		return this.influencerFieldName;
	}

	/**
	 * Required - The entity that influenced, contributed to, or was to blame for
	 * the anomaly.
	 * <p>
	 * API name: {@code influencer_field_value}
	 */
	public final String influencerFieldValue() {
		return this.influencerFieldValue;
	}

	/**
	 * Required - A normalized score between 0-100, which is based on the
	 * probability of the influencer aggregated across detectors. This is the
	 * initial value that was calculated at the time the bucket was processed.
	 * <p>
	 * API name: {@code initial_influencer_score}
	 */
	public final double initialInfluencerScore() {
		return this.initialInfluencerScore;
	}

	/**
	 * Required - If true, this is an interim result. In other words, the results
	 * are calculated based on partial input data.
	 * <p>
	 * API name: {@code is_interim}
	 */
	public final boolean isInterim() {
		return this.isInterim;
	}

	/**
	 * Required - Identifier for the anomaly detection job.
	 * <p>
	 * API name: {@code job_id}
	 */
	public final String jobId() {
		return this.jobId;
	}

	/**
	 * Required - The probability that the influencer has this behavior, in the
	 * range 0 to 1. This value can be held to a high precision of over 300 decimal
	 * places, so the influencer_score is provided as a human-readable and friendly
	 * interpretation of this.
	 * <p>
	 * API name: {@code probability}
	 */
	public final double probability() {
		return this.probability;
	}

	/**
	 * Required - Internal. This value is always set to influencer.
	 * <p>
	 * API name: {@code result_type}
	 */
	public final String resultType() {
		return this.resultType;
	}

	/**
	 * Required - The start time of the bucket for which these results were
	 * calculated.
	 * <p>
	 * API name: {@code timestamp}
	 */
	public final String timestamp() {
		return this.timestamp;
	}

	/**
	 * API name: {@code foo}
	 */
	@Nullable
	public final String foo() {
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
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<BucketInfluencer> {
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
		 * Required - The length of the bucket in seconds. This value matches the
		 * bucket_span that is specified in the job.
		 * <p>
		 * API name: {@code bucket_span}
		 */
		public final Builder bucketSpan(long value) {
			this.bucketSpan = value;
			return this;
		}

		/**
		 * Required - A normalized score between 0-100, which is based on the
		 * probability of the influencer in this bucket aggregated across detectors.
		 * Unlike initial_influencer_score, this value will be updated by a
		 * re-normalization process as new data is analyzed.
		 * <p>
		 * API name: {@code influencer_score}
		 */
		public final Builder influencerScore(double value) {
			this.influencerScore = value;
			return this;
		}

		/**
		 * Required - The field name of the influencer.
		 * <p>
		 * API name: {@code influencer_field_name}
		 */
		public final Builder influencerFieldName(String value) {
			this.influencerFieldName = value;
			return this;
		}

		/**
		 * Required - The entity that influenced, contributed to, or was to blame for
		 * the anomaly.
		 * <p>
		 * API name: {@code influencer_field_value}
		 */
		public final Builder influencerFieldValue(String value) {
			this.influencerFieldValue = value;
			return this;
		}

		/**
		 * Required - A normalized score between 0-100, which is based on the
		 * probability of the influencer aggregated across detectors. This is the
		 * initial value that was calculated at the time the bucket was processed.
		 * <p>
		 * API name: {@code initial_influencer_score}
		 */
		public final Builder initialInfluencerScore(double value) {
			this.initialInfluencerScore = value;
			return this;
		}

		/**
		 * Required - If true, this is an interim result. In other words, the results
		 * are calculated based on partial input data.
		 * <p>
		 * API name: {@code is_interim}
		 */
		public final Builder isInterim(boolean value) {
			this.isInterim = value;
			return this;
		}

		/**
		 * Required - Identifier for the anomaly detection job.
		 * <p>
		 * API name: {@code job_id}
		 */
		public final Builder jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * Required - The probability that the influencer has this behavior, in the
		 * range 0 to 1. This value can be held to a high precision of over 300 decimal
		 * places, so the influencer_score is provided as a human-readable and friendly
		 * interpretation of this.
		 * <p>
		 * API name: {@code probability}
		 */
		public final Builder probability(double value) {
			this.probability = value;
			return this;
		}

		/**
		 * Required - Internal. This value is always set to influencer.
		 * <p>
		 * API name: {@code result_type}
		 */
		public final Builder resultType(String value) {
			this.resultType = value;
			return this;
		}

		/**
		 * Required - The start time of the bucket for which these results were
		 * calculated.
		 * <p>
		 * API name: {@code timestamp}
		 */
		public final Builder timestamp(String value) {
			this.timestamp = value;
			return this;
		}

		/**
		 * API name: {@code foo}
		 */
		public final Builder foo(@Nullable String value) {
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
			_checkSingleUse();

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
