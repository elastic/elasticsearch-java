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

package co.elastic.clients.elasticsearch.shutdown.get_node;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: shutdown.get_node.NodeShutdownStatus
@JsonpDeserializable
public final class NodeShutdownStatus implements JsonpSerializable {
	private final String nodeId;

	private final ShutdownType type;

	private final String reason;

	private final String shutdownStartedmillis;

	private final ShutdownStatus status;

	private final ShardMigrationStatus shardMigration;

	private final PersistentTaskStatus persistentTasks;

	private final PluginsStatus plugins;

	// ---------------------------------------------------------------------------------------------

	public NodeShutdownStatus(Builder builder) {

		this.nodeId = Objects.requireNonNull(builder.nodeId, "node_id");
		this.type = Objects.requireNonNull(builder.type, "type");
		this.reason = Objects.requireNonNull(builder.reason, "reason");
		this.shutdownStartedmillis = Objects.requireNonNull(builder.shutdownStartedmillis, "shutdown_startedmillis");
		this.status = Objects.requireNonNull(builder.status, "status");
		this.shardMigration = Objects.requireNonNull(builder.shardMigration, "shard_migration");
		this.persistentTasks = Objects.requireNonNull(builder.persistentTasks, "persistent_tasks");
		this.plugins = Objects.requireNonNull(builder.plugins, "plugins");

	}

	public NodeShutdownStatus(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code node_id}
	 */
	public String nodeId() {
		return this.nodeId;
	}

	/**
	 * API name: {@code type}
	 */
	public ShutdownType type() {
		return this.type;
	}

	/**
	 * API name: {@code reason}
	 */
	public String reason() {
		return this.reason;
	}

	/**
	 * API name: {@code shutdown_startedmillis}
	 */
	public String shutdownStartedmillis() {
		return this.shutdownStartedmillis;
	}

	/**
	 * API name: {@code status}
	 */
	public ShutdownStatus status() {
		return this.status;
	}

	/**
	 * API name: {@code shard_migration}
	 */
	public ShardMigrationStatus shardMigration() {
		return this.shardMigration;
	}

	/**
	 * API name: {@code persistent_tasks}
	 */
	public PersistentTaskStatus persistentTasks() {
		return this.persistentTasks;
	}

	/**
	 * API name: {@code plugins}
	 */
	public PluginsStatus plugins() {
		return this.plugins;
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

		generator.writeKey("node_id");
		generator.write(this.nodeId);

		generator.writeKey("type");
		this.type.serialize(generator, mapper);

		generator.writeKey("reason");
		generator.write(this.reason);

		generator.writeKey("shutdown_startedmillis");
		generator.write(this.shutdownStartedmillis);

		generator.writeKey("status");
		this.status.serialize(generator, mapper);

		generator.writeKey("shard_migration");
		this.shardMigration.serialize(generator, mapper);

		generator.writeKey("persistent_tasks");
		this.persistentTasks.serialize(generator, mapper);

		generator.writeKey("plugins");
		this.plugins.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeShutdownStatus}.
	 */
	public static class Builder implements ObjectBuilder<NodeShutdownStatus> {
		private String nodeId;

		private ShutdownType type;

		private String reason;

		private String shutdownStartedmillis;

		private ShutdownStatus status;

		private ShardMigrationStatus shardMigration;

		private PersistentTaskStatus persistentTasks;

		private PluginsStatus plugins;

		/**
		 * API name: {@code node_id}
		 */
		public Builder nodeId(String value) {
			this.nodeId = value;
			return this;
		}

		/**
		 * API name: {@code type}
		 */
		public Builder type(ShutdownType value) {
			this.type = value;
			return this;
		}

		/**
		 * API name: {@code reason}
		 */
		public Builder reason(String value) {
			this.reason = value;
			return this;
		}

		/**
		 * API name: {@code shutdown_startedmillis}
		 */
		public Builder shutdownStartedmillis(String value) {
			this.shutdownStartedmillis = value;
			return this;
		}

		/**
		 * API name: {@code status}
		 */
		public Builder status(ShutdownStatus value) {
			this.status = value;
			return this;
		}

		/**
		 * API name: {@code shard_migration}
		 */
		public Builder shardMigration(ShardMigrationStatus value) {
			this.shardMigration = value;
			return this;
		}

		/**
		 * API name: {@code shard_migration}
		 */
		public Builder shardMigration(Function<ShardMigrationStatus.Builder, ObjectBuilder<ShardMigrationStatus>> fn) {
			return this.shardMigration(fn.apply(new ShardMigrationStatus.Builder()).build());
		}

		/**
		 * API name: {@code persistent_tasks}
		 */
		public Builder persistentTasks(PersistentTaskStatus value) {
			this.persistentTasks = value;
			return this;
		}

		/**
		 * API name: {@code persistent_tasks}
		 */
		public Builder persistentTasks(Function<PersistentTaskStatus.Builder, ObjectBuilder<PersistentTaskStatus>> fn) {
			return this.persistentTasks(fn.apply(new PersistentTaskStatus.Builder()).build());
		}

		/**
		 * API name: {@code plugins}
		 */
		public Builder plugins(PluginsStatus value) {
			this.plugins = value;
			return this;
		}

		/**
		 * API name: {@code plugins}
		 */
		public Builder plugins(Function<PluginsStatus.Builder, ObjectBuilder<PluginsStatus>> fn) {
			return this.plugins(fn.apply(new PluginsStatus.Builder()).build());
		}

		/**
		 * Builds a {@link NodeShutdownStatus}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeShutdownStatus build() {

			return new NodeShutdownStatus(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeShutdownStatus}
	 */
	public static final JsonpDeserializer<NodeShutdownStatus> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, NodeShutdownStatus::setupNodeShutdownStatusDeserializer, Builder::build);

	protected static void setupNodeShutdownStatusDeserializer(DelegatingDeserializer<NodeShutdownStatus.Builder> op) {

		op.add(Builder::nodeId, JsonpDeserializer.stringDeserializer(), "node_id");
		op.add(Builder::type, ShutdownType._DESERIALIZER, "type");
		op.add(Builder::reason, JsonpDeserializer.stringDeserializer(), "reason");
		op.add(Builder::shutdownStartedmillis, JsonpDeserializer.stringDeserializer(), "shutdown_startedmillis");
		op.add(Builder::status, ShutdownStatus._DESERIALIZER, "status");
		op.add(Builder::shardMigration, ShardMigrationStatus._DESERIALIZER, "shard_migration");
		op.add(Builder::persistentTasks, PersistentTaskStatus._DESERIALIZER, "persistent_tasks");
		op.add(Builder::plugins, PluginsStatus._DESERIALIZER, "plugins");

	}

}
