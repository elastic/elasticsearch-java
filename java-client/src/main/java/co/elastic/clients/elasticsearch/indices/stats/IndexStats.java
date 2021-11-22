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
import co.elastic.clients.elasticsearch._types.QueryCacheStats;
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
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: indices.stats.IndexStats
@JsonpDeserializable
public class IndexStats implements JsonpSerializable {
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
	private final MergesStats merges;

	@Nullable
	private final QueryCacheStats queryCache;

	@Nullable
	private final RecoveryStats recovery;

	@Nullable
	private final RefreshStats refresh;

	@Nullable
	private final RequestCacheStats requestCache;

	@Nullable
	private final SearchStats search;

	@Nullable
	private final SegmentsStats segments;

	@Nullable
	private final StoreStats store;

	@Nullable
	private final TranslogStats translog;

	@Nullable
	private final WarmerStats warmer;

	@Nullable
	private final BulkStats bulk;

	@Nullable
	private final ShardsTotalStats shards;

	// ---------------------------------------------------------------------------------------------

	private IndexStats(Builder builder) {

		this.completion = builder.completion;
		this.docs = builder.docs;
		this.fielddata = builder.fielddata;
		this.flush = builder.flush;
		this.get = builder.get;
		this.indexing = builder.indexing;
		this.merges = builder.merges;
		this.queryCache = builder.queryCache;
		this.recovery = builder.recovery;
		this.refresh = builder.refresh;
		this.requestCache = builder.requestCache;
		this.search = builder.search;
		this.segments = builder.segments;
		this.store = builder.store;
		this.translog = builder.translog;
		this.warmer = builder.warmer;
		this.bulk = builder.bulk;
		this.shards = builder.shards;

	}

	public static IndexStats of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Contains statistics about completions across all shards assigned to the node.
	 * <p>
	 * API name: {@code completion}
	 */
	@Nullable
	public final CompletionStats completion() {
		return this.completion;
	}

	/**
	 * Contains statistics about documents across all primary shards assigned to the
	 * node.
	 * <p>
	 * API name: {@code docs}
	 */
	@Nullable
	public final DocStats docs() {
		return this.docs;
	}

	/**
	 * Contains statistics about the field data cache across all shards assigned to
	 * the node.
	 * <p>
	 * API name: {@code fielddata}
	 */
	@Nullable
	public final FielddataStats fielddata() {
		return this.fielddata;
	}

	/**
	 * Contains statistics about flush operations for the node.
	 * <p>
	 * API name: {@code flush}
	 */
	@Nullable
	public final FlushStats flush() {
		return this.flush;
	}

	/**
	 * Contains statistics about get operations for the node.
	 * <p>
	 * API name: {@code get}
	 */
	@Nullable
	public final GetStats get() {
		return this.get;
	}

	/**
	 * Contains statistics about indexing operations for the node.
	 * <p>
	 * API name: {@code indexing}
	 */
	@Nullable
	public final IndexingStats indexing() {
		return this.indexing;
	}

	/**
	 * Contains statistics about merge operations for the node.
	 * <p>
	 * API name: {@code merges}
	 */
	@Nullable
	public final MergesStats merges() {
		return this.merges;
	}

	/**
	 * Contains statistics about the query cache across all shards assigned to the
	 * node.
	 * <p>
	 * API name: {@code query_cache}
	 */
	@Nullable
	public final QueryCacheStats queryCache() {
		return this.queryCache;
	}

	/**
	 * Contains statistics about recovery operations for the node.
	 * <p>
	 * API name: {@code recovery}
	 */
	@Nullable
	public final RecoveryStats recovery() {
		return this.recovery;
	}

	/**
	 * Contains statistics about refresh operations for the node.
	 * <p>
	 * API name: {@code refresh}
	 */
	@Nullable
	public final RefreshStats refresh() {
		return this.refresh;
	}

	/**
	 * Contains statistics about the request cache across all shards assigned to the
	 * node.
	 * <p>
	 * API name: {@code request_cache}
	 */
	@Nullable
	public final RequestCacheStats requestCache() {
		return this.requestCache;
	}

	/**
	 * Contains statistics about search operations for the node.
	 * <p>
	 * API name: {@code search}
	 */
	@Nullable
	public final SearchStats search() {
		return this.search;
	}

