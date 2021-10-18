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

import co.elastic.clients.base.Endpoint;
import co.elastic.clients.base.SimpleEndpoint;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.get_calendar_events.Request

public final class GetCalendarEventsRequest extends RequestBase {
	private final String calendarId;

	@Nullable
	private final String jobId;

	@Nullable
	private final String end;

	@Nullable
	private final Integer from;

	@Nullable
	private final String start;

	@Nullable
	private final Integer size;

	// ---------------------------------------------------------------------------------------------

	public GetCalendarEventsRequest(Builder builder) {

		this.calendarId = Objects.requireNonNull(builder.calendarId, "calendar_id");
		this.jobId = builder.jobId;
		this.end = builder.end;
		this.from = builder.from;
		this.start = builder.start;
		this.size = builder.size;

	}

	public GetCalendarEventsRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - The ID of the calendar containing the events
	 * <p>
	 * API name: {@code calendar_id}
	 */
	public String calendarId() {
		return this.calendarId;
	}

	/**
	 * Get events for the job. When this option is used calendar_id must be '_all'
	 * <p>
	 * API name: {@code job_id}
	 */
	@Nullable
	public String jobId() {
		return this.jobId;
	}

	/**
	 * Get events before this time
	 * <p>
	 * API name: {@code end}
	 */
	@Nullable
	public String end() {
		return this.end;
	}

	/**
	 * Skips a number of events
	 * <p>
	 * API name: {@code from}
	 */
	@Nullable
	public Integer from() {
		return this.from;
	}

	/**
	 * Get events after this time
	 * <p>
	 * API name: {@code start}
	 */
	@Nullable
	public String start() {
		return this.start;
	}

	/**
	 * Specifies a max number of events to get
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public Integer size() {
		return this.size;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetCalendarEventsRequest}.
	 */
	public static class Builder implements ObjectBuilder<GetCalendarEventsRequest> {
		private String calendarId;

		@Nullable
		private String jobId;

		@Nullable
		private String end;

		@Nullable
		private Integer from;

		@Nullable
		private String start;

		@Nullable
		private Integer size;

		/**
		 * Required - The ID of the calendar containing the events
		 * <p>
		 * API name: {@code calendar_id}
		 */
		public Builder calendarId(String value) {
			this.calendarId = value;
			return this;
		}

		/**
		 * Get events for the job. When this option is used calendar_id must be '_all'
		 * <p>
		 * API name: {@code job_id}
		 */
		public Builder jobId(@Nullable String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * Get events before this time
		 * <p>
		 * API name: {@code end}
		 */
		public Builder end(@Nullable String value) {
			this.end = value;
			return this;
		}

		/**
		 * Skips a number of events
		 * <p>
		 * API name: {@code from}
		 */
		public Builder from(@Nullable Integer value) {
			this.from = value;
			return this;
		}

		/**
		 * Get events after this time
		 * <p>
		 * API name: {@code start}
		 */
		public Builder start(@Nullable String value) {
			this.start = value;
			return this;
		}

		/**
		 * Specifies a max number of events to get
		 * <p>
		 * API name: {@code size}
		 */
		public Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * Builds a {@link GetCalendarEventsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetCalendarEventsRequest build() {

			return new GetCalendarEventsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.get_calendar_events}".
	 */
	public static final Endpoint<GetCalendarEventsRequest, GetCalendarEventsResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _calendarId = 1 << 0;

				int propsSet = 0;

				propsSet |= _calendarId;

				if (propsSet == (_calendarId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/calendars");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.calendarId, buf);
					buf.append("/events");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.jobId != null) {
					params.put("job_id", request.jobId);
				}
				if (request.end != null) {
					params.put("end", request.end);
				}
				if (request.from != null) {
					params.put("from", String.valueOf(request.from));
				}
				if (request.start != null) {
					params.put("start", request.start);
				}
				if (request.size != null) {
					params.put("size", String.valueOf(request.size));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, GetCalendarEventsResponse._DESERIALIZER);
}
