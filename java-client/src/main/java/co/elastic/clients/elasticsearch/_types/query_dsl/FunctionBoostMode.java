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

package co.elastic.clients.elasticsearch._types.query_dsl;

import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.query_dsl.FunctionBoostMode">API
 *      specification</a>
 */
@JsonpDeserializable
public enum FunctionBoostMode implements JsonEnum {
	/**
	 * Query score and function score are multiplied
	 */
	Multiply("multiply"),

	/**
	 * Only the function score is used. The query score is ignored.
	 */
	Replace("replace"),

	/**
	 * Query score and function score are added
	 */
	Sum("sum"),

	/**
	 * Query score and function score are averaged
	 */
	Avg("avg"),

	/**
	 * Max of query score and function score
	 */
	Max("max"),

	/**
	 * Min of query score and function score
	 */
	Min("min"),

	;

	private final String jsonValue;

	FunctionBoostMode(String jsonValue) {
		this.jsonValue = jsonValue;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	public static final JsonEnum.Deserializer<FunctionBoostMode> _DESERIALIZER = new JsonEnum.Deserializer<>(
			FunctionBoostMode.values());
}