	/**
	 * Contains statistics about segments across all shards assigned to the node.
	 * <p>
	 * API name: {@code segments}
	 */
	@Nullable
	public final SegmentsStats segments() {
		return this.segments;
	}

	/**
	 * Contains statistics about the size of shards assigned to the node.
	 * <p>
	 * API name: {@code store}
	 */
	@Nullable
	public final StoreStats store() {
		return this.store;
	}

	/**
	 * Contains statistics about transaction log operations for the node.
	 * <p>
	 * API name: {@code translog}
	 */
	@Nullable
	public final TranslogStats translog() {
		return this.translog;
	}

	/**
	 * Contains statistics about index warming operations for the node.
	 * <p>
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
	@Nullable
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
		if (this.merges != null) {
			generator.writeKey("merges");
			this.merges.serialize(generator, mapper);

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
		if (this.search != null) {
			generator.writeKey("search");
			this.search.serialize(generator, mapper);

		}
		if (this.segments != null) {
			generator.writeKey("segments");
			this.segments.serialize(generator, mapper);

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
		if (this.shards != null) {
			generator.writeKey("shards");
			this.shards.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexStats}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<IndexStats> {
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
		private MergesStats merges;

		@Nullable
		private QueryCacheStats queryCache;

		@Nullable
		private RecoveryStats recovery;

		@Nullable
		private RefreshStats refresh;

		@Nullable
		private RequestCacheStats requestCache;

		@Nullable
		private SearchStats search;

		@Nullable
		private SegmentsStats segments;

		@Nullable
		private StoreStats store;

		@Nullable
		private TranslogStats translog;

		@Nullable
		private WarmerStats warmer;

		@Nullable
		private BulkStats bulk;

		@Nullable
		private ShardsTotalStats shards;

		/**
		 * Contains statistics about completions across all shards assigned to the node.
		 * <p>
		 * API name: {@code completion}
		 */
		public final Builder completion(@Nullable CompletionStats value) {
			this.completion = value;
			return this;
		}

		/**
		 * Contains statistics about completions across all shards assigned to the node.
		 * <p>
		 * API name: {@code completion}
		 */
		public final Builder completion(Consumer<CompletionStats.Builder> fn) {
			CompletionStats.Builder builder = new CompletionStats.Builder();
			fn.accept(builder);
			return this.completion(builder.build());
		}

		/**
		 * Contains statistics about documents across all primary shards assigned to the
		 * node.
		 * <p>
		 * API name: {@code docs}
		 */
		public final Builder docs(@Nullable DocStats value) {
			this.docs = value;
			return this;
		}

		/**
		 * Contains statistics about documents across all primary shards assigned to the
		 * node.
		 * <p>
		 * API name: {@code docs}
		 */
		public final Builder docs(Consumer<DocStats.Builder> fn) {
			DocStats.Builder builder = new DocStats.Builder();
			fn.accept(builder);
			return this.docs(builder.build());
		}

		/**
		 * Contains statistics about the field data cache across all shards assigned to
		 * the node.
		 * <p>
		 * API name: {@code fielddata}
		 */
		public final Builder fielddata(@Nullable FielddataStats value) {
			this.fielddata = value;
			return this;
		}

		/**
		 * Contains statistics about the field data cache across all shards assigned to
		 * the node.
		 * <p>
		 * API name: {@code fielddata}
		 */
		public final Builder fielddata(Consumer<FielddataStats.Builder> fn) {
			FielddataStats.Builder builder = new FielddataStats.Builder();
			fn.accept(builder);
			return this.fielddata(builder.build());
		}

		/**
		 * Contains statistics about flush operations for the node.
		 * <p>
		 * API name: {@code flush}
		 */
		public final Builder flush(@Nullable FlushStats value) {
			this.flush = value;
			return this;
		}

		/**
		 * Contains statistics about flush operations for the node.
		 * <p>
		 * API name: {@code flush}
		 */
		public final Builder flush(Consumer<FlushStats.Builder> fn) {
			FlushStats.Builder builder = new FlushStats.Builder();
			fn.accept(builder);
			return this.flush(builder.build());
		}

		/**
		 * Contains statistics about get operations for the node.
		 * <p>
		 * API name: {@code get}
		 */
		public final Builder get(@Nullable GetStats value) {
			this.get = value;
			return this;
		}

