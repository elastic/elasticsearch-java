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

package co.elastic.clients.elasticsearch._types;

import co.elastic.clients.elasticsearch.cluster.allocation_explain.UnassignedInformation;
import co.elastic.clients.elasticsearch.indices.stats.ShardRoutingState;
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
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

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

// typedef: _types.NodeShard

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.NodeShard">API
 *      specification</a>
 */
@JsonpDeserializable
public class NodeShard implements JsonpSerializable {
	private final ShardRoutingState state;

	private final boolean primary;

	@Nullable
	private final String node;

	private final int shard;

	private final String index;

	private final Map<String, String> allocationId;

	private final Map<String, String> recoverySource;

	@Nullable
	private final UnassignedInformation unassignedInfo;

	@Nullable
	private final String relocatingNode;

	@Nullable
	private final RelocationFailureInfo relocationFailureInfo;

	// ---------------------------------------------------------------------------------------------

	private NodeShard(Builder builder) {

		this.state = ApiTypeHelper.requireNonNull(builder.state, this, "state");
		this.primary = ApiTypeHelper.requireNonNull(builder.primary, this, "primary");
		this.node = builder.node;
		this.shard = ApiTypeHelper.requireNonNull(builder.shard, this, "shard");
		this.index = ApiTypeHelper.requireNonNull(builder.index, this, "index");
		this.allocationId = ApiTypeHelper.unmodifiable(builder.allocationId);
		this.recoverySource = ApiTypeHelper.unmodifiable(builder.recoverySource);
		this.unassignedInfo = builder.unassignedInfo;
		this.relocatingNode = builder.relocatingNode;
		this.relocationFailureInfo = builder.relocationFailureInfo;

	}

	public static NodeShard of(Function<Builder, ObjectBuilder<NodeShard>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code state}
	 */
	public final ShardRoutingState state() {
		return this.state;
	}

	/**
	 * Required - API name: {@code primary}
	 */
	public final boolean primary() {
		return this.primary;
	}

	/**
	 * API name: {@code node}
	 */
	@Nullable
	public final String node() {
		return this.node;
	}

	/**
	 * Required - API name: {@code shard}
	 */
	public final int shard() {
		return this.shard;
	}

	/**
	 * Required - API name: {@code index}
	 */
	public final String index() {
		return this.index;
	}

	/**
	 * API name: {@code allocation_id}
	 */
	public final Map<String, String> allocationId() {
		return this.allocationId;
	}

	/**
	 * API name: {@code recovery_source}
	 */
	public final Map<String, String> recoverySource() {
		return this.recoverySource;
	}

	/**
	 * API name: {@code unassigned_info}
	 */
	@Nullable
	public final UnassignedInformation unassignedInfo() {
		return this.unassignedInfo;
	}

	/**
	 * API name: {@code relocating_node}
	 */
	@Nullable
	public final String relocatingNode() {
		return this.relocatingNode;
	}

