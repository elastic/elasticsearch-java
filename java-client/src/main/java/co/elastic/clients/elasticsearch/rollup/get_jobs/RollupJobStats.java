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

package co.elastic.clients.elasticsearch.rollup.get_jobs;

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
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: rollup.get_jobs.RollupJobStats

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#rollup.get_jobs.RollupJobStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class RollupJobStats implements JsonpSerializable {
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

	private RollupJobStats(Builder builder) {

		this.documentsProcessed = ApiTypeHelper.requireNonNull(builder.documentsProcessed, this, "documentsProcessed");
		this.indexFailures = ApiTypeHelper.requireNonNull(builder.indexFailures, this, "indexFailures");
		this.indexTimeInMs = ApiTypeHelper.requireNonNull(builder.indexTimeInMs, this, "indexTimeInMs");
		this.indexTotal = ApiTypeHelper.requireNonNull(builder.indexTotal, this, "indexTotal");
		this.pagesProcessed = ApiTypeHelper.requireNonNull(builder.pagesProcessed, this, "pagesProcessed");
		this.rollupsIndexed = ApiTypeHelper.requireNonNull(builder.rollupsIndexed, this, "rollupsIndexed");
		this.searchFailures = ApiTypeHelper.requireNonNull(builder.searchFailures, this, "searchFailures");
		this.searchTimeInMs = ApiTypeHelper.requireNonNull(builder.searchTimeInMs, this, "searchTimeInMs");
		this.searchTotal = ApiTypeHelper.requireNonNull(builder.searchTotal, this, "searchTotal");
		this.triggerCount = ApiTypeHelper.requireNonNull(builder.triggerCount, this, "triggerCount");
		this.processingTimeInMs = ApiTypeHelper.requireNonNull(builder.processingTimeInMs, this, "processingTimeInMs");
		this.processingTotal = ApiTypeHelper.requireNonNull(builder.processingTotal, this, "processingTotal");

	}

	public static RollupJobStats of(Function<Builder, ObjectBuilder<RollupJobStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code documents_processed}
	 */
	public final long documentsProcessed() {
		return this.documentsProcessed;
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
	 * Required - API name: {@code rollups_indexed}
	 */
	public final long rollupsIndexed() {
		return this.rollupsIndexed;
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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RollupJobStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<RollupJobStats> {
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
		public final Builder documentsProcessed(long value) {
			this.documentsProcessed = value;
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
		 * Required - API name: {@code rollups_indexed}
		 */
		public final Builder rollupsIndexed(long value) {
			this.rollupsIndexed = value;
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

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RollupJobStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RollupJobStats build() {
			_checkSingleUse();

			return new RollupJobStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RollupJobStats}
	 */
	public static final JsonpDeserializer<RollupJobStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RollupJobStats::setupRollupJobStatsDeserializer);

	protected static void setupRollupJobStatsDeserializer(ObjectDeserializer<RollupJobStats.Builder> op) {

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
