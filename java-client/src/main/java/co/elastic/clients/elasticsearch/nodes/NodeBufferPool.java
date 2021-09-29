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
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes._types.NodeBufferPool
@JsonpDeserializable
public final class NodeBufferPool implements JsonpSerializable {
	private final long count;

	private final String totalCapacity;

	private final long totalCapacityInBytes;

	private final String used;

	private final long usedInBytes;

	// ---------------------------------------------------------------------------------------------

	public NodeBufferPool(Builder builder) {

		this.count = Objects.requireNonNull(builder.count, "count");
		this.totalCapacity = Objects.requireNonNull(builder.totalCapacity, "total_capacity");
		this.totalCapacityInBytes = Objects.requireNonNull(builder.totalCapacityInBytes, "total_capacity_in_bytes");
		this.used = Objects.requireNonNull(builder.used, "used");
		this.usedInBytes = Objects.requireNonNull(builder.usedInBytes, "used_in_bytes");

	}

	public NodeBufferPool(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code count}
	 */
	public long count() {
		return this.count;
	}

	/**
	 * API name: {@code total_capacity}
	 */
	public String totalCapacity() {
		return this.totalCapacity;
	}

	/**
	 * API name: {@code total_capacity_in_bytes}
	 */
	public long totalCapacityInBytes() {
		return this.totalCapacityInBytes;
	}

	/**
	 * API name: {@code used}
	 */
	public String used() {
		return this.used;
	}

	/**
	 * API name: {@code used_in_bytes}
	 */
	public long usedInBytes() {
		return this.usedInBytes;
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

		generator.writeKey("count");
		generator.write(this.count);

		generator.writeKey("total_capacity");
		generator.write(this.totalCapacity);

		generator.writeKey("total_capacity_in_bytes");
		generator.write(this.totalCapacityInBytes);

		generator.writeKey("used");
		generator.write(this.used);

		generator.writeKey("used_in_bytes");
		generator.write(this.usedInBytes);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeBufferPool}.
	 */
	public static class Builder implements ObjectBuilder<NodeBufferPool> {
		private Long count;

		private String totalCapacity;

		private Long totalCapacityInBytes;

		private String used;

		private Long usedInBytes;

		/**
		 * API name: {@code count}
		 */
		public Builder count(long value) {
			this.count = value;
			return this;
		}

		/**
		 * API name: {@code total_capacity}
		 */
		public Builder totalCapacity(String value) {
			this.totalCapacity = value;
			return this;
		}

		/**
		 * API name: {@code total_capacity_in_bytes}
		 */
		public Builder totalCapacityInBytes(long value) {
			this.totalCapacityInBytes = value;
			return this;
		}

		/**
		 * API name: {@code used}
		 */
		public Builder used(String value) {
			this.used = value;
			return this;
		}

		/**
		 * API name: {@code used_in_bytes}
		 */
		public Builder usedInBytes(long value) {
			this.usedInBytes = value;
			return this;
		}

		/**
		 * Builds a {@link NodeBufferPool}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeBufferPool build() {

			return new NodeBufferPool(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeBufferPool}
	 */
	public static final JsonpDeserializer<NodeBufferPool> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			NodeBufferPool::setupNodeBufferPoolDeserializer, Builder::build);

	protected static void setupNodeBufferPoolDeserializer(DelegatingDeserializer<NodeBufferPool.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");
		op.add(Builder::totalCapacity, JsonpDeserializer.stringDeserializer(), "total_capacity");
		op.add(Builder::totalCapacityInBytes, JsonpDeserializer.longDeserializer(), "total_capacity_in_bytes");
		op.add(Builder::used, JsonpDeserializer.stringDeserializer(), "used");
		op.add(Builder::usedInBytes, JsonpDeserializer.longDeserializer(), "used_in_bytes");

	}

}
