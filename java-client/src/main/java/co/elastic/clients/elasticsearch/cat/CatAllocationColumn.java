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
 * @see <a href="../doc-files/api-spec.html#cat._types.CatAllocationColumn">API
 *      specification</a>
 */
@JsonpDeserializable
public enum CatAllocationColumn implements JsonEnum {
	/**
	 * The number of shards on the node.
	 */
	Shards("shards", "s"),

	/**
	 * The number of shards scheduled to be moved elsewhere in the cluster.
	 */
	ShardsUndesired("shards.undesired"),

	/**
	 * The sum of index write load forecasts.
	 */
	WriteLoadForecast("write_load.forecast", "wlf", "writeLoadForecast"),

	/**
	 * The sum of shard size forecasts.
	 */
	DiskIndicesForecast("disk.indices.forecast", "dif", "diskIndicesForecast"),

	/**
	 * The disk space used by Elasticsearch indices.
	 */
	DiskIndices("disk.indices", "di", "diskIndices"),

	/**
	 * The total disk space used on the node.
	 */
	DiskUsed("disk.used", "du", "diskUsed"),

	/**
	 * The available disk space on the node.
	 */
	DiskAvail("disk.avail", "da", "diskAvail"),

	/**
	 * The total disk capacity of all volumes on the node.
	 */
	DiskTotal("disk.total", "dt", "diskTotal"),

	/**
	 * The percentage of disk space used on the node.
	 */
	DiskPercent("disk.percent", "dp", "diskPercent"),

	/**
	 * IThe host of the node.
	 */
	Host("host", "h"),

	/**
	 * The IP address of the node.
	 */
	Ip("ip"),

	/**
	 * The name of the node.
	 */
	Node("node", "n"),

	/**
	 * The roles assigned to the node.
	 */
	NodeRole("node.role", "r", "role", "nodeRole"),

	;

	private final String jsonValue;
	private final String[] aliases;

	CatAllocationColumn(String jsonValue, String... aliases) {
		this.jsonValue = jsonValue;
		this.aliases = aliases;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	public String[] aliases() {
		return this.aliases;
	}

	public static final JsonEnum.Deserializer<CatAllocationColumn> _DESERIALIZER = new JsonEnum.Deserializer<>(
			CatAllocationColumn.values());
}
