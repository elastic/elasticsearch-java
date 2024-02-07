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
 *      "../../doc-files/api-spec.html#_types.aggregations.SamplerAggregationExecutionHint">API
 *      specification</a>
 */
@JsonpDeserializable
public enum SamplerAggregationExecutionHint implements JsonEnum {
	/**
	 * Hold field values directly.
	 */
	Map("map"),

	/**
	 * Hold ordinals of the field as determined by the Lucene index.
	 */
	GlobalOrdinals("global_ordinals"),

	/**
	 * Hold hashes of the field values - with potential for hash collisions.
	 */
	BytesHash("bytes_hash"),

	;

	private final String jsonValue;

	SamplerAggregationExecutionHint(String jsonValue) {
		this.jsonValue = jsonValue;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	public static final JsonEnum.Deserializer<SamplerAggregationExecutionHint> _DESERIALIZER = new JsonEnum.Deserializer<>(
			SamplerAggregationExecutionHint.values());
}
