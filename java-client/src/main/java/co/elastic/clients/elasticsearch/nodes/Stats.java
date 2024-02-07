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

package co.elastic.clients.elasticsearch.nodes;

import co.elastic.clients.elasticsearch._types.NodeRole;
import co.elastic.clients.elasticsearch.indices.stats.ShardStats;
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
import java.lang.Long;
import java.lang.String;
import java.util.List;
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

// typedef: nodes._types.Stats

/**
 *
 * @see <a href="../doc-files/api-spec.html#nodes._types.Stats">API
 *      specification</a>
 */
@JsonpDeserializable
public class Stats implements JsonpSerializable {
	private final Map<String, AdaptiveSelection> adaptiveSelection;

	private final Map<String, Breaker> breakers;

	@Nullable
	private final FileSystem fs;

	@Nullable
	private final String host;

	@Nullable
	private final Http http;

	@Nullable
	private final Ingest ingest;

	private final List<String> ip;

	@Nullable
	private final Jvm jvm;

	@Nullable
	private final String name;

	@Nullable
	private final OperatingSystem os;

	@Nullable
	private final Process process;

	private final List<NodeRole> roles;

	@Nullable
	private final Scripting script;

	private final Map<String, List<ScriptCache>> scriptCache;

	private final Map<String, ThreadCount> threadPool;

	@Nullable
	private final Long timestamp;

	@Nullable
	private final Transport transport;

	@Nullable
	private final String transportAddress;

	private final Map<String, String> attributes;

	@Nullable
	private final Discovery discovery;

	@Nullable
	private final IndexingPressure indexingPressure;

	@Nullable
	private final ShardStats indices;

	// ---------------------------------------------------------------------------------------------

	private Stats(Builder builder) {

		this.adaptiveSelection = ApiTypeHelper.unmodifiable(builder.adaptiveSelection);
		this.breakers = ApiTypeHelper.unmodifiable(builder.breakers);
		this.fs = builder.fs;
		this.host = builder.host;
		this.http = builder.http;
		this.ingest = builder.ingest;
		this.ip = ApiTypeHelper.unmodifiable(builder.ip);
		this.jvm = builder.jvm;
		this.name = builder.name;
		this.os = builder.os;
		this.process = builder.process;
		this.roles = ApiTypeHelper.unmodifiable(builder.roles);
		this.script = builder.script;
		this.scriptCache = ApiTypeHelper.unmodifiable(builder.scriptCache);
		this.threadPool = ApiTypeHelper.unmodifiable(builder.threadPool);
		this.timestamp = builder.timestamp;
		this.transport = builder.transport;
		this.transportAddress = builder.transportAddress;
		this.attributes = ApiTypeHelper.unmodifiable(builder.attributes);
		this.discovery = builder.discovery;
		this.indexingPressure = builder.indexingPressure;
		this.indices = builder.indices;

	}

