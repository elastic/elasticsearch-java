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
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.stats.ClusterNodes
public final class ClusterNodes implements ToJsonp {
	private final ClusterNodeCount count;

	private final Map<String, Number> discoveryTypes;

	private final ClusterFileSystem fs;

	private final ClusterIngest ingest;

	private final ClusterJvm jvm;

	private final ClusterNetworkTypes networkTypes;

	private final ClusterOperatingSystem os;

	private final List<NodePackagingType> packagingTypes;

	private final List<PluginStats> plugins;

	private final ClusterProcess process;

	private final List<String> versions;

	// ---------------------------------------------------------------------------------------------

	protected ClusterNodes(Builder builder) {

		this.count = Objects.requireNonNull(builder.count, "count");
		this.discoveryTypes = Objects.requireNonNull(builder.discoveryTypes, "discovery_types");
		this.fs = Objects.requireNonNull(builder.fs, "fs");
		this.ingest = Objects.requireNonNull(builder.ingest, "ingest");
		this.jvm = Objects.requireNonNull(builder.jvm, "jvm");
		this.networkTypes = Objects.requireNonNull(builder.networkTypes, "network_types");
		this.os = Objects.requireNonNull(builder.os, "os");
		this.packagingTypes = Objects.requireNonNull(builder.packagingTypes, "packaging_types");
		this.plugins = Objects.requireNonNull(builder.plugins, "plugins");
		this.process = Objects.requireNonNull(builder.process, "process");
		this.versions = Objects.requireNonNull(builder.versions, "versions");

	}

	/**
	 * Contains counts for nodes selected by the request’s node filters.
	 *
	 * API name: {@code count}
	 */
	public ClusterNodeCount count() {
		return this.count;
	}

	/**
	 * Contains statistics about the discovery types used by selected nodes.
	 *
	 * API name: {@code discovery_types}
	 */
	public Map<String, Number> discoveryTypes() {
		return this.discoveryTypes;
	}

	/**
	 * Contains statistics about file stores by selected nodes.
	 *
	 * API name: {@code fs}
	 */
	public ClusterFileSystem fs() {
		return this.fs;
	}

	/**
	 * API name: {@code ingest}
	 */
	public ClusterIngest ingest() {
		return this.ingest;
	}

	/**
	 * Contains statistics about the Java Virtual Machines (JVMs) used by selected
	 * nodes.
	 *
	 * API name: {@code jvm}
	 */
	public ClusterJvm jvm() {
		return this.jvm;
	}

	/**
	 * Contains statistics about the transport and HTTP networks used by selected
	 * nodes.
	 *
	 * API name: {@code network_types}
	 */
	public ClusterNetworkTypes networkTypes() {
		return this.networkTypes;
	}

	/**
	 * Contains statistics about the operating systems used by selected nodes.
	 *
	 * API name: {@code os}
	 */
	public ClusterOperatingSystem os() {
		return this.os;
	}

	/**
	 * Contains statistics about Elasticsearch distributions installed on selected
	 * nodes.
	 *
	 * API name: {@code packaging_types}
	 */
	public List<NodePackagingType> packagingTypes() {
		return this.packagingTypes;
	}

	/**
	 * Contains statistics about installed plugins and modules by selected nodes.
	 *
	 * API name: {@code plugins}
	 */
	public List<PluginStats> plugins() {
		return this.plugins;
	}

	/**
	 * Contains statistics about processes used by selected nodes.
	 *
	 * API name: {@code process}
	 */
	public ClusterProcess process() {
		return this.process;
	}

