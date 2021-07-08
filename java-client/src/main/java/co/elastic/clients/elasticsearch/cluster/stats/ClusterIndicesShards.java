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

package co.elastic.clients.elasticsearch.cluster.stats;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.stats.ClusterIndicesShards
public final class ClusterIndicesShards implements ToJsonp {
	@Nullable
	private final ClusterIndicesShardsIndex index;

	@Nullable
	private final Number primaries;

	@Nullable
	private final Number replication;

	@Nullable
	private final Number total;

	// ---------------------------------------------------------------------------------------------

	protected ClusterIndicesShards(Builder builder) {

		this.index = builder.index;
		this.primaries = builder.primaries;
		this.replication = builder.replication;
		this.total = builder.total;

	}

	/**
	 * Contains statistics about shards assigned to selected nodes.
	 *
	 * API name: {@code index}
	 */
	@Nullable
	public ClusterIndicesShardsIndex index() {
		return this.index;
	}

	/**
	 * Number of primary shards assigned to selected nodes.
	 *
	 * API name: {@code primaries}
	 */
	@Nullable
	public Number primaries() {
		return this.primaries;
	}

	/**
	 * Ratio of replica shards to primary shards across all selected nodes.
	 *
	 * API name: {@code replication}
	 */
	@Nullable
	public Number replication() {
		return this.replication;
	}

	/**
	 * Total number of shards assigned to selected nodes.
	 *
	 * API name: {@code total}
	 */
	@Nullable
	public Number total() {
		return this.total;
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

		if (this.index != null) {

			generator.writeKey("index");
			this.index.toJsonp(generator, mapper);

		}
		if (this.primaries != null) {

			generator.writeKey("primaries");
			generator.write(this.primaries.doubleValue());

		}
		if (this.replication != null) {

			generator.writeKey("replication");
			generator.write(this.replication.doubleValue());

		}
		if (this.total != null) {

			generator.writeKey("total");
			generator.write(this.total.doubleValue());

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterIndicesShards}.
	 */
	public static class Builder implements ObjectBuilder<ClusterIndicesShards> {
		@Nullable
		private ClusterIndicesShardsIndex index;

		@Nullable
		private Number primaries;

		@Nullable
		private Number replication;

		@Nullable
		private Number total;

		/**
		 * Contains statistics about shards assigned to selected nodes.
		 *
		 * API name: {@code index}
		 */
		public Builder index(@Nullable ClusterIndicesShardsIndex value) {
			this.index = value;
			return this;
		}

		/**
		 * Contains statistics about shards assigned to selected nodes.
		 *
		 * API name: {@code index}
		 */
		public Builder index(Function<ClusterIndicesShardsIndex.Builder, ObjectBuilder<ClusterIndicesShardsIndex>> fn) {
			return this.index(fn.apply(new ClusterIndicesShardsIndex.Builder()).build());
		}

		/**
		 * Number of primary shards assigned to selected nodes.
		 *
		 * API name: {@code primaries}
		 */
		public Builder primaries(@Nullable Number value) {
			this.primaries = value;
			return this;
		}

		/**
		 * Ratio of replica shards to primary shards across all selected nodes.
		 *
		 * API name: {@code replication}
		 */
		public Builder replication(@Nullable Number value) {
			this.replication = value;
			return this;
		}

		/**
		 * Total number of shards assigned to selected nodes.
		 *
		 * API name: {@code total}
		 */
		public Builder total(@Nullable Number value) {
			this.total = value;
			return this;
		}

		/**
		 * Builds a {@link ClusterIndicesShards}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterIndicesShards build() {

			return new ClusterIndicesShards(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ClusterIndicesShards
	 */
	public static final JsonpDeserializer<ClusterIndicesShards> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ClusterIndicesShards::setupClusterIndicesShardsDeserializer);

	protected static void setupClusterIndicesShardsDeserializer(
			DelegatingDeserializer<ClusterIndicesShards.Builder> op) {

		op.add(Builder::index, ClusterIndicesShardsIndex.DESERIALIZER, "index");
		op.add(Builder::primaries, JsonpDeserializer.numberDeserializer(), "primaries");
		op.add(Builder::replication, JsonpDeserializer.numberDeserializer(), "replication");
		op.add(Builder::total, JsonpDeserializer.numberDeserializer(), "total");

	}

}
