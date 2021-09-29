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
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.stats.ShardStats
@JsonpDeserializable
public final class ShardStats implements JsonpSerializable {
	private final ShardCommit commit;

	private final CompletionStats completion;

	private final DocStats docs;

	private final FielddataStats fielddata;

	private final FlushStats flush;

	private final GetStats get;

	private final IndexingStats indexing;

	private final MergesStats merges;

	private final ShardPath shardPath;

	private final ShardQueryCache queryCache;

	private final RecoveryStats recovery;

	private final RefreshStats refresh;

	private final RequestCacheStats requestCache;

	private final ShardRetentionLeases retentionLeases;

	private final ShardRouting routing;

	private final SearchStats search;

	private final SegmentsStats segments;

	private final ShardSequenceNumber seqNo;

	private final StoreStats store;

	private final TranslogStats translog;

	private final WarmerStats warmer;

	@Nullable
	private final BulkStats bulk;

	private final ShardsTotalStats shards;

	// ---------------------------------------------------------------------------------------------

	public ShardStats(Builder builder) {

		this.commit = Objects.requireNonNull(builder.commit, "commit");
		this.completion = Objects.requireNonNull(builder.completion, "completion");
		this.docs = Objects.requireNonNull(builder.docs, "docs");
		this.fielddata = Objects.requireNonNull(builder.fielddata, "fielddata");
		this.flush = Objects.requireNonNull(builder.flush, "flush");
		this.get = Objects.requireNonNull(builder.get, "get");
		this.indexing = Objects.requireNonNull(builder.indexing, "indexing");
		this.merges = Objects.requireNonNull(builder.merges, "merges");
		this.shardPath = Objects.requireNonNull(builder.shardPath, "shard_path");
		this.queryCache = Objects.requireNonNull(builder.queryCache, "query_cache");
		this.recovery = Objects.requireNonNull(builder.recovery, "recovery");
		this.refresh = Objects.requireNonNull(builder.refresh, "refresh");
		this.requestCache = Objects.requireNonNull(builder.requestCache, "request_cache");
		this.retentionLeases = Objects.requireNonNull(builder.retentionLeases, "retention_leases");
		this.routing = Objects.requireNonNull(builder.routing, "routing");
		this.search = Objects.requireNonNull(builder.search, "search");
		this.segments = Objects.requireNonNull(builder.segments, "segments");
		this.seqNo = Objects.requireNonNull(builder.seqNo, "seq_no");
		this.store = Objects.requireNonNull(builder.store, "store");
		this.translog = Objects.requireNonNull(builder.translog, "translog");
		this.warmer = Objects.requireNonNull(builder.warmer, "warmer");
		this.bulk = builder.bulk;
		this.shards = Objects.requireNonNull(builder.shards, "shards");

	}

	public ShardStats(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code commit}
	 */
	public ShardCommit commit() {
		return this.commit;
	}

	/**
	 * API name: {@code completion}
	 */
	public CompletionStats completion() {
		return this.completion;
	}

	/**
	 * API name: {@code docs}
	 */
	public DocStats docs() {
		return this.docs;
	}

	/**
	 * API name: {@code fielddata}
	 */
	public FielddataStats fielddata() {
		return this.fielddata;
	}

	/**
	 * API name: {@code flush}
	 */
	public FlushStats flush() {
		return this.flush;
	}

	/**
	 * API name: {@code get}
	 */
	public GetStats get() {
		return this.get;
	}

	/**
	 * API name: {@code indexing}
	 */
	public IndexingStats indexing() {
		return this.indexing;
	}

	/**
	 * API name: {@code merges}
	 */
	public MergesStats merges() {
		return this.merges;
	}

	/**
	 * API name: {@code shard_path}
	 */
	public ShardPath shardPath() {
		return this.shardPath;
	}

	/**
	 * API name: {@code query_cache}
	 */
	public ShardQueryCache queryCache() {
		return this.queryCache;
	}

	/**
	 * API name: {@code recovery}
	 */
	public RecoveryStats recovery() {
		return this.recovery;
	}

	/**
	 * API name: {@code refresh}
	 */
	public RefreshStats refresh() {
		return this.refresh;
	}

	/**
	 * API name: {@code request_cache}
	 */
	public RequestCacheStats requestCache() {
		return this.requestCache;
	}

	/**
	 * API name: {@code retention_leases}
	 */
	public ShardRetentionLeases retentionLeases() {
		return this.retentionLeases;
	}

	/**
	 * API name: {@code routing}
	 */
	public ShardRouting routing() {
		return this.routing;
	}

	/**
	 * API name: {@code search}
	 */
	public SearchStats search() {
		return this.search;
	}

