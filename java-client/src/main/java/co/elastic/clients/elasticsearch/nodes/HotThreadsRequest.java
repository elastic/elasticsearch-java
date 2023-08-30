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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.nodes;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.ThreadType;
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
import java.lang.Long;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: nodes.hot_threads.Request

/**
 * This API yields a breakdown of the hot threads on each selected node in the
 * cluster. The output is plain text with a breakdown of each node’s top hot
 * threads.
 * 
 * @see <a href="../doc-files/api-spec.html#nodes.hot_threads.Request">API
 *      specification</a>
 */

public class HotThreadsRequest extends RequestBase {
	@Nullable
	private final Boolean ignoreIdleThreads;

	@Nullable
	private final Time interval;

	@Nullable
	private final Time masterTimeout;

	private final List<String> nodeId;

	@Nullable
	private final Long snapshots;

	@Nullable
	private final ThreadType sort;

	@Nullable
	private final Long threads;

	@Nullable
	private final Time timeout;

	@Nullable
	private final ThreadType type;

	// ---------------------------------------------------------------------------------------------

	private HotThreadsRequest(Builder builder) {

		this.ignoreIdleThreads = builder.ignoreIdleThreads;
		this.interval = builder.interval;
		this.masterTimeout = builder.masterTimeout;
		this.nodeId = ApiTypeHelper.unmodifiable(builder.nodeId);
		this.snapshots = builder.snapshots;
		this.sort = builder.sort;
		this.threads = builder.threads;
		this.timeout = builder.timeout;
		this.type = builder.type;

	}

	public static HotThreadsRequest of(Function<Builder, ObjectBuilder<HotThreadsRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * If true, known idle threads (e.g. waiting in a socket select, or to get a
	 * task from an empty queue) are filtered out.
	 * <p>
	 * API name: {@code ignore_idle_threads}
	 */
	@Nullable
	public final Boolean ignoreIdleThreads() {
		return this.ignoreIdleThreads;
	}

	/**
	 * The interval to do the second sampling of threads.
	 * <p>
	 * API name: {@code interval}
	 */
	@Nullable
	public final Time interval() {
		return this.interval;
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
	 * List of node IDs or names used to limit returned information.
	 * <p>
	 * API name: {@code node_id}
	 */
	public final List<String> nodeId() {
		return this.nodeId;
	}

	/**
	 * Number of samples of thread stacktrace.
	 * <p>
	 * API name: {@code snapshots}
	 */
	@Nullable
	public final Long snapshots() {
		return this.snapshots;
	}

	/**
	 * The sort order for 'cpu' type (default: total)
	 * <p>
	 * API name: {@code sort}
	 */
	@Nullable
	public final ThreadType sort() {
		return this.sort;
	}

	/**
	 * Specifies the number of hot threads to provide information for.
	 * <p>
	 * API name: {@code threads}
	 */
	@Nullable
	public final Long threads() {
		return this.threads;
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

	/**
	 * The type to sample.
	 * <p>
	 * API name: {@code type}
	 */
	@Nullable
	public final ThreadType type() {
		return this.type;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HotThreadsRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<HotThreadsRequest> {
		@Nullable
		private Boolean ignoreIdleThreads;

		@Nullable
		private Time interval;

		@Nullable
		private Time masterTimeout;

		@Nullable
		private List<String> nodeId;

		@Nullable
		private Long snapshots;

		@Nullable
		private ThreadType sort;

		@Nullable
		private Long threads;

		@Nullable
		private Time timeout;

		@Nullable
		private ThreadType type;

		/**
		 * If true, known idle threads (e.g. waiting in a socket select, or to get a
		 * task from an empty queue) are filtered out.
		 * <p>
		 * API name: {@code ignore_idle_threads}
		 */
		public final Builder ignoreIdleThreads(@Nullable Boolean value) {
			this.ignoreIdleThreads = value;
			return this;
		}

		/**
		 * The interval to do the second sampling of threads.
		 * <p>
		 * API name: {@code interval}
		 */
		public final Builder interval(@Nullable Time value) {
			this.interval = value;
			return this;
		}

		/**
		 * The interval to do the second sampling of threads.
		 * <p>
		 * API name: {@code interval}
		 */
		public final Builder interval(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.interval(fn.apply(new Time.Builder()).build());
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
		 * List of node IDs or names used to limit returned information.
		 * <p>
		 * API name: {@code node_id}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>nodeId</code>.
		 */
		public final Builder nodeId(List<String> list) {
			this.nodeId = _listAddAll(this.nodeId, list);
			return this;
		}

		/**
		 * List of node IDs or names used to limit returned information.
		 * <p>
		 * API name: {@code node_id}
		 * <p>
		 * Adds one or more values to <code>nodeId</code>.
		 */
		public final Builder nodeId(String value, String... values) {
			this.nodeId = _listAdd(this.nodeId, value, values);
			return this;
		}

		/**
		 * Number of samples of thread stacktrace.
		 * <p>
		 * API name: {@code snapshots}
		 */
		public final Builder snapshots(@Nullable Long value) {
			this.snapshots = value;
			return this;
		}

		/**
		 * The sort order for 'cpu' type (default: total)
		 * <p>
		 * API name: {@code sort}
		 */
		public final Builder sort(@Nullable ThreadType value) {
			this.sort = value;
			return this;
		}

		/**
		 * Specifies the number of hot threads to provide information for.
		 * <p>
		 * API name: {@code threads}
		 */
		public final Builder threads(@Nullable Long value) {
			this.threads = value;
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

		/**
		 * The type to sample.
		 * <p>
		 * API name: {@code type}
		 */
		public final Builder type(@Nullable ThreadType value) {
			this.type = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link HotThreadsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HotThreadsRequest build() {
			_checkSingleUse();

			return new HotThreadsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code nodes.hot_threads}".
	 */
	public static final Endpoint<HotThreadsRequest, HotThreadsResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/nodes.hot_threads",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _nodeId = 1 << 0;

				int propsSet = 0;

				if (ApiTypeHelper.isDefined(request.nodeId()))
					propsSet |= _nodeId;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_nodes");
					buf.append("/hot_threads");
					return buf.toString();
				}
				if (propsSet == (_nodeId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_nodes");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.nodeId.stream().map(v -> v).collect(Collectors.joining(",")),
							buf);
					buf.append("/hot_threads");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _nodeId = 1 << 0;

				int propsSet = 0;

				if (ApiTypeHelper.isDefined(request.nodeId()))
					propsSet |= _nodeId;

				if (propsSet == 0) {
				}
				if (propsSet == (_nodeId)) {
					params.put("nodeId", request.nodeId.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.snapshots != null) {
					params.put("snapshots", String.valueOf(request.snapshots));
				}
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout._toJsonString());
				}
				if (request.threads != null) {
					params.put("threads", String.valueOf(request.threads));
				}
				if (request.interval != null) {
					params.put("interval", request.interval._toJsonString());
				}
				if (request.sort != null) {
					params.put("sort", request.sort.jsonValue());
				}
				if (request.type != null) {
					params.put("type", request.type.jsonValue());
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				if (request.ignoreIdleThreads != null) {
					params.put("ignore_idle_threads", String.valueOf(request.ignoreIdleThreads));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, HotThreadsResponse._DESERIALIZER);
}
