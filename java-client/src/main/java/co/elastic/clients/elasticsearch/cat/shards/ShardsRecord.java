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

package co.elastic.clients.elasticsearch.cat.shards;

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

// typedef: cat.shards.ShardsRecord
public final class ShardsRecord implements ToJsonp {
	@Nullable
	private final String index;

	@Nullable
	private final String shard;

	@Nullable
	private final String prirep;

	@Nullable
	private final String state;

	@Nullable
	private final String docs;

	@Nullable
	private final String store;

	@Nullable
	private final String ip;

	@Nullable
	private final String id;

	@Nullable
	private final String node;

	@Nullable
	private final String syncId;

	@Nullable
	private final String unassigned_reason;

	@Nullable
	private final String unassigned_at;

	@Nullable
	private final String unassigned_for;

	@Nullable
	private final String unassigned_details;

	@Nullable
	private final String recoverysource_type;

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
	private final String seqNo_max;

	@Nullable
	private final String seqNo_localCheckpoint;

	@Nullable
	private final String seqNo_globalCheckpoint;

	@Nullable
	private final String warmer_current;

	@Nullable
	private final String warmer_total;

	@Nullable
	private final String warmer_totalTime;

	@Nullable
	private final String path_data;

	@Nullable
	private final String path_state;

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

	protected ShardsRecord(Builder builder) {

		this.index = builder.index;
		this.shard = builder.shard;
		this.prirep = builder.prirep;
		this.state = builder.state;
		this.docs = builder.docs;
		this.store = builder.store;
		this.ip = builder.ip;
		this.id = builder.id;
		this.node = builder.node;
		this.syncId = builder.syncId;
		this.unassigned_reason = builder.unassigned_reason;
		this.unassigned_at = builder.unassigned_at;
		this.unassigned_for = builder.unassigned_for;
		this.unassigned_details = builder.unassigned_details;
		this.recoverysource_type = builder.recoverysource_type;
		this.completion_size = builder.completion_size;
		this.fielddata_memorySize = builder.fielddata_memorySize;
		this.fielddata_evictions = builder.fielddata_evictions;
		this.queryCache_memorySize = builder.queryCache_memorySize;
		this.queryCache_evictions = builder.queryCache_evictions;
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
		this.seqNo_max = builder.seqNo_max;
		this.seqNo_localCheckpoint = builder.seqNo_localCheckpoint;
		this.seqNo_globalCheckpoint = builder.seqNo_globalCheckpoint;
		this.warmer_current = builder.warmer_current;
		this.warmer_total = builder.warmer_total;
		this.warmer_totalTime = builder.warmer_totalTime;
		this.path_data = builder.path_data;
		this.path_state = builder.path_state;
		this.bulk_totalOperations = builder.bulk_totalOperations;
		this.bulk_totalTime = builder.bulk_totalTime;
		this.bulk_totalSizeInBytes = builder.bulk_totalSizeInBytes;
		this.bulk_avgTime = builder.bulk_avgTime;
		this.bulk_avgSizeInBytes = builder.bulk_avgSizeInBytes;

	}

	/**
	 * index name
	 *
	 * API name: {@code index}
	 */
	@Nullable
	public String index() {
		return this.index;
	}

	/**
	 * shard name
	 *
	 * API name: {@code shard}
	 */
	@Nullable
	public String shard() {
		return this.shard;
	}

	/**
	 * primary or replica
	 *
	 * API name: {@code prirep}
	 */
	@Nullable
	public String prirep() {
		return this.prirep;
	}

	/**
	 * shard state
	 *
	 * API name: {@code state}
	 */
	@Nullable
	public String state() {
		return this.state;
	}

	/**
	 * number of docs in shard
	 *
	 * API name: {@code docs}
	 */
	@Nullable
	public String docs() {
		return this.docs;
	}

	/**
	 * store size of shard (how much disk it uses)
	 *
	 * API name: {@code store}
	 */
	@Nullable
	public String store() {
		return this.store;
	}

	/**
	 * ip of node where it lives
	 *
	 * API name: {@code ip}
	 */
	@Nullable
	public String ip() {
		return this.ip;
	}

	/**
	 * unique id of node where it lives
	 *
	 * API name: {@code id}
	 */
	@Nullable
	public String id() {
		return this.id;
	}

	/**
	 * name of node where it lives
	 *
	 * API name: {@code node}
	 */
	@Nullable
	public String node() {
		return this.node;
	}

	/**
	 * sync id
	 *
	 * API name: {@code sync_id}
	 */
	@Nullable
	public String syncId() {
		return this.syncId;
	}

	/**
	 * reason shard is unassigned
	 *
	 * API name: {@code unassigned.reason}
	 */
	@Nullable
	public String unassigned_reason() {
		return this.unassigned_reason;
	}

	/**
	 * time shard became unassigned (UTC)
	 *
	 * API name: {@code unassigned.at}
	 */
	@Nullable
	public String unassigned_at() {
		return this.unassigned_at;
	}

