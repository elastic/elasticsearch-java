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

package co.elastic.clients.elasticsearch.core.search;

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
 *      "../../doc-files/api-spec.html#_global.search._types.StringDistance">API
 *      specification</a>
 */
@JsonpDeserializable
public enum StringDistance implements JsonEnum {
	/**
	 * Based on the Damerau-Levenshtein algorithm, but highly optimized for
	 * comparing string distance for terms inside the index.
	 */
	Internal("internal"),

	/**
	 * String distance algorithm based on Damerau-Levenshtein algorithm.
	 */
	DamerauLevenshtein("damerau_levenshtein"),

	/**
	 * String distance algorithm based on the Levenshtein edit distance algorithm.
	 */
	Levenshtein("levenshtein"),

	/**
	 * String distance algorithm based on Jaro-Winkler algorithm.
	 */
	JaroWinkler("jaro_winkler"),

	/**
	 * String distance algorithm based on character n-grams.
	 */
	Ngram("ngram"),

	;

	private final String jsonValue;

	StringDistance(String jsonValue) {
		this.jsonValue = jsonValue;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	public static final JsonEnum.Deserializer<StringDistance> _DESERIALIZER = new JsonEnum.Deserializer<>(
			StringDistance.values());
}
