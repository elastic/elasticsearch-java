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

	private final Map<String, Map<String, Long>> repositories;

	private final ClusterSnapshotStats snapshots;

	@Nullable
	private final HealthStatus status;

	private final long timestamp;

	private final CCSStats ccs;

	// ---------------------------------------------------------------------------------------------

	protected StatsResponseBase(AbstractBuilder<?> builder) {
		super(builder);

		this.clusterName = ApiTypeHelper.requireNonNull(builder.clusterName, this, "clusterName");
		this.clusterUuid = ApiTypeHelper.requireNonNull(builder.clusterUuid, this, "clusterUuid");
		this.indices = ApiTypeHelper.requireNonNull(builder.indices, this, "indices");
		this.nodes = ApiTypeHelper.requireNonNull(builder.nodes, this, "nodes");
		this.repositories = ApiTypeHelper.unmodifiableRequired(builder.repositories, this, "repositories");
		this.snapshots = ApiTypeHelper.requireNonNull(builder.snapshots, this, "snapshots");
		this.status = builder.status;
		this.timestamp = ApiTypeHelper.requireNonNull(builder.timestamp, this, "timestamp", 0);
		this.ccs = ApiTypeHelper.requireNonNull(builder.ccs, this, "ccs");

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
	 * Required - Contains stats on repository feature usage exposed in cluster
	 * stats for telemetry.
	 * <p>
	 * API name: {@code repositories}
	 */
	public final Map<String, Map<String, Long>> repositories() {
		return this.repositories;
	}

	/**
	 * Required - Contains stats cluster snapshots.
	 * <p>
	 * API name: {@code snapshots}
	 */
	public final ClusterSnapshotStats snapshots() {
		return this.snapshots;
	}

	/**
	 * Health status of the cluster, based on the state of its primary and replica
	 * shards.
	 * <p>
	 * API name: {@code status}
	 */
	@Nullable
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

	/**
	 * Required - Cross-cluster stats
	 * <p>
	 * API name: {@code ccs}
	 */
	public final CCSStats ccs() {
		return this.ccs;
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

		if (ApiTypeHelper.isDefined(this.repositories)) {
			generator.writeKey("repositories");
			generator.writeStartObject();
			for (Map.Entry<String, Map<String, Long>> item0 : this.repositories.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.writeStartObject();
				if (item0.getValue() != null) {
					for (Map.Entry<String, Long> item1 : item0.getValue().entrySet()) {
						generator.writeKey(item1.getKey());
						generator.write(item1.getValue());

					}
				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}
		generator.writeKey("snapshots");
		this.snapshots.serialize(generator, mapper);

		if (this.status != null) {
			generator.writeKey("status");
			this.status.serialize(generator, mapper);
		}
		generator.writeKey("timestamp");
		generator.write(this.timestamp);

		generator.writeKey("ccs");
		this.ccs.serialize(generator, mapper);

	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				NodesResponseBase.AbstractBuilder<BuilderT> {
		private String clusterName;

		private String clusterUuid;

		private ClusterIndices indices;

		private ClusterNodes nodes;

		private Map<String, Map<String, Long>> repositories;

		private ClusterSnapshotStats snapshots;

		@Nullable
		private HealthStatus status;

		private Long timestamp;

		private CCSStats ccs;

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
		 * Required - Contains stats on repository feature usage exposed in cluster
		 * stats for telemetry.
		 * <p>
		 * API name: {@code repositories}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>repositories</code>.
		 */
		public final BuilderT repositories(Map<String, Map<String, Long>> map) {
			this.repositories = _mapPutAll(this.repositories, map);
			return self();
		}

		/**
		 * Required - Contains stats on repository feature usage exposed in cluster
		 * stats for telemetry.
		 * <p>
		 * API name: {@code repositories}
		 * <p>
		 * Adds an entry to <code>repositories</code>.
		 */
		public final BuilderT repositories(String key, Map<String, Long> value) {
			this.repositories = _mapPut(this.repositories, key, value);
			return self();
		}

		/**
		 * Required - Contains stats cluster snapshots.
		 * <p>
		 * API name: {@code snapshots}
		 */
		public final BuilderT snapshots(ClusterSnapshotStats value) {
			this.snapshots = value;
			return self();
		}

		/**
		 * Required - Contains stats cluster snapshots.
		 * <p>
		 * API name: {@code snapshots}
		 */
		public final BuilderT snapshots(
				Function<ClusterSnapshotStats.Builder, ObjectBuilder<ClusterSnapshotStats>> fn) {
			return this.snapshots(fn.apply(new ClusterSnapshotStats.Builder()).build());
		}

		/**
		 * Health status of the cluster, based on the state of its primary and replica
		 * shards.
		 * <p>
		 * API name: {@code status}
		 */
		public final BuilderT status(@Nullable HealthStatus value) {
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

		/**
		 * Required - Cross-cluster stats
		 * <p>
		 * API name: {@code ccs}
		 */
		public final BuilderT ccs(CCSStats value) {
			this.ccs = value;
			return self();
		}

		/**
		 * Required - Cross-cluster stats
		 * <p>
		 * API name: {@code ccs}
		 */
		public final BuilderT ccs(Function<CCSStats.Builder, ObjectBuilder<CCSStats>> fn) {
			return this.ccs(fn.apply(new CCSStats.Builder()).build());
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
		op.add(AbstractBuilder::repositories, JsonpDeserializer.stringMapDeserializer(
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.longDeserializer())), "repositories");
		op.add(AbstractBuilder::snapshots, ClusterSnapshotStats._DESERIALIZER, "snapshots");
		op.add(AbstractBuilder::status, HealthStatus._DESERIALIZER, "status");
		op.add(AbstractBuilder::timestamp, JsonpDeserializer.longDeserializer(), "timestamp");
		op.add(AbstractBuilder::ccs, CCSStats._DESERIALIZER, "ccs");

	}

}
