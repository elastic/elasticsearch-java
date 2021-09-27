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

package co.elastic.clients.elasticsearch.transform.get_transform_stats;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.lang.Long;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: transform.get_transform_stats.TransformIndexerStats
@JsonpDeserializable
public final class TransformIndexerStats implements JsonpSerializable {
	private final Long documentsIndexed;

	private final Long documentsProcessed;

	private final Double exponentialAvgCheckpointDurationMs;

	private final Double exponentialAvgDocumentsIndexed;

	private final Double exponentialAvgDocumentsProcessed;

	private final Long indexFailures;

	private final Long indexTimeInMs;

	private final Long indexTotal;

	private final Long pagesProcessed;

	private final Long processingTimeInMs;

	private final Long processingTotal;

	private final Long searchFailures;

	private final Long searchTimeInMs;

	private final Long searchTotal;

	private final Long triggerCount;

	// ---------------------------------------------------------------------------------------------

	public TransformIndexerStats(Builder builder) {

		this.documentsIndexed = Objects.requireNonNull(builder.documentsIndexed, "documents_indexed");
		this.documentsProcessed = Objects.requireNonNull(builder.documentsProcessed, "documents_processed");
		this.exponentialAvgCheckpointDurationMs = Objects.requireNonNull(builder.exponentialAvgCheckpointDurationMs,
				"exponential_avg_checkpoint_duration_ms");
		this.exponentialAvgDocumentsIndexed = Objects.requireNonNull(builder.exponentialAvgDocumentsIndexed,
				"exponential_avg_documents_indexed");
		this.exponentialAvgDocumentsProcessed = Objects.requireNonNull(builder.exponentialAvgDocumentsProcessed,
				"exponential_avg_documents_processed");
		this.indexFailures = Objects.requireNonNull(builder.indexFailures, "index_failures");
		this.indexTimeInMs = Objects.requireNonNull(builder.indexTimeInMs, "index_time_in_ms");
		this.indexTotal = Objects.requireNonNull(builder.indexTotal, "index_total");
		this.pagesProcessed = Objects.requireNonNull(builder.pagesProcessed, "pages_processed");
		this.processingTimeInMs = Objects.requireNonNull(builder.processingTimeInMs, "processing_time_in_ms");
		this.processingTotal = Objects.requireNonNull(builder.processingTotal, "processing_total");
		this.searchFailures = Objects.requireNonNull(builder.searchFailures, "search_failures");
		this.searchTimeInMs = Objects.requireNonNull(builder.searchTimeInMs, "search_time_in_ms");
		this.searchTotal = Objects.requireNonNull(builder.searchTotal, "search_total");
		this.triggerCount = Objects.requireNonNull(builder.triggerCount, "trigger_count");

	}

	/**
	 * API name: {@code documents_indexed}
	 */
	public Long documentsIndexed() {
		return this.documentsIndexed;
	}

	/**
	 * API name: {@code documents_processed}
	 */
	public Long documentsProcessed() {
		return this.documentsProcessed;
	}

	/**
	 * API name: {@code exponential_avg_checkpoint_duration_ms}
	 */
	public Double exponentialAvgCheckpointDurationMs() {
		return this.exponentialAvgCheckpointDurationMs;
	}

	/**
	 * API name: {@code exponential_avg_documents_indexed}
	 */
	public Double exponentialAvgDocumentsIndexed() {
		return this.exponentialAvgDocumentsIndexed;
	}

	/**
	 * API name: {@code exponential_avg_documents_processed}
	 */
	public Double exponentialAvgDocumentsProcessed() {
		return this.exponentialAvgDocumentsProcessed;
	}

	/**
	 * API name: {@code index_failures}
	 */
	public Long indexFailures() {
		return this.indexFailures;
	}

	/**
	 * API name: {@code index_time_in_ms}
	 */
	public Long indexTimeInMs() {
		return this.indexTimeInMs;
	}

