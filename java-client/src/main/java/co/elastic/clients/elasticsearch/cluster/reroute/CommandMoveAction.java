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
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.reroute.CommandMoveAction

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#cluster.reroute.CommandMoveAction">API
 *      specification</a>
 */
@JsonpDeserializable
public class CommandMoveAction implements JsonpSerializable {
	private final String index;

	private final int shard;

	private final String fromNode;

	private final String toNode;

	// ---------------------------------------------------------------------------------------------

	private CommandMoveAction(Builder builder) {

		this.index = ApiTypeHelper.requireNonNull(builder.index, this, "index");
		this.shard = ApiTypeHelper.requireNonNull(builder.shard, this, "shard");
		this.fromNode = ApiTypeHelper.requireNonNull(builder.fromNode, this, "fromNode");
		this.toNode = ApiTypeHelper.requireNonNull(builder.toNode, this, "toNode");

	}

	public static CommandMoveAction of(Function<Builder, ObjectBuilder<CommandMoveAction>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code index}
	 */
	public final String index() {
		return this.index;
	}

	/**
	 * Required - API name: {@code shard}
	 */
	public final int shard() {
		return this.shard;
	}

	/**
	 * Required - The node to move the shard from
	 * <p>
	 * API name: {@code from_node}
	 */
	public final String fromNode() {
		return this.fromNode;
	}

	/**
	 * Required - The node to move the shard to
	 * <p>
	 * API name: {@code to_node}
	 */
	public final String toNode() {
		return this.toNode;
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

		generator.writeKey("from_node");
		generator.write(this.fromNode);

		generator.writeKey("to_node");
		generator.write(this.toNode);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CommandMoveAction}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<CommandMoveAction> {
		private String index;

		private Integer shard;

		private String fromNode;

		private String toNode;

		/**
		 * Required - API name: {@code index}
		 */
		public final Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * Required - API name: {@code shard}
		 */
		public final Builder shard(int value) {
			this.shard = value;
			return this;
		}

		/**
		 * Required - The node to move the shard from
		 * <p>
		 * API name: {@code from_node}
		 */
		public final Builder fromNode(String value) {
			this.fromNode = value;
			return this;
		}

		/**
		 * Required - The node to move the shard to
		 * <p>
		 * API name: {@code to_node}
		 */
		public final Builder toNode(String value) {
			this.toNode = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CommandMoveAction}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CommandMoveAction build() {
			_checkSingleUse();

			return new CommandMoveAction(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CommandMoveAction}
	 */
	public static final JsonpDeserializer<CommandMoveAction> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CommandMoveAction::setupCommandMoveActionDeserializer);

	protected static void setupCommandMoveActionDeserializer(ObjectDeserializer<CommandMoveAction.Builder> op) {

		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::shard, JsonpDeserializer.integerDeserializer(), "shard");
		op.add(Builder::fromNode, JsonpDeserializer.stringDeserializer(), "from_node");
		op.add(Builder::toNode, JsonpDeserializer.stringDeserializer(), "to_node");

	}

}
