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
import java.lang.Long;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.get_jobs.Response
@JsonpDeserializable
public class GetJobsResponse implements JsonpSerializable {
	private final long count;

	private final List<Job> jobs;

	// ---------------------------------------------------------------------------------------------

	private GetJobsResponse(Builder builder) {

		this.count = ModelTypeHelper.requireNonNull(builder.count, this, "count");
		this.jobs = ModelTypeHelper.unmodifiableRequired(builder.jobs, this, "jobs");

	}

	public static GetJobsResponse of(Function<Builder, ObjectBuilder<GetJobsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code count}
	 */
	public final long count() {
		return this.count;
	}

	/**
	 * Required - API name: {@code jobs}
	 */
	public final List<Job> jobs() {
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

		if (ModelTypeHelper.isDefined(this.jobs)) {
			generator.writeKey("jobs");
			generator.writeStartArray();
			for (Job item0 : this.jobs) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetJobsResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GetJobsResponse> {
		private Long count;

		private List<Job> jobs;

		/**
		 * Required - API name: {@code count}
		 */
		public final Builder count(long value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - API name: {@code jobs}
		 */
		public final Builder jobs(List<Job> value) {
			this.jobs = value;
			return this;
		}

		/**
		 * Required - API name: {@code jobs}
		 */
		public final Builder jobs(Job... value) {
			this.jobs = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code jobs}
		 */
		@SafeVarargs
		public final Builder jobs(Function<Job.Builder, ObjectBuilder<Job>>... fns) {
			this.jobs = new ArrayList<>(fns.length);
			for (Function<Job.Builder, ObjectBuilder<Job>> fn : fns) {
				this.jobs.add(fn.apply(new Job.Builder()).build());
			}
			return this;
		}

		/**
		 * Builds a {@link GetJobsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetJobsResponse build() {
			_checkSingleUse();

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
