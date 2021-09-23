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

package co.elastic.clients.elasticsearch.nodes.info;

import co.elastic.clients.elasticsearch._types.NodeRole;
import co.elastic.clients.elasticsearch._types.PluginStats;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
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

// typedef: nodes.info.NodeInfo
public final class NodeInfo implements JsonpSerializable {
	private final Map<String, String> attributes;

	private final String buildFlavor;

	private final String buildHash;

	private final String buildType;

	private final String host;

	@Nullable
	private final NodeInfoHttp http;

	private final String ip;

	@Nullable
	private final NodeJvmInfo jvm;

	private final String name;

	@Nullable
	private final NodeInfoNetwork network;

	@Nullable
	private final NodeOperatingSystemInfo os;

	@Nullable
	private final List<PluginStats> plugins;

	@Nullable
	private final NodeProcessInfo process;

	private final List<NodeRole> roles;

	@Nullable
	private final NodeInfoSettings settings;

	@Nullable
	private final Map<String, NodeThreadPoolInfo> threadPool;

	@Nullable
	private final Number totalIndexingBuffer;

	@Nullable
	private final JsonValue totalIndexingBufferInBytes;

	@Nullable
	private final NodeInfoTransport transport;

	private final String transportAddress;

	private final String version;

	@Nullable
	private final List<PluginStats> modules;

	@Nullable
	private final NodeInfoIngest ingest;

	@Nullable
	private final Map<String, NodeInfoAggregation> aggregations;

	// ---------------------------------------------------------------------------------------------

	public NodeInfo(Builder builder) {

		this.attributes = Objects.requireNonNull(builder.attributes, "attributes");
		this.buildFlavor = Objects.requireNonNull(builder.buildFlavor, "build_flavor");
		this.buildHash = Objects.requireNonNull(builder.buildHash, "build_hash");
		this.buildType = Objects.requireNonNull(builder.buildType, "build_type");
		this.host = Objects.requireNonNull(builder.host, "host");
		this.http = builder.http;
		this.ip = Objects.requireNonNull(builder.ip, "ip");
		this.jvm = builder.jvm;
		this.name = Objects.requireNonNull(builder.name, "name");
		this.network = builder.network;
		this.os = builder.os;
		this.plugins = builder.plugins;
		this.process = builder.process;
		this.roles = Objects.requireNonNull(builder.roles, "roles");
		this.settings = builder.settings;
		this.threadPool = builder.threadPool;
		this.totalIndexingBuffer = builder.totalIndexingBuffer;
		this.totalIndexingBufferInBytes = builder.totalIndexingBufferInBytes;
		this.transport = builder.transport;
		this.transportAddress = Objects.requireNonNull(builder.transportAddress, "transport_address");
		this.version = Objects.requireNonNull(builder.version, "version");
		this.modules = builder.modules;
		this.ingest = builder.ingest;
		this.aggregations = builder.aggregations;

	}

	/**
	 * API name: {@code attributes}
	 */
	public Map<String, String> attributes() {
		return this.attributes;
	}

	/**
	 * API name: {@code build_flavor}
	 */
	public String buildFlavor() {
		return this.buildFlavor;
	}

	/**
	 * Short hash of the last git commit in this release.
	 * <p>
	 * API name: {@code build_hash}
	 */
	public String buildHash() {
		return this.buildHash;
	}

	/**
	 * API name: {@code build_type}
	 */
	public String buildType() {
		return this.buildType;
	}

	/**
	 * The node’s host name.
	 * <p>
	 * API name: {@code host}
	 */
	public String host() {
		return this.host;
	}

	/**
	 * API name: {@code http}
	 */
	@Nullable
	public NodeInfoHttp http() {
		return this.http;
	}

	/**
	 * The node’s IP address.
	 * <p>
	 * API name: {@code ip}
	 */
	public String ip() {
		return this.ip;
	}