		/**
		 * Contains statistics about get operations for the node.
		 * <p>
		 * API name: {@code get}
		 */
		public final Builder get(Consumer<GetStats.Builder> fn) {
			GetStats.Builder builder = new GetStats.Builder();
			fn.accept(builder);
			return this.get(builder.build());
		}

		/**
		 * Contains statistics about indexing operations for the node.
		 * <p>
		 * API name: {@code indexing}
		 */
		public final Builder indexing(@Nullable IndexingStats value) {
			this.indexing = value;
			return this;
		}

		/**
		 * Contains statistics about indexing operations for the node.
		 * <p>
		 * API name: {@code indexing}
		 */
		public final Builder indexing(Consumer<IndexingStats.Builder> fn) {
			IndexingStats.Builder builder = new IndexingStats.Builder();
			fn.accept(builder);
			return this.indexing(builder.build());
		}

		/**
		 * Contains statistics about merge operations for the node.
		 * <p>
		 * API name: {@code merges}
		 */
		public final Builder merges(@Nullable MergesStats value) {
			this.merges = value;
			return this;
		}

		/**
		 * Contains statistics about merge operations for the node.
		 * <p>
		 * API name: {@code merges}
		 */
		public final Builder merges(Consumer<MergesStats.Builder> fn) {
			MergesStats.Builder builder = new MergesStats.Builder();
			fn.accept(builder);
			return this.merges(builder.build());
		}

		/**
		 * Contains statistics about the query cache across all shards assigned to the
		 * node.
		 * <p>
		 * API name: {@code query_cache}
		 */
		public final Builder queryCache(@Nullable QueryCacheStats value) {
			this.queryCache = value;
			return this;
		}

		/**
		 * Contains statistics about the query cache across all shards assigned to the
		 * node.
		 * <p>
		 * API name: {@code query_cache}
		 */
		public final Builder queryCache(Consumer<QueryCacheStats.Builder> fn) {
			QueryCacheStats.Builder builder = new QueryCacheStats.Builder();
			fn.accept(builder);
			return this.queryCache(builder.build());
		}

		/**
		 * Contains statistics about recovery operations for the node.
		 * <p>
		 * API name: {@code recovery}
		 */
		public final Builder recovery(@Nullable RecoveryStats value) {
			this.recovery = value;
			return this;
		}

		/**
		 * Contains statistics about recovery operations for the node.
		 * <p>
		 * API name: {@code recovery}
		 */
		public final Builder recovery(Consumer<RecoveryStats.Builder> fn) {
			RecoveryStats.Builder builder = new RecoveryStats.Builder();
			fn.accept(builder);
			return this.recovery(builder.build());
		}

		/**
		 * Contains statistics about refresh operations for the node.
		 * <p>
		 * API name: {@code refresh}
		 */
		public final Builder refresh(@Nullable RefreshStats value) {
			this.refresh = value;
			return this;
		}

		/**
		 * Contains statistics about refresh operations for the node.
		 * <p>
		 * API name: {@code refresh}
		 */
		public final Builder refresh(Consumer<RefreshStats.Builder> fn) {
			RefreshStats.Builder builder = new RefreshStats.Builder();
			fn.accept(builder);
			return this.refresh(builder.build());
		}

		/**
		 * Contains statistics about the request cache across all shards assigned to the
		 * node.
		 * <p>
		 * API name: {@code request_cache}
		 */
		public final Builder requestCache(@Nullable RequestCacheStats value) {
			this.requestCache = value;
			return this;
		}

		/**
		 * Contains statistics about the request cache across all shards assigned to the
		 * node.
		 * <p>
		 * API name: {@code request_cache}
		 */
		public final Builder requestCache(Consumer<RequestCacheStats.Builder> fn) {
			RequestCacheStats.Builder builder = new RequestCacheStats.Builder();
			fn.accept(builder);
			return this.requestCache(builder.build());
		}

		/**
		 * Contains statistics about search operations for the node.
		 * <p>
		 * API name: {@code search}
		 */
		public final Builder search(@Nullable SearchStats value) {
			this.search = value;
			return this;
		}

		/**
		 * Contains statistics about search operations for the node.
		 * <p>
		 * API name: {@code search}
		 */
		public final Builder search(Consumer<SearchStats.Builder> fn) {
			SearchStats.Builder builder = new SearchStats.Builder();
			fn.accept(builder);
			return this.search(builder.build());
		}

