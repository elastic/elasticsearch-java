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
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes._types.Jvm

/**
 *
 * @see <a href="../doc-files/api-spec.html#nodes._types.Jvm">API
 *      specification</a>
 */
@JsonpDeserializable
public class Jvm implements JsonpSerializable {
	private final Map<String, NodeBufferPool> bufferPools;

	@Nullable
	private final JvmClasses classes;

	@Nullable
	private final GarbageCollector gc;

	@Nullable
	private final JvmMemoryStats mem;

	@Nullable
	private final JvmThreads threads;

	@Nullable
	private final Long timestamp;

	@Nullable
	private final String uptime;

	@Nullable
	private final Long uptimeInMillis;

	// ---------------------------------------------------------------------------------------------

	private Jvm(Builder builder) {

		this.bufferPools = ApiTypeHelper.unmodifiable(builder.bufferPools);
		this.classes = builder.classes;
		this.gc = builder.gc;
		this.mem = builder.mem;
		this.threads = builder.threads;
		this.timestamp = builder.timestamp;
		this.uptime = builder.uptime;
		this.uptimeInMillis = builder.uptimeInMillis;

	}

	public static Jvm of(Function<Builder, ObjectBuilder<Jvm>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code buffer_pools}
	 */
	public final Map<String, NodeBufferPool> bufferPools() {
		return this.bufferPools;
	}

	/**
	 * API name: {@code classes}
	 */
	@Nullable
	public final JvmClasses classes() {
		return this.classes;
	}

	/**
	 * API name: {@code gc}
	 */
	@Nullable
	public final GarbageCollector gc() {
		return this.gc;
	}

	/**
	 * API name: {@code mem}
	 */
	@Nullable
	public final JvmMemoryStats mem() {
		return this.mem;
	}

	/**
	 * API name: {@code threads}
	 */
	@Nullable
	public final JvmThreads threads() {
		return this.threads;
	}

	/**
	 * API name: {@code timestamp}
	 */
	@Nullable
	public final Long timestamp() {
		return this.timestamp;
	}

	/**
	 * API name: {@code uptime}
	 */
	@Nullable
	public final String uptime() {
		return this.uptime;
	}

