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
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.stats.IndicesStats
@JsonpDeserializable
public final class IndicesStats implements JsonpSerializable {
	private final IndexStats primaries;

	@Nullable
	private final Map<String, List<ShardStats>> shards;

	private final IndexStats total;

	@Nullable
	private final String uuid;

	// ---------------------------------------------------------------------------------------------

	public IndicesStats(Builder builder) {

		this.primaries = Objects.requireNonNull(builder.primaries, "primaries");
		this.shards = ModelTypeHelper.unmodifiable(builder.shards);
		this.total = Objects.requireNonNull(builder.total, "total");
		this.uuid = builder.uuid;

	}

	public IndicesStats(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code primaries}
	 */
	public IndexStats primaries() {
		return this.primaries;
	}

	/**
	 * API name: {@code shards}
	 */
	@Nullable
	public Map<String, List<ShardStats>> shards() {
		return this.shards;
	}

	/**
	 * Required - API name: {@code total}
	 */
	public IndexStats total() {
		return this.total;
	}

	/**
	 * API name: {@code uuid}
	 */
	@Nullable
	public String uuid() {
		return this.uuid;
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

		generator.writeKey("primaries");
		this.primaries.serialize(generator, mapper);

		if (this.shards != null) {

			generator.writeKey("shards");
			generator.writeStartObject();
			for (Map.Entry<String, List<ShardStats>> item0 : this.shards.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.writeStartArray();
				for (ShardStats item1 : item0.getValue()) {
					item1.serialize(generator, mapper);

				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}

		generator.writeKey("total");
		this.total.serialize(generator, mapper);

		if (this.uuid != null) {

			generator.writeKey("uuid");
			generator.write(this.uuid);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndicesStats}.
	 */
	public static class Builder implements ObjectBuilder<IndicesStats> {
		private IndexStats primaries;

		@Nullable
		private Map<String, List<ShardStats>> shards;

		private IndexStats total;

		@Nullable
		private String uuid;

		/**
		 * Required - API name: {@code primaries}
		 */
		public Builder primaries(IndexStats value) {
			this.primaries = value;
			return this;
		}

		/**
		 * Required - API name: {@code primaries}
		 */
		public Builder primaries(Function<IndexStats.Builder, ObjectBuilder<IndexStats>> fn) {
			return this.primaries(fn.apply(new IndexStats.Builder()).build());
		}

		/**
		 * API name: {@code shards}
		 */
		public Builder shards(@Nullable Map<String, List<ShardStats>> value) {
			this.shards = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #shards(Map)}, creating the map if needed.
		 */
		public Builder putShards(String key, List<ShardStats> value) {
			if (this.shards == null) {
				this.shards = new HashMap<>();
			}
			this.shards.put(key, value);
			return this;
		}

		/**
		 * Required - API name: {@code total}
		 */
		public Builder total(IndexStats value) {
			this.total = value;
			return this;
		}

		/**
		 * Required - API name: {@code total}
		 */
		public Builder total(Function<IndexStats.Builder, ObjectBuilder<IndexStats>> fn) {
			return this.total(fn.apply(new IndexStats.Builder()).build());
		}

		/**
		 * API name: {@code uuid}
		 */
		public Builder uuid(@Nullable String value) {
			this.uuid = value;
			return this;
		}

		/**
		 * Builds a {@link IndicesStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndicesStats build() {

			return new IndicesStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndicesStats}
	 */
	public static final JsonpDeserializer<IndicesStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			IndicesStats::setupIndicesStatsDeserializer, Builder::build);

	protected static void setupIndicesStatsDeserializer(DelegatingDeserializer<IndicesStats.Builder> op) {

		op.add(Builder::primaries, IndexStats._DESERIALIZER, "primaries");
		op.add(Builder::shards,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.arrayDeserializer(ShardStats._DESERIALIZER)),
				"shards");
		op.add(Builder::total, IndexStats._DESERIALIZER, "total");
		op.add(Builder::uuid, JsonpDeserializer.stringDeserializer(), "uuid");

	}

}
