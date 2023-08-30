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
import java.util.Collections;
import java.util.Objects;

// typedef: security.authenticate.Request

/**
 * Enables you to submit a request with a basic auth header to authenticate a
 * user and retrieve information about the authenticated user. A successful call
 * returns a JSON structure that shows user information such as their username,
 * the roles that are assigned to the user, any assigned metadata, and
 * information about the realms that authenticated and authorized the user. If
 * the user cannot be authenticated, this API returns a 401 status code.
 * 
 * @see <a href="../doc-files/api-spec.html#security.authenticate.Request">API
 *      specification</a>
 */

public class AuthenticateRequest extends RequestBase {
	public AuthenticateRequest() {
	}

	/**
	 * Singleton instance for {@link AuthenticateRequest}.
	 */
	public static final AuthenticateRequest _INSTANCE = new AuthenticateRequest();

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.authenticate}".
	 */
	public static final Endpoint<AuthenticateRequest, AuthenticateResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/security.authenticate",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				return "/_security/_authenticate";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), false, AuthenticateResponse._DESERIALIZER);
}
