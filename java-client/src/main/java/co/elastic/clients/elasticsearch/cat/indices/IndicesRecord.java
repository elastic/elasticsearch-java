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

package co.elastic.clients.elasticsearch.cat.indices;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import javax.annotation.Nullable;

// typedef: cat.indices.IndicesRecord
public final class IndicesRecord implements ToJsonp {
	@Nullable
	private final String health;

	@Nullable
	private final String status;

	@Nullable
	private final String index;

	@Nullable
	private final String uuid;

	@Nullable
	private final String pri;

	@Nullable
	private final String rep;

	@Nullable
	private final String docs_count;

	@Nullable
	private final String docs_deleted;

	@Nullable
	private final String creation_date;

	@Nullable
	private final String creation_date_string;

	@Nullable
	private final String store_size;

	@Nullable
	private final String pri_store_size;

	@Nullable
	private final String completion_size;

	@Nullable
	private final String pri_completion_size;

	@Nullable
	private final String fielddata_memorySize;

	@Nullable
	private final String pri_fielddata_memorySize;

	@Nullable
	private final String fielddata_evictions;

	@Nullable
	private final String pri_fielddata_evictions;

	@Nullable
	private final String queryCache_memorySize;

	@Nullable
	private final String pri_queryCache_memorySize;

	@Nullable
	private final String queryCache_evictions;

	@Nullable
	private final String pri_queryCache_evictions;

	@Nullable
	private final String requestCache_memorySize;

	@Nullable
	private final String pri_requestCache_memorySize;

	@Nullable
	private final String requestCache_evictions;

	@Nullable
	private final String pri_requestCache_evictions;

	@Nullable
	private final String requestCache_hitCount;

	@Nullable
	private final String pri_requestCache_hitCount;

	@Nullable
	private final String requestCache_missCount;

	@Nullable
	private final String pri_requestCache_missCount;

	@Nullable
	private final String flush_total;

	@Nullable
	private final String pri_flush_total;

	@Nullable
	private final String flush_totalTime;

	@Nullable
	private final String pri_flush_totalTime;

	@Nullable
	private final String get_current;

	@Nullable
	private final String pri_get_current;

	@Nullable
	private final String get_time;

	@Nullable
	private final String pri_get_time;

	@Nullable
	private final String get_total;

	@Nullable
	private final String pri_get_total;

	@Nullable
	private final String get_existsTime;

	@Nullable
	private final String pri_get_existsTime;

	@Nullable
	private final String get_existsTotal;

	@Nullable
	private final String pri_get_existsTotal;

	@Nullable
	private final String get_missingTime;

	@Nullable
	private final String pri_get_missingTime;

	@Nullable
	private final String get_missingTotal;

	@Nullable
	private final String pri_get_missingTotal;

	@Nullable
	private final String indexing_deleteCurrent;

	@Nullable
	private final String pri_indexing_deleteCurrent;

	@Nullable
	private final String indexing_deleteTime;

	@Nullable
	private final String pri_indexing_deleteTime;

	@Nullable
	private final String indexing_deleteTotal;

	@Nullable
	private final String pri_indexing_deleteTotal;

	@Nullable
	private final String indexing_indexCurrent;

	@Nullable
	private final String pri_indexing_indexCurrent;

	@Nullable
	private final String indexing_indexTime;

	@Nullable
	private final String pri_indexing_indexTime;

	@Nullable
	private final String indexing_indexTotal;

	@Nullable
	private final String pri_indexing_indexTotal;

	@Nullable
	private final String indexing_indexFailed;

	@Nullable
	private final String pri_indexing_indexFailed;

	@Nullable
	private final String merges_current;

	@Nullable
	private final String pri_merges_current;

	@Nullable
	private final String merges_currentDocs;

	@Nullable
	private final String pri_merges_currentDocs;

	@Nullable
	private final String merges_currentSize;

	@Nullable
	private final String pri_merges_currentSize;

	@Nullable
	private final String merges_total;

	@Nullable
	private final String pri_merges_total;

	@Nullable
	private final String merges_totalDocs;

	@Nullable
	private final String pri_merges_totalDocs;

	@Nullable
	private final String merges_totalSize;

	@Nullable
	private final String pri_merges_totalSize;

	@Nullable
	private final String merges_totalTime;

	@Nullable
	private final String pri_merges_totalTime;

	@Nullable
	private final String refresh_total;

	@Nullable
	private final String pri_refresh_total;

	@Nullable
	private final String refresh_time;

	@Nullable
	private final String pri_refresh_time;

	@Nullable
	private final String refresh_externalTotal;

	@Nullable
	private final String pri_refresh_externalTotal;

	@Nullable
	private final String refresh_externalTime;

	@Nullable
	private final String pri_refresh_externalTime;

	@Nullable
	private final String refresh_listeners;

	@Nullable
	private final String pri_refresh_listeners;

	@Nullable
	private final String search_fetchCurrent;

	@Nullable
	private final String pri_search_fetchCurrent;

	@Nullable
	private final String search_fetchTime;

	@Nullable
	private final String pri_search_fetchTime;

	@Nullable
	private final String search_fetchTotal;

	@Nullable
	private final String pri_search_fetchTotal;

	@Nullable
	private final String search_openContexts;

	@Nullable
	private final String pri_search_openContexts;

	@Nullable
	private final String search_queryCurrent;

	@Nullable
	private final String pri_search_queryCurrent;

	@Nullable
	private final String search_queryTime;

	@Nullable
	private final String pri_search_queryTime;

	@Nullable
	private final String search_queryTotal;

	@Nullable
	private final String pri_search_queryTotal;

	@Nullable
	private final String search_scrollCurrent;

	@Nullable
	private final String pri_search_scrollCurrent;

	@Nullable
	private final String search_scrollTime;

	@Nullable
	private final String pri_search_scrollTime;

	@Nullable
	private final String search_scrollTotal;

	@Nullable
	private final String pri_search_scrollTotal;

	@Nullable
	private final String segments_count;

	@Nullable
	private final String pri_segments_count;

	@Nullable
	private final String segments_memory;

	@Nullable
	private final String pri_segments_memory;

	@Nullable
	private final String segments_indexWriterMemory;

	@Nullable
	private final String pri_segments_indexWriterMemory;

	@Nullable
	private final String segments_versionMapMemory;

	@Nullable
	private final String pri_segments_versionMapMemory;

	@Nullable
	private final String segments_fixedBitsetMemory;

	@Nullable
	private final String pri_segments_fixedBitsetMemory;

	@Nullable
	private final String warmer_current;

	@Nullable
	private final String pri_warmer_current;

	@Nullable
	private final String warmer_total;

	@Nullable
	private final String pri_warmer_total;

	@Nullable
	private final String warmer_totalTime;

	@Nullable
	private final String pri_warmer_totalTime;

	@Nullable
	private final String suggest_current;

	@Nullable
	private final String pri_suggest_current;

	@Nullable
	private final String suggest_time;

	@Nullable
	private final String pri_suggest_time;

	@Nullable
	private final String suggest_total;

	@Nullable
	private final String pri_suggest_total;

	@Nullable
	private final String memory_total;

	@Nullable
	private final String pri_memory_total;

	@Nullable
	private final String search_throttled;

	@Nullable
	private final String bulk_totalOperations;

	@Nullable
	private final String pri_bulk_totalOperations;

	@Nullable
	private final String bulk_totalTime;

	@Nullable
	private final String pri_bulk_totalTime;

	@Nullable
	private final String bulk_totalSizeInBytes;

	@Nullable
	private final String pri_bulk_totalSizeInBytes;

	@Nullable
	private final String bulk_avgTime;

	@Nullable
	private final String pri_bulk_avgTime;

	@Nullable
	private final String bulk_avgSizeInBytes;

	@Nullable
	private final String pri_bulk_avgSizeInBytes;

	// ---------------------------------------------------------------------------------------------

	protected IndicesRecord(Builder builder) {

		this.health = builder.health;
		this.status = builder.status;
		this.index = builder.index;
		this.uuid = builder.uuid;
		this.pri = builder.pri;
		this.rep = builder.rep;
		this.docs_count = builder.docs_count;
		this.docs_deleted = builder.docs_deleted;
		this.creation_date = builder.creation_date;
		this.creation_date_string = builder.creation_date_string;
		this.store_size = builder.store_size;
		this.pri_store_size = builder.pri_store_size;
		this.completion_size = builder.completion_size;
		this.pri_completion_size = builder.pri_completion_size;
		this.fielddata_memorySize = builder.fielddata_memorySize;
		this.pri_fielddata_memorySize = builder.pri_fielddata_memorySize;
		this.fielddata_evictions = builder.fielddata_evictions;
		this.pri_fielddata_evictions = builder.pri_fielddata_evictions;
		this.queryCache_memorySize = builder.queryCache_memorySize;
		this.pri_queryCache_memorySize = builder.pri_queryCache_memorySize;
		this.queryCache_evictions = builder.queryCache_evictions;
		this.pri_queryCache_evictions = builder.pri_queryCache_evictions;
		this.requestCache_memorySize = builder.requestCache_memorySize;
		this.pri_requestCache_memorySize = builder.pri_requestCache_memorySize;
		this.requestCache_evictions = builder.requestCache_evictions;
		this.pri_requestCache_evictions = builder.pri_requestCache_evictions;
		this.requestCache_hitCount = builder.requestCache_hitCount;
		this.pri_requestCache_hitCount = builder.pri_requestCache_hitCount;
		this.requestCache_missCount = builder.requestCache_missCount;
		this.pri_requestCache_missCount = builder.pri_requestCache_missCount;
		this.flush_total = builder.flush_total;
		this.pri_flush_total = builder.pri_flush_total;
		this.flush_totalTime = builder.flush_totalTime;
		this.pri_flush_totalTime = builder.pri_flush_totalTime;
		this.get_current = builder.get_current;
		this.pri_get_current = builder.pri_get_current;
		this.get_time = builder.get_time;
		this.pri_get_time = builder.pri_get_time;
		this.get_total = builder.get_total;
		this.pri_get_total = builder.pri_get_total;
		this.get_existsTime = builder.get_existsTime;
		this.pri_get_existsTime = builder.pri_get_existsTime;
		this.get_existsTotal = builder.get_existsTotal;
		this.pri_get_existsTotal = builder.pri_get_existsTotal;
		this.get_missingTime = builder.get_missingTime;
		this.pri_get_missingTime = builder.pri_get_missingTime;
		this.get_missingTotal = builder.get_missingTotal;
		this.pri_get_missingTotal = builder.pri_get_missingTotal;
		this.indexing_deleteCurrent = builder.indexing_deleteCurrent;
		this.pri_indexing_deleteCurrent = builder.pri_indexing_deleteCurrent;
		this.indexing_deleteTime = builder.indexing_deleteTime;
		this.pri_indexing_deleteTime = builder.pri_indexing_deleteTime;
		this.indexing_deleteTotal = builder.indexing_deleteTotal;
		this.pri_indexing_deleteTotal = builder.pri_indexing_deleteTotal;
		this.indexing_indexCurrent = builder.indexing_indexCurrent;
		this.pri_indexing_indexCurrent = builder.pri_indexing_indexCurrent;
		this.indexing_indexTime = builder.indexing_indexTime;
		this.pri_indexing_indexTime = builder.pri_indexing_indexTime;
		this.indexing_indexTotal = builder.indexing_indexTotal;
		this.pri_indexing_indexTotal = builder.pri_indexing_indexTotal;
		this.indexing_indexFailed = builder.indexing_indexFailed;
		this.pri_indexing_indexFailed = builder.pri_indexing_indexFailed;
		this.merges_current = builder.merges_current;
		this.pri_merges_current = builder.pri_merges_current;
		this.merges_currentDocs = builder.merges_currentDocs;
		this.pri_merges_currentDocs = builder.pri_merges_currentDocs;
		this.merges_currentSize = builder.merges_currentSize;
		this.pri_merges_currentSize = builder.pri_merges_currentSize;
		this.merges_total = builder.merges_total;
		this.pri_merges_total = builder.pri_merges_total;
		this.merges_totalDocs = builder.merges_totalDocs;
		this.pri_merges_totalDocs = builder.pri_merges_totalDocs;
		this.merges_totalSize = builder.merges_totalSize;
		this.pri_merges_totalSize = builder.pri_merges_totalSize;
		this.merges_totalTime = builder.merges_totalTime;
		this.pri_merges_totalTime = builder.pri_merges_totalTime;
		this.refresh_total = builder.refresh_total;
		this.pri_refresh_total = builder.pri_refresh_total;
		this.refresh_time = builder.refresh_time;
		this.pri_refresh_time = builder.pri_refresh_time;
		this.refresh_externalTotal = builder.refresh_externalTotal;
		this.pri_refresh_externalTotal = builder.pri_refresh_externalTotal;
		this.refresh_externalTime = builder.refresh_externalTime;
		this.pri_refresh_externalTime = builder.pri_refresh_externalTime;
		this.refresh_listeners = builder.refresh_listeners;
		this.pri_refresh_listeners = builder.pri_refresh_listeners;
		this.search_fetchCurrent = builder.search_fetchCurrent;
		this.pri_search_fetchCurrent = builder.pri_search_fetchCurrent;
		this.search_fetchTime = builder.search_fetchTime;
		this.pri_search_fetchTime = builder.pri_search_fetchTime;
		this.search_fetchTotal = builder.search_fetchTotal;
		this.pri_search_fetchTotal = builder.pri_search_fetchTotal;
		this.search_openContexts = builder.search_openContexts;
		this.pri_search_openContexts = builder.pri_search_openContexts;
		this.search_queryCurrent = builder.search_queryCurrent;
		this.pri_search_queryCurrent = builder.pri_search_queryCurrent;
		this.search_queryTime = builder.search_queryTime;
		this.pri_search_queryTime = builder.pri_search_queryTime;
		this.search_queryTotal = builder.search_queryTotal;
		this.pri_search_queryTotal = builder.pri_search_queryTotal;
		this.search_scrollCurrent = builder.search_scrollCurrent;
		this.pri_search_scrollCurrent = builder.pri_search_scrollCurrent;
		this.search_scrollTime = builder.search_scrollTime;
		this.pri_search_scrollTime = builder.pri_search_scrollTime;
		this.search_scrollTotal = builder.search_scrollTotal;
		this.pri_search_scrollTotal = builder.pri_search_scrollTotal;
		this.segments_count = builder.segments_count;
		this.pri_segments_count = builder.pri_segments_count;
		this.segments_memory = builder.segments_memory;
		this.pri_segments_memory = builder.pri_segments_memory;
		this.segments_indexWriterMemory = builder.segments_indexWriterMemory;
		this.pri_segments_indexWriterMemory = builder.pri_segments_indexWriterMemory;
		this.segments_versionMapMemory = builder.segments_versionMapMemory;
		this.pri_segments_versionMapMemory = builder.pri_segments_versionMapMemory;
		this.segments_fixedBitsetMemory = builder.segments_fixedBitsetMemory;
		this.pri_segments_fixedBitsetMemory = builder.pri_segments_fixedBitsetMemory;
		this.warmer_current = builder.warmer_current;
		this.pri_warmer_current = builder.pri_warmer_current;
		this.warmer_total = builder.warmer_total;
		this.pri_warmer_total = builder.pri_warmer_total;
		this.warmer_totalTime = builder.warmer_totalTime;
		this.pri_warmer_totalTime = builder.pri_warmer_totalTime;
		this.suggest_current = builder.suggest_current;
		this.pri_suggest_current = builder.pri_suggest_current;
		this.suggest_time = builder.suggest_time;
		this.pri_suggest_time = builder.pri_suggest_time;
		this.suggest_total = builder.suggest_total;
		this.pri_suggest_total = builder.pri_suggest_total;
		this.memory_total = builder.memory_total;
		this.pri_memory_total = builder.pri_memory_total;
		this.search_throttled = builder.search_throttled;
		this.bulk_totalOperations = builder.bulk_totalOperations;
		this.pri_bulk_totalOperations = builder.pri_bulk_totalOperations;
		this.bulk_totalTime = builder.bulk_totalTime;
		this.pri_bulk_totalTime = builder.pri_bulk_totalTime;
		this.bulk_totalSizeInBytes = builder.bulk_totalSizeInBytes;
		this.pri_bulk_totalSizeInBytes = builder.pri_bulk_totalSizeInBytes;
		this.bulk_avgTime = builder.bulk_avgTime;
		this.pri_bulk_avgTime = builder.pri_bulk_avgTime;
		this.bulk_avgSizeInBytes = builder.bulk_avgSizeInBytes;
		this.pri_bulk_avgSizeInBytes = builder.pri_bulk_avgSizeInBytes;

	}

