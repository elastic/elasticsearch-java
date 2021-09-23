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

package co.elastic.clients.elasticsearch.watcher.execute_watch;

import co.elastic.clients.elasticsearch.watcher.Condition;
import co.elastic.clients.elasticsearch.watcher.ExecutionResult;
import co.elastic.clients.elasticsearch.watcher.ExecutionStatus;
import co.elastic.clients.elasticsearch.watcher.Input;
import co.elastic.clients.elasticsearch.watcher.TriggerEventResult;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher.execute_watch.WatchRecord
public final class WatchRecord implements JsonpSerializable {
	private final Condition condition;

	private final Input input;

	private final List<String> messages;

	private final Map<String, JsonData> metadata;

	private final String node;

	private final ExecutionResult result;

	private final ExecutionStatus state;

	private final TriggerEventResult triggerEvent;

	private final String user;

	private final String watchId;

	// ---------------------------------------------------------------------------------------------

	public WatchRecord(Builder builder) {

		this.condition = Objects.requireNonNull(builder.condition, "condition");
		this.input = Objects.requireNonNull(builder.input, "input");
		this.messages = Objects.requireNonNull(builder.messages, "messages");
		this.metadata = Objects.requireNonNull(builder.metadata, "metadata");
		this.node = Objects.requireNonNull(builder.node, "node");
		this.result = Objects.requireNonNull(builder.result, "result");
		this.state = Objects.requireNonNull(builder.state, "state");
		this.triggerEvent = Objects.requireNonNull(builder.triggerEvent, "trigger_event");
		this.user = Objects.requireNonNull(builder.user, "user");
		this.watchId = Objects.requireNonNull(builder.watchId, "watch_id");

	}

	/**
	 * API name: {@code condition}
	 */
	public Condition condition() {
		return this.condition;
	}

	/**
	 * API name: {@code input}
	 */
	public Input input() {
		return this.input;
	}

	/**
	 * API name: {@code messages}
	 */
	public List<String> messages() {
		return this.messages;
	}

	/**
	 * API name: {@code metadata}
	 */
	public Map<String, JsonData> metadata() {
		return this.metadata;
	}

	/**
	 * API name: {@code node}
	 */
	public String node() {
		return this.node;
	}

	/**
	 * API name: {@code result}
	 */
	public ExecutionResult result() {
		return this.result;
	}

	/**
	 * API name: {@code state}
	 */
	public ExecutionStatus state() {
		return this.state;
	}

	/**
	 * API name: {@code trigger_event}
	 */
	public TriggerEventResult triggerEvent() {
		return this.triggerEvent;
	}

	/**
	 * API name: {@code user}
	 */
	public String user() {
		return this.user;
	}

