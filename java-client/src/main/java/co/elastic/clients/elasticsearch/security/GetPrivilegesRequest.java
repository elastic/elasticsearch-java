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
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.get_privileges.Request

public class GetPrivilegesRequest extends RequestBase {
	@Nullable
	private final String application;

	@Nullable
	private final String name;

	// ---------------------------------------------------------------------------------------------

	private GetPrivilegesRequest(Builder builder) {

		this.application = builder.application;
		this.name = builder.name;

	}

	public static GetPrivilegesRequest of(Function<Builder, ObjectBuilder<GetPrivilegesRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Application name
	 * <p>
	 * API name: {@code application}
	 */
	@Nullable
	public final String application() {
		return this.application;
	}

	/**
	 * Privilege name
	 * <p>
	 * API name: {@code name}
	 */
	@Nullable
	public final String name() {
		return this.name;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetPrivilegesRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GetPrivilegesRequest> {
		@Nullable
		private String application;

		@Nullable
		private String name;

		/**
		 * Application name
		 * <p>
		 * API name: {@code application}
		 */
		public final Builder application(@Nullable String value) {
			this.application = value;
			return this;
		}

		/**
		 * Privilege name
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(@Nullable String value) {
			this.name = value;
			return this;
		}

		/**
		 * Builds a {@link GetPrivilegesRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetPrivilegesRequest build() {
			_checkSingleUse();

			return new GetPrivilegesRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.get_privileges}".
	 */
	public static final Endpoint<GetPrivilegesRequest, GetPrivilegesResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _application = 1 << 0;
				final int _name = 1 << 1;

				int propsSet = 0;

				if (request.application() != null)
					propsSet |= _application;
				if (request.name() != null)
					propsSet |= _name;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/privilege");
					return buf.toString();
				}
				if (propsSet == (_application)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/privilege");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.application, buf);
					return buf.toString();
				}
				if (propsSet == (_application | _name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/privilege");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.application, buf);
					buf.append("/");
					SimpleEndpoint.pathEncode(request.name, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), false, GetPrivilegesResponse._DESERIALIZER);
}
