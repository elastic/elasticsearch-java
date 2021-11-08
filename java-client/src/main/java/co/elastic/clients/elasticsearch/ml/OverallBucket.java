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

// typedef: ml._types.OverallBucket
@JsonpDeserializable
public class OverallBucket implements JsonpSerializable {
	private final long bucketSpan;

	private final boolean isInterim;

	private final List<OverallBucketJob> jobs;

	private final double overallScore;

	private final String resultType;

	private final String timestamp;

	// ---------------------------------------------------------------------------------------------

	private OverallBucket(Builder builder) {

		this.bucketSpan = ModelTypeHelper.requireNonNull(builder.bucketSpan, this, "bucketSpan");
		this.isInterim = ModelTypeHelper.requireNonNull(builder.isInterim, this, "isInterim");
		this.jobs = ModelTypeHelper.unmodifiableRequired(builder.jobs, this, "jobs");
		this.overallScore = ModelTypeHelper.requireNonNull(builder.overallScore, this, "overallScore");
		this.resultType = ModelTypeHelper.requireNonNull(builder.resultType, this, "resultType");
		this.timestamp = ModelTypeHelper.requireNonNull(builder.timestamp, this, "timestamp");

	}

	public static OverallBucket of(Function<Builder, ObjectBuilder<OverallBucket>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The length of the bucket in seconds. Matches the job with the
	 * longest bucket_span value.
	 * <p>
	 * API name: {@code bucket_span}
	 */
	public final long bucketSpan() {
		return this.bucketSpan;
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
	 * Required - An array of objects that contain the max_anomaly_score per job_id.
	 * <p>
	 * API name: {@code jobs}
	 */
	public final List<OverallBucketJob> jobs() {
		return this.jobs;
	}

	/**
	 * Required - The top_n average of the maximum bucket anomaly_score per job.
	 * <p>
	 * API name: {@code overall_score}
	 */
	public final double overallScore() {
		return this.overallScore;
	}

	/**
	 * Required - Internal. This is always set to overall_bucket.
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

		generator.writeKey("is_interim");
		generator.write(this.isInterim);

		if (ModelTypeHelper.isDefined(this.jobs)) {
			generator.writeKey("jobs");
			generator.writeStartArray();
			for (OverallBucketJob item0 : this.jobs) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("overall_score");
		generator.write(this.overallScore);

		generator.writeKey("result_type");
		generator.write(this.resultType);

		generator.writeKey("timestamp");
		generator.write(this.timestamp);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link OverallBucket}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<OverallBucket> {
		private Long bucketSpan;

		private Boolean isInterim;

		private List<OverallBucketJob> jobs;

		private Double overallScore;

		private String resultType;

		private String timestamp;

		/**
		 * Required - The length of the bucket in seconds. Matches the job with the
		 * longest bucket_span value.
		 * <p>
		 * API name: {@code bucket_span}
		 */
		public final Builder bucketSpan(long value) {
			this.bucketSpan = value;
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
		 * Required - An array of objects that contain the max_anomaly_score per job_id.
		 * <p>
		 * API name: {@code jobs}
		 */
		public final Builder jobs(List<OverallBucketJob> value) {
			this.jobs = value;
			return this;
		}

		/**
		 * Required - An array of objects that contain the max_anomaly_score per job_id.
		 * <p>
		 * API name: {@code jobs}
		 */
		public final Builder jobs(OverallBucketJob... value) {
			this.jobs = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - An array of objects that contain the max_anomaly_score per job_id.
		 * <p>
		 * API name: {@code jobs}
		 */
		@SafeVarargs
		public final Builder jobs(Function<OverallBucketJob.Builder, ObjectBuilder<OverallBucketJob>>... fns) {
			this.jobs = new ArrayList<>(fns.length);
			for (Function<OverallBucketJob.Builder, ObjectBuilder<OverallBucketJob>> fn : fns) {
				this.jobs.add(fn.apply(new OverallBucketJob.Builder()).build());
			}
			return this;
		}

		/**
		 * Required - The top_n average of the maximum bucket anomaly_score per job.
		 * <p>
		 * API name: {@code overall_score}
		 */
		public final Builder overallScore(double value) {
			this.overallScore = value;
			return this;
		}

		/**
		 * Required - Internal. This is always set to overall_bucket.
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
		 * Builds a {@link OverallBucket}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public OverallBucket build() {
			_checkSingleUse();

			return new OverallBucket(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link OverallBucket}
	 */
	public static final JsonpDeserializer<OverallBucket> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			OverallBucket::setupOverallBucketDeserializer, Builder::build);

	protected static void setupOverallBucketDeserializer(DelegatingDeserializer<OverallBucket.Builder> op) {

		op.add(Builder::bucketSpan, JsonpDeserializer.longDeserializer(), "bucket_span");
		op.add(Builder::isInterim, JsonpDeserializer.booleanDeserializer(), "is_interim");
		op.add(Builder::jobs, JsonpDeserializer.arrayDeserializer(OverallBucketJob._DESERIALIZER), "jobs");
		op.add(Builder::overallScore, JsonpDeserializer.doubleDeserializer(), "overall_score");
		op.add(Builder::resultType, JsonpDeserializer.stringDeserializer(), "result_type");
		op.add(Builder::timestamp, JsonpDeserializer.stringDeserializer(), "timestamp");

	}

}
