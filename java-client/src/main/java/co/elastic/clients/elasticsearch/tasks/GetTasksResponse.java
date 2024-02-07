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
import co.elastic.clients.json.JsonData;
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
import java.lang.Boolean;
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

// typedef: tasks.get.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#tasks.get.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetTasksResponse implements JsonpSerializable {
	private final boolean completed;

	private final TaskInfo task;

	@Nullable
	private final JsonData response;

	@Nullable
	private final ErrorCause error;

	// ---------------------------------------------------------------------------------------------

	private GetTasksResponse(Builder builder) {

		this.completed = ApiTypeHelper.requireNonNull(builder.completed, this, "completed");
		this.task = ApiTypeHelper.requireNonNull(builder.task, this, "task");
		this.response = builder.response;
		this.error = builder.error;

	}

	public static GetTasksResponse of(Function<Builder, ObjectBuilder<GetTasksResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code completed}
	 */
	public final boolean completed() {
		return this.completed;
	}

	/**
	 * Required - API name: {@code task}
	 */
	public final TaskInfo task() {
		return this.task;
	}

	/**
	 * API name: {@code response}
	 */
	@Nullable
	public final JsonData response() {
		return this.response;
	}

	/**
	 * API name: {@code error}
	 */
	@Nullable
	public final ErrorCause error() {
		return this.error;
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

		generator.writeKey("completed");
		generator.write(this.completed);

		generator.writeKey("task");
		this.task.serialize(generator, mapper);

		if (this.response != null) {
			generator.writeKey("response");
			this.response.serialize(generator, mapper);

		}
		if (this.error != null) {
			generator.writeKey("error");
			this.error.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetTasksResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<GetTasksResponse> {
		private Boolean completed;

		private TaskInfo task;

		@Nullable
		private JsonData response;

		@Nullable
		private ErrorCause error;

		/**
		 * Required - API name: {@code completed}
		 */
		public final Builder completed(boolean value) {
			this.completed = value;
			return this;
		}

		/**
		 * Required - API name: {@code task}
		 */
		public final Builder task(TaskInfo value) {
			this.task = value;
			return this;
		}

		/**
		 * Required - API name: {@code task}
		 */
		public final Builder task(Function<TaskInfo.Builder, ObjectBuilder<TaskInfo>> fn) {
			return this.task(fn.apply(new TaskInfo.Builder()).build());
		}

		/**
		 * API name: {@code response}
		 */
		public final Builder response(@Nullable JsonData value) {
			this.response = value;
			return this;
		}

		/**
		 * API name: {@code error}
		 */
		public final Builder error(@Nullable ErrorCause value) {
			this.error = value;
			return this;
		}

		/**
		 * API name: {@code error}
		 */
		public final Builder error(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn) {
			return this.error(fn.apply(new ErrorCause.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetTasksResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetTasksResponse build() {
			_checkSingleUse();

			return new GetTasksResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetTasksResponse}
	 */
	public static final JsonpDeserializer<GetTasksResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			GetTasksResponse::setupGetTasksResponseDeserializer);

	protected static void setupGetTasksResponseDeserializer(ObjectDeserializer<GetTasksResponse.Builder> op) {

		op.add(Builder::completed, JsonpDeserializer.booleanDeserializer(), "completed");
		op.add(Builder::task, TaskInfo._DESERIALIZER, "task");
		op.add(Builder::response, JsonData._DESERIALIZER, "response");
		op.add(Builder::error, ErrorCause._DESERIALIZER, "error");

	}

}
