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

package co.elastic.clients.elasticsearch.xpack.usage;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
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

// typedef: xpack.usage.WatcherWatch

/**
 *
 * @see <a href="../../doc-files/api-spec.html#xpack.usage.WatcherWatch">API
 *      specification</a>
 */
@JsonpDeserializable
public class WatcherWatch implements JsonpSerializable {
	private final Map<String, Counter> input;

	private final Map<String, Counter> condition;

	private final Map<String, Counter> action;

	private final WatcherWatchTrigger trigger;

	// ---------------------------------------------------------------------------------------------

	private WatcherWatch(Builder builder) {

		this.input = ApiTypeHelper.unmodifiableRequired(builder.input, this, "input");
		this.condition = ApiTypeHelper.unmodifiable(builder.condition);
		this.action = ApiTypeHelper.unmodifiable(builder.action);
		this.trigger = ApiTypeHelper.requireNonNull(builder.trigger, this, "trigger");

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

		if (ApiTypeHelper.isDefined(this.input)) {
			generator.writeKey("input");
			generator.writeStartObject();
			for (Map.Entry<String, Counter> item0 : this.input.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.condition)) {
			generator.writeKey("condition");
			generator.writeStartObject();
			for (Map.Entry<String, Counter> item0 : this.condition.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.action)) {
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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link WatcherWatch}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<WatcherWatch> {
		private Map<String, Counter> input;

		@Nullable
		private Map<String, Counter> condition;

		@Nullable
		private Map<String, Counter> action;

		private WatcherWatchTrigger trigger;

		/**
		 * Required - API name: {@code input}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>input</code>.
		 */
		public final Builder input(Map<String, Counter> map) {
			this.input = _mapPutAll(this.input, map);
			return this;
		}

		/**
		 * Required - API name: {@code input}
		 * <p>
		 * Adds an entry to <code>input</code>.
		 */
		public final Builder input(String key, Counter value) {
			this.input = _mapPut(this.input, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code input}
		 * <p>
		 * Adds an entry to <code>input</code> using a builder lambda.
		 */
		public final Builder input(String key, Function<Counter.Builder, ObjectBuilder<Counter>> fn) {
			return input(key, fn.apply(new Counter.Builder()).build());
		}

		/**
		 * API name: {@code condition}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>condition</code>.
		 */
		public final Builder condition(Map<String, Counter> map) {
			this.condition = _mapPutAll(this.condition, map);
			return this;
		}

		/**
		 * API name: {@code condition}
		 * <p>
		 * Adds an entry to <code>condition</code>.
		 */
		public final Builder condition(String key, Counter value) {
			this.condition = _mapPut(this.condition, key, value);
			return this;
		}

		/**
		 * API name: {@code condition}
		 * <p>
		 * Adds an entry to <code>condition</code> using a builder lambda.
		 */
		public final Builder condition(String key, Function<Counter.Builder, ObjectBuilder<Counter>> fn) {
			return condition(key, fn.apply(new Counter.Builder()).build());
		}

		/**
		 * API name: {@code action}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>action</code>.
		 */
		public final Builder action(Map<String, Counter> map) {
			this.action = _mapPutAll(this.action, map);
			return this;
		}

		/**
		 * API name: {@code action}
		 * <p>
		 * Adds an entry to <code>action</code>.
		 */
		public final Builder action(String key, Counter value) {
			this.action = _mapPut(this.action, key, value);
			return this;
		}

		/**
		 * API name: {@code action}
		 * <p>
		 * Adds an entry to <code>action</code> using a builder lambda.
		 */
		public final Builder action(String key, Function<Counter.Builder, ObjectBuilder<Counter>> fn) {
			return action(key, fn.apply(new Counter.Builder()).build());
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

		@Override
		protected Builder self() {
			return this;
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
			WatcherWatch::setupWatcherWatchDeserializer);

	protected static void setupWatcherWatchDeserializer(ObjectDeserializer<WatcherWatch.Builder> op) {

		op.add(Builder::input, JsonpDeserializer.stringMapDeserializer(Counter._DESERIALIZER), "input");
		op.add(Builder::condition, JsonpDeserializer.stringMapDeserializer(Counter._DESERIALIZER), "condition");
		op.add(Builder::action, JsonpDeserializer.stringMapDeserializer(Counter._DESERIALIZER), "action");
		op.add(Builder::trigger, WatcherWatchTrigger._DESERIALIZER, "trigger");

	}

}
