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
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Collections;
import java.util.Objects;

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

// typedef: security.enroll_node.Request

/**
 * Allows a new node to join an existing cluster with security features enabled.
 * 
 * @see <a href="../doc-files/api-spec.html#security.enroll_node.Request">API
 *      specification</a>
 */

public class EnrollNodeRequest extends RequestBase {
	public EnrollNodeRequest() {
	}

	/**
	 * Singleton instance for {@link EnrollNodeRequest}.
	 */
	public static final EnrollNodeRequest _INSTANCE = new EnrollNodeRequest();

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.enroll_node}".
	 */
	public static final Endpoint<EnrollNodeRequest, EnrollNodeResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/security.enroll_node",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				return "/_security/enroll/node";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), false, EnrollNodeResponse._DESERIALIZER);
}
