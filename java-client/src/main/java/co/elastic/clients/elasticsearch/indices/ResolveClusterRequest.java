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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.ExpandWildcard;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
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

// typedef: indices.resolve_cluster.Request

/**
 * Resolve the cluster.
 * <p>
 * Resolve the specified index expressions to return information about each
 * cluster, including the local &quot;querying&quot; cluster, if included. If no
 * index expression is provided, the API will return information about all the
 * remote clusters that are configured on the querying cluster.
 * <p>
 * This endpoint is useful before doing a cross-cluster search in order to
 * determine which remote clusters should be included in a search.
 * <p>
 * You use the same index expression with this endpoint as you would for
 * cross-cluster search. Index and cluster exclusions are also supported with
 * this endpoint.
 * <p>
 * For each cluster in the index expression, information is returned about:
 * <ul>
 * <li>Whether the querying (&quot;local&quot;) cluster is currently connected
 * to each remote cluster specified in the index expression. Note that this
 * endpoint actively attempts to contact the remote clusters, unlike the
 * <code>remote/info</code> endpoint.</li>
 * <li>Whether each remote cluster is configured with
 * <code>skip_unavailable</code> as <code>true</code> or
 * <code>false</code>.</li>
 * <li>Whether there are any indices, aliases, or data streams on that cluster
 * that match the index expression.</li>
 * <li>Whether the search is likely to have errors returned when you do the
 * cross-cluster search (including any authorization errors if you do not have
 * permission to query the index).</li>
 * <li>Cluster version information, including the Elasticsearch server
 * version.</li>
 * </ul>
 * <p>
 * For example,
 * <code>GET /_resolve/cluster/my-index-*,cluster*:my-index-*</code> returns
 * information about the local cluster and all remotely configured clusters that
 * start with the alias <code>cluster*</code>. Each cluster returns information
 * about whether it has any indices, aliases or data streams that match
 * <code>my-index-*</code>.
 * <h2>Note on backwards compatibility</h2>
 * <p>
 * The ability to query without an index expression was added in version 8.18,
 * so when querying remote clusters older than that, the local cluster will send
 * the index expression <code>dummy*</code> to those remote clusters. Thus, if
 * an errors occur, you may see a reference to that index expression even though
 * you didn't request it. If it causes a problem, you can instead include an
 * index expression like <code>*:*</code> to bypass the issue.
 * <h2>Advantages of using this endpoint before a cross-cluster search</h2>
 * <p>
 * You may want to exclude a cluster or index from a search when:
 * <ul>
 * <li>A remote cluster is not currently connected and is configured with
 * <code>skip_unavailable=false</code>. Running a cross-cluster search under
 * those conditions will cause the entire search to fail.</li>
 * <li>A cluster has no matching indices, aliases or data streams for the index
 * expression (or your user does not have permissions to search them). For
 * example, suppose your index expression is <code>logs*,remote1:logs*</code>
 * and the remote1 cluster has no indices, aliases or data streams that match
 * <code>logs*</code>. In that case, that cluster will return no results from
 * that cluster if you include it in a cross-cluster search.</li>
 * <li>The index expression (combined with any query parameters you specify)
 * will likely cause an exception to be thrown when you do the search. In these
 * cases, the &quot;error&quot; field in the <code>_resolve/cluster</code>
 * response will be present. (This is also where security/permission errors will
 * be shown.)</li>
 * <li>A remote cluster is an older version that does not support the feature
 * you want to use in your search.</li>
 * </ul>
 * <h2>Test availability of remote clusters</h2>
 * <p>
 * The <code>remote/info</code> endpoint is commonly used to test whether the
 * &quot;local&quot; cluster (the cluster being queried) is connected to its
 * remote clusters, but it does not necessarily reflect whether the remote
 * cluster is available or not. The remote cluster may be available, while the
 * local cluster is not currently connected to it.
 * <p>
 * You can use the <code>_resolve/cluster</code> API to attempt to reconnect to
 * remote clusters. For example with <code>GET _resolve/cluster</code> or
 * <code>GET _resolve/cluster/*:*</code>. The <code>connected</code> field in
 * the response will indicate whether it was successful. If a connection was
 * (re-)established, this will also cause the <code>remote/info</code> endpoint
 * to now indicate a connected status.
 * 
 * @see <a href="../doc-files/api-spec.html#indices.resolve_cluster.Request">API
 *      specification</a>
 */

