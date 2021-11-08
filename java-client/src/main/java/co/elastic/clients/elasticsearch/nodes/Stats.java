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
import co.elastic.clients.util.MapBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes._types.Stats
@JsonpDeserializable
public class Stats implements JsonpSerializable {
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

	private Stats(Builder builder) {

		this.adaptiveSelection = ModelTypeHelper.unmodifiableRequired(builder.adaptiveSelection, this,
				"adaptiveSelection");
		this.breakers = ModelTypeHelper.unmodifiableRequired(builder.breakers, this, "breakers");
		this.fs = ModelTypeHelper.requireNonNull(builder.fs, this, "fs");
		this.host = ModelTypeHelper.requireNonNull(builder.host, this, "host");
		this.http = ModelTypeHelper.requireNonNull(builder.http, this, "http");
		this.indices = ModelTypeHelper.requireNonNull(builder.indices, this, "indices");
		this.ingest = ModelTypeHelper.requireNonNull(builder.ingest, this, "ingest");
		this.ip = ModelTypeHelper.unmodifiableRequired(builder.ip, this, "ip");
		this.jvm = ModelTypeHelper.requireNonNull(builder.jvm, this, "jvm");
		this.name = ModelTypeHelper.requireNonNull(builder.name, this, "name");
		this.os = ModelTypeHelper.requireNonNull(builder.os, this, "os");
		this.process = ModelTypeHelper.requireNonNull(builder.process, this, "process");
		this.roles = ModelTypeHelper.unmodifiableRequired(builder.roles, this, "roles");
		this.script = ModelTypeHelper.requireNonNull(builder.script, this, "script");
		this.threadPool = ModelTypeHelper.unmodifiableRequired(builder.threadPool, this, "threadPool");
		this.timestamp = ModelTypeHelper.requireNonNull(builder.timestamp, this, "timestamp");
		this.transport = ModelTypeHelper.requireNonNull(builder.transport, this, "transport");
		this.transportAddress = ModelTypeHelper.requireNonNull(builder.transportAddress, this, "transportAddress");
		this.attributes = ModelTypeHelper.unmodifiableRequired(builder.attributes, this, "attributes");

	}

	public static Stats of(Function<Builder, ObjectBuilder<Stats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code adaptive_selection}
	 */
	public final Map<String, AdaptiveSelection> adaptiveSelection() {
		return this.adaptiveSelection;
	}

	/**
	 * Required - API name: {@code breakers}
	 */
	public final Map<String, Breaker> breakers() {
		return this.breakers;
	}

	/**
	 * Required - API name: {@code fs}
	 */
	public final FileSystem fs() {
		return this.fs;
	}

	/**
	 * Required - API name: {@code host}
	 */
	public final String host() {
		return this.host;
	}

	/**
	 * Required - API name: {@code http}
	 */
	public final Http http() {
		return this.http;
	}

	/**
	 * Required - API name: {@code indices}
	 */
	public final IndexStats indices() {
		return this.indices;
	}

	/**
	 * Required - API name: {@code ingest}
	 */
	public final Ingest ingest() {
		return this.ingest;
	}

	/**
	 * Required - API name: {@code ip}
	 */
	public final List<String> ip() {
		return this.ip;
	}

	/**
	 * Required - API name: {@code jvm}
	 */
	public final Jvm jvm() {
		return this.jvm;
	}

	/**
	 * Required - API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Required - API name: {@code os}
	 */
	public final OperatingSystem os() {
		return this.os;
	}

	/**
	 * Required - API name: {@code process}
	 */
	public final Process process() {
		return this.process;
	}

	/**
	 * Required - API name: {@code roles}
	 */
	public final List<NodeRole> roles() {
		return this.roles;
	}

	/**
	 * Required - API name: {@code script}
	 */
	public final Scripting script() {
		return this.script;
	}

	/**
	 * Required - API name: {@code thread_pool}
	 */
	public final Map<String, ThreadCount> threadPool() {
		return this.threadPool;
	}

	/**
	 * Required - API name: {@code timestamp}
	 */
	public final long timestamp() {
		return this.timestamp;
	}

	/**
	 * Required - API name: {@code transport}
	 */
	public final Transport transport() {
		return this.transport;
	}

