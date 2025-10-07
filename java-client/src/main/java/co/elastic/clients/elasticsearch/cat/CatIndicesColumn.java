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

package co.elastic.clients.elasticsearch.cat;

import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;

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

/**
 *
 * @see <a href="../doc-files/api-spec.html#cat._types.CatIndicesColumn">API
 *      specification</a>
 */
@JsonpDeserializable
public enum CatIndicesColumn implements JsonEnum {
	/**
	 * The current health status.
	 */
	Health("health", "h"),

	/**
	 * The open/close status.
	 */
	Status("status", "s"),

	/**
	 * The index name.
	 */
	Index("index", "i", "idx"),

	/**
	 * The index UUID.
	 */
	Uuid("uuid", "id", "uuid"),

	/**
	 * The number of primary shards.
	 */
	Pri("pri", "p", "shards.primary", "shardsPrimary"),

	/**
	 * The number of replica shards.
	 */
	Rep("rep", "r", "shards.replica", "shardsReplica"),

	/**
	 * The number of available documents.
	 */
	DocsCount("docs.count", "dc", "docsCount"),

	/**
	 * The number of deleted documents.
	 */
	DocsDeleted("docs.deleted", "dd", "docsDeleted"),

	/**
	 * The index creation date (millisecond value).
	 */
	CreationDate("creation.date", "cd"),

	/**
	 * The index creation date (as string).
	 */
	CreationDateString("creation.date.string", "cds"),

	/**
	 * The store size of primaries and replicas.
	 */
	StoreSize("store.size", "ss", "storeSize"),

	/**
	 * The store size of primaries.
	 */
	PriStoreSize("pri.store.size"),

	/**
	 * The total size of the dataset.
	 */
	DatasetSize("dataset.size"),

	/**
	 * The size of completion for primaries and replicas.
	 */
	CompletionSize("completion.size", "cs", "completionSize"),

	/**
	 * The size of completion for primaries.
	 */
	PriCompletionSize("pri.completion.size"),

	/**
	 * The used fielddata cache for primaries and replicas.
	 */
	FielddataMemorySize("fielddata.memory_size", "fm", "fielddataMemory"),

	/**
	 * The used fielddata cache for primaries.
	 */
	PriFielddataMemorySize("pri.fielddata.memory_size"),

	/**
	 * The number of fielddata evictions for primaries and replicas.
	 */
	FielddataEvictions("fielddata.evictions", "fe", "fielddataEvictions"),

	/**
	 * The number of fielddata evictions for primaries.
	 */
	PriFielddataEvictions("pri.fielddata.evictions"),

	/**
	 * The used query cache for primaries and replicas.
	 */
	QueryCacheMemorySize("query_cache.memory_size", "qcm", "queryCacheMemory"),

	/**
	 * The used query cache for primaries.
	 */
	PriQueryCacheMemorySize("pri.query_cache.memory_size"),

	/**
	 * The number of query cache evictions for primaries and replicas.
	 */
	QueryCacheEvictions("query_cache.evictions", "qce", "queryCacheEvictions"),

	/**
	 * The number of query cache evictions for primaries.
	 */
	PriQueryCacheEvictions("pri.query_cache.evictions"),

	/**
	 * The used request cache for primaries and replicas.
	 */
	RequestCacheMemorySize("request_cache.memory_size", "rcm", "requestCacheMemory"),

	/**
	 * The used request cache for primaries.
	 */
	PriRequestCacheMemorySize("pri.request_cache.memory_size"),

	/**
	 * The number of request cache evictions for primaries and replicas.
	 */
	RequestCacheEvictions("request_cache.evictions", "rce", "requestCacheEvictions"),

	/**
	 * The number of request cache evictions for primaries.
	 */
	PriRequestCacheEvictions("pri.request_cache.evictions"),

	/**
	 * The request cache hit count for primaries and replicas.
	 */
	RequestCacheHitCount("request_cache.hit_count", "rchc", "requestCacheHitCount"),

	/**
	 * The request cache hit count for primaries.
	 */
	PriRequestCacheHitCount("pri.request_cache.hit_count"),

	/**
	 * The request cache miss count for primaries and replicas.
	 */
	RequestCacheMissCount("request_cache.miss_count", "rcmc", "requestCacheMissCount"),

	/**
	 * The request cache miss count for primaries.
	 */
	PriRequestCacheMissCount("pri.request_cache.miss_count"),

