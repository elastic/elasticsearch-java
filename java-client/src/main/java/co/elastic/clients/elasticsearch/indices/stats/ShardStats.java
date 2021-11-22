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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: indices.stats.ShardStats
@JsonpDeserializable
public class ShardStats implements JsonpSerializable {
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

	private ShardStats(Builder builder) {

		this.commit = ModelTypeHelper.requireNonNull(builder.commit, this, "commit");
		this.completion = ModelTypeHelper.requireNonNull(builder.completion, this, "completion");
		this.docs = ModelTypeHelper.requireNonNull(builder.docs, this, "docs");
		this.fielddata = ModelTypeHelper.requireNonNull(builder.fielddata, this, "fielddata");
		this.flush = ModelTypeHelper.requireNonNull(builder.flush, this, "flush");
		this.get = ModelTypeHelper.requireNonNull(builder.get, this, "get");
		this.indexing = ModelTypeHelper.requireNonNull(builder.indexing, this, "indexing");
		this.merges = ModelTypeHelper.requireNonNull(builder.merges, this, "merges");
		this.shardPath = ModelTypeHelper.requireNonNull(builder.shardPath, this, "shardPath");
		this.queryCache = ModelTypeHelper.requireNonNull(builder.queryCache, this, "queryCache");
		this.recovery = ModelTypeHelper.requireNonNull(builder.recovery, this, "recovery");
		this.refresh = ModelTypeHelper.requireNonNull(builder.refresh, this, "refresh");
		this.requestCache = ModelTypeHelper.requireNonNull(builder.requestCache, this, "requestCache");
		this.retentionLeases = ModelTypeHelper.requireNonNull(builder.retentionLeases, this, "retentionLeases");
		this.routing = ModelTypeHelper.requireNonNull(builder.routing, this, "routing");
		this.search = ModelTypeHelper.requireNonNull(builder.search, this, "search");
		this.segments = ModelTypeHelper.requireNonNull(builder.segments, this, "segments");
		this.seqNo = ModelTypeHelper.requireNonNull(builder.seqNo, this, "seqNo");
		this.store = ModelTypeHelper.requireNonNull(builder.store, this, "store");
		this.translog = ModelTypeHelper.requireNonNull(builder.translog, this, "translog");
		this.warmer = ModelTypeHelper.requireNonNull(builder.warmer, this, "warmer");
		this.bulk = builder.bulk;
		this.shards = ModelTypeHelper.requireNonNull(builder.shards, this, "shards");

	}

