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

package co.elastic.clients.elasticsearch.watcher.execute_watch;

import co.elastic.clients.elasticsearch._types.ErrorCause;
import co.elastic.clients.elasticsearch.watcher.Condition;
import co.elastic.clients.elasticsearch.watcher.ConditionVariant;
import co.elastic.clients.elasticsearch.watcher.ExecutionResult;
import co.elastic.clients.elasticsearch.watcher.ExecutionStatus;
import co.elastic.clients.elasticsearch.watcher.Input;
import co.elastic.clients.elasticsearch.watcher.InputVariant;
import co.elastic.clients.elasticsearch.watcher.TriggerEventResult;
import co.elastic.clients.elasticsearch.watcher.WatchStatus;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.DateTime;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.List;
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

// typedef: watcher.execute_watch.WatchRecord

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#watcher.execute_watch.WatchRecord">API
 *      specification</a>
 */
@JsonpDeserializable
public class WatchRecord implements JsonpSerializable {
	private final DateTime timestamp;

	private final String node;

	private final ExecutionStatus state;

	private final TriggerEventResult triggerEvent;

	private final String watchId;

	@Nullable
	private final Condition condition;

	@Nullable
	private final Input input;

	private final Map<String, JsonData> metadata;

	@Nullable
	private final ExecutionResult result;

	@Nullable
	private final String user;

	@Nullable
	private final WatchStatus status;

	private final List<String> messages;

	private final Map<String, JsonData> vars;

	@Nullable
	private final ErrorCause exception;

	// ---------------------------------------------------------------------------------------------

	private WatchRecord(Builder builder) {

		this.timestamp = ApiTypeHelper.requireNonNull(builder.timestamp, this, "timestamp");
		this.node = ApiTypeHelper.requireNonNull(builder.node, this, "node");
		this.state = ApiTypeHelper.requireNonNull(builder.state, this, "state");
		this.triggerEvent = ApiTypeHelper.requireNonNull(builder.triggerEvent, this, "triggerEvent");
		this.watchId = ApiTypeHelper.requireNonNull(builder.watchId, this, "watchId");
		this.condition = builder.condition;
		this.input = builder.input;
		this.metadata = ApiTypeHelper.unmodifiable(builder.metadata);
		this.result = builder.result;
		this.user = builder.user;
		this.status = builder.status;
		this.messages = ApiTypeHelper.unmodifiable(builder.messages);
		this.vars = ApiTypeHelper.unmodifiable(builder.vars);
		this.exception = builder.exception;

	}

	public static WatchRecord of(Function<Builder, ObjectBuilder<WatchRecord>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code @timestamp}
	 */
	public final DateTime timestamp() {
		return this.timestamp;
	}

	/**
	 * Required - API name: {@code node}
	 */
	public final String node() {
		return this.node;
	}

	/**
	 * Required - API name: {@code state}
	 */
	public final ExecutionStatus state() {
		return this.state;
	}

	/**
	 * Required - API name: {@code trigger_event}
	 */
	public final TriggerEventResult triggerEvent() {
		return this.triggerEvent;
	}

	/**
	 * Required - API name: {@code watch_id}
	 */
	public final String watchId() {
		return this.watchId;
	}

	/**
	 * API name: {@code condition}
	 */
	@Nullable
	public final Condition condition() {
		return this.condition;
	}

	/**
	 * API name: {@code input}
	 */
	@Nullable
	public final Input input() {
		return this.input;
	}

	/**
	 * API name: {@code metadata}
	 */
	public final Map<String, JsonData> metadata() {
		return this.metadata;
	}

	/**
	 * API name: {@code result}
	 */
	@Nullable
	public final ExecutionResult result() {
		return this.result;
	}

	/**
	 * API name: {@code user}
	 */
	@Nullable
	public final String user() {
		return this.user;
	}

	/**
	 * API name: {@code status}
	 */
	@Nullable
	public final WatchStatus status() {
		return this.status;
	}

	/**
	 * API name: {@code messages}
	 */
	public final List<String> messages() {
		return this.messages;
	}

	/**
	 * API name: {@code vars}
	 */
	public final Map<String, JsonData> vars() {
		return this.vars;
	}

