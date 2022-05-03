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

// typedef: _types.RequestCacheStats

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.RequestCacheStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class RequestCacheStats implements JsonpSerializable {
	private final long evictions;

	private final long hitCount;

	@Nullable
	private final String memorySize;

	private final long memorySizeInBytes;

	private final long missCount;

	// ---------------------------------------------------------------------------------------------

	private RequestCacheStats(Builder builder) {

		this.evictions = ApiTypeHelper.requireNonNull(builder.evictions, this, "evictions");
		this.hitCount = ApiTypeHelper.requireNonNull(builder.hitCount, this, "hitCount");
		this.memorySize = builder.memorySize;
		this.memorySizeInBytes = ApiTypeHelper.requireNonNull(builder.memorySizeInBytes, this, "memorySizeInBytes");
		this.missCount = ApiTypeHelper.requireNonNull(builder.missCount, this, "missCount");

	}

	public static RequestCacheStats of(Function<Builder, ObjectBuilder<RequestCacheStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code evictions}
	 */
	public final long evictions() {
		return this.evictions;
	}

	/**
	 * Required - API name: {@code hit_count}
	 */
	public final long hitCount() {
		return this.hitCount;
	}

	/**
	 * API name: {@code memory_size}
	 */
	@Nullable
	public final String memorySize() {
		return this.memorySize;
	}

	/**
	 * Required - API name: {@code memory_size_in_bytes}
	 */
	public final long memorySizeInBytes() {
		return this.memorySizeInBytes;
	}

	/**
	 * Required - API name: {@code miss_count}
	 */
	public final long missCount() {
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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RequestCacheStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<RequestCacheStats> {
		private Long evictions;

		private Long hitCount;

		@Nullable
		private String memorySize;

		private Long memorySizeInBytes;

		private Long missCount;

		/**
		 * Required - API name: {@code evictions}
		 */
		public final Builder evictions(long value) {
			this.evictions = value;
			return this;
		}

		/**
		 * Required - API name: {@code hit_count}
		 */
		public final Builder hitCount(long value) {
			this.hitCount = value;
			return this;
		}

		/**
		 * API name: {@code memory_size}
		 */
		public final Builder memorySize(@Nullable String value) {
			this.memorySize = value;
			return this;
		}

		/**
		 * Required - API name: {@code memory_size_in_bytes}
		 */
		public final Builder memorySizeInBytes(long value) {
			this.memorySizeInBytes = value;
			return this;
		}

		/**
		 * Required - API name: {@code miss_count}
		 */
		public final Builder missCount(long value) {
			this.missCount = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RequestCacheStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RequestCacheStats build() {
			_checkSingleUse();

			return new RequestCacheStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RequestCacheStats}
	 */
	public static final JsonpDeserializer<RequestCacheStats> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RequestCacheStats::setupRequestCacheStatsDeserializer);

	protected static void setupRequestCacheStatsDeserializer(ObjectDeserializer<RequestCacheStats.Builder> op) {

		op.add(Builder::evictions, JsonpDeserializer.longDeserializer(), "evictions");
		op.add(Builder::hitCount, JsonpDeserializer.longDeserializer(), "hit_count");
		op.add(Builder::memorySize, JsonpDeserializer.stringDeserializer(), "memory_size");
		op.add(Builder::memorySizeInBytes, JsonpDeserializer.longDeserializer(), "memory_size_in_bytes");
		op.add(Builder::missCount, JsonpDeserializer.longDeserializer(), "miss_count");

	}

}
