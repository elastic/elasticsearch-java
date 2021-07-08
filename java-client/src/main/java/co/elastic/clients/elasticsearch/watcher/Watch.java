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

import co.elastic.clients.elasticsearch._types.TransformContainer;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.Watch
public final class Watch implements ToJsonp {
	private final Map<String, Action> actions;

	private final ConditionContainer condition;

	private final InputContainer input;

	@Nullable
	private final Map<String, JsonValue> metadata;

	@Nullable
	private final WatchStatus status;

	@Nullable
	private final String throttlePeriod;

	@Nullable
	private final TransformContainer transform;

	private final TriggerContainer trigger;

	@Nullable
	private final Number throttlePeriodInMillis;

	// ---------------------------------------------------------------------------------------------

	protected Watch(Builder builder) {

		this.actions = Objects.requireNonNull(builder.actions, "actions");
		this.condition = Objects.requireNonNull(builder.condition, "condition");
		this.input = Objects.requireNonNull(builder.input, "input");
		this.metadata = builder.metadata;
		this.status = builder.status;
		this.throttlePeriod = builder.throttlePeriod;
		this.transform = builder.transform;
		this.trigger = Objects.requireNonNull(builder.trigger, "trigger");
		this.throttlePeriodInMillis = builder.throttlePeriodInMillis;

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
	public ConditionContainer condition() {
		return this.condition;
	}

	/**
	 * API name: {@code input}
	 */
	public InputContainer input() {
		return this.input;
	}

	/**
	 * API name: {@code metadata}
	 */
	@Nullable
	public Map<String, JsonValue> metadata() {
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
	public TransformContainer transform() {
		return this.transform;
	}

	/**
	 * API name: {@code trigger}
	 */
	public TriggerContainer trigger() {
		return this.trigger;
	}

	/**
	 * API name: {@code throttle_period_in_millis}
	 */
	@Nullable
	public Number throttlePeriodInMillis() {
		return this.throttlePeriodInMillis;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("actions");
		generator.writeStartObject();
		for (Map.Entry<String, Action> item0 : this.actions.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().toJsonp(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("condition");
		this.condition.toJsonp(generator, mapper);

		generator.writeKey("input");
		this.input.toJsonp(generator, mapper);

		if (this.metadata != null) {

			generator.writeKey("metadata");
			generator.writeStartObject();
			for (Map.Entry<String, JsonValue> item0 : this.metadata.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (this.status != null) {

			generator.writeKey("status");
			this.status.toJsonp(generator, mapper);

		}
		if (this.throttlePeriod != null) {

			generator.writeKey("throttle_period");
			generator.write(this.throttlePeriod);

		}
		if (this.transform != null) {

			generator.writeKey("transform");
			this.transform.toJsonp(generator, mapper);

		}

		generator.writeKey("trigger");
		this.trigger.toJsonp(generator, mapper);

		if (this.throttlePeriodInMillis != null) {

			generator.writeKey("throttle_period_in_millis");
			generator.write(this.throttlePeriodInMillis.doubleValue());

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Watch}.
	 */
	public static class Builder implements ObjectBuilder<Watch> {
		private Map<String, Action> actions;

		private ConditionContainer condition;

		private InputContainer input;

		@Nullable
		private Map<String, JsonValue> metadata;

		@Nullable
		private WatchStatus status;

		@Nullable
		private String throttlePeriod;

		@Nullable
		private TransformContainer transform;

		private TriggerContainer trigger;

		@Nullable
		private Number throttlePeriodInMillis;

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
		public Builder condition(ConditionContainer value) {
			this.condition = value;
			return this;
		}

		/**
		 * API name: {@code condition}
		 */
		public Builder condition(Function<ConditionContainer.Builder, ObjectBuilder<ConditionContainer>> fn) {
			return this.condition(fn.apply(new ConditionContainer.Builder()).build());
		}

		/**
		 * API name: {@code input}
		 */
		public Builder input(InputContainer value) {
			this.input = value;
			return this;
		}

		/**
		 * API name: {@code input}
		 */
		public Builder input(Function<InputContainer.Builder, ObjectBuilder<InputContainer>> fn) {
			return this.input(fn.apply(new InputContainer.Builder()).build());
		}

		/**
		 * API name: {@code metadata}
		 */
		public Builder metadata(@Nullable Map<String, JsonValue> value) {
			this.metadata = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #metadata(Map)}, creating the map if needed.
		 */
		public Builder putMetadata(String key, JsonValue value) {
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
		public Builder transform(@Nullable TransformContainer value) {
			this.transform = value;
			return this;
		}

		/**
		 * API name: {@code transform}
		 */
		public Builder transform(Function<TransformContainer.Builder, ObjectBuilder<TransformContainer>> fn) {
			return this.transform(fn.apply(new TransformContainer.Builder()).build());
		}

		/**
		 * API name: {@code trigger}
		 */
		public Builder trigger(TriggerContainer value) {
			this.trigger = value;
			return this;
		}

		/**
		 * API name: {@code trigger}
		 */
		public Builder trigger(Function<TriggerContainer.Builder, ObjectBuilder<TriggerContainer>> fn) {
			return this.trigger(fn.apply(new TriggerContainer.Builder()).build());
		}

		/**
		 * API name: {@code throttle_period_in_millis}
		 */
		public Builder throttlePeriodInMillis(@Nullable Number value) {
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
	 * Json deserializer for Watch
	 */
	public static final JsonpDeserializer<Watch> DESERIALIZER = ObjectBuilderDeserializer.createForObject(Builder::new,
			Watch::setupWatchDeserializer);

	protected static void setupWatchDeserializer(DelegatingDeserializer<Watch.Builder> op) {

		op.add(Builder::actions, JsonpDeserializer.stringMapDeserializer(Action.DESERIALIZER), "actions");
		op.add(Builder::condition, ConditionContainer.DESERIALIZER, "condition");
		op.add(Builder::input, InputContainer.DESERIALIZER, "input");
		op.add(Builder::metadata, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer()),
				"metadata");
		op.add(Builder::status, WatchStatus.DESERIALIZER, "status");
		op.add(Builder::throttlePeriod, JsonpDeserializer.stringDeserializer(), "throttle_period");
		op.add(Builder::transform, TransformContainer.DESERIALIZER, "transform");
		op.add(Builder::trigger, TriggerContainer.DESERIALIZER, "trigger");
		op.add(Builder::throttlePeriodInMillis, JsonpDeserializer.numberDeserializer(), "throttle_period_in_millis");

	}

}