	/**
	 * The number of flushes for primaries and replicas.
	 */
	FlushTotal("flush.total", "ft", "flushTotal"),

	/**
	 * The number of flushes for primaries.
	 */
	PriFlushTotal("pri.flush.total"),

	/**
	 * The time spent in flush for primaries and replicas.
	 */
	FlushTotalTime("flush.total_time", "ftt", "flushTotalTime"),

	/**
	 * The time spent in flush for primaries.
	 */
	PriFlushTotalTime("pri.flush.total_time"),

	/**
	 * The number of current get operations for primaries and replicas.
	 */
	GetCurrent("get.current", "gc", "getCurrent"),

	/**
	 * The number of current get operations for primaries.
	 */
	PriGetCurrent("pri.get.current"),

	/**
	 * The time spent in get for primaries and replicas.
	 */
	GetTime("get.time", "gti", "getTime"),

	/**
	 * The time spent in get for primaries.
	 */
	PriGetTime("pri.get.time"),

	/**
	 * The number of get operations for primaries and replicas.
	 */
	GetTotal("get.total", "gto", "getTotal"),

	/**
	 * The number of get operations for primaries.
	 */
	PriGetTotal("pri.get.total"),

	/**
	 * The time spent in successful gets for primaries and replicas.
	 */
	GetExistsTime("get.exists_time", "geti", "getExistsTime"),

	/**
	 * The time spent in successful gets for primaries.
	 */
	PriGetExistsTime("pri.get.exists_time"),

	/**
	 * The number of successful gets for primaries and replicas.
	 */
	GetExistsTotal("get.exists_total", "geto", "getExistsTotal"),

	/**
	 * The number of successful gets for primaries.
	 */
	PriGetExistsTotal("pri.get.exists_total"),

	/**
	 * The time spent in failed gets for primaries and replicas.
	 */
	GetMissingTime("get.missing_time", "gmti", "getMissingTime"),

	/**
	 * The time spent in failed gets for primaries.
	 */
	PriGetMissingTime("pri.get.missing_time"),

	/**
	 * The number of failed gets for primaries and replicas.
	 */
	GetMissingTotal("get.missing_total", "gmto", "getMissingTotal"),

	/**
	 * The number of failed gets for primaries.
	 */
	PriGetMissingTotal("pri.get.missing_total"),

	/**
	 * The number of current deletions for primaries and replicas.
	 */
	IndexingDeleteCurrent("indexing.delete_current", "idc", "indexingDeleteCurrent"),

	/**
	 * The number of current deletions for primaries.
	 */
	PriIndexingDeleteCurrent("pri.indexing.delete_current"),

	/**
	 * The time spent in deletions for primaries and replicas.
	 */
	IndexingDeleteTime("indexing.delete_time", "idti", "indexingDeleteTime"),

	/**
	 * The time spent in deletions for primaries.
	 */
	PriIndexingDeleteTime("pri.indexing.delete_time"),

	/**
	 * The number of delete operations for primaries and replicas.
	 */
	IndexingDeleteTotal("indexing.delete_total", "idto", "indexingDeleteTotal"),

	/**
	 * The number of delete operations for primaries.
	 */
	PriIndexingDeleteTotal("pri.indexing.delete_total"),

	/**
	 * The number of current indexing operations for primaries and replicas.
	 */
	IndexingIndexCurrent("indexing.index_current", "iic", "indexingIndexCurrent"),

	/**
	 * The number of current indexing operations for primaries.
	 */
	PriIndexingIndexCurrent("pri.indexing.index_current"),

	/**
	 * The time spent in indexing for primaries and replicas.
	 */
	IndexingIndexTime("indexing.index_time", "iiti", "indexingIndexTime"),

	/**
	 * The time spent in indexing for primaries.
	 */
	PriIndexingIndexTime("pri.indexing.index_time"),

	/**
	 * The number of indexing operations for primaries and replicas.
	 */
	IndexingIndexTotal("indexing.index_total", "iito", "indexingIndexTotal"),

	/**
	 * The number of indexing operations for primaries.
	 */
	PriIndexingIndexTotal("pri.indexing.index_total"),

	/**
	 * The number of failed indexing operations for primaries and replicas.
	 */
	IndexingIndexFailed("indexing.index_failed", "iif", "indexingIndexFailed"),