	/**
	 * API name: {@code segments}
	 */
	public SegmentsStats segments() {
		return this.segments;
	}

	/**
	 * API name: {@code seq_no}
	 */
	public ShardSequenceNumber seqNo() {
		return this.seqNo;
	}

	/**
	 * API name: {@code store}
	 */
	public StoreStats store() {
		return this.store;
	}

	/**
	 * API name: {@code translog}
	 */
	public TranslogStats translog() {
		return this.translog;
	}

	/**
	 * API name: {@code warmer}
	 */
	public WarmerStats warmer() {
		return this.warmer;
	}

	/**
	 * API name: {@code bulk}
	 */
	@Nullable
	public BulkStats bulk() {
		return this.bulk;
	}

	/**
	 * API name: {@code shards}
	 */
	public ShardsTotalStats shards() {
		return this.shards;
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

		generator.writeKey("commit");
		this.commit.serialize(generator, mapper);

		generator.writeKey("completion");
		this.completion.serialize(generator, mapper);

		generator.writeKey("docs");
		this.docs.serialize(generator, mapper);

		generator.writeKey("fielddata");
		this.fielddata.serialize(generator, mapper);

		generator.writeKey("flush");
		this.flush.serialize(generator, mapper);

		generator.writeKey("get");
		this.get.serialize(generator, mapper);

		generator.writeKey("indexing");
		this.indexing.serialize(generator, mapper);

		generator.writeKey("merges");
		this.merges.serialize(generator, mapper);

		generator.writeKey("shard_path");
		this.shardPath.serialize(generator, mapper);

		generator.writeKey("query_cache");
		this.queryCache.serialize(generator, mapper);

		generator.writeKey("recovery");
		this.recovery.serialize(generator, mapper);

		generator.writeKey("refresh");
		this.refresh.serialize(generator, mapper);

		generator.writeKey("request_cache");
		this.requestCache.serialize(generator, mapper);

		generator.writeKey("retention_leases");
		this.retentionLeases.serialize(generator, mapper);

		generator.writeKey("routing");
		this.routing.serialize(generator, mapper);

		generator.writeKey("search");
		this.search.serialize(generator, mapper);

		generator.writeKey("segments");
		this.segments.serialize(generator, mapper);

		generator.writeKey("seq_no");
		this.seqNo.serialize(generator, mapper);

		generator.writeKey("store");
		this.store.serialize(generator, mapper);

		generator.writeKey("translog");
		this.translog.serialize(generator, mapper);

		generator.writeKey("warmer");
		this.warmer.serialize(generator, mapper);

		if (this.bulk != null) {

			generator.writeKey("bulk");
			this.bulk.serialize(generator, mapper);

		}

		generator.writeKey("shards");
		this.shards.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShardStats}.
	 */
	public static class Builder implements ObjectBuilder<ShardStats> {
		private ShardCommit commit;

		private CompletionStats completion;

		private DocStats docs;

		private FielddataStats fielddata;

		private FlushStats flush;

		private GetStats get;

		private IndexingStats indexing;

		private MergesStats merges;

		private ShardPath shardPath;

		private ShardQueryCache queryCache;

		private RecoveryStats recovery;

		private RefreshStats refresh;

		private RequestCacheStats requestCache;

		private ShardRetentionLeases retentionLeases;

		private ShardRouting routing;

		private SearchStats search;

		private SegmentsStats segments;

		private ShardSequenceNumber seqNo;

		private StoreStats store;

		private TranslogStats translog;

		private WarmerStats warmer;

		@Nullable
		private BulkStats bulk;

		private ShardsTotalStats shards;

		/**
		 * API name: {@code commit}
		 */
		public Builder commit(ShardCommit value) {
			this.commit = value;
			return this;
		}

		/**
		 * API name: {@code commit}
		 */
		public Builder commit(Function<ShardCommit.Builder, ObjectBuilder<ShardCommit>> fn) {
			return this.commit(fn.apply(new ShardCommit.Builder()).build());
		}

		/**
		 * API name: {@code completion}
		 */
		public Builder completion(CompletionStats value) {
			this.completion = value;
			return this;
		}

		/**
		 * API name: {@code completion}
		 */
		public Builder completion(Function<CompletionStats.Builder, ObjectBuilder<CompletionStats>> fn) {
			return this.completion(fn.apply(new CompletionStats.Builder()).build());
		}

		/**
		 * API name: {@code docs}
		 */
		public Builder docs(DocStats value) {
			this.docs = value;
			return this;
		}

