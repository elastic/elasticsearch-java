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
 * @see <a href="../doc-files/api-spec.html#ml._types.DeploymentState">API
 *      specification</a>
 */
@JsonpDeserializable
public enum DeploymentState implements JsonEnum {
	/**
	 * The deployment is usable; at least one node has the model allocated.
	 */
	Started("started"),

	/**
	 * The deployment has recently started but is not yet usable; the model is not
	 * allocated on any nodes.
	 */
	Starting("starting"),

	/**
	 * The deployment is preparing to stop and deallocate the model from the
	 * relevant nodes.
	 */
	Stopping("stopping"),

	;

	private final String jsonValue;

	DeploymentState(String jsonValue) {
		this.jsonValue = jsonValue;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	public static final JsonEnum.Deserializer<DeploymentState> _DESERIALIZER = new JsonEnum.Deserializer<>(
			DeploymentState.values());
}