	/**
	 * time has been unassigned
	 *
	 * API name: {@code unassigned.for}
	 */
	@Nullable
	public String unassigned_for() {
		return this.unassigned_for;
	}

	/**
	 * additional details as to why the shard became unassigned
	 *
	 * API name: {@code unassigned.details}
	 */
	@Nullable
	public String unassigned_details() {
		return this.unassigned_details;
	}

	/**
	 * recovery source type
	 *
	 * API name: {@code recoverysource.type}
	 */
	@Nullable
	public String recoverysource_type() {
		return this.recoverysource_type;
	}

	/**
	 * size of completion
	 *
	 * API name: {@code completion.size}
	 */
	@Nullable
	public String completion_size() {
		return this.completion_size;
	}

	/**
	 * used fielddata cache
	 *
	 * API name: {@code fielddata.memory_size}
	 */
	@Nullable
	public String fielddata_memorySize() {
		return this.fielddata_memorySize;
	}

	/**
	 * fielddata evictions
	 *
	 * API name: {@code fielddata.evictions}
	 */
	@Nullable
	public String fielddata_evictions() {
		return this.fielddata_evictions;
	}

	/**
	 * used query cache
	 *
	 * API name: {@code query_cache.memory_size}
	 */
	@Nullable
	public String queryCache_memorySize() {
		return this.queryCache_memorySize;
	}

	/**
	 * query cache evictions
	 *
	 * API name: {@code query_cache.evictions}
	 */
	@Nullable
	public String queryCache_evictions() {
		return this.queryCache_evictions;
	}

	/**
	 * number of flushes
	 *
	 * API name: {@code flush.total}
	 */
	@Nullable
	public String flush_total() {
		return this.flush_total;
	}

	/**
	 * time spent in flush
	 *
	 * API name: {@code flush.total_time}
	 */
	@Nullable
	public String flush_totalTime() {
		return this.flush_totalTime;
	}

	/**
	 * number of current get ops
	 *
	 * API name: {@code get.current}
	 */
	@Nullable
	public String get_current() {
		return this.get_current;
	}

	/**
	 * time spent in get
	 *
	 * API name: {@code get.time}
	 */
	@Nullable
	public String get_time() {
		return this.get_time;
	}

	/**
	 * number of get ops
	 *
	 * API name: {@code get.total}
	 */
	@Nullable
	public String get_total() {
		return this.get_total;
	}

	/**
	 * time spent in successful gets
	 *
	 * API name: {@code get.exists_time}
	 */
	@Nullable
	public String get_existsTime() {
		return this.get_existsTime;
	}

	/**
	 * number of successful gets
	 *
	 * API name: {@code get.exists_total}
	 */
	@Nullable
	public String get_existsTotal() {
		return this.get_existsTotal;
	}

	/**
	 * time spent in failed gets
	 *
	 * API name: {@code get.missing_time}
	 */
	@Nullable
	public String get_missingTime() {
		return this.get_missingTime;
	}

	/**
	 * number of failed gets
	 *
	 * API name: {@code get.missing_total}
	 */
	@Nullable
	public String get_missingTotal() {
		return this.get_missingTotal;
	}

	/**
	 * number of current deletions
	 *
	 * API name: {@code indexing.delete_current}
	 */
	@Nullable
	public String indexing_deleteCurrent() {
		return this.indexing_deleteCurrent;
	}

	/**
	 * time spent in deletions
	 *
	 * API name: {@code indexing.delete_time}
	 */
	@Nullable
	public String indexing_deleteTime() {
		return this.indexing_deleteTime;
	}

	/**
	 * number of delete ops
	 *
	 * API name: {@code indexing.delete_total}
	 */
	@Nullable
	public String indexing_deleteTotal() {
		return this.indexing_deleteTotal;
	}

	/**
	 * number of current indexing ops
	 *
	 * API name: {@code indexing.index_current}
	 */
	@Nullable
	public String indexing_indexCurrent() {
		return this.indexing_indexCurrent;
	}

	/**
	 * time spent in indexing
	 *
	 * API name: {@code indexing.index_time}
	 */
	@Nullable
	public String indexing_indexTime() {
		return this.indexing_indexTime;
	}

	/**
	 * number of indexing ops
	 *
	 * API name: {@code indexing.index_total}
	 */
	@Nullable
	public String indexing_indexTotal() {
		return this.indexing_indexTotal;
	}

	/**
	 * number of failed indexing ops
	 *
	 * API name: {@code indexing.index_failed}
	 */
	@Nullable
	public String indexing_indexFailed() {
		return this.indexing_indexFailed;
	}

	/**
	 * number of current merges
	 *
	 * API name: {@code merges.current}
	 */
	@Nullable
	public String merges_current() {
		return this.merges_current;
	}

	/**
	 * number of current merging docs
	 *
	 * API name: {@code merges.current_docs}
	 */
	@Nullable
	public String merges_currentDocs() {
		return this.merges_currentDocs;
	}

	/**
	 * size of current merges
	 *
	 * API name: {@code merges.current_size}
	 */
	@Nullable
	public String merges_currentSize() {
		return this.merges_currentSize;
	}

