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

package co.elastic.clients.elasticsearch.migration.deprecations;

import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/04a9498/specification/migration/deprecations/types.ts#L20-L27">API
 *      specification</a>
 */
@JsonpDeserializable
public enum DeprecationLevel implements JsonEnum {
	None("none"),

	Info("info"),

	/**
	 * You can upgrade directly, but you are using deprecated functionality which
	 * will not be available or behave differently in the next major version.
	 */
	Warning("warning"),

	/**
	 * You cannot upgrade without fixing this problem.
	 */
	Critical("critical"),

	;

	private final String jsonValue;

	DeprecationLevel(String jsonValue) {
		this.jsonValue = jsonValue;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	public static final JsonEnum.Deserializer<DeprecationLevel> _DESERIALIZER = new JsonEnum.Deserializer<>(
			DeprecationLevel.values());
}
