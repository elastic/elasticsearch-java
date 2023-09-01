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
 * @see <a href="../doc-files/api-spec.html#ml._types.Include">API
 *      specification</a>
 */
@JsonpDeserializable
public enum Include implements JsonEnum {
	/**
	 * Includes the model definition.
	 */
	Definition("definition"),

	/**
	 * Includes the baseline for feature importance values.
	 */
	FeatureImportanceBaseline("feature_importance_baseline"),

	/**
	 * Includes the information about hyperparameters used to train the model. This
	 * information consists of the value, the absolute and relative importance of
	 * the hyperparameter as well as an indicator of whether it was specified by the
	 * user or tuned during hyperparameter optimization.
	 */
	Hyperparameters("hyperparameters"),

	/**
	 * Includes the total feature importance for the training data set. The baseline
	 * and total feature importance values are returned in the metadata field in the
	 * response body.
	 */
	TotalFeatureImportance("total_feature_importance"),

	/**
	 * Includes the model definition status.
	 */
	DefinitionStatus("definition_status"),

	;

	private final String jsonValue;

	Include(String jsonValue) {
		this.jsonValue = jsonValue;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	public static final JsonEnum.Deserializer<Include> _DESERIALIZER = new JsonEnum.Deserializer<>(Include.values());
}
