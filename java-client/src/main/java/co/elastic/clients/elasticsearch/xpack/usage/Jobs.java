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

import co.elastic.clients.elasticsearch.ml.Job;
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
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: xpack.usage.Jobs

/**
 *
 * @see <a href="../../doc-files/api-spec.html#xpack.usage.Jobs">API
 *      specification</a>
 */
@JsonpDeserializable
public class Jobs implements JsonpSerializable {
	private final Map<String, Job> jobs;

	@Nullable
	private final AllJobs all;

	// ---------------------------------------------------------------------------------------------

	private Jobs(Builder builder) {

		this.jobs = ApiTypeHelper.unmodifiable(builder.jobs);

		this.all = builder.all;

	}

	public static Jobs of(Function<Builder, ObjectBuilder<Jobs>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Detailed job data
	 */
	public final Map<String, Job> jobs() {
		return this.jobs;
	}

	/**
	 * API name: {@code _all}
	 */
	@Nullable
	public final AllJobs all() {
		return this.all;
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

		for (Map.Entry<String, Job> item0 : this.jobs.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}

		if (this.all != null) {
			generator.writeKey("_all");
			this.all.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Jobs}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Jobs> {
		@Nullable
		private Map<String, Job> jobs = new HashMap<>();

		/**
		 * Detailed job data
		 * <p>
		 * Adds all entries of <code>map</code> to <code>jobs</code>.
		 */
		public final Builder jobs(Map<String, Job> map) {
			this.jobs = _mapPutAll(this.jobs, map);
			return this;
		}

		/**
		 * Detailed job data
		 * <p>
		 * Adds an entry to <code>jobs</code>.
		 */
		public final Builder jobs(String key, Job value) {
			this.jobs = _mapPut(this.jobs, key, value);
			return this;
		}

		/**
		 * Detailed job data
		 * <p>
		 * Adds an entry to <code>jobs</code> using a builder lambda.
		 */
		public final Builder jobs(String key, Function<Job.Builder, ObjectBuilder<Job>> fn) {
			return jobs(key, fn.apply(new Job.Builder()).build());
		}

		@Nullable
		private AllJobs all;

		/**
		 * API name: {@code _all}
		 */
		public final Builder all(@Nullable AllJobs value) {
			this.all = value;
			return this;
		}

		/**
		 * API name: {@code _all}
		 */
		public final Builder all(Function<AllJobs.Builder, ObjectBuilder<AllJobs>> fn) {
			return this.all(fn.apply(new AllJobs.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Jobs}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Jobs build() {
			_checkSingleUse();

			return new Jobs(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Jobs}
	 */
	public static final JsonpDeserializer<Jobs> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Jobs::setupJobsDeserializer);

	protected static void setupJobsDeserializer(ObjectDeserializer<Jobs.Builder> op) {

		op.add(Builder::all, AllJobs._DESERIALIZER, "_all");

		op.setUnknownFieldHandler((builder, name, parser, mapper) -> {
			builder.jobs(name, Job._DESERIALIZER.deserialize(parser, mapper));
		});

	}

}
