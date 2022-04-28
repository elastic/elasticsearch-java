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
 * @see <a href="../doc-files/api-spec.html#cat._types.CatDfaColumn">API
 *      specification</a>
 */
@JsonpDeserializable
public enum CatDfaColumn implements JsonEnum {
	/**
	 * Contains messages relating to the selection of a node.
	 */
	AssignmentExplanation("assignment_explanation", "ae"),

	/**
	 * The time when the data frame analytics job was created.
	 */
	CreateTime("create_time", "ct", "createTime"),

	/**
	 * A description of a job.
	 */
	Description("description", "d"),

	/**
	 * Name of the destination index.
	 */
	DestIndex("dest_index", "di", "destIndex"),

	/**
	 * Contains messages about the reason why a data frame analytics job failed.
	 */
	FailureReason("failure_reason", "fr", "failureReason"),

	/**
	 * Identifier for the data frame analytics job.
	 */
	Id("id"),

	/**
	 * The approximate maximum amount of memory resources that are permitted for the
	 * data frame analytics job.
	 */
	ModelMemoryLimit("model_memory_limit", "mml", "modelMemoryLimit"),

	/**
	 * The network address of the node that the data frame analytics job is assigned
	 * to.
	 */
	NodeAddress("node.address", "na", "nodeAddress"),

	/**
	 * The ephemeral ID of the node that the data frame analytics job is assigned
	 * to.
	 */
	NodeEphemeralId("node.ephemeral_id", "ne", "nodeEphemeralId"),

	/**
	 * The unique identifier of the node that the data frame analytics job is
	 * assigned to.
	 */
	NodeId("node.id", "ni", "nodeId"),

	/**
	 * The name of the node that the data frame analytics job is assigned to.
	 */
	NodeName("node.name", "nn", "nodeName"),

	/**
	 * The progress report of the data frame analytics job by phase.
	 */
	Progress("progress", "p"),

	/**
	 * Name of the source index.
	 */
	SourceIndex("source_index", "si", "sourceIndex"),

	/**
	 * Current state of the data frame analytics job.
	 */
	State("state", "s"),

	/**
	 * The type of analysis that the data frame analytics job performs.
	 */
	Type("type", "t"),

	/**
	 * The Elasticsearch version number in which the data frame analytics job was
	 * created.
	 */
	Version("version", "v"),

	;

	private final String jsonValue;
	private final String[] aliases;

	CatDfaColumn(String jsonValue, String... aliases) {
		this.jsonValue = jsonValue;
		this.aliases = aliases;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	public String[] aliases() {
		return this.aliases;
	}

	public static final JsonEnum.Deserializer<CatDfaColumn> _DESERIALIZER = new JsonEnum.Deserializer<>(
			CatDfaColumn.values());
}
