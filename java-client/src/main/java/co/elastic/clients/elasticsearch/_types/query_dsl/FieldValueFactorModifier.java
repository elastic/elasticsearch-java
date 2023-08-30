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
 *      "../../doc-files/api-spec.html#_types.query_dsl.FieldValueFactorModifier">API
 *      specification</a>
 */
@JsonpDeserializable
public enum FieldValueFactorModifier implements JsonEnum {
	/**
	 * Do not apply any multiplier to the field value.
	 */
	None("none"),

	/**
	 * Take the common logarithm of the field value. Because this function will
	 * return a negative value and cause an error if used on values between 0 and 1,
	 * it is recommended to use <code>log1p</code> instead.
	 */
	Log("log"),

	/**
	 * Add 1 to the field value and take the common logarithm.
	 */
	Log1p("log1p"),

	/**
	 * Add 2 to the field value and take the common logarithm.
	 */
	Log2p("log2p"),

	/**
	 * Take the natural logarithm of the field value. Because this function will
	 * return a negative value and cause an error if used on values between 0 and 1,
	 * it is recommended to use <code>ln1p</code> instead.
	 */
	Ln("ln"),

	/**
	 * Add 1 to the field value and take the natural logarithm.
	 */
	Ln1p("ln1p"),

	/**
	 * Add 2 to the field value and take the natural logarithm.
	 */
	Ln2p("ln2p"),

	/**
	 * Square the field value (multiply it by itself).
	 */
	Square("square"),

	/**
	 * Take the square root of the field value.
	 */
	Sqrt("sqrt"),

	/**
	 * Reciprocate the field value, same as <code>1/x</code> where <code>x</code> is
	 * the field’s value.
	 */
	Reciprocal("reciprocal"),

	;

	private final String jsonValue;

	FieldValueFactorModifier(String jsonValue) {
		this.jsonValue = jsonValue;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	public static final JsonEnum.Deserializer<FieldValueFactorModifier> _DESERIALIZER = new JsonEnum.Deserializer<>(
			FieldValueFactorModifier.values());
}
