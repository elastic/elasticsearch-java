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
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.OverallBucketJob

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml._types.OverallBucketJob">API
 *      specification</a>
 */
@JsonpDeserializable
public class OverallBucketJob implements JsonpSerializable {
	private final String jobId;

	private final double maxAnomalyScore;

	// ---------------------------------------------------------------------------------------------

	private OverallBucketJob(Builder builder) {

		this.jobId = ApiTypeHelper.requireNonNull(builder.jobId, this, "jobId");
		this.maxAnomalyScore = ApiTypeHelper.requireNonNull(builder.maxAnomalyScore, this, "maxAnomalyScore");

	}

	public static OverallBucketJob of(Function<Builder, ObjectBuilder<OverallBucketJob>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code job_id}
	 */
	public final String jobId() {
		return this.jobId;
	}

	/**
	 * Required - API name: {@code max_anomaly_score}
	 */
	public final double maxAnomalyScore() {
		return this.maxAnomalyScore;
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

		generator.writeKey("job_id");
		generator.write(this.jobId);

		generator.writeKey("max_anomaly_score");
		generator.write(this.maxAnomalyScore);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link OverallBucketJob}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<OverallBucketJob> {
		private String jobId;

		private Double maxAnomalyScore;

		/**
		 * Required - API name: {@code job_id}
		 */
		public final Builder jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * Required - API name: {@code max_anomaly_score}
		 */
		public final Builder maxAnomalyScore(double value) {
			this.maxAnomalyScore = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link OverallBucketJob}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public OverallBucketJob build() {
			_checkSingleUse();

			return new OverallBucketJob(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link OverallBucketJob}
	 */
	public static final JsonpDeserializer<OverallBucketJob> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			OverallBucketJob::setupOverallBucketJobDeserializer);

	protected static void setupOverallBucketJobDeserializer(ObjectDeserializer<OverallBucketJob.Builder> op) {

		op.add(Builder::jobId, JsonpDeserializer.stringDeserializer(), "job_id");
		op.add(Builder::maxAnomalyScore, JsonpDeserializer.doubleDeserializer(), "max_anomaly_score");

	}

}
