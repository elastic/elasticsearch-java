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

package co.elastic.clients.elasticsearch.license;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: license.get.Request

/**
 * Get license information. Returns information about your Elastic license,
 * including its type, its status, when it was issued, and when it expires. For
 * more information about the different types of licenses, refer to
 * <a href="https://www.elastic.co/subscriptions">Elastic Stack
 * subscriptions</a>.
 * 
 * @see <a href="../doc-files/api-spec.html#license.get.Request">API
 *      specification</a>
 */

public class GetLicenseRequest extends RequestBase {
	@Nullable
	private final Boolean acceptEnterprise;

	@Nullable
	private final Boolean local;

	// ---------------------------------------------------------------------------------------------

	private GetLicenseRequest(Builder builder) {

		this.acceptEnterprise = builder.acceptEnterprise;
		this.local = builder.local;

	}

	public static GetLicenseRequest of(Function<Builder, ObjectBuilder<GetLicenseRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * If <code>true</code>, this parameter returns enterprise for Enterprise
	 * license types. If <code>false</code>, this parameter returns platinum for
	 * both platinum and enterprise license types. This behavior is maintained for
	 * backwards compatibility. This parameter is deprecated and will always be set
	 * to true in 8.x.
	 * <p>
	 * API name: {@code accept_enterprise}
	 * 
	 * @deprecated 7.6.0
	 */
	@Deprecated
	@Nullable
	public final Boolean acceptEnterprise() {
		return this.acceptEnterprise;
	}

	/**
	 * Specifies whether to retrieve local information. The default value is
	 * <code>false</code>, which means the information is retrieved from the master
	 * node.
	 * <p>
	 * API name: {@code local}
	 */
	@Nullable
	public final Boolean local() {
		return this.local;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetLicenseRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GetLicenseRequest> {
		@Nullable
		private Boolean acceptEnterprise;

		@Nullable
		private Boolean local;

		/**
		 * If <code>true</code>, this parameter returns enterprise for Enterprise
		 * license types. If <code>false</code>, this parameter returns platinum for
		 * both platinum and enterprise license types. This behavior is maintained for
		 * backwards compatibility. This parameter is deprecated and will always be set
		 * to true in 8.x.
		 * <p>
		 * API name: {@code accept_enterprise}
		 * 
		 * @deprecated 7.6.0
		 */
		@Deprecated
		public final Builder acceptEnterprise(@Nullable Boolean value) {
			this.acceptEnterprise = value;
			return this;
		}

		/**
		 * Specifies whether to retrieve local information. The default value is
		 * <code>false</code>, which means the information is retrieved from the master
		 * node.
		 * <p>
		 * API name: {@code local}
		 */
		public final Builder local(@Nullable Boolean value) {
			this.local = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetLicenseRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetLicenseRequest build() {
			_checkSingleUse();

			return new GetLicenseRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code license.get}".
	 */
	public static final Endpoint<GetLicenseRequest, GetLicenseResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/license.get",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				return "/_license";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
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
