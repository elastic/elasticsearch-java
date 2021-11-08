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
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes._types.OperatingSystem
@JsonpDeserializable
public class OperatingSystem implements JsonpSerializable {
	private final Cpu cpu;

	private final ExtendedMemoryStats mem;

	private final MemoryStats swap;

	private final long timestamp;

	// ---------------------------------------------------------------------------------------------

	private OperatingSystem(Builder builder) {

		this.cpu = ModelTypeHelper.requireNonNull(builder.cpu, this, "cpu");
		this.mem = ModelTypeHelper.requireNonNull(builder.mem, this, "mem");
		this.swap = ModelTypeHelper.requireNonNull(builder.swap, this, "swap");
		this.timestamp = ModelTypeHelper.requireNonNull(builder.timestamp, this, "timestamp");

	}

	public static OperatingSystem of(Function<Builder, ObjectBuilder<OperatingSystem>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code cpu}
	 */
	public final Cpu cpu() {
		return this.cpu;
	}

	/**
	 * Required - API name: {@code mem}
	 */
	public final ExtendedMemoryStats mem() {
		return this.mem;
	}

	/**
	 * Required - API name: {@code swap}
	 */
	public final MemoryStats swap() {
		return this.swap;
	}

	/**
	 * Required - API name: {@code timestamp}
	 */
	public final long timestamp() {
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

		generator.writeKey("cpu");
		this.cpu.serialize(generator, mapper);

		generator.writeKey("mem");
		this.mem.serialize(generator, mapper);

		generator.writeKey("swap");
		this.swap.serialize(generator, mapper);

		generator.writeKey("timestamp");
		generator.write(this.timestamp);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link OperatingSystem}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<OperatingSystem> {
		private Cpu cpu;

		private ExtendedMemoryStats mem;

		private MemoryStats swap;

		private Long timestamp;

		/**
		 * Required - API name: {@code cpu}
		 */
		public final Builder cpu(Cpu value) {
			this.cpu = value;
			return this;
		}

		/**
		 * Required - API name: {@code cpu}
		 */
		public final Builder cpu(Function<Cpu.Builder, ObjectBuilder<Cpu>> fn) {
			return this.cpu(fn.apply(new Cpu.Builder()).build());
		}

		/**
		 * Required - API name: {@code mem}
		 */
		public final Builder mem(ExtendedMemoryStats value) {
			this.mem = value;
			return this;
		}

		/**
		 * Required - API name: {@code mem}
		 */
		public final Builder mem(Function<ExtendedMemoryStats.Builder, ObjectBuilder<ExtendedMemoryStats>> fn) {
			return this.mem(fn.apply(new ExtendedMemoryStats.Builder()).build());
		}

		/**
		 * Required - API name: {@code swap}
		 */
		public final Builder swap(MemoryStats value) {
			this.swap = value;
			return this;
		}

		/**
		 * Required - API name: {@code swap}
		 */
		public final Builder swap(Function<MemoryStats.Builder, ObjectBuilder<MemoryStats>> fn) {
			return this.swap(fn.apply(new MemoryStats.Builder()).build());
		}

		/**
		 * Required - API name: {@code timestamp}
		 */
		public final Builder timestamp(long value) {
			this.timestamp = value;
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
			OperatingSystem::setupOperatingSystemDeserializer, Builder::build);

	protected static void setupOperatingSystemDeserializer(DelegatingDeserializer<OperatingSystem.Builder> op) {

		op.add(Builder::cpu, Cpu._DESERIALIZER, "cpu");
		op.add(Builder::mem, ExtendedMemoryStats._DESERIALIZER, "mem");
		op.add(Builder::swap, MemoryStats._DESERIALIZER, "swap");
		op.add(Builder::timestamp, JsonpDeserializer.longDeserializer(), "timestamp");

	}

}
