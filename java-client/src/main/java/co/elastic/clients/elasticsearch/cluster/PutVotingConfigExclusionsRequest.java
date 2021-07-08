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

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: cluster.put_voting_config_exclusions.Request
public final class PutVotingConfigExclusionsRequest extends RequestBase {
	@Nullable
	private final List<String> nodeNames;

	@Nullable
	private final List<String> nodeIds;

	@Nullable
	private final JsonValue timeout;

	@Nullable
	private final Boolean waitForRemoval;

	// ---------------------------------------------------------------------------------------------

	protected PutVotingConfigExclusionsRequest(Builder builder) {

		this.nodeNames = builder.nodeNames;
		this.nodeIds = builder.nodeIds;
		this.timeout = builder.timeout;
		this.waitForRemoval = builder.waitForRemoval;

	}

	/**
	 * API name: {@code node_names}
	 */
	@Nullable
	public List<String> nodeNames() {
		return this.nodeNames;
	}

	/**
	 * API name: {@code node_ids}
	 */
	@Nullable
	public List<String> nodeIds() {
		return this.nodeIds;
	}

	/**
	 * API name: {@code timeout}
	 */
	@Nullable
	public JsonValue timeout() {
		return this.timeout;
	}

	/**
	 * API name: {@code wait_for_removal}
	 */
	@Nullable
	public Boolean waitForRemoval() {
		return this.waitForRemoval;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutVotingConfigExclusionsRequest}.
	 */
	public static class Builder implements ObjectBuilder<PutVotingConfigExclusionsRequest> {
		@Nullable
		private List<String> nodeNames;

		@Nullable
		private List<String> nodeIds;

		@Nullable
		private JsonValue timeout;

		@Nullable
		private Boolean waitForRemoval;

		/**
		 * API name: {@code node_names}
		 */
		public Builder nodeNames(@Nullable List<String> value) {
			this.nodeNames = value;
			return this;
		}

		/**
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
		 * API name: {@code node_ids}
		 */
		public Builder nodeIds(@Nullable List<String> value) {
			this.nodeIds = value;
			return this;
		}

		/**
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
		 * API name: {@code timeout}
		 */
		public Builder timeout(@Nullable JsonValue value) {
			this.timeout = value;
			return this;
		}

		/**
		 * API name: {@code wait_for_removal}
		 */
		public Builder waitForRemoval(@Nullable Boolean value) {
			this.waitForRemoval = value;
			return this;
		}

		/**
		 * Builds a {@link PutVotingConfigExclusionsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutVotingConfigExclusionsRequest build() {

			return new PutVotingConfigExclusionsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code cluster.post_voting_config_exclusions}".
	 */
	public static final Endpoint<PutVotingConfigExclusionsRequest, PutVotingConfigExclusionsResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
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
				if (request.waitForRemoval != null) {
					params.put("wait_for_removal", String.valueOf(request.waitForRemoval));
				}
				return params;

			}, Endpoint.Simple.emptyMap(), false, PutVotingConfigExclusionsResponse.DESERIALIZER);
}
