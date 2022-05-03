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
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes._types.OperatingSystem

/**
 *
 * @see <a href="../doc-files/api-spec.html#nodes._types.OperatingSystem">API
 *      specification</a>
 */
@JsonpDeserializable
public class OperatingSystem implements JsonpSerializable {
	@Nullable
	private final Cpu cpu;

	@Nullable
	private final ExtendedMemoryStats mem;

	@Nullable
	private final MemoryStats swap;

	@Nullable
	private final Cgroup cgroup;

	@Nullable
	private final Long timestamp;

	// ---------------------------------------------------------------------------------------------

	private OperatingSystem(Builder builder) {

		this.cpu = builder.cpu;
		this.mem = builder.mem;
		this.swap = builder.swap;
		this.cgroup = builder.cgroup;
		this.timestamp = builder.timestamp;

	}

	public static OperatingSystem of(Function<Builder, ObjectBuilder<OperatingSystem>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code cpu}
	 */
	@Nullable
	public final Cpu cpu() {
		return this.cpu;
	}

	/**
	 * API name: {@code mem}
	 */
	@Nullable
	public final ExtendedMemoryStats mem() {
		return this.mem;
	}

	/**
	 * API name: {@code swap}
	 */
	@Nullable
	public final MemoryStats swap() {
		return this.swap;
	}

	/**
	 * API name: {@code cgroup}
	 */
	@Nullable
	public final Cgroup cgroup() {
		return this.cgroup;
	}

	/**
	 * API name: {@code timestamp}
	 */
	@Nullable
	public final Long timestamp() {
		return this.timestamp;
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

		if (this.cpu != null) {
			generator.writeKey("cpu");
			this.cpu.serialize(generator, mapper);

		}
		if (this.mem != null) {
			generator.writeKey("mem");
			this.mem.serialize(generator, mapper);

		}
		if (this.swap != null) {
			generator.writeKey("swap");
			this.swap.serialize(generator, mapper);

		}
		if (this.cgroup != null) {
			generator.writeKey("cgroup");
			this.cgroup.serialize(generator, mapper);

		}
		if (this.timestamp != null) {
			generator.writeKey("timestamp");
			generator.write(this.timestamp);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link OperatingSystem}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<OperatingSystem> {
		@Nullable
		private Cpu cpu;

		@Nullable
		private ExtendedMemoryStats mem;

		@Nullable
		private MemoryStats swap;

		@Nullable
		private Cgroup cgroup;

		@Nullable
		private Long timestamp;

		/**
		 * API name: {@code cpu}
		 */
		public final Builder cpu(@Nullable Cpu value) {
			this.cpu = value;
			return this;
		}

		/**
		 * API name: {@code cpu}
		 */
		public final Builder cpu(Function<Cpu.Builder, ObjectBuilder<Cpu>> fn) {
			return this.cpu(fn.apply(new Cpu.Builder()).build());
		}

		/**
		 * API name: {@code mem}
		 */
		public final Builder mem(@Nullable ExtendedMemoryStats value) {
			this.mem = value;
			return this;
		}

		/**
		 * API name: {@code mem}
		 */
		public final Builder mem(Function<ExtendedMemoryStats.Builder, ObjectBuilder<ExtendedMemoryStats>> fn) {
			return this.mem(fn.apply(new ExtendedMemoryStats.Builder()).build());
		}

		/**
		 * API name: {@code swap}
		 */
		public final Builder swap(@Nullable MemoryStats value) {
			this.swap = value;
			return this;
		}

		/**
		 * API name: {@code swap}
		 */
		public final Builder swap(Function<MemoryStats.Builder, ObjectBuilder<MemoryStats>> fn) {
			return this.swap(fn.apply(new MemoryStats.Builder()).build());
		}

		/**
		 * API name: {@code cgroup}
		 */
		public final Builder cgroup(@Nullable Cgroup value) {
			this.cgroup = value;
			return this;
		}

		/**
		 * API name: {@code cgroup}
		 */
		public final Builder cgroup(Function<Cgroup.Builder, ObjectBuilder<Cgroup>> fn) {
			return this.cgroup(fn.apply(new Cgroup.Builder()).build());
		}

		/**
		 * API name: {@code timestamp}
		 */
		public final Builder timestamp(@Nullable Long value) {
			this.timestamp = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link OperatingSystem}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public OperatingSystem build() {
			_checkSingleUse();

			return new OperatingSystem(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link OperatingSystem}
	 */
	public static final JsonpDeserializer<OperatingSystem> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			OperatingSystem::setupOperatingSystemDeserializer);

	protected static void setupOperatingSystemDeserializer(ObjectDeserializer<OperatingSystem.Builder> op) {

		op.add(Builder::cpu, Cpu._DESERIALIZER, "cpu");
		op.add(Builder::mem, ExtendedMemoryStats._DESERIALIZER, "mem");
		op.add(Builder::swap, MemoryStats._DESERIALIZER, "swap");
		op.add(Builder::cgroup, Cgroup._DESERIALIZER, "cgroup");
		op.add(Builder::timestamp, JsonpDeserializer.longDeserializer(), "timestamp");

	}

}
