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

package co.elastic.clients.elasticsearch.core;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.ExpandWildcard;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.SearchType;
import co.elastic.clients.elasticsearch.core.msearch.RequestItem;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.NdJsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: _global.msearch.Request

/**
 * Allows to execute several search operations in one request.
 * 
 * @see <a href="../doc-files/api-spec.html#_global.msearch.Request">API
 *      specification</a>
 */

public class MsearchRequest extends RequestBase implements NdJsonpSerializable, JsonpSerializable {
	@Nullable
	private final Boolean allowNoIndices;

	@Nullable
	private final Boolean ccsMinimizeRoundtrips;

	private final List<ExpandWildcard> expandWildcards;

	@Nullable
	private final Boolean ignoreThrottled;

	@Nullable
	private final Boolean ignoreUnavailable;

	private final List<String> index;

	@Nullable
	private final Long maxConcurrentSearches;

	@Nullable
	private final Long maxConcurrentShardRequests;

	@Nullable
	private final Long preFilterShardSize;

	@Nullable
	private final String routing;

	@Nullable
	private final SearchType searchType;

	private final List<RequestItem> searches;

	// ---------------------------------------------------------------------------------------------

	private MsearchRequest(Builder builder) {

		this.allowNoIndices = builder.allowNoIndices;
		this.ccsMinimizeRoundtrips = builder.ccsMinimizeRoundtrips;
		this.expandWildcards = ApiTypeHelper.unmodifiable(builder.expandWildcards);
		this.ignoreThrottled = builder.ignoreThrottled;
		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.index = ApiTypeHelper.unmodifiable(builder.index);
		this.maxConcurrentSearches = builder.maxConcurrentSearches;
		this.maxConcurrentShardRequests = builder.maxConcurrentShardRequests;
		this.preFilterShardSize = builder.preFilterShardSize;
		this.routing = builder.routing;
		this.searchType = builder.searchType;
		this.searches = ApiTypeHelper.unmodifiableRequired(builder.searches, this, "searches");

	}

