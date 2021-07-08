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

package co.elastic.clients.elasticsearch.cat.transforms;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import javax.annotation.Nullable;

// typedef: cat.transforms.TransformsRecord
public final class TransformsRecord implements ToJsonp {
	@Nullable
	private final String id;

	@Nullable
	private final String state;

	@Nullable
	private final String checkpoint;

	@Nullable
	private final String documentsProcessed;

	@Nullable
	private final String checkpointProgress;

	@Nullable
	private final String lastSearchTime;

	@Nullable
	private final String changesLastDetectionTime;

	@Nullable
	private final String createTime;

	@Nullable
	private final String version;

	@Nullable
	private final String sourceIndex;

	@Nullable
	private final String destIndex;

	@Nullable
	private final String pipeline;

	@Nullable
	private final String description;

	@Nullable
	private final String transformType;

	@Nullable
	private final String frequency;

	@Nullable
	private final String maxPageSearchSize;

	@Nullable
	private final String docsPerSecond;

	@Nullable
	private final String reason;

	@Nullable
	private final String searchTotal;

	@Nullable
	private final String searchFailure;

	@Nullable
	private final String searchTime;

	@Nullable
	private final String indexTotal;

	@Nullable
	private final String indexFailure;

	@Nullable
	private final String indexTime;

	@Nullable
	private final String documentsIndexed;

	@Nullable
	private final String deleteTime;

	@Nullable
	private final String documentsDeleted;

	@Nullable
	private final String triggerCount;

	@Nullable
	private final String pagesProcessed;

	@Nullable
	private final String processingTime;

	@Nullable
	private final String checkpointDurationTimeExpAvg;

	@Nullable
	private final String indexedDocumentsExpAvg;

	@Nullable
	private final String processedDocumentsExpAvg;

	// ---------------------------------------------------------------------------------------------

	protected TransformsRecord(Builder builder) {

		this.id = builder.id;
		this.state = builder.state;
		this.checkpoint = builder.checkpoint;
		this.documentsProcessed = builder.documentsProcessed;
		this.checkpointProgress = builder.checkpointProgress;
		this.lastSearchTime = builder.lastSearchTime;
		this.changesLastDetectionTime = builder.changesLastDetectionTime;
		this.createTime = builder.createTime;
		this.version = builder.version;
		this.sourceIndex = builder.sourceIndex;
		this.destIndex = builder.destIndex;
		this.pipeline = builder.pipeline;
		this.description = builder.description;
		this.transformType = builder.transformType;
		this.frequency = builder.frequency;
		this.maxPageSearchSize = builder.maxPageSearchSize;
		this.docsPerSecond = builder.docsPerSecond;
		this.reason = builder.reason;
		this.searchTotal = builder.searchTotal;
		this.searchFailure = builder.searchFailure;
		this.searchTime = builder.searchTime;
		this.indexTotal = builder.indexTotal;
		this.indexFailure = builder.indexFailure;
		this.indexTime = builder.indexTime;
		this.documentsIndexed = builder.documentsIndexed;
		this.deleteTime = builder.deleteTime;
		this.documentsDeleted = builder.documentsDeleted;
		this.triggerCount = builder.triggerCount;
		this.pagesProcessed = builder.pagesProcessed;
		this.processingTime = builder.processingTime;
		this.checkpointDurationTimeExpAvg = builder.checkpointDurationTimeExpAvg;
		this.indexedDocumentsExpAvg = builder.indexedDocumentsExpAvg;
		this.processedDocumentsExpAvg = builder.processedDocumentsExpAvg;

	}

	/**
	 * the id
	 *
	 * API name: {@code id}
	 */
	@Nullable
	public String id() {
		return this.id;
	}

	/**
	 * transform state
	 *
	 * API name: {@code state}
	 */
	@Nullable
	public String state() {
		return this.state;
	}

	/**
	 * checkpoint
	 *
	 * API name: {@code checkpoint}
	 */
	@Nullable
	public String checkpoint() {
		return this.checkpoint;
	}

	/**
	 * the number of documents read from source indices and processed
	 *
	 * API name: {@code documents_processed}
	 */
	@Nullable
	public String documentsProcessed() {
		return this.documentsProcessed;
	}

	/**
	 * progress of the checkpoint
	 *
	 * API name: {@code checkpoint_progress}
	 */
	@Nullable
	public String checkpointProgress() {
		return this.checkpointProgress;
	}

