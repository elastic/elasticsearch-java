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

import co.elastic.clients.elasticsearch._types.Health;
import co.elastic.clients.elasticsearch.cluster.health.IndexHealthStats;
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
import java.lang.Integer;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.health.Response
@JsonpDeserializable
public final class HealthResponse implements JsonpSerializable {
	private final int activePrimaryShards;

	private final int activeShards;

	private final String activeShardsPercentAsNumber;

	private final String clusterName;

	private final int delayedUnassignedShards;

	@Nullable
	private final Map<String, IndexHealthStats> indices;

	private final int initializingShards;

	private final int numberOfDataNodes;

	private final int numberOfInFlightFetch;

	private final int numberOfNodes;

	private final int numberOfPendingTasks;

	private final int relocatingShards;

	private final Health status;

	private final String taskMaxWaitingInQueueMillis;

	private final boolean timedOut;

	private final int unassignedShards;

	// ---------------------------------------------------------------------------------------------

	public HealthResponse(Builder builder) {

		this.activePrimaryShards = Objects.requireNonNull(builder.activePrimaryShards, "active_primary_shards");
		this.activeShards = Objects.requireNonNull(builder.activeShards, "active_shards");
		this.activeShardsPercentAsNumber = Objects.requireNonNull(builder.activeShardsPercentAsNumber,
				"active_shards_percent_as_number");
		this.clusterName = Objects.requireNonNull(builder.clusterName, "cluster_name");
		this.delayedUnassignedShards = Objects.requireNonNull(builder.delayedUnassignedShards,
				"delayed_unassigned_shards");
		this.indices = ModelTypeHelper.unmodifiable(builder.indices);
		this.initializingShards = Objects.requireNonNull(builder.initializingShards, "initializing_shards");
		this.numberOfDataNodes = Objects.requireNonNull(builder.numberOfDataNodes, "number_of_data_nodes");
		this.numberOfInFlightFetch = Objects.requireNonNull(builder.numberOfInFlightFetch, "number_of_in_flight_fetch");
		this.numberOfNodes = Objects.requireNonNull(builder.numberOfNodes, "number_of_nodes");
		this.numberOfPendingTasks = Objects.requireNonNull(builder.numberOfPendingTasks, "number_of_pending_tasks");
		this.relocatingShards = Objects.requireNonNull(builder.relocatingShards, "relocating_shards");
		this.status = Objects.requireNonNull(builder.status, "status");
		this.taskMaxWaitingInQueueMillis = Objects.requireNonNull(builder.taskMaxWaitingInQueueMillis,
				"task_max_waiting_in_queue_millis");
		this.timedOut = Objects.requireNonNull(builder.timedOut, "timed_out");
		this.unassignedShards = Objects.requireNonNull(builder.unassignedShards, "unassigned_shards");

	}

