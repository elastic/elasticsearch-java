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

package co.elastic.clients.elasticsearch.searchable_snapshots;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
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

// typedef: searchable_snapshots.stats.Request

/**
 * Retrieve shard-level statistics about searchable snapshots.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#searchable_snapshots.stats.Request">API
 *      specification</a>
 */

public class SearchableSnapshotsStatsRequest extends RequestBase {
	private final List<String> index;

	@Nullable
	private final StatsLevel level;

	// ---------------------------------------------------------------------------------------------

	private SearchableSnapshotsStatsRequest(Builder builder) {

		this.index = ApiTypeHelper.unmodifiable(builder.index);
		this.level = builder.level;

	}

	public static SearchableSnapshotsStatsRequest of(
			Function<Builder, ObjectBuilder<SearchableSnapshotsStatsRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * A comma-separated list of index names
	 * <p>
	 * API name: {@code index}
	 */
	public final List<String> index() {
		return this.index;
	}

	/**
	 * Return stats aggregated at cluster, index or shard level
	 * <p>
	 * API name: {@code level}
	 */
	@Nullable
	public final StatsLevel level() {
		return this.level;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SearchableSnapshotsStatsRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<SearchableSnapshotsStatsRequest> {
		@Nullable
		private List<String> index;

		@Nullable
		private StatsLevel level;

		/**
		 * A comma-separated list of index names
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
		 * A comma-separated list of index names
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
		 * Return stats aggregated at cluster, index or shard level
		 * <p>
		 * API name: {@code level}
		 */
		public final Builder level(@Nullable StatsLevel value) {
			this.level = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SearchableSnapshotsStatsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SearchableSnapshotsStatsRequest build() {
			_checkSingleUse();

			return new SearchableSnapshotsStatsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code searchable_snapshots.stats}".
	 */
	public static final Endpoint<SearchableSnapshotsStatsRequest, SearchableSnapshotsStatsResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/searchable_snapshots.stats",

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
					buf.append("/_searchable_snapshots");
					buf.append("/stats");
					return buf.toString();
				}
				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					buf.append("/_searchable_snapshots");
					buf.append("/stats");
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
				if (request.level != null) {
					params.put("level", request.level.jsonValue());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, SearchableSnapshotsStatsResponse._DESERIALIZER);
}
