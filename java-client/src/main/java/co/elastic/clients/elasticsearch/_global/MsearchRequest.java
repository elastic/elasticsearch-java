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

package co.elastic.clients.elasticsearch._global;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: _global.msearch.Request
public final class MsearchRequest extends RequestBase implements ToJsonp {
	@Nullable
	private final List<String> index;

	@Nullable
	private final List<String> type;

	@Nullable
	private final Boolean allowNoIndices;

	@Nullable
	private final Boolean ccsMinimizeRoundtrips;

	@Nullable
	private final JsonValue expandWildcards;

	@Nullable
	private final Boolean ignoreThrottled;

	@Nullable
	private final Boolean ignoreUnavailable;

	@Nullable
	private final Number maxConcurrentSearches;

	@Nullable
	private final Number maxConcurrentShardRequests;

	@Nullable
	private final Number preFilterShardSize;

	@Nullable
	private final JsonValue searchType;

	@Nullable
	private final Boolean restTotalHitsAsInt;

	@Nullable
	private final Boolean typedKeys;

	private final List<JsonValue> value;

	// ---------------------------------------------------------------------------------------------

	protected MsearchRequest(Builder builder) {

		this.index = builder.index;
		this.type = builder.type;
		this.allowNoIndices = builder.allowNoIndices;
		this.ccsMinimizeRoundtrips = builder.ccsMinimizeRoundtrips;
		this.expandWildcards = builder.expandWildcards;
		this.ignoreThrottled = builder.ignoreThrottled;
		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.maxConcurrentSearches = builder.maxConcurrentSearches;
		this.maxConcurrentShardRequests = builder.maxConcurrentShardRequests;
		this.preFilterShardSize = builder.preFilterShardSize;
		this.searchType = builder.searchType;
		this.restTotalHitsAsInt = builder.restTotalHitsAsInt;
		this.typedKeys = builder.typedKeys;
		this.value = Objects.requireNonNull(builder.value, "value");

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
	 * API name: {@code type}
	 */
	@Nullable
	public List<String> type() {
		return this.type;
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
	public JsonValue expandWildcards() {
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
	public Number maxConcurrentSearches() {
		return this.maxConcurrentSearches;
	}

	/**
	 * Maximum number of concurrent shard requests that each sub-search request
	 * executes per node.
	 * <p>
	 * API name: {@code max_concurrent_shard_requests}
	 */
	@Nullable
	public Number maxConcurrentShardRequests() {
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
	public Number preFilterShardSize() {
		return this.preFilterShardSize;
	}

	/**
	 * Indicates whether global term and document frequencies should be used when
	 * scoring returned documents.
	 * <p>
	 * API name: {@code search_type}
	 */
	@Nullable
	public JsonValue searchType() {
		return this.searchType;
	}

	/**
	 * If true, hits.total are returned as an integer in the response. Defaults to
	 * false, which returns an object.
	 * <p>
	 * API name: {@code rest_total_hits_as_int}
	 */
	@Nullable
	public Boolean restTotalHitsAsInt() {
		return this.restTotalHitsAsInt;
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
	 * Request body.
	 * <p>
	 * API name: {@code value}
	 */
	public List<JsonValue> value() {
		return this.value;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartArray();
		for (JsonValue item0 : this.value) {
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
		private List<String> type;

		@Nullable
		private Boolean allowNoIndices;

		@Nullable
		private Boolean ccsMinimizeRoundtrips;

		@Nullable
		private JsonValue expandWildcards;

		@Nullable
		private Boolean ignoreThrottled;

		@Nullable
		private Boolean ignoreUnavailable;

		@Nullable
		private Number maxConcurrentSearches;

		@Nullable
		private Number maxConcurrentShardRequests;

		@Nullable
		private Number preFilterShardSize;

		@Nullable
		private JsonValue searchType;

		@Nullable
		private Boolean restTotalHitsAsInt;

		@Nullable
		private Boolean typedKeys;

		private List<JsonValue> value;

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
		 * API name: {@code type}
		 */
		public Builder type(@Nullable List<String> value) {
			this.type = value;
			return this;
		}

		/**
		 * API name: {@code type}
		 */
		public Builder type(String... value) {
			this.type = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #type(List)}, creating the list if needed.
		 */
		public Builder addType(String value) {
			if (this.type == null) {
				this.type = new ArrayList<>();
			}
			this.type.add(value);
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
		public Builder expandWildcards(@Nullable JsonValue value) {
			this.expandWildcards = value;
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
		public Builder maxConcurrentSearches(@Nullable Number value) {
			this.maxConcurrentSearches = value;
			return this;
		}

		/**
		 * Maximum number of concurrent shard requests that each sub-search request
		 * executes per node.
		 * <p>
		 * API name: {@code max_concurrent_shard_requests}
		 */
		public Builder maxConcurrentShardRequests(@Nullable Number value) {
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
		public Builder preFilterShardSize(@Nullable Number value) {
			this.preFilterShardSize = value;
			return this;
		}

		/**
		 * Indicates whether global term and document frequencies should be used when
		 * scoring returned documents.
		 * <p>
		 * API name: {@code search_type}
		 */
		public Builder searchType(@Nullable JsonValue value) {
			this.searchType = value;
			return this;
		}

		/**
		 * If true, hits.total are returned as an integer in the response. Defaults to
		 * false, which returns an object.
		 * <p>
		 * API name: {@code rest_total_hits_as_int}
		 */
		public Builder restTotalHitsAsInt(@Nullable Boolean value) {
			this.restTotalHitsAsInt = value;
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
		 * Request body.
		 * <p>
		 * API name: {@code value}
		 */
		public Builder value(List<JsonValue> value) {
			this.value = value;
			return this;
		}

		/**
		 * Request body.
		 * <p>
		 * API name: {@code value}
		 */
		public Builder value(JsonValue... value) {
			this.value = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #value(List)}, creating the list if needed.
		 */
		public Builder addValue(JsonValue value) {
			if (this.value == null) {
				this.value = new ArrayList<>();
			}
			this.value.add(value);
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

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for MsearchRequest
	 */
	public static final JsonpDeserializer<MsearchRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, MsearchRequest::setupMsearchRequestDeserializer);

	protected static void setupMsearchRequestDeserializer(DelegatingDeserializer<MsearchRequest.Builder> op) {

		op.add(Builder::value, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.jsonValueDeserializer()), "value");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code msearch}".
	 */
	private static final Endpoint.Simple<MsearchRequest, Void> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;
				final int _type = 1 << 1;

				int propsSet = 0;

				if (request.index() != null)
					propsSet |= _index;
				if (request.type() != null)
					propsSet |= _type;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_msearch");
					return buf.toString();
				}
				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					buf.append(request.index.stream().map(v -> v).collect(Collectors.joining(",")));
					buf.append("/_msearch");
					return buf.toString();
				}
				if (propsSet == (_index | _type)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					buf.append(request.index.stream().map(v -> v).collect(Collectors.joining(",")));
					buf.append("/");
					buf.append(request.type.stream().map(v -> v).collect(Collectors.joining(",")));
					buf.append("/_msearch");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

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
					params.put("expand_wildcards", request.expandWildcards.toString());
				}
				if (request.ignoreThrottled != null) {
					params.put("ignore_throttled", String.valueOf(request.ignoreThrottled));
				}
				if (request.ignoreUnavailable != null) {
					params.put("ignore_unavailable", String.valueOf(request.ignoreUnavailable));
				}
				if (request.maxConcurrentSearches != null) {
					params.put("max_concurrent_searches", request.maxConcurrentSearches.toString());
				}
				if (request.maxConcurrentShardRequests != null) {
					params.put("max_concurrent_shard_requests", request.maxConcurrentShardRequests.toString());
				}
				if (request.preFilterShardSize != null) {
					params.put("pre_filter_shard_size", request.preFilterShardSize.toString());
				}
				if (request.searchType != null) {
					params.put("search_type", request.searchType.toString());
				}
				if (request.restTotalHitsAsInt != null) {
					params.put("rest_total_hits_as_int", String.valueOf(request.restTotalHitsAsInt));
				}
				if (request.typedKeys != null) {
					params.put("typed_keys", String.valueOf(request.typedKeys));
				}
				return params;

			}, Endpoint.Simple.emptyMap(), true, null);

	/**
	 * Create an "{@code msearch}" endpoint.
	 */
	public static <TDocument> Endpoint<MsearchRequest, MsearchResponse<TDocument>, ElasticsearchError> createMsearchEndpoint(
			JsonpDeserializer<TDocument> tDocumentDeserializer) {
		return ENDPOINT
				.withResponseDeserializer(MsearchResponse.createMsearchResponseDeserializer(tDocumentDeserializer));
	}
}
