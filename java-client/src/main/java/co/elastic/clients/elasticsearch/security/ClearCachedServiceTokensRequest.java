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

package co.elastic.clients.elasticsearch.security;

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
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: security.clear_cached_service_tokens.Request

/**
 * Evicts tokens from the service account token caches.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#security.clear_cached_service_tokens.Request">API
 *      specification</a>
 */

public class ClearCachedServiceTokensRequest extends RequestBase {
	private final List<String> name;

	private final String namespace;

	private final String service;

	// ---------------------------------------------------------------------------------------------

	private ClearCachedServiceTokensRequest(Builder builder) {

		this.name = ApiTypeHelper.unmodifiableRequired(builder.name, this, "name");
		this.namespace = ApiTypeHelper.requireNonNull(builder.namespace, this, "namespace");
		this.service = ApiTypeHelper.requireNonNull(builder.service, this, "service");

	}

	public static ClearCachedServiceTokensRequest of(
			Function<Builder, ObjectBuilder<ClearCachedServiceTokensRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - A comma-separated list of service token names
	 * <p>
	 * API name: {@code name}
	 */
	public final List<String> name() {
		return this.name;
	}

	/**
	 * Required - An identifier for the namespace
	 * <p>
	 * API name: {@code namespace}
	 */
	public final String namespace() {
		return this.namespace;
	}

	/**
	 * Required - An identifier for the service name
	 * <p>
	 * API name: {@code service}
	 */
	public final String service() {
		return this.service;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClearCachedServiceTokensRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ClearCachedServiceTokensRequest> {
		private List<String> name;

		private String namespace;

		private String service;

		/**
		 * Required - A comma-separated list of service token names
		 * <p>
		 * API name: {@code name}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>name</code>.
		 */
		public final Builder name(List<String> list) {
			this.name = _listAddAll(this.name, list);
			return this;
		}

		/**
		 * Required - A comma-separated list of service token names
		 * <p>
		 * API name: {@code name}
		 * <p>
		 * Adds one or more values to <code>name</code>.
		 */
		public final Builder name(String value, String... values) {
			this.name = _listAdd(this.name, value, values);
			return this;
		}

		/**
		 * Required - An identifier for the namespace
		 * <p>
		 * API name: {@code namespace}
		 */
		public final Builder namespace(String value) {
			this.namespace = value;
			return this;
		}

		/**
		 * Required - An identifier for the service name
		 * <p>
		 * API name: {@code service}
		 */
		public final Builder service(String value) {
			this.service = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ClearCachedServiceTokensRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClearCachedServiceTokensRequest build() {
			_checkSingleUse();

			return new ClearCachedServiceTokensRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.clear_cached_service_tokens}".
	 */
	public static final Endpoint<ClearCachedServiceTokensRequest, ClearCachedServiceTokensResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/security.clear_cached_service_tokens",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _service = 1 << 0;
				final int _namespace = 1 << 1;
				final int _name = 1 << 2;

				int propsSet = 0;

				propsSet |= _service;
				propsSet |= _namespace;
				propsSet |= _name;

				if (propsSet == (_namespace | _service | _name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/service");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.namespace, buf);
					buf.append("/");
					SimpleEndpoint.pathEncode(request.service, buf);
					buf.append("/credential");
					buf.append("/token");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.name.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					buf.append("/_clear_cache");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _service = 1 << 0;
				final int _namespace = 1 << 1;
				final int _name = 1 << 2;

				int propsSet = 0;

				propsSet |= _service;
				propsSet |= _namespace;
				propsSet |= _name;

				if (propsSet == (_namespace | _service | _name)) {
					params.put("namespace", request.namespace);
					params.put("service", request.service);
					params.put("name", request.name.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), false, ClearCachedServiceTokensResponse._DESERIALIZER);
}
