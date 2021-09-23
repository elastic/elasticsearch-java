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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: transform.get_transform_stats.TransformIndexerStats
public final class TransformIndexerStats implements JsonpSerializable {
	private final Number documentsIndexed;

	private final Number documentsProcessed;

	private final Number exponentialAvgCheckpointDurationMs;

	private final Number exponentialAvgDocumentsIndexed;

	private final Number exponentialAvgDocumentsProcessed;

	private final Number indexFailures;

	private final Number indexTimeInMs;

	private final Number indexTotal;

	private final Number pagesProcessed;

	private final Number processingTimeInMs;

	private final Number processingTotal;

	private final Number searchFailures;

	private final Number searchTimeInMs;

	private final Number searchTotal;

	private final Number triggerCount;

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
	public Number documentsIndexed() {
		return this.documentsIndexed;
	}

	/**
	 * API name: {@code documents_processed}
	 */
	public Number documentsProcessed() {
		return this.documentsProcessed;
	}

	/**
	 * API name: {@code exponential_avg_checkpoint_duration_ms}
	 */
	public Number exponentialAvgCheckpointDurationMs() {
		return this.exponentialAvgCheckpointDurationMs;
	}

	/**
	 * API name: {@code exponential_avg_documents_indexed}
	 */
	public Number exponentialAvgDocumentsIndexed() {
		return this.exponentialAvgDocumentsIndexed;
	}

	/**
	 * API name: {@code exponential_avg_documents_processed}
	 */
	public Number exponentialAvgDocumentsProcessed() {
		return this.exponentialAvgDocumentsProcessed;
	}

	/**
	 * API name: {@code index_failures}
	 */
	public Number indexFailures() {
		return this.indexFailures;
	}

	/**
	 * API name: {@code index_time_in_ms}
	 */
	public Number indexTimeInMs() {
		return this.indexTimeInMs;
	}

	/**
	 * API name: {@code index_total}
	 */
	public Number indexTotal() {
		return this.indexTotal;
	}

	/**
	 * API name: {@code pages_processed}
	 */
	public Number pagesProcessed() {
		return this.pagesProcessed;
	}

	/**
	 * API name: {@code processing_time_in_ms}
	 */
	public Number processingTimeInMs() {
		return this.processingTimeInMs;
	}

	/**
	 * API name: {@code processing_total}
	 */
	public Number processingTotal() {
		return this.processingTotal;
	}

	/**
	 * API name: {@code search_failures}
	 */
	public Number searchFailures() {
		return this.searchFailures;
	}

	/**
	 * API name: {@code search_time_in_ms}
	 */
	public Number searchTimeInMs() {
		return this.searchTimeInMs;
	}

	/**
	 * API name: {@code search_total}
	 */
	public Number searchTotal() {
		return this.searchTotal;
	}

