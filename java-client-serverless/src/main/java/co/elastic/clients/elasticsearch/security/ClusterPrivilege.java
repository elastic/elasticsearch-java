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

package co.elastic.clients.elasticsearch.security;

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
 *      "../doc-files/api-spec.html#security._types.ClusterPrivilege">API
 *      specification</a>
 */
@JsonpDeserializable
public enum ClusterPrivilege implements JsonEnum {
	All("all"),

	CancelTask("cancel_task"),

	Manage("manage"),

	ManageApiKey("manage_api_key"),

	ManageBehavioralAnalytics("manage_behavioral_analytics"),

	ManageEnrich("manage_enrich"),

	ManageIndexTemplates("manage_index_templates"),

	ManageInference("manage_inference"),

	ManageIngestPipelines("manage_ingest_pipelines"),

	ManageLogstashPipelines("manage_logstash_pipelines"),

	ManageMl("manage_ml"),

	ManageOwnApiKey("manage_own_api_key"),

	ManagePipeline("manage_pipeline"),

	ManageSearchApplication("manage_search_application"),

	ManageSearchQueryRules("manage_search_query_rules"),

	ManageSearchSynonyms("manage_search_synonyms"),

	ManageSecurity("manage_security"),

	ManageTransform("manage_transform"),

	Monitor("monitor"),

	MonitorEnrich("monitor_enrich"),

	MonitorInference("monitor_inference"),

	MonitorMl("monitor_ml"),

	MonitorTransform("monitor_transform"),

	None("none"),

	PostBehavioralAnalyticsEvent("post_behavioral_analytics_event"),

	ReadPipeline("read_pipeline"),

	ReadSecurity("read_security"),

	;

	private final String jsonValue;

	ClusterPrivilege(String jsonValue) {
		this.jsonValue = jsonValue;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	public static final JsonEnum.Deserializer<ClusterPrivilege> _DESERIALIZER = new JsonEnum.Deserializer<>(
			ClusterPrivilege.values());
}
