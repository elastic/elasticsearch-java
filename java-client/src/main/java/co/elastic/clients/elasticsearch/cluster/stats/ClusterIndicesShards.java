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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.stats.ClusterIndicesShards

/**
 * Contains statistics about shards assigned to selected nodes.
 * 
 * @see <a href=
 *      "../../doc-files/api-spec.html#cluster.stats.ClusterIndicesShards">API
 *      specification</a>
 */
@JsonpDeserializable
public class ClusterIndicesShards implements JsonpSerializable {
	@Nullable
	private final ClusterIndicesShardsIndex index;

	@Nullable
	private final Double primaries;

	@Nullable
	private final Double replication;

	@Nullable
	private final Double total;

	// ---------------------------------------------------------------------------------------------

	private ClusterIndicesShards(Builder builder) {

		this.index = builder.index;
		this.primaries = builder.primaries;
		this.replication = builder.replication;
		this.total = builder.total;

	}

	public static ClusterIndicesShards of(Function<Builder, ObjectBuilder<ClusterIndicesShards>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Contains statistics about shards assigned to selected nodes.
	 * <p>
	 * API name: {@code index}
	 */
	@Nullable
	public final ClusterIndicesShardsIndex index() {
		return this.index;
	}

	/**
	 * Number of primary shards assigned to selected nodes.
	 * <p>
	 * API name: {@code primaries}
	 */
	@Nullable
	public final Double primaries() {
		return this.primaries;
	}

	/**
	 * Ratio of replica shards to primary shards across all selected nodes.
	 * <p>
	 * API name: {@code replication}
	 */
	@Nullable
	public final Double replication() {
		return this.replication;
	}

	/**
	 * Total number of shards assigned to selected nodes.
	 * <p>
	 * API name: {@code total}
	 */
	@Nullable
	public final Double total() {
		return this.total;
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

		if (this.index != null) {
			generator.writeKey("index");
			this.index.serialize(generator, mapper);

		}
		if (this.primaries != null) {
			generator.writeKey("primaries");
			generator.write(this.primaries);

		}
		if (this.replication != null) {
			generator.writeKey("replication");
			generator.write(this.replication);

		}
		if (this.total != null) {
			generator.writeKey("total");
			generator.write(this.total);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterIndicesShards}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ClusterIndicesShards> {
		@Nullable
		private ClusterIndicesShardsIndex index;

		@Nullable
		private Double primaries;

		@Nullable
		private Double replication;

		@Nullable
		private Double total;

		/**
		 * Contains statistics about shards assigned to selected nodes.
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(@Nullable ClusterIndicesShardsIndex value) {
			this.index = value;
			return this;
		}

		/**
		 * Contains statistics about shards assigned to selected nodes.
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(
				Function<ClusterIndicesShardsIndex.Builder, ObjectBuilder<ClusterIndicesShardsIndex>> fn) {
			return this.index(fn.apply(new ClusterIndicesShardsIndex.Builder()).build());
		}

		/**
		 * Number of primary shards assigned to selected nodes.
		 * <p>
		 * API name: {@code primaries}
		 */
		public final Builder primaries(@Nullable Double value) {
			this.primaries = value;
			return this;
		}

		/**
		 * Ratio of replica shards to primary shards across all selected nodes.
		 * <p>
		 * API name: {@code replication}
		 */
		public final Builder replication(@Nullable Double value) {
			this.replication = value;
			return this;
		}

		/**
		 * Total number of shards assigned to selected nodes.
		 * <p>
		 * API name: {@code total}
		 */
		public final Builder total(@Nullable Double value) {
			this.total = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ClusterIndicesShards}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterIndicesShards build() {
			_checkSingleUse();

			return new ClusterIndicesShards(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClusterIndicesShards}
	 */
	public static final JsonpDeserializer<ClusterIndicesShards> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ClusterIndicesShards::setupClusterIndicesShardsDeserializer);

	protected static void setupClusterIndicesShardsDeserializer(ObjectDeserializer<ClusterIndicesShards.Builder> op) {

		op.add(Builder::index, ClusterIndicesShardsIndex._DESERIALIZER, "index");
		op.add(Builder::primaries, JsonpDeserializer.doubleDeserializer(), "primaries");
		op.add(Builder::replication, JsonpDeserializer.doubleDeserializer(), "replication");
		op.add(Builder::total, JsonpDeserializer.doubleDeserializer(), "total");

	}

}
