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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes._types.NodeBufferPool

/**
 *
 * @see <a href="../doc-files/api-spec.html#nodes._types.NodeBufferPool">API
 *      specification</a>
 */
@JsonpDeserializable
public class NodeBufferPool implements JsonpSerializable {
	@Nullable
	private final Long count;

	@Nullable
	private final String totalCapacity;

	@Nullable
	private final Long totalCapacityInBytes;

	@Nullable
	private final String used;

	@Nullable
	private final Long usedInBytes;

	// ---------------------------------------------------------------------------------------------

	private NodeBufferPool(Builder builder) {

		this.count = builder.count;
		this.totalCapacity = builder.totalCapacity;
		this.totalCapacityInBytes = builder.totalCapacityInBytes;
		this.used = builder.used;
		this.usedInBytes = builder.usedInBytes;

	}

	public static NodeBufferPool of(Function<Builder, ObjectBuilder<NodeBufferPool>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code count}
	 */
	@Nullable
	public final Long count() {
		return this.count;
	}

	/**
	 * API name: {@code total_capacity}
	 */
	@Nullable
	public final String totalCapacity() {
		return this.totalCapacity;
	}

	/**
	 * API name: {@code total_capacity_in_bytes}
	 */
	@Nullable
	public final Long totalCapacityInBytes() {
		return this.totalCapacityInBytes;
	}

	/**
	 * API name: {@code used}
	 */
	@Nullable
	public final String used() {
		return this.used;
	}

	/**
	 * API name: {@code used_in_bytes}
	 */
	@Nullable
	public final Long usedInBytes() {
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

		if (this.count != null) {
			generator.writeKey("count");
			generator.write(this.count);

		}
		if (this.totalCapacity != null) {
			generator.writeKey("total_capacity");
			generator.write(this.totalCapacity);

		}
		if (this.totalCapacityInBytes != null) {
			generator.writeKey("total_capacity_in_bytes");
			generator.write(this.totalCapacityInBytes);

		}
		if (this.used != null) {
			generator.writeKey("used");
			generator.write(this.used);

		}
		if (this.usedInBytes != null) {
			generator.writeKey("used_in_bytes");
			generator.write(this.usedInBytes);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeBufferPool}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<NodeBufferPool> {
		@Nullable
		private Long count;

		@Nullable
		private String totalCapacity;

		@Nullable
		private Long totalCapacityInBytes;

		@Nullable
		private String used;

		@Nullable
		private Long usedInBytes;

		/**
		 * API name: {@code count}
		 */
		public final Builder count(@Nullable Long value) {
			this.count = value;
			return this;
		}

		/**
		 * API name: {@code total_capacity}
		 */
		public final Builder totalCapacity(@Nullable String value) {
			this.totalCapacity = value;
			return this;
		}

		/**
		 * API name: {@code total_capacity_in_bytes}
		 */
		public final Builder totalCapacityInBytes(@Nullable Long value) {
			this.totalCapacityInBytes = value;
			return this;
		}

		/**
		 * API name: {@code used}
		 */
		public final Builder used(@Nullable String value) {
			this.used = value;
			return this;
		}

		/**
		 * API name: {@code used_in_bytes}
		 */
		public final Builder usedInBytes(@Nullable Long value) {
			this.usedInBytes = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link NodeBufferPool}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeBufferPool build() {
			_checkSingleUse();

			return new NodeBufferPool(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeBufferPool}
	 */
	public static final JsonpDeserializer<NodeBufferPool> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			NodeBufferPool::setupNodeBufferPoolDeserializer);

	protected static void setupNodeBufferPoolDeserializer(ObjectDeserializer<NodeBufferPool.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");
		op.add(Builder::totalCapacity, JsonpDeserializer.stringDeserializer(), "total_capacity");
		op.add(Builder::totalCapacityInBytes, JsonpDeserializer.longDeserializer(), "total_capacity_in_bytes");
		op.add(Builder::used, JsonpDeserializer.stringDeserializer(), "used");
		op.add(Builder::usedInBytes, JsonpDeserializer.longDeserializer(), "used_in_bytes");

	}

}
