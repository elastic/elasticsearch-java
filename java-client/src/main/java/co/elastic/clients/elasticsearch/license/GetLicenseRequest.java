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

package co.elastic.clients.elasticsearch.license;

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
import java.lang.Boolean;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: license.get.Request

public final class GetLicenseRequest extends RequestBase {
	@Nullable
	private final Boolean acceptEnterprise;

	@Nullable
	private final Boolean local;

	// ---------------------------------------------------------------------------------------------

	public GetLicenseRequest(Builder builder) {

		this.acceptEnterprise = builder.acceptEnterprise;
		this.local = builder.local;

	}

	public GetLicenseRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Supported for backwards compatibility with 7.x. If this param is used it must
	 * be set to true
	 * <p>
	 * API name: {@code accept_enterprise}
	 */
	@Nullable
	public Boolean acceptEnterprise() {
		return this.acceptEnterprise;
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

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetLicenseRequest}.
	 */
	public static class Builder implements ObjectBuilder<GetLicenseRequest> {
		@Nullable
		private Boolean acceptEnterprise;

		@Nullable
		private Boolean local;

		/**
		 * Supported for backwards compatibility with 7.x. If this param is used it must
		 * be set to true
		 * <p>
		 * API name: {@code accept_enterprise}
		 */
		public Builder acceptEnterprise(@Nullable Boolean value) {
			this.acceptEnterprise = value;
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
		 * Builds a {@link GetLicenseRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetLicenseRequest build() {

			return new GetLicenseRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code license.get}".
	 */
	public static final Endpoint<GetLicenseRequest, GetLicenseResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				return "/_license";

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.local != null) {
					params.put("local", String.valueOf(request.local));
				}
				if (request.acceptEnterprise != null) {
					params.put("accept_enterprise", String.valueOf(request.acceptEnterprise));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, GetLicenseResponse._DESERIALIZER);
}
