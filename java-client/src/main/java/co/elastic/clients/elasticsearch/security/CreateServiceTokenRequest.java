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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.SimpleEndpoint;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.create_service_token.Request

public class CreateServiceTokenRequest extends RequestBase {
	private final String name;

	private final String namespace;

	private final String service;

	// ---------------------------------------------------------------------------------------------

	private CreateServiceTokenRequest(Builder builder) {

		this.name = ModelTypeHelper.requireNonNull(builder.name, this, "name");
		this.namespace = ModelTypeHelper.requireNonNull(builder.namespace, this, "namespace");
		this.service = ModelTypeHelper.requireNonNull(builder.service, this, "service");

	}

	public static CreateServiceTokenRequest of(Function<Builder, ObjectBuilder<CreateServiceTokenRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - An identifier for the token name
	 * <p>
	 * API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Required - An identifier for the namespace
	 * <p>
	 * API name: {@code namespace}
	 */
	public final String namespace() {
		return this.namespace;
	}

	/**
	 * Required - An identifier for the service name
	 * <p>
	 * API name: {@code service}
	 */
	public final String service() {
		return this.service;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CreateServiceTokenRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<CreateServiceTokenRequest> {
		private String name;

		private String namespace;

		private String service;

		/**
		 * Required - An identifier for the token name
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - An identifier for the namespace
		 * <p>
		 * API name: {@code namespace}
		 */
		public final Builder namespace(String value) {
			this.namespace = value;
			return this;
		}

		/**
		 * Required - An identifier for the service name
		 * <p>
		 * API name: {@code service}
		 */
		public final Builder service(String value) {
			this.service = value;
			return this;
		}

		/**
		 * Builds a {@link CreateServiceTokenRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CreateServiceTokenRequest build() {
			_checkSingleUse();

			return new CreateServiceTokenRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.create_service_token}".
	 */
	public static final Endpoint<CreateServiceTokenRequest, CreateServiceTokenResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				final int _service = 1 << 0;
				final int _namespace = 1 << 1;
				final int _name = 1 << 2;

				int propsSet = 0;

				propsSet |= _service;
				propsSet |= _namespace;
				propsSet |= _name;

				if (propsSet == (_namespace | _service | _name))
					return "PUT";
				if (propsSet == (_namespace | _service))
					return "POST";
				throw SimpleEndpoint.noPathTemplateFound("method");

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
				if (propsSet == (_namespace | _service)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/service");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.namespace, buf);
					buf.append("/");
					SimpleEndpoint.pathEncode(request.service, buf);
					buf.append("/credential");
					buf.append("/token");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), false, CreateServiceTokenResponse._DESERIALIZER);
}
