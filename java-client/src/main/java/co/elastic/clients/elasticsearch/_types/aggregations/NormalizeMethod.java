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

package co.elastic.clients.elasticsearch._types.aggregations;

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
 *      "../../doc-files/api-spec.html#_types.aggregations.NormalizeMethod">API
 *      specification</a>
 */
@JsonpDeserializable
public enum NormalizeMethod implements JsonEnum {
	/**
	 * This method rescales the data such that the minimum number is 0, and the
	 * maximum number is 1, with the rest normalized linearly in-between.
	 */
	Rescale_0_1("rescale_0_1"),

	/**
	 * This method rescales the data such that the minimum number is 0, and the
	 * maximum number is 100, with the rest normalized linearly in-between.
	 */
	Rescale_0_100("rescale_0_100"),

	/**
	 * This method normalizes each value so that it represents a percentage of the
	 * total sum it attributes to.
	 */
	PercentOfSum("percent_of_sum"),

	/**
	 * This method normalizes such that each value is normalized by how much it
	 * differs from the average.
	 */
	Mean("mean"),

	/**
	 * This method normalizes such that each value represents how far it is from the
	 * mean relative to the standard deviation.
	 */
	ZScore("z-score"),

	/**
	 * This method normalizes such that each value is exponentiated and relative to
	 * the sum of the exponents of the original values.
	 */
	Softmax("softmax"),

	;

	private final String jsonValue;

	NormalizeMethod(String jsonValue) {
		this.jsonValue = jsonValue;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	public static final JsonEnum.Deserializer<NormalizeMethod> _DESERIALIZER = new JsonEnum.Deserializer<>(
			NormalizeMethod.values());
}
