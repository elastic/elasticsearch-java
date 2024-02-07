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

package co.elastic.clients.elasticsearch.core;

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
import java.lang.Integer;
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

// typedef: _global.health_report.Request

/**
 * Returns the health of the cluster.
 * 
 * @see <a href="../doc-files/api-spec.html#_global.health_report.Request">API
 *      specification</a>
 */

public class HealthReportRequest extends RequestBase {
	private final List<String> feature;

	@Nullable
	private final Integer size;

	@Nullable
	private final Time timeout;

	@Nullable
	private final Boolean verbose;

	// ---------------------------------------------------------------------------------------------

	private HealthReportRequest(Builder builder) {

		this.feature = ApiTypeHelper.unmodifiable(builder.feature);
		this.size = builder.size;
		this.timeout = builder.timeout;
		this.verbose = builder.verbose;

	}

	public static HealthReportRequest of(Function<Builder, ObjectBuilder<HealthReportRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * A feature of the cluster, as returned by the top-level health report API.
	 * <p>
	 * API name: {@code feature}
	 */
	public final List<String> feature() {
		return this.feature;
	}

	/**
	 * Limit the number of affected resources the health report API returns.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
	}

	/**
	 * Explicit operation timeout.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
	}

	/**
	 * Opt-in for more information about the health of the system.
	 * <p>
	 * API name: {@code verbose}
	 */
	@Nullable
	public final Boolean verbose() {
		return this.verbose;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HealthReportRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<HealthReportRequest> {
		@Nullable
		private List<String> feature;

		@Nullable
		private Integer size;

		@Nullable
		private Time timeout;

		@Nullable
		private Boolean verbose;

		/**
		 * A feature of the cluster, as returned by the top-level health report API.
		 * <p>
		 * API name: {@code feature}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>feature</code>.
		 */
		public final Builder feature(List<String> list) {
			this.feature = _listAddAll(this.feature, list);
			return this;
		}

		/**
		 * A feature of the cluster, as returned by the top-level health report API.
		 * <p>
		 * API name: {@code feature}
		 * <p>
		 * Adds one or more values to <code>feature</code>.
		 */
		public final Builder feature(String value, String... values) {
			this.feature = _listAdd(this.feature, value, values);
			return this;
		}

		/**
		 * Limit the number of affected resources the health report API returns.
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * Explicit operation timeout.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Explicit operation timeout.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Opt-in for more information about the health of the system.
		 * <p>
		 * API name: {@code verbose}
		 */
		public final Builder verbose(@Nullable Boolean value) {
			this.verbose = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link HealthReportRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HealthReportRequest build() {
			_checkSingleUse();

			return new HealthReportRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code health_report}".
	 */
	public static final Endpoint<HealthReportRequest, HealthReportResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/health_report",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _feature = 1 << 0;

				int propsSet = 0;

				if (ApiTypeHelper.isDefined(request.feature()))
					propsSet |= _feature;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_health_report");
					return buf.toString();
				}
				if (propsSet == (_feature)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_health_report");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.feature.stream().map(v -> v).collect(Collectors.joining(",")),
							buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _feature = 1 << 0;

				int propsSet = 0;

				if (ApiTypeHelper.isDefined(request.feature()))
					propsSet |= _feature;

				if (propsSet == 0) {
				}
				if (propsSet == (_feature)) {
					params.put("feature", request.feature.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.size != null) {
					params.put("size", String.valueOf(request.size));
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				if (request.verbose != null) {
					params.put("verbose", String.valueOf(request.verbose));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, HealthReportResponse._DESERIALIZER);
}