	public static Stats of(Function<Builder, ObjectBuilder<Stats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Statistics about adaptive replica selection.
	 * <p>
	 * API name: {@code adaptive_selection}
	 */
	public final Map<String, AdaptiveSelection> adaptiveSelection() {
		return this.adaptiveSelection;
	}

	/**
	 * Statistics about the field data circuit breaker.
	 * <p>
	 * API name: {@code breakers}
	 */
	public final Map<String, Breaker> breakers() {
		return this.breakers;
	}

	/**
	 * File system information, data path, free disk space, read/write stats.
	 * <p>
	 * API name: {@code fs}
	 */
	@Nullable
	public final FileSystem fs() {
		return this.fs;
	}

	/**
	 * Network host for the node, based on the network host setting.
	 * <p>
	 * API name: {@code host}
	 */
	@Nullable
	public final String host() {
		return this.host;
	}

	/**
	 * HTTP connection information.
	 * <p>
	 * API name: {@code http}
	 */
	@Nullable
	public final Http http() {
		return this.http;
	}

	/**
	 * Statistics about ingest preprocessing.
	 * <p>
	 * API name: {@code ingest}
	 */
	@Nullable
	public final Ingest ingest() {
		return this.ingest;
	}

	/**
	 * IP address and port for the node.
	 * <p>
	 * API name: {@code ip}
	 */
	public final List<String> ip() {
		return this.ip;
	}

	/**
	 * JVM stats, memory pool information, garbage collection, buffer pools, number
	 * of loaded/unloaded classes.
	 * <p>
	 * API name: {@code jvm}
	 */
	@Nullable
	public final Jvm jvm() {
		return this.jvm;
	}

	/**
	 * Human-readable identifier for the node. Based on the node name setting.
	 * <p>
	 * API name: {@code name}
	 */
	@Nullable
	public final String name() {
		return this.name;
	}

	/**
	 * Operating system stats, load average, mem, swap.
	 * <p>
	 * API name: {@code os}
	 */
	@Nullable
	public final OperatingSystem os() {
		return this.os;
	}

	/**
	 * Process statistics, memory consumption, cpu usage, open file descriptors.
	 * <p>
	 * API name: {@code process}
	 */
	@Nullable
	public final Process process() {
		return this.process;
	}

	/**
	 * Roles assigned to the node.
	 * <p>
	 * API name: {@code roles}
	 */
	public final List<NodeRole> roles() {
		return this.roles;
	}

	/**
	 * Contains script statistics for the node.
	 * <p>
	 * API name: {@code script}
	 */
	@Nullable
	public final Scripting script() {
		return this.script;
	}

	/**
	 * API name: {@code script_cache}
	 */
	public final Map<String, List<ScriptCache>> scriptCache() {
		return this.scriptCache;
	}

	/**
	 * Statistics about each thread pool, including current size, queue and rejected
	 * tasks.
	 * <p>
	 * API name: {@code thread_pool}
	 */
	public final Map<String, ThreadCount> threadPool() {
		return this.threadPool;
	}

	/**
	 * API name: {@code timestamp}
	 */
	@Nullable
	public final Long timestamp() {
		return this.timestamp;
	}

	/**
	 * Transport statistics about sent and received bytes in cluster communication.
	 * <p>
	 * API name: {@code transport}
	 */
	@Nullable
	public final Transport transport() {
		return this.transport;
	}

	/**
	 * Host and port for the transport layer, used for internal communication
	 * between nodes in a cluster.
	 * <p>
	 * API name: {@code transport_address}
	 */
	@Nullable
	public final String transportAddress() {
		return this.transportAddress;
	}

	/**
	 * Contains a list of attributes for the node.
	 * <p>
	 * API name: {@code attributes}
	 */
	public final Map<String, String> attributes() {
		return this.attributes;
	}

	/**
	 * Contains node discovery statistics for the node.
	 * <p>
	 * API name: {@code discovery}
	 */
	@Nullable
	public final Discovery discovery() {
		return this.discovery;
	}

	/**
	 * Contains indexing pressure statistics for the node.
	 * <p>
	 * API name: {@code indexing_pressure}
	 */
	@Nullable
	public final IndexingPressure indexingPressure() {
		return this.indexingPressure;
	}

	/**
	 * Indices stats about size, document count, indexing and deletion times, search
	 * times, field cache size, merges and flushes.
	 * <p>
	 * API name: {@code indices}
	 */
	@Nullable
	public final ShardStats indices() {
		return this.indices;
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

		if (ApiTypeHelper.isDefined(this.adaptiveSelection)) {
			generator.writeKey("adaptive_selection");
			generator.writeStartObject();
			for (Map.Entry<String, AdaptiveSelection> item0 : this.adaptiveSelection.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.breakers)) {
			generator.writeKey("breakers");
			generator.writeStartObject();
			for (Map.Entry<String, Breaker> item0 : this.breakers.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.fs != null) {
			generator.writeKey("fs");
			this.fs.serialize(generator, mapper);

		}
		if (this.host != null) {
			generator.writeKey("host");
			generator.write(this.host);

		}
		if (this.http != null) {
			generator.writeKey("http");
			this.http.serialize(generator, mapper);

		}
		if (this.ingest != null) {
			generator.writeKey("ingest");
			this.ingest.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.ip)) {
			generator.writeKey("ip");
			generator.writeStartArray();
			for (String item0 : this.ip) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.jvm != null) {
			generator.writeKey("jvm");
			this.jvm.serialize(generator, mapper);

		}
		if (this.name != null) {
			generator.writeKey("name");
			generator.write(this.name);

		}
		if (this.os != null) {
			generator.writeKey("os");
			this.os.serialize(generator, mapper);

		}
		if (this.process != null) {
			generator.writeKey("process");
			this.process.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.roles)) {
			generator.writeKey("roles");
			generator.writeStartArray();
			for (NodeRole item0 : this.roles) {
				item0.serialize(generator, mapper);
			}
			generator.writeEnd();

		}
		if (this.script != null) {
			generator.writeKey("script");
			this.script.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.scriptCache)) {
			generator.writeKey("script_cache");
			generator.writeStartObject();
			for (Map.Entry<String, List<ScriptCache>> item0 : this.scriptCache.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.writeStartArray();
				if (item0.getValue() != null) {
					for (ScriptCache item1 : item0.getValue()) {
						item1.serialize(generator, mapper);

					}
				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.threadPool)) {
			generator.writeKey("thread_pool");
			generator.writeStartObject();
			for (Map.Entry<String, ThreadCount> item0 : this.threadPool.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.timestamp != null) {
			generator.writeKey("timestamp");
			generator.write(this.timestamp);

		}
		if (this.transport != null) {
			generator.writeKey("transport");
			this.transport.serialize(generator, mapper);

		}
		if (this.transportAddress != null) {
			generator.writeKey("transport_address");
			generator.write(this.transportAddress);

		}
		if (ApiTypeHelper.isDefined(this.attributes)) {
			generator.writeKey("attributes");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.attributes.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (this.discovery != null) {
			generator.writeKey("discovery");
			this.discovery.serialize(generator, mapper);

		}
		if (this.indexingPressure != null) {
			generator.writeKey("indexing_pressure");
			this.indexingPressure.serialize(generator, mapper);

		}
		if (this.indices != null) {
			generator.writeKey("indices");
			this.indices.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Stats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Stats> {
		@Nullable
		private Map<String, AdaptiveSelection> adaptiveSelection;

		@Nullable
		private Map<String, Breaker> breakers;

		@Nullable
		private FileSystem fs;

		@Nullable
		private String host;

		@Nullable
		private Http http;

		@Nullable
		private Ingest ingest;

		@Nullable
		private List<String> ip;

		@Nullable
		private Jvm jvm;

		@Nullable
		private String name;

		@Nullable
		private OperatingSystem os;

		@Nullable
		private Process process;

		@Nullable
		private List<NodeRole> roles;

		@Nullable
		private Scripting script;

		@Nullable
		private Map<String, List<ScriptCache>> scriptCache;

		@Nullable
		private Map<String, ThreadCount> threadPool;

		@Nullable
		private Long timestamp;

		@Nullable
		private Transport transport;

		@Nullable
		private String transportAddress;

		@Nullable
		private Map<String, String> attributes;

		@Nullable
		private Discovery discovery;

		@Nullable
		private IndexingPressure indexingPressure;

		@Nullable
		private ShardStats indices;

		/**
		 * Statistics about adaptive replica selection.
		 * <p>
		 * API name: {@code adaptive_selection}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>adaptiveSelection</code>.
		 */
		public final Builder adaptiveSelection(Map<String, AdaptiveSelection> map) {
			this.adaptiveSelection = _mapPutAll(this.adaptiveSelection, map);
			return this;
		}

		/**
		 * Statistics about adaptive replica selection.
		 * <p>
		 * API name: {@code adaptive_selection}
		 * <p>
		 * Adds an entry to <code>adaptiveSelection</code>.
		 */
		public final Builder adaptiveSelection(String key, AdaptiveSelection value) {
			this.adaptiveSelection = _mapPut(this.adaptiveSelection, key, value);
			return this;
		}

		/**
		 * Statistics about adaptive replica selection.
		 * <p>
		 * API name: {@code adaptive_selection}
		 * <p>
		 * Adds an entry to <code>adaptiveSelection</code> using a builder lambda.
		 */
		public final Builder adaptiveSelection(String key,
				Function<AdaptiveSelection.Builder, ObjectBuilder<AdaptiveSelection>> fn) {
			return adaptiveSelection(key, fn.apply(new AdaptiveSelection.Builder()).build());
		}

		/**
		 * Statistics about the field data circuit breaker.
		 * <p>
		 * API name: {@code breakers}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>breakers</code>.
		 */
		public final Builder breakers(Map<String, Breaker> map) {
			this.breakers = _mapPutAll(this.breakers, map);
			return this;
		}

		/**
		 * Statistics about the field data circuit breaker.
		 * <p>
		 * API name: {@code breakers}
		 * <p>
		 * Adds an entry to <code>breakers</code>.
		 */
		public final Builder breakers(String key, Breaker value) {
			this.breakers = _mapPut(this.breakers, key, value);
			return this;
		}

		/**
		 * Statistics about the field data circuit breaker.
		 * <p>
		 * API name: {@code breakers}
		 * <p>
		 * Adds an entry to <code>breakers</code> using a builder lambda.
		 */
		public final Builder breakers(String key, Function<Breaker.Builder, ObjectBuilder<Breaker>> fn) {
			return breakers(key, fn.apply(new Breaker.Builder()).build());
		}

		/**
		 * File system information, data path, free disk space, read/write stats.
		 * <p>
		 * API name: {@code fs}
		 */
		public final Builder fs(@Nullable FileSystem value) {
			this.fs = value;
			return this;
		}

		/**
		 * File system information, data path, free disk space, read/write stats.
		 * <p>
		 * API name: {@code fs}
		 */
		public final Builder fs(Function<FileSystem.Builder, ObjectBuilder<FileSystem>> fn) {
			return this.fs(fn.apply(new FileSystem.Builder()).build());
		}

		/**
		 * Network host for the node, based on the network host setting.
		 * <p>
		 * API name: {@code host}
		 */
		public final Builder host(@Nullable String value) {
			this.host = value;
			return this;
		}

		/**
		 * HTTP connection information.
		 * <p>
		 * API name: {@code http}
		 */
		public final Builder http(@Nullable Http value) {
			this.http = value;
			return this;
		}

		/**
		 * HTTP connection information.
		 * <p>
		 * API name: {@code http}
		 */
		public final Builder http(Function<Http.Builder, ObjectBuilder<Http>> fn) {
			return this.http(fn.apply(new Http.Builder()).build());
		}

		/**
		 * Statistics about ingest preprocessing.
		 * <p>
		 * API name: {@code ingest}
		 */
		public final Builder ingest(@Nullable Ingest value) {
			this.ingest = value;
			return this;
		}

		/**
		 * Statistics about ingest preprocessing.
		 * <p>
		 * API name: {@code ingest}
		 */
		public final Builder ingest(Function<Ingest.Builder, ObjectBuilder<Ingest>> fn) {
			return this.ingest(fn.apply(new Ingest.Builder()).build());
		}

		/**
		 * IP address and port for the node.
		 * <p>
		 * API name: {@code ip}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>ip</code>.
		 */
		public final Builder ip(List<String> list) {
			this.ip = _listAddAll(this.ip, list);
			return this;
		}

		/**
		 * IP address and port for the node.
		 * <p>
		 * API name: {@code ip}
		 * <p>
		 * Adds one or more values to <code>ip</code>.
		 */
		public final Builder ip(String value, String... values) {
			this.ip = _listAdd(this.ip, value, values);
			return this;
		}

		/**
		 * JVM stats, memory pool information, garbage collection, buffer pools, number
		 * of loaded/unloaded classes.
		 * <p>
		 * API name: {@code jvm}
		 */
		public final Builder jvm(@Nullable Jvm value) {
			this.jvm = value;
			return this;
		}

		/**
		 * JVM stats, memory pool information, garbage collection, buffer pools, number
		 * of loaded/unloaded classes.
		 * <p>
		 * API name: {@code jvm}
		 */
		public final Builder jvm(Function<Jvm.Builder, ObjectBuilder<Jvm>> fn) {
			return this.jvm(fn.apply(new Jvm.Builder()).build());
		}

		/**
		 * Human-readable identifier for the node. Based on the node name setting.
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(@Nullable String value) {
			this.name = value;
			return this;
		}

		/**
		 * Operating system stats, load average, mem, swap.
		 * <p>
		 * API name: {@code os}
		 */
		public final Builder os(@Nullable OperatingSystem value) {
			this.os = value;
			return this;
		}

		/**
		 * Operating system stats, load average, mem, swap.
		 * <p>
		 * API name: {@code os}
		 */
		public final Builder os(Function<OperatingSystem.Builder, ObjectBuilder<OperatingSystem>> fn) {
			return this.os(fn.apply(new OperatingSystem.Builder()).build());
		}

		/**
		 * Process statistics, memory consumption, cpu usage, open file descriptors.
		 * <p>
		 * API name: {@code process}
		 */
		public final Builder process(@Nullable Process value) {
			this.process = value;
			return this;
		}

		/**
		 * Process statistics, memory consumption, cpu usage, open file descriptors.
		 * <p>
		 * API name: {@code process}
		 */
		public final Builder process(Function<Process.Builder, ObjectBuilder<Process>> fn) {
			return this.process(fn.apply(new Process.Builder()).build());
		}

		/**
		 * Roles assigned to the node.
		 * <p>
		 * API name: {@code roles}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>roles</code>.
		 */
		public final Builder roles(List<NodeRole> list) {
			this.roles = _listAddAll(this.roles, list);
			return this;
		}

		/**
		 * Roles assigned to the node.
		 * <p>
		 * API name: {@code roles}
		 * <p>
		 * Adds one or more values to <code>roles</code>.
		 */
		public final Builder roles(NodeRole value, NodeRole... values) {
			this.roles = _listAdd(this.roles, value, values);
			return this;
		}

		/**
		 * Contains script statistics for the node.
		 * <p>
		 * API name: {@code script}
		 */
		public final Builder script(@Nullable Scripting value) {
			this.script = value;
			return this;
		}

		/**
		 * Contains script statistics for the node.
		 * <p>
		 * API name: {@code script}
		 */
		public final Builder script(Function<Scripting.Builder, ObjectBuilder<Scripting>> fn) {
			return this.script(fn.apply(new Scripting.Builder()).build());
		}

		/**
		 * API name: {@code script_cache}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>scriptCache</code>.
		 */
		public final Builder scriptCache(Map<String, List<ScriptCache>> map) {
			this.scriptCache = _mapPutAll(this.scriptCache, map);
			return this;
		}

		/**
		 * API name: {@code script_cache}
		 * <p>
		 * Adds an entry to <code>scriptCache</code>.
		 */
		public final Builder scriptCache(String key, List<ScriptCache> value) {
			this.scriptCache = _mapPut(this.scriptCache, key, value);
			return this;
		}

		/**
		 * Statistics about each thread pool, including current size, queue and rejected
		 * tasks.
		 * <p>
		 * API name: {@code thread_pool}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>threadPool</code>.
		 */
		public final Builder threadPool(Map<String, ThreadCount> map) {
			this.threadPool = _mapPutAll(this.threadPool, map);
			return this;
		}

		/**
		 * Statistics about each thread pool, including current size, queue and rejected
		 * tasks.
		 * <p>
		 * API name: {@code thread_pool}
		 * <p>
		 * Adds an entry to <code>threadPool</code>.
		 */
		public final Builder threadPool(String key, ThreadCount value) {
			this.threadPool = _mapPut(this.threadPool, key, value);
			return this;
		}

		/**
		 * Statistics about each thread pool, including current size, queue and rejected
		 * tasks.
		 * <p>
		 * API name: {@code thread_pool}
		 * <p>
		 * Adds an entry to <code>threadPool</code> using a builder lambda.
		 */
		public final Builder threadPool(String key, Function<ThreadCount.Builder, ObjectBuilder<ThreadCount>> fn) {
			return threadPool(key, fn.apply(new ThreadCount.Builder()).build());
		}

		/**
		 * API name: {@code timestamp}
		 */
		public final Builder timestamp(@Nullable Long value) {
			this.timestamp = value;
			return this;
		}

		/**
		 * Transport statistics about sent and received bytes in cluster communication.
		 * <p>
		 * API name: {@code transport}
		 */
		public final Builder transport(@Nullable Transport value) {
			this.transport = value;
			return this;
		}

		/**
		 * Transport statistics about sent and received bytes in cluster communication.
		 * <p>
		 * API name: {@code transport}
		 */
		public final Builder transport(Function<Transport.Builder, ObjectBuilder<Transport>> fn) {
			return this.transport(fn.apply(new Transport.Builder()).build());
		}

		/**
		 * Host and port for the transport layer, used for internal communication
		 * between nodes in a cluster.
		 * <p>
		 * API name: {@code transport_address}
		 */
		public final Builder transportAddress(@Nullable String value) {
			this.transportAddress = value;
			return this;
		}

		/**
		 * Contains a list of attributes for the node.
		 * <p>
		 * API name: {@code attributes}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>attributes</code>.
		 */
		public final Builder attributes(Map<String, String> map) {
			this.attributes = _mapPutAll(this.attributes, map);
			return this;
		}

		/**
		 * Contains a list of attributes for the node.
		 * <p>
		 * API name: {@code attributes}
		 * <p>
		 * Adds an entry to <code>attributes</code>.
		 */
		public final Builder attributes(String key, String value) {
			this.attributes = _mapPut(this.attributes, key, value);
			return this;
		}

		/**
		 * Contains node discovery statistics for the node.
		 * <p>
		 * API name: {@code discovery}
		 */
		public final Builder discovery(@Nullable Discovery value) {
			this.discovery = value;
			return this;
		}

		/**
		 * Contains node discovery statistics for the node.
		 * <p>
		 * API name: {@code discovery}
		 */
		public final Builder discovery(Function<Discovery.Builder, ObjectBuilder<Discovery>> fn) {
			return this.discovery(fn.apply(new Discovery.Builder()).build());
		}

		/**
		 * Contains indexing pressure statistics for the node.
		 * <p>
		 * API name: {@code indexing_pressure}
		 */
		public final Builder indexingPressure(@Nullable IndexingPressure value) {
			this.indexingPressure = value;
			return this;
		}

		/**
		 * Contains indexing pressure statistics for the node.
		 * <p>
		 * API name: {@code indexing_pressure}
		 */
		public final Builder indexingPressure(Function<IndexingPressure.Builder, ObjectBuilder<IndexingPressure>> fn) {
			return this.indexingPressure(fn.apply(new IndexingPressure.Builder()).build());
		}

		/**
		 * Indices stats about size, document count, indexing and deletion times, search
		 * times, field cache size, merges and flushes.
		 * <p>
		 * API name: {@code indices}
		 */
		public final Builder indices(@Nullable ShardStats value) {
			this.indices = value;
			return this;
		}

		/**
		 * Indices stats about size, document count, indexing and deletion times, search
		 * times, field cache size, merges and flushes.
		 * <p>
		 * API name: {@code indices}
		 */
		public final Builder indices(Function<ShardStats.Builder, ObjectBuilder<ShardStats>> fn) {
			return this.indices(fn.apply(new ShardStats.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Stats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Stats build() {
			_checkSingleUse();

			return new Stats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Stats}
	 */
	public static final JsonpDeserializer<Stats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Stats::setupStatsDeserializer);

	protected static void setupStatsDeserializer(ObjectDeserializer<Stats.Builder> op) {

		op.add(Builder::adaptiveSelection, JsonpDeserializer.stringMapDeserializer(AdaptiveSelection._DESERIALIZER),
				"adaptive_selection");
		op.add(Builder::breakers, JsonpDeserializer.stringMapDeserializer(Breaker._DESERIALIZER), "breakers");
		op.add(Builder::fs, FileSystem._DESERIALIZER, "fs");
		op.add(Builder::host, JsonpDeserializer.stringDeserializer(), "host");
		op.add(Builder::http, Http._DESERIALIZER, "http");
		op.add(Builder::ingest, Ingest._DESERIALIZER, "ingest");
		op.add(Builder::ip, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "ip");
		op.add(Builder::jvm, Jvm._DESERIALIZER, "jvm");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::os, OperatingSystem._DESERIALIZER, "os");
		op.add(Builder::process, Process._DESERIALIZER, "process");
		op.add(Builder::roles, JsonpDeserializer.arrayDeserializer(NodeRole._DESERIALIZER), "roles");
		op.add(Builder::script, Scripting._DESERIALIZER, "script");
		op.add(Builder::scriptCache,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.arrayDeserializer(ScriptCache._DESERIALIZER)),
				"script_cache");
		op.add(Builder::threadPool, JsonpDeserializer.stringMapDeserializer(ThreadCount._DESERIALIZER), "thread_pool");
		op.add(Builder::timestamp, JsonpDeserializer.longDeserializer(), "timestamp");
		op.add(Builder::transport, Transport._DESERIALIZER, "transport");
		op.add(Builder::transportAddress, JsonpDeserializer.stringDeserializer(), "transport_address");
		op.add(Builder::attributes, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"attributes");
		op.add(Builder::discovery, Discovery._DESERIALIZER, "discovery");
		op.add(Builder::indexingPressure, IndexingPressure._DESERIALIZER, "indexing_pressure");
		op.add(Builder::indices, ShardStats._DESERIALIZER, "indices");

	}

}