		/**
		 * Contains statistics about segments across all shards assigned to the node.
		 * <p>
		 * API name: {@code segments}
		 */
		public final Builder segments(@Nullable SegmentsStats value) {
			this.segments = value;
			return this;
		}

		/**
		 * Contains statistics about segments across all shards assigned to the node.
		 * <p>
		 * API name: {@code segments}
		 */
		public final Builder segments(Consumer<SegmentsStats.Builder> fn) {
			SegmentsStats.Builder builder = new SegmentsStats.Builder();
			fn.accept(builder);
			return this.segments(builder.build());
		}

		/**
		 * Contains statistics about the size of shards assigned to the node.
		 * <p>
		 * API name: {@code store}
		 */
		public final Builder store(@Nullable StoreStats value) {
			this.store = value;
			return this;
		}

		/**
		 * Contains statistics about the size of shards assigned to the node.
		 * <p>
		 * API name: {@code store}
		 */
		public final Builder store(Consumer<StoreStats.Builder> fn) {
			StoreStats.Builder builder = new StoreStats.Builder();
			fn.accept(builder);
			return this.store(builder.build());
		}

		/**
		 * Contains statistics about transaction log operations for the node.
		 * <p>
		 * API name: {@code translog}
		 */
		public final Builder translog(@Nullable TranslogStats value) {
			this.translog = value;
			return this;
		}

		/**
		 * Contains statistics about transaction log operations for the node.
		 * <p>
		 * API name: {@code translog}
		 */
		public final Builder translog(Consumer<TranslogStats.Builder> fn) {
			TranslogStats.Builder builder = new TranslogStats.Builder();
			fn.accept(builder);
			return this.translog(builder.build());
		}

		/**
		 * Contains statistics about index warming operations for the node.
		 * <p>
		 * API name: {@code warmer}
		 */
		public final Builder warmer(@Nullable WarmerStats value) {
			this.warmer = value;
			return this;
		}

		/**
		 * Contains statistics about index warming operations for the node.
		 * <p>
		 * API name: {@code warmer}
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
		 * API name: {@code shards}
		 */
		public final Builder shards(@Nullable ShardsTotalStats value) {
			this.shards = value;
			return this;
		}

		/**
		 * API name: {@code shards}
		 */
		public final Builder shards(Consumer<ShardsTotalStats.Builder> fn) {
			ShardsTotalStats.Builder builder = new ShardsTotalStats.Builder();
			fn.accept(builder);
			return this.shards(builder.build());
		}

		/**
		 * Builds a {@link IndexStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexStats build() {
			_checkSingleUse();

			return new IndexStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndexStats}
	 */
	public static final JsonpDeserializer<IndexStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			IndexStats::setupIndexStatsDeserializer);

	protected static void setupIndexStatsDeserializer(ObjectDeserializer<IndexStats.Builder> op) {

		op.add(Builder::completion, CompletionStats._DESERIALIZER, "completion");
		op.add(Builder::docs, DocStats._DESERIALIZER, "docs");
		op.add(Builder::fielddata, FielddataStats._DESERIALIZER, "fielddata");
		op.add(Builder::flush, FlushStats._DESERIALIZER, "flush");
		op.add(Builder::get, GetStats._DESERIALIZER, "get");
		op.add(Builder::indexing, IndexingStats._DESERIALIZER, "indexing");
		op.add(Builder::merges, MergesStats._DESERIALIZER, "merges");
		op.add(Builder::queryCache, QueryCacheStats._DESERIALIZER, "query_cache");
		op.add(Builder::recovery, RecoveryStats._DESERIALIZER, "recovery");
		op.add(Builder::refresh, RefreshStats._DESERIALIZER, "refresh");
		op.add(Builder::requestCache, RequestCacheStats._DESERIALIZER, "request_cache");
		op.add(Builder::search, SearchStats._DESERIALIZER, "search");
		op.add(Builder::segments, SegmentsStats._DESERIALIZER, "segments");
		op.add(Builder::store, StoreStats._DESERIALIZER, "store");
		op.add(Builder::translog, TranslogStats._DESERIALIZER, "translog");
		op.add(Builder::warmer, WarmerStats._DESERIALIZER, "warmer");
		op.add(Builder::bulk, BulkStats._DESERIALIZER, "bulk");
		op.add(Builder::shards, ShardsTotalStats._DESERIALIZER, "shards");

	}

}
