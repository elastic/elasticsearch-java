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
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.SimpleEndpoint;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.delete_service_token.Request

public final class DeleteServiceTokenRequest extends RequestBase {
	private final String name;

	private final String namespace;

	@Nullable
	private final JsonValue /* _types.Refresh */ refresh;

	private final String service;

	// ---------------------------------------------------------------------------------------------

	public DeleteServiceTokenRequest(Builder builder) {

		this.name = Objects.requireNonNull(builder.name, "name");
		this.namespace = Objects.requireNonNull(builder.namespace, "namespace");
		this.refresh = builder.refresh;
		this.service = Objects.requireNonNull(builder.service, "service");

	}

	public DeleteServiceTokenRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - An identifier for the token name
	 * <p>
	 * API name: {@code name}
	 */
	public String name() {
		return this.name;
	}

	/**
	 * Required - An identifier for the namespace
	 * <p>
	 * API name: {@code namespace}
	 */
	public String namespace() {
		return this.namespace;
	}

	/**
	 * If <code>true</code> then refresh the affected shards to make this operation
	 * visible to search, if <code>wait_for</code> (the default) then wait for a
	 * refresh to make this operation visible to search, if <code>false</code> then
	 * do nothing with refreshes.
	 * <p>
	 * API name: {@code refresh}
	 */
	@Nullable
	public JsonValue /* _types.Refresh */ refresh() {
		return this.refresh;
	}

	/**
	 * Required - An identifier for the service name
	 * <p>
	 * API name: {@code service}
	 */
	public String service() {
		return this.service;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteServiceTokenRequest}.
	 */
	public static class Builder implements ObjectBuilder<DeleteServiceTokenRequest> {
		private String name;

		private String namespace;

		@Nullable
		private JsonValue /* _types.Refresh */ refresh;

		private String service;

		/**
		 * Required - An identifier for the token name
		 * <p>
		 * API name: {@code name}
		 */
		public Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - An identifier for the namespace
		 * <p>
		 * API name: {@code namespace}
		 */
		public Builder namespace(String value) {
			this.namespace = value;
			return this;
		}

		/**
		 * If <code>true</code> then refresh the affected shards to make this operation
		 * visible to search, if <code>wait_for</code> (the default) then wait for a
		 * refresh to make this operation visible to search, if <code>false</code> then
		 * do nothing with refreshes.
		 * <p>
		 * API name: {@code refresh}
		 */
		public Builder refresh(@Nullable JsonValue /* _types.Refresh */ value) {
			this.refresh = value;
			return this;
		}

		/**
		 * Required - An identifier for the service name
		 * <p>
		 * API name: {@code service}
		 */
		public Builder service(String value) {
			this.service = value;
			return this;
		}

		/**
		 * Builds a {@link DeleteServiceTokenRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteServiceTokenRequest build() {

			return new DeleteServiceTokenRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.delete_service_token}".
	 */
	public static final Endpoint<DeleteServiceTokenRequest, DeleteServiceTokenResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "DELETE";

			},

			// Request path
			request -> {
				final int _service = 1 << 0;
				final int _namespace = 1 << 1;
				final int _name = 1 << 2;

				int propsSet = 0;

				propsSet |= _service;
				propsSet |= _namespace;
				propsSet |= _name;

				if (propsSet == (_namespace | _service | _name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/service");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.namespace, buf);
					buf.append("/");
					SimpleEndpoint.pathEncode(request.service, buf);
					buf.append("/credential");
					buf.append("/token");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.name, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.refresh != null) {
					params.put("refresh", JsonpUtils.toString(request.refresh));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, DeleteServiceTokenResponse._DESERIALIZER);
}
