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

import co.elastic.clients.elasticsearch._types.HealthStatus;
import co.elastic.clients.elasticsearch.nodes.NodesResponseBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.stats.StatsResponseBase

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#cluster.stats.StatsResponseBase">API
 *      specification</a>
 */

public abstract class StatsResponseBase extends NodesResponseBase {
	private final String clusterName;

	private final String clusterUuid;

	private final ClusterIndices indices;

	private final ClusterNodes nodes;

	private final HealthStatus status;

	private final long timestamp;

	// ---------------------------------------------------------------------------------------------

	protected StatsResponseBase(AbstractBuilder<?> builder) {
		super(builder);

		this.clusterName = ApiTypeHelper.requireNonNull(builder.clusterName, this, "clusterName");
		this.clusterUuid = ApiTypeHelper.requireNonNull(builder.clusterUuid, this, "clusterUuid");
		this.indices = ApiTypeHelper.requireNonNull(builder.indices, this, "indices");
		this.nodes = ApiTypeHelper.requireNonNull(builder.nodes, this, "nodes");
		this.status = ApiTypeHelper.requireNonNull(builder.status, this, "status");
		this.timestamp = ApiTypeHelper.requireNonNull(builder.timestamp, this, "timestamp");

	}

	/**
	 * Required - Name of the cluster, based on the cluster name setting.
	 * <p>
	 * API name: {@code cluster_name}
	 */
	public final String clusterName() {
		return this.clusterName;
	}

	/**
	 * Required - Unique identifier for the cluster.
	 * <p>
	 * API name: {@code cluster_uuid}
	 */
	public final String clusterUuid() {
		return this.clusterUuid;
	}

	/**
	 * Required - Contains statistics about indices with shards assigned to selected
	 * nodes.
	 * <p>
	 * API name: {@code indices}
	 */
	public final ClusterIndices indices() {
		return this.indices;
	}

	/**
	 * Required - Contains statistics about nodes selected by the request’s node
	 * filters.
	 * <p>
	 * API name: {@code nodes}
	 */
	public final ClusterNodes nodes() {
		return this.nodes;
	}

	/**
	 * Required - Health status of the cluster, based on the state of its primary
	 * and replica shards.
	 * <p>
	 * API name: {@code status}
	 */
	public final HealthStatus status() {
		return this.status;
	}

	/**
	 * Required - Unix timestamp, in milliseconds, for the last time the cluster
	 * statistics were refreshed.
	 * <p>
	 * API name: {@code timestamp}
	 */
	public final long timestamp() {
		return this.timestamp;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("cluster_name");
		generator.write(this.clusterName);

		generator.writeKey("cluster_uuid");
		generator.write(this.clusterUuid);

		generator.writeKey("indices");
		this.indices.serialize(generator, mapper);

		generator.writeKey("nodes");
		this.nodes.serialize(generator, mapper);

		generator.writeKey("status");
		this.status.serialize(generator, mapper);
		generator.writeKey("timestamp");
		generator.write(this.timestamp);

	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				NodesResponseBase.AbstractBuilder<BuilderT> {
		private String clusterName;

		private String clusterUuid;

		private ClusterIndices indices;

		private ClusterNodes nodes;

		private HealthStatus status;

		private Long timestamp;

		/**
		 * Required - Name of the cluster, based on the cluster name setting.
		 * <p>
		 * API name: {@code cluster_name}
		 */
		public final BuilderT clusterName(String value) {
			this.clusterName = value;
			return self();
		}

		/**
		 * Required - Unique identifier for the cluster.
		 * <p>
		 * API name: {@code cluster_uuid}
		 */
		public final BuilderT clusterUuid(String value) {
			this.clusterUuid = value;
			return self();
		}

		/**
		 * Required - Contains statistics about indices with shards assigned to selected
		 * nodes.
		 * <p>
		 * API name: {@code indices}
		 */
		public final BuilderT indices(ClusterIndices value) {
			this.indices = value;
			return self();
		}

		/**
		 * Required - Contains statistics about indices with shards assigned to selected
		 * nodes.
		 * <p>
		 * API name: {@code indices}
		 */
		public final BuilderT indices(Function<ClusterIndices.Builder, ObjectBuilder<ClusterIndices>> fn) {
			return this.indices(fn.apply(new ClusterIndices.Builder()).build());
		}

		/**
		 * Required - Contains statistics about nodes selected by the request’s node
		 * filters.
		 * <p>
		 * API name: {@code nodes}
		 */
		public final BuilderT nodes(ClusterNodes value) {
			this.nodes = value;
			return self();
		}

		/**
		 * Required - Contains statistics about nodes selected by the request’s node
		 * filters.
		 * <p>
		 * API name: {@code nodes}
		 */
		public final BuilderT nodes(Function<ClusterNodes.Builder, ObjectBuilder<ClusterNodes>> fn) {
			return this.nodes(fn.apply(new ClusterNodes.Builder()).build());
		}

		/**
		 * Required - Health status of the cluster, based on the state of its primary
		 * and replica shards.
		 * <p>
		 * API name: {@code status}
		 */
		public final BuilderT status(HealthStatus value) {
			this.status = value;
			return self();
		}

		/**
		 * Required - Unix timestamp, in milliseconds, for the last time the cluster
		 * statistics were refreshed.
		 * <p>
		 * API name: {@code timestamp}
		 */
		public final BuilderT timestamp(long value) {
			this.timestamp = value;
			return self();
		}

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupStatsResponseBaseDeserializer(
			ObjectDeserializer<BuilderT> op) {
		NodesResponseBase.setupNodesResponseBaseDeserializer(op);
		op.add(AbstractBuilder::clusterName, JsonpDeserializer.stringDeserializer(), "cluster_name");
		op.add(AbstractBuilder::clusterUuid, JsonpDeserializer.stringDeserializer(), "cluster_uuid");
		op.add(AbstractBuilder::indices, ClusterIndices._DESERIALIZER, "indices");
		op.add(AbstractBuilder::nodes, ClusterNodes._DESERIALIZER, "nodes");
		op.add(AbstractBuilder::status, HealthStatus._DESERIALIZER, "status");
		op.add(AbstractBuilder::timestamp, JsonpDeserializer.longDeserializer(), "timestamp");

	}

}
