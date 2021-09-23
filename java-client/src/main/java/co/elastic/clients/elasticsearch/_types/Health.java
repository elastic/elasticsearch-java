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

package co.elastic.clients.elasticsearch._types;

import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.util.StringEnum;

public enum Health implements StringEnum {
	/**
	 * All shards are assigned.
	 */
	Green("green"),
	/**
	 * All primary shards are assigned, but one or more replica shards are
	 * unassigned. If a node in the cluster fails, some data could be unavailable
	 * until that node is repaired.
	 */
	Yellow("yellow"),
	/**
	 * One or more primary shards are unassigned, so some data is unavailable. This
	 * can occur briefly during cluster startup as primary shards are assigned.
	 */
	Red("red");

	private final String jsonValue;

	Health(String jsonValue) {
		this.jsonValue = jsonValue;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	public static final StringEnum.Deserializer<Health> DESERIALIZER = new StringEnum.Deserializer<>(Health.values());
}