	/**
	 * current health status
	 * <p>
	 * API name: {@code health}
	 */
	@Nullable
	public String health() {
		return this.health;
	}

	/**
	 * open/close status
	 * <p>
	 * API name: {@code status}
	 */
	@Nullable
	public String status() {
		return this.status;
	}

	/**
	 * index name
	 * <p>
	 * API name: {@code index}
	 */
	@Nullable
	public String index() {
		return this.index;
	}

	/**
	 * index uuid
	 * <p>
	 * API name: {@code uuid}
	 */
	@Nullable
	public String uuid() {
		return this.uuid;
	}

	/**
	 * number of primary shards
	 * <p>
	 * API name: {@code pri}
	 */
	@Nullable
	public String pri() {
		return this.pri;
	}

	/**
	 * number of replica shards
	 * <p>
	 * API name: {@code rep}
	 */
	@Nullable
	public String rep() {
		return this.rep;
	}

	/**
	 * available docs
	 * <p>
	 * API name: {@code docs.count}
	 */
	@Nullable
	public String docs_count() {
		return this.docs_count;
	}

	/**
	 * deleted docs
	 * <p>
	 * API name: {@code docs.deleted}
	 */
	@Nullable
	public String docs_deleted() {
		return this.docs_deleted;
	}

	/**
	 * index creation date (millisecond value)
	 * <p>
	 * API name: {@code creation.date}
	 */
	@Nullable
	public String creation_date() {
		return this.creation_date;
	}

	/**
	 * index creation date (as string)
	 * <p>
	 * API name: {@code creation.date.string}
	 */
	@Nullable
	public String creation_date_string() {
		return this.creation_date_string;
	}

	/**
	 * store size of primaries &amp; replicas
	 * <p>
	 * API name: {@code store.size}
	 */
	@Nullable
	public String store_size() {
		return this.store_size;
	}

