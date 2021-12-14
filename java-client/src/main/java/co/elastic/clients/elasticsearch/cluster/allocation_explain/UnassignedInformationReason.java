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

package co.elastic.clients.elasticsearch.cluster.allocation_explain;

import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/04a9498/specification/cluster/allocation_explain/types.ts#L127-L146">API
 *      specification</a>
 */
@JsonpDeserializable
public enum UnassignedInformationReason implements JsonEnum {
	IndexCreated("INDEX_CREATED"),

	ClusterRecovered("CLUSTER_RECOVERED"),

	IndexReopened("INDEX_REOPENED"),

	DanglingIndexImported("DANGLING_INDEX_IMPORTED"),

	NewIndexRestored("NEW_INDEX_RESTORED"),

	ExistingIndexRestored("EXISTING_INDEX_RESTORED"),

	ReplicaAdded("REPLICA_ADDED"),

	AllocationFailed("ALLOCATION_FAILED"),

	NodeLeft("NODE_LEFT"),

	RerouteCancelled("REROUTE_CANCELLED"),

	Reinitialized("REINITIALIZED"),

	ReallocatedReplica("REALLOCATED_REPLICA"),

	PrimaryFailed("PRIMARY_FAILED"),

	ForcedEmptyPrimary("FORCED_EMPTY_PRIMARY"),

	ManualAllocation("MANUAL_ALLOCATION"),

	;

	private final String jsonValue;

	UnassignedInformationReason(String jsonValue) {
		this.jsonValue = jsonValue;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	public static final JsonEnum.Deserializer<UnassignedInformationReason> _DESERIALIZER = new JsonEnum.Deserializer<>(
			UnassignedInformationReason.values());
}
