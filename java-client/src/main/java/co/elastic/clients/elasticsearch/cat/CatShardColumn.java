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
 * @see <a href="../doc-files/api-spec.html#cat._types.CatShardColumn">API
 *      specification</a>
 */
@JsonpDeserializable
public enum CatShardColumn implements JsonEnum {
	/**
	 * Size of completion. For example: <code>0b</code>.
	 */
	CompletionSize("completion.size", "cs", "completionSize"),

	/**
	 * Disk space used by the shard’s dataset, which may or may not be the size on
	 * disk, but includes space used by the shard on object storage. Reported as a
	 * size value for example: <code>5kb</code>.
	 */
	DatasetSize("dataset.size"),

	/**
	 * Number of indexed dense vectors.
	 */
	DenseVectorValueCount("dense_vector.value_count", "dvc", "denseVectorCount"),

	/**
	 * Number of documents in shard, for example: <code>25</code>.
	 */
	Docs("docs", "d", "dc"),

	/**
	 * Fielddata cache evictions, for example: <code>0</code>.
	 */
	FielddataEvictions("fielddata.evictions", "fe", "fielddataEvictions"),

	/**
	 * Used fielddata cache memory, for example: <code>0b</code>.
	 */
	FielddataMemorySize("fielddata.memory_size", "fm", "fielddataMemory"),

	/**
	 * Number of flushes, for example: <code>1</code>.
	 */
	FlushTotal("flush.total", "ft", "flushTotal"),

	/**
	 * Time spent in flush, for example: <code>1</code>.
	 */
	FlushTotalTime("flush.total_time", "ftt", "flushTotalTime"),

	/**
	 * Number of current get operations, for example: <code>0</code>.
	 */
	GetCurrent("get.current", "gc", "getCurrent"),

	/**
	 * Time spent in successful gets, for example: <code>14ms</code>.
	 */
	GetExistsTime("get.exists_time", "geti", "getExistsTime"),

	/**
	 * Number of successful get operations, for example: <code>2</code>.
	 */
	GetExistsTotal("get.exists_total", "geto", "getExistsTotal"),

	/**
	 * Time spent in failed gets, for example: <code>0s</code>.
	 */
	GetMissingTime("get.missing_time", "gmti", "getMissingTime"),

	/**
	 * Number of failed get operations, for example: <code>1</code>.
	 */
	GetMissingTotal("get.missing_total", "gmto", "getMissingTotal"),

	/**
	 * Time spent in get, for example: <code>14ms</code>.
	 */
	GetTime("get.time", "gti", "getTime"),

	/**
	 * Number of get operations, for example: <code>2</code>.
	 */
	GetTotal("get.total", "gto", "getTotal"),

	/**
	 * ID of the node, for example: <code>k0zy</code>.
	 */
	Id("id"),

	/**
	 * Name of the index.
	 */
	Index("index", "i", "idx"),

	/**
	 * Number of current deletion operations, for example: <code>0</code>.
	 */
	IndexingDeleteCurrent("indexing.delete_current", "idc", "indexingDeleteCurrent"),

	/**
	 * Time spent in deletions, for example: <code>2ms</code>.
	 */
	IndexingDeleteTime("indexing.delete_time", "idti", "indexingDeleteTime"),

	/**
	 * Number of deletion operations, for example: <code>2</code>.
	 */
	IndexingDeleteTotal("indexing.delete_total", "idto", "indexingDeleteTotal"),

	/**
	 * Number of current indexing operations, for example: <code>0</code>.
	 */
	IndexingIndexCurrent("indexing.index_current", "iic", "indexingIndexCurrent"),

	/**
	 * Number of failed indexing operations due to version conflict, for example:
	 * <code>0</code>.
	 */
	IndexingIndexFailedDueToVersionConflict("indexing.index_failed_due_to_version_conflict", "iifvc",
			"indexingIndexFailedDueToVersionConflict"),

	/**
	 * Number of failed indexing operations, for example: <code>0</code>.
	 */
	IndexingIndexFailed("indexing.index_failed", "iif", "indexingIndexFailed"),

	/**
	 * Time spent in indexing, such as for example: <code>134ms</code>.
	 */
	IndexingIndexTime("indexing.index_time", "iiti", "indexingIndexTime"),

	/**
	 * Number of indexing operations, for example: <code>1</code>.
	 */
	IndexingIndexTotal("indexing.index_total", "iito", "indexingIndexTotal"),

	/**
	 * IP address of the node, for example: <code>127.0.1.1</code>.
	 */
	Ip("ip"),

	/**
	 * Number of current merge operations, for example: <code>0</code>.
	 */
	MergesCurrent("merges.current", "mc", "mergesCurrent"),

	/**
	 * Number of current merging documents, for example: <code>0</code>.
	 */
	MergesCurrentDocs("merges.current_docs", "mcd", "mergesCurrentDocs"),

	/**
	 * Size of current merges, for example: <code>0b</code>.
	 */
	MergesCurrentSize("merges.current_size", "mcs", "mergesCurrentSize"),

	/**
	 * Number of completed merge operations, for example: <code>0</code>.
	 */
	MergesTotal("merges.total", "mt", "mergesTotal"),

