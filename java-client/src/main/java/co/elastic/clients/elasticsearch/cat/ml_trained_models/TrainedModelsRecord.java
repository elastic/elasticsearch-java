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

package co.elastic.clients.elasticsearch.cat.ml_trained_models;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cat.ml_trained_models.TrainedModelsRecord
@JsonpDeserializable
public final class TrainedModelsRecord implements JsonpSerializable {
	@Nullable
	private final String id;

	@Nullable
	private final String createdBy;

	@Nullable
	private final String heapSize;

	@Nullable
	private final String operations;

	@Nullable
	private final String license;

	@Nullable
	private final String createTime;

	@Nullable
	private final String version;

	@Nullable
	private final String description;

	@Nullable
	private final String ingestPipelines;

	@Nullable
	private final String ingestCount;

	@Nullable
	private final String ingestTime;

	@Nullable
	private final String ingestCurrent;

	@Nullable
	private final String ingestFailed;

	@Nullable
	private final String dataFrameId;

	@Nullable
	private final String dataFrameCreateTime;

	@Nullable
	private final String dataFrameSourceIndex;

	@Nullable
	private final String dataFrameAnalysis;

	@Nullable
	private final String type;

	// ---------------------------------------------------------------------------------------------

	public TrainedModelsRecord(Builder builder) {

		this.id = builder.id;
		this.createdBy = builder.createdBy;
		this.heapSize = builder.heapSize;
		this.operations = builder.operations;
		this.license = builder.license;
		this.createTime = builder.createTime;
		this.version = builder.version;
		this.description = builder.description;
		this.ingestPipelines = builder.ingestPipelines;
		this.ingestCount = builder.ingestCount;
		this.ingestTime = builder.ingestTime;
		this.ingestCurrent = builder.ingestCurrent;
		this.ingestFailed = builder.ingestFailed;
		this.dataFrameId = builder.dataFrameId;
		this.dataFrameCreateTime = builder.dataFrameCreateTime;
		this.dataFrameSourceIndex = builder.dataFrameSourceIndex;
		this.dataFrameAnalysis = builder.dataFrameAnalysis;
		this.type = builder.type;

	}

