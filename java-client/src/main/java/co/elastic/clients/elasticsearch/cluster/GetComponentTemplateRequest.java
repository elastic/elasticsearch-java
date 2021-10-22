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

package co.elastic.clients.elasticsearch.cluster;

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
import java.lang.Boolean;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.get_component_template.Request

public final class GetComponentTemplateRequest extends RequestBase {
	@Nullable
	private final Boolean flatSettings;

	@Nullable
	private final Boolean local;

	@Nullable
	private final String masterTimeout;

	@Nullable
	private final String name;

	// ---------------------------------------------------------------------------------------------

	public GetComponentTemplateRequest(Builder builder) {

		this.flatSettings = builder.flatSettings;
		this.local = builder.local;
		this.masterTimeout = builder.masterTimeout;
		this.name = builder.name;

	}

	public GetComponentTemplateRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code flat_settings}
	 */
	@Nullable
	public Boolean flatSettings() {
		return this.flatSettings;
	}

	/**
	 * Return local information, do not retrieve the state from master node
	 * (default: false)
	 * <p>
	 * API name: {@code local}
	 */
	@Nullable
	public Boolean local() {
		return this.local;
	}

	/**
	 * Explicit operation timeout for connection to master node
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public String masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * The comma separated names of the component templates
	 * <p>
	 * API name: {@code name}
	 */
	@Nullable
	public String name() {
		return this.name;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetComponentTemplateRequest}.
	 */
	public static class Builder implements ObjectBuilder<GetComponentTemplateRequest> {
		@Nullable
		private Boolean flatSettings;

		@Nullable
		private Boolean local;

		@Nullable
		private String masterTimeout;

		@Nullable
		private String name;

		/**
		 * API name: {@code flat_settings}
		 */
		public Builder flatSettings(@Nullable Boolean value) {
			this.flatSettings = value;
			return this;
		}

		/**
		 * Return local information, do not retrieve the state from master node
		 * (default: false)
		 * <p>
		 * API name: {@code local}
		 */
		public Builder local(@Nullable Boolean value) {
			this.local = value;
			return this;
		}

		/**
		 * Explicit operation timeout for connection to master node
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public Builder masterTimeout(@Nullable String value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * The comma separated names of the component templates
		 * <p>
		 * API name: {@code name}
		 */
		public Builder name(@Nullable String value) {
			this.name = value;
			return this;
		}

		/**
		 * Builds a {@link GetComponentTemplateRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetComponentTemplateRequest build() {

			return new GetComponentTemplateRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code cluster.get_component_template}".
	 */
	public static final Endpoint<GetComponentTemplateRequest, GetComponentTemplateResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _name = 1 << 0;

				int propsSet = 0;

				if (request.name() != null)
					propsSet |= _name;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_component_template");
					return buf.toString();
				}
				if (propsSet == (_name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_component_template");
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
				if (request.flatSettings != null) {
					params.put("flat_settings", String.valueOf(request.flatSettings));
				}
				if (request.local != null) {
					params.put("local", String.valueOf(request.local));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, GetComponentTemplateResponse._DESERIALIZER);
}
