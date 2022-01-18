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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.ExpandWildcard;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
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

// typedef: indices.clear_cache.Request

/**
 * Clears all or specific caches for one or more indices.
 * 
 * @see <a href="../doc-files/api-spec.html#indices.clear_cache.Request">API
 *      specification</a>
 */

public class ClearCacheRequest extends RequestBase {
	@Nullable
	private final Boolean allowNoIndices;

	private final List<ExpandWildcard> expandWildcards;

	@Nullable
	private final Boolean fielddata;

	private final List<String> fields;

	@Nullable
	private final Boolean ignoreUnavailable;

	private final List<String> index;

	@Nullable
	private final Boolean query;

	@Nullable
	private final Boolean request;

	// ---------------------------------------------------------------------------------------------

	private ClearCacheRequest(Builder builder) {

		this.allowNoIndices = builder.allowNoIndices;
		this.expandWildcards = ApiTypeHelper.unmodifiable(builder.expandWildcards);
		this.fielddata = builder.fielddata;
		this.fields = ApiTypeHelper.unmodifiable(builder.fields);
		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.index = ApiTypeHelper.unmodifiable(builder.index);
		this.query = builder.query;
		this.request = builder.request;

	}

	public static ClearCacheRequest of(Function<Builder, ObjectBuilder<ClearCacheRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Whether to ignore if a wildcard indices expression resolves into no concrete
	 * indices. (This includes <code>_all</code> string or when no indices have been
	 * specified)
	 * <p>
	 * API name: {@code allow_no_indices}
	 */
	@Nullable
	public final Boolean allowNoIndices() {
		return this.allowNoIndices;
	}

	/**
	 * Whether to expand wildcard expression to concrete indices that are open,
	 * closed or both.
	 * <p>
	 * API name: {@code expand_wildcards}
	 */
	public final List<ExpandWildcard> expandWildcards() {
		return this.expandWildcards;
	}

	/**
	 * Clear field data
	 * <p>
	 * API name: {@code fielddata}
	 */
	@Nullable
	public final Boolean fielddata() {
		return this.fielddata;
	}

	/**
	 * A comma-separated list of fields to clear when using the
	 * <code>fielddata</code> parameter (default: all)
	 * <p>
	 * API name: {@code fields}
	 */
	public final List<String> fields() {
		return this.fields;
	}

	/**
	 * Whether specified concrete indices should be ignored when unavailable
	 * (missing or closed)
	 * <p>
	 * API name: {@code ignore_unavailable}
	 */
	@Nullable
	public final Boolean ignoreUnavailable() {
		return this.ignoreUnavailable;
	}

	/**
	 * A comma-separated list of index name to limit the operation
	 * <p>
	 * API name: {@code index}
	 */
	public final List<String> index() {
		return this.index;
	}

	/**
	 * Clear query caches
	 * <p>
	 * API name: {@code query}
	 */
	@Nullable
	public final Boolean query() {
		return this.query;
	}

	/**
	 * Clear request cache
	 * <p>
	 * API name: {@code request}
	 */
	@Nullable
	public final Boolean request() {
		return this.request;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClearCacheRequest}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ClearCacheRequest> {
		@Nullable
		private Boolean allowNoIndices;

		@Nullable
		private List<ExpandWildcard> expandWildcards;

		@Nullable
		private Boolean fielddata;

		@Nullable
		private List<String> fields;

		@Nullable
		private Boolean ignoreUnavailable;

		@Nullable
		private List<String> index;

		@Nullable
		private Boolean query;

		@Nullable
		private Boolean request;

		/**
		 * Whether to ignore if a wildcard indices expression resolves into no concrete
		 * indices. (This includes <code>_all</code> string or when no indices have been
		 * specified)
		 * <p>
		 * API name: {@code allow_no_indices}
		 */
		public final Builder allowNoIndices(@Nullable Boolean value) {
			this.allowNoIndices = value;
			return this;
		}

		/**
		 * Whether to expand wildcard expression to concrete indices that are open,
		 * closed or both.
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
		 * Whether to expand wildcard expression to concrete indices that are open,
		 * closed or both.
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
		 * Clear field data
		 * <p>
		 * API name: {@code fielddata}
		 */
		public final Builder fielddata(@Nullable Boolean value) {
			this.fielddata = value;
			return this;
		}

		/**
		 * A comma-separated list of fields to clear when using the
		 * <code>fielddata</code> parameter (default: all)
		 * <p>
		 * API name: {@code fields}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>fields</code>.
		 */
		public final Builder fields(List<String> list) {
			this.fields = _listAddAll(this.fields, list);
			return this;
		}

		/**
		 * A comma-separated list of fields to clear when using the
		 * <code>fielddata</code> parameter (default: all)
		 * <p>
		 * API name: {@code fields}
		 * <p>
		 * Adds one or more values to <code>fields</code>.
		 */
		public final Builder fields(String value, String... values) {
			this.fields = _listAdd(this.fields, value, values);
			return this;
		}

		/**
		 * Whether specified concrete indices should be ignored when unavailable
		 * (missing or closed)
		 * <p>
		 * API name: {@code ignore_unavailable}
		 */
		public final Builder ignoreUnavailable(@Nullable Boolean value) {
			this.ignoreUnavailable = value;
			return this;
		}

		/**
		 * A comma-separated list of index name to limit the operation
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
		 * A comma-separated list of index name to limit the operation
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
		 * Clear query caches
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(@Nullable Boolean value) {
			this.query = value;
			return this;
		}

		/**
		 * Clear request cache
		 * <p>
		 * API name: {@code request}
		 */
		public final Builder request(@Nullable Boolean value) {
			this.request = value;
			return this;
		}

		/**
		 * Builds a {@link ClearCacheRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClearCacheRequest build() {
			_checkSingleUse();

			return new ClearCacheRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.clear_cache}".
	 */
	public static final Endpoint<ClearCacheRequest, ClearCacheResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/indices.clear_cache",

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
					buf.append("/_cache");
					buf.append("/clear");
					return buf.toString();
				}
				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					buf.append("/_cache");
					buf.append("/clear");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.request != null) {
					params.put("request", String.valueOf(request.request));
				}
				if (request.fielddata != null) {
					params.put("fielddata", String.valueOf(request.fielddata));
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
				if (request.query != null) {
					params.put("query", String.valueOf(request.query));
				}
				if (ApiTypeHelper.isDefined(request.fields)) {
					params.put("fields", request.fields.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, ClearCacheResponse._DESERIALIZER);
}
