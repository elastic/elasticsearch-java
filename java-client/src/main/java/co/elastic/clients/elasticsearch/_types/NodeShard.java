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

package co.elastic.clients.elasticsearch._types;

import co.elastic.clients.elasticsearch.cluster.allocation_explain.UnassignedInformation;
import co.elastic.clients.elasticsearch.indices.stats.ShardRoutingState;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.NodeShard
public final class NodeShard implements JsonpSerializable {
	private final ShardRoutingState state;

	private final Boolean primary;

	@Nullable
	private final String node;

	private final Number shard;

	private final String index;

	@Nullable
	private final Map<String, String> allocationId;

	@Nullable
	private final Map<String, String> recoverySource;

	@Nullable
	private final UnassignedInformation unassignedInfo;

	// ---------------------------------------------------------------------------------------------

	public NodeShard(Builder builder) {

		this.state = Objects.requireNonNull(builder.state, "state");
		this.primary = Objects.requireNonNull(builder.primary, "primary");
		this.node = builder.node;
		this.shard = Objects.requireNonNull(builder.shard, "shard");
		this.index = Objects.requireNonNull(builder.index, "index");
		this.allocationId = builder.allocationId;
		this.recoverySource = builder.recoverySource;
		this.unassignedInfo = builder.unassignedInfo;

	}

	/**
	 * API name: {@code state}
	 */
	public ShardRoutingState state() {
		return this.state;
	}

	/**
	 * API name: {@code primary}
	 */
	public Boolean primary() {
		return this.primary;
	}

	/**
	 * API name: {@code node}
	 */
	@Nullable
	public String node() {
		return this.node;
	}

	/**
	 * API name: {@code shard}
	 */
	public Number shard() {
		return this.shard;
	}

	/**
	 * API name: {@code index}
	 */
	public String index() {
		return this.index;
	}

	/**
	 * API name: {@code allocation_id}
	 */
	@Nullable
	public Map<String, String> allocationId() {
		return this.allocationId;
	}

	/**
	 * API name: {@code recovery_source}
	 */
	@Nullable
	public Map<String, String> recoverySource() {
		return this.recoverySource;
	}

	/**
	 * API name: {@code unassigned_info}
	 */
	@Nullable
	public UnassignedInformation unassignedInfo() {
		return this.unassignedInfo;
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

		generator.writeKey("state");
		this.state.serialize(generator, mapper);

		generator.writeKey("primary");
		generator.write(this.primary);

		if (this.node != null) {

			generator.writeKey("node");
			generator.write(this.node);

		}

		generator.writeKey("shard");
		generator.write(this.shard.doubleValue());

		generator.writeKey("index");
		generator.write(this.index);

		if (this.allocationId != null) {

			generator.writeKey("allocation_id");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.allocationId.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (this.recoverySource != null) {

			generator.writeKey("recovery_source");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.recoverySource.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (this.unassignedInfo != null) {

			generator.writeKey("unassigned_info");
			this.unassignedInfo.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeShard}.
	 */
	public static class Builder implements ObjectBuilder<NodeShard> {
		private ShardRoutingState state;

		private Boolean primary;

		@Nullable
		private String node;

		private Number shard;

		private String index;

		@Nullable
		private Map<String, String> allocationId;

		@Nullable
		private Map<String, String> recoverySource;

		@Nullable
		private UnassignedInformation unassignedInfo;

		/**
		 * API name: {@code state}
		 */
		public Builder state(ShardRoutingState value) {
			this.state = value;
			return this;
		}

		/**
		 * API name: {@code primary}
		 */
		public Builder primary(Boolean value) {
			this.primary = value;
			return this;
		}

		/**
		 * API name: {@code node}
		 */
		public Builder node(@Nullable String value) {
			this.node = value;
			return this;
		}

		/**
		 * API name: {@code shard}
		 */
		public Builder shard(Number value) {
			this.shard = value;
			return this;
		}

		/**
		 * API name: {@code index}
		 */
		public Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code allocation_id}
		 */
		public Builder allocationId(@Nullable Map<String, String> value) {
			this.allocationId = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #allocationId(Map)}, creating the map if needed.
		 */
		public Builder putAllocationId(String key, String value) {
			if (this.allocationId == null) {
				this.allocationId = new HashMap<>();
			}
			this.allocationId.put(key, value);
			return this;
		}

		/**
		 * API name: {@code recovery_source}
		 */
		public Builder recoverySource(@Nullable Map<String, String> value) {
			this.recoverySource = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #recoverySource(Map)}, creating the map if needed.
		 */
		public Builder putRecoverySource(String key, String value) {
			if (this.recoverySource == null) {
				this.recoverySource = new HashMap<>();
			}
			this.recoverySource.put(key, value);
			return this;
		}

		/**
		 * API name: {@code unassigned_info}
		 */
		public Builder unassignedInfo(@Nullable UnassignedInformation value) {
			this.unassignedInfo = value;
			return this;
		}

		/**
		 * API name: {@code unassigned_info}
		 */
		public Builder unassignedInfo(
				Function<UnassignedInformation.Builder, ObjectBuilder<UnassignedInformation>> fn) {
			return this.unassignedInfo(fn.apply(new UnassignedInformation.Builder()).build());
		}

		/**
		 * Builds a {@link NodeShard}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeShard build() {

			return new NodeShard(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeShard}
	 */
	public static final JsonpDeserializer<NodeShard> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, NodeShard::setupNodeShardDeserializer);

	protected static void setupNodeShardDeserializer(DelegatingDeserializer<NodeShard.Builder> op) {

		op.add(Builder::state, ShardRoutingState.DESERIALIZER, "state");
		op.add(Builder::primary, JsonpDeserializer.booleanDeserializer(), "primary");
		op.add(Builder::node, JsonpDeserializer.stringDeserializer(), "node");
		op.add(Builder::shard, JsonpDeserializer.numberDeserializer(), "shard");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::allocationId, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"allocation_id");
		op.add(Builder::recoverySource, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"recovery_source");
		op.add(Builder::unassignedInfo, UnassignedInformation.DESERIALIZER, "unassigned_info");

	}

}
