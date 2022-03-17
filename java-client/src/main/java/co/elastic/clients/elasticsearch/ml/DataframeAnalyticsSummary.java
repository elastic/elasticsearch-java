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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.DataframeAnalyticsSummary

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ml._types.DataframeAnalyticsSummary">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataframeAnalyticsSummary implements JsonpSerializable {
	private final String id;

	private final DataframeAnalyticsSource source;

	private final DataframeAnalyticsDestination dest;

	private final DataframeAnalysis analysis;

	@Nullable
	private final String description;

	@Nullable
	private final String modelMemoryLimit;

	@Nullable
	private final Integer maxNumThreads;

	@Nullable
	private final DataframeAnalysisAnalyzedFields analyzedFields;

	@Nullable
	private final Boolean allowLazyStart;

	@Nullable
	private final Long createTime;

	@Nullable
	private final String version;

	// ---------------------------------------------------------------------------------------------

	private DataframeAnalyticsSummary(Builder builder) {

		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.source = ApiTypeHelper.requireNonNull(builder.source, this, "source");
		this.dest = ApiTypeHelper.requireNonNull(builder.dest, this, "dest");
		this.analysis = ApiTypeHelper.requireNonNull(builder.analysis, this, "analysis");
		this.description = builder.description;
		this.modelMemoryLimit = builder.modelMemoryLimit;
		this.maxNumThreads = builder.maxNumThreads;
		this.analyzedFields = builder.analyzedFields;
		this.allowLazyStart = builder.allowLazyStart;
		this.createTime = builder.createTime;
		this.version = builder.version;

	}

	public static DataframeAnalyticsSummary of(Function<Builder, ObjectBuilder<DataframeAnalyticsSummary>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Required - API name: {@code source}
	 */
	public final DataframeAnalyticsSource source() {
		return this.source;
	}

	/**
	 * Required - API name: {@code dest}
	 */
	public final DataframeAnalyticsDestination dest() {
		return this.dest;
	}

	/**
	 * Required - API name: {@code analysis}
	 */
	public final DataframeAnalysis analysis() {
		return this.analysis;
	}

	/**
	 * API name: {@code description}
	 */
	@Nullable
	public final String description() {
		return this.description;
	}

	/**
	 * API name: {@code model_memory_limit}
	 */
	@Nullable
	public final String modelMemoryLimit() {
		return this.modelMemoryLimit;
	}

	/**
	 * API name: {@code max_num_threads}
	 */
	@Nullable
	public final Integer maxNumThreads() {
		return this.maxNumThreads;
	}

	/**
	 * API name: {@code analyzed_fields}
	 */
	@Nullable
	public final DataframeAnalysisAnalyzedFields analyzedFields() {
		return this.analyzedFields;
	}

	/**
	 * API name: {@code allow_lazy_start}
	 */
	@Nullable
	public final Boolean allowLazyStart() {
		return this.allowLazyStart;
	}

	/**
	 * API name: {@code create_time}
	 */
	@Nullable
	public final Long createTime() {
		return this.createTime;
	}

	/**
	 * API name: {@code version}
	 */
	@Nullable
	public final String version() {
		return this.version;
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

		generator.writeKey("id");
		generator.write(this.id);

		generator.writeKey("source");
		this.source.serialize(generator, mapper);

		generator.writeKey("dest");
		this.dest.serialize(generator, mapper);

		generator.writeKey("analysis");
		this.analysis.serialize(generator, mapper);

		if (this.description != null) {
			generator.writeKey("description");
			generator.write(this.description);

		}
		if (this.modelMemoryLimit != null) {
			generator.writeKey("model_memory_limit");
			generator.write(this.modelMemoryLimit);

		}
		if (this.maxNumThreads != null) {
			generator.writeKey("max_num_threads");
			generator.write(this.maxNumThreads);

		}
		if (this.analyzedFields != null) {
			generator.writeKey("analyzed_fields");
			this.analyzedFields.serialize(generator, mapper);

		}
		if (this.allowLazyStart != null) {
			generator.writeKey("allow_lazy_start");
			generator.write(this.allowLazyStart);

		}
		if (this.createTime != null) {
			generator.writeKey("create_time");
			generator.write(this.createTime);

		}
		if (this.version != null) {
			generator.writeKey("version");
			generator.write(this.version);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeAnalyticsSummary}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DataframeAnalyticsSummary> {
		private String id;

		private DataframeAnalyticsSource source;

		private DataframeAnalyticsDestination dest;

		private DataframeAnalysis analysis;

		@Nullable
		private String description;

		@Nullable
		private String modelMemoryLimit;

		@Nullable
		private Integer maxNumThreads;

		@Nullable
		private DataframeAnalysisAnalyzedFields analyzedFields;

		@Nullable
		private Boolean allowLazyStart;

		@Nullable
		private Long createTime;

		@Nullable
		private String version;

		/**
		 * Required - API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - API name: {@code source}
		 */
		public final Builder source(DataframeAnalyticsSource value) {
			this.source = value;
			return this;
		}

		/**
		 * Required - API name: {@code source}
		 */
		public final Builder source(
				Function<DataframeAnalyticsSource.Builder, ObjectBuilder<DataframeAnalyticsSource>> fn) {
			return this.source(fn.apply(new DataframeAnalyticsSource.Builder()).build());
		}

		/**
		 * Required - API name: {@code dest}
		 */
		public final Builder dest(DataframeAnalyticsDestination value) {
			this.dest = value;
			return this;
		}

		/**
		 * Required - API name: {@code dest}
		 */
		public final Builder dest(
				Function<DataframeAnalyticsDestination.Builder, ObjectBuilder<DataframeAnalyticsDestination>> fn) {
			return this.dest(fn.apply(new DataframeAnalyticsDestination.Builder()).build());
		}

		/**
		 * Required - API name: {@code analysis}
		 */
		public final Builder analysis(DataframeAnalysis value) {
			this.analysis = value;
			return this;
		}

		/**
		 * Required - API name: {@code analysis}
		 */
		public final Builder analysis(Function<DataframeAnalysis.Builder, ObjectBuilder<DataframeAnalysis>> fn) {
			return this.analysis(fn.apply(new DataframeAnalysis.Builder()).build());
		}

		/**
		 * API name: {@code description}
		 */
		public final Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * API name: {@code model_memory_limit}
		 */
		public final Builder modelMemoryLimit(@Nullable String value) {
			this.modelMemoryLimit = value;
			return this;
		}

		/**
		 * API name: {@code max_num_threads}
		 */
		public final Builder maxNumThreads(@Nullable Integer value) {
			this.maxNumThreads = value;
			return this;
		}

		/**
		 * API name: {@code analyzed_fields}
		 */
		public final Builder analyzedFields(@Nullable DataframeAnalysisAnalyzedFields value) {
			this.analyzedFields = value;
			return this;
		}

		/**
		 * API name: {@code analyzed_fields}
		 */
		public final Builder analyzedFields(
				Function<DataframeAnalysisAnalyzedFields.Builder, ObjectBuilder<DataframeAnalysisAnalyzedFields>> fn) {
			return this.analyzedFields(fn.apply(new DataframeAnalysisAnalyzedFields.Builder()).build());
		}

		/**
		 * API name: {@code allow_lazy_start}
		 */
		public final Builder allowLazyStart(@Nullable Boolean value) {
			this.allowLazyStart = value;
			return this;
		}

		/**
		 * API name: {@code create_time}
		 */
		public final Builder createTime(@Nullable Long value) {
			this.createTime = value;
			return this;
		}

		/**
		 * API name: {@code version}
		 */
		public final Builder version(@Nullable String value) {
			this.version = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataframeAnalyticsSummary}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeAnalyticsSummary build() {
			_checkSingleUse();

			return new DataframeAnalyticsSummary(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataframeAnalyticsSummary}
	 */
	public static final JsonpDeserializer<DataframeAnalyticsSummary> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DataframeAnalyticsSummary::setupDataframeAnalyticsSummaryDeserializer);

	protected static void setupDataframeAnalyticsSummaryDeserializer(
			ObjectDeserializer<DataframeAnalyticsSummary.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::source, DataframeAnalyticsSource._DESERIALIZER, "source");
		op.add(Builder::dest, DataframeAnalyticsDestination._DESERIALIZER, "dest");
		op.add(Builder::analysis, DataframeAnalysis._DESERIALIZER, "analysis");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::modelMemoryLimit, JsonpDeserializer.stringDeserializer(), "model_memory_limit");
		op.add(Builder::maxNumThreads, JsonpDeserializer.integerDeserializer(), "max_num_threads");
		op.add(Builder::analyzedFields, DataframeAnalysisAnalyzedFields._DESERIALIZER, "analyzed_fields");
		op.add(Builder::allowLazyStart, JsonpDeserializer.booleanDeserializer(), "allow_lazy_start");
		op.add(Builder::createTime, JsonpDeserializer.longDeserializer(), "create_time");
		op.add(Builder::version, JsonpDeserializer.stringDeserializer(), "version");

	}

}
