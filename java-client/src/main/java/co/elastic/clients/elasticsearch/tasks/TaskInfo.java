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

import co.elastic.clients.elasticsearch._types.Time;
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
import java.lang.Long;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: tasks._types.TaskInfo

/**
 *
 * @see <a href="../doc-files/api-spec.html#tasks._types.TaskInfo">API
 *      specification</a>
 */
@JsonpDeserializable
public class TaskInfo implements JsonpSerializable {
	private final String action;

	@Nullable
	private final Boolean cancelled;

	private final boolean cancellable;

	@Nullable
	private final String description;

	private final Map<String, String> headers;

	private final long id;

	private final String node;

	@Nullable
	private final Time runningTime;

	private final long runningTimeInNanos;

	private final long startTimeInMillis;

	@Nullable
	private final TaskStatus status;

	private final String type;

	@Nullable
	private final String parentTaskId;

	// ---------------------------------------------------------------------------------------------

	protected TaskInfo(AbstractBuilder<?> builder) {

		this.action = ApiTypeHelper.requireNonNull(builder.action, this, "action");
		this.cancelled = builder.cancelled;
		this.cancellable = ApiTypeHelper.requireNonNull(builder.cancellable, this, "cancellable");
		this.description = builder.description;
		this.headers = ApiTypeHelper.unmodifiableRequired(builder.headers, this, "headers");
		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.node = ApiTypeHelper.requireNonNull(builder.node, this, "node");
		this.runningTime = builder.runningTime;
		this.runningTimeInNanos = ApiTypeHelper.requireNonNull(builder.runningTimeInNanos, this, "runningTimeInNanos");
		this.startTimeInMillis = ApiTypeHelper.requireNonNull(builder.startTimeInMillis, this, "startTimeInMillis");
		this.status = builder.status;
		this.type = ApiTypeHelper.requireNonNull(builder.type, this, "type");
		this.parentTaskId = builder.parentTaskId;

	}

	public static TaskInfo taskInfoOf(Function<Builder, ObjectBuilder<TaskInfo>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code action}
	 */
	public final String action() {
		return this.action;
	}

	/**
	 * API name: {@code cancelled}
	 */
	@Nullable
	public final Boolean cancelled() {
		return this.cancelled;
	}

	/**
	 * Required - API name: {@code cancellable}
	 */
	public final boolean cancellable() {
		return this.cancellable;
	}

	/**
	 * API name: {@code description}
	 */
	@Nullable
	public final String description() {
		return this.description;
	}

	/**
	 * Required - API name: {@code headers}
	 */
	public final Map<String, String> headers() {
		return this.headers;
	}

	/**
	 * Required - API name: {@code id}
	 */
	public final long id() {
		return this.id;
	}

	/**
	 * Required - API name: {@code node}
	 */
	public final String node() {
		return this.node;
	}

	/**
	 * API name: {@code running_time}
	 */
	@Nullable
	public final Time runningTime() {
		return this.runningTime;
	}

	/**
	 * Required - API name: {@code running_time_in_nanos}
	 */
	public final long runningTimeInNanos() {
		return this.runningTimeInNanos;
	}

	/**
	 * Required - API name: {@code start_time_in_millis}
	 */
	public final long startTimeInMillis() {
		return this.startTimeInMillis;
	}

	/**
	 * API name: {@code status}
	 */
	@Nullable
	public final TaskStatus status() {
		return this.status;
	}

	/**
	 * Required - API name: {@code type}
	 */
	public final String type() {
		return this.type;
	}

