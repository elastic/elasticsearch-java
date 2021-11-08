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

// typedef: tasks.cancel.Response
@JsonpDeserializable
public class CancelResponse implements JsonpSerializable {
	private final List<ErrorCause> nodeFailures;

	private final Map<String, TaskExecutingNode> nodes;

	// ---------------------------------------------------------------------------------------------

	private CancelResponse(Builder builder) {

		this.nodeFailures = ModelTypeHelper.unmodifiable(builder.nodeFailures);
		this.nodes = ModelTypeHelper.unmodifiableRequired(builder.nodes, this, "nodes");

	}

	public static CancelResponse of(Function<Builder, ObjectBuilder<CancelResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code node_failures}
	 */
	public final List<ErrorCause> nodeFailures() {
		return this.nodeFailures;
	}

	/**
	 * Required - API name: {@code nodes}
	 */
	public final Map<String, TaskExecutingNode> nodes() {
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

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CancelResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<CancelResponse> {
		@Nullable
		private List<ErrorCause> nodeFailures;

		private Map<String, TaskExecutingNode> nodes;

		/**
		 * API name: {@code node_failures}
		 */
		public final Builder nodeFailures(@Nullable List<ErrorCause> value) {
			this.nodeFailures = value;
			return this;
		}

		/**
		 * API name: {@code node_failures}
		 */
		public final Builder nodeFailures(ErrorCause... value) {
			this.nodeFailures = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code node_failures}
		 */
		@SafeVarargs
		public final Builder nodeFailures(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>>... fns) {
			this.nodeFailures = new ArrayList<>(fns.length);
			for (Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn : fns) {
				this.nodeFailures.add(fn.apply(new ErrorCause.Builder()).build());
			}
			return this;
		}

		/**
		 * Required - API name: {@code nodes}
		 */
		public final Builder nodes(Map<String, TaskExecutingNode> value) {
			this.nodes = value;
			return this;
		}

		/**
		 * Set {@link #nodes(Map)} to a singleton map.
		 */
		public Builder nodes(String key, Function<TaskExecutingNode.Builder, ObjectBuilder<TaskExecutingNode>> fn) {
			return this.nodes(Collections.singletonMap(key, fn.apply(new TaskExecutingNode.Builder()).build()));
		}

		public final Builder nodes(
				Function<MapBuilder<String, TaskExecutingNode, TaskExecutingNode.Builder>, ObjectBuilder<Map<String, TaskExecutingNode>>> fn) {
			return nodes(fn.apply(new MapBuilder<>(TaskExecutingNode.Builder::new)).build());
		}

		/**
		 * Builds a {@link CancelResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CancelResponse build() {
			_checkSingleUse();

			return new CancelResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CancelResponse}
	 */
	public static final JsonpDeserializer<CancelResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			CancelResponse::setupCancelResponseDeserializer, Builder::build);

	protected static void setupCancelResponseDeserializer(DelegatingDeserializer<CancelResponse.Builder> op) {

		op.add(Builder::nodeFailures, JsonpDeserializer.arrayDeserializer(ErrorCause._DESERIALIZER), "node_failures");
		op.add(Builder::nodes, JsonpDeserializer.stringMapDeserializer(TaskExecutingNode._DESERIALIZER), "nodes");

	}

}
