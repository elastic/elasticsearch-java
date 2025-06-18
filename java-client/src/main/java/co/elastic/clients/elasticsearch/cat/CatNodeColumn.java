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
 * @see <a href="../doc-files/api-spec.html#cat._types.CatNodeColumn">API
 *      specification</a>
 */
@JsonpDeserializable
public enum CatNodeColumn implements JsonEnum {
	/**
	 * The Elasticsearch build hash. For example: <code>5c03844</code>.
	 */
	Build("build", "b"),

	/**
	 * The size of completion. For example: <code>0b</code>.
	 */
	CompletionSize("completion.size", "cs", "completionSize"),

	/**
	 * The percentage of recent system CPU used.
	 */
	Cpu("cpu"),

	/**
	 * The available disk space. For example: <code>198.4gb</code>.
	 */
	DiskAvail("disk.avail", "d", "disk", "diskAvail"),

	/**
	 * The total disk space. For example: <code>458.3gb</code>.
	 */
	DiskTotal("disk.total", "dt", "diskTotal"),

	/**
	 * The used disk space. For example: <code>259.8gb</code>.
	 */
	DiskUsed("disk.used", "du", "diskUsed"),

	/**
	 * The percentage of disk space used.
	 */
	DiskUsedPercent("disk.used_percent", "dup", "diskUsedPercent"),

	/**
	 * The number of fielddata cache evictions.
	 */
	FielddataEvictions("fielddata.evictions", "fe", "fielddataEvictions"),

	/**
	 * The fielddata cache memory used. For example: <code>0b</code>.
	 */
	FielddataMemorySize("fielddata.memory_size", "fm", "fielddataMemory"),

	/**
	 * The number of file descriptors used.
	 */
	FileDescCurrent("file_desc.current", "fdc", "fileDescriptorCurrent"),

	/**
	 * The maximum number of file descriptors.
	 */
	FileDescMax("file_desc.max", "fdm", "fileDescriptorMax"),

	/**
	 * The percentage of file descriptors used.
	 */
	FileDescPercent("file_desc.percent", "fdp", "fileDescriptorPercent"),

	/**
	 * The number of flushes.
	 */
	FlushTotal("flush.total", "ft", "flushTotal"),

	/**
	 * The amount of time spent in flush.
	 */
	FlushTotalTime("flush.total_time", "ftt", "flushTotalTime"),

	/**
	 * The number of current get operations.
	 */
	GetCurrent("get.current", "gc", "getCurrent"),

	/**
	 * The time spent in successful get operations. For example: <code>14ms</code>.
	 */
	GetExistsTime("get.exists_time", "geti", "getExistsTime"),

	/**
	 * The number of successful get operations.
	 */
	GetExistsTotal("get.exists_total", "geto", "getExistsTotal"),

	/**
	 * The time spent in failed get operations. For example: <code>0s</code>.
	 */
	GetMissingTime("get.missing_time", "gmti", "getMissingTime"),

	/**
	 * The number of failed get operations.
	 */
	GetMissingTotal("get.missing_total", "gmto", "getMissingTotal"),

	/**
	 * The amount of time spent in get operations. For example: <code>14ms</code>.
	 */
	GetTime("get.time", "gti", "getTime"),

	/**
	 * The number of get operations.
	 */
	GetTotal("get.total", "gto", "getTotal"),

	/**
	 * The used heap size. For example: <code>311.2mb</code>.
	 */
	HeapCurrent("heap.current", "hc", "heapCurrent"),

	/**
	 * The total heap size. For example: <code>4gb</code>.
	 */
	HeapMax("heap.max", "hm", "heapMax"),

	/**
	 * The used percentage of total allocated Elasticsearch JVM heap. This value
	 * reflects only the Elasticsearch process running within the operating system
	 * and is the most direct indicator of its JVM, heap, or memory resource
	 * performance.
	 */
	HeapPercent("heap.percent", "hp", "heapPercent"),

	/**
	 * The bound HTTP address.
	 */
	HttpAddress("http_address", "http"),

	/**
	 * The identifier for the node.
	 */
	Id("id", "nodeId"),

	/**
	 * The number of current deletion operations.
	 */
	IndexingDeleteCurrent("indexing.delete_current", "idc", "indexingDeleteCurrent"),

	/**
	 * The time spent in deletion operations. For example: <code>2ms</code>.
	 */
	IndexingDeleteTime("indexing.delete_time", "idti", "indexingDeleteTime"),

	/**
	 * The number of deletion operations.
	 */
	IndexingDeleteTotal("indexing.delete_total", "idto", "indexingDeleteTotal"),

	/**
	 * The number of current indexing operations.
	 */
	IndexingIndexCurrent("indexing.index_current", "iic", "indexingIndexCurrent"),

	/**
	 * The number of failed indexing operations.
	 */
	IndexingIndexFailed("indexing.index_failed", "iif", "indexingIndexFailed"),

