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
import co.elastic.clients.util.MapBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.allocation_explain.ClusterInfo
@JsonpDeserializable
public class ClusterInfo implements JsonpSerializable {
	private final Map<String, NodeDiskUsage> nodes;

	private final Map<String, Long> shardSizes;

	private final Map<String, String> shardDataSetSizes;

	private final Map<String, String> shardPaths;

	private final List<ReservedSize> reservedSizes;

	// ---------------------------------------------------------------------------------------------

	private ClusterInfo(Builder builder) {

		this.nodes = ModelTypeHelper.unmodifiableRequired(builder.nodes, this, "nodes");
		this.shardSizes = ModelTypeHelper.unmodifiableRequired(builder.shardSizes, this, "shardSizes");
		this.shardDataSetSizes = ModelTypeHelper.unmodifiable(builder.shardDataSetSizes);
		this.shardPaths = ModelTypeHelper.unmodifiableRequired(builder.shardPaths, this, "shardPaths");
		this.reservedSizes = ModelTypeHelper.unmodifiableRequired(builder.reservedSizes, this, "reservedSizes");

	}

	public static ClusterInfo of(Function<Builder, ObjectBuilder<ClusterInfo>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code nodes}
	 */
	public final Map<String, NodeDiskUsage> nodes() {
		return this.nodes;
	}

	/**
	 * Required - API name: {@code shard_sizes}
	 */
	public final Map<String, Long> shardSizes() {
		return this.shardSizes;
	}

	/**
	 * API name: {@code shard_data_set_sizes}
	 */
	public final Map<String, String> shardDataSetSizes() {
		return this.shardDataSetSizes;
	}

	/**
	 * Required - API name: {@code shard_paths}
	 */
	public final Map<String, String> shardPaths() {
		return this.shardPaths;
	}

	/**
	 * Required - API name: {@code reserved_sizes}
	 */
	public final List<ReservedSize> reservedSizes() {
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

		if (ModelTypeHelper.isDefined(this.nodes)) {
			generator.writeKey("nodes");
			generator.writeStartObject();
			for (Map.Entry<String, NodeDiskUsage> item0 : this.nodes.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.shardSizes)) {
			generator.writeKey("shard_sizes");
			generator.writeStartObject();
			for (Map.Entry<String, Long> item0 : this.shardSizes.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.shardDataSetSizes)) {
			generator.writeKey("shard_data_set_sizes");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.shardDataSetSizes.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.shardPaths)) {
			generator.writeKey("shard_paths");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.shardPaths.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.reservedSizes)) {
			generator.writeKey("reserved_sizes");
			generator.writeStartArray();
			for (ReservedSize item0 : this.reservedSizes) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterInfo}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ClusterInfo> {
		private Map<String, NodeDiskUsage> nodes;

		private Map<String, Long> shardSizes;

		@Nullable
		private Map<String, String> shardDataSetSizes;

		private Map<String, String> shardPaths;

		private List<ReservedSize> reservedSizes;

		/**
		 * Required - API name: {@code nodes}
		 */
		public final Builder nodes(Map<String, NodeDiskUsage> value) {
			this.nodes = value;
			return this;
		}

		/**
		 * Set {@link #nodes(Map)} to a singleton map.
		 */
		public Builder nodes(String key, Function<NodeDiskUsage.Builder, ObjectBuilder<NodeDiskUsage>> fn) {
			return this.nodes(Collections.singletonMap(key, fn.apply(new NodeDiskUsage.Builder()).build()));
		}

		public final Builder nodes(
				Function<MapBuilder<String, NodeDiskUsage, NodeDiskUsage.Builder>, ObjectBuilder<Map<String, NodeDiskUsage>>> fn) {
			return nodes(fn.apply(new MapBuilder<>(NodeDiskUsage.Builder::new)).build());
		}

		/**
		 * Required - API name: {@code shard_sizes}
		 */
		public final Builder shardSizes(Map<String, Long> value) {
			this.shardSizes = value;
			return this;
		}

		/**
		 * API name: {@code shard_data_set_sizes}
		 */
		public final Builder shardDataSetSizes(@Nullable Map<String, String> value) {
			this.shardDataSetSizes = value;
			return this;
		}

		/**
		 * Required - API name: {@code shard_paths}
		 */
		public final Builder shardPaths(Map<String, String> value) {
			this.shardPaths = value;
			return this;
		}

		/**
		 * Required - API name: {@code reserved_sizes}
		 */
		public final Builder reservedSizes(List<ReservedSize> value) {
			this.reservedSizes = value;
			return this;
		}

		/**
		 * Required - API name: {@code reserved_sizes}
		 */
		public final Builder reservedSizes(ReservedSize... value) {
			this.reservedSizes = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code reserved_sizes}
		 */
		@SafeVarargs
		public final Builder reservedSizes(Function<ReservedSize.Builder, ObjectBuilder<ReservedSize>>... fns) {
			this.reservedSizes = new ArrayList<>(fns.length);
			for (Function<ReservedSize.Builder, ObjectBuilder<ReservedSize>> fn : fns) {
				this.reservedSizes.add(fn.apply(new ReservedSize.Builder()).build());
			}
			return this;
		}

		/**
		 * Builds a {@link ClusterInfo}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterInfo build() {
			_checkSingleUse();

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
