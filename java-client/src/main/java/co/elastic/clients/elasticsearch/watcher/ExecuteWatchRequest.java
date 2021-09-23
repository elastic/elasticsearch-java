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

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher.execute_watch.Request
public final class ExecuteWatchRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final String id;

	@Nullable
	private final Boolean debug;

	@Nullable
	private final Map<String, ActionExecutionMode> actionModes;

	@Nullable
	private final Map<String, JsonData> alternativeInput;

	@Nullable
	private final Boolean ignoreCondition;

	@Nullable
	private final Boolean recordExecution;

	@Nullable
	private final SimulatedActions simulatedActions;

	@Nullable
	private final ScheduleTriggerEvent triggerData;

	@Nullable
	private final Watch watch;

	// ---------------------------------------------------------------------------------------------

	public ExecuteWatchRequest(Builder builder) {

		this.id = builder.id;
		this.debug = builder.debug;
		this.actionModes = builder.actionModes;
		this.alternativeInput = builder.alternativeInput;
		this.ignoreCondition = builder.ignoreCondition;
		this.recordExecution = builder.recordExecution;
		this.simulatedActions = builder.simulatedActions;
		this.triggerData = builder.triggerData;
		this.watch = builder.watch;

	}

	/**
	 * Watch ID
	 * <p>
	 * API name: {@code id}
	 */
	@Nullable
	public String id() {
		return this.id;
	}

	/**
	 * indicates whether the watch should execute in debug mode
	 * <p>
	 * API name: {@code debug}
	 */
	@Nullable
	public Boolean debug() {
		return this.debug;
	}

	/**
	 * API name: {@code action_modes}
	 */
	@Nullable
	public Map<String, ActionExecutionMode> actionModes() {
		return this.actionModes;
	}

	/**
	 * API name: {@code alternative_input}
	 */
	@Nullable
	public Map<String, JsonData> alternativeInput() {
		return this.alternativeInput;
	}

	/**
	 * API name: {@code ignore_condition}
	 */
	@Nullable
	public Boolean ignoreCondition() {
		return this.ignoreCondition;
	}

	/**
	 * API name: {@code record_execution}
	 */
	@Nullable
	public Boolean recordExecution() {
		return this.recordExecution;
	}

	/**
	 * API name: {@code simulated_actions}
	 */
	@Nullable
	public SimulatedActions simulatedActions() {
		return this.simulatedActions;
	}

	/**
	 * API name: {@code trigger_data}
	 */
	@Nullable
	public ScheduleTriggerEvent triggerData() {
		return this.triggerData;
	}

	/**
	 * API name: {@code watch}
	 */
	@Nullable
	public Watch watch() {
		return this.watch;
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

		if (this.actionModes != null) {

			generator.writeKey("action_modes");
			generator.writeStartObject();
			for (Map.Entry<String, ActionExecutionMode> item0 : this.actionModes.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);
			}
			generator.writeEnd();

		}
		if (this.alternativeInput != null) {

			generator.writeKey("alternative_input");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.alternativeInput.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.ignoreCondition != null) {

			generator.writeKey("ignore_condition");
			generator.write(this.ignoreCondition);

		}
		if (this.recordExecution != null) {

			generator.writeKey("record_execution");
			generator.write(this.recordExecution);

		}
		if (this.simulatedActions != null) {

			generator.writeKey("simulated_actions");
			this.simulatedActions.serialize(generator, mapper);

		}
		if (this.triggerData != null) {

			generator.writeKey("trigger_data");
			this.triggerData.serialize(generator, mapper);

		}
		if (this.watch != null) {

			generator.writeKey("watch");
			this.watch.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExecuteWatchRequest}.
	 */
	public static class Builder implements ObjectBuilder<ExecuteWatchRequest> {
		@Nullable
		private String id;

		@Nullable
		private Boolean debug;

		@Nullable
		private Map<String, ActionExecutionMode> actionModes;

		@Nullable
		private Map<String, JsonData> alternativeInput;

		@Nullable
		private Boolean ignoreCondition;

		@Nullable
		private Boolean recordExecution;

		@Nullable
		private SimulatedActions simulatedActions;

		@Nullable
		private ScheduleTriggerEvent triggerData;

		@Nullable
		private Watch watch;

		/**
		 * Watch ID
		 * <p>
		 * API name: {@code id}
		 */
		public Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * indicates whether the watch should execute in debug mode
		 * <p>
		 * API name: {@code debug}
		 */
		public Builder debug(@Nullable Boolean value) {
			this.debug = value;
			return this;
		}

		/**
		 * API name: {@code action_modes}
		 */
		public Builder actionModes(@Nullable Map<String, ActionExecutionMode> value) {
			this.actionModes = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #actionModes(Map)}, creating the map if needed.
		 */
		public Builder putActionModes(String key, ActionExecutionMode value) {
			if (this.actionModes == null) {
				this.actionModes = new HashMap<>();
			}
			this.actionModes.put(key, value);
			return this;
		}

		/**
		 * API name: {@code alternative_input}
		 */
		public Builder alternativeInput(@Nullable Map<String, JsonData> value) {
			this.alternativeInput = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #alternativeInput(Map)}, creating the map if
		 * needed.
		 */
		public Builder putAlternativeInput(String key, JsonData value) {
			if (this.alternativeInput == null) {
				this.alternativeInput = new HashMap<>();
			}
			this.alternativeInput.put(key, value);
			return this;
		}

		/**
		 * API name: {@code ignore_condition}
		 */
		public Builder ignoreCondition(@Nullable Boolean value) {
			this.ignoreCondition = value;
			return this;
		}

		/**
		 * API name: {@code record_execution}
		 */
		public Builder recordExecution(@Nullable Boolean value) {
			this.recordExecution = value;
			return this;
		}

		/**
		 * API name: {@code simulated_actions}
		 */
		public Builder simulatedActions(@Nullable SimulatedActions value) {
			this.simulatedActions = value;
			return this;
		}

		/**
		 * API name: {@code simulated_actions}
		 */
		public Builder simulatedActions(Function<SimulatedActions.Builder, ObjectBuilder<SimulatedActions>> fn) {
			return this.simulatedActions(fn.apply(new SimulatedActions.Builder()).build());
		}

		/**
		 * API name: {@code trigger_data}
		 */
		public Builder triggerData(@Nullable ScheduleTriggerEvent value) {
			this.triggerData = value;
			return this;
		}

		/**
		 * API name: {@code trigger_data}
		 */
		public Builder triggerData(Function<ScheduleTriggerEvent.Builder, ObjectBuilder<ScheduleTriggerEvent>> fn) {
			return this.triggerData(fn.apply(new ScheduleTriggerEvent.Builder()).build());
		}

		/**
		 * API name: {@code watch}
		 */
		public Builder watch(@Nullable Watch value) {
			this.watch = value;
			return this;
		}

		/**
		 * API name: {@code watch}
		 */
		public Builder watch(Function<Watch.Builder, ObjectBuilder<Watch>> fn) {
			return this.watch(fn.apply(new Watch.Builder()).build());
		}

		/**
		 * Builds a {@link ExecuteWatchRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExecuteWatchRequest build() {

			return new ExecuteWatchRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ExecuteWatchRequest}
	 */
	public static final JsonpDeserializer<ExecuteWatchRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ExecuteWatchRequest::setupExecuteWatchRequestDeserializer);

	protected static void setupExecuteWatchRequestDeserializer(DelegatingDeserializer<ExecuteWatchRequest.Builder> op) {

		op.add(Builder::actionModes, JsonpDeserializer.stringMapDeserializer(ActionExecutionMode.DESERIALIZER),
				"action_modes");
		op.add(Builder::alternativeInput, JsonpDeserializer.stringMapDeserializer(JsonData.DESERIALIZER),
				"alternative_input");
		op.add(Builder::ignoreCondition, JsonpDeserializer.booleanDeserializer(), "ignore_condition");
		op.add(Builder::recordExecution, JsonpDeserializer.booleanDeserializer(), "record_execution");
		op.add(Builder::simulatedActions, SimulatedActions.DESERIALIZER, "simulated_actions");
		op.add(Builder::triggerData, ScheduleTriggerEvent.DESERIALIZER, "trigger_data");
		op.add(Builder::watch, Watch.DESERIALIZER, "watch");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code watcher.execute_watch}".
	 */
	public static final Endpoint<ExecuteWatchRequest, ExecuteWatchResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _id = 1 << 0;

				int propsSet = 0;

				if (request.id() != null)
					propsSet |= _id;

				if (propsSet == (_id)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_watcher");
					buf.append("/watch");
					buf.append("/");
					buf.append(request.id);
					buf.append("/_execute");
					return buf.toString();
				}
				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_watcher");
					buf.append("/watch");
					buf.append("/_execute");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.debug != null) {
					params.put("debug", String.valueOf(request.debug));
				}
				return params;

			}, Endpoint.Simple.emptyMap(), true, ExecuteWatchResponse.DESERIALIZER);
}
