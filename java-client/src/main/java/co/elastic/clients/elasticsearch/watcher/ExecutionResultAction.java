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

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
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

// typedef: watcher._types.ExecutionResultAction

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#watcher._types.ExecutionResultAction">API
 *      specification</a>
 */
@JsonpDeserializable
public class ExecutionResultAction extends ExecutionResultForeachAction {
	private final String id;

	private final ActionType type;

	private final ActionStatusOptions status;

	@Nullable
	private final ExecutionResultCondition condition;

	@Nullable
	private final ExecutionResultTransform transform;

	private final List<ExecutionResultForeachAction> foreach;

	@Nullable
	private final Integer maxIterations;

	@Nullable
	private final Integer numberOfActionsExecuted;

	// ---------------------------------------------------------------------------------------------

	private ExecutionResultAction(Builder builder) {
		super(builder);

		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.type = ApiTypeHelper.requireNonNull(builder.type, this, "type");
		this.status = ApiTypeHelper.requireNonNull(builder.status, this, "status");
		this.condition = builder.condition;
		this.transform = builder.transform;
		this.foreach = ApiTypeHelper.unmodifiable(builder.foreach);
		this.maxIterations = builder.maxIterations;
		this.numberOfActionsExecuted = builder.numberOfActionsExecuted;

	}

