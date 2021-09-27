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
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: cluster.health.ShardHealthStats
@JsonpDeserializable
public final class ShardHealthStats implements JsonpSerializable {
	private final Integer activeShards;

	private final Integer initializingShards;

	private final Boolean primaryActive;

	private final Integer relocatingShards;

	private final Health status;

	private final Integer unassignedShards;

	// ---------------------------------------------------------------------------------------------

	public ShardHealthStats(Builder builder) {

		this.activeShards = Objects.requireNonNull(builder.activeShards, "active_shards");
		this.initializingShards = Objects.requireNonNull(builder.initializingShards, "initializing_shards");
		this.primaryActive = Objects.requireNonNull(builder.primaryActive, "primary_active");
		this.relocatingShards = Objects.requireNonNull(builder.relocatingShards, "relocating_shards");
		this.status = Objects.requireNonNull(builder.status, "status");
		this.unassignedShards = Objects.requireNonNull(builder.unassignedShards, "unassigned_shards");

	}

	/**
	 * API name: {@code active_shards}
	 */
	public Integer activeShards() {
		return this.activeShards;
	}

	/**
	 * API name: {@code initializing_shards}
	 */
	public Integer initializingShards() {
		return this.initializingShards;
	}

	/**
	 * API name: {@code primary_active}
	 */
	public Boolean primaryActive() {
		return this.primaryActive;
	}

	/**
	 * API name: {@code relocating_shards}
	 */
	public Integer relocatingShards() {
		return this.relocatingShards;
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
	public Integer unassignedShards() {
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

		generator.writeKey("active_shards");
		generator.write(this.activeShards);

		generator.writeKey("initializing_shards");
		generator.write(this.initializingShards);

		generator.writeKey("primary_active");
		generator.write(this.primaryActive);

		generator.writeKey("relocating_shards");
		generator.write(this.relocatingShards);

		generator.writeKey("status");
		this.status.serialize(generator, mapper);

		generator.writeKey("unassigned_shards");
		generator.write(this.unassignedShards);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShardHealthStats}.
	 */
	public static class Builder implements ObjectBuilder<ShardHealthStats> {
		private Integer activeShards;

		private Integer initializingShards;

		private Boolean primaryActive;

		private Integer relocatingShards;

		private Health status;

		private Integer unassignedShards;

		/**
		 * API name: {@code active_shards}
		 */
		public Builder activeShards(Integer value) {
			this.activeShards = value;
			return this;
		}

		/**
		 * API name: {@code initializing_shards}
		 */
		public Builder initializingShards(Integer value) {
			this.initializingShards = value;
			return this;
		}

		/**
		 * API name: {@code primary_active}
		 */
		public Builder primaryActive(Boolean value) {
			this.primaryActive = value;
			return this;
		}

		/**
		 * API name: {@code relocating_shards}
		 */
		public Builder relocatingShards(Integer value) {
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
		 * API name: {@code unassigned_shards}
		 */
		public Builder unassignedShards(Integer value) {
			this.unassignedShards = value;
			return this;
		}

		/**
		 * Builds a {@link ShardHealthStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardHealthStats build() {

			return new ShardHealthStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ShardHealthStats}
	 */
	public static final JsonpDeserializer<ShardHealthStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ShardHealthStats::setupShardHealthStatsDeserializer, Builder::build);

	protected static void setupShardHealthStatsDeserializer(DelegatingDeserializer<ShardHealthStats.Builder> op) {

		op.add(Builder::activeShards, JsonpDeserializer.integerDeserializer(), "active_shards");
		op.add(Builder::initializingShards, JsonpDeserializer.integerDeserializer(), "initializing_shards");
		op.add(Builder::primaryActive, JsonpDeserializer.booleanDeserializer(), "primary_active");
		op.add(Builder::relocatingShards, JsonpDeserializer.integerDeserializer(), "relocating_shards");
		op.add(Builder::status, Health._DESERIALIZER, "status");
		op.add(Builder::unassignedShards, JsonpDeserializer.integerDeserializer(), "unassigned_shards");

	}

}
