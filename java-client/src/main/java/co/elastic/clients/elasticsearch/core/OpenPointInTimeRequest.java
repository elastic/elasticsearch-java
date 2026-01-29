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

package co.elastic.clients.elasticsearch.core;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.ExpandWildcard;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.elasticsearch._types.query_dsl.QueryVariant;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
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

// typedef: _global.open_point_in_time.Request

/**
 * Open a point in time.
 * <p>
 * A search request by default runs against the most recent visible data of the
 * target indices, which is called point in time. Elasticsearch pit (point in
 * time) is a lightweight view into the state of the data as it existed when
 * initiated. In some cases, it’s preferred to perform multiple search requests
 * using the same point in time. For example, if refreshes happen between
 * <code>search_after</code> requests, then the results of those requests might
 * not be consistent as changes happening between searches are only visible to
 * the more recent point in time.
 * <p>
 * A point in time must be opened explicitly before being used in search
 * requests.
 * <p>
 * A subsequent search request with the <code>pit</code> parameter must not
 * specify <code>index</code>, <code>routing</code>, or <code>preference</code>
 * values as these parameters are copied from the point in time.
 * <p>
 * Just like regular searches, you can use <code>from</code> and
 * <code>size</code> to page through point in time search results, up to the
 * first 10,000 hits. If you want to retrieve more hits, use PIT with
 * <code>search_after</code>.
 * <p>
 * IMPORTANT: The open point in time request and each subsequent search request
 * can return different identifiers; always use the most recently received ID
 * for the next search request.
 * <p>
 * When a PIT that contains shard failures is used in a search request, the
 * missing are always reported in the search response as a
 * <code>NoShardAvailableActionException</code> exception. To get rid of these
 * exceptions, a new PIT needs to be created so that shards missing from the
 * previous PIT can be handled, assuming they become available in the meantime.
 * <p>
 * <strong>Keeping point in time alive</strong>
 * <p>
 * The <code>keep_alive</code> parameter, which is passed to a open point in
 * time request and search request, extends the time to live of the
 * corresponding point in time. The value does not need to be long enough to
 * process all data — it just needs to be long enough for the next request.
 * <p>
 * Normally, the background merge process optimizes the index by merging
 * together smaller segments to create new, bigger segments. Once the smaller
 * segments are no longer needed they are deleted. However, open point-in-times
 * prevent the old segments from being deleted since they are still in use.
 * <p>
 * TIP: Keeping older segments alive means that more disk space and file handles
 * are needed. Ensure that you have configured your nodes to have ample free
 * file handles.
 * <p>
 * Additionally, if a segment contains deleted or updated documents then the
 * point in time must keep track of whether each document in the segment was
 * live at the time of the initial search request. Ensure that your nodes have
 * sufficient heap space if you have many open point-in-times on an index that
 * is subject to ongoing deletes or updates. Note that a point-in-time doesn't
 * prevent its associated indices from being deleted. You can check how many
 * point-in-times (that is, search contexts) are open with the nodes stats API.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#_global.open_point_in_time.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class OpenPointInTimeRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Boolean allowPartialSearchResults;

	private final List<ExpandWildcard> expandWildcards;

	@Nullable
	private final Boolean ignoreUnavailable;

	private final List<String> index;

	@Nullable
	private final Query indexFilter;

	private final Time keepAlive;

	@Nullable
	private final Integer maxConcurrentShardRequests;

	@Nullable
	private final String preference;

	@Nullable
	private final String projectRouting;

	@Nullable
	private final String routing;

	// ---------------------------------------------------------------------------------------------

	private OpenPointInTimeRequest(Builder builder) {

		this.allowPartialSearchResults = builder.allowPartialSearchResults;
		this.expandWildcards = ApiTypeHelper.unmodifiable(builder.expandWildcards);
		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.index = ApiTypeHelper.unmodifiableRequired(builder.index, this, "index");
		this.indexFilter = builder.indexFilter;
		this.keepAlive = ApiTypeHelper.requireNonNull(builder.keepAlive, this, "keepAlive");
		this.maxConcurrentShardRequests = builder.maxConcurrentShardRequests;
		this.preference = builder.preference;
		this.projectRouting = builder.projectRouting;
		this.routing = builder.routing;

	}

	public static OpenPointInTimeRequest of(Function<Builder, ObjectBuilder<OpenPointInTimeRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Indicates whether the point in time tolerates unavailable shards or shard
	 * failures when initially creating the PIT. If <code>false</code>, creating a
	 * point in time request when a shard is missing or unavailable will throw an
	 * exception. If <code>true</code>, the point in time will contain all the
	 * shards that are available at the time of the request.
	 * <p>
	 * API name: {@code allow_partial_search_results}
	 */
	@Nullable
	public final Boolean allowPartialSearchResults() {
		return this.allowPartialSearchResults;
	}

	/**
	 * The type of index that wildcard patterns can match. If the request can target
	 * data streams, this argument determines whether wildcard expressions match
	 * hidden data streams. It supports comma-separated values, such as
	 * <code>open,hidden</code>.
	 * <p>
	 * API name: {@code expand_wildcards}
	 */
	public final List<ExpandWildcard> expandWildcards() {
		return this.expandWildcards;
	}

	/**
	 * If <code>false</code>, the request returns an error if it targets a missing
	 * or closed index.
	 * <p>
	 * API name: {@code ignore_unavailable}
	 */
	@Nullable
	public final Boolean ignoreUnavailable() {
		return this.ignoreUnavailable;
	}

	/**
	 * Required - A comma-separated list of index names to open point in time; use
	 * <code>_all</code> or empty string to perform the operation on all indices
	 * <p>
	 * API name: {@code index}
	 */
	public final List<String> index() {
		return this.index;
	}

	/**
	 * Filter indices if the provided query rewrites to <code>match_none</code> on
	 * every shard.
	 * <p>
	 * API name: {@code index_filter}
	 */
	@Nullable
	public final Query indexFilter() {
		return this.indexFilter;
	}

	/**
	 * Required - Extend the length of time that the point in time persists.
	 * <p>
	 * API name: {@code keep_alive}
	 */
	public final Time keepAlive() {
		return this.keepAlive;
	}

	/**
	 * Maximum number of concurrent shard requests that each sub-search request
	 * executes per node.
	 * <p>
	 * API name: {@code max_concurrent_shard_requests}
	 */
	@Nullable
	public final Integer maxConcurrentShardRequests() {
		return this.maxConcurrentShardRequests;
	}

	/**
	 * The node or shard the operation should be performed on. By default, it is
	 * random.
	 * <p>
	 * API name: {@code preference}
	 */
	@Nullable
	public final String preference() {
		return this.preference;
	}

	/**
	 * Specifies a subset of projects to target for the PIT request using project
	 * metadata tags in a subset of Lucene query syntax. Allowed Lucene queries: the
	 * _alias tag and a single value (possibly wildcarded). Examples:
	 * _alias:my-project _alias:_origin _alias:<em>pr</em> Supported in serverless
	 * only.
	 * <p>
	 * API name: {@code project_routing}
	 */
	@Nullable
	public final String projectRouting() {
		return this.projectRouting;
	}

	/**
	 * A custom value that is used to route operations to a specific shard.
	 * <p>
	 * API name: {@code routing}
	 */
	@Nullable
	public final String routing() {
		return this.routing;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.indexFilter != null) {
			generator.writeKey("index_filter");
			this.indexFilter.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link OpenPointInTimeRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<OpenPointInTimeRequest> {
		@Nullable
		private Boolean allowPartialSearchResults;

		@Nullable
		private List<ExpandWildcard> expandWildcards;

		@Nullable
		private Boolean ignoreUnavailable;

		private List<String> index;

		@Nullable
		private Query indexFilter;

		private Time keepAlive;

		@Nullable
		private Integer maxConcurrentShardRequests;

		@Nullable
		private String preference;

		@Nullable
		private String projectRouting;

		@Nullable
		private String routing;

		public Builder() {
		}
		private Builder(OpenPointInTimeRequest instance) {
			this.allowPartialSearchResults = instance.allowPartialSearchResults;
			this.expandWildcards = instance.expandWildcards;
			this.ignoreUnavailable = instance.ignoreUnavailable;
			this.index = instance.index;
			this.indexFilter = instance.indexFilter;
			this.keepAlive = instance.keepAlive;
			this.maxConcurrentShardRequests = instance.maxConcurrentShardRequests;
			this.preference = instance.preference;
			this.projectRouting = instance.projectRouting;
			this.routing = instance.routing;

		}
		/**
		 * Indicates whether the point in time tolerates unavailable shards or shard
		 * failures when initially creating the PIT. If <code>false</code>, creating a
		 * point in time request when a shard is missing or unavailable will throw an
		 * exception. If <code>true</code>, the point in time will contain all the
		 * shards that are available at the time of the request.
		 * <p>
		 * API name: {@code allow_partial_search_results}
		 */
		public final Builder allowPartialSearchResults(@Nullable Boolean value) {
			this.allowPartialSearchResults = value;
			return this;
		}

		/**
		 * The type of index that wildcard patterns can match. If the request can target
		 * data streams, this argument determines whether wildcard expressions match
		 * hidden data streams. It supports comma-separated values, such as
		 * <code>open,hidden</code>.
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
		 * The type of index that wildcard patterns can match. If the request can target
		 * data streams, this argument determines whether wildcard expressions match
		 * hidden data streams. It supports comma-separated values, such as
		 * <code>open,hidden</code>.
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
		 * If <code>false</code>, the request returns an error if it targets a missing
		 * or closed index.
		 * <p>
		 * API name: {@code ignore_unavailable}
		 */
		public final Builder ignoreUnavailable(@Nullable Boolean value) {
			this.ignoreUnavailable = value;
			return this;
		}

		/**
		 * Required - A comma-separated list of index names to open point in time; use
		 * <code>_all</code> or empty string to perform the operation on all indices
		 * <p>
		 * API name: {@code index}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>index</code>.
		 */
		public final Builder index(List<String> list) {
			this.index = _listAddAll(this.index, list);
			return this;
		}

		/**
		 * Required - A comma-separated list of index names to open point in time; use
		 * <code>_all</code> or empty string to perform the operation on all indices
		 * <p>
		 * API name: {@code index}
		 * <p>
		 * Adds one or more values to <code>index</code>.
		 */
		public final Builder index(String value, String... values) {
			this.index = _listAdd(this.index, value, values);
			return this;
		}

		/**
		 * Filter indices if the provided query rewrites to <code>match_none</code> on
		 * every shard.
		 * <p>
		 * API name: {@code index_filter}
		 */
		public final Builder indexFilter(@Nullable Query value) {
			this.indexFilter = value;
			return this;
		}

		/**
		 * Filter indices if the provided query rewrites to <code>match_none</code> on
		 * every shard.
		 * <p>
		 * API name: {@code index_filter}
		 */
		public final Builder indexFilter(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.indexFilter(fn.apply(new Query.Builder()).build());
		}

		/**
		 * Filter indices if the provided query rewrites to <code>match_none</code> on
		 * every shard.
		 * <p>
		 * API name: {@code index_filter}
		 */
		public final Builder indexFilter(QueryVariant value) {
			this.indexFilter = value._toQuery();
			return this;
		}

		/**
		 * Required - Extend the length of time that the point in time persists.
		 * <p>
		 * API name: {@code keep_alive}
		 */
		public final Builder keepAlive(Time value) {
			this.keepAlive = value;
			return this;
		}

		/**
		 * Required - Extend the length of time that the point in time persists.
		 * <p>
		 * API name: {@code keep_alive}
		 */
		public final Builder keepAlive(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.keepAlive(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Maximum number of concurrent shard requests that each sub-search request
		 * executes per node.
		 * <p>
		 * API name: {@code max_concurrent_shard_requests}
		 */
		public final Builder maxConcurrentShardRequests(@Nullable Integer value) {
			this.maxConcurrentShardRequests = value;
			return this;
		}

		/**
		 * The node or shard the operation should be performed on. By default, it is
		 * random.
		 * <p>
		 * API name: {@code preference}
		 */
		public final Builder preference(@Nullable String value) {
			this.preference = value;
			return this;
		}

		/**
		 * Specifies a subset of projects to target for the PIT request using project
		 * metadata tags in a subset of Lucene query syntax. Allowed Lucene queries: the
		 * _alias tag and a single value (possibly wildcarded). Examples:
		 * _alias:my-project _alias:_origin _alias:<em>pr</em> Supported in serverless
		 * only.
		 * <p>
		 * API name: {@code project_routing}
		 */
		public final Builder projectRouting(@Nullable String value) {
			this.projectRouting = value;
			return this;
		}

		/**
		 * A custom value that is used to route operations to a specific shard.
		 * <p>
		 * API name: {@code routing}
		 */
		public final Builder routing(@Nullable String value) {
			this.routing = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link OpenPointInTimeRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public OpenPointInTimeRequest build() {
			_checkSingleUse();

			return new OpenPointInTimeRequest(this);
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
	 * Json deserializer for {@link OpenPointInTimeRequest}
	 */
	public static final JsonpDeserializer<OpenPointInTimeRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, OpenPointInTimeRequest::setupOpenPointInTimeRequestDeserializer);

	protected static void setupOpenPointInTimeRequestDeserializer(
			ObjectDeserializer<OpenPointInTimeRequest.Builder> op) {

		op.add(Builder::indexFilter, Query._DESERIALIZER, "index_filter");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code open_point_in_time}".
	 */
	public static final Endpoint<OpenPointInTimeRequest, OpenPointInTimeResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/open_point_in_time",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;

				int propsSet = 0;

				propsSet |= _index;

				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					buf.append("/_pit");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _index = 1 << 0;

				int propsSet = 0;

				propsSet |= _index;

				if (propsSet == (_index)) {
					params.put("index", request.index.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.routing != null) {
					params.put("routing", request.routing);
				}
				if (request.maxConcurrentShardRequests != null) {
					params.put("max_concurrent_shard_requests", String.valueOf(request.maxConcurrentShardRequests));
				}
				if (request.allowPartialSearchResults != null) {
					params.put("allow_partial_search_results", String.valueOf(request.allowPartialSearchResults));
				}
				if (request.ignoreUnavailable != null) {
					params.put("ignore_unavailable", String.valueOf(request.ignoreUnavailable));
				}
				if (ApiTypeHelper.isDefined(request.expandWildcards)) {
					params.put("expand_wildcards",
							request.expandWildcards.stream().map(v -> v.jsonValue()).collect(Collectors.joining(",")));
				}
				if (request.preference != null) {
					params.put("preference", request.preference);
				}
				params.put("keep_alive", request.keepAlive._toJsonString());
				if (request.projectRouting != null) {
					params.put("project_routing", request.projectRouting);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, OpenPointInTimeResponse._DESERIALIZER);
}
