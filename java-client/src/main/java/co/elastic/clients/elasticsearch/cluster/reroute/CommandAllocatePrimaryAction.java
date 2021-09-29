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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.reroute.CommandAllocatePrimaryAction
@JsonpDeserializable
public final class CommandAllocatePrimaryAction implements JsonpSerializable {
	private final String index;

	private final int shard;

	private final String node;

	private final boolean acceptDataLoss;

	// ---------------------------------------------------------------------------------------------

	public CommandAllocatePrimaryAction(Builder builder) {

		this.index = Objects.requireNonNull(builder.index, "index");
		this.shard = Objects.requireNonNull(builder.shard, "shard");
		this.node = Objects.requireNonNull(builder.node, "node");
		this.acceptDataLoss = Objects.requireNonNull(builder.acceptDataLoss, "accept_data_loss");

	}

	public CommandAllocatePrimaryAction(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code index}
	 */
	public String index() {
		return this.index;
	}

	/**
	 * API name: {@code shard}
	 */
	public int shard() {
		return this.shard;
	}

	/**
	 * API name: {@code node}
	 */
	public String node() {
		return this.node;
	}

	/**
	 * If a node which has a copy of the data rejoins the cluster later on, that
	 * data will be deleted. To ensure that these implications are well-understood,
	 * this command requires the flag accept_data_loss to be explicitly set to true
	 * <p>
	 * API name: {@code accept_data_loss}
	 */
	public boolean acceptDataLoss() {
		return this.acceptDataLoss;
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

		generator.writeKey("index");
		generator.write(this.index);

		generator.writeKey("shard");
		generator.write(this.shard);

		generator.writeKey("node");
		generator.write(this.node);

		generator.writeKey("accept_data_loss");
		generator.write(this.acceptDataLoss);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CommandAllocatePrimaryAction}.
	 */
	public static class Builder implements ObjectBuilder<CommandAllocatePrimaryAction> {
		private String index;

		private Integer shard;

		private String node;

		private Boolean acceptDataLoss;

		/**
		 * API name: {@code index}
		 */
		public Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code shard}
		 */
		public Builder shard(int value) {
			this.shard = value;
			return this;
		}

		/**
		 * API name: {@code node}
		 */
		public Builder node(String value) {
			this.node = value;
			return this;
		}

		/**
		 * If a node which has a copy of the data rejoins the cluster later on, that
		 * data will be deleted. To ensure that these implications are well-understood,
		 * this command requires the flag accept_data_loss to be explicitly set to true
		 * <p>
		 * API name: {@code accept_data_loss}
		 */
		public Builder acceptDataLoss(boolean value) {
			this.acceptDataLoss = value;
			return this;
		}

		/**
		 * Builds a {@link CommandAllocatePrimaryAction}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CommandAllocatePrimaryAction build() {

			return new CommandAllocatePrimaryAction(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CommandAllocatePrimaryAction}
	 */
	public static final JsonpDeserializer<CommandAllocatePrimaryAction> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
			Builder::new, CommandAllocatePrimaryAction::setupCommandAllocatePrimaryActionDeserializer, Builder::build);

	protected static void setupCommandAllocatePrimaryActionDeserializer(
			DelegatingDeserializer<CommandAllocatePrimaryAction.Builder> op) {

		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::shard, JsonpDeserializer.integerDeserializer(), "shard");
		op.add(Builder::node, JsonpDeserializer.stringDeserializer(), "node");
		op.add(Builder::acceptDataLoss, JsonpDeserializer.booleanDeserializer(), "accept_data_loss");

	}

}
