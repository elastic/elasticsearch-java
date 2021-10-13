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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes.info.NodeInfoJvmMemory
@JsonpDeserializable
public final class NodeInfoJvmMemory implements JsonpSerializable {
	@Nullable
	private final String directMax;

	private final long directMaxInBytes;

	@Nullable
	private final String heapInit;

	private final long heapInitInBytes;

	@Nullable
	private final String heapMax;

	private final long heapMaxInBytes;

	@Nullable
	private final String nonHeapInit;

	private final long nonHeapInitInBytes;

	@Nullable
	private final String nonHeapMax;

	private final long nonHeapMaxInBytes;

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

	public NodeInfoJvmMemory(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code direct_max}
	 */
	@Nullable
	public String directMax() {
		return this.directMax;
	}

	/**
	 * Required - API name: {@code direct_max_in_bytes}
	 */
	public long directMaxInBytes() {
		return this.directMaxInBytes;
	}

	/**
	 * API name: {@code heap_init}
	 */
	@Nullable
	public String heapInit() {
		return this.heapInit;
	}

	/**
	 * Required - API name: {@code heap_init_in_bytes}
	 */
	public long heapInitInBytes() {
		return this.heapInitInBytes;
	}

	/**
	 * API name: {@code heap_max}
	 */
	@Nullable
	public String heapMax() {
		return this.heapMax;
	}

	/**
	 * Required - API name: {@code heap_max_in_bytes}
	 */
	public long heapMaxInBytes() {
		return this.heapMaxInBytes;
	}

	/**
	 * API name: {@code non_heap_init}
	 */
	@Nullable
	public String nonHeapInit() {
		return this.nonHeapInit;
	}

	/**
	 * Required - API name: {@code non_heap_init_in_bytes}
	 */
	public long nonHeapInitInBytes() {
		return this.nonHeapInitInBytes;
	}

	/**
	 * API name: {@code non_heap_max}
	 */
	@Nullable
	public String nonHeapMax() {
		return this.nonHeapMax;
	}

	/**
	 * Required - API name: {@code non_heap_max_in_bytes}
	 */
	public long nonHeapMaxInBytes() {
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
		generator.write(this.directMaxInBytes);

		if (this.heapInit != null) {

			generator.writeKey("heap_init");
			generator.write(this.heapInit);

		}

		generator.writeKey("heap_init_in_bytes");
		generator.write(this.heapInitInBytes);

		if (this.heapMax != null) {

			generator.writeKey("heap_max");
			generator.write(this.heapMax);

		}

		generator.writeKey("heap_max_in_bytes");
		generator.write(this.heapMaxInBytes);

		if (this.nonHeapInit != null) {

			generator.writeKey("non_heap_init");
			generator.write(this.nonHeapInit);

		}

		generator.writeKey("non_heap_init_in_bytes");
		generator.write(this.nonHeapInitInBytes);

		if (this.nonHeapMax != null) {

			generator.writeKey("non_heap_max");
			generator.write(this.nonHeapMax);

		}

		generator.writeKey("non_heap_max_in_bytes");
		generator.write(this.nonHeapMaxInBytes);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoJvmMemory}.
	 */
	public static class Builder implements ObjectBuilder<NodeInfoJvmMemory> {
		@Nullable
		private String directMax;

		private Long directMaxInBytes;

		@Nullable
		private String heapInit;

		private Long heapInitInBytes;

		@Nullable
		private String heapMax;

		private Long heapMaxInBytes;

		@Nullable
		private String nonHeapInit;

		private Long nonHeapInitInBytes;

		@Nullable
		private String nonHeapMax;

		private Long nonHeapMaxInBytes;

		/**
		 * API name: {@code direct_max}
		 */
		public Builder directMax(@Nullable String value) {
			this.directMax = value;
			return this;
		}

		/**
		 * Required - API name: {@code direct_max_in_bytes}
		 */
		public Builder directMaxInBytes(long value) {
			this.directMaxInBytes = value;
			return this;
		}

		/**
		 * API name: {@code heap_init}
		 */
		public Builder heapInit(@Nullable String value) {
			this.heapInit = value;
			return this;
		}

		/**
		 * Required - API name: {@code heap_init_in_bytes}
		 */
		public Builder heapInitInBytes(long value) {
			this.heapInitInBytes = value;
			return this;
		}

		/**
		 * API name: {@code heap_max}
		 */
		public Builder heapMax(@Nullable String value) {
			this.heapMax = value;
			return this;
		}

		/**
		 * Required - API name: {@code heap_max_in_bytes}
		 */
		public Builder heapMaxInBytes(long value) {
			this.heapMaxInBytes = value;
			return this;
		}

		/**
		 * API name: {@code non_heap_init}
		 */
		public Builder nonHeapInit(@Nullable String value) {
			this.nonHeapInit = value;
			return this;
		}

		/**
		 * Required - API name: {@code non_heap_init_in_bytes}
		 */
		public Builder nonHeapInitInBytes(long value) {
			this.nonHeapInitInBytes = value;
			return this;
		}

		/**
		 * API name: {@code non_heap_max}
		 */
		public Builder nonHeapMax(@Nullable String value) {
			this.nonHeapMax = value;
			return this;
		}

		/**
		 * Required - API name: {@code non_heap_max_in_bytes}
		 */
		public Builder nonHeapMaxInBytes(long value) {
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
	public static final JsonpDeserializer<NodeInfoJvmMemory> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, NodeInfoJvmMemory::setupNodeInfoJvmMemoryDeserializer, Builder::build);

	protected static void setupNodeInfoJvmMemoryDeserializer(DelegatingDeserializer<NodeInfoJvmMemory.Builder> op) {

		op.add(Builder::directMax, JsonpDeserializer.stringDeserializer(), "direct_max");
		op.add(Builder::directMaxInBytes, JsonpDeserializer.longDeserializer(), "direct_max_in_bytes");
		op.add(Builder::heapInit, JsonpDeserializer.stringDeserializer(), "heap_init");
		op.add(Builder::heapInitInBytes, JsonpDeserializer.longDeserializer(), "heap_init_in_bytes");
		op.add(Builder::heapMax, JsonpDeserializer.stringDeserializer(), "heap_max");
		op.add(Builder::heapMaxInBytes, JsonpDeserializer.longDeserializer(), "heap_max_in_bytes");
		op.add(Builder::nonHeapInit, JsonpDeserializer.stringDeserializer(), "non_heap_init");
		op.add(Builder::nonHeapInitInBytes, JsonpDeserializer.longDeserializer(), "non_heap_init_in_bytes");
		op.add(Builder::nonHeapMax, JsonpDeserializer.stringDeserializer(), "non_heap_max");
		op.add(Builder::nonHeapMaxInBytes, JsonpDeserializer.longDeserializer(), "non_heap_max_in_bytes");

	}

}
