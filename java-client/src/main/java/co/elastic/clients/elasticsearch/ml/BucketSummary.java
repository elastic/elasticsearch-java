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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.BucketSummary
@JsonpDeserializable
public final class BucketSummary implements JsonpSerializable {
	private final double anomalyScore;

	private final List<BucketInfluencer> bucketInfluencers;

	private final String bucketSpan;

	private final long eventCount;

	private final double initialAnomalyScore;

	private final boolean isInterim;

	private final String jobId;

	@Nullable
	private final List<PartitionScore> partitionScores;

	private final double processingTimeMs;

	private final String resultType;

	private final String timestamp;

	// ---------------------------------------------------------------------------------------------

	public BucketSummary(Builder builder) {

		this.anomalyScore = Objects.requireNonNull(builder.anomalyScore, "anomaly_score");
		this.bucketInfluencers = Objects.requireNonNull(builder.bucketInfluencers, "bucket_influencers");
		this.bucketSpan = Objects.requireNonNull(builder.bucketSpan, "bucket_span");
		this.eventCount = Objects.requireNonNull(builder.eventCount, "event_count");
		this.initialAnomalyScore = Objects.requireNonNull(builder.initialAnomalyScore, "initial_anomaly_score");
		this.isInterim = Objects.requireNonNull(builder.isInterim, "is_interim");
		this.jobId = Objects.requireNonNull(builder.jobId, "job_id");
		this.partitionScores = builder.partitionScores;
		this.processingTimeMs = Objects.requireNonNull(builder.processingTimeMs, "processing_time_ms");
		this.resultType = Objects.requireNonNull(builder.resultType, "result_type");
		this.timestamp = Objects.requireNonNull(builder.timestamp, "timestamp");

	}

	/**
	 * API name: {@code anomaly_score}
	 */
	public double anomalyScore() {
		return this.anomalyScore;
	}

	/**
	 * API name: {@code bucket_influencers}
	 */
	public List<BucketInfluencer> bucketInfluencers() {
		return this.bucketInfluencers;
	}

	/**
	 * API name: {@code bucket_span}
	 */
	public String bucketSpan() {
		return this.bucketSpan;
	}

	/**
	 * API name: {@code event_count}
	 */
	public long eventCount() {
		return this.eventCount;
	}

	/**
	 * API name: {@code initial_anomaly_score}
	 */
	public double initialAnomalyScore() {
		return this.initialAnomalyScore;
	}

	/**
	 * API name: {@code is_interim}
	 */
	public boolean isInterim() {
		return this.isInterim;
	}

	/**
	 * API name: {@code job_id}
	 */
	public String jobId() {
		return this.jobId;
	}

	/**
	 * API name: {@code partition_scores}
	 */
	@Nullable
	public List<PartitionScore> partitionScores() {
		return this.partitionScores;
	}

	/**
	 * API name: {@code processing_time_ms}
	 */
	public double processingTimeMs() {
		return this.processingTimeMs;
	}

	/**
	 * API name: {@code result_type}
	 */
	public String resultType() {
		return this.resultType;
	}

