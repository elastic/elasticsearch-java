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

package co.elastic.clients.elasticsearch.cluster;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.ExpandWildcardOptions;
import co.elastic.clients.elasticsearch._types.Level;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.WaitForEvents;
import co.elastic.clients.elasticsearch._types.WaitForStatus;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.SimpleEndpoint;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: cluster.health.Request

public class HealthRequest extends RequestBase {
	private final List<ExpandWildcardOptions> expandWildcards;

	private final List<String> index;

	@Nullable
	private final Level level;

	@Nullable
	private final Boolean local;

	@Nullable
	private final String masterTimeout;

	@Nullable
	private final String timeout;

	@Nullable
	private final JsonValue /* _types.WaitForActiveShards */ waitForActiveShards;

	@Nullable
	private final WaitForEvents waitForEvents;

	@Nullable
	private final Boolean waitForNoInitializingShards;

	@Nullable
	private final Boolean waitForNoRelocatingShards;

	@Nullable
	private final String waitForNodes;

	@Nullable
	private final WaitForStatus waitForStatus;

	// ---------------------------------------------------------------------------------------------

	private HealthRequest(Builder builder) {

		this.expandWildcards = ModelTypeHelper.unmodifiable(builder.expandWildcards);
		this.index = ModelTypeHelper.unmodifiable(builder.index);
		this.level = builder.level;
		this.local = builder.local;
		this.masterTimeout = builder.masterTimeout;
		this.timeout = builder.timeout;
		this.waitForActiveShards = builder.waitForActiveShards;
		this.waitForEvents = builder.waitForEvents;
		this.waitForNoInitializingShards = builder.waitForNoInitializingShards;
		this.waitForNoRelocatingShards = builder.waitForNoRelocatingShards;
		this.waitForNodes = builder.waitForNodes;
		this.waitForStatus = builder.waitForStatus;

	}

