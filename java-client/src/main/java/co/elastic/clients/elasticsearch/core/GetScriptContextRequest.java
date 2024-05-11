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

package co.elastic.clients.elasticsearch.core;

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

// typedef: _global.get_script_context.Request

/**
 * Returns all script contexts.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#_global.get_script_context.Request">API
 *      specification</a>
 */

public class GetScriptContextRequest extends RequestBase {
	public GetScriptContextRequest() {
	}

	/**
	 * Singleton instance for {@link GetScriptContextRequest}.
	 */
	public static final GetScriptContextRequest _INSTANCE = new GetScriptContextRequest();

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code get_script_context}".
	 */
	public static final Endpoint<GetScriptContextRequest, GetScriptContextResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/get_script_context",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				return "/_script_context";

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), false, GetScriptContextResponse._DESERIALIZER);
}
