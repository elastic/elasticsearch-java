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

package co.elastic.clients.elasticsearch.cluster.state;

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
 *      "../../doc-files/api-spec.html#cluster.state.ClusterStateMetric">API
 *      specification</a>
 */
@JsonpDeserializable
public enum ClusterStateMetric implements JsonEnum {
	/**
	 * Shows all metrics.
	 */
	All("_all"),

	/**
	 * Shows the cluster state version.
	 */
	Version("version"),

	/**
	 * Shows the elected <code>master_node</code> part of the response.
	 */
	MasterNode("master_node"),

	/**
	 * Shows the <code>blocks</code> part of the response.
	 */
	Blocks("blocks"),

	/**
	 * Shows the <code>nodes</code> part of the response.
	 */
	Nodes("nodes"),

	/**
	 * Shows the <code>metadata</code> part of the response. If you supply a
	 * comma-separated list of indices, the returned output will only contain
	 * metadata for these indices.
	 */
	Metadata("metadata"),

	/**
	 * Shows the <code>routing_table</code> part of the response. If you supply a
	 * comma-separated list of indices, the returned output will only contain the
	 * routing table for these indices.
	 */
	RoutingTable("routing_table"),

	/**
	 * Shows the <code>routing_nodes</code> part of the response.
	 */
	RoutingNodes("routing_nodes"),

	/**
	 * Shows the <code>customs</code> part of the response, which includes custom
	 * cluster state information.
	 */
	Customs("customs"),

	;

	private final String jsonValue;

	ClusterStateMetric(String jsonValue) {
		this.jsonValue = jsonValue;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	public static final JsonEnum.Deserializer<ClusterStateMetric> _DESERIALIZER = new JsonEnum.Deserializer<>(
			ClusterStateMetric.values());
}
