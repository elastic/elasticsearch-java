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

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: shutdown.get_node.Request
public final class GetNodeRequest extends RequestBase implements ToJsonp {
	@Nullable
	private final String nodeId;

	private final String stub;

	// ---------------------------------------------------------------------------------------------

	protected GetNodeRequest(Builder builder) {

		this.nodeId = builder.nodeId;
		this.stub = Objects.requireNonNull(builder.stub, "stub");

	}

	/**
	 * Auto generated - missing in the input spec
	 * <p>
	 * API name: {@code node_id}
	 */
	@Nullable
	public String nodeId() {
		return this.nodeId;
	}

	/**
	 * API name: {@code stub}
	 */
	public String stub() {
		return this.stub;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("stub");
		generator.write(this.stub);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetNodeRequest}.
	 */
	public static class Builder implements ObjectBuilder<GetNodeRequest> {
		@Nullable
		private String nodeId;

		private String stub;

		/**
		 * Auto generated - missing in the input spec
		 * <p>
		 * API name: {@code node_id}
		 */
		public Builder nodeId(@Nullable String value) {
			this.nodeId = value;
			return this;
		}

		/**
		 * API name: {@code stub}
		 */
		public Builder stub(String value) {
			this.stub = value;
			return this;
		}

		/**
		 * Builds a {@link GetNodeRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetNodeRequest build() {

			return new GetNodeRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for GetNodeRequest
	 */
	public static final JsonpDeserializer<GetNodeRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, GetNodeRequest::setupGetNodeRequestDeserializer);

	protected static void setupGetNodeRequestDeserializer(DelegatingDeserializer<GetNodeRequest.Builder> op) {

		op.add(Builder::stub, JsonpDeserializer.stringDeserializer(), "stub");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code shutdown.get_node}".
	 */
	public static final Endpoint<GetNodeRequest, GetNodeResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _nodeId = 1 << 0;

				int propsSet = 0;

				if (request.nodeId() != null)
					propsSet |= _nodeId;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_nodes");
					buf.append("/shutdown");
					return buf.toString();
				}
				if (propsSet == (_nodeId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_nodes");
					buf.append("/");
					buf.append(request.nodeId);
					buf.append("/shutdown");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), true, GetNodeResponse.DESERIALIZER);
}
