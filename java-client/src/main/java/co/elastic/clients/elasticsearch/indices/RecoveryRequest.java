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

// typedef: indices.recovery.Request

/**
 * Get index recovery information.
 * <p>
 * Get information about ongoing and completed shard recoveries for one or more
 * indices. For data streams, the API returns information for the stream's
 * backing indices.
 * <p>
 * All recoveries, whether ongoing or complete, are kept in the cluster state
 * and may be reported on at any time.
 * <p>
 * Shard recovery is the process of initializing a shard copy, such as restoring
 * a primary shard from a snapshot or creating a replica shard from a primary
 * shard. When a shard recovery completes, the recovered shard is available for
 * search and indexing.
 * <p>
 * Recovery automatically occurs during the following processes:
 * <ul>
 * <li>When creating an index for the first time.</li>
 * <li>When a node rejoins the cluster and starts up any missing primary shard
 * copies using the data that it holds in its data path.</li>
 * <li>Creation of new replica shard copies from the primary.</li>
 * <li>Relocation of a shard copy to a different node in the same cluster.</li>
 * <li>A snapshot restore operation.</li>
 * <li>A clone, shrink, or split operation.</li>
 * </ul>
 * <p>
 * You can determine the cause of a shard recovery using the recovery or cat
 * recovery APIs.
 * <p>
 * The index recovery API reports information about completed recoveries only
 * for shard copies that currently exist in the cluster. It only reports the
 * last recovery for each shard copy and does not report historical information
 * about earlier recoveries, nor does it report information about the recoveries
 * of shard copies that no longer exist. This means that if a shard copy
 * completes a recovery and then Elasticsearch relocates it onto a different
 * node then the information about the original recovery will not be shown in
 * the recovery API.
 * 
 * @see <a href="../doc-files/api-spec.html#indices.recovery.Request">API
 *      specification</a>
 */

public class RecoveryRequest extends RequestBase {
	@Nullable
	private final Boolean activeOnly;

	@Nullable
	private final Boolean allowNoIndices;

	@Nullable
	private final Boolean detailed;

	private final List<ExpandWildcard> expandWildcards;

	@Nullable
	private final Boolean ignoreUnavailable;

	private final List<String> index;

	// ---------------------------------------------------------------------------------------------

	private RecoveryRequest(Builder builder) {

		this.activeOnly = builder.activeOnly;
		this.allowNoIndices = builder.allowNoIndices;
		this.detailed = builder.detailed;
		this.expandWildcards = ApiTypeHelper.unmodifiable(builder.expandWildcards);
		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.index = ApiTypeHelper.unmodifiable(builder.index);

	}

	public static RecoveryRequest of(Function<Builder, ObjectBuilder<RecoveryRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * If <code>true</code>, the response only includes ongoing shard recoveries.
	 * <p>
	 * API name: {@code active_only}
	 */
	@Nullable
	public final Boolean activeOnly() {
		return this.activeOnly;
	}

	/**
	 * If <code>false</code>, the request returns an error if any wildcard
	 * expression, index alias, or <code>_all</code> value targets only missing or
	 * closed indices. This behavior applies even if the request targets other open
	 * indices.
	 * <p>
	 * API name: {@code allow_no_indices}
	 */
	@Nullable
	public final Boolean allowNoIndices() {
		return this.allowNoIndices;
	}

	/**
	 * If <code>true</code>, the response includes detailed information about shard
	 * recoveries.
	 * <p>
	 * API name: {@code detailed}
	 */
	@Nullable
	public final Boolean detailed() {
		return this.detailed;
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
	 * Comma-separated list of data streams, indices, and aliases used to limit the
	 * request. Supports wildcards (<code>*</code>). To target all data streams and
	 * indices, omit this parameter or use <code>*</code> or <code>_all</code>.
	 * <p>
	 * API name: {@code index}
	 */
	public final List<String> index() {
		return this.index;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RecoveryRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder> implements ObjectBuilder<RecoveryRequest> {
		@Nullable
		private Boolean activeOnly;

		@Nullable
		private Boolean allowNoIndices;

		@Nullable
		private Boolean detailed;

		@Nullable
		private List<ExpandWildcard> expandWildcards;

		@Nullable
		private Boolean ignoreUnavailable;

		@Nullable
		private List<String> index;

		public Builder() {
		}
		private Builder(RecoveryRequest instance) {
			this.activeOnly = instance.activeOnly;
			this.allowNoIndices = instance.allowNoIndices;
			this.detailed = instance.detailed;
			this.expandWildcards = instance.expandWildcards;
			this.ignoreUnavailable = instance.ignoreUnavailable;
			this.index = instance.index;

		}
		/**
		 * If <code>true</code>, the response only includes ongoing shard recoveries.
		 * <p>
		 * API name: {@code active_only}
		 */
		public final Builder activeOnly(@Nullable Boolean value) {
			this.activeOnly = value;
			return this;
		}

		/**
		 * If <code>false</code>, the request returns an error if any wildcard
		 * expression, index alias, or <code>_all</code> value targets only missing or
		 * closed indices. This behavior applies even if the request targets other open
		 * indices.
		 * <p>
		 * API name: {@code allow_no_indices}
		 */
		public final Builder allowNoIndices(@Nullable Boolean value) {
			this.allowNoIndices = value;
			return this;
		}

		/**
		 * If <code>true</code>, the response includes detailed information about shard
		 * recoveries.
		 * <p>
		 * API name: {@code detailed}
		 */
		public final Builder detailed(@Nullable Boolean value) {
			this.detailed = value;
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
		 * Comma-separated list of data streams, indices, and aliases used to limit the
		 * request. Supports wildcards (<code>*</code>). To target all data streams and
		 * indices, omit this parameter or use <code>*</code> or <code>_all</code>.
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
		 * request. Supports wildcards (<code>*</code>). To target all data streams and
		 * indices, omit this parameter or use <code>*</code> or <code>_all</code>.
		 * <p>
		 * API name: {@code index}
		 * <p>
		 * Adds one or more values to <code>index</code>.
		 */
		public final Builder index(String value, String... values) {
			this.index = _listAdd(this.index, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RecoveryRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RecoveryRequest build() {
			_checkSingleUse();

			return new RecoveryRequest(this);
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
	 * Endpoint "{@code indices.recovery}".
	 */
	public static final Endpoint<RecoveryRequest, RecoveryResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/indices.recovery",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;

				int propsSet = 0;

				if (ApiTypeHelper.isDefined(request.index()))
					propsSet |= _index;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_recovery");
					return buf.toString();
				}
				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					buf.append("/_recovery");
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
				if (request.detailed != null) {
					params.put("detailed", String.valueOf(request.detailed));
				}
				if (ApiTypeHelper.isDefined(request.expandWildcards)) {
					params.put("expand_wildcards",
							request.expandWildcards.stream().map(v -> v.jsonValue()).collect(Collectors.joining(",")));
				}
				if (request.ignoreUnavailable != null) {
					params.put("ignore_unavailable", String.valueOf(request.ignoreUnavailable));
				}
				if (request.activeOnly != null) {
					params.put("active_only", String.valueOf(request.activeOnly));
				}
				if (request.allowNoIndices != null) {
					params.put("allow_no_indices", String.valueOf(request.allowNoIndices));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, RecoveryResponse._DESERIALIZER);
}