	/**
	 * The number of failed indexing operations for primaries.
	 */
	PriIndexingIndexFailed("pri.indexing.index_failed"),

	/**
	 * The number of failed indexing operations due to version conflict for
	 * primaries and replicas.
	 */
	IndexingIndexFailedDueToVersionConflict("indexing.index_failed_due_to_version_conflict", "iifvc",
			"indexingIndexFailedDueToVersionConflict"),

	/**
	 * The number of failed indexing operations due to version conflict for
	 * primaries.
	 */
	PriIndexingIndexFailedDueToVersionConflict("pri.indexing.index_failed_due_to_version_conflict"),

	/**
	 * The number of current merges for primaries and replicas.
	 */
	MergesCurrent("merges.current", "mc", "mergesCurrent"),

	/**
	 * The number of current merges for primaries.
	 */
	PriMergesCurrent("pri.merges.current"),

	/**
	 * The number of current merging documents for primaries and replicas.
	 */
	MergesCurrentDocs("merges.current_docs", "mcd", "mergesCurrentDocs"),

	/**
	 * The number of current merging documents for primaries.
	 */
	PriMergesCurrentDocs("pri.merges.current_docs"),

	/**
	 * The size of current merges for primaries and replicas.
	 */
	MergesCurrentSize("merges.current_size", "mcs", "mergesCurrentSize"),

	/**
	 * The size of current merges for primaries.
	 */
	PriMergesCurrentSize("pri.merges.current_size"),

	/**
	 * The number of completed merge operations for primaries and replicas.
	 */
	MergesTotal("merges.total", "mt", "mergesTotal"),

	/**
	 * The number of completed merge operations for primaries.
	 */
	PriMergesTotal("pri.merges.total"),

	/**
	 * The number of merged documents for primaries and replicas.
	 */
	MergesTotalDocs("merges.total_docs", "mtd", "mergesTotalDocs"),

	/**
	 * The number of merged documents for primaries.
	 */
	PriMergesTotalDocs("pri.merges.total_docs"),

	/**
	 * The merged size for primaries and replicas.
	 */
	MergesTotalSize("merges.total_size", "mts", "mergesTotalSize"),

	/**
	 * The merged size for primaries.
	 */
	PriMergesTotalSize("pri.merges.total_size"),

	/**
	 * The time spent in merges for primaries and replicas.
	 */
	MergesTotalTime("merges.total_time", "mtt", "mergesTotalTime"),

	/**
	 * The time spent in merges for primaries.
	 */
	PriMergesTotalTime("pri.merges.total_time"),

	/**
	 * The total refreshes for primaries and replicas.
	 */
	RefreshTotal("refresh.total", "rto", "refreshTotal"),

	/**
	 * The total refreshes for primaries.
	 */
	PriRefreshTotal("pri.refresh.total"),

	/**
	 * The time spent in refreshes for primaries and replicas.
	 */
	RefreshTime("refresh.time", "rti", "refreshTime"),

	/**
	 * The time spent in refreshes for primaries.
	 */
	PriRefreshTime("pri.refresh.time"),

	/**
	 * The total external refreshes for primaries and replicas.
	 */
	RefreshExternalTotal("refresh.external_total", "rto", "refreshTotal"),

	/**
	 * The total external refreshes for primaries.
	 */
	PriRefreshExternalTotal("pri.refresh.external_total"),

	/**
	 * The time spent in external refreshes for primaries and replicas.
	 */
	RefreshExternalTime("refresh.external_time", "rti", "refreshTime"),

	/**
	 * The time spent in external refreshes for primaries.
	 */
	PriRefreshExternalTime("pri.refresh.external_time"),

	/**
	 * The number of pending refresh listeners for primaries and replicas.
	 */
	RefreshListeners("refresh.listeners", "rli", "refreshListeners"),

	/**
	 * The number of pending refresh listeners for primaries.
	 */
	PriRefreshListeners("pri.refresh.listeners"),

	/**
	 * The current fetch phase operations for primaries and replicas.
	 */
	SearchFetchCurrent("search.fetch_current", "sfc", "searchFetchCurrent"),

	/**
	 * The current fetch phase operations for primaries.
	 */
	PriSearchFetchCurrent("pri.search.fetch_current"),

	/**
	 * The time spent in fetch phase for primaries and replicas.
	 */
	SearchFetchTime("search.fetch_time", "sfti", "searchFetchTime"),

