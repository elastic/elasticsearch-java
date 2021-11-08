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
import co.elastic.clients.util.MapBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.health.IndexHealthStats
@JsonpDeserializable
public class IndexHealthStats implements JsonpSerializable {
	private final int activePrimaryShards;

	private final int activeShards;

	private final int initializingShards;

	private final int numberOfReplicas;

	private final int numberOfShards;

	private final int relocatingShards;

	private final Map<String, ShardHealthStats> shards;

	private final Health status;

	private final int unassignedShards;

	// ---------------------------------------------------------------------------------------------

	private IndexHealthStats(Builder builder) {

		this.activePrimaryShards = ModelTypeHelper.requireNonNull(builder.activePrimaryShards, this,
				"activePrimaryShards");
		this.activeShards = ModelTypeHelper.requireNonNull(builder.activeShards, this, "activeShards");
		this.initializingShards = ModelTypeHelper.requireNonNull(builder.initializingShards, this,
				"initializingShards");
		this.numberOfReplicas = ModelTypeHelper.requireNonNull(builder.numberOfReplicas, this, "numberOfReplicas");
		this.numberOfShards = ModelTypeHelper.requireNonNull(builder.numberOfShards, this, "numberOfShards");
		this.relocatingShards = ModelTypeHelper.requireNonNull(builder.relocatingShards, this, "relocatingShards");
		this.shards = ModelTypeHelper.unmodifiable(builder.shards);
		this.status = ModelTypeHelper.requireNonNull(builder.status, this, "status");
		this.unassignedShards = ModelTypeHelper.requireNonNull(builder.unassignedShards, this, "unassignedShards");

	}

	public static IndexHealthStats of(Function<Builder, ObjectBuilder<IndexHealthStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code active_primary_shards}
	 */
	public final int activePrimaryShards() {
		return this.activePrimaryShards;
	}

	/**
	 * Required - API name: {@code active_shards}
	 */
	public final int activeShards() {
		return this.activeShards;
	}

	/**
	 * Required - API name: {@code initializing_shards}
	 */
	public final int initializingShards() {
		return this.initializingShards;
	}

	/**
	 * Required - API name: {@code number_of_replicas}
	 */
	public final int numberOfReplicas() {
		return this.numberOfReplicas;
	}

	/**
	 * Required - API name: {@code number_of_shards}
	 */
	public final int numberOfShards() {
		return this.numberOfShards;
	}

	/**
	 * Required - API name: {@code relocating_shards}
	 */
	public final int relocatingShards() {
		return this.relocatingShards;
	}

	/**
	 * API name: {@code shards}
	 */
	public final Map<String, ShardHealthStats> shards() {
		return this.shards;
	}

	/**
	 * Required - API name: {@code status}
	 */
	public final Health status() {
		return this.status;
	}

	/**
	 * Required - API name: {@code unassigned_shards}
	 */
	public final int unassignedShards() {
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

		if (ModelTypeHelper.isDefined(this.shards)) {
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
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<IndexHealthStats> {
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
		 * Required - API name: {@code active_primary_shards}
		 */
		public final Builder activePrimaryShards(int value) {
			this.activePrimaryShards = value;
			return this;
		}

		/**
		 * Required - API name: {@code active_shards}
		 */
		public final Builder activeShards(int value) {
			this.activeShards = value;
			return this;
		}

		/**
		 * Required - API name: {@code initializing_shards}
		 */
		public final Builder initializingShards(int value) {
			this.initializingShards = value;
			return this;
		}

		/**
		 * Required - API name: {@code number_of_replicas}
		 */
		public final Builder numberOfReplicas(int value) {
			this.numberOfReplicas = value;
			return this;
		}

		/**
		 * Required - API name: {@code number_of_shards}
		 */
		public final Builder numberOfShards(int value) {
			this.numberOfShards = value;
			return this;
		}

		/**
		 * Required - API name: {@code relocating_shards}
		 */
		public final Builder relocatingShards(int value) {
			this.relocatingShards = value;
			return this;
		}

		/**
		 * API name: {@code shards}
		 */
		public final Builder shards(@Nullable Map<String, ShardHealthStats> value) {
			this.shards = value;
			return this;
		}

		/**
		 * Set {@link #shards(Map)} to a singleton map.
		 */
		public Builder shards(String key, Function<ShardHealthStats.Builder, ObjectBuilder<ShardHealthStats>> fn) {
			return this.shards(Collections.singletonMap(key, fn.apply(new ShardHealthStats.Builder()).build()));
		}

		public final Builder shards(
				Function<MapBuilder<String, ShardHealthStats, ShardHealthStats.Builder>, ObjectBuilder<Map<String, ShardHealthStats>>> fn) {
			return shards(fn.apply(new MapBuilder<>(ShardHealthStats.Builder::new)).build());
		}

		/**
		 * Required - API name: {@code status}
		 */
		public final Builder status(Health value) {
			this.status = value;
			return this;
		}

		/**
		 * Required - API name: {@code unassigned_shards}
		 */
		public final Builder unassignedShards(int value) {
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
			_checkSingleUse();

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