	/**
	 * API name: {@code relocation_failure_info}
	 */
	@Nullable
	public final RelocationFailureInfo relocationFailureInfo() {
		return this.relocationFailureInfo;
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
		generator.write(this.shard);

		generator.writeKey("index");
		generator.write(this.index);

		if (ApiTypeHelper.isDefined(this.allocationId)) {
			generator.writeKey("allocation_id");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.allocationId.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.recoverySource)) {
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
		if (this.relocatingNode != null) {
			generator.writeKey("relocating_node");
			generator.write(this.relocatingNode);

		}
		if (this.relocationFailureInfo != null) {
			generator.writeKey("relocation_failure_info");
			this.relocationFailureInfo.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeShard}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<NodeShard> {
		private ShardRoutingState state;

		private Boolean primary;

		@Nullable
		private String node;

		private Integer shard;

		private String index;

		@Nullable
		private Map<String, String> allocationId;

		@Nullable
		private Map<String, String> recoverySource;

		@Nullable
		private UnassignedInformation unassignedInfo;

		@Nullable
		private String relocatingNode;

		@Nullable
		private RelocationFailureInfo relocationFailureInfo;

		/**
		 * Required - API name: {@code state}
		 */
		public final Builder state(ShardRoutingState value) {
			this.state = value;
			return this;
		}

		/**
		 * Required - API name: {@code primary}
		 */
		public final Builder primary(boolean value) {
			this.primary = value;
			return this;
		}

		/**
		 * API name: {@code node}
		 */
		public final Builder node(@Nullable String value) {
			this.node = value;
			return this;
		}

		/**
		 * Required - API name: {@code shard}
		 */
		public final Builder shard(int value) {
			this.shard = value;
			return this;
		}

		/**
		 * Required - API name: {@code index}
		 */
		public final Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code allocation_id}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>allocationId</code>.
		 */
		public final Builder allocationId(Map<String, String> map) {
			this.allocationId = _mapPutAll(this.allocationId, map);
			return this;
		}

		/**
		 * API name: {@code allocation_id}
		 * <p>
		 * Adds an entry to <code>allocationId</code>.
		 */
		public final Builder allocationId(String key, String value) {
			this.allocationId = _mapPut(this.allocationId, key, value);
			return this;
		}

		/**
		 * API name: {@code recovery_source}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>recoverySource</code>.
		 */
		public final Builder recoverySource(Map<String, String> map) {
			this.recoverySource = _mapPutAll(this.recoverySource, map);
			return this;
		}

		/**
		 * API name: {@code recovery_source}
		 * <p>
		 * Adds an entry to <code>recoverySource</code>.
		 */
		public final Builder recoverySource(String key, String value) {
			this.recoverySource = _mapPut(this.recoverySource, key, value);
			return this;
		}

		/**
		 * API name: {@code unassigned_info}
		 */
		public final Builder unassignedInfo(@Nullable UnassignedInformation value) {
			this.unassignedInfo = value;
			return this;
		}

		/**
		 * API name: {@code unassigned_info}
		 */
		public final Builder unassignedInfo(
				Function<UnassignedInformation.Builder, ObjectBuilder<UnassignedInformation>> fn) {
			return this.unassignedInfo(fn.apply(new UnassignedInformation.Builder()).build());
		}

		/**
		 * API name: {@code relocating_node}
		 */
		public final Builder relocatingNode(@Nullable String value) {
			this.relocatingNode = value;
			return this;
		}

		/**
		 * API name: {@code relocation_failure_info}
		 */
		public final Builder relocationFailureInfo(@Nullable RelocationFailureInfo value) {
			this.relocationFailureInfo = value;
			return this;
		}

		/**
		 * API name: {@code relocation_failure_info}
		 */
		public final Builder relocationFailureInfo(
				Function<RelocationFailureInfo.Builder, ObjectBuilder<RelocationFailureInfo>> fn) {
			return this.relocationFailureInfo(fn.apply(new RelocationFailureInfo.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link NodeShard}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeShard build() {
			_checkSingleUse();

			return new NodeShard(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeShard}
	 */
	public static final JsonpDeserializer<NodeShard> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			NodeShard::setupNodeShardDeserializer);

	protected static void setupNodeShardDeserializer(ObjectDeserializer<NodeShard.Builder> op) {

		op.add(Builder::state, ShardRoutingState._DESERIALIZER, "state");
		op.add(Builder::primary, JsonpDeserializer.booleanDeserializer(), "primary");
		op.add(Builder::node, JsonpDeserializer.stringDeserializer(), "node");
		op.add(Builder::shard, JsonpDeserializer.integerDeserializer(), "shard");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::allocationId, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"allocation_id");
		op.add(Builder::recoverySource, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"recovery_source");
		op.add(Builder::unassignedInfo, UnassignedInformation._DESERIALIZER, "unassigned_info");
		op.add(Builder::relocatingNode, JsonpDeserializer.stringDeserializer(), "relocating_node");
		op.add(Builder::relocationFailureInfo, RelocationFailureInfo._DESERIALIZER, "relocation_failure_info");

	}

}
