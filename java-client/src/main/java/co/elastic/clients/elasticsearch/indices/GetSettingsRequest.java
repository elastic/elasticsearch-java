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
import co.elastic.clients.elasticsearch._types.ExpandWildcardOptions;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.SimpleEndpoint;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: indices.get_settings.Request

public class GetSettingsRequest extends RequestBase {
	@Nullable
	private final Boolean allowNoIndices;

	private final List<ExpandWildcardOptions> expandWildcards;

	@Nullable
	private final Boolean flatSettings;

	@Nullable
	private final Boolean ignoreUnavailable;

	@Nullable
	private final Boolean includeDefaults;

	private final List<String> index;

	@Nullable
	private final Boolean local;

	@Nullable
	private final String masterTimeout;

	private final List<String> name;

	// ---------------------------------------------------------------------------------------------

	private GetSettingsRequest(Builder builder) {

		this.allowNoIndices = builder.allowNoIndices;
		this.expandWildcards = ModelTypeHelper.unmodifiable(builder.expandWildcards);
		this.flatSettings = builder.flatSettings;
		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.includeDefaults = builder.includeDefaults;
		this.index = ModelTypeHelper.unmodifiable(builder.index);
		this.local = builder.local;
		this.masterTimeout = builder.masterTimeout;
		this.name = ModelTypeHelper.unmodifiable(builder.name);

	}

	public static GetSettingsRequest of(Function<Builder, ObjectBuilder<GetSettingsRequest>> fn) {
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
	 * Return settings in flat format (default: false)
	 * <p>
	 * API name: {@code flat_settings}
	 */
	@Nullable
	public final Boolean flatSettings() {
		return this.flatSettings;
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
	 * Whether to return all default setting for each of the indices.
	 * <p>
	 * API name: {@code include_defaults}
	 */
	@Nullable
	public final Boolean includeDefaults() {
		return this.includeDefaults;
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
	 * Return local information, do not retrieve the state from master node
	 * (default: false)
	 * <p>
	 * API name: {@code local}
	 */
	@Nullable
	public final Boolean local() {
		return this.local;
	}

	/**
	 * Specify timeout for connection to master
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final String masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * The name of the settings that should be included
	 * <p>
	 * API name: {@code name}
	 */
	public final List<String> name() {
		return this.name;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetSettingsRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GetSettingsRequest> {
		@Nullable
		private Boolean allowNoIndices;

		@Nullable
		private List<ExpandWildcardOptions> expandWildcards;

		@Nullable
		private Boolean flatSettings;

		@Nullable
		private Boolean ignoreUnavailable;

		@Nullable
		private Boolean includeDefaults;

		@Nullable
		private List<String> index;

		@Nullable
		private Boolean local;

		@Nullable
		private String masterTimeout;

		@Nullable
		private List<String> name;

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
		 * Return settings in flat format (default: false)
		 * <p>
		 * API name: {@code flat_settings}
		 */
		public final Builder flatSettings(@Nullable Boolean value) {
			this.flatSettings = value;
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
		 * Whether to return all default setting for each of the indices.
		 * <p>
		 * API name: {@code include_defaults}
		 */
		public final Builder includeDefaults(@Nullable Boolean value) {
			this.includeDefaults = value;
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
		 * Return local information, do not retrieve the state from master node
		 * (default: false)
		 * <p>
		 * API name: {@code local}
		 */
		public final Builder local(@Nullable Boolean value) {
			this.local = value;
			return this;
		}

		/**
		 * Specify timeout for connection to master
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable String value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * The name of the settings that should be included
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(@Nullable List<String> value) {
			this.name = value;
			return this;
		}

		/**
		 * The name of the settings that should be included
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(String... value) {
			this.name = Arrays.asList(value);
			return this;
		}

		/**
		 * Builds a {@link GetSettingsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetSettingsRequest build() {
			_checkSingleUse();

			return new GetSettingsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.get_settings}".
	 */
	public static final Endpoint<GetSettingsRequest, GetSettingsResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _name = 1 << 0;
				final int _index = 1 << 1;

				int propsSet = 0;

				if (ModelTypeHelper.isDefined(request.name()))
					propsSet |= _name;
				if (ModelTypeHelper.isDefined(request.index()))
					propsSet |= _index;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_settings");
					return buf.toString();
				}
				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					buf.append("/_settings");
					return buf.toString();
				}
				if (propsSet == (_index | _name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					buf.append("/_settings");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.name.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					return buf.toString();
				}
				if (propsSet == (_name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_settings");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.name.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout);
				}
				if (request.flatSettings != null) {
					params.put("flat_settings", String.valueOf(request.flatSettings));
				}
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
				if (request.includeDefaults != null) {
					params.put("include_defaults", String.valueOf(request.includeDefaults));
				}
				if (request.local != null) {
					params.put("local", String.valueOf(request.local));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, GetSettingsResponse._DESERIALIZER);
}
