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

package co.elastic.clients.elasticsearch.cat;

import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#cat._types.CatTrainedModelsColumn">API
 *      specification</a>
 */
@JsonpDeserializable
public enum CatTrainedModelsColumn implements JsonEnum {
	/**
	 * The time when the trained model was created.
	 */
	CreateTime("create_time", "ct"),

	/**
	 * Information on the creator of the trained model.
	 */
	CreatedBy("created_by", "c", "createdBy"),

	/**
	 * Identifier for the data frame analytics job that created the model. Only
	 * displayed if it is still available.
	 */
	DataFrameAnalyticsId("data_frame_analytics_id", "df", "dataFrameAnalytics", "dfid"),

	/**
	 * The description of the trained model.
	 */
	Description("description", "d"),

	/**
	 * The estimated heap size to keep the trained model in memory.
	 */
	HeapSize("heap_size", "hs", "modelHeapSize"),

	/**
	 * Identifier for the trained model.
	 */
	Id("id"),

	/**
	 * The total number of documents that are processed by the model.
	 */
	IngestCount("ingest.count", "ic", "ingestCount"),

	/**
	 * The total number of document that are currently being handled by the trained
	 * model.
	 */
	IngestCurrent("ingest.current", "icurr", "ingestCurrent"),

	/**
	 * The total number of failed ingest attempts with the trained model.
	 */
	IngestFailed("ingest.failed", "if", "ingestFailed"),

	/**
	 * The total number of ingest pipelines that are referencing the trained model.
	 */
	IngestPipelines("ingest.pipelines", "ip", "ingestPipelines"),

	/**
	 * The total time that is spent processing documents with the trained model.
	 */
	IngestTime("ingest.time", "it", "ingestTime"),

	/**
	 * The license level of the trained model.
	 */
	License("license", "l"),

	/**
	 * The estimated number of operations to use the trained model. This number
	 * helps measuring the computational complexity of the model.
	 */
	Operations("operations", "o", "modelOperations"),

	/**
	 * The Elasticsearch version number in which the trained model was created.
	 */
	Version("version", "v"),

	;

	private final String jsonValue;
	private final String[] aliases;

	CatTrainedModelsColumn(String jsonValue, String... aliases) {
		this.jsonValue = jsonValue;
		this.aliases = aliases;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	public String[] aliases() {
		return this.aliases;
	}

	public static final JsonEnum.Deserializer<CatTrainedModelsColumn> _DESERIALIZER = new JsonEnum.Deserializer<>(
			CatTrainedModelsColumn.values());
}