	/**
	 * API name: {@code exception}
	 */
	@Nullable
	public final ErrorCause exception() {
		return this.exception;
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

		generator.writeKey("@timestamp");
		this.timestamp.serialize(generator, mapper);
		generator.writeKey("node");
		generator.write(this.node);

		generator.writeKey("state");
		this.state.serialize(generator, mapper);
		generator.writeKey("trigger_event");
		this.triggerEvent.serialize(generator, mapper);

		generator.writeKey("watch_id");
		generator.write(this.watchId);

		if (this.condition != null) {
			generator.writeKey("condition");
			this.condition.serialize(generator, mapper);

		}
		if (this.input != null) {
			generator.writeKey("input");
			this.input.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.metadata)) {
			generator.writeKey("metadata");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.metadata.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.result != null) {
			generator.writeKey("result");
			this.result.serialize(generator, mapper);

		}
		if (this.user != null) {
			generator.writeKey("user");
			generator.write(this.user);

		}
		if (this.status != null) {
			generator.writeKey("status");
			this.status.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.messages)) {
			generator.writeKey("messages");
			generator.writeStartArray();
			for (String item0 : this.messages) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.vars)) {
			generator.writeKey("vars");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.vars.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.exception != null) {
			generator.writeKey("exception");
			this.exception.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link WatchRecord}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<WatchRecord> {
		private DateTime timestamp;

		private String node;

		private ExecutionStatus state;

		private TriggerEventResult triggerEvent;

		private String watchId;

		@Nullable
		private Condition condition;

		@Nullable
		private Input input;

		@Nullable
		private Map<String, JsonData> metadata;

		@Nullable
		private ExecutionResult result;

		@Nullable
		private String user;

		@Nullable
		private WatchStatus status;

		@Nullable
		private List<String> messages;

		@Nullable
		private Map<String, JsonData> vars;

		@Nullable
		private ErrorCause exception;

		public Builder() {
		}
		private Builder(WatchRecord instance) {
			this.timestamp = instance.timestamp;
			this.node = instance.node;
			this.state = instance.state;
			this.triggerEvent = instance.triggerEvent;
			this.watchId = instance.watchId;
			this.condition = instance.condition;
			this.input = instance.input;
			this.metadata = instance.metadata;
			this.result = instance.result;
			this.user = instance.user;
			this.status = instance.status;
			this.messages = instance.messages;
			this.vars = instance.vars;
			this.exception = instance.exception;

		}
		/**
		 * Required - API name: {@code @timestamp}
		 */
		public final Builder timestamp(DateTime value) {
			this.timestamp = value;
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
		 * Required - API name: {@code state}
		 */
		public final Builder state(ExecutionStatus value) {
			this.state = value;
			return this;
		}

		/**
		 * Required - API name: {@code trigger_event}
		 */
		public final Builder triggerEvent(TriggerEventResult value) {
			this.triggerEvent = value;
			return this;
		}

		/**
		 * Required - API name: {@code trigger_event}
		 */
		public final Builder triggerEvent(Function<TriggerEventResult.Builder, ObjectBuilder<TriggerEventResult>> fn) {
			return this.triggerEvent(fn.apply(new TriggerEventResult.Builder()).build());
		}

		/**
		 * Required - API name: {@code watch_id}
		 */
		public final Builder watchId(String value) {
			this.watchId = value;
			return this;
		}

		/**
		 * API name: {@code condition}
		 */
		public final Builder condition(@Nullable Condition value) {
			this.condition = value;
			return this;
		}

		/**
		 * API name: {@code condition}
		 */
		public final Builder condition(Function<Condition.Builder, ObjectBuilder<Condition>> fn) {
			return this.condition(fn.apply(new Condition.Builder()).build());
		}

		/**
		 * API name: {@code condition}
		 */
		public final Builder condition(ConditionVariant value) {
			this.condition = value._toCondition();
			return this;
		}

		/**
		 * API name: {@code input}
		 */
		public final Builder input(@Nullable Input value) {
			this.input = value;
			return this;
		}

		/**
		 * API name: {@code input}
		 */
		public final Builder input(Function<Input.Builder, ObjectBuilder<Input>> fn) {
			return this.input(fn.apply(new Input.Builder()).build());
		}

		/**
		 * API name: {@code input}
		 */
		public final Builder input(InputVariant value) {
			this.input = value._toInput();
			return this;
		}

		/**
		 * API name: {@code metadata}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>metadata</code>.
		 */
		public final Builder metadata(Map<String, JsonData> map) {
			this.metadata = _mapPutAll(this.metadata, map);
			return this;
		}

		/**
		 * API name: {@code metadata}
		 * <p>
		 * Adds an entry to <code>metadata</code>.
		 */
		public final Builder metadata(String key, JsonData value) {
			this.metadata = _mapPut(this.metadata, key, value);
			return this;
		}

		/**
		 * API name: {@code result}
		 */
		public final Builder result(@Nullable ExecutionResult value) {
			this.result = value;
			return this;
		}

		/**
		 * API name: {@code result}
		 */
		public final Builder result(Function<ExecutionResult.Builder, ObjectBuilder<ExecutionResult>> fn) {
			return this.result(fn.apply(new ExecutionResult.Builder()).build());
		}

		/**
		 * API name: {@code user}
		 */
		public final Builder user(@Nullable String value) {
			this.user = value;
			return this;
		}

		/**
		 * API name: {@code status}
		 */
		public final Builder status(@Nullable WatchStatus value) {
			this.status = value;
			return this;
		}

		/**
		 * API name: {@code status}
		 */
		public final Builder status(Function<WatchStatus.Builder, ObjectBuilder<WatchStatus>> fn) {
			return this.status(fn.apply(new WatchStatus.Builder()).build());
		}

		/**
		 * API name: {@code messages}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>messages</code>.
		 */
		public final Builder messages(List<String> list) {
			this.messages = _listAddAll(this.messages, list);
			return this;
		}

		/**
		 * API name: {@code messages}
		 * <p>
		 * Adds one or more values to <code>messages</code>.
		 */
		public final Builder messages(String value, String... values) {
			this.messages = _listAdd(this.messages, value, values);
			return this;
		}

		/**
		 * API name: {@code vars}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>vars</code>.
		 */
		public final Builder vars(Map<String, JsonData> map) {
			this.vars = _mapPutAll(this.vars, map);
			return this;
		}

		/**
		 * API name: {@code vars}
		 * <p>
		 * Adds an entry to <code>vars</code>.
		 */
		public final Builder vars(String key, JsonData value) {
			this.vars = _mapPut(this.vars, key, value);
			return this;
		}

		/**
		 * API name: {@code exception}
		 */
		public final Builder exception(@Nullable ErrorCause value) {
			this.exception = value;
			return this;
		}

		/**
		 * API name: {@code exception}
		 */
		public final Builder exception(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn) {
			return this.exception(fn.apply(new ErrorCause.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link WatchRecord}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public WatchRecord build() {
			_checkSingleUse();

			return new WatchRecord(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link WatchRecord}
	 */
	public static final JsonpDeserializer<WatchRecord> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			WatchRecord::setupWatchRecordDeserializer);

	protected static void setupWatchRecordDeserializer(ObjectDeserializer<WatchRecord.Builder> op) {

		op.add(Builder::timestamp, DateTime._DESERIALIZER, "@timestamp");
		op.add(Builder::node, JsonpDeserializer.stringDeserializer(), "node");
		op.add(Builder::state, ExecutionStatus._DESERIALIZER, "state");
		op.add(Builder::triggerEvent, TriggerEventResult._DESERIALIZER, "trigger_event");
		op.add(Builder::watchId, JsonpDeserializer.stringDeserializer(), "watch_id");
		op.add(Builder::condition, Condition._DESERIALIZER, "condition");
		op.add(Builder::input, Input._DESERIALIZER, "input");
		op.add(Builder::metadata, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "metadata");
		op.add(Builder::result, ExecutionResult._DESERIALIZER, "result");
		op.add(Builder::user, JsonpDeserializer.stringDeserializer(), "user");
		op.add(Builder::status, WatchStatus._DESERIALIZER, "status");
		op.add(Builder::messages, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"messages");
		op.add(Builder::vars, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "vars");
		op.add(Builder::exception, ErrorCause._DESERIALIZER, "exception");

	}

}
