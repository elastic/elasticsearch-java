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

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.BooleanEndpoint;
import co.elastic.clients.transport.BooleanResponse;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.SimpleEndpoint;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: cluster.post_voting_config_exclusions.Request

public class PostVotingConfigExclusionsRequest extends RequestBase {
	private final List<String> nodeIds;

	private final List<String> nodeNames;

	@Nullable
	private final String timeout;

	// ---------------------------------------------------------------------------------------------

	private PostVotingConfigExclusionsRequest(Builder builder) {

		this.nodeIds = ModelTypeHelper.unmodifiable(builder.nodeIds);
		this.nodeNames = ModelTypeHelper.unmodifiable(builder.nodeNames);
		this.timeout = builder.timeout;

	}

	public static PostVotingConfigExclusionsRequest of(
			Function<Builder, ObjectBuilder<PostVotingConfigExclusionsRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * A comma-separated list of the persistent ids of the nodes to exclude from the
	 * voting configuration. If specified, you may not also specify node_names.
	 * <p>
	 * API name: {@code node_ids}
	 */
	public final List<String> nodeIds() {
		return this.nodeIds;
	}

	/**
	 * A comma-separated list of the names of the nodes to exclude from the voting
	 * configuration. If specified, you may not also specify node_ids.
	 * <p>
	 * API name: {@code node_names}
	 */
	public final List<String> nodeNames() {
		return this.nodeNames;
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
	public final String timeout() {
		return this.timeout;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PostVotingConfigExclusionsRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<PostVotingConfigExclusionsRequest> {
		@Nullable
		private List<String> nodeIds;

		@Nullable
		private List<String> nodeNames;

		@Nullable
		private String timeout;

		/**
		 * A comma-separated list of the persistent ids of the nodes to exclude from the
		 * voting configuration. If specified, you may not also specify node_names.
		 * <p>
		 * API name: {@code node_ids}
		 */
		public final Builder nodeIds(@Nullable List<String> value) {
			this.nodeIds = value;
			return this;
		}

		/**
		 * A comma-separated list of the persistent ids of the nodes to exclude from the
		 * voting configuration. If specified, you may not also specify node_names.
		 * <p>
		 * API name: {@code node_ids}
		 */
		public final Builder nodeIds(String... value) {
			this.nodeIds = Arrays.asList(value);
			return this;
		}

		/**
		 * A comma-separated list of the names of the nodes to exclude from the voting
		 * configuration. If specified, you may not also specify node_ids.
		 * <p>
		 * API name: {@code node_names}
		 */
		public final Builder nodeNames(@Nullable List<String> value) {
			this.nodeNames = value;
			return this;
		}

		/**
		 * A comma-separated list of the names of the nodes to exclude from the voting
		 * configuration. If specified, you may not also specify node_ids.
		 * <p>
		 * API name: {@code node_names}
		 */
		public final Builder nodeNames(String... value) {
			this.nodeNames = Arrays.asList(value);
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
		public final Builder timeout(@Nullable String value) {
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
			_checkSingleUse();

			return new PostVotingConfigExclusionsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code cluster.post_voting_config_exclusions}".
	 */
	public static final Endpoint<PostVotingConfigExclusionsRequest, BooleanResponse, ErrorResponse> ENDPOINT = new BooleanEndpoint<>(
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
				if (ModelTypeHelper.isDefined(request.nodeNames)) {
					params.put("node_names", request.nodeNames.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (ModelTypeHelper.isDefined(request.nodeIds)) {
					params.put("node_ids", request.nodeIds.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, null);
}