public class ResolveClusterRequest extends RequestBase {
	@Nullable
	private final Boolean allowNoIndices;

	private final List<ExpandWildcard> expandWildcards;

	@Nullable
	private final Boolean ignoreThrottled;

	@Nullable
	private final Boolean ignoreUnavailable;

	private final List<String> name;

	@Nullable
	private final Time timeout;

	// ---------------------------------------------------------------------------------------------

	private ResolveClusterRequest(Builder builder) {

		this.allowNoIndices = builder.allowNoIndices;
		this.expandWildcards = ApiTypeHelper.unmodifiable(builder.expandWildcards);
		this.ignoreThrottled = builder.ignoreThrottled;
		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.name = ApiTypeHelper.unmodifiable(builder.name);
		this.timeout = builder.timeout;

	}

	public static ResolveClusterRequest of(Function<Builder, ObjectBuilder<ResolveClusterRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * If false, the request returns an error if any wildcard expression, index
	 * alias, or <code>_all</code> value targets only missing or closed indices.
	 * This behavior applies even if the request targets other open indices. For
	 * example, a request targeting <code>foo*,bar*</code> returns an error if an
	 * index starts with <code>foo</code> but no index starts with <code>bar</code>.
	 * NOTE: This option is only supported when specifying an index expression. You
	 * will get an error if you specify index options to the
	 * <code>_resolve/cluster</code> API endpoint that takes no index expression.
	 * <p>
	 * API name: {@code allow_no_indices}
	 */
	@Nullable
	public final Boolean allowNoIndices() {
		return this.allowNoIndices;
	}

	/**
	 * Type of index that wildcard patterns can match. If the request can target
	 * data streams, this argument determines whether wildcard expressions match
	 * hidden data streams. Supports comma-separated values, such as
	 * <code>open,hidden</code>. NOTE: This option is only supported when specifying
	 * an index expression. You will get an error if you specify index options to
	 * the <code>_resolve/cluster</code> API endpoint that takes no index
	 * expression.
	 * <p>
	 * API name: {@code expand_wildcards}
	 */
	public final List<ExpandWildcard> expandWildcards() {
		return this.expandWildcards;
	}

	/**
	 * If true, concrete, expanded, or aliased indices are ignored when frozen.
	 * NOTE: This option is only supported when specifying an index expression. You
	 * will get an error if you specify index options to the
	 * <code>_resolve/cluster</code> API endpoint that takes no index expression.
	 * <p>
	 * API name: {@code ignore_throttled}
	 * 
	 * @deprecated 7.16.0
	 */
	@Deprecated
	@Nullable
	public final Boolean ignoreThrottled() {
		return this.ignoreThrottled;
	}

	/**
	 * If false, the request returns an error if it targets a missing or closed
	 * index. NOTE: This option is only supported when specifying an index
	 * expression. You will get an error if you specify index options to the
	 * <code>_resolve/cluster</code> API endpoint that takes no index expression.
	 * <p>
	 * API name: {@code ignore_unavailable}
	 */
	@Nullable
	public final Boolean ignoreUnavailable() {
		return this.ignoreUnavailable;
	}

	/**
	 * A comma-separated list of names or index patterns for the indices, aliases,
	 * and data streams to resolve. Resources on remote clusters can be specified
	 * using the <code>&lt;cluster&gt;</code>:<code>&lt;name&gt;</code> syntax.
	 * Index and cluster exclusions (e.g., <code>-cluster1:*</code>) are also
	 * supported. If no index expression is specified, information about all remote
	 * clusters configured on the local cluster is returned without doing any index
	 * matching
	 * <p>
	 * API name: {@code name}
	 */
	public final List<String> name() {
		return this.name;
	}

	/**
	 * The maximum time to wait for remote clusters to respond. If a remote cluster
	 * does not respond within this timeout period, the API response will show the
	 * cluster as not connected and include an error message that the request timed
	 * out.
	 * <p>
	 * The default timeout is unset and the query can take as long as the networking
	 * layer is configured to wait for remote clusters that are not responding
	 * (typically 30 seconds).
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ResolveClusterRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ResolveClusterRequest> {
		@Nullable
		private Boolean allowNoIndices;

		@Nullable
		private List<ExpandWildcard> expandWildcards;

		@Nullable
		private Boolean ignoreThrottled;

		@Nullable
		private Boolean ignoreUnavailable;

		@Nullable
		private List<String> name;

		@Nullable
		private Time timeout;

		public Builder() {
		}
		private Builder(ResolveClusterRequest instance) {
			this.allowNoIndices = instance.allowNoIndices;
			this.expandWildcards = instance.expandWildcards;
			this.ignoreThrottled = instance.ignoreThrottled;
			this.ignoreUnavailable = instance.ignoreUnavailable;
			this.name = instance.name;
			this.timeout = instance.timeout;

		}
		/**
		 * If false, the request returns an error if any wildcard expression, index
		 * alias, or <code>_all</code> value targets only missing or closed indices.
		 * This behavior applies even if the request targets other open indices. For
		 * example, a request targeting <code>foo*,bar*</code> returns an error if an
		 * index starts with <code>foo</code> but no index starts with <code>bar</code>.
		 * NOTE: This option is only supported when specifying an index expression. You
		 * will get an error if you specify index options to the
		 * <code>_resolve/cluster</code> API endpoint that takes no index expression.
		 * <p>
		 * API name: {@code allow_no_indices}
		 */
		public final Builder allowNoIndices(@Nullable Boolean value) {
			this.allowNoIndices = value;
			return this;
		}

		/**
		 * Type of index that wildcard patterns can match. If the request can target
		 * data streams, this argument determines whether wildcard expressions match
		 * hidden data streams. Supports comma-separated values, such as
		 * <code>open,hidden</code>. NOTE: This option is only supported when specifying
		 * an index expression. You will get an error if you specify index options to
		 * the <code>_resolve/cluster</code> API endpoint that takes no index
		 * expression.
		 * <p>
		 * API name: {@code expand_wildcards}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>expandWildcards</code>.
		 */
		public final Builder expandWildcards(List<ExpandWildcard> list) {
			this.expandWildcards = _listAddAll(this.expandWildcards, list);
			return this;
		}

		/**
		 * Type of index that wildcard patterns can match. If the request can target
		 * data streams, this argument determines whether wildcard expressions match
		 * hidden data streams. Supports comma-separated values, such as
		 * <code>open,hidden</code>. NOTE: This option is only supported when specifying
		 * an index expression. You will get an error if you specify index options to
		 * the <code>_resolve/cluster</code> API endpoint that takes no index
		 * expression.
		 * <p>
		 * API name: {@code expand_wildcards}
		 * <p>
		 * Adds one or more values to <code>expandWildcards</code>.
		 */
		public final Builder expandWildcards(ExpandWildcard value, ExpandWildcard... values) {
			this.expandWildcards = _listAdd(this.expandWildcards, value, values);
			return this;
		}

		/**
		 * If true, concrete, expanded, or aliased indices are ignored when frozen.
		 * NOTE: This option is only supported when specifying an index expression. You
		 * will get an error if you specify index options to the
		 * <code>_resolve/cluster</code> API endpoint that takes no index expression.
		 * <p>
		 * API name: {@code ignore_throttled}
		 * 
		 * @deprecated 7.16.0
		 */
		@Deprecated
		public final Builder ignoreThrottled(@Nullable Boolean value) {
			this.ignoreThrottled = value;
			return this;
		}

		/**
		 * If false, the request returns an error if it targets a missing or closed
		 * index. NOTE: This option is only supported when specifying an index
		 * expression. You will get an error if you specify index options to the
		 * <code>_resolve/cluster</code> API endpoint that takes no index expression.
		 * <p>
		 * API name: {@code ignore_unavailable}
		 */
		public final Builder ignoreUnavailable(@Nullable Boolean value) {
			this.ignoreUnavailable = value;
			return this;
		}

		/**
		 * A comma-separated list of names or index patterns for the indices, aliases,
		 * and data streams to resolve. Resources on remote clusters can be specified
		 * using the <code>&lt;cluster&gt;</code>:<code>&lt;name&gt;</code> syntax.
		 * Index and cluster exclusions (e.g., <code>-cluster1:*</code>) are also
		 * supported. If no index expression is specified, information about all remote
		 * clusters configured on the local cluster is returned without doing any index
		 * matching
		 * <p>
		 * API name: {@code name}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>name</code>.
		 */
		public final Builder name(List<String> list) {
			this.name = _listAddAll(this.name, list);
			return this;
		}

		/**
		 * A comma-separated list of names or index patterns for the indices, aliases,
		 * and data streams to resolve. Resources on remote clusters can be specified
		 * using the <code>&lt;cluster&gt;</code>:<code>&lt;name&gt;</code> syntax.
		 * Index and cluster exclusions (e.g., <code>-cluster1:*</code>) are also
		 * supported. If no index expression is specified, information about all remote
		 * clusters configured on the local cluster is returned without doing any index
		 * matching
		 * <p>
		 * API name: {@code name}
		 * <p>
		 * Adds one or more values to <code>name</code>.
		 */
		public final Builder name(String value, String... values) {
			this.name = _listAdd(this.name, value, values);
			return this;
		}

		/**
		 * The maximum time to wait for remote clusters to respond. If a remote cluster
		 * does not respond within this timeout period, the API response will show the
		 * cluster as not connected and include an error message that the request timed
		 * out.
		 * <p>
		 * The default timeout is unset and the query can take as long as the networking
		 * layer is configured to wait for remote clusters that are not responding
		 * (typically 30 seconds).
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * The maximum time to wait for remote clusters to respond. If a remote cluster
		 * does not respond within this timeout period, the API response will show the
		 * cluster as not connected and include an error message that the request timed
		 * out.
		 * <p>
		 * The default timeout is unset and the query can take as long as the networking
		 * layer is configured to wait for remote clusters that are not responding
		 * (typically 30 seconds).
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
		 * Builds a {@link ResolveClusterRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ResolveClusterRequest build() {
			_checkSingleUse();

			return new ResolveClusterRequest(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.resolve_cluster}".
	 */
	public static final Endpoint<ResolveClusterRequest, ResolveClusterResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/indices.resolve_cluster",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _name = 1 << 0;

				int propsSet = 0;

				if (ApiTypeHelper.isDefined(request.name()))
					propsSet |= _name;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_resolve");
					buf.append("/cluster");
					return buf.toString();
				}
				if (propsSet == (_name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_resolve");
					buf.append("/cluster");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.name.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _name = 1 << 0;

				int propsSet = 0;

				if (ApiTypeHelper.isDefined(request.name()))
					propsSet |= _name;

				if (propsSet == 0) {
				}
				if (propsSet == (_name)) {
					params.put("name", request.name.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (ApiTypeHelper.isDefined(request.expandWildcards)) {
					params.put("expand_wildcards",
							request.expandWildcards.stream().map(v -> v.jsonValue()).collect(Collectors.joining(",")));
				}
				if (request.ignoreUnavailable != null) {
					params.put("ignore_unavailable", String.valueOf(request.ignoreUnavailable));
				}
				if (request.allowNoIndices != null) {
					params.put("allow_no_indices", String.valueOf(request.allowNoIndices));
				}
				if (request.ignoreThrottled != null) {
					params.put("ignore_throttled", String.valueOf(request.ignoreThrottled));
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, ResolveClusterResponse._DESERIALIZER);
}