	/**
	 * Array of Elasticsearch versions used on selected nodes.
	 *
	 * API name: {@code versions}
	 */
	public List<String> versions() {
		return this.versions;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("count");
		this.count.toJsonp(generator, mapper);

		generator.writeKey("discovery_types");
		generator.writeStartObject();
		for (Map.Entry<String, Number> item0 : this.discoveryTypes.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.write(item0.getValue().doubleValue());

		}
		generator.writeEnd();

		generator.writeKey("fs");
		this.fs.toJsonp(generator, mapper);

		generator.writeKey("ingest");
		this.ingest.toJsonp(generator, mapper);

		generator.writeKey("jvm");
		this.jvm.toJsonp(generator, mapper);

		generator.writeKey("network_types");
		this.networkTypes.toJsonp(generator, mapper);

		generator.writeKey("os");
		this.os.toJsonp(generator, mapper);

		generator.writeKey("packaging_types");
		generator.writeStartArray();
		for (NodePackagingType item0 : this.packagingTypes) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("plugins");
		generator.writeStartArray();
		for (PluginStats item0 : this.plugins) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("process");
		this.process.toJsonp(generator, mapper);

		generator.writeKey("versions");
		generator.writeStartArray();
		for (String item0 : this.versions) {
			generator.write(item0);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterNodes}.
	 */
	public static class Builder implements ObjectBuilder<ClusterNodes> {
		private ClusterNodeCount count;

		private Map<String, Number> discoveryTypes;

		private ClusterFileSystem fs;

		private ClusterIngest ingest;

		private ClusterJvm jvm;

		private ClusterNetworkTypes networkTypes;

		private ClusterOperatingSystem os;

		private List<NodePackagingType> packagingTypes;

		private List<PluginStats> plugins;

		private ClusterProcess process;

		private List<String> versions;

		/**
		 * Contains counts for nodes selected by the request’s node filters.
		 *
		 * API name: {@code count}
		 */
		public Builder count(ClusterNodeCount value) {
			this.count = value;
			return this;
		}

		/**
		 * Contains counts for nodes selected by the request’s node filters.
		 *
		 * API name: {@code count}
		 */
		public Builder count(Function<ClusterNodeCount.Builder, ObjectBuilder<ClusterNodeCount>> fn) {
			return this.count(fn.apply(new ClusterNodeCount.Builder()).build());
		}

		/**
		 * Contains statistics about the discovery types used by selected nodes.
		 *
		 * API name: {@code discovery_types}
		 */
		public Builder discoveryTypes(Map<String, Number> value) {
			this.discoveryTypes = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #discoveryTypes(Map)}, creating the map if needed.
		 */
		public Builder putDiscoveryTypes(String key, Number value) {
			if (this.discoveryTypes == null) {
				this.discoveryTypes = new HashMap<>();
			}
			this.discoveryTypes.put(key, value);
			return this;
		}

		/**
		 * Contains statistics about file stores by selected nodes.
		 *
		 * API name: {@code fs}
		 */
		public Builder fs(ClusterFileSystem value) {
			this.fs = value;
			return this;
		}

		/**
		 * Contains statistics about file stores by selected nodes.
		 *
		 * API name: {@code fs}
		 */
		public Builder fs(Function<ClusterFileSystem.Builder, ObjectBuilder<ClusterFileSystem>> fn) {
			return this.fs(fn.apply(new ClusterFileSystem.Builder()).build());
		}

		/**
		 * API name: {@code ingest}
		 */
		public Builder ingest(ClusterIngest value) {
			this.ingest = value;
			return this;
		}

		/**
		 * API name: {@code ingest}
		 */
		public Builder ingest(Function<ClusterIngest.Builder, ObjectBuilder<ClusterIngest>> fn) {
			return this.ingest(fn.apply(new ClusterIngest.Builder()).build());
		}

		/**
		 * Contains statistics about the Java Virtual Machines (JVMs) used by selected
		 * nodes.
		 *
		 * API name: {@code jvm}
		 */
		public Builder jvm(ClusterJvm value) {
			this.jvm = value;
			return this;
		}

		/**
		 * Contains statistics about the Java Virtual Machines (JVMs) used by selected
		 * nodes.
		 *
		 * API name: {@code jvm}
		 */
		public Builder jvm(Function<ClusterJvm.Builder, ObjectBuilder<ClusterJvm>> fn) {
			return this.jvm(fn.apply(new ClusterJvm.Builder()).build());
		}

		/**
		 * Contains statistics about the transport and HTTP networks used by selected
		 * nodes.
		 *
		 * API name: {@code network_types}
		 */
		public Builder networkTypes(ClusterNetworkTypes value) {
			this.networkTypes = value;
			return this;
		}

		/**
		 * Contains statistics about the transport and HTTP networks used by selected
		 * nodes.
		 *
		 * API name: {@code network_types}
		 */
		public Builder networkTypes(Function<ClusterNetworkTypes.Builder, ObjectBuilder<ClusterNetworkTypes>> fn) {
			return this.networkTypes(fn.apply(new ClusterNetworkTypes.Builder()).build());
		}

		/**
		 * Contains statistics about the operating systems used by selected nodes.
		 *
		 * API name: {@code os}
		 */
		public Builder os(ClusterOperatingSystem value) {
			this.os = value;
			return this;
		}

		/**
		 * Contains statistics about the operating systems used by selected nodes.
		 *
		 * API name: {@code os}
		 */
		public Builder os(Function<ClusterOperatingSystem.Builder, ObjectBuilder<ClusterOperatingSystem>> fn) {
			return this.os(fn.apply(new ClusterOperatingSystem.Builder()).build());
		}

		/**
		 * Contains statistics about Elasticsearch distributions installed on selected
		 * nodes.
		 *
		 * API name: {@code packaging_types}
		 */
		public Builder packagingTypes(List<NodePackagingType> value) {
			this.packagingTypes = value;
			return this;
		}

		/**
		 * Contains statistics about Elasticsearch distributions installed on selected
		 * nodes.
		 *
		 * API name: {@code packaging_types}
		 */
		public Builder packagingTypes(NodePackagingType... value) {
			this.packagingTypes = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #packagingTypes(List)}, creating the list if needed.
		 */
		public Builder addPackagingTypes(NodePackagingType value) {
			if (this.packagingTypes == null) {
				this.packagingTypes = new ArrayList<>();
			}
			this.packagingTypes.add(value);
			return this;
		}

		/**
		 * Set {@link #packagingTypes(List)} to a singleton list.
		 */
		public Builder packagingTypes(Function<NodePackagingType.Builder, ObjectBuilder<NodePackagingType>> fn) {
			return this.packagingTypes(fn.apply(new NodePackagingType.Builder()).build());
		}

		/**
		 * Add a value to {@link #packagingTypes(List)}, creating the list if needed.
		 */
		public Builder addPackagingTypes(Function<NodePackagingType.Builder, ObjectBuilder<NodePackagingType>> fn) {
			return this.addPackagingTypes(fn.apply(new NodePackagingType.Builder()).build());
		}

		/**
		 * Contains statistics about installed plugins and modules by selected nodes.
		 *
		 * API name: {@code plugins}
		 */
		public Builder plugins(List<PluginStats> value) {
			this.plugins = value;
			return this;
		}

		/**
		 * Contains statistics about installed plugins and modules by selected nodes.
		 *
		 * API name: {@code plugins}
		 */
		public Builder plugins(PluginStats... value) {
			this.plugins = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #plugins(List)}, creating the list if needed.
		 */
		public Builder addPlugins(PluginStats value) {
			if (this.plugins == null) {
				this.plugins = new ArrayList<>();
			}
			this.plugins.add(value);
			return this;
		}

		/**
		 * Set {@link #plugins(List)} to a singleton list.
		 */
		public Builder plugins(Function<PluginStats.Builder, ObjectBuilder<PluginStats>> fn) {
			return this.plugins(fn.apply(new PluginStats.Builder()).build());
		}

		/**
		 * Add a value to {@link #plugins(List)}, creating the list if needed.
		 */
		public Builder addPlugins(Function<PluginStats.Builder, ObjectBuilder<PluginStats>> fn) {
			return this.addPlugins(fn.apply(new PluginStats.Builder()).build());
		}

		/**
		 * Contains statistics about processes used by selected nodes.
		 *
		 * API name: {@code process}
		 */
		public Builder process(ClusterProcess value) {
			this.process = value;
			return this;
		}

		/**
		 * Contains statistics about processes used by selected nodes.
		 *
		 * API name: {@code process}
		 */
		public Builder process(Function<ClusterProcess.Builder, ObjectBuilder<ClusterProcess>> fn) {
			return this.process(fn.apply(new ClusterProcess.Builder()).build());
		}

		/**
		 * Array of Elasticsearch versions used on selected nodes.
		 *
		 * API name: {@code versions}
		 */
		public Builder versions(List<String> value) {
			this.versions = value;
			return this;
		}

		/**
		 * Array of Elasticsearch versions used on selected nodes.
		 *
		 * API name: {@code versions}
		 */
		public Builder versions(String... value) {
			this.versions = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #versions(List)}, creating the list if needed.
		 */
		public Builder addVersions(String value) {
			if (this.versions == null) {
				this.versions = new ArrayList<>();
			}
			this.versions.add(value);
			return this;
		}

		/**
		 * Builds a {@link ClusterNodes}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterNodes build() {

			return new ClusterNodes(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ClusterNodes
	 */
	public static final JsonpDeserializer<ClusterNodes> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ClusterNodes::setupClusterNodesDeserializer);

	protected static void setupClusterNodesDeserializer(DelegatingDeserializer<ClusterNodes.Builder> op) {

		op.add(Builder::count, ClusterNodeCount.DESERIALIZER, "count");
		op.add(Builder::discoveryTypes, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.numberDeserializer()),
				"discovery_types");
		op.add(Builder::fs, ClusterFileSystem.DESERIALIZER, "fs");
		op.add(Builder::ingest, ClusterIngest.DESERIALIZER, "ingest");
		op.add(Builder::jvm, ClusterJvm.DESERIALIZER, "jvm");
		op.add(Builder::networkTypes, ClusterNetworkTypes.DESERIALIZER, "network_types");
		op.add(Builder::os, ClusterOperatingSystem.DESERIALIZER, "os");
		op.add(Builder::packagingTypes, JsonpDeserializer.arrayDeserializer(NodePackagingType.DESERIALIZER),
				"packaging_types");
		op.add(Builder::plugins, JsonpDeserializer.arrayDeserializer(PluginStats.DESERIALIZER), "plugins");
		op.add(Builder::process, ClusterProcess.DESERIALIZER, "process");
		op.add(Builder::versions, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"versions");

	}

}
