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

package co.elastic.clients.elasticsearch.rollup.get_jobs;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;

// typedef: rollup.get_jobs.RollupJobStats
@JsonpDeserializable
public final class RollupJobStats implements JsonpSerializable {
	private final long documentsProcessed;

	private final long indexFailures;

	private final long indexTimeInMs;

	private final long indexTotal;

	private final long pagesProcessed;

	private final long rollupsIndexed;

	private final long searchFailures;

	private final long searchTimeInMs;

	private final long searchTotal;

	private final long triggerCount;

	private final long processingTimeInMs;

	private final long processingTotal;

	// ---------------------------------------------------------------------------------------------

	public RollupJobStats(Builder builder) {

		this.documentsProcessed = Objects.requireNonNull(builder.documentsProcessed, "documents_processed");
		this.indexFailures = Objects.requireNonNull(builder.indexFailures, "index_failures");
		this.indexTimeInMs = Objects.requireNonNull(builder.indexTimeInMs, "index_time_in_ms");
		this.indexTotal = Objects.requireNonNull(builder.indexTotal, "index_total");
		this.pagesProcessed = Objects.requireNonNull(builder.pagesProcessed, "pages_processed");
		this.rollupsIndexed = Objects.requireNonNull(builder.rollupsIndexed, "rollups_indexed");
		this.searchFailures = Objects.requireNonNull(builder.searchFailures, "search_failures");
		this.searchTimeInMs = Objects.requireNonNull(builder.searchTimeInMs, "search_time_in_ms");
		this.searchTotal = Objects.requireNonNull(builder.searchTotal, "search_total");
		this.triggerCount = Objects.requireNonNull(builder.triggerCount, "trigger_count");
		this.processingTimeInMs = Objects.requireNonNull(builder.processingTimeInMs, "processing_time_in_ms");
		this.processingTotal = Objects.requireNonNull(builder.processingTotal, "processing_total");

	}

	public RollupJobStats(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code documents_processed}
	 */
	public long documentsProcessed() {
		return this.documentsProcessed;
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
	 * Required - API name: {@code rollups_indexed}
	 */
	public long rollupsIndexed() {
		return this.rollupsIndexed;
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
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("documents_processed");
		generator.write(this.documentsProcessed);

		generator.writeKey("index_failures");
		generator.write(this.indexFailures);

		generator.writeKey("index_time_in_ms");
		generator.write(this.indexTimeInMs);

		generator.writeKey("index_total");
		generator.write(this.indexTotal);

		generator.writeKey("pages_processed");
		generator.write(this.pagesProcessed);

		generator.writeKey("rollups_indexed");
		generator.write(this.rollupsIndexed);

		generator.writeKey("search_failures");
		generator.write(this.searchFailures);

		generator.writeKey("search_time_in_ms");
		generator.write(this.searchTimeInMs);

		generator.writeKey("search_total");
		generator.write(this.searchTotal);

		generator.writeKey("trigger_count");
		generator.write(this.triggerCount);

		generator.writeKey("processing_time_in_ms");
		generator.write(this.processingTimeInMs);

		generator.writeKey("processing_total");
		generator.write(this.processingTotal);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RollupJobStats}.
	 */
	public static class Builder implements ObjectBuilder<RollupJobStats> {
		private Long documentsProcessed;

		private Long indexFailures;

		private Long indexTimeInMs;

		private Long indexTotal;

		private Long pagesProcessed;

		private Long rollupsIndexed;

		private Long searchFailures;

		private Long searchTimeInMs;

		private Long searchTotal;

		private Long triggerCount;

		private Long processingTimeInMs;

		private Long processingTotal;

		/**
		 * Required - API name: {@code documents_processed}
		 */
		public Builder documentsProcessed(long value) {
			this.documentsProcessed = value;
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
		 * Required - API name: {@code rollups_indexed}
		 */
		public Builder rollupsIndexed(long value) {
			this.rollupsIndexed = value;
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
		 * Builds a {@link RollupJobStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RollupJobStats build() {

			return new RollupJobStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RollupJobStats}
	 */
	public static final JsonpDeserializer<RollupJobStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RollupJobStats::setupRollupJobStatsDeserializer, Builder::build);

	protected static void setupRollupJobStatsDeserializer(DelegatingDeserializer<RollupJobStats.Builder> op) {

		op.add(Builder::documentsProcessed, JsonpDeserializer.longDeserializer(), "documents_processed");
		op.add(Builder::indexFailures, JsonpDeserializer.longDeserializer(), "index_failures");
		op.add(Builder::indexTimeInMs, JsonpDeserializer.longDeserializer(), "index_time_in_ms");
		op.add(Builder::indexTotal, JsonpDeserializer.longDeserializer(), "index_total");
		op.add(Builder::pagesProcessed, JsonpDeserializer.longDeserializer(), "pages_processed");
		op.add(Builder::rollupsIndexed, JsonpDeserializer.longDeserializer(), "rollups_indexed");
		op.add(Builder::searchFailures, JsonpDeserializer.longDeserializer(), "search_failures");
		op.add(Builder::searchTimeInMs, JsonpDeserializer.longDeserializer(), "search_time_in_ms");
		op.add(Builder::searchTotal, JsonpDeserializer.longDeserializer(), "search_total");
		op.add(Builder::triggerCount, JsonpDeserializer.longDeserializer(), "trigger_count");
		op.add(Builder::processingTimeInMs, JsonpDeserializer.longDeserializer(), "processing_time_in_ms");
		op.add(Builder::processingTotal, JsonpDeserializer.longDeserializer(), "processing_total");

	}

}
