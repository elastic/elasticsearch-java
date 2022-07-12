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
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.DateTime;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.BucketInfluencer

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml._types.BucketInfluencer">API
 *      specification</a>
 */
@JsonpDeserializable
public class BucketInfluencer implements JsonpSerializable {
	private final double anomalyScore;

	private final long bucketSpan;

	private final String influencerFieldName;

	private final double initialAnomalyScore;

	private final boolean isInterim;

	private final String jobId;

	private final double probability;

	private final double rawAnomalyScore;

	private final String resultType;

	private final long timestamp;

	@Nullable
	private final DateTime timestampString;

	// ---------------------------------------------------------------------------------------------

	private BucketInfluencer(Builder builder) {

		this.anomalyScore = ApiTypeHelper.requireNonNull(builder.anomalyScore, this, "anomalyScore");
		this.bucketSpan = ApiTypeHelper.requireNonNull(builder.bucketSpan, this, "bucketSpan");
		this.influencerFieldName = ApiTypeHelper.requireNonNull(builder.influencerFieldName, this,
				"influencerFieldName");
		this.initialAnomalyScore = ApiTypeHelper.requireNonNull(builder.initialAnomalyScore, this,
				"initialAnomalyScore");
		this.isInterim = ApiTypeHelper.requireNonNull(builder.isInterim, this, "isInterim");
		this.jobId = ApiTypeHelper.requireNonNull(builder.jobId, this, "jobId");
		this.probability = ApiTypeHelper.requireNonNull(builder.probability, this, "probability");
		this.rawAnomalyScore = ApiTypeHelper.requireNonNull(builder.rawAnomalyScore, this, "rawAnomalyScore");
		this.resultType = ApiTypeHelper.requireNonNull(builder.resultType, this, "resultType");
		this.timestamp = ApiTypeHelper.requireNonNull(builder.timestamp, this, "timestamp");
		this.timestampString = builder.timestampString;

	}

