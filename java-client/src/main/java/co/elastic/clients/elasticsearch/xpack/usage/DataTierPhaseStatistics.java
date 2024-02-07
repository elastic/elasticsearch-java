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

package co.elastic.clients.elasticsearch.xpack.usage;

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

// typedef: xpack.usage.DataTierPhaseStatistics

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#xpack.usage.DataTierPhaseStatistics">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataTierPhaseStatistics implements JsonpSerializable {
	private final long nodeCount;

	private final long indexCount;

	private final long totalShardCount;

	private final long primaryShardCount;

	private final long docCount;

	private final long totalSizeBytes;

	private final long primarySizeBytes;

	private final long primaryShardSizeAvgBytes;

	private final long primaryShardSizeMedianBytes;

	private final long primaryShardSizeMadBytes;

	// ---------------------------------------------------------------------------------------------

	private DataTierPhaseStatistics(Builder builder) {

		this.nodeCount = ApiTypeHelper.requireNonNull(builder.nodeCount, this, "nodeCount");
		this.indexCount = ApiTypeHelper.requireNonNull(builder.indexCount, this, "indexCount");
		this.totalShardCount = ApiTypeHelper.requireNonNull(builder.totalShardCount, this, "totalShardCount");
		this.primaryShardCount = ApiTypeHelper.requireNonNull(builder.primaryShardCount, this, "primaryShardCount");
		this.docCount = ApiTypeHelper.requireNonNull(builder.docCount, this, "docCount");
		this.totalSizeBytes = ApiTypeHelper.requireNonNull(builder.totalSizeBytes, this, "totalSizeBytes");
		this.primarySizeBytes = ApiTypeHelper.requireNonNull(builder.primarySizeBytes, this, "primarySizeBytes");
		this.primaryShardSizeAvgBytes = ApiTypeHelper.requireNonNull(builder.primaryShardSizeAvgBytes, this,
				"primaryShardSizeAvgBytes");
		this.primaryShardSizeMedianBytes = ApiTypeHelper.requireNonNull(builder.primaryShardSizeMedianBytes, this,
				"primaryShardSizeMedianBytes");
		this.primaryShardSizeMadBytes = ApiTypeHelper.requireNonNull(builder.primaryShardSizeMadBytes, this,
				"primaryShardSizeMadBytes");

	}

	public static DataTierPhaseStatistics of(Function<Builder, ObjectBuilder<DataTierPhaseStatistics>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code node_count}
	 */
	public final long nodeCount() {
		return this.nodeCount;
	}

	/**
	 * Required - API name: {@code index_count}
	 */
	public final long indexCount() {
		return this.indexCount;
	}

	/**
	 * Required - API name: {@code total_shard_count}
	 */
	public final long totalShardCount() {
		return this.totalShardCount;
	}

	/**
	 * Required - API name: {@code primary_shard_count}
	 */
	public final long primaryShardCount() {
		return this.primaryShardCount;
	}

	/**
	 * Required - API name: {@code doc_count}
	 */
	public final long docCount() {
		return this.docCount;
	}

	/**
	 * Required - API name: {@code total_size_bytes}
	 */
	public final long totalSizeBytes() {
		return this.totalSizeBytes;
	}

	/**
	 * Required - API name: {@code primary_size_bytes}
	 */
	public final long primarySizeBytes() {
		return this.primarySizeBytes;
	}

	/**
	 * Required - API name: {@code primary_shard_size_avg_bytes}
	 */
	public final long primaryShardSizeAvgBytes() {
		return this.primaryShardSizeAvgBytes;
	}

	/**
	 * Required - API name: {@code primary_shard_size_median_bytes}
	 */
	public final long primaryShardSizeMedianBytes() {
		return this.primaryShardSizeMedianBytes;
	}

	/**
	 * Required - API name: {@code primary_shard_size_mad_bytes}
	 */
	public final long primaryShardSizeMadBytes() {
		return this.primaryShardSizeMadBytes;
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

		generator.writeKey("node_count");
		generator.write(this.nodeCount);

		generator.writeKey("index_count");
		generator.write(this.indexCount);

		generator.writeKey("total_shard_count");
		generator.write(this.totalShardCount);

		generator.writeKey("primary_shard_count");
		generator.write(this.primaryShardCount);

		generator.writeKey("doc_count");
		generator.write(this.docCount);

		generator.writeKey("total_size_bytes");
		generator.write(this.totalSizeBytes);

		generator.writeKey("primary_size_bytes");
		generator.write(this.primarySizeBytes);

		generator.writeKey("primary_shard_size_avg_bytes");
		generator.write(this.primaryShardSizeAvgBytes);

		generator.writeKey("primary_shard_size_median_bytes");
		generator.write(this.primaryShardSizeMedianBytes);

		generator.writeKey("primary_shard_size_mad_bytes");
		generator.write(this.primaryShardSizeMadBytes);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataTierPhaseStatistics}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DataTierPhaseStatistics> {
		private Long nodeCount;

		private Long indexCount;

		private Long totalShardCount;

		private Long primaryShardCount;

		private Long docCount;

		private Long totalSizeBytes;

		private Long primarySizeBytes;

		private Long primaryShardSizeAvgBytes;

		private Long primaryShardSizeMedianBytes;

		private Long primaryShardSizeMadBytes;

		/**
		 * Required - API name: {@code node_count}
		 */
		public final Builder nodeCount(long value) {
			this.nodeCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code index_count}
		 */
		public final Builder indexCount(long value) {
			this.indexCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_shard_count}
		 */
		public final Builder totalShardCount(long value) {
			this.totalShardCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code primary_shard_count}
		 */
		public final Builder primaryShardCount(long value) {
			this.primaryShardCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code doc_count}
		 */
		public final Builder docCount(long value) {
			this.docCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_size_bytes}
		 */
		public final Builder totalSizeBytes(long value) {
			this.totalSizeBytes = value;
			return this;
		}

		/**
		 * Required - API name: {@code primary_size_bytes}
		 */
		public final Builder primarySizeBytes(long value) {
			this.primarySizeBytes = value;
			return this;
		}

		/**
		 * Required - API name: {@code primary_shard_size_avg_bytes}
		 */
		public final Builder primaryShardSizeAvgBytes(long value) {
			this.primaryShardSizeAvgBytes = value;
			return this;
		}

		/**
		 * Required - API name: {@code primary_shard_size_median_bytes}
		 */
		public final Builder primaryShardSizeMedianBytes(long value) {
			this.primaryShardSizeMedianBytes = value;
			return this;
		}

		/**
		 * Required - API name: {@code primary_shard_size_mad_bytes}
		 */
		public final Builder primaryShardSizeMadBytes(long value) {
			this.primaryShardSizeMadBytes = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataTierPhaseStatistics}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataTierPhaseStatistics build() {
			_checkSingleUse();

			return new DataTierPhaseStatistics(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataTierPhaseStatistics}
	 */
	public static final JsonpDeserializer<DataTierPhaseStatistics> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DataTierPhaseStatistics::setupDataTierPhaseStatisticsDeserializer);

	protected static void setupDataTierPhaseStatisticsDeserializer(
			ObjectDeserializer<DataTierPhaseStatistics.Builder> op) {

		op.add(Builder::nodeCount, JsonpDeserializer.longDeserializer(), "node_count");
		op.add(Builder::indexCount, JsonpDeserializer.longDeserializer(), "index_count");
		op.add(Builder::totalShardCount, JsonpDeserializer.longDeserializer(), "total_shard_count");
		op.add(Builder::primaryShardCount, JsonpDeserializer.longDeserializer(), "primary_shard_count");
		op.add(Builder::docCount, JsonpDeserializer.longDeserializer(), "doc_count");
		op.add(Builder::totalSizeBytes, JsonpDeserializer.longDeserializer(), "total_size_bytes");
		op.add(Builder::primarySizeBytes, JsonpDeserializer.longDeserializer(), "primary_size_bytes");
		op.add(Builder::primaryShardSizeAvgBytes, JsonpDeserializer.longDeserializer(), "primary_shard_size_avg_bytes");
		op.add(Builder::primaryShardSizeMedianBytes, JsonpDeserializer.longDeserializer(),
				"primary_shard_size_median_bytes");
		op.add(Builder::primaryShardSizeMadBytes, JsonpDeserializer.longDeserializer(), "primary_shard_size_mad_bytes");

	}

}