	/**
	 * API name: {@code parent_task_id}
	 */
	@Nullable
	public final String parentTaskId() {
		return this.parentTaskId;
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

		generator.writeKey("action");
		generator.write(this.action);

		if (this.cancelled != null) {
			generator.writeKey("cancelled");
			generator.write(this.cancelled);

		}
		generator.writeKey("cancellable");
		generator.write(this.cancellable);

		if (this.description != null) {
			generator.writeKey("description");
			generator.write(this.description);

		}
		if (ApiTypeHelper.isDefined(this.headers)) {
			generator.writeKey("headers");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.headers.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		generator.writeKey("id");
		generator.write(this.id);

		generator.writeKey("node");
		generator.write(this.node);

		if (this.runningTime != null) {
			generator.writeKey("running_time");
			this.runningTime.serialize(generator, mapper);

		}
		generator.writeKey("running_time_in_nanos");
		generator.write(this.runningTimeInNanos);

		generator.writeKey("start_time_in_millis");
		generator.write(this.startTimeInMillis);

		if (this.status != null) {
			generator.writeKey("status");
			this.status.serialize(generator, mapper);

		}
		generator.writeKey("type");
		generator.write(this.type);

		if (this.parentTaskId != null) {
			generator.writeKey("parent_task_id");
			generator.write(this.parentTaskId);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TaskInfo}.
	 */

	public static class Builder extends TaskInfo.AbstractBuilder<Builder> implements ObjectBuilder<TaskInfo> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TaskInfo}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TaskInfo build() {
			_checkSingleUse();

			return new TaskInfo(this);
		}
	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				WithJsonObjectBuilderBase<BuilderT> {
		private String action;

		@Nullable
		private Boolean cancelled;

		private Boolean cancellable;

		@Nullable
		private String description;

		private Map<String, String> headers;

		private Long id;

		private String node;

		@Nullable
		private Time runningTime;

		private Long runningTimeInNanos;

		private Long startTimeInMillis;

		@Nullable
		private TaskStatus status;

		private String type;

		@Nullable
		private String parentTaskId;

		/**
		 * Required - API name: {@code action}
		 */
		public final BuilderT action(String value) {
			this.action = value;
			return self();
		}

		/**
		 * API name: {@code cancelled}
		 */
		public final BuilderT cancelled(@Nullable Boolean value) {
			this.cancelled = value;
			return self();
		}

		/**
		 * Required - API name: {@code cancellable}
		 */
		public final BuilderT cancellable(boolean value) {
			this.cancellable = value;
			return self();
		}

		/**
		 * API name: {@code description}
		 */
		public final BuilderT description(@Nullable String value) {
			this.description = value;
			return self();
		}

		/**
		 * Required - API name: {@code headers}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>headers</code>.
		 */
		public final BuilderT headers(Map<String, String> map) {
			this.headers = _mapPutAll(this.headers, map);
			return self();
		}

		/**
		 * Required - API name: {@code headers}
		 * <p>
		 * Adds an entry to <code>headers</code>.
		 */
		public final BuilderT headers(String key, String value) {
			this.headers = _mapPut(this.headers, key, value);
			return self();
		}

		/**
		 * Required - API name: {@code id}
		 */
		public final BuilderT id(long value) {
			this.id = value;
			return self();
		}

		/**
		 * Required - API name: {@code node}
		 */
		public final BuilderT node(String value) {
			this.node = value;
			return self();
		}

		/**
		 * API name: {@code running_time}
		 */
		public final BuilderT runningTime(@Nullable Time value) {
			this.runningTime = value;
			return self();
		}

		/**
		 * API name: {@code running_time}
		 */
		public final BuilderT runningTime(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.runningTime(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - API name: {@code running_time_in_nanos}
		 */
		public final BuilderT runningTimeInNanos(long value) {
			this.runningTimeInNanos = value;
			return self();
		}

		/**
		 * Required - API name: {@code start_time_in_millis}
		 */
		public final BuilderT startTimeInMillis(long value) {
			this.startTimeInMillis = value;
			return self();
		}

		/**
		 * API name: {@code status}
		 */
		public final BuilderT status(@Nullable TaskStatus value) {
			this.status = value;
			return self();
		}

		/**
		 * API name: {@code status}
		 */
		public final BuilderT status(Function<TaskStatus.Builder, ObjectBuilder<TaskStatus>> fn) {
			return this.status(fn.apply(new TaskStatus.Builder()).build());
		}

		/**
		 * Required - API name: {@code type}
		 */
		public final BuilderT type(String value) {
			this.type = value;
			return self();
		}

		/**
		 * API name: {@code parent_task_id}
		 */
		public final BuilderT parentTaskId(@Nullable String value) {
			this.parentTaskId = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TaskInfo}
	 */
	public static final JsonpDeserializer<TaskInfo> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			TaskInfo::setupTaskInfoDeserializer);

	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupTaskInfoDeserializer(
			ObjectDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::action, JsonpDeserializer.stringDeserializer(), "action");
		op.add(AbstractBuilder::cancelled, JsonpDeserializer.booleanDeserializer(), "cancelled");
		op.add(AbstractBuilder::cancellable, JsonpDeserializer.booleanDeserializer(), "cancellable");
		op.add(AbstractBuilder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(AbstractBuilder::headers,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()), "headers");
		op.add(AbstractBuilder::id, JsonpDeserializer.longDeserializer(), "id");
		op.add(AbstractBuilder::node, JsonpDeserializer.stringDeserializer(), "node");
		op.add(AbstractBuilder::runningTime, Time._DESERIALIZER, "running_time");
		op.add(AbstractBuilder::runningTimeInNanos, JsonpDeserializer.longDeserializer(), "running_time_in_nanos");
		op.add(AbstractBuilder::startTimeInMillis, JsonpDeserializer.longDeserializer(), "start_time_in_millis");
		op.add(AbstractBuilder::status, TaskStatus._DESERIALIZER, "status");
		op.add(AbstractBuilder::type, JsonpDeserializer.stringDeserializer(), "type");
		op.add(AbstractBuilder::parentTaskId, JsonpDeserializer.stringDeserializer(), "parent_task_id");

	}

}
