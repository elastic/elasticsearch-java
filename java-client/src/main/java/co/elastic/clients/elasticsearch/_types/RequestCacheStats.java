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

package co.elastic.clients.elasticsearch._types;

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
import javax.annotation.Nullable;

// typedef: _types.RequestCacheStats
@JsonpDeserializable
public final class RequestCacheStats implements JsonpSerializable {
	private final long evictions;

	private final long hitCount;

	@Nullable
	private final String memorySize;

	private final long memorySizeInBytes;

	private final long missCount;

	// ---------------------------------------------------------------------------------------------

	public RequestCacheStats(Builder builder) {

		this.evictions = Objects.requireNonNull(builder.evictions, "evictions");
		this.hitCount = Objects.requireNonNull(builder.hitCount, "hit_count");
		this.memorySize = builder.memorySize;
		this.memorySizeInBytes = Objects.requireNonNull(builder.memorySizeInBytes, "memory_size_in_bytes");
		this.missCount = Objects.requireNonNull(builder.missCount, "miss_count");

	}

	/**
	 * API name: {@code evictions}
	 */
	public long evictions() {
		return this.evictions;
	}

	/**
	 * API name: {@code hit_count}
	 */
	public long hitCount() {
		return this.hitCount;
	}

	/**
	 * API name: {@code memory_size}
	 */
	@Nullable
	public String memorySize() {
		return this.memorySize;
	}

	/**
	 * API name: {@code memory_size_in_bytes}
	 */
	public long memorySizeInBytes() {
		return this.memorySizeInBytes;
	}

	/**
	 * API name: {@code miss_count}
	 */
	public long missCount() {
		return this.missCount;
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

		generator.writeKey("evictions");
		generator.write(this.evictions);

		generator.writeKey("hit_count");
		generator.write(this.hitCount);

		if (this.memorySize != null) {

			generator.writeKey("memory_size");
			generator.write(this.memorySize);

		}

		generator.writeKey("memory_size_in_bytes");
		generator.write(this.memorySizeInBytes);

		generator.writeKey("miss_count");
		generator.write(this.missCount);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RequestCacheStats}.
	 */
	public static class Builder implements ObjectBuilder<RequestCacheStats> {
		private Long evictions;

		private Long hitCount;

		@Nullable
		private String memorySize;

		private Long memorySizeInBytes;

		private Long missCount;

		/**
		 * API name: {@code evictions}
		 */
		public Builder evictions(long value) {
			this.evictions = value;
			return this;
		}

		/**
		 * API name: {@code hit_count}
		 */
		public Builder hitCount(long value) {
			this.hitCount = value;
			return this;
		}

		/**
		 * API name: {@code memory_size}
		 */
		public Builder memorySize(@Nullable String value) {
			this.memorySize = value;
			return this;
		}

		/**
		 * API name: {@code memory_size_in_bytes}
		 */
		public Builder memorySizeInBytes(long value) {
			this.memorySizeInBytes = value;
			return this;
		}

		/**
		 * API name: {@code miss_count}
		 */
		public Builder missCount(long value) {
			this.missCount = value;
			return this;
		}

		/**
		 * Builds a {@link RequestCacheStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RequestCacheStats build() {

			return new RequestCacheStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RequestCacheStats}
	 */
	public static final JsonpDeserializer<RequestCacheStats> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RequestCacheStats::setupRequestCacheStatsDeserializer, Builder::build);

	protected static void setupRequestCacheStatsDeserializer(DelegatingDeserializer<RequestCacheStats.Builder> op) {

		op.add(Builder::evictions, JsonpDeserializer.longDeserializer(), "evictions");
		op.add(Builder::hitCount, JsonpDeserializer.longDeserializer(), "hit_count");
		op.add(Builder::memorySize, JsonpDeserializer.stringDeserializer(), "memory_size");
		op.add(Builder::memorySizeInBytes, JsonpDeserializer.longDeserializer(), "memory_size_in_bytes");
		op.add(Builder::missCount, JsonpDeserializer.longDeserializer(), "miss_count");

	}

}
