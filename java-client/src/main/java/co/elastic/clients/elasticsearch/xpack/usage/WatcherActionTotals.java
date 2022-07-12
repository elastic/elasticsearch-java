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

import co.elastic.clients.elasticsearch._types.Time;
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
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: xpack.usage.WatcherActionTotals

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#xpack.usage.WatcherActionTotals">API
 *      specification</a>
 */
@JsonpDeserializable
public class WatcherActionTotals implements JsonpSerializable {
	private final Time total;

	private final long totalTimeInMs;

	// ---------------------------------------------------------------------------------------------

	private WatcherActionTotals(Builder builder) {

		this.total = ApiTypeHelper.requireNonNull(builder.total, this, "total");
		this.totalTimeInMs = ApiTypeHelper.requireNonNull(builder.totalTimeInMs, this, "totalTimeInMs");

	}

	public static WatcherActionTotals of(Function<Builder, ObjectBuilder<WatcherActionTotals>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code total}
	 */
	public final Time total() {
		return this.total;
	}

	/**
	 * Required - API name: {@code total_time_in_ms}
	 */
	public final long totalTimeInMs() {
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
		this.total.serialize(generator, mapper);

		generator.writeKey("total_time_in_ms");
		generator.write(this.totalTimeInMs);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link WatcherActionTotals}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<WatcherActionTotals> {
		private Time total;

		private Long totalTimeInMs;

		/**
		 * Required - API name: {@code total}
		 */
		public final Builder total(Time value) {
			this.total = value;
			return this;
		}

		/**
		 * Required - API name: {@code total}
		 */
		public final Builder total(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.total(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - API name: {@code total_time_in_ms}
		 */
		public final Builder totalTimeInMs(long value) {
			this.totalTimeInMs = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link WatcherActionTotals}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public WatcherActionTotals build() {
			_checkSingleUse();

			return new WatcherActionTotals(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link WatcherActionTotals}
	 */
	public static final JsonpDeserializer<WatcherActionTotals> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, WatcherActionTotals::setupWatcherActionTotalsDeserializer);

	protected static void setupWatcherActionTotalsDeserializer(ObjectDeserializer<WatcherActionTotals.Builder> op) {

		op.add(Builder::total, Time._DESERIALIZER, "total");
		op.add(Builder::totalTimeInMs, JsonpDeserializer.longDeserializer(), "total_time_in_ms");

	}

}
