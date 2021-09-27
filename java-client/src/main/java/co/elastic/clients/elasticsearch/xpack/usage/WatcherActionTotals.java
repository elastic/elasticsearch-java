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
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: xpack.usage.WatcherActionTotals
@JsonpDeserializable
public final class WatcherActionTotals implements JsonpSerializable {
	private final Long total;

	private final Long totalTimeInMs;

	// ---------------------------------------------------------------------------------------------

	public WatcherActionTotals(Builder builder) {

		this.total = Objects.requireNonNull(builder.total, "total");
		this.totalTimeInMs = Objects.requireNonNull(builder.totalTimeInMs, "total_time_in_ms");

	}

	/**
	 * API name: {@code total}
	 */
	public Long total() {
		return this.total;
	}

	/**
	 * API name: {@code total_time_in_ms}
	 */
	public Long totalTimeInMs() {
		return this.totalTimeInMs;
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

		generator.writeKey("total");
		generator.write(this.total);

		generator.writeKey("total_time_in_ms");
		generator.write(this.totalTimeInMs);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link WatcherActionTotals}.
	 */
	public static class Builder implements ObjectBuilder<WatcherActionTotals> {
		private Long total;

		private Long totalTimeInMs;

		/**
		 * API name: {@code total}
		 */
		public Builder total(Long value) {
			this.total = value;
			return this;
		}

		/**
		 * API name: {@code total_time_in_ms}
		 */
		public Builder totalTimeInMs(Long value) {
			this.totalTimeInMs = value;
			return this;
		}

		/**
		 * Builds a {@link WatcherActionTotals}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public WatcherActionTotals build() {

			return new WatcherActionTotals(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link WatcherActionTotals}
	 */
	public static final JsonpDeserializer<WatcherActionTotals> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, WatcherActionTotals::setupWatcherActionTotalsDeserializer, Builder::build);

	protected static void setupWatcherActionTotalsDeserializer(DelegatingDeserializer<WatcherActionTotals.Builder> op) {

		op.add(Builder::total, JsonpDeserializer.longDeserializer(), "total");
		op.add(Builder::totalTimeInMs, JsonpDeserializer.longDeserializer(), "total_time_in_ms");

	}

}
