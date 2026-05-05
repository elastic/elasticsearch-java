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
 * @see <a href="../doc-files/api-spec.html#cat._types.CatHealthColumn">API
 *      specification</a>
 */
@JsonpDeserializable
public enum CatHealthColumn implements JsonEnum {
	/**
	 * The number of seconds since 1970-01-01 00:00:00.
	 */
	Epoch("epoch", "t", "time"),

	/**
	 * The time in HH:MM:SS format.
	 */
	Timestamp("timestamp", "ts", "hms", "hhmmss"),

	/**
	 * The cluster name.
	 */
	Cluster("cluster", "cl"),

	/**
	 * The health status.
	 */
	Status("status", "st"),

	/**
	 * The total number of nodes that can store data.
	 */
	NodeTotal("node.total", "nt", "nodeTotal"),

	/**
	 * The number of nodes that can store data.
	 */
	NodeData("node.data", "nd", "nodeData"),

	/**
	 * The total number of shards.
	 */
	Shards("shards", "t", "sh", "shards.total", "shardsTotal"),

	/**
	 * The number of primary shards.
	 */
	Pri("pri", "p", "shards.primary", "shardsPrimary"),

	/**
	 * The number of relocating nodes.
	 */
	Relo("relo", "r", "shards.relocating", "shardsRelocating"),

	/**
	 * The number of initializing nodes.
	 */
	Init("init", "i", "shards.initializing", "shardsInitializing"),

	/**
	 * The number of unassigned shards.
	 */
	Unassign("unassign", "u", "shards.unassigned", "shardsUnassigned"),

	/**
	 * The number of unassigned primary shards.
	 */
	UnassignPri("unassign.pri", "up", "shards.unassigned.primary", "shardsUnassignedPrimary"),

	/**
	 * The number of pending tasks.
	 */
	PendingTasks("pending_tasks", "pt", "pendingTasks"),

	/**
	 * The wait time of the longest pending task.
	 */
	MaxTaskWaitTime("max_task_wait_time", "mtwt", "maxTaskWaitTime"),

	/**
	 * The percentage of active shards.
	 */
	ActiveShardsPercent("active_shards_percent", "asp", "activeShardsPercent"),

	;

	private final String jsonValue;
	private final String[] aliases;

	CatHealthColumn(String jsonValue, String... aliases) {
		this.jsonValue = jsonValue;
		this.aliases = aliases;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	public String[] aliases() {
		return this.aliases;
	}

	public static final JsonEnum.Deserializer<CatHealthColumn> _DESERIALIZER = new JsonEnum.Deserializer<>(
			CatHealthColumn.values());
}
