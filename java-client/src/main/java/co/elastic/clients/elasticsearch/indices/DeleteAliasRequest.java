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
import java.lang.String;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: indices.delete_alias.Request

public class DeleteAliasRequest extends RequestBase {
	private final List<String> index;

	@Nullable
	private final String masterTimeout;

	private final List<String> name;

	@Nullable
	private final String timeout;

	// ---------------------------------------------------------------------------------------------

	private DeleteAliasRequest(Builder builder) {

		this.index = ModelTypeHelper.unmodifiableRequired(builder.index, this, "index");
		this.masterTimeout = builder.masterTimeout;
		this.name = ModelTypeHelper.unmodifiableRequired(builder.name, this, "name");
		this.timeout = builder.timeout;

	}

	public static DeleteAliasRequest of(Function<Builder, ObjectBuilder<DeleteAliasRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - A comma-separated list of index names (supports wildcards); use
	 * <code>_all</code> for all indices
	 * <p>
	 * API name: {@code index}
	 */
	public final List<String> index() {
		return this.index;
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
	 * Required - A comma-separated list of aliases to delete (supports wildcards);
	 * use <code>_all</code> to delete all aliases for the specified indices.
	 * <p>
	 * API name: {@code name}
	 */
	public final List<String> name() {
		return this.name;
	}

	/**
	 * Explicit timestamp for the document
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final String timeout() {
		return this.timeout;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteAliasRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<DeleteAliasRequest> {
		private List<String> index;

		@Nullable
		private String masterTimeout;

		private List<String> name;

		@Nullable
		private String timeout;

		/**
		 * Required - A comma-separated list of index names (supports wildcards); use
		 * <code>_all</code> for all indices
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(List<String> value) {
			this.index = value;
			return this;
		}

		/**
		 * Required - A comma-separated list of index names (supports wildcards); use
		 * <code>_all</code> for all indices
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(String... value) {
			this.index = Arrays.asList(value);
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
		 * Required - A comma-separated list of aliases to delete (supports wildcards);
		 * use <code>_all</code> to delete all aliases for the specified indices.
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(List<String> value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - A comma-separated list of aliases to delete (supports wildcards);
		 * use <code>_all</code> to delete all aliases for the specified indices.
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(String... value) {
			this.name = Arrays.asList(value);
			return this;
		}

		/**
		 * Explicit timestamp for the document
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable String value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Builds a {@link DeleteAliasRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteAliasRequest build() {
			_checkSingleUse();

			return new DeleteAliasRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.delete_alias}".
	 */
	public static final Endpoint<DeleteAliasRequest, DeleteAliasResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "DELETE";

			},

			// Request path
			request -> {
				final int _name = 1 << 0;
				final int _index = 1 << 1;

				int propsSet = 0;

				propsSet |= _name;
				propsSet |= _index;

				if (propsSet == (_index | _name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					buf.append("/_alias");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.name.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					return buf.toString();
				}
				if (propsSet == (_index | _name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					buf.append("/_aliases");
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
				if (request.timeout != null) {
					params.put("timeout", request.timeout);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, DeleteAliasResponse._DESERIALIZER);
}
