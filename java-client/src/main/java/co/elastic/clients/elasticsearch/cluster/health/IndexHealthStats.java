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

package co.elastic.clients.elasticsearch.cluster.health;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.health.IndexHealthStats
public final class IndexHealthStats implements ToJsonp {
	private final Number activePrimaryShards;

	private final Number activeShards;

	private final Number initializingShards;

	private final Number numberOfReplicas;

	private final Number numberOfShards;

	private final Number relocatingShards;

	@Nullable
	private final Map<String, ShardHealthStats> shards;

	private final JsonValue status;

	private final Number unassignedShards;

	// ---------------------------------------------------------------------------------------------

	protected IndexHealthStats(Builder builder) {

		this.activePrimaryShards = Objects.requireNonNull(builder.activePrimaryShards, "active_primary_shards");
		this.activeShards = Objects.requireNonNull(builder.activeShards, "active_shards");
		this.initializingShards = Objects.requireNonNull(builder.initializingShards, "initializing_shards");
		this.numberOfReplicas = Objects.requireNonNull(builder.numberOfReplicas, "number_of_replicas");
		this.numberOfShards = Objects.requireNonNull(builder.numberOfShards, "number_of_shards");
		this.relocatingShards = Objects.requireNonNull(builder.relocatingShards, "relocating_shards");
		this.shards = builder.shards;
		this.status = Objects.requireNonNull(builder.status, "status");
		this.unassignedShards = Objects.requireNonNull(builder.unassignedShards, "unassigned_shards");

	}

	/**
	 * API name: {@code active_primary_shards}
	 */
	public Number activePrimaryShards() {
		return this.activePrimaryShards;
	}

	/**
	 * API name: {@code active_shards}
	 */
	public Number activeShards() {
		return this.activeShards;
	}

	/**
	 * API name: {@code initializing_shards}
	 */
	public Number initializingShards() {
		return this.initializingShards;
	}

	/**
	 * API name: {@code number_of_replicas}
	 */
	public Number numberOfReplicas() {
		return this.numberOfReplicas;
	}

	/**
	 * API name: {@code number_of_shards}
	 */
	public Number numberOfShards() {
		return this.numberOfShards;
	}

	/**
	 * API name: {@code relocating_shards}
	 */
	public Number relocatingShards() {
		return this.relocatingShards;
	}

	/**
	 * API name: {@code shards}
	 */
	@Nullable
	public Map<String, ShardHealthStats> shards() {
		return this.shards;
	}

	/**
	 * API name: {@code status}
	 */
	public JsonValue status() {
		return this.status;
	}

	/**
	 * API name: {@code unassigned_shards}
	 */
	public Number unassignedShards() {
		return this.unassignedShards;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("active_primary_shards");
		generator.write(this.activePrimaryShards.doubleValue());

		generator.writeKey("active_shards");
		generator.write(this.activeShards.doubleValue());

		generator.writeKey("initializing_shards");
		generator.write(this.initializingShards.doubleValue());

		generator.writeKey("number_of_replicas");
		generator.write(this.numberOfReplicas.doubleValue());

		generator.writeKey("number_of_shards");
		generator.write(this.numberOfShards.doubleValue());

		generator.writeKey("relocating_shards");
		generator.write(this.relocatingShards.doubleValue());

		if (this.shards != null) {

			generator.writeKey("shards");
			generator.writeStartObject();
			for (Map.Entry<String, ShardHealthStats> item0 : this.shards.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}

		generator.writeKey("status");
		generator.write(this.status);

		generator.writeKey("unassigned_shards");
		generator.write(this.unassignedShards.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexHealthStats}.
	 */
	public static class Builder implements ObjectBuilder<IndexHealthStats> {
		private Number activePrimaryShards;

		private Number activeShards;

		private Number initializingShards;

		private Number numberOfReplicas;

		private Number numberOfShards;

		private Number relocatingShards;

		@Nullable
		private Map<String, ShardHealthStats> shards;

		private JsonValue status;

		private Number unassignedShards;

		/**
		 * API name: {@code active_primary_shards}
		 */
		public Builder activePrimaryShards(Number value) {
			this.activePrimaryShards = value;
			return this;
		}

		/**
		 * API name: {@code active_shards}
		 */
		public Builder activeShards(Number value) {
			this.activeShards = value;
			return this;
		}

		/**
		 * API name: {@code initializing_shards}
		 */
		public Builder initializingShards(Number value) {
			this.initializingShards = value;
			return this;
		}

		/**
		 * API name: {@code number_of_replicas}
		 */
		public Builder numberOfReplicas(Number value) {
			this.numberOfReplicas = value;
			return this;
		}

		/**
		 * API name: {@code number_of_shards}
		 */
		public Builder numberOfShards(Number value) {
			this.numberOfShards = value;
			return this;
		}

		/**
		 * API name: {@code relocating_shards}
		 */
		public Builder relocatingShards(Number value) {
			this.relocatingShards = value;
			return this;
		}

		/**
		 * API name: {@code shards}
		 */
		public Builder shards(@Nullable Map<String, ShardHealthStats> value) {
			this.shards = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #shards(Map)}, creating the map if needed.
		 */
		public Builder putShards(String key, ShardHealthStats value) {
			if (this.shards == null) {
				this.shards = new HashMap<>();
			}
			this.shards.put(key, value);
			return this;
		}

		/**
		 * Set {@link #shards(Map)} to a singleton map.
		 */
		public Builder shards(String key, Function<ShardHealthStats.Builder, ObjectBuilder<ShardHealthStats>> fn) {
			return this.shards(Collections.singletonMap(key, fn.apply(new ShardHealthStats.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #shards(Map)}, creating the map if needed.
		 */
		public Builder putShards(String key, Function<ShardHealthStats.Builder, ObjectBuilder<ShardHealthStats>> fn) {
			return this.putShards(key, fn.apply(new ShardHealthStats.Builder()).build());
		}

		/**
		 * API name: {@code status}
		 */
		public Builder status(JsonValue value) {
			this.status = value;
			return this;
		}

		/**
		 * API name: {@code unassigned_shards}
		 */
		public Builder unassignedShards(Number value) {
			this.unassignedShards = value;
			return this;
		}

		/**
		 * Builds a {@link IndexHealthStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexHealthStats build() {

			return new IndexHealthStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for IndexHealthStats
	 */
	public static final JsonpDeserializer<IndexHealthStats> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, IndexHealthStats::setupIndexHealthStatsDeserializer);

	protected static void setupIndexHealthStatsDeserializer(DelegatingDeserializer<IndexHealthStats.Builder> op) {

		op.add(Builder::activePrimaryShards, JsonpDeserializer.numberDeserializer(), "active_primary_shards");
		op.add(Builder::activeShards, JsonpDeserializer.numberDeserializer(), "active_shards");
		op.add(Builder::initializingShards, JsonpDeserializer.numberDeserializer(), "initializing_shards");
		op.add(Builder::numberOfReplicas, JsonpDeserializer.numberDeserializer(), "number_of_replicas");
		op.add(Builder::numberOfShards, JsonpDeserializer.numberDeserializer(), "number_of_shards");
		op.add(Builder::relocatingShards, JsonpDeserializer.numberDeserializer(), "relocating_shards");
		op.add(Builder::shards, JsonpDeserializer.stringMapDeserializer(ShardHealthStats.DESERIALIZER), "shards");
		op.add(Builder::status, JsonpDeserializer.jsonValueDeserializer(), "status");
		op.add(Builder::unassignedShards, JsonpDeserializer.numberDeserializer(), "unassigned_shards");

	}

}
