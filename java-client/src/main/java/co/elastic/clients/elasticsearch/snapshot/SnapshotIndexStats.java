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

package co.elastic.clients.elasticsearch.snapshot;

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
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: snapshot._types.SnapshotIndexStats
@JsonpDeserializable
public final class SnapshotIndexStats implements JsonpSerializable {
	private final Map<String, SnapshotShardsStatus> shards;

	private final ShardsStats shardsStats;

	private final SnapshotStats stats;

	// ---------------------------------------------------------------------------------------------

	public SnapshotIndexStats(Builder builder) {

		this.shards = ModelTypeHelper.unmodifiableNonNull(builder.shards, "shards");
		this.shardsStats = Objects.requireNonNull(builder.shardsStats, "shards_stats");
		this.stats = Objects.requireNonNull(builder.stats, "stats");

	}

	public SnapshotIndexStats(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code shards}
	 */
	public Map<String, SnapshotShardsStatus> shards() {
		return this.shards;
	}

	/**
	 * Required - API name: {@code shards_stats}
	 */
	public ShardsStats shardsStats() {
		return this.shardsStats;
	}

	/**
	 * Required - API name: {@code stats}
	 */
	public SnapshotStats stats() {
		return this.stats;
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

		generator.writeKey("shards");
		generator.writeStartObject();
		for (Map.Entry<String, SnapshotShardsStatus> item0 : this.shards.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("shards_stats");
		this.shardsStats.serialize(generator, mapper);

		generator.writeKey("stats");
		this.stats.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SnapshotIndexStats}.
	 */
	public static class Builder implements ObjectBuilder<SnapshotIndexStats> {
		private Map<String, SnapshotShardsStatus> shards;

		private ShardsStats shardsStats;

		private SnapshotStats stats;

		/**
		 * Required - API name: {@code shards}
		 */
		public Builder shards(Map<String, SnapshotShardsStatus> value) {
			this.shards = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #shards(Map)}, creating the map if needed.
		 */
		public Builder putShards(String key, SnapshotShardsStatus value) {
			if (this.shards == null) {
				this.shards = new HashMap<>();
			}
			this.shards.put(key, value);
			return this;
		}

		/**
		 * Set {@link #shards(Map)} to a singleton map.
		 */
		public Builder shards(String key,
				Function<SnapshotShardsStatus.Builder, ObjectBuilder<SnapshotShardsStatus>> fn) {
			return this.shards(Collections.singletonMap(key, fn.apply(new SnapshotShardsStatus.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #shards(Map)}, creating the map if needed.
		 */
		public Builder putShards(String key,
				Function<SnapshotShardsStatus.Builder, ObjectBuilder<SnapshotShardsStatus>> fn) {
			return this.putShards(key, fn.apply(new SnapshotShardsStatus.Builder()).build());
		}

		/**
		 * Required - API name: {@code shards_stats}
		 */
		public Builder shardsStats(ShardsStats value) {
			this.shardsStats = value;
			return this;
		}

		/**
		 * Required - API name: {@code shards_stats}
		 */
		public Builder shardsStats(Function<ShardsStats.Builder, ObjectBuilder<ShardsStats>> fn) {
			return this.shardsStats(fn.apply(new ShardsStats.Builder()).build());
		}

		/**
		 * Required - API name: {@code stats}
		 */
		public Builder stats(SnapshotStats value) {
			this.stats = value;
			return this;
		}

		/**
		 * Required - API name: {@code stats}
		 */
		public Builder stats(Function<SnapshotStats.Builder, ObjectBuilder<SnapshotStats>> fn) {
			return this.stats(fn.apply(new SnapshotStats.Builder()).build());
		}

		/**
		 * Builds a {@link SnapshotIndexStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SnapshotIndexStats build() {

			return new SnapshotIndexStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SnapshotIndexStats}
	 */
	public static final JsonpDeserializer<SnapshotIndexStats> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SnapshotIndexStats::setupSnapshotIndexStatsDeserializer, Builder::build);

	protected static void setupSnapshotIndexStatsDeserializer(DelegatingDeserializer<SnapshotIndexStats.Builder> op) {

		op.add(Builder::shards, JsonpDeserializer.stringMapDeserializer(SnapshotShardsStatus._DESERIALIZER), "shards");
		op.add(Builder::shardsStats, ShardsStats._DESERIALIZER, "shards_stats");
		op.add(Builder::stats, SnapshotStats._DESERIALIZER, "stats");

	}

}
