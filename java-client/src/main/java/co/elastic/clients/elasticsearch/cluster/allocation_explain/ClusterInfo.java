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

package co.elastic.clients.elasticsearch.cluster.allocation_explain;

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
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.allocation_explain.ClusterInfo
@JsonpDeserializable
public final class ClusterInfo implements JsonpSerializable {
	private final Map<String, NodeDiskUsage> nodes;

	private final Map<String, Long> shardSizes;

	@Nullable
	private final Map<String, String> shardDataSetSizes;

	private final Map<String, String> shardPaths;

	private final List<ReservedSize> reservedSizes;

	// ---------------------------------------------------------------------------------------------

	public ClusterInfo(Builder builder) {

		this.nodes = Objects.requireNonNull(builder.nodes, "nodes");
		this.shardSizes = Objects.requireNonNull(builder.shardSizes, "shard_sizes");
		this.shardDataSetSizes = builder.shardDataSetSizes;
		this.shardPaths = Objects.requireNonNull(builder.shardPaths, "shard_paths");
		this.reservedSizes = Objects.requireNonNull(builder.reservedSizes, "reserved_sizes");

	}

	/**
	 * API name: {@code nodes}
	 */
	public Map<String, NodeDiskUsage> nodes() {
		return this.nodes;
	}

	/**
	 * API name: {@code shard_sizes}
	 */
	public Map<String, Long> shardSizes() {
		return this.shardSizes;
	}

	/**
	 * API name: {@code shard_data_set_sizes}
	 */
	@Nullable
	public Map<String, String> shardDataSetSizes() {
		return this.shardDataSetSizes;
	}

	/**
	 * API name: {@code shard_paths}
	 */
	public Map<String, String> shardPaths() {
		return this.shardPaths;
	}

	/**
	 * API name: {@code reserved_sizes}
	 */
	public List<ReservedSize> reservedSizes() {
		return this.reservedSizes;
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

		generator.writeKey("nodes");
		generator.writeStartObject();
		for (Map.Entry<String, NodeDiskUsage> item0 : this.nodes.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("shard_sizes");
		generator.writeStartObject();
		for (Map.Entry<String, Long> item0 : this.shardSizes.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.write(item0.getValue());

		}
		generator.writeEnd();

		if (this.shardDataSetSizes != null) {

			generator.writeKey("shard_data_set_sizes");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.shardDataSetSizes.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}

		generator.writeKey("shard_paths");
		generator.writeStartObject();
		for (Map.Entry<String, String> item0 : this.shardPaths.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.write(item0.getValue());

		}
		generator.writeEnd();

		generator.writeKey("reserved_sizes");
		generator.writeStartArray();
		for (ReservedSize item0 : this.reservedSizes) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterInfo}.
	 */
	public static class Builder implements ObjectBuilder<ClusterInfo> {
		private Map<String, NodeDiskUsage> nodes;

		private Map<String, Long> shardSizes;

		@Nullable
		private Map<String, String> shardDataSetSizes;

		private Map<String, String> shardPaths;

		private List<ReservedSize> reservedSizes;

		/**
		 * API name: {@code nodes}
		 */
		public Builder nodes(Map<String, NodeDiskUsage> value) {
			this.nodes = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #nodes(Map)}, creating the map if needed.
		 */
		public Builder putNodes(String key, NodeDiskUsage value) {
			if (this.nodes == null) {
				this.nodes = new HashMap<>();
			}
			this.nodes.put(key, value);
			return this;
		}

		/**
		 * Set {@link #nodes(Map)} to a singleton map.
		 */
		public Builder nodes(String key, Function<NodeDiskUsage.Builder, ObjectBuilder<NodeDiskUsage>> fn) {
			return this.nodes(Collections.singletonMap(key, fn.apply(new NodeDiskUsage.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #nodes(Map)}, creating the map if needed.
		 */
		public Builder putNodes(String key, Function<NodeDiskUsage.Builder, ObjectBuilder<NodeDiskUsage>> fn) {
			return this.putNodes(key, fn.apply(new NodeDiskUsage.Builder()).build());
		}

		/**
		 * API name: {@code shard_sizes}
		 */
		public Builder shardSizes(Map<String, Long> value) {
			this.shardSizes = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #shardSizes(Map)}, creating the map if needed.
		 */
		public Builder putShardSizes(String key, Long value) {
			if (this.shardSizes == null) {
				this.shardSizes = new HashMap<>();
			}
			this.shardSizes.put(key, value);
			return this;
		}

		/**
		 * API name: {@code shard_data_set_sizes}
		 */
		public Builder shardDataSetSizes(@Nullable Map<String, String> value) {
			this.shardDataSetSizes = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #shardDataSetSizes(Map)}, creating the map if
		 * needed.
		 */
		public Builder putShardDataSetSizes(String key, String value) {
			if (this.shardDataSetSizes == null) {
				this.shardDataSetSizes = new HashMap<>();
			}
			this.shardDataSetSizes.put(key, value);
			return this;
		}

		/**
		 * API name: {@code shard_paths}
		 */
		public Builder shardPaths(Map<String, String> value) {
			this.shardPaths = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #shardPaths(Map)}, creating the map if needed.
		 */
		public Builder putShardPaths(String key, String value) {
			if (this.shardPaths == null) {
				this.shardPaths = new HashMap<>();
			}
			this.shardPaths.put(key, value);
			return this;
		}

		/**
		 * API name: {@code reserved_sizes}
		 */
		public Builder reservedSizes(List<ReservedSize> value) {
			this.reservedSizes = value;
			return this;
		}

		/**
		 * API name: {@code reserved_sizes}
		 */
		public Builder reservedSizes(ReservedSize... value) {
			this.reservedSizes = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #reservedSizes(List)}, creating the list if needed.
		 */
		public Builder addReservedSizes(ReservedSize value) {
			if (this.reservedSizes == null) {
				this.reservedSizes = new ArrayList<>();
			}
			this.reservedSizes.add(value);
			return this;
		}

		/**
		 * Set {@link #reservedSizes(List)} to a singleton list.
		 */
		public Builder reservedSizes(Function<ReservedSize.Builder, ObjectBuilder<ReservedSize>> fn) {
			return this.reservedSizes(fn.apply(new ReservedSize.Builder()).build());
		}

		/**
		 * Add a value to {@link #reservedSizes(List)}, creating the list if needed.
		 */
		public Builder addReservedSizes(Function<ReservedSize.Builder, ObjectBuilder<ReservedSize>> fn) {
			return this.addReservedSizes(fn.apply(new ReservedSize.Builder()).build());
		}

		/**
		 * Builds a {@link ClusterInfo}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterInfo build() {

			return new ClusterInfo(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClusterInfo}
	 */
	public static final JsonpDeserializer<ClusterInfo> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ClusterInfo::setupClusterInfoDeserializer, Builder::build);

	protected static void setupClusterInfoDeserializer(DelegatingDeserializer<ClusterInfo.Builder> op) {

		op.add(Builder::nodes, JsonpDeserializer.stringMapDeserializer(NodeDiskUsage._DESERIALIZER), "nodes");
		op.add(Builder::shardSizes, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.longDeserializer()),
				"shard_sizes");
		op.add(Builder::shardDataSetSizes,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"shard_data_set_sizes");
		op.add(Builder::shardPaths, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"shard_paths");
		op.add(Builder::reservedSizes, JsonpDeserializer.arrayDeserializer(ReservedSize._DESERIALIZER),
				"reserved_sizes");

	}

}
