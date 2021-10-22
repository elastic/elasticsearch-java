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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.SimpleEndpoint;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.delete_template.Request

public final class DeleteTemplateRequest extends RequestBase {
	@Nullable
	private final String masterTimeout;

	private final String name;

	@Nullable
	private final String timeout;

	// ---------------------------------------------------------------------------------------------

	public DeleteTemplateRequest(Builder builder) {

		this.masterTimeout = builder.masterTimeout;
		this.name = Objects.requireNonNull(builder.name, "name");
		this.timeout = builder.timeout;

	}

	public DeleteTemplateRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Specify timeout for connection to master
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public String masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * Required - The name of the template
	 * <p>
	 * API name: {@code name}
	 */
	public String name() {
		return this.name;
	}

	/**
	 * Explicit operation timeout
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public String timeout() {
		return this.timeout;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteTemplateRequest}.
	 */
	public static class Builder implements ObjectBuilder<DeleteTemplateRequest> {
		@Nullable
		private String masterTimeout;

		private String name;

		@Nullable
		private String timeout;

		/**
		 * Specify timeout for connection to master
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public Builder masterTimeout(@Nullable String value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Required - The name of the template
		 * <p>
		 * API name: {@code name}
		 */
		public Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Explicit operation timeout
		 * <p>
		 * API name: {@code timeout}
		 */
		public Builder timeout(@Nullable String value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Builds a {@link DeleteTemplateRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteTemplateRequest build() {

			return new DeleteTemplateRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.delete_template}".
	 */
	public static final Endpoint<DeleteTemplateRequest, DeleteTemplateResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "DELETE";

			},

			// Request path
			request -> {
				final int _name = 1 << 0;

				int propsSet = 0;

				propsSet |= _name;

				if (propsSet == (_name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_template");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.name, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout);
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, DeleteTemplateResponse._DESERIALIZER);
}