	public static BucketInfluencer of(Function<Builder, ObjectBuilder<BucketInfluencer>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - A normalized score between 0-100, which is calculated for each
	 * bucket influencer. This score might be updated as newer data is analyzed.
	 * <p>
	 * API name: {@code anomaly_score}
	 */
	public final double anomalyScore() {
		return this.anomalyScore;
	}

	/**
	 * Required - The length of the bucket in seconds. This value matches the bucket
	 * span that is specified in the job.
	 * <p>
	 * API name: {@code bucket_span}
	 */
	public final long bucketSpan() {
		return this.bucketSpan;
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
	 * Required - The score between 0-100 for each bucket influencer. This score is
	 * the initial value that was calculated at the time the bucket was processed.
	 * <p>
	 * API name: {@code initial_anomaly_score}
	 */
	public final double initialAnomalyScore() {
		return this.initialAnomalyScore;
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
	 * Required - The probability that the bucket has this behavior, in the range 0
	 * to 1. This value can be held to a high precision of over 300 decimal places,
	 * so the <code>anomaly_score</code> is provided as a human-readable and
	 * friendly interpretation of this.
	 * <p>
	 * API name: {@code probability}
	 */
	public final double probability() {
		return this.probability;
	}

	/**
	 * Required - Internal.
	 * <p>
	 * API name: {@code raw_anomaly_score}
	 */
	public final double rawAnomalyScore() {
		return this.rawAnomalyScore;
	}

	/**
	 * Required - Internal. This value is always set to
	 * <code>bucket_influencer</code>.
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
	public final long timestamp() {
		return this.timestamp;
	}

	/**
	 * The start time of the bucket for which these results were calculated.
	 * <p>
	 * API name: {@code timestamp_string}
	 */
	@Nullable
	public final DateTime timestampString() {
		return this.timestampString;
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

		generator.writeKey("anomaly_score");
		generator.write(this.anomalyScore);

		generator.writeKey("bucket_span");
		generator.write(this.bucketSpan);

		generator.writeKey("influencer_field_name");
		generator.write(this.influencerFieldName);

		generator.writeKey("initial_anomaly_score");
		generator.write(this.initialAnomalyScore);

		generator.writeKey("is_interim");
		generator.write(this.isInterim);

		generator.writeKey("job_id");
		generator.write(this.jobId);

		generator.writeKey("probability");
		generator.write(this.probability);

		generator.writeKey("raw_anomaly_score");
		generator.write(this.rawAnomalyScore);

		generator.writeKey("result_type");
		generator.write(this.resultType);

		generator.writeKey("timestamp");
		generator.write(this.timestamp);

		if (this.timestampString != null) {
			generator.writeKey("timestamp_string");
			this.timestampString.serialize(generator, mapper);
		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link BucketInfluencer}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<BucketInfluencer> {
		private Double anomalyScore;

		private Long bucketSpan;

		private String influencerFieldName;

		private Double initialAnomalyScore;

		private Boolean isInterim;

		private String jobId;

		private Double probability;

		private Double rawAnomalyScore;

		private String resultType;

		private Long timestamp;

		@Nullable
		private DateTime timestampString;

		/**
		 * Required - A normalized score between 0-100, which is calculated for each
		 * bucket influencer. This score might be updated as newer data is analyzed.
		 * <p>
		 * API name: {@code anomaly_score}
		 */
		public final Builder anomalyScore(double value) {
			this.anomalyScore = value;
			return this;
		}

		/**
		 * Required - The length of the bucket in seconds. This value matches the bucket
		 * span that is specified in the job.
		 * <p>
		 * API name: {@code bucket_span}
		 */
		public final Builder bucketSpan(long value) {
			this.bucketSpan = value;
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
		 * Required - The score between 0-100 for each bucket influencer. This score is
		 * the initial value that was calculated at the time the bucket was processed.
		 * <p>
		 * API name: {@code initial_anomaly_score}
		 */
		public final Builder initialAnomalyScore(double value) {
			this.initialAnomalyScore = value;
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
		 * Required - The probability that the bucket has this behavior, in the range 0
		 * to 1. This value can be held to a high precision of over 300 decimal places,
		 * so the <code>anomaly_score</code> is provided as a human-readable and
		 * friendly interpretation of this.
		 * <p>
		 * API name: {@code probability}
		 */
		public final Builder probability(double value) {
			this.probability = value;
			return this;
		}

		/**
		 * Required - Internal.
		 * <p>
		 * API name: {@code raw_anomaly_score}
		 */
		public final Builder rawAnomalyScore(double value) {
			this.rawAnomalyScore = value;
			return this;
		}

		/**
		 * Required - Internal. This value is always set to
		 * <code>bucket_influencer</code>.
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
		public final Builder timestamp(long value) {
			this.timestamp = value;
			return this;
		}

		/**
		 * The start time of the bucket for which these results were calculated.
		 * <p>
		 * API name: {@code timestamp_string}
		 */
		public final Builder timestampString(@Nullable DateTime value) {
			this.timestampString = value;
			return this;
		}

		@Override
		protected Builder self() {
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
			BucketInfluencer::setupBucketInfluencerDeserializer);

	protected static void setupBucketInfluencerDeserializer(ObjectDeserializer<BucketInfluencer.Builder> op) {

		op.add(Builder::anomalyScore, JsonpDeserializer.doubleDeserializer(), "anomaly_score");
		op.add(Builder::bucketSpan, JsonpDeserializer.longDeserializer(), "bucket_span");
		op.add(Builder::influencerFieldName, JsonpDeserializer.stringDeserializer(), "influencer_field_name");
		op.add(Builder::initialAnomalyScore, JsonpDeserializer.doubleDeserializer(), "initial_anomaly_score");
		op.add(Builder::isInterim, JsonpDeserializer.booleanDeserializer(), "is_interim");
		op.add(Builder::jobId, JsonpDeserializer.stringDeserializer(), "job_id");
		op.add(Builder::probability, JsonpDeserializer.doubleDeserializer(), "probability");
		op.add(Builder::rawAnomalyScore, JsonpDeserializer.doubleDeserializer(), "raw_anomaly_score");
		op.add(Builder::resultType, JsonpDeserializer.stringDeserializer(), "result_type");
		op.add(Builder::timestamp, JsonpDeserializer.longDeserializer(), "timestamp");
		op.add(Builder::timestampString, DateTime._DESERIALIZER, "timestamp_string");

	}

}
