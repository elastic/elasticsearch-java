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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes._types.Jvm
public final class Jvm implements JsonpSerializable {
	private final Map<String, NodeBufferPool> bufferPools;

	private final JvmClasses classes;

	private final GarbageCollector gc;

	private final MemoryStats mem;

	private final JvmThreads threads;

	private final Number timestamp;

	private final String uptime;

	private final Number uptimeInMillis;

	// ---------------------------------------------------------------------------------------------

	public Jvm(Builder builder) {

		this.bufferPools = Objects.requireNonNull(builder.bufferPools, "buffer_pools");
		this.classes = Objects.requireNonNull(builder.classes, "classes");
		this.gc = Objects.requireNonNull(builder.gc, "gc");
		this.mem = Objects.requireNonNull(builder.mem, "mem");
		this.threads = Objects.requireNonNull(builder.threads, "threads");
		this.timestamp = Objects.requireNonNull(builder.timestamp, "timestamp");
		this.uptime = Objects.requireNonNull(builder.uptime, "uptime");
		this.uptimeInMillis = Objects.requireNonNull(builder.uptimeInMillis, "uptime_in_millis");

	}

	/**
	 * API name: {@code buffer_pools}
	 */
	public Map<String, NodeBufferPool> bufferPools() {
		return this.bufferPools;
	}

	/**
	 * API name: {@code classes}
	 */
	public JvmClasses classes() {
		return this.classes;
	}

	/**
	 * API name: {@code gc}
	 */
	public GarbageCollector gc() {
		return this.gc;
	}

	/**
	 * API name: {@code mem}
	 */
	public MemoryStats mem() {
		return this.mem;
	}

	/**
	 * API name: {@code threads}
	 */
	public JvmThreads threads() {
		return this.threads;
	}

	/**
	 * API name: {@code timestamp}
	 */
	public Number timestamp() {
		return this.timestamp;
	}

	/**
	 * API name: {@code uptime}
	 */
	public String uptime() {
		return this.uptime;
	}

	/**
	 * API name: {@code uptime_in_millis}
	 */
	public Number uptimeInMillis() {
		return this.uptimeInMillis;
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

		generator.writeKey("buffer_pools");
		generator.writeStartObject();
		for (Map.Entry<String, NodeBufferPool> item0 : this.bufferPools.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("classes");
		this.classes.serialize(generator, mapper);

		generator.writeKey("gc");
		this.gc.serialize(generator, mapper);

		generator.writeKey("mem");
		this.mem.serialize(generator, mapper);

		generator.writeKey("threads");
		this.threads.serialize(generator, mapper);

		generator.writeKey("timestamp");
		generator.write(this.timestamp.doubleValue());

		generator.writeKey("uptime");
		generator.write(this.uptime);

		generator.writeKey("uptime_in_millis");
		generator.write(this.uptimeInMillis.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Jvm}.
	 */
	public static class Builder implements ObjectBuilder<Jvm> {
		private Map<String, NodeBufferPool> bufferPools;

		private JvmClasses classes;

		private GarbageCollector gc;

		private MemoryStats mem;

		private JvmThreads threads;

		private Number timestamp;

		private String uptime;

		private Number uptimeInMillis;

		/**
		 * API name: {@code buffer_pools}
		 */
		public Builder bufferPools(Map<String, NodeBufferPool> value) {
			this.bufferPools = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #bufferPools(Map)}, creating the map if needed.
		 */
		public Builder putBufferPools(String key, NodeBufferPool value) {
			if (this.bufferPools == null) {
				this.bufferPools = new HashMap<>();
			}
			this.bufferPools.put(key, value);
			return this;
		}

		/**
		 * Set {@link #bufferPools(Map)} to a singleton map.
		 */
		public Builder bufferPools(String key, Function<NodeBufferPool.Builder, ObjectBuilder<NodeBufferPool>> fn) {
			return this.bufferPools(Collections.singletonMap(key, fn.apply(new NodeBufferPool.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #bufferPools(Map)}, creating the map if needed.
		 */
		public Builder putBufferPools(String key, Function<NodeBufferPool.Builder, ObjectBuilder<NodeBufferPool>> fn) {
			return this.putBufferPools(key, fn.apply(new NodeBufferPool.Builder()).build());
		}

		/**
		 * API name: {@code classes}
		 */
		public Builder classes(JvmClasses value) {
			this.classes = value;
			return this;
		}

		/**
		 * API name: {@code classes}
		 */
		public Builder classes(Function<JvmClasses.Builder, ObjectBuilder<JvmClasses>> fn) {
			return this.classes(fn.apply(new JvmClasses.Builder()).build());
		}

		/**
		 * API name: {@code gc}
		 */
		public Builder gc(GarbageCollector value) {
			this.gc = value;
			return this;
		}

		/**
		 * API name: {@code gc}
		 */
		public Builder gc(Function<GarbageCollector.Builder, ObjectBuilder<GarbageCollector>> fn) {
			return this.gc(fn.apply(new GarbageCollector.Builder()).build());
		}

		/**
		 * API name: {@code mem}
		 */
		public Builder mem(MemoryStats value) {
			this.mem = value;
			return this;
		}

		/**
		 * API name: {@code mem}
		 */
		public Builder mem(Function<MemoryStats.Builder, ObjectBuilder<MemoryStats>> fn) {
			return this.mem(fn.apply(new MemoryStats.Builder()).build());
		}

		/**
		 * API name: {@code threads}
		 */
		public Builder threads(JvmThreads value) {
			this.threads = value;
			return this;
		}

		/**
		 * API name: {@code threads}
		 */
		public Builder threads(Function<JvmThreads.Builder, ObjectBuilder<JvmThreads>> fn) {
			return this.threads(fn.apply(new JvmThreads.Builder()).build());
		}

		/**
		 * API name: {@code timestamp}
		 */
		public Builder timestamp(Number value) {
			this.timestamp = value;
			return this;
		}

		/**
		 * API name: {@code uptime}
		 */
		public Builder uptime(String value) {
			this.uptime = value;
			return this;
		}

		/**
		 * API name: {@code uptime_in_millis}
		 */
		public Builder uptimeInMillis(Number value) {
			this.uptimeInMillis = value;
			return this;
		}

		/**
		 * Builds a {@link Jvm}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Jvm build() {

			return new Jvm(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Jvm}
	 */
	public static final JsonpDeserializer<Jvm> DESERIALIZER = ObjectBuilderDeserializer.createForObject(Builder::new,
			Jvm::setupJvmDeserializer);

	protected static void setupJvmDeserializer(DelegatingDeserializer<Jvm.Builder> op) {

		op.add(Builder::bufferPools, JsonpDeserializer.stringMapDeserializer(NodeBufferPool.DESERIALIZER),
				"buffer_pools");
		op.add(Builder::classes, JvmClasses.DESERIALIZER, "classes");
		op.add(Builder::gc, GarbageCollector.DESERIALIZER, "gc");
		op.add(Builder::mem, MemoryStats.DESERIALIZER, "mem");
		op.add(Builder::threads, JvmThreads.DESERIALIZER, "threads");
		op.add(Builder::timestamp, JsonpDeserializer.numberDeserializer(), "timestamp");
		op.add(Builder::uptime, JsonpDeserializer.stringDeserializer(), "uptime");
		op.add(Builder::uptimeInMillis, JsonpDeserializer.numberDeserializer(), "uptime_in_millis");

	}

}
