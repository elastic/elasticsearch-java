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

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: xpack.usage.Watcher
public final class Watcher extends Base {
	private final WatcherActions execution;

	private final WatcherWatch watch;

	private final Counter count;

	// ---------------------------------------------------------------------------------------------

	protected Watcher(Builder builder) {
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

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);

		generator.writeKey("execution");
		this.execution.toJsonp(generator, mapper);

		generator.writeKey("watch");
		this.watch.toJsonp(generator, mapper);

		generator.writeKey("count");
		this.count.toJsonp(generator, mapper);

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
	 * Json parser for Watcher
	 */
	public static final JsonpValueParser<Watcher> JSONP_PARSER = JsonpObjectBuilderParser.createForObject(Builder::new,
			Watcher::setupWatcherParser);

	protected static void setupWatcherParser(DelegatingJsonpValueParser<Watcher.Builder> op) {
		Base.setupBaseParser(op);
		op.add(Builder::execution, WatcherActions.JSONP_PARSER, "execution");
		op.add(Builder::watch, WatcherWatch.JSONP_PARSER, "watch");
		op.add(Builder::count, Counter.JSONP_PARSER, "count");

	}

}
