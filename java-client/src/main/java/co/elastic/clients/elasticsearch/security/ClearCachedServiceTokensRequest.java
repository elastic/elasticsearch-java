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
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: security.clear_cached_service_tokens.Request

public final class ClearCachedServiceTokensRequest extends RequestBase {
	private final List<String> name;

	private final String namespace;

	private final String service;

	// ---------------------------------------------------------------------------------------------

	public ClearCachedServiceTokensRequest(Builder builder) {

		this.name = ModelTypeHelper.unmodifiableNonNull(builder.name, "name");
		this.namespace = Objects.requireNonNull(builder.namespace, "namespace");
		this.service = Objects.requireNonNull(builder.service, "service");

	}

	public ClearCachedServiceTokensRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - A comma-separated list of service token names
	 * <p>
	 * API name: {@code name}
	 */
	public List<String> name() {
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
	 * Required - An identifier for the service name
	 * <p>
	 * API name: {@code service}
	 */
	public String service() {
		return this.service;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClearCachedServiceTokensRequest}.
	 */
	public static class Builder implements ObjectBuilder<ClearCachedServiceTokensRequest> {
		private List<String> name;

		private String namespace;

		private String service;

		/**
		 * Required - A comma-separated list of service token names
		 * <p>
		 * API name: {@code name}
		 */
		public Builder name(List<String> value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - A comma-separated list of service token names
		 * <p>
		 * API name: {@code name}
		 */
		public Builder name(String... value) {
			this.name = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #name(List)}, creating the list if needed.
		 */
		public Builder addName(String value) {
			if (this.name == null) {
				this.name = new ArrayList<>();
			}
			this.name.add(value);
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
		 * Required - An identifier for the service name
		 * <p>
		 * API name: {@code service}
		 */
		public Builder service(String value) {
			this.service = value;
			return this;
		}

		/**
		 * Builds a {@link ClearCachedServiceTokensRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClearCachedServiceTokensRequest build() {

			return new ClearCachedServiceTokensRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.clear_cached_service_tokens}".
	 */
	public static final Endpoint<ClearCachedServiceTokensRequest, ClearCachedServiceTokensResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "POST";

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
					SimpleEndpoint.pathEncode(request.name.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					buf.append("/_clear_cache");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), false, ClearCachedServiceTokensResponse._DESERIALIZER);
}
