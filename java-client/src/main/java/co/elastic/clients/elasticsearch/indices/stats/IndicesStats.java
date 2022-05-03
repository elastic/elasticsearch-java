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

import co.elastic.clients.elasticsearch._types.HealthStatus;
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
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.stats.IndicesStats

/**
 *
 * @see <a href="../../doc-files/api-spec.html#indices.stats.IndicesStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class IndicesStats implements JsonpSerializable {
	@Nullable
	private final IndexStats primaries;

	private final Map<String, List<ShardStats>> shards;

	@Nullable
	private final IndexStats total;

	@Nullable
	private final String uuid;

	@Nullable
	private final HealthStatus health;

	@Nullable
	private final IndexMetadataState status;

	// ---------------------------------------------------------------------------------------------

	private IndicesStats(Builder builder) {

		this.primaries = builder.primaries;
		this.shards = ApiTypeHelper.unmodifiable(builder.shards);
		this.total = builder.total;
		this.uuid = builder.uuid;
		this.health = builder.health;
		this.status = builder.status;

	}

	public static IndicesStats of(Function<Builder, ObjectBuilder<IndicesStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code primaries}
	 */
	@Nullable
	public final IndexStats primaries() {
		return this.primaries;
	}

	/**
	 * API name: {@code shards}
	 */
	public final Map<String, List<ShardStats>> shards() {
		return this.shards;
	}

	/**
	 * API name: {@code total}
	 */
	@Nullable
	public final IndexStats total() {
		return this.total;
	}

	/**
	 * API name: {@code uuid}
	 */
	@Nullable
	public final String uuid() {
		return this.uuid;
	}

	/**
	 * API name: {@code health}
	 */
	@Nullable
	public final HealthStatus health() {
		return this.health;
	}

	/**
	 * API name: {@code status}
	 */
	@Nullable
	public final IndexMetadataState status() {
		return this.status;
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

		if (this.primaries != null) {
			generator.writeKey("primaries");
			this.primaries.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.shards)) {
			generator.writeKey("shards");
			generator.writeStartObject();
			for (Map.Entry<String, List<ShardStats>> item0 : this.shards.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.writeStartArray();
				if (item0.getValue() != null) {
					for (ShardStats item1 : item0.getValue()) {
						item1.serialize(generator, mapper);

					}
				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}
		if (this.total != null) {
			generator.writeKey("total");
			this.total.serialize(generator, mapper);

		}
		if (this.uuid != null) {
			generator.writeKey("uuid");
			generator.write(this.uuid);

		}
		if (this.health != null) {
			generator.writeKey("health");
			this.health.serialize(generator, mapper);
		}
		if (this.status != null) {
			generator.writeKey("status");
			this.status.serialize(generator, mapper);
		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndicesStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<IndicesStats> {
		@Nullable
		private IndexStats primaries;

		@Nullable
		private Map<String, List<ShardStats>> shards;

		@Nullable
		private IndexStats total;

		@Nullable
		private String uuid;

		@Nullable
		private HealthStatus health;

		@Nullable
		private IndexMetadataState status;

		/**
		 * API name: {@code primaries}
		 */
		public final Builder primaries(@Nullable IndexStats value) {
			this.primaries = value;
			return this;
		}

		/**
		 * API name: {@code primaries}
		 */
		public final Builder primaries(Function<IndexStats.Builder, ObjectBuilder<IndexStats>> fn) {
			return this.primaries(fn.apply(new IndexStats.Builder()).build());
		}

		/**
		 * API name: {@code shards}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>shards</code>.
		 */
		public final Builder shards(Map<String, List<ShardStats>> map) {
			this.shards = _mapPutAll(this.shards, map);
			return this;
		}

		/**
		 * API name: {@code shards}
		 * <p>
		 * Adds an entry to <code>shards</code>.
		 */
		public final Builder shards(String key, List<ShardStats> value) {
			this.shards = _mapPut(this.shards, key, value);
			return this;
		}

		/**
		 * API name: {@code total}
		 */
		public final Builder total(@Nullable IndexStats value) {
			this.total = value;
			return this;
		}

		/**
		 * API name: {@code total}
		 */
		public final Builder total(Function<IndexStats.Builder, ObjectBuilder<IndexStats>> fn) {
			return this.total(fn.apply(new IndexStats.Builder()).build());
		}

		/**
		 * API name: {@code uuid}
		 */
		public final Builder uuid(@Nullable String value) {
			this.uuid = value;
			return this;
		}

		/**
		 * API name: {@code health}
		 */
		public final Builder health(@Nullable HealthStatus value) {
			this.health = value;
			return this;
		}

		/**
		 * API name: {@code status}
		 */
		public final Builder status(@Nullable IndexMetadataState value) {
			this.status = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IndicesStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndicesStats build() {
			_checkSingleUse();

			return new IndicesStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndicesStats}
	 */
	public static final JsonpDeserializer<IndicesStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			IndicesStats::setupIndicesStatsDeserializer);

	protected static void setupIndicesStatsDeserializer(ObjectDeserializer<IndicesStats.Builder> op) {

		op.add(Builder::primaries, IndexStats._DESERIALIZER, "primaries");
		op.add(Builder::shards,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.arrayDeserializer(ShardStats._DESERIALIZER)),
				"shards");
		op.add(Builder::total, IndexStats._DESERIALIZER, "total");
		op.add(Builder::uuid, JsonpDeserializer.stringDeserializer(), "uuid");
		op.add(Builder::health, HealthStatus._DESERIALIZER, "health");
		op.add(Builder::status, IndexMetadataState._DESERIALIZER, "status");

	}

}
