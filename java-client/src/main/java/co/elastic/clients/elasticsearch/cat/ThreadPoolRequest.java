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

// typedef: cat.thread_pool.Request

/**
 * Get thread pool statistics.
 * <p>
 * Get thread pool statistics for each node in a cluster. Returned information
 * includes all built-in thread pools and custom thread pools. IMPORTANT: cat
 * APIs are only intended for human consumption using the command line or Kibana
 * console. They are not intended for use by applications. For application
 * consumption, use the nodes info API.
 * 
 * @see <a href="../doc-files/api-spec.html#cat.thread_pool.Request">API
 *      specification</a>
 */

public class ThreadPoolRequest extends CatRequestBase {
	@Nullable
	private final Boolean local;

	@Nullable
	private final Time masterTimeout;

	private final List<String> threadPoolPatterns;

	@Nullable
	private final TimeUnit time;

	// ---------------------------------------------------------------------------------------------

	private ThreadPoolRequest(Builder builder) {

		this.local = builder.local;
		this.masterTimeout = builder.masterTimeout;
		this.threadPoolPatterns = ApiTypeHelper.unmodifiable(builder.threadPoolPatterns);
		this.time = builder.time;

	}

	public static ThreadPoolRequest of(Function<Builder, ObjectBuilder<ThreadPoolRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * If <code>true</code>, the request computes the list of selected nodes from
	 * the local cluster state. If <code>false</code> the list of selected nodes are
	 * computed from the cluster state of the master node. In both cases the
	 * coordinating node will send requests for further information to each selected
	 * node.
	 * <p>
	 * API name: {@code local}
	 */
	@Nullable
	public final Boolean local() {
		return this.local;
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
	 * A comma-separated list of thread pool names used to limit the request.
	 * Accepts wildcard expressions.
	 * <p>
	 * API name: {@code thread_pool_patterns}
	 */
	public final List<String> threadPoolPatterns() {
		return this.threadPoolPatterns;
	}

	/**
	 * The unit used to display time values.
	 * <p>
	 * API name: {@code time}
	 */
	@Nullable
	public final TimeUnit time() {
		return this.time;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ThreadPoolRequest}.
	 */

	public static class Builder extends CatRequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ThreadPoolRequest> {
		@Nullable
		private Boolean local;

		@Nullable
		private Time masterTimeout;

		@Nullable
		private List<String> threadPoolPatterns;

		@Nullable
		private TimeUnit time;

		/**
		 * If <code>true</code>, the request computes the list of selected nodes from
		 * the local cluster state. If <code>false</code> the list of selected nodes are
		 * computed from the cluster state of the master node. In both cases the
		 * coordinating node will send requests for further information to each selected
		 * node.
		 * <p>
		 * API name: {@code local}
		 */
		public final Builder local(@Nullable Boolean value) {
			this.local = value;
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
		 * A comma-separated list of thread pool names used to limit the request.
		 * Accepts wildcard expressions.
		 * <p>
		 * API name: {@code thread_pool_patterns}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>threadPoolPatterns</code>.
		 */
		public final Builder threadPoolPatterns(List<String> list) {
			this.threadPoolPatterns = _listAddAll(this.threadPoolPatterns, list);
			return this;
		}

		/**
		 * A comma-separated list of thread pool names used to limit the request.
		 * Accepts wildcard expressions.
		 * <p>
		 * API name: {@code thread_pool_patterns}
		 * <p>
		 * Adds one or more values to <code>threadPoolPatterns</code>.
		 */
		public final Builder threadPoolPatterns(String value, String... values) {
			this.threadPoolPatterns = _listAdd(this.threadPoolPatterns, value, values);
			return this;
		}

		/**
		 * The unit used to display time values.
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
		 * Builds a {@link ThreadPoolRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ThreadPoolRequest build() {
			_checkSingleUse();

			return new ThreadPoolRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code cat.thread_pool}".
	 */
	public static final Endpoint<ThreadPoolRequest, ThreadPoolResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/cat.thread_pool",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _threadPoolPatterns = 1 << 0;

				int propsSet = 0;

				if (ApiTypeHelper.isDefined(request.threadPoolPatterns()))
					propsSet |= _threadPoolPatterns;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_cat");
					buf.append("/thread_pool");
					return buf.toString();
				}
				if (propsSet == (_threadPoolPatterns)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_cat");
					buf.append("/thread_pool");
					buf.append("/");
					SimpleEndpoint.pathEncode(
							request.threadPoolPatterns.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _threadPoolPatterns = 1 << 0;

				int propsSet = 0;

				if (ApiTypeHelper.isDefined(request.threadPoolPatterns()))
					propsSet |= _threadPoolPatterns;

				if (propsSet == 0) {
				}
				if (propsSet == (_threadPoolPatterns)) {
					params.put("threadPoolPatterns",
							request.threadPoolPatterns.stream().map(v -> v).collect(Collectors.joining(",")));
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
				if (request.time != null) {
					params.put("time", request.time.jsonValue());
				}
				if (request.local != null) {
					params.put("local", String.valueOf(request.local));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, ThreadPoolResponse._DESERIALIZER);
}