	/**
	 * API name: {@code watch_id}
	 */
	public String watchId() {
		return this.watchId;
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

		generator.writeKey("condition");
		this.condition.serialize(generator, mapper);

		generator.writeKey("input");
		this.input.serialize(generator, mapper);

		generator.writeKey("messages");
		generator.writeStartArray();
		for (String item0 : this.messages) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("metadata");
		generator.writeStartObject();
		for (Map.Entry<String, JsonData> item0 : this.metadata.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("node");
		generator.write(this.node);

		generator.writeKey("result");
		this.result.serialize(generator, mapper);

		generator.writeKey("state");
		this.state.serialize(generator, mapper);

		generator.writeKey("trigger_event");
		this.triggerEvent.serialize(generator, mapper);

		generator.writeKey("user");
		generator.write(this.user);

		generator.writeKey("watch_id");
		generator.write(this.watchId);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link WatchRecord}.
	 */
	public static class Builder implements ObjectBuilder<WatchRecord> {
		private Condition condition;

		private Input input;

		private List<String> messages;

		private Map<String, JsonData> metadata;

		private String node;

		private ExecutionResult result;

		private ExecutionStatus state;

		private TriggerEventResult triggerEvent;

		private String user;

		private String watchId;

		/**
		 * API name: {@code condition}
		 */
		public Builder condition(Condition value) {
			this.condition = value;
			return this;
		}

		/**
		 * API name: {@code condition}
		 */
		public Builder condition(Function<Condition.Builder, ObjectBuilder<Condition>> fn) {
			return this.condition(fn.apply(new Condition.Builder()).build());
		}

		/**
		 * API name: {@code input}
		 */
		public Builder input(Input value) {
			this.input = value;
			return this;
		}

		/**
		 * API name: {@code input}
		 */
		public Builder input(Function<Input.Builder, ObjectBuilder<Input>> fn) {
			return this.input(fn.apply(new Input.Builder()).build());
		}

		/**
		 * API name: {@code messages}
		 */
		public Builder messages(List<String> value) {
			this.messages = value;
			return this;
		}

		/**
		 * API name: {@code messages}
		 */
		public Builder messages(String... value) {
			this.messages = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #messages(List)}, creating the list if needed.
		 */
		public Builder addMessages(String value) {
			if (this.messages == null) {
				this.messages = new ArrayList<>();
			}
			this.messages.add(value);
			return this;
		}

		/**
		 * API name: {@code metadata}
		 */
		public Builder metadata(Map<String, JsonData> value) {
			this.metadata = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #metadata(Map)}, creating the map if needed.
		 */
		public Builder putMetadata(String key, JsonData value) {
			if (this.metadata == null) {
				this.metadata = new HashMap<>();
			}
			this.metadata.put(key, value);
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
		 * API name: {@code result}
		 */
		public Builder result(ExecutionResult value) {
			this.result = value;
			return this;
		}

		/**
		 * API name: {@code result}
		 */
		public Builder result(Function<ExecutionResult.Builder, ObjectBuilder<ExecutionResult>> fn) {
			return this.result(fn.apply(new ExecutionResult.Builder()).build());
		}

		/**
		 * API name: {@code state}
		 */
		public Builder state(ExecutionStatus value) {
			this.state = value;
			return this;
		}

		/**
		 * API name: {@code trigger_event}
		 */
		public Builder triggerEvent(TriggerEventResult value) {
			this.triggerEvent = value;
			return this;
		}

		/**
		 * API name: {@code trigger_event}
		 */
		public Builder triggerEvent(Function<TriggerEventResult.Builder, ObjectBuilder<TriggerEventResult>> fn) {
			return this.triggerEvent(fn.apply(new TriggerEventResult.Builder()).build());
		}

		/**
		 * API name: {@code user}
		 */
		public Builder user(String value) {
			this.user = value;
			return this;
		}

		/**
		 * API name: {@code watch_id}
		 */
		public Builder watchId(String value) {
			this.watchId = value;
			return this;
		}

		/**
		 * Builds a {@link WatchRecord}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public WatchRecord build() {

			return new WatchRecord(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link WatchRecord}
	 */
	public static final JsonpDeserializer<WatchRecord> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, WatchRecord::setupWatchRecordDeserializer);

	protected static void setupWatchRecordDeserializer(DelegatingDeserializer<WatchRecord.Builder> op) {

		op.add(Builder::condition, Condition.DESERIALIZER, "condition");
		op.add(Builder::input, Input.DESERIALIZER, "input");
		op.add(Builder::messages, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"messages");
		op.add(Builder::metadata, JsonpDeserializer.stringMapDeserializer(JsonData.DESERIALIZER), "metadata");
		op.add(Builder::node, JsonpDeserializer.stringDeserializer(), "node");
		op.add(Builder::result, ExecutionResult.DESERIALIZER, "result");
		op.add(Builder::state, ExecutionStatus.DESERIALIZER, "state");
		op.add(Builder::triggerEvent, TriggerEventResult.DESERIALIZER, "trigger_event");
		op.add(Builder::user, JsonpDeserializer.stringDeserializer(), "user");
		op.add(Builder::watchId, JsonpDeserializer.stringDeserializer(), "watch_id");

	}

}
