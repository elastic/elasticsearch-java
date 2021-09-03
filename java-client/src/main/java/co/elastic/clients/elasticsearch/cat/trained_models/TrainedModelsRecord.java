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

package co.elastic.clients.elasticsearch.cat.trained_models;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import javax.annotation.Nullable;

// typedef: cat.trained_models.TrainedModelsRecord
public final class TrainedModelsRecord implements ToJsonp {
	@Nullable
	private final String id;

	@Nullable
	private final String createdBy;

	@Nullable
	private final JsonValue heapSize;

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
	private final String ingest_pipelines;

	@Nullable
	private final String ingest_count;

	@Nullable
	private final String ingest_time;

	@Nullable
	private final String ingest_current;

	@Nullable
	private final String ingest_failed;

	@Nullable
	private final String dataFrame_id;

	@Nullable
	private final String dataFrame_createTime;

	@Nullable
	private final String dataFrame_sourceIndex;

	@Nullable
	private final String dataFrame_analysis;

	// ---------------------------------------------------------------------------------------------

	protected TrainedModelsRecord(Builder builder) {

		this.id = builder.id;
		this.createdBy = builder.createdBy;
		this.heapSize = builder.heapSize;
		this.operations = builder.operations;
		this.license = builder.license;
		this.createTime = builder.createTime;
		this.version = builder.version;
		this.description = builder.description;
		this.ingest_pipelines = builder.ingest_pipelines;
		this.ingest_count = builder.ingest_count;
		this.ingest_time = builder.ingest_time;
		this.ingest_current = builder.ingest_current;
		this.ingest_failed = builder.ingest_failed;
		this.dataFrame_id = builder.dataFrame_id;
		this.dataFrame_createTime = builder.dataFrame_createTime;
		this.dataFrame_sourceIndex = builder.dataFrame_sourceIndex;
		this.dataFrame_analysis = builder.dataFrame_analysis;

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
	public JsonValue heapSize() {
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
	public String ingest_pipelines() {
		return this.ingest_pipelines;
	}

	/**
	 * The total number of docs processed by the model
	 * <p>
	 * API name: {@code ingest.count}
	 */
	@Nullable
	public String ingest_count() {
		return this.ingest_count;
	}

	/**
	 * The total time spent processing docs with this model
	 * <p>
	 * API name: {@code ingest.time}
	 */
	@Nullable
	public String ingest_time() {
		return this.ingest_time;
	}

	/**
	 * The total documents currently being handled by the model
	 * <p>
	 * API name: {@code ingest.current}
	 */
	@Nullable
	public String ingest_current() {
		return this.ingest_current;
	}

	/**
	 * The total count of failed ingest attempts with this model
	 * <p>
	 * API name: {@code ingest.failed}
	 */
	@Nullable
	public String ingest_failed() {
		return this.ingest_failed;
	}

	/**
	 * The data frame analytics config id that created the model (if still
	 * available)
	 * <p>
	 * API name: {@code data_frame.id}
	 */
	@Nullable
	public String dataFrame_id() {
		return this.dataFrame_id;
	}

	/**
	 * The time the data frame analytics config was created
	 * <p>
	 * API name: {@code data_frame.create_time}
	 */
	@Nullable
	public String dataFrame_createTime() {
		return this.dataFrame_createTime;
	}

	/**
	 * The source index used to train in the data frame analysis
	 * <p>
	 * API name: {@code data_frame.source_index}
	 */
	@Nullable
	public String dataFrame_sourceIndex() {
		return this.dataFrame_sourceIndex;
	}

	/**
	 * The analysis used by the data frame to build the model
	 * <p>
	 * API name: {@code data_frame.analysis}
	 */
	@Nullable
	public String dataFrame_analysis() {
		return this.dataFrame_analysis;
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
		if (this.ingest_pipelines != null) {

			generator.writeKey("ingest.pipelines");
			generator.write(this.ingest_pipelines);

		}
		if (this.ingest_count != null) {

			generator.writeKey("ingest.count");
			generator.write(this.ingest_count);

		}
		if (this.ingest_time != null) {

			generator.writeKey("ingest.time");
			generator.write(this.ingest_time);

		}
		if (this.ingest_current != null) {

			generator.writeKey("ingest.current");
			generator.write(this.ingest_current);

		}
		if (this.ingest_failed != null) {

			generator.writeKey("ingest.failed");
			generator.write(this.ingest_failed);

		}
		if (this.dataFrame_id != null) {

			generator.writeKey("data_frame.id");
			generator.write(this.dataFrame_id);

		}
		if (this.dataFrame_createTime != null) {

			generator.writeKey("data_frame.create_time");
			generator.write(this.dataFrame_createTime);

		}
		if (this.dataFrame_sourceIndex != null) {

			generator.writeKey("data_frame.source_index");
			generator.write(this.dataFrame_sourceIndex);

		}
		if (this.dataFrame_analysis != null) {

			generator.writeKey("data_frame.analysis");
			generator.write(this.dataFrame_analysis);

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
		private JsonValue heapSize;

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
		private String ingest_pipelines;

		@Nullable
		private String ingest_count;

		@Nullable
		private String ingest_time;

		@Nullable
		private String ingest_current;

		@Nullable
		private String ingest_failed;

		@Nullable
		private String dataFrame_id;

		@Nullable
		private String dataFrame_createTime;

		@Nullable
		private String dataFrame_sourceIndex;

		@Nullable
		private String dataFrame_analysis;

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
		public Builder heapSize(@Nullable JsonValue value) {
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
		public Builder ingest_pipelines(@Nullable String value) {
			this.ingest_pipelines = value;
			return this;
		}

		/**
		 * The total number of docs processed by the model
		 * <p>
		 * API name: {@code ingest.count}
		 */
		public Builder ingest_count(@Nullable String value) {
			this.ingest_count = value;
			return this;
		}

		/**
		 * The total time spent processing docs with this model
		 * <p>
		 * API name: {@code ingest.time}
		 */
		public Builder ingest_time(@Nullable String value) {
			this.ingest_time = value;
			return this;
		}

		/**
		 * The total documents currently being handled by the model
		 * <p>
		 * API name: {@code ingest.current}
		 */
		public Builder ingest_current(@Nullable String value) {
			this.ingest_current = value;
			return this;
		}

		/**
		 * The total count of failed ingest attempts with this model
		 * <p>
		 * API name: {@code ingest.failed}
		 */
		public Builder ingest_failed(@Nullable String value) {
			this.ingest_failed = value;
			return this;
		}

		/**
		 * The data frame analytics config id that created the model (if still
		 * available)
		 * <p>
		 * API name: {@code data_frame.id}
		 */
		public Builder dataFrame_id(@Nullable String value) {
			this.dataFrame_id = value;
			return this;
		}

		/**
		 * The time the data frame analytics config was created
		 * <p>
		 * API name: {@code data_frame.create_time}
		 */
		public Builder dataFrame_createTime(@Nullable String value) {
			this.dataFrame_createTime = value;
			return this;
		}

		/**
		 * The source index used to train in the data frame analysis
		 * <p>
		 * API name: {@code data_frame.source_index}
		 */
		public Builder dataFrame_sourceIndex(@Nullable String value) {
			this.dataFrame_sourceIndex = value;
			return this;
		}

		/**
		 * The analysis used by the data frame to build the model
		 * <p>
		 * API name: {@code data_frame.analysis}
		 */
		public Builder dataFrame_analysis(@Nullable String value) {
			this.dataFrame_analysis = value;
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
	 * Json deserializer for TrainedModelsRecord
	 */
	public static final JsonpDeserializer<TrainedModelsRecord> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, TrainedModelsRecord::setupTrainedModelsRecordDeserializer);

	protected static void setupTrainedModelsRecordDeserializer(DelegatingDeserializer<TrainedModelsRecord.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::createdBy, JsonpDeserializer.stringDeserializer(), "created_by", "c", "createdBy");
		op.add(Builder::heapSize, JsonpDeserializer.jsonValueDeserializer(), "heap_size", "hs", "modelHeapSize");
		op.add(Builder::operations, JsonpDeserializer.stringDeserializer(), "operations", "o", "modelOperations");
		op.add(Builder::license, JsonpDeserializer.stringDeserializer(), "license", "l");
		op.add(Builder::createTime, JsonpDeserializer.stringDeserializer(), "create_time", "ct");
		op.add(Builder::version, JsonpDeserializer.stringDeserializer(), "version", "v");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description", "d");
		op.add(Builder::ingest_pipelines, JsonpDeserializer.stringDeserializer(), "ingest.pipelines", "ip",
				"ingestPipelines");
		op.add(Builder::ingest_count, JsonpDeserializer.stringDeserializer(), "ingest.count", "ic", "ingestCount");
		op.add(Builder::ingest_time, JsonpDeserializer.stringDeserializer(), "ingest.time", "it", "ingestTime");
		op.add(Builder::ingest_current, JsonpDeserializer.stringDeserializer(), "ingest.current", "icurr",
				"ingestCurrent");
		op.add(Builder::ingest_failed, JsonpDeserializer.stringDeserializer(), "ingest.failed", "if", "ingestFailed");
		op.add(Builder::dataFrame_id, JsonpDeserializer.stringDeserializer(), "data_frame.id", "dfid",
				"dataFrameAnalytics");
		op.add(Builder::dataFrame_createTime, JsonpDeserializer.stringDeserializer(), "data_frame.create_time", "dft",
				"dataFrameAnalyticsTime");
		op.add(Builder::dataFrame_sourceIndex, JsonpDeserializer.stringDeserializer(), "data_frame.source_index",
				"dfsi", "dataFrameAnalyticsSrcIndex");
		op.add(Builder::dataFrame_analysis, JsonpDeserializer.stringDeserializer(), "data_frame.analysis", "dfa",
				"dataFrameAnalyticsAnalysis");

	}

}
