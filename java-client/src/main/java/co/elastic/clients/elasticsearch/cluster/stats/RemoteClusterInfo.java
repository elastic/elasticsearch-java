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
import java.lang.Long;
import java.lang.String;
import java.util.List;
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

// typedef: cluster.stats.RemoteClusterInfo

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#cluster.stats.RemoteClusterInfo">API
 *      specification</a>
 */
@JsonpDeserializable
public class RemoteClusterInfo implements JsonpSerializable {
	private final String clusterUuid;

	private final String mode;

	private final boolean skipUnavailable;

	private final String transportCompress;

	private final HealthStatus status;

	private final List<String> version;

	private final int nodesCount;

	private final int shardsCount;

	private final int indicesCount;

	private final long indicesTotalSizeInBytes;

	@Nullable
	private final String indicesTotalSize;

	private final long maxHeapInBytes;

	@Nullable
	private final String maxHeap;

	private final long memTotalInBytes;

	@Nullable
	private final String memTotal;

	// ---------------------------------------------------------------------------------------------

	private RemoteClusterInfo(Builder builder) {

		this.clusterUuid = ApiTypeHelper.requireNonNull(builder.clusterUuid, this, "clusterUuid");
		this.mode = ApiTypeHelper.requireNonNull(builder.mode, this, "mode");
		this.skipUnavailable = ApiTypeHelper.requireNonNull(builder.skipUnavailable, this, "skipUnavailable", false);
		this.transportCompress = ApiTypeHelper.requireNonNull(builder.transportCompress, this, "transportCompress");
		this.status = ApiTypeHelper.requireNonNull(builder.status, this, "status");
		this.version = ApiTypeHelper.unmodifiableRequired(builder.version, this, "version");
		this.nodesCount = ApiTypeHelper.requireNonNull(builder.nodesCount, this, "nodesCount", 0);
		this.shardsCount = ApiTypeHelper.requireNonNull(builder.shardsCount, this, "shardsCount", 0);
		this.indicesCount = ApiTypeHelper.requireNonNull(builder.indicesCount, this, "indicesCount", 0);
		this.indicesTotalSizeInBytes = ApiTypeHelper.requireNonNull(builder.indicesTotalSizeInBytes, this,
				"indicesTotalSizeInBytes", 0);
		this.indicesTotalSize = builder.indicesTotalSize;
		this.maxHeapInBytes = ApiTypeHelper.requireNonNull(builder.maxHeapInBytes, this, "maxHeapInBytes", 0);
		this.maxHeap = builder.maxHeap;
		this.memTotalInBytes = ApiTypeHelper.requireNonNull(builder.memTotalInBytes, this, "memTotalInBytes", 0);
		this.memTotal = builder.memTotal;

	}

