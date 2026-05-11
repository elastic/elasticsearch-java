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

package co.elastic.clients.elasticsearch.xpack.usage;

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
import java.lang.Integer;
import java.lang.Long;
import java.lang.Number;
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

// typedef: xpack.usage.SecurityRolesDlsBitSetCache

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#xpack.usage.SecurityRolesDlsBitSetCache">API
 *      specification</a>
 */
@JsonpDeserializable
public class SecurityRolesDlsBitSetCache implements JsonpSerializable {
	private final int count;

	@Nullable
	private final String memory;

	private final Number memoryInBytes;

	private final long hits;

	private final long misses;

	private final long evictions;

	private final long hitsTimeInMillis;

	private final long missesTimeInMillis;

	// ---------------------------------------------------------------------------------------------

	private SecurityRolesDlsBitSetCache(Builder builder) {

		this.count = ApiTypeHelper.requireNonNull(builder.count, this, "count", 0);
		this.memory = builder.memory;
		this.memoryInBytes = ApiTypeHelper.requireNonNull(builder.memoryInBytes, this, "memoryInBytes");
		this.hits = ApiTypeHelper.requireNonNull(builder.hits, this, "hits", 0);
		this.misses = ApiTypeHelper.requireNonNull(builder.misses, this, "misses", 0);
		this.evictions = ApiTypeHelper.requireNonNull(builder.evictions, this, "evictions", 0);
		this.hitsTimeInMillis = ApiTypeHelper.requireNonNull(builder.hitsTimeInMillis, this, "hitsTimeInMillis", 0);
		this.missesTimeInMillis = ApiTypeHelper.requireNonNull(builder.missesTimeInMillis, this, "missesTimeInMillis",
				0);

	}

