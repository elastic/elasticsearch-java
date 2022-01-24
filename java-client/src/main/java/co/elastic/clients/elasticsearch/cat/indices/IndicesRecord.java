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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cat.indices.IndicesRecord

/**
 *
 * @see <a href="../../doc-files/api-spec.html#cat.indices.IndicesRecord">API
 *      specification</a>
 */
@JsonpDeserializable
public class IndicesRecord implements JsonpSerializable {
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
	private final String docsCount;

	@Nullable
	private final String docsDeleted;

	@Nullable
	private final String creationDate;

	@Nullable
	private final String creationDateString;

	@Nullable
	private final String storeSize;

	@Nullable
	private final String completionSize;

	@Nullable
	private final String fielddataMemorySize;

	@Nullable
	private final String fielddataEvictions;

	@Nullable
	private final String queryCacheMemorySize;

	@Nullable
	private final String queryCacheEvictions;

	@Nullable
	private final String requestCacheMemorySize;

	@Nullable
	private final String requestCacheEvictions;

	@Nullable
	private final String requestCacheHitCount;

	@Nullable
	private final String requestCacheMissCount;

	@Nullable
	private final String flushTotal;

	@Nullable
	private final String flushTotalTime;

	@Nullable
	private final String getCurrent;

	@Nullable
	private final String getTime;

	@Nullable
	private final String getTotal;

	@Nullable
	private final String getExistsTime;

	@Nullable
	private final String getExistsTotal;

	@Nullable
	private final String getMissingTime;

	@Nullable
	private final String getMissingTotal;

	@Nullable
	private final String indexingDeleteCurrent;

	@Nullable
	private final String indexingDeleteTime;

	@Nullable
	private final String indexingDeleteTotal;

	@Nullable
	private final String indexingIndexCurrent;

	@Nullable
	private final String indexingIndexTime;

	@Nullable
	private final String indexingIndexTotal;

	@Nullable
	private final String indexingIndexFailed;

	@Nullable
	private final String mergesCurrent;

	@Nullable
	private final String mergesCurrentDocs;

	@Nullable
	private final String mergesCurrentSize;

	@Nullable
	private final String mergesTotal;

	@Nullable
	private final String mergesTotalDocs;

	@Nullable
	private final String mergesTotalSize;

	@Nullable
	private final String mergesTotalTime;

	@Nullable
	private final String refreshTotal;

	@Nullable
	private final String refreshTime;

	@Nullable
	private final String refreshExternalTotal;

	@Nullable
	private final String refreshExternalTime;

	@Nullable
	private final String refreshListeners;

	@Nullable
	private final String searchFetchCurrent;

	@Nullable
	private final String searchFetchTime;

	@Nullable
	private final String searchFetchTotal;

	@Nullable
	private final String searchOpenContexts;

	@Nullable
	private final String searchQueryCurrent;

	@Nullable
	private final String searchQueryTime;

	@Nullable
	private final String searchQueryTotal;

	@Nullable
	private final String searchScrollCurrent;

	@Nullable
	private final String searchScrollTime;

	@Nullable
	private final String searchScrollTotal;

	@Nullable
	private final String segmentsCount;

	@Nullable
	private final String segmentsMemory;

	@Nullable
	private final String segmentsIndexWriterMemory;

	@Nullable
	private final String segmentsVersionMapMemory;

	@Nullable
	private final String segmentsFixedBitsetMemory;

	@Nullable
	private final String warmerCurrent;

	@Nullable
	private final String warmerTotal;

	@Nullable
	private final String warmerTotalTime;

	@Nullable
	private final String suggestCurrent;

	@Nullable
	private final String suggestTime;

	@Nullable
	private final String suggestTotal;

	@Nullable
	private final String memoryTotal;

	@Nullable
	private final String searchThrottled;

	@Nullable
	private final String bulkTotalOperations;

	@Nullable
	private final String bulkTotalTime;

	@Nullable
	private final String bulkTotalSizeInBytes;

	@Nullable
	private final String bulkAvgTime;

	@Nullable
	private final String bulkAvgSizeInBytes;

	// ---------------------------------------------------------------------------------------------

	private IndicesRecord(Builder builder) {

		this.health = builder.health;
		this.status = builder.status;
		this.index = builder.index;
		this.uuid = builder.uuid;
		this.pri = builder.pri;
		this.rep = builder.rep;
		this.docsCount = builder.docsCount;
		this.docsDeleted = builder.docsDeleted;
		this.creationDate = builder.creationDate;
		this.creationDateString = builder.creationDateString;
		this.storeSize = builder.storeSize;
		this.completionSize = builder.completionSize;
		this.fielddataMemorySize = builder.fielddataMemorySize;
		this.fielddataEvictions = builder.fielddataEvictions;
		this.queryCacheMemorySize = builder.queryCacheMemorySize;
		this.queryCacheEvictions = builder.queryCacheEvictions;
		this.requestCacheMemorySize = builder.requestCacheMemorySize;
		this.requestCacheEvictions = builder.requestCacheEvictions;
		this.requestCacheHitCount = builder.requestCacheHitCount;
		this.requestCacheMissCount = builder.requestCacheMissCount;
		this.flushTotal = builder.flushTotal;
		this.flushTotalTime = builder.flushTotalTime;
		this.getCurrent = builder.getCurrent;
		this.getTime = builder.getTime;
		this.getTotal = builder.getTotal;
		this.getExistsTime = builder.getExistsTime;
		this.getExistsTotal = builder.getExistsTotal;
		this.getMissingTime = builder.getMissingTime;
		this.getMissingTotal = builder.getMissingTotal;
		this.indexingDeleteCurrent = builder.indexingDeleteCurrent;
		this.indexingDeleteTime = builder.indexingDeleteTime;
		this.indexingDeleteTotal = builder.indexingDeleteTotal;
		this.indexingIndexCurrent = builder.indexingIndexCurrent;
		this.indexingIndexTime = builder.indexingIndexTime;
		this.indexingIndexTotal = builder.indexingIndexTotal;
		this.indexingIndexFailed = builder.indexingIndexFailed;
		this.mergesCurrent = builder.mergesCurrent;
		this.mergesCurrentDocs = builder.mergesCurrentDocs;
		this.mergesCurrentSize = builder.mergesCurrentSize;
		this.mergesTotal = builder.mergesTotal;
		this.mergesTotalDocs = builder.mergesTotalDocs;
		this.mergesTotalSize = builder.mergesTotalSize;
		this.mergesTotalTime = builder.mergesTotalTime;
		this.refreshTotal = builder.refreshTotal;
		this.refreshTime = builder.refreshTime;
		this.refreshExternalTotal = builder.refreshExternalTotal;
		this.refreshExternalTime = builder.refreshExternalTime;
		this.refreshListeners = builder.refreshListeners;
		this.searchFetchCurrent = builder.searchFetchCurrent;
		this.searchFetchTime = builder.searchFetchTime;
		this.searchFetchTotal = builder.searchFetchTotal;
		this.searchOpenContexts = builder.searchOpenContexts;
		this.searchQueryCurrent = builder.searchQueryCurrent;
		this.searchQueryTime = builder.searchQueryTime;
		this.searchQueryTotal = builder.searchQueryTotal;
		this.searchScrollCurrent = builder.searchScrollCurrent;
		this.searchScrollTime = builder.searchScrollTime;
		this.searchScrollTotal = builder.searchScrollTotal;
		this.segmentsCount = builder.segmentsCount;
		this.segmentsMemory = builder.segmentsMemory;
		this.segmentsIndexWriterMemory = builder.segmentsIndexWriterMemory;
		this.segmentsVersionMapMemory = builder.segmentsVersionMapMemory;
		this.segmentsFixedBitsetMemory = builder.segmentsFixedBitsetMemory;
		this.warmerCurrent = builder.warmerCurrent;
		this.warmerTotal = builder.warmerTotal;
		this.warmerTotalTime = builder.warmerTotalTime;
		this.suggestCurrent = builder.suggestCurrent;
		this.suggestTime = builder.suggestTime;
		this.suggestTotal = builder.suggestTotal;
		this.memoryTotal = builder.memoryTotal;
		this.searchThrottled = builder.searchThrottled;
		this.bulkTotalOperations = builder.bulkTotalOperations;
		this.bulkTotalTime = builder.bulkTotalTime;
		this.bulkTotalSizeInBytes = builder.bulkTotalSizeInBytes;
		this.bulkAvgTime = builder.bulkAvgTime;
		this.bulkAvgSizeInBytes = builder.bulkAvgSizeInBytes;

	}

