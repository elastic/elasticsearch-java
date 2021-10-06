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

package co.elastic.clients.elasticsearch._core;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.base.SimpleEndpoint;
import co.elastic.clients.elasticsearch._types.ExpandWildcardOptions;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.SearchType;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: _global.msearch.Request
@JsonpDeserializable
public final class MsearchRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final List<String> index;

	@Nullable
	private final Boolean allowNoIndices;

	@Nullable
	private final Boolean ccsMinimizeRoundtrips;

	@Nullable
	private final List<ExpandWildcardOptions> expandWildcards;

	@Nullable
	private final Boolean ignoreThrottled;

	@Nullable
	private final Boolean ignoreUnavailable;

	@Nullable
	private final Long maxConcurrentSearches;

	@Nullable
	private final Long maxConcurrentShardRequests;

	@Nullable
	private final Long preFilterShardSize;

	@Nullable
	private final SearchType searchType;

	@Nullable
	private final Boolean typedKeys;

	private final List<JsonValue /* Union(_global.msearch.Body | _global.msearch.Header) */> searches;

	// ---------------------------------------------------------------------------------------------

	public MsearchRequest(Builder builder) {

		this.index = ModelTypeHelper.unmodifiable(builder.index);
		this.allowNoIndices = builder.allowNoIndices;
		this.ccsMinimizeRoundtrips = builder.ccsMinimizeRoundtrips;
		this.expandWildcards = ModelTypeHelper.unmodifiable(builder.expandWildcards);
		this.ignoreThrottled = builder.ignoreThrottled;
		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.maxConcurrentSearches = builder.maxConcurrentSearches;
		this.maxConcurrentShardRequests = builder.maxConcurrentShardRequests;
		this.preFilterShardSize = builder.preFilterShardSize;
		this.searchType = builder.searchType;
		this.typedKeys = builder.typedKeys;
		this.searches = ModelTypeHelper.unmodifiableNonNull(builder.searches, "_value_body");

	}

	public MsearchRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Comma-separated list of data streams, indices, and index aliases to search.
	 * <p>
	 * API name: {@code index}
	 */
	@Nullable
	public List<String> index() {
		return this.index;
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
	public Boolean allowNoIndices() {
		return this.allowNoIndices;
	}

	/**
	 * If true, network roundtrips between the coordinating node and remote clusters
	 * are minimized for cross-cluster search requests.
	 * <p>
	 * API name: {@code ccs_minimize_roundtrips}
	 */
	@Nullable
	public Boolean ccsMinimizeRoundtrips() {
		return this.ccsMinimizeRoundtrips;
	}

	/**
	 * Type of index that wildcard expressions can match. If the request can target
	 * data streams, this argument determines whether wildcard expressions match
	 * hidden data streams.
	 * <p>
	 * API name: {@code expand_wildcards}
	 */
	@Nullable
	public List<ExpandWildcardOptions> expandWildcards() {
		return this.expandWildcards;
	}

	/**
	 * If true, concrete, expanded or aliased indices are ignored when frozen.
	 * <p>
	 * API name: {@code ignore_throttled}
	 */
	@Nullable
	public Boolean ignoreThrottled() {
		return this.ignoreThrottled;
	}

	/**
	 * If true, missing or closed indices are not included in the response.
	 * <p>
	 * API name: {@code ignore_unavailable}
	 */
	@Nullable
	public Boolean ignoreUnavailable() {
		return this.ignoreUnavailable;
	}

	/**
	 * Maximum number of concurrent searches the multi search API can execute.
	 * <p>
	 * API name: {@code max_concurrent_searches}
	 */
	@Nullable
	public Long maxConcurrentSearches() {
		return this.maxConcurrentSearches;
	}

	/**
	 * Maximum number of concurrent shard requests that each sub-search request
	 * executes per node.
	 * <p>
	 * API name: {@code max_concurrent_shard_requests}
	 */
	@Nullable
	public Long maxConcurrentShardRequests() {
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
	public Long preFilterShardSize() {
		return this.preFilterShardSize;
	}

	/**
	 * Indicates whether global term and document frequencies should be used when
	 * scoring returned documents.
	 * <p>
	 * API name: {@code search_type}
	 */
	@Nullable
	public SearchType searchType() {
		return this.searchType;
	}

	/**
	 * Specifies whether aggregation and suggester names should be prefixed by their
	 * respective types in the response.
	 * <p>
	 * API name: {@code typed_keys}
	 */
	@Nullable
	public Boolean typedKeys() {
		return this.typedKeys;
	}

	/**
	 * Required - Request body.
	 * <p>
	 * API name: {@code _value_body}
	 */
	public List<JsonValue /* Union(_global.msearch.Body | _global.msearch.Header) */> searches() {
		return this.searches;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartArray();
		for (JsonValue /* Union(_global.msearch.Body | _global.msearch.Header) */ item0 : this.searches) {
			generator.write(item0);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MsearchRequest}.
	 */
	public static class Builder implements ObjectBuilder<MsearchRequest> {
		@Nullable
		private List<String> index;

		@Nullable
		private Boolean allowNoIndices;

		@Nullable
		private Boolean ccsMinimizeRoundtrips;

		@Nullable
		private List<ExpandWildcardOptions> expandWildcards;

		@Nullable
		private Boolean ignoreThrottled;

		@Nullable
		private Boolean ignoreUnavailable;

		@Nullable
		private Long maxConcurrentSearches;

		@Nullable
		private Long maxConcurrentShardRequests;

		@Nullable
		private Long preFilterShardSize;

		@Nullable
		private SearchType searchType;

		@Nullable
		private Boolean typedKeys;

		private List<JsonValue /* Union(_global.msearch.Body | _global.msearch.Header) */> searches;

		/**
		 * Comma-separated list of data streams, indices, and index aliases to search.
		 * <p>
		 * API name: {@code index}
		 */
		public Builder index(@Nullable List<String> value) {
			this.index = value;
			return this;
		}

		/**
		 * Comma-separated list of data streams, indices, and index aliases to search.
		 * <p>
		 * API name: {@code index}
		 */
		public Builder index(String... value) {
			this.index = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #index(List)}, creating the list if needed.
		 */
		public Builder addIndex(String value) {
			if (this.index == null) {
				this.index = new ArrayList<>();
			}
			this.index.add(value);
			return this;
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
		public Builder allowNoIndices(@Nullable Boolean value) {
			this.allowNoIndices = value;
			return this;
		}

		/**
		 * If true, network roundtrips between the coordinating node and remote clusters
		 * are minimized for cross-cluster search requests.
		 * <p>
		 * API name: {@code ccs_minimize_roundtrips}
		 */
		public Builder ccsMinimizeRoundtrips(@Nullable Boolean value) {
			this.ccsMinimizeRoundtrips = value;
			return this;
		}

		/**
		 * Type of index that wildcard expressions can match. If the request can target
		 * data streams, this argument determines whether wildcard expressions match
		 * hidden data streams.
		 * <p>
		 * API name: {@code expand_wildcards}
		 */
		public Builder expandWildcards(@Nullable List<ExpandWildcardOptions> value) {
			this.expandWildcards = value;
			return this;
		}

		/**
		 * Type of index that wildcard expressions can match. If the request can target
		 * data streams, this argument determines whether wildcard expressions match
		 * hidden data streams.
		 * <p>
		 * API name: {@code expand_wildcards}
		 */
		public Builder expandWildcards(ExpandWildcardOptions... value) {
			this.expandWildcards = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #expandWildcards(List)}, creating the list if needed.
		 */
		public Builder addExpandWildcards(ExpandWildcardOptions value) {
			if (this.expandWildcards == null) {
				this.expandWildcards = new ArrayList<>();
			}
			this.expandWildcards.add(value);
			return this;
		}

		/**
		 * If true, concrete, expanded or aliased indices are ignored when frozen.
		 * <p>
		 * API name: {@code ignore_throttled}
		 */
		public Builder ignoreThrottled(@Nullable Boolean value) {
			this.ignoreThrottled = value;
			return this;
		}

		/**
		 * If true, missing or closed indices are not included in the response.
		 * <p>
		 * API name: {@code ignore_unavailable}
		 */
		public Builder ignoreUnavailable(@Nullable Boolean value) {
			this.ignoreUnavailable = value;
			return this;
		}

		/**
		 * Maximum number of concurrent searches the multi search API can execute.
		 * <p>
		 * API name: {@code max_concurrent_searches}
		 */
		public Builder maxConcurrentSearches(@Nullable Long value) {
			this.maxConcurrentSearches = value;
			return this;
		}

		/**
		 * Maximum number of concurrent shard requests that each sub-search request
		 * executes per node.
		 * <p>
		 * API name: {@code max_concurrent_shard_requests}
		 */
		public Builder maxConcurrentShardRequests(@Nullable Long value) {
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
		public Builder preFilterShardSize(@Nullable Long value) {
			this.preFilterShardSize = value;
			return this;
		}

		/**
		 * Indicates whether global term and document frequencies should be used when
		 * scoring returned documents.
		 * <p>
		 * API name: {@code search_type}
		 */
		public Builder searchType(@Nullable SearchType value) {
			this.searchType = value;
			return this;
		}

		/**
		 * Specifies whether aggregation and suggester names should be prefixed by their
		 * respective types in the response.
		 * <p>
		 * API name: {@code typed_keys}
		 */
		public Builder typedKeys(@Nullable Boolean value) {
			this.typedKeys = value;
			return this;
		}

		/**
		 * Required - Request body.
		 * <p>
		 * API name: {@code _value_body}
		 */
		public Builder searches(List<JsonValue /* Union(_global.msearch.Body | _global.msearch.Header) */> value) {
			this.searches = value;
			return this;
		}

		/**
		 * Required - Request body.
		 * <p>
		 * API name: {@code _value_body}
		 */
		public Builder searches(JsonValue /* Union(_global.msearch.Body | _global.msearch.Header) */... value) {
			this.searches = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #searches(List)}, creating the list if needed.
		 */
		public Builder addSearches(JsonValue /* Union(_global.msearch.Body | _global.msearch.Header) */ value) {
			if (this.searches == null) {
				this.searches = new ArrayList<>();
			}
			this.searches.add(value);
			return this;
		}

		/**
		 * Builds a {@link MsearchRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MsearchRequest build() {

			return new MsearchRequest(this);
		}
	}

	public static final JsonpDeserializer<MsearchRequest> _DESERIALIZER = createMsearchRequestDeserializer();
	protected static JsonpDeserializer<MsearchRequest> createMsearchRequestDeserializer() {

		JsonpDeserializer<List<JsonValue /* Union(_global.msearch.Body | _global.msearch.Header) */>> valueDeserializer = JsonpDeserializer
				.arrayDeserializer(JsonpDeserializer.jsonValueDeserializer());

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(), (parser, mapper, event) -> new Builder()
				.searches(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code msearch}".
	 */
	private static final SimpleEndpoint<MsearchRequest, Void> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;

				int propsSet = 0;

				if (request.index() != null)
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

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.allowNoIndices != null) {
					params.put("allow_no_indices", String.valueOf(request.allowNoIndices));
				}
				if (request.ccsMinimizeRoundtrips != null) {
					params.put("ccs_minimize_roundtrips", String.valueOf(request.ccsMinimizeRoundtrips));
				}
				if (request.expandWildcards != null) {
					params.put("expand_wildcards",
							request.expandWildcards.stream().map(v -> v.toString()).collect(Collectors.joining(",")));
				}
				if (request.ignoreThrottled != null) {
					params.put("ignore_throttled", String.valueOf(request.ignoreThrottled));
				}
				if (request.ignoreUnavailable != null) {
					params.put("ignore_unavailable", String.valueOf(request.ignoreUnavailable));
				}
				if (request.maxConcurrentSearches != null) {
					params.put("max_concurrent_searches", String.valueOf(request.maxConcurrentSearches));
				}
				if (request.maxConcurrentShardRequests != null) {
					params.put("max_concurrent_shard_requests", String.valueOf(request.maxConcurrentShardRequests));
				}
				if (request.preFilterShardSize != null) {
					params.put("pre_filter_shard_size", String.valueOf(request.preFilterShardSize));
				}
				if (request.searchType != null) {
					params.put("search_type", request.searchType.toString());
				}
				if (request.typedKeys != null) {
					params.put("typed_keys", String.valueOf(request.typedKeys));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, null);

	/**
	 * Create an "{@code msearch}" endpoint.
	 */
	public static <TDocument> Endpoint<MsearchRequest, MsearchResponse<TDocument>, ElasticsearchError> createMsearchEndpoint(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ENDPOINT
				.withResponseDeserializer(MsearchResponse.createMsearchResponseDeserializer(tDocumentDeserializer));
	}
}
