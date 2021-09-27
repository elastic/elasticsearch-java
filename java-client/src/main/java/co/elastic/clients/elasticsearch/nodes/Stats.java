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

import co.elastic.clients.elasticsearch._types.NodeRole;
import co.elastic.clients.elasticsearch.indices.stats.IndexStats;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
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

// typedef: nodes._types.Stats
@JsonpDeserializable
public final class Stats implements JsonpSerializable {
	private final Map<String, AdaptiveSelection> adaptiveSelection;

	private final Map<String, Breaker> breakers;

	private final FileSystem fs;

	private final String host;

	private final Http http;

	private final IndexStats indices;

	private final Ingest ingest;

	private final List<String> ip;

	private final Jvm jvm;

	private final String name;

	private final OperatingSystem os;

	private final Process process;

	private final List<NodeRole> roles;

	private final Scripting script;

	private final Map<String, ThreadCount> threadPool;

	private final long timestamp;

	private final Transport transport;

	private final String transportAddress;

	private final Map<String, String> attributes;

	// ---------------------------------------------------------------------------------------------

	public Stats(Builder builder) {

		this.adaptiveSelection = Objects.requireNonNull(builder.adaptiveSelection, "adaptive_selection");
		this.breakers = Objects.requireNonNull(builder.breakers, "breakers");
		this.fs = Objects.requireNonNull(builder.fs, "fs");
		this.host = Objects.requireNonNull(builder.host, "host");
		this.http = Objects.requireNonNull(builder.http, "http");
		this.indices = Objects.requireNonNull(builder.indices, "indices");
		this.ingest = Objects.requireNonNull(builder.ingest, "ingest");
		this.ip = Objects.requireNonNull(builder.ip, "ip");
		this.jvm = Objects.requireNonNull(builder.jvm, "jvm");
		this.name = Objects.requireNonNull(builder.name, "name");
		this.os = Objects.requireNonNull(builder.os, "os");
		this.process = Objects.requireNonNull(builder.process, "process");
		this.roles = Objects.requireNonNull(builder.roles, "roles");
		this.script = Objects.requireNonNull(builder.script, "script");
		this.threadPool = Objects.requireNonNull(builder.threadPool, "thread_pool");
		this.timestamp = Objects.requireNonNull(builder.timestamp, "timestamp");
		this.transport = Objects.requireNonNull(builder.transport, "transport");
		this.transportAddress = Objects.requireNonNull(builder.transportAddress, "transport_address");
		this.attributes = Objects.requireNonNull(builder.attributes, "attributes");

	}

	/**
	 * API name: {@code adaptive_selection}
	 */
	public Map<String, AdaptiveSelection> adaptiveSelection() {
		return this.adaptiveSelection;
	}

	/**
	 * API name: {@code breakers}
	 */
	public Map<String, Breaker> breakers() {
		return this.breakers;
	}

	/**
	 * API name: {@code fs}
	 */
	public FileSystem fs() {
		return this.fs;
	}

	/**
	 * API name: {@code host}
	 */
	public String host() {
		return this.host;
	}

	/**
	 * API name: {@code http}
	 */
	public Http http() {
		return this.http;
	}

	/**
	 * API name: {@code indices}
	 */
	public IndexStats indices() {
		return this.indices;
	}

	/**
	 * API name: {@code ingest}
	 */
	public Ingest ingest() {
		return this.ingest;
	}

	/**
	 * API name: {@code ip}
	 */
	public List<String> ip() {
		return this.ip;
	}

	/**
	 * API name: {@code jvm}
	 */
	public Jvm jvm() {
		return this.jvm;
	}

	/**
	 * API name: {@code name}
	 */
	public String name() {
		return this.name;
	}

	/**
	 * API name: {@code os}
	 */
	public OperatingSystem os() {
		return this.os;
	}

	/**
	 * API name: {@code process}
	 */
	public Process process() {
		return this.process;
	}

	/**
	 * API name: {@code roles}
	 */
	public List<NodeRole> roles() {
		return this.roles;
	}

	/**
	 * API name: {@code script}
	 */
	public Scripting script() {
		return this.script;
	}

