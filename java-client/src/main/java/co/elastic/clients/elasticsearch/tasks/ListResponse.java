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

package co.elastic.clients.elasticsearch.tasks;

import co.elastic.clients.elasticsearch._types.ErrorCause;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: tasks.list.Response
public class ListResponse implements ToJsonp {
	@Nullable
	private final List<ErrorCause> nodeFailures;

	@Nullable
	private final Map<String, TaskExecutingNode> nodes;

	@Nullable
	private final JsonValue tasks;

	// ---------------------------------------------------------------------------------------------

	protected ListResponse(AbstractBuilder<?> builder) {

		this.nodeFailures = builder.nodeFailures;
		this.nodes = builder.nodes;
		this.tasks = builder.tasks;

	}

	/**
	 * API name: {@code node_failures}
	 */
	@Nullable
	public List<ErrorCause> nodeFailures() {
		return this.nodeFailures;
	}

	/**
	 * API name: {@code nodes}
	 */
	@Nullable
	public Map<String, TaskExecutingNode> nodes() {
		return this.nodes;
	}

	/**
	 * API name: {@code tasks}
	 */
	@Nullable
	public JsonValue tasks() {
		return this.tasks;
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

		if (this.nodeFailures != null) {

			generator.writeKey("node_failures");
			generator.writeStartArray();
			for (ErrorCause item0 : this.nodeFailures) {
				item0.toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.nodes != null) {

			generator.writeKey("nodes");
			generator.writeStartObject();
			for (Map.Entry<String, TaskExecutingNode> item0 : this.nodes.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.tasks != null) {

			generator.writeKey("tasks");
			generator.write(this.tasks);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ListResponse}.
	 */
	public static class Builder extends ListResponse.AbstractBuilder<Builder> implements ObjectBuilder<ListResponse> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ListResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ListResponse build() {

			return new ListResponse(this);
		}
	}

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>> {
		@Nullable
		private List<ErrorCause> nodeFailures;

		@Nullable
		private Map<String, TaskExecutingNode> nodes;

		@Nullable
		private JsonValue tasks;

		/**
		 * API name: {@code node_failures}
		 */
		public BuilderT nodeFailures(@Nullable List<ErrorCause> value) {
			this.nodeFailures = value;
			return self();
		}

		/**
		 * API name: {@code node_failures}
		 */
		public BuilderT nodeFailures(ErrorCause... value) {
			this.nodeFailures = Arrays.asList(value);
			return self();
		}

		/**
		 * Add a value to {@link #nodeFailures(List)}, creating the list if needed.
		 */
		public BuilderT addNodeFailures(ErrorCause value) {
			if (this.nodeFailures == null) {
				this.nodeFailures = new ArrayList<>();
			}
			this.nodeFailures.add(value);
			return self();
		}

		/**
		 * Set {@link #nodeFailures(List)} to a singleton list.
		 */
		public BuilderT nodeFailures(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn) {
			return this.nodeFailures(fn.apply(new ErrorCause.Builder()).build());
		}

		/**
		 * Add a value to {@link #nodeFailures(List)}, creating the list if needed.
		 */
		public BuilderT addNodeFailures(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn) {
			return this.addNodeFailures(fn.apply(new ErrorCause.Builder()).build());
		}

		/**
		 * API name: {@code nodes}
		 */
		public BuilderT nodes(@Nullable Map<String, TaskExecutingNode> value) {
			this.nodes = value;
			return self();
		}

		/**
		 * Add a key/value to {@link #nodes(Map)}, creating the map if needed.
		 */
		public BuilderT putNodes(String key, TaskExecutingNode value) {
			if (this.nodes == null) {
				this.nodes = new HashMap<>();
			}
			this.nodes.put(key, value);
			return self();
		}

		/**
		 * Set {@link #nodes(Map)} to a singleton map.
		 */
		public BuilderT nodes(String key, Function<TaskExecutingNode.Builder, ObjectBuilder<TaskExecutingNode>> fn) {
			return this.nodes(Collections.singletonMap(key, fn.apply(new TaskExecutingNode.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #nodes(Map)}, creating the map if needed.
		 */
		public BuilderT putNodes(String key, Function<TaskExecutingNode.Builder, ObjectBuilder<TaskExecutingNode>> fn) {
			return this.putNodes(key, fn.apply(new TaskExecutingNode.Builder()).build());
		}

		/**
		 * API name: {@code tasks}
		 */
		public BuilderT tasks(@Nullable JsonValue value) {
			this.tasks = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ListResponse
	 */
	public static final JsonpDeserializer<ListResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ListResponse::setupListResponseDeserializer);

	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupListResponseDeserializer(
			DelegatingDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::nodeFailures, JsonpDeserializer.arrayDeserializer(ErrorCause.DESERIALIZER),
				"node_failures");
		op.add(AbstractBuilder::nodes, JsonpDeserializer.stringMapDeserializer(TaskExecutingNode.DESERIALIZER),
				"nodes");
		op.add(AbstractBuilder::tasks, JsonpDeserializer.jsonValueDeserializer(), "tasks");

	}

}
