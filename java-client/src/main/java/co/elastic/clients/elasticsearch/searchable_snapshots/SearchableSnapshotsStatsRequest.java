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

package co.elastic.clients.elasticsearch.searchable_snapshots;

import co.elastic.clients.base.Endpoint;
import co.elastic.clients.base.SimpleEndpoint;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: searchable_snapshots.stats.Request

public final class SearchableSnapshotsStatsRequest extends RequestBase {
	@Nullable
	private final List<String> index;

	@Nullable
	private final StatsLevel level;

	// ---------------------------------------------------------------------------------------------

	public SearchableSnapshotsStatsRequest(Builder builder) {

		this.index = ModelTypeHelper.unmodifiable(builder.index);
		this.level = builder.level;

	}

	public SearchableSnapshotsStatsRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * A comma-separated list of index names
	 * <p>
	 * API name: {@code index}
	 */
	@Nullable
	public List<String> index() {
		return this.index;
	}

	/**
	 * Return stats aggregated at cluster, index or shard level
	 * <p>
	 * API name: {@code level}
	 */
	@Nullable
	public StatsLevel level() {
		return this.level;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SearchableSnapshotsStatsRequest}.
	 */
	public static class Builder implements ObjectBuilder<SearchableSnapshotsStatsRequest> {
		@Nullable
		private List<String> index;

		@Nullable
		private StatsLevel level;

		/**
		 * A comma-separated list of index names
		 * <p>
		 * API name: {@code index}
		 */
		public Builder index(@Nullable List<String> value) {
			this.index = value;
			return this;
		}

		/**
		 * A comma-separated list of index names
		 * <p>
		 * API name: {@code index}
		 */
		public Builder index(String... value) {
			this.index = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #index(List)}, creating the list if needed.
		 */
		public Builder addIndex(String value) {
			if (this.index == null) {
				this.index = new ArrayList<>();
			}
			this.index.add(value);
			return this;
		}

		/**
		 * Return stats aggregated at cluster, index or shard level
		 * <p>
		 * API name: {@code level}
		 */
		public Builder level(@Nullable StatsLevel value) {
			this.level = value;
			return this;
		}

		/**
		 * Builds a {@link SearchableSnapshotsStatsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SearchableSnapshotsStatsRequest build() {

			return new SearchableSnapshotsStatsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code searchable_snapshots.stats}".
	 */
	public static final Endpoint<SearchableSnapshotsStatsRequest, SearchableSnapshotsStatsResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;

				int propsSet = 0;

				if (request.index() != null)
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

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.level != null) {
					params.put("level", request.level.toString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, SearchableSnapshotsStatsResponse._DESERIALIZER);
}