	/**
	 * number of completed merge ops
	 *
	 * API name: {@code merges.total}
	 */
	@Nullable
	public String merges_total() {
		return this.merges_total;
	}

	/**
	 * docs merged
	 *
	 * API name: {@code merges.total_docs}
	 */
	@Nullable
	public String merges_totalDocs() {
		return this.merges_totalDocs;
	}

	/**
	 * size merged
	 *
	 * API name: {@code merges.total_size}
	 */
	@Nullable
	public String merges_totalSize() {
		return this.merges_totalSize;
	}

	/**
	 * time spent in merges
	 *
	 * API name: {@code merges.total_time}
	 */
	@Nullable
	public String merges_totalTime() {
		return this.merges_totalTime;
	}

	/**
	 * total refreshes
	 *
	 * API name: {@code refresh.total}
	 */
	@Nullable
	public String refresh_total() {
		return this.refresh_total;
	}

	/**
	 * time spent in refreshes
	 *
	 * API name: {@code refresh.time}
	 */
	@Nullable
	public String refresh_time() {
		return this.refresh_time;
	}

	/**
	 * total external refreshes
	 *
	 * API name: {@code refresh.external_total}
	 */
	@Nullable
	public String refresh_externalTotal() {
		return this.refresh_externalTotal;
	}

	/**
	 * time spent in external refreshes
	 *
	 * API name: {@code refresh.external_time}
	 */
	@Nullable
	public String refresh_externalTime() {
		return this.refresh_externalTime;
	}

	/**
	 * number of pending refresh listeners
	 *
	 * API name: {@code refresh.listeners}
	 */
	@Nullable
	public String refresh_listeners() {
		return this.refresh_listeners;
	}

	/**
	 * current fetch phase ops
	 *
	 * API name: {@code search.fetch_current}
	 */
	@Nullable
	public String search_fetchCurrent() {
		return this.search_fetchCurrent;
	}

	/**
	 * time spent in fetch phase
	 *
	 * API name: {@code search.fetch_time}
	 */
	@Nullable
	public String search_fetchTime() {
		return this.search_fetchTime;
	}

	/**
	 * total fetch ops
	 *
	 * API name: {@code search.fetch_total}
	 */
	@Nullable
	public String search_fetchTotal() {
		return this.search_fetchTotal;
	}

	/**
	 * open search contexts
	 *
	 * API name: {@code search.open_contexts}
	 */
	@Nullable
	public String search_openContexts() {
		return this.search_openContexts;
	}

	/**
	 * current query phase ops
	 *
	 * API name: {@code search.query_current}
	 */
	@Nullable
	public String search_queryCurrent() {
		return this.search_queryCurrent;
	}

	/**
	 * time spent in query phase
	 *
	 * API name: {@code search.query_time}
	 */
	@Nullable
	public String search_queryTime() {
		return this.search_queryTime;
	}

	/**
	 * total query phase ops
	 *
	 * API name: {@code search.query_total}
	 */
	@Nullable
	public String search_queryTotal() {
		return this.search_queryTotal;
	}

	/**
	 * open scroll contexts
	 *
	 * API name: {@code search.scroll_current}
	 */
	@Nullable
	public String search_scrollCurrent() {
		return this.search_scrollCurrent;
	}

	/**
	 * time scroll contexts held open
	 *
	 * API name: {@code search.scroll_time}
	 */
	@Nullable
	public String search_scrollTime() {
		return this.search_scrollTime;
	}

	/**
	 * completed scroll contexts
	 *
	 * API name: {@code search.scroll_total}
	 */
	@Nullable
	public String search_scrollTotal() {
		return this.search_scrollTotal;
	}

	/**
	 * number of segments
	 *
	 * API name: {@code segments.count}
	 */
	@Nullable
	public String segments_count() {
		return this.segments_count;
	}

	/**
	 * memory used by segments
	 *
	 * API name: {@code segments.memory}
	 */
	@Nullable
	public String segments_memory() {
		return this.segments_memory;
	}

	/**
	 * memory used by index writer
	 *
	 * API name: {@code segments.index_writer_memory}
	 */
	@Nullable
	public String segments_indexWriterMemory() {
		return this.segments_indexWriterMemory;
	}

	/**
	 * memory used by version map
	 *
	 * API name: {@code segments.version_map_memory}
	 */
	@Nullable
	public String segments_versionMapMemory() {
		return this.segments_versionMapMemory;
	}

	/**
	 * memory used by fixed bit sets for nested object field types and export type
	 * filters for types referred in _parent fields
	 *
	 * API name: {@code segments.fixed_bitset_memory}
	 */
	@Nullable
	public String segments_fixedBitsetMemory() {
		return this.segments_fixedBitsetMemory;
	}

	/**
	 * max sequence number
	 *
	 * API name: {@code seq_no.max}
	 */
	@Nullable
	public String seqNo_max() {
		return this.seqNo_max;
	}

