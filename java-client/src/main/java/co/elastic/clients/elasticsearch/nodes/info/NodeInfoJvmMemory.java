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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: nodes.info.NodeInfoJvmMemory
public final class NodeInfoJvmMemory implements JsonpSerializable {
	@Nullable
	private final JsonValue directMax;

	private final Number directMaxInBytes;

	@Nullable
	private final JsonValue heapInit;

	private final Number heapInitInBytes;

	@Nullable
	private final JsonValue heapMax;

	private final Number heapMaxInBytes;

	@Nullable
	private final JsonValue nonHeapInit;

	private final Number nonHeapInitInBytes;

	@Nullable
	private final JsonValue nonHeapMax;

	private final Number nonHeapMaxInBytes;

	// ---------------------------------------------------------------------------------------------

	public NodeInfoJvmMemory(Builder builder) {

		this.directMax = builder.directMax;
		this.directMaxInBytes = Objects.requireNonNull(builder.directMaxInBytes, "direct_max_in_bytes");
		this.heapInit = builder.heapInit;
		this.heapInitInBytes = Objects.requireNonNull(builder.heapInitInBytes, "heap_init_in_bytes");
		this.heapMax = builder.heapMax;
		this.heapMaxInBytes = Objects.requireNonNull(builder.heapMaxInBytes, "heap_max_in_bytes");
		this.nonHeapInit = builder.nonHeapInit;
		this.nonHeapInitInBytes = Objects.requireNonNull(builder.nonHeapInitInBytes, "non_heap_init_in_bytes");
		this.nonHeapMax = builder.nonHeapMax;
		this.nonHeapMaxInBytes = Objects.requireNonNull(builder.nonHeapMaxInBytes, "non_heap_max_in_bytes");

	}

	/**
	 * API name: {@code direct_max}
	 */
	@Nullable
	public JsonValue directMax() {
		return this.directMax;
	}

	/**
	 * API name: {@code direct_max_in_bytes}
	 */
	public Number directMaxInBytes() {
		return this.directMaxInBytes;
	}

	/**
	 * API name: {@code heap_init}
	 */
	@Nullable
	public JsonValue heapInit() {
		return this.heapInit;
	}

	/**
	 * API name: {@code heap_init_in_bytes}
	 */
	public Number heapInitInBytes() {
		return this.heapInitInBytes;
	}

	/**
	 * API name: {@code heap_max}
	 */
	@Nullable
	public JsonValue heapMax() {
		return this.heapMax;
	}

	/**
	 * API name: {@code heap_max_in_bytes}
	 */
	public Number heapMaxInBytes() {
		return this.heapMaxInBytes;
	}

	/**
	 * API name: {@code non_heap_init}
	 */
	@Nullable
	public JsonValue nonHeapInit() {
		return this.nonHeapInit;
	}

	/**
	 * API name: {@code non_heap_init_in_bytes}
	 */
	public Number nonHeapInitInBytes() {
		return this.nonHeapInitInBytes;
	}

	/**
	 * API name: {@code non_heap_max}
	 */
	@Nullable
	public JsonValue nonHeapMax() {
		return this.nonHeapMax;
	}

