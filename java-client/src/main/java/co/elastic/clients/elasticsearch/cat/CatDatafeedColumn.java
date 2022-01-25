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
 * @see <a href="../doc-files/api-spec.html#cat._types.CatDatafeedColumn">API
 *      specification</a>
 */
@JsonpDeserializable
public enum CatDatafeedColumn implements JsonEnum {
	/**
	 * For started datafeeds only, contains messages relating to the selection of a
	 * node.
	 */
	Ae("ae", "assignment_explanation"),

	/**
	 * The number of buckets processed.
	 */
	Bc("bc", "buckets.count", "bucketsCount"),

	/**
	 * A numerical character string that uniquely identifies the datafeed.
	 */
	Id("id"),

	/**
	 * For started datafeeds only, the network address of the node where the
	 * datafeed is started.
	 */
	Na("na", "node.address", "nodeAddress"),

	/**
	 * For started datafeeds only, the ephemeral ID of the node where the datafeed
	 * is started.
	 */
	Ne("ne", "node.ephemeral_id", "nodeEphemeralId"),

	/**
	 * For started datafeeds only, the unique identifier of the node where the
	 * datafeed is started.
	 */
	Ni("ni", "node.id", "nodeId"),

	/**
	 * For started datafeeds only, the name of the node where the datafeed is
	 * started.
	 */
	Nn("nn", "node.name", "nodeName"),

	/**
	 * The average search time per bucket, in milliseconds.
	 */
	Sba("sba", "search.bucket_avg", "searchBucketAvg"),

	/**
	 * The number of searches run by the datafeed.
	 */
	Sc("sc", "search.count", "searchCount"),

	/**
	 * The exponential average search time per hour, in milliseconds.
	 */
	Seah("seah", "search.exp_avg_hour", "searchExpAvgHour"),

	/**
	 * The total time the datafeed spent searching, in milliseconds.
	 */
	St("st", "search.time", "searchTime"),

	/**
	 * The status of the datafeed: <code>starting</code>, <code>started</code>,
	 * <code>stopping</code>, or <code>stopped</code>. If <code>starting</code>, the
	 * datafeed has been requested to start but has not yet started. If
	 * <code>started</code>, the datafeed is actively receiving data. If
	 * <code>stopping</code>, the datafeed has been requested to stop gracefully and
	 * is completing its final action. If <code>stopped</code>, the datafeed is
	 * stopped and will not receive data until it is re-started.
	 */
	S("s", "state"),

	;

	private final String jsonValue;
	private final String[] aliases;

	CatDatafeedColumn(String jsonValue, String... aliases) {
		this.jsonValue = jsonValue;
		this.aliases = aliases;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	public String[] aliases() {
		return this.aliases;
	}

	public static final JsonEnum.Deserializer<CatDatafeedColumn> _DESERIALIZER = new JsonEnum.Deserializer<>(
			CatDatafeedColumn.values());
}
