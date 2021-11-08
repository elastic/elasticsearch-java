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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.MapBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: tasks.list.Response
@JsonpDeserializable
public class ListResponse implements JsonpSerializable {
	private final List<ErrorCause> nodeFailures;

	private final Map<String, TaskExecutingNode> nodes;

	@Nullable
	private final JsonValue /*
							 * Union(Array<tasks._types.Info> | Dictionary<internal.string,
							 * tasks._types.Info>)
							 */ tasks;

	// ---------------------------------------------------------------------------------------------

	protected ListResponse(AbstractBuilder<?> builder) {

		this.nodeFailures = ModelTypeHelper.unmodifiable(builder.nodeFailures);
		this.nodes = ModelTypeHelper.unmodifiable(builder.nodes);
		this.tasks = builder.tasks;

	}

	/**
	 * API name: {@code node_failures}
	 */
	public final List<ErrorCause> nodeFailures() {
		return this.nodeFailures;
	}

	/**
	 * API name: {@code nodes}
	 */
	public final Map<String, TaskExecutingNode> nodes() {
		return this.nodes;
	}

	/**
	 * API name: {@code tasks}
	 */
	@Nullable
	public final JsonValue /*
							 * Union(Array<tasks._types.Info> | Dictionary<internal.string,
							 * tasks._types.Info>)
							 */ tasks() {
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

		if (ModelTypeHelper.isDefined(this.nodeFailures)) {
			generator.writeKey("node_failures");
			generator.writeStartArray();
			for (ErrorCause item0 : this.nodeFailures) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.nodes)) {
			generator.writeKey("nodes");
			generator.writeStartObject();
			for (Map.Entry<String, TaskExecutingNode> item0 : this.nodes.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

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
			_checkSingleUse();

			return new ListResponse(this);
		}
	}

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				ObjectBuilderBase {
		@Nullable
		private List<ErrorCause> nodeFailures;

		@Nullable
		private Map<String, TaskExecutingNode> nodes;

		@Nullable
		private JsonValue /*
							 * Union(Array<tasks._types.Info> | Dictionary<internal.string,
							 * tasks._types.Info>)
							 */ tasks;

		/**
		 * API name: {@code node_failures}
		 */
		public final BuilderT nodeFailures(@Nullable List<ErrorCause> value) {
			this.nodeFailures = value;
			return self();
		}

		/**
		 * API name: {@code node_failures}
		 */
		public final BuilderT nodeFailures(ErrorCause... value) {
			this.nodeFailures = Arrays.asList(value);
			return self();
		}

		/**
		 * API name: {@code node_failures}
		 */
		@SafeVarargs
		public final BuilderT nodeFailures(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>>... fns) {
			this.nodeFailures = new ArrayList<>(fns.length);
			for (Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn : fns) {
				this.nodeFailures.add(fn.apply(new ErrorCause.Builder()).build());
			}
			return self();
		}

		/**
		 * API name: {@code nodes}
		 */
		public final BuilderT nodes(@Nullable Map<String, TaskExecutingNode> value) {
			this.nodes = value;
			return self();
		}

		/**
		 * Set {@link #nodes(Map)} to a singleton map.
		 */
		public BuilderT nodes(String key, Function<TaskExecutingNode.Builder, ObjectBuilder<TaskExecutingNode>> fn) {
			return this.nodes(Collections.singletonMap(key, fn.apply(new TaskExecutingNode.Builder()).build()));
		}

		public final BuilderT nodes(
				Function<MapBuilder<String, TaskExecutingNode, TaskExecutingNode.Builder>, ObjectBuilder<Map<String, TaskExecutingNode>>> fn) {
			return nodes(fn.apply(new MapBuilder<>(TaskExecutingNode.Builder::new)).build());
		}

		/**
		 * API name: {@code tasks}
		 */
		public final BuilderT tasks(@Nullable JsonValue /*
														 * Union(Array<tasks._types.Info> | Dictionary<internal.string,
														 * tasks._types.Info>)
														 */ value) {
			this.tasks = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ListResponse}
	 */
	public static final JsonpDeserializer<ListResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ListResponse::setupListResponseDeserializer, Builder::build);

	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupListResponseDeserializer(
			DelegatingDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::nodeFailures, JsonpDeserializer.arrayDeserializer(ErrorCause._DESERIALIZER),
				"node_failures");
		op.add(AbstractBuilder::nodes, JsonpDeserializer.stringMapDeserializer(TaskExecutingNode._DESERIALIZER),
				"nodes");
		op.add(AbstractBuilder::tasks, JsonpDeserializer.jsonValueDeserializer(), "tasks");

	}

}
