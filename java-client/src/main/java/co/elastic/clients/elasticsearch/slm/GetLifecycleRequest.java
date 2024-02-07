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

package co.elastic.clients.elasticsearch.slm;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
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

// typedef: slm.get_lifecycle.Request

/**
 * Retrieves one or more snapshot lifecycle policy definitions and information
 * about the latest snapshot attempts.
 * 
 * @see <a href="../doc-files/api-spec.html#slm.get_lifecycle.Request">API
 *      specification</a>
 */

public class GetLifecycleRequest extends RequestBase {
	private final List<String> policyId;

	// ---------------------------------------------------------------------------------------------

	private GetLifecycleRequest(Builder builder) {

		this.policyId = ApiTypeHelper.unmodifiable(builder.policyId);

	}

	public static GetLifecycleRequest of(Function<Builder, ObjectBuilder<GetLifecycleRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Comma-separated list of snapshot lifecycle policies to retrieve
	 * <p>
	 * API name: {@code policy_id}
	 */
	public final List<String> policyId() {
		return this.policyId;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetLifecycleRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GetLifecycleRequest> {
		@Nullable
		private List<String> policyId;

		/**
		 * Comma-separated list of snapshot lifecycle policies to retrieve
		 * <p>
		 * API name: {@code policy_id}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>policyId</code>.
		 */
		public final Builder policyId(List<String> list) {
			this.policyId = _listAddAll(this.policyId, list);
			return this;
		}

		/**
		 * Comma-separated list of snapshot lifecycle policies to retrieve
		 * <p>
		 * API name: {@code policy_id}
		 * <p>
		 * Adds one or more values to <code>policyId</code>.
		 */
		public final Builder policyId(String value, String... values) {
			this.policyId = _listAdd(this.policyId, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetLifecycleRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetLifecycleRequest build() {
			_checkSingleUse();

			return new GetLifecycleRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code slm.get_lifecycle}".
	 */
	public static final Endpoint<GetLifecycleRequest, GetLifecycleResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/slm.get_lifecycle",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _policyId = 1 << 0;

				int propsSet = 0;

				if (ApiTypeHelper.isDefined(request.policyId()))
					propsSet |= _policyId;

				if (propsSet == (_policyId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_slm");
					buf.append("/policy");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.policyId.stream().map(v -> v).collect(Collectors.joining(",")),
							buf);
					return buf.toString();
				}
				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_slm");
					buf.append("/policy");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _policyId = 1 << 0;

				int propsSet = 0;

				if (ApiTypeHelper.isDefined(request.policyId()))
					propsSet |= _policyId;

				if (propsSet == (_policyId)) {
					params.put("policyId", request.policyId.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (propsSet == 0) {
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), false, GetLifecycleResponse._DESERIALIZER);
}
