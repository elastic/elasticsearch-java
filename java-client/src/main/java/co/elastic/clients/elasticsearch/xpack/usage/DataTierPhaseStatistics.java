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

package co.elastic.clients.elasticsearch.xpack.usage;

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
import javax.annotation.Nullable;

// typedef: xpack.usage.DataTierPhaseStatistics
@JsonpDeserializable
public final class DataTierPhaseStatistics implements JsonpSerializable {
	private final Long nodeCount;

	private final Long indexCount;

	private final Long totalShardCount;

	private final Long primaryShardCount;

	private final Long docCount;

	private final Long totalSizeBytes;

	private final Long primarySizeBytes;

	private final Long primaryShardSizeAvgBytes;

	private final Long primaryShardSizeMedianBytes;

	private final Long primaryShardSizeMadBytes;

	// ---------------------------------------------------------------------------------------------

	public DataTierPhaseStatistics(Builder builder) {

		this.nodeCount = Objects.requireNonNull(builder.nodeCount, "node_count");
		this.indexCount = Objects.requireNonNull(builder.indexCount, "index_count");
		this.totalShardCount = Objects.requireNonNull(builder.totalShardCount, "total_shard_count");
		this.primaryShardCount = Objects.requireNonNull(builder.primaryShardCount, "primary_shard_count");
		this.docCount = Objects.requireNonNull(builder.docCount, "doc_count");
		this.totalSizeBytes = Objects.requireNonNull(builder.totalSizeBytes, "total_size_bytes");
		this.primarySizeBytes = Objects.requireNonNull(builder.primarySizeBytes, "primary_size_bytes");
		this.primaryShardSizeAvgBytes = Objects.requireNonNull(builder.primaryShardSizeAvgBytes,
				"primary_shard_size_avg_bytes");
		this.primaryShardSizeMedianBytes = Objects.requireNonNull(builder.primaryShardSizeMedianBytes,
				"primary_shard_size_median_bytes");
		this.primaryShardSizeMadBytes = Objects.requireNonNull(builder.primaryShardSizeMadBytes,
				"primary_shard_size_mad_bytes");

	}

	/**
	 * API name: {@code node_count}
	 */
	public Long nodeCount() {
		return this.nodeCount;
	}

	/**
	 * API name: {@code index_count}
	 */
	public Long indexCount() {
		return this.indexCount;
	}

	/**
	 * API name: {@code total_shard_count}
	 */
	public Long totalShardCount() {
		return this.totalShardCount;
	}

	/**
	 * API name: {@code primary_shard_count}
	 */
	public Long primaryShardCount() {
		return this.primaryShardCount;
	}

	/**
	 * API name: {@code doc_count}
	 */
	public Long docCount() {
		return this.docCount;
	}

	/**
	 * API name: {@code total_size_bytes}
	 */
	public Long totalSizeBytes() {
		return this.totalSizeBytes;
	}

	/**
	 * API name: {@code primary_size_bytes}
	 */
	public Long primarySizeBytes() {
		return this.primarySizeBytes;
	}

	/**
	 * API name: {@code primary_shard_size_avg_bytes}
	 */
	public Long primaryShardSizeAvgBytes() {
		return this.primaryShardSizeAvgBytes;
	}

	/**
	 * API name: {@code primary_shard_size_median_bytes}
	 */
	public Long primaryShardSizeMedianBytes() {
		return this.primaryShardSizeMedianBytes;
	}

	/**
	 * API name: {@code primary_shard_size_mad_bytes}
	 */
	public Long primaryShardSizeMadBytes() {
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

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataTierPhaseStatistics}.
	 */
	public static class Builder implements ObjectBuilder<DataTierPhaseStatistics> {
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
		 * API name: {@code node_count}
		 */
		public Builder nodeCount(Long value) {
			this.nodeCount = value;
			return this;
		}

		/**
		 * API name: {@code index_count}
		 */
		public Builder indexCount(Long value) {
			this.indexCount = value;
			return this;
		}

		/**
		 * API name: {@code total_shard_count}
		 */
		public Builder totalShardCount(Long value) {
			this.totalShardCount = value;
			return this;
		}

		/**
		 * API name: {@code primary_shard_count}
		 */
		public Builder primaryShardCount(Long value) {
			this.primaryShardCount = value;
			return this;
		}

		/**
		 * API name: {@code doc_count}
		 */
		public Builder docCount(Long value) {
			this.docCount = value;
			return this;
		}

		/**
		 * API name: {@code total_size_bytes}
		 */
		public Builder totalSizeBytes(Long value) {
			this.totalSizeBytes = value;
			return this;
		}

		/**
		 * API name: {@code primary_size_bytes}
		 */
		public Builder primarySizeBytes(Long value) {
			this.primarySizeBytes = value;
			return this;
		}

		/**
		 * API name: {@code primary_shard_size_avg_bytes}
		 */
		public Builder primaryShardSizeAvgBytes(Long value) {
			this.primaryShardSizeAvgBytes = value;
			return this;
		}

		/**
		 * API name: {@code primary_shard_size_median_bytes}
		 */
		public Builder primaryShardSizeMedianBytes(Long value) {
			this.primaryShardSizeMedianBytes = value;
			return this;
		}

		/**
		 * API name: {@code primary_shard_size_mad_bytes}
		 */
		public Builder primaryShardSizeMadBytes(Long value) {
			this.primaryShardSizeMadBytes = value;
			return this;
		}

		/**
		 * Builds a {@link DataTierPhaseStatistics}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataTierPhaseStatistics build() {

			return new DataTierPhaseStatistics(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataTierPhaseStatistics}
	 */
	public static final JsonpDeserializer<DataTierPhaseStatistics> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DataTierPhaseStatistics::setupDataTierPhaseStatisticsDeserializer, Builder::build);

	protected static void setupDataTierPhaseStatisticsDeserializer(
			DelegatingDeserializer<DataTierPhaseStatistics.Builder> op) {

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
