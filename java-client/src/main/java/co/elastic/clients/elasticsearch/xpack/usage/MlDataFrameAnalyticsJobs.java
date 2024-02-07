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

package co.elastic.clients.elasticsearch.xpack.usage;

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

// typedef: xpack.usage.MlDataFrameAnalyticsJobs

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#xpack.usage.MlDataFrameAnalyticsJobs">API
 *      specification</a>
 */
@JsonpDeserializable
public class MlDataFrameAnalyticsJobs implements JsonpSerializable {
	@Nullable
	private final MlDataFrameAnalyticsJobsMemory memoryUsage;

	private final MlDataFrameAnalyticsJobsCount all;

	@Nullable
	private final MlDataFrameAnalyticsJobsAnalysis analysisCounts;

	@Nullable
	private final MlDataFrameAnalyticsJobsCount stopped;

	// ---------------------------------------------------------------------------------------------

	private MlDataFrameAnalyticsJobs(Builder builder) {

		this.memoryUsage = builder.memoryUsage;
		this.all = ApiTypeHelper.requireNonNull(builder.all, this, "all");
		this.analysisCounts = builder.analysisCounts;
		this.stopped = builder.stopped;

	}

	public static MlDataFrameAnalyticsJobs of(Function<Builder, ObjectBuilder<MlDataFrameAnalyticsJobs>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code memory_usage}
	 */
	@Nullable
	public final MlDataFrameAnalyticsJobsMemory memoryUsage() {
		return this.memoryUsage;
	}

	/**
	 * Required - API name: {@code _all}
	 */
	public final MlDataFrameAnalyticsJobsCount all() {
		return this.all;
	}

	/**
	 * API name: {@code analysis_counts}
	 */
	@Nullable
	public final MlDataFrameAnalyticsJobsAnalysis analysisCounts() {
		return this.analysisCounts;
	}

	/**
	 * API name: {@code stopped}
	 */
	@Nullable
	public final MlDataFrameAnalyticsJobsCount stopped() {
		return this.stopped;
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

		if (this.memoryUsage != null) {
			generator.writeKey("memory_usage");
			this.memoryUsage.serialize(generator, mapper);

		}
		generator.writeKey("_all");
		this.all.serialize(generator, mapper);

		if (this.analysisCounts != null) {
			generator.writeKey("analysis_counts");
			this.analysisCounts.serialize(generator, mapper);

		}
		if (this.stopped != null) {
			generator.writeKey("stopped");
			this.stopped.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MlDataFrameAnalyticsJobs}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<MlDataFrameAnalyticsJobs> {
		@Nullable
		private MlDataFrameAnalyticsJobsMemory memoryUsage;

		private MlDataFrameAnalyticsJobsCount all;

		@Nullable
		private MlDataFrameAnalyticsJobsAnalysis analysisCounts;

		@Nullable
		private MlDataFrameAnalyticsJobsCount stopped;

		/**
		 * API name: {@code memory_usage}
		 */
		public final Builder memoryUsage(@Nullable MlDataFrameAnalyticsJobsMemory value) {
			this.memoryUsage = value;
			return this;
		}

		/**
		 * API name: {@code memory_usage}
		 */
		public final Builder memoryUsage(
				Function<MlDataFrameAnalyticsJobsMemory.Builder, ObjectBuilder<MlDataFrameAnalyticsJobsMemory>> fn) {
			return this.memoryUsage(fn.apply(new MlDataFrameAnalyticsJobsMemory.Builder()).build());
		}

		/**
		 * Required - API name: {@code _all}
		 */
		public final Builder all(MlDataFrameAnalyticsJobsCount value) {
			this.all = value;
			return this;
		}

		/**
		 * Required - API name: {@code _all}
		 */
		public final Builder all(
				Function<MlDataFrameAnalyticsJobsCount.Builder, ObjectBuilder<MlDataFrameAnalyticsJobsCount>> fn) {
			return this.all(fn.apply(new MlDataFrameAnalyticsJobsCount.Builder()).build());
		}

		/**
		 * API name: {@code analysis_counts}
		 */
		public final Builder analysisCounts(@Nullable MlDataFrameAnalyticsJobsAnalysis value) {
			this.analysisCounts = value;
			return this;
		}

		/**
		 * API name: {@code analysis_counts}
		 */
		public final Builder analysisCounts(
				Function<MlDataFrameAnalyticsJobsAnalysis.Builder, ObjectBuilder<MlDataFrameAnalyticsJobsAnalysis>> fn) {
			return this.analysisCounts(fn.apply(new MlDataFrameAnalyticsJobsAnalysis.Builder()).build());
		}

		/**
		 * API name: {@code stopped}
		 */
		public final Builder stopped(@Nullable MlDataFrameAnalyticsJobsCount value) {
			this.stopped = value;
			return this;
		}

		/**
		 * API name: {@code stopped}
		 */
		public final Builder stopped(
				Function<MlDataFrameAnalyticsJobsCount.Builder, ObjectBuilder<MlDataFrameAnalyticsJobsCount>> fn) {
			return this.stopped(fn.apply(new MlDataFrameAnalyticsJobsCount.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MlDataFrameAnalyticsJobs}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MlDataFrameAnalyticsJobs build() {
			_checkSingleUse();

			return new MlDataFrameAnalyticsJobs(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MlDataFrameAnalyticsJobs}
	 */
	public static final JsonpDeserializer<MlDataFrameAnalyticsJobs> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, MlDataFrameAnalyticsJobs::setupMlDataFrameAnalyticsJobsDeserializer);

	protected static void setupMlDataFrameAnalyticsJobsDeserializer(
			ObjectDeserializer<MlDataFrameAnalyticsJobs.Builder> op) {

		op.add(Builder::memoryUsage, MlDataFrameAnalyticsJobsMemory._DESERIALIZER, "memory_usage");
		op.add(Builder::all, MlDataFrameAnalyticsJobsCount._DESERIALIZER, "_all");
		op.add(Builder::analysisCounts, MlDataFrameAnalyticsJobsAnalysis._DESERIALIZER, "analysis_counts");
		op.add(Builder::stopped, MlDataFrameAnalyticsJobsCount._DESERIALIZER, "stopped");

	}

}
