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
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: xpack.usage.WatcherWatchTrigger
public final class WatcherWatchTrigger implements ToJsonp {
	@Nullable
	private final WatcherWatchTriggerSchedule schedule;

	private final Counter _all;

	// ---------------------------------------------------------------------------------------------

	protected WatcherWatchTrigger(Builder builder) {

		this.schedule = builder.schedule;
		this._all = Objects.requireNonNull(builder._all, "_all");

	}

	/**
	 * API name: {@code schedule}
	 */
	@Nullable
	public WatcherWatchTriggerSchedule schedule() {
		return this.schedule;
	}

	/**
	 * API name: {@code _all}
	 */
	public Counter _all() {
		return this._all;
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

		if (this.schedule != null) {

			generator.writeKey("schedule");
			this.schedule.toJsonp(generator, mapper);

		}

		generator.writeKey("_all");
		this._all.toJsonp(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link WatcherWatchTrigger}.
	 */
	public static class Builder implements ObjectBuilder<WatcherWatchTrigger> {
		@Nullable
		private WatcherWatchTriggerSchedule schedule;

		private Counter _all;

		/**
		 * API name: {@code schedule}
		 */
		public Builder schedule(@Nullable WatcherWatchTriggerSchedule value) {
			this.schedule = value;
			return this;
		}

		/**
		 * API name: {@code schedule}
		 */
		public Builder schedule(
				Function<WatcherWatchTriggerSchedule.Builder, ObjectBuilder<WatcherWatchTriggerSchedule>> fn) {
			return this.schedule(fn.apply(new WatcherWatchTriggerSchedule.Builder()).build());
		}

		/**
		 * API name: {@code _all}
		 */
		public Builder _all(Counter value) {
			this._all = value;
			return this;
		}

		/**
		 * API name: {@code _all}
		 */
		public Builder _all(Function<Counter.Builder, ObjectBuilder<Counter>> fn) {
			return this._all(fn.apply(new Counter.Builder()).build());
		}

		/**
		 * Builds a {@link WatcherWatchTrigger}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public WatcherWatchTrigger build() {

			return new WatcherWatchTrigger(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for WatcherWatchTrigger
	 */
	public static final JsonpDeserializer<WatcherWatchTrigger> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, WatcherWatchTrigger::setupWatcherWatchTriggerDeserializer);

	protected static void setupWatcherWatchTriggerDeserializer(DelegatingDeserializer<WatcherWatchTrigger.Builder> op) {

		op.add(Builder::schedule, WatcherWatchTriggerSchedule.DESERIALIZER, "schedule");
		op.add(Builder::_all, Counter.DESERIALIZER, "_all");

	}

}