		/**
		 * API name: {@code docs}
		 */
		public Builder docs(Function<DocStats.Builder, ObjectBuilder<DocStats>> fn) {
			return this.docs(fn.apply(new DocStats.Builder()).build());
		}

		/**
		 * API name: {@code fielddata}
		 */
		public Builder fielddata(FielddataStats value) {
			this.fielddata = value;
			return this;
		}

		/**
		 * API name: {@code fielddata}
		 */
		public Builder fielddata(Function<FielddataStats.Builder, ObjectBuilder<FielddataStats>> fn) {
			return this.fielddata(fn.apply(new FielddataStats.Builder()).build());
		}

		/**
		 * API name: {@code flush}
		 */
		public Builder flush(FlushStats value) {
			this.flush = value;
			return this;
		}

		/**
		 * API name: {@code flush}
		 */
		public Builder flush(Function<FlushStats.Builder, ObjectBuilder<FlushStats>> fn) {
			return this.flush(fn.apply(new FlushStats.Builder()).build());
		}

		/**
		 * API name: {@code get}
		 */
		public Builder get(GetStats value) {
			this.get = value;
			return this;
		}

		/**
		 * API name: {@code get}
		 */
		public Builder get(Function<GetStats.Builder, ObjectBuilder<GetStats>> fn) {
			return this.get(fn.apply(new GetStats.Builder()).build());
		}

		/**
		 * API name: {@code indexing}
		 */
		public Builder indexing(IndexingStats value) {
			this.indexing = value;
			return this;
		}

		/**
		 * API name: {@code indexing}
		 */
		public Builder indexing(Function<IndexingStats.Builder, ObjectBuilder<IndexingStats>> fn) {
			return this.indexing(fn.apply(new IndexingStats.Builder()).build());
		}

		/**
		 * API name: {@code merges}
		 */
		public Builder merges(MergesStats value) {
			this.merges = value;
			return this;
		}

		/**
		 * API name: {@code merges}
		 */
		public Builder merges(Function<MergesStats.Builder, ObjectBuilder<MergesStats>> fn) {
			return this.merges(fn.apply(new MergesStats.Builder()).build());
		}

		/**
		 * API name: {@code shard_path}
		 */
		public Builder shardPath(ShardPath value) {
			this.shardPath = value;
			return this;
		}

		/**
		 * API name: {@code shard_path}
		 */
		public Builder shardPath(Function<ShardPath.Builder, ObjectBuilder<ShardPath>> fn) {
			return this.shardPath(fn.apply(new ShardPath.Builder()).build());
		}

		/**
		 * API name: {@code query_cache}
		 */
		public Builder queryCache(ShardQueryCache value) {
			this.queryCache = value;
			return this;
		}

		/**
		 * API name: {@code query_cache}
		 */
		public Builder queryCache(Function<ShardQueryCache.Builder, ObjectBuilder<ShardQueryCache>> fn) {
			return this.queryCache(fn.apply(new ShardQueryCache.Builder()).build());
		}

		/**
		 * API name: {@code recovery}
		 */
		public Builder recovery(RecoveryStats value) {
			this.recovery = value;
			return this;
		}

		/**
		 * API name: {@code recovery}
		 */
		public Builder recovery(Function<RecoveryStats.Builder, ObjectBuilder<RecoveryStats>> fn) {
			return this.recovery(fn.apply(new RecoveryStats.Builder()).build());
		}

		/**
		 * API name: {@code refresh}
		 */
		public Builder refresh(RefreshStats value) {
			this.refresh = value;
			return this;
		}

		/**
		 * API name: {@code refresh}
		 */
		public Builder refresh(Function<RefreshStats.Builder, ObjectBuilder<RefreshStats>> fn) {
			return this.refresh(fn.apply(new RefreshStats.Builder()).build());
		}

		/**
		 * API name: {@code request_cache}
		 */
		public Builder requestCache(RequestCacheStats value) {
			this.requestCache = value;
			return this;
		}

		/**
		 * API name: {@code request_cache}
		 */
		public Builder requestCache(Function<RequestCacheStats.Builder, ObjectBuilder<RequestCacheStats>> fn) {
			return this.requestCache(fn.apply(new RequestCacheStats.Builder()).build());
		}

		/**
		 * API name: {@code retention_leases}
		 */
		public Builder retentionLeases(ShardRetentionLeases value) {
			this.retentionLeases = value;
			return this;
		}

		/**
		 * API name: {@code retention_leases}
		 */
		public Builder retentionLeases(Function<ShardRetentionLeases.Builder, ObjectBuilder<ShardRetentionLeases>> fn) {
			return this.retentionLeases(fn.apply(new ShardRetentionLeases.Builder()).build());
		}

