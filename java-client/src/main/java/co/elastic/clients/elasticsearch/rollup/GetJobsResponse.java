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

package co.elastic.clients.elasticsearch.rollup;

import co.elastic.clients.elasticsearch.rollup.get_jobs.RollupJob;
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
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: rollup.get_jobs.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#rollup.get_jobs.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetJobsResponse implements JsonpSerializable {
	private final List<RollupJob> jobs;

	// ---------------------------------------------------------------------------------------------

	private GetJobsResponse(Builder builder) {

		this.jobs = ApiTypeHelper.unmodifiableRequired(builder.jobs, this, "jobs");

	}

	public static GetJobsResponse of(Function<Builder, ObjectBuilder<GetJobsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code jobs}
	 */
	public final List<RollupJob> jobs() {
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

		if (ApiTypeHelper.isDefined(this.jobs)) {
			generator.writeKey("jobs");
			generator.writeStartArray();
			for (RollupJob item0 : this.jobs) {
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
		private List<RollupJob> jobs;

		/**
		 * Required - API name: {@code jobs}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>jobs</code>.
		 */
		public final Builder jobs(List<RollupJob> list) {
			this.jobs = _listAddAll(this.jobs, list);
			return this;
		}

		/**
		 * Required - API name: {@code jobs}
		 * <p>
		 * Adds one or more values to <code>jobs</code>.
		 */
		public final Builder jobs(RollupJob value, RollupJob... values) {
			this.jobs = _listAdd(this.jobs, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code jobs}
		 * <p>
		 * Adds a value to <code>jobs</code> using a builder lambda.
		 */
		public final Builder jobs(Function<RollupJob.Builder, ObjectBuilder<RollupJob>> fn) {
			return jobs(fn.apply(new RollupJob.Builder()).build());
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

		op.add(Builder::jobs, JsonpDeserializer.arrayDeserializer(RollupJob._DESERIALIZER), "jobs");

	}

}
