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
 * @see <a href="../doc-files/api-spec.html#ml._types.RoutingState">API
 *      specification</a>
 */
@JsonpDeserializable
public enum RoutingState implements JsonEnum {
	/**
	 * The allocation attempt failed.
	 */
	Failed("failed"),

	/**
	 * The trained model is allocated and ready to accept inference requests.
	 */
	Started("started"),

	/**
	 * The trained model is attempting to allocate on this node; inference requests
	 * are not yet accepted.
	 */
	Starting("starting"),

	/**
	 * The trained model is fully deallocated from this node.
	 */
	Stopped("stopped"),

	/**
	 * The trained model is being deallocated from this node.
	 */
	Stopping("stopping"),

	;

	private final String jsonValue;

	RoutingState(String jsonValue) {
		this.jsonValue = jsonValue;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	public static final JsonEnum.Deserializer<RoutingState> _DESERIALIZER = new JsonEnum.Deserializer<>(
			RoutingState.values());
}
