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
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: cluster.post_voting_config_exclusions.Request
public final class PostVotingConfigExclusionsRequest extends RequestBase {
	@Nullable
	private final List<String> nodeNames;

	@Nullable
	private final List<String> nodeIds;

	@Nullable
	private final JsonValue timeout;

	// ---------------------------------------------------------------------------------------------

	protected PostVotingConfigExclusionsRequest(Builder builder) {

		this.nodeNames = builder.nodeNames;
		this.nodeIds = builder.nodeIds;
		this.timeout = builder.timeout;

	}

	/**
	 * A comma-separated list of the names of the nodes to exclude from the voting
	 * configuration. If specified, you may not also specify node_ids.
	 * <p>
	 * API name: {@code node_names}
	 */
	@Nullable
	public List<String> nodeNames() {
		return this.nodeNames;
	}

	/**
	 * A comma-separated list of the persistent ids of the nodes to exclude from the
	 * voting configuration. If specified, you may not also specify node_names.
	 * <p>
	 * API name: {@code node_ids}
	 */
	@Nullable
	public List<String> nodeIds() {
		return this.nodeIds;
	}

	/**
	 * When adding a voting configuration exclusion, the API waits for the specified
	 * nodes to be excluded from the voting configuration before returning. If the
	 * timeout expires before the appropriate condition is satisfied, the request
	 * fails and returns an error.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public JsonValue timeout() {
		return this.timeout;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PostVotingConfigExclusionsRequest}.
	 */
	public static class Builder implements ObjectBuilder<PostVotingConfigExclusionsRequest> {
		@Nullable
		private List<String> nodeNames;

		@Nullable
		private List<String> nodeIds;

		@Nullable
		private JsonValue timeout;

		/**
		 * A comma-separated list of the names of the nodes to exclude from the voting
		 * configuration. If specified, you may not also specify node_ids.
		 * <p>
		 * API name: {@code node_names}
		 */
		public Builder nodeNames(@Nullable List<String> value) {
			this.nodeNames = value;
			return this;
		}

		/**
		 * A comma-separated list of the names of the nodes to exclude from the voting
		 * configuration. If specified, you may not also specify node_ids.
		 * <p>
		 * API name: {@code node_names}
		 */
		public Builder nodeNames(String... value) {
			this.nodeNames = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #nodeNames(List)}, creating the list if needed.
		 */
		public Builder addNodeNames(String value) {
			if (this.nodeNames == null) {
				this.nodeNames = new ArrayList<>();
			}
			this.nodeNames.add(value);
			return this;
		}

		/**
		 * A comma-separated list of the persistent ids of the nodes to exclude from the
		 * voting configuration. If specified, you may not also specify node_names.
		 * <p>
		 * API name: {@code node_ids}
		 */
		public Builder nodeIds(@Nullable List<String> value) {
			this.nodeIds = value;
			return this;
		}

		/**
		 * A comma-separated list of the persistent ids of the nodes to exclude from the
		 * voting configuration. If specified, you may not also specify node_names.
		 * <p>
		 * API name: {@code node_ids}
		 */
		public Builder nodeIds(String... value) {
			this.nodeIds = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #nodeIds(List)}, creating the list if needed.
		 */
		public Builder addNodeIds(String value) {
			if (this.nodeIds == null) {
				this.nodeIds = new ArrayList<>();
			}
			this.nodeIds.add(value);
			return this;
		}

		/**
		 * When adding a voting configuration exclusion, the API waits for the specified
		 * nodes to be excluded from the voting configuration before returning. If the
		 * timeout expires before the appropriate condition is satisfied, the request
		 * fails and returns an error.
		 * <p>
		 * API name: {@code timeout}
		 */
		public Builder timeout(@Nullable JsonValue value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Builds a {@link PostVotingConfigExclusionsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PostVotingConfigExclusionsRequest build() {

			return new PostVotingConfigExclusionsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code cluster.post_voting_config_exclusions}".
	 */
	public static final Endpoint<PostVotingConfigExclusionsRequest, BooleanResponse, ElasticsearchError> ENDPOINT = new Endpoint.Boolean<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_cluster/voting_config_exclusions";

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.nodeNames != null) {
					params.put("node_names", request.nodeNames.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.nodeIds != null) {
					params.put("node_ids", request.nodeIds.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout.toString());
				}
				return params;

			}, Endpoint.Simple.emptyMap(), false, null);
}
