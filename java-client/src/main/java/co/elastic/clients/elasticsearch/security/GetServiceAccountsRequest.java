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
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.get_service_accounts.Request

/**
 * This API returns a list of service accounts that match the provided path
 * parameter(s).
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#security.get_service_accounts.Request">API
 *      specification</a>
 */

public class GetServiceAccountsRequest extends RequestBase {
	@Nullable
	private final String namespace;

	@Nullable
	private final String service;

	// ---------------------------------------------------------------------------------------------

	private GetServiceAccountsRequest(Builder builder) {

		this.namespace = builder.namespace;
		this.service = builder.service;

	}

	public static GetServiceAccountsRequest of(Function<Builder, ObjectBuilder<GetServiceAccountsRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Name of the namespace. Omit this parameter to retrieve information about all
	 * service accounts. If you omit this parameter, you must also omit the
	 * <code>service</code> parameter.
	 * <p>
	 * API name: {@code namespace}
	 */
	@Nullable
	public final String namespace() {
		return this.namespace;
	}

	/**
	 * Name of the service name. Omit this parameter to retrieve information about
	 * all service accounts that belong to the specified <code>namespace</code>.
	 * <p>
	 * API name: {@code service}
	 */
	@Nullable
	public final String service() {
		return this.service;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetServiceAccountsRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GetServiceAccountsRequest> {
		@Nullable
		private String namespace;

		@Nullable
		private String service;

		/**
		 * Name of the namespace. Omit this parameter to retrieve information about all
		 * service accounts. If you omit this parameter, you must also omit the
		 * <code>service</code> parameter.
		 * <p>
		 * API name: {@code namespace}
		 */
		public final Builder namespace(@Nullable String value) {
			this.namespace = value;
			return this;
		}

		/**
		 * Name of the service name. Omit this parameter to retrieve information about
		 * all service accounts that belong to the specified <code>namespace</code>.
		 * <p>
		 * API name: {@code service}
		 */
		public final Builder service(@Nullable String value) {
			this.service = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetServiceAccountsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetServiceAccountsRequest build() {
			_checkSingleUse();

			return new GetServiceAccountsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.get_service_accounts}".
	 */
	public static final Endpoint<GetServiceAccountsRequest, GetServiceAccountsResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/security.get_service_accounts",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _service = 1 << 0;
				final int _namespace = 1 << 1;

				int propsSet = 0;

				if (request.service() != null)
					propsSet |= _service;
				if (request.namespace() != null)
					propsSet |= _namespace;

				if (propsSet == (_namespace | _service)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/service");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.namespace, buf);
					buf.append("/");
					SimpleEndpoint.pathEncode(request.service, buf);
					return buf.toString();
				}
				if (propsSet == (_namespace)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/service");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.namespace, buf);
					return buf.toString();
				}
				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/service");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _service = 1 << 0;
				final int _namespace = 1 << 1;

				int propsSet = 0;

				if (request.service() != null)
					propsSet |= _service;
				if (request.namespace() != null)
					propsSet |= _namespace;

				if (propsSet == (_namespace | _service)) {
					params.put("namespace", request.namespace);
					params.put("service", request.service);
				}
				if (propsSet == (_namespace)) {
					params.put("namespace", request.namespace);
				}
				if (propsSet == 0) {
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), false, GetServiceAccountsResponse._DESERIALIZER);
}
