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

package co.elastic.clients.elasticsearch.cluster;

import co.elastic.clients.elasticsearch.cluster.pending_tasks.PendingTask;
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
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.pending_tasks.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#cluster.pending_tasks.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class PendingTasksResponse implements JsonpSerializable {
	private final List<PendingTask> tasks;

	// ---------------------------------------------------------------------------------------------

	private PendingTasksResponse(Builder builder) {

		this.tasks = ApiTypeHelper.unmodifiableRequired(builder.tasks, this, "tasks");

	}

	public static PendingTasksResponse of(Function<Builder, ObjectBuilder<PendingTasksResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code tasks}
	 */
	public final List<PendingTask> tasks() {
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

		if (ApiTypeHelper.isDefined(this.tasks)) {
			generator.writeKey("tasks");
			generator.writeStartArray();
			for (PendingTask item0 : this.tasks) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PendingTasksResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<PendingTasksResponse> {
		private List<PendingTask> tasks;

		/**
		 * Required - API name: {@code tasks}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>tasks</code>.
		 */
		public final Builder tasks(List<PendingTask> list) {
			this.tasks = _listAddAll(this.tasks, list);
			return this;
		}

		/**
		 * Required - API name: {@code tasks}
		 * <p>
		 * Adds one or more values to <code>tasks</code>.
		 */
		public final Builder tasks(PendingTask value, PendingTask... values) {
			this.tasks = _listAdd(this.tasks, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code tasks}
		 * <p>
		 * Adds a value to <code>tasks</code> using a builder lambda.
		 */
		public final Builder tasks(Function<PendingTask.Builder, ObjectBuilder<PendingTask>> fn) {
			return tasks(fn.apply(new PendingTask.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PendingTasksResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PendingTasksResponse build() {
			_checkSingleUse();

			return new PendingTasksResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PendingTasksResponse}
	 */
	public static final JsonpDeserializer<PendingTasksResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PendingTasksResponse::setupPendingTasksResponseDeserializer);

	protected static void setupPendingTasksResponseDeserializer(ObjectDeserializer<PendingTasksResponse.Builder> op) {

		op.add(Builder::tasks, JsonpDeserializer.arrayDeserializer(PendingTask._DESERIALIZER), "tasks");

	}

}
