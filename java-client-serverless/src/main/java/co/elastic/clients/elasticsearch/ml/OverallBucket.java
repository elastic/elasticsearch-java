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

// typedef: ml._types.OverallBucket

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml._types.OverallBucket">API
 *      specification</a>
 */
@JsonpDeserializable
public class OverallBucket implements JsonpSerializable {
	private final long bucketSpan;

	private final boolean isInterim;

	private final List<OverallBucketJob> jobs;

	private final double overallScore;

	private final String resultType;

	private final long timestamp;

	private final DateTime timestampString;

	// ---------------------------------------------------------------------------------------------

	private OverallBucket(Builder builder) {

		this.bucketSpan = ApiTypeHelper.requireNonNull(builder.bucketSpan, this, "bucketSpan");
		this.isInterim = ApiTypeHelper.requireNonNull(builder.isInterim, this, "isInterim");
		this.jobs = ApiTypeHelper.unmodifiableRequired(builder.jobs, this, "jobs");
		this.overallScore = ApiTypeHelper.requireNonNull(builder.overallScore, this, "overallScore");
		this.resultType = ApiTypeHelper.requireNonNull(builder.resultType, this, "resultType");
		this.timestamp = ApiTypeHelper.requireNonNull(builder.timestamp, this, "timestamp");
		this.timestampString = ApiTypeHelper.requireNonNull(builder.timestampString, this, "timestampString");

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
	public final long timestamp() {
		return this.timestamp;
	}

	/**
	 * Required - The start time of the bucket for which these results were
	 * calculated.
	 * <p>
	 * API name: {@code timestamp_string}
	 */
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

		generator.writeKey("bucket_span");
		generator.write(this.bucketSpan);

		generator.writeKey("is_interim");
		generator.write(this.isInterim);

		if (ApiTypeHelper.isDefined(this.jobs)) {
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

		generator.writeKey("timestamp_string");
		this.timestampString.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link OverallBucket}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<OverallBucket> {
		private Long bucketSpan;

		private Boolean isInterim;

		private List<OverallBucketJob> jobs;

		private Double overallScore;

		private String resultType;

		private Long timestamp;

		private DateTime timestampString;

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
		 * <p>
		 * Adds all elements of <code>list</code> to <code>jobs</code>.
		 */
		public final Builder jobs(List<OverallBucketJob> list) {
			this.jobs = _listAddAll(this.jobs, list);
			return this;
		}

		/**
		 * Required - An array of objects that contain the max_anomaly_score per job_id.
		 * <p>
		 * API name: {@code jobs}
		 * <p>
		 * Adds one or more values to <code>jobs</code>.
		 */
		public final Builder jobs(OverallBucketJob value, OverallBucketJob... values) {
			this.jobs = _listAdd(this.jobs, value, values);
			return this;
		}

		/**
		 * Required - An array of objects that contain the max_anomaly_score per job_id.
		 * <p>
		 * API name: {@code jobs}
		 * <p>
		 * Adds a value to <code>jobs</code> using a builder lambda.
		 */
		public final Builder jobs(Function<OverallBucketJob.Builder, ObjectBuilder<OverallBucketJob>> fn) {
			return jobs(fn.apply(new OverallBucketJob.Builder()).build());
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
		public final Builder timestamp(long value) {
			this.timestamp = value;
			return this;
		}

		/**
		 * Required - The start time of the bucket for which these results were
		 * calculated.
		 * <p>
		 * API name: {@code timestamp_string}
		 */
		public final Builder timestampString(DateTime value) {
			this.timestampString = value;
			return this;
		}

		@Override
		protected Builder self() {
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
			OverallBucket::setupOverallBucketDeserializer);

	protected static void setupOverallBucketDeserializer(ObjectDeserializer<OverallBucket.Builder> op) {

		op.add(Builder::bucketSpan, JsonpDeserializer.longDeserializer(), "bucket_span");
		op.add(Builder::isInterim, JsonpDeserializer.booleanDeserializer(), "is_interim");
		op.add(Builder::jobs, JsonpDeserializer.arrayDeserializer(OverallBucketJob._DESERIALIZER), "jobs");
		op.add(Builder::overallScore, JsonpDeserializer.doubleDeserializer(), "overall_score");
		op.add(Builder::resultType, JsonpDeserializer.stringDeserializer(), "result_type");
		op.add(Builder::timestamp, JsonpDeserializer.longDeserializer(), "timestamp");
		op.add(Builder::timestampString, DateTime._DESERIALIZER, "timestamp_string");

	}

}
