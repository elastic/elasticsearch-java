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

// typedef: watcher._types.ActivationStatus
@JsonpDeserializable
public class ActivationStatus implements JsonpSerializable {
	private final Map<String, ActionStatus> actions;

	private final ActivationState state;

	private final long version;

	// ---------------------------------------------------------------------------------------------

	private ActivationStatus(Builder builder) {

		this.actions = ModelTypeHelper.unmodifiableRequired(builder.actions, this, "actions");
		this.state = ModelTypeHelper.requireNonNull(builder.state, this, "state");
		this.version = ModelTypeHelper.requireNonNull(builder.version, this, "version");

	}

	public static ActivationStatus of(Function<Builder, ObjectBuilder<ActivationStatus>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code actions}
	 */
	public final Map<String, ActionStatus> actions() {
		return this.actions;
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
		generator.writeKey("state");
		this.state.serialize(generator, mapper);

		generator.writeKey("version");
		generator.write(this.version);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ActivationStatus}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ActivationStatus> {
		private Map<String, ActionStatus> actions;

		private ActivationState state;

		private Long version;

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
		 * Builds a {@link ActivationStatus}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ActivationStatus build() {
			_checkSingleUse();

			return new ActivationStatus(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ActivationStatus}
	 */
	public static final JsonpDeserializer<ActivationStatus> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ActivationStatus::setupActivationStatusDeserializer, Builder::build);

	protected static void setupActivationStatusDeserializer(DelegatingDeserializer<ActivationStatus.Builder> op) {

		op.add(Builder::actions, JsonpDeserializer.stringMapDeserializer(ActionStatus._DESERIALIZER), "actions");
		op.add(Builder::state, ActivationState._DESERIALIZER, "state");
		op.add(Builder::version, JsonpDeserializer.longDeserializer(), "version");

	}

}
