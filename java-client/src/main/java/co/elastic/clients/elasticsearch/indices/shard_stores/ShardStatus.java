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

package co.elastic.clients.elasticsearch.indices.shard_stores;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.util.StringEnum;

@JsonpDeserializable
public enum ShardStatus implements StringEnum {
	/**
	 * The primary shard and all replica shards are assigned.
	 */
	Green("green"),
	/**
	 * One or more replica shards are unassigned.
	 */
	Yellow("yellow"),
	/**
	 * The primary shard is unassigned.
	 */
	Red("red"),
	/**
	 * Return all shards, regardless of health status.
	 */
	All("all");

	private final String jsonValue;

	ShardStatus(String jsonValue) {
		this.jsonValue = jsonValue;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	public static final StringEnum.Deserializer<ShardStatus> _DESERIALIZER = new StringEnum.Deserializer<>(
			ShardStatus.values());
}
