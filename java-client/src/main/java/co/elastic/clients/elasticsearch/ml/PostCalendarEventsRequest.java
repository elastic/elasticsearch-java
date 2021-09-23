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

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.post_calendar_events.Request
public final class PostCalendarEventsRequest extends RequestBase implements JsonpSerializable {
	private final String calendarId;

	private final List<CalendarEvent> events;

	// ---------------------------------------------------------------------------------------------

	public PostCalendarEventsRequest(Builder builder) {

		this.calendarId = Objects.requireNonNull(builder.calendarId, "calendar_id");
		this.events = Objects.requireNonNull(builder.events, "events");

	}

	/**
	 * A string that uniquely identifies a calendar.
	 * <p>
	 * API name: {@code calendar_id}
	 */
	public String calendarId() {
		return this.calendarId;
	}

	/**
	 * A list of one of more scheduled events. The event’s start and end times may
	 * be specified as integer milliseconds since the epoch or as a string in ISO
	 * 8601 format.
	 * <p>
	 * API name: {@code events}
	 */
	public List<CalendarEvent> events() {
		return this.events;
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

		generator.writeKey("events");
		generator.writeStartArray();
		for (CalendarEvent item0 : this.events) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PostCalendarEventsRequest}.
	 */
	public static class Builder implements ObjectBuilder<PostCalendarEventsRequest> {
		private String calendarId;

		private List<CalendarEvent> events;

		/**
		 * A string that uniquely identifies a calendar.
		 * <p>
		 * API name: {@code calendar_id}
		 */
		public Builder calendarId(String value) {
			this.calendarId = value;
			return this;
		}

		/**
		 * A list of one of more scheduled events. The event’s start and end times may
		 * be specified as integer milliseconds since the epoch or as a string in ISO
		 * 8601 format.
		 * <p>
		 * API name: {@code events}
		 */
		public Builder events(List<CalendarEvent> value) {
			this.events = value;
			return this;
		}

		/**
		 * A list of one of more scheduled events. The event’s start and end times may
		 * be specified as integer milliseconds since the epoch or as a string in ISO
		 * 8601 format.
		 * <p>
		 * API name: {@code events}
		 */
		public Builder events(CalendarEvent... value) {
			this.events = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #events(List)}, creating the list if needed.
		 */
		public Builder addEvents(CalendarEvent value) {
			if (this.events == null) {
				this.events = new ArrayList<>();
			}
			this.events.add(value);
			return this;
		}

		/**
		 * Set {@link #events(List)} to a singleton list.
		 */
		public Builder events(Function<CalendarEvent.Builder, ObjectBuilder<CalendarEvent>> fn) {
			return this.events(fn.apply(new CalendarEvent.Builder()).build());
		}

		/**
		 * Add a value to {@link #events(List)}, creating the list if needed.
		 */
		public Builder addEvents(Function<CalendarEvent.Builder, ObjectBuilder<CalendarEvent>> fn) {
			return this.addEvents(fn.apply(new CalendarEvent.Builder()).build());
		}

		/**
		 * Builds a {@link PostCalendarEventsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PostCalendarEventsRequest build() {

			return new PostCalendarEventsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PostCalendarEventsRequest}
	 */
	public static final JsonpDeserializer<PostCalendarEventsRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, PostCalendarEventsRequest::setupPostCalendarEventsRequestDeserializer);

	protected static void setupPostCalendarEventsRequestDeserializer(
			DelegatingDeserializer<PostCalendarEventsRequest.Builder> op) {

		op.add(Builder::events, JsonpDeserializer.arrayDeserializer(CalendarEvent.DESERIALIZER), "events");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.post_calendar_events}".
	 */
	public static final Endpoint<PostCalendarEventsRequest, PostCalendarEventsResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _calendarId = 1 << 0;

				int propsSet = 0;

				if (request.calendarId() != null)
					propsSet |= _calendarId;

				if (propsSet == (_calendarId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/calendars");
					buf.append("/");
					buf.append(request.calendarId);
					buf.append("/events");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), true, PostCalendarEventsResponse.DESERIALIZER);
}
