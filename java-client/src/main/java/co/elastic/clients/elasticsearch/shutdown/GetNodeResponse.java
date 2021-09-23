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

package co.elastic.clients.elasticsearch.shutdown;

import co.elastic.clients.elasticsearch.shutdown.get_node.NodeShutdownStatus;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: shutdown.get_node.Response
public final class GetNodeResponse implements JsonpSerializable {
	private final List<NodeShutdownStatus> nodes;

	// ---------------------------------------------------------------------------------------------

	public GetNodeResponse(Builder builder) {

		this.nodes = Objects.requireNonNull(builder.nodes, "nodes");

	}

	/**
	 * API name: {@code nodes}
	 */
	public List<NodeShutdownStatus> nodes() {
		return this.nodes;
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

		generator.writeKey("nodes");
		generator.writeStartArray();
		for (NodeShutdownStatus item0 : this.nodes) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetNodeResponse}.
	 */
	public static class Builder implements ObjectBuilder<GetNodeResponse> {
		private List<NodeShutdownStatus> nodes;

		/**
		 * API name: {@code nodes}
		 */
		public Builder nodes(List<NodeShutdownStatus> value) {
			this.nodes = value;
			return this;
		}

		/**
		 * API name: {@code nodes}
		 */
		public Builder nodes(NodeShutdownStatus... value) {
			this.nodes = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #nodes(List)}, creating the list if needed.
		 */
		public Builder addNodes(NodeShutdownStatus value) {
			if (this.nodes == null) {
				this.nodes = new ArrayList<>();
			}
			this.nodes.add(value);
			return this;
		}

		/**
		 * Set {@link #nodes(List)} to a singleton list.
		 */
		public Builder nodes(Function<NodeShutdownStatus.Builder, ObjectBuilder<NodeShutdownStatus>> fn) {
			return this.nodes(fn.apply(new NodeShutdownStatus.Builder()).build());
		}

		/**
		 * Add a value to {@link #nodes(List)}, creating the list if needed.
		 */
		public Builder addNodes(Function<NodeShutdownStatus.Builder, ObjectBuilder<NodeShutdownStatus>> fn) {
			return this.addNodes(fn.apply(new NodeShutdownStatus.Builder()).build());
		}

		/**
		 * Builds a {@link GetNodeResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetNodeResponse build() {

			return new GetNodeResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetNodeResponse}
	 */
	public static final JsonpDeserializer<GetNodeResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, GetNodeResponse::setupGetNodeResponseDeserializer);

	protected static void setupGetNodeResponseDeserializer(DelegatingDeserializer<GetNodeResponse.Builder> op) {

		op.add(Builder::nodes, JsonpDeserializer.arrayDeserializer(NodeShutdownStatus.DESERIALIZER), "nodes");

	}

}