	/**
	 * API name: {@code timestamp}
	 */
	public String timestamp() {
		return this.timestamp;
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

		generator.writeKey("bucket_influencers");
		generator.writeStartArray();
		for (BucketInfluencer item0 : this.bucketInfluencers) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

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

		if (this.partitionScores != null) {

			generator.writeKey("partition_scores");
			generator.writeStartArray();
			for (PartitionScore item0 : this.partitionScores) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

		generator.writeKey("processing_time_ms");
		generator.write(this.processingTimeMs);

		generator.writeKey("result_type");
		generator.write(this.resultType);

		generator.writeKey("timestamp");
		generator.write(this.timestamp);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link BucketSummary}.
	 */
	public static class Builder implements ObjectBuilder<BucketSummary> {
		private Double anomalyScore;

		private List<BucketInfluencer> bucketInfluencers;

		private String bucketSpan;

		private Long eventCount;

		private Double initialAnomalyScore;

		private Boolean isInterim;

		private String jobId;

		@Nullable
		private List<PartitionScore> partitionScores;

		private Double processingTimeMs;

		private String resultType;

		private String timestamp;

		/**
		 * API name: {@code anomaly_score}
		 */
		public Builder anomalyScore(double value) {
			this.anomalyScore = value;
			return this;
		}

		/**
		 * API name: {@code bucket_influencers}
		 */
		public Builder bucketInfluencers(List<BucketInfluencer> value) {
			this.bucketInfluencers = value;
			return this;
		}

		/**
		 * API name: {@code bucket_influencers}
		 */
		public Builder bucketInfluencers(BucketInfluencer... value) {
			this.bucketInfluencers = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #bucketInfluencers(List)}, creating the list if needed.
		 */
		public Builder addBucketInfluencers(BucketInfluencer value) {
			if (this.bucketInfluencers == null) {
				this.bucketInfluencers = new ArrayList<>();
			}
			this.bucketInfluencers.add(value);
			return this;
		}

		/**
		 * Set {@link #bucketInfluencers(List)} to a singleton list.
		 */
		public Builder bucketInfluencers(Function<BucketInfluencer.Builder, ObjectBuilder<BucketInfluencer>> fn) {
			return this.bucketInfluencers(fn.apply(new BucketInfluencer.Builder()).build());
		}

		/**
		 * Add a value to {@link #bucketInfluencers(List)}, creating the list if needed.
		 */
		public Builder addBucketInfluencers(Function<BucketInfluencer.Builder, ObjectBuilder<BucketInfluencer>> fn) {
			return this.addBucketInfluencers(fn.apply(new BucketInfluencer.Builder()).build());
		}

		/**
		 * API name: {@code bucket_span}
		 */
		public Builder bucketSpan(String value) {
			this.bucketSpan = value;
			return this;
		}

		/**
		 * API name: {@code event_count}
		 */
		public Builder eventCount(long value) {
			this.eventCount = value;
			return this;
		}

		/**
		 * API name: {@code initial_anomaly_score}
		 */
		public Builder initialAnomalyScore(double value) {
			this.initialAnomalyScore = value;
			return this;
		}

		/**
		 * API name: {@code is_interim}
		 */
		public Builder isInterim(boolean value) {
			this.isInterim = value;
			return this;
		}

		/**
		 * API name: {@code job_id}
		 */
		public Builder jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * API name: {@code partition_scores}
		 */
		public Builder partitionScores(@Nullable List<PartitionScore> value) {
			this.partitionScores = value;
			return this;
		}

		/**
		 * API name: {@code partition_scores}
		 */
		public Builder partitionScores(PartitionScore... value) {
			this.partitionScores = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #partitionScores(List)}, creating the list if needed.
		 */
		public Builder addPartitionScores(PartitionScore value) {
			if (this.partitionScores == null) {
				this.partitionScores = new ArrayList<>();
			}
			this.partitionScores.add(value);
			return this;
		}

		/**
		 * Set {@link #partitionScores(List)} to a singleton list.
		 */
		public Builder partitionScores(Function<PartitionScore.Builder, ObjectBuilder<PartitionScore>> fn) {
			return this.partitionScores(fn.apply(new PartitionScore.Builder()).build());
		}

		/**
		 * Add a value to {@link #partitionScores(List)}, creating the list if needed.
		 */
		public Builder addPartitionScores(Function<PartitionScore.Builder, ObjectBuilder<PartitionScore>> fn) {
			return this.addPartitionScores(fn.apply(new PartitionScore.Builder()).build());
		}

		/**
		 * API name: {@code processing_time_ms}
		 */
		public Builder processingTimeMs(double value) {
			this.processingTimeMs = value;
			return this;
		}

		/**
		 * API name: {@code result_type}
		 */
		public Builder resultType(String value) {
			this.resultType = value;
			return this;
		}

		/**
		 * API name: {@code timestamp}
		 */
		public Builder timestamp(String value) {
			this.timestamp = value;
			return this;
		}

		/**
		 * Builds a {@link BucketSummary}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public BucketSummary build() {

			return new BucketSummary(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link BucketSummary}
	 */
	public static final JsonpDeserializer<BucketSummary> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			BucketSummary::setupBucketSummaryDeserializer, Builder::build);

	protected static void setupBucketSummaryDeserializer(DelegatingDeserializer<BucketSummary.Builder> op) {

		op.add(Builder::anomalyScore, JsonpDeserializer.doubleDeserializer(), "anomaly_score");
		op.add(Builder::bucketInfluencers, JsonpDeserializer.arrayDeserializer(BucketInfluencer._DESERIALIZER),
				"bucket_influencers");
		op.add(Builder::bucketSpan, JsonpDeserializer.stringDeserializer(), "bucket_span");
		op.add(Builder::eventCount, JsonpDeserializer.longDeserializer(), "event_count");
		op.add(Builder::initialAnomalyScore, JsonpDeserializer.doubleDeserializer(), "initial_anomaly_score");
		op.add(Builder::isInterim, JsonpDeserializer.booleanDeserializer(), "is_interim");
		op.add(Builder::jobId, JsonpDeserializer.stringDeserializer(), "job_id");
		op.add(Builder::partitionScores, JsonpDeserializer.arrayDeserializer(PartitionScore._DESERIALIZER),
				"partition_scores");
		op.add(Builder::processingTimeMs, JsonpDeserializer.doubleDeserializer(), "processing_time_ms");
		op.add(Builder::resultType, JsonpDeserializer.stringDeserializer(), "result_type");
		op.add(Builder::timestamp, JsonpDeserializer.stringDeserializer(), "timestamp");

	}

}
