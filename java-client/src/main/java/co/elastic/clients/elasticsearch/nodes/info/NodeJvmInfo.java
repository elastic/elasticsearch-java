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

package co.elastic.clients.elasticsearch.nodes.info;

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes.info.NodeJvmInfo
public final class NodeJvmInfo implements ToJsonp {
	private final List<String> gcCollectors;

	private final NodeInfoJvmMemory mem;

	private final List<String> memoryPools;

	private final Number pid;

	private final Number startTimeInMillis;

	private final String version;

	private final String vmName;

	private final String vmVendor;

	private final String vmVersion;

	private final Boolean bundledJdk;

	private final Boolean usingBundledJdk;

	@Nullable
	private final JsonValue usingCompressedOrdinaryObjectPointers;

	private final List<String> inputArguments;

	// ---------------------------------------------------------------------------------------------

	protected NodeJvmInfo(Builder builder) {

		this.gcCollectors = Objects.requireNonNull(builder.gcCollectors, "gc_collectors");
		this.mem = Objects.requireNonNull(builder.mem, "mem");
		this.memoryPools = Objects.requireNonNull(builder.memoryPools, "memory_pools");
		this.pid = Objects.requireNonNull(builder.pid, "pid");
		this.startTimeInMillis = Objects.requireNonNull(builder.startTimeInMillis, "start_time_in_millis");
		this.version = Objects.requireNonNull(builder.version, "version");
		this.vmName = Objects.requireNonNull(builder.vmName, "vm_name");
		this.vmVendor = Objects.requireNonNull(builder.vmVendor, "vm_vendor");
		this.vmVersion = Objects.requireNonNull(builder.vmVersion, "vm_version");
		this.bundledJdk = Objects.requireNonNull(builder.bundledJdk, "bundled_jdk");
		this.usingBundledJdk = Objects.requireNonNull(builder.usingBundledJdk, "using_bundled_jdk");
		this.usingCompressedOrdinaryObjectPointers = builder.usingCompressedOrdinaryObjectPointers;
		this.inputArguments = Objects.requireNonNull(builder.inputArguments, "input_arguments");

	}

	/**
	 * API name: {@code gc_collectors}
	 */
	public List<String> gcCollectors() {
		return this.gcCollectors;
	}

	/**
	 * API name: {@code mem}
	 */
	public NodeInfoJvmMemory mem() {
		return this.mem;
	}

	/**
	 * API name: {@code memory_pools}
	 */
	public List<String> memoryPools() {
		return this.memoryPools;
	}

	/**
	 * API name: {@code pid}
	 */
	public Number pid() {
		return this.pid;
	}

	/**
	 * API name: {@code start_time_in_millis}
	 */
	public Number startTimeInMillis() {
		return this.startTimeInMillis;
	}

	/**
	 * API name: {@code version}
	 */
	public String version() {
		return this.version;
	}

	/**
	 * API name: {@code vm_name}
	 */
	public String vmName() {
		return this.vmName;
	}

	/**
	 * API name: {@code vm_vendor}
	 */
	public String vmVendor() {
		return this.vmVendor;
	}

	/**
	 * API name: {@code vm_version}
	 */
	public String vmVersion() {
		return this.vmVersion;
	}

	/**
	 * API name: {@code bundled_jdk}
	 */
	public Boolean bundledJdk() {
		return this.bundledJdk;
	}

	/**
	 * API name: {@code using_bundled_jdk}
	 */
	public Boolean usingBundledJdk() {
		return this.usingBundledJdk;
	}

	/**
	 * API name: {@code using_compressed_ordinary_object_pointers}
	 */
	@Nullable
	public JsonValue usingCompressedOrdinaryObjectPointers() {
		return this.usingCompressedOrdinaryObjectPointers;
	}