	/**
	 * store size of primaries
	 * <p>
	 * API name: {@code pri.store.size}
	 */
	@Nullable
	public String pri_store_size() {
		return this.pri_store_size;
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
	 * size of completion
	 * <p>
	 * API name: {@code pri.completion.size}
	 */
	@Nullable
	public String pri_completion_size() {
		return this.pri_completion_size;
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
	 * used fielddata cache
	 * <p>
	 * API name: {@code pri.fielddata.memory_size}
	 */
	@Nullable
	public String pri_fielddata_memorySize() {
		return this.pri_fielddata_memorySize;
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
	 * fielddata evictions
	 * <p>
	 * API name: {@code pri.fielddata.evictions}
	 */
	@Nullable
	public String pri_fielddata_evictions() {
		return this.pri_fielddata_evictions;
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
	 * used query cache
	 * <p>
	 * API name: {@code pri.query_cache.memory_size}
	 */
	@Nullable
	public String pri_queryCache_memorySize() {
		return this.pri_queryCache_memorySize;
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
	 * query cache evictions
	 * <p>
	 * API name: {@code pri.query_cache.evictions}
	 */
	@Nullable
	public String pri_queryCache_evictions() {
		return this.pri_queryCache_evictions;
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
	 * used request cache
	 * <p>
	 * API name: {@code pri.request_cache.memory_size}
	 */
	@Nullable
	public String pri_requestCache_memorySize() {
		return this.pri_requestCache_memorySize;
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
	 * request cache evictions
	 * <p>
	 * API name: {@code pri.request_cache.evictions}
	 */
	@Nullable
	public String pri_requestCache_evictions() {
		return this.pri_requestCache_evictions;
	}

	/**
	 * request cache hit count
	 * <p>
	 * API name: {@code request_cache.hit_count}
	 */
	@Nullable
	public String requestCache_hitCount() {
		return this.requestCache_hitCount;
	}

	/**
	 * request cache hit count
	 * <p>
	 * API name: {@code pri.request_cache.hit_count}
	 */
	@Nullable
	public String pri_requestCache_hitCount() {
		return this.pri_requestCache_hitCount;
	}

	/**
	 * request cache miss count
	 * <p>
	 * API name: {@code request_cache.miss_count}
	 */
	@Nullable
	public String requestCache_missCount() {
		return this.requestCache_missCount;
	}

	/**
	 * request cache miss count
	 * <p>
	 * API name: {@code pri.request_cache.miss_count}
	 */
	@Nullable
	public String pri_requestCache_missCount() {
		return this.pri_requestCache_missCount;
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
	 * number of flushes
	 * <p>
	 * API name: {@code pri.flush.total}
	 */
	@Nullable
	public String pri_flush_total() {
		return this.pri_flush_total;
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
	 * time spent in flush
	 * <p>
	 * API name: {@code pri.flush.total_time}
	 */
	@Nullable
	public String pri_flush_totalTime() {
		return this.pri_flush_totalTime;
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
	 * number of current get ops
	 * <p>
	 * API name: {@code pri.get.current}
	 */
	@Nullable
	public String pri_get_current() {
		return this.pri_get_current;
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
	 * time spent in get
	 * <p>
	 * API name: {@code pri.get.time}
	 */
	@Nullable
	public String pri_get_time() {
		return this.pri_get_time;
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
	 * number of get ops
	 * <p>
	 * API name: {@code pri.get.total}
	 */
	@Nullable
	public String pri_get_total() {
		return this.pri_get_total;
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
	 * time spent in successful gets
	 * <p>
	 * API name: {@code pri.get.exists_time}
	 */
	@Nullable
	public String pri_get_existsTime() {
		return this.pri_get_existsTime;
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
	 * number of successful gets
	 * <p>
	 * API name: {@code pri.get.exists_total}
	 */
	@Nullable
	public String pri_get_existsTotal() {
		return this.pri_get_existsTotal;
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
	 * time spent in failed gets
	 * <p>
	 * API name: {@code pri.get.missing_time}
	 */
	@Nullable
	public String pri_get_missingTime() {
		return this.pri_get_missingTime;
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
	 * number of failed gets
	 * <p>
	 * API name: {@code pri.get.missing_total}
	 */
	@Nullable
	public String pri_get_missingTotal() {
		return this.pri_get_missingTotal;
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
	 * number of current deletions
	 * <p>
	 * API name: {@code pri.indexing.delete_current}
	 */
	@Nullable
	public String pri_indexing_deleteCurrent() {
		return this.pri_indexing_deleteCurrent;
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
	 * time spent in deletions
	 * <p>
	 * API name: {@code pri.indexing.delete_time}
	 */
	@Nullable
	public String pri_indexing_deleteTime() {
		return this.pri_indexing_deleteTime;
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
	 * number of delete ops
	 * <p>
	 * API name: {@code pri.indexing.delete_total}
	 */
	@Nullable
	public String pri_indexing_deleteTotal() {
		return this.pri_indexing_deleteTotal;
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
	 * number of current indexing ops
	 * <p>
	 * API name: {@code pri.indexing.index_current}
	 */
	@Nullable
	public String pri_indexing_indexCurrent() {
		return this.pri_indexing_indexCurrent;
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
	 * time spent in indexing
	 * <p>
	 * API name: {@code pri.indexing.index_time}
	 */
	@Nullable
	public String pri_indexing_indexTime() {
		return this.pri_indexing_indexTime;
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
	 * number of indexing ops
	 * <p>
	 * API name: {@code pri.indexing.index_total}
	 */
	@Nullable
	public String pri_indexing_indexTotal() {
		return this.pri_indexing_indexTotal;
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
	 * number of failed indexing ops
	 * <p>
	 * API name: {@code pri.indexing.index_failed}
	 */
	@Nullable
	public String pri_indexing_indexFailed() {
		return this.pri_indexing_indexFailed;
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
	 * number of current merges
	 * <p>
	 * API name: {@code pri.merges.current}
	 */
	@Nullable
	public String pri_merges_current() {
		return this.pri_merges_current;
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
	 * number of current merging docs
	 * <p>
	 * API name: {@code pri.merges.current_docs}
	 */
	@Nullable
	public String pri_merges_currentDocs() {
		return this.pri_merges_currentDocs;
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
	 * size of current merges
	 * <p>
	 * API name: {@code pri.merges.current_size}
	 */
	@Nullable
	public String pri_merges_currentSize() {
		return this.pri_merges_currentSize;
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
	 * number of completed merge ops
	 * <p>
	 * API name: {@code pri.merges.total}
	 */
	@Nullable
	public String pri_merges_total() {
		return this.pri_merges_total;
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
	 * docs merged
	 * <p>
	 * API name: {@code pri.merges.total_docs}
	 */
	@Nullable
	public String pri_merges_totalDocs() {
		return this.pri_merges_totalDocs;
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
	 * size merged
	 * <p>
	 * API name: {@code pri.merges.total_size}
	 */
	@Nullable
	public String pri_merges_totalSize() {
		return this.pri_merges_totalSize;
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
	 * time spent in merges
	 * <p>
	 * API name: {@code pri.merges.total_time}
	 */
	@Nullable
	public String pri_merges_totalTime() {
		return this.pri_merges_totalTime;
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
	 * total refreshes
	 * <p>
	 * API name: {@code pri.refresh.total}
	 */
	@Nullable
	public String pri_refresh_total() {
		return this.pri_refresh_total;
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
	 * time spent in refreshes
	 * <p>
	 * API name: {@code pri.refresh.time}
	 */
	@Nullable
	public String pri_refresh_time() {
		return this.pri_refresh_time;
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
	 * total external refreshes
	 * <p>
	 * API name: {@code pri.refresh.external_total}
	 */
	@Nullable
	public String pri_refresh_externalTotal() {
		return this.pri_refresh_externalTotal;
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
	 * time spent in external refreshes
	 * <p>
	 * API name: {@code pri.refresh.external_time}
	 */
	@Nullable
	public String pri_refresh_externalTime() {
		return this.pri_refresh_externalTime;
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
	 * number of pending refresh listeners
	 * <p>
	 * API name: {@code pri.refresh.listeners}
	 */
	@Nullable
	public String pri_refresh_listeners() {
		return this.pri_refresh_listeners;
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
	 * current fetch phase ops
	 * <p>
	 * API name: {@code pri.search.fetch_current}
	 */
	@Nullable
	public String pri_search_fetchCurrent() {
		return this.pri_search_fetchCurrent;
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
	 * time spent in fetch phase
	 * <p>
	 * API name: {@code pri.search.fetch_time}
	 */
	@Nullable
	public String pri_search_fetchTime() {
		return this.pri_search_fetchTime;
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
	 * total fetch ops
	 * <p>
	 * API name: {@code pri.search.fetch_total}
	 */
	@Nullable
	public String pri_search_fetchTotal() {
		return this.pri_search_fetchTotal;
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
	 * open search contexts
	 * <p>
	 * API name: {@code pri.search.open_contexts}
	 */
	@Nullable
	public String pri_search_openContexts() {
		return this.pri_search_openContexts;
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
	 * current query phase ops
	 * <p>
	 * API name: {@code pri.search.query_current}
	 */
	@Nullable
	public String pri_search_queryCurrent() {
		return this.pri_search_queryCurrent;
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
	 * time spent in query phase
	 * <p>
	 * API name: {@code pri.search.query_time}
	 */
	@Nullable
	public String pri_search_queryTime() {
		return this.pri_search_queryTime;
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
	 * total query phase ops
	 * <p>
	 * API name: {@code pri.search.query_total}
	 */
	@Nullable
	public String pri_search_queryTotal() {
		return this.pri_search_queryTotal;
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
	 * open scroll contexts
	 * <p>
	 * API name: {@code pri.search.scroll_current}
	 */
	@Nullable
	public String pri_search_scrollCurrent() {
		return this.pri_search_scrollCurrent;
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
	 * time scroll contexts held open
	 * <p>
	 * API name: {@code pri.search.scroll_time}
	 */
	@Nullable
	public String pri_search_scrollTime() {
		return this.pri_search_scrollTime;
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
	 * completed scroll contexts
	 * <p>
	 * API name: {@code pri.search.scroll_total}
	 */
	@Nullable
	public String pri_search_scrollTotal() {
		return this.pri_search_scrollTotal;
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
	 * number of segments
	 * <p>
	 * API name: {@code pri.segments.count}
	 */
	@Nullable
	public String pri_segments_count() {
		return this.pri_segments_count;
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
	 * memory used by segments
	 * <p>
	 * API name: {@code pri.segments.memory}
	 */
	@Nullable
	public String pri_segments_memory() {
		return this.pri_segments_memory;
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
	 * memory used by index writer
	 * <p>
	 * API name: {@code pri.segments.index_writer_memory}
	 */
	@Nullable
	public String pri_segments_indexWriterMemory() {
		return this.pri_segments_indexWriterMemory;
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
	 * memory used by version map
	 * <p>
	 * API name: {@code pri.segments.version_map_memory}
	 */
	@Nullable
	public String pri_segments_versionMapMemory() {
		return this.pri_segments_versionMapMemory;
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
	 * memory used by fixed bit sets for nested object field types and export type
	 * filters for types referred in _parent fields
	 * <p>
	 * API name: {@code pri.segments.fixed_bitset_memory}
	 */
	@Nullable
	public String pri_segments_fixedBitsetMemory() {
		return this.pri_segments_fixedBitsetMemory;
	}

	/**
	 * current warmer ops
	 * <p>
	 * API name: {@code warmer.current}
	 */
	@Nullable
	public String warmer_current() {
		return this.warmer_current;
	}

	/**
	 * current warmer ops
	 * <p>
	 * API name: {@code pri.warmer.current}
	 */
	@Nullable
	public String pri_warmer_current() {
		return this.pri_warmer_current;
	}

	/**
	 * total warmer ops
	 * <p>
	 * API name: {@code warmer.total}
	 */
	@Nullable
	public String warmer_total() {
		return this.warmer_total;
	}

	/**
	 * total warmer ops
	 * <p>
	 * API name: {@code pri.warmer.total}
	 */
	@Nullable
	public String pri_warmer_total() {
		return this.pri_warmer_total;
	}

	/**
	 * time spent in warmers
	 * <p>
	 * API name: {@code warmer.total_time}
	 */
	@Nullable
	public String warmer_totalTime() {
		return this.warmer_totalTime;
	}

	/**
	 * time spent in warmers
	 * <p>
	 * API name: {@code pri.warmer.total_time}
	 */
	@Nullable
	public String pri_warmer_totalTime() {
		return this.pri_warmer_totalTime;
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
	 * number of current suggest ops
	 * <p>
	 * API name: {@code pri.suggest.current}
	 */
	@Nullable
	public String pri_suggest_current() {
		return this.pri_suggest_current;
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
	 * time spend in suggest
	 * <p>
	 * API name: {@code pri.suggest.time}
	 */
	@Nullable
	public String pri_suggest_time() {
		return this.pri_suggest_time;
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
	 * number of suggest ops
	 * <p>
	 * API name: {@code pri.suggest.total}
	 */
	@Nullable
	public String pri_suggest_total() {
		return this.pri_suggest_total;
	}

	/**
	 * total used memory
	 * <p>
	 * API name: {@code memory.total}
	 */
	@Nullable
	public String memory_total() {
		return this.memory_total;
	}

	/**
	 * total user memory
	 * <p>
	 * API name: {@code pri.memory.total}
	 */
	@Nullable
	public String pri_memory_total() {
		return this.pri_memory_total;
	}

	/**
	 * indicates if the index is search throttled
	 * <p>
	 * API name: {@code search.throttled}
	 */
	@Nullable
	public String search_throttled() {
		return this.search_throttled;
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
	 * number of bulk shard ops
	 * <p>
	 * API name: {@code pri.bulk.total_operations}
	 */
	@Nullable
	public String pri_bulk_totalOperations() {
		return this.pri_bulk_totalOperations;
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
	 * time spend in shard bulk
	 * <p>
	 * API name: {@code pri.bulk.total_time}
	 */
	@Nullable
	public String pri_bulk_totalTime() {
		return this.pri_bulk_totalTime;
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
	 * total size in bytes of shard bulk
	 * <p>
	 * API name: {@code pri.bulk.total_size_in_bytes}
	 */
	@Nullable
	public String pri_bulk_totalSizeInBytes() {
		return this.pri_bulk_totalSizeInBytes;
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
	 * average time spend in shard bulk
	 * <p>
	 * API name: {@code pri.bulk.avg_time}
	 */
	@Nullable
	public String pri_bulk_avgTime() {
		return this.pri_bulk_avgTime;
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
	 * average size in bytes of shard bulk
	 * <p>
	 * API name: {@code pri.bulk.avg_size_in_bytes}
	 */
	@Nullable
	public String pri_bulk_avgSizeInBytes() {
		return this.pri_bulk_avgSizeInBytes;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.health != null) {

			generator.writeKey("health");
			generator.write(this.health);

		}
		if (this.status != null) {

			generator.writeKey("status");
			generator.write(this.status);

		}
		if (this.index != null) {

			generator.writeKey("index");
			generator.write(this.index);

		}
		if (this.uuid != null) {

			generator.writeKey("uuid");
			generator.write(this.uuid);

		}
		if (this.pri != null) {

			generator.writeKey("pri");
			generator.write(this.pri);

		}
		if (this.rep != null) {

			generator.writeKey("rep");
			generator.write(this.rep);

		}
		if (this.docs_count != null) {

			generator.writeKey("docs.count");
			generator.write(this.docs_count);

		}
		if (this.docs_deleted != null) {

			generator.writeKey("docs.deleted");
			generator.write(this.docs_deleted);

		}
		if (this.creation_date != null) {

			generator.writeKey("creation.date");
			generator.write(this.creation_date);

		}
		if (this.creation_date_string != null) {

			generator.writeKey("creation.date.string");
			generator.write(this.creation_date_string);

		}
		if (this.store_size != null) {

			generator.writeKey("store.size");
			generator.write(this.store_size);

		}
		if (this.pri_store_size != null) {

			generator.writeKey("pri.store.size");
			generator.write(this.pri_store_size);

		}
		if (this.completion_size != null) {

			generator.writeKey("completion.size");
			generator.write(this.completion_size);

		}
		if (this.pri_completion_size != null) {

			generator.writeKey("pri.completion.size");
			generator.write(this.pri_completion_size);

		}
		if (this.fielddata_memorySize != null) {

			generator.writeKey("fielddata.memory_size");
			generator.write(this.fielddata_memorySize);

		}
		if (this.pri_fielddata_memorySize != null) {

			generator.writeKey("pri.fielddata.memory_size");
			generator.write(this.pri_fielddata_memorySize);

		}
		if (this.fielddata_evictions != null) {

			generator.writeKey("fielddata.evictions");
			generator.write(this.fielddata_evictions);

		}
		if (this.pri_fielddata_evictions != null) {

			generator.writeKey("pri.fielddata.evictions");
			generator.write(this.pri_fielddata_evictions);

		}
		if (this.queryCache_memorySize != null) {

			generator.writeKey("query_cache.memory_size");
			generator.write(this.queryCache_memorySize);

		}
		if (this.pri_queryCache_memorySize != null) {

			generator.writeKey("pri.query_cache.memory_size");
			generator.write(this.pri_queryCache_memorySize);

		}
		if (this.queryCache_evictions != null) {

			generator.writeKey("query_cache.evictions");
			generator.write(this.queryCache_evictions);

		}
		if (this.pri_queryCache_evictions != null) {

			generator.writeKey("pri.query_cache.evictions");
			generator.write(this.pri_queryCache_evictions);

		}
		if (this.requestCache_memorySize != null) {

			generator.writeKey("request_cache.memory_size");
			generator.write(this.requestCache_memorySize);

		}
		if (this.pri_requestCache_memorySize != null) {

			generator.writeKey("pri.request_cache.memory_size");
			generator.write(this.pri_requestCache_memorySize);

		}
		if (this.requestCache_evictions != null) {

			generator.writeKey("request_cache.evictions");
			generator.write(this.requestCache_evictions);

		}
		if (this.pri_requestCache_evictions != null) {

			generator.writeKey("pri.request_cache.evictions");
			generator.write(this.pri_requestCache_evictions);

		}
		if (this.requestCache_hitCount != null) {

			generator.writeKey("request_cache.hit_count");
			generator.write(this.requestCache_hitCount);

		}
		if (this.pri_requestCache_hitCount != null) {

			generator.writeKey("pri.request_cache.hit_count");
			generator.write(this.pri_requestCache_hitCount);

		}
		if (this.requestCache_missCount != null) {

			generator.writeKey("request_cache.miss_count");
			generator.write(this.requestCache_missCount);

		}
		if (this.pri_requestCache_missCount != null) {

			generator.writeKey("pri.request_cache.miss_count");
			generator.write(this.pri_requestCache_missCount);

		}
		if (this.flush_total != null) {

			generator.writeKey("flush.total");
			generator.write(this.flush_total);

		}
		if (this.pri_flush_total != null) {

			generator.writeKey("pri.flush.total");
			generator.write(this.pri_flush_total);

		}
		if (this.flush_totalTime != null) {

			generator.writeKey("flush.total_time");
			generator.write(this.flush_totalTime);

		}
		if (this.pri_flush_totalTime != null) {

			generator.writeKey("pri.flush.total_time");
			generator.write(this.pri_flush_totalTime);

		}
		if (this.get_current != null) {

			generator.writeKey("get.current");
			generator.write(this.get_current);

		}
		if (this.pri_get_current != null) {

			generator.writeKey("pri.get.current");
			generator.write(this.pri_get_current);

		}
		if (this.get_time != null) {

			generator.writeKey("get.time");
			generator.write(this.get_time);

		}
		if (this.pri_get_time != null) {

			generator.writeKey("pri.get.time");
			generator.write(this.pri_get_time);

		}
		if (this.get_total != null) {

			generator.writeKey("get.total");
			generator.write(this.get_total);

		}
		if (this.pri_get_total != null) {

			generator.writeKey("pri.get.total");
			generator.write(this.pri_get_total);

		}
		if (this.get_existsTime != null) {

			generator.writeKey("get.exists_time");
			generator.write(this.get_existsTime);

		}
		if (this.pri_get_existsTime != null) {

			generator.writeKey("pri.get.exists_time");
			generator.write(this.pri_get_existsTime);

		}
		if (this.get_existsTotal != null) {

			generator.writeKey("get.exists_total");
			generator.write(this.get_existsTotal);

		}
		if (this.pri_get_existsTotal != null) {

			generator.writeKey("pri.get.exists_total");
			generator.write(this.pri_get_existsTotal);

		}
		if (this.get_missingTime != null) {

			generator.writeKey("get.missing_time");
			generator.write(this.get_missingTime);

		}
		if (this.pri_get_missingTime != null) {

			generator.writeKey("pri.get.missing_time");
			generator.write(this.pri_get_missingTime);

		}
		if (this.get_missingTotal != null) {

			generator.writeKey("get.missing_total");
			generator.write(this.get_missingTotal);

		}
		if (this.pri_get_missingTotal != null) {

			generator.writeKey("pri.get.missing_total");
			generator.write(this.pri_get_missingTotal);

		}
		if (this.indexing_deleteCurrent != null) {

			generator.writeKey("indexing.delete_current");
			generator.write(this.indexing_deleteCurrent);

		}
		if (this.pri_indexing_deleteCurrent != null) {

			generator.writeKey("pri.indexing.delete_current");
			generator.write(this.pri_indexing_deleteCurrent);

		}
		if (this.indexing_deleteTime != null) {

			generator.writeKey("indexing.delete_time");
			generator.write(this.indexing_deleteTime);

		}
		if (this.pri_indexing_deleteTime != null) {

			generator.writeKey("pri.indexing.delete_time");
			generator.write(this.pri_indexing_deleteTime);

		}
		if (this.indexing_deleteTotal != null) {

			generator.writeKey("indexing.delete_total");
			generator.write(this.indexing_deleteTotal);

		}
		if (this.pri_indexing_deleteTotal != null) {

			generator.writeKey("pri.indexing.delete_total");
			generator.write(this.pri_indexing_deleteTotal);

		}
		if (this.indexing_indexCurrent != null) {

			generator.writeKey("indexing.index_current");
			generator.write(this.indexing_indexCurrent);

		}
		if (this.pri_indexing_indexCurrent != null) {

			generator.writeKey("pri.indexing.index_current");
			generator.write(this.pri_indexing_indexCurrent);

		}
		if (this.indexing_indexTime != null) {

			generator.writeKey("indexing.index_time");
			generator.write(this.indexing_indexTime);

		}
		if (this.pri_indexing_indexTime != null) {

			generator.writeKey("pri.indexing.index_time");
			generator.write(this.pri_indexing_indexTime);

		}
		if (this.indexing_indexTotal != null) {

			generator.writeKey("indexing.index_total");
			generator.write(this.indexing_indexTotal);

		}
		if (this.pri_indexing_indexTotal != null) {

			generator.writeKey("pri.indexing.index_total");
			generator.write(this.pri_indexing_indexTotal);

		}
		if (this.indexing_indexFailed != null) {

			generator.writeKey("indexing.index_failed");
			generator.write(this.indexing_indexFailed);

		}
		if (this.pri_indexing_indexFailed != null) {

			generator.writeKey("pri.indexing.index_failed");
			generator.write(this.pri_indexing_indexFailed);

		}
		if (this.merges_current != null) {

			generator.writeKey("merges.current");
			generator.write(this.merges_current);

		}
		if (this.pri_merges_current != null) {

			generator.writeKey("pri.merges.current");
			generator.write(this.pri_merges_current);

		}
		if (this.merges_currentDocs != null) {

			generator.writeKey("merges.current_docs");
			generator.write(this.merges_currentDocs);

		}
		if (this.pri_merges_currentDocs != null) {

			generator.writeKey("pri.merges.current_docs");
			generator.write(this.pri_merges_currentDocs);

		}
		if (this.merges_currentSize != null) {

			generator.writeKey("merges.current_size");
			generator.write(this.merges_currentSize);

		}
		if (this.pri_merges_currentSize != null) {

			generator.writeKey("pri.merges.current_size");
			generator.write(this.pri_merges_currentSize);

		}
		if (this.merges_total != null) {

			generator.writeKey("merges.total");
			generator.write(this.merges_total);

		}
		if (this.pri_merges_total != null) {

			generator.writeKey("pri.merges.total");
			generator.write(this.pri_merges_total);

		}
		if (this.merges_totalDocs != null) {

			generator.writeKey("merges.total_docs");
			generator.write(this.merges_totalDocs);

		}
		if (this.pri_merges_totalDocs != null) {

			generator.writeKey("pri.merges.total_docs");
			generator.write(this.pri_merges_totalDocs);

		}
		if (this.merges_totalSize != null) {

			generator.writeKey("merges.total_size");
			generator.write(this.merges_totalSize);

		}
		if (this.pri_merges_totalSize != null) {

			generator.writeKey("pri.merges.total_size");
			generator.write(this.pri_merges_totalSize);

		}
		if (this.merges_totalTime != null) {

			generator.writeKey("merges.total_time");
			generator.write(this.merges_totalTime);

		}
		if (this.pri_merges_totalTime != null) {

			generator.writeKey("pri.merges.total_time");
			generator.write(this.pri_merges_totalTime);

		}
		if (this.refresh_total != null) {

			generator.writeKey("refresh.total");
			generator.write(this.refresh_total);

		}
		if (this.pri_refresh_total != null) {

			generator.writeKey("pri.refresh.total");
			generator.write(this.pri_refresh_total);

		}
		if (this.refresh_time != null) {

			generator.writeKey("refresh.time");
			generator.write(this.refresh_time);

		}
		if (this.pri_refresh_time != null) {

			generator.writeKey("pri.refresh.time");
			generator.write(this.pri_refresh_time);

		}
		if (this.refresh_externalTotal != null) {

			generator.writeKey("refresh.external_total");
			generator.write(this.refresh_externalTotal);

		}
		if (this.pri_refresh_externalTotal != null) {

			generator.writeKey("pri.refresh.external_total");
			generator.write(this.pri_refresh_externalTotal);

		}
		if (this.refresh_externalTime != null) {

			generator.writeKey("refresh.external_time");
			generator.write(this.refresh_externalTime);

		}
		if (this.pri_refresh_externalTime != null) {

			generator.writeKey("pri.refresh.external_time");
			generator.write(this.pri_refresh_externalTime);

		}
		if (this.refresh_listeners != null) {

			generator.writeKey("refresh.listeners");
			generator.write(this.refresh_listeners);

		}
		if (this.pri_refresh_listeners != null) {

			generator.writeKey("pri.refresh.listeners");
			generator.write(this.pri_refresh_listeners);

		}
		if (this.search_fetchCurrent != null) {

			generator.writeKey("search.fetch_current");
			generator.write(this.search_fetchCurrent);

		}
		if (this.pri_search_fetchCurrent != null) {

			generator.writeKey("pri.search.fetch_current");
			generator.write(this.pri_search_fetchCurrent);

		}
		if (this.search_fetchTime != null) {

			generator.writeKey("search.fetch_time");
			generator.write(this.search_fetchTime);

		}
		if (this.pri_search_fetchTime != null) {

			generator.writeKey("pri.search.fetch_time");
			generator.write(this.pri_search_fetchTime);

		}
		if (this.search_fetchTotal != null) {

			generator.writeKey("search.fetch_total");
			generator.write(this.search_fetchTotal);

		}
		if (this.pri_search_fetchTotal != null) {

			generator.writeKey("pri.search.fetch_total");
			generator.write(this.pri_search_fetchTotal);

		}
		if (this.search_openContexts != null) {

			generator.writeKey("search.open_contexts");
			generator.write(this.search_openContexts);

		}
		if (this.pri_search_openContexts != null) {

			generator.writeKey("pri.search.open_contexts");
			generator.write(this.pri_search_openContexts);

		}
		if (this.search_queryCurrent != null) {

			generator.writeKey("search.query_current");
			generator.write(this.search_queryCurrent);

		}
		if (this.pri_search_queryCurrent != null) {

			generator.writeKey("pri.search.query_current");
			generator.write(this.pri_search_queryCurrent);

		}
		if (this.search_queryTime != null) {

			generator.writeKey("search.query_time");
			generator.write(this.search_queryTime);

		}
		if (this.pri_search_queryTime != null) {

			generator.writeKey("pri.search.query_time");
			generator.write(this.pri_search_queryTime);

		}
		if (this.search_queryTotal != null) {

			generator.writeKey("search.query_total");
			generator.write(this.search_queryTotal);

		}
		if (this.pri_search_queryTotal != null) {

			generator.writeKey("pri.search.query_total");
			generator.write(this.pri_search_queryTotal);

		}
		if (this.search_scrollCurrent != null) {

			generator.writeKey("search.scroll_current");
			generator.write(this.search_scrollCurrent);

		}
		if (this.pri_search_scrollCurrent != null) {

			generator.writeKey("pri.search.scroll_current");
			generator.write(this.pri_search_scrollCurrent);

		}
		if (this.search_scrollTime != null) {

			generator.writeKey("search.scroll_time");
			generator.write(this.search_scrollTime);

		}
		if (this.pri_search_scrollTime != null) {

			generator.writeKey("pri.search.scroll_time");
			generator.write(this.pri_search_scrollTime);

		}
		if (this.search_scrollTotal != null) {

			generator.writeKey("search.scroll_total");
			generator.write(this.search_scrollTotal);

		}
		if (this.pri_search_scrollTotal != null) {

			generator.writeKey("pri.search.scroll_total");
			generator.write(this.pri_search_scrollTotal);

		}
		if (this.segments_count != null) {

			generator.writeKey("segments.count");
			generator.write(this.segments_count);

		}
		if (this.pri_segments_count != null) {

			generator.writeKey("pri.segments.count");
			generator.write(this.pri_segments_count);

		}
		if (this.segments_memory != null) {

			generator.writeKey("segments.memory");
			generator.write(this.segments_memory);

		}
		if (this.pri_segments_memory != null) {

			generator.writeKey("pri.segments.memory");
			generator.write(this.pri_segments_memory);

		}
		if (this.segments_indexWriterMemory != null) {

			generator.writeKey("segments.index_writer_memory");
			generator.write(this.segments_indexWriterMemory);

		}
		if (this.pri_segments_indexWriterMemory != null) {

			generator.writeKey("pri.segments.index_writer_memory");
			generator.write(this.pri_segments_indexWriterMemory);

		}
		if (this.segments_versionMapMemory != null) {

			generator.writeKey("segments.version_map_memory");
			generator.write(this.segments_versionMapMemory);

		}
		if (this.pri_segments_versionMapMemory != null) {

			generator.writeKey("pri.segments.version_map_memory");
			generator.write(this.pri_segments_versionMapMemory);

		}
		if (this.segments_fixedBitsetMemory != null) {

			generator.writeKey("segments.fixed_bitset_memory");
			generator.write(this.segments_fixedBitsetMemory);

		}
		if (this.pri_segments_fixedBitsetMemory != null) {

			generator.writeKey("pri.segments.fixed_bitset_memory");
			generator.write(this.pri_segments_fixedBitsetMemory);

		}
		if (this.warmer_current != null) {

			generator.writeKey("warmer.current");
			generator.write(this.warmer_current);

		}
		if (this.pri_warmer_current != null) {

			generator.writeKey("pri.warmer.current");
			generator.write(this.pri_warmer_current);

		}
		if (this.warmer_total != null) {

			generator.writeKey("warmer.total");
			generator.write(this.warmer_total);

		}
		if (this.pri_warmer_total != null) {

			generator.writeKey("pri.warmer.total");
			generator.write(this.pri_warmer_total);

		}
		if (this.warmer_totalTime != null) {

			generator.writeKey("warmer.total_time");
			generator.write(this.warmer_totalTime);

		}
		if (this.pri_warmer_totalTime != null) {

			generator.writeKey("pri.warmer.total_time");
			generator.write(this.pri_warmer_totalTime);

		}
		if (this.suggest_current != null) {

			generator.writeKey("suggest.current");
			generator.write(this.suggest_current);

		}
		if (this.pri_suggest_current != null) {

			generator.writeKey("pri.suggest.current");
			generator.write(this.pri_suggest_current);

		}
		if (this.suggest_time != null) {

			generator.writeKey("suggest.time");
			generator.write(this.suggest_time);

		}
		if (this.pri_suggest_time != null) {

			generator.writeKey("pri.suggest.time");
			generator.write(this.pri_suggest_time);

		}
		if (this.suggest_total != null) {

			generator.writeKey("suggest.total");
			generator.write(this.suggest_total);

		}
		if (this.pri_suggest_total != null) {

			generator.writeKey("pri.suggest.total");
			generator.write(this.pri_suggest_total);

		}
		if (this.memory_total != null) {

			generator.writeKey("memory.total");
			generator.write(this.memory_total);

		}
		if (this.pri_memory_total != null) {

			generator.writeKey("pri.memory.total");
			generator.write(this.pri_memory_total);

		}
		if (this.search_throttled != null) {

			generator.writeKey("search.throttled");
			generator.write(this.search_throttled);

		}
		if (this.bulk_totalOperations != null) {

			generator.writeKey("bulk.total_operations");
			generator.write(this.bulk_totalOperations);

		}
		if (this.pri_bulk_totalOperations != null) {

			generator.writeKey("pri.bulk.total_operations");
			generator.write(this.pri_bulk_totalOperations);

		}
		if (this.bulk_totalTime != null) {

			generator.writeKey("bulk.total_time");
			generator.write(this.bulk_totalTime);

		}
		if (this.pri_bulk_totalTime != null) {

			generator.writeKey("pri.bulk.total_time");
			generator.write(this.pri_bulk_totalTime);

		}
		if (this.bulk_totalSizeInBytes != null) {

			generator.writeKey("bulk.total_size_in_bytes");
			generator.write(this.bulk_totalSizeInBytes);

		}
		if (this.pri_bulk_totalSizeInBytes != null) {

			generator.writeKey("pri.bulk.total_size_in_bytes");
			generator.write(this.pri_bulk_totalSizeInBytes);

		}
		if (this.bulk_avgTime != null) {

			generator.writeKey("bulk.avg_time");
			generator.write(this.bulk_avgTime);

		}
		if (this.pri_bulk_avgTime != null) {

			generator.writeKey("pri.bulk.avg_time");
			generator.write(this.pri_bulk_avgTime);

		}
		if (this.bulk_avgSizeInBytes != null) {

			generator.writeKey("bulk.avg_size_in_bytes");
			generator.write(this.bulk_avgSizeInBytes);

		}
		if (this.pri_bulk_avgSizeInBytes != null) {

			generator.writeKey("pri.bulk.avg_size_in_bytes");
			generator.write(this.pri_bulk_avgSizeInBytes);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndicesRecord}.
	 */
	public static class Builder implements ObjectBuilder<IndicesRecord> {
		@Nullable
		private String health;

		@Nullable
		private String status;

		@Nullable
		private String index;

		@Nullable
		private String uuid;

		@Nullable
		private String pri;

		@Nullable
		private String rep;

		@Nullable
		private String docs_count;

		@Nullable
		private String docs_deleted;

		@Nullable
		private String creation_date;

		@Nullable
		private String creation_date_string;

		@Nullable
		private String store_size;

		@Nullable
		private String pri_store_size;

		@Nullable
		private String completion_size;

		@Nullable
		private String pri_completion_size;

		@Nullable
		private String fielddata_memorySize;

		@Nullable
		private String pri_fielddata_memorySize;

		@Nullable
		private String fielddata_evictions;

		@Nullable
		private String pri_fielddata_evictions;

		@Nullable
		private String queryCache_memorySize;

		@Nullable
		private String pri_queryCache_memorySize;

		@Nullable
		private String queryCache_evictions;

		@Nullable
		private String pri_queryCache_evictions;

		@Nullable
		private String requestCache_memorySize;

		@Nullable
		private String pri_requestCache_memorySize;

		@Nullable
		private String requestCache_evictions;

		@Nullable
		private String pri_requestCache_evictions;

		@Nullable
		private String requestCache_hitCount;

		@Nullable
		private String pri_requestCache_hitCount;

		@Nullable
		private String requestCache_missCount;

		@Nullable
		private String pri_requestCache_missCount;

		@Nullable
		private String flush_total;

		@Nullable
		private String pri_flush_total;

		@Nullable
		private String flush_totalTime;

		@Nullable
		private String pri_flush_totalTime;

		@Nullable
		private String get_current;

		@Nullable
		private String pri_get_current;

		@Nullable
		private String get_time;

		@Nullable
		private String pri_get_time;

		@Nullable
		private String get_total;

		@Nullable
		private String pri_get_total;

		@Nullable
		private String get_existsTime;

		@Nullable
		private String pri_get_existsTime;

		@Nullable
		private String get_existsTotal;

		@Nullable
		private String pri_get_existsTotal;

		@Nullable
		private String get_missingTime;

		@Nullable
		private String pri_get_missingTime;

		@Nullable
		private String get_missingTotal;

		@Nullable
		private String pri_get_missingTotal;

		@Nullable
		private String indexing_deleteCurrent;

		@Nullable
		private String pri_indexing_deleteCurrent;

		@Nullable
		private String indexing_deleteTime;

		@Nullable
		private String pri_indexing_deleteTime;

		@Nullable
		private String indexing_deleteTotal;

		@Nullable
		private String pri_indexing_deleteTotal;

		@Nullable
		private String indexing_indexCurrent;

		@Nullable
		private String pri_indexing_indexCurrent;

		@Nullable
		private String indexing_indexTime;

		@Nullable
		private String pri_indexing_indexTime;

		@Nullable
		private String indexing_indexTotal;

		@Nullable
		private String pri_indexing_indexTotal;

		@Nullable
		private String indexing_indexFailed;

		@Nullable
		private String pri_indexing_indexFailed;

		@Nullable
		private String merges_current;

		@Nullable
		private String pri_merges_current;

		@Nullable
		private String merges_currentDocs;

		@Nullable
		private String pri_merges_currentDocs;

		@Nullable
		private String merges_currentSize;

		@Nullable
		private String pri_merges_currentSize;

		@Nullable
		private String merges_total;

		@Nullable
		private String pri_merges_total;

		@Nullable
		private String merges_totalDocs;

		@Nullable
		private String pri_merges_totalDocs;

		@Nullable
		private String merges_totalSize;

		@Nullable
		private String pri_merges_totalSize;

		@Nullable
		private String merges_totalTime;

		@Nullable
		private String pri_merges_totalTime;

		@Nullable
		private String refresh_total;

		@Nullable
		private String pri_refresh_total;

		@Nullable
		private String refresh_time;

		@Nullable
		private String pri_refresh_time;

		@Nullable
		private String refresh_externalTotal;

		@Nullable
		private String pri_refresh_externalTotal;

		@Nullable
		private String refresh_externalTime;

		@Nullable
		private String pri_refresh_externalTime;

		@Nullable
		private String refresh_listeners;

		@Nullable
		private String pri_refresh_listeners;

		@Nullable
		private String search_fetchCurrent;

		@Nullable
		private String pri_search_fetchCurrent;

		@Nullable
		private String search_fetchTime;

		@Nullable
		private String pri_search_fetchTime;

		@Nullable
		private String search_fetchTotal;

		@Nullable
		private String pri_search_fetchTotal;

		@Nullable
		private String search_openContexts;

		@Nullable
		private String pri_search_openContexts;

		@Nullable
		private String search_queryCurrent;

		@Nullable
		private String pri_search_queryCurrent;

		@Nullable
		private String search_queryTime;

		@Nullable
		private String pri_search_queryTime;

		@Nullable
		private String search_queryTotal;

		@Nullable
		private String pri_search_queryTotal;

		@Nullable
		private String search_scrollCurrent;

		@Nullable
		private String pri_search_scrollCurrent;

		@Nullable
		private String search_scrollTime;

		@Nullable
		private String pri_search_scrollTime;

		@Nullable
		private String search_scrollTotal;

		@Nullable
		private String pri_search_scrollTotal;

		@Nullable
		private String segments_count;

		@Nullable
		private String pri_segments_count;

		@Nullable
		private String segments_memory;

		@Nullable
		private String pri_segments_memory;

		@Nullable
		private String segments_indexWriterMemory;

		@Nullable
		private String pri_segments_indexWriterMemory;

		@Nullable
		private String segments_versionMapMemory;

		@Nullable
		private String pri_segments_versionMapMemory;

		@Nullable
		private String segments_fixedBitsetMemory;

		@Nullable
		private String pri_segments_fixedBitsetMemory;

		@Nullable
		private String warmer_current;

		@Nullable
		private String pri_warmer_current;

		@Nullable
		private String warmer_total;

		@Nullable
		private String pri_warmer_total;

		@Nullable
		private String warmer_totalTime;

		@Nullable
		private String pri_warmer_totalTime;

		@Nullable
		private String suggest_current;

		@Nullable
		private String pri_suggest_current;

		@Nullable
		private String suggest_time;

		@Nullable
		private String pri_suggest_time;

		@Nullable
		private String suggest_total;

		@Nullable
		private String pri_suggest_total;

		@Nullable
		private String memory_total;

		@Nullable
		private String pri_memory_total;

		@Nullable
		private String search_throttled;

		@Nullable
		private String bulk_totalOperations;

		@Nullable
		private String pri_bulk_totalOperations;

		@Nullable
		private String bulk_totalTime;

		@Nullable
		private String pri_bulk_totalTime;

		@Nullable
		private String bulk_totalSizeInBytes;

		@Nullable
		private String pri_bulk_totalSizeInBytes;

		@Nullable
		private String bulk_avgTime;

		@Nullable
		private String pri_bulk_avgTime;

		@Nullable
		private String bulk_avgSizeInBytes;

		@Nullable
		private String pri_bulk_avgSizeInBytes;

		/**
		 * current health status
		 * <p>
		 * API name: {@code health}
		 */
		public Builder health(@Nullable String value) {
			this.health = value;
			return this;
		}

		/**
		 * open/close status
		 * <p>
		 * API name: {@code status}
		 */
		public Builder status(@Nullable String value) {
			this.status = value;
			return this;
		}

		/**
		 * index name
		 * <p>
		 * API name: {@code index}
		 */
		public Builder index(@Nullable String value) {
			this.index = value;
			return this;
		}

		/**
		 * index uuid
		 * <p>
		 * API name: {@code uuid}
		 */
		public Builder uuid(@Nullable String value) {
			this.uuid = value;
			return this;
		}

		/**
		 * number of primary shards
		 * <p>
		 * API name: {@code pri}
		 */
		public Builder pri(@Nullable String value) {
			this.pri = value;
			return this;
		}

		/**
		 * number of replica shards
		 * <p>
		 * API name: {@code rep}
		 */
		public Builder rep(@Nullable String value) {
			this.rep = value;
			return this;
		}

		/**
		 * available docs
		 * <p>
		 * API name: {@code docs.count}
		 */
		public Builder docs_count(@Nullable String value) {
			this.docs_count = value;
			return this;
		}

		/**
		 * deleted docs
		 * <p>
		 * API name: {@code docs.deleted}
		 */
		public Builder docs_deleted(@Nullable String value) {
			this.docs_deleted = value;
			return this;
		}

		/**
		 * index creation date (millisecond value)
		 * <p>
		 * API name: {@code creation.date}
		 */
		public Builder creation_date(@Nullable String value) {
			this.creation_date = value;
			return this;
		}

		/**
		 * index creation date (as string)
		 * <p>
		 * API name: {@code creation.date.string}
		 */
		public Builder creation_date_string(@Nullable String value) {
			this.creation_date_string = value;
			return this;
		}

		/**
		 * store size of primaries &amp; replicas
		 * <p>
		 * API name: {@code store.size}
		 */
		public Builder store_size(@Nullable String value) {
			this.store_size = value;
			return this;
		}

		/**
		 * store size of primaries
		 * <p>
		 * API name: {@code pri.store.size}
		 */
		public Builder pri_store_size(@Nullable String value) {
			this.pri_store_size = value;
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
		 * size of completion
		 * <p>
		 * API name: {@code pri.completion.size}
		 */
		public Builder pri_completion_size(@Nullable String value) {
			this.pri_completion_size = value;
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
		 * used fielddata cache
		 * <p>
		 * API name: {@code pri.fielddata.memory_size}
		 */
		public Builder pri_fielddata_memorySize(@Nullable String value) {
			this.pri_fielddata_memorySize = value;
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
		 * fielddata evictions
		 * <p>
		 * API name: {@code pri.fielddata.evictions}
		 */
		public Builder pri_fielddata_evictions(@Nullable String value) {
			this.pri_fielddata_evictions = value;
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
		 * used query cache
		 * <p>
		 * API name: {@code pri.query_cache.memory_size}
		 */
		public Builder pri_queryCache_memorySize(@Nullable String value) {
			this.pri_queryCache_memorySize = value;
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
		 * query cache evictions
		 * <p>
		 * API name: {@code pri.query_cache.evictions}
		 */
		public Builder pri_queryCache_evictions(@Nullable String value) {
			this.pri_queryCache_evictions = value;
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
		 * used request cache
		 * <p>
		 * API name: {@code pri.request_cache.memory_size}
		 */
		public Builder pri_requestCache_memorySize(@Nullable String value) {
			this.pri_requestCache_memorySize = value;
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
		 * request cache evictions
		 * <p>
		 * API name: {@code pri.request_cache.evictions}
		 */
		public Builder pri_requestCache_evictions(@Nullable String value) {
			this.pri_requestCache_evictions = value;
			return this;
		}

		/**
		 * request cache hit count
		 * <p>
		 * API name: {@code request_cache.hit_count}
		 */
		public Builder requestCache_hitCount(@Nullable String value) {
			this.requestCache_hitCount = value;
			return this;
		}

		/**
		 * request cache hit count
		 * <p>
		 * API name: {@code pri.request_cache.hit_count}
		 */
		public Builder pri_requestCache_hitCount(@Nullable String value) {
			this.pri_requestCache_hitCount = value;
			return this;
		}

		/**
		 * request cache miss count
		 * <p>
		 * API name: {@code request_cache.miss_count}
		 */
		public Builder requestCache_missCount(@Nullable String value) {
			this.requestCache_missCount = value;
			return this;
		}

		/**
		 * request cache miss count
		 * <p>
		 * API name: {@code pri.request_cache.miss_count}
		 */
		public Builder pri_requestCache_missCount(@Nullable String value) {
			this.pri_requestCache_missCount = value;
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
		 * number of flushes
		 * <p>
		 * API name: {@code pri.flush.total}
		 */
		public Builder pri_flush_total(@Nullable String value) {
			this.pri_flush_total = value;
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
		 * time spent in flush
		 * <p>
		 * API name: {@code pri.flush.total_time}
		 */
		public Builder pri_flush_totalTime(@Nullable String value) {
			this.pri_flush_totalTime = value;
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
		 * number of current get ops
		 * <p>
		 * API name: {@code pri.get.current}
		 */
		public Builder pri_get_current(@Nullable String value) {
			this.pri_get_current = value;
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
		 * time spent in get
		 * <p>
		 * API name: {@code pri.get.time}
		 */
		public Builder pri_get_time(@Nullable String value) {
			this.pri_get_time = value;
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
		 * number of get ops
		 * <p>
		 * API name: {@code pri.get.total}
		 */
		public Builder pri_get_total(@Nullable String value) {
			this.pri_get_total = value;
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
		 * time spent in successful gets
		 * <p>
		 * API name: {@code pri.get.exists_time}
		 */
		public Builder pri_get_existsTime(@Nullable String value) {
			this.pri_get_existsTime = value;
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
		 * number of successful gets
		 * <p>
		 * API name: {@code pri.get.exists_total}
		 */
		public Builder pri_get_existsTotal(@Nullable String value) {
			this.pri_get_existsTotal = value;
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
		 * time spent in failed gets
		 * <p>
		 * API name: {@code pri.get.missing_time}
		 */
		public Builder pri_get_missingTime(@Nullable String value) {
			this.pri_get_missingTime = value;
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
		 * number of failed gets
		 * <p>
		 * API name: {@code pri.get.missing_total}
		 */
		public Builder pri_get_missingTotal(@Nullable String value) {
			this.pri_get_missingTotal = value;
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
		 * number of current deletions
		 * <p>
		 * API name: {@code pri.indexing.delete_current}
		 */
		public Builder pri_indexing_deleteCurrent(@Nullable String value) {
			this.pri_indexing_deleteCurrent = value;
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
		 * time spent in deletions
		 * <p>
		 * API name: {@code pri.indexing.delete_time}
		 */
		public Builder pri_indexing_deleteTime(@Nullable String value) {
			this.pri_indexing_deleteTime = value;
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
		 * number of delete ops
		 * <p>
		 * API name: {@code pri.indexing.delete_total}
		 */
		public Builder pri_indexing_deleteTotal(@Nullable String value) {
			this.pri_indexing_deleteTotal = value;
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
		 * number of current indexing ops
		 * <p>
		 * API name: {@code pri.indexing.index_current}
		 */
		public Builder pri_indexing_indexCurrent(@Nullable String value) {
			this.pri_indexing_indexCurrent = value;
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
		 * time spent in indexing
		 * <p>
		 * API name: {@code pri.indexing.index_time}
		 */
		public Builder pri_indexing_indexTime(@Nullable String value) {
			this.pri_indexing_indexTime = value;
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
		 * number of indexing ops
		 * <p>
		 * API name: {@code pri.indexing.index_total}
		 */
		public Builder pri_indexing_indexTotal(@Nullable String value) {
			this.pri_indexing_indexTotal = value;
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
		 * number of failed indexing ops
		 * <p>
		 * API name: {@code pri.indexing.index_failed}
		 */
		public Builder pri_indexing_indexFailed(@Nullable String value) {
			this.pri_indexing_indexFailed = value;
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
		 * number of current merges
		 * <p>
		 * API name: {@code pri.merges.current}
		 */
		public Builder pri_merges_current(@Nullable String value) {
			this.pri_merges_current = value;
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
		 * number of current merging docs
		 * <p>
		 * API name: {@code pri.merges.current_docs}
		 */
		public Builder pri_merges_currentDocs(@Nullable String value) {
			this.pri_merges_currentDocs = value;
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
		 * size of current merges
		 * <p>
		 * API name: {@code pri.merges.current_size}
		 */
		public Builder pri_merges_currentSize(@Nullable String value) {
			this.pri_merges_currentSize = value;
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
		 * number of completed merge ops
		 * <p>
		 * API name: {@code pri.merges.total}
		 */
		public Builder pri_merges_total(@Nullable String value) {
			this.pri_merges_total = value;
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
		 * docs merged
		 * <p>
		 * API name: {@code pri.merges.total_docs}
		 */
		public Builder pri_merges_totalDocs(@Nullable String value) {
			this.pri_merges_totalDocs = value;
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
		 * size merged
		 * <p>
		 * API name: {@code pri.merges.total_size}
		 */
		public Builder pri_merges_totalSize(@Nullable String value) {
			this.pri_merges_totalSize = value;
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
		 * time spent in merges
		 * <p>
		 * API name: {@code pri.merges.total_time}
		 */
		public Builder pri_merges_totalTime(@Nullable String value) {
			this.pri_merges_totalTime = value;
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
		 * total refreshes
		 * <p>
		 * API name: {@code pri.refresh.total}
		 */
		public Builder pri_refresh_total(@Nullable String value) {
			this.pri_refresh_total = value;
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
		 * time spent in refreshes
		 * <p>
		 * API name: {@code pri.refresh.time}
		 */
		public Builder pri_refresh_time(@Nullable String value) {
			this.pri_refresh_time = value;
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
		 * total external refreshes
		 * <p>
		 * API name: {@code pri.refresh.external_total}
		 */
		public Builder pri_refresh_externalTotal(@Nullable String value) {
			this.pri_refresh_externalTotal = value;
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
		 * time spent in external refreshes
		 * <p>
		 * API name: {@code pri.refresh.external_time}
		 */
		public Builder pri_refresh_externalTime(@Nullable String value) {
			this.pri_refresh_externalTime = value;
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
		 * number of pending refresh listeners
		 * <p>
		 * API name: {@code pri.refresh.listeners}
		 */
		public Builder pri_refresh_listeners(@Nullable String value) {
			this.pri_refresh_listeners = value;
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
		 * current fetch phase ops
		 * <p>
		 * API name: {@code pri.search.fetch_current}
		 */
		public Builder pri_search_fetchCurrent(@Nullable String value) {
			this.pri_search_fetchCurrent = value;
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
		 * time spent in fetch phase
		 * <p>
		 * API name: {@code pri.search.fetch_time}
		 */
		public Builder pri_search_fetchTime(@Nullable String value) {
			this.pri_search_fetchTime = value;
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
		 * total fetch ops
		 * <p>
		 * API name: {@code pri.search.fetch_total}
		 */
		public Builder pri_search_fetchTotal(@Nullable String value) {
			this.pri_search_fetchTotal = value;
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
		 * open search contexts
		 * <p>
		 * API name: {@code pri.search.open_contexts}
		 */
		public Builder pri_search_openContexts(@Nullable String value) {
			this.pri_search_openContexts = value;
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
		 * current query phase ops
		 * <p>
		 * API name: {@code pri.search.query_current}
		 */
		public Builder pri_search_queryCurrent(@Nullable String value) {
			this.pri_search_queryCurrent = value;
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
		 * time spent in query phase
		 * <p>
		 * API name: {@code pri.search.query_time}
		 */
		public Builder pri_search_queryTime(@Nullable String value) {
			this.pri_search_queryTime = value;
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
		 * total query phase ops
		 * <p>
		 * API name: {@code pri.search.query_total}
		 */
		public Builder pri_search_queryTotal(@Nullable String value) {
			this.pri_search_queryTotal = value;
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
		 * open scroll contexts
		 * <p>
		 * API name: {@code pri.search.scroll_current}
		 */
		public Builder pri_search_scrollCurrent(@Nullable String value) {
			this.pri_search_scrollCurrent = value;
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
		 * time scroll contexts held open
		 * <p>
		 * API name: {@code pri.search.scroll_time}
		 */
		public Builder pri_search_scrollTime(@Nullable String value) {
			this.pri_search_scrollTime = value;
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
		 * completed scroll contexts
		 * <p>
		 * API name: {@code pri.search.scroll_total}
		 */
		public Builder pri_search_scrollTotal(@Nullable String value) {
			this.pri_search_scrollTotal = value;
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
		 * number of segments
		 * <p>
		 * API name: {@code pri.segments.count}
		 */
		public Builder pri_segments_count(@Nullable String value) {
			this.pri_segments_count = value;
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
		 * memory used by segments
		 * <p>
		 * API name: {@code pri.segments.memory}
		 */
		public Builder pri_segments_memory(@Nullable String value) {
			this.pri_segments_memory = value;
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
		 * memory used by index writer
		 * <p>
		 * API name: {@code pri.segments.index_writer_memory}
		 */
		public Builder pri_segments_indexWriterMemory(@Nullable String value) {
			this.pri_segments_indexWriterMemory = value;
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
		 * memory used by version map
		 * <p>
		 * API name: {@code pri.segments.version_map_memory}
		 */
		public Builder pri_segments_versionMapMemory(@Nullable String value) {
			this.pri_segments_versionMapMemory = value;
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
		 * memory used by fixed bit sets for nested object field types and export type
		 * filters for types referred in _parent fields
		 * <p>
		 * API name: {@code pri.segments.fixed_bitset_memory}
		 */
		public Builder pri_segments_fixedBitsetMemory(@Nullable String value) {
			this.pri_segments_fixedBitsetMemory = value;
			return this;
		}

		/**
		 * current warmer ops
		 * <p>
		 * API name: {@code warmer.current}
		 */
		public Builder warmer_current(@Nullable String value) {
			this.warmer_current = value;
			return this;
		}

		/**
		 * current warmer ops
		 * <p>
		 * API name: {@code pri.warmer.current}
		 */
		public Builder pri_warmer_current(@Nullable String value) {
			this.pri_warmer_current = value;
			return this;
		}

		/**
		 * total warmer ops
		 * <p>
		 * API name: {@code warmer.total}
		 */
		public Builder warmer_total(@Nullable String value) {
			this.warmer_total = value;
			return this;
		}

		/**
		 * total warmer ops
		 * <p>
		 * API name: {@code pri.warmer.total}
		 */
		public Builder pri_warmer_total(@Nullable String value) {
			this.pri_warmer_total = value;
			return this;
		}

		/**
		 * time spent in warmers
		 * <p>
		 * API name: {@code warmer.total_time}
		 */
		public Builder warmer_totalTime(@Nullable String value) {
			this.warmer_totalTime = value;
			return this;
		}

		/**
		 * time spent in warmers
		 * <p>
		 * API name: {@code pri.warmer.total_time}
		 */
		public Builder pri_warmer_totalTime(@Nullable String value) {
			this.pri_warmer_totalTime = value;
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
		 * number of current suggest ops
		 * <p>
		 * API name: {@code pri.suggest.current}
		 */
		public Builder pri_suggest_current(@Nullable String value) {
			this.pri_suggest_current = value;
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
		 * time spend in suggest
		 * <p>
		 * API name: {@code pri.suggest.time}
		 */
		public Builder pri_suggest_time(@Nullable String value) {
			this.pri_suggest_time = value;
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
		 * number of suggest ops
		 * <p>
		 * API name: {@code pri.suggest.total}
		 */
		public Builder pri_suggest_total(@Nullable String value) {
			this.pri_suggest_total = value;
			return this;
		}

		/**
		 * total used memory
		 * <p>
		 * API name: {@code memory.total}
		 */
		public Builder memory_total(@Nullable String value) {
			this.memory_total = value;
			return this;
		}

		/**
		 * total user memory
		 * <p>
		 * API name: {@code pri.memory.total}
		 */
		public Builder pri_memory_total(@Nullable String value) {
			this.pri_memory_total = value;
			return this;
		}

		/**
		 * indicates if the index is search throttled
		 * <p>
		 * API name: {@code search.throttled}
		 */
		public Builder search_throttled(@Nullable String value) {
			this.search_throttled = value;
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
		 * number of bulk shard ops
		 * <p>
		 * API name: {@code pri.bulk.total_operations}
		 */
		public Builder pri_bulk_totalOperations(@Nullable String value) {
			this.pri_bulk_totalOperations = value;
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
		 * time spend in shard bulk
		 * <p>
		 * API name: {@code pri.bulk.total_time}
		 */
		public Builder pri_bulk_totalTime(@Nullable String value) {
			this.pri_bulk_totalTime = value;
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
		 * total size in bytes of shard bulk
		 * <p>
		 * API name: {@code pri.bulk.total_size_in_bytes}
		 */
		public Builder pri_bulk_totalSizeInBytes(@Nullable String value) {
			this.pri_bulk_totalSizeInBytes = value;
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
		 * average time spend in shard bulk
		 * <p>
		 * API name: {@code pri.bulk.avg_time}
		 */
		public Builder pri_bulk_avgTime(@Nullable String value) {
			this.pri_bulk_avgTime = value;
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
		 * average size in bytes of shard bulk
		 * <p>
		 * API name: {@code pri.bulk.avg_size_in_bytes}
		 */
		public Builder pri_bulk_avgSizeInBytes(@Nullable String value) {
			this.pri_bulk_avgSizeInBytes = value;
			return this;
		}

		/**
		 * Builds a {@link IndicesRecord}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndicesRecord build() {

			return new IndicesRecord(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for IndicesRecord
	 */
	public static final JsonpDeserializer<IndicesRecord> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, IndicesRecord::setupIndicesRecordDeserializer);

	protected static void setupIndicesRecordDeserializer(DelegatingDeserializer<IndicesRecord.Builder> op) {

		op.add(Builder::health, JsonpDeserializer.stringDeserializer(), "health", "h");
		op.add(Builder::status, JsonpDeserializer.stringDeserializer(), "status", "s");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index", "i", "idx");
		op.add(Builder::uuid, JsonpDeserializer.stringDeserializer(), "uuid", "id");
		op.add(Builder::pri, JsonpDeserializer.stringDeserializer(), "pri", "p", "shards.primary", "shardsPrimary");
		op.add(Builder::rep, JsonpDeserializer.stringDeserializer(), "rep", "r", "shards.replica", "shardsReplica");
		op.add(Builder::docs_count, JsonpDeserializer.stringDeserializer(), "docs.count", "dc", "docsCount");
		op.add(Builder::docs_deleted, JsonpDeserializer.stringDeserializer(), "docs.deleted", "dd", "docsDeleted");
		op.add(Builder::creation_date, JsonpDeserializer.stringDeserializer(), "creation.date", "cd");
		op.add(Builder::creation_date_string, JsonpDeserializer.stringDeserializer(), "creation.date.string", "cds");
		op.add(Builder::store_size, JsonpDeserializer.stringDeserializer(), "store.size", "ss", "storeSize");
		op.add(Builder::pri_store_size, JsonpDeserializer.stringDeserializer(), "pri.store.size");
		op.add(Builder::completion_size, JsonpDeserializer.stringDeserializer(), "completion.size", "cs",
				"completionSize");
		op.add(Builder::pri_completion_size, JsonpDeserializer.stringDeserializer(), "pri.completion.size");
		op.add(Builder::fielddata_memorySize, JsonpDeserializer.stringDeserializer(), "fielddata.memory_size", "fm",
				"fielddataMemory");
		op.add(Builder::pri_fielddata_memorySize, JsonpDeserializer.stringDeserializer(), "pri.fielddata.memory_size");
		op.add(Builder::fielddata_evictions, JsonpDeserializer.stringDeserializer(), "fielddata.evictions", "fe",
				"fielddataEvictions");
		op.add(Builder::pri_fielddata_evictions, JsonpDeserializer.stringDeserializer(), "pri.fielddata.evictions");
		op.add(Builder::queryCache_memorySize, JsonpDeserializer.stringDeserializer(), "query_cache.memory_size", "qcm",
				"queryCacheMemory");
		op.add(Builder::pri_queryCache_memorySize, JsonpDeserializer.stringDeserializer(),
				"pri.query_cache.memory_size");
		op.add(Builder::queryCache_evictions, JsonpDeserializer.stringDeserializer(), "query_cache.evictions", "qce",
				"queryCacheEvictions");
		op.add(Builder::pri_queryCache_evictions, JsonpDeserializer.stringDeserializer(), "pri.query_cache.evictions");
		op.add(Builder::requestCache_memorySize, JsonpDeserializer.stringDeserializer(), "request_cache.memory_size",
				"rcm", "requestCacheMemory");
		op.add(Builder::pri_requestCache_memorySize, JsonpDeserializer.stringDeserializer(),
				"pri.request_cache.memory_size");
		op.add(Builder::requestCache_evictions, JsonpDeserializer.stringDeserializer(), "request_cache.evictions",
				"rce", "requestCacheEvictions");
		op.add(Builder::pri_requestCache_evictions, JsonpDeserializer.stringDeserializer(),
				"pri.request_cache.evictions");
		op.add(Builder::requestCache_hitCount, JsonpDeserializer.stringDeserializer(), "request_cache.hit_count",
				"rchc", "requestCacheHitCount");
		op.add(Builder::pri_requestCache_hitCount, JsonpDeserializer.stringDeserializer(),
				"pri.request_cache.hit_count");
		op.add(Builder::requestCache_missCount, JsonpDeserializer.stringDeserializer(), "request_cache.miss_count",
				"rcmc", "requestCacheMissCount");
		op.add(Builder::pri_requestCache_missCount, JsonpDeserializer.stringDeserializer(),
				"pri.request_cache.miss_count");
		op.add(Builder::flush_total, JsonpDeserializer.stringDeserializer(), "flush.total", "ft", "flushTotal");
		op.add(Builder::pri_flush_total, JsonpDeserializer.stringDeserializer(), "pri.flush.total");
		op.add(Builder::flush_totalTime, JsonpDeserializer.stringDeserializer(), "flush.total_time", "ftt",
				"flushTotalTime");
		op.add(Builder::pri_flush_totalTime, JsonpDeserializer.stringDeserializer(), "pri.flush.total_time");
		op.add(Builder::get_current, JsonpDeserializer.stringDeserializer(), "get.current", "gc", "getCurrent");
		op.add(Builder::pri_get_current, JsonpDeserializer.stringDeserializer(), "pri.get.current");
		op.add(Builder::get_time, JsonpDeserializer.stringDeserializer(), "get.time", "gti", "getTime");
		op.add(Builder::pri_get_time, JsonpDeserializer.stringDeserializer(), "pri.get.time");
		op.add(Builder::get_total, JsonpDeserializer.stringDeserializer(), "get.total", "gto", "getTotal");
		op.add(Builder::pri_get_total, JsonpDeserializer.stringDeserializer(), "pri.get.total");
		op.add(Builder::get_existsTime, JsonpDeserializer.stringDeserializer(), "get.exists_time", "geti",
				"getExistsTime");
		op.add(Builder::pri_get_existsTime, JsonpDeserializer.stringDeserializer(), "pri.get.exists_time");
		op.add(Builder::get_existsTotal, JsonpDeserializer.stringDeserializer(), "get.exists_total", "geto",
				"getExistsTotal");
		op.add(Builder::pri_get_existsTotal, JsonpDeserializer.stringDeserializer(), "pri.get.exists_total");
		op.add(Builder::get_missingTime, JsonpDeserializer.stringDeserializer(), "get.missing_time", "gmti",
				"getMissingTime");
		op.add(Builder::pri_get_missingTime, JsonpDeserializer.stringDeserializer(), "pri.get.missing_time");
		op.add(Builder::get_missingTotal, JsonpDeserializer.stringDeserializer(), "get.missing_total", "gmto",
				"getMissingTotal");
		op.add(Builder::pri_get_missingTotal, JsonpDeserializer.stringDeserializer(), "pri.get.missing_total");
		op.add(Builder::indexing_deleteCurrent, JsonpDeserializer.stringDeserializer(), "indexing.delete_current",
				"idc", "indexingDeleteCurrent");
		op.add(Builder::pri_indexing_deleteCurrent, JsonpDeserializer.stringDeserializer(),
				"pri.indexing.delete_current");
		op.add(Builder::indexing_deleteTime, JsonpDeserializer.stringDeserializer(), "indexing.delete_time", "idti",
				"indexingDeleteTime");
		op.add(Builder::pri_indexing_deleteTime, JsonpDeserializer.stringDeserializer(), "pri.indexing.delete_time");
		op.add(Builder::indexing_deleteTotal, JsonpDeserializer.stringDeserializer(), "indexing.delete_total", "idto",
				"indexingDeleteTotal");
		op.add(Builder::pri_indexing_deleteTotal, JsonpDeserializer.stringDeserializer(), "pri.indexing.delete_total");
		op.add(Builder::indexing_indexCurrent, JsonpDeserializer.stringDeserializer(), "indexing.index_current", "iic",
				"indexingIndexCurrent");
		op.add(Builder::pri_indexing_indexCurrent, JsonpDeserializer.stringDeserializer(),
				"pri.indexing.index_current");
		op.add(Builder::indexing_indexTime, JsonpDeserializer.stringDeserializer(), "indexing.index_time", "iiti",
				"indexingIndexTime");
		op.add(Builder::pri_indexing_indexTime, JsonpDeserializer.stringDeserializer(), "pri.indexing.index_time");
		op.add(Builder::indexing_indexTotal, JsonpDeserializer.stringDeserializer(), "indexing.index_total", "iito",
				"indexingIndexTotal");
		op.add(Builder::pri_indexing_indexTotal, JsonpDeserializer.stringDeserializer(), "pri.indexing.index_total");
		op.add(Builder::indexing_indexFailed, JsonpDeserializer.stringDeserializer(), "indexing.index_failed", "iif",
				"indexingIndexFailed");
		op.add(Builder::pri_indexing_indexFailed, JsonpDeserializer.stringDeserializer(), "pri.indexing.index_failed");
		op.add(Builder::merges_current, JsonpDeserializer.stringDeserializer(), "merges.current", "mc",
				"mergesCurrent");
		op.add(Builder::pri_merges_current, JsonpDeserializer.stringDeserializer(), "pri.merges.current");
		op.add(Builder::merges_currentDocs, JsonpDeserializer.stringDeserializer(), "merges.current_docs", "mcd",
				"mergesCurrentDocs");
		op.add(Builder::pri_merges_currentDocs, JsonpDeserializer.stringDeserializer(), "pri.merges.current_docs");
		op.add(Builder::merges_currentSize, JsonpDeserializer.stringDeserializer(), "merges.current_size", "mcs",
				"mergesCurrentSize");
		op.add(Builder::pri_merges_currentSize, JsonpDeserializer.stringDeserializer(), "pri.merges.current_size");
		op.add(Builder::merges_total, JsonpDeserializer.stringDeserializer(), "merges.total", "mt", "mergesTotal");
		op.add(Builder::pri_merges_total, JsonpDeserializer.stringDeserializer(), "pri.merges.total");
		op.add(Builder::merges_totalDocs, JsonpDeserializer.stringDeserializer(), "merges.total_docs", "mtd",
				"mergesTotalDocs");
		op.add(Builder::pri_merges_totalDocs, JsonpDeserializer.stringDeserializer(), "pri.merges.total_docs");
		op.add(Builder::merges_totalSize, JsonpDeserializer.stringDeserializer(), "merges.total_size", "mts",
				"mergesTotalSize");
		op.add(Builder::pri_merges_totalSize, JsonpDeserializer.stringDeserializer(), "pri.merges.total_size");
		op.add(Builder::merges_totalTime, JsonpDeserializer.stringDeserializer(), "merges.total_time", "mtt",
				"mergesTotalTime");
		op.add(Builder::pri_merges_totalTime, JsonpDeserializer.stringDeserializer(), "pri.merges.total_time");
		op.add(Builder::refresh_total, JsonpDeserializer.stringDeserializer(), "refresh.total", "rto", "refreshTotal");
		op.add(Builder::pri_refresh_total, JsonpDeserializer.stringDeserializer(), "pri.refresh.total");
		op.add(Builder::refresh_time, JsonpDeserializer.stringDeserializer(), "refresh.time", "rti", "refreshTime");
		op.add(Builder::pri_refresh_time, JsonpDeserializer.stringDeserializer(), "pri.refresh.time");
		op.add(Builder::refresh_externalTotal, JsonpDeserializer.stringDeserializer(), "refresh.external_total",
				"reto");
		op.add(Builder::pri_refresh_externalTotal, JsonpDeserializer.stringDeserializer(),
				"pri.refresh.external_total");
		op.add(Builder::refresh_externalTime, JsonpDeserializer.stringDeserializer(), "refresh.external_time", "reti");
		op.add(Builder::pri_refresh_externalTime, JsonpDeserializer.stringDeserializer(), "pri.refresh.external_time");
		op.add(Builder::refresh_listeners, JsonpDeserializer.stringDeserializer(), "refresh.listeners", "rli",
				"refreshListeners");
		op.add(Builder::pri_refresh_listeners, JsonpDeserializer.stringDeserializer(), "pri.refresh.listeners");
		op.add(Builder::search_fetchCurrent, JsonpDeserializer.stringDeserializer(), "search.fetch_current", "sfc",
				"searchFetchCurrent");
		op.add(Builder::pri_search_fetchCurrent, JsonpDeserializer.stringDeserializer(), "pri.search.fetch_current");
		op.add(Builder::search_fetchTime, JsonpDeserializer.stringDeserializer(), "search.fetch_time", "sfti",
				"searchFetchTime");
		op.add(Builder::pri_search_fetchTime, JsonpDeserializer.stringDeserializer(), "pri.search.fetch_time");
		op.add(Builder::search_fetchTotal, JsonpDeserializer.stringDeserializer(), "search.fetch_total", "sfto",
				"searchFetchTotal");
		op.add(Builder::pri_search_fetchTotal, JsonpDeserializer.stringDeserializer(), "pri.search.fetch_total");
		op.add(Builder::search_openContexts, JsonpDeserializer.stringDeserializer(), "search.open_contexts", "so",
				"searchOpenContexts");
		op.add(Builder::pri_search_openContexts, JsonpDeserializer.stringDeserializer(), "pri.search.open_contexts");
		op.add(Builder::search_queryCurrent, JsonpDeserializer.stringDeserializer(), "search.query_current", "sqc",
				"searchQueryCurrent");
		op.add(Builder::pri_search_queryCurrent, JsonpDeserializer.stringDeserializer(), "pri.search.query_current");
		op.add(Builder::search_queryTime, JsonpDeserializer.stringDeserializer(), "search.query_time", "sqti",
				"searchQueryTime");
		op.add(Builder::pri_search_queryTime, JsonpDeserializer.stringDeserializer(), "pri.search.query_time");
		op.add(Builder::search_queryTotal, JsonpDeserializer.stringDeserializer(), "search.query_total", "sqto",
				"searchQueryTotal");
		op.add(Builder::pri_search_queryTotal, JsonpDeserializer.stringDeserializer(), "pri.search.query_total");
		op.add(Builder::search_scrollCurrent, JsonpDeserializer.stringDeserializer(), "search.scroll_current", "scc",
				"searchScrollCurrent");
		op.add(Builder::pri_search_scrollCurrent, JsonpDeserializer.stringDeserializer(), "pri.search.scroll_current");
		op.add(Builder::search_scrollTime, JsonpDeserializer.stringDeserializer(), "search.scroll_time", "scti",
				"searchScrollTime");
		op.add(Builder::pri_search_scrollTime, JsonpDeserializer.stringDeserializer(), "pri.search.scroll_time");
		op.add(Builder::search_scrollTotal, JsonpDeserializer.stringDeserializer(), "search.scroll_total", "scto",
				"searchScrollTotal");
		op.add(Builder::pri_search_scrollTotal, JsonpDeserializer.stringDeserializer(), "pri.search.scroll_total");
		op.add(Builder::segments_count, JsonpDeserializer.stringDeserializer(), "segments.count", "sc",
				"segmentsCount");
		op.add(Builder::pri_segments_count, JsonpDeserializer.stringDeserializer(), "pri.segments.count");
		op.add(Builder::segments_memory, JsonpDeserializer.stringDeserializer(), "segments.memory", "sm",
				"segmentsMemory");
		op.add(Builder::pri_segments_memory, JsonpDeserializer.stringDeserializer(), "pri.segments.memory");
		op.add(Builder::segments_indexWriterMemory, JsonpDeserializer.stringDeserializer(),
				"segments.index_writer_memory", "siwm", "segmentsIndexWriterMemory");
		op.add(Builder::pri_segments_indexWriterMemory, JsonpDeserializer.stringDeserializer(),
				"pri.segments.index_writer_memory");
		op.add(Builder::segments_versionMapMemory, JsonpDeserializer.stringDeserializer(),
				"segments.version_map_memory", "svmm", "segmentsVersionMapMemory");
		op.add(Builder::pri_segments_versionMapMemory, JsonpDeserializer.stringDeserializer(),
				"pri.segments.version_map_memory");
		op.add(Builder::segments_fixedBitsetMemory, JsonpDeserializer.stringDeserializer(),
				"segments.fixed_bitset_memory", "sfbm", "fixedBitsetMemory");
		op.add(Builder::pri_segments_fixedBitsetMemory, JsonpDeserializer.stringDeserializer(),
				"pri.segments.fixed_bitset_memory");
		op.add(Builder::warmer_current, JsonpDeserializer.stringDeserializer(), "warmer.current", "wc",
				"warmerCurrent");
		op.add(Builder::pri_warmer_current, JsonpDeserializer.stringDeserializer(), "pri.warmer.current");
		op.add(Builder::warmer_total, JsonpDeserializer.stringDeserializer(), "warmer.total", "wto", "warmerTotal");
		op.add(Builder::pri_warmer_total, JsonpDeserializer.stringDeserializer(), "pri.warmer.total");
		op.add(Builder::warmer_totalTime, JsonpDeserializer.stringDeserializer(), "warmer.total_time", "wtt",
				"warmerTotalTime");
		op.add(Builder::pri_warmer_totalTime, JsonpDeserializer.stringDeserializer(), "pri.warmer.total_time");
		op.add(Builder::suggest_current, JsonpDeserializer.stringDeserializer(), "suggest.current", "suc",
				"suggestCurrent");
		op.add(Builder::pri_suggest_current, JsonpDeserializer.stringDeserializer(), "pri.suggest.current");
		op.add(Builder::suggest_time, JsonpDeserializer.stringDeserializer(), "suggest.time", "suti", "suggestTime");
		op.add(Builder::pri_suggest_time, JsonpDeserializer.stringDeserializer(), "pri.suggest.time");
		op.add(Builder::suggest_total, JsonpDeserializer.stringDeserializer(), "suggest.total", "suto", "suggestTotal");
		op.add(Builder::pri_suggest_total, JsonpDeserializer.stringDeserializer(), "pri.suggest.total");
		op.add(Builder::memory_total, JsonpDeserializer.stringDeserializer(), "memory.total", "tm", "memoryTotal");
		op.add(Builder::pri_memory_total, JsonpDeserializer.stringDeserializer(), "pri.memory.total");
		op.add(Builder::search_throttled, JsonpDeserializer.stringDeserializer(), "search.throttled", "sth");
		op.add(Builder::bulk_totalOperations, JsonpDeserializer.stringDeserializer(), "bulk.total_operations", "bto",
				"bulkTotalOperation");
		op.add(Builder::pri_bulk_totalOperations, JsonpDeserializer.stringDeserializer(), "pri.bulk.total_operations");
		op.add(Builder::bulk_totalTime, JsonpDeserializer.stringDeserializer(), "bulk.total_time", "btti",
				"bulkTotalTime");
		op.add(Builder::pri_bulk_totalTime, JsonpDeserializer.stringDeserializer(), "pri.bulk.total_time");
		op.add(Builder::bulk_totalSizeInBytes, JsonpDeserializer.stringDeserializer(), "bulk.total_size_in_bytes",
				"btsi", "bulkTotalSizeInBytes");
		op.add(Builder::pri_bulk_totalSizeInBytes, JsonpDeserializer.stringDeserializer(),
				"pri.bulk.total_size_in_bytes");
		op.add(Builder::bulk_avgTime, JsonpDeserializer.stringDeserializer(), "bulk.avg_time", "bati", "bulkAvgTime");
		op.add(Builder::pri_bulk_avgTime, JsonpDeserializer.stringDeserializer(), "pri.bulk.avg_time");
		op.add(Builder::bulk_avgSizeInBytes, JsonpDeserializer.stringDeserializer(), "bulk.avg_size_in_bytes", "basi",
				"bulkAvgSizeInBytes");
		op.add(Builder::pri_bulk_avgSizeInBytes, JsonpDeserializer.stringDeserializer(), "pri.bulk.avg_size_in_bytes");

	}

}
