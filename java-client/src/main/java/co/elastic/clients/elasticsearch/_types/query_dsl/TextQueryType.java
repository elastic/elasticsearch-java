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

import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.query_dsl.TextQueryType">API
 *      specification</a>
 */
@JsonpDeserializable
public enum TextQueryType implements JsonEnum {
	/**
	 * Finds documents that match any field, but uses the <code>_score</code> from
	 * the best field.
	 */
	BestFields("best_fields"),

	/**
	 * Finds documents that match any field and combines the <code>_score</code>
	 * from each field.
	 */
	MostFields("most_fields"),

	/**
	 * Treats fields with the same analyzer as though they were one big field. Looks
	 * for each word in any field.
	 */
	CrossFields("cross_fields"),

	/**
	 * Runs a <code>match_phrase</code> query on each field and uses the
	 * <code>_score</code> from the best field.
	 */
	Phrase("phrase"),

	/**
	 * Runs a <code>match_phrase_prefix</code> query on each field and uses the
	 * <code>_score</code> from the best field.
	 */
	PhrasePrefix("phrase_prefix"),

	/**
	 * Creates a <code>match_bool_prefix</code> query on each field and combines the
	 * <code>_score</code> from each field.
	 */
	BoolPrefix("bool_prefix"),

	;

	private final String jsonValue;

	TextQueryType(String jsonValue) {
		this.jsonValue = jsonValue;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	public static final JsonEnum.Deserializer<TextQueryType> _DESERIALIZER = new JsonEnum.Deserializer<>(
			TextQueryType.values());
}
