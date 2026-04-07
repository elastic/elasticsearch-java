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

package co.elastic.clients.elasticsearch.indices.recovery;

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
 * @see <a href=
 *      "../../doc-files/api-spec.html#indices.recovery.RecoveryType">API
 *      specification</a>
 */
@JsonpDeserializable
public enum RecoveryType implements JsonEnum {
	/**
	 * An empty store. Indicates a new primary shard or the forced allocation of an
	 * empty primary shard using the cluster reroute API.
	 */
	EmptyStore("EMPTY_STORE"),

	/**
	 * The store of an existing primary shard. Indicates recovery is related to node
	 * startup or the allocation of an existing primary shard.
	 */
	ExistingStore("EXISTING_STORE"),

	/**
	 * Shards of another index on the same node. Indicates recovery is related to a
	 * clone, shrink, or split operation.
	 */
	LocalShards("LOCAL_SHARDS"),

	/**
	 * A primary shard on another node. Indicates recovery is related to shard
	 * replication.
	 */
	Peer("PEER"),

	/**
	 * A snapshot. Indicates recovery is related to a snapshot restore operation.
	 */
	Snapshot("SNAPSHOT"),

	;

	private final String jsonValue;

	RecoveryType(String jsonValue) {
		this.jsonValue = jsonValue;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	public static final JsonEnum.Deserializer<RecoveryType> _DESERIALIZER = new JsonEnum.Deserializer<>(
			RecoveryType.values());
}
