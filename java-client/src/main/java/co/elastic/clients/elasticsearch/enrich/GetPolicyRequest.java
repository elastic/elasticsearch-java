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

package co.elastic.clients.elasticsearch.enrich;

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

// typedef: enrich.get_policy.Request

/**
 * Get an enrich policy. Returns information about an enrich policy.
 * 
 * @see <a href="../doc-files/api-spec.html#enrich.get_policy.Request">API
 *      specification</a>
 */

public class GetPolicyRequest extends RequestBase {
	@Nullable
	private final Time masterTimeout;

	private final List<String> name;

	// ---------------------------------------------------------------------------------------------

	private GetPolicyRequest(Builder builder) {

		this.masterTimeout = builder.masterTimeout;
		this.name = ApiTypeHelper.unmodifiable(builder.name);

	}

	public static GetPolicyRequest of(Function<Builder, ObjectBuilder<GetPolicyRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Period to wait for a connection to the master node.
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final Time masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * Comma-separated list of enrich policy names used to limit the request. To
	 * return information for all enrich policies, omit this parameter.
	 * <p>
	 * API name: {@code name}
	 */
	public final List<String> name() {
		return this.name;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetPolicyRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GetPolicyRequest> {
		@Nullable
		private Time masterTimeout;

		@Nullable
		private List<String> name;

		/**
		 * Period to wait for a connection to the master node.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable Time value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Period to wait for a connection to the master node.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.masterTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Comma-separated list of enrich policy names used to limit the request. To
		 * return information for all enrich policies, omit this parameter.
		 * <p>
		 * API name: {@code name}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>name</code>.
		 */
		public final Builder name(List<String> list) {
			this.name = _listAddAll(this.name, list);
			return this;
		}

		/**
		 * Comma-separated list of enrich policy names used to limit the request. To
		 * return information for all enrich policies, omit this parameter.
		 * <p>
		 * API name: {@code name}
		 * <p>
		 * Adds one or more values to <code>name</code>.
		 */
		public final Builder name(String value, String... values) {
			this.name = _listAdd(this.name, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetPolicyRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetPolicyRequest build() {
			_checkSingleUse();

			return new GetPolicyRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code enrich.get_policy}".
	 */
	public static final Endpoint<GetPolicyRequest, GetPolicyResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/enrich.get_policy",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _name = 1 << 0;

				int propsSet = 0;

				if (ApiTypeHelper.isDefined(request.name()))
					propsSet |= _name;

				if (propsSet == (_name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_enrich");
					buf.append("/policy");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.name.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					return buf.toString();
				}
				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_enrich");
					buf.append("/policy");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _name = 1 << 0;

				int propsSet = 0;

				if (ApiTypeHelper.isDefined(request.name()))
					propsSet |= _name;

				if (propsSet == (_name)) {
					params.put("name", request.name.stream().map(v -> v).collect(Collectors.joining(",")));
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
				return params;

			}, SimpleEndpoint.emptyMap(), false, GetPolicyResponse._DESERIALIZER);
}
