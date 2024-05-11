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

package co.elastic.clients.elasticsearch.security;

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
import java.lang.String;
import java.util.Collections;
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

// typedef: security.get_role_mapping.Request

/**
 * Retrieves role mappings.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#security.get_role_mapping.Request">API
 *      specification</a>
 */

public class GetRoleMappingRequest extends RequestBase {
	@Nullable
	private final String name;

	// ---------------------------------------------------------------------------------------------

	private GetRoleMappingRequest(Builder builder) {

		this.name = builder.name;

	}

	public static GetRoleMappingRequest of(Function<Builder, ObjectBuilder<GetRoleMappingRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * A comma-separated list of role-mapping names
	 * <p>
	 * API name: {@code name}
	 */
	@Nullable
	public final String name() {
		return this.name;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetRoleMappingRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GetRoleMappingRequest> {
		@Nullable
		private String name;

		/**
		 * A comma-separated list of role-mapping names
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(@Nullable String value) {
			this.name = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetRoleMappingRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetRoleMappingRequest build() {
			_checkSingleUse();

			return new GetRoleMappingRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.get_role_mapping}".
	 */
	public static final Endpoint<GetRoleMappingRequest, GetRoleMappingResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/security.get_role_mapping",

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

				if (propsSet == (_name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/role_mapping");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.name, buf);
					return buf.toString();
				}
				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/role_mapping");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), false, GetRoleMappingResponse._DESERIALIZER);
}
