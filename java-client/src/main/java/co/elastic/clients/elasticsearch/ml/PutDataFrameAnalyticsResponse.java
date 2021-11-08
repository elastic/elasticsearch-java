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
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.put_data_frame_analytics.Response
@JsonpDeserializable
public class PutDataFrameAnalyticsResponse implements JsonpSerializable {
	private final String id;

	private final long createTime;

	private final String version;

	private final DataframeAnalyticsSource source;

	@Nullable
	private final String description;

	private final DataframeAnalyticsDestination dest;

	private final String modelMemoryLimit;

	private final boolean allowLazyStart;

	private final int maxNumThreads;

	private final DataframeAnalysis analysis;

	@Nullable
	private final JsonValue /* ml._types.DataframeAnalysisAnalyzedFields */ analyzedFields;

	// ---------------------------------------------------------------------------------------------

	private PutDataFrameAnalyticsResponse(Builder builder) {

		this.id = ModelTypeHelper.requireNonNull(builder.id, this, "id");
		this.createTime = ModelTypeHelper.requireNonNull(builder.createTime, this, "createTime");
		this.version = ModelTypeHelper.requireNonNull(builder.version, this, "version");
		this.source = ModelTypeHelper.requireNonNull(builder.source, this, "source");
		this.description = builder.description;
		this.dest = ModelTypeHelper.requireNonNull(builder.dest, this, "dest");
		this.modelMemoryLimit = ModelTypeHelper.requireNonNull(builder.modelMemoryLimit, this, "modelMemoryLimit");
		this.allowLazyStart = ModelTypeHelper.requireNonNull(builder.allowLazyStart, this, "allowLazyStart");
		this.maxNumThreads = ModelTypeHelper.requireNonNull(builder.maxNumThreads, this, "maxNumThreads");
		this.analysis = ModelTypeHelper.requireNonNull(builder.analysis, this, "analysis");
		this.analyzedFields = builder.analyzedFields;

	}

	public static PutDataFrameAnalyticsResponse of(Function<Builder, ObjectBuilder<PutDataFrameAnalyticsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Required - API name: {@code create_time}
	 */
	public final long createTime() {
		return this.createTime;
	}

	/**
	 * Required - API name: {@code version}
	 */
	public final String version() {
		return this.version;
	}

	/**
	 * Required - API name: {@code source}
	 */
	public final DataframeAnalyticsSource source() {
		return this.source;
	}

	/**
	 * API name: {@code description}
	 */
	@Nullable
	public final String description() {
		return this.description;
	}

	/**
	 * Required - API name: {@code dest}
	 */
	public final DataframeAnalyticsDestination dest() {
		return this.dest;
	}

	/**
	 * Required - API name: {@code model_memory_limit}
	 */
	public final String modelMemoryLimit() {
		return this.modelMemoryLimit;
	}

	/**
	 * Required - API name: {@code allow_lazy_start}
	 */
	public final boolean allowLazyStart() {
		return this.allowLazyStart;
	}

	/**
	 * Required - API name: {@code max_num_threads}
	 */
	public final int maxNumThreads() {
		return this.maxNumThreads;
	}

	/**
	 * Required - API name: {@code analysis}
	 */
	public final DataframeAnalysis analysis() {
		return this.analysis;
	}

	/**
	 * API name: {@code analyzed_fields}
	 */
	@Nullable
	public final JsonValue /* ml._types.DataframeAnalysisAnalyzedFields */ analyzedFields() {
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

		generator.writeKey("id");
		generator.write(this.id);

		generator.writeKey("create_time");
		generator.write(this.createTime);

		generator.writeKey("version");
		generator.write(this.version);

		generator.writeKey("source");
		this.source.serialize(generator, mapper);

		if (this.description != null) {
			generator.writeKey("description");
			generator.write(this.description);

		}
		generator.writeKey("dest");
		this.dest.serialize(generator, mapper);

		generator.writeKey("model_memory_limit");
		generator.write(this.modelMemoryLimit);

		generator.writeKey("allow_lazy_start");
		generator.write(this.allowLazyStart);

		generator.writeKey("max_num_threads");
		generator.write(this.maxNumThreads);

		generator.writeKey("analysis");
		this.analysis.serialize(generator, mapper);

		if (this.analyzedFields != null) {
			generator.writeKey("analyzed_fields");
			generator.write(this.analyzedFields);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutDataFrameAnalyticsResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<PutDataFrameAnalyticsResponse> {
		private String id;

		private Long createTime;

		private String version;

		private DataframeAnalyticsSource source;

		@Nullable
		private String description;

		private DataframeAnalyticsDestination dest;

		private String modelMemoryLimit;

		private Boolean allowLazyStart;

		private Integer maxNumThreads;

		private DataframeAnalysis analysis;

		@Nullable
		private JsonValue /* ml._types.DataframeAnalysisAnalyzedFields */ analyzedFields;

		/**
		 * Required - API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - API name: {@code create_time}
		 */
		public final Builder createTime(long value) {
			this.createTime = value;
			return this;
		}

		/**
		 * Required - API name: {@code version}
		 */
		public final Builder version(String value) {
			this.version = value;
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
		 * API name: {@code description}
		 */
		public final Builder description(@Nullable String value) {
			this.description = value;
			return this;
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
		 * Required - API name: {@code model_memory_limit}
		 */
		public final Builder modelMemoryLimit(String value) {
			this.modelMemoryLimit = value;
			return this;
		}

		/**
		 * Required - API name: {@code allow_lazy_start}
		 */
		public final Builder allowLazyStart(boolean value) {
			this.allowLazyStart = value;
			return this;
		}

		/**
		 * Required - API name: {@code max_num_threads}
		 */
		public final Builder maxNumThreads(int value) {
			this.maxNumThreads = value;
			return this;
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
		 * API name: {@code analyzed_fields}
		 */
		public final Builder analyzedFields(@Nullable JsonValue /* ml._types.DataframeAnalysisAnalyzedFields */ value) {
			this.analyzedFields = value;
			return this;
		}

		/**
		 * Builds a {@link PutDataFrameAnalyticsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutDataFrameAnalyticsResponse build() {
			_checkSingleUse();

			return new PutDataFrameAnalyticsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutDataFrameAnalyticsResponse}
	 */
	public static final JsonpDeserializer<PutDataFrameAnalyticsResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
			Builder::new, PutDataFrameAnalyticsResponse::setupPutDataFrameAnalyticsResponseDeserializer,
			Builder::build);

	protected static void setupPutDataFrameAnalyticsResponseDeserializer(
			DelegatingDeserializer<PutDataFrameAnalyticsResponse.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::createTime, JsonpDeserializer.longDeserializer(), "create_time");
		op.add(Builder::version, JsonpDeserializer.stringDeserializer(), "version");
		op.add(Builder::source, DataframeAnalyticsSource._DESERIALIZER, "source");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::dest, DataframeAnalyticsDestination._DESERIALIZER, "dest");
		op.add(Builder::modelMemoryLimit, JsonpDeserializer.stringDeserializer(), "model_memory_limit");
		op.add(Builder::allowLazyStart, JsonpDeserializer.booleanDeserializer(), "allow_lazy_start");
		op.add(Builder::maxNumThreads, JsonpDeserializer.integerDeserializer(), "max_num_threads");
		op.add(Builder::analysis, DataframeAnalysis._DESERIALIZER, "analysis");
		op.add(Builder::analyzedFields, JsonpDeserializer.jsonValueDeserializer(), "analyzed_fields");

	}

}
