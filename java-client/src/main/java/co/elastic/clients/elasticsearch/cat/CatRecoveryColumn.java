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
 * @see <a href="../doc-files/api-spec.html#cat._types.CatRecoveryColumn">API
 *      specification</a>
 */
@JsonpDeserializable
public enum CatRecoveryColumn implements JsonEnum {
	/**
	 * The name of the index.
	 */
	Index("index", "i", "idx"),

	/**
	 * The name of the shard.
	 */
	Shard("shard", "s", "sh"),

	/**
	 * The recovery time elasped.
	 */
	Time("time", "t", "ti", "primaryOrReplica"),

	/**
	 * The type of recovery, from a peer or a snapshot.
	 */
	Type("type"),

	/**
	 * The stage of the recovery. Returned values are: <code>INIT</code>,
	 * <code>INDEX</code>: recovery of lucene files, either reusing local ones are
	 * copying new ones, <code>VERIFY_INDEX</code>: potentially running check index,
	 * <code>TRANSLOG</code>: starting up the engine, replaying the translog,
	 * <code>FINALIZE</code>: performing final task after all translog ops have been
	 * done, <code>DONE</code>
	 */
	Stage("stage", "st"),

	/**
	 * The host address the index is moving from.
	 */
	SourceHost("source_host", "shost"),

	/**
	 * The node name the index is moving from.
	 */
	SourceNode("source_node", "snode"),

	/**
	 * The host address the index is moving to.
	 */
	TargetHost("target_host", "thost"),

	/**
	 * The node name the index is moving to.
	 */
	TargetNode("target_node", "tnode"),

	/**
	 * The name of the repository being used. if not relevant 'n/a'.
	 */
	Repository("repository", "tnode"),

	/**
	 * The name of the snapshot being used. if not relevant 'n/a'.
	 */
	Snapshot("snapshot", "snap"),

	/**
	 * The total number of files to recover.
	 */
	Files("files", "f"),

	/**
	 * The number of files currently recovered.
	 */
	FilesRecovered("files_recovered", "fr"),

	/**
	 * The percentage of files currently recovered.
	 */
	FilesPercent("files_percent", "fp"),

	/**
	 * The total number of files.
	 */
	FilesTotal("files_total", "tf"),

	/**
	 * The total number of bytes to recover.
	 */
	Bytes("bytes", "b"),

	/**
	 * Total number of bytes currently recovered.
	 */
	BytesRecovered("bytes_recovered", "br"),

	/**
	 * The percentage of bytes currently recovered.
	 */
	BytesPercent("bytes_percent", "bp"),

	/**
	 * The total number of bytes.
	 */
	BytesTotal("bytes_total", "tb"),

	/**
	 * The total number of translog ops to recover.
	 */
	TranslogOps("translog_ops", "to"),

	/**
	 * The total number of translog ops currently recovered.
	 */
	TranslogOpsRecovered("translog_ops_recovered", "tor"),

	/**
	 * The percentage of translog ops currently recovered.
	 */
	TranslogOpsPercent("translog_ops_percent", "top"),

	/**
	 * The start time of the recovery operation.
	 */
	StartTime("start_time", "start"),

	/**
	 * The start time of the recovery operation in eopch milliseconds.
	 */
	StartTimeMillis("start_time_millis", "start_millis"),

	/**
	 * The end time of the recovery operation. If ongoing '1970-01-01T00:00:00.000Z'
	 */
	StopTime("stop_time", "stop"),

	/**
	 * The end time of the recovery operation in eopch milliseconds. If ongoing '0'
	 */
	StopTimeMillis("stop_time_millis", "stop_millis"),

	;

	private final String jsonValue;
	private final String[] aliases;

	CatRecoveryColumn(String jsonValue, String... aliases) {
		this.jsonValue = jsonValue;
		this.aliases = aliases;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	public String[] aliases() {
		return this.aliases;
	}

	public static final JsonEnum.Deserializer<CatRecoveryColumn> _DESERIALIZER = new JsonEnum.Deserializer<>(
			CatRecoveryColumn.values());
}