	/**
	 * API name: {@code thread_pool}
	 */
	public Map<String, ThreadCount> threadPool() {
		return this.threadPool;
	}

	/**
	 * API name: {@code timestamp}
	 */
	public long timestamp() {
		return this.timestamp;
	}

	/**
	 * API name: {@code transport}
	 */
	public Transport transport() {
		return this.transport;
	}

	/**
	 * API name: {@code transport_address}
	 */
	public String transportAddress() {
		return this.transportAddress;
	}

	/**
	 * API name: {@code attributes}
	 */
	public Map<String, String> attributes() {
		return this.attributes;
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

		generator.writeKey("adaptive_selection");
		generator.writeStartObject();
		for (Map.Entry<String, AdaptiveSelection> item0 : this.adaptiveSelection.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("breakers");
		generator.writeStartObject();
		for (Map.Entry<String, Breaker> item0 : this.breakers.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("fs");
		this.fs.serialize(generator, mapper);

		generator.writeKey("host");
		generator.write(this.host);

		generator.writeKey("http");
		this.http.serialize(generator, mapper);

		generator.writeKey("indices");
		this.indices.serialize(generator, mapper);

		generator.writeKey("ingest");
		this.ingest.serialize(generator, mapper);

		generator.writeKey("ip");
		generator.writeStartArray();
		for (String item0 : this.ip) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("jvm");
		this.jvm.serialize(generator, mapper);

		generator.writeKey("name");
		generator.write(this.name);

		generator.writeKey("os");
		this.os.serialize(generator, mapper);

		generator.writeKey("process");
		this.process.serialize(generator, mapper);

		generator.writeKey("roles");
		generator.writeStartArray();
		for (NodeRole item0 : this.roles) {
			item0.serialize(generator, mapper);
		}
		generator.writeEnd();

		generator.writeKey("script");
		this.script.serialize(generator, mapper);

		generator.writeKey("thread_pool");
		generator.writeStartObject();
		for (Map.Entry<String, ThreadCount> item0 : this.threadPool.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("timestamp");
		generator.write(this.timestamp);

		generator.writeKey("transport");
		this.transport.serialize(generator, mapper);

		generator.writeKey("transport_address");
		generator.write(this.transportAddress);

		generator.writeKey("attributes");
		generator.writeStartObject();
		for (Map.Entry<String, String> item0 : this.attributes.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.write(item0.getValue());

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Stats}.
	 */
	public static class Builder implements ObjectBuilder<Stats> {
		private Map<String, AdaptiveSelection> adaptiveSelection;

		private Map<String, Breaker> breakers;

		private FileSystem fs;

		private String host;

		private Http http;

		private IndexStats indices;

		private Ingest ingest;

		private List<String> ip;

		private Jvm jvm;

		private String name;

		private OperatingSystem os;

		private Process process;

		private List<NodeRole> roles;

		private Scripting script;

		private Map<String, ThreadCount> threadPool;

		private Long timestamp;

		private Transport transport;

		private String transportAddress;

		private Map<String, String> attributes;

		/**
		 * API name: {@code adaptive_selection}
		 */
		public Builder adaptiveSelection(Map<String, AdaptiveSelection> value) {
			this.adaptiveSelection = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #adaptiveSelection(Map)}, creating the map if
		 * needed.
		 */
		public Builder putAdaptiveSelection(String key, AdaptiveSelection value) {
			if (this.adaptiveSelection == null) {
				this.adaptiveSelection = new HashMap<>();
			}
			this.adaptiveSelection.put(key, value);
			return this;
		}

		/**
		 * Set {@link #adaptiveSelection(Map)} to a singleton map.
		 */
		public Builder adaptiveSelection(String key,
				Function<AdaptiveSelection.Builder, ObjectBuilder<AdaptiveSelection>> fn) {
			return this.adaptiveSelection(
					Collections.singletonMap(key, fn.apply(new AdaptiveSelection.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #adaptiveSelection(Map)}, creating the map if
		 * needed.
		 */
		public Builder putAdaptiveSelection(String key,
				Function<AdaptiveSelection.Builder, ObjectBuilder<AdaptiveSelection>> fn) {
			return this.putAdaptiveSelection(key, fn.apply(new AdaptiveSelection.Builder()).build());
		}

		/**
		 * API name: {@code breakers}
		 */
		public Builder breakers(Map<String, Breaker> value) {
			this.breakers = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #breakers(Map)}, creating the map if needed.
		 */
		public Builder putBreakers(String key, Breaker value) {
			if (this.breakers == null) {
				this.breakers = new HashMap<>();
			}
			this.breakers.put(key, value);
			return this;
		}

		/**
		 * Set {@link #breakers(Map)} to a singleton map.
		 */
		public Builder breakers(String key, Function<Breaker.Builder, ObjectBuilder<Breaker>> fn) {
			return this.breakers(Collections.singletonMap(key, fn.apply(new Breaker.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #breakers(Map)}, creating the map if needed.
		 */
		public Builder putBreakers(String key, Function<Breaker.Builder, ObjectBuilder<Breaker>> fn) {
			return this.putBreakers(key, fn.apply(new Breaker.Builder()).build());
		}

		/**
		 * API name: {@code fs}
		 */
		public Builder fs(FileSystem value) {
			this.fs = value;
			return this;
		}

		/**
		 * API name: {@code fs}
		 */
		public Builder fs(Function<FileSystem.Builder, ObjectBuilder<FileSystem>> fn) {
			return this.fs(fn.apply(new FileSystem.Builder()).build());
		}

		/**
		 * API name: {@code host}
		 */
		public Builder host(String value) {
			this.host = value;
			return this;
		}

		/**
		 * API name: {@code http}
		 */
		public Builder http(Http value) {
			this.http = value;
			return this;
		}

		/**
		 * API name: {@code http}
		 */
		public Builder http(Function<Http.Builder, ObjectBuilder<Http>> fn) {
			return this.http(fn.apply(new Http.Builder()).build());
		}

		/**
		 * API name: {@code indices}
		 */
		public Builder indices(IndexStats value) {
			this.indices = value;
			return this;
		}

		/**
		 * API name: {@code indices}
		 */
		public Builder indices(Function<IndexStats.Builder, ObjectBuilder<IndexStats>> fn) {
			return this.indices(fn.apply(new IndexStats.Builder()).build());
		}

		/**
		 * API name: {@code ingest}
		 */
		public Builder ingest(Ingest value) {
			this.ingest = value;
			return this;
		}

		/**
		 * API name: {@code ingest}
		 */
		public Builder ingest(Function<Ingest.Builder, ObjectBuilder<Ingest>> fn) {
			return this.ingest(fn.apply(new Ingest.Builder()).build());
		}

		/**
		 * API name: {@code ip}
		 */
		public Builder ip(List<String> value) {
			this.ip = value;
			return this;
		}

		/**
		 * API name: {@code ip}
		 */
		public Builder ip(String... value) {
			this.ip = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #ip(List)}, creating the list if needed.
		 */
		public Builder addIp(String value) {
			if (this.ip == null) {
				this.ip = new ArrayList<>();
			}
			this.ip.add(value);
			return this;
		}

		/**
		 * API name: {@code jvm}
		 */
		public Builder jvm(Jvm value) {
			this.jvm = value;
			return this;
		}

		/**
		 * API name: {@code jvm}
		 */
		public Builder jvm(Function<Jvm.Builder, ObjectBuilder<Jvm>> fn) {
			return this.jvm(fn.apply(new Jvm.Builder()).build());
		}

		/**
		 * API name: {@code name}
		 */
		public Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code os}
		 */
		public Builder os(OperatingSystem value) {
			this.os = value;
			return this;
		}

		/**
		 * API name: {@code os}
		 */
		public Builder os(Function<OperatingSystem.Builder, ObjectBuilder<OperatingSystem>> fn) {
			return this.os(fn.apply(new OperatingSystem.Builder()).build());
		}

		/**
		 * API name: {@code process}
		 */
		public Builder process(Process value) {
			this.process = value;
			return this;
		}

		/**
		 * API name: {@code process}
		 */
		public Builder process(Function<Process.Builder, ObjectBuilder<Process>> fn) {
			return this.process(fn.apply(new Process.Builder()).build());
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
		 * API name: {@code script}
		 */
		public Builder script(Scripting value) {
			this.script = value;
			return this;
		}

		/**
		 * API name: {@code script}
		 */
		public Builder script(Function<Scripting.Builder, ObjectBuilder<Scripting>> fn) {
			return this.script(fn.apply(new Scripting.Builder()).build());
		}

		/**
		 * API name: {@code thread_pool}
		 */
		public Builder threadPool(Map<String, ThreadCount> value) {
			this.threadPool = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #threadPool(Map)}, creating the map if needed.
		 */
		public Builder putThreadPool(String key, ThreadCount value) {
			if (this.threadPool == null) {
				this.threadPool = new HashMap<>();
			}
			this.threadPool.put(key, value);
			return this;
		}

		/**
		 * Set {@link #threadPool(Map)} to a singleton map.
		 */
		public Builder threadPool(String key, Function<ThreadCount.Builder, ObjectBuilder<ThreadCount>> fn) {
			return this.threadPool(Collections.singletonMap(key, fn.apply(new ThreadCount.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #threadPool(Map)}, creating the map if needed.
		 */
		public Builder putThreadPool(String key, Function<ThreadCount.Builder, ObjectBuilder<ThreadCount>> fn) {
			return this.putThreadPool(key, fn.apply(new ThreadCount.Builder()).build());
		}

		/**
		 * API name: {@code timestamp}
		 */
		public Builder timestamp(long value) {
			this.timestamp = value;
			return this;
		}

		/**
		 * API name: {@code transport}
		 */
		public Builder transport(Transport value) {
			this.transport = value;
			return this;
		}

		/**
		 * API name: {@code transport}
		 */
		public Builder transport(Function<Transport.Builder, ObjectBuilder<Transport>> fn) {
			return this.transport(fn.apply(new Transport.Builder()).build());
		}

		/**
		 * API name: {@code transport_address}
		 */
		public Builder transportAddress(String value) {
			this.transportAddress = value;
			return this;
		}

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
		 * Builds a {@link Stats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Stats build() {

			return new Stats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Stats}
	 */
	public static final JsonpDeserializer<Stats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Stats::setupStatsDeserializer, Builder::build);

	protected static void setupStatsDeserializer(DelegatingDeserializer<Stats.Builder> op) {

		op.add(Builder::adaptiveSelection, JsonpDeserializer.stringMapDeserializer(AdaptiveSelection._DESERIALIZER),
				"adaptive_selection");
		op.add(Builder::breakers, JsonpDeserializer.stringMapDeserializer(Breaker._DESERIALIZER), "breakers");
		op.add(Builder::fs, FileSystem._DESERIALIZER, "fs");
		op.add(Builder::host, JsonpDeserializer.stringDeserializer(), "host");
		op.add(Builder::http, Http._DESERIALIZER, "http");
		op.add(Builder::indices, IndexStats._DESERIALIZER, "indices");
		op.add(Builder::ingest, Ingest._DESERIALIZER, "ingest");
		op.add(Builder::ip, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "ip");
		op.add(Builder::jvm, Jvm._DESERIALIZER, "jvm");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::os, OperatingSystem._DESERIALIZER, "os");
		op.add(Builder::process, Process._DESERIALIZER, "process");
		op.add(Builder::roles, JsonpDeserializer.arrayDeserializer(NodeRole._DESERIALIZER), "roles");
		op.add(Builder::script, Scripting._DESERIALIZER, "script");
		op.add(Builder::threadPool, JsonpDeserializer.stringMapDeserializer(ThreadCount._DESERIALIZER), "thread_pool");
		op.add(Builder::timestamp, JsonpDeserializer.longDeserializer(), "timestamp");
		op.add(Builder::transport, Transport._DESERIALIZER, "transport");
		op.add(Builder::transportAddress, JsonpDeserializer.stringDeserializer(), "transport_address");
		op.add(Builder::attributes, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"attributes");

	}

}
