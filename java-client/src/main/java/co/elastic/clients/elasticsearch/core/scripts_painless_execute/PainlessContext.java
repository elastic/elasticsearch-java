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

package co.elastic.clients.elasticsearch.core.scripts_painless_execute;

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
 *      "../../doc-files/api-spec.html#_global.scripts_painless_execute.PainlessContext">API
 *      specification</a>
 */
@JsonpDeserializable
public enum PainlessContext implements JsonEnum {
	/**
	 * The default context if no other context is specified.
	 */
	PainlessTest("painless_test"),

	/**
	 * Treats scripts as if they were run inside a script query.
	 */
	Filter("filter"),

	/**
	 * Treats scripts as if they were run inside a <code>script_score</code>
	 * function in a <code>function_score</code> query.
	 */
	Score("score"),

	/**
	 * The context for boolean fields. The script returns a <code>true</code> or
	 * <code>false</code> response.
	 */
	BooleanField("boolean_field"),

	/**
	 * The context for date fields. <code>emit</code> takes a long value and the
	 * script returns a sorted list of dates.
	 */
	DateField("date_field"),

	/**
	 * The context for double numeric fields. The script returns a sorted list of
	 * double values.
	 */
	DoubleField("double_field"),

	/**
	 * The context for geo-point fields. <code>emit</code> takes two double
	 * parameters, the latitude and longitude values, and the script returns an
	 * object in GeoJSON format containing the coordinates for the geo point.
	 */
	GeoPointField("geo_point_field"),

	/**
	 * The context for <code>ip</code> fields. The script returns a sorted list of
	 * IP addresses.
	 */
	IpField("ip_field"),

	/**
	 * The context for keyword fields. The script returns a sorted list of string
	 * values.
	 */
	KeywordField("keyword_field"),

	/**
	 * The context for long numeric fields. The script returns a sorted list of long
	 * values.
	 */
	LongField("long_field"),

	/**
	 * The context for composite runtime fields. The script returns a map of values.
	 */
	CompositeField("composite_field"),

	;

	private final String jsonValue;

	PainlessContext(String jsonValue) {
		this.jsonValue = jsonValue;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	public static final JsonEnum.Deserializer<PainlessContext> _DESERIALIZER = new JsonEnum.Deserializer<>(
			PainlessContext.values());
}