	/**
	 * Number of merged documents, for example: <code>0</code>.
	 */
	MergesTotalDocs("merges.total_docs", "mtd", "mergesTotalDocs"),

	/**
	 * Size of current merges, for example: <code>0b</code>.
	 */
	MergesTotalSize("merges.total_size", "mts", "mergesTotalSize"),

	/**
	 * Time spent merging documents, for example: <code>0s</code>.
	 */
	MergesTotalTime("merges.total_time", "mtt", "mergesTotalTime"),

	/**
	 * Node name, for example: <code>I8hydUG</code>.
	 */
	Node("node", "n"),

	/**
	 * Shard type. Returned values are <code>primary</code> or <code>replica</code>.
	 */
	Prirep("prirep", "p", "pr", "primaryOrReplica"),

	/**
	 * Query cache evictions, for example: <code>0</code>.
	 */
	QueryCacheEvictions("query_cache.evictions", "qce", "queryCacheEvictions"),

	/**
	 * Used query cache memory, for example: <code>0b</code>.
	 */
	QueryCacheMemorySize("query_cache.memory_size", "qcm", "queryCacheMemory"),

	/**
	 * Type of recovery source.
	 */
	RecoverysourceType("recoverysource.type", "rs"),

	/**
	 * Time spent in refreshes, for example: <code>91ms</code>.
	 */
	RefreshTime("refresh.time", "rti", "refreshTime"),

	/**
	 * Number of refreshes, for example: <code>16</code>.
	 */
	RefreshTotal("refresh.total", "rto", "refreshTotal"),

	/**
	 * Current fetch phase operations, for example: <code>0</code>.
	 */
	SearchFetchCurrent("search.fetch_current", "sfc", "searchFetchCurrent"),

	/**
	 * Time spent in fetch phase, for example: <code>37ms</code>.
	 */
	SearchFetchTime("search.fetch_time", "sfti", "searchFetchTime"),

	/**
	 * Number of fetch operations, for example: <code>7</code>.
	 */
	SearchFetchTotal("search.fetch_total", "sfto", "searchFetchTotal"),

	/**
	 * Open search contexts, for example: <code>0</code>.
	 */
	SearchOpenContexts("search.open_contexts", "so", "searchOpenContexts"),

	/**
	 * Current query phase operations, for example: <code>0</code>.
	 */
	SearchQueryCurrent("search.query_current", "sqc", "searchQueryCurrent"),

	/**
	 * Time spent in query phase, for example: <code>43ms</code>.
	 */
	SearchQueryTime("search.query_time", "sqti", "searchQueryTime"),

	/**
	 * Number of query operations, for example: <code>9</code>.
	 */
	SearchQueryTotal("search.query_total", "sqto", "searchQueryTotal"),

	/**
	 * Open scroll contexts, for example: <code>2</code>.
	 */
	SearchScrollCurrent("search.scroll_current", "scc", "searchScrollCurrent"),

	/**
	 * Time scroll contexts held open, for example: <code>2m</code>.
	 */
	SearchScrollTime("search.scroll_time", "scti", "searchScrollTime"),

	/**
	 * Completed scroll contexts, for example: <code>1</code>.
	 */
	SearchScrollTotal("search.scroll_total", "scto", "searchScrollTotal"),

	/**
	 * Number of segments, for example: <code>4</code>.
	 */
	SegmentsCount("segments.count", "sc", "segmentsCount"),

	/**
	 * Memory used by fixed bit sets for nested object field types and type filters
	 * for types referred in join fields, for example: <code>1.0kb</code>.
	 */
	SegmentsFixedBitsetMemory("segments.fixed_bitset_memory", "sfbm", "fixedBitsetMemory"),

	/**
	 * Memory used by index writer, for example: <code>18mb</code>.
	 */
	SegmentsIndexWriterMemory("segments.index_writer_memory", "siwm", "segmentsIndexWriterMemory"),

	/**
	 * Memory used by segments, for example: <code>1.4kb</code>.
	 */
	SegmentsMemory("segments.memory", "sm", "segmentsMemory"),

	/**
	 * Memory used by version map, for example: <code>1.0kb</code>.
	 */
	SegmentsVersionMapMemory("segments.version_map_memory", "svmm", "segmentsVersionMapMemory"),

	/**
	 * Global checkpoint.
	 */
	SeqNoGlobalCheckpoint("seq_no.global_checkpoint", "sqg", "globalCheckpoint"),

	/**
	 * Local checkpoint.
	 */
	SeqNoLocalCheckpoint("seq_no.local_checkpoint", "sql", "localCheckpoint"),

	/**
	 * Maximum sequence number.
	 */
	SeqNoMax("seq_no.max", "sqm", "maxSeqNo"),

	/**
	 * Name of the shard.
	 */
	Shard("shard", "s", "sh"),

	/**
	 * Number of indexed <a href=
	 * "https://www.elastic.co/docs/reference/elasticsearch/mapping-reference/sparse-vector">sparse
	 * vectors</a>.
	 */
	DsparseVectorValueCount("dsparse_vector.value_count", "svc", "sparseVectorCount"),

