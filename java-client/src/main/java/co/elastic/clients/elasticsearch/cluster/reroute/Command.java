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

package co.elastic.clients.elasticsearch.cluster.reroute;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: cluster.reroute.Command
@JsonpDeserializable
public class Command implements JsonpSerializable {
	@Nullable
	private final CommandCancelAction cancel;

	@Nullable
	private final CommandMoveAction move;

	@Nullable
	private final CommandAllocateReplicaAction allocateReplica;

	@Nullable
	private final CommandAllocatePrimaryAction allocateStalePrimary;

	@Nullable
	private final CommandAllocatePrimaryAction allocateEmptyPrimary;

	// ---------------------------------------------------------------------------------------------

	private Command(Builder builder) {

		this.cancel = builder.cancel;
		this.move = builder.move;
		this.allocateReplica = builder.allocateReplica;
		this.allocateStalePrimary = builder.allocateStalePrimary;
		this.allocateEmptyPrimary = builder.allocateEmptyPrimary;

	}

	public static Command of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Cancel allocation of a shard (or recovery). Accepts index and shard for index
	 * name and shard number, and node for the node to cancel the shard allocation
	 * on. This can be used to force resynchronization of existing replicas from the
	 * primary shard by cancelling them and allowing them to be reinitialized
	 * through the standard recovery process. By default only replica shard
	 * allocations can be cancelled. If it is necessary to cancel the allocation of
	 * a primary shard then the allow_primary flag must also be included in the
	 * request.
	 * <p>
	 * API name: {@code cancel}
	 */
	@Nullable
	public final CommandCancelAction cancel() {
		return this.cancel;
	}

	/**
	 * Move a started shard from one node to another node. Accepts index and shard
	 * for index name and shard number, from_node for the node to move the shard
	 * from, and to_node for the node to move the shard to.
	 * <p>
	 * API name: {@code move}
	 */
	@Nullable
	public final CommandMoveAction move() {
		return this.move;
	}

	/**
	 * Allocate an unassigned replica shard to a node. Accepts index and shard for
	 * index name and shard number, and node to allocate the shard to. Takes
	 * allocation deciders into account.
	 * <p>
	 * API name: {@code allocate_replica}
	 */
	@Nullable
	public final CommandAllocateReplicaAction allocateReplica() {
		return this.allocateReplica;
	}

	/**
	 * Allocate a primary shard to a node that holds a stale copy. Accepts the index
	 * and shard for index name and shard number, and node to allocate the shard to.
	 * Using this command may lead to data loss for the provided shard id. If a node
	 * which has the good copy of the data rejoins the cluster later on, that data
	 * will be deleted or overwritten with the data of the stale copy that was
	 * forcefully allocated with this command. To ensure that these implications are
	 * well-understood, this command requires the flag accept_data_loss to be
	 * explicitly set to true.
	 * <p>
	 * API name: {@code allocate_stale_primary}
	 */
	@Nullable
	public final CommandAllocatePrimaryAction allocateStalePrimary() {
		return this.allocateStalePrimary;
	}

