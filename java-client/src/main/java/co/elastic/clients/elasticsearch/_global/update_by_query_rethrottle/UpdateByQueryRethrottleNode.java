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

package co.elastic.clients.elasticsearch._global.update_by_query_rethrottle;

import co.elastic.clients.elasticsearch._spec_utils.BaseNode;
import co.elastic.clients.elasticsearch.task.Info;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _global.update_by_query_rethrottle.UpdateByQueryRethrottleNode
public final class UpdateByQueryRethrottleNode extends BaseNode {
	private final JsonValue tasks;

	// ---------------------------------------------------------------------------------------------

	protected UpdateByQueryRethrottleNode(Builder builder) {
		super(builder);
		this.tasks = Objects.requireNonNull(builder.tasks, "tasks");

	}

	/**
	 * API name: {@code tasks}
	 */
	public JsonValue tasks() {
		return this.tasks;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);

		generator.writeKey("tasks");
		generator.write(this.tasks);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UpdateByQueryRethrottleNode}.
	 */
	public static class Builder extends BaseNode.AbstractBuilder<Builder>
			implements
				ObjectBuilder<UpdateByQueryRethrottleNode> {
		private JsonValue tasks;

		/**
		 * API name: {@code tasks}
		 */
		public Builder tasks(JsonValue value) {
			this.tasks = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link UpdateByQueryRethrottleNode}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UpdateByQueryRethrottleNode build() {

			return new UpdateByQueryRethrottleNode(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for UpdateByQueryRethrottleNode
	 */
	public static final JsonpDeserializer<UpdateByQueryRethrottleNode> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, UpdateByQueryRethrottleNode::setupUpdateByQueryRethrottleNodeDeserializer);

	protected static void setupUpdateByQueryRethrottleNodeDeserializer(
			DelegatingDeserializer<UpdateByQueryRethrottleNode.Builder> op) {
		BaseNode.setupBaseNodeDeserializer(op);
		op.add(Builder::tasks, JsonpDeserializer.jsonValueDeserializer(), "tasks");

	}

}
