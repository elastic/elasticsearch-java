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
import java.lang.Integer;
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes._types.Process
@JsonpDeserializable
public class Process implements JsonpSerializable {
	private final Cpu cpu;

	private final MemoryStats mem;

	private final int openFileDescriptors;

	private final long timestamp;

	// ---------------------------------------------------------------------------------------------

	private Process(Builder builder) {

		this.cpu = ModelTypeHelper.requireNonNull(builder.cpu, this, "cpu");
		this.mem = ModelTypeHelper.requireNonNull(builder.mem, this, "mem");
		this.openFileDescriptors = ModelTypeHelper.requireNonNull(builder.openFileDescriptors, this,
				"openFileDescriptors");
		this.timestamp = ModelTypeHelper.requireNonNull(builder.timestamp, this, "timestamp");

	}

	public static Process of(Function<Builder, ObjectBuilder<Process>> fn) {
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
	public final MemoryStats mem() {
		return this.mem;
	}

	/**
	 * Required - API name: {@code open_file_descriptors}
	 */
	public final int openFileDescriptors() {
		return this.openFileDescriptors;
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

		generator.writeKey("open_file_descriptors");
		generator.write(this.openFileDescriptors);

		generator.writeKey("timestamp");
		generator.write(this.timestamp);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Process}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Process> {
		private Cpu cpu;

		private MemoryStats mem;

		private Integer openFileDescriptors;

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
		 * Required - API name: {@code open_file_descriptors}
		 */
		public final Builder openFileDescriptors(int value) {
			this.openFileDescriptors = value;
			return this;
		}

		/**
		 * Required - API name: {@code timestamp}
		 */
		public final Builder timestamp(long value) {
			this.timestamp = value;
			return this;
		}

		/**
		 * Builds a {@link Process}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Process build() {
			_checkSingleUse();

			return new Process(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Process}
	 */
	public static final JsonpDeserializer<Process> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Process::setupProcessDeserializer, Builder::build);

	protected static void setupProcessDeserializer(DelegatingDeserializer<Process.Builder> op) {

		op.add(Builder::cpu, Cpu._DESERIALIZER, "cpu");
		op.add(Builder::mem, MemoryStats._DESERIALIZER, "mem");
		op.add(Builder::openFileDescriptors, JsonpDeserializer.integerDeserializer(), "open_file_descriptors");
		op.add(Builder::timestamp, JsonpDeserializer.longDeserializer(), "timestamp");

	}

}
