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

package co.elastic.clients.elasticsearch.xpack.usage;

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
import java.lang.String;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: xpack.usage.WatcherWatch
@JsonpDeserializable
public class WatcherWatch implements JsonpSerializable {
	private final Map<String, Counter> input;

	private final Map<String, Counter> condition;

	private final Map<String, Counter> action;

	private final WatcherWatchTrigger trigger;

	// ---------------------------------------------------------------------------------------------

	private WatcherWatch(Builder builder) {

		this.input = ModelTypeHelper.unmodifiableRequired(builder.input, this, "input");
		this.condition = ModelTypeHelper.unmodifiable(builder.condition);
		this.action = ModelTypeHelper.unmodifiable(builder.action);
		this.trigger = ModelTypeHelper.requireNonNull(builder.trigger, this, "trigger");

	}

	public static WatcherWatch of(Function<Builder, ObjectBuilder<WatcherWatch>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code input}
	 */
	public final Map<String, Counter> input() {
		return this.input;
	}

	/**
	 * API name: {@code condition}
	 */
	public final Map<String, Counter> condition() {
		return this.condition;
	}

	/**
	 * API name: {@code action}
	 */
	public final Map<String, Counter> action() {
		return this.action;
	}

	/**
	 * Required - API name: {@code trigger}
	 */
	public final WatcherWatchTrigger trigger() {
		return this.trigger;
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

		if (ModelTypeHelper.isDefined(this.input)) {
			generator.writeKey("input");
			generator.writeStartObject();
			for (Map.Entry<String, Counter> item0 : this.input.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.condition)) {
			generator.writeKey("condition");
			generator.writeStartObject();
			for (Map.Entry<String, Counter> item0 : this.condition.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.action)) {
			generator.writeKey("action");
			generator.writeStartObject();
			for (Map.Entry<String, Counter> item0 : this.action.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("trigger");
		this.trigger.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link WatcherWatch}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<WatcherWatch> {
		private Map<String, Counter> input;

		@Nullable
		private Map<String, Counter> condition;

		@Nullable
		private Map<String, Counter> action;

		private WatcherWatchTrigger trigger;

		/**
		 * Required - API name: {@code input}
		 */
		public final Builder input(Map<String, Counter> value) {
			this.input = value;
			return this;
		}

		/**
		 * Set {@link #input(Map)} to a singleton map.
		 */
		public Builder input(String key, Function<Counter.Builder, ObjectBuilder<Counter>> fn) {
			return this.input(Collections.singletonMap(key, fn.apply(new Counter.Builder()).build()));
		}

		public final Builder input(
				Function<MapBuilder<String, Counter, Counter.Builder>, ObjectBuilder<Map<String, Counter>>> fn) {
			return input(fn.apply(new MapBuilder<>(Counter.Builder::new)).build());
		}

		/**
		 * API name: {@code condition}
		 */
		public final Builder condition(@Nullable Map<String, Counter> value) {
			this.condition = value;
			return this;
		}

		/**
		 * Set {@link #condition(Map)} to a singleton map.
		 */
		public Builder condition(String key, Function<Counter.Builder, ObjectBuilder<Counter>> fn) {
			return this.condition(Collections.singletonMap(key, fn.apply(new Counter.Builder()).build()));
		}

		public final Builder condition(
				Function<MapBuilder<String, Counter, Counter.Builder>, ObjectBuilder<Map<String, Counter>>> fn) {
			return condition(fn.apply(new MapBuilder<>(Counter.Builder::new)).build());
		}

		/**
		 * API name: {@code action}
		 */
		public final Builder action(@Nullable Map<String, Counter> value) {
			this.action = value;
			return this;
		}

		/**
		 * Set {@link #action(Map)} to a singleton map.
		 */
		public Builder action(String key, Function<Counter.Builder, ObjectBuilder<Counter>> fn) {
			return this.action(Collections.singletonMap(key, fn.apply(new Counter.Builder()).build()));
		}

		public final Builder action(
				Function<MapBuilder<String, Counter, Counter.Builder>, ObjectBuilder<Map<String, Counter>>> fn) {
			return action(fn.apply(new MapBuilder<>(Counter.Builder::new)).build());
		}

		/**
		 * Required - API name: {@code trigger}
		 */
		public final Builder trigger(WatcherWatchTrigger value) {
			this.trigger = value;
			return this;
		}

		/**
		 * Required - API name: {@code trigger}
		 */
		public final Builder trigger(Function<WatcherWatchTrigger.Builder, ObjectBuilder<WatcherWatchTrigger>> fn) {
			return this.trigger(fn.apply(new WatcherWatchTrigger.Builder()).build());
		}

		/**
		 * Builds a {@link WatcherWatch}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public WatcherWatch build() {
			_checkSingleUse();

			return new WatcherWatch(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link WatcherWatch}
	 */
	public static final JsonpDeserializer<WatcherWatch> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			WatcherWatch::setupWatcherWatchDeserializer, Builder::build);

	protected static void setupWatcherWatchDeserializer(DelegatingDeserializer<WatcherWatch.Builder> op) {

		op.add(Builder::input, JsonpDeserializer.stringMapDeserializer(Counter._DESERIALIZER), "input");
		op.add(Builder::condition, JsonpDeserializer.stringMapDeserializer(Counter._DESERIALIZER), "condition");
		op.add(Builder::action, JsonpDeserializer.stringMapDeserializer(Counter._DESERIALIZER), "action");
		op.add(Builder::trigger, WatcherWatchTrigger._DESERIALIZER, "trigger");

	}

}