	/**
	 * Required - API name: {@code transport_address}
	 */
	public final String transportAddress() {
		return this.transportAddress;
	}

	/**
	 * Required - API name: {@code attributes}
	 */
	public final Map<String, String> attributes() {
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

		if (ModelTypeHelper.isDefined(this.adaptiveSelection)) {
			generator.writeKey("adaptive_selection");
			generator.writeStartObject();
			for (Map.Entry<String, AdaptiveSelection> item0 : this.adaptiveSelection.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.breakers)) {
			generator.writeKey("breakers");
			generator.writeStartObject();
			for (Map.Entry<String, Breaker> item0 : this.breakers.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
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

		if (ModelTypeHelper.isDefined(this.ip)) {
			generator.writeKey("ip");
			generator.writeStartArray();
			for (String item0 : this.ip) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		generator.writeKey("jvm");
		this.jvm.serialize(generator, mapper);

		generator.writeKey("name");
		generator.write(this.name);

		generator.writeKey("os");
		this.os.serialize(generator, mapper);

		generator.writeKey("process");
		this.process.serialize(generator, mapper);

		if (ModelTypeHelper.isDefined(this.roles)) {
			generator.writeKey("roles");
			generator.writeStartArray();
			for (NodeRole item0 : this.roles) {
				item0.serialize(generator, mapper);
			}
			generator.writeEnd();

		}
		generator.writeKey("script");
		this.script.serialize(generator, mapper);

		if (ModelTypeHelper.isDefined(this.threadPool)) {
			generator.writeKey("thread_pool");
			generator.writeStartObject();
			for (Map.Entry<String, ThreadCount> item0 : this.threadPool.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("timestamp");
		generator.write(this.timestamp);

		generator.writeKey("transport");
		this.transport.serialize(generator, mapper);

		generator.writeKey("transport_address");
		generator.write(this.transportAddress);

		if (ModelTypeHelper.isDefined(this.attributes)) {
			generator.writeKey("attributes");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.attributes.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Stats}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Stats> {
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
		 * Required - API name: {@code adaptive_selection}
		 */
		public final Builder adaptiveSelection(Map<String, AdaptiveSelection> value) {
			this.adaptiveSelection = value;
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

		public final Builder adaptiveSelection(
				Function<MapBuilder<String, AdaptiveSelection, AdaptiveSelection.Builder>, ObjectBuilder<Map<String, AdaptiveSelection>>> fn) {
			return adaptiveSelection(fn.apply(new MapBuilder<>(AdaptiveSelection.Builder::new)).build());
		}

		/**
		 * Required - API name: {@code breakers}
		 */
		public final Builder breakers(Map<String, Breaker> value) {
			this.breakers = value;
			return this;
		}

		/**
		 * Set {@link #breakers(Map)} to a singleton map.
		 */
		public Builder breakers(String key, Function<Breaker.Builder, ObjectBuilder<Breaker>> fn) {
			return this.breakers(Collections.singletonMap(key, fn.apply(new Breaker.Builder()).build()));
		}

		public final Builder breakers(
				Function<MapBuilder<String, Breaker, Breaker.Builder>, ObjectBuilder<Map<String, Breaker>>> fn) {
			return breakers(fn.apply(new MapBuilder<>(Breaker.Builder::new)).build());
		}

		/**
		 * Required - API name: {@code fs}
		 */
		public final Builder fs(FileSystem value) {
			this.fs = value;
			return this;
		}

		/**
		 * Required - API name: {@code fs}
		 */
		public final Builder fs(Function<FileSystem.Builder, ObjectBuilder<FileSystem>> fn) {
			return this.fs(fn.apply(new FileSystem.Builder()).build());
		}

		/**
		 * Required - API name: {@code host}
		 */
		public final Builder host(String value) {
			this.host = value;
			return this;
		}

		/**
		 * Required - API name: {@code http}
		 */
		public final Builder http(Http value) {
			this.http = value;
			return this;
		}

		/**
		 * Required - API name: {@code http}
		 */
		public final Builder http(Function<Http.Builder, ObjectBuilder<Http>> fn) {
			return this.http(fn.apply(new Http.Builder()).build());
		}

		/**
		 * Required - API name: {@code indices}
		 */
		public final Builder indices(IndexStats value) {
			this.indices = value;
			return this;
		}

		/**
		 * Required - API name: {@code indices}
		 */
		public final Builder indices(Function<IndexStats.Builder, ObjectBuilder<IndexStats>> fn) {
			return this.indices(fn.apply(new IndexStats.Builder()).build());
		}

		/**
		 * Required - API name: {@code ingest}
		 */
		public final Builder ingest(Ingest value) {
			this.ingest = value;
			return this;
		}

		/**
		 * Required - API name: {@code ingest}
		 */
		public final Builder ingest(Function<Ingest.Builder, ObjectBuilder<Ingest>> fn) {
			return this.ingest(fn.apply(new Ingest.Builder()).build());
		}

		/**
		 * Required - API name: {@code ip}
		 */
		public final Builder ip(List<String> value) {
			this.ip = value;
			return this;
		}

		/**
		 * Required - API name: {@code ip}
		 */
		public final Builder ip(String... value) {
			this.ip = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code jvm}
		 */
		public final Builder jvm(Jvm value) {
			this.jvm = value;
			return this;
		}

		/**
		 * Required - API name: {@code jvm}
		 */
		public final Builder jvm(Function<Jvm.Builder, ObjectBuilder<Jvm>> fn) {
			return this.jvm(fn.apply(new Jvm.Builder()).build());
		}

		/**
		 * Required - API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - API name: {@code os}
		 */
		public final Builder os(OperatingSystem value) {
			this.os = value;
			return this;
		}

		/**
		 * Required - API name: {@code os}
		 */
		public final Builder os(Function<OperatingSystem.Builder, ObjectBuilder<OperatingSystem>> fn) {
			return this.os(fn.apply(new OperatingSystem.Builder()).build());
		}

		/**
		 * Required - API name: {@code process}
		 */
		public final Builder process(Process value) {
			this.process = value;
			return this;
		}

		/**
		 * Required - API name: {@code process}
		 */
		public final Builder process(Function<Process.Builder, ObjectBuilder<Process>> fn) {
			return this.process(fn.apply(new Process.Builder()).build());
		}

		/**
		 * Required - API name: {@code roles}
		 */
		public final Builder roles(List<NodeRole> value) {
			this.roles = value;
			return this;
		}

		/**
		 * Required - API name: {@code roles}
		 */
		public final Builder roles(NodeRole... value) {
			this.roles = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code script}
		 */
		public final Builder script(Scripting value) {
			this.script = value;
			return this;
		}

		/**
		 * Required - API name: {@code script}
		 */
		public final Builder script(Function<Scripting.Builder, ObjectBuilder<Scripting>> fn) {
			return this.script(fn.apply(new Scripting.Builder()).build());
		}

		/**
		 * Required - API name: {@code thread_pool}
		 */
		public final Builder threadPool(Map<String, ThreadCount> value) {
			this.threadPool = value;
			return this;
		}

		/**
		 * Set {@link #threadPool(Map)} to a singleton map.
		 */
		public Builder threadPool(String key, Function<ThreadCount.Builder, ObjectBuilder<ThreadCount>> fn) {
			return this.threadPool(Collections.singletonMap(key, fn.apply(new ThreadCount.Builder()).build()));
		}

		public final Builder threadPool(
				Function<MapBuilder<String, ThreadCount, ThreadCount.Builder>, ObjectBuilder<Map<String, ThreadCount>>> fn) {
			return threadPool(fn.apply(new MapBuilder<>(ThreadCount.Builder::new)).build());
		}

		/**
		 * Required - API name: {@code timestamp}
		 */
		public final Builder timestamp(long value) {
			this.timestamp = value;
			return this;
		}

		/**
		 * Required - API name: {@code transport}
		 */
		public final Builder transport(Transport value) {
			this.transport = value;
			return this;
		}

		/**
		 * Required - API name: {@code transport}
		 */
		public final Builder transport(Function<Transport.Builder, ObjectBuilder<Transport>> fn) {
			return this.transport(fn.apply(new Transport.Builder()).build());
		}

		/**
		 * Required - API name: {@code transport_address}
		 */
		public final Builder transportAddress(String value) {
			this.transportAddress = value;
			return this;
		}

		/**
		 * Required - API name: {@code attributes}
		 */
		public final Builder attributes(Map<String, String> value) {
			this.attributes = value;
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