	/**
	 * last time transform searched for updates
	 *
	 * API name: {@code last_search_time}
	 */
	@Nullable
	public String lastSearchTime() {
		return this.lastSearchTime;
	}

	/**
	 * changes last detected time
	 *
	 * API name: {@code changes_last_detection_time}
	 */
	@Nullable
	public String changesLastDetectionTime() {
		return this.changesLastDetectionTime;
	}

	/**
	 * transform creation time
	 *
	 * API name: {@code create_time}
	 */
	@Nullable
	public String createTime() {
		return this.createTime;
	}

	/**
	 * the version of Elasticsearch when the transform was created
	 *
	 * API name: {@code version}
	 */
	@Nullable
	public String version() {
		return this.version;
	}

	/**
	 * source index
	 *
	 * API name: {@code source_index}
	 */
	@Nullable
	public String sourceIndex() {
		return this.sourceIndex;
	}

	/**
	 * destination index
	 *
	 * API name: {@code dest_index}
	 */
	@Nullable
	public String destIndex() {
		return this.destIndex;
	}

	/**
	 * transform pipeline
	 *
	 * API name: {@code pipeline}
	 */
	@Nullable
	public String pipeline() {
		return this.pipeline;
	}

	/**
	 * description
	 *
	 * API name: {@code description}
	 */
	@Nullable
	public String description() {
		return this.description;
	}

	/**
	 * batch or continuous transform
	 *
	 * API name: {@code transform_type}
	 */
	@Nullable
	public String transformType() {
		return this.transformType;
	}

	/**
	 * frequency of transform
	 *
	 * API name: {@code frequency}
	 */
	@Nullable
	public String frequency() {
		return this.frequency;
	}

	/**
	 * max page search size
	 *
	 * API name: {@code max_page_search_size}
	 */
	@Nullable
	public String maxPageSearchSize() {
		return this.maxPageSearchSize;
	}

	/**
	 * docs per second
	 *
	 * API name: {@code docs_per_second}
	 */
	@Nullable
	public String docsPerSecond() {
		return this.docsPerSecond;
	}

	/**
	 * reason for the current state
	 *
	 * API name: {@code reason}
	 */
	@Nullable
	public String reason() {
		return this.reason;
	}

	/**
	 * total number of search phases
	 *
	 * API name: {@code search_total}
	 */
	@Nullable
	public String searchTotal() {
		return this.searchTotal;
	}

	/**
	 * total number of search failures
	 *
	 * API name: {@code search_failure}
	 */
	@Nullable
	public String searchFailure() {
		return this.searchFailure;
	}

	/**
	 * total search time
	 *
	 * API name: {@code search_time}
	 */
	@Nullable
	public String searchTime() {
		return this.searchTime;
	}

	/**
	 * total number of index phases done by the transform
	 *
	 * API name: {@code index_total}
	 */
	@Nullable
	public String indexTotal() {
		return this.indexTotal;
	}

	/**
	 * total number of index failures
	 *
	 * API name: {@code index_failure}
	 */
	@Nullable
	public String indexFailure() {
		return this.indexFailure;
	}

	/**
	 * total time spent indexing documents
	 *
	 * API name: {@code index_time}
	 */
	@Nullable
	public String indexTime() {
		return this.indexTime;
	}

	/**
	 * the number of documents written to the destination index
	 *
	 * API name: {@code documents_indexed}
	 */
	@Nullable
	public String documentsIndexed() {
		return this.documentsIndexed;
	}

	/**
	 * total time spent deleting documents
	 *
	 * API name: {@code delete_time}
	 */
	@Nullable
	public String deleteTime() {
		return this.deleteTime;
	}

	/**
	 * the number of documents deleted from the destination index
	 *
	 * API name: {@code documents_deleted}
	 */
	@Nullable
	public String documentsDeleted() {
		return this.documentsDeleted;
	}

	/**
	 * the number of times the transform has been triggered
	 *
	 * API name: {@code trigger_count}
	 */
	@Nullable
	public String triggerCount() {
		return this.triggerCount;
	}

	/**
	 * the number of pages processed
	 *
	 * API name: {@code pages_processed}
	 */
	@Nullable
	public String pagesProcessed() {
		return this.pagesProcessed;
	}

