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

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.DailySchedule
@JsonpDeserializable
public final class DailySchedule implements ScheduleVariant, JsonpSerializable {
	private final JsonValue /* Union(Array<internal.string> | watcher._types.TimeOfDay) */ at;

	// ---------------------------------------------------------------------------------------------

	public DailySchedule(Builder builder) {

		this.at = Objects.requireNonNull(builder.at, "at");

	}

	public DailySchedule(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link Schedule} variant type
	 */
	@Override
	public String _variantType() {
		return "daily";
	}

	/**
	 * Required - API name: {@code at}
	 */
	public JsonValue /* Union(Array<internal.string> | watcher._types.TimeOfDay) */ at() {
		return this.at;
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

		generator.writeKey("at");
		generator.write(this.at);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DailySchedule}.
	 */
	public static class Builder implements ObjectBuilder<DailySchedule> {
		private JsonValue /* Union(Array<internal.string> | watcher._types.TimeOfDay) */ at;

		/**
		 * Required - API name: {@code at}
		 */
		public Builder at(JsonValue /* Union(Array<internal.string> | watcher._types.TimeOfDay) */ value) {
			this.at = value;
			return this;
		}

		/**
		 * Builds a {@link DailySchedule}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DailySchedule build() {

			return new DailySchedule(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DailySchedule}
	 */
	public static final JsonpDeserializer<DailySchedule> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			DailySchedule::setupDailyScheduleDeserializer, Builder::build);

	protected static void setupDailyScheduleDeserializer(DelegatingDeserializer<DailySchedule.Builder> op) {

		op.add(Builder::at, JsonpDeserializer.jsonValueDeserializer(), "at");

	}

}
