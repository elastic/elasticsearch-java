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
import java.lang.Integer;
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes._types.Process

/**
 *
 * @see <a href="../doc-files/api-spec.html#nodes._types.Process">API
 *      specification</a>
 */
@JsonpDeserializable
public class Process implements JsonpSerializable {
	@Nullable
	private final Cpu cpu;

	@Nullable
	private final MemoryStats mem;

	@Nullable
	private final Integer openFileDescriptors;

	@Nullable
	private final Integer maxFileDescriptors;

	@Nullable
	private final Long timestamp;

	// ---------------------------------------------------------------------------------------------

	private Process(Builder builder) {

		this.cpu = builder.cpu;
		this.mem = builder.mem;
		this.openFileDescriptors = builder.openFileDescriptors;
		this.maxFileDescriptors = builder.maxFileDescriptors;
		this.timestamp = builder.timestamp;

	}

	public static Process of(Function<Builder, ObjectBuilder<Process>> fn) {
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
	public final MemoryStats mem() {
		return this.mem;
	}

	/**
	 * API name: {@code open_file_descriptors}
	 */
	@Nullable
	public final Integer openFileDescriptors() {
		return this.openFileDescriptors;
	}

	/**
	 * API name: {@code max_file_descriptors}
	 */
	@Nullable
	public final Integer maxFileDescriptors() {
		return this.maxFileDescriptors;
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
		if (this.openFileDescriptors != null) {
			generator.writeKey("open_file_descriptors");
			generator.write(this.openFileDescriptors);

		}
		if (this.maxFileDescriptors != null) {
			generator.writeKey("max_file_descriptors");
			generator.write(this.maxFileDescriptors);

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
	 * Builder for {@link Process}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Process> {
		@Nullable
		private Cpu cpu;

		@Nullable
		private MemoryStats mem;

		@Nullable
		private Integer openFileDescriptors;

		@Nullable
		private Integer maxFileDescriptors;

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
		public final Builder mem(@Nullable MemoryStats value) {
			this.mem = value;
			return this;
		}

		/**
		 * API name: {@code mem}
		 */
		public final Builder mem(Function<MemoryStats.Builder, ObjectBuilder<MemoryStats>> fn) {
			return this.mem(fn.apply(new MemoryStats.Builder()).build());
		}

		/**
		 * API name: {@code open_file_descriptors}
		 */
		public final Builder openFileDescriptors(@Nullable Integer value) {
			this.openFileDescriptors = value;
			return this;
		}

		/**
		 * API name: {@code max_file_descriptors}
		 */
		public final Builder maxFileDescriptors(@Nullable Integer value) {
			this.maxFileDescriptors = value;
			return this;
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
			Process::setupProcessDeserializer);

	protected static void setupProcessDeserializer(ObjectDeserializer<Process.Builder> op) {

		op.add(Builder::cpu, Cpu._DESERIALIZER, "cpu");
		op.add(Builder::mem, MemoryStats._DESERIALIZER, "mem");
		op.add(Builder::openFileDescriptors, JsonpDeserializer.integerDeserializer(), "open_file_descriptors");
		op.add(Builder::maxFileDescriptors, JsonpDeserializer.integerDeserializer(), "max_file_descriptors");
		op.add(Builder::timestamp, JsonpDeserializer.longDeserializer(), "timestamp");

	}

}
