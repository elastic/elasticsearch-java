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

package co.elastic.clients.elasticsearch.ml.preview_data_frame_analytics;

import co.elastic.clients.elasticsearch.ml.DataframeAnalysis;
import co.elastic.clients.elasticsearch.ml.DataframeAnalysisAnalyzedFields;
import co.elastic.clients.elasticsearch.ml.DataframeAnalyticsSource;
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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.preview_data_frame_analytics.DataframePreviewConfig

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#ml.preview_data_frame_analytics.DataframePreviewConfig">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataframePreviewConfig implements JsonpSerializable {
	private final DataframeAnalyticsSource source;

	private final DataframeAnalysis analysis;

	@Nullable
	private final String modelMemoryLimit;

	@Nullable
	private final Integer maxNumThreads;

	@Nullable
	private final DataframeAnalysisAnalyzedFields analyzedFields;

	// ---------------------------------------------------------------------------------------------

	private DataframePreviewConfig(Builder builder) {

		this.source = ApiTypeHelper.requireNonNull(builder.source, this, "source");
		this.analysis = ApiTypeHelper.requireNonNull(builder.analysis, this, "analysis");
		this.modelMemoryLimit = builder.modelMemoryLimit;
		this.maxNumThreads = builder.maxNumThreads;
		this.analyzedFields = builder.analyzedFields;

	}

	public static DataframePreviewConfig of(Function<Builder, ObjectBuilder<DataframePreviewConfig>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code source}
	 */
	public final DataframeAnalyticsSource source() {
		return this.source;
	}

	/**
	 * Required - API name: {@code analysis}
	 */
	public final DataframeAnalysis analysis() {
		return this.analysis;
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
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("source");
		this.source.serialize(generator, mapper);

		generator.writeKey("analysis");
		this.analysis.serialize(generator, mapper);

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

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframePreviewConfig}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DataframePreviewConfig> {
		private DataframeAnalyticsSource source;

		private DataframeAnalysis analysis;

		@Nullable
		private String modelMemoryLimit;

		@Nullable
		private Integer maxNumThreads;

		@Nullable
		private DataframeAnalysisAnalyzedFields analyzedFields;

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

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataframePreviewConfig}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframePreviewConfig build() {
			_checkSingleUse();

			return new DataframePreviewConfig(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataframePreviewConfig}
	 */
	public static final JsonpDeserializer<DataframePreviewConfig> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DataframePreviewConfig::setupDataframePreviewConfigDeserializer);

	protected static void setupDataframePreviewConfigDeserializer(
			ObjectDeserializer<DataframePreviewConfig.Builder> op) {

		op.add(Builder::source, DataframeAnalyticsSource._DESERIALIZER, "source");
		op.add(Builder::analysis, DataframeAnalysis._DESERIALIZER, "analysis");
		op.add(Builder::modelMemoryLimit, JsonpDeserializer.stringDeserializer(), "model_memory_limit");
		op.add(Builder::maxNumThreads, JsonpDeserializer.integerDeserializer(), "max_num_threads");
		op.add(Builder::analyzedFields, DataframeAnalysisAnalyzedFields._DESERIALIZER, "analyzed_fields");

	}

}
