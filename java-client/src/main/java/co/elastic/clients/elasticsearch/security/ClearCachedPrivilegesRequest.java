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
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.clear_cached_privileges.Request

/**
 * Evicts application privileges from the native application privileges cache.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#security.clear_cached_privileges.Request">API
 *      specification</a>
 */

public class ClearCachedPrivilegesRequest extends RequestBase {
	private final String application;

	// ---------------------------------------------------------------------------------------------

	private ClearCachedPrivilegesRequest(Builder builder) {

		this.application = ApiTypeHelper.requireNonNull(builder.application, this, "application");

	}

	public static ClearCachedPrivilegesRequest of(Function<Builder, ObjectBuilder<ClearCachedPrivilegesRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - A comma-separated list of application names
	 * <p>
	 * API name: {@code application}
	 */
	public final String application() {
		return this.application;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClearCachedPrivilegesRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ClearCachedPrivilegesRequest> {
		private String application;

		/**
		 * Required - A comma-separated list of application names
		 * <p>
		 * API name: {@code application}
		 */
		public final Builder application(String value) {
			this.application = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ClearCachedPrivilegesRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClearCachedPrivilegesRequest build() {
			_checkSingleUse();

			return new ClearCachedPrivilegesRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.clear_cached_privileges}".
	 */
	public static final Endpoint<ClearCachedPrivilegesRequest, ClearCachedPrivilegesResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/security.clear_cached_privileges",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _application = 1 << 0;

				int propsSet = 0;

				propsSet |= _application;

				if (propsSet == (_application)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/privilege");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.application, buf);
					buf.append("/_clear_cache");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _application = 1 << 0;

				int propsSet = 0;

				propsSet |= _application;

				if (propsSet == (_application)) {
					params.put("application", request.application);
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), false, ClearCachedPrivilegesResponse._DESERIALIZER);
}
