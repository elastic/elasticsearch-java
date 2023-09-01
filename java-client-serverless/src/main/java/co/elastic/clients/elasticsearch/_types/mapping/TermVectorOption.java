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

package co.elastic.clients.elasticsearch._types.mapping;

import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.mapping.TermVectorOption">API
 *      specification</a>
 */
@JsonpDeserializable
public enum TermVectorOption implements JsonEnum {
	No("no"),

	Yes("yes"),

	WithOffsets("with_offsets"),

	WithPositions("with_positions"),

	WithPositionsOffsets("with_positions_offsets"),

	WithPositionsOffsetsPayloads("with_positions_offsets_payloads"),

	WithPositionsPayloads("with_positions_payloads"),

	;

	private final String jsonValue;

	TermVectorOption(String jsonValue) {
		this.jsonValue = jsonValue;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	public static final JsonEnum.Deserializer<TermVectorOption> _DESERIALIZER = new JsonEnum.Deserializer<>(
			TermVectorOption.values());
}
