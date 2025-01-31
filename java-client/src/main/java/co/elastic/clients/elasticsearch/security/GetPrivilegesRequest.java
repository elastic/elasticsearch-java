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

// typedef: security.get_privileges.Request

/**
 * Get application privileges.
 * <p>
 * To use this API, you must have one of the following privileges:
 * <ul>
 * <li>The <code>read_security</code> cluster privilege (or a greater privilege
 * such as <code>manage_security</code> or <code>all</code>).</li>
 * <li>The &quot;Manage Application Privileges&quot; global privilege for the
 * application being referenced in the request.</li>
 * </ul>
 *
 * @see <a href="../doc-files/api-spec.html#security.get_privileges.Request">API
 *      specification</a>
 */

public class GetPrivilegesRequest extends RequestBase {
	@Nullable
	private final String application;

	private final List<String> name;

	// ---------------------------------------------------------------------------------------------

	private GetPrivilegesRequest(Builder builder) {

		this.application = builder.application;
		this.name = ApiTypeHelper.unmodifiable(builder.name);

	}

	public static GetPrivilegesRequest of(Function<Builder, ObjectBuilder<GetPrivilegesRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The name of the application. Application privileges are always associated
	 * with exactly one application. If you do not specify this parameter, the API
	 * returns information about all privileges for all applications.
	 * <p>
	 * API name: {@code application}
	 */
	@Nullable
	public final String application() {
		return this.application;
	}

	/**
	 * The name of the privilege. If you do not specify this parameter, the API
	 * returns information about all privileges for the requested application.
	 * <p>
	 * API name: {@code name}
	 */
	public final List<String> name() {
		return this.name;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetPrivilegesRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GetPrivilegesRequest> {
		@Nullable
		private String application;

		@Nullable
		private List<String> name;

		/**
		 * The name of the application. Application privileges are always associated
		 * with exactly one application. If you do not specify this parameter, the API
		 * returns information about all privileges for all applications.
		 * <p>
		 * API name: {@code application}
		 */
		public final Builder application(@Nullable String value) {
			this.application = value;
			return this;
		}

		/**
		 * The name of the privilege. If you do not specify this parameter, the API
		 * returns information about all privileges for the requested application.
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
		 * The name of the privilege. If you do not specify this parameter, the API
		 * returns information about all privileges for the requested application.
		 * <p>
		 * API name: {@code name}
		 * <p>
		 * Adds one or more values to <code>name</code>.
		 */
		public final Builder name(String value, String... values) {
			this.name = _listAdd(this.name, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetPrivilegesRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetPrivilegesRequest build() {
			_checkSingleUse();

			return new GetPrivilegesRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.get_privileges}".
	 */
	public static final Endpoint<GetPrivilegesRequest, GetPrivilegesResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/security.get_privileges",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _application = 1 << 0;
				final int _name = 1 << 1;

				int propsSet = 0;

				if (request.application() != null)
					propsSet |= _application;
				if (ApiTypeHelper.isDefined(request.name()))
					propsSet |= _name;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/privilege");
					return buf.toString();
				}
				if (propsSet == (_application)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/privilege");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.application, buf);
					return buf.toString();
				}
				if (propsSet == (_application | _name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/privilege");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.application, buf);
					buf.append("/");
					SimpleEndpoint.pathEncode(request.name.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _application = 1 << 0;
				final int _name = 1 << 1;

				int propsSet = 0;

				if (request.application() != null)
					propsSet |= _application;
				if (ApiTypeHelper.isDefined(request.name()))
					propsSet |= _name;

				if (propsSet == 0) {
				}
				if (propsSet == (_application)) {
					params.put("application", request.application);
				}
				if (propsSet == (_application | _name)) {
					params.put("application", request.application);
					params.put("name", request.name.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), false, GetPrivilegesResponse._DESERIALIZER);
}
