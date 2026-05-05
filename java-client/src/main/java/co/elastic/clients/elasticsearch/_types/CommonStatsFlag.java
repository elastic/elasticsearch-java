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

package co.elastic.clients.elasticsearch._types;

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
 * @see <a href="../doc-files/api-spec.html#_types.CommonStatsFlag">API
 *      specification</a>
 */
@JsonpDeserializable
public enum CommonStatsFlag implements JsonEnum {
	/**
	 * Return all statistics.
	 */
	All("_all"),

	/**
	 * Size of the index in byte units.
	 */
	Store("store"),

	/**
	 * Indexing statistics.
	 */
	Indexing("indexing"),

	/**
	 * Get statistics, including missing stats.
	 */
	Get("get"),

	/**
	 * Search statistics including suggest statistics. You can include statistics
	 * for custom groups by adding an extra <code>groups</code> parameter (search
	 * operations can be associated with one or more groups). The
	 * <code>groups</code> parameter accepts a comma-separated list of group names.
	 * Use <code>_all</code> to return statistics for all groups.
	 */
	Search("search"),

	/**
	 * Merge statistics.
	 */
	Merge("merge"),

	/**
	 * Flush statistics.
	 */
	Flush("flush"),

	/**
	 * Refresh statistics.
	 */
	Refresh("refresh"),

	/**
	 * Query cache statistics.
	 */
	QueryCache("query_cache"),

	/**
	 * Fielddata statistics.
	 */
	Fielddata("fielddata"),

	/**
	 * Number of documents and deleted docs not yet merged out. Index refreshes can
	 * affect this statistic.
	 */
	Docs("docs"),

	/**
	 * Index warming statistics.
	 */
	Warmer("warmer"),

	/**
	 * Completion suggester statistics.
	 */
	Completion("completion"),

	/**
	 * Memory use of all open segments. If the
	 * <code>include_segment_file_sizes</code> parameter is <code>true</code>, this
	 * metric includes the aggregated disk usage of each Lucene index file.
	 */
	Segments("segments"),

	/**
	 * Translog statistics.
	 */
	Translog("translog"),

	/**
	 * Shard request cache statistics.
	 */
	RequestCache("request_cache"),

	/**
	 * Recovery statistics.
	 */
	Recovery("recovery"),

	/**
	 * Bulk operations statistics.
	 */
	Bulk("bulk"),

	/**
	 * Shard statistics, including the total number of shards.
	 */
	ShardStats("shard_stats"),

	/**
	 * Mapping statistics, including the total count and estimated overhead.
	 */
	Mappings("mappings"),

	/**
	 * Total number of dense vectors indexed. Index refreshes can affect this
	 * statistic.
	 */
	DenseVector("dense_vector"),

	/**
	 * Total number of sparse vectors indexed. Index refreshes can affect this
	 * statistic.
	 */
	SparseVector("sparse_vector"),

	;

	private final String jsonValue;

	CommonStatsFlag(String jsonValue) {
		this.jsonValue = jsonValue;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	public static final JsonEnum.Deserializer<CommonStatsFlag> _DESERIALIZER = new JsonEnum.Deserializer<>(
			CommonStatsFlag.values());
}
