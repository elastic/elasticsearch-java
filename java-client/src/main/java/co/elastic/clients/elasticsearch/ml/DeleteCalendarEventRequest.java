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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml.delete_calendar_event.Request

public final class DeleteCalendarEventRequest extends RequestBase {
	private final String calendarId;

	private final String eventId;

	// ---------------------------------------------------------------------------------------------

	public DeleteCalendarEventRequest(Builder builder) {

		this.calendarId = Objects.requireNonNull(builder.calendarId, "calendar_id");
		this.eventId = Objects.requireNonNull(builder.eventId, "event_id");

	}

	/**
	 * The ID of the calendar to modify
	 * <p>
	 * API name: {@code calendar_id}
	 */
	public String calendarId() {
		return this.calendarId;
	}

	/**
	 * The ID of the event to remove from the calendar
	 * <p>
	 * API name: {@code event_id}
	 */
	public String eventId() {
		return this.eventId;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteCalendarEventRequest}.
	 */
	public static class Builder implements ObjectBuilder<DeleteCalendarEventRequest> {
		private String calendarId;

		private String eventId;

		/**
		 * The ID of the calendar to modify
		 * <p>
		 * API name: {@code calendar_id}
		 */
		public Builder calendarId(String value) {
			this.calendarId = value;
			return this;
		}

		/**
		 * The ID of the event to remove from the calendar
		 * <p>
		 * API name: {@code event_id}
		 */
		public Builder eventId(String value) {
			this.eventId = value;
			return this;
		}

		/**
		 * Builds a {@link DeleteCalendarEventRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteCalendarEventRequest build() {

			return new DeleteCalendarEventRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.delete_calendar_event}".
	 */
	public static final Endpoint<DeleteCalendarEventRequest, DeleteCalendarEventResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "DELETE";

			},

			// Request path
			request -> {
				final int _calendarId = 1 << 0;
				final int _eventId = 1 << 1;

				int propsSet = 0;

				if (request.calendarId() != null)
					propsSet |= _calendarId;
				if (request.eventId() != null)
					propsSet |= _eventId;

				if (propsSet == (_calendarId | _eventId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/calendars");
					buf.append("/");
					buf.append(request.calendarId);
					buf.append("/events");
					buf.append("/");
					buf.append(request.eventId);
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), false, DeleteCalendarEventResponse._DESERIALIZER);
}
