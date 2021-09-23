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

package co.elastic.clients.elasticsearch.cat.nodes;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: cat.nodes.NodesRecord
public final class NodesRecord implements JsonpSerializable {
	@Nullable
	private final String id;

	@Nullable
	private final String pid;

	@Nullable
	private final String ip;

	@Nullable
	private final String port;

	@Nullable
	private final String httpAddress;

	@Nullable
	private final String version;

	@Nullable
	private final String flavor;

	@Nullable
	private final String type;

	@Nullable
	private final String build;

	@Nullable
	private final String jdk;

	@Nullable
	private final JsonValue disk_total;

	@Nullable
	private final JsonValue disk_used;

	@Nullable
	private final JsonValue disk_avail;

	@Nullable
	private final JsonValue disk_usedPercent;

	@Nullable
	private final String heap_current;

	@Nullable
	private final JsonValue heap_percent;

	@Nullable
	private final String heap_max;

	@Nullable
	private final String ram_current;

	@Nullable
	private final JsonValue ram_percent;

	@Nullable
	private final String ram_max;

	@Nullable
	private final String fileDesc_current;

	@Nullable
	private final JsonValue fileDesc_percent;

	@Nullable
	private final String fileDesc_max;

	@Nullable
	private final String cpu;

	@Nullable
	private final String load1m;

	@Nullable
	private final String load5m;

	@Nullable
	private final String load15m;

	@Nullable
	private final String uptime;

	@Nullable
	private final String node_role;

	@Nullable
	private final String master;

	@Nullable
	private final String name;

	@Nullable
	private final String completion_size;

	@Nullable
	private final String fielddata_memorySize;

	@Nullable
	private final String fielddata_evictions;

	@Nullable
	private final String queryCache_memorySize;

	@Nullable
	private final String queryCache_evictions;

	@Nullable
	private final String queryCache_hitCount;

	@Nullable
	private final String queryCache_missCount;

	@Nullable
	private final String requestCache_memorySize;

	@Nullable
	private final String requestCache_evictions;

	@Nullable
	private final String requestCache_hitCount;

	@Nullable
	private final String requestCache_missCount;

	@Nullable
	private final String flush_total;

	@Nullable
	private final String flush_totalTime;

	@Nullable
	private final String get_current;

	@Nullable
	private final String get_time;

	@Nullable
	private final String get_total;

	@Nullable
	private final String get_existsTime;

	@Nullable
	private final String get_existsTotal;

	@Nullable
	private final String get_missingTime;

	@Nullable
	private final String get_missingTotal;

	@Nullable
	private final String indexing_deleteCurrent;

	@Nullable
	private final String indexing_deleteTime;

	@Nullable
	private final String indexing_deleteTotal;

	@Nullable
	private final String indexing_indexCurrent;

	@Nullable
	private final String indexing_indexTime;

	@Nullable
	private final String indexing_indexTotal;

	@Nullable
	private final String indexing_indexFailed;

	@Nullable
	private final String merges_current;

	@Nullable
	private final String merges_currentDocs;

	@Nullable
	private final String merges_currentSize;

	@Nullable
	private final String merges_total;

	@Nullable
	private final String merges_totalDocs;

	@Nullable
	private final String merges_totalSize;

	@Nullable
	private final String merges_totalTime;

	@Nullable
	private final String refresh_total;

	@Nullable
	private final String refresh_time;

	@Nullable
	private final String refresh_externalTotal;

	@Nullable
	private final String refresh_externalTime;

	@Nullable
	private final String refresh_listeners;

	@Nullable
	private final String script_compilations;

	@Nullable
	private final String script_cacheEvictions;

	@Nullable
	private final String script_compilationLimitTriggered;

	@Nullable
	private final String search_fetchCurrent;

	@Nullable
	private final String search_fetchTime;

	@Nullable
	private final String search_fetchTotal;

	@Nullable
	private final String search_openContexts;

	@Nullable
	private final String search_queryCurrent;

	@Nullable
	private final String search_queryTime;

	@Nullable
	private final String search_queryTotal;

	@Nullable
	private final String search_scrollCurrent;

	@Nullable
	private final String search_scrollTime;

	@Nullable
	private final String search_scrollTotal;

	@Nullable
	private final String segments_count;

	@Nullable
	private final String segments_memory;

	@Nullable
	private final String segments_indexWriterMemory;

	@Nullable
	private final String segments_versionMapMemory;

	@Nullable
	private final String segments_fixedBitsetMemory;

	@Nullable
	private final String suggest_current;

	@Nullable
	private final String suggest_time;

	@Nullable
	private final String suggest_total;

	@Nullable
	private final String bulk_totalOperations;

	@Nullable
	private final String bulk_totalTime;

	@Nullable
	private final String bulk_totalSizeInBytes;

	@Nullable
	private final String bulk_avgTime;

	@Nullable
	private final String bulk_avgSizeInBytes;

	// ---------------------------------------------------------------------------------------------

	public NodesRecord(Builder builder) {

		this.id = builder.id;
		this.pid = builder.pid;
		this.ip = builder.ip;
		this.port = builder.port;
		this.httpAddress = builder.httpAddress;
		this.version = builder.version;
		this.flavor = builder.flavor;
		this.type = builder.type;
		this.build = builder.build;
		this.jdk = builder.jdk;
		this.disk_total = builder.disk_total;
		this.disk_used = builder.disk_used;
		this.disk_avail = builder.disk_avail;
		this.disk_usedPercent = builder.disk_usedPercent;
		this.heap_current = builder.heap_current;
		this.heap_percent = builder.heap_percent;
		this.heap_max = builder.heap_max;
		this.ram_current = builder.ram_current;
		this.ram_percent = builder.ram_percent;
		this.ram_max = builder.ram_max;
		this.fileDesc_current = builder.fileDesc_current;
		this.fileDesc_percent = builder.fileDesc_percent;
		this.fileDesc_max = builder.fileDesc_max;
		this.cpu = builder.cpu;
		this.load1m = builder.load1m;
		this.load5m = builder.load5m;
		this.load15m = builder.load15m;
		this.uptime = builder.uptime;
		this.node_role = builder.node_role;
		this.master = builder.master;
		this.name = builder.name;
		this.completion_size = builder.completion_size;
		this.fielddata_memorySize = builder.fielddata_memorySize;
		this.fielddata_evictions = builder.fielddata_evictions;
		this.queryCache_memorySize = builder.queryCache_memorySize;
		this.queryCache_evictions = builder.queryCache_evictions;
		this.queryCache_hitCount = builder.queryCache_hitCount;
		this.queryCache_missCount = builder.queryCache_missCount;
		this.requestCache_memorySize = builder.requestCache_memorySize;
		this.requestCache_evictions = builder.requestCache_evictions;
		this.requestCache_hitCount = builder.requestCache_hitCount;
		this.requestCache_missCount = builder.requestCache_missCount;
		this.flush_total = builder.flush_total;
		this.flush_totalTime = builder.flush_totalTime;
		this.get_current = builder.get_current;
		this.get_time = builder.get_time;
		this.get_total = builder.get_total;
		this.get_existsTime = builder.get_existsTime;
		this.get_existsTotal = builder.get_existsTotal;
		this.get_missingTime = builder.get_missingTime;
		this.get_missingTotal = builder.get_missingTotal;
		this.indexing_deleteCurrent = builder.indexing_deleteCurrent;
		this.indexing_deleteTime = builder.indexing_deleteTime;
		this.indexing_deleteTotal = builder.indexing_deleteTotal;
		this.indexing_indexCurrent = builder.indexing_indexCurrent;
		this.indexing_indexTime = builder.indexing_indexTime;
		this.indexing_indexTotal = builder.indexing_indexTotal;
		this.indexing_indexFailed = builder.indexing_indexFailed;
		this.merges_current = builder.merges_current;
		this.merges_currentDocs = builder.merges_currentDocs;
		this.merges_currentSize = builder.merges_currentSize;
		this.merges_total = builder.merges_total;
		this.merges_totalDocs = builder.merges_totalDocs;
		this.merges_totalSize = builder.merges_totalSize;
		this.merges_totalTime = builder.merges_totalTime;
		this.refresh_total = builder.refresh_total;
		this.refresh_time = builder.refresh_time;
		this.refresh_externalTotal = builder.refresh_externalTotal;
		this.refresh_externalTime = builder.refresh_externalTime;
		this.refresh_listeners = builder.refresh_listeners;
		this.script_compilations = builder.script_compilations;
		this.script_cacheEvictions = builder.script_cacheEvictions;
		this.script_compilationLimitTriggered = builder.script_compilationLimitTriggered;
		this.search_fetchCurrent = builder.search_fetchCurrent;
		this.search_fetchTime = builder.search_fetchTime;
		this.search_fetchTotal = builder.search_fetchTotal;
		this.search_openContexts = builder.search_openContexts;
		this.search_queryCurrent = builder.search_queryCurrent;
		this.search_queryTime = builder.search_queryTime;
		this.search_queryTotal = builder.search_queryTotal;
		this.search_scrollCurrent = builder.search_scrollCurrent;
		this.search_scrollTime = builder.search_scrollTime;
		this.search_scrollTotal = builder.search_scrollTotal;
		this.segments_count = builder.segments_count;
		this.segments_memory = builder.segments_memory;
		this.segments_indexWriterMemory = builder.segments_indexWriterMemory;
		this.segments_versionMapMemory = builder.segments_versionMapMemory;
		this.segments_fixedBitsetMemory = builder.segments_fixedBitsetMemory;
		this.suggest_current = builder.suggest_current;
		this.suggest_time = builder.suggest_time;
		this.suggest_total = builder.suggest_total;
		this.bulk_totalOperations = builder.bulk_totalOperations;
		this.bulk_totalTime = builder.bulk_totalTime;
		this.bulk_totalSizeInBytes = builder.bulk_totalSizeInBytes;
		this.bulk_avgTime = builder.bulk_avgTime;
		this.bulk_avgSizeInBytes = builder.bulk_avgSizeInBytes;

	}