	/**
	 * State of the shard. Returned values are:
	 * <ul>
	 * <li><code>INITIALIZING</code>: The shard is recovering from a peer shard or
	 * gateway.</li>
	 * <li><code>RELOCATING</code>: The shard is relocating.</li>
	 * <li><code>STARTED</code>: The shard has started.</li>
	 * <li><code>UNASSIGNED</code>: The shard is not assigned to any node.</li>
	 * </ul>
	 */
	State("state", "st"),

	/**
	 * Disk space used by the shard, for example: <code>5kb</code>.
	 */
	Store("store", "sto"),

	/**
	 * Number of current suggest operations, for example: <code>0</code>.
	 */
	SuggestCurrent("suggest.current", "suc", "suggestCurrent"),

	/**
	 * Time spent in suggest, for example: <code>0</code>.
	 */
	SuggestTime("suggest.time", "suti", "suggestTime"),

	/**
	 * Number of suggest operations, for example: <code>0</code>.
	 */
	SuggestTotal("suggest.total", "suto", "suggestTotal"),

	/**
	 * Sync ID of the shard.
	 */
	SyncId("sync_id"),

	/**
	 * Time at which the shard became unassigned in
	 * <a href="https://en.wikipedia.org/wiki/List_of_UTC_offsets">Coordinated
	 * Universal Time (UTC)</a>.
	 */
	UnassignedAt("unassigned.at", "ua"),

	/**
	 * Details about why the shard became unassigned. This does not explain why the
	 * shard is currently unassigned. To understand why a shard is not assigned, use
	 * the <a href=
	 * "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-cluster-allocation-explain">Cluster
	 * allocation explain</a> API.
	 */
	UnassignedDetails("unassigned.details", "ud"),

	/**
	 * Time at which the shard was requested to be unassigned in
	 * <a href="https://en.wikipedia.org/wiki/List_of_UTC_offsets">Coordinated
	 * Universal Time (UTC)</a>.
	 */
	UnassignedFor("unassigned.for", "uf"),

	/**
	 * Indicates the reason for the last change to the state of this unassigned
	 * shard. This does not explain why the shard is currently unassigned. To
	 * understand why a shard is not assigned, use the <a href=
	 * "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-cluster-allocation-explain">Cluster
	 * allocation explain</a> API. Returned values include:
	 * <ul>
	 * <li><code>ALLOCATION_FAILED</code>: Unassigned as a result of a failed
	 * allocation of the shard.</li>
	 * <li><code>CLUSTER_RECOVERED</code>: Unassigned as a result of a full cluster
	 * recovery.</li>
	 * <li><code>DANGLING_INDEX_IMPORTED</code>: Unassigned as a result of importing
	 * a dangling index.</li>
	 * <li><code>EXISTING_INDEX_RESTORED</code>: Unassigned as a result of restoring
	 * into a closed index.</li>
	 * <li><code>FORCED_EMPTY_PRIMARY</code>: The shard’s allocation was last
	 * modified by forcing an empty primary using the Cluster reroute API.</li>
	 * <li><code>INDEX_CLOSED</code>: Unassigned because the index was closed.</li>
	 * <li><code>INDEX_CREATED</code>: Unassigned as a result of an API creation of
	 * an index.</li>
	 * <li><code>INDEX_REOPENED</code>: Unassigned as a result of opening a closed
	 * index.</li>
	 * <li><code>MANUAL_ALLOCATION</code>: The shard’s allocation was last modified
	 * by the Cluster reroute API.</li>
	 * <li><code>NEW_INDEX_RESTORED</code>: Unassigned as a result of restoring into
	 * a new index.</li>
	 * <li><code>NODE_LEFT</code>: Unassigned as a result of the node hosting it
	 * leaving the cluster.</li>
	 * <li><code>NODE_RESTARTING</code>: Similar to <code>NODE_LEFT</code>, except
	 * that the node was registered as restarting using the Node shutdown API.</li>
	 * <li><code>PRIMARY_FAILED</code>: The shard was initializing as a replica, but
	 * the primary shard failed before the initialization completed.</li>
	 * <li><code>REALLOCATED_REPLICA</code>: A better replica location is identified
	 * and causes the existing replica allocation to be cancelled.</li>
	 * <li><code>REINITIALIZED</code>: When a shard moves from started back to
	 * initializing.</li>
	 * <li><code>REPLICA_ADDED</code>: Unassigned as a result of explicit addition
	 * of a replica.</li>
	 * <li><code>REROUTE_CANCELLED</code>: Unassigned as a result of explicit cancel
	 * reroute command.</li>
	 * </ul>
	 */
	UnassignedReason("unassigned.reason", "ur"),

	;

	private final String jsonValue;
	private final String[] aliases;

	CatShardColumn(String jsonValue, String... aliases) {
		this.jsonValue = jsonValue;
		this.aliases = aliases;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	public String[] aliases() {
		return this.aliases;
	}

	public static final JsonEnum.Deserializer<CatShardColumn> _DESERIALIZER = new JsonEnum.Deserializer<>(
			CatShardColumn.values());
}