	public TrainedModelsRecord(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * the trained model id
	 * <p>
	 * API name: {@code id}
	 */
	@Nullable
	public String id() {
		return this.id;
	}

	/**
	 * who created the model
	 * <p>
	 * API name: {@code created_by}
	 */
	@Nullable
	public String createdBy() {
		return this.createdBy;
	}

	/**
	 * the estimated heap size to keep the model in memory
	 * <p>
	 * API name: {@code heap_size}
	 */
	@Nullable
	public String heapSize() {
		return this.heapSize;
	}

	/**
	 * the estimated number of operations to use the model
	 * <p>
	 * API name: {@code operations}
	 */
	@Nullable
	public String operations() {
		return this.operations;
	}

	/**
	 * The license level of the model
	 * <p>
	 * API name: {@code license}
	 */
	@Nullable
	public String license() {
		return this.license;
	}

	/**
	 * The time the model was created
	 * <p>
	 * API name: {@code create_time}
	 */
	@Nullable
	public String createTime() {
		return this.createTime;
	}

	/**
	 * The version of Elasticsearch when the model was created
	 * <p>
	 * API name: {@code version}
	 */
	@Nullable
	public String version() {
		return this.version;
	}

	/**
	 * The model description
	 * <p>
	 * API name: {@code description}
	 */
	@Nullable
	public String description() {
		return this.description;
	}

	/**
	 * The number of pipelines referencing the model
	 * <p>
	 * API name: {@code ingest.pipelines}
	 */
	@Nullable
	public String ingestPipelines() {
		return this.ingestPipelines;
	}

	/**
	 * The total number of docs processed by the model
	 * <p>
	 * API name: {@code ingest.count}
	 */
	@Nullable
	public String ingestCount() {
		return this.ingestCount;
	}

	/**
	 * The total time spent processing docs with this model
	 * <p>
	 * API name: {@code ingest.time}
	 */
	@Nullable
	public String ingestTime() {
		return this.ingestTime;
	}

	/**
	 * The total documents currently being handled by the model
	 * <p>
	 * API name: {@code ingest.current}
	 */
	@Nullable
	public String ingestCurrent() {
		return this.ingestCurrent;
	}

	/**
	 * The total count of failed ingest attempts with this model
	 * <p>
	 * API name: {@code ingest.failed}
	 */
	@Nullable
	public String ingestFailed() {
		return this.ingestFailed;
	}

	/**
	 * The data frame analytics config id that created the model (if still
	 * available)
	 * <p>
	 * API name: {@code data_frame.id}
	 */
	@Nullable
	public String dataFrameId() {
		return this.dataFrameId;
	}

	/**
	 * The time the data frame analytics config was created
	 * <p>
	 * API name: {@code data_frame.create_time}
	 */
	@Nullable
	public String dataFrameCreateTime() {
		return this.dataFrameCreateTime;
	}

	/**
	 * The source index used to train in the data frame analysis
	 * <p>
	 * API name: {@code data_frame.source_index}
	 */
	@Nullable
	public String dataFrameSourceIndex() {
		return this.dataFrameSourceIndex;
	}

	/**
	 * The analysis used by the data frame to build the model
	 * <p>
	 * API name: {@code data_frame.analysis}
	 */
	@Nullable
	public String dataFrameAnalysis() {
		return this.dataFrameAnalysis;
	}

	/**
	 * API name: {@code type}
	 */
	@Nullable
	public String type() {
		return this.type;
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

		if (this.id != null) {

			generator.writeKey("id");
			generator.write(this.id);

		}
		if (this.createdBy != null) {

			generator.writeKey("created_by");
			generator.write(this.createdBy);

		}
		if (this.heapSize != null) {

			generator.writeKey("heap_size");
			generator.write(this.heapSize);

		}
		if (this.operations != null) {

			generator.writeKey("operations");
			generator.write(this.operations);

		}
		if (this.license != null) {

			generator.writeKey("license");
			generator.write(this.license);

		}
		if (this.createTime != null) {

			generator.writeKey("create_time");
			generator.write(this.createTime);

		}
		if (this.version != null) {

			generator.writeKey("version");
			generator.write(this.version);

		}
		if (this.description != null) {

			generator.writeKey("description");
			generator.write(this.description);

		}
		if (this.ingestPipelines != null) {

			generator.writeKey("ingest.pipelines");
			generator.write(this.ingestPipelines);

		}
		if (this.ingestCount != null) {

			generator.writeKey("ingest.count");
			generator.write(this.ingestCount);

		}
		if (this.ingestTime != null) {

			generator.writeKey("ingest.time");
			generator.write(this.ingestTime);

		}
		if (this.ingestCurrent != null) {

			generator.writeKey("ingest.current");
			generator.write(this.ingestCurrent);

		}
		if (this.ingestFailed != null) {

			generator.writeKey("ingest.failed");
			generator.write(this.ingestFailed);

		}
		if (this.dataFrameId != null) {

			generator.writeKey("data_frame.id");
			generator.write(this.dataFrameId);

		}
		if (this.dataFrameCreateTime != null) {

			generator.writeKey("data_frame.create_time");
			generator.write(this.dataFrameCreateTime);

		}
		if (this.dataFrameSourceIndex != null) {

			generator.writeKey("data_frame.source_index");
			generator.write(this.dataFrameSourceIndex);

		}
		if (this.dataFrameAnalysis != null) {

			generator.writeKey("data_frame.analysis");
			generator.write(this.dataFrameAnalysis);

		}
		if (this.type != null) {

			generator.writeKey("type");
			generator.write(this.type);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TrainedModelsRecord}.
	 */
	public static class Builder implements ObjectBuilder<TrainedModelsRecord> {
		@Nullable
		private String id;

		@Nullable
		private String createdBy;

		@Nullable
		private String heapSize;

		@Nullable
		private String operations;

		@Nullable
		private String license;

		@Nullable
		private String createTime;

		@Nullable
		private String version;

		@Nullable
		private String description;

		@Nullable
		private String ingestPipelines;

		@Nullable
		private String ingestCount;

		@Nullable
		private String ingestTime;

		@Nullable
		private String ingestCurrent;

		@Nullable
		private String ingestFailed;

		@Nullable
		private String dataFrameId;

		@Nullable
		private String dataFrameCreateTime;

		@Nullable
		private String dataFrameSourceIndex;

		@Nullable
		private String dataFrameAnalysis;

		@Nullable
		private String type;

		/**
		 * the trained model id
		 * <p>
		 * API name: {@code id}
		 */
		public Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * who created the model
		 * <p>
		 * API name: {@code created_by}
		 */
		public Builder createdBy(@Nullable String value) {
			this.createdBy = value;
			return this;
		}

		/**
		 * the estimated heap size to keep the model in memory
		 * <p>
		 * API name: {@code heap_size}
		 */
		public Builder heapSize(@Nullable String value) {
			this.heapSize = value;
			return this;
		}

		/**
		 * the estimated number of operations to use the model
		 * <p>
		 * API name: {@code operations}
		 */
		public Builder operations(@Nullable String value) {
			this.operations = value;
			return this;
		}

		/**
		 * The license level of the model
		 * <p>
		 * API name: {@code license}
		 */
		public Builder license(@Nullable String value) {
			this.license = value;
			return this;
		}

		/**
		 * The time the model was created
		 * <p>
		 * API name: {@code create_time}
		 */
		public Builder createTime(@Nullable String value) {
			this.createTime = value;
			return this;
		}

		/**
		 * The version of Elasticsearch when the model was created
		 * <p>
		 * API name: {@code version}
		 */
		public Builder version(@Nullable String value) {
			this.version = value;
			return this;
		}

		/**
		 * The model description
		 * <p>
		 * API name: {@code description}
		 */
		public Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * The number of pipelines referencing the model
		 * <p>
		 * API name: {@code ingest.pipelines}
		 */
		public Builder ingestPipelines(@Nullable String value) {
			this.ingestPipelines = value;
			return this;
		}

		/**
		 * The total number of docs processed by the model
		 * <p>
		 * API name: {@code ingest.count}
		 */
		public Builder ingestCount(@Nullable String value) {
			this.ingestCount = value;
			return this;
		}

		/**
		 * The total time spent processing docs with this model
		 * <p>
		 * API name: {@code ingest.time}
		 */
		public Builder ingestTime(@Nullable String value) {
			this.ingestTime = value;
			return this;
		}

		/**
		 * The total documents currently being handled by the model
		 * <p>
		 * API name: {@code ingest.current}
		 */
		public Builder ingestCurrent(@Nullable String value) {
			this.ingestCurrent = value;
			return this;
		}

		/**
		 * The total count of failed ingest attempts with this model
		 * <p>
		 * API name: {@code ingest.failed}
		 */
		public Builder ingestFailed(@Nullable String value) {
			this.ingestFailed = value;
			return this;
		}

		/**
		 * The data frame analytics config id that created the model (if still
		 * available)
		 * <p>
		 * API name: {@code data_frame.id}
		 */
		public Builder dataFrameId(@Nullable String value) {
			this.dataFrameId = value;
			return this;
		}

		/**
		 * The time the data frame analytics config was created
		 * <p>
		 * API name: {@code data_frame.create_time}
		 */
		public Builder dataFrameCreateTime(@Nullable String value) {
			this.dataFrameCreateTime = value;
			return this;
		}

		/**
		 * The source index used to train in the data frame analysis
		 * <p>
		 * API name: {@code data_frame.source_index}
		 */
		public Builder dataFrameSourceIndex(@Nullable String value) {
			this.dataFrameSourceIndex = value;
			return this;
		}

		/**
		 * The analysis used by the data frame to build the model
		 * <p>
		 * API name: {@code data_frame.analysis}
		 */
		public Builder dataFrameAnalysis(@Nullable String value) {
			this.dataFrameAnalysis = value;
			return this;
		}

		/**
		 * API name: {@code type}
		 */
		public Builder type(@Nullable String value) {
			this.type = value;
			return this;
		}

		/**
		 * Builds a {@link TrainedModelsRecord}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TrainedModelsRecord build() {

			return new TrainedModelsRecord(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TrainedModelsRecord}
	 */
	public static final JsonpDeserializer<TrainedModelsRecord> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TrainedModelsRecord::setupTrainedModelsRecordDeserializer, Builder::build);

	protected static void setupTrainedModelsRecordDeserializer(DelegatingDeserializer<TrainedModelsRecord.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::createdBy, JsonpDeserializer.stringDeserializer(), "created_by", "c", "createdBy");
		op.add(Builder::heapSize, JsonpDeserializer.stringDeserializer(), "heap_size", "hs", "modelHeapSize");
		op.add(Builder::operations, JsonpDeserializer.stringDeserializer(), "operations", "o", "modelOperations");
		op.add(Builder::license, JsonpDeserializer.stringDeserializer(), "license", "l");
		op.add(Builder::createTime, JsonpDeserializer.stringDeserializer(), "create_time", "ct");
		op.add(Builder::version, JsonpDeserializer.stringDeserializer(), "version", "v");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description", "d");
		op.add(Builder::ingestPipelines, JsonpDeserializer.stringDeserializer(), "ingest.pipelines", "ip",
				"ingestPipelines");
		op.add(Builder::ingestCount, JsonpDeserializer.stringDeserializer(), "ingest.count", "ic", "ingestCount");
		op.add(Builder::ingestTime, JsonpDeserializer.stringDeserializer(), "ingest.time", "it", "ingestTime");
		op.add(Builder::ingestCurrent, JsonpDeserializer.stringDeserializer(), "ingest.current", "icurr",
				"ingestCurrent");
		op.add(Builder::ingestFailed, JsonpDeserializer.stringDeserializer(), "ingest.failed", "if", "ingestFailed");
		op.add(Builder::dataFrameId, JsonpDeserializer.stringDeserializer(), "data_frame.id", "dfid",
				"dataFrameAnalytics");
		op.add(Builder::dataFrameCreateTime, JsonpDeserializer.stringDeserializer(), "data_frame.create_time", "dft",
				"dataFrameAnalyticsTime");
		op.add(Builder::dataFrameSourceIndex, JsonpDeserializer.stringDeserializer(), "data_frame.source_index", "dfsi",
				"dataFrameAnalyticsSrcIndex");
		op.add(Builder::dataFrameAnalysis, JsonpDeserializer.stringDeserializer(), "data_frame.analysis", "dfa",
				"dataFrameAnalyticsAnalysis");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");

	}

}
