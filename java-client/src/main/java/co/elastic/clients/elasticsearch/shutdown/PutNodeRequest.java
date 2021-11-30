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

package co.elastic.clients.elasticsearch.shutdown;

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
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: shutdown.put_node.Request

/**
 * Adds a node to be shut down. Designed for indirect use by ECE/ESS and ECK.
 * Direct use is not supported.
 * 
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/shutdown/put_node/ShutdownPutNodeRequest.ts#L23-L32">API
 *      specification</a>
 */

public class PutNodeRequest extends RequestBase {
	private final String nodeId;

	// ---------------------------------------------------------------------------------------------

	private PutNodeRequest(Builder builder) {

		this.nodeId = ApiTypeHelper.requireNonNull(builder.nodeId, this, "nodeId");

	}

	public static PutNodeRequest of(Function<Builder, ObjectBuilder<PutNodeRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The node id of node to be shut down
	 * <p>
	 * API name: {@code node_id}
	 */
	public final String nodeId() {
		return this.nodeId;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutNodeRequest}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<PutNodeRequest> {
		private String nodeId;

		/**
		 * Required - The node id of node to be shut down
		 * <p>
		 * API name: {@code node_id}
		 */
		public final Builder nodeId(String value) {
			this.nodeId = value;
			return this;
		}

		/**
		 * Builds a {@link PutNodeRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutNodeRequest build() {
			_checkSingleUse();

			return new PutNodeRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code shutdown.put_node}".
	 */
	public static final Endpoint<PutNodeRequest, PutNodeResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/shutdown.put_node",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _nodeId = 1 << 0;

				int propsSet = 0;

				propsSet |= _nodeId;

				if (propsSet == (_nodeId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_nodes");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.nodeId, buf);
					buf.append("/shutdown");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), false, PutNodeResponse._DESERIALIZER);
}
