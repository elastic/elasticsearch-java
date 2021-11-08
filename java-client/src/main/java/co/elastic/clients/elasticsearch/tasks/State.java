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
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: tasks._types.State
@JsonpDeserializable
public class State implements JsonpSerializable {
	private final String action;

	private final boolean cancellable;

	@Nullable
	private final String description;

	private final Map<String, List<String>> headers;

	private final long id;

	private final String node;

	@Nullable
	private final String parentTaskId;

	private final long runningTimeInNanos;

	private final long startTimeInMillis;

	@Nullable
	private final Status status;

	private final String type;

	// ---------------------------------------------------------------------------------------------

	private State(Builder builder) {

		this.action = ModelTypeHelper.requireNonNull(builder.action, this, "action");
		this.cancellable = ModelTypeHelper.requireNonNull(builder.cancellable, this, "cancellable");
		this.description = builder.description;
		this.headers = ModelTypeHelper.unmodifiableRequired(builder.headers, this, "headers");
		this.id = ModelTypeHelper.requireNonNull(builder.id, this, "id");
		this.node = ModelTypeHelper.requireNonNull(builder.node, this, "node");
		this.parentTaskId = builder.parentTaskId;
		this.runningTimeInNanos = ModelTypeHelper.requireNonNull(builder.runningTimeInNanos, this,
				"runningTimeInNanos");
		this.startTimeInMillis = ModelTypeHelper.requireNonNull(builder.startTimeInMillis, this, "startTimeInMillis");
		this.status = builder.status;
		this.type = ModelTypeHelper.requireNonNull(builder.type, this, "type");

	}

	public static State of(Function<Builder, ObjectBuilder<State>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code action}
	 */
	public final String action() {
		return this.action;
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
	public final Map<String, List<String>> headers() {
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
	 * API name: {@code parent_task_id}
	 */
	@Nullable
	public final String parentTaskId() {
		return this.parentTaskId;
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
	public final Status status() {
		return this.status;
	}

	/**
	 * Required - API name: {@code type}
	 */
	public final String type() {
		return this.type;
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

		generator.writeKey("cancellable");
		generator.write(this.cancellable);

		if (this.description != null) {
			generator.writeKey("description");
			generator.write(this.description);

		}
		if (ModelTypeHelper.isDefined(this.headers)) {
			generator.writeKey("headers");
			generator.writeStartObject();
			for (Map.Entry<String, List<String>> item0 : this.headers.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.writeStartArray();
				if (item0.getValue() != null) {
					for (String item1 : item0.getValue()) {
						generator.write(item1);

					}
				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}
		generator.writeKey("id");
		generator.write(this.id);

		generator.writeKey("node");
		generator.write(this.node);

		if (this.parentTaskId != null) {
			generator.writeKey("parent_task_id");
			generator.write(this.parentTaskId);

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

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link State}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<State> {
		private String action;

		private Boolean cancellable;

		@Nullable
		private String description;

		private Map<String, List<String>> headers;

		private Long id;

		private String node;

		@Nullable
		private String parentTaskId;

		private Long runningTimeInNanos;

		private Long startTimeInMillis;

		@Nullable
		private Status status;

		private String type;

		/**
		 * Required - API name: {@code action}
		 */
		public final Builder action(String value) {
			this.action = value;
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
		 */
		public final Builder headers(Map<String, List<String>> value) {
			this.headers = value;
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
		 * API name: {@code parent_task_id}
		 */
		public final Builder parentTaskId(@Nullable String value) {
			this.parentTaskId = value;
			return this;
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
		 * API name: {@code status}
		 */
		public final Builder status(@Nullable Status value) {
			this.status = value;
			return this;
		}

		/**
		 * API name: {@code status}
		 */
		public final Builder status(Function<Status.Builder, ObjectBuilder<Status>> fn) {
			return this.status(fn.apply(new Status.Builder()).build());
		}

		/**
		 * Required - API name: {@code type}
		 */
		public final Builder type(String value) {
			this.type = value;
			return this;
		}

		/**
		 * Builds a {@link State}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public State build() {
			_checkSingleUse();

			return new State(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link State}
	 */
	public static final JsonpDeserializer<State> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			State::setupStateDeserializer, Builder::build);

	protected static void setupStateDeserializer(DelegatingDeserializer<State.Builder> op) {

		op.add(Builder::action, JsonpDeserializer.stringDeserializer(), "action");
		op.add(Builder::cancellable, JsonpDeserializer.booleanDeserializer(), "cancellable");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::headers, JsonpDeserializer.stringMapDeserializer(
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer())), "headers");
		op.add(Builder::id, JsonpDeserializer.longDeserializer(), "id");
		op.add(Builder::node, JsonpDeserializer.stringDeserializer(), "node");
		op.add(Builder::parentTaskId, JsonpDeserializer.stringDeserializer(), "parent_task_id");
		op.add(Builder::runningTimeInNanos, JsonpDeserializer.longDeserializer(), "running_time_in_nanos");
		op.add(Builder::startTimeInMillis, JsonpDeserializer.longDeserializer(), "start_time_in_millis");
		op.add(Builder::status, Status._DESERIALIZER, "status");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");

	}

}
