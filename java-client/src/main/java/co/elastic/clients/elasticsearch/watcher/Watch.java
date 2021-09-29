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

import co.elastic.clients.elasticsearch._types.Transform;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.Watch
@JsonpDeserializable
public final class Watch implements JsonpSerializable {
	private final Map<String, Action> actions;

	private final Condition condition;

	private final Input input;

	@Nullable
	private final Map<String, JsonData> metadata;

	@Nullable
	private final WatchStatus status;

	@Nullable
	private final String throttlePeriod;

	@Nullable
	private final Transform transform;

	private final Trigger trigger;

	@Nullable
	private final Long throttlePeriodInMillis;

	// ---------------------------------------------------------------------------------------------

	public Watch(Builder builder) {

		this.actions = ModelTypeHelper.unmodifiableNonNull(builder.actions, "actions");
		this.condition = Objects.requireNonNull(builder.condition, "condition");
		this.input = Objects.requireNonNull(builder.input, "input");
		this.metadata = ModelTypeHelper.unmodifiable(builder.metadata);
		this.status = builder.status;
		this.throttlePeriod = builder.throttlePeriod;
		this.transform = builder.transform;
		this.trigger = Objects.requireNonNull(builder.trigger, "trigger");
		this.throttlePeriodInMillis = builder.throttlePeriodInMillis;

	}

	public Watch(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code actions}
	 */
	public Map<String, Action> actions() {
		return this.actions;
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
	 * API name: {@code metadata}
	 */
	@Nullable
	public Map<String, JsonData> metadata() {
		return this.metadata;
	}

	/**
	 * API name: {@code status}
	 */
	@Nullable
	public WatchStatus status() {
		return this.status;
	}

	/**
	 * API name: {@code throttle_period}
	 */
	@Nullable
	public String throttlePeriod() {
		return this.throttlePeriod;
	}

	/**
	 * API name: {@code transform}
	 */
	@Nullable
	public Transform transform() {
		return this.transform;
	}

	/**
	 * API name: {@code trigger}
	 */
	public Trigger trigger() {
		return this.trigger;
	}

	/**
	 * API name: {@code throttle_period_in_millis}
	 */
	@Nullable
	public Long throttlePeriodInMillis() {
		return this.throttlePeriodInMillis;
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

		generator.writeKey("actions");
		generator.writeStartObject();
		for (Map.Entry<String, Action> item0 : this.actions.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("condition");
		this.condition.serialize(generator, mapper);

		generator.writeKey("input");
		this.input.serialize(generator, mapper);

		if (this.metadata != null) {

			generator.writeKey("metadata");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.metadata.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.status != null) {

			generator.writeKey("status");
			this.status.serialize(generator, mapper);

		}
		if (this.throttlePeriod != null) {

			generator.writeKey("throttle_period");
			generator.write(this.throttlePeriod);

		}
		if (this.transform != null) {

			generator.writeKey("transform");
			this.transform.serialize(generator, mapper);

		}

		generator.writeKey("trigger");
		this.trigger.serialize(generator, mapper);

		if (this.throttlePeriodInMillis != null) {

			generator.writeKey("throttle_period_in_millis");
			generator.write(this.throttlePeriodInMillis);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Watch}.
	 */
	public static class Builder implements ObjectBuilder<Watch> {
		private Map<String, Action> actions;

		private Condition condition;

		private Input input;

		@Nullable
		private Map<String, JsonData> metadata;

		@Nullable
		private WatchStatus status;

		@Nullable
		private String throttlePeriod;

		@Nullable
		private Transform transform;

		private Trigger trigger;

		@Nullable
		private Long throttlePeriodInMillis;

		/**
		 * API name: {@code actions}
		 */
		public Builder actions(Map<String, Action> value) {
			this.actions = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #actions(Map)}, creating the map if needed.
		 */
		public Builder putActions(String key, Action value) {
			if (this.actions == null) {
				this.actions = new HashMap<>();
			}
			this.actions.put(key, value);
			return this;
		}

		/**
		 * Set {@link #actions(Map)} to a singleton map.
		 */
		public Builder actions(String key, Function<Action.Builder, ObjectBuilder<Action>> fn) {
			return this.actions(Collections.singletonMap(key, fn.apply(new Action.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #actions(Map)}, creating the map if needed.
		 */
		public Builder putActions(String key, Function<Action.Builder, ObjectBuilder<Action>> fn) {
			return this.putActions(key, fn.apply(new Action.Builder()).build());
		}

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
		 * API name: {@code metadata}
		 */
		public Builder metadata(@Nullable Map<String, JsonData> value) {
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
		 * API name: {@code status}
		 */
		public Builder status(@Nullable WatchStatus value) {
			this.status = value;
			return this;
		}

		/**
		 * API name: {@code status}
		 */
		public Builder status(Function<WatchStatus.Builder, ObjectBuilder<WatchStatus>> fn) {
			return this.status(fn.apply(new WatchStatus.Builder()).build());
		}

		/**
		 * API name: {@code throttle_period}
		 */
		public Builder throttlePeriod(@Nullable String value) {
			this.throttlePeriod = value;
			return this;
		}

		/**
		 * API name: {@code transform}
		 */
		public Builder transform(@Nullable Transform value) {
			this.transform = value;
			return this;
		}

		/**
		 * API name: {@code transform}
		 */
		public Builder transform(Function<Transform.Builder, ObjectBuilder<Transform>> fn) {
			return this.transform(fn.apply(new Transform.Builder()).build());
		}

		/**
		 * API name: {@code trigger}
		 */
		public Builder trigger(Trigger value) {
			this.trigger = value;
			return this;
		}

		/**
		 * API name: {@code trigger}
		 */
		public Builder trigger(Function<Trigger.Builder, ObjectBuilder<Trigger>> fn) {
			return this.trigger(fn.apply(new Trigger.Builder()).build());
		}

		/**
		 * API name: {@code throttle_period_in_millis}
		 */
		public Builder throttlePeriodInMillis(@Nullable Long value) {
			this.throttlePeriodInMillis = value;
			return this;
		}

		/**
		 * Builds a {@link Watch}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Watch build() {

			return new Watch(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Watch}
	 */
	public static final JsonpDeserializer<Watch> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Watch::setupWatchDeserializer, Builder::build);

	protected static void setupWatchDeserializer(DelegatingDeserializer<Watch.Builder> op) {

		op.add(Builder::actions, JsonpDeserializer.stringMapDeserializer(Action._DESERIALIZER), "actions");
		op.add(Builder::condition, Condition._DESERIALIZER, "condition");
		op.add(Builder::input, Input._DESERIALIZER, "input");
		op.add(Builder::metadata, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "metadata");
		op.add(Builder::status, WatchStatus._DESERIALIZER, "status");
		op.add(Builder::throttlePeriod, JsonpDeserializer.stringDeserializer(), "throttle_period");
		op.add(Builder::transform, Transform._DESERIALIZER, "transform");
		op.add(Builder::trigger, Trigger._DESERIALIZER, "trigger");
		op.add(Builder::throttlePeriodInMillis, JsonpDeserializer.longDeserializer(), "throttle_period_in_millis");

	}

}