	public static MsearchRequest of(Function<Builder, ObjectBuilder<MsearchRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	@Override
	public Iterator<?> _serializables() {
		return this.searches.iterator();
	}
	/**
	 * If false, the request returns an error if any wildcard expression, index
	 * alias, or _all value targets only missing or closed indices. This behavior
	 * applies even if the request targets other open indices. For example, a
	 * request targeting foo*,bar* returns an error if an index starts with foo but
	 * no index starts with bar.
	 * <p>
	 * API name: {@code allow_no_indices}
	 */
	@Nullable
	public final Boolean allowNoIndices() {
		return this.allowNoIndices;
	}

	/**
	 * If true, network roundtrips between the coordinating node and remote clusters
	 * are minimized for cross-cluster search requests.
	 * <p>
	 * API name: {@code ccs_minimize_roundtrips}
	 */
	@Nullable
	public final Boolean ccsMinimizeRoundtrips() {
		return this.ccsMinimizeRoundtrips;
	}

	/**
	 * Type of index that wildcard expressions can match. If the request can target
	 * data streams, this argument determines whether wildcard expressions match
	 * hidden data streams.
	 * <p>
	 * API name: {@code expand_wildcards}
	 */
	public final List<ExpandWildcard> expandWildcards() {
		return this.expandWildcards;
	}

	/**
	 * If true, concrete, expanded or aliased indices are ignored when frozen.
	 * <p>
	 * API name: {@code ignore_throttled}
	 */
	@Nullable
	public final Boolean ignoreThrottled() {
		return this.ignoreThrottled;
	}

	/**
	 * If true, missing or closed indices are not included in the response.
	 * <p>
	 * API name: {@code ignore_unavailable}
	 */
	@Nullable
	public final Boolean ignoreUnavailable() {
		return this.ignoreUnavailable;
	}

	/**
	 * Comma-separated list of data streams, indices, and index aliases to search.
	 * <p>
	 * API name: {@code index}
	 */
	public final List<String> index() {
		return this.index;
	}

	/**
	 * Maximum number of concurrent searches the multi search API can execute.
	 * <p>
	 * API name: {@code max_concurrent_searches}
	 */
	@Nullable
	public final Long maxConcurrentSearches() {
		return this.maxConcurrentSearches;
	}

	/**
	 * Maximum number of concurrent shard requests that each sub-search request
	 * executes per node.
	 * <p>
	 * API name: {@code max_concurrent_shard_requests}
	 */
	@Nullable
	public final Long maxConcurrentShardRequests() {
		return this.maxConcurrentShardRequests;
	}

	/**
	 * Defines a threshold that enforces a pre-filter roundtrip to prefilter search
	 * shards based on query rewriting if the number of shards the search request
	 * expands to exceeds the threshold. This filter roundtrip can limit the number
	 * of shards significantly if for instance a shard can not match any documents
	 * based on its rewrite method i.e., if date filters are mandatory to match but
	 * the shard bounds and the query are disjoint.
	 * <p>
	 * API name: {@code pre_filter_shard_size}
	 */
	@Nullable
	public final Long preFilterShardSize() {
		return this.preFilterShardSize;
	}

	/**
	 * Custom routing value used to route search operations to a specific shard.
	 * <p>
	 * API name: {@code routing}
	 */
	@Nullable
	public final String routing() {
		return this.routing;
	}

	/**
	 * Indicates whether global term and document frequencies should be used when
	 * scoring returned documents.
	 * <p>
	 * API name: {@code search_type}
	 */
	@Nullable
	public final SearchType searchType() {
		return this.searchType;
	}

	/**
	 * Required - Request body.
	 */
	public final List<RequestItem> searches() {
		return this.searches;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartArray();
		for (RequestItem item0 : this.searches) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MsearchRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder> implements ObjectBuilder<MsearchRequest> {
		@Nullable
		private Boolean allowNoIndices;

		@Nullable
		private Boolean ccsMinimizeRoundtrips;

		@Nullable
		private List<ExpandWildcard> expandWildcards;

		@Nullable
		private Boolean ignoreThrottled;

		@Nullable
		private Boolean ignoreUnavailable;

		@Nullable
		private List<String> index;

		@Nullable
		private Long maxConcurrentSearches;

		@Nullable
		private Long maxConcurrentShardRequests;

		@Nullable
		private Long preFilterShardSize;

		@Nullable
		private String routing;

		@Nullable
		private SearchType searchType;

		private List<RequestItem> searches;

		/**
		 * If false, the request returns an error if any wildcard expression, index
		 * alias, or _all value targets only missing or closed indices. This behavior
		 * applies even if the request targets other open indices. For example, a
		 * request targeting foo*,bar* returns an error if an index starts with foo but
		 * no index starts with bar.
		 * <p>
		 * API name: {@code allow_no_indices}
		 */
		public final Builder allowNoIndices(@Nullable Boolean value) {
			this.allowNoIndices = value;
			return this;
		}

		/**
		 * If true, network roundtrips between the coordinating node and remote clusters
		 * are minimized for cross-cluster search requests.
		 * <p>
		 * API name: {@code ccs_minimize_roundtrips}
		 */
		public final Builder ccsMinimizeRoundtrips(@Nullable Boolean value) {
			this.ccsMinimizeRoundtrips = value;
			return this;
		}

		/**
		 * Type of index that wildcard expressions can match. If the request can target
		 * data streams, this argument determines whether wildcard expressions match
		 * hidden data streams.
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
		 * Type of index that wildcard expressions can match. If the request can target
		 * data streams, this argument determines whether wildcard expressions match
		 * hidden data streams.
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
		 * If true, concrete, expanded or aliased indices are ignored when frozen.
		 * <p>
		 * API name: {@code ignore_throttled}
		 */
		public final Builder ignoreThrottled(@Nullable Boolean value) {
			this.ignoreThrottled = value;
			return this;
		}

		/**
		 * If true, missing or closed indices are not included in the response.
		 * <p>
		 * API name: {@code ignore_unavailable}
		 */
		public final Builder ignoreUnavailable(@Nullable Boolean value) {
			this.ignoreUnavailable = value;
			return this;
		}

		/**
		 * Comma-separated list of data streams, indices, and index aliases to search.
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
		 * Comma-separated list of data streams, indices, and index aliases to search.
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
		 * Maximum number of concurrent searches the multi search API can execute.
		 * <p>
		 * API name: {@code max_concurrent_searches}
		 */
		public final Builder maxConcurrentSearches(@Nullable Long value) {
			this.maxConcurrentSearches = value;
			return this;
		}

		/**
		 * Maximum number of concurrent shard requests that each sub-search request
		 * executes per node.
		 * <p>
		 * API name: {@code max_concurrent_shard_requests}
		 */
		public final Builder maxConcurrentShardRequests(@Nullable Long value) {
			this.maxConcurrentShardRequests = value;
			return this;
		}

		/**
		 * Defines a threshold that enforces a pre-filter roundtrip to prefilter search
		 * shards based on query rewriting if the number of shards the search request
		 * expands to exceeds the threshold. This filter roundtrip can limit the number
		 * of shards significantly if for instance a shard can not match any documents
		 * based on its rewrite method i.e., if date filters are mandatory to match but
		 * the shard bounds and the query are disjoint.
		 * <p>
		 * API name: {@code pre_filter_shard_size}
		 */
		public final Builder preFilterShardSize(@Nullable Long value) {
			this.preFilterShardSize = value;
			return this;
		}

		/**
		 * Custom routing value used to route search operations to a specific shard.
		 * <p>
		 * API name: {@code routing}
		 */
		public final Builder routing(@Nullable String value) {
			this.routing = value;
			return this;
		}

		/**
		 * Indicates whether global term and document frequencies should be used when
		 * scoring returned documents.
		 * <p>
		 * API name: {@code search_type}
		 */
		public final Builder searchType(@Nullable SearchType value) {
			this.searchType = value;
			return this;
		}

		/**
		 * Required - Request body.
		 * <p>
		 * Adds all elements of <code>list</code> to <code>searches</code>.
		 */
		public final Builder searches(List<RequestItem> list) {
			this.searches = _listAddAll(this.searches, list);
			return this;
		}

		/**
		 * Required - Request body.
		 * <p>
		 * Adds one or more values to <code>searches</code>.
		 */
		public final Builder searches(RequestItem value, RequestItem... values) {
			this.searches = _listAdd(this.searches, value, values);
			return this;
		}

		/**
		 * Required - Request body.
		 * <p>
		 * Adds a value to <code>searches</code> using a builder lambda.
		 */
		public final Builder searches(Function<RequestItem.Builder, ObjectBuilder<RequestItem>> fn) {
			return searches(fn.apply(new RequestItem.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MsearchRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MsearchRequest build() {
			_checkSingleUse();

			return new MsearchRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code msearch}".
	 */
	public static final SimpleEndpoint<MsearchRequest, ?> _ENDPOINT = new SimpleEndpoint<>("es/msearch",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;

				int propsSet = 0;

				if (ApiTypeHelper.isDefined(request.index()))
					propsSet |= _index;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_msearch");
					return buf.toString();
				}
				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					buf.append("/_msearch");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _index = 1 << 0;

				int propsSet = 0;

				if (ApiTypeHelper.isDefined(request.index()))
					propsSet |= _index;

				if (propsSet == 0) {
				}
				if (propsSet == (_index)) {
					params.put("index", request.index.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				params.put("typed_keys", "true");
				if (request.routing != null) {
					params.put("routing", request.routing);
				}
				if (request.preFilterShardSize != null) {
					params.put("pre_filter_shard_size", String.valueOf(request.preFilterShardSize));
				}
				if (request.maxConcurrentShardRequests != null) {
					params.put("max_concurrent_shard_requests", String.valueOf(request.maxConcurrentShardRequests));
				}
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
				if (request.maxConcurrentSearches != null) {
					params.put("max_concurrent_searches", String.valueOf(request.maxConcurrentSearches));
				}
				if (request.searchType != null) {
					params.put("search_type", request.searchType.jsonValue());
				}
				if (request.ccsMinimizeRoundtrips != null) {
					params.put("ccs_minimize_roundtrips", String.valueOf(request.ccsMinimizeRoundtrips));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, MsearchResponse._DESERIALIZER);

	/**
	 * Create an "{@code msearch}" endpoint.
	 */
	public static <TDocument> Endpoint<MsearchRequest, MsearchResponse<TDocument>, ErrorResponse> createMsearchEndpoint(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return _ENDPOINT
				.withResponseDeserializer(MsearchResponse.createMsearchResponseDeserializer(tDocumentDeserializer));
	}
}
