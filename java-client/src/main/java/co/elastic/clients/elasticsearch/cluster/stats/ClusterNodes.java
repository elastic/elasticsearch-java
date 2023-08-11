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

import co.elastic.clients.elasticsearch._types.PluginStats;
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
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.stats.ClusterNodes

/**
 *
 * @see <a href="../../doc-files/api-spec.html#cluster.stats.ClusterNodes">API
 *      specification</a>
 */
@JsonpDeserializable
public class ClusterNodes implements JsonpSerializable {
	private final ClusterNodeCount count;

	private final Map<String, Integer> discoveryTypes;

	private final ClusterFileSystem fs;

	private final IndexingPressure indexingPressure;

	private final ClusterIngest ingest;

	private final ClusterJvm jvm;

	private final ClusterNetworkTypes networkTypes;

	private final ClusterOperatingSystem os;

	private final List<NodePackagingType> packagingTypes;

	private final List<PluginStats> plugins;

	private final ClusterProcess process;

	private final List<String> versions;

	// ---------------------------------------------------------------------------------------------

	private ClusterNodes(Builder builder) {

		this.count = ApiTypeHelper.requireNonNull(builder.count, this, "count");
		this.discoveryTypes = ApiTypeHelper.unmodifiableRequired(builder.discoveryTypes, this, "discoveryTypes");
		this.fs = ApiTypeHelper.requireNonNull(builder.fs, this, "fs");
		this.indexingPressure = ApiTypeHelper.requireNonNull(builder.indexingPressure, this, "indexingPressure");
		this.ingest = ApiTypeHelper.requireNonNull(builder.ingest, this, "ingest");
		this.jvm = ApiTypeHelper.requireNonNull(builder.jvm, this, "jvm");
		this.networkTypes = ApiTypeHelper.requireNonNull(builder.networkTypes, this, "networkTypes");
		this.os = ApiTypeHelper.requireNonNull(builder.os, this, "os");
		this.packagingTypes = ApiTypeHelper.unmodifiableRequired(builder.packagingTypes, this, "packagingTypes");
		this.plugins = ApiTypeHelper.unmodifiableRequired(builder.plugins, this, "plugins");
		this.process = ApiTypeHelper.requireNonNull(builder.process, this, "process");
		this.versions = ApiTypeHelper.unmodifiableRequired(builder.versions, this, "versions");

	}

