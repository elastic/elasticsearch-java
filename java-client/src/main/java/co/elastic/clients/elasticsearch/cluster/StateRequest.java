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

package co.elastic.clients.elasticsearch.cluster;

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
import java.lang.Long;
import java.lang.String;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: cluster.state.Request

public class StateRequest extends RequestBase {
	@Nullable
	private final Boolean allowNoIndices;

	private final List<ExpandWildcardOptions> expandWildcards;

	@Nullable
	private final Boolean flatSettings;

	@Nullable
	private final Boolean ignoreUnavailable;

	private final List<String> index;

	@Nullable
	private final Boolean local;

	@Nullable
	private final String masterTimeout;

	private final List<String> metric;

	@Nullable
	private final Long waitForMetadataVersion;

	@Nullable
	private final String waitForTimeout;

	// ---------------------------------------------------------------------------------------------

	private StateRequest(Builder builder) {

		this.allowNoIndices = builder.allowNoIndices;
		this.expandWildcards = ModelTypeHelper.unmodifiable(builder.expandWildcards);
		this.flatSettings = builder.flatSettings;
		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.index = ModelTypeHelper.unmodifiable(builder.index);
		this.local = builder.local;
		this.masterTimeout = builder.masterTimeout;
		this.metric = ModelTypeHelper.unmodifiable(builder.metric);
		this.waitForMetadataVersion = builder.waitForMetadataVersion;
		this.waitForTimeout = builder.waitForTimeout;

	}

	public static StateRequest of(Function<Builder, ObjectBuilder<StateRequest>> fn) {
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
	 * Limit the information returned to the specified metrics
	 * <p>
	 * API name: {@code metric}
	 */
	public final List<String> metric() {
		return this.metric;
	}

	/**
	 * Wait for the metadata version to be equal or greater than the specified
	 * metadata version
	 * <p>
	 * API name: {@code wait_for_metadata_version}
	 */
	@Nullable
	public final Long waitForMetadataVersion() {
		return this.waitForMetadataVersion;
	}

	/**
	 * The maximum time to wait for wait_for_metadata_version before timing out
	 * <p>
	 * API name: {@code wait_for_timeout}
	 */
	@Nullable
	public final String waitForTimeout() {
		return this.waitForTimeout;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StateRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<StateRequest> {
		@Nullable
		private Boolean allowNoIndices;

		@Nullable
		private List<ExpandWildcardOptions> expandWildcards;

		@Nullable
		private Boolean flatSettings;

		@Nullable
		private Boolean ignoreUnavailable;

		@Nullable
		private List<String> index;

		@Nullable
		private Boolean local;

		@Nullable
		private String masterTimeout;

		@Nullable
		private List<String> metric;

		@Nullable
		private Long waitForMetadataVersion;

		@Nullable
		private String waitForTimeout;

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
		 * Limit the information returned to the specified metrics
		 * <p>
		 * API name: {@code metric}
		 */
		public final Builder metric(@Nullable List<String> value) {
			this.metric = value;
			return this;
		}

		/**
		 * Limit the information returned to the specified metrics
		 * <p>
		 * API name: {@code metric}
		 */
		public final Builder metric(String... value) {
			this.metric = Arrays.asList(value);
			return this;
		}

		/**
		 * Wait for the metadata version to be equal or greater than the specified
		 * metadata version
		 * <p>
		 * API name: {@code wait_for_metadata_version}
		 */
		public final Builder waitForMetadataVersion(@Nullable Long value) {
			this.waitForMetadataVersion = value;
			return this;
		}

		/**
		 * The maximum time to wait for wait_for_metadata_version before timing out
		 * <p>
		 * API name: {@code wait_for_timeout}
		 */
		public final Builder waitForTimeout(@Nullable String value) {
			this.waitForTimeout = value;
			return this;
		}

		/**
		 * Builds a {@link StateRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StateRequest build() {
			_checkSingleUse();

			return new StateRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code cluster.state}".
	 */
	public static final Endpoint<StateRequest, StateResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _metric = 1 << 0;
				final int _index = 1 << 1;

				int propsSet = 0;

				if (ModelTypeHelper.isDefined(request.metric()))
					propsSet |= _metric;
				if (ModelTypeHelper.isDefined(request.index()))
					propsSet |= _index;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_cluster");
					buf.append("/state");
					return buf.toString();
				}
				if (propsSet == (_metric)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_cluster");
					buf.append("/state");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.metric.stream().map(v -> v).collect(Collectors.joining(",")),
							buf);
					return buf.toString();
				}
				if (propsSet == (_metric | _index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_cluster");
					buf.append("/state");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.metric.stream().map(v -> v).collect(Collectors.joining(",")),
							buf);
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
				if (request.waitForTimeout != null) {
					params.put("wait_for_timeout", request.waitForTimeout);
				}
				if (request.allowNoIndices != null) {
					params.put("allow_no_indices", String.valueOf(request.allowNoIndices));
				}
				if (request.waitForMetadataVersion != null) {
					params.put("wait_for_metadata_version", String.valueOf(request.waitForMetadataVersion));
				}
				if (request.local != null) {
					params.put("local", String.valueOf(request.local));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, StateResponse._DESERIALIZER);
}
