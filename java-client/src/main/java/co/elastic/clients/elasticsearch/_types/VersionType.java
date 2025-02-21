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

package co.elastic.clients.elasticsearch._types;

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
 * @see <a href="../doc-files/api-spec.html#_types.VersionType">API
 *      specification</a>
 */
@JsonpDeserializable
public enum VersionType implements JsonEnum {
	/**
	 * Use internal versioning that starts at 1 and increments with each update or
	 * delete.
	 */
	Internal("internal"),

	/**
	 * Only index the document if the specified version is strictly higher than the
	 * version of the stored document or if there is no existing document.
	 */
	External("external"),

	/**
	 * Only index the document if the specified version is equal or higher than the
	 * version of the stored document or if there is no existing document. NOTE: The
	 * <code>external_gte</code> version type is meant for special use cases and
	 * should be used with care. If used incorrectly, it can result in loss of data.
	 */
	ExternalGte("external_gte"),

	/**
	 * This option is deprecated because it can cause primary and replica shards to
	 * diverge.
	 */
	Force("force"),

	;

	private final String jsonValue;

	VersionType(String jsonValue) {
		this.jsonValue = jsonValue;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	public static final JsonEnum.Deserializer<VersionType> _DESERIALIZER = new JsonEnum.Deserializer<>(
			VersionType.values());
}
