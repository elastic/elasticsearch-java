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

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.SuggestMode">API
 *      specification</a>
 */
@JsonpDeserializable
public enum SuggestMode implements JsonEnum {
	/**
	 * Only generate suggestions for terms that are not in the shard.
	 */
	Missing("missing"),

	/**
	 * Only suggest terms that occur in more docs on the shard than the original
	 * term.
	 */
	Popular("popular"),

	/**
	 * Suggest any matching suggestions based on terms in the suggest text.
	 */
	Always("always"),

	;

	private final String jsonValue;

	SuggestMode(String jsonValue) {
		this.jsonValue = jsonValue;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	public static final JsonEnum.Deserializer<SuggestMode> _DESERIALIZER = new JsonEnum.Deserializer<>(
			SuggestMode.values());
}