	/**
	 * Allocate an empty primary shard to a node. Accepts the index and shard for
	 * index name and shard number, and node to allocate the shard to. Using this
	 * command leads to a complete loss of all data that was indexed into this
	 * shard, if it was previously started. If a node which has a copy of the data
	 * rejoins the cluster later on, that data will be deleted. To ensure that these
	 * implications are well-understood, this command requires the flag
	 * accept_data_loss to be explicitly set to true.
	 * <p>
	 * API name: {@code allocate_empty_primary}
	 */
	@Nullable
	public final CommandAllocatePrimaryAction allocateEmptyPrimary() {
		return this.allocateEmptyPrimary;
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

		if (this.cancel != null) {
			generator.writeKey("cancel");
			this.cancel.serialize(generator, mapper);

		}
		if (this.move != null) {
			generator.writeKey("move");
			this.move.serialize(generator, mapper);

		}
		if (this.allocateReplica != null) {
			generator.writeKey("allocate_replica");
			this.allocateReplica.serialize(generator, mapper);

		}
		if (this.allocateStalePrimary != null) {
			generator.writeKey("allocate_stale_primary");
			this.allocateStalePrimary.serialize(generator, mapper);

		}
		if (this.allocateEmptyPrimary != null) {
			generator.writeKey("allocate_empty_primary");
			this.allocateEmptyPrimary.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Command}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Command> {
		@Nullable
		private CommandCancelAction cancel;

		@Nullable
		private CommandMoveAction move;

		@Nullable
		private CommandAllocateReplicaAction allocateReplica;

		@Nullable
		private CommandAllocatePrimaryAction allocateStalePrimary;

		@Nullable
		private CommandAllocatePrimaryAction allocateEmptyPrimary;

		/**
		 * Cancel allocation of a shard (or recovery). Accepts index and shard for index
		 * name and shard number, and node for the node to cancel the shard allocation
		 * on. This can be used to force resynchronization of existing replicas from the
		 * primary shard by cancelling them and allowing them to be reinitialized
		 * through the standard recovery process. By default only replica shard
		 * allocations can be cancelled. If it is necessary to cancel the allocation of
		 * a primary shard then the allow_primary flag must also be included in the
		 * request.
		 * <p>
		 * API name: {@code cancel}
		 */
		public final Builder cancel(@Nullable CommandCancelAction value) {
			this.cancel = value;
			return this;
		}

		/**
		 * Cancel allocation of a shard (or recovery). Accepts index and shard for index
		 * name and shard number, and node for the node to cancel the shard allocation
		 * on. This can be used to force resynchronization of existing replicas from the
		 * primary shard by cancelling them and allowing them to be reinitialized
		 * through the standard recovery process. By default only replica shard
		 * allocations can be cancelled. If it is necessary to cancel the allocation of
		 * a primary shard then the allow_primary flag must also be included in the
		 * request.
		 * <p>
		 * API name: {@code cancel}
		 */
		public final Builder cancel(Consumer<CommandCancelAction.Builder> fn) {
			CommandCancelAction.Builder builder = new CommandCancelAction.Builder();
			fn.accept(builder);
			return this.cancel(builder.build());
		}

		/**
		 * Move a started shard from one node to another node. Accepts index and shard
		 * for index name and shard number, from_node for the node to move the shard
		 * from, and to_node for the node to move the shard to.
		 * <p>
		 * API name: {@code move}
		 */
		public final Builder move(@Nullable CommandMoveAction value) {
			this.move = value;
			return this;
		}

		/**
		 * Move a started shard from one node to another node. Accepts index and shard
		 * for index name and shard number, from_node for the node to move the shard
		 * from, and to_node for the node to move the shard to.
		 * <p>
		 * API name: {@code move}
		 */
		public final Builder move(Consumer<CommandMoveAction.Builder> fn) {
			CommandMoveAction.Builder builder = new CommandMoveAction.Builder();
			fn.accept(builder);
			return this.move(builder.build());
		}

		/**
		 * Allocate an unassigned replica shard to a node. Accepts index and shard for
		 * index name and shard number, and node to allocate the shard to. Takes
		 * allocation deciders into account.
		 * <p>
		 * API name: {@code allocate_replica}
		 */
		public final Builder allocateReplica(@Nullable CommandAllocateReplicaAction value) {
			this.allocateReplica = value;
			return this;
		}

		/**
		 * Allocate an unassigned replica shard to a node. Accepts index and shard for
		 * index name and shard number, and node to allocate the shard to. Takes
		 * allocation deciders into account.
		 * <p>
		 * API name: {@code allocate_replica}
		 */
		public final Builder allocateReplica(Consumer<CommandAllocateReplicaAction.Builder> fn) {
			CommandAllocateReplicaAction.Builder builder = new CommandAllocateReplicaAction.Builder();
			fn.accept(builder);
			return this.allocateReplica(builder.build());
		}

		/**
		 * Allocate a primary shard to a node that holds a stale copy. Accepts the index
		 * and shard for index name and shard number, and node to allocate the shard to.
		 * Using this command may lead to data loss for the provided shard id. If a node
		 * which has the good copy of the data rejoins the cluster later on, that data
		 * will be deleted or overwritten with the data of the stale copy that was
		 * forcefully allocated with this command. To ensure that these implications are
		 * well-understood, this command requires the flag accept_data_loss to be
		 * explicitly set to true.
		 * <p>
		 * API name: {@code allocate_stale_primary}
		 */
		public final Builder allocateStalePrimary(@Nullable CommandAllocatePrimaryAction value) {
			this.allocateStalePrimary = value;
			return this;
		}

		/**
		 * Allocate a primary shard to a node that holds a stale copy. Accepts the index
		 * and shard for index name and shard number, and node to allocate the shard to.
		 * Using this command may lead to data loss for the provided shard id. If a node
		 * which has the good copy of the data rejoins the cluster later on, that data
		 * will be deleted or overwritten with the data of the stale copy that was
		 * forcefully allocated with this command. To ensure that these implications are
		 * well-understood, this command requires the flag accept_data_loss to be
		 * explicitly set to true.
		 * <p>
		 * API name: {@code allocate_stale_primary}
		 */
		public final Builder allocateStalePrimary(Consumer<CommandAllocatePrimaryAction.Builder> fn) {
			CommandAllocatePrimaryAction.Builder builder = new CommandAllocatePrimaryAction.Builder();
			fn.accept(builder);
			return this.allocateStalePrimary(builder.build());
		}

		/**
		 * Allocate an empty primary shard to a node. Accepts the index and shard for
		 * index name and shard number, and node to allocate the shard to. Using this
		 * command leads to a complete loss of all data that was indexed into this
		 * shard, if it was previously started. If a node which has a copy of the data
		 * rejoins the cluster later on, that data will be deleted. To ensure that these
		 * implications are well-understood, this command requires the flag
		 * accept_data_loss to be explicitly set to true.
		 * <p>
		 * API name: {@code allocate_empty_primary}
		 */
		public final Builder allocateEmptyPrimary(@Nullable CommandAllocatePrimaryAction value) {
			this.allocateEmptyPrimary = value;
			return this;
		}

		/**
		 * Allocate an empty primary shard to a node. Accepts the index and shard for
		 * index name and shard number, and node to allocate the shard to. Using this
		 * command leads to a complete loss of all data that was indexed into this
		 * shard, if it was previously started. If a node which has a copy of the data
		 * rejoins the cluster later on, that data will be deleted. To ensure that these
		 * implications are well-understood, this command requires the flag
		 * accept_data_loss to be explicitly set to true.
		 * <p>
		 * API name: {@code allocate_empty_primary}
		 */
		public final Builder allocateEmptyPrimary(Consumer<CommandAllocatePrimaryAction.Builder> fn) {
			CommandAllocatePrimaryAction.Builder builder = new CommandAllocatePrimaryAction.Builder();
			fn.accept(builder);
			return this.allocateEmptyPrimary(builder.build());
		}

		/**
		 * Builds a {@link Command}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Command build() {
			_checkSingleUse();

			return new Command(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Command}
	 */
	public static final JsonpDeserializer<Command> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Command::setupCommandDeserializer);

	protected static void setupCommandDeserializer(ObjectDeserializer<Command.Builder> op) {

		op.add(Builder::cancel, CommandCancelAction._DESERIALIZER, "cancel");
		op.add(Builder::move, CommandMoveAction._DESERIALIZER, "move");
		op.add(Builder::allocateReplica, CommandAllocateReplicaAction._DESERIALIZER, "allocate_replica");
		op.add(Builder::allocateStalePrimary, CommandAllocatePrimaryAction._DESERIALIZER, "allocate_stale_primary");
		op.add(Builder::allocateEmptyPrimary, CommandAllocatePrimaryAction._DESERIALIZER, "allocate_empty_primary");

	}

}
