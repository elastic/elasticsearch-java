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

package co.elastic.clients.elasticsearch.watcher;

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
 *      "../doc-files/api-spec.html#watcher._types.ActionExecutionMode">API
 *      specification</a>
 */
@JsonpDeserializable
public enum ActionExecutionMode implements JsonEnum {
	/**
	 * The action execution is simulated. Each action type defines its own
	 * simulation operation mode. For example, the email action creates the email
	 * that would have been sent but does not actually send it. In this mode, the
	 * action might be throttled if the current state of the watch indicates it
	 * should be.
	 */
	Simulate("simulate"),

	/**
	 * Similar to the <code>simulate</code> mode, except the action is not throttled
	 * even if the current state of the watch indicates it should be.
	 */
	ForceSimulate("force_simulate"),

	/**
	 * Executes the action as it would have been executed if the watch had been
	 * triggered by its own trigger. The execution might be throttled if the current
	 * state of the watch indicates it should be.
	 */
	Execute("execute"),

	/**
	 * Similar to the <code>execute</code> mode, except the action is not throttled
	 * even if the current state of the watch indicates it should be.
	 */
	ForceExecute("force_execute"),

	/**
	 * The action is skipped and is not executed or simulated. Effectively forces
	 * the action to be throttled.
	 */
	Skip("skip"),

	;

	private final String jsonValue;

	ActionExecutionMode(String jsonValue) {
		this.jsonValue = jsonValue;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	public static final JsonEnum.Deserializer<ActionExecutionMode> _DESERIALIZER = new JsonEnum.Deserializer<>(
			ActionExecutionMode.values());
}
