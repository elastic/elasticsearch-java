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

package co.elastic.clients.elasticsearch.tasks;

import co.elastic.clients.elasticsearch._types.ErrorCause;
import co.elastic.clients.elasticsearch._types.TaskFailure;
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
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: tasks._types.TaskListResponseBase

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#tasks._types.TaskListResponseBase">API
 *      specification</a>
 */

public abstract class TaskListResponseBase implements JsonpSerializable {
	private final List<ErrorCause> nodeFailures;

	private final List<TaskFailure> taskFailures;

	private final Map<String, NodeTasks> nodes;

	@Nullable
	private final TaskInfos tasks;

	// ---------------------------------------------------------------------------------------------

	protected TaskListResponseBase(AbstractBuilder<?> builder) {

		this.nodeFailures = ApiTypeHelper.unmodifiable(builder.nodeFailures);
		this.taskFailures = ApiTypeHelper.unmodifiable(builder.taskFailures);
		this.nodes = ApiTypeHelper.unmodifiable(builder.nodes);
		this.tasks = builder.tasks;

	}

	/**
	 * API name: {@code node_failures}
	 */
	public final List<ErrorCause> nodeFailures() {
		return this.nodeFailures;
	}

	/**
	 * API name: {@code task_failures}
	 */
	public final List<TaskFailure> taskFailures() {
		return this.taskFailures;
	}

	/**
	 * Task information grouped by node, if <code>group_by</code> was set to
	 * <code>node</code> (the default).
	 * <p>
	 * API name: {@code nodes}
	 */
	public final Map<String, NodeTasks> nodes() {
		return this.nodes;
	}

	/**
	 * Either a flat list of tasks if <code>group_by</code> was set to
	 * <code>none</code>, or grouped by parents if <code>group_by</code> was set to
	 * <code>parents</code>.
	 * <p>
	 * API name: {@code tasks}
	 */
	@Nullable
	public final TaskInfos tasks() {
		return this.tasks;
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

		if (ApiTypeHelper.isDefined(this.nodeFailures)) {
			generator.writeKey("node_failures");
			generator.writeStartArray();
			for (ErrorCause item0 : this.nodeFailures) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.taskFailures)) {
			generator.writeKey("task_failures");
			generator.writeStartArray();
			for (TaskFailure item0 : this.taskFailures) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.nodes)) {
			generator.writeKey("nodes");
			generator.writeStartObject();
			for (Map.Entry<String, NodeTasks> item0 : this.nodes.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.tasks != null) {
			generator.writeKey("tasks");
			this.tasks.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				WithJsonObjectBuilderBase<BuilderT> {
		@Nullable
		private List<ErrorCause> nodeFailures;

		@Nullable
		private List<TaskFailure> taskFailures;

		@Nullable
		private Map<String, NodeTasks> nodes;

		@Nullable
		private TaskInfos tasks;

		/**
		 * API name: {@code node_failures}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>nodeFailures</code>.
		 */
		public final BuilderT nodeFailures(List<ErrorCause> list) {
			this.nodeFailures = _listAddAll(this.nodeFailures, list);
			return self();
		}

		/**
		 * API name: {@code node_failures}
		 * <p>
		 * Adds one or more values to <code>nodeFailures</code>.
		 */
		public final BuilderT nodeFailures(ErrorCause value, ErrorCause... values) {
			this.nodeFailures = _listAdd(this.nodeFailures, value, values);
			return self();
		}

		/**
		 * API name: {@code node_failures}
		 * <p>
		 * Adds a value to <code>nodeFailures</code> using a builder lambda.
		 */
		public final BuilderT nodeFailures(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn) {
			return nodeFailures(fn.apply(new ErrorCause.Builder()).build());
		}

		/**
		 * API name: {@code task_failures}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>taskFailures</code>.
		 */
		public final BuilderT taskFailures(List<TaskFailure> list) {
			this.taskFailures = _listAddAll(this.taskFailures, list);
			return self();
		}

		/**
		 * API name: {@code task_failures}
		 * <p>
		 * Adds one or more values to <code>taskFailures</code>.
		 */
		public final BuilderT taskFailures(TaskFailure value, TaskFailure... values) {
			this.taskFailures = _listAdd(this.taskFailures, value, values);
			return self();
		}

		/**
		 * API name: {@code task_failures}
		 * <p>
		 * Adds a value to <code>taskFailures</code> using a builder lambda.
		 */
		public final BuilderT taskFailures(Function<TaskFailure.Builder, ObjectBuilder<TaskFailure>> fn) {
			return taskFailures(fn.apply(new TaskFailure.Builder()).build());
		}

		/**
		 * Task information grouped by node, if <code>group_by</code> was set to
		 * <code>node</code> (the default).
		 * <p>
		 * API name: {@code nodes}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>nodes</code>.
		 */
		public final BuilderT nodes(Map<String, NodeTasks> map) {
			this.nodes = _mapPutAll(this.nodes, map);
			return self();
		}

		/**
		 * Task information grouped by node, if <code>group_by</code> was set to
		 * <code>node</code> (the default).
		 * <p>
		 * API name: {@code nodes}
		 * <p>
		 * Adds an entry to <code>nodes</code>.
		 */
		public final BuilderT nodes(String key, NodeTasks value) {
			this.nodes = _mapPut(this.nodes, key, value);
			return self();
		}

		/**
		 * Task information grouped by node, if <code>group_by</code> was set to
		 * <code>node</code> (the default).
		 * <p>
		 * API name: {@code nodes}
		 * <p>
		 * Adds an entry to <code>nodes</code> using a builder lambda.
		 */
		public final BuilderT nodes(String key, Function<NodeTasks.Builder, ObjectBuilder<NodeTasks>> fn) {
			return nodes(key, fn.apply(new NodeTasks.Builder()).build());
		}

		/**
		 * Either a flat list of tasks if <code>group_by</code> was set to
		 * <code>none</code>, or grouped by parents if <code>group_by</code> was set to
		 * <code>parents</code>.
		 * <p>
		 * API name: {@code tasks}
		 */
		public final BuilderT tasks(@Nullable TaskInfos value) {
			this.tasks = value;
			return self();
		}

		/**
		 * Either a flat list of tasks if <code>group_by</code> was set to
		 * <code>none</code>, or grouped by parents if <code>group_by</code> was set to
		 * <code>parents</code>.
		 * <p>
		 * API name: {@code tasks}
		 */
		public final BuilderT tasks(Function<TaskInfos.Builder, ObjectBuilder<TaskInfos>> fn) {
			return this.tasks(fn.apply(new TaskInfos.Builder()).build());
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupTaskListResponseBaseDeserializer(
			ObjectDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::nodeFailures, JsonpDeserializer.arrayDeserializer(ErrorCause._DESERIALIZER),
				"node_failures");
		op.add(AbstractBuilder::taskFailures, JsonpDeserializer.arrayDeserializer(TaskFailure._DESERIALIZER),
				"task_failures");
		op.add(AbstractBuilder::nodes, JsonpDeserializer.stringMapDeserializer(NodeTasks._DESERIALIZER), "nodes");
		op.add(AbstractBuilder::tasks, TaskInfos._DESERIALIZER, "tasks");

	}

}