	/**
	 * unique node id
	 * <p>
	 * API name: {@code id}
	 */
	@Nullable
	public String id() {
		return this.id;
	}

	/**
	 * process id
	 * <p>
	 * API name: {@code pid}
	 */
	@Nullable
	public String pid() {
		return this.pid;
	}

	/**
	 * ip address
	 * <p>
	 * API name: {@code ip}
	 */
	@Nullable
	public String ip() {
		return this.ip;
	}

	/**
	 * bound transport port
	 * <p>
	 * API name: {@code port}
	 */
	@Nullable
	public String port() {
		return this.port;
	}

	/**
	 * bound http address
	 * <p>
	 * API name: {@code http_address}
	 */
	@Nullable
	public String httpAddress() {
		return this.httpAddress;
	}

	/**
	 * es version
	 * <p>
	 * API name: {@code version}
	 */
	@Nullable
	public String version() {
		return this.version;
	}

	/**
	 * es distribution flavor
	 * <p>
	 * API name: {@code flavor}
	 */
	@Nullable
	public String flavor() {
		return this.flavor;
	}

	/**
	 * es distribution type
	 * <p>
	 * API name: {@code type}
	 */
	@Nullable
	public String type() {
		return this.type;
	}

	/**
	 * es build hash
	 * <p>
	 * API name: {@code build}
	 */
	@Nullable
	public String build() {
		return this.build;
	}

	/**
	 * jdk version
	 * <p>
	 * API name: {@code jdk}
	 */
	@Nullable
	public String jdk() {
		return this.jdk;
	}

	/**
	 * total disk space
	 * <p>
	 * API name: {@code disk.total}
	 */
	@Nullable
	public JsonValue disk_total() {
		return this.disk_total;
	}

	/**
	 * used disk space
	 * <p>
	 * API name: {@code disk.used}
	 */
	@Nullable
	public JsonValue disk_used() {
		return this.disk_used;
	}

	/**
	 * available disk space
	 * <p>
	 * API name: {@code disk.avail}
	 */
	@Nullable
	public JsonValue disk_avail() {
		return this.disk_avail;
	}

	/**
	 * used disk space percentage
	 * <p>
	 * API name: {@code disk.used_percent}
	 */
	@Nullable
	public JsonValue disk_usedPercent() {
		return this.disk_usedPercent;
	}

	/**
	 * used heap
	 * <p>
	 * API name: {@code heap.current}
	 */
	@Nullable
	public String heap_current() {
		return this.heap_current;
	}

	/**
	 * used heap ratio
	 * <p>
	 * API name: {@code heap.percent}
	 */
	@Nullable
	public JsonValue heap_percent() {
		return this.heap_percent;
	}

	/**
	 * max configured heap
	 * <p>
	 * API name: {@code heap.max}
	 */
	@Nullable
	public String heap_max() {
		return this.heap_max;
	}

	/**
	 * used machine memory
	 * <p>
	 * API name: {@code ram.current}
	 */
	@Nullable
	public String ram_current() {
		return this.ram_current;
	}

	/**
	 * used machine memory ratio
	 * <p>
	 * API name: {@code ram.percent}
	 */
	@Nullable
	public JsonValue ram_percent() {
		return this.ram_percent;
	}

	/**
	 * total machine memory
	 * <p>
	 * API name: {@code ram.max}
	 */
	@Nullable
	public String ram_max() {
		return this.ram_max;
	}

	/**
	 * used file descriptors
	 * <p>
	 * API name: {@code file_desc.current}
	 */
	@Nullable
	public String fileDesc_current() {
		return this.fileDesc_current;
	}

	/**
	 * used file descriptor ratio
	 * <p>
	 * API name: {@code file_desc.percent}
	 */
	@Nullable
	public JsonValue fileDesc_percent() {
		return this.fileDesc_percent;
	}

	/**
	 * max file descriptors
	 * <p>
	 * API name: {@code file_desc.max}
	 */
	@Nullable
	public String fileDesc_max() {
		return this.fileDesc_max;
	}

	/**
	 * recent cpu usage
	 * <p>
	 * API name: {@code cpu}
	 */
	@Nullable
	public String cpu() {
		return this.cpu;
	}

	/**
	 * 1m load avg
	 * <p>
	 * API name: {@code load_1m}
	 */
	@Nullable
	public String load1m() {
		return this.load1m;
	}

	/**
	 * 5m load avg
	 * <p>
	 * API name: {@code load_5m}
	 */
	@Nullable
	public String load5m() {
		return this.load5m;
	}

	/**
	 * 15m load avg
	 * <p>
	 * API name: {@code load_15m}
	 */
	@Nullable
	public String load15m() {
		return this.load15m;
	}

	/**
	 * node uptime
	 * <p>
	 * API name: {@code uptime}
	 */
	@Nullable
	public String uptime() {
		return this.uptime;
	}

	/**
	 * m:master eligible node, d:data node, i:ingest node, -:coordinating node only
	 * <p>
	 * API name: {@code node.role}
	 */
	@Nullable
	public String node_role() {
		return this.node_role;
	}

	/**
	 * *:current master
	 * <p>
	 * API name: {@code master}
	 */
	@Nullable
	public String master() {
		return this.master;
	}

	/**
	 * node name
	 * <p>
	 * API name: {@code name}
	 */
	@Nullable
	public String name() {
		return this.name;
	}

	/**
	 * size of completion
	 * <p>
	 * API name: {@code completion.size}
	 */
	@Nullable
	public String completion_size() {
		return this.completion_size;
	}

	/**
	 * used fielddata cache
	 * <p>
	 * API name: {@code fielddata.memory_size}
	 */
	@Nullable
	public String fielddata_memorySize() {
		return this.fielddata_memorySize;
	}

	/**
	 * fielddata evictions
	 * <p>
	 * API name: {@code fielddata.evictions}
	 */
	@Nullable
	public String fielddata_evictions() {
		return this.fielddata_evictions;
	}

	/**
	 * used query cache
	 * <p>
	 * API name: {@code query_cache.memory_size}
	 */
	@Nullable
	public String queryCache_memorySize() {
		return this.queryCache_memorySize;
	}

	/**
	 * query cache evictions
	 * <p>
	 * API name: {@code query_cache.evictions}
	 */
	@Nullable
	public String queryCache_evictions() {
		return this.queryCache_evictions;
	}

	/**
	 * query cache hit counts
	 * <p>
	 * API name: {@code query_cache.hit_count}
	 */
	@Nullable
	public String queryCache_hitCount() {
		return this.queryCache_hitCount;
	}

	/**
	 * query cache miss counts
	 * <p>
	 * API name: {@code query_cache.miss_count}
	 */
	@Nullable
	public String queryCache_missCount() {
		return this.queryCache_missCount;
	}

	/**
	 * used request cache
	 * <p>
	 * API name: {@code request_cache.memory_size}
	 */
	@Nullable
	public String requestCache_memorySize() {
		return this.requestCache_memorySize;
	}

	/**
	 * request cache evictions
	 * <p>
	 * API name: {@code request_cache.evictions}
	 */
	@Nullable
	public String requestCache_evictions() {
		return this.requestCache_evictions;
	}

	/**
	 * request cache hit counts
	 * <p>
	 * API name: {@code request_cache.hit_count}
	 */
	@Nullable
	public String requestCache_hitCount() {
		return this.requestCache_hitCount;
	}

	/**
	 * request cache miss counts
	 * <p>
	 * API name: {@code request_cache.miss_count}
	 */
	@Nullable
	public String requestCache_missCount() {
		return this.requestCache_missCount;
	}

	/**
	 * number of flushes
	 * <p>
	 * API name: {@code flush.total}
	 */
	@Nullable
	public String flush_total() {
		return this.flush_total;
	}

	/**
	 * time spent in flush
	 * <p>
	 * API name: {@code flush.total_time}
	 */
	@Nullable
	public String flush_totalTime() {
		return this.flush_totalTime;
	}

	/**
	 * number of current get ops
	 * <p>
	 * API name: {@code get.current}
	 */
	@Nullable
	public String get_current() {
		return this.get_current;
	}

	/**
	 * time spent in get
	 * <p>
	 * API name: {@code get.time}
	 */
	@Nullable
	public String get_time() {
		return this.get_time;
	}

	/**
	 * number of get ops
	 * <p>
	 * API name: {@code get.total}
	 */
	@Nullable
	public String get_total() {
		return this.get_total;
	}

	/**
	 * time spent in successful gets
	 * <p>
	 * API name: {@code get.exists_time}
	 */
	@Nullable
	public String get_existsTime() {
		return this.get_existsTime;
	}

	/**
	 * number of successful gets
	 * <p>
	 * API name: {@code get.exists_total}
	 */
	@Nullable
	public String get_existsTotal() {
		return this.get_existsTotal;
	}

	/**
	 * time spent in failed gets
	 * <p>
	 * API name: {@code get.missing_time}
	 */
	@Nullable
	public String get_missingTime() {
		return this.get_missingTime;
	}

	/**
	 * number of failed gets
	 * <p>
	 * API name: {@code get.missing_total}
	 */
	@Nullable
	public String get_missingTotal() {
		return this.get_missingTotal;
	}

	/**
	 * number of current deletions
	 * <p>
	 * API name: {@code indexing.delete_current}
	 */
	@Nullable
	public String indexing_deleteCurrent() {
		return this.indexing_deleteCurrent;
	}

	/**
	 * time spent in deletions
	 * <p>
	 * API name: {@code indexing.delete_time}
	 */
	@Nullable
	public String indexing_deleteTime() {
		return this.indexing_deleteTime;
	}

	/**
	 * number of delete ops
	 * <p>
	 * API name: {@code indexing.delete_total}
	 */
	@Nullable
	public String indexing_deleteTotal() {
		return this.indexing_deleteTotal;
	}

