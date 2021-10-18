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

package co.elastic.clients.elasticsearch.core.update_by_query_rethrottle;

import co.elastic.clients.elasticsearch._types.BaseNode;
import co.elastic.clients.elasticsearch.tasks.Info;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.update_by_query_rethrottle.UpdateByQueryRethrottleNode
@JsonpDeserializable
public final class UpdateByQueryRethrottleNode extends BaseNode {
	private final Map<String, Info> tasks;

	// ---------------------------------------------------------------------------------------------

	public UpdateByQueryRethrottleNode(Builder builder) {
		super(builder);

		this.tasks = ModelTypeHelper.unmodifiableNonNull(builder.tasks, "tasks");

	}

	public UpdateByQueryRethrottleNode(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code tasks}
	 */
	public Map<String, Info> tasks() {
		return this.tasks;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);

		generator.writeKey("tasks");
		generator.writeStartObject();
		for (Map.Entry<String, Info> item0 : this.tasks.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UpdateByQueryRethrottleNode}.
	 */
	public static class Builder extends BaseNode.AbstractBuilder<Builder>
			implements
				ObjectBuilder<UpdateByQueryRethrottleNode> {
		private Map<String, Info> tasks;

		/**
		 * Required - API name: {@code tasks}
		 */
		public Builder tasks(Map<String, Info> value) {
			this.tasks = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #tasks(Map)}, creating the map if needed.
		 */
		public Builder putTasks(String key, Info value) {
			if (this.tasks == null) {
				this.tasks = new HashMap<>();
			}
			this.tasks.put(key, value);
			return this;
		}

		/**
		 * Set {@link #tasks(Map)} to a singleton map.
		 */
		public Builder tasks(String key, Function<Info.Builder, ObjectBuilder<Info>> fn) {
			return this.tasks(Collections.singletonMap(key, fn.apply(new Info.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #tasks(Map)}, creating the map if needed.
		 */
		public Builder putTasks(String key, Function<Info.Builder, ObjectBuilder<Info>> fn) {
			return this.putTasks(key, fn.apply(new Info.Builder()).build());
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
	 * Json deserializer for {@link UpdateByQueryRethrottleNode}
	 */
	public static final JsonpDeserializer<UpdateByQueryRethrottleNode> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
			Builder::new, UpdateByQueryRethrottleNode::setupUpdateByQueryRethrottleNodeDeserializer, Builder::build);

	protected static void setupUpdateByQueryRethrottleNodeDeserializer(
			DelegatingDeserializer<UpdateByQueryRethrottleNode.Builder> op) {
		BaseNode.setupBaseNodeDeserializer(op);
		op.add(Builder::tasks, JsonpDeserializer.stringMapDeserializer(Info._DESERIALIZER), "tasks");

	}

}
