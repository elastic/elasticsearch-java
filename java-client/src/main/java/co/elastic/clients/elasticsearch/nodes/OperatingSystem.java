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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes._types.OperatingSystem
public final class OperatingSystem implements ToJsonp {
	private final Cpu cpu;

	private final ExtendedMemoryStats mem;

	private final MemoryStats swap;

	private final Number timestamp;

	// ---------------------------------------------------------------------------------------------

	protected OperatingSystem(Builder builder) {

		this.cpu = Objects.requireNonNull(builder.cpu, "cpu");
		this.mem = Objects.requireNonNull(builder.mem, "mem");
		this.swap = Objects.requireNonNull(builder.swap, "swap");
		this.timestamp = Objects.requireNonNull(builder.timestamp, "timestamp");

	}

	/**
	 * API name: {@code cpu}
	 */
	public Cpu cpu() {
		return this.cpu;
	}

	/**
	 * API name: {@code mem}
	 */
	public ExtendedMemoryStats mem() {
		return this.mem;
	}

	/**
	 * API name: {@code swap}
	 */
	public MemoryStats swap() {
		return this.swap;
	}

	/**
	 * API name: {@code timestamp}
	 */
	public Number timestamp() {
		return this.timestamp;
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

		generator.writeKey("cpu");
		this.cpu.toJsonp(generator, mapper);

		generator.writeKey("mem");
		this.mem.toJsonp(generator, mapper);

		generator.writeKey("swap");
		this.swap.toJsonp(generator, mapper);

		generator.writeKey("timestamp");
		generator.write(this.timestamp.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link OperatingSystem}.
	 */
	public static class Builder implements ObjectBuilder<OperatingSystem> {
		private Cpu cpu;

		private ExtendedMemoryStats mem;

		private MemoryStats swap;

		private Number timestamp;

		/**
		 * API name: {@code cpu}
		 */
		public Builder cpu(Cpu value) {
			this.cpu = value;
			return this;
		}

		/**
		 * API name: {@code cpu}
		 */
		public Builder cpu(Function<Cpu.Builder, ObjectBuilder<Cpu>> fn) {
			return this.cpu(fn.apply(new Cpu.Builder()).build());
		}

		/**
		 * API name: {@code mem}
		 */
		public Builder mem(ExtendedMemoryStats value) {
			this.mem = value;
			return this;
		}

		/**
		 * API name: {@code mem}
		 */
		public Builder mem(Function<ExtendedMemoryStats.Builder, ObjectBuilder<ExtendedMemoryStats>> fn) {
			return this.mem(fn.apply(new ExtendedMemoryStats.Builder()).build());
		}

		/**
		 * API name: {@code swap}
		 */
		public Builder swap(MemoryStats value) {
			this.swap = value;
			return this;
		}

		/**
		 * API name: {@code swap}
		 */
		public Builder swap(Function<MemoryStats.Builder, ObjectBuilder<MemoryStats>> fn) {
			return this.swap(fn.apply(new MemoryStats.Builder()).build());
		}

		/**
		 * API name: {@code timestamp}
		 */
		public Builder timestamp(Number value) {
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

			return new OperatingSystem(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for OperatingSystem
	 */
	public static final JsonpDeserializer<OperatingSystem> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, OperatingSystem::setupOperatingSystemDeserializer);

	protected static void setupOperatingSystemDeserializer(DelegatingDeserializer<OperatingSystem.Builder> op) {

		op.add(Builder::cpu, Cpu.DESERIALIZER, "cpu");
		op.add(Builder::mem, ExtendedMemoryStats.DESERIALIZER, "mem");
		op.add(Builder::swap, MemoryStats.DESERIALIZER, "swap");
		op.add(Builder::timestamp, JsonpDeserializer.numberDeserializer(), "timestamp");

	}

}
