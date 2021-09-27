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

import co.elastic.clients.elasticsearch._types.Health;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.health.IndexHealthStats
@JsonpDeserializable
public final class IndexHealthStats implements JsonpSerializable {
	private final int activePrimaryShards;

	private final int activeShards;

	private final int initializingShards;

	private final int numberOfReplicas;

	private final int numberOfShards;

	private final int relocatingShards;

	@Nullable
	private final Map<String, ShardHealthStats> shards;

	private final Health status;

	private final int unassignedShards;

	// ---------------------------------------------------------------------------------------------

	public IndexHealthStats(Builder builder) {

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
	public int activePrimaryShards() {
		return this.activePrimaryShards;
	}

	/**
	 * API name: {@code active_shards}
	 */
	public int activeShards() {
		return this.activeShards;
	}

	/**
	 * API name: {@code initializing_shards}
	 */
	public int initializingShards() {
		return this.initializingShards;
	}

	/**
	 * API name: {@code number_of_replicas}
	 */
	public int numberOfReplicas() {
		return this.numberOfReplicas;
	}

	/**
	 * API name: {@code number_of_shards}
	 */
	public int numberOfShards() {
		return this.numberOfShards;
	}

	/**
	 * API name: {@code relocating_shards}
	 */
	public int relocatingShards() {
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
	public Health status() {
		return this.status;
	}

	/**
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

		generator.writeKey("initializing_shards");
		generator.write(this.initializingShards);

		generator.writeKey("number_of_replicas");
		generator.write(this.numberOfReplicas);

		generator.writeKey("number_of_shards");
		generator.write(this.numberOfShards);

		generator.writeKey("relocating_shards");
		generator.write(this.relocatingShards);

		if (this.shards != null) {

			generator.writeKey("shards");
			generator.writeStartObject();
			for (Map.Entry<String, ShardHealthStats> item0 : this.shards.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

		generator.writeKey("status");
		this.status.serialize(generator, mapper);

		generator.writeKey("unassigned_shards");
		generator.write(this.unassignedShards);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexHealthStats}.
	 */
	public static class Builder implements ObjectBuilder<IndexHealthStats> {
		private Integer activePrimaryShards;

		private Integer activeShards;

		private Integer initializingShards;

		private Integer numberOfReplicas;

		private Integer numberOfShards;

		private Integer relocatingShards;

		@Nullable
		private Map<String, ShardHealthStats> shards;

		private Health status;

		private Integer unassignedShards;

		/**
		 * API name: {@code active_primary_shards}
		 */
		public Builder activePrimaryShards(int value) {
			this.activePrimaryShards = value;
			return this;
		}

		/**
		 * API name: {@code active_shards}
		 */
		public Builder activeShards(int value) {
			this.activeShards = value;
			return this;
		}

		/**
		 * API name: {@code initializing_shards}
		 */
		public Builder initializingShards(int value) {
			this.initializingShards = value;
			return this;
		}

		/**
		 * API name: {@code number_of_replicas}
		 */
		public Builder numberOfReplicas(int value) {
			this.numberOfReplicas = value;
			return this;
		}

		/**
		 * API name: {@code number_of_shards}
		 */
		public Builder numberOfShards(int value) {
			this.numberOfShards = value;
			return this;
		}

		/**
		 * API name: {@code relocating_shards}
		 */
		public Builder relocatingShards(int value) {
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
		public Builder status(Health value) {
			this.status = value;
			return this;
		}

		/**
		 * API name: {@code unassigned_shards}
		 */
		public Builder unassignedShards(int value) {
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
	 * Json deserializer for {@link IndexHealthStats}
	 */
	public static final JsonpDeserializer<IndexHealthStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			IndexHealthStats::setupIndexHealthStatsDeserializer, Builder::build);

	protected static void setupIndexHealthStatsDeserializer(DelegatingDeserializer<IndexHealthStats.Builder> op) {

		op.add(Builder::activePrimaryShards, JsonpDeserializer.integerDeserializer(), "active_primary_shards");
		op.add(Builder::activeShards, JsonpDeserializer.integerDeserializer(), "active_shards");
		op.add(Builder::initializingShards, JsonpDeserializer.integerDeserializer(), "initializing_shards");
		op.add(Builder::numberOfReplicas, JsonpDeserializer.integerDeserializer(), "number_of_replicas");
		op.add(Builder::numberOfShards, JsonpDeserializer.integerDeserializer(), "number_of_shards");
		op.add(Builder::relocatingShards, JsonpDeserializer.integerDeserializer(), "relocating_shards");
		op.add(Builder::shards, JsonpDeserializer.stringMapDeserializer(ShardHealthStats._DESERIALIZER), "shards");
		op.add(Builder::status, Health._DESERIALIZER, "status");
		op.add(Builder::unassignedShards, JsonpDeserializer.integerDeserializer(), "unassigned_shards");

	}

}
