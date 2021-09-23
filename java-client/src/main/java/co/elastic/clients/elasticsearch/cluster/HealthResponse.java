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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.health.Response
public final class HealthResponse implements JsonpSerializable {
	private final Number activePrimaryShards;

	private final Number activeShards;

	private final JsonValue activeShardsPercentAsNumber;

	private final String clusterName;

	private final Number delayedUnassignedShards;

	@Nullable
	private final Map<String, IndexHealthStats> indices;

	private final Number initializingShards;

	private final Number numberOfDataNodes;

	private final Number numberOfInFlightFetch;

	private final Number numberOfNodes;

	private final Number numberOfPendingTasks;

	private final Number relocatingShards;

	private final Health status;

	private final JsonValue taskMaxWaitingInQueueMillis;

	private final Boolean timedOut;

	private final Number unassignedShards;

	// ---------------------------------------------------------------------------------------------

	public HealthResponse(Builder builder) {

		this.activePrimaryShards = Objects.requireNonNull(builder.activePrimaryShards, "active_primary_shards");
		this.activeShards = Objects.requireNonNull(builder.activeShards, "active_shards");
		this.activeShardsPercentAsNumber = Objects.requireNonNull(builder.activeShardsPercentAsNumber,
				"active_shards_percent_as_number");
		this.clusterName = Objects.requireNonNull(builder.clusterName, "cluster_name");
		this.delayedUnassignedShards = Objects.requireNonNull(builder.delayedUnassignedShards,
				"delayed_unassigned_shards");
		this.indices = builder.indices;
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

	/**
	 * The number of active primary shards.
	 * <p>
	 * API name: {@code active_primary_shards}
	 */
	public Number activePrimaryShards() {
		return this.activePrimaryShards;
	}

	/**
	 * The total number of active primary and replica shards.
	 * <p>
	 * API name: {@code active_shards}
	 */
	public Number activeShards() {
		return this.activeShards;
	}

	/**
	 * The ratio of active shards in the cluster expressed as a percentage.
	 * <p>
	 * API name: {@code active_shards_percent_as_number}
	 */
	public JsonValue activeShardsPercentAsNumber() {
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
	public Number delayedUnassignedShards() {
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
	public Number initializingShards() {
		return this.initializingShards;
	}

	/**
	 * The number of nodes that are dedicated data nodes.
	 * <p>
	 * API name: {@code number_of_data_nodes}
	 */
	public Number numberOfDataNodes() {
		return this.numberOfDataNodes;
	}

	/**
	 * API name: {@code number_of_in_flight_fetch}
	 */
	public Number numberOfInFlightFetch() {
		return this.numberOfInFlightFetch;
	}

	/**
	 * The number of nodes within the cluster.
	 * <p>
	 * API name: {@code number_of_nodes}
	 */
	public Number numberOfNodes() {
		return this.numberOfNodes;
	}

	/**
	 * The number of cluster-level changes that have not yet been executed.
	 * <p>
	 * API name: {@code number_of_pending_tasks}
	 */
	public Number numberOfPendingTasks() {
		return this.numberOfPendingTasks;
	}

	/**
	 * The number of shards that are under relocation.
	 * <p>
	 * API name: {@code relocating_shards}
	 */
	public Number relocatingShards() {
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
	public JsonValue taskMaxWaitingInQueueMillis() {
		return this.taskMaxWaitingInQueueMillis;
	}

	/**
	 * If false the response returned within the period of time that is specified by
	 * the timeout parameter (30s by default)
	 * <p>
	 * API name: {@code timed_out}
	 */
	public Boolean timedOut() {
		return this.timedOut;
	}

	/**
	 * The number of shards that are not allocated.
	 * <p>
	 * API name: {@code unassigned_shards}
	 */
	public Number unassignedShards() {
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
		generator.write(this.activePrimaryShards.doubleValue());

		generator.writeKey("active_shards");
		generator.write(this.activeShards.doubleValue());

		generator.writeKey("active_shards_percent_as_number");
		generator.write(this.activeShardsPercentAsNumber);

		generator.writeKey("cluster_name");
		generator.write(this.clusterName);

		generator.writeKey("delayed_unassigned_shards");
		generator.write(this.delayedUnassignedShards.doubleValue());

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
		generator.write(this.initializingShards.doubleValue());

		generator.writeKey("number_of_data_nodes");
		generator.write(this.numberOfDataNodes.doubleValue());

		generator.writeKey("number_of_in_flight_fetch");
		generator.write(this.numberOfInFlightFetch.doubleValue());

		generator.writeKey("number_of_nodes");
		generator.write(this.numberOfNodes.doubleValue());

		generator.writeKey("number_of_pending_tasks");
		generator.write(this.numberOfPendingTasks.doubleValue());

		generator.writeKey("relocating_shards");
		generator.write(this.relocatingShards.doubleValue());

		generator.writeKey("status");
		this.status.serialize(generator, mapper);

		generator.writeKey("task_max_waiting_in_queue_millis");
		generator.write(this.taskMaxWaitingInQueueMillis);

		generator.writeKey("timed_out");
		generator.write(this.timedOut);

		generator.writeKey("unassigned_shards");
		generator.write(this.unassignedShards.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HealthResponse}.
	 */
	public static class Builder implements ObjectBuilder<HealthResponse> {
		private Number activePrimaryShards;

		private Number activeShards;

		private JsonValue activeShardsPercentAsNumber;

		private String clusterName;

		private Number delayedUnassignedShards;

		@Nullable
		private Map<String, IndexHealthStats> indices;

		private Number initializingShards;

		private Number numberOfDataNodes;

		private Number numberOfInFlightFetch;

		private Number numberOfNodes;

		private Number numberOfPendingTasks;

		private Number relocatingShards;

		private Health status;

		private JsonValue taskMaxWaitingInQueueMillis;

		private Boolean timedOut;

		private Number unassignedShards;

		/**
		 * The number of active primary shards.
		 * <p>
		 * API name: {@code active_primary_shards}
		 */
		public Builder activePrimaryShards(Number value) {
			this.activePrimaryShards = value;
			return this;
		}

		/**
		 * The total number of active primary and replica shards.
		 * <p>
		 * API name: {@code active_shards}
		 */
		public Builder activeShards(Number value) {
			this.activeShards = value;
			return this;
		}

		/**
		 * The ratio of active shards in the cluster expressed as a percentage.
		 * <p>
		 * API name: {@code active_shards_percent_as_number}
		 */
		public Builder activeShardsPercentAsNumber(JsonValue value) {
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
		public Builder delayedUnassignedShards(Number value) {
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
		public Builder initializingShards(Number value) {
			this.initializingShards = value;
			return this;
		}

		/**
		 * The number of nodes that are dedicated data nodes.
		 * <p>
		 * API name: {@code number_of_data_nodes}
		 */
		public Builder numberOfDataNodes(Number value) {
			this.numberOfDataNodes = value;
			return this;
		}

		/**
		 * API name: {@code number_of_in_flight_fetch}
		 */
		public Builder numberOfInFlightFetch(Number value) {
			this.numberOfInFlightFetch = value;
			return this;
		}

		/**
		 * The number of nodes within the cluster.
		 * <p>
		 * API name: {@code number_of_nodes}
		 */
		public Builder numberOfNodes(Number value) {
			this.numberOfNodes = value;
			return this;
		}

		/**
		 * The number of cluster-level changes that have not yet been executed.
		 * <p>
		 * API name: {@code number_of_pending_tasks}
		 */
		public Builder numberOfPendingTasks(Number value) {
			this.numberOfPendingTasks = value;
			return this;
		}

		/**
		 * The number of shards that are under relocation.
		 * <p>
		 * API name: {@code relocating_shards}
		 */
		public Builder relocatingShards(Number value) {
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
		public Builder taskMaxWaitingInQueueMillis(JsonValue value) {
			this.taskMaxWaitingInQueueMillis = value;
			return this;
		}

		/**
		 * If false the response returned within the period of time that is specified by
		 * the timeout parameter (30s by default)
		 * <p>
		 * API name: {@code timed_out}
		 */
		public Builder timedOut(Boolean value) {
			this.timedOut = value;
			return this;
		}

		/**
		 * The number of shards that are not allocated.
		 * <p>
		 * API name: {@code unassigned_shards}
		 */
		public Builder unassignedShards(Number value) {
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
	public static final JsonpDeserializer<HealthResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, HealthResponse::setupHealthResponseDeserializer);

	protected static void setupHealthResponseDeserializer(DelegatingDeserializer<HealthResponse.Builder> op) {

		op.add(Builder::activePrimaryShards, JsonpDeserializer.numberDeserializer(), "active_primary_shards");
		op.add(Builder::activeShards, JsonpDeserializer.numberDeserializer(), "active_shards");
		op.add(Builder::activeShardsPercentAsNumber, JsonpDeserializer.jsonValueDeserializer(),
				"active_shards_percent_as_number");
		op.add(Builder::clusterName, JsonpDeserializer.stringDeserializer(), "cluster_name");
		op.add(Builder::delayedUnassignedShards, JsonpDeserializer.numberDeserializer(), "delayed_unassigned_shards");
		op.add(Builder::indices, JsonpDeserializer.stringMapDeserializer(IndexHealthStats.DESERIALIZER), "indices");
		op.add(Builder::initializingShards, JsonpDeserializer.numberDeserializer(), "initializing_shards");
		op.add(Builder::numberOfDataNodes, JsonpDeserializer.numberDeserializer(), "number_of_data_nodes");
		op.add(Builder::numberOfInFlightFetch, JsonpDeserializer.numberDeserializer(), "number_of_in_flight_fetch");
		op.add(Builder::numberOfNodes, JsonpDeserializer.numberDeserializer(), "number_of_nodes");
		op.add(Builder::numberOfPendingTasks, JsonpDeserializer.numberDeserializer(), "number_of_pending_tasks");
		op.add(Builder::relocatingShards, JsonpDeserializer.numberDeserializer(), "relocating_shards");
		op.add(Builder::status, Health.DESERIALIZER, "status");
		op.add(Builder::taskMaxWaitingInQueueMillis, JsonpDeserializer.jsonValueDeserializer(),
				"task_max_waiting_in_queue_millis");
		op.add(Builder::timedOut, JsonpDeserializer.booleanDeserializer(), "timed_out");
		op.add(Builder::unassignedShards, JsonpDeserializer.numberDeserializer(), "unassigned_shards");

	}

}
