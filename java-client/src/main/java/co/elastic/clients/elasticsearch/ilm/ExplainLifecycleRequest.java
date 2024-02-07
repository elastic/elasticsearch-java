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

package co.elastic.clients.elasticsearch.ilm;

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
import java.lang.Boolean;
import java.lang.String;
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

// typedef: ilm.explain_lifecycle.Request

/**
 * Retrieves information about the index’s current lifecycle state, such as the
 * currently executing phase, action, and step. Shows when the index entered
 * each one, the definition of the running phase, and information about any
 * failures.
 * 
 * @see <a href="../doc-files/api-spec.html#ilm.explain_lifecycle.Request">API
 *      specification</a>
 */

public class ExplainLifecycleRequest extends RequestBase {
	private final String index;

	@Nullable
	private final Time masterTimeout;

	@Nullable
	private final Boolean onlyErrors;

	@Nullable
	private final Boolean onlyManaged;

	@Nullable
	private final Time timeout;

	// ---------------------------------------------------------------------------------------------

	private ExplainLifecycleRequest(Builder builder) {

		this.index = ApiTypeHelper.requireNonNull(builder.index, this, "index");
		this.masterTimeout = builder.masterTimeout;
		this.onlyErrors = builder.onlyErrors;
		this.onlyManaged = builder.onlyManaged;
		this.timeout = builder.timeout;

	}

	public static ExplainLifecycleRequest of(Function<Builder, ObjectBuilder<ExplainLifecycleRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Comma-separated list of data streams, indices, and aliases to
	 * target. Supports wildcards (<code>*</code>). To target all data streams and
	 * indices, use <code>*</code> or <code>_all</code>.
	 * <p>
	 * API name: {@code index}
	 */
	public final String index() {
		return this.index;
	}

	/**
	 * Period to wait for a connection to the master node. If no response is
	 * received before the timeout expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final Time masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * Filters the returned indices to only indices that are managed by ILM and are
	 * in an error state, either due to an encountering an error while executing the
	 * policy, or attempting to use a policy that does not exist.
	 * <p>
	 * API name: {@code only_errors}
	 */
	@Nullable
	public final Boolean onlyErrors() {
		return this.onlyErrors;
	}

	/**
	 * Filters the returned indices to only indices that are managed by ILM.
	 * <p>
	 * API name: {@code only_managed}
	 */
	@Nullable
	public final Boolean onlyManaged() {
		return this.onlyManaged;
	}

	/**
	 * Period to wait for a response. If no response is received before the timeout
	 * expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExplainLifecycleRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ExplainLifecycleRequest> {
		private String index;

		@Nullable
		private Time masterTimeout;

		@Nullable
		private Boolean onlyErrors;

		@Nullable
		private Boolean onlyManaged;

		@Nullable
		private Time timeout;

		/**
		 * Required - Comma-separated list of data streams, indices, and aliases to
		 * target. Supports wildcards (<code>*</code>). To target all data streams and
		 * indices, use <code>*</code> or <code>_all</code>.
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * Period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable Time value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.masterTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Filters the returned indices to only indices that are managed by ILM and are
		 * in an error state, either due to an encountering an error while executing the
		 * policy, or attempting to use a policy that does not exist.
		 * <p>
		 * API name: {@code only_errors}
		 */
		public final Builder onlyErrors(@Nullable Boolean value) {
			this.onlyErrors = value;
			return this;
		}

		/**
		 * Filters the returned indices to only indices that are managed by ILM.
		 * <p>
		 * API name: {@code only_managed}
		 */
		public final Builder onlyManaged(@Nullable Boolean value) {
			this.onlyManaged = value;
			return this;
		}

		/**
		 * Period to wait for a response. If no response is received before the timeout
		 * expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Period to wait for a response. If no response is received before the timeout
		 * expires, the request fails and returns an error.
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
		 * Builds a {@link ExplainLifecycleRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExplainLifecycleRequest build() {
			_checkSingleUse();

			return new ExplainLifecycleRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ilm.explain_lifecycle}".
	 */
	public static final Endpoint<ExplainLifecycleRequest, ExplainLifecycleResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ilm.explain_lifecycle",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;

				int propsSet = 0;

				propsSet |= _index;

				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index, buf);
					buf.append("/_ilm");
					buf.append("/explain");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _index = 1 << 0;

				int propsSet = 0;

				propsSet |= _index;

				if (propsSet == (_index)) {
					params.put("index", request.index);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout._toJsonString());
				}
				if (request.onlyErrors != null) {
					params.put("only_errors", String.valueOf(request.onlyErrors));
				}
				if (request.onlyManaged != null) {
					params.put("only_managed", String.valueOf(request.onlyManaged));
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, ExplainLifecycleResponse._DESERIALIZER);
}
