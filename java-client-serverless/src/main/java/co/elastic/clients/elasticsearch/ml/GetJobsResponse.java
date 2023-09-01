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
import java.lang.Long;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.get_jobs.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml.get_jobs.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetJobsResponse implements JsonpSerializable {
	private final long count;

	private final List<Job> jobs;

	// ---------------------------------------------------------------------------------------------

	private GetJobsResponse(Builder builder) {

		this.count = ApiTypeHelper.requireNonNull(builder.count, this, "count");
		this.jobs = ApiTypeHelper.unmodifiableRequired(builder.jobs, this, "jobs");

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

		if (ApiTypeHelper.isDefined(this.jobs)) {
			generator.writeKey("jobs");
			generator.writeStartArray();
			for (Job item0 : this.jobs) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetJobsResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<GetJobsResponse> {
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
		 * <p>
		 * Adds all elements of <code>list</code> to <code>jobs</code>.
		 */
		public final Builder jobs(List<Job> list) {
			this.jobs = _listAddAll(this.jobs, list);
			return this;
		}

		/**
		 * Required - API name: {@code jobs}
		 * <p>
		 * Adds one or more values to <code>jobs</code>.
		 */
		public final Builder jobs(Job value, Job... values) {
			this.jobs = _listAdd(this.jobs, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code jobs}
		 * <p>
		 * Adds a value to <code>jobs</code> using a builder lambda.
		 */
		public final Builder jobs(Function<Job.Builder, ObjectBuilder<Job>> fn) {
			return jobs(fn.apply(new Job.Builder()).build());
		}

		@Override
		protected Builder self() {
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
			GetJobsResponse::setupGetJobsResponseDeserializer);

	protected static void setupGetJobsResponseDeserializer(ObjectDeserializer<GetJobsResponse.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");
		op.add(Builder::jobs, JsonpDeserializer.arrayDeserializer(Job._DESERIALIZER), "jobs");

	}

}
