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

package co.elastic.clients.elasticsearch.ilm;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.base.SimpleEndpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ilm.put_lifecycle.Request
@JsonpDeserializable
public final class PutLifecycleRequest extends RequestBase implements JsonpSerializable {
	private final String policy;

	// ---------------------------------------------------------------------------------------------

	public PutLifecycleRequest(Builder builder) {

		this.policy = Objects.requireNonNull(builder.policy, "policy");

	}

	public PutLifecycleRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * The name of the index lifecycle policy
	 * <p>
	 * API name: {@code policy}
	 */
	public String policy() {
		return this.policy;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutLifecycleRequest}.
	 */
	public static class Builder implements ObjectBuilder<PutLifecycleRequest> {
		private String policy;

		/**
		 * The name of the index lifecycle policy
		 * <p>
		 * API name: {@code policy}
		 */
		public Builder policy(String value) {
			this.policy = value;
			return this;
		}

		/**
		 * Builds a {@link PutLifecycleRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutLifecycleRequest build() {

			return new PutLifecycleRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutLifecycleRequest}
	 */
	public static final JsonpDeserializer<PutLifecycleRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutLifecycleRequest::setupPutLifecycleRequestDeserializer, Builder::build);

	protected static void setupPutLifecycleRequestDeserializer(DelegatingDeserializer<PutLifecycleRequest.Builder> op) {

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ilm.put_lifecycle}".
	 */
	public static final Endpoint<PutLifecycleRequest, PutLifecycleResponse, ElasticsearchError> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _policy = 1 << 0;

				int propsSet = 0;

				propsSet |= _policy;

				if (propsSet == (_policy)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ilm");
					buf.append("/policy");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.policy, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, PutLifecycleResponse._DESERIALIZER);
}
