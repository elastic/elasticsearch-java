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

package co.elastic.clients.elasticsearch.cat;

import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;

/**
 *
 * @see <a href="../doc-files/api-spec.html#cat._types.CatTransformColumn">API
 *      specification</a>
 */
@JsonpDeserializable
public enum CatTransformColumn implements JsonEnum {
	/**
	 * The timestamp when changes were last detected in the source indices.
	 */
	ChangesLastDetectionTime("changes_last_detection_time", "cldt"),

	/**
	 * The sequence number for the checkpoint.
	 */
	Checkpoint("checkpoint", "cp"),

	/**
	 * Exponential moving average of the duration of the checkpoint, in
	 * milliseconds.
	 */
	CheckpointDurationTimeExpAvg("checkpoint_duration_time_exp_avg", "cdtea", "checkpointTimeExpAvg"),

	/**
	 * The progress of the next checkpoint that is currently in progress.
	 */
	CheckpointProgress("checkpoint_progress", "c", "checkpointProgress"),

	/**
	 * The time the transform was created.
	 */
	CreateTime("create_time", "ct", "createTime"),

	/**
	 * The amount of time spent deleting, in milliseconds.
	 */
	DeleteTime("delete_time", "dtime"),

	/**
	 * The description of the transform.
	 */
	Description("description", "d"),

	/**
	 * The destination index for the transform. The mappings of the destination
	 * index are deduced based on the source fields when possible. If alternate
	 * mappings are required, use the Create index API prior to starting the
	 * transform.
	 */
	DestIndex("dest_index", "di", "destIndex"),

	/**
	 * The number of documents that have been deleted from the destination index due
	 * to the retention policy for this transform.
	 */
	DocumentsDeleted("documents_deleted", "docd"),

	/**
	 * The number of documents that have been indexed into the destination index for
	 * the transform.
	 */
	DocumentsIndexed("documents_indexed", "doci"),

	/**
	 * Specifies a limit on the number of input documents per second. This setting
	 * throttles the transform by adding a wait time between search requests. The
	 * default value is <code>null</code>, which disables throttling.
	 */
	DocsPerSecond("docs_per_second", "dps"),

	/**
	 * The number of documents that have been processed from the source index of the
	 * transform.
	 */
	DocumentsProcessed("documents_processed", "docp"),

	/**
	 * The interval between checks for changes in the source indices when the
	 * transform is running continuously. Also determines the retry interval in the
	 * event of transient failures while the transform is searching or indexing. The
	 * minimum value is <code>1s</code> and the maximum is <code>1h</code>. The
	 * default value is <code>1m</code>.
	 */
	Frequency("frequency", "f"),

	/**
	 * Identifier for the transform.
	 */
	Id("id"),

	/**
	 * The number of indexing failures.
	 */
	IndexFailure("index_failure", "if"),

	/**
	 * The amount of time spent indexing, in milliseconds.
	 */
	IndexTime("index_time", "itime"),

	/**
	 * The number of index operations.
	 */
	IndexTotal("index_total", "it"),

	/**
	 * Exponential moving average of the number of new documents that have been
	 * indexed.
	 */
	IndexedDocumentsExpAvg("indexed_documents_exp_avg", "idea"),

	/**
	 * The timestamp of the last search in the source indices. This field is only
	 * shown if the transform is running.
	 */
	LastSearchTime("last_search_time", "lst", "lastSearchTime"),

	/**
	 * Defines the initial page size to use for the composite aggregation for each
	 * checkpoint. If circuit breaker exceptions occur, the page size is dynamically
	 * adjusted to a lower value. The minimum value is <code>10</code> and the
	 * maximum is <code>65,536</code>. The default value is <code>500</code>.
	 */
	MaxPageSearchSize("max_page_search_size", "mpsz"),

	/**
	 * The number of search or bulk index operations processed. Documents are
	 * processed in batches instead of individually.
	 */
	PagesProcessed("pages_processed", "pp"),

	/**
	 * The unique identifier for an ingest pipeline.
	 */
	Pipeline("pipeline", "p"),

	/**
	 * Exponential moving average of the number of documents that have been
	 * processed.
	 */
	ProcessedDocumentsExpAvg("processed_documents_exp_avg", "pdea"),

	/**
	 * The amount of time spent processing results, in milliseconds.
	 */
	ProcessingTime("processing_time", "pt"),

	/**
	 * If a transform has a <code>failed</code> state, this property provides
	 * details about the reason for the failure.
	 */
	Reason("reason", "r"),

	/**
	 * The number of search failures.
	 */
	SearchFailure("search_failure", "sf"),

	/**
	 * The amount of time spent searching, in milliseconds.
	 */
	SearchTime("search_time", "stime"),

	/**
	 * The number of search operations on the source index for the transform.
	 */
	SearchTotal("search_total", "st"),

	/**
	 * The source indices for the transform. It can be a single index, an index
	 * pattern (for example, <code>&quot;my-index-*&quot;</code>), an array of
	 * indices (for example,
	 * <code>[&quot;my-index-000001&quot;, &quot;my-index-000002&quot;]</code>), or
	 * an array of index patterns (for example,
	 * <code>[&quot;my-index-*&quot;, &quot;my-other-index-*&quot;]</code>. For
	 * remote indices use the syntax
	 * <code>&quot;remote_name:index_name&quot;</code>. If any indices are in remote
	 * clusters then the master node and at least one transform node must have the
	 * <code>remote_cluster_client</code> node role.
	 */
	SourceIndex("source_index", "si", "sourceIndex"),

	/**
	 * The status of the transform, which can be one of the following values:
	 * <ul>
	 * <li><code>aborting</code>: The transform is aborting.</li>
	 * <li><code>failed</code>: The transform failed. For more information about the
	 * failure, check the reason field.</li>
	 * <li><code>indexing</code>: The transform is actively processing data and
	 * creating new documents.</li>
	 * <li><code>started</code>: The transform is running but not actively indexing
	 * data.</li>
	 * <li><code>stopped</code>: The transform is stopped.</li>
	 * <li><code>stopping</code>: The transform is stopping.</li>
	 * </ul>
	 */
	State("state", "s"),

	/**
	 * Indicates the type of transform: <code>batch</code> or
	 * <code>continuous</code>.
	 */
	TransformType("transform_type", "tt"),

	/**
	 * The number of times the transform has been triggered by the scheduler. For
	 * example, the scheduler triggers the transform indexer to check for updates or
	 * ingest new data at an interval specified in the <code>frequency</code>
	 * property.
	 */
	TriggerCount("trigger_count", "tc"),

	/**
	 * The version of Elasticsearch that existed on the node when the transform was
	 * created.
	 */
	Version("version", "v"),

	;

	private final String jsonValue;
	private final String[] aliases;

	CatTransformColumn(String jsonValue, String... aliases) {
		this.jsonValue = jsonValue;
		this.aliases = aliases;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	public String[] aliases() {
		return this.aliases;
	}

	public static final JsonEnum.Deserializer<CatTransformColumn> _DESERIALIZER = new JsonEnum.Deserializer<>(
			CatTransformColumn.values());
}
