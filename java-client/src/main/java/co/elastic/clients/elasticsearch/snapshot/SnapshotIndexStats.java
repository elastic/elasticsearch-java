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

package co.elastic.clients.elasticsearch.snapshot;

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
import java.util.Map;
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

// typedef: snapshot._types.SnapshotIndexStats

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#snapshot._types.SnapshotIndexStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class SnapshotIndexStats implements JsonpSerializable {
	private final Map<String, SnapshotShardsStatus> shards;

	private final ShardsStats shardsStats;

	private final SnapshotStats stats;

	// ---------------------------------------------------------------------------------------------

	private SnapshotIndexStats(Builder builder) {

		this.shards = ApiTypeHelper.unmodifiableRequired(builder.shards, this, "shards");
		this.shardsStats = ApiTypeHelper.requireNonNull(builder.shardsStats, this, "shardsStats");
		this.stats = ApiTypeHelper.requireNonNull(builder.stats, this, "stats");

	}

	public static SnapshotIndexStats of(Function<Builder, ObjectBuilder<SnapshotIndexStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code shards}
	 */
	public final Map<String, SnapshotShardsStatus> shards() {
		return this.shards;
	}

	/**
	 * Required - API name: {@code shards_stats}
	 */
	public final ShardsStats shardsStats() {
		return this.shardsStats;
	}

	/**
	 * Required - API name: {@code stats}
	 */
	public final SnapshotStats stats() {
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

		if (ApiTypeHelper.isDefined(this.shards)) {
			generator.writeKey("shards");
			generator.writeStartObject();
			for (Map.Entry<String, SnapshotShardsStatus> item0 : this.shards.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("shards_stats");
		this.shardsStats.serialize(generator, mapper);

		generator.writeKey("stats");
		this.stats.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SnapshotIndexStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<SnapshotIndexStats> {
		private Map<String, SnapshotShardsStatus> shards;

		private ShardsStats shardsStats;

		private SnapshotStats stats;

		/**
		 * Required - API name: {@code shards}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>shards</code>.
		 */
		public final Builder shards(Map<String, SnapshotShardsStatus> map) {
			this.shards = _mapPutAll(this.shards, map);
			return this;
		}

		/**
		 * Required - API name: {@code shards}
		 * <p>
		 * Adds an entry to <code>shards</code>.
		 */
		public final Builder shards(String key, SnapshotShardsStatus value) {
			this.shards = _mapPut(this.shards, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code shards}
		 * <p>
		 * Adds an entry to <code>shards</code> using a builder lambda.
		 */
		public final Builder shards(String key,
				Function<SnapshotShardsStatus.Builder, ObjectBuilder<SnapshotShardsStatus>> fn) {
			return shards(key, fn.apply(new SnapshotShardsStatus.Builder()).build());
		}

		/**
		 * Required - API name: {@code shards_stats}
		 */
		public final Builder shardsStats(ShardsStats value) {
			this.shardsStats = value;
			return this;
		}

		/**
		 * Required - API name: {@code shards_stats}
		 */
		public final Builder shardsStats(Function<ShardsStats.Builder, ObjectBuilder<ShardsStats>> fn) {
			return this.shardsStats(fn.apply(new ShardsStats.Builder()).build());
		}

		/**
		 * Required - API name: {@code stats}
		 */
		public final Builder stats(SnapshotStats value) {
			this.stats = value;
			return this;
		}

		/**
		 * Required - API name: {@code stats}
		 */
		public final Builder stats(Function<SnapshotStats.Builder, ObjectBuilder<SnapshotStats>> fn) {
			return this.stats(fn.apply(new SnapshotStats.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SnapshotIndexStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SnapshotIndexStats build() {
			_checkSingleUse();

			return new SnapshotIndexStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SnapshotIndexStats}
	 */
	public static final JsonpDeserializer<SnapshotIndexStats> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SnapshotIndexStats::setupSnapshotIndexStatsDeserializer);

	protected static void setupSnapshotIndexStatsDeserializer(ObjectDeserializer<SnapshotIndexStats.Builder> op) {

		op.add(Builder::shards, JsonpDeserializer.stringMapDeserializer(SnapshotShardsStatus._DESERIALIZER), "shards");
		op.add(Builder::shardsStats, ShardsStats._DESERIALIZER, "shards_stats");
		op.add(Builder::stats, SnapshotStats._DESERIALIZER, "stats");

	}

}
