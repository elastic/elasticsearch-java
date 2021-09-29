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

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.base.SimpleEndpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch.cluster.reroute.Command;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: cluster.reroute.Request
@JsonpDeserializable
public final class RerouteRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Boolean dryRun;

	@Nullable
	private final Boolean explain;

	@Nullable
	private final List<String> metric;

	@Nullable
	private final Boolean retryFailed;

	@Nullable
	private final String masterTimeout;

	@Nullable
	private final String timeout;

	@Nullable
	private final List<Command> commands;

	// ---------------------------------------------------------------------------------------------

	public RerouteRequest(Builder builder) {

		this.dryRun = builder.dryRun;
		this.explain = builder.explain;
		this.metric = ModelTypeHelper.unmodifiable(builder.metric);
		this.retryFailed = builder.retryFailed;
		this.masterTimeout = builder.masterTimeout;
		this.timeout = builder.timeout;
		this.commands = ModelTypeHelper.unmodifiable(builder.commands);

	}

	public RerouteRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * If true, then the request simulates the operation only and returns the
	 * resulting state.
	 * <p>
	 * API name: {@code dry_run}
	 */
	@Nullable
	public Boolean dryRun() {
		return this.dryRun;
	}

	/**
	 * If true, then the response contains an explanation of why the commands can or
	 * cannot be executed.
	 * <p>
	 * API name: {@code explain}
	 */
	@Nullable
	public Boolean explain() {
		return this.explain;
	}

	/**
	 * Limits the information returned to the specified metrics.
	 * <p>
	 * API name: {@code metric}
	 */
	@Nullable
	public List<String> metric() {
		return this.metric;
	}

	/**
	 * If true, then retries allocation of shards that are blocked due to too many
	 * subsequent allocation failures.
	 * <p>
	 * API name: {@code retry_failed}
	 */
	@Nullable
	public Boolean retryFailed() {
		return this.retryFailed;
	}

	/**
	 * Period to wait for a connection to the master node. If no response is
	 * received before the timeout expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public String masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * Period to wait for a response. If no response is received before the timeout
	 * expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public String timeout() {
		return this.timeout;
	}

	/**
	 * Defines the commands to perform.
	 * <p>
	 * API name: {@code commands}
	 */
	@Nullable
	public List<Command> commands() {
		return this.commands;
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

		if (this.commands != null) {

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
	public static class Builder implements ObjectBuilder<RerouteRequest> {
		@Nullable
		private Boolean dryRun;

		@Nullable
		private Boolean explain;

		@Nullable
		private List<String> metric;

		@Nullable
		private Boolean retryFailed;

		@Nullable
		private String masterTimeout;

		@Nullable
		private String timeout;

		@Nullable
		private List<Command> commands;

		/**
		 * If true, then the request simulates the operation only and returns the
		 * resulting state.
		 * <p>
		 * API name: {@code dry_run}
		 */
		public Builder dryRun(@Nullable Boolean value) {
			this.dryRun = value;
			return this;
		}

		/**
		 * If true, then the response contains an explanation of why the commands can or
		 * cannot be executed.
		 * <p>
		 * API name: {@code explain}
		 */
		public Builder explain(@Nullable Boolean value) {
			this.explain = value;
			return this;
		}

		/**
		 * Limits the information returned to the specified metrics.
		 * <p>
		 * API name: {@code metric}
		 */
		public Builder metric(@Nullable List<String> value) {
			this.metric = value;
			return this;
		}

		/**
		 * Limits the information returned to the specified metrics.
		 * <p>
		 * API name: {@code metric}
		 */
		public Builder metric(String... value) {
			this.metric = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #metric(List)}, creating the list if needed. 4
		 */
		public Builder addMetric(String value) {
			if (this.metric == null) {
				this.metric = new ArrayList<>();
			}
			this.metric.add(value);
			return this;
		}

		/**
		 * If true, then retries allocation of shards that are blocked due to too many
		 * subsequent allocation failures.
		 * <p>
		 * API name: {@code retry_failed}
		 */
		public Builder retryFailed(@Nullable Boolean value) {
			this.retryFailed = value;
			return this;
		}

		/**
		 * Period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public Builder masterTimeout(@Nullable String value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Period to wait for a response. If no response is received before the timeout
		 * expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code timeout}
		 */
		public Builder timeout(@Nullable String value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Defines the commands to perform.
		 * <p>
		 * API name: {@code commands}
		 */
		public Builder commands(@Nullable List<Command> value) {
			this.commands = value;
			return this;
		}

		/**
		 * Defines the commands to perform.
		 * <p>
		 * API name: {@code commands}
		 */
		public Builder commands(Command... value) {
			this.commands = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #commands(List)}, creating the list if needed. 4
		 */
		public Builder addCommands(Command value) {
			if (this.commands == null) {
				this.commands = new ArrayList<>();
			}
			this.commands.add(value);
			return this;
		}

		/**
		 * Set {@link #commands(List)} to a singleton list.
		 */
		public Builder commands(Function<Command.Builder, ObjectBuilder<Command>> fn) {
			return this.commands(fn.apply(new Command.Builder()).build());
		}

		/**
		 * Add a value to {@link #commands(List)}, creating the list if needed. 5
		 */
		public Builder addCommands(Function<Command.Builder, ObjectBuilder<Command>> fn) {
			return this.addCommands(fn.apply(new Command.Builder()).build());
		}

		/**
		 * Builds a {@link RerouteRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RerouteRequest build() {

			return new RerouteRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RerouteRequest}
	 */
	public static final JsonpDeserializer<RerouteRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RerouteRequest::setupRerouteRequestDeserializer, Builder::build);

	protected static void setupRerouteRequestDeserializer(DelegatingDeserializer<RerouteRequest.Builder> op) {

		op.add(Builder::commands, JsonpDeserializer.arrayDeserializer(Command._DESERIALIZER), "commands");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code cluster.reroute}".
	 */
	public static final Endpoint<RerouteRequest, RerouteResponse, ElasticsearchError> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_cluster/reroute";

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.dryRun != null) {
					params.put("dry_run", String.valueOf(request.dryRun));
				}
				if (request.explain != null) {
					params.put("explain", String.valueOf(request.explain));
				}
				if (request.metric != null) {
					params.put("metric", request.metric.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.retryFailed != null) {
					params.put("retry_failed", String.valueOf(request.retryFailed));
				}
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout);
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, RerouteResponse._DESERIALIZER);
}
