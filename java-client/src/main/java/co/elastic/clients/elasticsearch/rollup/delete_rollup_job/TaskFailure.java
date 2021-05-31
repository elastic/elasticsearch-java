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

package co.elastic.clients.elasticsearch.rollup.delete_rollup_job;

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: rollup.delete_rollup_job.TaskFailure
public final class TaskFailure implements ToJsonp {
	private final JsonValue taskId;

	private final String nodeId;

	private final String status;

	private final TaskFailureReason reason;

	// ---------------------------------------------------------------------------------------------

	protected TaskFailure(Builder builder) {

		this.taskId = Objects.requireNonNull(builder.taskId, "task_id");
		this.nodeId = Objects.requireNonNull(builder.nodeId, "node_id");
		this.status = Objects.requireNonNull(builder.status, "status");
		this.reason = Objects.requireNonNull(builder.reason, "reason");

	}

	/**
	 * API name: {@code task_id}
	 */
	public JsonValue taskId() {
		return this.taskId;
	}

	/**
	 * API name: {@code node_id}
	 */
	public String nodeId() {
		return this.nodeId;
	}

	/**
	 * API name: {@code status}
	 */
	public String status() {
		return this.status;
	}

	/**
	 * API name: {@code reason}
	 */
	public TaskFailureReason reason() {
		return this.reason;
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

		generator.writeKey("task_id");
		generator.write(this.taskId);

		generator.writeKey("node_id");
		generator.write(this.nodeId);

		generator.writeKey("status");
		generator.write(this.status);

		generator.writeKey("reason");
		this.reason.toJsonp(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TaskFailure}.
	 */
	public static class Builder implements ObjectBuilder<TaskFailure> {
		private JsonValue taskId;

		private String nodeId;

		private String status;

		private TaskFailureReason reason;

		/**
		 * API name: {@code task_id}
		 */
		public Builder taskId(JsonValue value) {
			this.taskId = value;
			return this;
		}

		/**
		 * API name: {@code node_id}
		 */
		public Builder nodeId(String value) {
			this.nodeId = value;
			return this;
		}

		/**
		 * API name: {@code status}
		 */
		public Builder status(String value) {
			this.status = value;
			return this;
		}

		/**
		 * API name: {@code reason}
		 */
		public Builder reason(TaskFailureReason value) {
			this.reason = value;
			return this;
		}

		/**
		 * API name: {@code reason}
		 */
		public Builder reason(Function<TaskFailureReason.Builder, ObjectBuilder<TaskFailureReason>> fn) {
			return this.reason(fn.apply(new TaskFailureReason.Builder()).build());
		}

		/**
		 * Builds a {@link TaskFailure}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TaskFailure build() {

			return new TaskFailure(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for TaskFailure
	 */
	public static final JsonpValueParser<TaskFailure> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, TaskFailure::setupTaskFailureParser);

	protected static void setupTaskFailureParser(DelegatingJsonpValueParser<TaskFailure.Builder> op) {

		op.add(Builder::taskId, JsonpValueParser.jsonValueParser(), "task_id");
		op.add(Builder::nodeId, JsonpValueParser.stringParser(), "node_id");
		op.add(Builder::status, JsonpValueParser.stringParser(), "status");
		op.add(Builder::reason, TaskFailureReason.JSONP_PARSER, "reason");

	}

}