	/**
	 * the total time spent processing documents
	 *
	 * API name: {@code processing_time}
	 */
	@Nullable
	public String processingTime() {
		return this.processingTime;
	}

	/**
	 * exponential average checkpoint processing time (milliseconds)
	 *
	 * API name: {@code checkpoint_duration_time_exp_avg}
	 */
	@Nullable
	public String checkpointDurationTimeExpAvg() {
		return this.checkpointDurationTimeExpAvg;
	}

	/**
	 * exponential average number of documents indexed
	 *
	 * API name: {@code indexed_documents_exp_avg}
	 */
	@Nullable
	public String indexedDocumentsExpAvg() {
		return this.indexedDocumentsExpAvg;
	}

	/**
	 * exponential average number of documents processed
	 *
	 * API name: {@code processed_documents_exp_avg}
	 */
	@Nullable
	public String processedDocumentsExpAvg() {
		return this.processedDocumentsExpAvg;
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
		if (this.state != null) {

			generator.writeKey("state");
			generator.write(this.state);

		}
		if (this.checkpoint != null) {

			generator.writeKey("checkpoint");
			generator.write(this.checkpoint);

		}
		if (this.documentsProcessed != null) {

			generator.writeKey("documents_processed");
			generator.write(this.documentsProcessed);

		}
		if (this.checkpointProgress != null) {

			generator.writeKey("checkpoint_progress");
			generator.write(this.checkpointProgress);

		}
		if (this.lastSearchTime != null) {

			generator.writeKey("last_search_time");
			generator.write(this.lastSearchTime);

		}
		if (this.changesLastDetectionTime != null) {

			generator.writeKey("changes_last_detection_time");
			generator.write(this.changesLastDetectionTime);

		}
		if (this.createTime != null) {

			generator.writeKey("create_time");
			generator.write(this.createTime);

		}
		if (this.version != null) {

			generator.writeKey("version");
			generator.write(this.version);

		}
		if (this.sourceIndex != null) {

			generator.writeKey("source_index");
			generator.write(this.sourceIndex);

		}
		if (this.destIndex != null) {

			generator.writeKey("dest_index");
			generator.write(this.destIndex);

		}
		if (this.pipeline != null) {

			generator.writeKey("pipeline");
			generator.write(this.pipeline);

		}
		if (this.description != null) {

			generator.writeKey("description");
			generator.write(this.description);

		}
		if (this.transformType != null) {

			generator.writeKey("transform_type");
			generator.write(this.transformType);

		}
		if (this.frequency != null) {

			generator.writeKey("frequency");
			generator.write(this.frequency);

		}
		if (this.maxPageSearchSize != null) {

			generator.writeKey("max_page_search_size");
			generator.write(this.maxPageSearchSize);

		}
		if (this.docsPerSecond != null) {

			generator.writeKey("docs_per_second");
			generator.write(this.docsPerSecond);

		}
		if (this.reason != null) {

			generator.writeKey("reason");
			generator.write(this.reason);

		}
		if (this.searchTotal != null) {

			generator.writeKey("search_total");
			generator.write(this.searchTotal);

		}
		if (this.searchFailure != null) {

			generator.writeKey("search_failure");
			generator.write(this.searchFailure);

		}
		if (this.searchTime != null) {

			generator.writeKey("search_time");
			generator.write(this.searchTime);

		}
		if (this.indexTotal != null) {

			generator.writeKey("index_total");
			generator.write(this.indexTotal);

		}
		if (this.indexFailure != null) {

			generator.writeKey("index_failure");
			generator.write(this.indexFailure);

		}
		if (this.indexTime != null) {

			generator.writeKey("index_time");
			generator.write(this.indexTime);

		}
		if (this.documentsIndexed != null) {

			generator.writeKey("documents_indexed");
			generator.write(this.documentsIndexed);

		}
		if (this.deleteTime != null) {

			generator.writeKey("delete_time");
			generator.write(this.deleteTime);

		}
		if (this.documentsDeleted != null) {

			generator.writeKey("documents_deleted");
			generator.write(this.documentsDeleted);

		}
		if (this.triggerCount != null) {

			generator.writeKey("trigger_count");
			generator.write(this.triggerCount);

		}
		if (this.pagesProcessed != null) {

			generator.writeKey("pages_processed");
			generator.write(this.pagesProcessed);

		}
		if (this.processingTime != null) {

			generator.writeKey("processing_time");
			generator.write(this.processingTime);

		}
		if (this.checkpointDurationTimeExpAvg != null) {

			generator.writeKey("checkpoint_duration_time_exp_avg");
			generator.write(this.checkpointDurationTimeExpAvg);

		}
		if (this.indexedDocumentsExpAvg != null) {

			generator.writeKey("indexed_documents_exp_avg");
			generator.write(this.indexedDocumentsExpAvg);

		}
		if (this.processedDocumentsExpAvg != null) {

			generator.writeKey("processed_documents_exp_avg");
			generator.write(this.processedDocumentsExpAvg);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TransformsRecord}.
	 */
	public static class Builder implements ObjectBuilder<TransformsRecord> {
		@Nullable
		private String id;

		@Nullable
		private String state;

		@Nullable
		private String checkpoint;

		@Nullable
		private String documentsProcessed;

		@Nullable
		private String checkpointProgress;

		@Nullable
		private String lastSearchTime;

		@Nullable
		private String changesLastDetectionTime;

		@Nullable
		private String createTime;

		@Nullable
		private String version;

		@Nullable
		private String sourceIndex;

		@Nullable
		private String destIndex;

		@Nullable
		private String pipeline;

		@Nullable
		private String description;

		@Nullable
		private String transformType;

		@Nullable
		private String frequency;

		@Nullable
		private String maxPageSearchSize;

		@Nullable
		private String docsPerSecond;

		@Nullable
		private String reason;

		@Nullable
		private String searchTotal;

		@Nullable
		private String searchFailure;

		@Nullable
		private String searchTime;

		@Nullable
		private String indexTotal;

		@Nullable
		private String indexFailure;

		@Nullable
		private String indexTime;

		@Nullable
		private String documentsIndexed;

		@Nullable
		private String deleteTime;

		@Nullable
		private String documentsDeleted;

		@Nullable
		private String triggerCount;

		@Nullable
		private String pagesProcessed;

		@Nullable
		private String processingTime;

		@Nullable
		private String checkpointDurationTimeExpAvg;

		@Nullable
		private String indexedDocumentsExpAvg;

		@Nullable
		private String processedDocumentsExpAvg;

		/**
		 * the id
		 *
		 * API name: {@code id}
		 */
		public Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * transform state
		 *
		 * API name: {@code state}
		 */
		public Builder state(@Nullable String value) {
			this.state = value;
			return this;
		}

		/**
		 * checkpoint
		 *
		 * API name: {@code checkpoint}
		 */
		public Builder checkpoint(@Nullable String value) {
			this.checkpoint = value;
			return this;
		}

		/**
		 * the number of documents read from source indices and processed
		 *
		 * API name: {@code documents_processed}
		 */
		public Builder documentsProcessed(@Nullable String value) {
			this.documentsProcessed = value;
			return this;
		}

		/**
		 * progress of the checkpoint
		 *
		 * API name: {@code checkpoint_progress}
		 */
		public Builder checkpointProgress(@Nullable String value) {
			this.checkpointProgress = value;
			return this;
		}

		/**
		 * last time transform searched for updates
		 *
		 * API name: {@code last_search_time}
		 */
		public Builder lastSearchTime(@Nullable String value) {
			this.lastSearchTime = value;
			return this;
		}

		/**
		 * changes last detected time
		 *
		 * API name: {@code changes_last_detection_time}
		 */
		public Builder changesLastDetectionTime(@Nullable String value) {
			this.changesLastDetectionTime = value;
			return this;
		}

		/**
		 * transform creation time
		 *
		 * API name: {@code create_time}
		 */
		public Builder createTime(@Nullable String value) {
			this.createTime = value;
			return this;
		}

		/**
		 * the version of Elasticsearch when the transform was created
		 *
		 * API name: {@code version}
		 */
		public Builder version(@Nullable String value) {
			this.version = value;
			return this;
		}

		/**
		 * source index
		 *
		 * API name: {@code source_index}
		 */
		public Builder sourceIndex(@Nullable String value) {
			this.sourceIndex = value;
			return this;
		}

		/**
		 * destination index
		 *
		 * API name: {@code dest_index}
		 */
		public Builder destIndex(@Nullable String value) {
			this.destIndex = value;
			return this;
		}

		/**
		 * transform pipeline
		 *
		 * API name: {@code pipeline}
		 */
		public Builder pipeline(@Nullable String value) {
			this.pipeline = value;
			return this;
		}

		/**
		 * description
		 *
		 * API name: {@code description}
		 */
		public Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * batch or continuous transform
		 *
		 * API name: {@code transform_type}
		 */
		public Builder transformType(@Nullable String value) {
			this.transformType = value;
			return this;
		}

		/**
		 * frequency of transform
		 *
		 * API name: {@code frequency}
		 */
		public Builder frequency(@Nullable String value) {
			this.frequency = value;
			return this;
		}

		/**
		 * max page search size
		 *
		 * API name: {@code max_page_search_size}
		 */
		public Builder maxPageSearchSize(@Nullable String value) {
			this.maxPageSearchSize = value;
			return this;
		}

		/**
		 * docs per second
		 *
		 * API name: {@code docs_per_second}
		 */
		public Builder docsPerSecond(@Nullable String value) {
			this.docsPerSecond = value;
			return this;
		}

		/**
		 * reason for the current state
		 *
		 * API name: {@code reason}
		 */
		public Builder reason(@Nullable String value) {
			this.reason = value;
			return this;
		}

		/**
		 * total number of search phases
		 *
		 * API name: {@code search_total}
		 */
		public Builder searchTotal(@Nullable String value) {
			this.searchTotal = value;
			return this;
		}

		/**
		 * total number of search failures
		 *
		 * API name: {@code search_failure}
		 */
		public Builder searchFailure(@Nullable String value) {
			this.searchFailure = value;
			return this;
		}

		/**
		 * total search time
		 *
		 * API name: {@code search_time}
		 */
		public Builder searchTime(@Nullable String value) {
			this.searchTime = value;
			return this;
		}

		/**
		 * total number of index phases done by the transform
		 *
		 * API name: {@code index_total}
		 */
		public Builder indexTotal(@Nullable String value) {
			this.indexTotal = value;
			return this;
		}

		/**
		 * total number of index failures
		 *
		 * API name: {@code index_failure}
		 */
		public Builder indexFailure(@Nullable String value) {
			this.indexFailure = value;
			return this;
		}

		/**
		 * total time spent indexing documents
		 *
		 * API name: {@code index_time}
		 */
		public Builder indexTime(@Nullable String value) {
			this.indexTime = value;
			return this;
		}

		/**
		 * the number of documents written to the destination index
		 *
		 * API name: {@code documents_indexed}
		 */
		public Builder documentsIndexed(@Nullable String value) {
			this.documentsIndexed = value;
			return this;
		}

		/**
		 * total time spent deleting documents
		 *
		 * API name: {@code delete_time}
		 */
		public Builder deleteTime(@Nullable String value) {
			this.deleteTime = value;
			return this;
		}

		/**
		 * the number of documents deleted from the destination index
		 *
		 * API name: {@code documents_deleted}
		 */
		public Builder documentsDeleted(@Nullable String value) {
			this.documentsDeleted = value;
			return this;
		}

		/**
		 * the number of times the transform has been triggered
		 *
		 * API name: {@code trigger_count}
		 */
		public Builder triggerCount(@Nullable String value) {
			this.triggerCount = value;
			return this;
		}

		/**
		 * the number of pages processed
		 *
		 * API name: {@code pages_processed}
		 */
		public Builder pagesProcessed(@Nullable String value) {
			this.pagesProcessed = value;
			return this;
		}

		/**
		 * the total time spent processing documents
		 *
		 * API name: {@code processing_time}
		 */
		public Builder processingTime(@Nullable String value) {
			this.processingTime = value;
			return this;
		}

		/**
		 * exponential average checkpoint processing time (milliseconds)
		 *
		 * API name: {@code checkpoint_duration_time_exp_avg}
		 */
		public Builder checkpointDurationTimeExpAvg(@Nullable String value) {
			this.checkpointDurationTimeExpAvg = value;
			return this;
		}

		/**
		 * exponential average number of documents indexed
		 *
		 * API name: {@code indexed_documents_exp_avg}
		 */
		public Builder indexedDocumentsExpAvg(@Nullable String value) {
			this.indexedDocumentsExpAvg = value;
			return this;
		}

		/**
		 * exponential average number of documents processed
		 *
		 * API name: {@code processed_documents_exp_avg}
		 */
		public Builder processedDocumentsExpAvg(@Nullable String value) {
			this.processedDocumentsExpAvg = value;
			return this;
		}

		/**
		 * Builds a {@link TransformsRecord}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TransformsRecord build() {

			return new TransformsRecord(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for TransformsRecord
	 */
	public static final JsonpDeserializer<TransformsRecord> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, TransformsRecord::setupTransformsRecordDeserializer);

	protected static void setupTransformsRecordDeserializer(DelegatingDeserializer<TransformsRecord.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::state, JsonpDeserializer.stringDeserializer(), "state", "s");
		op.add(Builder::checkpoint, JsonpDeserializer.stringDeserializer(), "checkpoint", "c");
		op.add(Builder::documentsProcessed, JsonpDeserializer.stringDeserializer(), "documents_processed", "docp",
				"documentsProcessed");
		op.add(Builder::checkpointProgress, JsonpDeserializer.stringDeserializer(), "checkpoint_progress", "cp",
				"checkpointProgress");
		op.add(Builder::lastSearchTime, JsonpDeserializer.stringDeserializer(), "last_search_time", "lst",
				"lastSearchTime");
		op.add(Builder::changesLastDetectionTime, JsonpDeserializer.stringDeserializer(), "changes_last_detection_time",
				"cldt");
		op.add(Builder::createTime, JsonpDeserializer.stringDeserializer(), "create_time", "ct", "createTime");
		op.add(Builder::version, JsonpDeserializer.stringDeserializer(), "version", "v");
		op.add(Builder::sourceIndex, JsonpDeserializer.stringDeserializer(), "source_index", "si", "sourceIndex");
		op.add(Builder::destIndex, JsonpDeserializer.stringDeserializer(), "dest_index", "di", "destIndex");
		op.add(Builder::pipeline, JsonpDeserializer.stringDeserializer(), "pipeline", "p");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description", "d");
		op.add(Builder::transformType, JsonpDeserializer.stringDeserializer(), "transform_type", "tt");
		op.add(Builder::frequency, JsonpDeserializer.stringDeserializer(), "frequency", "f");
		op.add(Builder::maxPageSearchSize, JsonpDeserializer.stringDeserializer(), "max_page_search_size", "mpsz");
		op.add(Builder::docsPerSecond, JsonpDeserializer.stringDeserializer(), "docs_per_second", "dps");
		op.add(Builder::reason, JsonpDeserializer.stringDeserializer(), "reason", "r");
		op.add(Builder::searchTotal, JsonpDeserializer.stringDeserializer(), "search_total", "st");
		op.add(Builder::searchFailure, JsonpDeserializer.stringDeserializer(), "search_failure", "sf");
		op.add(Builder::searchTime, JsonpDeserializer.stringDeserializer(), "search_time", "stime");
		op.add(Builder::indexTotal, JsonpDeserializer.stringDeserializer(), "index_total", "it");
		op.add(Builder::indexFailure, JsonpDeserializer.stringDeserializer(), "index_failure", "if");
		op.add(Builder::indexTime, JsonpDeserializer.stringDeserializer(), "index_time", "itime");
		op.add(Builder::documentsIndexed, JsonpDeserializer.stringDeserializer(), "documents_indexed", "doci");
		op.add(Builder::deleteTime, JsonpDeserializer.stringDeserializer(), "delete_time", "dtime");
		op.add(Builder::documentsDeleted, JsonpDeserializer.stringDeserializer(), "documents_deleted", "docd");
		op.add(Builder::triggerCount, JsonpDeserializer.stringDeserializer(), "trigger_count", "tc");
		op.add(Builder::pagesProcessed, JsonpDeserializer.stringDeserializer(), "pages_processed", "pp");
		op.add(Builder::processingTime, JsonpDeserializer.stringDeserializer(), "processing_time", "pt");
		op.add(Builder::checkpointDurationTimeExpAvg, JsonpDeserializer.stringDeserializer(),
				"checkpoint_duration_time_exp_avg", "cdtea", "checkpointTimeExpAvg");
		op.add(Builder::indexedDocumentsExpAvg, JsonpDeserializer.stringDeserializer(), "indexed_documents_exp_avg",
				"idea");
		op.add(Builder::processedDocumentsExpAvg, JsonpDeserializer.stringDeserializer(), "processed_documents_exp_avg",
				"pdea");

	}

}
