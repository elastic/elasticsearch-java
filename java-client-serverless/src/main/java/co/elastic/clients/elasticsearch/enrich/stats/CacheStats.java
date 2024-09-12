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

package co.elastic.clients.elasticsearch.enrich.stats;

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

// typedef: enrich.stats.CacheStats

/**
 *
 * @see <a href="../../doc-files/api-spec.html#enrich.stats.CacheStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class CacheStats implements JsonpSerializable {
	private final String nodeId;

	private final int count;

	private final int hits;

	private final long hitsTimeInMillis;

	private final int misses;

	private final long missesTimeInMillis;

	private final int evictions;

	private final long sizeInBytes;

	// ---------------------------------------------------------------------------------------------

	private CacheStats(Builder builder) {

		this.nodeId = ApiTypeHelper.requireNonNull(builder.nodeId, this, "nodeId");
		this.count = ApiTypeHelper.requireNonNull(builder.count, this, "count");
		this.hits = ApiTypeHelper.requireNonNull(builder.hits, this, "hits");
		this.hitsTimeInMillis = ApiTypeHelper.requireNonNull(builder.hitsTimeInMillis, this, "hitsTimeInMillis");
		this.misses = ApiTypeHelper.requireNonNull(builder.misses, this, "misses");
		this.missesTimeInMillis = ApiTypeHelper.requireNonNull(builder.missesTimeInMillis, this, "missesTimeInMillis");
		this.evictions = ApiTypeHelper.requireNonNull(builder.evictions, this, "evictions");
		this.sizeInBytes = ApiTypeHelper.requireNonNull(builder.sizeInBytes, this, "sizeInBytes");

	}

	public static CacheStats of(Function<Builder, ObjectBuilder<CacheStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code node_id}
	 */
	public final String nodeId() {
		return this.nodeId;
	}

	/**
	 * Required - API name: {@code count}
	 */
	public final int count() {
		return this.count;
	}

	/**
	 * Required - API name: {@code hits}
	 */
	public final int hits() {
		return this.hits;
	}

	/**
	 * Required - API name: {@code hits_time_in_millis}
	 */
	public final long hitsTimeInMillis() {
		return this.hitsTimeInMillis;
	}

	/**
	 * Required - API name: {@code misses}
	 */
	public final int misses() {
		return this.misses;
	}

	/**
	 * Required - API name: {@code misses_time_in_millis}
	 */
	public final long missesTimeInMillis() {
		return this.missesTimeInMillis;
	}

	/**
	 * Required - API name: {@code evictions}
	 */
	public final int evictions() {
		return this.evictions;
	}

	/**
	 * Required - API name: {@code size_in_bytes}
	 */
	public final long sizeInBytes() {
		return this.sizeInBytes;
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

		generator.writeKey("node_id");
		generator.write(this.nodeId);

		generator.writeKey("count");
		generator.write(this.count);

		generator.writeKey("hits");
		generator.write(this.hits);

		generator.writeKey("hits_time_in_millis");
		generator.write(this.hitsTimeInMillis);

		generator.writeKey("misses");
		generator.write(this.misses);

		generator.writeKey("misses_time_in_millis");
		generator.write(this.missesTimeInMillis);

		generator.writeKey("evictions");
		generator.write(this.evictions);

		generator.writeKey("size_in_bytes");
		generator.write(this.sizeInBytes);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CacheStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<CacheStats> {
		private String nodeId;

		private Integer count;

		private Integer hits;

		private Long hitsTimeInMillis;

		private Integer misses;

		private Long missesTimeInMillis;

		private Integer evictions;

		private Long sizeInBytes;

		/**
		 * Required - API name: {@code node_id}
		 */
		public final Builder nodeId(String value) {
			this.nodeId = value;
			return this;
		}

		/**
		 * Required - API name: {@code count}
		 */
		public final Builder count(int value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - API name: {@code hits}
		 */
		public final Builder hits(int value) {
			this.hits = value;
			return this;
		}

		/**
		 * Required - API name: {@code hits_time_in_millis}
		 */
		public final Builder hitsTimeInMillis(long value) {
			this.hitsTimeInMillis = value;
			return this;
		}

		/**
		 * Required - API name: {@code misses}
		 */
		public final Builder misses(int value) {
			this.misses = value;
			return this;
		}

		/**
		 * Required - API name: {@code misses_time_in_millis}
		 */
		public final Builder missesTimeInMillis(long value) {
			this.missesTimeInMillis = value;
			return this;
		}

		/**
		 * Required - API name: {@code evictions}
		 */
		public final Builder evictions(int value) {
			this.evictions = value;
			return this;
		}

		/**
		 * Required - API name: {@code size_in_bytes}
		 */
		public final Builder sizeInBytes(long value) {
			this.sizeInBytes = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CacheStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CacheStats build() {
			_checkSingleUse();

			return new CacheStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CacheStats}
	 */
	public static final JsonpDeserializer<CacheStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			CacheStats::setupCacheStatsDeserializer);

	protected static void setupCacheStatsDeserializer(ObjectDeserializer<CacheStats.Builder> op) {

		op.add(Builder::nodeId, JsonpDeserializer.stringDeserializer(), "node_id");
		op.add(Builder::count, JsonpDeserializer.integerDeserializer(), "count");
		op.add(Builder::hits, JsonpDeserializer.integerDeserializer(), "hits");
		op.add(Builder::hitsTimeInMillis, JsonpDeserializer.longDeserializer(), "hits_time_in_millis");
		op.add(Builder::misses, JsonpDeserializer.integerDeserializer(), "misses");
		op.add(Builder::missesTimeInMillis, JsonpDeserializer.longDeserializer(), "misses_time_in_millis");
		op.add(Builder::evictions, JsonpDeserializer.integerDeserializer(), "evictions");
		op.add(Builder::sizeInBytes, JsonpDeserializer.longDeserializer(), "size_in_bytes");

	}

}
