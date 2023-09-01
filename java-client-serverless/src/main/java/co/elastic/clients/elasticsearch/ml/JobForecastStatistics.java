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
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.JobForecastStatistics

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml._types.JobForecastStatistics">API
 *      specification</a>
 */
@JsonpDeserializable
public class JobForecastStatistics implements JsonpSerializable {
	@Nullable
	private final JobStatistics memoryBytes;

	@Nullable
	private final JobStatistics processingTimeMs;

	@Nullable
	private final JobStatistics records;

	private final Map<String, Long> status;

	private final long total;

	private final int forecastedJobs;

	// ---------------------------------------------------------------------------------------------

	private JobForecastStatistics(Builder builder) {

		this.memoryBytes = builder.memoryBytes;
		this.processingTimeMs = builder.processingTimeMs;
		this.records = builder.records;
		this.status = ApiTypeHelper.unmodifiable(builder.status);
		this.total = ApiTypeHelper.requireNonNull(builder.total, this, "total");
		this.forecastedJobs = ApiTypeHelper.requireNonNull(builder.forecastedJobs, this, "forecastedJobs");

	}

	public static JobForecastStatistics of(Function<Builder, ObjectBuilder<JobForecastStatistics>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code memory_bytes}
	 */
	@Nullable
	public final JobStatistics memoryBytes() {
		return this.memoryBytes;
	}

	/**
	 * API name: {@code processing_time_ms}
	 */
	@Nullable
	public final JobStatistics processingTimeMs() {
		return this.processingTimeMs;
	}

	/**
	 * API name: {@code records}
	 */
	@Nullable
	public final JobStatistics records() {
		return this.records;
	}

	/**
	 * API name: {@code status}
	 */
	public final Map<String, Long> status() {
		return this.status;
	}

	/**
	 * Required - API name: {@code total}
	 */
	public final long total() {
		return this.total;
	}

	/**
	 * Required - API name: {@code forecasted_jobs}
	 */
	public final int forecastedJobs() {
		return this.forecastedJobs;
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

		if (this.memoryBytes != null) {
			generator.writeKey("memory_bytes");
			this.memoryBytes.serialize(generator, mapper);

		}
		if (this.processingTimeMs != null) {
			generator.writeKey("processing_time_ms");
			this.processingTimeMs.serialize(generator, mapper);

		}
		if (this.records != null) {
			generator.writeKey("records");
			this.records.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.status)) {
			generator.writeKey("status");
			generator.writeStartObject();
			for (Map.Entry<String, Long> item0 : this.status.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		generator.writeKey("total");
		generator.write(this.total);

		generator.writeKey("forecasted_jobs");
		generator.write(this.forecastedJobs);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link JobForecastStatistics}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<JobForecastStatistics> {
		@Nullable
		private JobStatistics memoryBytes;

		@Nullable
		private JobStatistics processingTimeMs;

		@Nullable
		private JobStatistics records;

		@Nullable
		private Map<String, Long> status;

		private Long total;

		private Integer forecastedJobs;

		/**
		 * API name: {@code memory_bytes}
		 */
		public final Builder memoryBytes(@Nullable JobStatistics value) {
			this.memoryBytes = value;
			return this;
		}

		/**
		 * API name: {@code memory_bytes}
		 */
		public final Builder memoryBytes(Function<JobStatistics.Builder, ObjectBuilder<JobStatistics>> fn) {
			return this.memoryBytes(fn.apply(new JobStatistics.Builder()).build());
		}

		/**
		 * API name: {@code processing_time_ms}
		 */
		public final Builder processingTimeMs(@Nullable JobStatistics value) {
			this.processingTimeMs = value;
			return this;
		}

		/**
		 * API name: {@code processing_time_ms}
		 */
		public final Builder processingTimeMs(Function<JobStatistics.Builder, ObjectBuilder<JobStatistics>> fn) {
			return this.processingTimeMs(fn.apply(new JobStatistics.Builder()).build());
		}

		/**
		 * API name: {@code records}
		 */
		public final Builder records(@Nullable JobStatistics value) {
			this.records = value;
			return this;
		}

		/**
		 * API name: {@code records}
		 */
		public final Builder records(Function<JobStatistics.Builder, ObjectBuilder<JobStatistics>> fn) {
			return this.records(fn.apply(new JobStatistics.Builder()).build());
		}

		/**
		 * API name: {@code status}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>status</code>.
		 */
		public final Builder status(Map<String, Long> map) {
			this.status = _mapPutAll(this.status, map);
			return this;
		}

		/**
		 * API name: {@code status}
		 * <p>
		 * Adds an entry to <code>status</code>.
		 */
		public final Builder status(String key, Long value) {
			this.status = _mapPut(this.status, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code total}
		 */
		public final Builder total(long value) {
			this.total = value;
			return this;
		}

		/**
		 * Required - API name: {@code forecasted_jobs}
		 */
		public final Builder forecastedJobs(int value) {
			this.forecastedJobs = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link JobForecastStatistics}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public JobForecastStatistics build() {
			_checkSingleUse();

			return new JobForecastStatistics(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link JobForecastStatistics}
	 */
	public static final JsonpDeserializer<JobForecastStatistics> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, JobForecastStatistics::setupJobForecastStatisticsDeserializer);

	protected static void setupJobForecastStatisticsDeserializer(ObjectDeserializer<JobForecastStatistics.Builder> op) {

		op.add(Builder::memoryBytes, JobStatistics._DESERIALIZER, "memory_bytes");
		op.add(Builder::processingTimeMs, JobStatistics._DESERIALIZER, "processing_time_ms");
		op.add(Builder::records, JobStatistics._DESERIALIZER, "records");
		op.add(Builder::status, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.longDeserializer()),
				"status");
		op.add(Builder::total, JsonpDeserializer.longDeserializer(), "total");
		op.add(Builder::forecastedJobs, JsonpDeserializer.integerDeserializer(), "forecasted_jobs");

	}

}