	/**
	 * The time spent in fetch phase for primaries.
	 */
	PriSearchFetchTime("pri.search.fetch_time"),

	/**
	 * The total fetch operations for primaries and replicas.
	 */
	SearchFetchTotal("search.fetch_total", "sfto", "searchFetchTotal"),

	/**
	 * The total fetch operations for primaries.
	 */
	PriSearchFetchTotal("pri.search.fetch_total"),

	/**
	 * The open search contexts for primaries and replicas.
	 */
	SearchOpenContexts("search.open_contexts", "so", "searchOpenContexts"),

	/**
	 * The open search contexts for primaries.
	 */
	PriSearchOpenContexts("pri.search.open_contexts"),

	/**
	 * The current query phase operations for primaries and replicas.
	 */
	SearchQueryCurrent("search.query_current", "sqc", "searchQueryCurrent"),

	/**
	 * The current query phase operations for primaries.
	 */
	PriSearchQueryCurrent("pri.search.query_current"),

	/**
	 * The time spent in query phase for primaries and replicas.
	 */
	SearchQueryTime("search.query_time", "sqti", "searchQueryTime"),

	/**
	 * The time spent in query phase for primaries.
	 */
	PriSearchQueryTime("pri.search.query_time"),

	/**
	 * The total query phase operations for primaries and replicas.
	 */
	SearchQueryTotal("search.query_total", "sqto", "searchQueryTotal"),

	/**
	 * The total query phase operations for primaries.
	 */
	PriSearchQueryTotal("pri.search.query_total"),

	/**
	 * The open scroll contexts for primaries and replicas.
	 */
	SearchScrollCurrent("search.scroll_current", "scc", "searchScrollCurrent"),

	/**
	 * The open scroll contexts for primaries.
	 */
	PriSearchScrollCurrent("pri.search.scroll_current"),

	/**
	 * The time scroll contexts held open for primaries and replicas.
	 */
	SearchScrollTime("search.scroll_time", "scti", "searchScrollTime"),

	/**
	 * The time scroll contexts held open for primaries.
	 */
	PriSearchScrollTime("pri.search.scroll_time"),

	/**
	 * The completed scroll contexts for primaries and replicas.
	 */
	SearchScrollTotal("search.scroll_total", "scto", "searchScrollTotal"),

	/**
	 * The completed scroll contexts for primaries.
	 */
	PriSearchScrollTotal("pri.search.scroll_total"),

	/**
	 * The number of segments for primaries and replicas.
	 */
	SegmentsCount("segments.count", "sc", "segmentsCount"),

	/**
	 * The number of segments for primaries.
	 */
	PriSegmentsCount("pri.segments.count"),

	/**
	 * The memory used by segments for primaries and replicas.
	 */
	SegmentsMemory("segments.memory", "sm", "segmentsMemory"),

	/**
	 * The memory used by segments for primaries.
	 */
	PriSegmentsMemory("pri.segments.memory"),

	/**
	 * The memory used by index writer for primaries and replicas.
	 */
	SegmentsIndexWriterMemory("segments.index_writer_memory", "siwm", "segmentsIndexWriterMemory"),

	/**
	 * The memory used by index writer for primaries.
	 */
	PriSegmentsIndexWriterMemory("pri.segments.index_writer_memory"),

	/**
	 * The memory used by version map for primaries and replicas.
	 */
	SegmentsVersionMapMemory("segments.version_map_memory", "svmm", "segmentsVersionMapMemory"),

	/**
	 * The memory used by version map for primaries.
	 */
	PriSegmentsVersionMapMemory("pri.segments.version_map_memory"),

	/**
	 * The memory used by fixed bit sets for nested object field types and type
	 * filters for types referred in _parent fields. Applicable for primaries and
	 * replicas.
	 */
	SegmentsFixedBitsetMemory("segments.fixed_bitset_memory", "sfbm", "fixedBitsetMemory"),

	/**
	 * The memory used by fixed bit sets for nested object field types and type
	 * filters for types referred in _parent fields. Applicable for primaries.
	 */
	PriSegmentsFixedBitsetMemory("pri.segments.fixed_bitset_memory"),

	/**
	 * The current warmer operations for primaries and replicas.
	 */
	WarmerCurrent("warmer.current", "wc", "warmerCurrent"),

	/**
	 * The current warmer operations for primaries.
	 */
	PriWarmerCurrent("pri.warmer.current"),

