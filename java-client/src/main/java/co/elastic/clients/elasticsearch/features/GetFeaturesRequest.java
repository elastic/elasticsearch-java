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

package co.elastic.clients.elasticsearch.features;

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

// typedef: features.get_features.Request

/**
 * Gets a list of features which can be included in snapshots using the
 * feature_states field when creating a snapshot
 * 
 * @see <a href="../doc-files/api-spec.html#features.get_features.Request">API
 *      specification</a>
 */

public class GetFeaturesRequest extends RequestBase {
	public GetFeaturesRequest() {
	}

	/**
	 * Singleton instance for {@link GetFeaturesRequest}.
	 */
	public static final GetFeaturesRequest _INSTANCE = new GetFeaturesRequest();

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code features.get_features}".
	 */
	public static final Endpoint<GetFeaturesRequest, GetFeaturesResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/features.get_features",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				return "/_features";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), false, GetFeaturesResponse._DESERIALIZER);
}