	/**
	 * The number of indexing operations that failed due to version conflict.
	 */
	IndexingIndexFailedDueToVersionConflict("indexing.index_failed_due_to_version_conflict", "iifvc",
			"indexingIndexFailedDueToVersionConflict"),

	/**
	 * The time spent in indexing operations. For example: <code>134ms</code>.
	 */
	IndexingIndexTime("indexing.index_time", "iiti", "indexingIndexTime"),

	/**
	 * The number of indexing operations.
	 */
	IndexingIndexTotal("indexing.index_total", "iito", "indexingIndexTotal"),

	/**
	 * The IP address.
	 */
	Ip("ip", "i"),

	/**
	 * The Java version. For example: <code>1.8.0</code>.
	 */
	Jdk("jdk", "j"),

	/**
	 * The most recent load average. For example: <code>0.22</code>.
	 */
	Load_1m("load_1m", "l"),

	/**
	 * The load average for the last five minutes. For example: <code>0.78</code>.
	 */
	Load_5m("load_5m", "l"),

	/**
	 * The load average for the last fifteen minutes. For example:
	 * <code>1.24</code>.
	 */
	Load_15m("load_15m", "l"),

	/**
	 * The number of mappings, including runtime and object fields.
	 */
	MappingsTotalCount("mappings.total_count", "mtc", "mappingsTotalCount"),

	/**
	 * The estimated heap overhead, in bytes, of mappings on this node, which allows
	 * for 1KiB of heap for every mapped field.
	 */
	MappingsTotalEstimatedOverheadInBytes("mappings.total_estimated_overhead_in_bytes", "mteo",
			"mappingsTotalEstimatedOverheadInBytes"),

	/**
	 * Indicates whether the node is the elected master node. Returned values
	 * include <code>*</code> (elected master) and <code>-</code> (not elected
	 * master).
	 */
	Master("master", "m"),

	/**
	 * The number of current merge operations.
	 */
	MergesCurrent("merges.current", "mc", "mergesCurrent"),

	/**
	 * The number of current merging documents.
	 */
	MergesCurrentDocs("merges.current_docs", "mcd", "mergesCurrentDocs"),

	/**
	 * The size of current merges. For example: <code>0b</code>.
	 */
	MergesCurrentSize("merges.current_size", "mcs", "mergesCurrentSize"),

	/**
	 * The number of completed merge operations.
	 */
	MergesTotal("merges.total", "mt", "mergesTotal"),

	/**
	 * The number of merged documents.
	 */
	MergesTotalDocs("merges.total_docs", "mtd", "mergesTotalDocs"),

	/**
	 * The total size of merges. For example: <code>0b</code>.
	 */
	MergesTotalSize("merges.total_size", "mts", "mergesTotalSize"),

	/**
	 * The time spent merging documents. For example: <code>0s</code>.
	 */
	MergesTotalTime("merges.total_time", "mtt", "mergesTotalTime"),

	/**
	 * The node name.
	 */
	Name("name", "n"),

	/**
	 * The roles of the node. Returned values include <code>c</code> (cold node),
	 * <code>d</code> (data node), <code>f</code> (frozen node), <code>h</code> (hot
	 * node), <code>i</code> (ingest node), <code>l</code> (machine learning node),
	 * <code>m</code> (master-eligible node), <code>r</code> (remote cluster client
	 * node), <code>s</code> (content node), <code>t</code> (transform node),
	 * <code>v</code> (voting-only node), <code>w</code> (warm node), and
	 * <code>-</code> (coordinating node only). For example, <code>dim</code>
	 * indicates a master-eligible data and ingest node.
	 */
	NodeRole("node.role", "r", "role", "nodeRole"),

	/**
	 * The process identifier.
	 */
	Pid("pid", "p"),

	/**
	 * The bound transport port number.
	 */
	Port("port", "po"),

	/**
	 * The used query cache memory. For example: <code>0b</code>.
	 */
	QueryCacheMemorySize("query_cache.memory_size", "qcm", "queryCacheMemory"),

	/**
	 * The number of query cache evictions.
	 */
	QueryCacheEvictions("query_cache.evictions", "qce", "queryCacheEvictions"),

	/**
	 * The query cache hit count.
	 */
	QueryCacheHitCount("query_cache.hit_count", "qchc", "queryCacheHitCount"),

	/**
	 * The query cache miss count.
	 */
	QueryCacheMissCount("query_cache.miss_count", "qcmc", "queryCacheMissCount"),

	/**
	 * The used total memory. For example: <code>513.4mb</code>.
	 */
	RamCurrent("ram.current", "rc", "ramCurrent"),

	/**
	 * The total memory. For example: <code>2.9gb</code>.
	 */
	RamMax("ram.max", "rm", "ramMax"),

	/**
	 * The used percentage of the total operating system memory. This reflects all
	 * processes running on the operating system instead of only Elasticsearch and
	 * is not guaranteed to correlate to its performance.
	 */
	RamPercent("ram.percent", "rp", "ramPercent"),