	/**
	 * API name: {@code trigger_count}
	 */
	public Number triggerCount() {
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
		generator.write(this.documentsIndexed.doubleValue());

		generator.writeKey("documents_processed");
		generator.write(this.documentsProcessed.doubleValue());

		generator.writeKey("exponential_avg_checkpoint_duration_ms");
		generator.write(this.exponentialAvgCheckpointDurationMs.doubleValue());

		generator.writeKey("exponential_avg_documents_indexed");
		generator.write(this.exponentialAvgDocumentsIndexed.doubleValue());

		generator.writeKey("exponential_avg_documents_processed");
		generator.write(this.exponentialAvgDocumentsProcessed.doubleValue());

		generator.writeKey("index_failures");
		generator.write(this.indexFailures.doubleValue());

		generator.writeKey("index_time_in_ms");
		generator.write(this.indexTimeInMs.doubleValue());

		generator.writeKey("index_total");
		generator.write(this.indexTotal.doubleValue());

		generator.writeKey("pages_processed");
		generator.write(this.pagesProcessed.doubleValue());

		generator.writeKey("processing_time_in_ms");
		generator.write(this.processingTimeInMs.doubleValue());

		generator.writeKey("processing_total");
		generator.write(this.processingTotal.doubleValue());

		generator.writeKey("search_failures");
		generator.write(this.searchFailures.doubleValue());

		generator.writeKey("search_time_in_ms");
		generator.write(this.searchTimeInMs.doubleValue());

		generator.writeKey("search_total");
		generator.write(this.searchTotal.doubleValue());

		generator.writeKey("trigger_count");
		generator.write(this.triggerCount.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TransformIndexerStats}.
	 */
	public static class Builder implements ObjectBuilder<TransformIndexerStats> {
		private Number documentsIndexed;

		private Number documentsProcessed;

		private Number exponentialAvgCheckpointDurationMs;

		private Number exponentialAvgDocumentsIndexed;

		private Number exponentialAvgDocumentsProcessed;

		private Number indexFailures;

		private Number indexTimeInMs;

		private Number indexTotal;

		private Number pagesProcessed;

		private Number processingTimeInMs;

		private Number processingTotal;

		private Number searchFailures;

		private Number searchTimeInMs;

		private Number searchTotal;

		private Number triggerCount;

		/**
		 * API name: {@code documents_indexed}
		 */
		public Builder documentsIndexed(Number value) {
			this.documentsIndexed = value;
			return this;
		}

		/**
		 * API name: {@code documents_processed}
		 */
		public Builder documentsProcessed(Number value) {
			this.documentsProcessed = value;
			return this;
		}

		/**
		 * API name: {@code exponential_avg_checkpoint_duration_ms}
		 */
		public Builder exponentialAvgCheckpointDurationMs(Number value) {
			this.exponentialAvgCheckpointDurationMs = value;
			return this;
		}

		/**
		 * API name: {@code exponential_avg_documents_indexed}
		 */
		public Builder exponentialAvgDocumentsIndexed(Number value) {
			this.exponentialAvgDocumentsIndexed = value;
			return this;
		}

		/**
		 * API name: {@code exponential_avg_documents_processed}
		 */
		public Builder exponentialAvgDocumentsProcessed(Number value) {
			this.exponentialAvgDocumentsProcessed = value;
			return this;
		}

		/**
		 * API name: {@code index_failures}
		 */
		public Builder indexFailures(Number value) {
			this.indexFailures = value;
			return this;
		}

		/**
		 * API name: {@code index_time_in_ms}
		 */
		public Builder indexTimeInMs(Number value) {
			this.indexTimeInMs = value;
			return this;
		}

		/**
		 * API name: {@code index_total}
		 */
		public Builder indexTotal(Number value) {
			this.indexTotal = value;
			return this;
		}

		/**
		 * API name: {@code pages_processed}
		 */
		public Builder pagesProcessed(Number value) {
			this.pagesProcessed = value;
			return this;
		}

		/**
		 * API name: {@code processing_time_in_ms}
		 */
		public Builder processingTimeInMs(Number value) {
			this.processingTimeInMs = value;
			return this;
		}

		/**
		 * API name: {@code processing_total}
		 */
		public Builder processingTotal(Number value) {
			this.processingTotal = value;
			return this;
		}

		/**
		 * API name: {@code search_failures}
		 */
		public Builder searchFailures(Number value) {
			this.searchFailures = value;
			return this;
		}

		/**
		 * API name: {@code search_time_in_ms}
		 */
		public Builder searchTimeInMs(Number value) {
			this.searchTimeInMs = value;
			return this;
		}

		/**
		 * API name: {@code search_total}
		 */
		public Builder searchTotal(Number value) {
			this.searchTotal = value;
			return this;
		}

		/**
		 * API name: {@code trigger_count}
		 */
		public Builder triggerCount(Number value) {
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
	public static final JsonpDeserializer<TransformIndexerStats> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, TransformIndexerStats::setupTransformIndexerStatsDeserializer);

	protected static void setupTransformIndexerStatsDeserializer(
			DelegatingDeserializer<TransformIndexerStats.Builder> op) {

		op.add(Builder::documentsIndexed, JsonpDeserializer.numberDeserializer(), "documents_indexed");
		op.add(Builder::documentsProcessed, JsonpDeserializer.numberDeserializer(), "documents_processed");
		op.add(Builder::exponentialAvgCheckpointDurationMs, JsonpDeserializer.numberDeserializer(),
				"exponential_avg_checkpoint_duration_ms");
		op.add(Builder::exponentialAvgDocumentsIndexed, JsonpDeserializer.numberDeserializer(),
				"exponential_avg_documents_indexed");
		op.add(Builder::exponentialAvgDocumentsProcessed, JsonpDeserializer.numberDeserializer(),
				"exponential_avg_documents_processed");
		op.add(Builder::indexFailures, JsonpDeserializer.numberDeserializer(), "index_failures");
		op.add(Builder::indexTimeInMs, JsonpDeserializer.numberDeserializer(), "index_time_in_ms");
		op.add(Builder::indexTotal, JsonpDeserializer.numberDeserializer(), "index_total");
		op.add(Builder::pagesProcessed, JsonpDeserializer.numberDeserializer(), "pages_processed");
		op.add(Builder::processingTimeInMs, JsonpDeserializer.numberDeserializer(), "processing_time_in_ms");
		op.add(Builder::processingTotal, JsonpDeserializer.numberDeserializer(), "processing_total");
		op.add(Builder::searchFailures, JsonpDeserializer.numberDeserializer(), "search_failures");
		op.add(Builder::searchTimeInMs, JsonpDeserializer.numberDeserializer(), "search_time_in_ms");
		op.add(Builder::searchTotal, JsonpDeserializer.numberDeserializer(), "search_total");
		op.add(Builder::triggerCount, JsonpDeserializer.numberDeserializer(), "trigger_count");

	}

}
