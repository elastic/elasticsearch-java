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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
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

// typedef: xpack.usage.Watcher

/**
 *
 * @see <a href="../../doc-files/api-spec.html#xpack.usage.Watcher">API
 *      specification</a>
 */
@JsonpDeserializable
public class Watcher extends Base {
	private final WatcherActions execution;

	private final WatcherWatch watch;

	private final Counter count;

	// ---------------------------------------------------------------------------------------------

	private Watcher(Builder builder) {
		super(builder);

		this.execution = ApiTypeHelper.requireNonNull(builder.execution, this, "execution");
		this.watch = ApiTypeHelper.requireNonNull(builder.watch, this, "watch");
		this.count = ApiTypeHelper.requireNonNull(builder.count, this, "count");

	}

	public static Watcher of(Function<Builder, ObjectBuilder<Watcher>> fn) {
		return fn.apply(new Builder()).build();
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
		public final Builder execution(Function<WatcherActions.Builder, ObjectBuilder<WatcherActions>> fn) {
			return this.execution(fn.apply(new WatcherActions.Builder()).build());
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
		public final Builder watch(Function<WatcherWatch.Builder, ObjectBuilder<WatcherWatch>> fn) {
			return this.watch(fn.apply(new WatcherWatch.Builder()).build());
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
		public final Builder count(Function<Counter.Builder, ObjectBuilder<Counter>> fn) {
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