	public static ClusterNodes of(Function<Builder, ObjectBuilder<ClusterNodes>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Contains counts for nodes selected by the request’s node filters.
	 * <p>
	 * API name: {@code count}
	 */
	public final ClusterNodeCount count() {
		return this.count;
	}

	/**
	 * Required - Contains statistics about the discovery types used by selected
	 * nodes.
	 * <p>
	 * API name: {@code discovery_types}
	 */
	public final Map<String, Integer> discoveryTypes() {
		return this.discoveryTypes;
	}

	/**
	 * Required - Contains statistics about file stores by selected nodes.
	 * <p>
	 * API name: {@code fs}
	 */
	public final ClusterFileSystem fs() {
		return this.fs;
	}

	/**
	 * Required - API name: {@code indexing_pressure}
	 */
	public final IndexingPressure indexingPressure() {
		return this.indexingPressure;
	}

	/**
	 * Required - API name: {@code ingest}
	 */
	public final ClusterIngest ingest() {
		return this.ingest;
	}

	/**
	 * Required - Contains statistics about the Java Virtual Machines (JVMs) used by
	 * selected nodes.
	 * <p>
	 * API name: {@code jvm}
	 */
	public final ClusterJvm jvm() {
		return this.jvm;
	}

	/**
	 * Required - Contains statistics about the transport and HTTP networks used by
	 * selected nodes.
	 * <p>
	 * API name: {@code network_types}
	 */
	public final ClusterNetworkTypes networkTypes() {
		return this.networkTypes;
	}

	/**
	 * Required - Contains statistics about the operating systems used by selected
	 * nodes.
	 * <p>
	 * API name: {@code os}
	 */
	public final ClusterOperatingSystem os() {
		return this.os;
	}

	/**
	 * Required - Contains statistics about Elasticsearch distributions installed on
	 * selected nodes.
	 * <p>
	 * API name: {@code packaging_types}
	 */
	public final List<NodePackagingType> packagingTypes() {
		return this.packagingTypes;
	}

	/**
	 * Required - Contains statistics about installed plugins and modules by
	 * selected nodes. If no plugins or modules are installed, this array is empty.
	 * <p>
	 * API name: {@code plugins}
	 */
	public final List<PluginStats> plugins() {
		return this.plugins;
	}

	/**
	 * Required - Contains statistics about processes used by selected nodes.
	 * <p>
	 * API name: {@code process}
	 */
	public final ClusterProcess process() {
		return this.process;
	}

	/**
	 * Required - Array of Elasticsearch versions used on selected nodes.
	 * <p>
	 * API name: {@code versions}
	 */
	public final List<String> versions() {
		return this.versions;
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

		generator.writeKey("count");
		this.count.serialize(generator, mapper);

		if (ApiTypeHelper.isDefined(this.discoveryTypes)) {
			generator.writeKey("discovery_types");
			generator.writeStartObject();
			for (Map.Entry<String, Integer> item0 : this.discoveryTypes.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		generator.writeKey("fs");
		this.fs.serialize(generator, mapper);

		generator.writeKey("indexing_pressure");
		this.indexingPressure.serialize(generator, mapper);

		generator.writeKey("ingest");
		this.ingest.serialize(generator, mapper);

		generator.writeKey("jvm");
		this.jvm.serialize(generator, mapper);

		generator.writeKey("network_types");
		this.networkTypes.serialize(generator, mapper);

		generator.writeKey("os");
		this.os.serialize(generator, mapper);

		if (ApiTypeHelper.isDefined(this.packagingTypes)) {
			generator.writeKey("packaging_types");
			generator.writeStartArray();
			for (NodePackagingType item0 : this.packagingTypes) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.plugins)) {
			generator.writeKey("plugins");
			generator.writeStartArray();
			for (PluginStats item0 : this.plugins) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("process");
		this.process.serialize(generator, mapper);

		if (ApiTypeHelper.isDefined(this.versions)) {
			generator.writeKey("versions");
			generator.writeStartArray();
			for (String item0 : this.versions) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterNodes}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ClusterNodes> {
		private ClusterNodeCount count;

		private Map<String, Integer> discoveryTypes;

		private ClusterFileSystem fs;

		private IndexingPressure indexingPressure;

		private ClusterIngest ingest;

		private ClusterJvm jvm;

		private ClusterNetworkTypes networkTypes;

		private ClusterOperatingSystem os;

		private List<NodePackagingType> packagingTypes;

		private List<PluginStats> plugins;

		private ClusterProcess process;

		private List<String> versions;

		/**
		 * Required - Contains counts for nodes selected by the request’s node filters.
		 * <p>
		 * API name: {@code count}
		 */
		public final Builder count(ClusterNodeCount value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - Contains counts for nodes selected by the request’s node filters.
		 * <p>
		 * API name: {@code count}
		 */
		public final Builder count(Function<ClusterNodeCount.Builder, ObjectBuilder<ClusterNodeCount>> fn) {
			return this.count(fn.apply(new ClusterNodeCount.Builder()).build());
		}

		/**
		 * Required - Contains statistics about the discovery types used by selected
		 * nodes.
		 * <p>
		 * API name: {@code discovery_types}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>discoveryTypes</code>.
		 */
		public final Builder discoveryTypes(Map<String, Integer> map) {
			this.discoveryTypes = _mapPutAll(this.discoveryTypes, map);
			return this;
		}

		/**
		 * Required - Contains statistics about the discovery types used by selected
		 * nodes.
		 * <p>
		 * API name: {@code discovery_types}
		 * <p>
		 * Adds an entry to <code>discoveryTypes</code>.
		 */
		public final Builder discoveryTypes(String key, Integer value) {
			this.discoveryTypes = _mapPut(this.discoveryTypes, key, value);
			return this;
		}

		/**
		 * Required - Contains statistics about file stores by selected nodes.
		 * <p>
		 * API name: {@code fs}
		 */
		public final Builder fs(ClusterFileSystem value) {
			this.fs = value;
			return this;
		}

		/**
		 * Required - Contains statistics about file stores by selected nodes.
		 * <p>
		 * API name: {@code fs}
		 */
		public final Builder fs(Function<ClusterFileSystem.Builder, ObjectBuilder<ClusterFileSystem>> fn) {
			return this.fs(fn.apply(new ClusterFileSystem.Builder()).build());
		}

		/**
		 * Required - API name: {@code indexing_pressure}
		 */
		public final Builder indexingPressure(IndexingPressure value) {
			this.indexingPressure = value;
			return this;
		}

		/**
		 * Required - API name: {@code indexing_pressure}
		 */
		public final Builder indexingPressure(Function<IndexingPressure.Builder, ObjectBuilder<IndexingPressure>> fn) {
			return this.indexingPressure(fn.apply(new IndexingPressure.Builder()).build());
		}

		/**
		 * Required - API name: {@code ingest}
		 */
		public final Builder ingest(ClusterIngest value) {
			this.ingest = value;
			return this;
		}

		/**
		 * Required - API name: {@code ingest}
		 */
		public final Builder ingest(Function<ClusterIngest.Builder, ObjectBuilder<ClusterIngest>> fn) {
			return this.ingest(fn.apply(new ClusterIngest.Builder()).build());
		}

		/**
		 * Required - Contains statistics about the Java Virtual Machines (JVMs) used by
		 * selected nodes.
		 * <p>
		 * API name: {@code jvm}
		 */
		public final Builder jvm(ClusterJvm value) {
			this.jvm = value;
			return this;
		}

		/**
		 * Required - Contains statistics about the Java Virtual Machines (JVMs) used by
		 * selected nodes.
		 * <p>
		 * API name: {@code jvm}
		 */
		public final Builder jvm(Function<ClusterJvm.Builder, ObjectBuilder<ClusterJvm>> fn) {
			return this.jvm(fn.apply(new ClusterJvm.Builder()).build());
		}

		/**
		 * Required - Contains statistics about the transport and HTTP networks used by
		 * selected nodes.
		 * <p>
		 * API name: {@code network_types}
		 */
		public final Builder networkTypes(ClusterNetworkTypes value) {
			this.networkTypes = value;
			return this;
		}

		/**
		 * Required - Contains statistics about the transport and HTTP networks used by
		 * selected nodes.
		 * <p>
		 * API name: {@code network_types}
		 */
		public final Builder networkTypes(
				Function<ClusterNetworkTypes.Builder, ObjectBuilder<ClusterNetworkTypes>> fn) {
			return this.networkTypes(fn.apply(new ClusterNetworkTypes.Builder()).build());
		}

		/**
		 * Required - Contains statistics about the operating systems used by selected
		 * nodes.
		 * <p>
		 * API name: {@code os}
		 */
		public final Builder os(ClusterOperatingSystem value) {
			this.os = value;
			return this;
		}

		/**
		 * Required - Contains statistics about the operating systems used by selected
		 * nodes.
		 * <p>
		 * API name: {@code os}
		 */
		public final Builder os(Function<ClusterOperatingSystem.Builder, ObjectBuilder<ClusterOperatingSystem>> fn) {
			return this.os(fn.apply(new ClusterOperatingSystem.Builder()).build());
		}

		/**
		 * Required - Contains statistics about Elasticsearch distributions installed on
		 * selected nodes.
		 * <p>
		 * API name: {@code packaging_types}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>packagingTypes</code>.
		 */
		public final Builder packagingTypes(List<NodePackagingType> list) {
			this.packagingTypes = _listAddAll(this.packagingTypes, list);
			return this;
		}

		/**
		 * Required - Contains statistics about Elasticsearch distributions installed on
		 * selected nodes.
		 * <p>
		 * API name: {@code packaging_types}
		 * <p>
		 * Adds one or more values to <code>packagingTypes</code>.
		 */
		public final Builder packagingTypes(NodePackagingType value, NodePackagingType... values) {
			this.packagingTypes = _listAdd(this.packagingTypes, value, values);
			return this;
		}

		/**
		 * Required - Contains statistics about Elasticsearch distributions installed on
		 * selected nodes.
		 * <p>
		 * API name: {@code packaging_types}
		 * <p>
		 * Adds a value to <code>packagingTypes</code> using a builder lambda.
		 */
		public final Builder packagingTypes(Function<NodePackagingType.Builder, ObjectBuilder<NodePackagingType>> fn) {
			return packagingTypes(fn.apply(new NodePackagingType.Builder()).build());
		}

		/**
		 * Required - Contains statistics about installed plugins and modules by
		 * selected nodes. If no plugins or modules are installed, this array is empty.
		 * <p>
		 * API name: {@code plugins}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>plugins</code>.
		 */
		public final Builder plugins(List<PluginStats> list) {
			this.plugins = _listAddAll(this.plugins, list);
			return this;
		}

		/**
		 * Required - Contains statistics about installed plugins and modules by
		 * selected nodes. If no plugins or modules are installed, this array is empty.
		 * <p>
		 * API name: {@code plugins}
		 * <p>
		 * Adds one or more values to <code>plugins</code>.
		 */
		public final Builder plugins(PluginStats value, PluginStats... values) {
			this.plugins = _listAdd(this.plugins, value, values);
			return this;
		}

		/**
		 * Required - Contains statistics about installed plugins and modules by
		 * selected nodes. If no plugins or modules are installed, this array is empty.
		 * <p>
		 * API name: {@code plugins}
		 * <p>
		 * Adds a value to <code>plugins</code> using a builder lambda.
		 */
		public final Builder plugins(Function<PluginStats.Builder, ObjectBuilder<PluginStats>> fn) {
			return plugins(fn.apply(new PluginStats.Builder()).build());
		}

		/**
		 * Required - Contains statistics about processes used by selected nodes.
		 * <p>
		 * API name: {@code process}
		 */
		public final Builder process(ClusterProcess value) {
			this.process = value;
			return this;
		}

		/**
		 * Required - Contains statistics about processes used by selected nodes.
		 * <p>
		 * API name: {@code process}
		 */
		public final Builder process(Function<ClusterProcess.Builder, ObjectBuilder<ClusterProcess>> fn) {
			return this.process(fn.apply(new ClusterProcess.Builder()).build());
		}

		/**
		 * Required - Array of Elasticsearch versions used on selected nodes.
		 * <p>
		 * API name: {@code versions}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>versions</code>.
		 */
		public final Builder versions(List<String> list) {
			this.versions = _listAddAll(this.versions, list);
			return this;
		}

		/**
		 * Required - Array of Elasticsearch versions used on selected nodes.
		 * <p>
		 * API name: {@code versions}
		 * <p>
		 * Adds one or more values to <code>versions</code>.
		 */
		public final Builder versions(String value, String... values) {
			this.versions = _listAdd(this.versions, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ClusterNodes}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterNodes build() {
			_checkSingleUse();

			return new ClusterNodes(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClusterNodes}
	 */
	public static final JsonpDeserializer<ClusterNodes> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ClusterNodes::setupClusterNodesDeserializer);

	protected static void setupClusterNodesDeserializer(ObjectDeserializer<ClusterNodes.Builder> op) {

		op.add(Builder::count, ClusterNodeCount._DESERIALIZER, "count");
		op.add(Builder::discoveryTypes,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.integerDeserializer()), "discovery_types");
		op.add(Builder::fs, ClusterFileSystem._DESERIALIZER, "fs");
		op.add(Builder::indexingPressure, IndexingPressure._DESERIALIZER, "indexing_pressure");
		op.add(Builder::ingest, ClusterIngest._DESERIALIZER, "ingest");
		op.add(Builder::jvm, ClusterJvm._DESERIALIZER, "jvm");
		op.add(Builder::networkTypes, ClusterNetworkTypes._DESERIALIZER, "network_types");
		op.add(Builder::os, ClusterOperatingSystem._DESERIALIZER, "os");
		op.add(Builder::packagingTypes, JsonpDeserializer.arrayDeserializer(NodePackagingType._DESERIALIZER),
				"packaging_types");
		op.add(Builder::plugins, JsonpDeserializer.arrayDeserializer(PluginStats._DESERIALIZER), "plugins");
		op.add(Builder::process, ClusterProcess._DESERIALIZER, "process");
		op.add(Builder::versions, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"versions");

	}

}