	/**
	 * API name: {@code uptime_in_millis}
	 */
	@Nullable
	public final Long uptimeInMillis() {
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

		if (ApiTypeHelper.isDefined(this.bufferPools)) {
			generator.writeKey("buffer_pools");
			generator.writeStartObject();
			for (Map.Entry<String, NodeBufferPool> item0 : this.bufferPools.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.classes != null) {
			generator.writeKey("classes");
			this.classes.serialize(generator, mapper);

		}
		if (this.gc != null) {
			generator.writeKey("gc");
			this.gc.serialize(generator, mapper);

		}
		if (this.mem != null) {
			generator.writeKey("mem");
			this.mem.serialize(generator, mapper);

		}
		if (this.threads != null) {
			generator.writeKey("threads");
			this.threads.serialize(generator, mapper);

		}
		if (this.timestamp != null) {
			generator.writeKey("timestamp");
			generator.write(this.timestamp);

		}
		if (this.uptime != null) {
			generator.writeKey("uptime");
			generator.write(this.uptime);

		}
		if (this.uptimeInMillis != null) {
			generator.writeKey("uptime_in_millis");
			generator.write(this.uptimeInMillis);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Jvm}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Jvm> {
		@Nullable
		private Map<String, NodeBufferPool> bufferPools;

		@Nullable
		private JvmClasses classes;

		@Nullable
		private GarbageCollector gc;

		@Nullable
		private JvmMemoryStats mem;

		@Nullable
		private JvmThreads threads;

		@Nullable
		private Long timestamp;

		@Nullable
		private String uptime;

		@Nullable
		private Long uptimeInMillis;

		/**
		 * API name: {@code buffer_pools}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>bufferPools</code>.
		 */
		public final Builder bufferPools(Map<String, NodeBufferPool> map) {
			this.bufferPools = _mapPutAll(this.bufferPools, map);
			return this;
		}

		/**
		 * API name: {@code buffer_pools}
		 * <p>
		 * Adds an entry to <code>bufferPools</code>.
		 */
		public final Builder bufferPools(String key, NodeBufferPool value) {
			this.bufferPools = _mapPut(this.bufferPools, key, value);
			return this;
		}

		/**
		 * API name: {@code buffer_pools}
		 * <p>
		 * Adds an entry to <code>bufferPools</code> using a builder lambda.
		 */
		public final Builder bufferPools(String key,
				Function<NodeBufferPool.Builder, ObjectBuilder<NodeBufferPool>> fn) {
			return bufferPools(key, fn.apply(new NodeBufferPool.Builder()).build());
		}

		/**
		 * API name: {@code classes}
		 */
		public final Builder classes(@Nullable JvmClasses value) {
			this.classes = value;
			return this;
		}

		/**
		 * API name: {@code classes}
		 */
		public final Builder classes(Function<JvmClasses.Builder, ObjectBuilder<JvmClasses>> fn) {
			return this.classes(fn.apply(new JvmClasses.Builder()).build());
		}

		/**
		 * API name: {@code gc}
		 */
		public final Builder gc(@Nullable GarbageCollector value) {
			this.gc = value;
			return this;
		}

		/**
		 * API name: {@code gc}
		 */
		public final Builder gc(Function<GarbageCollector.Builder, ObjectBuilder<GarbageCollector>> fn) {
			return this.gc(fn.apply(new GarbageCollector.Builder()).build());
		}

		/**
		 * API name: {@code mem}
		 */
		public final Builder mem(@Nullable JvmMemoryStats value) {
			this.mem = value;
			return this;
		}

		/**
		 * API name: {@code mem}
		 */
		public final Builder mem(Function<JvmMemoryStats.Builder, ObjectBuilder<JvmMemoryStats>> fn) {
			return this.mem(fn.apply(new JvmMemoryStats.Builder()).build());
		}

		/**
		 * API name: {@code threads}
		 */
		public final Builder threads(@Nullable JvmThreads value) {
			this.threads = value;
			return this;
		}

		/**
		 * API name: {@code threads}
		 */
		public final Builder threads(Function<JvmThreads.Builder, ObjectBuilder<JvmThreads>> fn) {
			return this.threads(fn.apply(new JvmThreads.Builder()).build());
		}

		/**
		 * API name: {@code timestamp}
		 */
		public final Builder timestamp(@Nullable Long value) {
			this.timestamp = value;
			return this;
		}

		/**
		 * API name: {@code uptime}
		 */
		public final Builder uptime(@Nullable String value) {
			this.uptime = value;
			return this;
		}

		/**
		 * API name: {@code uptime_in_millis}
		 */
		public final Builder uptimeInMillis(@Nullable Long value) {
			this.uptimeInMillis = value;
			return this;
		}

		@Override
		protected Builder self() {
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
			Jvm::setupJvmDeserializer);

	protected static void setupJvmDeserializer(ObjectDeserializer<Jvm.Builder> op) {

		op.add(Builder::bufferPools, JsonpDeserializer.stringMapDeserializer(NodeBufferPool._DESERIALIZER),
				"buffer_pools");
		op.add(Builder::classes, JvmClasses._DESERIALIZER, "classes");
		op.add(Builder::gc, GarbageCollector._DESERIALIZER, "gc");
		op.add(Builder::mem, JvmMemoryStats._DESERIALIZER, "mem");
		op.add(Builder::threads, JvmThreads._DESERIALIZER, "threads");
		op.add(Builder::timestamp, JsonpDeserializer.longDeserializer(), "timestamp");
		op.add(Builder::uptime, JsonpDeserializer.stringDeserializer(), "uptime");
		op.add(Builder::uptimeInMillis, JsonpDeserializer.longDeserializer(), "uptime_in_millis");

	}

}