	public static RemoteClusterInfo of(Function<Builder, ObjectBuilder<RemoteClusterInfo>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The UUID of the remote cluster.
	 * <p>
	 * API name: {@code cluster_uuid}
	 */
	public final String clusterUuid() {
		return this.clusterUuid;
	}

	/**
	 * Required - The connection mode used to communicate with the remote cluster.
	 * <p>
	 * API name: {@code mode}
	 */
	public final String mode() {
		return this.mode;
	}

	/**
	 * Required - The <code>skip_unavailable</code> setting used for this remote
	 * cluster.
	 * <p>
	 * API name: {@code skip_unavailable}
	 */
	public final boolean skipUnavailable() {
		return this.skipUnavailable;
	}

	/**
	 * Required - Transport compression setting used for this remote cluster.
	 * <p>
	 * API name: {@code transport.compress}
	 */
	public final String transportCompress() {
		return this.transportCompress;
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
	 * Required - The list of Elasticsearch versions used by the nodes on the remote
	 * cluster.
	 * <p>
	 * API name: {@code version}
	 */
	public final List<String> version() {
		return this.version;
	}

	/**
	 * Required - The total count of nodes in the remote cluster.
	 * <p>
	 * API name: {@code nodes_count}
	 */
	public final int nodesCount() {
		return this.nodesCount;
	}

	/**
	 * Required - The total number of shards in the remote cluster.
	 * <p>
	 * API name: {@code shards_count}
	 */
	public final int shardsCount() {
		return this.shardsCount;
	}

	/**
	 * Required - The total number of indices in the remote cluster.
	 * <p>
	 * API name: {@code indices_count}
	 */
	public final int indicesCount() {
		return this.indicesCount;
	}

	/**
	 * Required - Total data set size, in bytes, of all shards assigned to selected
	 * nodes.
	 * <p>
	 * API name: {@code indices_total_size_in_bytes}
	 */
	public final long indicesTotalSizeInBytes() {
		return this.indicesTotalSizeInBytes;
	}

	/**
	 * Total data set size of all shards assigned to selected nodes, as a
	 * human-readable string.
	 * <p>
	 * API name: {@code indices_total_size}
	 */
	@Nullable
	public final String indicesTotalSize() {
		return this.indicesTotalSize;
	}

	/**
	 * Required - Maximum amount of memory, in bytes, available for use by the heap
	 * across the nodes of the remote cluster.
	 * <p>
	 * API name: {@code max_heap_in_bytes}
	 */
	public final long maxHeapInBytes() {
		return this.maxHeapInBytes;
	}

	/**
	 * Maximum amount of memory available for use by the heap across the nodes of
	 * the remote cluster, as a human-readable string.
	 * <p>
	 * API name: {@code max_heap}
	 */
	@Nullable
	public final String maxHeap() {
		return this.maxHeap;
	}

	/**
	 * Required - Total amount, in bytes, of physical memory across the nodes of the
	 * remote cluster.
	 * <p>
	 * API name: {@code mem_total_in_bytes}
	 */
	public final long memTotalInBytes() {
		return this.memTotalInBytes;
	}

	/**
	 * Total amount of physical memory across the nodes of the remote cluster, as a
	 * human-readable string.
	 * <p>
	 * API name: {@code mem_total}
	 */
	@Nullable
	public final String memTotal() {
		return this.memTotal;
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

		generator.writeKey("cluster_uuid");
		generator.write(this.clusterUuid);

		generator.writeKey("mode");
		generator.write(this.mode);

		generator.writeKey("skip_unavailable");
		generator.write(this.skipUnavailable);

		generator.writeKey("transport.compress");
		generator.write(this.transportCompress);

		generator.writeKey("status");
		this.status.serialize(generator, mapper);
		if (ApiTypeHelper.isDefined(this.version)) {
			generator.writeKey("version");
			generator.writeStartArray();
			for (String item0 : this.version) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		generator.writeKey("nodes_count");
		generator.write(this.nodesCount);

		generator.writeKey("shards_count");
		generator.write(this.shardsCount);

		generator.writeKey("indices_count");
		generator.write(this.indicesCount);

		generator.writeKey("indices_total_size_in_bytes");
		generator.write(this.indicesTotalSizeInBytes);

		if (this.indicesTotalSize != null) {
			generator.writeKey("indices_total_size");
			generator.write(this.indicesTotalSize);

		}
		generator.writeKey("max_heap_in_bytes");
		generator.write(this.maxHeapInBytes);

		if (this.maxHeap != null) {
			generator.writeKey("max_heap");
			generator.write(this.maxHeap);

		}
		generator.writeKey("mem_total_in_bytes");
		generator.write(this.memTotalInBytes);

		if (this.memTotal != null) {
			generator.writeKey("mem_total");
			generator.write(this.memTotal);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RemoteClusterInfo}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<RemoteClusterInfo> {
		private String clusterUuid;

		private String mode;

		private Boolean skipUnavailable;

		private String transportCompress;

		private HealthStatus status;

		private List<String> version;

		private Integer nodesCount;

		private Integer shardsCount;

		private Integer indicesCount;

		private Long indicesTotalSizeInBytes;

		@Nullable
		private String indicesTotalSize;

		private Long maxHeapInBytes;

		@Nullable
		private String maxHeap;

		private Long memTotalInBytes;

		@Nullable
		private String memTotal;

		public Builder() {
		}
		private Builder(RemoteClusterInfo instance) {
			this.clusterUuid = instance.clusterUuid;
			this.mode = instance.mode;
			this.skipUnavailable = instance.skipUnavailable;
			this.transportCompress = instance.transportCompress;
			this.status = instance.status;
			this.version = instance.version;
			this.nodesCount = instance.nodesCount;
			this.shardsCount = instance.shardsCount;
			this.indicesCount = instance.indicesCount;
			this.indicesTotalSizeInBytes = instance.indicesTotalSizeInBytes;
			this.indicesTotalSize = instance.indicesTotalSize;
			this.maxHeapInBytes = instance.maxHeapInBytes;
			this.maxHeap = instance.maxHeap;
			this.memTotalInBytes = instance.memTotalInBytes;
			this.memTotal = instance.memTotal;

		}
		/**
		 * Required - The UUID of the remote cluster.
		 * <p>
		 * API name: {@code cluster_uuid}
		 */
		public final Builder clusterUuid(String value) {
			this.clusterUuid = value;
			return this;
		}

		/**
		 * Required - The connection mode used to communicate with the remote cluster.
		 * <p>
		 * API name: {@code mode}
		 */
		public final Builder mode(String value) {
			this.mode = value;
			return this;
		}

		/**
		 * Required - The <code>skip_unavailable</code> setting used for this remote
		 * cluster.
		 * <p>
		 * API name: {@code skip_unavailable}
		 */
		public final Builder skipUnavailable(boolean value) {
			this.skipUnavailable = value;
			return this;
		}

		/**
		 * Required - Transport compression setting used for this remote cluster.
		 * <p>
		 * API name: {@code transport.compress}
		 */
		public final Builder transportCompress(String value) {
			this.transportCompress = value;
			return this;
		}

		/**
		 * Required - Health status of the cluster, based on the state of its primary
		 * and replica shards.
		 * <p>
		 * API name: {@code status}
		 */
		public final Builder status(HealthStatus value) {
			this.status = value;
			return this;
		}

		/**
		 * Required - The list of Elasticsearch versions used by the nodes on the remote
		 * cluster.
		 * <p>
		 * API name: {@code version}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>version</code>.
		 */
		public final Builder version(List<String> list) {
			this.version = _listAddAll(this.version, list);
			return this;
		}

		/**
		 * Required - The list of Elasticsearch versions used by the nodes on the remote
		 * cluster.
		 * <p>
		 * API name: {@code version}
		 * <p>
		 * Adds one or more values to <code>version</code>.
		 */
		public final Builder version(String value, String... values) {
			this.version = _listAdd(this.version, value, values);
			return this;
		}

		/**
		 * Required - The total count of nodes in the remote cluster.
		 * <p>
		 * API name: {@code nodes_count}
		 */
		public final Builder nodesCount(int value) {
			this.nodesCount = value;
			return this;
		}

		/**
		 * Required - The total number of shards in the remote cluster.
		 * <p>
		 * API name: {@code shards_count}
		 */
		public final Builder shardsCount(int value) {
			this.shardsCount = value;
			return this;
		}

		/**
		 * Required - The total number of indices in the remote cluster.
		 * <p>
		 * API name: {@code indices_count}
		 */
		public final Builder indicesCount(int value) {
			this.indicesCount = value;
			return this;
		}

		/**
		 * Required - Total data set size, in bytes, of all shards assigned to selected
		 * nodes.
		 * <p>
		 * API name: {@code indices_total_size_in_bytes}
		 */
		public final Builder indicesTotalSizeInBytes(long value) {
			this.indicesTotalSizeInBytes = value;
			return this;
		}

		/**
		 * Total data set size of all shards assigned to selected nodes, as a
		 * human-readable string.
		 * <p>
		 * API name: {@code indices_total_size}
		 */
		public final Builder indicesTotalSize(@Nullable String value) {
			this.indicesTotalSize = value;
			return this;
		}

		/**
		 * Required - Maximum amount of memory, in bytes, available for use by the heap
		 * across the nodes of the remote cluster.
		 * <p>
		 * API name: {@code max_heap_in_bytes}
		 */
		public final Builder maxHeapInBytes(long value) {
			this.maxHeapInBytes = value;
			return this;
		}

		/**
		 * Maximum amount of memory available for use by the heap across the nodes of
		 * the remote cluster, as a human-readable string.
		 * <p>
		 * API name: {@code max_heap}
		 */
		public final Builder maxHeap(@Nullable String value) {
			this.maxHeap = value;
			return this;
		}

		/**
		 * Required - Total amount, in bytes, of physical memory across the nodes of the
		 * remote cluster.
		 * <p>
		 * API name: {@code mem_total_in_bytes}
		 */
		public final Builder memTotalInBytes(long value) {
			this.memTotalInBytes = value;
			return this;
		}

		/**
		 * Total amount of physical memory across the nodes of the remote cluster, as a
		 * human-readable string.
		 * <p>
		 * API name: {@code mem_total}
		 */
		public final Builder memTotal(@Nullable String value) {
			this.memTotal = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RemoteClusterInfo}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RemoteClusterInfo build() {
			_checkSingleUse();

			return new RemoteClusterInfo(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RemoteClusterInfo}
	 */
	public static final JsonpDeserializer<RemoteClusterInfo> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RemoteClusterInfo::setupRemoteClusterInfoDeserializer);

	protected static void setupRemoteClusterInfoDeserializer(ObjectDeserializer<RemoteClusterInfo.Builder> op) {

		op.add(Builder::clusterUuid, JsonpDeserializer.stringDeserializer(), "cluster_uuid");
		op.add(Builder::mode, JsonpDeserializer.stringDeserializer(), "mode");
		op.add(Builder::skipUnavailable, JsonpDeserializer.booleanDeserializer(), "skip_unavailable");
		op.add(Builder::transportCompress, JsonpDeserializer.stringDeserializer(), "transport.compress");
		op.add(Builder::status, HealthStatus._DESERIALIZER, "status");
		op.add(Builder::version, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"version");
		op.add(Builder::nodesCount, JsonpDeserializer.integerDeserializer(), "nodes_count");
		op.add(Builder::shardsCount, JsonpDeserializer.integerDeserializer(), "shards_count");
		op.add(Builder::indicesCount, JsonpDeserializer.integerDeserializer(), "indices_count");
		op.add(Builder::indicesTotalSizeInBytes, JsonpDeserializer.longDeserializer(), "indices_total_size_in_bytes");
		op.add(Builder::indicesTotalSize, JsonpDeserializer.stringDeserializer(), "indices_total_size");
		op.add(Builder::maxHeapInBytes, JsonpDeserializer.longDeserializer(), "max_heap_in_bytes");
		op.add(Builder::maxHeap, JsonpDeserializer.stringDeserializer(), "max_heap");
		op.add(Builder::memTotalInBytes, JsonpDeserializer.longDeserializer(), "mem_total_in_bytes");
		op.add(Builder::memTotal, JsonpDeserializer.stringDeserializer(), "mem_total");

	}

}
