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
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.get_jobs.Response
@JsonpDeserializable
public final class GetJobsResponse implements JsonpSerializable {
	private final long count;

	private final List<Job> jobs;

	// ---------------------------------------------------------------------------------------------

	public GetJobsResponse(Builder builder) {

		this.count = Objects.requireNonNull(builder.count, "count");
		this.jobs = ModelTypeHelper.unmodifiableNonNull(builder.jobs, "jobs");

	}

	public GetJobsResponse(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code count}
	 */
	public long count() {
		return this.count;
	}

	/**
	 * Required - API name: {@code jobs}
	 */
	public List<Job> jobs() {
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
		generator.write(this.count);

		generator.writeKey("jobs");
		generator.writeStartArray();
		for (Job item0 : this.jobs) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetJobsResponse}.
	 */
	public static class Builder implements ObjectBuilder<GetJobsResponse> {
		private Long count;

		private List<Job> jobs;

		/**
		 * Required - API name: {@code count}
		 */
		public Builder count(long value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - API name: {@code jobs}
		 */
		public Builder jobs(List<Job> value) {
			this.jobs = value;
			return this;
		}

		/**
		 * Required - API name: {@code jobs}
		 */
		public Builder jobs(Job... value) {
			this.jobs = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #jobs(List)}, creating the list if needed.
		 */
		public Builder addJobs(Job value) {
			if (this.jobs == null) {
				this.jobs = new ArrayList<>();
			}
			this.jobs.add(value);
			return this;
		}

		/**
		 * Set {@link #jobs(List)} to a singleton list.
		 */
		public Builder jobs(Function<Job.Builder, ObjectBuilder<Job>> fn) {
			return this.jobs(fn.apply(new Job.Builder()).build());
		}

		/**
		 * Add a value to {@link #jobs(List)}, creating the list if needed.
		 */
		public Builder addJobs(Function<Job.Builder, ObjectBuilder<Job>> fn) {
			return this.addJobs(fn.apply(new Job.Builder()).build());
		}

		/**
		 * Builds a {@link GetJobsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetJobsResponse build() {

			return new GetJobsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetJobsResponse}
	 */
	public static final JsonpDeserializer<GetJobsResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			GetJobsResponse::setupGetJobsResponseDeserializer, Builder::build);

	protected static void setupGetJobsResponseDeserializer(DelegatingDeserializer<GetJobsResponse.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");
		op.add(Builder::jobs, JsonpDeserializer.arrayDeserializer(Job._DESERIALIZER), "jobs");

	}

}
