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
import co.elastic.clients.elasticsearch._types.mapping.RuntimeField;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
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
import co.elastic.clients.util.WithJsonObjectBuilderBase;
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

// typedef: _global.field_caps.Request

/**
 * Returns the information about the capabilities of fields among multiple
 * indices.
 * 
 * @see <a href="../doc-files/api-spec.html#_global.field_caps.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class FieldCapsRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Boolean allowNoIndices;

	private final List<ExpandWildcard> expandWildcards;

	private final List<String> fields;

	@Nullable
	private final Boolean ignoreUnavailable;

	@Nullable
	private final Boolean includeUnmapped;

	private final List<String> index;

	@Nullable
	private final Query indexFilter;

	private final Map<String, List<RuntimeField>> runtimeMappings;

	// ---------------------------------------------------------------------------------------------

	private FieldCapsRequest(Builder builder) {

		this.allowNoIndices = builder.allowNoIndices;
		this.expandWildcards = ApiTypeHelper.unmodifiable(builder.expandWildcards);
		this.fields = ApiTypeHelper.unmodifiable(builder.fields);
		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.includeUnmapped = builder.includeUnmapped;
		this.index = ApiTypeHelper.unmodifiable(builder.index);
		this.indexFilter = builder.indexFilter;
		this.runtimeMappings = ApiTypeHelper.unmodifiable(builder.runtimeMappings);

	}

	public static FieldCapsRequest of(Function<Builder, ObjectBuilder<FieldCapsRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * If false, the request returns an error if any wildcard expression, <a href=
	 * "https://www.elastic.co/guide/en/elasticsearch/reference/current/aliases.html">index
	 * alias</a>, or <code>_all</code> value targets only missing or closed indices.
	 * This behavior applies even if the request targets other open indices. For
	 * example, a request targeting <code>foo*,bar*</code> returns an error if an
	 * index starts with foo but no index starts with bar.
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
	 * <code>open,hidden</code>.
	 * <p>
	 * API name: {@code expand_wildcards}
	 */
	public final List<ExpandWildcard> expandWildcards() {
		return this.expandWildcards;
	}

	/**
	 * Comma-separated list of fields to retrieve capabilities for. Wildcard
	 * (<code>*</code>) expressions are supported.
	 * <p>
	 * API name: {@code fields}
	 */
	public final List<String> fields() {
		return this.fields;
	}

	/**
	 * If <code>true</code>, missing or closed indices are not included in the
	 * response.
	 * <p>
	 * API name: {@code ignore_unavailable}
	 */
	@Nullable
	public final Boolean ignoreUnavailable() {
		return this.ignoreUnavailable;
	}

	/**
	 * If true, unmapped fields are included in the response.
	 * <p>
	 * API name: {@code include_unmapped}
	 */
	@Nullable
	public final Boolean includeUnmapped() {
		return this.includeUnmapped;
	}

	/**
	 * Comma-separated list of data streams, indices, and aliases used to limit the
	 * request. Supports wildcards (*). To target all data streams and indices, omit
	 * this parameter or use * or _all.
	 * <p>
	 * API name: {@code index}
	 */
	public final List<String> index() {
		return this.index;
	}

	/**
	 * Allows to filter indices if the provided query rewrites to match_none on
	 * every shard.
	 * <p>
	 * API name: {@code index_filter}
	 */
	@Nullable
	public final Query indexFilter() {
		return this.indexFilter;
	}

	/**
	 * Defines ad-hoc <a href=
	 * "https://www.elastic.co/guide/en/elasticsearch/reference/current/runtime-search-request.html">runtime
	 * fields</a> in the request similar to the way it is done in <a href=
	 * "https://www.elastic.co/guide/en/elasticsearch/reference/current/search-search.html#search-api-body-runtime">search
	 * requests</a>. These fields exist only as part of the query and take
	 * precedence over fields defined with the same name in the index mappings.
	 * <p>
	 * API name: {@code runtime_mappings}
	 */
	public final Map<String, List<RuntimeField>> runtimeMappings() {
		return this.runtimeMappings;
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
		if (ApiTypeHelper.isDefined(this.runtimeMappings)) {
			generator.writeKey("runtime_mappings");
			generator.writeStartObject();
			for (Map.Entry<String, List<RuntimeField>> item0 : this.runtimeMappings.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.writeStartArray();
				if (item0.getValue() != null) {
					for (RuntimeField item1 : item0.getValue()) {
						item1.serialize(generator, mapper);

					}
				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FieldCapsRequest}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<FieldCapsRequest> {
		@Nullable
		private Boolean allowNoIndices;

		@Nullable
		private List<ExpandWildcard> expandWildcards;

		@Nullable
		private List<String> fields;

		@Nullable
		private Boolean ignoreUnavailable;

		@Nullable
		private Boolean includeUnmapped;

		@Nullable
		private List<String> index;

		@Nullable
		private Query indexFilter;

		@Nullable
		private Map<String, List<RuntimeField>> runtimeMappings;

		/**
		 * If false, the request returns an error if any wildcard expression, <a href=
		 * "https://www.elastic.co/guide/en/elasticsearch/reference/current/aliases.html">index
		 * alias</a>, or <code>_all</code> value targets only missing or closed indices.
		 * This behavior applies even if the request targets other open indices. For
		 * example, a request targeting <code>foo*,bar*</code> returns an error if an
		 * index starts with foo but no index starts with bar.
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
		 * Type of index that wildcard patterns can match. If the request can target
		 * data streams, this argument determines whether wildcard expressions match
		 * hidden data streams. Supports comma-separated values, such as
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
		 * Comma-separated list of fields to retrieve capabilities for. Wildcard
		 * (<code>*</code>) expressions are supported.
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
		 * Comma-separated list of fields to retrieve capabilities for. Wildcard
		 * (<code>*</code>) expressions are supported.
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
		 * If <code>true</code>, missing or closed indices are not included in the
		 * response.
		 * <p>
		 * API name: {@code ignore_unavailable}
		 */
		public final Builder ignoreUnavailable(@Nullable Boolean value) {
			this.ignoreUnavailable = value;
			return this;
		}

		/**
		 * If true, unmapped fields are included in the response.
		 * <p>
		 * API name: {@code include_unmapped}
		 */
		public final Builder includeUnmapped(@Nullable Boolean value) {
			this.includeUnmapped = value;
			return this;
		}

		/**
		 * Comma-separated list of data streams, indices, and aliases used to limit the
		 * request. Supports wildcards (*). To target all data streams and indices, omit
		 * this parameter or use * or _all.
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
		 * Comma-separated list of data streams, indices, and aliases used to limit the
		 * request. Supports wildcards (*). To target all data streams and indices, omit
		 * this parameter or use * or _all.
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
		 * Allows to filter indices if the provided query rewrites to match_none on
		 * every shard.
		 * <p>
		 * API name: {@code index_filter}
		 */
		public final Builder indexFilter(@Nullable Query value) {
			this.indexFilter = value;
			return this;
		}

		/**
		 * Allows to filter indices if the provided query rewrites to match_none on
		 * every shard.
		 * <p>
		 * API name: {@code index_filter}
		 */
		public final Builder indexFilter(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.indexFilter(fn.apply(new Query.Builder()).build());
		}

		/**
		 * Defines ad-hoc <a href=
		 * "https://www.elastic.co/guide/en/elasticsearch/reference/current/runtime-search-request.html">runtime
		 * fields</a> in the request similar to the way it is done in <a href=
		 * "https://www.elastic.co/guide/en/elasticsearch/reference/current/search-search.html#search-api-body-runtime">search
		 * requests</a>. These fields exist only as part of the query and take
		 * precedence over fields defined with the same name in the index mappings.
		 * <p>
		 * API name: {@code runtime_mappings}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>runtimeMappings</code>.
		 */
		public final Builder runtimeMappings(Map<String, List<RuntimeField>> map) {
			this.runtimeMappings = _mapPutAll(this.runtimeMappings, map);
			return this;
		}

		/**
		 * Defines ad-hoc <a href=
		 * "https://www.elastic.co/guide/en/elasticsearch/reference/current/runtime-search-request.html">runtime
		 * fields</a> in the request similar to the way it is done in <a href=
		 * "https://www.elastic.co/guide/en/elasticsearch/reference/current/search-search.html#search-api-body-runtime">search
		 * requests</a>. These fields exist only as part of the query and take
		 * precedence over fields defined with the same name in the index mappings.
		 * <p>
		 * API name: {@code runtime_mappings}
		 * <p>
		 * Adds an entry to <code>runtimeMappings</code>.
		 */
		public final Builder runtimeMappings(String key, List<RuntimeField> value) {
			this.runtimeMappings = _mapPut(this.runtimeMappings, key, value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link FieldCapsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FieldCapsRequest build() {
			_checkSingleUse();

			return new FieldCapsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FieldCapsRequest}
	 */
	public static final JsonpDeserializer<FieldCapsRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			FieldCapsRequest::setupFieldCapsRequestDeserializer);

	protected static void setupFieldCapsRequestDeserializer(ObjectDeserializer<FieldCapsRequest.Builder> op) {

		op.add(Builder::indexFilter, Query._DESERIALIZER, "index_filter");
		op.add(Builder::runtimeMappings, JsonpDeserializer.stringMapDeserializer(
				JsonpDeserializer.arrayDeserializer(RuntimeField._DESERIALIZER)), "runtime_mappings");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code field_caps}".
	 */
	public static final Endpoint<FieldCapsRequest, FieldCapsResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/field_caps",

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
					buf.append("/_field_caps");
					return buf.toString();
				}
				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					buf.append("/_field_caps");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

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
				if (ApiTypeHelper.isDefined(request.fields)) {
					params.put("fields", request.fields.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.includeUnmapped != null) {
					params.put("include_unmapped", String.valueOf(request.includeUnmapped));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, FieldCapsResponse._DESERIALIZER);
}
