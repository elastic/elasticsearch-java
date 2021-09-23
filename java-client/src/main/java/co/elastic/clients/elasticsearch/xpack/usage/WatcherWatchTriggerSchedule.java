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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: xpack.usage.WatcherWatchTriggerSchedule
public final class WatcherWatchTriggerSchedule extends Counter {
	private final Counter cron;

	private final Counter all;

	// ---------------------------------------------------------------------------------------------

	public WatcherWatchTriggerSchedule(Builder builder) {
		super(builder);

		this.cron = Objects.requireNonNull(builder.cron, "cron");
		this.all = Objects.requireNonNull(builder.all, "_all");

	}

	/**
	 * API name: {@code cron}
	 */
	public Counter cron() {
		return this.cron;
	}

	/**
	 * API name: {@code _all}
	 */
	public Counter all() {
		return this.all;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);

		generator.writeKey("cron");
		this.cron.serialize(generator, mapper);

		generator.writeKey("_all");
		this.all.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link WatcherWatchTriggerSchedule}.
	 */
	public static class Builder extends Counter.AbstractBuilder<Builder>
			implements
				ObjectBuilder<WatcherWatchTriggerSchedule> {
		private Counter cron;

		private Counter all;

		/**
		 * API name: {@code cron}
		 */
		public Builder cron(Counter value) {
			this.cron = value;
			return this;
		}

		/**
		 * API name: {@code cron}
		 */
		public Builder cron(Function<Counter.Builder, ObjectBuilder<Counter>> fn) {
			return this.cron(fn.apply(new Counter.Builder()).build());
		}

		/**
		 * API name: {@code _all}
		 */
		public Builder all(Counter value) {
			this.all = value;
			return this;
		}

		/**
		 * API name: {@code _all}
		 */
		public Builder all(Function<Counter.Builder, ObjectBuilder<Counter>> fn) {
			return this.all(fn.apply(new Counter.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link WatcherWatchTriggerSchedule}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public WatcherWatchTriggerSchedule build() {

			return new WatcherWatchTriggerSchedule(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link WatcherWatchTriggerSchedule}
	 */
	public static final JsonpDeserializer<WatcherWatchTriggerSchedule> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, WatcherWatchTriggerSchedule::setupWatcherWatchTriggerScheduleDeserializer);

	protected static void setupWatcherWatchTriggerScheduleDeserializer(
			DelegatingDeserializer<WatcherWatchTriggerSchedule.Builder> op) {
		Counter.setupCounterDeserializer(op);
		op.add(Builder::cron, Counter.DESERIALIZER, "cron");
		op.add(Builder::all, Counter.DESERIALIZER, "_all");

	}

}
