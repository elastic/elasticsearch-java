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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.get_job_stats.Response
public final class GetJobStatsResponse implements JsonpSerializable {
	private final Number count;

	private final List<JobStats> jobs;

	// ---------------------------------------------------------------------------------------------

	public GetJobStatsResponse(Builder builder) {

		this.count = Objects.requireNonNull(builder.count, "count");
		this.jobs = Objects.requireNonNull(builder.jobs, "jobs");

	}

	/**
	 * API name: {@code count}
	 */
	public Number count() {
		return this.count;
	}

	/**
	 * API name: {@code jobs}
	 */
	public List<JobStats> jobs() {
		return this.jobs;
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

		generator.writeKey("count");
		generator.write(this.count.doubleValue());

		generator.writeKey("jobs");
		generator.writeStartArray();
		for (JobStats item0 : this.jobs) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetJobStatsResponse}.
	 */
	public static class Builder implements ObjectBuilder<GetJobStatsResponse> {
		private Number count;

		private List<JobStats> jobs;

		/**
		 * API name: {@code count}
		 */
		public Builder count(Number value) {
			this.count = value;
			return this;
		}

		/**
		 * API name: {@code jobs}
		 */
		public Builder jobs(List<JobStats> value) {
			this.jobs = value;
			return this;
		}

		/**
		 * API name: {@code jobs}
		 */
		public Builder jobs(JobStats... value) {
			this.jobs = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #jobs(List)}, creating the list if needed.
		 */
		public Builder addJobs(JobStats value) {
			if (this.jobs == null) {
				this.jobs = new ArrayList<>();
			}
			this.jobs.add(value);
			return this;
		}

		/**
		 * Set {@link #jobs(List)} to a singleton list.
		 */
		public Builder jobs(Function<JobStats.Builder, ObjectBuilder<JobStats>> fn) {
			return this.jobs(fn.apply(new JobStats.Builder()).build());
		}

		/**
		 * Add a value to {@link #jobs(List)}, creating the list if needed.
		 */
		public Builder addJobs(Function<JobStats.Builder, ObjectBuilder<JobStats>> fn) {
			return this.addJobs(fn.apply(new JobStats.Builder()).build());
		}

		/**
		 * Builds a {@link GetJobStatsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetJobStatsResponse build() {

			return new GetJobStatsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetJobStatsResponse}
	 */
	public static final JsonpDeserializer<GetJobStatsResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, GetJobStatsResponse::setupGetJobStatsResponseDeserializer);

	protected static void setupGetJobStatsResponseDeserializer(DelegatingDeserializer<GetJobStatsResponse.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.numberDeserializer(), "count");
		op.add(Builder::jobs, JsonpDeserializer.arrayDeserializer(JobStats.DESERIALIZER), "jobs");

	}

}
