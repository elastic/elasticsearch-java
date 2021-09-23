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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml._types.CalendarEvent
public final class CalendarEvent implements JsonpSerializable {
	@Nullable
	private final String calendarId;

	@Nullable
	private final String eventId;

	private final String description;

	private final JsonValue endTime;

	private final JsonValue startTime;

	// ---------------------------------------------------------------------------------------------

	public CalendarEvent(Builder builder) {

		this.calendarId = builder.calendarId;
		this.eventId = builder.eventId;
		this.description = Objects.requireNonNull(builder.description, "description");
		this.endTime = Objects.requireNonNull(builder.endTime, "end_time");
		this.startTime = Objects.requireNonNull(builder.startTime, "start_time");

	}

	/**
	 * API name: {@code calendar_id}
	 */
	@Nullable
	public String calendarId() {
		return this.calendarId;
	}

	/**
	 * API name: {@code event_id}
	 */
	@Nullable
	public String eventId() {
		return this.eventId;
	}

	/**
	 * A description of the scheduled event.
	 * <p>
	 * API name: {@code description}
	 */
	public String description() {
		return this.description;
	}

	/**
	 * The timestamp for the end of the scheduled event in milliseconds since the
	 * epoch or ISO 8601 format.
	 * <p>
	 * API name: {@code end_time}
	 */
	public JsonValue endTime() {
		return this.endTime;
	}

	/**
	 * The timestamp for the beginning of the scheduled event in milliseconds since
	 * the epoch or ISO 8601 format.
	 * <p>
	 * API name: {@code start_time}
	 */
	public JsonValue startTime() {
		return this.startTime;
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

		if (this.calendarId != null) {

			generator.writeKey("calendar_id");
			generator.write(this.calendarId);

		}
		if (this.eventId != null) {

			generator.writeKey("event_id");
			generator.write(this.eventId);

		}

		generator.writeKey("description");
		generator.write(this.description);

		generator.writeKey("end_time");
		generator.write(this.endTime);

		generator.writeKey("start_time");
		generator.write(this.startTime);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CalendarEvent}.
	 */
	public static class Builder implements ObjectBuilder<CalendarEvent> {
		@Nullable
		private String calendarId;

		@Nullable
		private String eventId;

		private String description;

		private JsonValue endTime;

		private JsonValue startTime;

		/**
		 * API name: {@code calendar_id}
		 */
		public Builder calendarId(@Nullable String value) {
			this.calendarId = value;
			return this;
		}

		/**
		 * API name: {@code event_id}
		 */
		public Builder eventId(@Nullable String value) {
			this.eventId = value;
			return this;
		}

		/**
		 * A description of the scheduled event.
		 * <p>
		 * API name: {@code description}
		 */
		public Builder description(String value) {
			this.description = value;
			return this;
		}

		/**
		 * The timestamp for the end of the scheduled event in milliseconds since the
		 * epoch or ISO 8601 format.
		 * <p>
		 * API name: {@code end_time}
		 */
		public Builder endTime(JsonValue value) {
			this.endTime = value;
			return this;
		}

		/**
		 * The timestamp for the beginning of the scheduled event in milliseconds since
		 * the epoch or ISO 8601 format.
		 * <p>
		 * API name: {@code start_time}
		 */
		public Builder startTime(JsonValue value) {
			this.startTime = value;
			return this;
		}

		/**
		 * Builds a {@link CalendarEvent}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CalendarEvent build() {

			return new CalendarEvent(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CalendarEvent}
	 */
	public static final JsonpDeserializer<CalendarEvent> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, CalendarEvent::setupCalendarEventDeserializer);

	protected static void setupCalendarEventDeserializer(DelegatingDeserializer<CalendarEvent.Builder> op) {

		op.add(Builder::calendarId, JsonpDeserializer.stringDeserializer(), "calendar_id");
		op.add(Builder::eventId, JsonpDeserializer.stringDeserializer(), "event_id");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::endTime, JsonpDeserializer.jsonValueDeserializer(), "end_time");
		op.add(Builder::startTime, JsonpDeserializer.jsonValueDeserializer(), "start_time");

	}

}
