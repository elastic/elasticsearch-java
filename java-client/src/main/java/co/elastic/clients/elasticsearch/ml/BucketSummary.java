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
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.BucketSummary

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml._types.BucketSummary">API
 *      specification</a>
 */
@JsonpDeserializable
public class BucketSummary implements JsonpSerializable {
	private final double anomalyScore;

	private final List<BucketInfluencer> bucketInfluencers;

	private final long bucketSpan;

	private final long eventCount;

	private final double initialAnomalyScore;

	private final boolean isInterim;

	private final String jobId;

	private final long processingTimeMs;

	private final String resultType;

	private final long timestamp;

	@Nullable
	private final DateTime timestampString;

	// ---------------------------------------------------------------------------------------------

	private BucketSummary(Builder builder) {

		this.anomalyScore = ApiTypeHelper.requireNonNull(builder.anomalyScore, this, "anomalyScore");
		this.bucketInfluencers = ApiTypeHelper.unmodifiableRequired(builder.bucketInfluencers, this,
				"bucketInfluencers");
		this.bucketSpan = ApiTypeHelper.requireNonNull(builder.bucketSpan, this, "bucketSpan");
		this.eventCount = ApiTypeHelper.requireNonNull(builder.eventCount, this, "eventCount");
		this.initialAnomalyScore = ApiTypeHelper.requireNonNull(builder.initialAnomalyScore, this,
				"initialAnomalyScore");
		this.isInterim = ApiTypeHelper.requireNonNull(builder.isInterim, this, "isInterim");
		this.jobId = ApiTypeHelper.requireNonNull(builder.jobId, this, "jobId");
		this.processingTimeMs = ApiTypeHelper.requireNonNull(builder.processingTimeMs, this, "processingTimeMs");
		this.resultType = ApiTypeHelper.requireNonNull(builder.resultType, this, "resultType");
		this.timestamp = ApiTypeHelper.requireNonNull(builder.timestamp, this, "timestamp");
		this.timestampString = builder.timestampString;

	}

