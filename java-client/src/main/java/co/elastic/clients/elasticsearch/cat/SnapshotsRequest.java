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

package co.elastic.clients.elasticsearch.cat;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.elasticsearch._types.TimeUnit;
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

// typedef: cat.snapshots.Request

/**
 * Get snapshot information.
 * <p>
 * Get information about the snapshots stored in one or more repositories. A
 * snapshot is a backup of an index or running Elasticsearch cluster. IMPORTANT:
 * cat APIs are only intended for human consumption using the command line or
 * Kibana console. They are not intended for use by applications. For
 * application consumption, use the get snapshot API.
 * 
 * @see <a href="../doc-files/api-spec.html#cat.snapshots.Request">API
 *      specification</a>
 */

public class SnapshotsRequest extends CatRequestBase {
	@Nullable
	private final Boolean ignoreUnavailable;

	@Nullable
	private final Time masterTimeout;

	private final List<String> repository;

	@Nullable
	private final TimeUnit time;

	// ---------------------------------------------------------------------------------------------

	private SnapshotsRequest(Builder builder) {

		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.masterTimeout = builder.masterTimeout;
		this.repository = ApiTypeHelper.unmodifiable(builder.repository);
		this.time = builder.time;

	}

	public static SnapshotsRequest of(Function<Builder, ObjectBuilder<SnapshotsRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * If <code>true</code>, the response does not include information from
	 * unavailable snapshots.
	 * <p>
	 * API name: {@code ignore_unavailable}
	 */
	@Nullable
	public final Boolean ignoreUnavailable() {
		return this.ignoreUnavailable;
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
	 * A comma-separated list of snapshot repositories used to limit the request.
	 * Accepts wildcard expressions. <code>_all</code> returns all repositories. If
	 * any repository fails during the request, Elasticsearch returns an error.
	 * <p>
	 * API name: {@code repository}
	 */
	public final List<String> repository() {
		return this.repository;
	}

	/**
	 * Unit used to display time values.
	 * <p>
	 * API name: {@code time}
	 */
	@Nullable
	public final TimeUnit time() {
		return this.time;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SnapshotsRequest}.
	 */

	public static class Builder extends CatRequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<SnapshotsRequest> {
		@Nullable
		private Boolean ignoreUnavailable;

		@Nullable
		private Time masterTimeout;

		@Nullable
		private List<String> repository;

		@Nullable
		private TimeUnit time;

		/**
		 * If <code>true</code>, the response does not include information from
		 * unavailable snapshots.
		 * <p>
		 * API name: {@code ignore_unavailable}
		 */
		public final Builder ignoreUnavailable(@Nullable Boolean value) {
			this.ignoreUnavailable = value;
			return this;
		}

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
		 * A comma-separated list of snapshot repositories used to limit the request.
		 * Accepts wildcard expressions. <code>_all</code> returns all repositories. If
		 * any repository fails during the request, Elasticsearch returns an error.
		 * <p>
		 * API name: {@code repository}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>repository</code>.
		 */
		public final Builder repository(List<String> list) {
			this.repository = _listAddAll(this.repository, list);
			return this;
		}

		/**
		 * A comma-separated list of snapshot repositories used to limit the request.
		 * Accepts wildcard expressions. <code>_all</code> returns all repositories. If
		 * any repository fails during the request, Elasticsearch returns an error.
		 * <p>
		 * API name: {@code repository}
		 * <p>
		 * Adds one or more values to <code>repository</code>.
		 */
		public final Builder repository(String value, String... values) {
			this.repository = _listAdd(this.repository, value, values);
			return this;
		}

		/**
		 * Unit used to display time values.
		 * <p>
		 * API name: {@code time}
		 */
		public final Builder time(@Nullable TimeUnit value) {
			this.time = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SnapshotsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SnapshotsRequest build() {
			_checkSingleUse();

			return new SnapshotsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code cat.snapshots}".
	 */
	public static final Endpoint<SnapshotsRequest, SnapshotsResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/cat.snapshots",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _repository = 1 << 0;

				int propsSet = 0;

				if (ApiTypeHelper.isDefined(request.repository()))
					propsSet |= _repository;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_cat");
					buf.append("/snapshots");
					return buf.toString();
				}
				if (propsSet == (_repository)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_cat");
					buf.append("/snapshots");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.repository.stream().map(v -> v).collect(Collectors.joining(",")),
							buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _repository = 1 << 0;

				int propsSet = 0;

				if (ApiTypeHelper.isDefined(request.repository()))
					propsSet |= _repository;

				if (propsSet == 0) {
				}
				if (propsSet == (_repository)) {
					params.put("repository", request.repository.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				params.put("format", "json");
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout._toJsonString());
				}
				if (request.ignoreUnavailable != null) {
					params.put("ignore_unavailable", String.valueOf(request.ignoreUnavailable));
				}
				if (request.time != null) {
					params.put("time", request.time.jsonValue());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, SnapshotsResponse._DESERIALIZER);
}
