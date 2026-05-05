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
	 * The index name.
	 */
	Index("index", "i", "idx"),

	/**
	 * The shard name.
	 */
	Shard("shard", "s", "sh"),

	/**
	 * The recovery start time.
	 */
	StartTime("start_time", "start"),

	/**
	 * The recovery start time in epoch milliseconds.
	 */
	StartTimeMillis("start_time_millis", "start_millis"),

	/**
	 * The recovery stop time.
	 */
	StopTime("stop_time", "stop"),

	/**
	 * The recovery stop time in epoch milliseconds.
	 */
	StopTimeMillis("stop_time_millis", "stop_millis"),

	/**
	 * The recovery time.
	 */
	Time("time", "t", "ti"),

	/**
	 * The recovery type.
	 */
	Type("type", "ty"),

	/**
	 * The recovery stage.
	 */
	Stage("stage", "st"),

	/**
	 * The source host.
	 */
	SourceHost("source_host", "shost"),

	/**
	 * The source node name.
	 */
	SourceNode("source_node", "snode"),

	/**
	 * The target host.
	 */
	TargetHost("target_host", "thost"),

	/**
	 * The target node name.
	 */
	TargetNode("target_node", "tnode"),

	/**
	 * The repository.
	 */
	Repository("repository", "rep"),

	/**
	 * The snapshot.
	 */
	Snapshot("snapshot", "snap"),

	/**
	 * The number of files to recover.
	 */
	Files("files", "f"),

	/**
	 * The files recovered.
	 */
	FilesRecovered("files_recovered", "fr"),

	/**
	 * The percent of files recovered.
	 */
	FilesPercent("files_percent", "fp"),

	/**
	 * The total number of files.
	 */
	FilesTotal("files_total", "tf"),

	/**
	 * The number of bytes to recover.
	 */
	Bytes("bytes", "b"),

	/**
	 * The bytes recovered.
	 */
	BytesRecovered("bytes_recovered", "br"),

	/**
	 * The percent of bytes recovered.
	 */
	BytesPercent("bytes_percent", "bp"),

	/**
	 * The total number of bytes.
	 */
	BytesTotal("bytes_total", "tb"),

	/**
	 * The number of translog ops to recover.
	 */
	TranslogOps("translog_ops", "to"),

	/**
	 * The translog ops recovered.
	 */
	TranslogOpsRecovered("translog_ops_recovered", "tor"),

	/**
	 * The percent of translog ops recovered.
	 */
	TranslogOpsPercent("translog_ops_percent", "top"),

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
