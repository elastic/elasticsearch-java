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
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.DateTime;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
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

// typedef: watcher._types.ExecutionResult

/**
 *
 * @see <a href="../doc-files/api-spec.html#watcher._types.ExecutionResult">API
 *      specification</a>
 */
@JsonpDeserializable
public class ExecutionResult implements JsonpSerializable {
	private final List<ExecutionResultAction> actions;

	private final ExecutionResultCondition condition;

	private final long executionDuration;

	private final DateTime executionTime;

	private final ExecutionResultInput input;

	// ---------------------------------------------------------------------------------------------

	private ExecutionResult(Builder builder) {

		this.actions = ApiTypeHelper.unmodifiableRequired(builder.actions, this, "actions");
		this.condition = ApiTypeHelper.requireNonNull(builder.condition, this, "condition");
		this.executionDuration = ApiTypeHelper.requireNonNull(builder.executionDuration, this, "executionDuration");
		this.executionTime = ApiTypeHelper.requireNonNull(builder.executionTime, this, "executionTime");
		this.input = ApiTypeHelper.requireNonNull(builder.input, this, "input");

	}

	public static ExecutionResult of(Function<Builder, ObjectBuilder<ExecutionResult>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code actions}
	 */
	public final List<ExecutionResultAction> actions() {
		return this.actions;
	}

	/**
	 * Required - API name: {@code condition}
	 */
	public final ExecutionResultCondition condition() {
		return this.condition;
	}

	/**
	 * Required - API name: {@code execution_duration}
	 */
	public final long executionDuration() {
		return this.executionDuration;
	}

	/**
	 * Required - API name: {@code execution_time}
	 */
	public final DateTime executionTime() {
		return this.executionTime;
	}

	/**
	 * Required - API name: {@code input}
	 */
	public final ExecutionResultInput input() {
		return this.input;
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

		if (ApiTypeHelper.isDefined(this.actions)) {
			generator.writeKey("actions");
			generator.writeStartArray();
			for (ExecutionResultAction item0 : this.actions) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("condition");
		this.condition.serialize(generator, mapper);

		generator.writeKey("execution_duration");
		generator.write(this.executionDuration);

		generator.writeKey("execution_time");
		this.executionTime.serialize(generator, mapper);
		generator.writeKey("input");
		this.input.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExecutionResult}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ExecutionResult> {
		private List<ExecutionResultAction> actions;

		private ExecutionResultCondition condition;

		private Long executionDuration;

		private DateTime executionTime;

		private ExecutionResultInput input;

		/**
		 * Required - API name: {@code actions}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>actions</code>.
		 */
		public final Builder actions(List<ExecutionResultAction> list) {
			this.actions = _listAddAll(this.actions, list);
			return this;
		}

		/**
		 * Required - API name: {@code actions}
		 * <p>
		 * Adds one or more values to <code>actions</code>.
		 */
		public final Builder actions(ExecutionResultAction value, ExecutionResultAction... values) {
			this.actions = _listAdd(this.actions, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code actions}
		 * <p>
		 * Adds a value to <code>actions</code> using a builder lambda.
		 */
		public final Builder actions(Function<ExecutionResultAction.Builder, ObjectBuilder<ExecutionResultAction>> fn) {
			return actions(fn.apply(new ExecutionResultAction.Builder()).build());
		}

		/**
		 * Required - API name: {@code condition}
		 */
		public final Builder condition(ExecutionResultCondition value) {
			this.condition = value;
			return this;
		}

		/**
		 * Required - API name: {@code condition}
		 */
		public final Builder condition(
				Function<ExecutionResultCondition.Builder, ObjectBuilder<ExecutionResultCondition>> fn) {
			return this.condition(fn.apply(new ExecutionResultCondition.Builder()).build());
		}

		/**
		 * Required - API name: {@code execution_duration}
		 */
		public final Builder executionDuration(long value) {
			this.executionDuration = value;
			return this;
		}

		/**
		 * Required - API name: {@code execution_time}
		 */
		public final Builder executionTime(DateTime value) {
			this.executionTime = value;
			return this;
		}

		/**
		 * Required - API name: {@code input}
		 */
		public final Builder input(ExecutionResultInput value) {
			this.input = value;
			return this;
		}

		/**
		 * Required - API name: {@code input}
		 */
		public final Builder input(Function<ExecutionResultInput.Builder, ObjectBuilder<ExecutionResultInput>> fn) {
			return this.input(fn.apply(new ExecutionResultInput.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ExecutionResult}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExecutionResult build() {
			_checkSingleUse();

			return new ExecutionResult(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ExecutionResult}
	 */
	public static final JsonpDeserializer<ExecutionResult> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ExecutionResult::setupExecutionResultDeserializer);

	protected static void setupExecutionResultDeserializer(ObjectDeserializer<ExecutionResult.Builder> op) {

		op.add(Builder::actions, JsonpDeserializer.arrayDeserializer(ExecutionResultAction._DESERIALIZER), "actions");
		op.add(Builder::condition, ExecutionResultCondition._DESERIALIZER, "condition");
		op.add(Builder::executionDuration, JsonpDeserializer.longDeserializer(), "execution_duration");
		op.add(Builder::executionTime, DateTime._DESERIALIZER, "execution_time");
		op.add(Builder::input, ExecutionResultInput._DESERIALIZER, "input");

	}

}
