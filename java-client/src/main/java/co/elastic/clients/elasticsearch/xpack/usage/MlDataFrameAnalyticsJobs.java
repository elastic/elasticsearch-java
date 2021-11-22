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

import co.elastic.clients.elasticsearch._types.EmptyObject;
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
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: xpack.usage.MlDataFrameAnalyticsJobs
@JsonpDeserializable
public class MlDataFrameAnalyticsJobs implements JsonpSerializable {
	@Nullable
	private final MlDataFrameAnalyticsJobsMemory memoryUsage;

	private final MlDataFrameAnalyticsJobsCount all;

	@Nullable
	private final EmptyObject analysisCounts;

	// ---------------------------------------------------------------------------------------------

	private MlDataFrameAnalyticsJobs(Builder builder) {

		this.memoryUsage = builder.memoryUsage;
		this.all = ModelTypeHelper.requireNonNull(builder.all, this, "all");
		this.analysisCounts = builder.analysisCounts;

	}

	public static MlDataFrameAnalyticsJobs of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
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
	public final EmptyObject analysisCounts() {
		return this.analysisCounts;
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

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MlDataFrameAnalyticsJobs}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<MlDataFrameAnalyticsJobs> {
		@Nullable
		private MlDataFrameAnalyticsJobsMemory memoryUsage;

		private MlDataFrameAnalyticsJobsCount all;

		@Nullable
		private EmptyObject analysisCounts;

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
		public final Builder memoryUsage(Consumer<MlDataFrameAnalyticsJobsMemory.Builder> fn) {
			MlDataFrameAnalyticsJobsMemory.Builder builder = new MlDataFrameAnalyticsJobsMemory.Builder();
			fn.accept(builder);
			return this.memoryUsage(builder.build());
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
		public final Builder all(Consumer<MlDataFrameAnalyticsJobsCount.Builder> fn) {
			MlDataFrameAnalyticsJobsCount.Builder builder = new MlDataFrameAnalyticsJobsCount.Builder();
			fn.accept(builder);
			return this.all(builder.build());
		}

		/**
		 * API name: {@code analysis_counts}
		 */
		public final Builder analysisCounts(@Nullable EmptyObject value) {
			this.analysisCounts = value;
			return this;
		}

		/**
		 * API name: {@code analysis_counts}
		 */
		public final Builder analysisCounts(Consumer<EmptyObject.Builder> fn) {
			EmptyObject.Builder builder = new EmptyObject.Builder();
			fn.accept(builder);
			return this.analysisCounts(builder.build());
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
		op.add(Builder::analysisCounts, EmptyObject._DESERIALIZER, "analysis_counts");

	}

}
