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

package co.elastic.clients.elasticsearch._types.query_dsl;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.query_dsl.RankFeatureFunctionLinear">API
 *      specification</a>
 */
@JsonpDeserializable
public class RankFeatureFunctionLinear extends RankFeatureFunction implements JsonpSerializable {

	public static final class Builder implements ObjectBuilder<RankFeatureFunctionLinear> {
		@Override
		public RankFeatureFunctionLinear build() {
			return RankFeatureFunctionLinear._INSTANCE;
		}
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		generator.writeEnd();
	}

	/**
	 * Singleton instance for empty class {@link RankFeatureFunctionLinear}.
	 */
	public static final RankFeatureFunctionLinear _INSTANCE = new RankFeatureFunctionLinear();

	public static final JsonpDeserializer<RankFeatureFunctionLinear> _DESERIALIZER = JsonpDeserializer
			.emptyObject(RankFeatureFunctionLinear._INSTANCE);

}
