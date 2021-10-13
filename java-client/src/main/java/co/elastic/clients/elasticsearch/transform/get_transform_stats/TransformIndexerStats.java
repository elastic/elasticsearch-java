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
import java.util.function.Function;

// typedef: transform.get_transform_stats.TransformIndexerStats
@JsonpDeserializable
public final class TransformIndexerStats implements JsonpSerializable {
	private final long documentsIndexed;

	private final long documentsProcessed;

	private final double exponentialAvgCheckpointDurationMs;

	private final double exponentialAvgDocumentsIndexed;

	private final double exponentialAvgDocumentsProcessed;

	private final long indexFailures;

	private final long indexTimeInMs;

	private final long indexTotal;

	private final long pagesProcessed;

	private final long processingTimeInMs;

	private final long processingTotal;

	private final long searchFailures;

	private final long searchTimeInMs;

	private final long searchTotal;

	private final long triggerCount;

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

	public TransformIndexerStats(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code documents_indexed}
	 */
	public long documentsIndexed() {
		return this.documentsIndexed;
	}

	/**
	 * Required - API name: {@code documents_processed}
	 */
	public long documentsProcessed() {
		return this.documentsProcessed;
	}

	/**
	 * Required - API name: {@code exponential_avg_checkpoint_duration_ms}
	 */
	public double exponentialAvgCheckpointDurationMs() {
		return this.exponentialAvgCheckpointDurationMs;
	}

	/**
	 * Required - API name: {@code exponential_avg_documents_indexed}
	 */
	public double exponentialAvgDocumentsIndexed() {
		return this.exponentialAvgDocumentsIndexed;
	}

	/**
	 * Required - API name: {@code exponential_avg_documents_processed}
	 */
	public double exponentialAvgDocumentsProcessed() {
		return this.exponentialAvgDocumentsProcessed;
	}

	/**
	 * Required - API name: {@code index_failures}
	 */
	public long indexFailures() {
		return this.indexFailures;
	}

	/**
	 * Required - API name: {@code index_time_in_ms}
	 */
	public long indexTimeInMs() {
		return this.indexTimeInMs;
	}

	/**
	 * Required - API name: {@code index_total}
	 */
	public long indexTotal() {
		return this.indexTotal;
	}

	/**
	 * Required - API name: {@code pages_processed}
	 */
	public long pagesProcessed() {
		return this.pagesProcessed;
	}

	/**
	 * Required - API name: {@code processing_time_in_ms}
	 */
	public long processingTimeInMs() {
		return this.processingTimeInMs;
	}

	/**
	 * Required - API name: {@code processing_total}
	 */
	public long processingTotal() {
		return this.processingTotal;
	}

	/**
	 * Required - API name: {@code search_failures}
	 */
	public long searchFailures() {
		return this.searchFailures;
	}

	/**
	 * Required - API name: {@code search_time_in_ms}
	 */
	public long searchTimeInMs() {
		return this.searchTimeInMs;
	}

	/**
	 * Required - API name: {@code search_total}
	 */
	public long searchTotal() {
		return this.searchTotal;
	}

	/**
	 * Required - API name: {@code trigger_count}
	 */
	public long triggerCount() {
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
		 * Required - API name: {@code documents_indexed}
		 */
		public Builder documentsIndexed(long value) {
			this.documentsIndexed = value;
			return this;
		}

		/**
		 * Required - API name: {@code documents_processed}
		 */
		public Builder documentsProcessed(long value) {
			this.documentsProcessed = value;
			return this;
		}

		/**
		 * Required - API name: {@code exponential_avg_checkpoint_duration_ms}
		 */
		public Builder exponentialAvgCheckpointDurationMs(double value) {
			this.exponentialAvgCheckpointDurationMs = value;
			return this;
		}

		/**
		 * Required - API name: {@code exponential_avg_documents_indexed}
		 */
		public Builder exponentialAvgDocumentsIndexed(double value) {
			this.exponentialAvgDocumentsIndexed = value;
			return this;
		}

		/**
		 * Required - API name: {@code exponential_avg_documents_processed}
		 */
		public Builder exponentialAvgDocumentsProcessed(double value) {
			this.exponentialAvgDocumentsProcessed = value;
			return this;
		}

		/**
		 * Required - API name: {@code index_failures}
		 */
		public Builder indexFailures(long value) {
			this.indexFailures = value;
			return this;
		}

		/**
		 * Required - API name: {@code index_time_in_ms}
		 */
		public Builder indexTimeInMs(long value) {
			this.indexTimeInMs = value;
			return this;
		}

		/**
		 * Required - API name: {@code index_total}
		 */
		public Builder indexTotal(long value) {
			this.indexTotal = value;
			return this;
		}

		/**
		 * Required - API name: {@code pages_processed}
		 */
		public Builder pagesProcessed(long value) {
			this.pagesProcessed = value;
			return this;
		}

		/**
		 * Required - API name: {@code processing_time_in_ms}
		 */
		public Builder processingTimeInMs(long value) {
			this.processingTimeInMs = value;
			return this;
		}

		/**
		 * Required - API name: {@code processing_total}
		 */
		public Builder processingTotal(long value) {
			this.processingTotal = value;
			return this;
		}

		/**
		 * Required - API name: {@code search_failures}
		 */
		public Builder searchFailures(long value) {
			this.searchFailures = value;
			return this;
		}

		/**
		 * Required - API name: {@code search_time_in_ms}
		 */
		public Builder searchTimeInMs(long value) {
			this.searchTimeInMs = value;
			return this;
		}

		/**
		 * Required - API name: {@code search_total}
		 */
		public Builder searchTotal(long value) {
			this.searchTotal = value;
			return this;
		}

		/**
		 * Required - API name: {@code trigger_count}
		 */
		public Builder triggerCount(long value) {
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