	public static ShardStats of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code commit}
	 */
	public final ShardCommit commit() {
		return this.commit;
	}

	/**
	 * Required - API name: {@code completion}
	 */
	public final CompletionStats completion() {
		return this.completion;
	}

	/**
	 * Required - API name: {@code docs}
	 */
	public final DocStats docs() {
		return this.docs;
	}

	/**
	 * Required - API name: {@code fielddata}
	 */
	public final FielddataStats fielddata() {
		return this.fielddata;
	}

	/**
	 * Required - API name: {@code flush}
	 */
	public final FlushStats flush() {
		return this.flush;
	}

	/**
	 * Required - API name: {@code get}
	 */
	public final GetStats get() {
		return this.get;
	}

	/**
	 * Required - API name: {@code indexing}
	 */
	public final IndexingStats indexing() {
		return this.indexing;
	}

	/**
	 * Required - API name: {@code merges}
	 */
	public final MergesStats merges() {
		return this.merges;
	}

	/**
	 * Required - API name: {@code shard_path}
	 */
	public final ShardPath shardPath() {
		return this.shardPath;
	}

	/**
	 * Required - API name: {@code query_cache}
	 */
	public final ShardQueryCache queryCache() {
		return this.queryCache;
	}

	/**
	 * Required - API name: {@code recovery}
	 */
	public final RecoveryStats recovery() {
		return this.recovery;
	}

	/**
	 * Required - API name: {@code refresh}
	 */
	public final RefreshStats refresh() {
		return this.refresh;
	}

	/**
	 * Required - API name: {@code request_cache}
	 */
	public final RequestCacheStats requestCache() {
		return this.requestCache;
	}

	/**
	 * Required - API name: {@code retention_leases}
	 */
	public final ShardRetentionLeases retentionLeases() {
		return this.retentionLeases;
	}

	/**
	 * Required - API name: {@code routing}
	 */
	public final ShardRouting routing() {
		return this.routing;
	}

	/**
	 * Required - API name: {@code search}
	 */
	public final SearchStats search() {
		return this.search;
	}

	/**
	 * Required - API name: {@code segments}
	 */
	public final SegmentsStats segments() {
		return this.segments;
	}

	/**
	 * Required - API name: {@code seq_no}
	 */
	public final ShardSequenceNumber seqNo() {
		return this.seqNo;
	}

	/**
	 * Required - API name: {@code store}
	 */
	public final StoreStats store() {
		return this.store;
	}

	/**
	 * Required - API name: {@code translog}
	 */
	public final TranslogStats translog() {
		return this.translog;
	}

	/**
	 * Required - API name: {@code warmer}
	 */
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
	 * Required - API name: {@code shards}
	 */
	public final ShardsTotalStats shards() {
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
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ShardStats> {
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
		 * Required - API name: {@code commit}
		 */
		public final Builder commit(ShardCommit value) {
			this.commit = value;
			return this;
		}

		/**
		 * Required - API name: {@code commit}
		 */
		public final Builder commit(Consumer<ShardCommit.Builder> fn) {
			ShardCommit.Builder builder = new ShardCommit.Builder();
			fn.accept(builder);
			return this.commit(builder.build());
		}

		/**
		 * Required - API name: {@code completion}
		 */
		public final Builder completion(CompletionStats value) {
			this.completion = value;
			return this;
		}

		/**
		 * Required - API name: {@code completion}
		 */
		public final Builder completion(Consumer<CompletionStats.Builder> fn) {
			CompletionStats.Builder builder = new CompletionStats.Builder();
			fn.accept(builder);
			return this.completion(builder.build());
		}

		/**
		 * Required - API name: {@code docs}
		 */
		public final Builder docs(DocStats value) {
			this.docs = value;
			return this;
		}

		/**
		 * Required - API name: {@code docs}
		 */
		public final Builder docs(Consumer<DocStats.Builder> fn) {
			DocStats.Builder builder = new DocStats.Builder();
			fn.accept(builder);
			return this.docs(builder.build());
		}

		/**
		 * Required - API name: {@code fielddata}
		 */
		public final Builder fielddata(FielddataStats value) {
			this.fielddata = value;
			return this;
		}

		/**
		 * Required - API name: {@code fielddata}
		 */
		public final Builder fielddata(Consumer<FielddataStats.Builder> fn) {
			FielddataStats.Builder builder = new FielddataStats.Builder();
			fn.accept(builder);
			return this.fielddata(builder.build());
		}

		/**
		 * Required - API name: {@code flush}
		 */
		public final Builder flush(FlushStats value) {
			this.flush = value;
			return this;
		}

		/**
		 * Required - API name: {@code flush}
		 */
		public final Builder flush(Consumer<FlushStats.Builder> fn) {
			FlushStats.Builder builder = new FlushStats.Builder();
			fn.accept(builder);
			return this.flush(builder.build());
		}

		/**
		 * Required - API name: {@code get}
		 */
		public final Builder get(GetStats value) {
			this.get = value;
			return this;
		}

		/**
		 * Required - API name: {@code get}
		 */
		public final Builder get(Consumer<GetStats.Builder> fn) {
			GetStats.Builder builder = new GetStats.Builder();
			fn.accept(builder);
			return this.get(builder.build());
		}

		/**
		 * Required - API name: {@code indexing}
		 */
		public final Builder indexing(IndexingStats value) {
			this.indexing = value;
			return this;
		}

		/**
		 * Required - API name: {@code indexing}
		 */
		public final Builder indexing(Consumer<IndexingStats.Builder> fn) {
			IndexingStats.Builder builder = new IndexingStats.Builder();
			fn.accept(builder);
			return this.indexing(builder.build());
		}

		/**
		 * Required - API name: {@code merges}
		 */
		public final Builder merges(MergesStats value) {
			this.merges = value;
			return this;
		}

		/**
		 * Required - API name: {@code merges}
		 */
		public final Builder merges(Consumer<MergesStats.Builder> fn) {
			MergesStats.Builder builder = new MergesStats.Builder();
			fn.accept(builder);
			return this.merges(builder.build());
		}

		/**
		 * Required - API name: {@code shard_path}
		 */
		public final Builder shardPath(ShardPath value) {
			this.shardPath = value;
			return this;
		}

		/**
		 * Required - API name: {@code shard_path}
		 */
		public final Builder shardPath(Consumer<ShardPath.Builder> fn) {
			ShardPath.Builder builder = new ShardPath.Builder();
			fn.accept(builder);
			return this.shardPath(builder.build());
		}

		/**
		 * Required - API name: {@code query_cache}
		 */
		public final Builder queryCache(ShardQueryCache value) {
			this.queryCache = value;
			return this;
		}

		/**
		 * Required - API name: {@code query_cache}
		 */
		public final Builder queryCache(Consumer<ShardQueryCache.Builder> fn) {
			ShardQueryCache.Builder builder = new ShardQueryCache.Builder();
			fn.accept(builder);
			return this.queryCache(builder.build());
		}

		/**
		 * Required - API name: {@code recovery}
		 */
		public final Builder recovery(RecoveryStats value) {
			this.recovery = value;
			return this;
		}

		/**
		 * Required - API name: {@code recovery}
		 */
		public final Builder recovery(Consumer<RecoveryStats.Builder> fn) {
			RecoveryStats.Builder builder = new RecoveryStats.Builder();
			fn.accept(builder);
			return this.recovery(builder.build());
		}

		/**
		 * Required - API name: {@code refresh}
		 */
		public final Builder refresh(RefreshStats value) {
			this.refresh = value;
			return this;
		}

		/**
		 * Required - API name: {@code refresh}
		 */
		public final Builder refresh(Consumer<RefreshStats.Builder> fn) {
			RefreshStats.Builder builder = new RefreshStats.Builder();
			fn.accept(builder);
			return this.refresh(builder.build());
		}

		/**
		 * Required - API name: {@code request_cache}
		 */
		public final Builder requestCache(RequestCacheStats value) {
			this.requestCache = value;
			return this;
		}

		/**
		 * Required - API name: {@code request_cache}
		 */
		public final Builder requestCache(Consumer<RequestCacheStats.Builder> fn) {
			RequestCacheStats.Builder builder = new RequestCacheStats.Builder();
			fn.accept(builder);
			return this.requestCache(builder.build());
		}

		/**
		 * Required - API name: {@code retention_leases}
		 */
		public final Builder retentionLeases(ShardRetentionLeases value) {
			this.retentionLeases = value;
			return this;
		}

		/**
		 * Required - API name: {@code retention_leases}
		 */
		public final Builder retentionLeases(Consumer<ShardRetentionLeases.Builder> fn) {
			ShardRetentionLeases.Builder builder = new ShardRetentionLeases.Builder();
			fn.accept(builder);
			return this.retentionLeases(builder.build());
		}

		/**
		 * Required - API name: {@code routing}
		 */
		public final Builder routing(ShardRouting value) {
			this.routing = value;
			return this;
		}

		/**
		 * Required - API name: {@code routing}
		 */
		public final Builder routing(Consumer<ShardRouting.Builder> fn) {
			ShardRouting.Builder builder = new ShardRouting.Builder();
			fn.accept(builder);
			return this.routing(builder.build());
		}

		/**
		 * Required - API name: {@code search}
		 */
		public final Builder search(SearchStats value) {
			this.search = value;
			return this;
		}

		/**
		 * Required - API name: {@code search}
		 */
		public final Builder search(Consumer<SearchStats.Builder> fn) {
			SearchStats.Builder builder = new SearchStats.Builder();
			fn.accept(builder);
			return this.search(builder.build());
		}

		/**
		 * Required - API name: {@code segments}
		 */
		public final Builder segments(SegmentsStats value) {
			this.segments = value;
			return this;
		}

		/**
		 * Required - API name: {@code segments}
		 */
		public final Builder segments(Consumer<SegmentsStats.Builder> fn) {
			SegmentsStats.Builder builder = new SegmentsStats.Builder();
			fn.accept(builder);
			return this.segments(builder.build());
		}

		/**
		 * Required - API name: {@code seq_no}
		 */
		public final Builder seqNo(ShardSequenceNumber value) {
			this.seqNo = value;
			return this;
		}

		/**
		 * Required - API name: {@code seq_no}
		 */
		public final Builder seqNo(Consumer<ShardSequenceNumber.Builder> fn) {
			ShardSequenceNumber.Builder builder = new ShardSequenceNumber.Builder();
			fn.accept(builder);
			return this.seqNo(builder.build());
		}

		/**
		 * Required - API name: {@code store}
		 */
		public final Builder store(StoreStats value) {
			this.store = value;
			return this;
		}

		/**
		 * Required - API name: {@code store}
		 */
		public final Builder store(Consumer<StoreStats.Builder> fn) {
			StoreStats.Builder builder = new StoreStats.Builder();
			fn.accept(builder);
			return this.store(builder.build());
		}

		/**
		 * Required - API name: {@code translog}
		 */
		public final Builder translog(TranslogStats value) {
			this.translog = value;
			return this;
		}

		/**
		 * Required - API name: {@code translog}
		 */
		public final Builder translog(Consumer<TranslogStats.Builder> fn) {
			TranslogStats.Builder builder = new TranslogStats.Builder();
			fn.accept(builder);
			return this.translog(builder.build());
		}

		/**
		 * Required - API name: {@code warmer}
		 */
		public final Builder warmer(WarmerStats value) {
			this.warmer = value;
			return this;
		}

		/**
		 * Required - API name: {@code warmer}
		 */
		public final Builder warmer(Consumer<WarmerStats.Builder> fn) {
			WarmerStats.Builder builder = new WarmerStats.Builder();
			fn.accept(builder);
			return this.warmer(builder.build());
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
		public final Builder bulk(Consumer<BulkStats.Builder> fn) {
			BulkStats.Builder builder = new BulkStats.Builder();
			fn.accept(builder);
			return this.bulk(builder.build());
		}

		/**
		 * Required - API name: {@code shards}
		 */
		public final Builder shards(ShardsTotalStats value) {
			this.shards = value;
			return this;
		}

		/**
		 * Required - API name: {@code shards}
		 */
		public final Builder shards(Consumer<ShardsTotalStats.Builder> fn) {
			ShardsTotalStats.Builder builder = new ShardsTotalStats.Builder();
			fn.accept(builder);
			return this.shards(builder.build());
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