		/**
		 * API name: {@code routing}
		 */
		public Builder routing(ShardRouting value) {
			this.routing = value;
			return this;
		}

		/**
		 * API name: {@code routing}
		 */
		public Builder routing(Function<ShardRouting.Builder, ObjectBuilder<ShardRouting>> fn) {
			return this.routing(fn.apply(new ShardRouting.Builder()).build());
		}

		/**
		 * API name: {@code search}
		 */
		public Builder search(SearchStats value) {
			this.search = value;
			return this;
		}

		/**
		 * API name: {@code search}
		 */
		public Builder search(Function<SearchStats.Builder, ObjectBuilder<SearchStats>> fn) {
			return this.search(fn.apply(new SearchStats.Builder()).build());
		}

		/**
		 * API name: {@code segments}
		 */
		public Builder segments(SegmentsStats value) {
			this.segments = value;
			return this;
		}

		/**
		 * API name: {@code segments}
		 */
		public Builder segments(Function<SegmentsStats.Builder, ObjectBuilder<SegmentsStats>> fn) {
			return this.segments(fn.apply(new SegmentsStats.Builder()).build());
		}

		/**
		 * API name: {@code seq_no}
		 */
		public Builder seqNo(ShardSequenceNumber value) {
			this.seqNo = value;
			return this;
		}

		/**
		 * API name: {@code seq_no}
		 */
		public Builder seqNo(Function<ShardSequenceNumber.Builder, ObjectBuilder<ShardSequenceNumber>> fn) {
			return this.seqNo(fn.apply(new ShardSequenceNumber.Builder()).build());
		}

		/**
		 * API name: {@code store}
		 */
		public Builder store(StoreStats value) {
			this.store = value;
			return this;
		}

		/**
		 * API name: {@code store}
		 */
		public Builder store(Function<StoreStats.Builder, ObjectBuilder<StoreStats>> fn) {
			return this.store(fn.apply(new StoreStats.Builder()).build());
		}

		/**
		 * API name: {@code translog}
		 */
		public Builder translog(TranslogStats value) {
			this.translog = value;
			return this;
		}

		/**
		 * API name: {@code translog}
		 */
		public Builder translog(Function<TranslogStats.Builder, ObjectBuilder<TranslogStats>> fn) {
			return this.translog(fn.apply(new TranslogStats.Builder()).build());
		}

		/**
		 * API name: {@code warmer}
		 */
		public Builder warmer(WarmerStats value) {
			this.warmer = value;
			return this;
		}

		/**
		 * API name: {@code warmer}
		 */
		public Builder warmer(Function<WarmerStats.Builder, ObjectBuilder<WarmerStats>> fn) {
			return this.warmer(fn.apply(new WarmerStats.Builder()).build());
		}

		/**
		 * API name: {@code bulk}
		 */
		public Builder bulk(@Nullable BulkStats value) {
			this.bulk = value;
			return this;
		}

		/**
		 * API name: {@code bulk}
		 */
		public Builder bulk(Function<BulkStats.Builder, ObjectBuilder<BulkStats>> fn) {
			return this.bulk(fn.apply(new BulkStats.Builder()).build());
		}

		/**
		 * API name: {@code shards}
		 */
		public Builder shards(ShardsTotalStats value) {
			this.shards = value;
			return this;
		}

		/**
		 * API name: {@code shards}
		 */
		public Builder shards(Function<ShardsTotalStats.Builder, ObjectBuilder<ShardsTotalStats>> fn) {
			return this.shards(fn.apply(new ShardsTotalStats.Builder()).build());
		}

		/**
		 * Builds a {@link ShardStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardStats build() {

			return new ShardStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ShardStats}
	 */
	public static final JsonpDeserializer<ShardStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ShardStats::setupShardStatsDeserializer, Builder::build);

	protected static void setupShardStatsDeserializer(DelegatingDeserializer<ShardStats.Builder> op) {

		op.add(Builder::commit, ShardCommit._DESERIALIZER, "commit");
		op.add(Builder::completion, CompletionStats._DESERIALIZER, "completion");
		op.add(Builder::docs, DocStats._DESERIALIZER, "docs");
		op.add(Builder::fielddata, FielddataStats._DESERIALIZER, "fielddata");
		op.add(Builder::flush, FlushStats._DESERIALIZER, "flush");
		op.add(Builder::get, GetStats._DESERIALIZER, "get");
		op.add(Builder::indexing, IndexingStats._DESERIALIZER, "indexing");
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
		op.add(Builder::shards, ShardsTotalStats._DESERIALIZER, "shards");

	}

}