	/**
	 * API name: {@code index_total}
	 */
	public Long indexTotal() {
		return this.indexTotal;
	}

	/**
	 * API name: {@code pages_processed}
	 */
	public Long pagesProcessed() {
		return this.pagesProcessed;
	}

	/**
	 * API name: {@code processing_time_in_ms}
	 */
	public Long processingTimeInMs() {
		return this.processingTimeInMs;
	}

	/**
	 * API name: {@code processing_total}
	 */
	public Long processingTotal() {
		return this.processingTotal;
	}

	/**
	 * API name: {@code search_failures}
	 */
	public Long searchFailures() {
		return this.searchFailures;
	}

	/**
	 * API name: {@code search_time_in_ms}
	 */
	public Long searchTimeInMs() {
		return this.searchTimeInMs;
	}

	/**
	 * API name: {@code search_total}
	 */
	public Long searchTotal() {
		return this.searchTotal;
	}

	/**
	 * API name: {@code trigger_count}
	 */
	public Long triggerCount() {
		return this.triggerCount;
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

		generator.writeKey("documents_indexed");
		generator.write(this.documentsIndexed);

		generator.writeKey("documents_processed");
		generator.write(this.documentsProcessed);

		generator.writeKey("exponential_avg_checkpoint_duration_ms");
		generator.write(this.exponentialAvgCheckpointDurationMs);

		generator.writeKey("exponential_avg_documents_indexed");
		generator.write(this.exponentialAvgDocumentsIndexed);

		generator.writeKey("exponential_avg_documents_processed");
		generator.write(this.exponentialAvgDocumentsProcessed);

		generator.writeKey("index_failures");
		generator.write(this.indexFailures);

		generator.writeKey("index_time_in_ms");
		generator.write(this.indexTimeInMs);

		generator.writeKey("index_total");
		generator.write(this.indexTotal);

		generator.writeKey("pages_processed");
		generator.write(this.pagesProcessed);

		generator.writeKey("processing_time_in_ms");
		generator.write(this.processingTimeInMs);

		generator.writeKey("processing_total");
		generator.write(this.processingTotal);

		generator.writeKey("search_failures");
		generator.write(this.searchFailures);

		generator.writeKey("search_time_in_ms");
		generator.write(this.searchTimeInMs);

		generator.writeKey("search_total");
		generator.write(this.searchTotal);

		generator.writeKey("trigger_count");
		generator.write(this.triggerCount);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TransformIndexerStats}.
	 */
	public static class Builder implements ObjectBuilder<TransformIndexerStats> {
		private Long documentsIndexed;

		private Long documentsProcessed;

		private Double exponentialAvgCheckpointDurationMs;

		private Double exponentialAvgDocumentsIndexed;

		private Double exponentialAvgDocumentsProcessed;

		private Long indexFailures;

		private Long indexTimeInMs;

		private Long indexTotal;

		private Long pagesProcessed;

		private Long processingTimeInMs;

		private Long processingTotal;

		private Long searchFailures;

		private Long searchTimeInMs;

		private Long searchTotal;

		private Long triggerCount;

		/**
		 * API name: {@code documents_indexed}
		 */
		public Builder documentsIndexed(Long value) {
			this.documentsIndexed = value;
			return this;
		}

		/**
		 * API name: {@code documents_processed}
		 */
		public Builder documentsProcessed(Long value) {
			this.documentsProcessed = value;
			return this;
		}

		/**
		 * API name: {@code exponential_avg_checkpoint_duration_ms}
		 */
		public Builder exponentialAvgCheckpointDurationMs(Double value) {
			this.exponentialAvgCheckpointDurationMs = value;
			return this;
		}

		/**
		 * API name: {@code exponential_avg_documents_indexed}
		 */
		public Builder exponentialAvgDocumentsIndexed(Double value) {
			this.exponentialAvgDocumentsIndexed = value;
			return this;
		}

		/**
		 * API name: {@code exponential_avg_documents_processed}
		 */
		public Builder exponentialAvgDocumentsProcessed(Double value) {
			this.exponentialAvgDocumentsProcessed = value;
			return this;
		}

