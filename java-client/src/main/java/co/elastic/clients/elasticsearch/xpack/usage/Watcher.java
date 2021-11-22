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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: xpack.usage.Watcher
@JsonpDeserializable
public class Watcher extends Base {
	private final WatcherActions execution;

	private final WatcherWatch watch;

	private final Counter count;

	// ---------------------------------------------------------------------------------------------

	private Watcher(Builder builder) {
		super(builder);

		this.execution = ModelTypeHelper.requireNonNull(builder.execution, this, "execution");
		this.watch = ModelTypeHelper.requireNonNull(builder.watch, this, "watch");
		this.count = ModelTypeHelper.requireNonNull(builder.count, this, "count");

	}

	public static Watcher of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code execution}
	 */
	public final WatcherActions execution() {
		return this.execution;
	}

	/**
	 * Required - API name: {@code watch}
	 */
	public final WatcherWatch watch() {
		return this.watch;
	}

	/**
	 * Required - API name: {@code count}
	 */
	public final Counter count() {
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
		 * Required - API name: {@code execution}
		 */
		public final Builder execution(WatcherActions value) {
			this.execution = value;
			return this;
		}

		/**
		 * Required - API name: {@code execution}
		 */
		public final Builder execution(Consumer<WatcherActions.Builder> fn) {
			WatcherActions.Builder builder = new WatcherActions.Builder();
			fn.accept(builder);
			return this.execution(builder.build());
		}

		/**
		 * Required - API name: {@code watch}
		 */
		public final Builder watch(WatcherWatch value) {
			this.watch = value;
			return this;
		}

		/**
		 * Required - API name: {@code watch}
		 */
		public final Builder watch(Consumer<WatcherWatch.Builder> fn) {
			WatcherWatch.Builder builder = new WatcherWatch.Builder();
			fn.accept(builder);
			return this.watch(builder.build());
		}

		/**
		 * Required - API name: {@code count}
		 */
		public final Builder count(Counter value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - API name: {@code count}
		 */
		public final Builder count(Consumer<Counter.Builder> fn) {
			Counter.Builder builder = new Counter.Builder();
			fn.accept(builder);
			return this.count(builder.build());
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
			_checkSingleUse();

			return new Watcher(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Watcher}
	 */
	public static final JsonpDeserializer<Watcher> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Watcher::setupWatcherDeserializer);

	protected static void setupWatcherDeserializer(ObjectDeserializer<Watcher.Builder> op) {
		Base.setupBaseDeserializer(op);
		op.add(Builder::execution, WatcherActions._DESERIALIZER, "execution");
		op.add(Builder::watch, WatcherWatch._DESERIALIZER, "watch");
		op.add(Builder::count, Counter._DESERIALIZER, "count");

	}

}
