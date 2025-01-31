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

package co.elastic.clients.elasticsearch._types.mapping;

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
 *      "../../doc-files/api-spec.html#_types.mapping.SyntheticSourceKeepEnum">API
 *      specification</a>
 */
@JsonpDeserializable
public enum SyntheticSourceKeepEnum implements JsonEnum {
	/**
	 * Synthetic source diverges from the original source (default)
	 */
	None("none"),

	/**
	 * Arrays of the corresponding field or object preserve the original element
	 * ordering and duplicate elements. The synthetic source fragment for such
	 * arrays is not guaranteed to match the original source exactly, e.g. array [1,
	 * 2, [5], [[4, [3]]], 5] may appear as-is or in an equivalent format like [1,
	 * 2, 5, 4, 3, 5]. The exact format may change in the future, in an effort to
	 * reduce the storage overhead of this option.
	 */
	Arrays("arrays"),

	/**
	 * The source for both singleton instances and arrays of the corresponding field
	 * or object gets recorded. When applied to objects, the source of all
	 * sub-objects and sub-fields gets captured. Furthermore, the original source of
	 * arrays gets captured and appears in synthetic source with no modifications.
	 */
	All("all"),

	;

	private final String jsonValue;

	SyntheticSourceKeepEnum(String jsonValue) {
		this.jsonValue = jsonValue;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	public static final JsonEnum.Deserializer<SyntheticSourceKeepEnum> _DESERIALIZER = new JsonEnum.Deserializer<>(
			SyntheticSourceKeepEnum.values());
}