		/**
		 * API name: {@code index_failures}
		 */
		public Builder indexFailures(Long value) {
			this.indexFailures = value;
			return this;
		}

		/**
		 * API name: {@code index_time_in_ms}
		 */
		public Builder indexTimeInMs(Long value) {
			this.indexTimeInMs = value;
			return this;
		}

		/**
		 * API name: {@code index_total}
		 */
		public Builder indexTotal(Long value) {
			this.indexTotal = value;
			return this;
		}

		/**
		 * API name: {@code pages_processed}
		 */
		public Builder pagesProcessed(Long value) {
			this.pagesProcessed = value;
			return this;
		}

		/**
		 * API name: {@code processing_time_in_ms}
		 */
		public Builder processingTimeInMs(Long value) {
			this.processingTimeInMs = value;
			return this;
		}

		/**
		 * API name: {@code processing_total}
		 */
		public Builder processingTotal(Long value) {
			this.processingTotal = value;
			return this;
		}

		/**
		 * API name: {@code search_failures}
		 */
		public Builder searchFailures(Long value) {
			this.searchFailures = value;
			return this;
		}

		/**
		 * API name: {@code search_time_in_ms}
		 */
		public Builder searchTimeInMs(Long value) {
			this.searchTimeInMs = value;
			return this;
		}

		/**
		 * API name: {@code search_total}
		 */
		public Builder searchTotal(Long value) {
			this.searchTotal = value;
			return this;
		}

		/**
		 * API name: {@code trigger_count}
		 */
		public Builder triggerCount(Long value) {
			this.triggerCount = value;
			return this;
		}

		/**
		 * Builds a {@link TransformIndexerStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TransformIndexerStats build() {

			return new TransformIndexerStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TransformIndexerStats}
	 */
	public static final JsonpDeserializer<TransformIndexerStats> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TransformIndexerStats::setupTransformIndexerStatsDeserializer, Builder::build);

	protected static void setupTransformIndexerStatsDeserializer(
			DelegatingDeserializer<TransformIndexerStats.Builder> op) {

		op.add(Builder::documentsIndexed, JsonpDeserializer.longDeserializer(), "documents_indexed");
		op.add(Builder::documentsProcessed, JsonpDeserializer.longDeserializer(), "documents_processed");
		op.add(Builder::exponentialAvgCheckpointDurationMs, JsonpDeserializer.doubleDeserializer(),
				"exponential_avg_checkpoint_duration_ms");
		op.add(Builder::exponentialAvgDocumentsIndexed, JsonpDeserializer.doubleDeserializer(),
				"exponential_avg_documents_indexed");
		op.add(Builder::exponentialAvgDocumentsProcessed, JsonpDeserializer.doubleDeserializer(),
				"exponential_avg_documents_processed");
		op.add(Builder::indexFailures, JsonpDeserializer.longDeserializer(), "index_failures");
		op.add(Builder::indexTimeInMs, JsonpDeserializer.longDeserializer(), "index_time_in_ms");
		op.add(Builder::indexTotal, JsonpDeserializer.longDeserializer(), "index_total");
		op.add(Builder::pagesProcessed, JsonpDeserializer.longDeserializer(), "pages_processed");
		op.add(Builder::processingTimeInMs, JsonpDeserializer.longDeserializer(), "processing_time_in_ms");
		op.add(Builder::processingTotal, JsonpDeserializer.longDeserializer(), "processing_total");
		op.add(Builder::searchFailures, JsonpDeserializer.longDeserializer(), "search_failures");
		op.add(Builder::searchTimeInMs, JsonpDeserializer.longDeserializer(), "search_time_in_ms");
		op.add(Builder::searchTotal, JsonpDeserializer.longDeserializer(), "search_total");
		op.add(Builder::triggerCount, JsonpDeserializer.longDeserializer(), "trigger_count");

	}

}