	/**
	 * number of current indexing ops
	 * <p>
	 * API name: {@code indexing.index_current}
	 */
	@Nullable
	public String indexing_indexCurrent() {
		return this.indexing_indexCurrent;
	}

	/**
	 * time spent in indexing
	 * <p>
	 * API name: {@code indexing.index_time}
	 */
	@Nullable
	public String indexing_indexTime() {
		return this.indexing_indexTime;
	}

	/**
	 * number of indexing ops
	 * <p>
	 * API name: {@code indexing.index_total}
	 */
	@Nullable
	public String indexing_indexTotal() {
		return this.indexing_indexTotal;
	}

	/**
	 * number of failed indexing ops
	 * <p>
	 * API name: {@code indexing.index_failed}
	 */
	@Nullable
	public String indexing_indexFailed() {
		return this.indexing_indexFailed;
	}

	/**
	 * number of current merges
	 * <p>
	 * API name: {@code merges.current}
	 */
	@Nullable
	public String merges_current() {
		return this.merges_current;
	}

	/**
	 * number of current merging docs
	 * <p>
	 * API name: {@code merges.current_docs}
	 */
	@Nullable
	public String merges_currentDocs() {
		return this.merges_currentDocs;
	}

	/**
	 * size of current merges
	 * <p>
	 * API name: {@code merges.current_size}
	 */
	@Nullable
	public String merges_currentSize() {
		return this.merges_currentSize;
	}

	/**
	 * number of completed merge ops
	 * <p>
	 * API name: {@code merges.total}
	 */
	@Nullable
	public String merges_total() {
		return this.merges_total;
	}

	/**
	 * docs merged
	 * <p>
	 * API name: {@code merges.total_docs}
	 */
	@Nullable
	public String merges_totalDocs() {
		return this.merges_totalDocs;
	}

	/**
	 * size merged
	 * <p>
	 * API name: {@code merges.total_size}
	 */
	@Nullable
	public String merges_totalSize() {
		return this.merges_totalSize;
	}

	/**
	 * time spent in merges
	 * <p>
	 * API name: {@code merges.total_time}
	 */
	@Nullable
	public String merges_totalTime() {
		return this.merges_totalTime;
	}

	/**
	 * total refreshes
	 * <p>
	 * API name: {@code refresh.total}
	 */
	@Nullable
	public String refresh_total() {
		return this.refresh_total;
	}

	/**
	 * time spent in refreshes
	 * <p>
	 * API name: {@code refresh.time}
	 */
	@Nullable
	public String refresh_time() {
		return this.refresh_time;
	}

	/**
	 * total external refreshes
	 * <p>
	 * API name: {@code refresh.external_total}
	 */
	@Nullable
	public String refresh_externalTotal() {
		return this.refresh_externalTotal;
	}

	/**
	 * time spent in external refreshes
	 * <p>
	 * API name: {@code refresh.external_time}
	 */
	@Nullable
	public String refresh_externalTime() {
		return this.refresh_externalTime;
	}

	/**
	 * number of pending refresh listeners
	 * <p>
	 * API name: {@code refresh.listeners}
	 */
	@Nullable
	public String refresh_listeners() {
		return this.refresh_listeners;
	}

	/**
	 * script compilations
	 * <p>
	 * API name: {@code script.compilations}
	 */
	@Nullable
	public String script_compilations() {
		return this.script_compilations;
	}

	/**
	 * script cache evictions
	 * <p>
	 * API name: {@code script.cache_evictions}
	 */
	@Nullable
	public String script_cacheEvictions() {
		return this.script_cacheEvictions;
	}

	/**
	 * script cache compilation limit triggered
	 * <p>
	 * API name: {@code script.compilation_limit_triggered}
	 */
	@Nullable
	public String script_compilationLimitTriggered() {
		return this.script_compilationLimitTriggered;
	}

	/**
	 * current fetch phase ops
	 * <p>
	 * API name: {@code search.fetch_current}
	 */
	@Nullable
	public String search_fetchCurrent() {
		return this.search_fetchCurrent;
	}

	/**
	 * time spent in fetch phase
	 * <p>
	 * API name: {@code search.fetch_time}
	 */
	@Nullable
	public String search_fetchTime() {
		return this.search_fetchTime;
	}

	/**
	 * total fetch ops
	 * <p>
	 * API name: {@code search.fetch_total}
	 */
	@Nullable
	public String search_fetchTotal() {
		return this.search_fetchTotal;
	}

	/**
	 * open search contexts
	 * <p>
	 * API name: {@code search.open_contexts}
	 */
	@Nullable
	public String search_openContexts() {
		return this.search_openContexts;
	}

	/**
	 * current query phase ops
	 * <p>
	 * API name: {@code search.query_current}
	 */
	@Nullable
	public String search_queryCurrent() {
		return this.search_queryCurrent;
	}

	/**
	 * time spent in query phase
	 * <p>
	 * API name: {@code search.query_time}
	 */
	@Nullable
	public String search_queryTime() {
		return this.search_queryTime;
	}

	/**
	 * total query phase ops
	 * <p>
	 * API name: {@code search.query_total}
	 */
	@Nullable
	public String search_queryTotal() {
		return this.search_queryTotal;
	}

	/**
	 * open scroll contexts
	 * <p>
	 * API name: {@code search.scroll_current}
	 */
	@Nullable
	public String search_scrollCurrent() {
		return this.search_scrollCurrent;
	}

	/**
	 * time scroll contexts held open
	 * <p>
	 * API name: {@code search.scroll_time}
	 */
	@Nullable
	public String search_scrollTime() {
		return this.search_scrollTime;
	}

	/**
	 * completed scroll contexts
	 * <p>
	 * API name: {@code search.scroll_total}
	 */
	@Nullable
	public String search_scrollTotal() {
		return this.search_scrollTotal;
	}

	/**
	 * number of segments
	 * <p>
	 * API name: {@code segments.count}
	 */
	@Nullable
	public String segments_count() {
		return this.segments_count;
	}

	/**
	 * memory used by segments
	 * <p>
	 * API name: {@code segments.memory}
	 */
	@Nullable
	public String segments_memory() {
		return this.segments_memory;
	}

	/**
	 * memory used by index writer
	 * <p>
	 * API name: {@code segments.index_writer_memory}
	 */
	@Nullable
	public String segments_indexWriterMemory() {
		return this.segments_indexWriterMemory;
	}

	/**
	 * memory used by version map
	 * <p>
	 * API name: {@code segments.version_map_memory}
	 */
	@Nullable
	public String segments_versionMapMemory() {
		return this.segments_versionMapMemory;
	}

	/**
	 * memory used by fixed bit sets for nested object field types and export type
	 * filters for types referred in _parent fields
	 * <p>
	 * API name: {@code segments.fixed_bitset_memory}
	 */
	@Nullable
	public String segments_fixedBitsetMemory() {
		return this.segments_fixedBitsetMemory;
	}

	/**
	 * number of current suggest ops
	 * <p>
	 * API name: {@code suggest.current}
	 */
	@Nullable
	public String suggest_current() {
		return this.suggest_current;
	}

	/**
	 * time spend in suggest
	 * <p>
	 * API name: {@code suggest.time}
	 */
	@Nullable
	public String suggest_time() {
		return this.suggest_time;
	}

	/**
	 * number of suggest ops
	 * <p>
	 * API name: {@code suggest.total}
	 */
	@Nullable
	public String suggest_total() {
		return this.suggest_total;
	}

	/**
	 * number of bulk shard ops
	 * <p>
	 * API name: {@code bulk.total_operations}
	 */
	@Nullable
	public String bulk_totalOperations() {
		return this.bulk_totalOperations;
	}

	/**
	 * time spend in shard bulk
	 * <p>
	 * API name: {@code bulk.total_time}
	 */
	@Nullable
	public String bulk_totalTime() {
		return this.bulk_totalTime;
	}

	/**
	 * total size in bytes of shard bulk
	 * <p>
	 * API name: {@code bulk.total_size_in_bytes}
	 */
	@Nullable
	public String bulk_totalSizeInBytes() {
		return this.bulk_totalSizeInBytes;
	}

	/**
	 * average time spend in shard bulk
	 * <p>
	 * API name: {@code bulk.avg_time}
	 */
	@Nullable
	public String bulk_avgTime() {
		return this.bulk_avgTime;
	}

