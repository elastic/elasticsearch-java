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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cat.transforms.TransformsRecord

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#cat.transforms.TransformsRecord">API
 *      specification</a>
 */
@JsonpDeserializable
public class TransformsRecord implements JsonpSerializable {
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

	private TransformsRecord(Builder builder) {

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

	public static TransformsRecord of(Function<Builder, ObjectBuilder<TransformsRecord>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The transform identifier.
	 * <p>
	 * API name: {@code id}
	 */
	@Nullable
	public final String id() {
		return this.id;
	}

	/**
	 * The status of the transform. Returned values include: <code>aborting</code>:
	 * The transform is aborting.
	 * <code>failed: The transform failed. For more information about the failure, check the </code>reason<code>field.</code>indexing<code>: The transform is actively processing data and creating new documents. </code>started<code>: The transform is running but not actively indexing data. </code>stopped<code>: The transform is stopped. </code>stopping`:
	 * The transform is stopping.
	 * <p>
	 * API name: {@code state}
	 */
	@Nullable
	public final String state() {
		return this.state;
	}

	/**
	 * The sequence number for the checkpoint.
	 * <p>
	 * API name: {@code checkpoint}
	 */
	@Nullable
	public final String checkpoint() {
		return this.checkpoint;
	}

	/**
	 * The number of documents that have been processed from the source index of the
	 * transform.
	 * <p>
	 * API name: {@code documents_processed}
	 */
	@Nullable
	public final String documentsProcessed() {
		return this.documentsProcessed;
	}

	/**
	 * The progress of the next checkpoint that is currently in progress.
	 * <p>
	 * API name: {@code checkpoint_progress}
	 */
	@Nullable
	public final String checkpointProgress() {
		return this.checkpointProgress;
	}

	/**
	 * The timestamp of the last search in the source indices. This field is shown
	 * only if the transform is running.
	 * <p>
	 * API name: {@code last_search_time}
	 */
	@Nullable
	public final String lastSearchTime() {
		return this.lastSearchTime;
	}

	/**
	 * The timestamp when changes were last detected in the source indices.
	 * <p>
	 * API name: {@code changes_last_detection_time}
	 */
	@Nullable
	public final String changesLastDetectionTime() {
		return this.changesLastDetectionTime;
	}

	/**
	 * The time the transform was created.
	 * <p>
	 * API name: {@code create_time}
	 */
	@Nullable
	public final String createTime() {
		return this.createTime;
	}

	/**
	 * The version of Elasticsearch that existed on the node when the transform was
	 * created.
	 * <p>
	 * API name: {@code version}
	 */
	@Nullable
	public final String version() {
		return this.version;
	}

	/**
	 * The source indices for the transform.
	 * <p>
	 * API name: {@code source_index}
	 */
	@Nullable
	public final String sourceIndex() {
		return this.sourceIndex;
	}

	/**
	 * The destination index for the transform.
	 * <p>
	 * API name: {@code dest_index}
	 */
	@Nullable
	public final String destIndex() {
		return this.destIndex;
	}

	/**
	 * The unique identifier for the ingest pipeline.
	 * <p>
	 * API name: {@code pipeline}
	 */
	@Nullable
	public final String pipeline() {
		return this.pipeline;
	}

	/**
	 * The description of the transform.
	 * <p>
	 * API name: {@code description}
	 */
	@Nullable
	public final String description() {
		return this.description;
	}

	/**
	 * The type of transform: <code>batch</code> or <code>continuous</code>.
	 * <p>
	 * API name: {@code transform_type}
	 */
	@Nullable
	public final String transformType() {
		return this.transformType;
	}

	/**
	 * The interval between checks for changes in the source indices when the
	 * transform is running continuously.
	 * <p>
	 * API name: {@code frequency}
	 */
	@Nullable
	public final String frequency() {
		return this.frequency;
	}

	/**
	 * The initial page size that is used for the composite aggregation for each
	 * checkpoint.
	 * <p>
	 * API name: {@code max_page_search_size}
	 */
	@Nullable
	public final String maxPageSearchSize() {
		return this.maxPageSearchSize;
	}

	/**
	 * The number of input documents per second.
	 * <p>
	 * API name: {@code docs_per_second}
	 */
	@Nullable
	public final String docsPerSecond() {
		return this.docsPerSecond;
	}

	/**
	 * If a transform has a <code>failed</code> state, these details describe the
	 * reason for failure.
	 * <p>
	 * API name: {@code reason}
	 */
	@Nullable
	public final String reason() {
		return this.reason;
	}

	/**
	 * The total number of search operations on the source index for the transform.
	 * <p>
	 * API name: {@code search_total}
	 */
	@Nullable
	public final String searchTotal() {
		return this.searchTotal;
	}

	/**
	 * The total number of search failures.
	 * <p>
	 * API name: {@code search_failure}
	 */
	@Nullable
	public final String searchFailure() {
		return this.searchFailure;
	}

	/**
	 * The total amount of search time, in milliseconds.
	 * <p>
	 * API name: {@code search_time}
	 */
	@Nullable
	public final String searchTime() {
		return this.searchTime;
	}

	/**
	 * The total number of index operations done by the transform.
	 * <p>
	 * API name: {@code index_total}
	 */
	@Nullable
	public final String indexTotal() {
		return this.indexTotal;
	}

	/**
	 * The total number of indexing failures.
	 * <p>
	 * API name: {@code index_failure}
	 */
	@Nullable
	public final String indexFailure() {
		return this.indexFailure;
	}

	/**
	 * The total time spent indexing documents, in milliseconds.
	 * <p>
	 * API name: {@code index_time}
	 */
	@Nullable
	public final String indexTime() {
		return this.indexTime;
	}

	/**
	 * The number of documents that have been indexed into the destination index for
	 * the transform.
	 * <p>
	 * API name: {@code documents_indexed}
	 */
	@Nullable
	public final String documentsIndexed() {
		return this.documentsIndexed;
	}

	/**
	 * The total time spent deleting documents, in milliseconds.
	 * <p>
	 * API name: {@code delete_time}
	 */
	@Nullable
	public final String deleteTime() {
		return this.deleteTime;
	}

	/**
	 * The number of documents deleted from the destination index due to the
	 * retention policy for the transform.
	 * <p>
	 * API name: {@code documents_deleted}
	 */
	@Nullable
	public final String documentsDeleted() {
		return this.documentsDeleted;
	}

	/**
	 * The number of times the transform has been triggered by the scheduler. For
	 * example, the scheduler triggers the transform indexer to check for updates or
	 * ingest new data at an interval specified in the <code>frequency</code>
	 * property.
	 * <p>
	 * API name: {@code trigger_count}
	 */
	@Nullable
	public final String triggerCount() {
		return this.triggerCount;
	}

	/**
	 * The number of search or bulk index operations processed. Documents are
	 * processed in batches instead of individually.
	 * <p>
	 * API name: {@code pages_processed}
	 */
	@Nullable
	public final String pagesProcessed() {
		return this.pagesProcessed;
	}

	/**
	 * The total time spent processing results, in milliseconds.
	 * <p>
	 * API name: {@code processing_time}
	 */
	@Nullable
	public final String processingTime() {
		return this.processingTime;
	}

	/**
	 * The exponential moving average of the duration of the checkpoint, in
	 * milliseconds.
	 * <p>
	 * API name: {@code checkpoint_duration_time_exp_avg}
	 */
	@Nullable
	public final String checkpointDurationTimeExpAvg() {
		return this.checkpointDurationTimeExpAvg;
	}

	/**
	 * The exponential moving average of the number of new documents that have been
	 * indexed.
	 * <p>
	 * API name: {@code indexed_documents_exp_avg}
	 */
	@Nullable
	public final String indexedDocumentsExpAvg() {
		return this.indexedDocumentsExpAvg;
	}

	/**
	 * The exponential moving average of the number of documents that have been
	 * processed.
	 * <p>
	 * API name: {@code processed_documents_exp_avg}
	 */
	@Nullable
	public final String processedDocumentsExpAvg() {
		return this.processedDocumentsExpAvg;
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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TransformsRecord}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<TransformsRecord> {
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
		 * The transform identifier.
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * The status of the transform. Returned values include: <code>aborting</code>:
		 * The transform is aborting.
		 * <code>failed: The transform failed. For more information about the failure, check the </code>reason<code>field.</code>indexing<code>: The transform is actively processing data and creating new documents. </code>started<code>: The transform is running but not actively indexing data. </code>stopped<code>: The transform is stopped. </code>stopping`:
		 * The transform is stopping.
		 * <p>
		 * API name: {@code state}
		 */
		public final Builder state(@Nullable String value) {
			this.state = value;
			return this;
		}

		/**
		 * The sequence number for the checkpoint.
		 * <p>
		 * API name: {@code checkpoint}
		 */
		public final Builder checkpoint(@Nullable String value) {
			this.checkpoint = value;
			return this;
		}

		/**
		 * The number of documents that have been processed from the source index of the
		 * transform.
		 * <p>
		 * API name: {@code documents_processed}
		 */
		public final Builder documentsProcessed(@Nullable String value) {
			this.documentsProcessed = value;
			return this;
		}

		/**
		 * The progress of the next checkpoint that is currently in progress.
		 * <p>
		 * API name: {@code checkpoint_progress}
		 */
		public final Builder checkpointProgress(@Nullable String value) {
			this.checkpointProgress = value;
			return this;
		}

		/**
		 * The timestamp of the last search in the source indices. This field is shown
		 * only if the transform is running.
		 * <p>
		 * API name: {@code last_search_time}
		 */
		public final Builder lastSearchTime(@Nullable String value) {
			this.lastSearchTime = value;
			return this;
		}

		/**
		 * The timestamp when changes were last detected in the source indices.
		 * <p>
		 * API name: {@code changes_last_detection_time}
		 */
		public final Builder changesLastDetectionTime(@Nullable String value) {
			this.changesLastDetectionTime = value;
			return this;
		}

		/**
		 * The time the transform was created.
		 * <p>
		 * API name: {@code create_time}
		 */
		public final Builder createTime(@Nullable String value) {
			this.createTime = value;
			return this;
		}

		/**
		 * The version of Elasticsearch that existed on the node when the transform was
		 * created.
		 * <p>
		 * API name: {@code version}
		 */
		public final Builder version(@Nullable String value) {
			this.version = value;
			return this;
		}

		/**
		 * The source indices for the transform.
		 * <p>
		 * API name: {@code source_index}
		 */
		public final Builder sourceIndex(@Nullable String value) {
			this.sourceIndex = value;
			return this;
		}

		/**
		 * The destination index for the transform.
		 * <p>
		 * API name: {@code dest_index}
		 */
		public final Builder destIndex(@Nullable String value) {
			this.destIndex = value;
			return this;
		}

		/**
		 * The unique identifier for the ingest pipeline.
		 * <p>
		 * API name: {@code pipeline}
		 */
		public final Builder pipeline(@Nullable String value) {
			this.pipeline = value;
			return this;
		}

		/**
		 * The description of the transform.
		 * <p>
		 * API name: {@code description}
		 */
		public final Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * The type of transform: <code>batch</code> or <code>continuous</code>.
		 * <p>
		 * API name: {@code transform_type}
		 */
		public final Builder transformType(@Nullable String value) {
			this.transformType = value;
			return this;
		}

		/**
		 * The interval between checks for changes in the source indices when the
		 * transform is running continuously.
		 * <p>
		 * API name: {@code frequency}
		 */
		public final Builder frequency(@Nullable String value) {
			this.frequency = value;
			return this;
		}

		/**
		 * The initial page size that is used for the composite aggregation for each
		 * checkpoint.
		 * <p>
		 * API name: {@code max_page_search_size}
		 */
		public final Builder maxPageSearchSize(@Nullable String value) {
			this.maxPageSearchSize = value;
			return this;
		}

		/**
		 * The number of input documents per second.
		 * <p>
		 * API name: {@code docs_per_second}
		 */
		public final Builder docsPerSecond(@Nullable String value) {
			this.docsPerSecond = value;
			return this;
		}

		/**
		 * If a transform has a <code>failed</code> state, these details describe the
		 * reason for failure.
		 * <p>
		 * API name: {@code reason}
		 */
		public final Builder reason(@Nullable String value) {
			this.reason = value;
			return this;
		}

		/**
		 * The total number of search operations on the source index for the transform.
		 * <p>
		 * API name: {@code search_total}
		 */
		public final Builder searchTotal(@Nullable String value) {
			this.searchTotal = value;
			return this;
		}

		/**
		 * The total number of search failures.
		 * <p>
		 * API name: {@code search_failure}
		 */
		public final Builder searchFailure(@Nullable String value) {
			this.searchFailure = value;
			return this;
		}

		/**
		 * The total amount of search time, in milliseconds.
		 * <p>
		 * API name: {@code search_time}
		 */
		public final Builder searchTime(@Nullable String value) {
			this.searchTime = value;
			return this;
		}

		/**
		 * The total number of index operations done by the transform.
		 * <p>
		 * API name: {@code index_total}
		 */
		public final Builder indexTotal(@Nullable String value) {
			this.indexTotal = value;
			return this;
		}

		/**
		 * The total number of indexing failures.
		 * <p>
		 * API name: {@code index_failure}
		 */
		public final Builder indexFailure(@Nullable String value) {
			this.indexFailure = value;
			return this;
		}

		/**
		 * The total time spent indexing documents, in milliseconds.
		 * <p>
		 * API name: {@code index_time}
		 */
		public final Builder indexTime(@Nullable String value) {
			this.indexTime = value;
			return this;
		}

		/**
		 * The number of documents that have been indexed into the destination index for
		 * the transform.
		 * <p>
		 * API name: {@code documents_indexed}
		 */
		public final Builder documentsIndexed(@Nullable String value) {
			this.documentsIndexed = value;
			return this;
		}

		/**
		 * The total time spent deleting documents, in milliseconds.
		 * <p>
		 * API name: {@code delete_time}
		 */
		public final Builder deleteTime(@Nullable String value) {
			this.deleteTime = value;
			return this;
		}

		/**
		 * The number of documents deleted from the destination index due to the
		 * retention policy for the transform.
		 * <p>
		 * API name: {@code documents_deleted}
		 */
		public final Builder documentsDeleted(@Nullable String value) {
			this.documentsDeleted = value;
			return this;
		}

		/**
		 * The number of times the transform has been triggered by the scheduler. For
		 * example, the scheduler triggers the transform indexer to check for updates or
		 * ingest new data at an interval specified in the <code>frequency</code>
		 * property.
		 * <p>
		 * API name: {@code trigger_count}
		 */
		public final Builder triggerCount(@Nullable String value) {
			this.triggerCount = value;
			return this;
		}

		/**
		 * The number of search or bulk index operations processed. Documents are
		 * processed in batches instead of individually.
		 * <p>
		 * API name: {@code pages_processed}
		 */
		public final Builder pagesProcessed(@Nullable String value) {
			this.pagesProcessed = value;
			return this;
		}

		/**
		 * The total time spent processing results, in milliseconds.
		 * <p>
		 * API name: {@code processing_time}
		 */
		public final Builder processingTime(@Nullable String value) {
			this.processingTime = value;
			return this;
		}

		/**
		 * The exponential moving average of the duration of the checkpoint, in
		 * milliseconds.
		 * <p>
		 * API name: {@code checkpoint_duration_time_exp_avg}
		 */
		public final Builder checkpointDurationTimeExpAvg(@Nullable String value) {
			this.checkpointDurationTimeExpAvg = value;
			return this;
		}

		/**
		 * The exponential moving average of the number of new documents that have been
		 * indexed.
		 * <p>
		 * API name: {@code indexed_documents_exp_avg}
		 */
		public final Builder indexedDocumentsExpAvg(@Nullable String value) {
			this.indexedDocumentsExpAvg = value;
			return this;
		}

		/**
		 * The exponential moving average of the number of documents that have been
		 * processed.
		 * <p>
		 * API name: {@code processed_documents_exp_avg}
		 */
		public final Builder processedDocumentsExpAvg(@Nullable String value) {
			this.processedDocumentsExpAvg = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TransformsRecord}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TransformsRecord build() {
			_checkSingleUse();

			return new TransformsRecord(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TransformsRecord}
	 */
	public static final JsonpDeserializer<TransformsRecord> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			TransformsRecord::setupTransformsRecordDeserializer);

	protected static void setupTransformsRecordDeserializer(ObjectDeserializer<TransformsRecord.Builder> op) {

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
