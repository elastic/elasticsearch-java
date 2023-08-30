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

package co.elastic.clients.elasticsearch.cat.tasks;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cat.tasks.TasksRecord

/**
 *
 * @see <a href="../../doc-files/api-spec.html#cat.tasks.TasksRecord">API
 *      specification</a>
 */
@JsonpDeserializable
public class TasksRecord implements JsonpSerializable {
	@Nullable
	private final String id;

	@Nullable
	private final String action;

	@Nullable
	private final String taskId;

	@Nullable
	private final String parentTaskId;

	@Nullable
	private final String type;

	@Nullable
	private final String startTime;

	@Nullable
	private final String timestamp;

	@Nullable
	private final String runningTimeNs;

	@Nullable
	private final String runningTime;

	@Nullable
	private final String nodeId;

	@Nullable
	private final String ip;

	@Nullable
	private final String port;

	@Nullable
	private final String node;

	@Nullable
	private final String version;

	@Nullable
	private final String xOpaqueId;

	@Nullable
	private final String description;

	// ---------------------------------------------------------------------------------------------

	private TasksRecord(Builder builder) {

		this.id = builder.id;
		this.action = builder.action;
		this.taskId = builder.taskId;
		this.parentTaskId = builder.parentTaskId;
		this.type = builder.type;
		this.startTime = builder.startTime;
		this.timestamp = builder.timestamp;
		this.runningTimeNs = builder.runningTimeNs;
		this.runningTime = builder.runningTime;
		this.nodeId = builder.nodeId;
		this.ip = builder.ip;
		this.port = builder.port;
		this.node = builder.node;
		this.version = builder.version;
		this.xOpaqueId = builder.xOpaqueId;
		this.description = builder.description;

	}