	/**
	 * local checkpoint
	 *
	 * API name: {@code seq_no.local_checkpoint}
	 */
	@Nullable
	public String seqNo_localCheckpoint() {
		return this.seqNo_localCheckpoint;
	}

	/**
	 * global checkpoint
	 *
	 * API name: {@code seq_no.global_checkpoint}
	 */
	@Nullable
	public String seqNo_globalCheckpoint() {
		return this.seqNo_globalCheckpoint;
	}

	/**
	 * current warmer ops
	 *
	 * API name: {@code warmer.current}
	 */
	@Nullable
	public String warmer_current() {
		return this.warmer_current;
	}

	/**
	 * total warmer ops
	 *
	 * API name: {@code warmer.total}
	 */
	@Nullable
	public String warmer_total() {
		return this.warmer_total;
	}

	/**
	 * time spent in warmers
	 *
	 * API name: {@code warmer.total_time}
	 */
	@Nullable
	public String warmer_totalTime() {
		return this.warmer_totalTime;
	}

	/**
	 * shard data path
	 *
	 * API name: {@code path.data}
	 */
	@Nullable
	public String path_data() {
		return this.path_data;
	}

	/**
	 * shard state path
	 *
	 * API name: {@code path.state}
	 */
	@Nullable
	public String path_state() {
		return this.path_state;
	}

	/**
	 * number of bulk shard ops
	 *
	 * API name: {@code bulk.total_operations}
	 */
	@Nullable
	public String bulk_totalOperations() {
		return this.bulk_totalOperations;
	}

	/**
	 * time spend in shard bulk
	 *
	 * API name: {@code bulk.total_time}
	 */
	@Nullable
	public String bulk_totalTime() {
		return this.bulk_totalTime;
	}

	/**
	 * total size in bytes of shard bulk
	 *
	 * API name: {@code bulk.total_size_in_bytes}
	 */
	@Nullable
	public String bulk_totalSizeInBytes() {
		return this.bulk_totalSizeInBytes;
	}

	/**
	 * average time spend in shard bulk
	 *
	 * API name: {@code bulk.avg_time}
	 */
	@Nullable
	public String bulk_avgTime() {
		return this.bulk_avgTime;
	}

