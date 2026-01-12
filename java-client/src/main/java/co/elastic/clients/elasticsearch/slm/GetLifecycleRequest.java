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
import co.elastic.clients.elasticsearch._types.Time;
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
 * Get policy information.
 * <p>
 * Get snapshot lifecycle policy definitions and information about the latest
 * snapshot attempts.
 * 
 * @see <a href="../doc-files/api-spec.html#slm.get_lifecycle.Request">API
 *      specification</a>
 */

public class GetLifecycleRequest extends RequestBase {
	@Nullable
	private final Time masterTimeout;

	private final List<String> policyId;

	@Nullable
	private final Time timeout;

	// ---------------------------------------------------------------------------------------------

	private GetLifecycleRequest(Builder builder) {

		this.masterTimeout = builder.masterTimeout;
		this.policyId = ApiTypeHelper.unmodifiable(builder.policyId);
		this.timeout = builder.timeout;

	}

	public static GetLifecycleRequest of(Function<Builder, ObjectBuilder<GetLifecycleRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The period to wait for a connection to the master node. If no response is
	 * received before the timeout expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final Time masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * A comma-separated list of snapshot lifecycle policy identifiers.
	 * <p>
	 * API name: {@code policy_id}
	 */
	public final List<String> policyId() {
		return this.policyId;
	}

	/**
	 * The period to wait for a response. If no response is received before the
	 * timeout expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetLifecycleRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GetLifecycleRequest> {
		@Nullable
		private Time masterTimeout;

		@Nullable
		private List<String> policyId;

		@Nullable
		private Time timeout;

		/**
		 * The period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable Time value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * The period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.masterTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * A comma-separated list of snapshot lifecycle policy identifiers.
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
		 * A comma-separated list of snapshot lifecycle policy identifiers.
		 * <p>
		 * API name: {@code policy_id}
		 * <p>
		 * Adds one or more values to <code>policyId</code>.
		 */
		public final Builder policyId(String value, String... values) {
			this.policyId = _listAdd(this.policyId, value, values);
			return this;
		}

		/**
		 * The period to wait for a response. If no response is received before the
		 * timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * The period to wait for a response. If no response is received before the
		 * timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeout(fn.apply(new Time.Builder()).build());
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
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout._toJsonString());
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, GetLifecycleResponse._DESERIALIZER);
}
