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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: xpack.usage.Watcher
@JsonpDeserializable
public final class Watcher extends Base {
	private final WatcherActions execution;

	private final WatcherWatch watch;

	private final Counter count;

	// ---------------------------------------------------------------------------------------------

	public Watcher(Builder builder) {
		super(builder);

		this.execution = Objects.requireNonNull(builder.execution, "execution");
		this.watch = Objects.requireNonNull(builder.watch, "watch");
		this.count = Objects.requireNonNull(builder.count, "count");

	}

	/**
	 * API name: {@code execution}
	 */
	public WatcherActions execution() {
		return this.execution;
	}

	/**
	 * API name: {@code watch}
	 */
	public WatcherWatch watch() {
		return this.watch;
	}

	/**
	 * API name: {@code count}
	 */
	public Counter count() {
		return this.count;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);

		generator.writeKey("execution");
		this.execution.serialize(generator, mapper);

		generator.writeKey("watch");
		this.watch.serialize(generator, mapper);

		generator.writeKey("count");
		this.count.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Watcher}.
	 */
	public static class Builder extends Base.AbstractBuilder<Builder> implements ObjectBuilder<Watcher> {
		private WatcherActions execution;

		private WatcherWatch watch;

		private Counter count;

		/**
		 * API name: {@code execution}
		 */
		public Builder execution(WatcherActions value) {
			this.execution = value;
			return this;
		}

		/**
		 * API name: {@code execution}
		 */
		public Builder execution(Function<WatcherActions.Builder, ObjectBuilder<WatcherActions>> fn) {
			return this.execution(fn.apply(new WatcherActions.Builder()).build());
		}

		/**
		 * API name: {@code watch}
		 */
		public Builder watch(WatcherWatch value) {
			this.watch = value;
			return this;
		}

		/**
		 * API name: {@code watch}
		 */
		public Builder watch(Function<WatcherWatch.Builder, ObjectBuilder<WatcherWatch>> fn) {
			return this.watch(fn.apply(new WatcherWatch.Builder()).build());
		}

		/**
		 * API name: {@code count}
		 */
		public Builder count(Counter value) {
			this.count = value;
			return this;
		}

		/**
		 * API name: {@code count}
		 */
		public Builder count(Function<Counter.Builder, ObjectBuilder<Counter>> fn) {
			return this.count(fn.apply(new Counter.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Watcher}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Watcher build() {

			return new Watcher(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Watcher}
	 */
	public static final JsonpDeserializer<Watcher> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Watcher::setupWatcherDeserializer, Builder::build);

	protected static void setupWatcherDeserializer(DelegatingDeserializer<Watcher.Builder> op) {
		Base.setupBaseDeserializer(op);
		op.add(Builder::execution, WatcherActions._DESERIALIZER, "execution");
		op.add(Builder::watch, WatcherWatch._DESERIALIZER, "watch");
		op.add(Builder::count, Counter._DESERIALIZER, "count");

	}

}
