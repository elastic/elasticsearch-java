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
import java.lang.Double;
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: transform.get_transform_stats.TransformIndexerStats

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#transform.get_transform_stats.TransformIndexerStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class TransformIndexerStats implements JsonpSerializable {
	@Nullable
	private final Long deleteTimeInMs;

	private final long documentsIndexed;

	@Nullable
	private final Long documentsDeleted;

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

	private TransformIndexerStats(Builder builder) {

		this.deleteTimeInMs = builder.deleteTimeInMs;
		this.documentsIndexed = ApiTypeHelper.requireNonNull(builder.documentsIndexed, this, "documentsIndexed");
		this.documentsDeleted = builder.documentsDeleted;
		this.documentsProcessed = ApiTypeHelper.requireNonNull(builder.documentsProcessed, this, "documentsProcessed");
		this.exponentialAvgCheckpointDurationMs = ApiTypeHelper
				.requireNonNull(builder.exponentialAvgCheckpointDurationMs, this, "exponentialAvgCheckpointDurationMs");
		this.exponentialAvgDocumentsIndexed = ApiTypeHelper.requireNonNull(builder.exponentialAvgDocumentsIndexed, this,
				"exponentialAvgDocumentsIndexed");
		this.exponentialAvgDocumentsProcessed = ApiTypeHelper.requireNonNull(builder.exponentialAvgDocumentsProcessed,
				this, "exponentialAvgDocumentsProcessed");
		this.indexFailures = ApiTypeHelper.requireNonNull(builder.indexFailures, this, "indexFailures");
		this.indexTimeInMs = ApiTypeHelper.requireNonNull(builder.indexTimeInMs, this, "indexTimeInMs");
		this.indexTotal = ApiTypeHelper.requireNonNull(builder.indexTotal, this, "indexTotal");
		this.pagesProcessed = ApiTypeHelper.requireNonNull(builder.pagesProcessed, this, "pagesProcessed");
		this.processingTimeInMs = ApiTypeHelper.requireNonNull(builder.processingTimeInMs, this, "processingTimeInMs");
		this.processingTotal = ApiTypeHelper.requireNonNull(builder.processingTotal, this, "processingTotal");
		this.searchFailures = ApiTypeHelper.requireNonNull(builder.searchFailures, this, "searchFailures");
		this.searchTimeInMs = ApiTypeHelper.requireNonNull(builder.searchTimeInMs, this, "searchTimeInMs");
		this.searchTotal = ApiTypeHelper.requireNonNull(builder.searchTotal, this, "searchTotal");
		this.triggerCount = ApiTypeHelper.requireNonNull(builder.triggerCount, this, "triggerCount");

	}

	public static TransformIndexerStats of(Function<Builder, ObjectBuilder<TransformIndexerStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code delete_time_in_ms}
	 */
	@Nullable
	public final Long deleteTimeInMs() {
		return this.deleteTimeInMs;
	}

	/**
	 * Required - API name: {@code documents_indexed}
	 */
	public final long documentsIndexed() {
		return this.documentsIndexed;
	}

	/**
	 * API name: {@code documents_deleted}
	 */
	@Nullable
	public final Long documentsDeleted() {
		return this.documentsDeleted;
	}

	/**
	 * Required - API name: {@code documents_processed}
	 */
	public final long documentsProcessed() {
		return this.documentsProcessed;
	}

	/**
	 * Required - API name: {@code exponential_avg_checkpoint_duration_ms}
	 */
	public final double exponentialAvgCheckpointDurationMs() {
		return this.exponentialAvgCheckpointDurationMs;
	}

	/**
	 * Required - API name: {@code exponential_avg_documents_indexed}
	 */
	public final double exponentialAvgDocumentsIndexed() {
		return this.exponentialAvgDocumentsIndexed;
	}

	/**
	 * Required - API name: {@code exponential_avg_documents_processed}
	 */
	public final double exponentialAvgDocumentsProcessed() {
		return this.exponentialAvgDocumentsProcessed;
	}

	/**
	 * Required - API name: {@code index_failures}
	 */
	public final long indexFailures() {
		return this.indexFailures;
	}

	/**
	 * Required - API name: {@code index_time_in_ms}
	 */
	public final long indexTimeInMs() {
		return this.indexTimeInMs;
	}

	/**
	 * Required - API name: {@code index_total}
	 */
	public final long indexTotal() {
		return this.indexTotal;
	}

	/**
	 * Required - API name: {@code pages_processed}
	 */
	public final long pagesProcessed() {
		return this.pagesProcessed;
	}

	/**
	 * Required - API name: {@code processing_time_in_ms}
	 */
	public final long processingTimeInMs() {
		return this.processingTimeInMs;
	}

	/**
	 * Required - API name: {@code processing_total}
	 */
	public final long processingTotal() {
		return this.processingTotal;
	}

	/**
	 * Required - API name: {@code search_failures}
	 */
	public final long searchFailures() {
		return this.searchFailures;
	}

	/**
	 * Required - API name: {@code search_time_in_ms}
	 */
	public final long searchTimeInMs() {
		return this.searchTimeInMs;
	}

	/**
	 * Required - API name: {@code search_total}
	 */
	public final long searchTotal() {
		return this.searchTotal;
	}

	/**
	 * Required - API name: {@code trigger_count}
	 */
	public final long triggerCount() {
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

		if (this.deleteTimeInMs != null) {
			generator.writeKey("delete_time_in_ms");
			generator.write(this.deleteTimeInMs);

		}
		generator.writeKey("documents_indexed");
		generator.write(this.documentsIndexed);

		if (this.documentsDeleted != null) {
			generator.writeKey("documents_deleted");
			generator.write(this.documentsDeleted);

		}
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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TransformIndexerStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<TransformIndexerStats> {
		@Nullable
		private Long deleteTimeInMs;

		private Long documentsIndexed;

		@Nullable
		private Long documentsDeleted;

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
		 * API name: {@code delete_time_in_ms}
		 */
		public final Builder deleteTimeInMs(@Nullable Long value) {
			this.deleteTimeInMs = value;
			return this;
		}

		/**
		 * Required - API name: {@code documents_indexed}
		 */
		public final Builder documentsIndexed(long value) {
			this.documentsIndexed = value;
			return this;
		}

		/**
		 * API name: {@code documents_deleted}
		 */
		public final Builder documentsDeleted(@Nullable Long value) {
			this.documentsDeleted = value;
			return this;
		}

		/**
		 * Required - API name: {@code documents_processed}
		 */
		public final Builder documentsProcessed(long value) {
			this.documentsProcessed = value;
			return this;
		}

		/**
		 * Required - API name: {@code exponential_avg_checkpoint_duration_ms}
		 */
		public final Builder exponentialAvgCheckpointDurationMs(double value) {
			this.exponentialAvgCheckpointDurationMs = value;
			return this;
		}

		/**
		 * Required - API name: {@code exponential_avg_documents_indexed}
		 */
		public final Builder exponentialAvgDocumentsIndexed(double value) {
			this.exponentialAvgDocumentsIndexed = value;
			return this;
		}

		/**
		 * Required - API name: {@code exponential_avg_documents_processed}
		 */
		public final Builder exponentialAvgDocumentsProcessed(double value) {
			this.exponentialAvgDocumentsProcessed = value;
			return this;
		}

		/**
		 * Required - API name: {@code index_failures}
		 */
		public final Builder indexFailures(long value) {
			this.indexFailures = value;
			return this;
		}

		/**
		 * Required - API name: {@code index_time_in_ms}
		 */
		public final Builder indexTimeInMs(long value) {
			this.indexTimeInMs = value;
			return this;
		}

		/**
		 * Required - API name: {@code index_total}
		 */
		public final Builder indexTotal(long value) {
			this.indexTotal = value;
			return this;
		}

		/**
		 * Required - API name: {@code pages_processed}
		 */
		public final Builder pagesProcessed(long value) {
			this.pagesProcessed = value;
			return this;
		}

		/**
		 * Required - API name: {@code processing_time_in_ms}
		 */
		public final Builder processingTimeInMs(long value) {
			this.processingTimeInMs = value;
			return this;
		}

		/**
		 * Required - API name: {@code processing_total}
		 */
		public final Builder processingTotal(long value) {
			this.processingTotal = value;
			return this;
		}

		/**
		 * Required - API name: {@code search_failures}
		 */
		public final Builder searchFailures(long value) {
			this.searchFailures = value;
			return this;
		}

		/**
		 * Required - API name: {@code search_time_in_ms}
		 */
		public final Builder searchTimeInMs(long value) {
			this.searchTimeInMs = value;
			return this;
		}

		/**
		 * Required - API name: {@code search_total}
		 */
		public final Builder searchTotal(long value) {
			this.searchTotal = value;
			return this;
		}

		/**
		 * Required - API name: {@code trigger_count}
		 */
		public final Builder triggerCount(long value) {
			this.triggerCount = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TransformIndexerStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TransformIndexerStats build() {
			_checkSingleUse();

			return new TransformIndexerStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TransformIndexerStats}
	 */
	public static final JsonpDeserializer<TransformIndexerStats> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TransformIndexerStats::setupTransformIndexerStatsDeserializer);

	protected static void setupTransformIndexerStatsDeserializer(ObjectDeserializer<TransformIndexerStats.Builder> op) {

		op.add(Builder::deleteTimeInMs, JsonpDeserializer.longDeserializer(), "delete_time_in_ms");
		op.add(Builder::documentsIndexed, JsonpDeserializer.longDeserializer(), "documents_indexed");
		op.add(Builder::documentsDeleted, JsonpDeserializer.longDeserializer(), "documents_deleted");
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
