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
 *      "../../doc-files/api-spec.html#_types.mapping.DenseVectorElementType">API
 *      specification</a>
 */
@JsonpDeserializable
public enum DenseVectorElementType implements JsonEnum {
	/**
	 * Indexes a single bit per dimension. Useful for very high-dimensional vectors
	 * or models that specifically support bit vectors.
	 * <p>
	 * NOTE: when using <code>bit</code>, the number of dimensions must be a
	 * multiple of <code>8</code> and must represent the number of bits.
	 */
	Bit("bit"),

	/**
	 * Indexes a 1-byte integer value per dimension.
	 */
	Byte("byte"),

	/**
	 * Indexes a 4-byte floating-point value per dimension.
	 */
	Float("float"),

	;

	private final String jsonValue;

	DenseVectorElementType(String jsonValue) {
		this.jsonValue = jsonValue;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	public static final JsonEnum.Deserializer<DenseVectorElementType> _DESERIALIZER = new JsonEnum.Deserializer<>(
			DenseVectorElementType.values());
}
