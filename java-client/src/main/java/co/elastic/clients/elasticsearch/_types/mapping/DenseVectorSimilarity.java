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
 *      "../../doc-files/api-spec.html#_types.mapping.DenseVectorSimilarity">API
 *      specification</a>
 */
@JsonpDeserializable
public enum DenseVectorSimilarity implements JsonEnum {
	/**
	 * Computes the cosine similarity. During indexing Elasticsearch automatically
	 * normalizes vectors with <code>cosine</code> similarity to unit length. This
	 * allows to internally use <code>dot_product</code> for computing similarity,
	 * which is more efficient. Original un-normalized vectors can be still accessed
	 * through scripts.
	 * <p>
	 * The document <code>_score</code> is computed as
	 * <code>(1 + cosine(query, vector)) / 2</code>.
	 * <p>
	 * The <code>cosine</code> similarity does not allow vectors with zero
	 * magnitude, since cosine is not defined in this case.
	 */
	Cosine("cosine"),

	/**
	 * Computes the dot product of two unit vectors. This option provides an
	 * optimized way to perform cosine similarity. The constraints and computed
	 * score are defined by <code>element_type</code>.
	 * <p>
	 * When <code>element_type</code> is <code>float</code>, all vectors must be
	 * unit length, including both document and query vectors.
	 * <p>
	 * The document <code>_score</code> is computed as
	 * <code>(1 + dot_product(query, vector)) / 2</code>.
	 * <p>
	 * When <code>element_type</code> is <code>byte</code>, all vectors must have
	 * the same length including both document and query vectors or results will be
	 * inaccurate.
	 * <p>
	 * The document <code>_score</code> is computed as
	 * <code>0.5 + (dot_product(query, vector) / (32768 * dims))</code> where
	 * <code>dims</code> is the number of dimensions per vector.
	 */
	DotProduct("dot_product"),

	/**
	 * Computes similarity based on the <code>L2</code> distance (also known as
	 * Euclidean distance) between the vectors.
	 * <p>
	 * The document <code>_score</code> is computed as
	 * <code>1 / (1 + l2_norm(query, vector)^2)</code>.
	 * <p>
	 * For <code>bit</code> vectors, instead of using <code>l2_norm</code>, the
	 * <code>hamming</code> distance between the vectors is used.
	 * <p>
	 * The <code>_score</code> transformation is
	 * <code>(numBits - hamming(a, b)) / numBits</code>.
	 */
	L2Norm("l2_norm"),

	/**
	 * Computes the maximum inner product of two vectors. This is similar to
	 * <code>dot_product</code>, but doesn't require vectors to be normalized. This
	 * means that each vector’s magnitude can significantly effect the score.
	 * <p>
	 * The document <code>_score</code> is adjusted to prevent negative values. For
	 * <code>max_inner_product</code> values <code>&lt; 0</code>, the
	 * <code>_score</code> is
	 * <code>1 / (1 + -1 * max_inner_product(query, vector))</code>. For
	 * non-negative <code>max_inner_product</code> results the <code>_score</code>
	 * is calculated <code>max_inner_product(query, vector) + 1</code>.
	 */
	MaxInnerProduct("max_inner_product"),

	;

	private final String jsonValue;

	DenseVectorSimilarity(String jsonValue) {
		this.jsonValue = jsonValue;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	public static final JsonEnum.Deserializer<DenseVectorSimilarity> _DESERIALIZER = new JsonEnum.Deserializer<>(
			DenseVectorSimilarity.values());
}
