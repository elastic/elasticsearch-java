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
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.QueryCacheStats
@JsonpDeserializable
public final class QueryCacheStats implements JsonpSerializable {
	private final int cacheCount;

	private final int cacheSize;

	private final int evictions;

	private final int hitCount;

	@Nullable
	private final String memorySize;

	private final int memorySizeInBytes;

	private final int missCount;

	private final int totalCount;

	// ---------------------------------------------------------------------------------------------

	public QueryCacheStats(Builder builder) {

		this.cacheCount = Objects.requireNonNull(builder.cacheCount, "cache_count");
		this.cacheSize = Objects.requireNonNull(builder.cacheSize, "cache_size");
		this.evictions = Objects.requireNonNull(builder.evictions, "evictions");
		this.hitCount = Objects.requireNonNull(builder.hitCount, "hit_count");
		this.memorySize = builder.memorySize;
		this.memorySizeInBytes = Objects.requireNonNull(builder.memorySizeInBytes, "memory_size_in_bytes");
		this.missCount = Objects.requireNonNull(builder.missCount, "miss_count");
		this.totalCount = Objects.requireNonNull(builder.totalCount, "total_count");

	}

	public QueryCacheStats(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code cache_count}
	 */
	public int cacheCount() {
		return this.cacheCount;
	}

	/**
	 * Required - API name: {@code cache_size}
	 */
	public int cacheSize() {
		return this.cacheSize;
	}

	/**
	 * Required - API name: {@code evictions}
	 */
	public int evictions() {
		return this.evictions;
	}

	/**
	 * Required - API name: {@code hit_count}
	 */
	public int hitCount() {
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
	 * Required - API name: {@code memory_size_in_bytes}
	 */
	public int memorySizeInBytes() {
		return this.memorySizeInBytes;
	}

	/**
	 * Required - API name: {@code miss_count}
	 */
	public int missCount() {
		return this.missCount;
	}

	/**
	 * Required - API name: {@code total_count}
	 */
	public int totalCount() {
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

		if (this.memorySize != null) {

			generator.writeKey("memory_size");
			generator.write(this.memorySize);

		}

		generator.writeKey("memory_size_in_bytes");
		generator.write(this.memorySizeInBytes);

		generator.writeKey("miss_count");
		generator.write(this.missCount);

		generator.writeKey("total_count");
		generator.write(this.totalCount);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link QueryCacheStats}.
	 */
	public static class Builder implements ObjectBuilder<QueryCacheStats> {
		private Integer cacheCount;

		private Integer cacheSize;

		private Integer evictions;

		private Integer hitCount;

		@Nullable
		private String memorySize;

		private Integer memorySizeInBytes;

		private Integer missCount;

		private Integer totalCount;

		/**
		 * Required - API name: {@code cache_count}
		 */
		public Builder cacheCount(int value) {
			this.cacheCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code cache_size}
		 */
		public Builder cacheSize(int value) {
			this.cacheSize = value;
			return this;
		}

		/**
		 * Required - API name: {@code evictions}
		 */
		public Builder evictions(int value) {
			this.evictions = value;
			return this;
		}

		/**
		 * Required - API name: {@code hit_count}
		 */
		public Builder hitCount(int value) {
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
		 * Required - API name: {@code memory_size_in_bytes}
		 */
		public Builder memorySizeInBytes(int value) {
			this.memorySizeInBytes = value;
			return this;
		}

		/**
		 * Required - API name: {@code miss_count}
		 */
		public Builder missCount(int value) {
			this.missCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_count}
		 */
		public Builder totalCount(int value) {
			this.totalCount = value;
			return this;
		}

		/**
		 * Builds a {@link QueryCacheStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public QueryCacheStats build() {

			return new QueryCacheStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link QueryCacheStats}
	 */
	public static final JsonpDeserializer<QueryCacheStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			QueryCacheStats::setupQueryCacheStatsDeserializer, Builder::build);

	protected static void setupQueryCacheStatsDeserializer(DelegatingDeserializer<QueryCacheStats.Builder> op) {

		op.add(Builder::cacheCount, JsonpDeserializer.integerDeserializer(), "cache_count");
		op.add(Builder::cacheSize, JsonpDeserializer.integerDeserializer(), "cache_size");
		op.add(Builder::evictions, JsonpDeserializer.integerDeserializer(), "evictions");
		op.add(Builder::hitCount, JsonpDeserializer.integerDeserializer(), "hit_count");
		op.add(Builder::memorySize, JsonpDeserializer.stringDeserializer(), "memory_size");
		op.add(Builder::memorySizeInBytes, JsonpDeserializer.integerDeserializer(), "memory_size_in_bytes");
		op.add(Builder::missCount, JsonpDeserializer.integerDeserializer(), "miss_count");
		op.add(Builder::totalCount, JsonpDeserializer.integerDeserializer(), "total_count");

	}

}