	public static IndicesRecord of(Function<Builder, ObjectBuilder<IndicesRecord>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * current health status
	 * <p>
	 * API name: {@code health}
	 */
	@Nullable
	public final String health() {
		return this.health;
	}

	/**
	 * open/close status
	 * <p>
	 * API name: {@code status}
	 */
	@Nullable
	public final String status() {
		return this.status;
	}

	/**
	 * index name
	 * <p>
	 * API name: {@code index}
	 */
	@Nullable
	public final String index() {
		return this.index;
	}

	/**
	 * index uuid
	 * <p>
	 * API name: {@code uuid}
	 */
	@Nullable
	public final String uuid() {
		return this.uuid;
	}

	/**
	 * number of primary shards
	 * <p>
	 * API name: {@code pri}
	 */
	@Nullable
	public final String pri() {
		return this.pri;
	}

	/**
	 * number of replica shards
	 * <p>
	 * API name: {@code rep}
	 */
	@Nullable
	public final String rep() {
		return this.rep;
	}

	/**
	 * available docs
	 * <p>
	 * API name: {@code docs.count}
	 */
	@Nullable
	public final String docsCount() {
		return this.docsCount;
	}

	/**
	 * deleted docs
	 * <p>
	 * API name: {@code docs.deleted}
	 */
	@Nullable
	public final String docsDeleted() {
		return this.docsDeleted;
	}

	/**
	 * index creation date (millisecond value)
	 * <p>
	 * API name: {@code creation.date}
	 */
	@Nullable
	public final String creationDate() {
		return this.creationDate;
	}

	/**
	 * index creation date (as string)
	 * <p>
	 * API name: {@code creation.date.string}
	 */
	@Nullable
	public final String creationDateString() {
		return this.creationDateString;
	}

	/**
	 * store size of primaries &amp; replicas
	 * <p>
	 * API name: {@code store.size}
	 */
	@Nullable
	public final String storeSize() {
		return this.storeSize;
	}

	/**
	 * size of completion
	 * <p>
	 * API name: {@code completion.size}
	 */
	@Nullable
	public final String completionSize() {
		return this.completionSize;
	}

	/**
	 * used fielddata cache
	 * <p>
	 * API name: {@code fielddata.memory_size}
	 */
	@Nullable
	public final String fielddataMemorySize() {
		return this.fielddataMemorySize;
	}

	/**
	 * fielddata evictions
	 * <p>
	 * API name: {@code fielddata.evictions}
	 */
	@Nullable
	public final String fielddataEvictions() {
		return this.fielddataEvictions;
	}

	/**
	 * used query cache
	 * <p>
	 * API name: {@code query_cache.memory_size}
	 */
	@Nullable
	public final String queryCacheMemorySize() {
		return this.queryCacheMemorySize;
	}

	/**
	 * query cache evictions
	 * <p>
	 * API name: {@code query_cache.evictions}
	 */
	@Nullable
	public final String queryCacheEvictions() {
		return this.queryCacheEvictions;
	}

	/**
	 * used request cache
	 * <p>
	 * API name: {@code request_cache.memory_size}
	 */
	@Nullable
	public final String requestCacheMemorySize() {
		return this.requestCacheMemorySize;
	}

	/**
	 * request cache evictions
	 * <p>
	 * API name: {@code request_cache.evictions}
	 */
	@Nullable
	public final String requestCacheEvictions() {
		return this.requestCacheEvictions;
	}

	/**
	 * request cache hit count
	 * <p>
	 * API name: {@code request_cache.hit_count}
	 */
	@Nullable
	public final String requestCacheHitCount() {
		return this.requestCacheHitCount;
	}

	/**
	 * request cache miss count
	 * <p>
	 * API name: {@code request_cache.miss_count}
	 */
	@Nullable
	public final String requestCacheMissCount() {
		return this.requestCacheMissCount;
	}

	/**
	 * number of flushes
	 * <p>
	 * API name: {@code flush.total}
	 */
	@Nullable
	public final String flushTotal() {
		return this.flushTotal;
	}

	/**
	 * time spent in flush
	 * <p>
	 * API name: {@code flush.total_time}
	 */
	@Nullable
	public final String flushTotalTime() {
		return this.flushTotalTime;
	}

	/**
	 * number of current get ops
	 * <p>
	 * API name: {@code get.current}
	 */
	@Nullable
	public final String getCurrent() {
		return this.getCurrent;
	}

	/**
	 * time spent in get
	 * <p>
	 * API name: {@code get.time}
	 */
	@Nullable
	public final String getTime() {
		return this.getTime;
	}

	/**
	 * number of get ops
	 * <p>
	 * API name: {@code get.total}
	 */
	@Nullable
	public final String getTotal() {
		return this.getTotal;
	}

	/**
	 * time spent in successful gets
	 * <p>
	 * API name: {@code get.exists_time}
	 */
	@Nullable
	public final String getExistsTime() {
		return this.getExistsTime;
	}

	/**
	 * number of successful gets
	 * <p>
	 * API name: {@code get.exists_total}
	 */
	@Nullable
	public final String getExistsTotal() {
		return this.getExistsTotal;
	}

	/**
	 * time spent in failed gets
	 * <p>
	 * API name: {@code get.missing_time}
	 */
	@Nullable
	public final String getMissingTime() {
		return this.getMissingTime;
	}

	/**
	 * number of failed gets
	 * <p>
	 * API name: {@code get.missing_total}
	 */
	@Nullable
	public final String getMissingTotal() {
		return this.getMissingTotal;
	}

	/**
	 * number of current deletions
	 * <p>
	 * API name: {@code indexing.delete_current}
	 */
	@Nullable
	public final String indexingDeleteCurrent() {
		return this.indexingDeleteCurrent;
	}

	/**
	 * time spent in deletions
	 * <p>
	 * API name: {@code indexing.delete_time}
	 */
	@Nullable
	public final String indexingDeleteTime() {
		return this.indexingDeleteTime;
	}

	/**
	 * number of delete ops
	 * <p>
	 * API name: {@code indexing.delete_total}
	 */
	@Nullable
	public final String indexingDeleteTotal() {
		return this.indexingDeleteTotal;
	}

	/**
	 * number of current indexing ops
	 * <p>
	 * API name: {@code indexing.index_current}
	 */
	@Nullable
	public final String indexingIndexCurrent() {
		return this.indexingIndexCurrent;
	}

	/**
	 * time spent in indexing
	 * <p>
	 * API name: {@code indexing.index_time}
	 */
	@Nullable
	public final String indexingIndexTime() {
		return this.indexingIndexTime;
	}

	/**
	 * number of indexing ops
	 * <p>
	 * API name: {@code indexing.index_total}
	 */
	@Nullable
	public final String indexingIndexTotal() {
		return this.indexingIndexTotal;
	}

	/**
	 * number of failed indexing ops
	 * <p>
	 * API name: {@code indexing.index_failed}
	 */
	@Nullable
	public final String indexingIndexFailed() {
		return this.indexingIndexFailed;
	}

	/**
	 * number of current merges
	 * <p>
	 * API name: {@code merges.current}
	 */
	@Nullable
	public final String mergesCurrent() {
		return this.mergesCurrent;
	}

	/**
	 * number of current merging docs
	 * <p>
	 * API name: {@code merges.current_docs}
	 */
	@Nullable
	public final String mergesCurrentDocs() {
		return this.mergesCurrentDocs;
	}

	/**
	 * size of current merges
	 * <p>
	 * API name: {@code merges.current_size}
	 */
	@Nullable
	public final String mergesCurrentSize() {
		return this.mergesCurrentSize;
	}

	/**
	 * number of completed merge ops
	 * <p>
	 * API name: {@code merges.total}
	 */
	@Nullable
	public final String mergesTotal() {
		return this.mergesTotal;
	}

	/**
	 * docs merged
	 * <p>
	 * API name: {@code merges.total_docs}
	 */
	@Nullable
	public final String mergesTotalDocs() {
		return this.mergesTotalDocs;
	}

	/**
	 * size merged
	 * <p>
	 * API name: {@code merges.total_size}
	 */
	@Nullable
	public final String mergesTotalSize() {
		return this.mergesTotalSize;
	}

	/**
	 * time spent in merges
	 * <p>
	 * API name: {@code merges.total_time}
	 */
	@Nullable
	public final String mergesTotalTime() {
		return this.mergesTotalTime;
	}

	/**
	 * total refreshes
	 * <p>
	 * API name: {@code refresh.total}
	 */
	@Nullable
	public final String refreshTotal() {
		return this.refreshTotal;
	}

	/**
	 * time spent in refreshes
	 * <p>
	 * API name: {@code refresh.time}
	 */
	@Nullable
	public final String refreshTime() {
		return this.refreshTime;
	}

	/**
	 * total external refreshes
	 * <p>
	 * API name: {@code refresh.external_total}
	 */
	@Nullable
	public final String refreshExternalTotal() {
		return this.refreshExternalTotal;
	}

	/**
	 * time spent in external refreshes
	 * <p>
	 * API name: {@code refresh.external_time}
	 */
	@Nullable
	public final String refreshExternalTime() {
		return this.refreshExternalTime;
	}

	/**
	 * number of pending refresh listeners
	 * <p>
	 * API name: {@code refresh.listeners}
	 */
	@Nullable
	public final String refreshListeners() {
		return this.refreshListeners;
	}

	/**
	 * current fetch phase ops
	 * <p>
	 * API name: {@code search.fetch_current}
	 */
	@Nullable
	public final String searchFetchCurrent() {
		return this.searchFetchCurrent;
	}

	/**
	 * time spent in fetch phase
	 * <p>
	 * API name: {@code search.fetch_time}
	 */
	@Nullable
	public final String searchFetchTime() {
		return this.searchFetchTime;
	}

	/**
	 * total fetch ops
	 * <p>
	 * API name: {@code search.fetch_total}
	 */
	@Nullable
	public final String searchFetchTotal() {
		return this.searchFetchTotal;
	}

	/**
	 * open search contexts
	 * <p>
	 * API name: {@code search.open_contexts}
	 */
	@Nullable
	public final String searchOpenContexts() {
		return this.searchOpenContexts;
	}

	/**
	 * current query phase ops
	 * <p>
	 * API name: {@code search.query_current}
	 */
	@Nullable
	public final String searchQueryCurrent() {
		return this.searchQueryCurrent;
	}

	/**
	 * time spent in query phase
	 * <p>
	 * API name: {@code search.query_time}
	 */
	@Nullable
	public final String searchQueryTime() {
		return this.searchQueryTime;
	}

	/**
	 * total query phase ops
	 * <p>
	 * API name: {@code search.query_total}
	 */
	@Nullable
	public final String searchQueryTotal() {
		return this.searchQueryTotal;
	}

	/**
	 * open scroll contexts
	 * <p>
	 * API name: {@code search.scroll_current}
	 */
	@Nullable
	public final String searchScrollCurrent() {
		return this.searchScrollCurrent;
	}

	/**
	 * time scroll contexts held open
	 * <p>
	 * API name: {@code search.scroll_time}
	 */
	@Nullable
	public final String searchScrollTime() {
		return this.searchScrollTime;
	}

	/**
	 * completed scroll contexts
	 * <p>
	 * API name: {@code search.scroll_total}
	 */
	@Nullable
	public final String searchScrollTotal() {
		return this.searchScrollTotal;
	}

	/**
	 * number of segments
	 * <p>
	 * API name: {@code segments.count}
	 */
	@Nullable
	public final String segmentsCount() {
		return this.segmentsCount;
	}

	/**
	 * memory used by segments
	 * <p>
	 * API name: {@code segments.memory}
	 */
	@Nullable
	public final String segmentsMemory() {
		return this.segmentsMemory;
	}

	/**
	 * memory used by index writer
	 * <p>
	 * API name: {@code segments.index_writer_memory}
	 */
	@Nullable
	public final String segmentsIndexWriterMemory() {
		return this.segmentsIndexWriterMemory;
	}

	/**
	 * memory used by version map
	 * <p>
	 * API name: {@code segments.version_map_memory}
	 */
	@Nullable
	public final String segmentsVersionMapMemory() {
		return this.segmentsVersionMapMemory;
	}

	/**
	 * memory used by fixed bit sets for nested object field types and export type
	 * filters for types referred in _parent fields
	 * <p>
	 * API name: {@code segments.fixed_bitset_memory}
	 */
	@Nullable
	public final String segmentsFixedBitsetMemory() {
		return this.segmentsFixedBitsetMemory;
	}

	/**
	 * current warmer ops
	 * <p>
	 * API name: {@code warmer.current}
	 */
	@Nullable
	public final String warmerCurrent() {
		return this.warmerCurrent;
	}

	/**
	 * total warmer ops
	 * <p>
	 * API name: {@code warmer.total}
	 */
	@Nullable
	public final String warmerTotal() {
		return this.warmerTotal;
	}

	/**
	 * time spent in warmers
	 * <p>
	 * API name: {@code warmer.total_time}
	 */
	@Nullable
	public final String warmerTotalTime() {
		return this.warmerTotalTime;
	}

	/**
	 * number of current suggest ops
	 * <p>
	 * API name: {@code suggest.current}
	 */
	@Nullable
	public final String suggestCurrent() {
		return this.suggestCurrent;
	}

	/**
	 * time spend in suggest
	 * <p>
	 * API name: {@code suggest.time}
	 */
	@Nullable
	public final String suggestTime() {
		return this.suggestTime;
	}

	/**
	 * number of suggest ops
	 * <p>
	 * API name: {@code suggest.total}
	 */
	@Nullable
	public final String suggestTotal() {
		return this.suggestTotal;
	}

	/**
	 * total used memory
	 * <p>
	 * API name: {@code memory.total}
	 */
	@Nullable
	public final String memoryTotal() {
		return this.memoryTotal;
	}

	/**
	 * indicates if the index is search throttled
	 * <p>
	 * API name: {@code search.throttled}
	 */
	@Nullable
	public final String searchThrottled() {
		return this.searchThrottled;
	}

	/**
	 * number of bulk shard ops
	 * <p>
	 * API name: {@code bulk.total_operations}
	 */
	@Nullable
	public final String bulkTotalOperations() {
		return this.bulkTotalOperations;
	}

	/**
	 * time spend in shard bulk
	 * <p>
	 * API name: {@code bulk.total_time}
	 */
	@Nullable
	public final String bulkTotalTime() {
		return this.bulkTotalTime;
	}

	/**
	 * total size in bytes of shard bulk
	 * <p>
	 * API name: {@code bulk.total_size_in_bytes}
	 */
	@Nullable
	public final String bulkTotalSizeInBytes() {
		return this.bulkTotalSizeInBytes;
	}

	/**
	 * average time spend in shard bulk
	 * <p>
	 * API name: {@code bulk.avg_time}
	 */
	@Nullable
	public final String bulkAvgTime() {
		return this.bulkAvgTime;
	}

	/**
	 * average size in bytes of shard bulk
	 * <p>
	 * API name: {@code bulk.avg_size_in_bytes}
	 */
	@Nullable
	public final String bulkAvgSizeInBytes() {
		return this.bulkAvgSizeInBytes;
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
		if (this.docsCount != null) {
			generator.writeKey("docs.count");
			generator.write(this.docsCount);

		}
		if (this.docsDeleted != null) {
			generator.writeKey("docs.deleted");
			generator.write(this.docsDeleted);

		}
		if (this.creationDate != null) {
			generator.writeKey("creation.date");
			generator.write(this.creationDate);

		}
		if (this.creationDateString != null) {
			generator.writeKey("creation.date.string");
			generator.write(this.creationDateString);

		}
		if (this.storeSize != null) {
			generator.writeKey("store.size");
			generator.write(this.storeSize);

		}
		if (this.completionSize != null) {
			generator.writeKey("completion.size");
			generator.write(this.completionSize);

		}
		if (this.fielddataMemorySize != null) {
			generator.writeKey("fielddata.memory_size");
			generator.write(this.fielddataMemorySize);

		}
		if (this.fielddataEvictions != null) {
			generator.writeKey("fielddata.evictions");
			generator.write(this.fielddataEvictions);

		}
		if (this.queryCacheMemorySize != null) {
			generator.writeKey("query_cache.memory_size");
			generator.write(this.queryCacheMemorySize);

		}
		if (this.queryCacheEvictions != null) {
			generator.writeKey("query_cache.evictions");
			generator.write(this.queryCacheEvictions);

		}
		if (this.requestCacheMemorySize != null) {
			generator.writeKey("request_cache.memory_size");
			generator.write(this.requestCacheMemorySize);

		}
		if (this.requestCacheEvictions != null) {
			generator.writeKey("request_cache.evictions");
			generator.write(this.requestCacheEvictions);

		}
		if (this.requestCacheHitCount != null) {
			generator.writeKey("request_cache.hit_count");
			generator.write(this.requestCacheHitCount);

		}
		if (this.requestCacheMissCount != null) {
			generator.writeKey("request_cache.miss_count");
			generator.write(this.requestCacheMissCount);

		}
		if (this.flushTotal != null) {
			generator.writeKey("flush.total");
			generator.write(this.flushTotal);

		}
		if (this.flushTotalTime != null) {
			generator.writeKey("flush.total_time");
			generator.write(this.flushTotalTime);

		}
		if (this.getCurrent != null) {
			generator.writeKey("get.current");
			generator.write(this.getCurrent);

		}
		if (this.getTime != null) {
			generator.writeKey("get.time");
			generator.write(this.getTime);

		}
		if (this.getTotal != null) {
			generator.writeKey("get.total");
			generator.write(this.getTotal);

		}
		if (this.getExistsTime != null) {
			generator.writeKey("get.exists_time");
			generator.write(this.getExistsTime);

		}
		if (this.getExistsTotal != null) {
			generator.writeKey("get.exists_total");
			generator.write(this.getExistsTotal);

		}
		if (this.getMissingTime != null) {
			generator.writeKey("get.missing_time");
			generator.write(this.getMissingTime);

		}
		if (this.getMissingTotal != null) {
			generator.writeKey("get.missing_total");
			generator.write(this.getMissingTotal);

		}
		if (this.indexingDeleteCurrent != null) {
			generator.writeKey("indexing.delete_current");
			generator.write(this.indexingDeleteCurrent);

		}
		if (this.indexingDeleteTime != null) {
			generator.writeKey("indexing.delete_time");
			generator.write(this.indexingDeleteTime);

		}
		if (this.indexingDeleteTotal != null) {
			generator.writeKey("indexing.delete_total");
			generator.write(this.indexingDeleteTotal);

		}
		if (this.indexingIndexCurrent != null) {
			generator.writeKey("indexing.index_current");
			generator.write(this.indexingIndexCurrent);

		}
		if (this.indexingIndexTime != null) {
			generator.writeKey("indexing.index_time");
			generator.write(this.indexingIndexTime);

		}
		if (this.indexingIndexTotal != null) {
			generator.writeKey("indexing.index_total");
			generator.write(this.indexingIndexTotal);

		}
		if (this.indexingIndexFailed != null) {
			generator.writeKey("indexing.index_failed");
			generator.write(this.indexingIndexFailed);

		}
		if (this.mergesCurrent != null) {
			generator.writeKey("merges.current");
			generator.write(this.mergesCurrent);

		}
		if (this.mergesCurrentDocs != null) {
			generator.writeKey("merges.current_docs");
			generator.write(this.mergesCurrentDocs);

		}
		if (this.mergesCurrentSize != null) {
			generator.writeKey("merges.current_size");
			generator.write(this.mergesCurrentSize);

		}
		if (this.mergesTotal != null) {
			generator.writeKey("merges.total");
			generator.write(this.mergesTotal);

		}
		if (this.mergesTotalDocs != null) {
			generator.writeKey("merges.total_docs");
			generator.write(this.mergesTotalDocs);

		}
		if (this.mergesTotalSize != null) {
			generator.writeKey("merges.total_size");
			generator.write(this.mergesTotalSize);

		}
		if (this.mergesTotalTime != null) {
			generator.writeKey("merges.total_time");
			generator.write(this.mergesTotalTime);

		}
		if (this.refreshTotal != null) {
			generator.writeKey("refresh.total");
			generator.write(this.refreshTotal);

		}
		if (this.refreshTime != null) {
			generator.writeKey("refresh.time");
			generator.write(this.refreshTime);

		}
		if (this.refreshExternalTotal != null) {
			generator.writeKey("refresh.external_total");
			generator.write(this.refreshExternalTotal);

		}
		if (this.refreshExternalTime != null) {
			generator.writeKey("refresh.external_time");
			generator.write(this.refreshExternalTime);

		}
		if (this.refreshListeners != null) {
			generator.writeKey("refresh.listeners");
			generator.write(this.refreshListeners);

		}
		if (this.searchFetchCurrent != null) {
			generator.writeKey("search.fetch_current");
			generator.write(this.searchFetchCurrent);

		}
		if (this.searchFetchTime != null) {
			generator.writeKey("search.fetch_time");
			generator.write(this.searchFetchTime);

		}
		if (this.searchFetchTotal != null) {
			generator.writeKey("search.fetch_total");
			generator.write(this.searchFetchTotal);

		}
		if (this.searchOpenContexts != null) {
			generator.writeKey("search.open_contexts");
			generator.write(this.searchOpenContexts);

		}
		if (this.searchQueryCurrent != null) {
			generator.writeKey("search.query_current");
			generator.write(this.searchQueryCurrent);

		}
		if (this.searchQueryTime != null) {
			generator.writeKey("search.query_time");
			generator.write(this.searchQueryTime);

		}
		if (this.searchQueryTotal != null) {
			generator.writeKey("search.query_total");
			generator.write(this.searchQueryTotal);

		}
		if (this.searchScrollCurrent != null) {
			generator.writeKey("search.scroll_current");
			generator.write(this.searchScrollCurrent);

		}
		if (this.searchScrollTime != null) {
			generator.writeKey("search.scroll_time");
			generator.write(this.searchScrollTime);

		}
		if (this.searchScrollTotal != null) {
			generator.writeKey("search.scroll_total");
			generator.write(this.searchScrollTotal);

		}
		if (this.segmentsCount != null) {
			generator.writeKey("segments.count");
			generator.write(this.segmentsCount);

		}
		if (this.segmentsMemory != null) {
			generator.writeKey("segments.memory");
			generator.write(this.segmentsMemory);

		}
		if (this.segmentsIndexWriterMemory != null) {
			generator.writeKey("segments.index_writer_memory");
			generator.write(this.segmentsIndexWriterMemory);

		}
		if (this.segmentsVersionMapMemory != null) {
			generator.writeKey("segments.version_map_memory");
			generator.write(this.segmentsVersionMapMemory);

		}
		if (this.segmentsFixedBitsetMemory != null) {
			generator.writeKey("segments.fixed_bitset_memory");
			generator.write(this.segmentsFixedBitsetMemory);

		}
		if (this.warmerCurrent != null) {
			generator.writeKey("warmer.current");
			generator.write(this.warmerCurrent);

		}
		if (this.warmerTotal != null) {
			generator.writeKey("warmer.total");
			generator.write(this.warmerTotal);

		}
		if (this.warmerTotalTime != null) {
			generator.writeKey("warmer.total_time");
			generator.write(this.warmerTotalTime);

		}
		if (this.suggestCurrent != null) {
			generator.writeKey("suggest.current");
			generator.write(this.suggestCurrent);

		}
		if (this.suggestTime != null) {
			generator.writeKey("suggest.time");
			generator.write(this.suggestTime);

		}
		if (this.suggestTotal != null) {
			generator.writeKey("suggest.total");
			generator.write(this.suggestTotal);

		}
		if (this.memoryTotal != null) {
			generator.writeKey("memory.total");
			generator.write(this.memoryTotal);

		}
		if (this.searchThrottled != null) {
			generator.writeKey("search.throttled");
			generator.write(this.searchThrottled);

		}
		if (this.bulkTotalOperations != null) {
			generator.writeKey("bulk.total_operations");
			generator.write(this.bulkTotalOperations);

		}
		if (this.bulkTotalTime != null) {
			generator.writeKey("bulk.total_time");
			generator.write(this.bulkTotalTime);

		}
		if (this.bulkTotalSizeInBytes != null) {
			generator.writeKey("bulk.total_size_in_bytes");
			generator.write(this.bulkTotalSizeInBytes);

		}
		if (this.bulkAvgTime != null) {
			generator.writeKey("bulk.avg_time");
			generator.write(this.bulkAvgTime);

		}
		if (this.bulkAvgSizeInBytes != null) {
			generator.writeKey("bulk.avg_size_in_bytes");
			generator.write(this.bulkAvgSizeInBytes);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndicesRecord}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<IndicesRecord> {
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
		private String docsCount;

		@Nullable
		private String docsDeleted;

		@Nullable
		private String creationDate;

		@Nullable
		private String creationDateString;

		@Nullable
		private String storeSize;

		@Nullable
		private String completionSize;

		@Nullable
		private String fielddataMemorySize;

		@Nullable
		private String fielddataEvictions;

		@Nullable
		private String queryCacheMemorySize;

		@Nullable
		private String queryCacheEvictions;

		@Nullable
		private String requestCacheMemorySize;

		@Nullable
		private String requestCacheEvictions;

		@Nullable
		private String requestCacheHitCount;

		@Nullable
		private String requestCacheMissCount;

		@Nullable
		private String flushTotal;

		@Nullable
		private String flushTotalTime;

		@Nullable
		private String getCurrent;

		@Nullable
		private String getTime;

		@Nullable
		private String getTotal;

		@Nullable
		private String getExistsTime;

		@Nullable
		private String getExistsTotal;

		@Nullable
		private String getMissingTime;

		@Nullable
		private String getMissingTotal;

		@Nullable
		private String indexingDeleteCurrent;

		@Nullable
		private String indexingDeleteTime;

		@Nullable
		private String indexingDeleteTotal;

		@Nullable
		private String indexingIndexCurrent;

		@Nullable
		private String indexingIndexTime;

		@Nullable
		private String indexingIndexTotal;

		@Nullable
		private String indexingIndexFailed;

		@Nullable
		private String mergesCurrent;

		@Nullable
		private String mergesCurrentDocs;

		@Nullable
		private String mergesCurrentSize;

		@Nullable
		private String mergesTotal;

		@Nullable
		private String mergesTotalDocs;

		@Nullable
		private String mergesTotalSize;

		@Nullable
		private String mergesTotalTime;

		@Nullable
		private String refreshTotal;

		@Nullable
		private String refreshTime;

		@Nullable
		private String refreshExternalTotal;

		@Nullable
		private String refreshExternalTime;

		@Nullable
		private String refreshListeners;

		@Nullable
		private String searchFetchCurrent;

		@Nullable
		private String searchFetchTime;

		@Nullable
		private String searchFetchTotal;

		@Nullable
		private String searchOpenContexts;

		@Nullable
		private String searchQueryCurrent;

		@Nullable
		private String searchQueryTime;

		@Nullable
		private String searchQueryTotal;

		@Nullable
		private String searchScrollCurrent;

		@Nullable
		private String searchScrollTime;

		@Nullable
		private String searchScrollTotal;

		@Nullable
		private String segmentsCount;

		@Nullable
		private String segmentsMemory;

		@Nullable
		private String segmentsIndexWriterMemory;

		@Nullable
		private String segmentsVersionMapMemory;

		@Nullable
		private String segmentsFixedBitsetMemory;

		@Nullable
		private String warmerCurrent;

		@Nullable
		private String warmerTotal;

		@Nullable
		private String warmerTotalTime;

		@Nullable
		private String suggestCurrent;

		@Nullable
		private String suggestTime;

		@Nullable
		private String suggestTotal;

		@Nullable
		private String memoryTotal;

		@Nullable
		private String searchThrottled;

		@Nullable
		private String bulkTotalOperations;

		@Nullable
		private String bulkTotalTime;

		@Nullable
		private String bulkTotalSizeInBytes;

		@Nullable
		private String bulkAvgTime;

		@Nullable
		private String bulkAvgSizeInBytes;

		/**
		 * current health status
		 * <p>
		 * API name: {@code health}
		 */
		public final Builder health(@Nullable String value) {
			this.health = value;
			return this;
		}

		/**
		 * open/close status
		 * <p>
		 * API name: {@code status}
		 */
		public final Builder status(@Nullable String value) {
			this.status = value;
			return this;
		}

		/**
		 * index name
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(@Nullable String value) {
			this.index = value;
			return this;
		}

		/**
		 * index uuid
		 * <p>
		 * API name: {@code uuid}
		 */
		public final Builder uuid(@Nullable String value) {
			this.uuid = value;
			return this;
		}

		/**
		 * number of primary shards
		 * <p>
		 * API name: {@code pri}
		 */
		public final Builder pri(@Nullable String value) {
			this.pri = value;
			return this;
		}

		/**
		 * number of replica shards
		 * <p>
		 * API name: {@code rep}
		 */
		public final Builder rep(@Nullable String value) {
			this.rep = value;
			return this;
		}

		/**
		 * available docs
		 * <p>
		 * API name: {@code docs.count}
		 */
		public final Builder docsCount(@Nullable String value) {
			this.docsCount = value;
			return this;
		}

		/**
		 * deleted docs
		 * <p>
		 * API name: {@code docs.deleted}
		 */
		public final Builder docsDeleted(@Nullable String value) {
			this.docsDeleted = value;
			return this;
		}

		/**
		 * index creation date (millisecond value)
		 * <p>
		 * API name: {@code creation.date}
		 */
		public final Builder creationDate(@Nullable String value) {
			this.creationDate = value;
			return this;
		}

		/**
		 * index creation date (as string)
		 * <p>
		 * API name: {@code creation.date.string}
		 */
		public final Builder creationDateString(@Nullable String value) {
			this.creationDateString = value;
			return this;
		}

		/**
		 * store size of primaries &amp; replicas
		 * <p>
		 * API name: {@code store.size}
		 */
		public final Builder storeSize(@Nullable String value) {
			this.storeSize = value;
			return this;
		}

		/**
		 * size of completion
		 * <p>
		 * API name: {@code completion.size}
		 */
		public final Builder completionSize(@Nullable String value) {
			this.completionSize = value;
			return this;
		}

		/**
		 * used fielddata cache
		 * <p>
		 * API name: {@code fielddata.memory_size}
		 */
		public final Builder fielddataMemorySize(@Nullable String value) {
			this.fielddataMemorySize = value;
			return this;
		}

		/**
		 * fielddata evictions
		 * <p>
		 * API name: {@code fielddata.evictions}
		 */
		public final Builder fielddataEvictions(@Nullable String value) {
			this.fielddataEvictions = value;
			return this;
		}

		/**
		 * used query cache
		 * <p>
		 * API name: {@code query_cache.memory_size}
		 */
		public final Builder queryCacheMemorySize(@Nullable String value) {
			this.queryCacheMemorySize = value;
			return this;
		}

		/**
		 * query cache evictions
		 * <p>
		 * API name: {@code query_cache.evictions}
		 */
		public final Builder queryCacheEvictions(@Nullable String value) {
			this.queryCacheEvictions = value;
			return this;
		}

		/**
		 * used request cache
		 * <p>
		 * API name: {@code request_cache.memory_size}
		 */
		public final Builder requestCacheMemorySize(@Nullable String value) {
			this.requestCacheMemorySize = value;
			return this;
		}

		/**
		 * request cache evictions
		 * <p>
		 * API name: {@code request_cache.evictions}
		 */
		public final Builder requestCacheEvictions(@Nullable String value) {
			this.requestCacheEvictions = value;
			return this;
		}

		/**
		 * request cache hit count
		 * <p>
		 * API name: {@code request_cache.hit_count}
		 */
		public final Builder requestCacheHitCount(@Nullable String value) {
			this.requestCacheHitCount = value;
			return this;
		}

		/**
		 * request cache miss count
		 * <p>
		 * API name: {@code request_cache.miss_count}
		 */
		public final Builder requestCacheMissCount(@Nullable String value) {
			this.requestCacheMissCount = value;
			return this;
		}

		/**
		 * number of flushes
		 * <p>
		 * API name: {@code flush.total}
		 */
		public final Builder flushTotal(@Nullable String value) {
			this.flushTotal = value;
			return this;
		}

		/**
		 * time spent in flush
		 * <p>
		 * API name: {@code flush.total_time}
		 */
		public final Builder flushTotalTime(@Nullable String value) {
			this.flushTotalTime = value;
			return this;
		}

		/**
		 * number of current get ops
		 * <p>
		 * API name: {@code get.current}
		 */
		public final Builder getCurrent(@Nullable String value) {
			this.getCurrent = value;
			return this;
		}

		/**
		 * time spent in get
		 * <p>
		 * API name: {@code get.time}
		 */
		public final Builder getTime(@Nullable String value) {
			this.getTime = value;
			return this;
		}

		/**
		 * number of get ops
		 * <p>
		 * API name: {@code get.total}
		 */
		public final Builder getTotal(@Nullable String value) {
			this.getTotal = value;
			return this;
		}

		/**
		 * time spent in successful gets
		 * <p>
		 * API name: {@code get.exists_time}
		 */
		public final Builder getExistsTime(@Nullable String value) {
			this.getExistsTime = value;
			return this;
		}

		/**
		 * number of successful gets
		 * <p>
		 * API name: {@code get.exists_total}
		 */
		public final Builder getExistsTotal(@Nullable String value) {
			this.getExistsTotal = value;
			return this;
		}

		/**
		 * time spent in failed gets
		 * <p>
		 * API name: {@code get.missing_time}
		 */
		public final Builder getMissingTime(@Nullable String value) {
			this.getMissingTime = value;
			return this;
		}

		/**
		 * number of failed gets
		 * <p>
		 * API name: {@code get.missing_total}
		 */
		public final Builder getMissingTotal(@Nullable String value) {
			this.getMissingTotal = value;
			return this;
		}

		/**
		 * number of current deletions
		 * <p>
		 * API name: {@code indexing.delete_current}
		 */
		public final Builder indexingDeleteCurrent(@Nullable String value) {
			this.indexingDeleteCurrent = value;
			return this;
		}

		/**
		 * time spent in deletions
		 * <p>
		 * API name: {@code indexing.delete_time}
		 */
		public final Builder indexingDeleteTime(@Nullable String value) {
			this.indexingDeleteTime = value;
			return this;
		}

		/**
		 * number of delete ops
		 * <p>
		 * API name: {@code indexing.delete_total}
		 */
		public final Builder indexingDeleteTotal(@Nullable String value) {
			this.indexingDeleteTotal = value;
			return this;
		}

		/**
		 * number of current indexing ops
		 * <p>
		 * API name: {@code indexing.index_current}
		 */
		public final Builder indexingIndexCurrent(@Nullable String value) {
			this.indexingIndexCurrent = value;
			return this;
		}

		/**
		 * time spent in indexing
		 * <p>
		 * API name: {@code indexing.index_time}
		 */
		public final Builder indexingIndexTime(@Nullable String value) {
			this.indexingIndexTime = value;
			return this;
		}

		/**
		 * number of indexing ops
		 * <p>
		 * API name: {@code indexing.index_total}
		 */
		public final Builder indexingIndexTotal(@Nullable String value) {
			this.indexingIndexTotal = value;
			return this;
		}

		/**
		 * number of failed indexing ops
		 * <p>
		 * API name: {@code indexing.index_failed}
		 */
		public final Builder indexingIndexFailed(@Nullable String value) {
			this.indexingIndexFailed = value;
			return this;
		}

		/**
		 * number of current merges
		 * <p>
		 * API name: {@code merges.current}
		 */
		public final Builder mergesCurrent(@Nullable String value) {
			this.mergesCurrent = value;
			return this;
		}

		/**
		 * number of current merging docs
		 * <p>
		 * API name: {@code merges.current_docs}
		 */
		public final Builder mergesCurrentDocs(@Nullable String value) {
			this.mergesCurrentDocs = value;
			return this;
		}

		/**
		 * size of current merges
		 * <p>
		 * API name: {@code merges.current_size}
		 */
		public final Builder mergesCurrentSize(@Nullable String value) {
			this.mergesCurrentSize = value;
			return this;
		}

		/**
		 * number of completed merge ops
		 * <p>
		 * API name: {@code merges.total}
		 */
		public final Builder mergesTotal(@Nullable String value) {
			this.mergesTotal = value;
			return this;
		}

		/**
		 * docs merged
		 * <p>
		 * API name: {@code merges.total_docs}
		 */
		public final Builder mergesTotalDocs(@Nullable String value) {
			this.mergesTotalDocs = value;
			return this;
		}

		/**
		 * size merged
		 * <p>
		 * API name: {@code merges.total_size}
		 */
		public final Builder mergesTotalSize(@Nullable String value) {
			this.mergesTotalSize = value;
			return this;
		}

		/**
		 * time spent in merges
		 * <p>
		 * API name: {@code merges.total_time}
		 */
		public final Builder mergesTotalTime(@Nullable String value) {
			this.mergesTotalTime = value;
			return this;
		}

		/**
		 * total refreshes
		 * <p>
		 * API name: {@code refresh.total}
		 */
		public final Builder refreshTotal(@Nullable String value) {
			this.refreshTotal = value;
			return this;
		}

		/**
		 * time spent in refreshes
		 * <p>
		 * API name: {@code refresh.time}
		 */
		public final Builder refreshTime(@Nullable String value) {
			this.refreshTime = value;
			return this;
		}

		/**
		 * total external refreshes
		 * <p>
		 * API name: {@code refresh.external_total}
		 */
		public final Builder refreshExternalTotal(@Nullable String value) {
			this.refreshExternalTotal = value;
			return this;
		}

		/**
		 * time spent in external refreshes
		 * <p>
		 * API name: {@code refresh.external_time}
		 */
		public final Builder refreshExternalTime(@Nullable String value) {
			this.refreshExternalTime = value;
			return this;
		}

		/**
		 * number of pending refresh listeners
		 * <p>
		 * API name: {@code refresh.listeners}
		 */
		public final Builder refreshListeners(@Nullable String value) {
			this.refreshListeners = value;
			return this;
		}

		/**
		 * current fetch phase ops
		 * <p>
		 * API name: {@code search.fetch_current}
		 */
		public final Builder searchFetchCurrent(@Nullable String value) {
			this.searchFetchCurrent = value;
			return this;
		}

		/**
		 * time spent in fetch phase
		 * <p>
		 * API name: {@code search.fetch_time}
		 */
		public final Builder searchFetchTime(@Nullable String value) {
			this.searchFetchTime = value;
			return this;
		}

		/**
		 * total fetch ops
		 * <p>
		 * API name: {@code search.fetch_total}
		 */
		public final Builder searchFetchTotal(@Nullable String value) {
			this.searchFetchTotal = value;
			return this;
		}

		/**
		 * open search contexts
		 * <p>
		 * API name: {@code search.open_contexts}
		 */
		public final Builder searchOpenContexts(@Nullable String value) {
			this.searchOpenContexts = value;
			return this;
		}

		/**
		 * current query phase ops
		 * <p>
		 * API name: {@code search.query_current}
		 */
		public final Builder searchQueryCurrent(@Nullable String value) {
			this.searchQueryCurrent = value;
			return this;
		}

		/**
		 * time spent in query phase
		 * <p>
		 * API name: {@code search.query_time}
		 */
		public final Builder searchQueryTime(@Nullable String value) {
			this.searchQueryTime = value;
			return this;
		}

		/**
		 * total query phase ops
		 * <p>
		 * API name: {@code search.query_total}
		 */
		public final Builder searchQueryTotal(@Nullable String value) {
			this.searchQueryTotal = value;
			return this;
		}

		/**
		 * open scroll contexts
		 * <p>
		 * API name: {@code search.scroll_current}
		 */
		public final Builder searchScrollCurrent(@Nullable String value) {
			this.searchScrollCurrent = value;
			return this;
		}

		/**
		 * time scroll contexts held open
		 * <p>
		 * API name: {@code search.scroll_time}
		 */
		public final Builder searchScrollTime(@Nullable String value) {
			this.searchScrollTime = value;
			return this;
		}

		/**
		 * completed scroll contexts
		 * <p>
		 * API name: {@code search.scroll_total}
		 */
		public final Builder searchScrollTotal(@Nullable String value) {
			this.searchScrollTotal = value;
			return this;
		}

		/**
		 * number of segments
		 * <p>
		 * API name: {@code segments.count}
		 */
		public final Builder segmentsCount(@Nullable String value) {
			this.segmentsCount = value;
			return this;
		}

		/**
		 * memory used by segments
		 * <p>
		 * API name: {@code segments.memory}
		 */
		public final Builder segmentsMemory(@Nullable String value) {
			this.segmentsMemory = value;
			return this;
		}

		/**
		 * memory used by index writer
		 * <p>
		 * API name: {@code segments.index_writer_memory}
		 */
		public final Builder segmentsIndexWriterMemory(@Nullable String value) {
			this.segmentsIndexWriterMemory = value;
			return this;
		}

		/**
		 * memory used by version map
		 * <p>
		 * API name: {@code segments.version_map_memory}
		 */
		public final Builder segmentsVersionMapMemory(@Nullable String value) {
			this.segmentsVersionMapMemory = value;
			return this;
		}

		/**
		 * memory used by fixed bit sets for nested object field types and export type
		 * filters for types referred in _parent fields
		 * <p>
		 * API name: {@code segments.fixed_bitset_memory}
		 */
		public final Builder segmentsFixedBitsetMemory(@Nullable String value) {
			this.segmentsFixedBitsetMemory = value;
			return this;
		}

		/**
		 * current warmer ops
		 * <p>
		 * API name: {@code warmer.current}
		 */
		public final Builder warmerCurrent(@Nullable String value) {
			this.warmerCurrent = value;
			return this;
		}

		/**
		 * total warmer ops
		 * <p>
		 * API name: {@code warmer.total}
		 */
		public final Builder warmerTotal(@Nullable String value) {
			this.warmerTotal = value;
			return this;
		}

		/**
		 * time spent in warmers
		 * <p>
		 * API name: {@code warmer.total_time}
		 */
		public final Builder warmerTotalTime(@Nullable String value) {
			this.warmerTotalTime = value;
			return this;
		}

		/**
		 * number of current suggest ops
		 * <p>
		 * API name: {@code suggest.current}
		 */
		public final Builder suggestCurrent(@Nullable String value) {
			this.suggestCurrent = value;
			return this;
		}

		/**
		 * time spend in suggest
		 * <p>
		 * API name: {@code suggest.time}
		 */
		public final Builder suggestTime(@Nullable String value) {
			this.suggestTime = value;
			return this;
		}

		/**
		 * number of suggest ops
		 * <p>
		 * API name: {@code suggest.total}
		 */
		public final Builder suggestTotal(@Nullable String value) {
			this.suggestTotal = value;
			return this;
		}

		/**
		 * total used memory
		 * <p>
		 * API name: {@code memory.total}
		 */
		public final Builder memoryTotal(@Nullable String value) {
			this.memoryTotal = value;
			return this;
		}

		/**
		 * indicates if the index is search throttled
		 * <p>
		 * API name: {@code search.throttled}
		 */
		public final Builder searchThrottled(@Nullable String value) {
			this.searchThrottled = value;
			return this;
		}

		/**
		 * number of bulk shard ops
		 * <p>
		 * API name: {@code bulk.total_operations}
		 */
		public final Builder bulkTotalOperations(@Nullable String value) {
			this.bulkTotalOperations = value;
			return this;
		}

		/**
		 * time spend in shard bulk
		 * <p>
		 * API name: {@code bulk.total_time}
		 */
		public final Builder bulkTotalTime(@Nullable String value) {
			this.bulkTotalTime = value;
			return this;
		}

		/**
		 * total size in bytes of shard bulk
		 * <p>
		 * API name: {@code bulk.total_size_in_bytes}
		 */
		public final Builder bulkTotalSizeInBytes(@Nullable String value) {
			this.bulkTotalSizeInBytes = value;
			return this;
		}

		/**
		 * average time spend in shard bulk
		 * <p>
		 * API name: {@code bulk.avg_time}
		 */
		public final Builder bulkAvgTime(@Nullable String value) {
			this.bulkAvgTime = value;
			return this;
		}

		/**
		 * average size in bytes of shard bulk
		 * <p>
		 * API name: {@code bulk.avg_size_in_bytes}
		 */
		public final Builder bulkAvgSizeInBytes(@Nullable String value) {
			this.bulkAvgSizeInBytes = value;
			return this;
		}

		/**
		 * Builds a {@link IndicesRecord}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndicesRecord build() {
			_checkSingleUse();

			return new IndicesRecord(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndicesRecord}
	 */
	public static final JsonpDeserializer<IndicesRecord> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			IndicesRecord::setupIndicesRecordDeserializer);

	protected static void setupIndicesRecordDeserializer(ObjectDeserializer<IndicesRecord.Builder> op) {

		op.add(Builder::health, JsonpDeserializer.stringDeserializer(), "health", "h");
		op.add(Builder::status, JsonpDeserializer.stringDeserializer(), "status", "s");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index", "i", "idx");
		op.add(Builder::uuid, JsonpDeserializer.stringDeserializer(), "uuid", "id");
		op.add(Builder::pri, JsonpDeserializer.stringDeserializer(), "pri", "p", "shards.primary", "shardsPrimary");
		op.add(Builder::rep, JsonpDeserializer.stringDeserializer(), "rep", "r", "shards.replica", "shardsReplica");
		op.add(Builder::docsCount, JsonpDeserializer.stringDeserializer(), "docs.count", "dc", "docsCount");
		op.add(Builder::docsDeleted, JsonpDeserializer.stringDeserializer(), "docs.deleted", "dd", "docsDeleted");
		op.add(Builder::creationDate, JsonpDeserializer.stringDeserializer(), "creation.date", "cd");
		op.add(Builder::creationDateString, JsonpDeserializer.stringDeserializer(), "creation.date.string", "cds");
		op.add(Builder::storeSize, JsonpDeserializer.stringDeserializer(), "store.size", "ss", "storeSize");
		op.add(Builder::completionSize, JsonpDeserializer.stringDeserializer(), "completion.size", "cs",
				"completionSize");
		op.add(Builder::fielddataMemorySize, JsonpDeserializer.stringDeserializer(), "fielddata.memory_size", "fm",
				"fielddataMemory");
		op.add(Builder::fielddataEvictions, JsonpDeserializer.stringDeserializer(), "fielddata.evictions", "fe",
				"fielddataEvictions");
		op.add(Builder::queryCacheMemorySize, JsonpDeserializer.stringDeserializer(), "query_cache.memory_size", "qcm",
				"queryCacheMemory");
		op.add(Builder::queryCacheEvictions, JsonpDeserializer.stringDeserializer(), "query_cache.evictions", "qce",
				"queryCacheEvictions");
		op.add(Builder::requestCacheMemorySize, JsonpDeserializer.stringDeserializer(), "request_cache.memory_size",
				"rcm", "requestCacheMemory");
		op.add(Builder::requestCacheEvictions, JsonpDeserializer.stringDeserializer(), "request_cache.evictions", "rce",
				"requestCacheEvictions");
		op.add(Builder::requestCacheHitCount, JsonpDeserializer.stringDeserializer(), "request_cache.hit_count", "rchc",
				"requestCacheHitCount");
		op.add(Builder::requestCacheMissCount, JsonpDeserializer.stringDeserializer(), "request_cache.miss_count",
				"rcmc", "requestCacheMissCount");
		op.add(Builder::flushTotal, JsonpDeserializer.stringDeserializer(), "flush.total", "ft", "flushTotal");
		op.add(Builder::flushTotalTime, JsonpDeserializer.stringDeserializer(), "flush.total_time", "ftt",
				"flushTotalTime");
		op.add(Builder::getCurrent, JsonpDeserializer.stringDeserializer(), "get.current", "gc", "getCurrent");
		op.add(Builder::getTime, JsonpDeserializer.stringDeserializer(), "get.time", "gti", "getTime");
		op.add(Builder::getTotal, JsonpDeserializer.stringDeserializer(), "get.total", "gto", "getTotal");
		op.add(Builder::getExistsTime, JsonpDeserializer.stringDeserializer(), "get.exists_time", "geti",
				"getExistsTime");
		op.add(Builder::getExistsTotal, JsonpDeserializer.stringDeserializer(), "get.exists_total", "geto",
				"getExistsTotal");
		op.add(Builder::getMissingTime, JsonpDeserializer.stringDeserializer(), "get.missing_time", "gmti",
				"getMissingTime");
		op.add(Builder::getMissingTotal, JsonpDeserializer.stringDeserializer(), "get.missing_total", "gmto",
				"getMissingTotal");
		op.add(Builder::indexingDeleteCurrent, JsonpDeserializer.stringDeserializer(), "indexing.delete_current", "idc",
				"indexingDeleteCurrent");
		op.add(Builder::indexingDeleteTime, JsonpDeserializer.stringDeserializer(), "indexing.delete_time", "idti",
				"indexingDeleteTime");
		op.add(Builder::indexingDeleteTotal, JsonpDeserializer.stringDeserializer(), "indexing.delete_total", "idto",
				"indexingDeleteTotal");
		op.add(Builder::indexingIndexCurrent, JsonpDeserializer.stringDeserializer(), "indexing.index_current", "iic",
				"indexingIndexCurrent");
		op.add(Builder::indexingIndexTime, JsonpDeserializer.stringDeserializer(), "indexing.index_time", "iiti",
				"indexingIndexTime");
		op.add(Builder::indexingIndexTotal, JsonpDeserializer.stringDeserializer(), "indexing.index_total", "iito",
				"indexingIndexTotal");
		op.add(Builder::indexingIndexFailed, JsonpDeserializer.stringDeserializer(), "indexing.index_failed", "iif",
				"indexingIndexFailed");
		op.add(Builder::mergesCurrent, JsonpDeserializer.stringDeserializer(), "merges.current", "mc", "mergesCurrent");
		op.add(Builder::mergesCurrentDocs, JsonpDeserializer.stringDeserializer(), "merges.current_docs", "mcd",
				"mergesCurrentDocs");
		op.add(Builder::mergesCurrentSize, JsonpDeserializer.stringDeserializer(), "merges.current_size", "mcs",
				"mergesCurrentSize");
		op.add(Builder::mergesTotal, JsonpDeserializer.stringDeserializer(), "merges.total", "mt", "mergesTotal");
		op.add(Builder::mergesTotalDocs, JsonpDeserializer.stringDeserializer(), "merges.total_docs", "mtd",
				"mergesTotalDocs");
		op.add(Builder::mergesTotalSize, JsonpDeserializer.stringDeserializer(), "merges.total_size", "mts",
				"mergesTotalSize");
		op.add(Builder::mergesTotalTime, JsonpDeserializer.stringDeserializer(), "merges.total_time", "mtt",
				"mergesTotalTime");
		op.add(Builder::refreshTotal, JsonpDeserializer.stringDeserializer(), "refresh.total", "rto", "refreshTotal");
		op.add(Builder::refreshTime, JsonpDeserializer.stringDeserializer(), "refresh.time", "rti", "refreshTime");
		op.add(Builder::refreshExternalTotal, JsonpDeserializer.stringDeserializer(), "refresh.external_total", "reto");
		op.add(Builder::refreshExternalTime, JsonpDeserializer.stringDeserializer(), "refresh.external_time", "reti");
		op.add(Builder::refreshListeners, JsonpDeserializer.stringDeserializer(), "refresh.listeners", "rli",
				"refreshListeners");
		op.add(Builder::searchFetchCurrent, JsonpDeserializer.stringDeserializer(), "search.fetch_current", "sfc",
				"searchFetchCurrent");
		op.add(Builder::searchFetchTime, JsonpDeserializer.stringDeserializer(), "search.fetch_time", "sfti",
				"searchFetchTime");
		op.add(Builder::searchFetchTotal, JsonpDeserializer.stringDeserializer(), "search.fetch_total", "sfto",
				"searchFetchTotal");
		op.add(Builder::searchOpenContexts, JsonpDeserializer.stringDeserializer(), "search.open_contexts", "so",
				"searchOpenContexts");
		op.add(Builder::searchQueryCurrent, JsonpDeserializer.stringDeserializer(), "search.query_current", "sqc",
				"searchQueryCurrent");
		op.add(Builder::searchQueryTime, JsonpDeserializer.stringDeserializer(), "search.query_time", "sqti",
				"searchQueryTime");
		op.add(Builder::searchQueryTotal, JsonpDeserializer.stringDeserializer(), "search.query_total", "sqto",
				"searchQueryTotal");
		op.add(Builder::searchScrollCurrent, JsonpDeserializer.stringDeserializer(), "search.scroll_current", "scc",
				"searchScrollCurrent");
		op.add(Builder::searchScrollTime, JsonpDeserializer.stringDeserializer(), "search.scroll_time", "scti",
				"searchScrollTime");
		op.add(Builder::searchScrollTotal, JsonpDeserializer.stringDeserializer(), "search.scroll_total", "scto",
				"searchScrollTotal");
		op.add(Builder::segmentsCount, JsonpDeserializer.stringDeserializer(), "segments.count", "sc", "segmentsCount");
		op.add(Builder::segmentsMemory, JsonpDeserializer.stringDeserializer(), "segments.memory", "sm",
				"segmentsMemory");
		op.add(Builder::segmentsIndexWriterMemory, JsonpDeserializer.stringDeserializer(),
				"segments.index_writer_memory", "siwm", "segmentsIndexWriterMemory");
		op.add(Builder::segmentsVersionMapMemory, JsonpDeserializer.stringDeserializer(), "segments.version_map_memory",
				"svmm", "segmentsVersionMapMemory");
		op.add(Builder::segmentsFixedBitsetMemory, JsonpDeserializer.stringDeserializer(),
				"segments.fixed_bitset_memory", "sfbm", "fixedBitsetMemory");
		op.add(Builder::warmerCurrent, JsonpDeserializer.stringDeserializer(), "warmer.current", "wc", "warmerCurrent");
		op.add(Builder::warmerTotal, JsonpDeserializer.stringDeserializer(), "warmer.total", "wto", "warmerTotal");
		op.add(Builder::warmerTotalTime, JsonpDeserializer.stringDeserializer(), "warmer.total_time", "wtt",
				"warmerTotalTime");
		op.add(Builder::suggestCurrent, JsonpDeserializer.stringDeserializer(), "suggest.current", "suc",
				"suggestCurrent");
		op.add(Builder::suggestTime, JsonpDeserializer.stringDeserializer(), "suggest.time", "suti", "suggestTime");
		op.add(Builder::suggestTotal, JsonpDeserializer.stringDeserializer(), "suggest.total", "suto", "suggestTotal");
		op.add(Builder::memoryTotal, JsonpDeserializer.stringDeserializer(), "memory.total", "tm", "memoryTotal");
		op.add(Builder::searchThrottled, JsonpDeserializer.stringDeserializer(), "search.throttled", "sth");
		op.add(Builder::bulkTotalOperations, JsonpDeserializer.stringDeserializer(), "bulk.total_operations", "bto",
				"bulkTotalOperation");
		op.add(Builder::bulkTotalTime, JsonpDeserializer.stringDeserializer(), "bulk.total_time", "btti",
				"bulkTotalTime");
		op.add(Builder::bulkTotalSizeInBytes, JsonpDeserializer.stringDeserializer(), "bulk.total_size_in_bytes",
				"btsi", "bulkTotalSizeInBytes");
		op.add(Builder::bulkAvgTime, JsonpDeserializer.stringDeserializer(), "bulk.avg_time", "bati", "bulkAvgTime");
		op.add(Builder::bulkAvgSizeInBytes, JsonpDeserializer.stringDeserializer(), "bulk.avg_size_in_bytes", "basi",
				"bulkAvgSizeInBytes");

	}

}
