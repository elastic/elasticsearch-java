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

package co.elastic.clients.elasticsearch.cat;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: cat.indices.Request
public final class IndicesRequest extends CatRequestBase {
	@Nullable
	private final List<String> index;

	@Nullable
	private final JsonValue bytes;

	@Nullable
	private final JsonValue expandWildcards;

	@Nullable
	private final JsonValue health;

	@Nullable
	private final Boolean includeUnloadedSegments;

	@Nullable
	private final Boolean pri;

	// ---------------------------------------------------------------------------------------------

	protected IndicesRequest(Builder builder) {

		this.index = builder.index;
		this.bytes = builder.bytes;
		this.expandWildcards = builder.expandWildcards;
		this.health = builder.health;
		this.includeUnloadedSegments = builder.includeUnloadedSegments;
		this.pri = builder.pri;

	}

	/**
	 * A comma-separated list of index names to limit the returned information
	 * <p>
	 * API name: {@code index}
	 */
	@Nullable
	public List<String> index() {
		return this.index;
	}

	/**
	 * The unit in which to display byte values
	 * <p>
	 * API name: {@code bytes}
	 */
	@Nullable
	public JsonValue bytes() {
		return this.bytes;
	}

	/**
	 * Whether to expand wildcard expression to concrete indices that are open,
	 * closed or both.
	 * <p>
	 * API name: {@code expand_wildcards}
	 */
	@Nullable
	public JsonValue expandWildcards() {
		return this.expandWildcards;
	}

	/**
	 * A health status (&quot;green&quot;, &quot;yellow&quot;, or &quot;red&quot; to
	 * filter only indices matching the specified health status
	 * <p>
	 * API name: {@code health}
	 */
	@Nullable
	public JsonValue health() {
		return this.health;
	}

	/**
	 * If set to true segment stats will include stats for segments that are not
	 * currently loaded into memory
	 * <p>
	 * API name: {@code include_unloaded_segments}
	 */
	@Nullable
	public Boolean includeUnloadedSegments() {
		return this.includeUnloadedSegments;
	}

	/**
	 * Set to true to return stats only for primary shards
	 * <p>
	 * API name: {@code pri}
	 */
	@Nullable
	public Boolean pri() {
		return this.pri;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndicesRequest}.
	 */
	public static class Builder implements ObjectBuilder<IndicesRequest> {
		@Nullable
		private List<String> index;

		@Nullable
		private JsonValue bytes;

		@Nullable
		private JsonValue expandWildcards;

		@Nullable
		private JsonValue health;

		@Nullable
		private Boolean includeUnloadedSegments;

		@Nullable
		private Boolean pri;

		/**
		 * A comma-separated list of index names to limit the returned information
		 * <p>
		 * API name: {@code index}
		 */
		public Builder index(@Nullable List<String> value) {
			this.index = value;
			return this;
		}

		/**
		 * A comma-separated list of index names to limit the returned information
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
		 * The unit in which to display byte values
		 * <p>
		 * API name: {@code bytes}
		 */
		public Builder bytes(@Nullable JsonValue value) {
			this.bytes = value;
			return this;
		}

		/**
		 * Whether to expand wildcard expression to concrete indices that are open,
		 * closed or both.
		 * <p>
		 * API name: {@code expand_wildcards}
		 */
		public Builder expandWildcards(@Nullable JsonValue value) {
			this.expandWildcards = value;
			return this;
		}

		/**
		 * A health status (&quot;green&quot;, &quot;yellow&quot;, or &quot;red&quot; to
		 * filter only indices matching the specified health status
		 * <p>
		 * API name: {@code health}
		 */
		public Builder health(@Nullable JsonValue value) {
			this.health = value;
			return this;
		}

		/**
		 * If set to true segment stats will include stats for segments that are not
		 * currently loaded into memory
		 * <p>
		 * API name: {@code include_unloaded_segments}
		 */
		public Builder includeUnloadedSegments(@Nullable Boolean value) {
			this.includeUnloadedSegments = value;
			return this;
		}

		/**
		 * Set to true to return stats only for primary shards
		 * <p>
		 * API name: {@code pri}
		 */
		public Builder pri(@Nullable Boolean value) {
			this.pri = value;
			return this;
		}

		/**
		 * Builds a {@link IndicesRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndicesRequest build() {

			return new IndicesRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code cat.indices}".
	 */
	public static final Endpoint<IndicesRequest, IndicesResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
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
					buf.append("/_cat");
					buf.append("/indices");
					return buf.toString();
				}
				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_cat");
					buf.append("/indices");
					buf.append("/");
					buf.append(request.index.stream().map(v -> v).collect(Collectors.joining(",")));
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.bytes != null) {
					params.put("bytes", request.bytes.toString());
				}
				if (request.expandWildcards != null) {
					params.put("expand_wildcards", request.expandWildcards.toString());
				}
				if (request.health != null) {
					params.put("health", request.health.toString());
				}
				if (request.includeUnloadedSegments != null) {
					params.put("include_unloaded_segments", String.valueOf(request.includeUnloadedSegments));
				}
				if (request.pri != null) {
					params.put("pri", String.valueOf(request.pri));
				}
				return params;

			}, Endpoint.Simple.emptyMap(), false, IndicesResponse.DESERIALIZER);
}
