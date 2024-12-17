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

package co.elastic.clients.elasticsearch.cluster;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.BooleanEndpoint;
import co.elastic.clients.transport.endpoints.BooleanResponse;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

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

// typedef: cluster.post_voting_config_exclusions.Request

/**
 * Update voting configuration exclusions. Update the cluster voting config
 * exclusions by node IDs or node names. By default, if there are more than
 * three master-eligible nodes in the cluster and you remove fewer than half of
 * the master-eligible nodes in the cluster at once, the voting configuration
 * automatically shrinks. If you want to shrink the voting configuration to
 * contain fewer than three nodes or to remove half or more of the
 * master-eligible nodes in the cluster at once, use this API to remove
 * departing nodes from the voting configuration manually. The API adds an entry
 * for each specified node to the cluster’s voting configuration exclusions
 * list. It then waits until the cluster has reconfigured its voting
 * configuration to exclude the specified nodes.
 * <p>
 * Clusters should have no voting configuration exclusions in normal operation.
 * Once the excluded nodes have stopped, clear the voting configuration
 * exclusions with <code>DELETE /_cluster/voting_config_exclusions</code>. This
 * API waits for the nodes to be fully removed from the cluster before it
 * returns. If your cluster has voting configuration exclusions for nodes that
 * you no longer intend to remove, use
 * <code>DELETE /_cluster/voting_config_exclusions?wait_for_removal=false</code>
 * to clear the voting configuration exclusions without waiting for the nodes to
 * leave the cluster.
 * <p>
 * A response to <code>POST /_cluster/voting_config_exclusions</code> with an
 * HTTP status code of 200 OK guarantees that the node has been removed from the
 * voting configuration and will not be reinstated until the voting
 * configuration exclusions are cleared by calling
 * <code>DELETE /_cluster/voting_config_exclusions</code>. If the call to
 * <code>POST /_cluster/voting_config_exclusions</code> fails or returns a
 * response with an HTTP status code other than 200 OK then the node may not
 * have been removed from the voting configuration. In that case, you may safely
 * retry the call.
 * <p>
 * NOTE: Voting exclusions are required only when you remove at least half of
 * the master-eligible nodes from a cluster in a short time period. They are not
 * required when removing master-ineligible nodes or when removing fewer than
 * half of the master-eligible nodes.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#cluster.post_voting_config_exclusions.Request">API
 *      specification</a>
 */

public class PostVotingConfigExclusionsRequest extends RequestBase {
	private final List<String> nodeIds;

	private final List<String> nodeNames;

	@Nullable
	private final Time timeout;

	// ---------------------------------------------------------------------------------------------

	private PostVotingConfigExclusionsRequest(Builder builder) {

		this.nodeIds = ApiTypeHelper.unmodifiable(builder.nodeIds);
		this.nodeNames = ApiTypeHelper.unmodifiable(builder.nodeNames);
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
	public final Time timeout() {
		return this.timeout;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PostVotingConfigExclusionsRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PostVotingConfigExclusionsRequest> {
		@Nullable
		private List<String> nodeIds;

		@Nullable
		private List<String> nodeNames;

		@Nullable
		private Time timeout;

		/**
		 * A comma-separated list of the persistent ids of the nodes to exclude from the
		 * voting configuration. If specified, you may not also specify node_names.
		 * <p>
		 * API name: {@code node_ids}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>nodeIds</code>.
		 */
		public final Builder nodeIds(List<String> list) {
			this.nodeIds = _listAddAll(this.nodeIds, list);
			return this;
		}

		/**
		 * A comma-separated list of the persistent ids of the nodes to exclude from the
		 * voting configuration. If specified, you may not also specify node_names.
		 * <p>
		 * API name: {@code node_ids}
		 * <p>
		 * Adds one or more values to <code>nodeIds</code>.
		 */
		public final Builder nodeIds(String value, String... values) {
			this.nodeIds = _listAdd(this.nodeIds, value, values);
			return this;
		}

		/**
		 * A comma-separated list of the names of the nodes to exclude from the voting
		 * configuration. If specified, you may not also specify node_ids.
		 * <p>
		 * API name: {@code node_names}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>nodeNames</code>.
		 */
		public final Builder nodeNames(List<String> list) {
			this.nodeNames = _listAddAll(this.nodeNames, list);
			return this;
		}

		/**
		 * A comma-separated list of the names of the nodes to exclude from the voting
		 * configuration. If specified, you may not also specify node_ids.
		 * <p>
		 * API name: {@code node_names}
		 * <p>
		 * Adds one or more values to <code>nodeNames</code>.
		 */
		public final Builder nodeNames(String value, String... values) {
			this.nodeNames = _listAdd(this.nodeNames, value, values);
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
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
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
		public final Builder timeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeout(fn.apply(new Time.Builder()).build());
		}

		@Override
		protected Builder self() {
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
	public static final Endpoint<PostVotingConfigExclusionsRequest, BooleanResponse, ErrorResponse> _ENDPOINT = new BooleanEndpoint<>(
			"es/cluster.post_voting_config_exclusions",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_cluster/voting_config_exclusions";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (ApiTypeHelper.isDefined(request.nodeNames)) {
					params.put("node_names", request.nodeNames.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (ApiTypeHelper.isDefined(request.nodeIds)) {
					params.put("node_ids", request.nodeIds.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, null);
}
