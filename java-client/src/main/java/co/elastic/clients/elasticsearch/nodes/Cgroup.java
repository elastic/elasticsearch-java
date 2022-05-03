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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes._types.Cgroup

/**
 *
 * @see <a href="../doc-files/api-spec.html#nodes._types.Cgroup">API
 *      specification</a>
 */
@JsonpDeserializable
public class Cgroup implements JsonpSerializable {
	@Nullable
	private final CpuAcct cpuacct;

	@Nullable
	private final CgroupCpu cpu;

	@Nullable
	private final CgroupMemory memory;

	// ---------------------------------------------------------------------------------------------

	private Cgroup(Builder builder) {

		this.cpuacct = builder.cpuacct;
		this.cpu = builder.cpu;
		this.memory = builder.memory;

	}

	public static Cgroup of(Function<Builder, ObjectBuilder<Cgroup>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code cpuacct}
	 */
	@Nullable
	public final CpuAcct cpuacct() {
		return this.cpuacct;
	}

	/**
	 * API name: {@code cpu}
	 */
	@Nullable
	public final CgroupCpu cpu() {
		return this.cpu;
	}

	/**
	 * API name: {@code memory}
	 */
	@Nullable
	public final CgroupMemory memory() {
		return this.memory;
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

		if (this.cpuacct != null) {
			generator.writeKey("cpuacct");
			this.cpuacct.serialize(generator, mapper);

		}
		if (this.cpu != null) {
			generator.writeKey("cpu");
			this.cpu.serialize(generator, mapper);

		}
		if (this.memory != null) {
			generator.writeKey("memory");
			this.memory.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Cgroup}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Cgroup> {
		@Nullable
		private CpuAcct cpuacct;

		@Nullable
		private CgroupCpu cpu;

		@Nullable
		private CgroupMemory memory;

		/**
		 * API name: {@code cpuacct}
		 */
		public final Builder cpuacct(@Nullable CpuAcct value) {
			this.cpuacct = value;
			return this;
		}

		/**
		 * API name: {@code cpuacct}
		 */
		public final Builder cpuacct(Function<CpuAcct.Builder, ObjectBuilder<CpuAcct>> fn) {
			return this.cpuacct(fn.apply(new CpuAcct.Builder()).build());
		}

		/**
		 * API name: {@code cpu}
		 */
		public final Builder cpu(@Nullable CgroupCpu value) {
			this.cpu = value;
			return this;
		}

		/**
		 * API name: {@code cpu}
		 */
		public final Builder cpu(Function<CgroupCpu.Builder, ObjectBuilder<CgroupCpu>> fn) {
			return this.cpu(fn.apply(new CgroupCpu.Builder()).build());
		}

		/**
		 * API name: {@code memory}
		 */
		public final Builder memory(@Nullable CgroupMemory value) {
			this.memory = value;
			return this;
		}

		/**
		 * API name: {@code memory}
		 */
		public final Builder memory(Function<CgroupMemory.Builder, ObjectBuilder<CgroupMemory>> fn) {
			return this.memory(fn.apply(new CgroupMemory.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Cgroup}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Cgroup build() {
			_checkSingleUse();

			return new Cgroup(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Cgroup}
	 */
	public static final JsonpDeserializer<Cgroup> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Cgroup::setupCgroupDeserializer);

	protected static void setupCgroupDeserializer(ObjectDeserializer<Cgroup.Builder> op) {

		op.add(Builder::cpuacct, CpuAcct._DESERIALIZER, "cpuacct");
		op.add(Builder::cpu, CgroupCpu._DESERIALIZER, "cpu");
		op.add(Builder::memory, CgroupMemory._DESERIALIZER, "memory");

	}

}