	public HealthResponse(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * The number of active primary shards.
	 * <p>
	 * API name: {@code active_primary_shards}
	 */
	public int activePrimaryShards() {
		return this.activePrimaryShards;
	}

	/**
	 * The total number of active primary and replica shards.
	 * <p>
	 * API name: {@code active_shards}
	 */
	public int activeShards() {
		return this.activeShards;
	}

	/**
	 * The ratio of active shards in the cluster expressed as a percentage.
	 * <p>
	 * API name: {@code active_shards_percent_as_number}
	 */
	public String activeShardsPercentAsNumber() {
		return this.activeShardsPercentAsNumber;
	}

	/**
	 * The name of the cluster.
	 * <p>
	 * API name: {@code cluster_name}
	 */
	public String clusterName() {
		return this.clusterName;
	}

	/**
	 * The number of shards whose allocation has been delayed by the timeout
	 * settings.
	 * <p>
	 * API name: {@code delayed_unassigned_shards}
	 */
	public int delayedUnassignedShards() {
		return this.delayedUnassignedShards;
	}

	/**
	 * API name: {@code indices}
	 */
	@Nullable
	public Map<String, IndexHealthStats> indices() {
		return this.indices;
	}

	/**
	 * The number of shards that are under initialization.
	 * <p>
	 * API name: {@code initializing_shards}
	 */
	public int initializingShards() {
		return this.initializingShards;
	}

	/**
	 * The number of nodes that are dedicated data nodes.
	 * <p>
	 * API name: {@code number_of_data_nodes}
	 */
	public int numberOfDataNodes() {
		return this.numberOfDataNodes;
	}

	/**
	 * API name: {@code number_of_in_flight_fetch}
	 */
	public int numberOfInFlightFetch() {
		return this.numberOfInFlightFetch;
	}

	/**
	 * The number of nodes within the cluster.
	 * <p>
	 * API name: {@code number_of_nodes}
	 */
	public int numberOfNodes() {
		return this.numberOfNodes;
	}

	/**
	 * The number of cluster-level changes that have not yet been executed.
	 * <p>
	 * API name: {@code number_of_pending_tasks}
	 */
	public int numberOfPendingTasks() {
		return this.numberOfPendingTasks;
	}

	/**
	 * The number of shards that are under relocation.
	 * <p>
	 * API name: {@code relocating_shards}
	 */
	public int relocatingShards() {
		return this.relocatingShards;
	}

	/**
	 * API name: {@code status}
	 */
	public Health status() {
		return this.status;
	}

	/**
	 * The time expressed in milliseconds since the earliest initiated task is
	 * waiting for being performed.
	 * <p>
	 * API name: {@code task_max_waiting_in_queue_millis}
	 */
	public String taskMaxWaitingInQueueMillis() {
		return this.taskMaxWaitingInQueueMillis;
	}

	/**
	 * If false the response returned within the period of time that is specified by
	 * the timeout parameter (30s by default)
	 * <p>
	 * API name: {@code timed_out}
	 */
	public boolean timedOut() {
		return this.timedOut;
	}

	/**
	 * The number of shards that are not allocated.
	 * <p>
	 * API name: {@code unassigned_shards}
	 */
	public int unassignedShards() {
		return this.unassignedShards;
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

		generator.writeKey("active_primary_shards");
		generator.write(this.activePrimaryShards);

		generator.writeKey("active_shards");
		generator.write(this.activeShards);

		generator.writeKey("active_shards_percent_as_number");
		generator.write(this.activeShardsPercentAsNumber);

		generator.writeKey("cluster_name");
		generator.write(this.clusterName);

		generator.writeKey("delayed_unassigned_shards");
		generator.write(this.delayedUnassignedShards);

		if (this.indices != null) {

			generator.writeKey("indices");
			generator.writeStartObject();
			for (Map.Entry<String, IndexHealthStats> item0 : this.indices.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

		generator.writeKey("initializing_shards");
		generator.write(this.initializingShards);

		generator.writeKey("number_of_data_nodes");
		generator.write(this.numberOfDataNodes);

		generator.writeKey("number_of_in_flight_fetch");
		generator.write(this.numberOfInFlightFetch);

		generator.writeKey("number_of_nodes");
		generator.write(this.numberOfNodes);

		generator.writeKey("number_of_pending_tasks");
		generator.write(this.numberOfPendingTasks);

		generator.writeKey("relocating_shards");
		generator.write(this.relocatingShards);

		generator.writeKey("status");
		this.status.serialize(generator, mapper);

		generator.writeKey("task_max_waiting_in_queue_millis");
		generator.write(this.taskMaxWaitingInQueueMillis);

		generator.writeKey("timed_out");
		generator.write(this.timedOut);

		generator.writeKey("unassigned_shards");
		generator.write(this.unassignedShards);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HealthResponse}.
	 */
	public static class Builder implements ObjectBuilder<HealthResponse> {
		private Integer activePrimaryShards;

		private Integer activeShards;

		private String activeShardsPercentAsNumber;

		private String clusterName;

		private Integer delayedUnassignedShards;

		@Nullable
		private Map<String, IndexHealthStats> indices;

		private Integer initializingShards;

		private Integer numberOfDataNodes;

		private Integer numberOfInFlightFetch;

		private Integer numberOfNodes;

		private Integer numberOfPendingTasks;

		private Integer relocatingShards;

		private Health status;

		private String taskMaxWaitingInQueueMillis;

		private Boolean timedOut;

		private Integer unassignedShards;

		/**
		 * The number of active primary shards.
		 * <p>
		 * API name: {@code active_primary_shards}
		 */
		public Builder activePrimaryShards(int value) {
			this.activePrimaryShards = value;
			return this;
		}

		/**
		 * The total number of active primary and replica shards.
		 * <p>
		 * API name: {@code active_shards}
		 */
		public Builder activeShards(int value) {
			this.activeShards = value;
			return this;
		}

		/**
		 * The ratio of active shards in the cluster expressed as a percentage.
		 * <p>
		 * API name: {@code active_shards_percent_as_number}
		 */
		public Builder activeShardsPercentAsNumber(String value) {
			this.activeShardsPercentAsNumber = value;
			return this;
		}

		/**
		 * The name of the cluster.
		 * <p>
		 * API name: {@code cluster_name}
		 */
		public Builder clusterName(String value) {
			this.clusterName = value;
			return this;
		}

		/**
		 * The number of shards whose allocation has been delayed by the timeout
		 * settings.
		 * <p>
		 * API name: {@code delayed_unassigned_shards}
		 */
		public Builder delayedUnassignedShards(int value) {
			this.delayedUnassignedShards = value;
			return this;
		}

		/**
		 * API name: {@code indices}
		 */
		public Builder indices(@Nullable Map<String, IndexHealthStats> value) {
			this.indices = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #indices(Map)}, creating the map if needed.
		 */
		public Builder putIndices(String key, IndexHealthStats value) {
			if (this.indices == null) {
				this.indices = new HashMap<>();
			}
			this.indices.put(key, value);
			return this;
		}

		/**
		 * Set {@link #indices(Map)} to a singleton map.
		 */
		public Builder indices(String key, Function<IndexHealthStats.Builder, ObjectBuilder<IndexHealthStats>> fn) {
			return this.indices(Collections.singletonMap(key, fn.apply(new IndexHealthStats.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #indices(Map)}, creating the map if needed.
		 */
		public Builder putIndices(String key, Function<IndexHealthStats.Builder, ObjectBuilder<IndexHealthStats>> fn) {
			return this.putIndices(key, fn.apply(new IndexHealthStats.Builder()).build());
		}

		/**
		 * The number of shards that are under initialization.
		 * <p>
		 * API name: {@code initializing_shards}
		 */
		public Builder initializingShards(int value) {
			this.initializingShards = value;
			return this;
		}

		/**
		 * The number of nodes that are dedicated data nodes.
		 * <p>
		 * API name: {@code number_of_data_nodes}
		 */
		public Builder numberOfDataNodes(int value) {
			this.numberOfDataNodes = value;
			return this;
		}

		/**
		 * API name: {@code number_of_in_flight_fetch}
		 */
		public Builder numberOfInFlightFetch(int value) {
			this.numberOfInFlightFetch = value;
			return this;
		}

		/**
		 * The number of nodes within the cluster.
		 * <p>
		 * API name: {@code number_of_nodes}
		 */
		public Builder numberOfNodes(int value) {
			this.numberOfNodes = value;
			return this;
		}

		/**
		 * The number of cluster-level changes that have not yet been executed.
		 * <p>
		 * API name: {@code number_of_pending_tasks}
		 */
		public Builder numberOfPendingTasks(int value) {
			this.numberOfPendingTasks = value;
			return this;
		}

		/**
		 * The number of shards that are under relocation.
		 * <p>
		 * API name: {@code relocating_shards}
		 */
		public Builder relocatingShards(int value) {
			this.relocatingShards = value;
			return this;
		}

		/**
		 * API name: {@code status}
		 */
		public Builder status(Health value) {
			this.status = value;
			return this;
		}

		/**
		 * The time expressed in milliseconds since the earliest initiated task is
		 * waiting for being performed.
		 * <p>
		 * API name: {@code task_max_waiting_in_queue_millis}
		 */
		public Builder taskMaxWaitingInQueueMillis(String value) {
			this.taskMaxWaitingInQueueMillis = value;
			return this;
		}

		/**
		 * If false the response returned within the period of time that is specified by
		 * the timeout parameter (30s by default)
		 * <p>
		 * API name: {@code timed_out}
		 */
		public Builder timedOut(boolean value) {
			this.timedOut = value;
			return this;
		}

		/**
		 * The number of shards that are not allocated.
		 * <p>
		 * API name: {@code unassigned_shards}
		 */
		public Builder unassignedShards(int value) {
			this.unassignedShards = value;
			return this;
		}

		/**
		 * Builds a {@link HealthResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HealthResponse build() {

			return new HealthResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link HealthResponse}
	 */
	public static final JsonpDeserializer<HealthResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			HealthResponse::setupHealthResponseDeserializer, Builder::build);

	protected static void setupHealthResponseDeserializer(DelegatingDeserializer<HealthResponse.Builder> op) {

		op.add(Builder::activePrimaryShards, JsonpDeserializer.integerDeserializer(), "active_primary_shards");
		op.add(Builder::activeShards, JsonpDeserializer.integerDeserializer(), "active_shards");
		op.add(Builder::activeShardsPercentAsNumber, JsonpDeserializer.stringDeserializer(),
				"active_shards_percent_as_number");
		op.add(Builder::clusterName, JsonpDeserializer.stringDeserializer(), "cluster_name");
		op.add(Builder::delayedUnassignedShards, JsonpDeserializer.integerDeserializer(), "delayed_unassigned_shards");
		op.add(Builder::indices, JsonpDeserializer.stringMapDeserializer(IndexHealthStats._DESERIALIZER), "indices");
		op.add(Builder::initializingShards, JsonpDeserializer.integerDeserializer(), "initializing_shards");
		op.add(Builder::numberOfDataNodes, JsonpDeserializer.integerDeserializer(), "number_of_data_nodes");
		op.add(Builder::numberOfInFlightFetch, JsonpDeserializer.integerDeserializer(), "number_of_in_flight_fetch");
		op.add(Builder::numberOfNodes, JsonpDeserializer.integerDeserializer(), "number_of_nodes");
		op.add(Builder::numberOfPendingTasks, JsonpDeserializer.integerDeserializer(), "number_of_pending_tasks");
		op.add(Builder::relocatingShards, JsonpDeserializer.integerDeserializer(), "relocating_shards");
		op.add(Builder::status, Health._DESERIALIZER, "status");
		op.add(Builder::taskMaxWaitingInQueueMillis, JsonpDeserializer.stringDeserializer(),
				"task_max_waiting_in_queue_millis");
		op.add(Builder::timedOut, JsonpDeserializer.booleanDeserializer(), "timed_out");
		op.add(Builder::unassignedShards, JsonpDeserializer.integerDeserializer(), "unassigned_shards");

	}

}