	/**
	 * API name: {@code jvm}
	 */
	@Nullable
	public NodeJvmInfo jvm() {
		return this.jvm;
	}

	/**
	 * The node's name
	 * <p>
	 * API name: {@code name}
	 */
	public String name() {
		return this.name;
	}

	/**
	 * API name: {@code network}
	 */
	@Nullable
	public NodeInfoNetwork network() {
		return this.network;
	}

	/**
	 * API name: {@code os}
	 */
	@Nullable
	public NodeOperatingSystemInfo os() {
		return this.os;
	}

	/**
	 * API name: {@code plugins}
	 */
	@Nullable
	public List<PluginStats> plugins() {
		return this.plugins;
	}

	/**
	 * API name: {@code process}
	 */
	@Nullable
	public NodeProcessInfo process() {
		return this.process;
	}

	/**
	 * API name: {@code roles}
	 */
	public List<NodeRole> roles() {
		return this.roles;
	}

	/**
	 * API name: {@code settings}
	 */
	@Nullable
	public NodeInfoSettings settings() {
		return this.settings;
	}

	/**
	 * API name: {@code thread_pool}
	 */
	@Nullable
	public Map<String, NodeThreadPoolInfo> threadPool() {
		return this.threadPool;
	}

	/**
	 * Total heap allowed to be used to hold recently indexed documents before they
	 * must be written to disk. This size is a shared pool across all shards on this
	 * node, and is controlled by Indexing Buffer settings.
	 * <p>
	 * API name: {@code total_indexing_buffer}
	 */
	@Nullable
	public Number totalIndexingBuffer() {
		return this.totalIndexingBuffer;
	}

	/**
	 * Same as total_indexing_buffer, but expressed in bytes.
	 * <p>
	 * API name: {@code total_indexing_buffer_in_bytes}
	 */
	@Nullable
	public JsonValue totalIndexingBufferInBytes() {
		return this.totalIndexingBufferInBytes;
	}

	/**
	 * API name: {@code transport}
	 */
	@Nullable
	public NodeInfoTransport transport() {
		return this.transport;
	}

	/**
	 * Host and port where transport HTTP connections are accepted.
	 * <p>
	 * API name: {@code transport_address}
	 */
	public String transportAddress() {
		return this.transportAddress;
	}

	/**
	 * Elasticsearch version running on this node.
	 * <p>
	 * API name: {@code version}
	 */
	public String version() {
		return this.version;
	}

	/**
	 * API name: {@code modules}
	 */
	@Nullable
	public List<PluginStats> modules() {
		return this.modules;
	}

	/**
	 * API name: {@code ingest}
	 */
	@Nullable
	public NodeInfoIngest ingest() {
		return this.ingest;
	}