	public static BucketSummary of(Function<Builder, ObjectBuilder<BucketSummary>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The maximum anomaly score, between 0-100, for any of the bucket
	 * influencers. This is an overall, rate-limited score for the job. All the
	 * anomaly records in the bucket contribute to this score. This value might be
	 * updated as new data is analyzed.
	 * <p>
	 * API name: {@code anomaly_score}
	 */
	public final double anomalyScore() {
		return this.anomalyScore;
	}

	/**
	 * Required - API name: {@code bucket_influencers}
	 */
	public final List<BucketInfluencer> bucketInfluencers() {
		return this.bucketInfluencers;
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
	 * Required - The number of input data records processed in this bucket.
	 * <p>
	 * API name: {@code event_count}
	 */
	public final long eventCount() {
		return this.eventCount;
	}

	/**
	 * Required - The maximum anomaly score for any of the bucket influencers. This
	 * is the initial value that was calculated at the time the bucket was
	 * processed.
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
	 * Required - The amount of time, in milliseconds, that it took to analyze the
	 * bucket contents and calculate results.
	 * <p>
	 * API name: {@code processing_time_ms}
	 */
	public final long processingTimeMs() {
		return this.processingTimeMs;
	}

	/**
	 * Required - Internal. This value is always set to bucket.
	 * <p>
	 * API name: {@code result_type}
	 */
	public final String resultType() {
		return this.resultType;
	}

	/**
	 * Required - The start time of the bucket. This timestamp uniquely identifies
	 * the bucket. Events that occur exactly at the timestamp of the bucket are
	 * included in the results for the bucket.
	 * <p>
	 * API name: {@code timestamp}
	 */
	public final long timestamp() {
		return this.timestamp;
	}

	/**
	 * The start time of the bucket. This timestamp uniquely identifies the bucket.
	 * Events that occur exactly at the timestamp of the bucket are included in the
	 * results for the bucket.
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

		if (ApiTypeHelper.isDefined(this.bucketInfluencers)) {
			generator.writeKey("bucket_influencers");
			generator.writeStartArray();
			for (BucketInfluencer item0 : this.bucketInfluencers) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("bucket_span");
		generator.write(this.bucketSpan);

		generator.writeKey("event_count");
		generator.write(this.eventCount);

		generator.writeKey("initial_anomaly_score");
		generator.write(this.initialAnomalyScore);

		generator.writeKey("is_interim");
		generator.write(this.isInterim);

		generator.writeKey("job_id");
		generator.write(this.jobId);

		generator.writeKey("processing_time_ms");
		generator.write(this.processingTimeMs);

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
	 * Builder for {@link BucketSummary}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<BucketSummary> {
		private Double anomalyScore;

		private List<BucketInfluencer> bucketInfluencers;

		private Long bucketSpan;

		private Long eventCount;

		private Double initialAnomalyScore;

		private Boolean isInterim;

		private String jobId;

		private Long processingTimeMs;

		private String resultType;

		private Long timestamp;

		@Nullable
		private DateTime timestampString;

		/**
		 * Required - The maximum anomaly score, between 0-100, for any of the bucket
		 * influencers. This is an overall, rate-limited score for the job. All the
		 * anomaly records in the bucket contribute to this score. This value might be
		 * updated as new data is analyzed.
		 * <p>
		 * API name: {@code anomaly_score}
		 */
		public final Builder anomalyScore(double value) {
			this.anomalyScore = value;
			return this;
		}

		/**
		 * Required - API name: {@code bucket_influencers}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>bucketInfluencers</code>.
		 */
		public final Builder bucketInfluencers(List<BucketInfluencer> list) {
			this.bucketInfluencers = _listAddAll(this.bucketInfluencers, list);
			return this;
		}

		/**
		 * Required - API name: {@code bucket_influencers}
		 * <p>
		 * Adds one or more values to <code>bucketInfluencers</code>.
		 */
		public final Builder bucketInfluencers(BucketInfluencer value, BucketInfluencer... values) {
			this.bucketInfluencers = _listAdd(this.bucketInfluencers, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code bucket_influencers}
		 * <p>
		 * Adds a value to <code>bucketInfluencers</code> using a builder lambda.
		 */
		public final Builder bucketInfluencers(Function<BucketInfluencer.Builder, ObjectBuilder<BucketInfluencer>> fn) {
			return bucketInfluencers(fn.apply(new BucketInfluencer.Builder()).build());
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
		 * Required - The number of input data records processed in this bucket.
		 * <p>
		 * API name: {@code event_count}
		 */
		public final Builder eventCount(long value) {
			this.eventCount = value;
			return this;
		}

		/**
		 * Required - The maximum anomaly score for any of the bucket influencers. This
		 * is the initial value that was calculated at the time the bucket was
		 * processed.
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
		 * Required - The amount of time, in milliseconds, that it took to analyze the
		 * bucket contents and calculate results.
		 * <p>
		 * API name: {@code processing_time_ms}
		 */
		public final Builder processingTimeMs(long value) {
			this.processingTimeMs = value;
			return this;
		}

		/**
		 * Required - Internal. This value is always set to bucket.
		 * <p>
		 * API name: {@code result_type}
		 */
		public final Builder resultType(String value) {
			this.resultType = value;
			return this;
		}

		/**
		 * Required - The start time of the bucket. This timestamp uniquely identifies
		 * the bucket. Events that occur exactly at the timestamp of the bucket are
		 * included in the results for the bucket.
		 * <p>
		 * API name: {@code timestamp}
		 */
		public final Builder timestamp(long value) {
			this.timestamp = value;
			return this;
		}

		/**
		 * The start time of the bucket. This timestamp uniquely identifies the bucket.
		 * Events that occur exactly at the timestamp of the bucket are included in the
		 * results for the bucket.
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
		 * Builds a {@link BucketSummary}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public BucketSummary build() {
			_checkSingleUse();

			return new BucketSummary(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link BucketSummary}
	 */
	public static final JsonpDeserializer<BucketSummary> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			BucketSummary::setupBucketSummaryDeserializer);

	protected static void setupBucketSummaryDeserializer(ObjectDeserializer<BucketSummary.Builder> op) {

		op.add(Builder::anomalyScore, JsonpDeserializer.doubleDeserializer(), "anomaly_score");
		op.add(Builder::bucketInfluencers, JsonpDeserializer.arrayDeserializer(BucketInfluencer._DESERIALIZER),
				"bucket_influencers");
		op.add(Builder::bucketSpan, JsonpDeserializer.longDeserializer(), "bucket_span");
		op.add(Builder::eventCount, JsonpDeserializer.longDeserializer(), "event_count");
		op.add(Builder::initialAnomalyScore, JsonpDeserializer.doubleDeserializer(), "initial_anomaly_score");
		op.add(Builder::isInterim, JsonpDeserializer.booleanDeserializer(), "is_interim");
		op.add(Builder::jobId, JsonpDeserializer.stringDeserializer(), "job_id");
		op.add(Builder::processingTimeMs, JsonpDeserializer.longDeserializer(), "processing_time_ms");
		op.add(Builder::resultType, JsonpDeserializer.stringDeserializer(), "result_type");
		op.add(Builder::timestamp, JsonpDeserializer.longDeserializer(), "timestamp");
		op.add(Builder::timestampString, DateTime._DESERIALIZER, "timestamp_string");

	}

}
