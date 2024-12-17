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

package co.elastic.clients.elasticsearch.cluster;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.elasticsearch.cluster.reroute.Command;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Collections;
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

// typedef: cluster.reroute.Request

/**
 * Reroute the cluster. Manually change the allocation of individual shards in
 * the cluster. For example, a shard can be moved from one node to another
 * explicitly, an allocation can be canceled, and an unassigned shard can be
 * explicitly allocated to a specific node.
 * <p>
 * It is important to note that after processing any reroute commands
 * Elasticsearch will perform rebalancing as normal (respecting the values of
 * settings such as <code>cluster.routing.rebalance.enable</code>) in order to
 * remain in a balanced state. For example, if the requested allocation includes
 * moving a shard from node1 to node2 then this may cause a shard to be moved
 * from node2 back to node1 to even things out.
 * <p>
 * The cluster can be set to disable allocations using the
 * <code>cluster.routing.allocation.enable</code> setting. If allocations are
 * disabled then the only allocations that will be performed are explicit ones
 * given using the reroute command, and consequent allocations due to
 * rebalancing.
 * <p>
 * The cluster will attempt to allocate a shard a maximum of
 * <code>index.allocation.max_retries</code> times in a row (defaults to
 * <code>5</code>), before giving up and leaving the shard unallocated. This
 * scenario can be caused by structural problems such as having an analyzer
 * which refers to a stopwords file which doesn’t exist on all nodes.
 * <p>
 * Once the problem has been corrected, allocation can be manually retried by
 * calling the reroute API with the <code>?retry_failed</code> URI query
 * parameter, which will attempt a single retry round for these shards.
 * 
 * @see <a href="../doc-files/api-spec.html#cluster.reroute.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class RerouteRequest extends RequestBase implements JsonpSerializable {
	private final List<Command> commands;

	@Nullable
	private final Boolean dryRun;

	@Nullable
	private final Boolean explain;

	@Nullable
	private final Time masterTimeout;

	private final List<String> metric;

	@Nullable
	private final Boolean retryFailed;

	@Nullable
	private final Time timeout;

	// ---------------------------------------------------------------------------------------------

	private RerouteRequest(Builder builder) {

		this.commands = ApiTypeHelper.unmodifiable(builder.commands);
		this.dryRun = builder.dryRun;
		this.explain = builder.explain;
		this.masterTimeout = builder.masterTimeout;
		this.metric = ApiTypeHelper.unmodifiable(builder.metric);
		this.retryFailed = builder.retryFailed;
		this.timeout = builder.timeout;

	}

	public static RerouteRequest of(Function<Builder, ObjectBuilder<RerouteRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Defines the commands to perform.
	 * <p>
	 * API name: {@code commands}
	 */
	public final List<Command> commands() {
		return this.commands;
	}

	/**
	 * If true, then the request simulates the operation. It will calculate the
	 * result of applying the commands to the current cluster state and return the
	 * resulting cluster state after the commands (and rebalancing) have been
	 * applied; it will not actually perform the requested changes.
	 * <p>
	 * API name: {@code dry_run}
	 */
	@Nullable
	public final Boolean dryRun() {
		return this.dryRun;
	}

	/**
	 * If true, then the response contains an explanation of why the commands can or
	 * cannot run.
	 * <p>
	 * API name: {@code explain}
	 */
	@Nullable
	public final Boolean explain() {
		return this.explain;
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
	 * Limits the information returned to the specified metrics.
	 * <p>
	 * API name: {@code metric}
	 */
	public final List<String> metric() {
		return this.metric;
	}

	/**
	 * If true, then retries allocation of shards that are blocked due to too many
	 * subsequent allocation failures.
	 * <p>
	 * API name: {@code retry_failed}
	 */
	@Nullable
	public final Boolean retryFailed() {
		return this.retryFailed;
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
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (ApiTypeHelper.isDefined(this.commands)) {
			generator.writeKey("commands");
			generator.writeStartArray();
			for (Command item0 : this.commands) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RerouteRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder> implements ObjectBuilder<RerouteRequest> {
		@Nullable
		private List<Command> commands;

		@Nullable
		private Boolean dryRun;

		@Nullable
		private Boolean explain;

		@Nullable
		private Time masterTimeout;

		@Nullable
		private List<String> metric;

		@Nullable
		private Boolean retryFailed;

		@Nullable
		private Time timeout;

		/**
		 * Defines the commands to perform.
		 * <p>
		 * API name: {@code commands}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>commands</code>.
		 */
		public final Builder commands(List<Command> list) {
			this.commands = _listAddAll(this.commands, list);
			return this;
		}

		/**
		 * Defines the commands to perform.
		 * <p>
		 * API name: {@code commands}
		 * <p>
		 * Adds one or more values to <code>commands</code>.
		 */
		public final Builder commands(Command value, Command... values) {
			this.commands = _listAdd(this.commands, value, values);
			return this;
		}

		/**
		 * Defines the commands to perform.
		 * <p>
		 * API name: {@code commands}
		 * <p>
		 * Adds a value to <code>commands</code> using a builder lambda.
		 */
		public final Builder commands(Function<Command.Builder, ObjectBuilder<Command>> fn) {
			return commands(fn.apply(new Command.Builder()).build());
		}

		/**
		 * If true, then the request simulates the operation. It will calculate the
		 * result of applying the commands to the current cluster state and return the
		 * resulting cluster state after the commands (and rebalancing) have been
		 * applied; it will not actually perform the requested changes.
		 * <p>
		 * API name: {@code dry_run}
		 */
		public final Builder dryRun(@Nullable Boolean value) {
			this.dryRun = value;
			return this;
		}

		/**
		 * If true, then the response contains an explanation of why the commands can or
		 * cannot run.
		 * <p>
		 * API name: {@code explain}
		 */
		public final Builder explain(@Nullable Boolean value) {
			this.explain = value;
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
		 * Limits the information returned to the specified metrics.
		 * <p>
		 * API name: {@code metric}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>metric</code>.
		 */
		public final Builder metric(List<String> list) {
			this.metric = _listAddAll(this.metric, list);
			return this;
		}

		/**
		 * Limits the information returned to the specified metrics.
		 * <p>
		 * API name: {@code metric}
		 * <p>
		 * Adds one or more values to <code>metric</code>.
		 */
		public final Builder metric(String value, String... values) {
			this.metric = _listAdd(this.metric, value, values);
			return this;
		}

		/**
		 * If true, then retries allocation of shards that are blocked due to too many
		 * subsequent allocation failures.
		 * <p>
		 * API name: {@code retry_failed}
		 */
		public final Builder retryFailed(@Nullable Boolean value) {
			this.retryFailed = value;
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
		 * Builds a {@link RerouteRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RerouteRequest build() {
			_checkSingleUse();

			return new RerouteRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RerouteRequest}
	 */
	public static final JsonpDeserializer<RerouteRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RerouteRequest::setupRerouteRequestDeserializer);

	protected static void setupRerouteRequestDeserializer(ObjectDeserializer<RerouteRequest.Builder> op) {

		op.add(Builder::commands, JsonpDeserializer.arrayDeserializer(Command._DESERIALIZER), "commands");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code cluster.reroute}".
	 */
	public static final Endpoint<RerouteRequest, RerouteResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/cluster.reroute",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_cluster/reroute";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.explain != null) {
					params.put("explain", String.valueOf(request.explain));
				}
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout._toJsonString());
				}
				if (ApiTypeHelper.isDefined(request.metric)) {
					params.put("metric", request.metric.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.dryRun != null) {
					params.put("dry_run", String.valueOf(request.dryRun));
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				if (request.retryFailed != null) {
					params.put("retry_failed", String.valueOf(request.retryFailed));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, RerouteResponse._DESERIALIZER);
}
