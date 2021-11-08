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
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes._types.Jvm
@JsonpDeserializable
public class Jvm implements JsonpSerializable {
	private final Map<String, NodeBufferPool> bufferPools;

	private final JvmClasses classes;

	private final GarbageCollector gc;

	private final MemoryStats mem;

	private final JvmThreads threads;

	private final long timestamp;

	private final String uptime;

	private final long uptimeInMillis;

	// ---------------------------------------------------------------------------------------------

	private Jvm(Builder builder) {

		this.bufferPools = ModelTypeHelper.unmodifiableRequired(builder.bufferPools, this, "bufferPools");
		this.classes = ModelTypeHelper.requireNonNull(builder.classes, this, "classes");
		this.gc = ModelTypeHelper.requireNonNull(builder.gc, this, "gc");
		this.mem = ModelTypeHelper.requireNonNull(builder.mem, this, "mem");
		this.threads = ModelTypeHelper.requireNonNull(builder.threads, this, "threads");
		this.timestamp = ModelTypeHelper.requireNonNull(builder.timestamp, this, "timestamp");
		this.uptime = ModelTypeHelper.requireNonNull(builder.uptime, this, "uptime");
		this.uptimeInMillis = ModelTypeHelper.requireNonNull(builder.uptimeInMillis, this, "uptimeInMillis");

	}

	public static Jvm of(Function<Builder, ObjectBuilder<Jvm>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code buffer_pools}
	 */
	public final Map<String, NodeBufferPool> bufferPools() {
		return this.bufferPools;
	}

	/**
	 * Required - API name: {@code classes}
	 */
	public final JvmClasses classes() {
		return this.classes;
	}

	/**
	 * Required - API name: {@code gc}
	 */
	public final GarbageCollector gc() {
		return this.gc;
	}

	/**
	 * Required - API name: {@code mem}
	 */
	public final MemoryStats mem() {
		return this.mem;
	}

	/**
	 * Required - API name: {@code threads}
	 */
	public final JvmThreads threads() {
		return this.threads;
	}

	/**
	 * Required - API name: {@code timestamp}
	 */
	public final long timestamp() {
		return this.timestamp;
	}

	/**
	 * Required - API name: {@code uptime}
	 */
	public final String uptime() {
		return this.uptime;
	}

	/**
	 * Required - API name: {@code uptime_in_millis}
	 */
	public final long uptimeInMillis() {
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

		if (ModelTypeHelper.isDefined(this.bufferPools)) {
			generator.writeKey("buffer_pools");
			generator.writeStartObject();
			for (Map.Entry<String, NodeBufferPool> item0 : this.bufferPools.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("classes");
		this.classes.serialize(generator, mapper);

		generator.writeKey("gc");
		this.gc.serialize(generator, mapper);

		generator.writeKey("mem");
		this.mem.serialize(generator, mapper);

		generator.writeKey("threads");
		this.threads.serialize(generator, mapper);

		generator.writeKey("timestamp");
		generator.write(this.timestamp);

		generator.writeKey("uptime");
		generator.write(this.uptime);

		generator.writeKey("uptime_in_millis");
		generator.write(this.uptimeInMillis);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Jvm}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Jvm> {
		private Map<String, NodeBufferPool> bufferPools;

		private JvmClasses classes;

		private GarbageCollector gc;

		private MemoryStats mem;

		private JvmThreads threads;

		private Long timestamp;

		private String uptime;

		private Long uptimeInMillis;

		/**
		 * Required - API name: {@code buffer_pools}
		 */
		public final Builder bufferPools(Map<String, NodeBufferPool> value) {
			this.bufferPools = value;
			return this;
		}

		/**
		 * Set {@link #bufferPools(Map)} to a singleton map.
		 */
		public Builder bufferPools(String key, Function<NodeBufferPool.Builder, ObjectBuilder<NodeBufferPool>> fn) {
			return this.bufferPools(Collections.singletonMap(key, fn.apply(new NodeBufferPool.Builder()).build()));
		}

		public final Builder bufferPools(
				Function<MapBuilder<String, NodeBufferPool, NodeBufferPool.Builder>, ObjectBuilder<Map<String, NodeBufferPool>>> fn) {
			return bufferPools(fn.apply(new MapBuilder<>(NodeBufferPool.Builder::new)).build());
		}

		/**
		 * Required - API name: {@code classes}
		 */
		public final Builder classes(JvmClasses value) {
			this.classes = value;
			return this;
		}

		/**
		 * Required - API name: {@code classes}
		 */
		public final Builder classes(Function<JvmClasses.Builder, ObjectBuilder<JvmClasses>> fn) {
			return this.classes(fn.apply(new JvmClasses.Builder()).build());
		}

		/**
		 * Required - API name: {@code gc}
		 */
		public final Builder gc(GarbageCollector value) {
			this.gc = value;
			return this;
		}

		/**
		 * Required - API name: {@code gc}
		 */
		public final Builder gc(Function<GarbageCollector.Builder, ObjectBuilder<GarbageCollector>> fn) {
			return this.gc(fn.apply(new GarbageCollector.Builder()).build());
		}

		/**
		 * Required - API name: {@code mem}
		 */
		public final Builder mem(MemoryStats value) {
			this.mem = value;
			return this;
		}

		/**
		 * Required - API name: {@code mem}
		 */
		public final Builder mem(Function<MemoryStats.Builder, ObjectBuilder<MemoryStats>> fn) {
			return this.mem(fn.apply(new MemoryStats.Builder()).build());
		}

		/**
		 * Required - API name: {@code threads}
		 */
		public final Builder threads(JvmThreads value) {
			this.threads = value;
			return this;
		}

		/**
		 * Required - API name: {@code threads}
		 */
		public final Builder threads(Function<JvmThreads.Builder, ObjectBuilder<JvmThreads>> fn) {
			return this.threads(fn.apply(new JvmThreads.Builder()).build());
		}

		/**
		 * Required - API name: {@code timestamp}
		 */
		public final Builder timestamp(long value) {
			this.timestamp = value;
			return this;
		}

		/**
		 * Required - API name: {@code uptime}
		 */
		public final Builder uptime(String value) {
			this.uptime = value;
			return this;
		}

		/**
		 * Required - API name: {@code uptime_in_millis}
		 */
		public final Builder uptimeInMillis(long value) {
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
			_checkSingleUse();

			return new Jvm(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Jvm}
	 */
	public static final JsonpDeserializer<Jvm> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Jvm::setupJvmDeserializer, Builder::build);

	protected static void setupJvmDeserializer(DelegatingDeserializer<Jvm.Builder> op) {

		op.add(Builder::bufferPools, JsonpDeserializer.stringMapDeserializer(NodeBufferPool._DESERIALIZER),
				"buffer_pools");
		op.add(Builder::classes, JvmClasses._DESERIALIZER, "classes");
		op.add(Builder::gc, GarbageCollector._DESERIALIZER, "gc");
		op.add(Builder::mem, MemoryStats._DESERIALIZER, "mem");
		op.add(Builder::threads, JvmThreads._DESERIALIZER, "threads");
		op.add(Builder::timestamp, JsonpDeserializer.longDeserializer(), "timestamp");
		op.add(Builder::uptime, JsonpDeserializer.stringDeserializer(), "uptime");
		op.add(Builder::uptimeInMillis, JsonpDeserializer.longDeserializer(), "uptime_in_millis");

	}

}