	/**
	 * API name: {@code input_arguments}
	 */
	public List<String> inputArguments() {
		return this.inputArguments;
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

		generator.writeKey("gc_collectors");
		generator.writeStartArray();
		for (String item0 : this.gcCollectors) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("mem");
		this.mem.toJsonp(generator, mapper);

		generator.writeKey("memory_pools");
		generator.writeStartArray();
		for (String item0 : this.memoryPools) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("pid");
		generator.write(this.pid.doubleValue());

		generator.writeKey("start_time_in_millis");
		generator.write(this.startTimeInMillis.doubleValue());

		generator.writeKey("version");
		generator.write(this.version);

		generator.writeKey("vm_name");
		generator.write(this.vmName);

		generator.writeKey("vm_vendor");
		generator.write(this.vmVendor);

		generator.writeKey("vm_version");
		generator.write(this.vmVersion);

		generator.writeKey("bundled_jdk");
		generator.write(this.bundledJdk);

		generator.writeKey("using_bundled_jdk");
		generator.write(this.usingBundledJdk);

		if (this.usingCompressedOrdinaryObjectPointers != null) {

			generator.writeKey("using_compressed_ordinary_object_pointers");
			generator.write(this.usingCompressedOrdinaryObjectPointers);

		}

		generator.writeKey("input_arguments");
		generator.writeStartArray();
		for (String item0 : this.inputArguments) {
			generator.write(item0);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeJvmInfo}.
	 */
	public static class Builder implements ObjectBuilder<NodeJvmInfo> {
		private List<String> gcCollectors;

		private NodeInfoJvmMemory mem;

		private List<String> memoryPools;

		private Number pid;

		private Number startTimeInMillis;

		private String version;

		private String vmName;

		private String vmVendor;

		private String vmVersion;

		private Boolean bundledJdk;

		private Boolean usingBundledJdk;

		@Nullable
		private JsonValue usingCompressedOrdinaryObjectPointers;

		private List<String> inputArguments;

		/**
		 * API name: {@code gc_collectors}
		 */
		public Builder gcCollectors(List<String> value) {
			this.gcCollectors = value;
			return this;
		}

		/**
		 * API name: {@code gc_collectors}
		 */
		public Builder gcCollectors(String... value) {
			this.gcCollectors = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #gcCollectors(List)}, creating the list if needed.
		 */
		public Builder addGcCollectors(String value) {
			if (this.gcCollectors == null) {
				this.gcCollectors = new ArrayList<>();
			}
			this.gcCollectors.add(value);
			return this;
		}

		/**
		 * API name: {@code mem}
		 */
		public Builder mem(NodeInfoJvmMemory value) {
			this.mem = value;
			return this;
		}

		/**
		 * API name: {@code mem}
		 */
		public Builder mem(Function<NodeInfoJvmMemory.Builder, ObjectBuilder<NodeInfoJvmMemory>> fn) {
			return this.mem(fn.apply(new NodeInfoJvmMemory.Builder()).build());
		}

		/**
		 * API name: {@code memory_pools}
		 */
		public Builder memoryPools(List<String> value) {
			this.memoryPools = value;
			return this;
		}

		/**
		 * API name: {@code memory_pools}
		 */
		public Builder memoryPools(String... value) {
			this.memoryPools = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #memoryPools(List)}, creating the list if needed.
		 */
		public Builder addMemoryPools(String value) {
			if (this.memoryPools == null) {
				this.memoryPools = new ArrayList<>();
			}
			this.memoryPools.add(value);
			return this;
		}

		/**
		 * API name: {@code pid}
		 */
		public Builder pid(Number value) {
			this.pid = value;
			return this;
		}

		/**
		 * API name: {@code start_time_in_millis}
		 */
		public Builder startTimeInMillis(Number value) {
			this.startTimeInMillis = value;
			return this;
		}

		/**
		 * API name: {@code version}
		 */
		public Builder version(String value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code vm_name}
		 */
		public Builder vmName(String value) {
			this.vmName = value;
			return this;
		}

		/**
		 * API name: {@code vm_vendor}
		 */
		public Builder vmVendor(String value) {
			this.vmVendor = value;
			return this;
		}

		/**
		 * API name: {@code vm_version}
		 */
		public Builder vmVersion(String value) {
			this.vmVersion = value;
			return this;
		}

		/**
		 * API name: {@code bundled_jdk}
		 */
		public Builder bundledJdk(Boolean value) {
			this.bundledJdk = value;
			return this;
		}

		/**
		 * API name: {@code using_bundled_jdk}
		 */
		public Builder usingBundledJdk(Boolean value) {
			this.usingBundledJdk = value;
			return this;
		}

		/**
		 * API name: {@code using_compressed_ordinary_object_pointers}
		 */
		public Builder usingCompressedOrdinaryObjectPointers(@Nullable JsonValue value) {
			this.usingCompressedOrdinaryObjectPointers = value;
			return this;
		}

		/**
		 * API name: {@code input_arguments}
		 */
		public Builder inputArguments(List<String> value) {
			this.inputArguments = value;
			return this;
		}

		/**
		 * API name: {@code input_arguments}
		 */
		public Builder inputArguments(String... value) {
			this.inputArguments = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #inputArguments(List)}, creating the list if needed.
		 */
		public Builder addInputArguments(String value) {
			if (this.inputArguments == null) {
				this.inputArguments = new ArrayList<>();
			}
			this.inputArguments.add(value);
			return this;
		}

		/**
		 * Builds a {@link NodeJvmInfo}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeJvmInfo build() {

			return new NodeJvmInfo(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for NodeJvmInfo
	 */
	public static final JsonpValueParser<NodeJvmInfo> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, NodeJvmInfo::setupNodeJvmInfoParser);

	protected static void setupNodeJvmInfoParser(DelegatingJsonpValueParser<NodeJvmInfo.Builder> op) {

		op.add(Builder::gcCollectors, JsonpValueParser.arrayParser(JsonpValueParser.stringParser()), "gc_collectors");
		op.add(Builder::mem, NodeInfoJvmMemory.JSONP_PARSER, "mem");
		op.add(Builder::memoryPools, JsonpValueParser.arrayParser(JsonpValueParser.stringParser()), "memory_pools");
		op.add(Builder::pid, JsonpValueParser.numberParser(), "pid");
		op.add(Builder::startTimeInMillis, JsonpValueParser.numberParser(), "start_time_in_millis");
		op.add(Builder::version, JsonpValueParser.stringParser(), "version");
		op.add(Builder::vmName, JsonpValueParser.stringParser(), "vm_name");
		op.add(Builder::vmVendor, JsonpValueParser.stringParser(), "vm_vendor");
		op.add(Builder::vmVersion, JsonpValueParser.stringParser(), "vm_version");
		op.add(Builder::bundledJdk, JsonpValueParser.booleanParser(), "bundled_jdk");
		op.add(Builder::usingBundledJdk, JsonpValueParser.booleanParser(), "using_bundled_jdk");
		op.add(Builder::usingCompressedOrdinaryObjectPointers, JsonpValueParser.jsonValueParser(),
				"using_compressed_ordinary_object_pointers");
		op.add(Builder::inputArguments, JsonpValueParser.arrayParser(JsonpValueParser.stringParser()),
				"input_arguments");

	}

}