	/**
	 * API name: {@code aggregations}
	 */
	@Nullable
	public Map<String, NodeInfoAggregation> aggregations() {
		return this.aggregations;
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

		generator.writeKey("attributes");
		generator.writeStartObject();
		for (Map.Entry<String, String> item0 : this.attributes.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.write(item0.getValue());

		}
		generator.writeEnd();

		generator.writeKey("build_flavor");
		generator.write(this.buildFlavor);

		generator.writeKey("build_hash");
		generator.write(this.buildHash);

		generator.writeKey("build_type");
		generator.write(this.buildType);

		generator.writeKey("host");
		generator.write(this.host);

		if (this.http != null) {

			generator.writeKey("http");
			this.http.serialize(generator, mapper);

		}

		generator.writeKey("ip");
		generator.write(this.ip);

		if (this.jvm != null) {

			generator.writeKey("jvm");
			this.jvm.serialize(generator, mapper);

		}

		generator.writeKey("name");
		generator.write(this.name);

		if (this.network != null) {

			generator.writeKey("network");
			this.network.serialize(generator, mapper);

		}
		if (this.os != null) {

			generator.writeKey("os");
			this.os.serialize(generator, mapper);

		}
		if (this.plugins != null) {

			generator.writeKey("plugins");
			generator.writeStartArray();
			for (PluginStats item0 : this.plugins) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.process != null) {

			generator.writeKey("process");
			this.process.serialize(generator, mapper);

		}

		generator.writeKey("roles");
		generator.writeStartArray();
		for (NodeRole item0 : this.roles) {
			item0.serialize(generator, mapper);
		}
		generator.writeEnd();

		if (this.settings != null) {

			generator.writeKey("settings");
			this.settings.serialize(generator, mapper);

		}
		if (this.threadPool != null) {

			generator.writeKey("thread_pool");
			generator.writeStartObject();
			for (Map.Entry<String, NodeThreadPoolInfo> item0 : this.threadPool.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.totalIndexingBuffer != null) {

			generator.writeKey("total_indexing_buffer");
			generator.write(this.totalIndexingBuffer.doubleValue());

		}
		if (this.totalIndexingBufferInBytes != null) {

			generator.writeKey("total_indexing_buffer_in_bytes");
			generator.write(this.totalIndexingBufferInBytes);

		}
		if (this.transport != null) {

			generator.writeKey("transport");
			this.transport.serialize(generator, mapper);

		}

		generator.writeKey("transport_address");
		generator.write(this.transportAddress);

		generator.writeKey("version");
		generator.write(this.version);

		if (this.modules != null) {

			generator.writeKey("modules");
			generator.writeStartArray();
			for (PluginStats item0 : this.modules) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.ingest != null) {

			generator.writeKey("ingest");
			this.ingest.serialize(generator, mapper);

		}
		if (this.aggregations != null) {

			generator.writeKey("aggregations");
			generator.writeStartObject();
			for (Map.Entry<String, NodeInfoAggregation> item0 : this.aggregations.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfo}.
	 */
	public static class Builder implements ObjectBuilder<NodeInfo> {
		private Map<String, String> attributes;

		private String buildFlavor;

		private String buildHash;

		private String buildType;

		private String host;

		@Nullable
		private NodeInfoHttp http;

		private String ip;

		@Nullable
		private NodeJvmInfo jvm;

		private String name;

		@Nullable
		private NodeInfoNetwork network;

		@Nullable
		private NodeOperatingSystemInfo os;

		@Nullable
		private List<PluginStats> plugins;

		@Nullable
		private NodeProcessInfo process;

		private List<NodeRole> roles;

		@Nullable
		private NodeInfoSettings settings;

		@Nullable
		private Map<String, NodeThreadPoolInfo> threadPool;

		@Nullable
		private Number totalIndexingBuffer;

		@Nullable
		private JsonValue totalIndexingBufferInBytes;

		@Nullable
		private NodeInfoTransport transport;

		private String transportAddress;

		private String version;

		@Nullable
		private List<PluginStats> modules;

		@Nullable
		private NodeInfoIngest ingest;

		@Nullable
		private Map<String, NodeInfoAggregation> aggregations;

		/**
		 * API name: {@code attributes}
		 */
		public Builder attributes(Map<String, String> value) {
			this.attributes = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #attributes(Map)}, creating the map if needed.
		 */
		public Builder putAttributes(String key, String value) {
			if (this.attributes == null) {
				this.attributes = new HashMap<>();
			}
			this.attributes.put(key, value);
			return this;
		}

		/**
		 * API name: {@code build_flavor}
		 */
		public Builder buildFlavor(String value) {
			this.buildFlavor = value;
			return this;
		}

		/**
		 * Short hash of the last git commit in this release.
		 * <p>
		 * API name: {@code build_hash}
		 */
		public Builder buildHash(String value) {
			this.buildHash = value;
			return this;
		}

		/**
		 * API name: {@code build_type}
		 */
		public Builder buildType(String value) {
			this.buildType = value;
			return this;
		}

		/**
		 * The node’s host name.
		 * <p>
		 * API name: {@code host}
		 */
		public Builder host(String value) {
			this.host = value;
			return this;
		}

		/**
		 * API name: {@code http}
		 */
		public Builder http(@Nullable NodeInfoHttp value) {
			this.http = value;
			return this;
		}

		/**
		 * API name: {@code http}
		 */
		public Builder http(Function<NodeInfoHttp.Builder, ObjectBuilder<NodeInfoHttp>> fn) {
			return this.http(fn.apply(new NodeInfoHttp.Builder()).build());
		}

		/**
		 * The node’s IP address.
		 * <p>
		 * API name: {@code ip}
		 */
		public Builder ip(String value) {
			this.ip = value;
			return this;
		}

		/**
		 * API name: {@code jvm}
		 */
		public Builder jvm(@Nullable NodeJvmInfo value) {
			this.jvm = value;
			return this;
		}

		/**
		 * API name: {@code jvm}
		 */
		public Builder jvm(Function<NodeJvmInfo.Builder, ObjectBuilder<NodeJvmInfo>> fn) {
			return this.jvm(fn.apply(new NodeJvmInfo.Builder()).build());
		}

		/**
		 * The node's name
		 * <p>
		 * API name: {@code name}
		 */
		public Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code network}
		 */
		public Builder network(@Nullable NodeInfoNetwork value) {
			this.network = value;
			return this;
		}

		/**
		 * API name: {@code network}
		 */
		public Builder network(Function<NodeInfoNetwork.Builder, ObjectBuilder<NodeInfoNetwork>> fn) {
			return this.network(fn.apply(new NodeInfoNetwork.Builder()).build());
		}

		/**
		 * API name: {@code os}
		 */
		public Builder os(@Nullable NodeOperatingSystemInfo value) {
			this.os = value;
			return this;
		}

		/**
		 * API name: {@code os}
		 */
		public Builder os(Function<NodeOperatingSystemInfo.Builder, ObjectBuilder<NodeOperatingSystemInfo>> fn) {
			return this.os(fn.apply(new NodeOperatingSystemInfo.Builder()).build());
		}

		/**
		 * API name: {@code plugins}
		 */
		public Builder plugins(@Nullable List<PluginStats> value) {
			this.plugins = value;
			return this;
		}

		/**
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
		 * API name: {@code process}
		 */
		public Builder process(@Nullable NodeProcessInfo value) {
			this.process = value;
			return this;
		}

		/**
		 * API name: {@code process}
		 */
		public Builder process(Function<NodeProcessInfo.Builder, ObjectBuilder<NodeProcessInfo>> fn) {
			return this.process(fn.apply(new NodeProcessInfo.Builder()).build());
		}

		/**
		 * API name: {@code roles}
		 */
		public Builder roles(List<NodeRole> value) {
			this.roles = value;
			return this;
		}

		/**
		 * API name: {@code roles}
		 */
		public Builder roles(NodeRole... value) {
			this.roles = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #roles(List)}, creating the list if needed.
		 */
		public Builder addRoles(NodeRole value) {
			if (this.roles == null) {
				this.roles = new ArrayList<>();
			}
			this.roles.add(value);
			return this;
		}

		/**
		 * API name: {@code settings}
		 */
		public Builder settings(@Nullable NodeInfoSettings value) {
			this.settings = value;
			return this;
		}

		/**
		 * API name: {@code settings}
		 */
		public Builder settings(Function<NodeInfoSettings.Builder, ObjectBuilder<NodeInfoSettings>> fn) {
			return this.settings(fn.apply(new NodeInfoSettings.Builder()).build());
		}

		/**
		 * API name: {@code thread_pool}
		 */
		public Builder threadPool(@Nullable Map<String, NodeThreadPoolInfo> value) {
			this.threadPool = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #threadPool(Map)}, creating the map if needed.
		 */
		public Builder putThreadPool(String key, NodeThreadPoolInfo value) {
			if (this.threadPool == null) {
				this.threadPool = new HashMap<>();
			}
			this.threadPool.put(key, value);
			return this;
		}

		/**
		 * Set {@link #threadPool(Map)} to a singleton map.
		 */
		public Builder threadPool(String key,
				Function<NodeThreadPoolInfo.Builder, ObjectBuilder<NodeThreadPoolInfo>> fn) {
			return this.threadPool(Collections.singletonMap(key, fn.apply(new NodeThreadPoolInfo.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #threadPool(Map)}, creating the map if needed.
		 */
		public Builder putThreadPool(String key,
				Function<NodeThreadPoolInfo.Builder, ObjectBuilder<NodeThreadPoolInfo>> fn) {
			return this.putThreadPool(key, fn.apply(new NodeThreadPoolInfo.Builder()).build());
		}

		/**
		 * Total heap allowed to be used to hold recently indexed documents before they
		 * must be written to disk. This size is a shared pool across all shards on this
		 * node, and is controlled by Indexing Buffer settings.
		 * <p>
		 * API name: {@code total_indexing_buffer}
		 */
		public Builder totalIndexingBuffer(@Nullable Number value) {
			this.totalIndexingBuffer = value;
			return this;
		}

		/**
		 * Same as total_indexing_buffer, but expressed in bytes.
		 * <p>
		 * API name: {@code total_indexing_buffer_in_bytes}
		 */
		public Builder totalIndexingBufferInBytes(@Nullable JsonValue value) {
			this.totalIndexingBufferInBytes = value;
			return this;
		}

		/**
		 * API name: {@code transport}
		 */
		public Builder transport(@Nullable NodeInfoTransport value) {
			this.transport = value;
			return this;
		}

		/**
		 * API name: {@code transport}
		 */
		public Builder transport(Function<NodeInfoTransport.Builder, ObjectBuilder<NodeInfoTransport>> fn) {
			return this.transport(fn.apply(new NodeInfoTransport.Builder()).build());
		}

		/**
		 * Host and port where transport HTTP connections are accepted.
		 * <p>
		 * API name: {@code transport_address}
		 */
		public Builder transportAddress(String value) {
			this.transportAddress = value;
			return this;
		}

		/**
		 * Elasticsearch version running on this node.
		 * <p>
		 * API name: {@code version}
		 */
		public Builder version(String value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code modules}
		 */
		public Builder modules(@Nullable List<PluginStats> value) {
			this.modules = value;
			return this;
		}

		/**
		 * API name: {@code modules}
		 */
		public Builder modules(PluginStats... value) {
			this.modules = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #modules(List)}, creating the list if needed.
		 */
		public Builder addModules(PluginStats value) {
			if (this.modules == null) {
				this.modules = new ArrayList<>();
			}
			this.modules.add(value);
			return this;
		}

		/**
		 * Set {@link #modules(List)} to a singleton list.
		 */
		public Builder modules(Function<PluginStats.Builder, ObjectBuilder<PluginStats>> fn) {
			return this.modules(fn.apply(new PluginStats.Builder()).build());
		}

		/**
		 * Add a value to {@link #modules(List)}, creating the list if needed.
		 */
		public Builder addModules(Function<PluginStats.Builder, ObjectBuilder<PluginStats>> fn) {
			return this.addModules(fn.apply(new PluginStats.Builder()).build());
		}

		/**
		 * API name: {@code ingest}
		 */
		public Builder ingest(@Nullable NodeInfoIngest value) {
			this.ingest = value;
			return this;
		}

		/**
		 * API name: {@code ingest}
		 */
		public Builder ingest(Function<NodeInfoIngest.Builder, ObjectBuilder<NodeInfoIngest>> fn) {
			return this.ingest(fn.apply(new NodeInfoIngest.Builder()).build());
		}

		/**
		 * API name: {@code aggregations}
		 */
		public Builder aggregations(@Nullable Map<String, NodeInfoAggregation> value) {
			this.aggregations = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #aggregations(Map)}, creating the map if needed.
		 */
		public Builder putAggregations(String key, NodeInfoAggregation value) {
			if (this.aggregations == null) {
				this.aggregations = new HashMap<>();
			}
			this.aggregations.put(key, value);
			return this;
		}

		/**
		 * Set {@link #aggregations(Map)} to a singleton map.
		 */
		public Builder aggregations(String key,
				Function<NodeInfoAggregation.Builder, ObjectBuilder<NodeInfoAggregation>> fn) {
			return this
					.aggregations(Collections.singletonMap(key, fn.apply(new NodeInfoAggregation.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #aggregations(Map)}, creating the map if needed.
		 */
		public Builder putAggregations(String key,
				Function<NodeInfoAggregation.Builder, ObjectBuilder<NodeInfoAggregation>> fn) {
			return this.putAggregations(key, fn.apply(new NodeInfoAggregation.Builder()).build());
		}

		/**
		 * Builds a {@link NodeInfo}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfo build() {

			return new NodeInfo(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeInfo}
	 */
	public static final JsonpDeserializer<NodeInfo> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, NodeInfo::setupNodeInfoDeserializer);

	protected static void setupNodeInfoDeserializer(DelegatingDeserializer<NodeInfo.Builder> op) {

		op.add(Builder::attributes, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"attributes");
		op.add(Builder::buildFlavor, JsonpDeserializer.stringDeserializer(), "build_flavor");
		op.add(Builder::buildHash, JsonpDeserializer.stringDeserializer(), "build_hash");
		op.add(Builder::buildType, JsonpDeserializer.stringDeserializer(), "build_type");
		op.add(Builder::host, JsonpDeserializer.stringDeserializer(), "host");
		op.add(Builder::http, NodeInfoHttp.DESERIALIZER, "http");
		op.add(Builder::ip, JsonpDeserializer.stringDeserializer(), "ip");
		op.add(Builder::jvm, NodeJvmInfo.DESERIALIZER, "jvm");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::network, NodeInfoNetwork.DESERIALIZER, "network");
		op.add(Builder::os, NodeOperatingSystemInfo.DESERIALIZER, "os");
		op.add(Builder::plugins, JsonpDeserializer.arrayDeserializer(PluginStats.DESERIALIZER), "plugins");
		op.add(Builder::process, NodeProcessInfo.DESERIALIZER, "process");
		op.add(Builder::roles, JsonpDeserializer.arrayDeserializer(NodeRole.DESERIALIZER), "roles");
		op.add(Builder::settings, NodeInfoSettings.DESERIALIZER, "settings");
		op.add(Builder::threadPool, JsonpDeserializer.stringMapDeserializer(NodeThreadPoolInfo.DESERIALIZER),
				"thread_pool");
		op.add(Builder::totalIndexingBuffer, JsonpDeserializer.numberDeserializer(), "total_indexing_buffer");
		op.add(Builder::totalIndexingBufferInBytes, JsonpDeserializer.jsonValueDeserializer(),
				"total_indexing_buffer_in_bytes");
		op.add(Builder::transport, NodeInfoTransport.DESERIALIZER, "transport");
		op.add(Builder::transportAddress, JsonpDeserializer.stringDeserializer(), "transport_address");
		op.add(Builder::version, JsonpDeserializer.stringDeserializer(), "version");
		op.add(Builder::modules, JsonpDeserializer.arrayDeserializer(PluginStats.DESERIALIZER), "modules");
		op.add(Builder::ingest, NodeInfoIngest.DESERIALIZER, "ingest");
		op.add(Builder::aggregations, JsonpDeserializer.stringMapDeserializer(NodeInfoAggregation.DESERIALIZER),
				"aggregations");

	}

}
