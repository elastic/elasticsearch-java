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

package co.elastic.clients.elasticsearch.indices.stats;

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
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: indices.stats.ShardQueryCache
@JsonpDeserializable
public final class ShardQueryCache implements JsonpSerializable {
	private final Long cacheCount;

	private final Long cacheSize;

	private final Long evictions;

	private final Long hitCount;

	private final Long memorySizeInBytes;

	private final Long missCount;

	private final Long totalCount;

	// ---------------------------------------------------------------------------------------------

	public ShardQueryCache(Builder builder) {

		this.cacheCount = Objects.requireNonNull(builder.cacheCount, "cache_count");
		this.cacheSize = Objects.requireNonNull(builder.cacheSize, "cache_size");
		this.evictions = Objects.requireNonNull(builder.evictions, "evictions");
		this.hitCount = Objects.requireNonNull(builder.hitCount, "hit_count");
		this.memorySizeInBytes = Objects.requireNonNull(builder.memorySizeInBytes, "memory_size_in_bytes");
		this.missCount = Objects.requireNonNull(builder.missCount, "miss_count");
		this.totalCount = Objects.requireNonNull(builder.totalCount, "total_count");

	}

	/**
	 * API name: {@code cache_count}
	 */
	public Long cacheCount() {
		return this.cacheCount;
	}

	/**
	 * API name: {@code cache_size}
	 */
	public Long cacheSize() {
		return this.cacheSize;
	}

	/**
	 * API name: {@code evictions}
	 */
	public Long evictions() {
		return this.evictions;
	}

	/**
	 * API name: {@code hit_count}
	 */
	public Long hitCount() {
		return this.hitCount;
	}

	/**
	 * API name: {@code memory_size_in_bytes}
	 */
	public Long memorySizeInBytes() {
		return this.memorySizeInBytes;
	}

	/**
	 * API name: {@code miss_count}
	 */
	public Long missCount() {
		return this.missCount;
	}

	/**
	 * API name: {@code total_count}
	 */
	public Long totalCount() {
		return this.totalCount;
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

		generator.writeKey("cache_count");
		generator.write(this.cacheCount);

		generator.writeKey("cache_size");
		generator.write(this.cacheSize);

		generator.writeKey("evictions");
		generator.write(this.evictions);

		generator.writeKey("hit_count");
		generator.write(this.hitCount);

		generator.writeKey("memory_size_in_bytes");
		generator.write(this.memorySizeInBytes);

		generator.writeKey("miss_count");
		generator.write(this.missCount);

		generator.writeKey("total_count");
		generator.write(this.totalCount);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShardQueryCache}.
	 */
	public static class Builder implements ObjectBuilder<ShardQueryCache> {
		private Long cacheCount;

		private Long cacheSize;

		private Long evictions;

		private Long hitCount;

		private Long memorySizeInBytes;

		private Long missCount;

		private Long totalCount;

		/**
		 * API name: {@code cache_count}
		 */
		public Builder cacheCount(Long value) {
			this.cacheCount = value;
			return this;
		}

		/**
		 * API name: {@code cache_size}
		 */
		public Builder cacheSize(Long value) {
			this.cacheSize = value;
			return this;
		}

		/**
		 * API name: {@code evictions}
		 */
		public Builder evictions(Long value) {
			this.evictions = value;
			return this;
		}

		/**
		 * API name: {@code hit_count}
		 */
		public Builder hitCount(Long value) {
			this.hitCount = value;
			return this;
		}

		/**
		 * API name: {@code memory_size_in_bytes}
		 */
		public Builder memorySizeInBytes(Long value) {
			this.memorySizeInBytes = value;
			return this;
		}

		/**
		 * API name: {@code miss_count}
		 */
		public Builder missCount(Long value) {
			this.missCount = value;
			return this;
		}

		/**
		 * API name: {@code total_count}
		 */
		public Builder totalCount(Long value) {
			this.totalCount = value;
			return this;
		}

		/**
		 * Builds a {@link ShardQueryCache}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardQueryCache build() {

			return new ShardQueryCache(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ShardQueryCache}
	 */
	public static final JsonpDeserializer<ShardQueryCache> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ShardQueryCache::setupShardQueryCacheDeserializer, Builder::build);

	protected static void setupShardQueryCacheDeserializer(DelegatingDeserializer<ShardQueryCache.Builder> op) {

		op.add(Builder::cacheCount, JsonpDeserializer.longDeserializer(), "cache_count");
		op.add(Builder::cacheSize, JsonpDeserializer.longDeserializer(), "cache_size");
		op.add(Builder::evictions, JsonpDeserializer.longDeserializer(), "evictions");
		op.add(Builder::hitCount, JsonpDeserializer.longDeserializer(), "hit_count");
		op.add(Builder::memorySizeInBytes, JsonpDeserializer.longDeserializer(), "memory_size_in_bytes");
		op.add(Builder::missCount, JsonpDeserializer.longDeserializer(), "miss_count");
		op.add(Builder::totalCount, JsonpDeserializer.longDeserializer(), "total_count");

	}

}
