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
 * @see <a href="../doc-files/api-spec.html#ml._types.JobState">API
 *      specification</a>
 */
@JsonpDeserializable
public enum JobState implements JsonEnum {
	/**
	 * The job close action is in progress and has not yet completed. A closing job
	 * cannot accept further data.
	 */
	Closing("closing"),

	/**
	 * The job finished successfully with its model state persisted. The job must be
	 * opened before it can accept further data.
	 */
	Closed("closed"),

	/**
	 * The job is available to receive and process data.
	 */
	Opened("opened"),

	/**
	 * The job did not finish successfully due to an error. This situation can occur
	 * due to invalid input data, a fatal error occurring during the analysis, or an
	 * external interaction such as the process being killed by the Linux out of
	 * memory (OOM) killer. If the job had irrevocably failed, it must be force
	 * closed and then deleted. If the datafeed can be corrected, the job can be
	 * closed and then re-opened.
	 */
	Failed("failed"),

	/**
	 * The job open action is in progress and has not yet completed.
	 */
	Opening("opening"),

	;

	private final String jsonValue;

	JobState(String jsonValue) {
		this.jsonValue = jsonValue;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	public static final JsonEnum.Deserializer<JobState> _DESERIALIZER = new JsonEnum.Deserializer<>(JobState.values());
}
