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

package co.elastic.clients.elasticsearch.cat;

import co.elastic.clients.elasticsearch._types.Bytes;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.ExpandWildcard;
import co.elastic.clients.elasticsearch._types.HealthStatus;
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

// typedef: cat.indices.Request

/**
 * Returns information about indices: number of primaries and replicas, document
 * counts, disk size, ...
 * 
 * @see <a href="../doc-files/api-spec.html#cat.indices.Request">API
 *      specification</a>
 */

public class IndicesRequest extends CatRequestBase {
	@Nullable
	private final Bytes bytes;

	private final List<ExpandWildcard> expandWildcards;

	@Nullable
	private final HealthStatus health;

	@Nullable
	private final Boolean includeUnloadedSegments;

	private final List<String> index;

	@Nullable
	private final Boolean pri;

	// ---------------------------------------------------------------------------------------------

	private IndicesRequest(Builder builder) {

		this.bytes = builder.bytes;
		this.expandWildcards = ApiTypeHelper.unmodifiable(builder.expandWildcards);
		this.health = builder.health;
		this.includeUnloadedSegments = builder.includeUnloadedSegments;
		this.index = ApiTypeHelper.unmodifiable(builder.index);
		this.pri = builder.pri;

	}

	public static IndicesRequest of(Function<Builder, ObjectBuilder<IndicesRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The unit in which to display byte values
	 * <p>
	 * API name: {@code bytes}
	 */
	@Nullable
	public final Bytes bytes() {
		return this.bytes;
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
	 * A health status (&quot;green&quot;, &quot;yellow&quot;, or &quot;red&quot; to
	 * filter only indices matching the specified health status
	 * <p>
	 * API name: {@code health}
	 */
	@Nullable
	public final HealthStatus health() {
		return this.health;
	}

	/**
	 * If set to true segment stats will include stats for segments that are not
	 * currently loaded into memory
	 * <p>
	 * API name: {@code include_unloaded_segments}
	 */
	@Nullable
	public final Boolean includeUnloadedSegments() {
		return this.includeUnloadedSegments;
	}

	/**
	 * A comma-separated list of index names to limit the returned information
	 * <p>
	 * API name: {@code index}
	 */
	public final List<String> index() {
		return this.index;
	}

	/**
	 * Set to true to return stats only for primary shards
	 * <p>
	 * API name: {@code pri}
	 */
	@Nullable
	public final Boolean pri() {
		return this.pri;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndicesRequest}.
	 */

	public static class Builder extends CatRequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<IndicesRequest> {
		@Nullable
		private Bytes bytes;

		@Nullable
		private List<ExpandWildcard> expandWildcards;

		@Nullable
		private HealthStatus health;

		@Nullable
		private Boolean includeUnloadedSegments;

		@Nullable
		private List<String> index;

		@Nullable
		private Boolean pri;

		/**
		 * The unit in which to display byte values
		 * <p>
		 * API name: {@code bytes}
		 */
		public final Builder bytes(@Nullable Bytes value) {
			this.bytes = value;
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
		 * A health status (&quot;green&quot;, &quot;yellow&quot;, or &quot;red&quot; to
		 * filter only indices matching the specified health status
		 * <p>
		 * API name: {@code health}
		 */
		public final Builder health(@Nullable HealthStatus value) {
			this.health = value;
			return this;
		}

		/**
		 * If set to true segment stats will include stats for segments that are not
		 * currently loaded into memory
		 * <p>
		 * API name: {@code include_unloaded_segments}
		 */
		public final Builder includeUnloadedSegments(@Nullable Boolean value) {
			this.includeUnloadedSegments = value;
			return this;
		}

		/**
		 * A comma-separated list of index names to limit the returned information
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
		 * A comma-separated list of index names to limit the returned information
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
		 * Set to true to return stats only for primary shards
		 * <p>
		 * API name: {@code pri}
		 */
		public final Builder pri(@Nullable Boolean value) {
			this.pri = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IndicesRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndicesRequest build() {
			_checkSingleUse();

			return new IndicesRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code cat.indices}".
	 */
	public static final Endpoint<IndicesRequest, IndicesResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/cat.indices",

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
					buf.append("/_cat");
					buf.append("/indices");
					return buf.toString();
				}
				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_cat");
					buf.append("/indices");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				params.put("format", "json");
				if (ApiTypeHelper.isDefined(request.expandWildcards)) {
					params.put("expand_wildcards",
							request.expandWildcards.stream().map(v -> v.jsonValue()).collect(Collectors.joining(",")));
				}
				if (request.bytes != null) {
					params.put("bytes", request.bytes.jsonValue());
				}
				if (request.pri != null) {
					params.put("pri", String.valueOf(request.pri));
				}
				if (request.health != null) {
					params.put("health", request.health.jsonValue());
				}
				if (request.includeUnloadedSegments != null) {
					params.put("include_unloaded_segments", String.valueOf(request.includeUnloadedSegments));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, IndicesResponse._DESERIALIZER);
}
