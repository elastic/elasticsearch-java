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

package co.elastic.clients.elasticsearch._types;

import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import jakarta.json.stream.JsonGenerator;

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.Refresh">API
 *      specification</a>
 */
@JsonpDeserializable
public enum Refresh implements JsonEnum {
	True("true"),

	False("false"),

	WaitFor("wait_for"),

	;

	private final String jsonValue;

	Refresh(String jsonValue) {
		this.jsonValue = jsonValue;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper params) {
		if (this == Refresh.True) {
			generator.write(true);
		} else if (this == Refresh.False) {
			generator.write(false);
		} else {
			generator.write(jsonValue());
		}
	}

	public static final JsonEnum.Deserializer<Refresh> _DESERIALIZER = new JsonEnum.Deserializer.AllowingBooleans<>(
			Refresh.values());
}
