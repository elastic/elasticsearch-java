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

package co.elastic.clients.elasticsearch.snapshot;

import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/04a9498/specification/snapshot/_types/SnapshotShardsStatsStage.ts#L20-L34">API
 *      specification</a>
 */
@JsonpDeserializable
public enum ShardsStatsStage implements JsonEnum {
	/**
	 * Number of shards in the snapshot that were successfully stored in the
	 * repository.
	 */
	Done("DONE"),

	/**
	 * Number of shards in the snapshot that were not successfully stored in the
	 * repository.
	 */
	Failure("FAILURE"),

	/**
	 * Number of shards in the snapshot that are in the finalizing stage of being
	 * stored in the repository.
	 */
	Finalize("FINALIZE"),

	/**
	 * Number of shards in the snapshot that are in the initializing stage of being
	 * stored in the repository.
	 */
	Init("INIT"),

	/**
	 * Number of shards in the snapshot that are in the started stage of being
	 * stored in the repository.
	 */
	Started("STARTED"),

	;

	private final String jsonValue;

	ShardsStatsStage(String jsonValue) {
		this.jsonValue = jsonValue;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	public static final JsonEnum.Deserializer<ShardsStatsStage> _DESERIALIZER = new JsonEnum.Deserializer<>(
			ShardsStatsStage.values());
}
