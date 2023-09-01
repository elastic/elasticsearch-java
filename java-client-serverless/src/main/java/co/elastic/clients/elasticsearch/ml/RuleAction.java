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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml._types.RuleAction">API
 *      specification</a>
 */
@JsonpDeserializable
public enum RuleAction implements JsonEnum {
	/**
	 * The result will not be created. Unless you also specify
	 * <code>skip_model_update</code>, the model will be updated as usual with the
	 * corresponding series value.
	 */
	SkipResult("skip_result"),

	/**
	 * The value for that series will not be used to update the model. Unless you
	 * also specify <code>skip_result</code>, the results will be created as usual.
	 * This action is suitable when certain values are expected to be consistently
	 * anomalous and they affect the model in a way that negatively impacts the rest
	 * of the results.
	 */
	SkipModelUpdate("skip_model_update"),

	;

	private final String jsonValue;

	RuleAction(String jsonValue) {
		this.jsonValue = jsonValue;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	public static final JsonEnum.Deserializer<RuleAction> _DESERIALIZER = new JsonEnum.Deserializer<>(
			RuleAction.values());
}
