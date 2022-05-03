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

package co.elastic.clients.elasticsearch.nodes;

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
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes._types.Discovery

/**
 *
 * @see <a href="../doc-files/api-spec.html#nodes._types.Discovery">API
 *      specification</a>
 */
@JsonpDeserializable
public class Discovery implements JsonpSerializable {
	@Nullable
	private final ClusterStateQueue clusterStateQueue;

	@Nullable
	private final PublishedClusterStates publishedClusterStates;

	private final Map<String, ClusterStateUpdate> clusterStateUpdate;

	@Nullable
	private final SerializedClusterState serializedClusterStates;

	@Nullable
	private final ClusterAppliedStats clusterApplierStats;

	// ---------------------------------------------------------------------------------------------

	private Discovery(Builder builder) {

		this.clusterStateQueue = builder.clusterStateQueue;
		this.publishedClusterStates = builder.publishedClusterStates;
		this.clusterStateUpdate = ApiTypeHelper.unmodifiable(builder.clusterStateUpdate);
		this.serializedClusterStates = builder.serializedClusterStates;
		this.clusterApplierStats = builder.clusterApplierStats;

	}

	public static Discovery of(Function<Builder, ObjectBuilder<Discovery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code cluster_state_queue}
	 */
	@Nullable
	public final ClusterStateQueue clusterStateQueue() {
		return this.clusterStateQueue;
	}

	/**
	 * API name: {@code published_cluster_states}
	 */
	@Nullable
	public final PublishedClusterStates publishedClusterStates() {
		return this.publishedClusterStates;
	}

	/**
	 * API name: {@code cluster_state_update}
	 */
	public final Map<String, ClusterStateUpdate> clusterStateUpdate() {
		return this.clusterStateUpdate;
	}

	/**
	 * API name: {@code serialized_cluster_states}
	 */
	@Nullable
	public final SerializedClusterState serializedClusterStates() {
		return this.serializedClusterStates;
	}

	/**
	 * API name: {@code cluster_applier_stats}
	 */
	@Nullable
	public final ClusterAppliedStats clusterApplierStats() {
		return this.clusterApplierStats;
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

		if (this.clusterStateQueue != null) {
			generator.writeKey("cluster_state_queue");
			this.clusterStateQueue.serialize(generator, mapper);

		}
		if (this.publishedClusterStates != null) {
			generator.writeKey("published_cluster_states");
			this.publishedClusterStates.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.clusterStateUpdate)) {
			generator.writeKey("cluster_state_update");
			generator.writeStartObject();
			for (Map.Entry<String, ClusterStateUpdate> item0 : this.clusterStateUpdate.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.serializedClusterStates != null) {
			generator.writeKey("serialized_cluster_states");
			this.serializedClusterStates.serialize(generator, mapper);

		}
		if (this.clusterApplierStats != null) {
			generator.writeKey("cluster_applier_stats");
			this.clusterApplierStats.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Discovery}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Discovery> {
		@Nullable
		private ClusterStateQueue clusterStateQueue;

		@Nullable
		private PublishedClusterStates publishedClusterStates;

		@Nullable
		private Map<String, ClusterStateUpdate> clusterStateUpdate;

		@Nullable
		private SerializedClusterState serializedClusterStates;

		@Nullable
		private ClusterAppliedStats clusterApplierStats;

		/**
		 * API name: {@code cluster_state_queue}
		 */
		public final Builder clusterStateQueue(@Nullable ClusterStateQueue value) {
			this.clusterStateQueue = value;
			return this;
		}

		/**
		 * API name: {@code cluster_state_queue}
		 */
		public final Builder clusterStateQueue(
				Function<ClusterStateQueue.Builder, ObjectBuilder<ClusterStateQueue>> fn) {
			return this.clusterStateQueue(fn.apply(new ClusterStateQueue.Builder()).build());
		}

		/**
		 * API name: {@code published_cluster_states}
		 */
		public final Builder publishedClusterStates(@Nullable PublishedClusterStates value) {
			this.publishedClusterStates = value;
			return this;
		}

		/**
		 * API name: {@code published_cluster_states}
		 */
		public final Builder publishedClusterStates(
				Function<PublishedClusterStates.Builder, ObjectBuilder<PublishedClusterStates>> fn) {
			return this.publishedClusterStates(fn.apply(new PublishedClusterStates.Builder()).build());
		}

		/**
		 * API name: {@code cluster_state_update}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>clusterStateUpdate</code>.
		 */
		public final Builder clusterStateUpdate(Map<String, ClusterStateUpdate> map) {
			this.clusterStateUpdate = _mapPutAll(this.clusterStateUpdate, map);
			return this;
		}

		/**
		 * API name: {@code cluster_state_update}
		 * <p>
		 * Adds an entry to <code>clusterStateUpdate</code>.
		 */
		public final Builder clusterStateUpdate(String key, ClusterStateUpdate value) {
			this.clusterStateUpdate = _mapPut(this.clusterStateUpdate, key, value);
			return this;
		}

		/**
		 * API name: {@code cluster_state_update}
		 * <p>
		 * Adds an entry to <code>clusterStateUpdate</code> using a builder lambda.
		 */
		public final Builder clusterStateUpdate(String key,
				Function<ClusterStateUpdate.Builder, ObjectBuilder<ClusterStateUpdate>> fn) {
			return clusterStateUpdate(key, fn.apply(new ClusterStateUpdate.Builder()).build());
		}

		/**
		 * API name: {@code serialized_cluster_states}
		 */
		public final Builder serializedClusterStates(@Nullable SerializedClusterState value) {
			this.serializedClusterStates = value;
			return this;
		}

		/**
		 * API name: {@code serialized_cluster_states}
		 */
		public final Builder serializedClusterStates(
				Function<SerializedClusterState.Builder, ObjectBuilder<SerializedClusterState>> fn) {
			return this.serializedClusterStates(fn.apply(new SerializedClusterState.Builder()).build());
		}

		/**
		 * API name: {@code cluster_applier_stats}
		 */
		public final Builder clusterApplierStats(@Nullable ClusterAppliedStats value) {
			this.clusterApplierStats = value;
			return this;
		}

		/**
		 * API name: {@code cluster_applier_stats}
		 */
		public final Builder clusterApplierStats(
				Function<ClusterAppliedStats.Builder, ObjectBuilder<ClusterAppliedStats>> fn) {
			return this.clusterApplierStats(fn.apply(new ClusterAppliedStats.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Discovery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Discovery build() {
			_checkSingleUse();

			return new Discovery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Discovery}
	 */
	public static final JsonpDeserializer<Discovery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Discovery::setupDiscoveryDeserializer);

	protected static void setupDiscoveryDeserializer(ObjectDeserializer<Discovery.Builder> op) {

		op.add(Builder::clusterStateQueue, ClusterStateQueue._DESERIALIZER, "cluster_state_queue");
		op.add(Builder::publishedClusterStates, PublishedClusterStates._DESERIALIZER, "published_cluster_states");
		op.add(Builder::clusterStateUpdate, JsonpDeserializer.stringMapDeserializer(ClusterStateUpdate._DESERIALIZER),
				"cluster_state_update");
		op.add(Builder::serializedClusterStates, SerializedClusterState._DESERIALIZER, "serialized_cluster_states");
		op.add(Builder::clusterApplierStats, ClusterAppliedStats._DESERIALIZER, "cluster_applier_stats");

	}

}
