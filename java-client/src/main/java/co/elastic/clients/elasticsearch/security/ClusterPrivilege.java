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

package co.elastic.clients.elasticsearch.security;

import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;

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

	CreateSnapshot("create_snapshot"),

	GrantApiKey("grant_api_key"),

	Manage("manage"),

	ManageApiKey("manage_api_key"),

	ManageCcr("manage_ccr"),

	ManageEnrich("manage_enrich"),

	ManageIlm("manage_ilm"),

	ManageIndexTemplates("manage_index_templates"),

	ManageIngestPipelines("manage_ingest_pipelines"),

	ManageLogstashPipelines("manage_logstash_pipelines"),

	ManageMl("manage_ml"),

	ManageOidc("manage_oidc"),

	ManageOwnApiKey("manage_own_api_key"),

	ManagePipeline("manage_pipeline"),

	ManageRollup("manage_rollup"),

	ManageSaml("manage_saml"),

	ManageSecurity("manage_security"),

	ManageServiceAccount("manage_service_account"),

	ManageSlm("manage_slm"),

	ManageToken("manage_token"),

	ManageTransform("manage_transform"),

	ManageUserProfile("manage_user_profile"),

	ManageWatcher("manage_watcher"),

	Monitor("monitor"),

	MonitorMl("monitor_ml"),

	MonitorRollup("monitor_rollup"),

	MonitorSnapshot("monitor_snapshot"),

	MonitorTextStructure("monitor_text_structure"),

	MonitorTransform("monitor_transform"),

	MonitorWatcher("monitor_watcher"),

	ReadCcr("read_ccr"),

	ReadIlm("read_ilm"),

	ReadPipeline("read_pipeline"),

	ReadSlm("read_slm"),

	TransportClient("transport_client"),

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