	/**
	 * avg size in bytes of shard bulk
	 *
	 * API name: {@code bulk.avg_size_in_bytes}
	 */
	@Nullable
	public String bulk_avgSizeInBytes() {
		return this.bulk_avgSizeInBytes;
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

		if (this.index != null) {

			generator.writeKey("index");
			generator.write(this.index);

		}
		if (this.shard != null) {

			generator.writeKey("shard");
			generator.write(this.shard);

		}
		if (this.prirep != null) {

			generator.writeKey("prirep");
			generator.write(this.prirep);

		}
		if (this.state != null) {

			generator.writeKey("state");
			generator.write(this.state);

		}
		if (this.docs != null) {

			generator.writeKey("docs");
			generator.write(this.docs);

		}
		if (this.store != null) {

			generator.writeKey("store");
			generator.write(this.store);

		}
		if (this.ip != null) {

			generator.writeKey("ip");
			generator.write(this.ip);

		}
		if (this.id != null) {

			generator.writeKey("id");
			generator.write(this.id);

		}
		if (this.node != null) {

			generator.writeKey("node");
			generator.write(this.node);

		}
		if (this.syncId != null) {

			generator.writeKey("sync_id");
			generator.write(this.syncId);

		}
		if (this.unassigned_reason != null) {

			generator.writeKey("unassigned.reason");
			generator.write(this.unassigned_reason);

		}
		if (this.unassigned_at != null) {

			generator.writeKey("unassigned.at");
			generator.write(this.unassigned_at);

		}
		if (this.unassigned_for != null) {

			generator.writeKey("unassigned.for");
			generator.write(this.unassigned_for);

		}
		if (this.unassigned_details != null) {

			generator.writeKey("unassigned.details");
			generator.write(this.unassigned_details);

		}
		if (this.recoverysource_type != null) {

			generator.writeKey("recoverysource.type");
			generator.write(this.recoverysource_type);

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
		if (this.seqNo_max != null) {

			generator.writeKey("seq_no.max");
			generator.write(this.seqNo_max);

		}
		if (this.seqNo_localCheckpoint != null) {

			generator.writeKey("seq_no.local_checkpoint");
			generator.write(this.seqNo_localCheckpoint);

		}
		if (this.seqNo_globalCheckpoint != null) {

			generator.writeKey("seq_no.global_checkpoint");
			generator.write(this.seqNo_globalCheckpoint);

		}
		if (this.warmer_current != null) {

			generator.writeKey("warmer.current");
			generator.write(this.warmer_current);

		}
		if (this.warmer_total != null) {

			generator.writeKey("warmer.total");
			generator.write(this.warmer_total);

		}
		if (this.warmer_totalTime != null) {

			generator.writeKey("warmer.total_time");
			generator.write(this.warmer_totalTime);

		}
		if (this.path_data != null) {

			generator.writeKey("path.data");
			generator.write(this.path_data);

		}
		if (this.path_state != null) {

			generator.writeKey("path.state");
			generator.write(this.path_state);

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
	 * Builder for {@link ShardsRecord}.
	 */
	public static class Builder implements ObjectBuilder<ShardsRecord> {
		@Nullable
		private String index;

		@Nullable
		private String shard;

		@Nullable
		private String prirep;

		@Nullable
		private String state;

		@Nullable
		private String docs;

		@Nullable
		private String store;

		@Nullable
		private String ip;

		@Nullable
		private String id;

		@Nullable
		private String node;

		@Nullable
		private String syncId;

		@Nullable
		private String unassigned_reason;

		@Nullable
		private String unassigned_at;

		@Nullable
		private String unassigned_for;

		@Nullable
		private String unassigned_details;

		@Nullable
		private String recoverysource_type;

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
		private String seqNo_max;

		@Nullable
		private String seqNo_localCheckpoint;

		@Nullable
		private String seqNo_globalCheckpoint;

		@Nullable
		private String warmer_current;

		@Nullable
		private String warmer_total;

		@Nullable
		private String warmer_totalTime;

		@Nullable
		private String path_data;

		@Nullable
		private String path_state;

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
		 * index name
		 *
		 * API name: {@code index}
		 */
		public Builder index(@Nullable String value) {
			this.index = value;
			return this;
		}

		/**
		 * shard name
		 *
		 * API name: {@code shard}
		 */
		public Builder shard(@Nullable String value) {
			this.shard = value;
			return this;
		}

		/**
		 * primary or replica
		 *
		 * API name: {@code prirep}
		 */
		public Builder prirep(@Nullable String value) {
			this.prirep = value;
			return this;
		}

		/**
		 * shard state
		 *
		 * API name: {@code state}
		 */
		public Builder state(@Nullable String value) {
			this.state = value;
			return this;
		}

		/**
		 * number of docs in shard
		 *
		 * API name: {@code docs}
		 */
		public Builder docs(@Nullable String value) {
			this.docs = value;
			return this;
		}

		/**
		 * store size of shard (how much disk it uses)
		 *
		 * API name: {@code store}
		 */
		public Builder store(@Nullable String value) {
			this.store = value;
			return this;
		}

		/**
		 * ip of node where it lives
		 *
		 * API name: {@code ip}
		 */
		public Builder ip(@Nullable String value) {
			this.ip = value;
			return this;
		}

		/**
		 * unique id of node where it lives
		 *
		 * API name: {@code id}
		 */
		public Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * name of node where it lives
		 *
		 * API name: {@code node}
		 */
		public Builder node(@Nullable String value) {
			this.node = value;
			return this;
		}

		/**
		 * sync id
		 *
		 * API name: {@code sync_id}
		 */
		public Builder syncId(@Nullable String value) {
			this.syncId = value;
			return this;
		}

		/**
		 * reason shard is unassigned
		 *
		 * API name: {@code unassigned.reason}
		 */
		public Builder unassigned_reason(@Nullable String value) {
			this.unassigned_reason = value;
			return this;
		}

		/**
		 * time shard became unassigned (UTC)
		 *
		 * API name: {@code unassigned.at}
		 */
		public Builder unassigned_at(@Nullable String value) {
			this.unassigned_at = value;
			return this;
		}

		/**
		 * time has been unassigned
		 *
		 * API name: {@code unassigned.for}
		 */
		public Builder unassigned_for(@Nullable String value) {
			this.unassigned_for = value;
			return this;
		}

		/**
		 * additional details as to why the shard became unassigned
		 *
		 * API name: {@code unassigned.details}
		 */
		public Builder unassigned_details(@Nullable String value) {
			this.unassigned_details = value;
			return this;
		}

		/**
		 * recovery source type
		 *
		 * API name: {@code recoverysource.type}
		 */
		public Builder recoverysource_type(@Nullable String value) {
			this.recoverysource_type = value;
			return this;
		}

		/**
		 * size of completion
		 *
		 * API name: {@code completion.size}
		 */
		public Builder completion_size(@Nullable String value) {
			this.completion_size = value;
			return this;
		}

		/**
		 * used fielddata cache
		 *
		 * API name: {@code fielddata.memory_size}
		 */
		public Builder fielddata_memorySize(@Nullable String value) {
			this.fielddata_memorySize = value;
			return this;
		}

		/**
		 * fielddata evictions
		 *
		 * API name: {@code fielddata.evictions}
		 */
		public Builder fielddata_evictions(@Nullable String value) {
			this.fielddata_evictions = value;
			return this;
		}

		/**
		 * used query cache
		 *
		 * API name: {@code query_cache.memory_size}
		 */
		public Builder queryCache_memorySize(@Nullable String value) {
			this.queryCache_memorySize = value;
			return this;
		}

		/**
		 * query cache evictions
		 *
		 * API name: {@code query_cache.evictions}
		 */
		public Builder queryCache_evictions(@Nullable String value) {
			this.queryCache_evictions = value;
			return this;
		}

		/**
		 * number of flushes
		 *
		 * API name: {@code flush.total}
		 */
		public Builder flush_total(@Nullable String value) {
			this.flush_total = value;
			return this;
		}

		/**
		 * time spent in flush
		 *
		 * API name: {@code flush.total_time}
		 */
		public Builder flush_totalTime(@Nullable String value) {
			this.flush_totalTime = value;
			return this;
		}

		/**
		 * number of current get ops
		 *
		 * API name: {@code get.current}
		 */
		public Builder get_current(@Nullable String value) {
			this.get_current = value;
			return this;
		}

		/**
		 * time spent in get
		 *
		 * API name: {@code get.time}
		 */
		public Builder get_time(@Nullable String value) {
			this.get_time = value;
			return this;
		}

		/**
		 * number of get ops
		 *
		 * API name: {@code get.total}
		 */
		public Builder get_total(@Nullable String value) {
			this.get_total = value;
			return this;
		}

		/**
		 * time spent in successful gets
		 *
		 * API name: {@code get.exists_time}
		 */
		public Builder get_existsTime(@Nullable String value) {
			this.get_existsTime = value;
			return this;
		}

		/**
		 * number of successful gets
		 *
		 * API name: {@code get.exists_total}
		 */
		public Builder get_existsTotal(@Nullable String value) {
			this.get_existsTotal = value;
			return this;
		}

		/**
		 * time spent in failed gets
		 *
		 * API name: {@code get.missing_time}
		 */
		public Builder get_missingTime(@Nullable String value) {
			this.get_missingTime = value;
			return this;
		}

		/**
		 * number of failed gets
		 *
		 * API name: {@code get.missing_total}
		 */
		public Builder get_missingTotal(@Nullable String value) {
			this.get_missingTotal = value;
			return this;
		}

		/**
		 * number of current deletions
		 *
		 * API name: {@code indexing.delete_current}
		 */
		public Builder indexing_deleteCurrent(@Nullable String value) {
			this.indexing_deleteCurrent = value;
			return this;
		}

		/**
		 * time spent in deletions
		 *
		 * API name: {@code indexing.delete_time}
		 */
		public Builder indexing_deleteTime(@Nullable String value) {
			this.indexing_deleteTime = value;
			return this;
		}

		/**
		 * number of delete ops
		 *
		 * API name: {@code indexing.delete_total}
		 */
		public Builder indexing_deleteTotal(@Nullable String value) {
			this.indexing_deleteTotal = value;
			return this;
		}

		/**
		 * number of current indexing ops
		 *
		 * API name: {@code indexing.index_current}
		 */
		public Builder indexing_indexCurrent(@Nullable String value) {
			this.indexing_indexCurrent = value;
			return this;
		}

		/**
		 * time spent in indexing
		 *
		 * API name: {@code indexing.index_time}
		 */
		public Builder indexing_indexTime(@Nullable String value) {
			this.indexing_indexTime = value;
			return this;
		}

		/**
		 * number of indexing ops
		 *
		 * API name: {@code indexing.index_total}
		 */
		public Builder indexing_indexTotal(@Nullable String value) {
			this.indexing_indexTotal = value;
			return this;
		}

		/**
		 * number of failed indexing ops
		 *
		 * API name: {@code indexing.index_failed}
		 */
		public Builder indexing_indexFailed(@Nullable String value) {
			this.indexing_indexFailed = value;
			return this;
		}

		/**
		 * number of current merges
		 *
		 * API name: {@code merges.current}
		 */
		public Builder merges_current(@Nullable String value) {
			this.merges_current = value;
			return this;
		}

		/**
		 * number of current merging docs
		 *
		 * API name: {@code merges.current_docs}
		 */
		public Builder merges_currentDocs(@Nullable String value) {
			this.merges_currentDocs = value;
			return this;
		}

		/**
		 * size of current merges
		 *
		 * API name: {@code merges.current_size}
		 */
		public Builder merges_currentSize(@Nullable String value) {
			this.merges_currentSize = value;
			return this;
		}

		/**
		 * number of completed merge ops
		 *
		 * API name: {@code merges.total}
		 */
		public Builder merges_total(@Nullable String value) {
			this.merges_total = value;
			return this;
		}

		/**
		 * docs merged
		 *
		 * API name: {@code merges.total_docs}
		 */
		public Builder merges_totalDocs(@Nullable String value) {
			this.merges_totalDocs = value;
			return this;
		}

		/**
		 * size merged
		 *
		 * API name: {@code merges.total_size}
		 */
		public Builder merges_totalSize(@Nullable String value) {
			this.merges_totalSize = value;
			return this;
		}

		/**
		 * time spent in merges
		 *
		 * API name: {@code merges.total_time}
		 */
		public Builder merges_totalTime(@Nullable String value) {
			this.merges_totalTime = value;
			return this;
		}

		/**
		 * total refreshes
		 *
		 * API name: {@code refresh.total}
		 */
		public Builder refresh_total(@Nullable String value) {
			this.refresh_total = value;
			return this;
		}

		/**
		 * time spent in refreshes
		 *
		 * API name: {@code refresh.time}
		 */
		public Builder refresh_time(@Nullable String value) {
			this.refresh_time = value;
			return this;
		}

		/**
		 * total external refreshes
		 *
		 * API name: {@code refresh.external_total}
		 */
		public Builder refresh_externalTotal(@Nullable String value) {
			this.refresh_externalTotal = value;
			return this;
		}

		/**
		 * time spent in external refreshes
		 *
		 * API name: {@code refresh.external_time}
		 */
		public Builder refresh_externalTime(@Nullable String value) {
			this.refresh_externalTime = value;
			return this;
		}

		/**
		 * number of pending refresh listeners
		 *
		 * API name: {@code refresh.listeners}
		 */
		public Builder refresh_listeners(@Nullable String value) {
			this.refresh_listeners = value;
			return this;
		}

		/**
		 * current fetch phase ops
		 *
		 * API name: {@code search.fetch_current}
		 */
		public Builder search_fetchCurrent(@Nullable String value) {
			this.search_fetchCurrent = value;
			return this;
		}

		/**
		 * time spent in fetch phase
		 *
		 * API name: {@code search.fetch_time}
		 */
		public Builder search_fetchTime(@Nullable String value) {
			this.search_fetchTime = value;
			return this;
		}

		/**
		 * total fetch ops
		 *
		 * API name: {@code search.fetch_total}
		 */
		public Builder search_fetchTotal(@Nullable String value) {
			this.search_fetchTotal = value;
			return this;
		}

		/**
		 * open search contexts
		 *
		 * API name: {@code search.open_contexts}
		 */
		public Builder search_openContexts(@Nullable String value) {
			this.search_openContexts = value;
			return this;
		}

		/**
		 * current query phase ops
		 *
		 * API name: {@code search.query_current}
		 */
		public Builder search_queryCurrent(@Nullable String value) {
			this.search_queryCurrent = value;
			return this;
		}

		/**
		 * time spent in query phase
		 *
		 * API name: {@code search.query_time}
		 */
		public Builder search_queryTime(@Nullable String value) {
			this.search_queryTime = value;
			return this;
		}

		/**
		 * total query phase ops
		 *
		 * API name: {@code search.query_total}
		 */
		public Builder search_queryTotal(@Nullable String value) {
			this.search_queryTotal = value;
			return this;
		}

		/**
		 * open scroll contexts
		 *
		 * API name: {@code search.scroll_current}
		 */
		public Builder search_scrollCurrent(@Nullable String value) {
			this.search_scrollCurrent = value;
			return this;
		}

		/**
		 * time scroll contexts held open
		 *
		 * API name: {@code search.scroll_time}
		 */
		public Builder search_scrollTime(@Nullable String value) {
			this.search_scrollTime = value;
			return this;
		}

		/**
		 * completed scroll contexts
		 *
		 * API name: {@code search.scroll_total}
		 */
		public Builder search_scrollTotal(@Nullable String value) {
			this.search_scrollTotal = value;
			return this;
		}

		/**
		 * number of segments
		 *
		 * API name: {@code segments.count}
		 */
		public Builder segments_count(@Nullable String value) {
			this.segments_count = value;
			return this;
		}

		/**
		 * memory used by segments
		 *
		 * API name: {@code segments.memory}
		 */
		public Builder segments_memory(@Nullable String value) {
			this.segments_memory = value;
			return this;
		}

		/**
		 * memory used by index writer
		 *
		 * API name: {@code segments.index_writer_memory}
		 */
		public Builder segments_indexWriterMemory(@Nullable String value) {
			this.segments_indexWriterMemory = value;
			return this;
		}

		/**
		 * memory used by version map
		 *
		 * API name: {@code segments.version_map_memory}
		 */
		public Builder segments_versionMapMemory(@Nullable String value) {
			this.segments_versionMapMemory = value;
			return this;
		}

		/**
		 * memory used by fixed bit sets for nested object field types and export type
		 * filters for types referred in _parent fields
		 *
		 * API name: {@code segments.fixed_bitset_memory}
		 */
		public Builder segments_fixedBitsetMemory(@Nullable String value) {
			this.segments_fixedBitsetMemory = value;
			return this;
		}

		/**
		 * max sequence number
		 *
		 * API name: {@code seq_no.max}
		 */
		public Builder seqNo_max(@Nullable String value) {
			this.seqNo_max = value;
			return this;
		}

		/**
		 * local checkpoint
		 *
		 * API name: {@code seq_no.local_checkpoint}
		 */
		public Builder seqNo_localCheckpoint(@Nullable String value) {
			this.seqNo_localCheckpoint = value;
			return this;
		}

		/**
		 * global checkpoint
		 *
		 * API name: {@code seq_no.global_checkpoint}
		 */
		public Builder seqNo_globalCheckpoint(@Nullable String value) {
			this.seqNo_globalCheckpoint = value;
			return this;
		}

		/**
		 * current warmer ops
		 *
		 * API name: {@code warmer.current}
		 */
		public Builder warmer_current(@Nullable String value) {
			this.warmer_current = value;
			return this;
		}

		/**
		 * total warmer ops
		 *
		 * API name: {@code warmer.total}
		 */
		public Builder warmer_total(@Nullable String value) {
			this.warmer_total = value;
			return this;
		}

		/**
		 * time spent in warmers
		 *
		 * API name: {@code warmer.total_time}
		 */
		public Builder warmer_totalTime(@Nullable String value) {
			this.warmer_totalTime = value;
			return this;
		}

		/**
		 * shard data path
		 *
		 * API name: {@code path.data}
		 */
		public Builder path_data(@Nullable String value) {
			this.path_data = value;
			return this;
		}

		/**
		 * shard state path
		 *
		 * API name: {@code path.state}
		 */
		public Builder path_state(@Nullable String value) {
			this.path_state = value;
			return this;
		}

		/**
		 * number of bulk shard ops
		 *
		 * API name: {@code bulk.total_operations}
		 */
		public Builder bulk_totalOperations(@Nullable String value) {
			this.bulk_totalOperations = value;
			return this;
		}

		/**
		 * time spend in shard bulk
		 *
		 * API name: {@code bulk.total_time}
		 */
		public Builder bulk_totalTime(@Nullable String value) {
			this.bulk_totalTime = value;
			return this;
		}

		/**
		 * total size in bytes of shard bulk
		 *
		 * API name: {@code bulk.total_size_in_bytes}
		 */
		public Builder bulk_totalSizeInBytes(@Nullable String value) {
			this.bulk_totalSizeInBytes = value;
			return this;
		}

		/**
		 * average time spend in shard bulk
		 *
		 * API name: {@code bulk.avg_time}
		 */
		public Builder bulk_avgTime(@Nullable String value) {
			this.bulk_avgTime = value;
			return this;
		}

		/**
		 * avg size in bytes of shard bulk
		 *
		 * API name: {@code bulk.avg_size_in_bytes}
		 */
		public Builder bulk_avgSizeInBytes(@Nullable String value) {
			this.bulk_avgSizeInBytes = value;
			return this;
		}

		/**
		 * Builds a {@link ShardsRecord}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardsRecord build() {

			return new ShardsRecord(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ShardsRecord
	 */
	public static final JsonpDeserializer<ShardsRecord> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ShardsRecord::setupShardsRecordDeserializer);

	protected static void setupShardsRecordDeserializer(DelegatingDeserializer<ShardsRecord.Builder> op) {

		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index", "i", "idx");
		op.add(Builder::shard, JsonpDeserializer.stringDeserializer(), "shard", "s", "sh");
		op.add(Builder::prirep, JsonpDeserializer.stringDeserializer(), "prirep", "p", "pr", "primaryOrReplica");
		op.add(Builder::state, JsonpDeserializer.stringDeserializer(), "state", "st");
		op.add(Builder::docs, JsonpDeserializer.stringDeserializer(), "docs", "d", "dc");
		op.add(Builder::store, JsonpDeserializer.stringDeserializer(), "store", "sto");
		op.add(Builder::ip, JsonpDeserializer.stringDeserializer(), "ip");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::node, JsonpDeserializer.stringDeserializer(), "node", "n");
		op.add(Builder::syncId, JsonpDeserializer.stringDeserializer(), "sync_id");
		op.add(Builder::unassigned_reason, JsonpDeserializer.stringDeserializer(), "unassigned.reason", "ur");
		op.add(Builder::unassigned_at, JsonpDeserializer.stringDeserializer(), "unassigned.at", "ua");
		op.add(Builder::unassigned_for, JsonpDeserializer.stringDeserializer(), "unassigned.for", "uf");
		op.add(Builder::unassigned_details, JsonpDeserializer.stringDeserializer(), "unassigned.details", "ud");
		op.add(Builder::recoverysource_type, JsonpDeserializer.stringDeserializer(), "recoverysource.type", "rs");
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
		op.add(Builder::seqNo_max, JsonpDeserializer.stringDeserializer(), "seq_no.max", "sqm", "maxSeqNo");
		op.add(Builder::seqNo_localCheckpoint, JsonpDeserializer.stringDeserializer(), "seq_no.local_checkpoint", "sql",
				"localCheckpoint");
		op.add(Builder::seqNo_globalCheckpoint, JsonpDeserializer.stringDeserializer(), "seq_no.global_checkpoint",
				"sqg", "globalCheckpoint");
		op.add(Builder::warmer_current, JsonpDeserializer.stringDeserializer(), "warmer.current", "wc",
				"warmerCurrent");
		op.add(Builder::warmer_total, JsonpDeserializer.stringDeserializer(), "warmer.total", "wto", "warmerTotal");
		op.add(Builder::warmer_totalTime, JsonpDeserializer.stringDeserializer(), "warmer.total_time", "wtt",
				"warmerTotalTime");
		op.add(Builder::path_data, JsonpDeserializer.stringDeserializer(), "path.data", "pd", "dataPath");
		op.add(Builder::path_state, JsonpDeserializer.stringDeserializer(), "path.state", "ps", "statsPath");
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
