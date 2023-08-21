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

package co.elastic.clients.elasticsearch.ml;

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

// typedef: ml.info.Request

/**
 * Returns defaults and limits used by machine learning. This endpoint is
 * designed to be used by a user interface that needs to fully understand
 * machine learning configurations where some options are not specified, meaning
 * that the defaults should be used. This endpoint may be used to find out what
 * those defaults are. It also provides information about the maximum size of
 * machine learning jobs that could run in the current cluster configuration.
 * 
 * @see <a href="../doc-files/api-spec.html#ml.info.Request">API
 *      specification</a>
 */

public class MlInfoRequest extends RequestBase {
	public MlInfoRequest() {
	}

	/**
	 * Singleton instance for {@link MlInfoRequest}.
	 */
	public static final MlInfoRequest _INSTANCE = new MlInfoRequest();

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.info}".
	 */
	public static final Endpoint<MlInfoRequest, MlInfoResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ml.info",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				return "/_ml/info";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), false, MlInfoResponse._DESERIALIZER);
}
