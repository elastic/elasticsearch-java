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

package co.elastic.clients.elasticsearch._core.reindex_rethrottle;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.reindex_rethrottle.ReindexTask
@JsonpDeserializable
public final class ReindexTask implements JsonpSerializable {
	private final String action;

	private final Boolean cancellable;

	private final String description;

	private final Long id;

	private final String node;

	private final Long runningTimeInNanos;

	private final Long startTimeInMillis;

	private final ReindexStatus status;

	private final String type;

	private final Map<String, List<String>> headers;

	// ---------------------------------------------------------------------------------------------

	public ReindexTask(Builder builder) {

		this.action = Objects.requireNonNull(builder.action, "action");
		this.cancellable = Objects.requireNonNull(builder.cancellable, "cancellable");
		this.description = Objects.requireNonNull(builder.description, "description");
		this.id = Objects.requireNonNull(builder.id, "id");
		this.node = Objects.requireNonNull(builder.node, "node");
		this.runningTimeInNanos = Objects.requireNonNull(builder.runningTimeInNanos, "running_time_in_nanos");
		this.startTimeInMillis = Objects.requireNonNull(builder.startTimeInMillis, "start_time_in_millis");
		this.status = Objects.requireNonNull(builder.status, "status");
		this.type = Objects.requireNonNull(builder.type, "type");
		this.headers = Objects.requireNonNull(builder.headers, "headers");

	}

	/**
	 * API name: {@code action}
	 */
	public String action() {
		return this.action;
	}

	/**
	 * API name: {@code cancellable}
	 */
	public Boolean cancellable() {
		return this.cancellable;
	}

	/**
	 * API name: {@code description}
	 */
	public String description() {
		return this.description;
	}

	/**
	 * API name: {@code id}
	 */
	public Long id() {
		return this.id;
	}

	/**
	 * API name: {@code node}
	 */
	public String node() {
		return this.node;
	}

	/**
	 * API name: {@code running_time_in_nanos}
	 */
	public Long runningTimeInNanos() {
		return this.runningTimeInNanos;
	}

	/**
	 * API name: {@code start_time_in_millis}
	 */
	public Long startTimeInMillis() {
		return this.startTimeInMillis;
	}

	/**
	 * API name: {@code status}
	 */
	public ReindexStatus status() {
		return this.status;
	}

	/**
	 * API name: {@code type}
	 */
	public String type() {
		return this.type;
	}

	/**
	 * API name: {@code headers}
	 */
	public Map<String, List<String>> headers() {
		return this.headers;
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

		generator.writeKey("description");
		generator.write(this.description);

		generator.writeKey("id");
		generator.write(this.id);

		generator.writeKey("node");
		generator.write(this.node);

		generator.writeKey("running_time_in_nanos");
		generator.write(this.runningTimeInNanos);

		generator.writeKey("start_time_in_millis");
		generator.write(this.startTimeInMillis);

		generator.writeKey("status");
		this.status.serialize(generator, mapper);

		generator.writeKey("type");
		generator.write(this.type);

		generator.writeKey("headers");
		generator.writeStartObject();
		for (Map.Entry<String, List<String>> item0 : this.headers.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.writeStartArray();
			for (String item1 : item0.getValue()) {
				generator.write(item1);

			}
			generator.writeEnd();

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ReindexTask}.
	 */
	public static class Builder implements ObjectBuilder<ReindexTask> {
		private String action;

		private Boolean cancellable;

		private String description;

		private Long id;

		private String node;

		private Long runningTimeInNanos;

		private Long startTimeInMillis;

		private ReindexStatus status;

		private String type;

		private Map<String, List<String>> headers;

		/**
		 * API name: {@code action}
		 */
		public Builder action(String value) {
			this.action = value;
			return this;
		}

		/**
		 * API name: {@code cancellable}
		 */
		public Builder cancellable(Boolean value) {
			this.cancellable = value;
			return this;
		}

		/**
		 * API name: {@code description}
		 */
		public Builder description(String value) {
			this.description = value;
			return this;
		}

		/**
		 * API name: {@code id}
		 */
		public Builder id(Long value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code node}
		 */
		public Builder node(String value) {
			this.node = value;
			return this;
		}

		/**
		 * API name: {@code running_time_in_nanos}
		 */
		public Builder runningTimeInNanos(Long value) {
			this.runningTimeInNanos = value;
			return this;
		}

		/**
		 * API name: {@code start_time_in_millis}
		 */
		public Builder startTimeInMillis(Long value) {
			this.startTimeInMillis = value;
			return this;
		}

		/**
		 * API name: {@code status}
		 */
		public Builder status(ReindexStatus value) {
			this.status = value;
			return this;
		}

		/**
		 * API name: {@code status}
		 */
		public Builder status(Function<ReindexStatus.Builder, ObjectBuilder<ReindexStatus>> fn) {
			return this.status(fn.apply(new ReindexStatus.Builder()).build());
		}

		/**
		 * API name: {@code type}
		 */
		public Builder type(String value) {
			this.type = value;
			return this;
		}

		/**
		 * API name: {@code headers}
		 */
		public Builder headers(Map<String, List<String>> value) {
			this.headers = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #headers(Map)}, creating the map if needed.
		 */
		public Builder putHeaders(String key, List<String> value) {
			if (this.headers == null) {
				this.headers = new HashMap<>();
			}
			this.headers.put(key, value);
			return this;
		}

		/**
		 * Builds a {@link ReindexTask}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ReindexTask build() {

			return new ReindexTask(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ReindexTask}
	 */
	public static final JsonpDeserializer<ReindexTask> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ReindexTask::setupReindexTaskDeserializer, Builder::build);

	protected static void setupReindexTaskDeserializer(DelegatingDeserializer<ReindexTask.Builder> op) {

		op.add(Builder::action, JsonpDeserializer.stringDeserializer(), "action");
		op.add(Builder::cancellable, JsonpDeserializer.booleanDeserializer(), "cancellable");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::id, JsonpDeserializer.longDeserializer(), "id");
		op.add(Builder::node, JsonpDeserializer.stringDeserializer(), "node");
		op.add(Builder::runningTimeInNanos, JsonpDeserializer.longDeserializer(), "running_time_in_nanos");
		op.add(Builder::startTimeInMillis, JsonpDeserializer.longDeserializer(), "start_time_in_millis");
		op.add(Builder::status, ReindexStatus._DESERIALIZER, "status");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");
		op.add(Builder::headers, JsonpDeserializer.stringMapDeserializer(
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer())), "headers");

	}

}
