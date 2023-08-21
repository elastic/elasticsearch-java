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

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.delete_calendar_event.Request

/**
 * Deletes scheduled events from a calendar.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#ml.delete_calendar_event.Request">API
 *      specification</a>
 */

public class DeleteCalendarEventRequest extends RequestBase {
	private final String calendarId;

	private final String eventId;

	// ---------------------------------------------------------------------------------------------

	private DeleteCalendarEventRequest(Builder builder) {

		this.calendarId = ApiTypeHelper.requireNonNull(builder.calendarId, this, "calendarId");
		this.eventId = ApiTypeHelper.requireNonNull(builder.eventId, this, "eventId");

	}

	public static DeleteCalendarEventRequest of(Function<Builder, ObjectBuilder<DeleteCalendarEventRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The ID of the calendar to modify
	 * <p>
	 * API name: {@code calendar_id}
	 */
	public final String calendarId() {
		return this.calendarId;
	}

	/**
	 * Required - The ID of the event to remove from the calendar
	 * <p>
	 * API name: {@code event_id}
	 */
	public final String eventId() {
		return this.eventId;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteCalendarEventRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DeleteCalendarEventRequest> {
		private String calendarId;

		private String eventId;

		/**
		 * Required - The ID of the calendar to modify
		 * <p>
		 * API name: {@code calendar_id}
		 */
		public final Builder calendarId(String value) {
			this.calendarId = value;
			return this;
		}

		/**
		 * Required - The ID of the event to remove from the calendar
		 * <p>
		 * API name: {@code event_id}
		 */
		public final Builder eventId(String value) {
			this.eventId = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DeleteCalendarEventRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteCalendarEventRequest build() {
			_checkSingleUse();

			return new DeleteCalendarEventRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.delete_calendar_event}".
	 */
	public static final Endpoint<DeleteCalendarEventRequest, DeleteCalendarEventResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ml.delete_calendar_event",

			// Request method
			request -> {
				return "DELETE";

			},

			// Request path
			request -> {
				final int _eventId = 1 << 0;
				final int _calendarId = 1 << 1;

				int propsSet = 0;

				propsSet |= _eventId;
				propsSet |= _calendarId;

				if (propsSet == (_calendarId | _eventId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/calendars");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.calendarId, buf);
					buf.append("/events");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.eventId, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _eventId = 1 << 0;
				final int _calendarId = 1 << 1;

				int propsSet = 0;

				propsSet |= _eventId;
				propsSet |= _calendarId;

				if (propsSet == (_calendarId | _eventId)) {
					params.put("calendarId", request.calendarId);
					params.put("eventId", request.eventId);
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), false, DeleteCalendarEventResponse._DESERIALIZER);
}