	public static HealthRequest of(Function<Builder, ObjectBuilder<HealthRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Whether to expand wildcard expression to concrete indices that are open,
	 * closed or both.
	 * <p>
	 * API name: {@code expand_wildcards}
	 */
	public final List<ExpandWildcardOptions> expandWildcards() {
		return this.expandWildcards;
	}

	/**
	 * Comma-separated list of data streams, indices, and index aliases used to
	 * limit the request. Wildcard expressions (*) are supported. To target all data
	 * streams and indices in a cluster, omit this parameter or use _all or *.
	 * <p>
	 * API name: {@code index}
	 */
	public final List<String> index() {
		return this.index;
	}

	/**
	 * Can be one of cluster, indices or shards. Controls the details level of the
	 * health information returned.
	 * <p>
	 * API name: {@code level}
	 */
	@Nullable
	public final Level level() {
		return this.level;
	}

	/**
	 * If true, the request retrieves information from the local node only. Defaults
	 * to false, which means information is retrieved from the master node.
	 * <p>
	 * API name: {@code local}
	 */
	@Nullable
	public final Boolean local() {
		return this.local;
	}

	/**
	 * Period to wait for a connection to the master node. If no response is
	 * received before the timeout expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final String masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * Period to wait for a response. If no response is received before the timeout
	 * expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final String timeout() {
		return this.timeout;
	}

	/**
	 * A number controlling to how many active shards to wait for, all to wait for
	 * all shards in the cluster to be active, or 0 to not wait.
	 * <p>
	 * API name: {@code wait_for_active_shards}
	 */
	@Nullable
	public final JsonValue /* _types.WaitForActiveShards */ waitForActiveShards() {
		return this.waitForActiveShards;
	}

	/**
	 * Can be one of immediate, urgent, high, normal, low, languid. Wait until all
	 * currently queued events with the given priority are processed.
	 * <p>
	 * API name: {@code wait_for_events}
	 */
	@Nullable
	public final WaitForEvents waitForEvents() {
		return this.waitForEvents;
	}

	/**
	 * A boolean value which controls whether to wait (until the timeout provided)
	 * for the cluster to have no shard initializations. Defaults to false, which
	 * means it will not wait for initializing shards.
	 * <p>
	 * API name: {@code wait_for_no_initializing_shards}
	 */
	@Nullable
	public final Boolean waitForNoInitializingShards() {
		return this.waitForNoInitializingShards;
	}

	/**
	 * A boolean value which controls whether to wait (until the timeout provided)
	 * for the cluster to have no shard relocations. Defaults to false, which means
	 * it will not wait for relocating shards.
	 * <p>
	 * API name: {@code wait_for_no_relocating_shards}
	 */
	@Nullable
	public final Boolean waitForNoRelocatingShards() {
		return this.waitForNoRelocatingShards;
	}

	/**
	 * The request waits until the specified number N of nodes is available. It also
	 * accepts &gt;=N, &lt;=N, &gt;N and &lt;N. Alternatively, it is possible to use
	 * ge(N), le(N), gt(N) and lt(N) notation.
	 * <p>
	 * API name: {@code wait_for_nodes}
	 */
	@Nullable
	public final String waitForNodes() {
		return this.waitForNodes;
	}

	/**
	 * One of green, yellow or red. Will wait (until the timeout provided) until the
	 * status of the cluster changes to the one provided or better, i.e. green &gt;
	 * yellow &gt; red. By default, will not wait for any status.
	 * <p>
	 * API name: {@code wait_for_status}
	 */
	@Nullable
	public final WaitForStatus waitForStatus() {
		return this.waitForStatus;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HealthRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<HealthRequest> {
		@Nullable
		private List<ExpandWildcardOptions> expandWildcards;

		@Nullable
		private List<String> index;

		@Nullable
		private Level level;

		@Nullable
		private Boolean local;

		@Nullable
		private String masterTimeout;

		@Nullable
		private String timeout;

		@Nullable
		private JsonValue /* _types.WaitForActiveShards */ waitForActiveShards;

		@Nullable
		private WaitForEvents waitForEvents;

		@Nullable
		private Boolean waitForNoInitializingShards;

		@Nullable
		private Boolean waitForNoRelocatingShards;

		@Nullable
		private String waitForNodes;

		@Nullable
		private WaitForStatus waitForStatus;

		/**
		 * Whether to expand wildcard expression to concrete indices that are open,
		 * closed or both.
		 * <p>
		 * API name: {@code expand_wildcards}
		 */
		public final Builder expandWildcards(@Nullable List<ExpandWildcardOptions> value) {
			this.expandWildcards = value;
			return this;
		}

		/**
		 * Whether to expand wildcard expression to concrete indices that are open,
		 * closed or both.
		 * <p>
		 * API name: {@code expand_wildcards}
		 */
		public final Builder expandWildcards(ExpandWildcardOptions... value) {
			this.expandWildcards = Arrays.asList(value);
			return this;
		}

		/**
		 * Comma-separated list of data streams, indices, and index aliases used to
		 * limit the request. Wildcard expressions (*) are supported. To target all data
		 * streams and indices in a cluster, omit this parameter or use _all or *.
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(@Nullable List<String> value) {
			this.index = value;
			return this;
		}

		/**
		 * Comma-separated list of data streams, indices, and index aliases used to
		 * limit the request. Wildcard expressions (*) are supported. To target all data
		 * streams and indices in a cluster, omit this parameter or use _all or *.
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(String... value) {
			this.index = Arrays.asList(value);
			return this;
		}

		/**
		 * Can be one of cluster, indices or shards. Controls the details level of the
		 * health information returned.
		 * <p>
		 * API name: {@code level}
		 */
		public final Builder level(@Nullable Level value) {
			this.level = value;
			return this;
		}

		/**
		 * If true, the request retrieves information from the local node only. Defaults
		 * to false, which means information is retrieved from the master node.
		 * <p>
		 * API name: {@code local}
		 */
		public final Builder local(@Nullable Boolean value) {
			this.local = value;
			return this;
		}

		/**
		 * Period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable String value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Period to wait for a response. If no response is received before the timeout
		 * expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable String value) {
			this.timeout = value;
			return this;
		}

		/**
		 * A number controlling to how many active shards to wait for, all to wait for
		 * all shards in the cluster to be active, or 0 to not wait.
		 * <p>
		 * API name: {@code wait_for_active_shards}
		 */
		public final Builder waitForActiveShards(@Nullable JsonValue /* _types.WaitForActiveShards */ value) {
			this.waitForActiveShards = value;
			return this;
		}

		/**
		 * Can be one of immediate, urgent, high, normal, low, languid. Wait until all
		 * currently queued events with the given priority are processed.
		 * <p>
		 * API name: {@code wait_for_events}
		 */
		public final Builder waitForEvents(@Nullable WaitForEvents value) {
			this.waitForEvents = value;
			return this;
		}

		/**
		 * A boolean value which controls whether to wait (until the timeout provided)
		 * for the cluster to have no shard initializations. Defaults to false, which
		 * means it will not wait for initializing shards.
		 * <p>
		 * API name: {@code wait_for_no_initializing_shards}
		 */
		public final Builder waitForNoInitializingShards(@Nullable Boolean value) {
			this.waitForNoInitializingShards = value;
			return this;
		}

		/**
		 * A boolean value which controls whether to wait (until the timeout provided)
		 * for the cluster to have no shard relocations. Defaults to false, which means
		 * it will not wait for relocating shards.
		 * <p>
		 * API name: {@code wait_for_no_relocating_shards}
		 */
		public final Builder waitForNoRelocatingShards(@Nullable Boolean value) {
			this.waitForNoRelocatingShards = value;
			return this;
		}

		/**
		 * The request waits until the specified number N of nodes is available. It also
		 * accepts &gt;=N, &lt;=N, &gt;N and &lt;N. Alternatively, it is possible to use
		 * ge(N), le(N), gt(N) and lt(N) notation.
		 * <p>
		 * API name: {@code wait_for_nodes}
		 */
		public final Builder waitForNodes(@Nullable String value) {
			this.waitForNodes = value;
			return this;
		}

		/**
		 * One of green, yellow or red. Will wait (until the timeout provided) until the
		 * status of the cluster changes to the one provided or better, i.e. green &gt;
		 * yellow &gt; red. By default, will not wait for any status.
		 * <p>
		 * API name: {@code wait_for_status}
		 */
		public final Builder waitForStatus(@Nullable WaitForStatus value) {
			this.waitForStatus = value;
			return this;
		}

		/**
		 * Builds a {@link HealthRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HealthRequest build() {
			_checkSingleUse();

			return new HealthRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code cluster.health}".
	 */
	public static final Endpoint<HealthRequest, HealthResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;

				int propsSet = 0;

				if (ModelTypeHelper.isDefined(request.index()))
					propsSet |= _index;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_cluster");
					buf.append("/health");
					return buf.toString();
				}
				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_cluster");
					buf.append("/health");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout);
				}
				if (ModelTypeHelper.isDefined(request.expandWildcards)) {
					params.put("expand_wildcards",
							request.expandWildcards.stream().map(v -> v.jsonValue()).collect(Collectors.joining(",")));
				}
				if (request.level != null) {
					params.put("level", request.level.jsonValue());
				}
				if (request.waitForEvents != null) {
					params.put("wait_for_events", request.waitForEvents.jsonValue());
				}
				if (request.waitForNoInitializingShards != null) {
					params.put("wait_for_no_initializing_shards", String.valueOf(request.waitForNoInitializingShards));
				}
				if (request.waitForStatus != null) {
					params.put("wait_for_status", request.waitForStatus.jsonValue());
				}
				if (request.waitForActiveShards != null) {
					params.put("wait_for_active_shards", JsonpUtils.toString(request.waitForActiveShards));
				}
				if (request.waitForNodes != null) {
					params.put("wait_for_nodes", request.waitForNodes);
				}
				if (request.waitForNoRelocatingShards != null) {
					params.put("wait_for_no_relocating_shards", String.valueOf(request.waitForNoRelocatingShards));
				}
				if (request.local != null) {
					params.put("local", String.valueOf(request.local));
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, HealthResponse._DESERIALIZER);
}
