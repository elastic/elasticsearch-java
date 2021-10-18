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

import co.elastic.clients.base.Endpoint;
import co.elastic.clients.base.SimpleEndpoint;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.get_service_credentials.Request

public final class GetServiceCredentialsRequest extends RequestBase {
	private final String namespace;

	private final String service;

	// ---------------------------------------------------------------------------------------------

	public GetServiceCredentialsRequest(Builder builder) {

		this.namespace = Objects.requireNonNull(builder.namespace, "namespace");
		this.service = Objects.requireNonNull(builder.service, "service");

	}

	public GetServiceCredentialsRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - Name of the namespace.
	 * <p>
	 * API name: {@code namespace}
	 */
	public String namespace() {
		return this.namespace;
	}

	/**
	 * Required - Name of the service name.
	 * <p>
	 * API name: {@code service}
	 */
	public String service() {
		return this.service;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetServiceCredentialsRequest}.
	 */
	public static class Builder implements ObjectBuilder<GetServiceCredentialsRequest> {
		private String namespace;

		private String service;

		/**
		 * Required - Name of the namespace.
		 * <p>
		 * API name: {@code namespace}
		 */
		public Builder namespace(String value) {
			this.namespace = value;
			return this;
		}

		/**
		 * Required - Name of the service name.
		 * <p>
		 * API name: {@code service}
		 */
		public Builder service(String value) {
			this.service = value;
			return this;
		}

		/**
		 * Builds a {@link GetServiceCredentialsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetServiceCredentialsRequest build() {

			return new GetServiceCredentialsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.get_service_credentials}".
	 */
	public static final Endpoint<GetServiceCredentialsRequest, GetServiceCredentialsResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _namespace = 1 << 0;
				final int _service = 1 << 1;

				int propsSet = 0;

				propsSet |= _namespace;
				propsSet |= _service;

				if (propsSet == (_namespace | _service)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/service");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.namespace, buf);
					buf.append("/");
					SimpleEndpoint.pathEncode(request.service, buf);
					buf.append("/credential");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), false, GetServiceCredentialsResponse._DESERIALIZER);
}
