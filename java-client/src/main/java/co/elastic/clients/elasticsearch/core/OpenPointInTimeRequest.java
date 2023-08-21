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
import co.elastic.clients.elasticsearch._types.Time;
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

// typedef: _global.open_point_in_time.Request

/**
 * A search request by default executes against the most recent visible data of
 * the target indices, which is called point in time. Elasticsearch pit (point
 * in time) is a lightweight view into the state of the data as it existed when
 * initiated. In some cases, it’s preferred to perform multiple search requests
 * using the same point in time. For example, if refreshes happen between
 * <code>search_after</code> requests, then the results of those requests might
 * not be consistent as changes happening between searches are only visible to
 * the more recent point in time.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#_global.open_point_in_time.Request">API
 *      specification</a>
 */

public class OpenPointInTimeRequest extends RequestBase {
	private final List<ExpandWildcard> expandWildcards;

	@Nullable
	private final Boolean ignoreUnavailable;

	private final List<String> index;

	private final Time keepAlive;

	@Nullable
	private final String preference;

	@Nullable
	private final String routing;

	// ---------------------------------------------------------------------------------------------

	private OpenPointInTimeRequest(Builder builder) {

		this.expandWildcards = ApiTypeHelper.unmodifiable(builder.expandWildcards);
		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.index = ApiTypeHelper.unmodifiableRequired(builder.index, this, "index");
		this.keepAlive = ApiTypeHelper.requireNonNull(builder.keepAlive, this, "keepAlive");
		this.preference = builder.preference;
		this.routing = builder.routing;

	}

	public static OpenPointInTimeRequest of(Function<Builder, ObjectBuilder<OpenPointInTimeRequest>> fn) {
		return fn.apply(new Builder()).build();
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
	 * Required - A comma-separated list of index names to open point in time; use
	 * <code>_all</code> or empty string to perform the operation on all indices
	 * <p>
	 * API name: {@code index}
	 */
	public final List<String> index() {
		return this.index;
	}

	/**
	 * Required - Specific the time to live for the point in time
	 * <p>
	 * API name: {@code keep_alive}
	 */
	public final Time keepAlive() {
		return this.keepAlive;
	}

	/**
	 * Specify the node or shard the operation should be performed on (default:
	 * random)
	 * <p>
	 * API name: {@code preference}
	 */
	@Nullable
	public final String preference() {
		return this.preference;
	}

	/**
	 * Specific routing value
	 * <p>
	 * API name: {@code routing}
	 */
	@Nullable
	public final String routing() {
		return this.routing;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link OpenPointInTimeRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<OpenPointInTimeRequest> {
		@Nullable
		private List<ExpandWildcard> expandWildcards;

		@Nullable
		private Boolean ignoreUnavailable;

		private List<String> index;

		private Time keepAlive;

		@Nullable
		private String preference;

		@Nullable
		private String routing;

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
		 * Required - A comma-separated list of index names to open point in time; use
		 * <code>_all</code> or empty string to perform the operation on all indices
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
		 * Required - A comma-separated list of index names to open point in time; use
		 * <code>_all</code> or empty string to perform the operation on all indices
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
		 * Required - Specific the time to live for the point in time
		 * <p>
		 * API name: {@code keep_alive}
		 */
		public final Builder keepAlive(Time value) {
			this.keepAlive = value;
			return this;
		}

		/**
		 * Required - Specific the time to live for the point in time
		 * <p>
		 * API name: {@code keep_alive}
		 */
		public final Builder keepAlive(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.keepAlive(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Specify the node or shard the operation should be performed on (default:
		 * random)
		 * <p>
		 * API name: {@code preference}
		 */
		public final Builder preference(@Nullable String value) {
			this.preference = value;
			return this;
		}

		/**
		 * Specific routing value
		 * <p>
		 * API name: {@code routing}
		 */
		public final Builder routing(@Nullable String value) {
			this.routing = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link OpenPointInTimeRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public OpenPointInTimeRequest build() {
			_checkSingleUse();

			return new OpenPointInTimeRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code open_point_in_time}".
	 */
	public static final Endpoint<OpenPointInTimeRequest, OpenPointInTimeResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/open_point_in_time",

			// Request method
			request -> {
				return "POST";

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
					buf.append("/_pit");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _index = 1 << 0;

				int propsSet = 0;

				propsSet |= _index;

				if (propsSet == (_index)) {
					params.put("index", request.index.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.routing != null) {
					params.put("routing", request.routing);
				}
				if (request.ignoreUnavailable != null) {
					params.put("ignore_unavailable", String.valueOf(request.ignoreUnavailable));
				}
				if (ApiTypeHelper.isDefined(request.expandWildcards)) {
					params.put("expand_wildcards",
							request.expandWildcards.stream().map(v -> v.jsonValue()).collect(Collectors.joining(",")));
				}
				if (request.preference != null) {
					params.put("preference", request.preference);
				}
				params.put("keep_alive", request.keepAlive._toJsonString());
				return params;

			}, SimpleEndpoint.emptyMap(), false, OpenPointInTimeResponse._DESERIALIZER);
}
