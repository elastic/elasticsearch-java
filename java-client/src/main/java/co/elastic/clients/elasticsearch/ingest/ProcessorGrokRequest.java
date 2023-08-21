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

package co.elastic.clients.elasticsearch.ingest;

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

// typedef: ingest.processor_grok.Request

/**
 * Returns a list of the built-in patterns.
 * 
 * @see <a href="../doc-files/api-spec.html#ingest.processor_grok.Request">API
 *      specification</a>
 */

public class ProcessorGrokRequest extends RequestBase {
	public ProcessorGrokRequest() {
	}

	/**
	 * Singleton instance for {@link ProcessorGrokRequest}.
	 */
	public static final ProcessorGrokRequest _INSTANCE = new ProcessorGrokRequest();

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ingest.processor_grok}".
	 */
	public static final Endpoint<ProcessorGrokRequest, ProcessorGrokResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ingest.processor_grok",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				return "/_ingest/processor/grok";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), false, ProcessorGrokResponse._DESERIALIZER);
}
