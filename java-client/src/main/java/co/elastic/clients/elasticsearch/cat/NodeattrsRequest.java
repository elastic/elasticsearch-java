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

package co.elastic.clients.elasticsearch.cat;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Collections;

// typedef: cat.nodeattrs.Request
public final class NodeattrsRequest extends CatRequestBase {
	protected NodeattrsRequest() {
	}

	/**
	 * Singleton instance for {@link NodeattrsRequest}.
	 */
	public static final NodeattrsRequest INSTANCE = new NodeattrsRequest();

	public static final JsonpDeserializer<NodeattrsRequest> DESERIALIZER = JsonpDeserializer
			.fixedValue(NodeattrsRequest.INSTANCE);

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code cat.nodeattrs}".
	 */
	public static final Endpoint<NodeattrsRequest, NodeattrsResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				return "/_cat/nodeattrs";

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), false, NodeattrsResponse.DESERIALIZER);
}
