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

package co.elastic.clients.elasticsearch.cluster;

import co.elastic.clients.base.BooleanResponse;
import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

// typedef: cluster.delete_voting_config_exclusions.Request
public final class DeleteVotingConfigExclusionsRequest extends RequestBase {
	@Nullable
	private final Boolean waitForRemoval;

	// ---------------------------------------------------------------------------------------------

	protected DeleteVotingConfigExclusionsRequest(Builder builder) {

		this.waitForRemoval = builder.waitForRemoval;

	}

	/**
	 * Specifies whether to wait for all excluded nodes to be removed from the
	 * cluster before clearing the voting configuration exclusions list. Defaults to
	 * true, meaning that all excluded nodes must be removed from the cluster before
	 * this API takes any action. If set to false then the voting configuration
	 * exclusions list is cleared even if some excluded nodes are still in the
	 * cluster.
	 * <p>
	 * API name: {@code wait_for_removal}
	 */
	@Nullable
	public Boolean waitForRemoval() {
		return this.waitForRemoval;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteVotingConfigExclusionsRequest}.
	 */
	public static class Builder implements ObjectBuilder<DeleteVotingConfigExclusionsRequest> {
		@Nullable
		private Boolean waitForRemoval;

		/**
		 * Specifies whether to wait for all excluded nodes to be removed from the
		 * cluster before clearing the voting configuration exclusions list. Defaults to
		 * true, meaning that all excluded nodes must be removed from the cluster before
		 * this API takes any action. If set to false then the voting configuration
		 * exclusions list is cleared even if some excluded nodes are still in the
		 * cluster.
		 * <p>
		 * API name: {@code wait_for_removal}
		 */
		public Builder waitForRemoval(@Nullable Boolean value) {
			this.waitForRemoval = value;
			return this;
		}

		/**
		 * Builds a {@link DeleteVotingConfigExclusionsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteVotingConfigExclusionsRequest build() {

			return new DeleteVotingConfigExclusionsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code cluster.delete_voting_config_exclusions}".
	 */
	public static final Endpoint<DeleteVotingConfigExclusionsRequest, BooleanResponse, ElasticsearchError> ENDPOINT = new Endpoint.Boolean<>(
			// Request method
			request -> {
				return "DELETE";

			},

			// Request path
			request -> {
				return "/_cluster/voting_config_exclusions";

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.waitForRemoval != null) {
					params.put("wait_for_removal", String.valueOf(request.waitForRemoval));
				}
				return params;

			}, Endpoint.Simple.emptyMap(), false, null);
}
