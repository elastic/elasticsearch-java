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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.BooleanEndpoint;
import co.elastic.clients.transport.endpoints.BooleanResponse;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
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

// typedef: indices.exists_template.Request

/**
 * Check existence of index templates. Get information about whether index
 * templates exist. Index templates define settings, mappings, and aliases that
 * can be applied automatically to new indices.
 * <p>
 * IMPORTANT: This documentation is about legacy index templates, which are
 * deprecated and will be replaced by the composable templates introduced in
 * Elasticsearch 7.8.
 * 
 * @see <a href="../doc-files/api-spec.html#indices.exists_template.Request">API
 *      specification</a>
 */

public class ExistsTemplateRequest extends RequestBase {
	@Nullable
	private final Boolean flatSettings;

	@Nullable
	private final Boolean local;

	@Nullable
	private final Time masterTimeout;

	private final List<String> name;

	// ---------------------------------------------------------------------------------------------

	private ExistsTemplateRequest(Builder builder) {

		this.flatSettings = builder.flatSettings;
		this.local = builder.local;
		this.masterTimeout = builder.masterTimeout;
		this.name = ApiTypeHelper.unmodifiableRequired(builder.name, this, "name");

	}

	public static ExistsTemplateRequest of(Function<Builder, ObjectBuilder<ExistsTemplateRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Indicates whether to use a flat format for the response.
	 * <p>
	 * API name: {@code flat_settings}
	 */
	@Nullable
	public final Boolean flatSettings() {
		return this.flatSettings;
	}

	/**
	 * Indicates whether to get information from the local node only.
	 * <p>
	 * API name: {@code local}
	 * 
	 * @deprecated 9.0.0 This parameter has no effect, is now deprecated, and will
	 *             be removed in a future version.
	 */
	@Deprecated
	@Nullable
	public final Boolean local() {
		return this.local;
	}

	/**
	 * The period to wait for the master node. If the master node is not available
	 * before the timeout expires, the request fails and returns an error. To
	 * indicate that the request should never timeout, set it to <code>-1</code>.
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final Time masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * Required - A comma-separated list of index template names used to limit the
	 * request. Wildcard (<code>*</code>) expressions are supported.
	 * <p>
	 * API name: {@code name}
	 */
	public final List<String> name() {
		return this.name;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExistsTemplateRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ExistsTemplateRequest> {
		@Nullable
		private Boolean flatSettings;

		@Nullable
		private Boolean local;

		@Nullable
		private Time masterTimeout;

		private List<String> name;

		public Builder() {
		}
		private Builder(ExistsTemplateRequest instance) {
			this.flatSettings = instance.flatSettings;
			this.local = instance.local;
			this.masterTimeout = instance.masterTimeout;
			this.name = instance.name;

		}
		/**
		 * Indicates whether to use a flat format for the response.
		 * <p>
		 * API name: {@code flat_settings}
		 */
		public final Builder flatSettings(@Nullable Boolean value) {
			this.flatSettings = value;
			return this;
		}

		/**
		 * Indicates whether to get information from the local node only.
		 * <p>
		 * API name: {@code local}
		 * 
		 * @deprecated 9.0.0 This parameter has no effect, is now deprecated, and will
		 *             be removed in a future version.
		 */
		@Deprecated
		public final Builder local(@Nullable Boolean value) {
			this.local = value;
			return this;
		}

		/**
		 * The period to wait for the master node. If the master node is not available
		 * before the timeout expires, the request fails and returns an error. To
		 * indicate that the request should never timeout, set it to <code>-1</code>.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable Time value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * The period to wait for the master node. If the master node is not available
		 * before the timeout expires, the request fails and returns an error. To
		 * indicate that the request should never timeout, set it to <code>-1</code>.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.masterTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - A comma-separated list of index template names used to limit the
		 * request. Wildcard (<code>*</code>) expressions are supported.
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
		 * Required - A comma-separated list of index template names used to limit the
		 * request. Wildcard (<code>*</code>) expressions are supported.
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
		 * Builds a {@link ExistsTemplateRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExistsTemplateRequest build() {
			_checkSingleUse();

			return new ExistsTemplateRequest(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.exists_template}".
	 */
	public static final Endpoint<ExistsTemplateRequest, BooleanResponse, ErrorResponse> _ENDPOINT = new BooleanEndpoint<>(
			"es/indices.exists_template",

			// Request method
			request -> {
				return "HEAD";

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
					SimpleEndpoint.pathEncode(request.name.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _name = 1 << 0;

				int propsSet = 0;

				propsSet |= _name;

				if (propsSet == (_name)) {
					params.put("name", request.name.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout._toJsonString());
				}
				if (request.flatSettings != null) {
					params.put("flat_settings", String.valueOf(request.flatSettings));
				}
				if (request.local != null) {
					params.put("local", String.valueOf(request.local));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, null);
}
