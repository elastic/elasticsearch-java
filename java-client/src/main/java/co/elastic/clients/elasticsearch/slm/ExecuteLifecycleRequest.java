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

// typedef: slm.execute_lifecycle.Request

/**
 * Immediately creates a snapshot according to the lifecycle policy, without
 * waiting for the scheduled time.
 * 
 * @see <a href="../doc-files/api-spec.html#slm.execute_lifecycle.Request">API
 *      specification</a>
 */

public class ExecuteLifecycleRequest extends RequestBase {
	private final String policyId;

	// ---------------------------------------------------------------------------------------------

	private ExecuteLifecycleRequest(Builder builder) {

		this.policyId = ApiTypeHelper.requireNonNull(builder.policyId, this, "policyId");

	}

	public static ExecuteLifecycleRequest of(Function<Builder, ObjectBuilder<ExecuteLifecycleRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The id of the snapshot lifecycle policy to be executed
	 * <p>
	 * API name: {@code policy_id}
	 */
	public final String policyId() {
		return this.policyId;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExecuteLifecycleRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ExecuteLifecycleRequest> {
		private String policyId;

		/**
		 * Required - The id of the snapshot lifecycle policy to be executed
		 * <p>
		 * API name: {@code policy_id}
		 */
		public final Builder policyId(String value) {
			this.policyId = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ExecuteLifecycleRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExecuteLifecycleRequest build() {
			_checkSingleUse();

			return new ExecuteLifecycleRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code slm.execute_lifecycle}".
	 */
	public static final Endpoint<ExecuteLifecycleRequest, ExecuteLifecycleResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/slm.execute_lifecycle",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _policyId = 1 << 0;

				int propsSet = 0;

				propsSet |= _policyId;

				if (propsSet == (_policyId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_slm");
					buf.append("/policy");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.policyId, buf);
					buf.append("/_execute");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _policyId = 1 << 0;

				int propsSet = 0;

				propsSet |= _policyId;

				if (propsSet == (_policyId)) {
					params.put("policyId", request.policyId);
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), false, ExecuteLifecycleResponse._DESERIALIZER);
}
