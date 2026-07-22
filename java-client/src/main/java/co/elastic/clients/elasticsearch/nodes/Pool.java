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

// typedef: nodes._types.Pool

/**
 *
 * @see <a href="../doc-files/api-spec.html#nodes._types.Pool">API
 *      specification</a>
 */
@JsonpDeserializable
public class Pool implements JsonpSerializable {
	@Nullable
	private final String used;

	@Nullable
	private final Long usedInBytes;

	@Nullable
	private final String max;

	@Nullable
	private final Long maxInBytes;

	@Nullable
	private final String peakUsed;

	@Nullable
	private final Long peakUsedInBytes;

	@Nullable
	private final String peakMax;

	@Nullable
	private final Long peakMaxInBytes;

	// ---------------------------------------------------------------------------------------------

	private Pool(Builder builder) {

		this.used = builder.used;
		this.usedInBytes = builder.usedInBytes;
		this.max = builder.max;
		this.maxInBytes = builder.maxInBytes;
		this.peakUsed = builder.peakUsed;
		this.peakUsedInBytes = builder.peakUsedInBytes;
		this.peakMax = builder.peakMax;
		this.peakMaxInBytes = builder.peakMaxInBytes;

	}

	public static Pool of(Function<Builder, ObjectBuilder<Pool>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Memory used by the heap.
	 * <p>
	 * API name: {@code used}
	 */
	@Nullable
	public final String used() {
		return this.used;
	}

	/**
	 * Memory, in bytes, used by the heap.
	 * <p>
	 * API name: {@code used_in_bytes}
	 */
	@Nullable
	public final Long usedInBytes() {
		return this.usedInBytes;
	}

	/**
	 * Maximum amount of memory available for use by the heap.
	 * <p>
	 * API name: {@code max}
	 */
	@Nullable
	public final String max() {
		return this.max;
	}

	/**
	 * Maximum amount of memory, in bytes, available for use by the heap.
	 * <p>
	 * API name: {@code max_in_bytes}
	 */
	@Nullable
	public final Long maxInBytes() {
		return this.maxInBytes;
	}

	/**
	 * Largest amount of memory historically used by the heap.
	 * <p>
	 * API name: {@code peak_used}
	 */
	@Nullable
	public final String peakUsed() {
		return this.peakUsed;
	}

	/**
	 * Largest amount of memory, in bytes, historically used by the heap.
	 * <p>
	 * API name: {@code peak_used_in_bytes}
	 */
	@Nullable
	public final Long peakUsedInBytes() {
		return this.peakUsedInBytes;
	}

	/**
	 * Largest amount of memory historically used by the heap.
	 * <p>
	 * API name: {@code peak_max}
	 */
	@Nullable
	public final String peakMax() {
		return this.peakMax;
	}

	/**
	 * Largest amount of memory, in bytes, historically used by the heap.
	 * <p>
	 * API name: {@code peak_max_in_bytes}
	 */
	@Nullable
	public final Long peakMaxInBytes() {
		return this.peakMaxInBytes;
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

		if (this.used != null) {
			generator.writeKey("used");
			generator.write(this.used);

		}
		if (this.usedInBytes != null) {
			generator.writeKey("used_in_bytes");
			generator.write(this.usedInBytes);

		}
		if (this.max != null) {
			generator.writeKey("max");
			generator.write(this.max);

		}
		if (this.maxInBytes != null) {
			generator.writeKey("max_in_bytes");
			generator.write(this.maxInBytes);

		}
		if (this.peakUsed != null) {
			generator.writeKey("peak_used");
			generator.write(this.peakUsed);

		}
		if (this.peakUsedInBytes != null) {
			generator.writeKey("peak_used_in_bytes");
			generator.write(this.peakUsedInBytes);

		}
		if (this.peakMax != null) {
			generator.writeKey("peak_max");
			generator.write(this.peakMax);

		}
		if (this.peakMaxInBytes != null) {
			generator.writeKey("peak_max_in_bytes");
			generator.write(this.peakMaxInBytes);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Pool}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Pool> {
		@Nullable
		private String used;

		@Nullable
		private Long usedInBytes;

		@Nullable
		private String max;

		@Nullable
		private Long maxInBytes;

		@Nullable
		private String peakUsed;

		@Nullable
		private Long peakUsedInBytes;

		@Nullable
		private String peakMax;

		@Nullable
		private Long peakMaxInBytes;

		public Builder() {
		}
		private Builder(Pool instance) {
			this.used = instance.used;
			this.usedInBytes = instance.usedInBytes;
			this.max = instance.max;
			this.maxInBytes = instance.maxInBytes;
			this.peakUsed = instance.peakUsed;
			this.peakUsedInBytes = instance.peakUsedInBytes;
			this.peakMax = instance.peakMax;
			this.peakMaxInBytes = instance.peakMaxInBytes;

		}
		/**
		 * Memory used by the heap.
		 * <p>
		 * API name: {@code used}
		 */
		public final Builder used(@Nullable String value) {
			this.used = value;
			return this;
		}

		/**
		 * Memory, in bytes, used by the heap.
		 * <p>
		 * API name: {@code used_in_bytes}
		 */
		public final Builder usedInBytes(@Nullable Long value) {
			this.usedInBytes = value;
			return this;
		}

		/**
		 * Maximum amount of memory available for use by the heap.
		 * <p>
		 * API name: {@code max}
		 */
		public final Builder max(@Nullable String value) {
			this.max = value;
			return this;
		}

		/**
		 * Maximum amount of memory, in bytes, available for use by the heap.
		 * <p>
		 * API name: {@code max_in_bytes}
		 */
		public final Builder maxInBytes(@Nullable Long value) {
			this.maxInBytes = value;
			return this;
		}

		/**
		 * Largest amount of memory historically used by the heap.
		 * <p>
		 * API name: {@code peak_used}
		 */
		public final Builder peakUsed(@Nullable String value) {
			this.peakUsed = value;
			return this;
		}

		/**
		 * Largest amount of memory, in bytes, historically used by the heap.
		 * <p>
		 * API name: {@code peak_used_in_bytes}
		 */
		public final Builder peakUsedInBytes(@Nullable Long value) {
			this.peakUsedInBytes = value;
			return this;
		}

		/**
		 * Largest amount of memory historically used by the heap.
		 * <p>
		 * API name: {@code peak_max}
		 */
		public final Builder peakMax(@Nullable String value) {
			this.peakMax = value;
			return this;
		}

		/**
		 * Largest amount of memory, in bytes, historically used by the heap.
		 * <p>
		 * API name: {@code peak_max_in_bytes}
		 */
		public final Builder peakMaxInBytes(@Nullable Long value) {
			this.peakMaxInBytes = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Pool}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Pool build() {
			_checkSingleUse();

			return new Pool(this);
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
	 * Json deserializer for {@link Pool}
	 */
	public static final JsonpDeserializer<Pool> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Pool::setupPoolDeserializer);

	protected static void setupPoolDeserializer(ObjectDeserializer<Pool.Builder> op) {

		op.add(Builder::used, JsonpDeserializer.stringDeserializer(), "used");
		op.add(Builder::usedInBytes, JsonpDeserializer.longDeserializer(), "used_in_bytes");
		op.add(Builder::max, JsonpDeserializer.stringDeserializer(), "max");
		op.add(Builder::maxInBytes, JsonpDeserializer.longDeserializer(), "max_in_bytes");
		op.add(Builder::peakUsed, JsonpDeserializer.stringDeserializer(), "peak_used");
		op.add(Builder::peakUsedInBytes, JsonpDeserializer.longDeserializer(), "peak_used_in_bytes");
		op.add(Builder::peakMax, JsonpDeserializer.stringDeserializer(), "peak_max");
		op.add(Builder::peakMaxInBytes, JsonpDeserializer.longDeserializer(), "peak_max_in_bytes");

	}

}