	/**
	 * average size in bytes of shard bulk
	 * <p>
	 * API name: {@code bulk.avg_size_in_bytes}
	 */
	@Nullable
	public String bulk_avgSizeInBytes() {
		return this.bulk_avgSizeInBytes;
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

		if (this.id != null) {

			generator.writeKey("id");
			generator.write(this.id);

		}
		if (this.pid != null) {

			generator.writeKey("pid");
			generator.write(this.pid);

		}
		if (this.ip != null) {

			generator.writeKey("ip");
			generator.write(this.ip);

		}
		if (this.port != null) {

			generator.writeKey("port");
			generator.write(this.port);

		}
		if (this.httpAddress != null) {

			generator.writeKey("http_address");
			generator.write(this.httpAddress);

		}
		if (this.version != null) {

			generator.writeKey("version");
			generator.write(this.version);

		}
		if (this.flavor != null) {

			generator.writeKey("flavor");
			generator.write(this.flavor);

		}
		if (this.type != null) {

			generator.writeKey("type");
			generator.write(this.type);

		}
		if (this.build != null) {

			generator.writeKey("build");
			generator.write(this.build);

		}
		if (this.jdk != null) {

			generator.writeKey("jdk");
			generator.write(this.jdk);

		}
		if (this.disk_total != null) {

			generator.writeKey("disk.total");
			generator.write(this.disk_total);

		}
		if (this.disk_used != null) {

			generator.writeKey("disk.used");
			generator.write(this.disk_used);

		}
		if (this.disk_avail != null) {

			generator.writeKey("disk.avail");
			generator.write(this.disk_avail);

		}
		if (this.disk_usedPercent != null) {

			generator.writeKey("disk.used_percent");
			generator.write(this.disk_usedPercent);

		}
		if (this.heap_current != null) {

			generator.writeKey("heap.current");
			generator.write(this.heap_current);

		}
		if (this.heap_percent != null) {

			generator.writeKey("heap.percent");
			generator.write(this.heap_percent);

		}
		if (this.heap_max != null) {

			generator.writeKey("heap.max");
			generator.write(this.heap_max);

		}
		if (this.ram_current != null) {

			generator.writeKey("ram.current");
			generator.write(this.ram_current);

		}
		if (this.ram_percent != null) {

			generator.writeKey("ram.percent");
			generator.write(this.ram_percent);

		}
		if (this.ram_max != null) {

			generator.writeKey("ram.max");
			generator.write(this.ram_max);

		}
		if (this.fileDesc_current != null) {

			generator.writeKey("file_desc.current");
			generator.write(this.fileDesc_current);

		}
		if (this.fileDesc_percent != null) {

			generator.writeKey("file_desc.percent");
			generator.write(this.fileDesc_percent);

		}
		if (this.fileDesc_max != null) {

			generator.writeKey("file_desc.max");
			generator.write(this.fileDesc_max);

		}
		if (this.cpu != null) {

			generator.writeKey("cpu");
			generator.write(this.cpu);

		}
		if (this.load1m != null) {

			generator.writeKey("load_1m");
			generator.write(this.load1m);

		}
		if (this.load5m != null) {

			generator.writeKey("load_5m");
			generator.write(this.load5m);

		}
		if (this.load15m != null) {

			generator.writeKey("load_15m");
			generator.write(this.load15m);

		}
		if (this.uptime != null) {

			generator.writeKey("uptime");
			generator.write(this.uptime);

		}
		if (this.node_role != null) {

			generator.writeKey("node.role");
			generator.write(this.node_role);

		}
		if (this.master != null) {

			generator.writeKey("master");
			generator.write(this.master);

		}
		if (this.name != null) {

			generator.writeKey("name");
			generator.write(this.name);

		}
		if (this.completion_size != null) {

			generator.writeKey("completion.size");
			generator.write(this.completion_size);

		}
		if (this.fielddata_memorySize != null) {

			generator.writeKey("fielddata.memory_size");
			generator.write(this.fielddata_memorySize);

		}
		if (this.fielddata_evictions != null) {

			generator.writeKey("fielddata.evictions");
			generator.write(this.fielddata_evictions);

		}
		if (this.queryCache_memorySize != null) {

			generator.writeKey("query_cache.memory_size");
			generator.write(this.queryCache_memorySize);

		}
		if (this.queryCache_evictions != null) {

			generator.writeKey("query_cache.evictions");
			generator.write(this.queryCache_evictions);

		}
		if (this.queryCache_hitCount != null) {

			generator.writeKey("query_cache.hit_count");
			generator.write(this.queryCache_hitCount);

		}
		if (this.queryCache_missCount != null) {

			generator.writeKey("query_cache.miss_count");
			generator.write(this.queryCache_missCount);

		}
		if (this.requestCache_memorySize != null) {

			generator.writeKey("request_cache.memory_size");
			generator.write(this.requestCache_memorySize);

		}
		if (this.requestCache_evictions != null) {

			generator.writeKey("request_cache.evictions");
			generator.write(this.requestCache_evictions);

		}
		if (this.requestCache_hitCount != null) {

			generator.writeKey("request_cache.hit_count");
			generator.write(this.requestCache_hitCount);

		}
		if (this.requestCache_missCount != null) {

			generator.writeKey("request_cache.miss_count");
			generator.write(this.requestCache_missCount);

		}
		if (this.flush_total != null) {

			generator.writeKey("flush.total");
			generator.write(this.flush_total);

		}
		if (this.flush_totalTime != null) {

			generator.writeKey("flush.total_time");
			generator.write(this.flush_totalTime);

		}
		if (this.get_current != null) {

			generator.writeKey("get.current");
			generator.write(this.get_current);

		}
		if (this.get_time != null) {

			generator.writeKey("get.time");
			generator.write(this.get_time);

		}
		if (this.get_total != null) {

			generator.writeKey("get.total");
			generator.write(this.get_total);

		}
		if (this.get_existsTime != null) {

			generator.writeKey("get.exists_time");
			generator.write(this.get_existsTime);

		}
		if (this.get_existsTotal != null) {

			generator.writeKey("get.exists_total");
			generator.write(this.get_existsTotal);

		}
		if (this.get_missingTime != null) {

			generator.writeKey("get.missing_time");
			generator.write(this.get_missingTime);

		}
		if (this.get_missingTotal != null) {

			generator.writeKey("get.missing_total");
			generator.write(this.get_missingTotal);

		}
		if (this.indexing_deleteCurrent != null) {

			generator.writeKey("indexing.delete_current");
			generator.write(this.indexing_deleteCurrent);

		}
		if (this.indexing_deleteTime != null) {

			generator.writeKey("indexing.delete_time");
			generator.write(this.indexing_deleteTime);

		}
		if (this.indexing_deleteTotal != null) {

			generator.writeKey("indexing.delete_total");
			generator.write(this.indexing_deleteTotal);

		}
		if (this.indexing_indexCurrent != null) {

			generator.writeKey("indexing.index_current");
			generator.write(this.indexing_indexCurrent);

		}
		if (this.indexing_indexTime != null) {

			generator.writeKey("indexing.index_time");
			generator.write(this.indexing_indexTime);

		}
		if (this.indexing_indexTotal != null) {

			generator.writeKey("indexing.index_total");
			generator.write(this.indexing_indexTotal);

		}
		if (this.indexing_indexFailed != null) {

			generator.writeKey("indexing.index_failed");
			generator.write(this.indexing_indexFailed);

		}
		if (this.merges_current != null) {

			generator.writeKey("merges.current");
			generator.write(this.merges_current);

		}
		if (this.merges_currentDocs != null) {

			generator.writeKey("merges.current_docs");
			generator.write(this.merges_currentDocs);

		}
		if (this.merges_currentSize != null) {

			generator.writeKey("merges.current_size");
			generator.write(this.merges_currentSize);

		}
		if (this.merges_total != null) {

			generator.writeKey("merges.total");
			generator.write(this.merges_total);

		}
		if (this.merges_totalDocs != null) {

			generator.writeKey("merges.total_docs");
			generator.write(this.merges_totalDocs);

		}
		if (this.merges_totalSize != null) {

			generator.writeKey("merges.total_size");
			generator.write(this.merges_totalSize);

		}
		if (this.merges_totalTime != null) {

			generator.writeKey("merges.total_time");
			generator.write(this.merges_totalTime);

		}
		if (this.refresh_total != null) {

			generator.writeKey("refresh.total");
			generator.write(this.refresh_total);

		}
		if (this.refresh_time != null) {

			generator.writeKey("refresh.time");
			generator.write(this.refresh_time);

		}
		if (this.refresh_externalTotal != null) {

			generator.writeKey("refresh.external_total");
			generator.write(this.refresh_externalTotal);

		}
		if (this.refresh_externalTime != null) {

			generator.writeKey("refresh.external_time");
			generator.write(this.refresh_externalTime);

		}
		if (this.refresh_listeners != null) {

			generator.writeKey("refresh.listeners");
			generator.write(this.refresh_listeners);

		}
		if (this.script_compilations != null) {

			generator.writeKey("script.compilations");
			generator.write(this.script_compilations);

		}
		if (this.script_cacheEvictions != null) {

			generator.writeKey("script.cache_evictions");
			generator.write(this.script_cacheEvictions);

		}
		if (this.script_compilationLimitTriggered != null) {

			generator.writeKey("script.compilation_limit_triggered");
			generator.write(this.script_compilationLimitTriggered);

		}
		if (this.search_fetchCurrent != null) {

			generator.writeKey("search.fetch_current");
			generator.write(this.search_fetchCurrent);

		}
		if (this.search_fetchTime != null) {

			generator.writeKey("search.fetch_time");
			generator.write(this.search_fetchTime);

		}
		if (this.search_fetchTotal != null) {

			generator.writeKey("search.fetch_total");
			generator.write(this.search_fetchTotal);

		}
		if (this.search_openContexts != null) {

			generator.writeKey("search.open_contexts");
			generator.write(this.search_openContexts);

		}
		if (this.search_queryCurrent != null) {

			generator.writeKey("search.query_current");
			generator.write(this.search_queryCurrent);

		}
		if (this.search_queryTime != null) {

			generator.writeKey("search.query_time");
			generator.write(this.search_queryTime);

		}
		if (this.search_queryTotal != null) {

			generator.writeKey("search.query_total");
			generator.write(this.search_queryTotal);

		}
		if (this.search_scrollCurrent != null) {

			generator.writeKey("search.scroll_current");
			generator.write(this.search_scrollCurrent);

		}
		if (this.search_scrollTime != null) {

			generator.writeKey("search.scroll_time");
			generator.write(this.search_scrollTime);

		}
		if (this.search_scrollTotal != null) {

			generator.writeKey("search.scroll_total");
			generator.write(this.search_scrollTotal);

		}
		if (this.segments_count != null) {

			generator.writeKey("segments.count");
			generator.write(this.segments_count);

		}
		if (this.segments_memory != null) {

			generator.writeKey("segments.memory");
			generator.write(this.segments_memory);

		}
		if (this.segments_indexWriterMemory != null) {

			generator.writeKey("segments.index_writer_memory");
			generator.write(this.segments_indexWriterMemory);

		}
		if (this.segments_versionMapMemory != null) {

			generator.writeKey("segments.version_map_memory");
			generator.write(this.segments_versionMapMemory);

		}
		if (this.segments_fixedBitsetMemory != null) {

			generator.writeKey("segments.fixed_bitset_memory");
			generator.write(this.segments_fixedBitsetMemory);

		}
		if (this.suggest_current != null) {

			generator.writeKey("suggest.current");
			generator.write(this.suggest_current);

		}
		if (this.suggest_time != null) {

			generator.writeKey("suggest.time");
			generator.write(this.suggest_time);

		}
		if (this.suggest_total != null) {

			generator.writeKey("suggest.total");
			generator.write(this.suggest_total);

		}
		if (this.bulk_totalOperations != null) {

			generator.writeKey("bulk.total_operations");
			generator.write(this.bulk_totalOperations);

		}
		if (this.bulk_totalTime != null) {

			generator.writeKey("bulk.total_time");
			generator.write(this.bulk_totalTime);

		}
		if (this.bulk_totalSizeInBytes != null) {

			generator.writeKey("bulk.total_size_in_bytes");
			generator.write(this.bulk_totalSizeInBytes);

		}
		if (this.bulk_avgTime != null) {

			generator.writeKey("bulk.avg_time");
			generator.write(this.bulk_avgTime);

		}
		if (this.bulk_avgSizeInBytes != null) {

			generator.writeKey("bulk.avg_size_in_bytes");
			generator.write(this.bulk_avgSizeInBytes);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodesRecord}.
	 */
	public static class Builder implements ObjectBuilder<NodesRecord> {
		@Nullable
		private String id;

		@Nullable
		private String pid;

		@Nullable
		private String ip;

		@Nullable
		private String port;

		@Nullable
		private String httpAddress;

		@Nullable
		private String version;

		@Nullable
		private String flavor;

		@Nullable
		private String type;

		@Nullable
		private String build;

		@Nullable
		private String jdk;

		@Nullable
		private JsonValue disk_total;

		@Nullable
		private JsonValue disk_used;

		@Nullable
		private JsonValue disk_avail;

		@Nullable
		private JsonValue disk_usedPercent;

		@Nullable
		private String heap_current;

		@Nullable
		private JsonValue heap_percent;

		@Nullable
		private String heap_max;

		@Nullable
		private String ram_current;

		@Nullable
		private JsonValue ram_percent;

		@Nullable
		private String ram_max;

		@Nullable
		private String fileDesc_current;

		@Nullable
		private JsonValue fileDesc_percent;

		@Nullable
		private String fileDesc_max;

		@Nullable
		private String cpu;

		@Nullable
		private String load1m;

		@Nullable
		private String load5m;

		@Nullable
		private String load15m;

		@Nullable
		private String uptime;

		@Nullable
		private String node_role;

		@Nullable
		private String master;

		@Nullable
		private String name;

		@Nullable
		private String completion_size;

		@Nullable
		private String fielddata_memorySize;

		@Nullable
		private String fielddata_evictions;

		@Nullable
		private String queryCache_memorySize;

		@Nullable
		private String queryCache_evictions;

		@Nullable
		private String queryCache_hitCount;

		@Nullable
		private String queryCache_missCount;

		@Nullable
		private String requestCache_memorySize;

		@Nullable
		private String requestCache_evictions;

		@Nullable
		private String requestCache_hitCount;

		@Nullable
		private String requestCache_missCount;

		@Nullable
		private String flush_total;

		@Nullable
		private String flush_totalTime;

		@Nullable
		private String get_current;

		@Nullable
		private String get_time;

		@Nullable
		private String get_total;

		@Nullable
		private String get_existsTime;

		@Nullable
		private String get_existsTotal;

		@Nullable
		private String get_missingTime;

		@Nullable
		private String get_missingTotal;

		@Nullable
		private String indexing_deleteCurrent;

		@Nullable
		private String indexing_deleteTime;

		@Nullable
		private String indexing_deleteTotal;

		@Nullable
		private String indexing_indexCurrent;

		@Nullable
		private String indexing_indexTime;

		@Nullable
		private String indexing_indexTotal;

		@Nullable
		private String indexing_indexFailed;

		@Nullable
		private String merges_current;

		@Nullable
		private String merges_currentDocs;

		@Nullable
		private String merges_currentSize;

		@Nullable
		private String merges_total;

		@Nullable
		private String merges_totalDocs;

		@Nullable
		private String merges_totalSize;

		@Nullable
		private String merges_totalTime;

		@Nullable
		private String refresh_total;

		@Nullable
		private String refresh_time;

		@Nullable
		private String refresh_externalTotal;

		@Nullable
		private String refresh_externalTime;

		@Nullable
		private String refresh_listeners;

		@Nullable
		private String script_compilations;

		@Nullable
		private String script_cacheEvictions;

		@Nullable
		private String script_compilationLimitTriggered;

		@Nullable
		private String search_fetchCurrent;

		@Nullable
		private String search_fetchTime;

		@Nullable
		private String search_fetchTotal;

		@Nullable
		private String search_openContexts;

		@Nullable
		private String search_queryCurrent;

		@Nullable
		private String search_queryTime;

		@Nullable
		private String search_queryTotal;

		@Nullable
		private String search_scrollCurrent;

		@Nullable
		private String search_scrollTime;

		@Nullable
		private String search_scrollTotal;

		@Nullable
		private String segments_count;

		@Nullable
		private String segments_memory;

		@Nullable
		private String segments_indexWriterMemory;

		@Nullable
		private String segments_versionMapMemory;

		@Nullable
		private String segments_fixedBitsetMemory;

		@Nullable
		private String suggest_current;

		@Nullable
		private String suggest_time;

		@Nullable
		private String suggest_total;

		@Nullable
		private String bulk_totalOperations;

		@Nullable
		private String bulk_totalTime;

		@Nullable
		private String bulk_totalSizeInBytes;

		@Nullable
		private String bulk_avgTime;

		@Nullable
		private String bulk_avgSizeInBytes;

		/**
		 * unique node id
		 * <p>
		 * API name: {@code id}
		 */
		public Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * process id
		 * <p>
		 * API name: {@code pid}
		 */
		public Builder pid(@Nullable String value) {
			this.pid = value;
			return this;
		}

		/**
		 * ip address
		 * <p>
		 * API name: {@code ip}
		 */
		public Builder ip(@Nullable String value) {
			this.ip = value;
			return this;
		}

		/**
		 * bound transport port
		 * <p>
		 * API name: {@code port}
		 */
		public Builder port(@Nullable String value) {
			this.port = value;
			return this;
		}

		/**
		 * bound http address
		 * <p>
		 * API name: {@code http_address}
		 */
		public Builder httpAddress(@Nullable String value) {
			this.httpAddress = value;
			return this;
		}

		/**
		 * es version
		 * <p>
		 * API name: {@code version}
		 */
		public Builder version(@Nullable String value) {
			this.version = value;
			return this;
		}

		/**
		 * es distribution flavor
		 * <p>
		 * API name: {@code flavor}
		 */
		public Builder flavor(@Nullable String value) {
			this.flavor = value;
			return this;
		}

		/**
		 * es distribution type
		 * <p>
		 * API name: {@code type}
		 */
		public Builder type(@Nullable String value) {
			this.type = value;
			return this;
		}

		/**
		 * es build hash
		 * <p>
		 * API name: {@code build}
		 */
		public Builder build(@Nullable String value) {
			this.build = value;
			return this;
		}

		/**
		 * jdk version
		 * <p>
		 * API name: {@code jdk}
		 */
		public Builder jdk(@Nullable String value) {
			this.jdk = value;
			return this;
		}

		/**
		 * total disk space
		 * <p>
		 * API name: {@code disk.total}
		 */
		public Builder disk_total(@Nullable JsonValue value) {
			this.disk_total = value;
			return this;
		}

		/**
		 * used disk space
		 * <p>
		 * API name: {@code disk.used}
		 */
		public Builder disk_used(@Nullable JsonValue value) {
			this.disk_used = value;
			return this;
		}

		/**
		 * available disk space
		 * <p>
		 * API name: {@code disk.avail}
		 */
		public Builder disk_avail(@Nullable JsonValue value) {
			this.disk_avail = value;
			return this;
		}

		/**
		 * used disk space percentage
		 * <p>
		 * API name: {@code disk.used_percent}
		 */
		public Builder disk_usedPercent(@Nullable JsonValue value) {
			this.disk_usedPercent = value;
			return this;
		}

		/**
		 * used heap
		 * <p>
		 * API name: {@code heap.current}
		 */
		public Builder heap_current(@Nullable String value) {
			this.heap_current = value;
			return this;
		}

		/**
		 * used heap ratio
		 * <p>
		 * API name: {@code heap.percent}
		 */
		public Builder heap_percent(@Nullable JsonValue value) {
			this.heap_percent = value;
			return this;
		}

		/**
		 * max configured heap
		 * <p>
		 * API name: {@code heap.max}
		 */
		public Builder heap_max(@Nullable String value) {
			this.heap_max = value;
			return this;
		}

		/**
		 * used machine memory
		 * <p>
		 * API name: {@code ram.current}
		 */
		public Builder ram_current(@Nullable String value) {
			this.ram_current = value;
			return this;
		}

		/**
		 * used machine memory ratio
		 * <p>
		 * API name: {@code ram.percent}
		 */
		public Builder ram_percent(@Nullable JsonValue value) {
			this.ram_percent = value;
			return this;
		}

		/**
		 * total machine memory
		 * <p>
		 * API name: {@code ram.max}
		 */
		public Builder ram_max(@Nullable String value) {
			this.ram_max = value;
			return this;
		}

		/**
		 * used file descriptors
		 * <p>
		 * API name: {@code file_desc.current}
		 */
		public Builder fileDesc_current(@Nullable String value) {
			this.fileDesc_current = value;
			return this;
		}

		/**
		 * used file descriptor ratio
		 * <p>
		 * API name: {@code file_desc.percent}
		 */
		public Builder fileDesc_percent(@Nullable JsonValue value) {
			this.fileDesc_percent = value;
			return this;
		}

		/**
		 * max file descriptors
		 * <p>
		 * API name: {@code file_desc.max}
		 */
		public Builder fileDesc_max(@Nullable String value) {
			this.fileDesc_max = value;
			return this;
		}

		/**
		 * recent cpu usage
		 * <p>
		 * API name: {@code cpu}
		 */
		public Builder cpu(@Nullable String value) {
			this.cpu = value;
			return this;
		}

		/**
		 * 1m load avg
		 * <p>
		 * API name: {@code load_1m}
		 */
		public Builder load1m(@Nullable String value) {
			this.load1m = value;
			return this;
		}

		/**
		 * 5m load avg
		 * <p>
		 * API name: {@code load_5m}
		 */
		public Builder load5m(@Nullable String value) {
			this.load5m = value;
			return this;
		}

		/**
		 * 15m load avg
		 * <p>
		 * API name: {@code load_15m}
		 */
		public Builder load15m(@Nullable String value) {
			this.load15m = value;
			return this;
		}

		/**
		 * node uptime
		 * <p>
		 * API name: {@code uptime}
		 */
		public Builder uptime(@Nullable String value) {
			this.uptime = value;
			return this;
		}

		/**
		 * m:master eligible node, d:data node, i:ingest node, -:coordinating node only
		 * <p>
		 * API name: {@code node.role}
		 */
		public Builder node_role(@Nullable String value) {
			this.node_role = value;
			return this;
		}

		/**
		 * *:current master
		 * <p>
		 * API name: {@code master}
		 */
		public Builder master(@Nullable String value) {
			this.master = value;
			return this;
		}

		/**
		 * node name
		 * <p>
		 * API name: {@code name}
		 */
		public Builder name(@Nullable String value) {
			this.name = value;
			return this;
		}

		/**
		 * size of completion
		 * <p>
		 * API name: {@code completion.size}
		 */
		public Builder completion_size(@Nullable String value) {
			this.completion_size = value;
			return this;
		}

		/**
		 * used fielddata cache
		 * <p>
		 * API name: {@code fielddata.memory_size}
		 */
		public Builder fielddata_memorySize(@Nullable String value) {
			this.fielddata_memorySize = value;
			return this;
		}

		/**
		 * fielddata evictions
		 * <p>
		 * API name: {@code fielddata.evictions}
		 */
		public Builder fielddata_evictions(@Nullable String value) {
			this.fielddata_evictions = value;
			return this;
		}

		/**
		 * used query cache
		 * <p>
		 * API name: {@code query_cache.memory_size}
		 */
		public Builder queryCache_memorySize(@Nullable String value) {
			this.queryCache_memorySize = value;
			return this;
		}

		/**
		 * query cache evictions
		 * <p>
		 * API name: {@code query_cache.evictions}
		 */
		public Builder queryCache_evictions(@Nullable String value) {
			this.queryCache_evictions = value;
			return this;
		}

		/**
		 * query cache hit counts
		 * <p>
		 * API name: {@code query_cache.hit_count}
		 */
		public Builder queryCache_hitCount(@Nullable String value) {
			this.queryCache_hitCount = value;
			return this;
		}

		/**
		 * query cache miss counts
		 * <p>
		 * API name: {@code query_cache.miss_count}
		 */
		public Builder queryCache_missCount(@Nullable String value) {
			this.queryCache_missCount = value;
			return this;
		}

		/**
		 * used request cache
		 * <p>
		 * API name: {@code request_cache.memory_size}
		 */
		public Builder requestCache_memorySize(@Nullable String value) {
			this.requestCache_memorySize = value;
			return this;
		}

		/**
		 * request cache evictions
		 * <p>
		 * API name: {@code request_cache.evictions}
		 */
		public Builder requestCache_evictions(@Nullable String value) {
			this.requestCache_evictions = value;
			return this;
		}

		/**
		 * request cache hit counts
		 * <p>
		 * API name: {@code request_cache.hit_count}
		 */
		public Builder requestCache_hitCount(@Nullable String value) {
			this.requestCache_hitCount = value;
			return this;
		}

		/**
		 * request cache miss counts
		 * <p>
		 * API name: {@code request_cache.miss_count}
		 */
		public Builder requestCache_missCount(@Nullable String value) {
			this.requestCache_missCount = value;
			return this;
		}

		/**
		 * number of flushes
		 * <p>
		 * API name: {@code flush.total}
		 */
		public Builder flush_total(@Nullable String value) {
			this.flush_total = value;
			return this;
		}

		/**
		 * time spent in flush
		 * <p>
		 * API name: {@code flush.total_time}
		 */
		public Builder flush_totalTime(@Nullable String value) {
			this.flush_totalTime = value;
			return this;
		}

		/**
		 * number of current get ops
		 * <p>
		 * API name: {@code get.current}
		 */
		public Builder get_current(@Nullable String value) {
			this.get_current = value;
			return this;
		}

		/**
		 * time spent in get
		 * <p>
		 * API name: {@code get.time}
		 */
		public Builder get_time(@Nullable String value) {
			this.get_time = value;
			return this;
		}

		/**
		 * number of get ops
		 * <p>
		 * API name: {@code get.total}
		 */
		public Builder get_total(@Nullable String value) {
			this.get_total = value;
			return this;
		}

		/**
		 * time spent in successful gets
		 * <p>
		 * API name: {@code get.exists_time}
		 */
		public Builder get_existsTime(@Nullable String value) {
			this.get_existsTime = value;
			return this;
		}

		/**
		 * number of successful gets
		 * <p>
		 * API name: {@code get.exists_total}
		 */
		public Builder get_existsTotal(@Nullable String value) {
			this.get_existsTotal = value;
			return this;
		}

		/**
		 * time spent in failed gets
		 * <p>
		 * API name: {@code get.missing_time}
		 */
		public Builder get_missingTime(@Nullable String value) {
			this.get_missingTime = value;
			return this;
		}

		/**
		 * number of failed gets
		 * <p>
		 * API name: {@code get.missing_total}
		 */
		public Builder get_missingTotal(@Nullable String value) {
			this.get_missingTotal = value;
			return this;
		}

		/**
		 * number of current deletions
		 * <p>
		 * API name: {@code indexing.delete_current}
		 */
		public Builder indexing_deleteCurrent(@Nullable String value) {
			this.indexing_deleteCurrent = value;
			return this;
		}

		/**
		 * time spent in deletions
		 * <p>
		 * API name: {@code indexing.delete_time}
		 */
		public Builder indexing_deleteTime(@Nullable String value) {
			this.indexing_deleteTime = value;
			return this;
		}

		/**
		 * number of delete ops
		 * <p>
		 * API name: {@code indexing.delete_total}
		 */
		public Builder indexing_deleteTotal(@Nullable String value) {
			this.indexing_deleteTotal = value;
			return this;
		}

		/**
		 * number of current indexing ops
		 * <p>
		 * API name: {@code indexing.index_current}
		 */
		public Builder indexing_indexCurrent(@Nullable String value) {
			this.indexing_indexCurrent = value;
			return this;
		}

		/**
		 * time spent in indexing
		 * <p>
		 * API name: {@code indexing.index_time}
		 */
		public Builder indexing_indexTime(@Nullable String value) {
			this.indexing_indexTime = value;
			return this;
		}

		/**
		 * number of indexing ops
		 * <p>
		 * API name: {@code indexing.index_total}
		 */
		public Builder indexing_indexTotal(@Nullable String value) {
			this.indexing_indexTotal = value;
			return this;
		}

		/**
		 * number of failed indexing ops
		 * <p>
		 * API name: {@code indexing.index_failed}
		 */
		public Builder indexing_indexFailed(@Nullable String value) {
			this.indexing_indexFailed = value;
			return this;
		}

		/**
		 * number of current merges
		 * <p>
		 * API name: {@code merges.current}
		 */
		public Builder merges_current(@Nullable String value) {
			this.merges_current = value;
			return this;
		}

		/**
		 * number of current merging docs
		 * <p>
		 * API name: {@code merges.current_docs}
		 */
		public Builder merges_currentDocs(@Nullable String value) {
			this.merges_currentDocs = value;
			return this;
		}

		/**
		 * size of current merges
		 * <p>
		 * API name: {@code merges.current_size}
		 */
		public Builder merges_currentSize(@Nullable String value) {
			this.merges_currentSize = value;
			return this;
		}

		/**
		 * number of completed merge ops
		 * <p>
		 * API name: {@code merges.total}
		 */
		public Builder merges_total(@Nullable String value) {
			this.merges_total = value;
			return this;
		}

		/**
		 * docs merged
		 * <p>
		 * API name: {@code merges.total_docs}
		 */
		public Builder merges_totalDocs(@Nullable String value) {
			this.merges_totalDocs = value;
			return this;
		}

		/**
		 * size merged
		 * <p>
		 * API name: {@code merges.total_size}
		 */
		public Builder merges_totalSize(@Nullable String value) {
			this.merges_totalSize = value;
			return this;
		}

		/**
		 * time spent in merges
		 * <p>
		 * API name: {@code merges.total_time}
		 */
		public Builder merges_totalTime(@Nullable String value) {
			this.merges_totalTime = value;
			return this;
		}

		/**
		 * total refreshes
		 * <p>
		 * API name: {@code refresh.total}
		 */
		public Builder refresh_total(@Nullable String value) {
			this.refresh_total = value;
			return this;
		}

		/**
		 * time spent in refreshes
		 * <p>
		 * API name: {@code refresh.time}
		 */
		public Builder refresh_time(@Nullable String value) {
			this.refresh_time = value;
			return this;
		}

		/**
		 * total external refreshes
		 * <p>
		 * API name: {@code refresh.external_total}
		 */
		public Builder refresh_externalTotal(@Nullable String value) {
			this.refresh_externalTotal = value;
			return this;
		}

		/**
		 * time spent in external refreshes
		 * <p>
		 * API name: {@code refresh.external_time}
		 */
		public Builder refresh_externalTime(@Nullable String value) {
			this.refresh_externalTime = value;
			return this;
		}

		/**
		 * number of pending refresh listeners
		 * <p>
		 * API name: {@code refresh.listeners}
		 */
		public Builder refresh_listeners(@Nullable String value) {
			this.refresh_listeners = value;
			return this;
		}

		/**
		 * script compilations
		 * <p>
		 * API name: {@code script.compilations}
		 */
		public Builder script_compilations(@Nullable String value) {
			this.script_compilations = value;
			return this;
		}

		/**
		 * script cache evictions
		 * <p>
		 * API name: {@code script.cache_evictions}
		 */
		public Builder script_cacheEvictions(@Nullable String value) {
			this.script_cacheEvictions = value;
			return this;
		}

		/**
		 * script cache compilation limit triggered
		 * <p>
		 * API name: {@code script.compilation_limit_triggered}
		 */
		public Builder script_compilationLimitTriggered(@Nullable String value) {
			this.script_compilationLimitTriggered = value;
			return this;
		}

		/**
		 * current fetch phase ops
		 * <p>
		 * API name: {@code search.fetch_current}
		 */
		public Builder search_fetchCurrent(@Nullable String value) {
			this.search_fetchCurrent = value;
			return this;
		}

		/**
		 * time spent in fetch phase
		 * <p>
		 * API name: {@code search.fetch_time}
		 */
		public Builder search_fetchTime(@Nullable String value) {
			this.search_fetchTime = value;
			return this;
		}

		/**
		 * total fetch ops
		 * <p>
		 * API name: {@code search.fetch_total}
		 */
		public Builder search_fetchTotal(@Nullable String value) {
			this.search_fetchTotal = value;
			return this;
		}

		/**
		 * open search contexts
		 * <p>
		 * API name: {@code search.open_contexts}
		 */
		public Builder search_openContexts(@Nullable String value) {
			this.search_openContexts = value;
			return this;
		}

		/**
		 * current query phase ops
		 * <p>
		 * API name: {@code search.query_current}
		 */
		public Builder search_queryCurrent(@Nullable String value) {
			this.search_queryCurrent = value;
			return this;
		}

		/**
		 * time spent in query phase
		 * <p>
		 * API name: {@code search.query_time}
		 */
		public Builder search_queryTime(@Nullable String value) {
			this.search_queryTime = value;
			return this;
		}

		/**
		 * total query phase ops
		 * <p>
		 * API name: {@code search.query_total}
		 */
		public Builder search_queryTotal(@Nullable String value) {
			this.search_queryTotal = value;
			return this;
		}

		/**
		 * open scroll contexts
		 * <p>
		 * API name: {@code search.scroll_current}
		 */
		public Builder search_scrollCurrent(@Nullable String value) {
			this.search_scrollCurrent = value;
			return this;
		}

		/**
		 * time scroll contexts held open
		 * <p>
		 * API name: {@code search.scroll_time}
		 */
		public Builder search_scrollTime(@Nullable String value) {
			this.search_scrollTime = value;
			return this;
		}

		/**
		 * completed scroll contexts
		 * <p>
		 * API name: {@code search.scroll_total}
		 */
		public Builder search_scrollTotal(@Nullable String value) {
			this.search_scrollTotal = value;
			return this;
		}

		/**
		 * number of segments
		 * <p>
		 * API name: {@code segments.count}
		 */
		public Builder segments_count(@Nullable String value) {
			this.segments_count = value;
			return this;
		}

		/**
		 * memory used by segments
		 * <p>
		 * API name: {@code segments.memory}
		 */
		public Builder segments_memory(@Nullable String value) {
			this.segments_memory = value;
			return this;
		}

		/**
		 * memory used by index writer
		 * <p>
		 * API name: {@code segments.index_writer_memory}
		 */
		public Builder segments_indexWriterMemory(@Nullable String value) {
			this.segments_indexWriterMemory = value;
			return this;
		}

		/**
		 * memory used by version map
		 * <p>
		 * API name: {@code segments.version_map_memory}
		 */
		public Builder segments_versionMapMemory(@Nullable String value) {
			this.segments_versionMapMemory = value;
			return this;
		}

		/**
		 * memory used by fixed bit sets for nested object field types and export type
		 * filters for types referred in _parent fields
		 * <p>
		 * API name: {@code segments.fixed_bitset_memory}
		 */
		public Builder segments_fixedBitsetMemory(@Nullable String value) {
			this.segments_fixedBitsetMemory = value;
			return this;
		}

		/**
		 * number of current suggest ops
		 * <p>
		 * API name: {@code suggest.current}
		 */
		public Builder suggest_current(@Nullable String value) {
			this.suggest_current = value;
			return this;
		}

		/**
		 * time spend in suggest
		 * <p>
		 * API name: {@code suggest.time}
		 */
		public Builder suggest_time(@Nullable String value) {
			this.suggest_time = value;
			return this;
		}

		/**
		 * number of suggest ops
		 * <p>
		 * API name: {@code suggest.total}
		 */
		public Builder suggest_total(@Nullable String value) {
			this.suggest_total = value;
			return this;
		}

		/**
		 * number of bulk shard ops
		 * <p>
		 * API name: {@code bulk.total_operations}
		 */
		public Builder bulk_totalOperations(@Nullable String value) {
			this.bulk_totalOperations = value;
			return this;
		}

		/**
		 * time spend in shard bulk
		 * <p>
		 * API name: {@code bulk.total_time}
		 */
		public Builder bulk_totalTime(@Nullable String value) {
			this.bulk_totalTime = value;
			return this;
		}

		/**
		 * total size in bytes of shard bulk
		 * <p>
		 * API name: {@code bulk.total_size_in_bytes}
		 */
		public Builder bulk_totalSizeInBytes(@Nullable String value) {
			this.bulk_totalSizeInBytes = value;
			return this;
		}

		/**
		 * average time spend in shard bulk
		 * <p>
		 * API name: {@code bulk.avg_time}
		 */
		public Builder bulk_avgTime(@Nullable String value) {
			this.bulk_avgTime = value;
			return this;
		}

		/**
		 * average size in bytes of shard bulk
		 * <p>
		 * API name: {@code bulk.avg_size_in_bytes}
		 */
		public Builder bulk_avgSizeInBytes(@Nullable String value) {
			this.bulk_avgSizeInBytes = value;
			return this;
		}

		/**
		 * Builds a {@link NodesRecord}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodesRecord build() {

			return new NodesRecord(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodesRecord}
	 */
	public static final JsonpDeserializer<NodesRecord> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, NodesRecord::setupNodesRecordDeserializer);

	protected static void setupNodesRecordDeserializer(DelegatingDeserializer<NodesRecord.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id", "nodeId");
		op.add(Builder::pid, JsonpDeserializer.stringDeserializer(), "pid", "p");
		op.add(Builder::ip, JsonpDeserializer.stringDeserializer(), "ip", "i");
		op.add(Builder::port, JsonpDeserializer.stringDeserializer(), "port", "po");
		op.add(Builder::httpAddress, JsonpDeserializer.stringDeserializer(), "http_address", "http");
		op.add(Builder::version, JsonpDeserializer.stringDeserializer(), "version", "v");
		op.add(Builder::flavor, JsonpDeserializer.stringDeserializer(), "flavor", "f");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type", "t");
		op.add(Builder::build, JsonpDeserializer.stringDeserializer(), "build", "b");
		op.add(Builder::jdk, JsonpDeserializer.stringDeserializer(), "jdk", "j");
		op.add(Builder::disk_total, JsonpDeserializer.jsonValueDeserializer(), "disk.total", "dt", "diskTotal");
		op.add(Builder::disk_used, JsonpDeserializer.jsonValueDeserializer(), "disk.used", "du", "diskUsed");
		op.add(Builder::disk_avail, JsonpDeserializer.jsonValueDeserializer(), "disk.avail", "d", "da", "disk",
				"diskAvail");
		op.add(Builder::disk_usedPercent, JsonpDeserializer.jsonValueDeserializer(), "disk.used_percent", "dup",
				"diskUsedPercent");
		op.add(Builder::heap_current, JsonpDeserializer.stringDeserializer(), "heap.current", "hc", "heapCurrent");
		op.add(Builder::heap_percent, JsonpDeserializer.jsonValueDeserializer(), "heap.percent", "hp", "heapPercent");
		op.add(Builder::heap_max, JsonpDeserializer.stringDeserializer(), "heap.max", "hm", "heapMax");
		op.add(Builder::ram_current, JsonpDeserializer.stringDeserializer(), "ram.current", "rc", "ramCurrent");
		op.add(Builder::ram_percent, JsonpDeserializer.jsonValueDeserializer(), "ram.percent", "rp", "ramPercent");
		op.add(Builder::ram_max, JsonpDeserializer.stringDeserializer(), "ram.max", "rn", "ramMax");
		op.add(Builder::fileDesc_current, JsonpDeserializer.stringDeserializer(), "file_desc.current", "fdc",
				"fileDescriptorCurrent");
		op.add(Builder::fileDesc_percent, JsonpDeserializer.jsonValueDeserializer(), "file_desc.percent", "fdp",
				"fileDescriptorPercent");
		op.add(Builder::fileDesc_max, JsonpDeserializer.stringDeserializer(), "file_desc.max", "fdm",
				"fileDescriptorMax");
		op.add(Builder::cpu, JsonpDeserializer.stringDeserializer(), "cpu");
		op.add(Builder::load1m, JsonpDeserializer.stringDeserializer(), "load_1m");
		op.add(Builder::load5m, JsonpDeserializer.stringDeserializer(), "load_5m");
		op.add(Builder::load15m, JsonpDeserializer.stringDeserializer(), "load_15m", "l");
		op.add(Builder::uptime, JsonpDeserializer.stringDeserializer(), "uptime", "u");
		op.add(Builder::node_role, JsonpDeserializer.stringDeserializer(), "node.role", "r", "role", "nodeRole");
		op.add(Builder::master, JsonpDeserializer.stringDeserializer(), "master", "m");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name", "n");
		op.add(Builder::completion_size, JsonpDeserializer.stringDeserializer(), "completion.size", "cs",
				"completionSize");
		op.add(Builder::fielddata_memorySize, JsonpDeserializer.stringDeserializer(), "fielddata.memory_size", "fm",
				"fielddataMemory");
		op.add(Builder::fielddata_evictions, JsonpDeserializer.stringDeserializer(), "fielddata.evictions", "fe",
				"fielddataEvictions");
		op.add(Builder::queryCache_memorySize, JsonpDeserializer.stringDeserializer(), "query_cache.memory_size", "qcm",
				"queryCacheMemory");
		op.add(Builder::queryCache_evictions, JsonpDeserializer.stringDeserializer(), "query_cache.evictions", "qce",
				"queryCacheEvictions");
		op.add(Builder::queryCache_hitCount, JsonpDeserializer.stringDeserializer(), "query_cache.hit_count", "qchc",
				"queryCacheHitCount");
		op.add(Builder::queryCache_missCount, JsonpDeserializer.stringDeserializer(), "query_cache.miss_count", "qcmc",
				"queryCacheMissCount");
		op.add(Builder::requestCache_memorySize, JsonpDeserializer.stringDeserializer(), "request_cache.memory_size",
				"rcm", "requestCacheMemory");
		op.add(Builder::requestCache_evictions, JsonpDeserializer.stringDeserializer(), "request_cache.evictions",
				"rce", "requestCacheEvictions");
		op.add(Builder::requestCache_hitCount, JsonpDeserializer.stringDeserializer(), "request_cache.hit_count",
				"rchc", "requestCacheHitCount");
		op.add(Builder::requestCache_missCount, JsonpDeserializer.stringDeserializer(), "request_cache.miss_count",
				"rcmc", "requestCacheMissCount");
		op.add(Builder::flush_total, JsonpDeserializer.stringDeserializer(), "flush.total", "ft", "flushTotal");
		op.add(Builder::flush_totalTime, JsonpDeserializer.stringDeserializer(), "flush.total_time", "ftt",
				"flushTotalTime");
		op.add(Builder::get_current, JsonpDeserializer.stringDeserializer(), "get.current", "gc", "getCurrent");
		op.add(Builder::get_time, JsonpDeserializer.stringDeserializer(), "get.time", "gti", "getTime");
		op.add(Builder::get_total, JsonpDeserializer.stringDeserializer(), "get.total", "gto", "getTotal");
		op.add(Builder::get_existsTime, JsonpDeserializer.stringDeserializer(), "get.exists_time", "geti",
				"getExistsTime");
		op.add(Builder::get_existsTotal, JsonpDeserializer.stringDeserializer(), "get.exists_total", "geto",
				"getExistsTotal");
		op.add(Builder::get_missingTime, JsonpDeserializer.stringDeserializer(), "get.missing_time", "gmti",
				"getMissingTime");
		op.add(Builder::get_missingTotal, JsonpDeserializer.stringDeserializer(), "get.missing_total", "gmto",
				"getMissingTotal");
		op.add(Builder::indexing_deleteCurrent, JsonpDeserializer.stringDeserializer(), "indexing.delete_current",
				"idc", "indexingDeleteCurrent");
		op.add(Builder::indexing_deleteTime, JsonpDeserializer.stringDeserializer(), "indexing.delete_time", "idti",
				"indexingDeleteTime");
		op.add(Builder::indexing_deleteTotal, JsonpDeserializer.stringDeserializer(), "indexing.delete_total", "idto",
				"indexingDeleteTotal");
		op.add(Builder::indexing_indexCurrent, JsonpDeserializer.stringDeserializer(), "indexing.index_current", "iic",
				"indexingIndexCurrent");
		op.add(Builder::indexing_indexTime, JsonpDeserializer.stringDeserializer(), "indexing.index_time", "iiti",
				"indexingIndexTime");
		op.add(Builder::indexing_indexTotal, JsonpDeserializer.stringDeserializer(), "indexing.index_total", "iito",
				"indexingIndexTotal");
		op.add(Builder::indexing_indexFailed, JsonpDeserializer.stringDeserializer(), "indexing.index_failed", "iif",
				"indexingIndexFailed");
		op.add(Builder::merges_current, JsonpDeserializer.stringDeserializer(), "merges.current", "mc",
				"mergesCurrent");
		op.add(Builder::merges_currentDocs, JsonpDeserializer.stringDeserializer(), "merges.current_docs", "mcd",
				"mergesCurrentDocs");
		op.add(Builder::merges_currentSize, JsonpDeserializer.stringDeserializer(), "merges.current_size", "mcs",
				"mergesCurrentSize");
		op.add(Builder::merges_total, JsonpDeserializer.stringDeserializer(), "merges.total", "mt", "mergesTotal");
		op.add(Builder::merges_totalDocs, JsonpDeserializer.stringDeserializer(), "merges.total_docs", "mtd",
				"mergesTotalDocs");
		op.add(Builder::merges_totalSize, JsonpDeserializer.stringDeserializer(), "merges.total_size", "mts",
				"mergesTotalSize");
		op.add(Builder::merges_totalTime, JsonpDeserializer.stringDeserializer(), "merges.total_time", "mtt",
				"mergesTotalTime");
		op.add(Builder::refresh_total, JsonpDeserializer.stringDeserializer(), "refresh.total");
		op.add(Builder::refresh_time, JsonpDeserializer.stringDeserializer(), "refresh.time");
		op.add(Builder::refresh_externalTotal, JsonpDeserializer.stringDeserializer(), "refresh.external_total", "rto",
				"refreshTotal");
		op.add(Builder::refresh_externalTime, JsonpDeserializer.stringDeserializer(), "refresh.external_time", "rti",
				"refreshTime");
		op.add(Builder::refresh_listeners, JsonpDeserializer.stringDeserializer(), "refresh.listeners", "rli",
				"refreshListeners");
		op.add(Builder::script_compilations, JsonpDeserializer.stringDeserializer(), "script.compilations", "scrcc",
				"scriptCompilations");
		op.add(Builder::script_cacheEvictions, JsonpDeserializer.stringDeserializer(), "script.cache_evictions",
				"scrce", "scriptCacheEvictions");
		op.add(Builder::script_compilationLimitTriggered, JsonpDeserializer.stringDeserializer(),
				"script.compilation_limit_triggered", "scrclt", "scriptCacheCompilationLimitTriggered");
		op.add(Builder::search_fetchCurrent, JsonpDeserializer.stringDeserializer(), "search.fetch_current", "sfc",
				"searchFetchCurrent");
		op.add(Builder::search_fetchTime, JsonpDeserializer.stringDeserializer(), "search.fetch_time", "sfti",
				"searchFetchTime");
		op.add(Builder::search_fetchTotal, JsonpDeserializer.stringDeserializer(), "search.fetch_total", "sfto",
				"searchFetchTotal");
		op.add(Builder::search_openContexts, JsonpDeserializer.stringDeserializer(), "search.open_contexts", "so",
				"searchOpenContexts");
		op.add(Builder::search_queryCurrent, JsonpDeserializer.stringDeserializer(), "search.query_current", "sqc",
				"searchQueryCurrent");
		op.add(Builder::search_queryTime, JsonpDeserializer.stringDeserializer(), "search.query_time", "sqti",
				"searchQueryTime");
		op.add(Builder::search_queryTotal, JsonpDeserializer.stringDeserializer(), "search.query_total", "sqto",
				"searchQueryTotal");
		op.add(Builder::search_scrollCurrent, JsonpDeserializer.stringDeserializer(), "search.scroll_current", "scc",
				"searchScrollCurrent");
		op.add(Builder::search_scrollTime, JsonpDeserializer.stringDeserializer(), "search.scroll_time", "scti",
				"searchScrollTime");
		op.add(Builder::search_scrollTotal, JsonpDeserializer.stringDeserializer(), "search.scroll_total", "scto",
				"searchScrollTotal");
		op.add(Builder::segments_count, JsonpDeserializer.stringDeserializer(), "segments.count", "sc",
				"segmentsCount");
		op.add(Builder::segments_memory, JsonpDeserializer.stringDeserializer(), "segments.memory", "sm",
				"segmentsMemory");
		op.add(Builder::segments_indexWriterMemory, JsonpDeserializer.stringDeserializer(),
				"segments.index_writer_memory", "siwm", "segmentsIndexWriterMemory");
		op.add(Builder::segments_versionMapMemory, JsonpDeserializer.stringDeserializer(),
				"segments.version_map_memory", "svmm", "segmentsVersionMapMemory");
		op.add(Builder::segments_fixedBitsetMemory, JsonpDeserializer.stringDeserializer(),
				"segments.fixed_bitset_memory", "sfbm", "fixedBitsetMemory");
		op.add(Builder::suggest_current, JsonpDeserializer.stringDeserializer(), "suggest.current", "suc",
				"suggestCurrent");
		op.add(Builder::suggest_time, JsonpDeserializer.stringDeserializer(), "suggest.time", "suti", "suggestTime");
		op.add(Builder::suggest_total, JsonpDeserializer.stringDeserializer(), "suggest.total", "suto", "suggestTotal");
		op.add(Builder::bulk_totalOperations, JsonpDeserializer.stringDeserializer(), "bulk.total_operations", "bto",
				"bulkTotalOperations");
		op.add(Builder::bulk_totalTime, JsonpDeserializer.stringDeserializer(), "bulk.total_time", "btti",
				"bulkTotalTime");
		op.add(Builder::bulk_totalSizeInBytes, JsonpDeserializer.stringDeserializer(), "bulk.total_size_in_bytes",
				"btsi", "bulkTotalSizeInBytes");
		op.add(Builder::bulk_avgTime, JsonpDeserializer.stringDeserializer(), "bulk.avg_time", "bati", "bulkAvgTime");
		op.add(Builder::bulk_avgSizeInBytes, JsonpDeserializer.stringDeserializer(), "bulk.avg_size_in_bytes", "basi",
				"bulkAvgSizeInBytes");

	}

}
