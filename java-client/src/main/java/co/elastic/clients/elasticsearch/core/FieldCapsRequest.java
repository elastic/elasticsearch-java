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
import co.elastic.clients.elasticsearch._types.ExpandWildcardOptions;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.mapping.RuntimeField;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.SimpleEndpoint;
import co.elastic.clients.util.MapBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: _global.field_caps.Request
@JsonpDeserializable
public class FieldCapsRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Boolean allowNoIndices;

	private final List<ExpandWildcardOptions> expandWildcards;

	private final List<String> fields;

	@Nullable
	private final Boolean ignoreUnavailable;

	@Nullable
	private final Boolean includeUnmapped;

	private final List<String> index;

	@Nullable
	private final Query indexFilter;

	private final Map<String, RuntimeField> runtimeMappings;

	// ---------------------------------------------------------------------------------------------

	private FieldCapsRequest(Builder builder) {

		this.allowNoIndices = builder.allowNoIndices;
		this.expandWildcards = ModelTypeHelper.unmodifiable(builder.expandWildcards);
		this.fields = ModelTypeHelper.unmodifiable(builder.fields);
		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.includeUnmapped = builder.includeUnmapped;
		this.index = ModelTypeHelper.unmodifiable(builder.index);
		this.indexFilter = builder.indexFilter;
		this.runtimeMappings = ModelTypeHelper.unmodifiable(builder.runtimeMappings);

	}

	public static FieldCapsRequest of(Function<Builder, ObjectBuilder<FieldCapsRequest>> fn) {
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
	public final List<ExpandWildcardOptions> expandWildcards() {
		return this.expandWildcards;
	}

	/**
	 * A comma-separated list of field names
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
	 * Indicates whether unmapped fields should be included in the response.
	 * <p>
	 * API name: {@code include_unmapped}
	 */
	@Nullable
	public final Boolean includeUnmapped() {
		return this.includeUnmapped;
	}

	/**
	 * A comma-separated list of index names; use <code>_all</code> or empty string
	 * to perform the operation on all indices
	 * <p>
	 * API name: {@code index}
	 */
	public final List<String> index() {
		return this.index;
	}

	/**
	 * API name: {@code index_filter}
	 */
	@Nullable
	public final Query indexFilter() {
		return this.indexFilter;
	}

	/**
	 * API name: {@code runtime_mappings}
	 */
	public final Map<String, RuntimeField> runtimeMappings() {
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
		if (ModelTypeHelper.isDefined(this.runtimeMappings)) {
			generator.writeKey("runtime_mappings");
			generator.writeStartObject();
			for (Map.Entry<String, RuntimeField> item0 : this.runtimeMappings.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FieldCapsRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<FieldCapsRequest> {
		@Nullable
		private Boolean allowNoIndices;

		@Nullable
		private List<ExpandWildcardOptions> expandWildcards;

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
		private Map<String, RuntimeField> runtimeMappings;

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
		 */
		public final Builder expandWildcards(@Nullable List<ExpandWildcardOptions> value) {
			this.expandWildcards = value;
			return this;
		}

		/**
		 * Whether to expand wildcard expression to concrete indices that are open,
		 * closed or both.
		 * <p>
		 * API name: {@code expand_wildcards}
		 */
		public final Builder expandWildcards(ExpandWildcardOptions... value) {
			this.expandWildcards = Arrays.asList(value);
			return this;
		}

		/**
		 * A comma-separated list of field names
		 * <p>
		 * API name: {@code fields}
		 */
		public final Builder fields(@Nullable List<String> value) {
			this.fields = value;
			return this;
		}

		/**
		 * A comma-separated list of field names
		 * <p>
		 * API name: {@code fields}
		 */
		public final Builder fields(String... value) {
			this.fields = Arrays.asList(value);
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
		 * Indicates whether unmapped fields should be included in the response.
		 * <p>
		 * API name: {@code include_unmapped}
		 */
		public final Builder includeUnmapped(@Nullable Boolean value) {
			this.includeUnmapped = value;
			return this;
		}

		/**
		 * A comma-separated list of index names; use <code>_all</code> or empty string
		 * to perform the operation on all indices
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(@Nullable List<String> value) {
			this.index = value;
			return this;
		}

		/**
		 * A comma-separated list of index names; use <code>_all</code> or empty string
		 * to perform the operation on all indices
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(String... value) {
			this.index = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code index_filter}
		 */
		public final Builder indexFilter(@Nullable Query value) {
			this.indexFilter = value;
			return this;
		}

		/**
		 * API name: {@code index_filter}
		 */
		public final Builder indexFilter(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.indexFilter(fn.apply(new Query.Builder()).build());
		}

		/**
		 * API name: {@code runtime_mappings}
		 */
		public final Builder runtimeMappings(@Nullable Map<String, RuntimeField> value) {
			this.runtimeMappings = value;
			return this;
		}

		/**
		 * Set {@link #runtimeMappings(Map)} to a singleton map.
		 */
		public Builder runtimeMappings(String key, Function<RuntimeField.Builder, ObjectBuilder<RuntimeField>> fn) {
			return this.runtimeMappings(Collections.singletonMap(key, fn.apply(new RuntimeField.Builder()).build()));
		}

		public final Builder runtimeMappings(
				Function<MapBuilder<String, RuntimeField, RuntimeField.Builder>, ObjectBuilder<Map<String, RuntimeField>>> fn) {
			return runtimeMappings(fn.apply(new MapBuilder<>(RuntimeField.Builder::new)).build());
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
			FieldCapsRequest::setupFieldCapsRequestDeserializer, Builder::build);

	protected static void setupFieldCapsRequestDeserializer(DelegatingDeserializer<FieldCapsRequest.Builder> op) {

		op.add(Builder::indexFilter, Query._DESERIALIZER, "index_filter");
		op.add(Builder::runtimeMappings, JsonpDeserializer.stringMapDeserializer(RuntimeField._DESERIALIZER),
				"runtime_mappings");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code field_caps}".
	 */
	public static final Endpoint<FieldCapsRequest, FieldCapsResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;

				int propsSet = 0;

				if (ModelTypeHelper.isDefined(request.index()))
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
				if (ModelTypeHelper.isDefined(request.expandWildcards)) {
					params.put("expand_wildcards",
							request.expandWildcards.stream().map(v -> v.jsonValue()).collect(Collectors.joining(",")));
				}
				if (request.ignoreUnavailable != null) {
					params.put("ignore_unavailable", String.valueOf(request.ignoreUnavailable));
				}
				if (request.allowNoIndices != null) {
					params.put("allow_no_indices", String.valueOf(request.allowNoIndices));
				}
				if (ModelTypeHelper.isDefined(request.fields)) {
					params.put("fields", request.fields.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.includeUnmapped != null) {
					params.put("include_unmapped", String.valueOf(request.includeUnmapped));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, FieldCapsResponse._DESERIALIZER);
}