	/**
	 * The total warmer operations for primaries and replicas.
	 */
	WarmerTotal("warmer.total", "wto", "warmerTotal"),

	/**
	 * The total warmer operations for primaries.
	 */
	PriWarmerTotal("pri.warmer.total"),

	/**
	 * The time spent in warmers for primaries and replicas.
	 */
	WarmerTotalTime("warmer.total_time", "wtt", "warmerTotalTime"),

	/**
	 * The time spent in warmers for primaries.
	 */
	PriWarmerTotalTime("pri.warmer.total_time"),

	/**
	 * The current suggest operations for primaries and replicas.
	 */
	SuggestCurrent("suggest.current", "suc", "suggestCurrent"),

	/**
	 * The current suggest operations for primaries.
	 */
	PriSuggestCurrent("pri.suggest.current"),

	/**
	 * The time spent in suggest for primaries and replicas.
	 */
	SuggestTime("suggest.time", "suti", "suggestTime"),

	/**
	 * The time spent in suggest for primaries.
	 */
	PriSuggestTime("pri.suggest.time"),

	/**
	 * The number of suggest operations for primaries and replicas.
	 */
	SuggestTotal("suggest.total", "suto", "suggestTotal"),

	/**
	 * The number of suggest operations for primaries.
	 */
	PriSuggestTotal("pri.suggest.total"),

	/**
	 * The total used memory for primaries and replicas.
	 */
	MemoryTotal("memory.total", "tm", "memoryTotal"),

	/**
	 * The total used memory for primaries.
	 */
	PriMemoryTotal("pri.memory.total"),

	/**
	 * The number of bulk shard operations for primaries and replicas.
	 */
	BulkTotalOperations("bulk.total_operations", "bto", "bulkTotalOperation"),

	/**
	 * The number of bulk shard operations for primaries.
	 */
	PriBulkTotalOperations("pri.bulk.total_operations"),

	/**
	 * The time spent in shard bulk for primaries and replicas.
	 */
	BulkTotalTime("bulk.total_time", "btti", "bulkTotalTime"),

	/**
	 * The time spent in shard bulk for primaries.
	 */
	PriBulkTotalTime("pri.bulk.total_time"),

	/**
	 * The total size in bytes of shard bulk for primaries and replicas.
	 */
	BulkTotalSizeInBytes("bulk.total_size_in_bytes", "btsi", "bulkTotalSizeInBytes"),

	/**
	 * The total size in bytes of shard bulk for primaries.
	 */
	PriBulkTotalSizeInBytes("pri.bulk.total_size_in_bytes"),

	/**
	 * The average time spent in shard bulk for primaries and replicas.
	 */
	BulkAvgTime("bulk.avg_time", "bati", "bulkAvgTime"),

	/**
	 * The average time spent in shard bulk for primaries.
	 */
	PriBulkAvgTime("pri.bulk.avg_time"),

	/**
	 * The average size in bytes of shard bulk for primaries and replicas.
	 */
	BulkAvgSizeInBytes("bulk.avg_size_in_bytes", "basi", "bulkAvgSizeInBytes"),

	/**
	 * The average size in bytes of shard bulk for primaries.
	 */
	PriBulkAvgSizeInBytes("pri.bulk.avg_size_in_bytes"),

	/**
	 * The total count of indexed dense vectors for primaries and replicas.
	 */
	DenseVectorValueCount("dense_vector.value_count", "dvc", "denseVectorCount"),

	/**
	 * The total count of indexed dense vectors for primaries.
	 */
	PriDenseVectorValueCount("pri.dense_vector.value_count"),

	/**
	 * The total count of indexed sparse vectors for primaries and replicas.
	 */
	SparseVectorValueCount("sparse_vector.value_count", "svc", "sparseVectorCount"),

	/**
	 * The total count of indexed sparse vectors for primaries.
	 */
	PriSparseVectorValueCount("pri.sparse_vector.value_count"),

	;

	private final String jsonValue;
	private final String[] aliases;

	CatIndicesColumn(String jsonValue, String... aliases) {
		this.jsonValue = jsonValue;
		this.aliases = aliases;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	public String[] aliases() {
		return this.aliases;
	}

	public static final JsonEnum.Deserializer<CatIndicesColumn> _DESERIALIZER = new JsonEnum.Deserializer<>(
			CatIndicesColumn.values());
}