	/**
	 * The number of refresh operations.
	 */
	RefreshTotal("refresh.total", "rto", "refreshTotal"),

	/**
	 * The time spent in refresh operations. For example: <code>91ms</code>.
	 */
	RefreshTime("refresh.time", "rti", "refreshTime"),

	/**
	 * The used request cache memory. For example: <code>0b</code>.
	 */
	RequestCacheMemorySize("request_cache.memory_size", "rcm", "requestCacheMemory"),

	/**
	 * The number of request cache evictions.
	 */
	RequestCacheEvictions("request_cache.evictions", "rce", "requestCacheEvictions"),

	/**
	 * The request cache hit count.
	 */
	RequestCacheHitCount("request_cache.hit_count", "rchc", "requestCacheHitCount"),

	/**
	 * The request cache miss count.
	 */
	RequestCacheMissCount("request_cache.miss_count", "rcmc", "requestCacheMissCount"),

	/**
	 * The number of total script compilations.
	 */
	ScriptCompilations("script.compilations", "scrcc", "scriptCompilations"),

	/**
	 * The number of total compiled scripts evicted from cache.
	 */
	ScriptCacheEvictions("script.cache_evictions", "scrce", "scriptCacheEvictions"),

	/**
	 * The number of current fetch phase operations.
	 */
	SearchFetchCurrent("search.fetch_current", "sfc", "searchFetchCurrent"),

	/**
	 * The time spent in fetch phase. For example: <code>37ms</code>.
	 */
	SearchFetchTime("search.fetch_time", "sfti", "searchFetchTime"),

	/**
	 * The number of fetch operations.
	 */
	SearchFetchTotal("search.fetch_total", "sfto", "searchFetchTotal"),

	/**
	 * The number of open search contexts.
	 */
	SearchOpenContexts("search.open_contexts", "so", "searchOpenContexts"),

	/**
	 * The number of current query phase operations.
	 */
	SearchQueryCurrent("search.query_current", "sqc", "searchQueryCurrent"),

	/**
	 * The time spent in query phase. For example: <code>43ms</code>.
	 */
	SearchQueryTime("search.query_time", "sqti", "searchQueryTime"),

	/**
	 * The number of query operations.
	 */
	SearchQueryTotal("search.query_total", "sqto", "searchQueryTotal"),

	/**
	 * The number of open scroll contexts.
	 */
	SearchScrollCurrent("search.scroll_current", "scc", "searchScrollCurrent"),

	/**
	 * The amount of time scroll contexts were held open. For example:
	 * <code>2m</code>.
	 */
	SearchScrollTime("search.scroll_time", "scti", "searchScrollTime"),

	/**
	 * The number of completed scroll contexts.
	 */
	SearchScrollTotal("search.scroll_total", "scto", "searchScrollTotal"),

	/**
	 * The number of segments.
	 */
	SegmentsCount("segments.count", "sc", "segmentsCount"),

	/**
	 * The memory used by fixed bit sets for nested object field types and type
	 * filters for types referred in join fields. For example: <code>1.0kb</code>.
	 */
	SegmentsFixedBitsetMemory("segments.fixed_bitset_memory", "sfbm", "fixedBitsetMemory"),

	/**
	 * The memory used by the index writer. For example: <code>18mb</code>.
	 */
	SegmentsIndexWriterMemory("segments.index_writer_memory", "siwm", "segmentsIndexWriterMemory"),

	/**
	 * The memory used by segments. For example: <code>1.4kb</code>.
	 */
	SegmentsMemory("segments.memory", "sm", "segmentsMemory"),

	/**
	 * The memory used by the version map. For example: <code>1.0kb</code>.
	 */
	SegmentsVersionMapMemory("segments.version_map_memory", "svmm", "segmentsVersionMapMemory"),

	/**
	 * The number of shards assigned.
	 */
	ShardStatsTotalCount("shard_stats.total_count", "sstc", "shards", "shardStatsTotalCount"),

	/**
	 * The number of current suggest operations.
	 */
	SuggestCurrent("suggest.current", "suc", "suggestCurrent"),

	/**
	 * The time spent in suggest operations.
	 */
	SuggestTime("suggest.time", "suti", "suggestTime"),

	/**
	 * The number of suggest operations.
	 */
	SuggestTotal("suggest.total", "suto", "suggestTotal"),

	/**
	 * The amount of node uptime. For example: <code>17.3m</code>.
	 */
	Uptime("uptime", "u"),

	/**
	 * The Elasticsearch version. For example: <code>9.0.0</code>.
	 */
	Version("version", "v"),

	;

	private final String jsonValue;
	private final String[] aliases;

	CatNodeColumn(String jsonValue, String... aliases) {
		this.jsonValue = jsonValue;
		this.aliases = aliases;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	public String[] aliases() {
		return this.aliases;
	}

	public static final JsonEnum.Deserializer<CatNodeColumn> _DESERIALIZER = new JsonEnum.Deserializer<>(
			CatNodeColumn.values());
}
