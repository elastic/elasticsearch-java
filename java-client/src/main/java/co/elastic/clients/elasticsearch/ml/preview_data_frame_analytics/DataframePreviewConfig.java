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

import co.elastic.clients.elasticsearch.ml.DataframeAnalysisContainer;
import co.elastic.clients.elasticsearch.ml.DataframeAnalyticsSource;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.preview_data_frame_analytics.DataframePreviewConfig
public final class DataframePreviewConfig implements ToJsonp {
	private final DataframeAnalyticsSource source;

	private final DataframeAnalysisContainer analysis;

	@Nullable
	private final String modelMemoryLimit;

	@Nullable
	private final Number maxNumThreads;

	@Nullable
	private final JsonValue analyzedFields;

	// ---------------------------------------------------------------------------------------------

	protected DataframePreviewConfig(Builder builder) {

		this.source = Objects.requireNonNull(builder.source, "source");
		this.analysis = Objects.requireNonNull(builder.analysis, "analysis");
		this.modelMemoryLimit = builder.modelMemoryLimit;
		this.maxNumThreads = builder.maxNumThreads;
		this.analyzedFields = builder.analyzedFields;

	}

	/**
	 * API name: {@code source}
	 */
	public DataframeAnalyticsSource source() {
		return this.source;
	}

	/**
	 * API name: {@code analysis}
	 */
	public DataframeAnalysisContainer analysis() {
		return this.analysis;
	}

	/**
	 * API name: {@code model_memory_limit}
	 */
	@Nullable
	public String modelMemoryLimit() {
		return this.modelMemoryLimit;
	}

	/**
	 * API name: {@code max_num_threads}
	 */
	@Nullable
	public Number maxNumThreads() {
		return this.maxNumThreads;
	}

	/**
	 * API name: {@code analyzed_fields}
	 */
	@Nullable
	public JsonValue analyzedFields() {
		return this.analyzedFields;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("source");
		this.source.toJsonp(generator, mapper);

		generator.writeKey("analysis");
		this.analysis.toJsonp(generator, mapper);

		if (this.modelMemoryLimit != null) {

			generator.writeKey("model_memory_limit");
			generator.write(this.modelMemoryLimit);

		}
		if (this.maxNumThreads != null) {

			generator.writeKey("max_num_threads");
			generator.write(this.maxNumThreads.doubleValue());

		}
		if (this.analyzedFields != null) {

			generator.writeKey("analyzed_fields");
			generator.write(this.analyzedFields);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframePreviewConfig}.
	 */
	public static class Builder implements ObjectBuilder<DataframePreviewConfig> {
		private DataframeAnalyticsSource source;

		private DataframeAnalysisContainer analysis;

		@Nullable
		private String modelMemoryLimit;

		@Nullable
		private Number maxNumThreads;

		@Nullable
		private JsonValue analyzedFields;

		/**
		 * API name: {@code source}
		 */
		public Builder source(DataframeAnalyticsSource value) {
			this.source = value;
			return this;
		}

		/**
		 * API name: {@code source}
		 */
		public Builder source(Function<DataframeAnalyticsSource.Builder, ObjectBuilder<DataframeAnalyticsSource>> fn) {
			return this.source(fn.apply(new DataframeAnalyticsSource.Builder()).build());
		}

		/**
		 * API name: {@code analysis}
		 */
		public Builder analysis(DataframeAnalysisContainer value) {
			this.analysis = value;
			return this;
		}

		/**
		 * API name: {@code analysis}
		 */
		public Builder analysis(
				Function<DataframeAnalysisContainer.Builder, ObjectBuilder<DataframeAnalysisContainer>> fn) {
			return this.analysis(fn.apply(new DataframeAnalysisContainer.Builder()).build());
		}

		/**
		 * API name: {@code model_memory_limit}
		 */
		public Builder modelMemoryLimit(@Nullable String value) {
			this.modelMemoryLimit = value;
			return this;
		}

		/**
		 * API name: {@code max_num_threads}
		 */
		public Builder maxNumThreads(@Nullable Number value) {
			this.maxNumThreads = value;
			return this;
		}

		/**
		 * API name: {@code analyzed_fields}
		 */
		public Builder analyzedFields(@Nullable JsonValue value) {
			this.analyzedFields = value;
			return this;
		}

		/**
		 * Builds a {@link DataframePreviewConfig}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframePreviewConfig build() {

			return new DataframePreviewConfig(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for DataframePreviewConfig
	 */
	public static final JsonpDeserializer<DataframePreviewConfig> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, DataframePreviewConfig::setupDataframePreviewConfigDeserializer);

	protected static void setupDataframePreviewConfigDeserializer(
			DelegatingDeserializer<DataframePreviewConfig.Builder> op) {

		op.add(Builder::source, DataframeAnalyticsSource.DESERIALIZER, "source");
		op.add(Builder::analysis, DataframeAnalysisContainer.DESERIALIZER, "analysis");
		op.add(Builder::modelMemoryLimit, JsonpDeserializer.stringDeserializer(), "model_memory_limit");
		op.add(Builder::maxNumThreads, JsonpDeserializer.numberDeserializer(), "max_num_threads");
		op.add(Builder::analyzedFields, JsonpDeserializer.jsonValueDeserializer(), "analyzed_fields");

	}

}
