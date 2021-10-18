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

import co.elastic.clients.base.Endpoint;
import co.elastic.clients.base.SimpleEndpoint;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.ExpandWildcardOptions;
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

// typedef: indices.resolve_index.Request

public final class ResolveIndexRequest extends RequestBase {
	private final List<String> name;

	@Nullable
	private final List<ExpandWildcardOptions> expandWildcards;

	// ---------------------------------------------------------------------------------------------

	public ResolveIndexRequest(Builder builder) {

		this.name = ModelTypeHelper.unmodifiableNonNull(builder.name, "name");
		this.expandWildcards = ModelTypeHelper.unmodifiable(builder.expandWildcards);

	}

	public ResolveIndexRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - A comma-separated list of names or wildcard expressions
	 * <p>
	 * API name: {@code name}
	 */
	public List<String> name() {
		return this.name;
	}

	/**
	 * Whether wildcard expressions should get expanded to open or closed indices
	 * (default: open)
	 * <p>
	 * API name: {@code expand_wildcards}
	 */
	@Nullable
	public List<ExpandWildcardOptions> expandWildcards() {
		return this.expandWildcards;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ResolveIndexRequest}.
	 */
	public static class Builder implements ObjectBuilder<ResolveIndexRequest> {
		private List<String> name;

		@Nullable
		private List<ExpandWildcardOptions> expandWildcards;

		/**
		 * Required - A comma-separated list of names or wildcard expressions
		 * <p>
		 * API name: {@code name}
		 */
		public Builder name(List<String> value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - A comma-separated list of names or wildcard expressions
		 * <p>
		 * API name: {@code name}
		 */
		public Builder name(String... value) {
			this.name = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #name(List)}, creating the list if needed.
		 */
		public Builder addName(String value) {
			if (this.name == null) {
				this.name = new ArrayList<>();
			}
			this.name.add(value);
			return this;
		}

		/**
		 * Whether wildcard expressions should get expanded to open or closed indices
		 * (default: open)
		 * <p>
		 * API name: {@code expand_wildcards}
		 */
		public Builder expandWildcards(@Nullable List<ExpandWildcardOptions> value) {
			this.expandWildcards = value;
			return this;
		}

		/**
		 * Whether wildcard expressions should get expanded to open or closed indices
		 * (default: open)
		 * <p>
		 * API name: {@code expand_wildcards}
		 */
		public Builder expandWildcards(ExpandWildcardOptions... value) {
			this.expandWildcards = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #expandWildcards(List)}, creating the list if needed.
		 */
		public Builder addExpandWildcards(ExpandWildcardOptions value) {
			if (this.expandWildcards == null) {
				this.expandWildcards = new ArrayList<>();
			}
			this.expandWildcards.add(value);
			return this;
		}

		/**
		 * Builds a {@link ResolveIndexRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ResolveIndexRequest build() {

			return new ResolveIndexRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.resolve_index}".
	 */
	public static final Endpoint<ResolveIndexRequest, ResolveIndexResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _name = 1 << 0;

				int propsSet = 0;

				propsSet |= _name;

				if (propsSet == (_name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_resolve");
					buf.append("/index");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.name.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.expandWildcards != null) {
					params.put("expand_wildcards",
							request.expandWildcards.stream().map(v -> v.toString()).collect(Collectors.joining(",")));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, ResolveIndexResponse._DESERIALIZER);
}
