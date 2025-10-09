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
 *      "../../doc-files/api-spec.html#_types.mapping.DenseVectorIndexOptionsType">API
 *      specification</a>
 */
@JsonpDeserializable
public enum DenseVectorIndexOptionsType implements JsonEnum {
	/**
	 * This utilizes a brute-force search algorithm in addition to automatically
	 * quantizing to binary vectors. Only supports <code>element_type</code> of
	 * <code>float</code>.
	 */
	BbqFlat("bbq_flat"),

	/**
	 * This utilizes the HNSW algorithm in addition to automatic binary quantization
	 * for scalable approximate kNN search with <code>element_type</code> of
	 * <code>float</code>.
	 * <p>
	 * This can reduce the memory footprint by nearly 32x at the cost of some
	 * accuracy.
	 */
	BbqHnsw("bbq_hnsw"),

	/**
	 * This utilizes the DiskBBQ algorithm, a version of Inverted Vector File (IVF)
	 * that uses BBQ to quantize vectors. Only supports <code>element_type</code> of
	 * <code>float</code>.
	 * <p>
	 * This not only significantly reduces memory usage, but also allows for
	 * indexing and searching of very large datasets that do not fit in memory.
	 * Unlike HNSW, this index type loses performance gracefully as the index grows
	 * larger than memory.
	 */
	BbqDisk("bbq_disk"),

	/**
	 * This utilizes a brute-force search algorithm for exact kNN search. This
	 * supports all <code>element_type</code> values.
	 */
	Flat("flat"),

	/**
	 * This utilizes the HNSW algorithm for scalable approximate kNN search. This
	 * supports all <code>element_type</code> values.
	 */
	Hnsw("hnsw"),

	/**
	 * This utilizes a brute-force search algorithm in addition to automatically
	 * half-byte scalar quantization. Only supports <code>element_type</code> of
	 * <code>float</code>.
	 */
	Int4Flat("int4_flat"),

	/**
	 * This utilizes the HNSW algorithm in addition to automatically scalar
	 * quantization for scalable approximate kNN search with
	 * <code>element_type</code> of <code>float</code>.
	 * <p>
	 * This can reduce the memory footprint by 8x at the cost of some accuracy.
	 */
	Int4Hnsw("int4_hnsw"),

	/**
	 * This utilizes a brute-force search algorithm in addition to automatically
	 * scalar quantization. Only supports <code>element_type</code> of
	 * <code>float</code>.
	 */
	Int8Flat("int8_flat"),

	/**
	 * The default index type for <code>float</code> vectors. This utilizes the HNSW
	 * algorithm in addition to automatically scalar quantization for scalable
	 * approximate kNN search with <code>element_type</code> of <code>float</code>.
	 * <p>
	 * This can reduce the memory footprint by 4x at the cost of some accuracy.
	 */
	Int8Hnsw("int8_hnsw"),

	;

	private final String jsonValue;

	DenseVectorIndexOptionsType(String jsonValue) {
		this.jsonValue = jsonValue;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	public static final JsonEnum.Deserializer<DenseVectorIndexOptionsType> _DESERIALIZER = new JsonEnum.Deserializer<>(
			DenseVectorIndexOptionsType.values());
}
