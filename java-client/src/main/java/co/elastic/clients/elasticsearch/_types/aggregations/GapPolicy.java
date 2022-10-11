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

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.GapPolicy">API
 *      specification</a>
 */
@JsonpDeserializable
public enum GapPolicy implements JsonEnum {
	/**
	 * Treats missing data as if the bucket does not exist. It will skip the bucket
	 * and continue calculating using the next available value.
	 */
	Skip("skip"),

	/**
	 * Replace missing values with a zero (0) and pipeline aggregation computation
	 * will proceed as normal.
	 */
	InsertZeros("insert_zeros"),

	/**
	 * Similar to skip, except if the metric provides a non-null, non-NaN value this
	 * value is used, otherwise the empty bucket is skipped.
	 */
	KeepValues("keep_values"),

	;

	private final String jsonValue;

	GapPolicy(String jsonValue) {
		this.jsonValue = jsonValue;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	public static final JsonEnum.Deserializer<GapPolicy> _DESERIALIZER = new JsonEnum.Deserializer<>(
			GapPolicy.values());
}
