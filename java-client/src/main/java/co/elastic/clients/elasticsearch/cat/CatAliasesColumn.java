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

package co.elastic.clients.elasticsearch.cat;

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
 * @see <a href="../doc-files/api-spec.html#cat._types.CatAliasesColumn">API
 *      specification</a>
 */
@JsonpDeserializable
public enum CatAliasesColumn implements JsonEnum {
	/**
	 * The name of the alias.
	 */
	Alias("alias", "a"),

	/**
	 * The name of the index the alias points to.
	 */
	Index("index", "i", "idx"),

	/**
	 * The filter applied to the alias.
	 */
	Filter("filter", "f", "fi"),

	/**
	 * Index routing value for the alias.
	 */
	RoutingIndex("routing.index", "ri", "routingIndex"),

	/**
	 * Search routing value for the alias.
	 */
	RoutingSearch("routing.search", "rs", "routingSearch"),

	/**
	 * Indicates if the index is the write index for the alias.
	 */
	IsWriteIndex("is_write_index", "w", "isWriteIndex"),

	;

	private final String jsonValue;
	private final String[] aliases;

	CatAliasesColumn(String jsonValue, String... aliases) {
		this.jsonValue = jsonValue;
		this.aliases = aliases;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	public String[] aliases() {
		return this.aliases;
	}

	public static final JsonEnum.Deserializer<CatAliasesColumn> _DESERIALIZER = new JsonEnum.Deserializer<>(
			CatAliasesColumn.values());
}
