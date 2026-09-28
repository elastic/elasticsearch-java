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

package co.elastic.clients.elasticsearch.security;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch.security.get_service_accounts.ServiceAccountType;
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

// typedef: security.get_service_accounts.Request

/**
 * Get service accounts.
 * <p>
 * Get a list of service accounts that match the provided path parameters.
 * Built-in service accounts ship with Elasticsearch in the <code>elastic</code>
 * namespace; user-managed service accounts are created with the put
 * user-managed service account API.
 * <p>
 * NOTE: When <code>type</code> is omitted, a request without a namespace
 * reports built-in accounts only, which preserves the response of a
 * whole-cluster listing. A request scoped to a namespace reports both kinds, so
 * an account you created is found without naming its kind.
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

	private final List<ServiceAccountType> type;

	// ---------------------------------------------------------------------------------------------

	private GetServiceAccountsRequest(Builder builder) {

		this.namespace = builder.namespace;
		this.service = builder.service;
		this.type = ApiTypeHelper.unmodifiable(builder.type);

	}

	public static GetServiceAccountsRequest of(Function<Builder, ObjectBuilder<GetServiceAccountsRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The name of the namespace. Omit this parameter to retrieve information about
	 * all service accounts. If you omit this parameter, you must also omit the
	 * <code>service</code> parameter.
	 * <p>
	 * API name: {@code namespace}
	 */
	@Nullable
	public final String namespace() {
		return this.namespace;
	}

	/**
	 * The service name. Omit this parameter to retrieve information about all
	 * service accounts that belong to the specified <code>namespace</code>.
	 * <p>
	 * API name: {@code service}
	 */
	@Nullable
	public final String service() {
		return this.service;
	}

	/**
	 * A comma-separated list of the kinds of service account to return. If it is
	 * omitted, it defaults to <code>built_in</code> when no namespace is given and
	 * to <code>built_in,user_managed</code> otherwise.
	 * <p>
	 * API name: {@code type}
	 */
	public final List<ServiceAccountType> type() {
		return this.type;
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

		@Nullable
		private List<ServiceAccountType> type;

		public Builder() {
		}
		private Builder(GetServiceAccountsRequest instance) {
			this.namespace = instance.namespace;
			this.service = instance.service;
			this.type = instance.type;

		}
		/**
		 * The name of the namespace. Omit this parameter to retrieve information about
		 * all service accounts. If you omit this parameter, you must also omit the
		 * <code>service</code> parameter.
		 * <p>
		 * API name: {@code namespace}
		 */
		public final Builder namespace(@Nullable String value) {
			this.namespace = value;
			return this;
		}

		/**
		 * The service name. Omit this parameter to retrieve information about all
		 * service accounts that belong to the specified <code>namespace</code>.
		 * <p>
		 * API name: {@code service}
		 */
		public final Builder service(@Nullable String value) {
			this.service = value;
			return this;
		}

		/**
		 * A comma-separated list of the kinds of service account to return. If it is
		 * omitted, it defaults to <code>built_in</code> when no namespace is given and
		 * to <code>built_in,user_managed</code> otherwise.
		 * <p>
		 * API name: {@code type}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>type</code>.
		 */
		public final Builder type(List<ServiceAccountType> list) {
			this.type = _listAddAll(this.type, list);
			return this;
		}

		/**
		 * A comma-separated list of the kinds of service account to return. If it is
		 * omitted, it defaults to <code>built_in</code> when no namespace is given and
		 * to <code>built_in,user_managed</code> otherwise.
		 * <p>
		 * API name: {@code type}
		 * <p>
		 * Adds one or more values to <code>type</code>.
		 */
		public final Builder type(ServiceAccountType value, ServiceAccountType... values) {
			this.type = _listAdd(this.type, value, values);
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

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
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
				Map<String, String> params = new HashMap<>();
				if (ApiTypeHelper.isDefined(request.type)) {
					params.put("type", request.type.stream().map(v -> v.jsonValue()).filter(Objects::nonNull)
							.collect(Collectors.joining(",")));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, GetServiceAccountsResponse._DESERIALIZER);
}
