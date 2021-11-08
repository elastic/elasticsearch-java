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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.MapBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.WatchStatus
@JsonpDeserializable
public class WatchStatus implements JsonpSerializable {
	private final Map<String, ActionStatus> actions;

	@Nullable
	private final String lastChecked;

	@Nullable
	private final String lastMetCondition;

	private final ActivationState state;

	private final long version;

	@Nullable
	private final String executionState;

	// ---------------------------------------------------------------------------------------------

	private WatchStatus(Builder builder) {

		this.actions = ModelTypeHelper.unmodifiableRequired(builder.actions, this, "actions");
		this.lastChecked = builder.lastChecked;
		this.lastMetCondition = builder.lastMetCondition;
		this.state = ModelTypeHelper.requireNonNull(builder.state, this, "state");
		this.version = ModelTypeHelper.requireNonNull(builder.version, this, "version");
		this.executionState = builder.executionState;

	}

	public static WatchStatus of(Function<Builder, ObjectBuilder<WatchStatus>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code actions}
	 */
	public final Map<String, ActionStatus> actions() {
		return this.actions;
	}

	/**
	 * API name: {@code last_checked}
	 */
	@Nullable
	public final String lastChecked() {
		return this.lastChecked;
	}

	/**
	 * API name: {@code last_met_condition}
	 */
	@Nullable
	public final String lastMetCondition() {
		return this.lastMetCondition;
	}

	/**
	 * Required - API name: {@code state}
	 */
	public final ActivationState state() {
		return this.state;
	}

	/**
	 * Required - API name: {@code version}
	 */
	public final long version() {
		return this.version;
	}

	/**
	 * API name: {@code execution_state}
	 */
	@Nullable
	public final String executionState() {
		return this.executionState;
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

		if (ModelTypeHelper.isDefined(this.actions)) {
			generator.writeKey("actions");
			generator.writeStartObject();
			for (Map.Entry<String, ActionStatus> item0 : this.actions.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.lastChecked != null) {
			generator.writeKey("last_checked");
			generator.write(this.lastChecked);

		}
		if (this.lastMetCondition != null) {
			generator.writeKey("last_met_condition");
			generator.write(this.lastMetCondition);

		}
		generator.writeKey("state");
		this.state.serialize(generator, mapper);

		generator.writeKey("version");
		generator.write(this.version);

		if (this.executionState != null) {
			generator.writeKey("execution_state");
			generator.write(this.executionState);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link WatchStatus}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<WatchStatus> {
		private Map<String, ActionStatus> actions;

		@Nullable
		private String lastChecked;

		@Nullable
		private String lastMetCondition;

		private ActivationState state;

		private Long version;

		@Nullable
		private String executionState;

		/**
		 * Required - API name: {@code actions}
		 */
		public final Builder actions(Map<String, ActionStatus> value) {
			this.actions = value;
			return this;
		}

		/**
		 * Set {@link #actions(Map)} to a singleton map.
		 */
		public Builder actions(String key, Function<ActionStatus.Builder, ObjectBuilder<ActionStatus>> fn) {
			return this.actions(Collections.singletonMap(key, fn.apply(new ActionStatus.Builder()).build()));
		}

		public final Builder actions(
				Function<MapBuilder<String, ActionStatus, ActionStatus.Builder>, ObjectBuilder<Map<String, ActionStatus>>> fn) {
			return actions(fn.apply(new MapBuilder<>(ActionStatus.Builder::new)).build());
		}

		/**
		 * API name: {@code last_checked}
		 */
		public final Builder lastChecked(@Nullable String value) {
			this.lastChecked = value;
			return this;
		}

		/**
		 * API name: {@code last_met_condition}
		 */
		public final Builder lastMetCondition(@Nullable String value) {
			this.lastMetCondition = value;
			return this;
		}

		/**
		 * Required - API name: {@code state}
		 */
		public final Builder state(ActivationState value) {
			this.state = value;
			return this;
		}

		/**
		 * Required - API name: {@code state}
		 */
		public final Builder state(Function<ActivationState.Builder, ObjectBuilder<ActivationState>> fn) {
			return this.state(fn.apply(new ActivationState.Builder()).build());
		}

		/**
		 * Required - API name: {@code version}
		 */
		public final Builder version(long value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code execution_state}
		 */
		public final Builder executionState(@Nullable String value) {
			this.executionState = value;
			return this;
		}

		/**
		 * Builds a {@link WatchStatus}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public WatchStatus build() {
			_checkSingleUse();

			return new WatchStatus(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link WatchStatus}
	 */
	public static final JsonpDeserializer<WatchStatus> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			WatchStatus::setupWatchStatusDeserializer, Builder::build);

	protected static void setupWatchStatusDeserializer(DelegatingDeserializer<WatchStatus.Builder> op) {

		op.add(Builder::actions, JsonpDeserializer.stringMapDeserializer(ActionStatus._DESERIALIZER), "actions");
		op.add(Builder::lastChecked, JsonpDeserializer.stringDeserializer(), "last_checked");
		op.add(Builder::lastMetCondition, JsonpDeserializer.stringDeserializer(), "last_met_condition");
		op.add(Builder::state, ActivationState._DESERIALIZER, "state");
		op.add(Builder::version, JsonpDeserializer.longDeserializer(), "version");
		op.add(Builder::executionState, JsonpDeserializer.stringDeserializer(), "execution_state");

	}

}
