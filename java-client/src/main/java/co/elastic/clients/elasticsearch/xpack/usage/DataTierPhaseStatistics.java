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

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: xpack.usage.DataTierPhaseStatistics
public final class DataTierPhaseStatistics implements ToJsonp {
	private final Number nodeCount;

	private final Number indexCount;

	private final Number totalShardCount;

	private final Number primaryShardCount;

	private final Number docCount;

	private final Number totalSizeBytes;

	private final Number primarySizeBytes;

	private final Number primaryShardSizeAvgBytes;

	private final Number primaryShardSizeMedianBytes;

	private final Number primaryShardSizeMadBytes;

	// ---------------------------------------------------------------------------------------------

	protected DataTierPhaseStatistics(Builder builder) {

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
	public Number nodeCount() {
		return this.nodeCount;
	}

	/**
	 * API name: {@code index_count}
	 */
	public Number indexCount() {
		return this.indexCount;
	}

	/**
	 * API name: {@code total_shard_count}
	 */
	public Number totalShardCount() {
		return this.totalShardCount;
	}

	/**
	 * API name: {@code primary_shard_count}
	 */
	public Number primaryShardCount() {
		return this.primaryShardCount;
	}

	/**
	 * API name: {@code doc_count}
	 */
	public Number docCount() {
		return this.docCount;
	}

	/**
	 * API name: {@code total_size_bytes}
	 */
	public Number totalSizeBytes() {
		return this.totalSizeBytes;
	}

	/**
	 * API name: {@code primary_size_bytes}
	 */
	public Number primarySizeBytes() {
		return this.primarySizeBytes;
	}

	/**
	 * API name: {@code primary_shard_size_avg_bytes}
	 */
	public Number primaryShardSizeAvgBytes() {
		return this.primaryShardSizeAvgBytes;
	}

	/**
	 * API name: {@code primary_shard_size_median_bytes}
	 */
	public Number primaryShardSizeMedianBytes() {
		return this.primaryShardSizeMedianBytes;
	}

	/**
	 * API name: {@code primary_shard_size_mad_bytes}
	 */
	public Number primaryShardSizeMadBytes() {
		return this.primaryShardSizeMadBytes;
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

		generator.writeKey("node_count");
		generator.write(this.nodeCount.doubleValue());

		generator.writeKey("index_count");
		generator.write(this.indexCount.doubleValue());

		generator.writeKey("total_shard_count");
		generator.write(this.totalShardCount.doubleValue());

		generator.writeKey("primary_shard_count");
		generator.write(this.primaryShardCount.doubleValue());

		generator.writeKey("doc_count");
		generator.write(this.docCount.doubleValue());

		generator.writeKey("total_size_bytes");
		generator.write(this.totalSizeBytes.doubleValue());

		generator.writeKey("primary_size_bytes");
		generator.write(this.primarySizeBytes.doubleValue());

		generator.writeKey("primary_shard_size_avg_bytes");
		generator.write(this.primaryShardSizeAvgBytes.doubleValue());

		generator.writeKey("primary_shard_size_median_bytes");
		generator.write(this.primaryShardSizeMedianBytes.doubleValue());

		generator.writeKey("primary_shard_size_mad_bytes");
		generator.write(this.primaryShardSizeMadBytes.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataTierPhaseStatistics}.
	 */
	public static class Builder implements ObjectBuilder<DataTierPhaseStatistics> {
		private Number nodeCount;

		private Number indexCount;

		private Number totalShardCount;

		private Number primaryShardCount;

		private Number docCount;

		private Number totalSizeBytes;

		private Number primarySizeBytes;

		private Number primaryShardSizeAvgBytes;

		private Number primaryShardSizeMedianBytes;

		private Number primaryShardSizeMadBytes;

		/**
		 * API name: {@code node_count}
		 */
		public Builder nodeCount(Number value) {
			this.nodeCount = value;
			return this;
		}

		/**
		 * API name: {@code index_count}
		 */
		public Builder indexCount(Number value) {
			this.indexCount = value;
			return this;
		}

		/**
		 * API name: {@code total_shard_count}
		 */
		public Builder totalShardCount(Number value) {
			this.totalShardCount = value;
			return this;
		}

		/**
		 * API name: {@code primary_shard_count}
		 */
		public Builder primaryShardCount(Number value) {
			this.primaryShardCount = value;
			return this;
		}

		/**
		 * API name: {@code doc_count}
		 */
		public Builder docCount(Number value) {
			this.docCount = value;
			return this;
		}

		/**
		 * API name: {@code total_size_bytes}
		 */
		public Builder totalSizeBytes(Number value) {
			this.totalSizeBytes = value;
			return this;
		}

		/**
		 * API name: {@code primary_size_bytes}
		 */
		public Builder primarySizeBytes(Number value) {
			this.primarySizeBytes = value;
			return this;
		}

		/**
		 * API name: {@code primary_shard_size_avg_bytes}
		 */
		public Builder primaryShardSizeAvgBytes(Number value) {
			this.primaryShardSizeAvgBytes = value;
			return this;
		}

		/**
		 * API name: {@code primary_shard_size_median_bytes}
		 */
		public Builder primaryShardSizeMedianBytes(Number value) {
			this.primaryShardSizeMedianBytes = value;
			return this;
		}

		/**
		 * API name: {@code primary_shard_size_mad_bytes}
		 */
		public Builder primaryShardSizeMadBytes(Number value) {
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
	 * Json parser for DataTierPhaseStatistics
	 */
	public static final JsonpValueParser<DataTierPhaseStatistics> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, DataTierPhaseStatistics::setupDataTierPhaseStatisticsParser);

	protected static void setupDataTierPhaseStatisticsParser(
			DelegatingJsonpValueParser<DataTierPhaseStatistics.Builder> op) {

		op.add(Builder::nodeCount, JsonpValueParser.numberParser(), "node_count");
		op.add(Builder::indexCount, JsonpValueParser.numberParser(), "index_count");
		op.add(Builder::totalShardCount, JsonpValueParser.numberParser(), "total_shard_count");
		op.add(Builder::primaryShardCount, JsonpValueParser.numberParser(), "primary_shard_count");
		op.add(Builder::docCount, JsonpValueParser.numberParser(), "doc_count");
		op.add(Builder::totalSizeBytes, JsonpValueParser.numberParser(), "total_size_bytes");
		op.add(Builder::primarySizeBytes, JsonpValueParser.numberParser(), "primary_size_bytes");
		op.add(Builder::primaryShardSizeAvgBytes, JsonpValueParser.numberParser(), "primary_shard_size_avg_bytes");
		op.add(Builder::primaryShardSizeMedianBytes, JsonpValueParser.numberParser(),
				"primary_shard_size_median_bytes");
		op.add(Builder::primaryShardSizeMadBytes, JsonpValueParser.numberParser(), "primary_shard_size_mad_bytes");

	}

}
