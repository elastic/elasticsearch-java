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

import co.elastic.clients.elasticsearch._types.BulkStats;
import co.elastic.clients.elasticsearch._types.CompletionStats;
import co.elastic.clients.elasticsearch._types.DocStats;
import co.elastic.clients.elasticsearch._types.FielddataStats;
import co.elastic.clients.elasticsearch._types.FlushStats;
import co.elastic.clients.elasticsearch._types.GetStats;
import co.elastic.clients.elasticsearch._types.IndexingStats;
import co.elastic.clients.elasticsearch._types.MergesStats;
import co.elastic.clients.elasticsearch._types.RecoveryStats;
import co.elastic.clients.elasticsearch._types.RefreshStats;
import co.elastic.clients.elasticsearch._types.RequestCacheStats;
import co.elastic.clients.elasticsearch._types.SearchStats;
import co.elastic.clients.elasticsearch._types.SegmentsStats;
import co.elastic.clients.elasticsearch._types.StoreStats;
import co.elastic.clients.elasticsearch._types.TranslogStats;
import co.elastic.clients.elasticsearch._types.WarmerStats;
import co.elastic.clients.json.JsonData;
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

// typedef: indices.stats.ShardStats

/**
 *
 * @see <a href="../../doc-files/api-spec.html#indices.stats.ShardStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class ShardStats implements JsonpSerializable {
	@Nullable
	private final ShardCommit commit;

	@Nullable
	private final CompletionStats completion;

	@Nullable
	private final DocStats docs;

	@Nullable
	private final FielddataStats fielddata;

	@Nullable
	private final FlushStats flush;

	@Nullable
	private final GetStats get;

	@Nullable
	private final IndexingStats indexing;

	@Nullable
	private final MappingStats mappings;

	@Nullable
	private final MergesStats merges;

	@Nullable
	private final ShardPath shardPath;

	@Nullable
	private final ShardQueryCache queryCache;

	@Nullable
	private final RecoveryStats recovery;

	@Nullable
	private final RefreshStats refresh;

	@Nullable
	private final RequestCacheStats requestCache;

	@Nullable
	private final ShardRetentionLeases retentionLeases;

	@Nullable
	private final ShardRouting routing;

	@Nullable
	private final SearchStats search;

	@Nullable
	private final SegmentsStats segments;

	@Nullable
	private final ShardSequenceNumber seqNo;

	@Nullable
	private final StoreStats store;

	@Nullable
	private final TranslogStats translog;

	@Nullable
	private final WarmerStats warmer;

	@Nullable
	private final BulkStats bulk;

	private final Map<String, JsonData> shards;

	@Nullable
	private final ShardsTotalStats shardStats;

	@Nullable
	private final IndicesStats indices;

	// ---------------------------------------------------------------------------------------------

	private ShardStats(Builder builder) {

		this.commit = builder.commit;
		this.completion = builder.completion;
		this.docs = builder.docs;
		this.fielddata = builder.fielddata;
		this.flush = builder.flush;
		this.get = builder.get;
		this.indexing = builder.indexing;
		this.mappings = builder.mappings;
		this.merges = builder.merges;
		this.shardPath = builder.shardPath;
		this.queryCache = builder.queryCache;
		this.recovery = builder.recovery;
		this.refresh = builder.refresh;
		this.requestCache = builder.requestCache;
		this.retentionLeases = builder.retentionLeases;
		this.routing = builder.routing;
		this.search = builder.search;
		this.segments = builder.segments;
		this.seqNo = builder.seqNo;
		this.store = builder.store;
		this.translog = builder.translog;
		this.warmer = builder.warmer;
		this.bulk = builder.bulk;
		this.shards = ApiTypeHelper.unmodifiable(builder.shards);
		this.shardStats = builder.shardStats;
		this.indices = builder.indices;

	}

	public static ShardStats of(Function<Builder, ObjectBuilder<ShardStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code commit}
	 */
	@Nullable
	public final ShardCommit commit() {
		return this.commit;
	}

	/**
	 * API name: {@code completion}
	 */
	@Nullable
	public final CompletionStats completion() {
		return this.completion;
	}

	/**
	 * API name: {@code docs}
	 */
	@Nullable
	public final DocStats docs() {
		return this.docs;
	}

	/**
	 * API name: {@code fielddata}
	 */
	@Nullable
	public final FielddataStats fielddata() {
		return this.fielddata;
	}

	/**
	 * API name: {@code flush}
	 */
	@Nullable
	public final FlushStats flush() {
		return this.flush;
	}

	/**
	 * API name: {@code get}
	 */
	@Nullable
	public final GetStats get() {
		return this.get;
	}

	/**
	 * API name: {@code indexing}
	 */
	@Nullable
	public final IndexingStats indexing() {
		return this.indexing;
	}

	/**
	 * API name: {@code mappings}
	 */
	@Nullable
	public final MappingStats mappings() {
		return this.mappings;
	}

	/**
	 * API name: {@code merges}
	 */
	@Nullable
	public final MergesStats merges() {
		return this.merges;
	}

	/**
	 * API name: {@code shard_path}
	 */
	@Nullable
	public final ShardPath shardPath() {
		return this.shardPath;
	}

	/**
	 * API name: {@code query_cache}
	 */
	@Nullable
	public final ShardQueryCache queryCache() {
		return this.queryCache;
	}

	/**
	 * API name: {@code recovery}
	 */
	@Nullable
	public final RecoveryStats recovery() {
		return this.recovery;
	}

	/**
	 * API name: {@code refresh}
	 */
	@Nullable
	public final RefreshStats refresh() {
		return this.refresh;
	}

	/**
	 * API name: {@code request_cache}
	 */
	@Nullable
	public final RequestCacheStats requestCache() {
		return this.requestCache;
	}

	/**
	 * API name: {@code retention_leases}
	 */
	@Nullable
	public final ShardRetentionLeases retentionLeases() {
		return this.retentionLeases;
	}

	/**
	 * API name: {@code routing}
	 */
	@Nullable
	public final ShardRouting routing() {
		return this.routing;
	}

	/**
	 * API name: {@code search}
	 */
	@Nullable
	public final SearchStats search() {
		return this.search;
	}

	/**
	 * API name: {@code segments}
	 */
	@Nullable
	public final SegmentsStats segments() {
		return this.segments;
	}

	/**
	 * API name: {@code seq_no}
	 */
	@Nullable
	public final ShardSequenceNumber seqNo() {
		return this.seqNo;
	}

	/**
	 * API name: {@code store}
	 */
	@Nullable
	public final StoreStats store() {
		return this.store;
	}

	/**
	 * API name: {@code translog}
	 */
	@Nullable
	public final TranslogStats translog() {
		return this.translog;
	}

	/**
	 * API name: {@code warmer}
	 */
	@Nullable
	public final WarmerStats warmer() {
		return this.warmer;
	}

	/**
	 * API name: {@code bulk}
	 */
	@Nullable
	public final BulkStats bulk() {
		return this.bulk;
	}

	/**
	 * API name: {@code shards}
	 */
	public final Map<String, JsonData> shards() {
		return this.shards;
	}

	/**
	 * API name: {@code shard_stats}
	 */
	@Nullable
	public final ShardsTotalStats shardStats() {
		return this.shardStats;
	}

	/**
	 * API name: {@code indices}
	 */
	@Nullable
	public final IndicesStats indices() {
		return this.indices;
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

		if (this.commit != null) {
			generator.writeKey("commit");
			this.commit.serialize(generator, mapper);

		}
		if (this.completion != null) {
			generator.writeKey("completion");
			this.completion.serialize(generator, mapper);

		}
		if (this.docs != null) {
			generator.writeKey("docs");
			this.docs.serialize(generator, mapper);

		}
		if (this.fielddata != null) {
			generator.writeKey("fielddata");
			this.fielddata.serialize(generator, mapper);

		}
		if (this.flush != null) {
			generator.writeKey("flush");
			this.flush.serialize(generator, mapper);

		}
		if (this.get != null) {
			generator.writeKey("get");
			this.get.serialize(generator, mapper);

		}
		if (this.indexing != null) {
			generator.writeKey("indexing");
			this.indexing.serialize(generator, mapper);

		}
		if (this.mappings != null) {
			generator.writeKey("mappings");
			this.mappings.serialize(generator, mapper);

		}
		if (this.merges != null) {
			generator.writeKey("merges");
			this.merges.serialize(generator, mapper);

		}
		if (this.shardPath != null) {
			generator.writeKey("shard_path");
			this.shardPath.serialize(generator, mapper);

		}
		if (this.queryCache != null) {
			generator.writeKey("query_cache");
			this.queryCache.serialize(generator, mapper);

		}
		if (this.recovery != null) {
			generator.writeKey("recovery");
			this.recovery.serialize(generator, mapper);

		}
		if (this.refresh != null) {
			generator.writeKey("refresh");
			this.refresh.serialize(generator, mapper);

		}
		if (this.requestCache != null) {
			generator.writeKey("request_cache");
			this.requestCache.serialize(generator, mapper);

		}
		if (this.retentionLeases != null) {
			generator.writeKey("retention_leases");
			this.retentionLeases.serialize(generator, mapper);

		}
		if (this.routing != null) {
			generator.writeKey("routing");
			this.routing.serialize(generator, mapper);

		}
		if (this.search != null) {
			generator.writeKey("search");
			this.search.serialize(generator, mapper);

		}
		if (this.segments != null) {
			generator.writeKey("segments");
			this.segments.serialize(generator, mapper);

		}
		if (this.seqNo != null) {
			generator.writeKey("seq_no");
			this.seqNo.serialize(generator, mapper);

		}
		if (this.store != null) {
			generator.writeKey("store");
			this.store.serialize(generator, mapper);

		}
		if (this.translog != null) {
			generator.writeKey("translog");
			this.translog.serialize(generator, mapper);

		}
		if (this.warmer != null) {
			generator.writeKey("warmer");
			this.warmer.serialize(generator, mapper);

		}
		if (this.bulk != null) {
			generator.writeKey("bulk");
			this.bulk.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.shards)) {
			generator.writeKey("shards");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.shards.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.shardStats != null) {
			generator.writeKey("shard_stats");
			this.shardStats.serialize(generator, mapper);

		}
		if (this.indices != null) {
			generator.writeKey("indices");
			this.indices.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShardStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ShardStats> {
		@Nullable
		private ShardCommit commit;

		@Nullable
		private CompletionStats completion;

		@Nullable
		private DocStats docs;

		@Nullable
		private FielddataStats fielddata;

		@Nullable
		private FlushStats flush;

		@Nullable
		private GetStats get;

		@Nullable
		private IndexingStats indexing;

		@Nullable
		private MappingStats mappings;

		@Nullable
		private MergesStats merges;

		@Nullable
		private ShardPath shardPath;

		@Nullable
		private ShardQueryCache queryCache;

		@Nullable
		private RecoveryStats recovery;

		@Nullable
		private RefreshStats refresh;

		@Nullable
		private RequestCacheStats requestCache;

		@Nullable
		private ShardRetentionLeases retentionLeases;

		@Nullable
		private ShardRouting routing;

		@Nullable
		private SearchStats search;

		@Nullable
		private SegmentsStats segments;

		@Nullable
		private ShardSequenceNumber seqNo;

		@Nullable
		private StoreStats store;

		@Nullable
		private TranslogStats translog;

		@Nullable
		private WarmerStats warmer;

		@Nullable
		private BulkStats bulk;

		@Nullable
		private Map<String, JsonData> shards;

		@Nullable
		private ShardsTotalStats shardStats;

		@Nullable
		private IndicesStats indices;

		/**
		 * API name: {@code commit}
		 */
		public final Builder commit(@Nullable ShardCommit value) {
			this.commit = value;
			return this;
		}

		/**
		 * API name: {@code commit}
		 */
		public final Builder commit(Function<ShardCommit.Builder, ObjectBuilder<ShardCommit>> fn) {
			return this.commit(fn.apply(new ShardCommit.Builder()).build());
		}

		/**
		 * API name: {@code completion}
		 */
		public final Builder completion(@Nullable CompletionStats value) {
			this.completion = value;
			return this;
		}

		/**
		 * API name: {@code completion}
		 */
		public final Builder completion(Function<CompletionStats.Builder, ObjectBuilder<CompletionStats>> fn) {
			return this.completion(fn.apply(new CompletionStats.Builder()).build());
		}

		/**
		 * API name: {@code docs}
		 */
		public final Builder docs(@Nullable DocStats value) {
			this.docs = value;
			return this;
		}

		/**
		 * API name: {@code docs}
		 */
		public final Builder docs(Function<DocStats.Builder, ObjectBuilder<DocStats>> fn) {
			return this.docs(fn.apply(new DocStats.Builder()).build());
		}

		/**
		 * API name: {@code fielddata}
		 */
		public final Builder fielddata(@Nullable FielddataStats value) {
			this.fielddata = value;
			return this;
		}

		/**
		 * API name: {@code fielddata}
		 */
		public final Builder fielddata(Function<FielddataStats.Builder, ObjectBuilder<FielddataStats>> fn) {
			return this.fielddata(fn.apply(new FielddataStats.Builder()).build());
		}

		/**
		 * API name: {@code flush}
		 */
		public final Builder flush(@Nullable FlushStats value) {
			this.flush = value;
			return this;
		}

		/**
		 * API name: {@code flush}
		 */
		public final Builder flush(Function<FlushStats.Builder, ObjectBuilder<FlushStats>> fn) {
			return this.flush(fn.apply(new FlushStats.Builder()).build());
		}

		/**
		 * API name: {@code get}
		 */
		public final Builder get(@Nullable GetStats value) {
			this.get = value;
			return this;
		}

		/**
		 * API name: {@code get}
		 */
		public final Builder get(Function<GetStats.Builder, ObjectBuilder<GetStats>> fn) {
			return this.get(fn.apply(new GetStats.Builder()).build());
		}

		/**
		 * API name: {@code indexing}
		 */
		public final Builder indexing(@Nullable IndexingStats value) {
			this.indexing = value;
			return this;
		}

		/**
		 * API name: {@code indexing}
		 */
		public final Builder indexing(Function<IndexingStats.Builder, ObjectBuilder<IndexingStats>> fn) {
			return this.indexing(fn.apply(new IndexingStats.Builder()).build());
		}

		/**
		 * API name: {@code mappings}
		 */
		public final Builder mappings(@Nullable MappingStats value) {
			this.mappings = value;
			return this;
		}

		/**
		 * API name: {@code mappings}
		 */
		public final Builder mappings(Function<MappingStats.Builder, ObjectBuilder<MappingStats>> fn) {
			return this.mappings(fn.apply(new MappingStats.Builder()).build());
		}

		/**
		 * API name: {@code merges}
		 */
		public final Builder merges(@Nullable MergesStats value) {
			this.merges = value;
			return this;
		}

		/**
		 * API name: {@code merges}
		 */
		public final Builder merges(Function<MergesStats.Builder, ObjectBuilder<MergesStats>> fn) {
			return this.merges(fn.apply(new MergesStats.Builder()).build());
		}

		/**
		 * API name: {@code shard_path}
		 */
		public final Builder shardPath(@Nullable ShardPath value) {
			this.shardPath = value;
			return this;
		}

		/**
		 * API name: {@code shard_path}
		 */
		public final Builder shardPath(Function<ShardPath.Builder, ObjectBuilder<ShardPath>> fn) {
			return this.shardPath(fn.apply(new ShardPath.Builder()).build());
		}

		/**
		 * API name: {@code query_cache}
		 */
		public final Builder queryCache(@Nullable ShardQueryCache value) {
			this.queryCache = value;
			return this;
		}

		/**
		 * API name: {@code query_cache}
		 */
		public final Builder queryCache(Function<ShardQueryCache.Builder, ObjectBuilder<ShardQueryCache>> fn) {
			return this.queryCache(fn.apply(new ShardQueryCache.Builder()).build());
		}

		/**
		 * API name: {@code recovery}
		 */
		public final Builder recovery(@Nullable RecoveryStats value) {
			this.recovery = value;
			return this;
		}

		/**
		 * API name: {@code recovery}
		 */
		public final Builder recovery(Function<RecoveryStats.Builder, ObjectBuilder<RecoveryStats>> fn) {
			return this.recovery(fn.apply(new RecoveryStats.Builder()).build());
		}

		/**
		 * API name: {@code refresh}
		 */
		public final Builder refresh(@Nullable RefreshStats value) {
			this.refresh = value;
			return this;
		}

		/**
		 * API name: {@code refresh}
		 */
		public final Builder refresh(Function<RefreshStats.Builder, ObjectBuilder<RefreshStats>> fn) {
			return this.refresh(fn.apply(new RefreshStats.Builder()).build());
		}

		/**
		 * API name: {@code request_cache}
		 */
		public final Builder requestCache(@Nullable RequestCacheStats value) {
			this.requestCache = value;
			return this;
		}

		/**
		 * API name: {@code request_cache}
		 */
		public final Builder requestCache(Function<RequestCacheStats.Builder, ObjectBuilder<RequestCacheStats>> fn) {
			return this.requestCache(fn.apply(new RequestCacheStats.Builder()).build());
		}

		/**
		 * API name: {@code retention_leases}
		 */
		public final Builder retentionLeases(@Nullable ShardRetentionLeases value) {
			this.retentionLeases = value;
			return this;
		}

		/**
		 * API name: {@code retention_leases}
		 */
		public final Builder retentionLeases(
				Function<ShardRetentionLeases.Builder, ObjectBuilder<ShardRetentionLeases>> fn) {
			return this.retentionLeases(fn.apply(new ShardRetentionLeases.Builder()).build());
		}

		/**
		 * API name: {@code routing}
		 */
		public final Builder routing(@Nullable ShardRouting value) {
			this.routing = value;
			return this;
		}

		/**
		 * API name: {@code routing}
		 */
		public final Builder routing(Function<ShardRouting.Builder, ObjectBuilder<ShardRouting>> fn) {
			return this.routing(fn.apply(new ShardRouting.Builder()).build());
		}

		/**
		 * API name: {@code search}
		 */
		public final Builder search(@Nullable SearchStats value) {
			this.search = value;
			return this;
		}

		/**
		 * API name: {@code search}
		 */
		public final Builder search(Function<SearchStats.Builder, ObjectBuilder<SearchStats>> fn) {
			return this.search(fn.apply(new SearchStats.Builder()).build());
		}

		/**
		 * API name: {@code segments}
		 */
		public final Builder segments(@Nullable SegmentsStats value) {
			this.segments = value;
			return this;
		}

		/**
		 * API name: {@code segments}
		 */
		public final Builder segments(Function<SegmentsStats.Builder, ObjectBuilder<SegmentsStats>> fn) {
			return this.segments(fn.apply(new SegmentsStats.Builder()).build());
		}

		/**
		 * API name: {@code seq_no}
		 */
		public final Builder seqNo(@Nullable ShardSequenceNumber value) {
			this.seqNo = value;
			return this;
		}

		/**
		 * API name: {@code seq_no}
		 */
		public final Builder seqNo(Function<ShardSequenceNumber.Builder, ObjectBuilder<ShardSequenceNumber>> fn) {
			return this.seqNo(fn.apply(new ShardSequenceNumber.Builder()).build());
		}

		/**
		 * API name: {@code store}
		 */
		public final Builder store(@Nullable StoreStats value) {
			this.store = value;
			return this;
		}

		/**
		 * API name: {@code store}
		 */
		public final Builder store(Function<StoreStats.Builder, ObjectBuilder<StoreStats>> fn) {
			return this.store(fn.apply(new StoreStats.Builder()).build());
		}

		/**
		 * API name: {@code translog}
		 */
		public final Builder translog(@Nullable TranslogStats value) {
			this.translog = value;
			return this;
		}

		/**
		 * API name: {@code translog}
		 */
		public final Builder translog(Function<TranslogStats.Builder, ObjectBuilder<TranslogStats>> fn) {
			return this.translog(fn.apply(new TranslogStats.Builder()).build());
		}

		/**
		 * API name: {@code warmer}
		 */
		public final Builder warmer(@Nullable WarmerStats value) {
			this.warmer = value;
			return this;
		}

		/**
		 * API name: {@code warmer}
		 */
		public final Builder warmer(Function<WarmerStats.Builder, ObjectBuilder<WarmerStats>> fn) {
			return this.warmer(fn.apply(new WarmerStats.Builder()).build());
		}

		/**
		 * API name: {@code bulk}
		 */
		public final Builder bulk(@Nullable BulkStats value) {
			this.bulk = value;
			return this;
		}

		/**
		 * API name: {@code bulk}
		 */
		public final Builder bulk(Function<BulkStats.Builder, ObjectBuilder<BulkStats>> fn) {
			return this.bulk(fn.apply(new BulkStats.Builder()).build());
		}

		/**
		 * API name: {@code shards}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>shards</code>.
		 */
		public final Builder shards(Map<String, JsonData> map) {
			this.shards = _mapPutAll(this.shards, map);
			return this;
		}

		/**
		 * API name: {@code shards}
		 * <p>
		 * Adds an entry to <code>shards</code>.
		 */
		public final Builder shards(String key, JsonData value) {
			this.shards = _mapPut(this.shards, key, value);
			return this;
		}

		/**
		 * API name: {@code shard_stats}
		 */
		public final Builder shardStats(@Nullable ShardsTotalStats value) {
			this.shardStats = value;
			return this;
		}

		/**
		 * API name: {@code shard_stats}
		 */
		public final Builder shardStats(Function<ShardsTotalStats.Builder, ObjectBuilder<ShardsTotalStats>> fn) {
			return this.shardStats(fn.apply(new ShardsTotalStats.Builder()).build());
		}

		/**
		 * API name: {@code indices}
		 */
		public final Builder indices(@Nullable IndicesStats value) {
			this.indices = value;
			return this;
		}

		/**
		 * API name: {@code indices}
		 */
		public final Builder indices(Function<IndicesStats.Builder, ObjectBuilder<IndicesStats>> fn) {
			return this.indices(fn.apply(new IndicesStats.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ShardStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardStats build() {
			_checkSingleUse();

			return new ShardStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ShardStats}
	 */
	public static final JsonpDeserializer<ShardStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ShardStats::setupShardStatsDeserializer);

	protected static void setupShardStatsDeserializer(ObjectDeserializer<ShardStats.Builder> op) {

		op.add(Builder::commit, ShardCommit._DESERIALIZER, "commit");
		op.add(Builder::completion, CompletionStats._DESERIALIZER, "completion");
		op.add(Builder::docs, DocStats._DESERIALIZER, "docs");
		op.add(Builder::fielddata, FielddataStats._DESERIALIZER, "fielddata");
		op.add(Builder::flush, FlushStats._DESERIALIZER, "flush");
		op.add(Builder::get, GetStats._DESERIALIZER, "get");
		op.add(Builder::indexing, IndexingStats._DESERIALIZER, "indexing");
		op.add(Builder::mappings, MappingStats._DESERIALIZER, "mappings");
		op.add(Builder::merges, MergesStats._DESERIALIZER, "merges");
		op.add(Builder::shardPath, ShardPath._DESERIALIZER, "shard_path");
		op.add(Builder::queryCache, ShardQueryCache._DESERIALIZER, "query_cache");
		op.add(Builder::recovery, RecoveryStats._DESERIALIZER, "recovery");
		op.add(Builder::refresh, RefreshStats._DESERIALIZER, "refresh");
		op.add(Builder::requestCache, RequestCacheStats._DESERIALIZER, "request_cache");
		op.add(Builder::retentionLeases, ShardRetentionLeases._DESERIALIZER, "retention_leases");
		op.add(Builder::routing, ShardRouting._DESERIALIZER, "routing");
		op.add(Builder::search, SearchStats._DESERIALIZER, "search");
		op.add(Builder::segments, SegmentsStats._DESERIALIZER, "segments");
		op.add(Builder::seqNo, ShardSequenceNumber._DESERIALIZER, "seq_no");
		op.add(Builder::store, StoreStats._DESERIALIZER, "store");
		op.add(Builder::translog, TranslogStats._DESERIALIZER, "translog");
		op.add(Builder::warmer, WarmerStats._DESERIALIZER, "warmer");
		op.add(Builder::bulk, BulkStats._DESERIALIZER, "bulk");
		op.add(Builder::shards, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "shards");
		op.add(Builder::shardStats, ShardsTotalStats._DESERIALIZER, "shard_stats");
		op.add(Builder::indices, IndicesStats._DESERIALIZER, "indices");

	}

}
