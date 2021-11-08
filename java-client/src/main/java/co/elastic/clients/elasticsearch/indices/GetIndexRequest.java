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

// typedef: indices.get.Request

public class GetIndexRequest extends RequestBase {
	@Nullable
	private final Boolean allowNoIndices;

	private final List<ExpandWildcardOptions> expandWildcards;

	@Nullable
	private final Boolean flatSettings;

	@Nullable
	private final Boolean ignoreUnavailable;

	@Nullable
	private final Boolean includeDefaults;

	@Nullable
	private final Boolean includeTypeName;

	private final List<String> index;

	@Nullable
	private final Boolean local;

	@Nullable
	private final String masterTimeout;

	// ---------------------------------------------------------------------------------------------

	private GetIndexRequest(Builder builder) {

		this.allowNoIndices = builder.allowNoIndices;
		this.expandWildcards = ModelTypeHelper.unmodifiable(builder.expandWildcards);
		this.flatSettings = builder.flatSettings;
		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.includeDefaults = builder.includeDefaults;
		this.includeTypeName = builder.includeTypeName;
		this.index = ModelTypeHelper.unmodifiableRequired(builder.index, this, "index");
		this.local = builder.local;
		this.masterTimeout = builder.masterTimeout;

	}

	public static GetIndexRequest of(Function<Builder, ObjectBuilder<GetIndexRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Ignore if a wildcard expression resolves to no concrete indices (default:
	 * false)
	 * <p>
	 * API name: {@code allow_no_indices}
	 */
	@Nullable
	public final Boolean allowNoIndices() {
		return this.allowNoIndices;
	}

	/**
	 * Type of index that wildcard expressions can match. If the request can target
	 * data streams, this argument determines whether wildcard expressions match
	 * hidden data streams. Supports comma-separated values, such as open,hidden.
	 * <p>
	 * API name: {@code expand_wildcards}
	 */
	public final List<ExpandWildcardOptions> expandWildcards() {
		return this.expandWildcards;
	}

	/**
	 * If true, returns settings in flat format.
	 * <p>
	 * API name: {@code flat_settings}
	 */
	@Nullable
	public final Boolean flatSettings() {
		return this.flatSettings;
	}

	/**
	 * If false, requests that target a missing index return an error.
	 * <p>
	 * API name: {@code ignore_unavailable}
	 */
	@Nullable
	public final Boolean ignoreUnavailable() {
		return this.ignoreUnavailable;
	}

	/**
	 * If true, return all default settings in the response.
	 * <p>
	 * API name: {@code include_defaults}
	 */
	@Nullable
	public final Boolean includeDefaults() {
		return this.includeDefaults;
	}

	/**
	 * If true, a mapping type is expected in the body of mappings.
	 * <p>
	 * API name: {@code include_type_name}
	 */
	@Nullable
	public final Boolean includeTypeName() {
		return this.includeTypeName;
	}

	/**
	 * Required - Comma-separated list of data streams, indices, and index aliases
	 * used to limit the request. Wildcard expressions (*) are supported.
	 * <p>
	 * API name: {@code index}
	 */
	public final List<String> index() {
		return this.index;
	}

	/**
	 * If true, the request retrieves information from the local node only. Defaults
	 * to false, which means information is retrieved from the master node.
	 * <p>
	 * API name: {@code local}
	 */
	@Nullable
	public final Boolean local() {
		return this.local;
	}

	/**
	 * Period to wait for a connection to the master node. If no response is
	 * received before the timeout expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final String masterTimeout() {
		return this.masterTimeout;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetIndexRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GetIndexRequest> {
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
		private Boolean includeTypeName;

		private List<String> index;

		@Nullable
		private Boolean local;

		@Nullable
		private String masterTimeout;

		/**
		 * Ignore if a wildcard expression resolves to no concrete indices (default:
		 * false)
		 * <p>
		 * API name: {@code allow_no_indices}
		 */
		public final Builder allowNoIndices(@Nullable Boolean value) {
			this.allowNoIndices = value;
			return this;
		}

		/**
		 * Type of index that wildcard expressions can match. If the request can target
		 * data streams, this argument determines whether wildcard expressions match
		 * hidden data streams. Supports comma-separated values, such as open,hidden.
		 * <p>
		 * API name: {@code expand_wildcards}
		 */
		public final Builder expandWildcards(@Nullable List<ExpandWildcardOptions> value) {
			this.expandWildcards = value;
			return this;
		}

		/**
		 * Type of index that wildcard expressions can match. If the request can target
		 * data streams, this argument determines whether wildcard expressions match
		 * hidden data streams. Supports comma-separated values, such as open,hidden.
		 * <p>
		 * API name: {@code expand_wildcards}
		 */
		public final Builder expandWildcards(ExpandWildcardOptions... value) {
			this.expandWildcards = Arrays.asList(value);
			return this;
		}

		/**
		 * If true, returns settings in flat format.
		 * <p>
		 * API name: {@code flat_settings}
		 */
		public final Builder flatSettings(@Nullable Boolean value) {
			this.flatSettings = value;
			return this;
		}

		/**
		 * If false, requests that target a missing index return an error.
		 * <p>
		 * API name: {@code ignore_unavailable}
		 */
		public final Builder ignoreUnavailable(@Nullable Boolean value) {
			this.ignoreUnavailable = value;
			return this;
		}

		/**
		 * If true, return all default settings in the response.
		 * <p>
		 * API name: {@code include_defaults}
		 */
		public final Builder includeDefaults(@Nullable Boolean value) {
			this.includeDefaults = value;
			return this;
		}

		/**
		 * If true, a mapping type is expected in the body of mappings.
		 * <p>
		 * API name: {@code include_type_name}
		 */
		public final Builder includeTypeName(@Nullable Boolean value) {
			this.includeTypeName = value;
			return this;
		}

		/**
		 * Required - Comma-separated list of data streams, indices, and index aliases
		 * used to limit the request. Wildcard expressions (*) are supported.
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(List<String> value) {
			this.index = value;
			return this;
		}

		/**
		 * Required - Comma-separated list of data streams, indices, and index aliases
		 * used to limit the request. Wildcard expressions (*) are supported.
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(String... value) {
			this.index = Arrays.asList(value);
			return this;
		}

		/**
		 * If true, the request retrieves information from the local node only. Defaults
		 * to false, which means information is retrieved from the master node.
		 * <p>
		 * API name: {@code local}
		 */
		public final Builder local(@Nullable Boolean value) {
			this.local = value;
			return this;
		}

		/**
		 * Period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable String value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Builds a {@link GetIndexRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetIndexRequest build() {
			_checkSingleUse();

			return new GetIndexRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.get}".
	 */
	public static final Endpoint<GetIndexRequest, GetIndexResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "GET";

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
				if (request.includeTypeName != null) {
					params.put("include_type_name", String.valueOf(request.includeTypeName));
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

			}, SimpleEndpoint.emptyMap(), false, GetIndexResponse._DESERIALIZER);
}