	public static ExecutionResultAction of(Function<Builder, ObjectBuilder<ExecutionResultAction>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Required - API name: {@code type}
	 */
	public final ActionType type() {
		return this.type;
	}

	/**
	 * Required - API name: {@code status}
	 */
	public final ActionStatusOptions status() {
		return this.status;
	}

	/**
	 * API name: {@code condition}
	 */
	@Nullable
	public final ExecutionResultCondition condition() {
		return this.condition;
	}

	/**
	 * API name: {@code transform}
	 */
	@Nullable
	public final ExecutionResultTransform transform() {
		return this.transform;
	}

	/**
	 * API name: {@code foreach}
	 */
	public final List<ExecutionResultForeachAction> foreach() {
		return this.foreach;
	}

	/**
	 * API name: {@code max_iterations}
	 */
	@Nullable
	public final Integer maxIterations() {
		return this.maxIterations;
	}

	/**
	 * API name: {@code number_of_actions_executed}
	 */
	@Nullable
	public final Integer numberOfActionsExecuted() {
		return this.numberOfActionsExecuted;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("id");
		generator.write(this.id);

		generator.writeKey("type");
		this.type.serialize(generator, mapper);
		generator.writeKey("status");
		this.status.serialize(generator, mapper);
		if (this.condition != null) {
			generator.writeKey("condition");
			this.condition.serialize(generator, mapper);

		}
		if (this.transform != null) {
			generator.writeKey("transform");
			this.transform.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.foreach)) {
			generator.writeKey("foreach");
			generator.writeStartArray();
			for (ExecutionResultForeachAction item0 : this.foreach) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.maxIterations != null) {
			generator.writeKey("max_iterations");
			generator.write(this.maxIterations);

		}
		if (this.numberOfActionsExecuted != null) {
			generator.writeKey("number_of_actions_executed");
			generator.write(this.numberOfActionsExecuted);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExecutionResultAction}.
	 */

	public static class Builder extends ExecutionResultForeachAction.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ExecutionResultAction> {
		private String id;

		private ActionType type;

		private ActionStatusOptions status;

		@Nullable
		private ExecutionResultCondition condition;

		@Nullable
		private ExecutionResultTransform transform;

		@Nullable
		private List<ExecutionResultForeachAction> foreach;

		@Nullable
		private Integer maxIterations;

		@Nullable
		private Integer numberOfActionsExecuted;

		public Builder() {
		}
		private Builder(ExecutionResultAction instance) {
			this.id = instance.id;
			this.type = instance.type;
			this.status = instance.status;
			this.condition = instance.condition;
			this.transform = instance.transform;
			this.foreach = instance.foreach;
			this.maxIterations = instance.maxIterations;
			this.numberOfActionsExecuted = instance.numberOfActionsExecuted;

		}
		/**
		 * Required - API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - API name: {@code type}
		 */
		public final Builder type(ActionType value) {
			this.type = value;
			return this;
		}

		/**
		 * Required - API name: {@code status}
		 */
		public final Builder status(ActionStatusOptions value) {
			this.status = value;
			return this;
		}

		/**
		 * API name: {@code condition}
		 */
		public final Builder condition(@Nullable ExecutionResultCondition value) {
			this.condition = value;
			return this;
		}

		/**
		 * API name: {@code condition}
		 */
		public final Builder condition(
				Function<ExecutionResultCondition.Builder, ObjectBuilder<ExecutionResultCondition>> fn) {
			return this.condition(fn.apply(new ExecutionResultCondition.Builder()).build());
		}

		/**
		 * API name: {@code transform}
		 */
		public final Builder transform(@Nullable ExecutionResultTransform value) {
			this.transform = value;
			return this;
		}

		/**
		 * API name: {@code transform}
		 */
		public final Builder transform(
				Function<ExecutionResultTransform.Builder, ObjectBuilder<ExecutionResultTransform>> fn) {
			return this.transform(fn.apply(new ExecutionResultTransform.Builder()).build());
		}

		/**
		 * API name: {@code foreach}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>foreach</code>.
		 */
		public final Builder foreach(List<ExecutionResultForeachAction> list) {
			this.foreach = _listAddAll(this.foreach, list);
			return this;
		}

		/**
		 * API name: {@code foreach}
		 * <p>
		 * Adds one or more values to <code>foreach</code>.
		 */
		public final Builder foreach(ExecutionResultForeachAction value, ExecutionResultForeachAction... values) {
			this.foreach = _listAdd(this.foreach, value, values);
			return this;
		}

		/**
		 * API name: {@code foreach}
		 * <p>
		 * Adds a value to <code>foreach</code> using a builder lambda.
		 */
		public final Builder foreach(
				Function<ExecutionResultForeachAction.Builder, ObjectBuilder<ExecutionResultForeachAction>> fn) {
			return foreach(fn.apply(new ExecutionResultForeachAction.Builder()).build());
		}

		/**
		 * API name: {@code max_iterations}
		 */
		public final Builder maxIterations(@Nullable Integer value) {
			this.maxIterations = value;
			return this;
		}

		/**
		 * API name: {@code number_of_actions_executed}
		 */
		public final Builder numberOfActionsExecuted(@Nullable Integer value) {
			this.numberOfActionsExecuted = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ExecutionResultAction}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExecutionResultAction build() {
			_checkSingleUse();

			return new ExecutionResultAction(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ExecutionResultAction}
	 */
	public static final JsonpDeserializer<ExecutionResultAction> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ExecutionResultAction::setupExecutionResultActionDeserializer);

	protected static void setupExecutionResultActionDeserializer(ObjectDeserializer<ExecutionResultAction.Builder> op) {
		ExecutionResultForeachAction.setupExecutionResultForeachActionDeserializer(op);
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::type, ActionType._DESERIALIZER, "type");
		op.add(Builder::status, ActionStatusOptions._DESERIALIZER, "status");
		op.add(Builder::condition, ExecutionResultCondition._DESERIALIZER, "condition");
		op.add(Builder::transform, ExecutionResultTransform._DESERIALIZER, "transform");
		op.add(Builder::foreach, JsonpDeserializer.arrayDeserializer(ExecutionResultForeachAction._DESERIALIZER),
				"foreach");
		op.add(Builder::maxIterations, JsonpDeserializer.integerDeserializer(), "max_iterations");
		op.add(Builder::numberOfActionsExecuted, JsonpDeserializer.integerDeserializer(), "number_of_actions_executed");

	}

}
