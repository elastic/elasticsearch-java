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

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: cluster.reroute.CommandMoveAction
public final class CommandMoveAction implements ToJsonp {
	private final String index;

	private final Number shard;

	private final String fromNode;

	private final String toNode;

	// ---------------------------------------------------------------------------------------------

	protected CommandMoveAction(Builder builder) {

		this.index = Objects.requireNonNull(builder.index, "index");
		this.shard = Objects.requireNonNull(builder.shard, "shard");
		this.fromNode = Objects.requireNonNull(builder.fromNode, "from_node");
		this.toNode = Objects.requireNonNull(builder.toNode, "to_node");

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
	public Number shard() {
		return this.shard;
	}

	/**
	 * The node to move the shard from
	 *
	 * API name: {@code from_node}
	 */
	public String fromNode() {
		return this.fromNode;
	}

	/**
	 * The node to move the shard to
	 *
	 * API name: {@code to_node}
	 */
	public String toNode() {
		return this.toNode;
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

		generator.writeKey("index");
		generator.write(this.index);

		generator.writeKey("shard");
		generator.write(this.shard.doubleValue());

		generator.writeKey("from_node");
		generator.write(this.fromNode);

		generator.writeKey("to_node");
		generator.write(this.toNode);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CommandMoveAction}.
	 */
	public static class Builder implements ObjectBuilder<CommandMoveAction> {
		private String index;

		private Number shard;

		private String fromNode;

		private String toNode;

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
		public Builder shard(Number value) {
			this.shard = value;
			return this;
		}

		/**
		 * The node to move the shard from
		 *
		 * API name: {@code from_node}
		 */
		public Builder fromNode(String value) {
			this.fromNode = value;
			return this;
		}

		/**
		 * The node to move the shard to
		 *
		 * API name: {@code to_node}
		 */
		public Builder toNode(String value) {
			this.toNode = value;
			return this;
		}

		/**
		 * Builds a {@link CommandMoveAction}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CommandMoveAction build() {

			return new CommandMoveAction(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for CommandMoveAction
	 */
	public static final JsonpValueParser<CommandMoveAction> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, CommandMoveAction::setupCommandMoveActionParser);

	protected static void setupCommandMoveActionParser(DelegatingJsonpValueParser<CommandMoveAction.Builder> op) {

		op.add(Builder::index, JsonpValueParser.stringParser(), "index");
		op.add(Builder::shard, JsonpValueParser.numberParser(), "shard");
		op.add(Builder::fromNode, JsonpValueParser.stringParser(), "from_node");
		op.add(Builder::toNode, JsonpValueParser.stringParser(), "to_node");

	}

}