	/**
	 * API name: {@code non_heap_max_in_bytes}
	 */
	public Number nonHeapMaxInBytes() {
		return this.nonHeapMaxInBytes;
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

		if (this.directMax != null) {

			generator.writeKey("direct_max");
			generator.write(this.directMax);

		}

		generator.writeKey("direct_max_in_bytes");
		generator.write(this.directMaxInBytes.doubleValue());

		if (this.heapInit != null) {

			generator.writeKey("heap_init");
			generator.write(this.heapInit);

		}

		generator.writeKey("heap_init_in_bytes");
		generator.write(this.heapInitInBytes.doubleValue());

		if (this.heapMax != null) {

			generator.writeKey("heap_max");
			generator.write(this.heapMax);

		}

		generator.writeKey("heap_max_in_bytes");
		generator.write(this.heapMaxInBytes.doubleValue());

		if (this.nonHeapInit != null) {

			generator.writeKey("non_heap_init");
			generator.write(this.nonHeapInit);

		}

		generator.writeKey("non_heap_init_in_bytes");
		generator.write(this.nonHeapInitInBytes.doubleValue());

		if (this.nonHeapMax != null) {

			generator.writeKey("non_heap_max");
			generator.write(this.nonHeapMax);

		}

		generator.writeKey("non_heap_max_in_bytes");
		generator.write(this.nonHeapMaxInBytes.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoJvmMemory}.
	 */
	public static class Builder implements ObjectBuilder<NodeInfoJvmMemory> {
		@Nullable
		private JsonValue directMax;

		private Number directMaxInBytes;

		@Nullable
		private JsonValue heapInit;

		private Number heapInitInBytes;

		@Nullable
		private JsonValue heapMax;

		private Number heapMaxInBytes;

		@Nullable
		private JsonValue nonHeapInit;

		private Number nonHeapInitInBytes;

		@Nullable
		private JsonValue nonHeapMax;

		private Number nonHeapMaxInBytes;

		/**
		 * API name: {@code direct_max}
		 */
		public Builder directMax(@Nullable JsonValue value) {
			this.directMax = value;
			return this;
		}

		/**
		 * API name: {@code direct_max_in_bytes}
		 */
		public Builder directMaxInBytes(Number value) {
			this.directMaxInBytes = value;
			return this;
		}

		/**
		 * API name: {@code heap_init}
		 */
		public Builder heapInit(@Nullable JsonValue value) {
			this.heapInit = value;
			return this;
		}

		/**
		 * API name: {@code heap_init_in_bytes}
		 */
		public Builder heapInitInBytes(Number value) {
			this.heapInitInBytes = value;
			return this;
		}

		/**
		 * API name: {@code heap_max}
		 */
		public Builder heapMax(@Nullable JsonValue value) {
			this.heapMax = value;
			return this;
		}

		/**
		 * API name: {@code heap_max_in_bytes}
		 */
		public Builder heapMaxInBytes(Number value) {
			this.heapMaxInBytes = value;
			return this;
		}

		/**
		 * API name: {@code non_heap_init}
		 */
		public Builder nonHeapInit(@Nullable JsonValue value) {
			this.nonHeapInit = value;
			return this;
		}

		/**
		 * API name: {@code non_heap_init_in_bytes}
		 */
		public Builder nonHeapInitInBytes(Number value) {
			this.nonHeapInitInBytes = value;
			return this;
		}

		/**
		 * API name: {@code non_heap_max}
		 */
		public Builder nonHeapMax(@Nullable JsonValue value) {
			this.nonHeapMax = value;
			return this;
		}

		/**
		 * API name: {@code non_heap_max_in_bytes}
		 */
		public Builder nonHeapMaxInBytes(Number value) {
			this.nonHeapMaxInBytes = value;
			return this;
		}

		/**
		 * Builds a {@link NodeInfoJvmMemory}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoJvmMemory build() {

			return new NodeInfoJvmMemory(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeInfoJvmMemory}
	 */
	public static final JsonpDeserializer<NodeInfoJvmMemory> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, NodeInfoJvmMemory::setupNodeInfoJvmMemoryDeserializer);

	protected static void setupNodeInfoJvmMemoryDeserializer(DelegatingDeserializer<NodeInfoJvmMemory.Builder> op) {

		op.add(Builder::directMax, JsonpDeserializer.jsonValueDeserializer(), "direct_max");
		op.add(Builder::directMaxInBytes, JsonpDeserializer.numberDeserializer(), "direct_max_in_bytes");
		op.add(Builder::heapInit, JsonpDeserializer.jsonValueDeserializer(), "heap_init");
		op.add(Builder::heapInitInBytes, JsonpDeserializer.numberDeserializer(), "heap_init_in_bytes");
		op.add(Builder::heapMax, JsonpDeserializer.jsonValueDeserializer(), "heap_max");
		op.add(Builder::heapMaxInBytes, JsonpDeserializer.numberDeserializer(), "heap_max_in_bytes");
		op.add(Builder::nonHeapInit, JsonpDeserializer.jsonValueDeserializer(), "non_heap_init");
		op.add(Builder::nonHeapInitInBytes, JsonpDeserializer.numberDeserializer(), "non_heap_init_in_bytes");
		op.add(Builder::nonHeapMax, JsonpDeserializer.jsonValueDeserializer(), "non_heap_max");
		op.add(Builder::nonHeapMaxInBytes, JsonpDeserializer.numberDeserializer(), "non_heap_max_in_bytes");

	}

}
