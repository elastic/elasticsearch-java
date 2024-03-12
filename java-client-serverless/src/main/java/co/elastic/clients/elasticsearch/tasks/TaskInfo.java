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

import co.elastic.clients.elasticsearch._types.Time;
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
import java.lang.Long;
import java.lang.String;
import java.util.Map;
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
	private final JsonData status;

	private final String type;

	@Nullable
	private final String parentTaskId;

	// ---------------------------------------------------------------------------------------------

	private TaskInfo(Builder builder) {

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

	public static TaskInfo of(Function<Builder, ObjectBuilder<TaskInfo>> fn) {
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
	 * Task status information can vary wildly from task to task.
	 * <p>
	 * API name: {@code status}
	 */
	@Nullable
	public final JsonData status() {
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

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<TaskInfo> {
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
		private JsonData status;

		private String type;

		@Nullable
		private String parentTaskId;

		/**
		 * Required - API name: {@code action}
		 */
		public final Builder action(String value) {
			this.action = value;
			return this;
		}

		/**
		 * API name: {@code cancelled}
		 */
		public final Builder cancelled(@Nullable Boolean value) {
			this.cancelled = value;
			return this;
		}

		/**
		 * Required - API name: {@code cancellable}
		 */
		public final Builder cancellable(boolean value) {
			this.cancellable = value;
			return this;
		}

		/**
		 * API name: {@code description}
		 */
		public final Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * Required - API name: {@code headers}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>headers</code>.
		 */
		public final Builder headers(Map<String, String> map) {
			this.headers = _mapPutAll(this.headers, map);
			return this;
		}

		/**
		 * Required - API name: {@code headers}
		 * <p>
		 * Adds an entry to <code>headers</code>.
		 */
		public final Builder headers(String key, String value) {
			this.headers = _mapPut(this.headers, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code id}
		 */
		public final Builder id(long value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - API name: {@code node}
		 */
		public final Builder node(String value) {
			this.node = value;
			return this;
		}

		/**
		 * API name: {@code running_time}
		 */
		public final Builder runningTime(@Nullable Time value) {
			this.runningTime = value;
			return this;
		}

		/**
		 * API name: {@code running_time}
		 */
		public final Builder runningTime(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.runningTime(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - API name: {@code running_time_in_nanos}
		 */
		public final Builder runningTimeInNanos(long value) {
			this.runningTimeInNanos = value;
			return this;
		}

		/**
		 * Required - API name: {@code start_time_in_millis}
		 */
		public final Builder startTimeInMillis(long value) {
			this.startTimeInMillis = value;
			return this;
		}

		/**
		 * Task status information can vary wildly from task to task.
		 * <p>
		 * API name: {@code status}
		 */
		public final Builder status(@Nullable JsonData value) {
			this.status = value;
			return this;
		}

		/**
		 * Required - API name: {@code type}
		 */
		public final Builder type(String value) {
			this.type = value;
			return this;
		}

		/**
		 * API name: {@code parent_task_id}
		 */
		public final Builder parentTaskId(@Nullable String value) {
			this.parentTaskId = value;
			return this;
		}

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

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TaskInfo}
	 */
	public static final JsonpDeserializer<TaskInfo> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			TaskInfo::setupTaskInfoDeserializer);

	protected static void setupTaskInfoDeserializer(ObjectDeserializer<TaskInfo.Builder> op) {

		op.add(Builder::action, JsonpDeserializer.stringDeserializer(), "action");
		op.add(Builder::cancelled, JsonpDeserializer.booleanDeserializer(), "cancelled");
		op.add(Builder::cancellable, JsonpDeserializer.booleanDeserializer(), "cancellable");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::headers, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"headers");
		op.add(Builder::id, JsonpDeserializer.longDeserializer(), "id");
		op.add(Builder::node, JsonpDeserializer.stringDeserializer(), "node");
		op.add(Builder::runningTime, Time._DESERIALIZER, "running_time");
		op.add(Builder::runningTimeInNanos, JsonpDeserializer.longDeserializer(), "running_time_in_nanos");
		op.add(Builder::startTimeInMillis, JsonpDeserializer.longDeserializer(), "start_time_in_millis");
		op.add(Builder::status, JsonData._DESERIALIZER, "status");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");
		op.add(Builder::parentTaskId, JsonpDeserializer.stringDeserializer(), "parent_task_id");

	}

}
