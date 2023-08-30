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
 *      "../../doc-files/api-spec.html#_types.aggregations.CardinalityExecutionMode">API
 *      specification</a>
 */
@JsonpDeserializable
public enum CardinalityExecutionMode implements JsonEnum {
	/**
	 * Run aggregation by using global ordinals of the field and resolving those
	 * values after finishing a shard.
	 */
	GlobalOrdinals("global_ordinals"),

	/**
	 * Run aggregation by using segment ordinal values and resolving those values
	 * after each segment.
	 */
	SegmentOrdinals("segment_ordinals"),

	/**
	 * Run aggregation by using field values directly.
	 */
	Direct("direct"),

	/**
	 * Heuristic-based mode, default in Elasticsearch 8.3 and earlier.
	 */
	SaveMemoryHeuristic("save_memory_heuristic"),

	/**
	 * Heuristic-based mode, default in Elasticsearch 8.4 and later.
	 */
	SaveTimeHeuristic("save_time_heuristic"),

	;

	private final String jsonValue;

	CardinalityExecutionMode(String jsonValue) {
		this.jsonValue = jsonValue;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	public static final JsonEnum.Deserializer<CardinalityExecutionMode> _DESERIALIZER = new JsonEnum.Deserializer<>(
			CardinalityExecutionMode.values());
}
