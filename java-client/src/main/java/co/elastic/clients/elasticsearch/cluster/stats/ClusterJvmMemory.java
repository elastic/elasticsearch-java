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

package co.elastic.clients.elasticsearch.cluster.stats;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: cluster.stats.ClusterJvmMemory

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#cluster.stats.ClusterJvmMemory">API
 *      specification</a>
 */
@JsonpDeserializable
public class ClusterJvmMemory implements JsonpSerializable {
	private final long heapMaxInBytes;

	@Nullable
	private final String heapMax;

	private final long heapUsedInBytes;

	@Nullable
	private final String heapUsed;

	// ---------------------------------------------------------------------------------------------

	private ClusterJvmMemory(Builder builder) {

		this.heapMaxInBytes = ApiTypeHelper.requireNonNull(builder.heapMaxInBytes, this, "heapMaxInBytes", 0);
		this.heapMax = builder.heapMax;
		this.heapUsedInBytes = ApiTypeHelper.requireNonNull(builder.heapUsedInBytes, this, "heapUsedInBytes", 0);
		this.heapUsed = builder.heapUsed;

	}

	public static ClusterJvmMemory of(Function<Builder, ObjectBuilder<ClusterJvmMemory>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Maximum amount of memory, in bytes, available for use by the heap
	 * across all selected nodes.
	 * <p>
	 * API name: {@code heap_max_in_bytes}
	 */
	public final long heapMaxInBytes() {
		return this.heapMaxInBytes;
	}

	/**
	 * Maximum amount of memory available for use by the heap across all selected
	 * nodes.
	 * <p>
	 * API name: {@code heap_max}
	 */
	@Nullable
	public final String heapMax() {
		return this.heapMax;
	}

	/**
	 * Required - Memory, in bytes, currently in use by the heap across all selected
	 * nodes.
	 * <p>
	 * API name: {@code heap_used_in_bytes}
	 */
	public final long heapUsedInBytes() {
		return this.heapUsedInBytes;
	}

	/**
	 * Memory currently in use by the heap across all selected nodes.
	 * <p>
	 * API name: {@code heap_used}
	 */
	@Nullable
	public final String heapUsed() {
		return this.heapUsed;
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

		generator.writeKey("heap_max_in_bytes");
		generator.write(this.heapMaxInBytes);

		if (this.heapMax != null) {
			generator.writeKey("heap_max");
			generator.write(this.heapMax);

		}
		generator.writeKey("heap_used_in_bytes");
		generator.write(this.heapUsedInBytes);

		if (this.heapUsed != null) {
			generator.writeKey("heap_used");
			generator.write(this.heapUsed);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterJvmMemory}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ClusterJvmMemory> {
		private Long heapMaxInBytes;

		@Nullable
		private String heapMax;

		private Long heapUsedInBytes;

		@Nullable
		private String heapUsed;

		public Builder() {
		}
		private Builder(ClusterJvmMemory instance) {
			this.heapMaxInBytes = instance.heapMaxInBytes;
			this.heapMax = instance.heapMax;
			this.heapUsedInBytes = instance.heapUsedInBytes;
			this.heapUsed = instance.heapUsed;

		}
		/**
		 * Required - Maximum amount of memory, in bytes, available for use by the heap
		 * across all selected nodes.
		 * <p>
		 * API name: {@code heap_max_in_bytes}
		 */
		public final Builder heapMaxInBytes(long value) {
			this.heapMaxInBytes = value;
			return this;
		}

		/**
		 * Maximum amount of memory available for use by the heap across all selected
		 * nodes.
		 * <p>
		 * API name: {@code heap_max}
		 */
		public final Builder heapMax(@Nullable String value) {
			this.heapMax = value;
			return this;
		}

		/**
		 * Required - Memory, in bytes, currently in use by the heap across all selected
		 * nodes.
		 * <p>
		 * API name: {@code heap_used_in_bytes}
		 */
		public final Builder heapUsedInBytes(long value) {
			this.heapUsedInBytes = value;
			return this;
		}

		/**
		 * Memory currently in use by the heap across all selected nodes.
		 * <p>
		 * API name: {@code heap_used}
		 */
		public final Builder heapUsed(@Nullable String value) {
			this.heapUsed = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ClusterJvmMemory}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterJvmMemory build() {
			_checkSingleUse();

			return new ClusterJvmMemory(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClusterJvmMemory}
	 */
	public static final JsonpDeserializer<ClusterJvmMemory> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ClusterJvmMemory::setupClusterJvmMemoryDeserializer);

	protected static void setupClusterJvmMemoryDeserializer(ObjectDeserializer<ClusterJvmMemory.Builder> op) {

		op.add(Builder::heapMaxInBytes, JsonpDeserializer.longDeserializer(), "heap_max_in_bytes");
		op.add(Builder::heapMax, JsonpDeserializer.stringDeserializer(), "heap_max");
		op.add(Builder::heapUsedInBytes, JsonpDeserializer.longDeserializer(), "heap_used_in_bytes");
		op.add(Builder::heapUsed, JsonpDeserializer.stringDeserializer(), "heap_used");

	}

}
