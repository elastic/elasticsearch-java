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

package co.elastic.clients.elasticsearch.rollup.delete_job;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: rollup.delete_job.TaskFailure
@JsonpDeserializable
public class TaskFailure implements JsonpSerializable {
	private final String taskId;

	private final String nodeId;

	private final String status;

	private final TaskFailureReason reason;

	// ---------------------------------------------------------------------------------------------

	private TaskFailure(Builder builder) {

		this.taskId = ModelTypeHelper.requireNonNull(builder.taskId, this, "taskId");
		this.nodeId = ModelTypeHelper.requireNonNull(builder.nodeId, this, "nodeId");
		this.status = ModelTypeHelper.requireNonNull(builder.status, this, "status");
		this.reason = ModelTypeHelper.requireNonNull(builder.reason, this, "reason");

	}

	public static TaskFailure of(Function<Builder, ObjectBuilder<TaskFailure>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code task_id}
	 */
	public final String taskId() {
		return this.taskId;
	}

	/**
	 * Required - API name: {@code node_id}
	 */
	public final String nodeId() {
		return this.nodeId;
	}

	/**
	 * Required - API name: {@code status}
	 */
	public final String status() {
		return this.status;
	}

	/**
	 * Required - API name: {@code reason}
	 */
	public final TaskFailureReason reason() {
		return this.reason;
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

		generator.writeKey("task_id");
		generator.write(this.taskId);

		generator.writeKey("node_id");
		generator.write(this.nodeId);

		generator.writeKey("status");
		generator.write(this.status);

		generator.writeKey("reason");
		this.reason.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TaskFailure}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<TaskFailure> {
		private String taskId;

		private String nodeId;

		private String status;

		private TaskFailureReason reason;

		/**
		 * Required - API name: {@code task_id}
		 */
		public final Builder taskId(String value) {
			this.taskId = value;
			return this;
		}

		/**
		 * Required - API name: {@code node_id}
		 */
		public final Builder nodeId(String value) {
			this.nodeId = value;
			return this;
		}

		/**
		 * Required - API name: {@code status}
		 */
		public final Builder status(String value) {
			this.status = value;
			return this;
		}

		/**
		 * Required - API name: {@code reason}
		 */
		public final Builder reason(TaskFailureReason value) {
			this.reason = value;
			return this;
		}

		/**
		 * Required - API name: {@code reason}
		 */
		public final Builder reason(Function<TaskFailureReason.Builder, ObjectBuilder<TaskFailureReason>> fn) {
			return this.reason(fn.apply(new TaskFailureReason.Builder()).build());
		}

		/**
		 * Builds a {@link TaskFailure}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TaskFailure build() {
			_checkSingleUse();

			return new TaskFailure(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TaskFailure}
	 */
	public static final JsonpDeserializer<TaskFailure> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			TaskFailure::setupTaskFailureDeserializer, Builder::build);

	protected static void setupTaskFailureDeserializer(DelegatingDeserializer<TaskFailure.Builder> op) {

		op.add(Builder::taskId, JsonpDeserializer.stringDeserializer(), "task_id");
		op.add(Builder::nodeId, JsonpDeserializer.stringDeserializer(), "node_id");
		op.add(Builder::status, JsonpDeserializer.stringDeserializer(), "status");
		op.add(Builder::reason, TaskFailureReason._DESERIALIZER, "reason");

	}

}