	public static SecurityRolesDlsBitSetCache of(Function<Builder, ObjectBuilder<SecurityRolesDlsBitSetCache>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Number of entries in the cache.
	 * <p>
	 * API name: {@code count}
	 */
	public final int count() {
		return this.count;
	}

	/**
	 * Human-readable amount of memory taken up by the cache.
	 * <p>
	 * API name: {@code memory}
	 */
	@Nullable
	public final String memory() {
		return this.memory;
	}

	/**
	 * Required - Memory taken up by the cache in bytes.
	 * <p>
	 * API name: {@code memory_in_bytes}
	 */
	public final Number memoryInBytes() {
		return this.memoryInBytes;
	}

	/**
	 * Required - Total number of cache hits.
	 * <p>
	 * API name: {@code hits}
	 */
	public final long hits() {
		return this.hits;
	}

	/**
	 * Required - Total number of cache misses.
	 * <p>
	 * API name: {@code misses}
	 */
	public final long misses() {
		return this.misses;
	}

	/**
	 * Required - Total number of cache evictions.
	 * <p>
	 * API name: {@code evictions}
	 */
	public final long evictions() {
		return this.evictions;
	}

	/**
	 * Required - Total combined time spent in cache for hits in milliseconds.
	 * <p>
	 * API name: {@code hits_time_in_millis}
	 */
	public final long hitsTimeInMillis() {
		return this.hitsTimeInMillis;
	}

	/**
	 * Required - Total combined time spent in cache for misses in milliseconds.
	 * <p>
	 * API name: {@code misses_time_in_millis}
	 */
	public final long missesTimeInMillis() {
		return this.missesTimeInMillis;
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

		if (this.memory != null) {
			generator.writeKey("memory");
			generator.write(this.memory);

		}
		generator.writeKey("memory_in_bytes");
		generator.write(this.memoryInBytes.doubleValue());

		generator.writeKey("hits");
		generator.write(this.hits);

		generator.writeKey("misses");
		generator.write(this.misses);

		generator.writeKey("evictions");
		generator.write(this.evictions);

		generator.writeKey("hits_time_in_millis");
		generator.write(this.hitsTimeInMillis);

		generator.writeKey("misses_time_in_millis");
		generator.write(this.missesTimeInMillis);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SecurityRolesDlsBitSetCache}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<SecurityRolesDlsBitSetCache> {
		private Integer count;

		@Nullable
		private String memory;

		private Number memoryInBytes;

		private Long hits;

		private Long misses;

		private Long evictions;

		private Long hitsTimeInMillis;

		private Long missesTimeInMillis;

		public Builder() {
		}
		private Builder(SecurityRolesDlsBitSetCache instance) {
			this.count = instance.count;
			this.memory = instance.memory;
			this.memoryInBytes = instance.memoryInBytes;
			this.hits = instance.hits;
			this.misses = instance.misses;
			this.evictions = instance.evictions;
			this.hitsTimeInMillis = instance.hitsTimeInMillis;
			this.missesTimeInMillis = instance.missesTimeInMillis;

		}
		/**
		 * Required - Number of entries in the cache.
		 * <p>
		 * API name: {@code count}
		 */
		public final Builder count(int value) {
			this.count = value;
			return this;
		}

		/**
		 * Human-readable amount of memory taken up by the cache.
		 * <p>
		 * API name: {@code memory}
		 */
		public final Builder memory(@Nullable String value) {
			this.memory = value;
			return this;
		}

		/**
		 * Required - Memory taken up by the cache in bytes.
		 * <p>
		 * API name: {@code memory_in_bytes}
		 */
		public final Builder memoryInBytes(Number value) {
			this.memoryInBytes = value;
			return this;
		}

		/**
		 * Required - Total number of cache hits.
		 * <p>
		 * API name: {@code hits}
		 */
		public final Builder hits(long value) {
			this.hits = value;
			return this;
		}

		/**
		 * Required - Total number of cache misses.
		 * <p>
		 * API name: {@code misses}
		 */
		public final Builder misses(long value) {
			this.misses = value;
			return this;
		}

		/**
		 * Required - Total number of cache evictions.
		 * <p>
		 * API name: {@code evictions}
		 */
		public final Builder evictions(long value) {
			this.evictions = value;
			return this;
		}

		/**
		 * Required - Total combined time spent in cache for hits in milliseconds.
		 * <p>
		 * API name: {@code hits_time_in_millis}
		 */
		public final Builder hitsTimeInMillis(long value) {
			this.hitsTimeInMillis = value;
			return this;
		}

		/**
		 * Required - Total combined time spent in cache for misses in milliseconds.
		 * <p>
		 * API name: {@code misses_time_in_millis}
		 */
		public final Builder missesTimeInMillis(long value) {
			this.missesTimeInMillis = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SecurityRolesDlsBitSetCache}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SecurityRolesDlsBitSetCache build() {
			_checkSingleUse();

			return new SecurityRolesDlsBitSetCache(this);
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
	 * Json deserializer for {@link SecurityRolesDlsBitSetCache}
	 */
	public static final JsonpDeserializer<SecurityRolesDlsBitSetCache> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SecurityRolesDlsBitSetCache::setupSecurityRolesDlsBitSetCacheDeserializer);

	protected static void setupSecurityRolesDlsBitSetCacheDeserializer(
			ObjectDeserializer<SecurityRolesDlsBitSetCache.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.integerDeserializer(), "count");
		op.add(Builder::memory, JsonpDeserializer.stringDeserializer(), "memory");
		op.add(Builder::memoryInBytes, JsonpDeserializer.numberDeserializer(), "memory_in_bytes");
		op.add(Builder::hits, JsonpDeserializer.longDeserializer(), "hits");
		op.add(Builder::misses, JsonpDeserializer.longDeserializer(), "misses");
		op.add(Builder::evictions, JsonpDeserializer.longDeserializer(), "evictions");
		op.add(Builder::hitsTimeInMillis, JsonpDeserializer.longDeserializer(), "hits_time_in_millis");
		op.add(Builder::missesTimeInMillis, JsonpDeserializer.longDeserializer(), "misses_time_in_millis");

	}

}
