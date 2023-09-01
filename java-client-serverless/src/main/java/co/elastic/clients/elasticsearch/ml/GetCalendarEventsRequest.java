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
import co.elastic.clients.util.DateTime;
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

/**
 * Retrieves information about the scheduled events in calendars.
 * 
 * @see <a href="../doc-files/api-spec.html#ml.get_calendar_events.Request">API
 *      specification</a>
 */

public class GetCalendarEventsRequest extends RequestBase {
	private final String calendarId;

	@Nullable
	private final DateTime end;

	@Nullable
	private final Integer from;

	@Nullable
	private final String jobId;

	@Nullable
	private final Integer size;

	@Nullable
	private final DateTime start;

	// ---------------------------------------------------------------------------------------------

	private GetCalendarEventsRequest(Builder builder) {

		this.calendarId = ApiTypeHelper.requireNonNull(builder.calendarId, this, "calendarId");
		this.end = builder.end;
		this.from = builder.from;
		this.jobId = builder.jobId;
		this.size = builder.size;
		this.start = builder.start;

	}

	public static GetCalendarEventsRequest of(Function<Builder, ObjectBuilder<GetCalendarEventsRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - A string that uniquely identifies a calendar. You can get
	 * information for multiple calendars by using a comma-separated list of ids or
	 * a wildcard expression. You can get information for all calendars by using
	 * <code>_all</code> or <code>*</code> or by omitting the calendar identifier.
	 * <p>
	 * API name: {@code calendar_id}
	 */
	public final String calendarId() {
		return this.calendarId;
	}

	/**
	 * Specifies to get events with timestamps earlier than this time.
	 * <p>
	 * API name: {@code end}
	 */
	@Nullable
	public final DateTime end() {
		return this.end;
	}

	/**
	 * Skips the specified number of events.
	 * <p>
	 * API name: {@code from}
	 */
	@Nullable
	public final Integer from() {
		return this.from;
	}

	/**
	 * Specifies to get events for a specific anomaly detection job identifier or
	 * job group. It must be used with a calendar identifier of <code>_all</code> or
	 * <code>*</code>.
	 * <p>
	 * API name: {@code job_id}
	 */
	@Nullable
	public final String jobId() {
		return this.jobId;
	}

	/**
	 * Specifies the maximum number of events to obtain.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
	}

	/**
	 * Specifies to get events with timestamps after this time.
	 * <p>
	 * API name: {@code start}
	 */
	@Nullable
	public final DateTime start() {
		return this.start;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetCalendarEventsRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GetCalendarEventsRequest> {
		private String calendarId;

		@Nullable
		private DateTime end;

		@Nullable
		private Integer from;

		@Nullable
		private String jobId;

		@Nullable
		private Integer size;

		@Nullable
		private DateTime start;

		/**
		 * Required - A string that uniquely identifies a calendar. You can get
		 * information for multiple calendars by using a comma-separated list of ids or
		 * a wildcard expression. You can get information for all calendars by using
		 * <code>_all</code> or <code>*</code> or by omitting the calendar identifier.
		 * <p>
		 * API name: {@code calendar_id}
		 */
		public final Builder calendarId(String value) {
			this.calendarId = value;
			return this;
		}

		/**
		 * Specifies to get events with timestamps earlier than this time.
		 * <p>
		 * API name: {@code end}
		 */
		public final Builder end(@Nullable DateTime value) {
			this.end = value;
			return this;
		}

		/**
		 * Skips the specified number of events.
		 * <p>
		 * API name: {@code from}
		 */
		public final Builder from(@Nullable Integer value) {
			this.from = value;
			return this;
		}

		/**
		 * Specifies to get events for a specific anomaly detection job identifier or
		 * job group. It must be used with a calendar identifier of <code>_all</code> or
		 * <code>*</code>.
		 * <p>
		 * API name: {@code job_id}
		 */
		public final Builder jobId(@Nullable String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * Specifies the maximum number of events to obtain.
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * Specifies to get events with timestamps after this time.
		 * <p>
		 * API name: {@code start}
		 */
		public final Builder start(@Nullable DateTime value) {
			this.start = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetCalendarEventsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetCalendarEventsRequest build() {
			_checkSingleUse();

			return new GetCalendarEventsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.get_calendar_events}".
	 */
	public static final Endpoint<GetCalendarEventsRequest, GetCalendarEventsResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ml.get_calendar_events",

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

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _calendarId = 1 << 0;

				int propsSet = 0;

				propsSet |= _calendarId;

				if (propsSet == (_calendarId)) {
					params.put("calendarId", request.calendarId);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.size != null) {
					params.put("size", String.valueOf(request.size));
				}
				if (request.jobId != null) {
					params.put("job_id", request.jobId);
				}
				if (request.start != null) {
					params.put("start", request.start.toString());
				}
				if (request.end != null) {
					params.put("end", request.end.toString());
				}
				if (request.from != null) {
					params.put("from", String.valueOf(request.from));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, GetCalendarEventsResponse._DESERIALIZER);
}