	public static TasksRecord of(Function<Builder, ObjectBuilder<TasksRecord>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The identifier of the task with the node.
	 * <p>
	 * API name: {@code id}
	 */
	@Nullable
	public final String id() {
		return this.id;
	}

	/**
	 * The task action.
	 * <p>
	 * API name: {@code action}
	 */
	@Nullable
	public final String action() {
		return this.action;
	}

	/**
	 * The unique task identifier.
	 * <p>
	 * API name: {@code task_id}
	 */
	@Nullable
	public final String taskId() {
		return this.taskId;
	}

	/**
	 * The parent task identifier.
	 * <p>
	 * API name: {@code parent_task_id}
	 */
	@Nullable
	public final String parentTaskId() {
		return this.parentTaskId;
	}

	/**
	 * The task type.
	 * <p>
	 * API name: {@code type}
	 */
	@Nullable
	public final String type() {
		return this.type;
	}

	/**
	 * The start time in milliseconds.
	 * <p>
	 * API name: {@code start_time}
	 */
	@Nullable
	public final String startTime() {
		return this.startTime;
	}

	/**
	 * The start time in <code>HH:MM:SS</code> format.
	 * <p>
	 * API name: {@code timestamp}
	 */
	@Nullable
	public final String timestamp() {
		return this.timestamp;
	}

	/**
	 * The running time in nanoseconds.
	 * <p>
	 * API name: {@code running_time_ns}
	 */
	@Nullable
	public final String runningTimeNs() {
		return this.runningTimeNs;
	}

	/**
	 * The running time.
	 * <p>
	 * API name: {@code running_time}
	 */
	@Nullable
	public final String runningTime() {
		return this.runningTime;
	}

	/**
	 * The unique node identifier.
	 * <p>
	 * API name: {@code node_id}
	 */
	@Nullable
	public final String nodeId() {
		return this.nodeId;
	}

	/**
	 * The IP address for the node.
	 * <p>
	 * API name: {@code ip}
	 */
	@Nullable
	public final String ip() {
		return this.ip;
	}

	/**
	 * The bound transport port for the node.
	 * <p>
	 * API name: {@code port}
	 */
	@Nullable
	public final String port() {
		return this.port;
	}

	/**
	 * The node name.
	 * <p>
	 * API name: {@code node}
	 */
	@Nullable
	public final String node() {
		return this.node;
	}

	/**
	 * The Elasticsearch version.
	 * <p>
	 * API name: {@code version}
	 */
	@Nullable
	public final String version() {
		return this.version;
	}

	/**
	 * The X-Opaque-ID header.
	 * <p>
	 * API name: {@code x_opaque_id}
	 */
	@Nullable
	public final String xOpaqueId() {
		return this.xOpaqueId;
	}

	/**
	 * The task action description.
	 * <p>
	 * API name: {@code description}
	 */
	@Nullable
	public final String description() {
		return this.description;
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

		if (this.id != null) {
			generator.writeKey("id");
			generator.write(this.id);

		}
		if (this.action != null) {
			generator.writeKey("action");
			generator.write(this.action);

		}
		if (this.taskId != null) {
			generator.writeKey("task_id");
			generator.write(this.taskId);

		}
		if (this.parentTaskId != null) {
			generator.writeKey("parent_task_id");
			generator.write(this.parentTaskId);

		}
		if (this.type != null) {
			generator.writeKey("type");
			generator.write(this.type);

		}
		if (this.startTime != null) {
			generator.writeKey("start_time");
			generator.write(this.startTime);

		}
		if (this.timestamp != null) {
			generator.writeKey("timestamp");
			generator.write(this.timestamp);

		}
		if (this.runningTimeNs != null) {
			generator.writeKey("running_time_ns");
			generator.write(this.runningTimeNs);

		}
		if (this.runningTime != null) {
			generator.writeKey("running_time");
			generator.write(this.runningTime);

		}
		if (this.nodeId != null) {
			generator.writeKey("node_id");
			generator.write(this.nodeId);

		}
		if (this.ip != null) {
			generator.writeKey("ip");
			generator.write(this.ip);

		}
		if (this.port != null) {
			generator.writeKey("port");
			generator.write(this.port);

		}
		if (this.node != null) {
			generator.writeKey("node");
			generator.write(this.node);

		}
		if (this.version != null) {
			generator.writeKey("version");
			generator.write(this.version);

		}
		if (this.xOpaqueId != null) {
			generator.writeKey("x_opaque_id");
			generator.write(this.xOpaqueId);

		}
		if (this.description != null) {
			generator.writeKey("description");
			generator.write(this.description);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TasksRecord}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<TasksRecord> {
		@Nullable
		private String id;

		@Nullable
		private String action;

		@Nullable
		private String taskId;

		@Nullable
		private String parentTaskId;

		@Nullable
		private String type;

		@Nullable
		private String startTime;

		@Nullable
		private String timestamp;

		@Nullable
		private String runningTimeNs;

		@Nullable
		private String runningTime;

		@Nullable
		private String nodeId;

		@Nullable
		private String ip;

		@Nullable
		private String port;

		@Nullable
		private String node;

		@Nullable
		private String version;

		@Nullable
		private String xOpaqueId;

		@Nullable
		private String description;

		/**
		 * The identifier of the task with the node.
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * The task action.
		 * <p>
		 * API name: {@code action}
		 */
		public final Builder action(@Nullable String value) {
			this.action = value;
			return this;
		}

		/**
		 * The unique task identifier.
		 * <p>
		 * API name: {@code task_id}
		 */
		public final Builder taskId(@Nullable String value) {
			this.taskId = value;
			return this;
		}

		/**
		 * The parent task identifier.
		 * <p>
		 * API name: {@code parent_task_id}
		 */
		public final Builder parentTaskId(@Nullable String value) {
			this.parentTaskId = value;
			return this;
		}

		/**
		 * The task type.
		 * <p>
		 * API name: {@code type}
		 */
		public final Builder type(@Nullable String value) {
			this.type = value;
			return this;
		}

		/**
		 * The start time in milliseconds.
		 * <p>
		 * API name: {@code start_time}
		 */
		public final Builder startTime(@Nullable String value) {
			this.startTime = value;
			return this;
		}

		/**
		 * The start time in <code>HH:MM:SS</code> format.
		 * <p>
		 * API name: {@code timestamp}
		 */
		public final Builder timestamp(@Nullable String value) {
			this.timestamp = value;
			return this;
		}

		/**
		 * The running time in nanoseconds.
		 * <p>
		 * API name: {@code running_time_ns}
		 */
		public final Builder runningTimeNs(@Nullable String value) {
			this.runningTimeNs = value;
			return this;
		}

		/**
		 * The running time.
		 * <p>
		 * API name: {@code running_time}
		 */
		public final Builder runningTime(@Nullable String value) {
			this.runningTime = value;
			return this;
		}

		/**
		 * The unique node identifier.
		 * <p>
		 * API name: {@code node_id}
		 */
		public final Builder nodeId(@Nullable String value) {
			this.nodeId = value;
			return this;
		}

		/**
		 * The IP address for the node.
		 * <p>
		 * API name: {@code ip}
		 */
		public final Builder ip(@Nullable String value) {
			this.ip = value;
			return this;
		}

		/**
		 * The bound transport port for the node.
		 * <p>
		 * API name: {@code port}
		 */
		public final Builder port(@Nullable String value) {
			this.port = value;
			return this;
		}

		/**
		 * The node name.
		 * <p>
		 * API name: {@code node}
		 */
		public final Builder node(@Nullable String value) {
			this.node = value;
			return this;
		}

		/**
		 * The Elasticsearch version.
		 * <p>
		 * API name: {@code version}
		 */
		public final Builder version(@Nullable String value) {
			this.version = value;
			return this;
		}

		/**
		 * The X-Opaque-ID header.
		 * <p>
		 * API name: {@code x_opaque_id}
		 */
		public final Builder xOpaqueId(@Nullable String value) {
			this.xOpaqueId = value;
			return this;
		}

		/**
		 * The task action description.
		 * <p>
		 * API name: {@code description}
		 */
		public final Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TasksRecord}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TasksRecord build() {
			_checkSingleUse();

			return new TasksRecord(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TasksRecord}
	 */
	public static final JsonpDeserializer<TasksRecord> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			TasksRecord::setupTasksRecordDeserializer);

	protected static void setupTasksRecordDeserializer(ObjectDeserializer<TasksRecord.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::action, JsonpDeserializer.stringDeserializer(), "action", "ac");
		op.add(Builder::taskId, JsonpDeserializer.stringDeserializer(), "task_id", "ti");
		op.add(Builder::parentTaskId, JsonpDeserializer.stringDeserializer(), "parent_task_id", "pti");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type", "ty");
		op.add(Builder::startTime, JsonpDeserializer.stringDeserializer(), "start_time", "start");
		op.add(Builder::timestamp, JsonpDeserializer.stringDeserializer(), "timestamp", "ts", "hms", "hhmmss");
		op.add(Builder::runningTimeNs, JsonpDeserializer.stringDeserializer(), "running_time_ns");
		op.add(Builder::runningTime, JsonpDeserializer.stringDeserializer(), "running_time", "time");
		op.add(Builder::nodeId, JsonpDeserializer.stringDeserializer(), "node_id", "ni");
		op.add(Builder::ip, JsonpDeserializer.stringDeserializer(), "ip", "i");
		op.add(Builder::port, JsonpDeserializer.stringDeserializer(), "port", "po");
		op.add(Builder::node, JsonpDeserializer.stringDeserializer(), "node", "n");
		op.add(Builder::version, JsonpDeserializer.stringDeserializer(), "version", "v");
		op.add(Builder::xOpaqueId, JsonpDeserializer.stringDeserializer(), "x_opaque_id", "x");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description", "desc");

	}

}
