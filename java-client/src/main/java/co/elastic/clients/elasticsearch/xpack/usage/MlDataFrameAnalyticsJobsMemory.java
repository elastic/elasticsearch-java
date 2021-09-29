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

package co.elastic.clients.elasticsearch.xpack.usage;

import co.elastic.clients.elasticsearch.ml.JobStatistics;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: xpack.usage.MlDataFrameAnalyticsJobsMemory
@JsonpDeserializable
public final class MlDataFrameAnalyticsJobsMemory implements JsonpSerializable {
	private final JobStatistics peakUsageBytes;

	// ---------------------------------------------------------------------------------------------

	public MlDataFrameAnalyticsJobsMemory(Builder builder) {

		this.peakUsageBytes = Objects.requireNonNull(builder.peakUsageBytes, "peak_usage_bytes");

	}

	public MlDataFrameAnalyticsJobsMemory(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code peak_usage_bytes}
	 */
	public JobStatistics peakUsageBytes() {
		return this.peakUsageBytes;
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

		generator.writeKey("peak_usage_bytes");
		this.peakUsageBytes.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MlDataFrameAnalyticsJobsMemory}.
	 */
	public static class Builder implements ObjectBuilder<MlDataFrameAnalyticsJobsMemory> {
		private JobStatistics peakUsageBytes;

		/**
		 * API name: {@code peak_usage_bytes}
		 */
		public Builder peakUsageBytes(JobStatistics value) {
			this.peakUsageBytes = value;
			return this;
		}

		/**
		 * API name: {@code peak_usage_bytes}
		 */
		public Builder peakUsageBytes(Function<JobStatistics.Builder, ObjectBuilder<JobStatistics>> fn) {
			return this.peakUsageBytes(fn.apply(new JobStatistics.Builder()).build());
		}

		/**
		 * Builds a {@link MlDataFrameAnalyticsJobsMemory}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MlDataFrameAnalyticsJobsMemory build() {

			return new MlDataFrameAnalyticsJobsMemory(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MlDataFrameAnalyticsJobsMemory}
	 */
	public static final JsonpDeserializer<MlDataFrameAnalyticsJobsMemory> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, MlDataFrameAnalyticsJobsMemory::setupMlDataFrameAnalyticsJobsMemoryDeserializer,
					Builder::build);

	protected static void setupMlDataFrameAnalyticsJobsMemoryDeserializer(
			DelegatingDeserializer<MlDataFrameAnalyticsJobsMemory.Builder> op) {

		op.add(Builder::peakUsageBytes, JobStatistics._DESERIALIZER, "peak_usage_bytes");

	}

}
