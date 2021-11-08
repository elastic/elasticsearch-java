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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.BucketSummary
@JsonpDeserializable
public class BucketSummary implements JsonpSerializable {
	private final double anomalyScore;

	private final List<BucketInfluencer> bucketInfluencers;

	private final String bucketSpan;

	private final long eventCount;

	private final double initialAnomalyScore;

	private final boolean isInterim;

	private final String jobId;

	private final List<PartitionScore> partitionScores;

	private final double processingTimeMs;

	private final String resultType;

	private final String timestamp;

	// ---------------------------------------------------------------------------------------------

	private BucketSummary(Builder builder) {

		this.anomalyScore = ModelTypeHelper.requireNonNull(builder.anomalyScore, this, "anomalyScore");
		this.bucketInfluencers = ModelTypeHelper.unmodifiableRequired(builder.bucketInfluencers, this,
				"bucketInfluencers");
		this.bucketSpan = ModelTypeHelper.requireNonNull(builder.bucketSpan, this, "bucketSpan");
		this.eventCount = ModelTypeHelper.requireNonNull(builder.eventCount, this, "eventCount");
		this.initialAnomalyScore = ModelTypeHelper.requireNonNull(builder.initialAnomalyScore, this,
				"initialAnomalyScore");
		this.isInterim = ModelTypeHelper.requireNonNull(builder.isInterim, this, "isInterim");
		this.jobId = ModelTypeHelper.requireNonNull(builder.jobId, this, "jobId");
		this.partitionScores = ModelTypeHelper.unmodifiable(builder.partitionScores);
		this.processingTimeMs = ModelTypeHelper.requireNonNull(builder.processingTimeMs, this, "processingTimeMs");
		this.resultType = ModelTypeHelper.requireNonNull(builder.resultType, this, "resultType");
		this.timestamp = ModelTypeHelper.requireNonNull(builder.timestamp, this, "timestamp");

	}

	public static BucketSummary of(Function<Builder, ObjectBuilder<BucketSummary>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code anomaly_score}
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
	 * Required - API name: {@code bucket_span}
	 */
	public final String bucketSpan() {
		return this.bucketSpan;
	}

	/**
	 * Required - API name: {@code event_count}
	 */
	public final long eventCount() {
		return this.eventCount;
	}

	/**
	 * Required - API name: {@code initial_anomaly_score}
	 */
	public final double initialAnomalyScore() {
		return this.initialAnomalyScore;
	}

	/**
	 * Required - API name: {@code is_interim}
	 */
	public final boolean isInterim() {
		return this.isInterim;
	}

	/**
	 * Required - API name: {@code job_id}
	 */
	public final String jobId() {
		return this.jobId;
	}

	/**
	 * API name: {@code partition_scores}
	 */
	public final List<PartitionScore> partitionScores() {
		return this.partitionScores;
	}

	/**
	 * Required - API name: {@code processing_time_ms}
	 */
	public final double processingTimeMs() {
		return this.processingTimeMs;
	}

	/**
	 * Required - API name: {@code result_type}
	 */
	public final String resultType() {
		return this.resultType;
	}

	/**
	 * Required - API name: {@code timestamp}
	 */
	public final String timestamp() {
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

		if (ModelTypeHelper.isDefined(this.bucketInfluencers)) {
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

		if (ModelTypeHelper.isDefined(this.partitionScores)) {
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
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<BucketSummary> {
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
		 * Required - API name: {@code anomaly_score}
		 */
		public final Builder anomalyScore(double value) {
			this.anomalyScore = value;
			return this;
		}

		/**
		 * Required - API name: {@code bucket_influencers}
		 */
		public final Builder bucketInfluencers(List<BucketInfluencer> value) {
			this.bucketInfluencers = value;
			return this;
		}

		/**
		 * Required - API name: {@code bucket_influencers}
		 */
		public final Builder bucketInfluencers(BucketInfluencer... value) {
			this.bucketInfluencers = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code bucket_influencers}
		 */
		@SafeVarargs
		public final Builder bucketInfluencers(
				Function<BucketInfluencer.Builder, ObjectBuilder<BucketInfluencer>>... fns) {
			this.bucketInfluencers = new ArrayList<>(fns.length);
			for (Function<BucketInfluencer.Builder, ObjectBuilder<BucketInfluencer>> fn : fns) {
				this.bucketInfluencers.add(fn.apply(new BucketInfluencer.Builder()).build());
			}
			return this;
		}

		/**
		 * Required - API name: {@code bucket_span}
		 */
		public final Builder bucketSpan(String value) {
			this.bucketSpan = value;
			return this;
		}

		/**
		 * Required - API name: {@code event_count}
		 */
		public final Builder eventCount(long value) {
			this.eventCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code initial_anomaly_score}
		 */
		public final Builder initialAnomalyScore(double value) {
			this.initialAnomalyScore = value;
			return this;
		}

		/**
		 * Required - API name: {@code is_interim}
		 */
		public final Builder isInterim(boolean value) {
			this.isInterim = value;
			return this;
		}

		/**
		 * Required - API name: {@code job_id}
		 */
		public final Builder jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * API name: {@code partition_scores}
		 */
		public final Builder partitionScores(@Nullable List<PartitionScore> value) {
			this.partitionScores = value;
			return this;
		}

		/**
		 * API name: {@code partition_scores}
		 */
		public final Builder partitionScores(PartitionScore... value) {
			this.partitionScores = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code partition_scores}
		 */
		@SafeVarargs
		public final Builder partitionScores(Function<PartitionScore.Builder, ObjectBuilder<PartitionScore>>... fns) {
			this.partitionScores = new ArrayList<>(fns.length);
			for (Function<PartitionScore.Builder, ObjectBuilder<PartitionScore>> fn : fns) {
				this.partitionScores.add(fn.apply(new PartitionScore.Builder()).build());
			}
			return this;
		}

		/**
		 * Required - API name: {@code processing_time_ms}
		 */
		public final Builder processingTimeMs(double value) {
			this.processingTimeMs = value;
			return this;
		}

		/**
		 * Required - API name: {@code result_type}
		 */
		public final Builder resultType(String value) {
			this.resultType = value;
			return this;
		}

		/**
		 * Required - API name: {@code timestamp}
		 */
		public final Builder timestamp(String value) {
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
			_checkSingleUse();

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
