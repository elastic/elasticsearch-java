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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml.get_calendar_events.Request
public final class GetCalendarEventsRequest extends RequestBase implements ToJsonp {
	private final String calendarId;

	@Nullable
	private final String jobId;

	@Nullable
	private final String end;

	@Nullable
	private final Number from;

	@Nullable
	private final String start;

	@Nullable
	private final Number size;

	// ---------------------------------------------------------------------------------------------

	protected GetCalendarEventsRequest(Builder builder) {

		this.calendarId = Objects.requireNonNull(builder.calendarId, "calendar_id");
		this.jobId = builder.jobId;
		this.end = builder.end;
		this.from = builder.from;
		this.start = builder.start;
		this.size = builder.size;

	}

	/**
	 * The ID of the calendar containing the events
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
	 * API name: {@code end}
	 */
	@Nullable
	public String end() {
		return this.end;
	}

	/**
	 * API name: {@code from}
	 */
	@Nullable
	public Number from() {
		return this.from;
	}

	/**
	 * API name: {@code start}
	 */
	@Nullable
	public String start() {
		return this.start;
	}

	/**
	 * API name: {@code size}
	 */
	@Nullable
	public Number size() {
		return this.size;
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

		if (this.end != null) {

			generator.writeKey("end");
			generator.write(this.end);

		}
		if (this.from != null) {

			generator.writeKey("from");
			generator.write(this.from.doubleValue());

		}
		if (this.start != null) {

			generator.writeKey("start");
			generator.write(this.start);

		}
		if (this.size != null) {

			generator.writeKey("size");
			generator.write(this.size.doubleValue());

		}

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
		private Number from;

		@Nullable
		private String start;

		@Nullable
		private Number size;

		/**
		 * The ID of the calendar containing the events
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
		 * API name: {@code end}
		 */
		public Builder end(@Nullable String value) {
			this.end = value;
			return this;
		}

		/**
		 * API name: {@code from}
		 */
		public Builder from(@Nullable Number value) {
			this.from = value;
			return this;
		}

		/**
		 * API name: {@code start}
		 */
		public Builder start(@Nullable String value) {
			this.start = value;
			return this;
		}

		/**
		 * API name: {@code size}
		 */
		public Builder size(@Nullable Number value) {
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
	 * Json deserializer for GetCalendarEventsRequest
	 */
	public static final JsonpDeserializer<GetCalendarEventsRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, GetCalendarEventsRequest::setupGetCalendarEventsRequestDeserializer);

	protected static void setupGetCalendarEventsRequestDeserializer(
			DelegatingDeserializer<GetCalendarEventsRequest.Builder> op) {

		op.add(Builder::end, JsonpDeserializer.stringDeserializer(), "end");
		op.add(Builder::from, JsonpDeserializer.numberDeserializer(), "from");
		op.add(Builder::start, JsonpDeserializer.stringDeserializer(), "start");
		op.add(Builder::size, JsonpDeserializer.numberDeserializer(), "size");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.get_calendar_events}".
	 */
	public static final Endpoint<GetCalendarEventsRequest, GetCalendarEventsResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "GET";

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
				Map<String, String> params = new HashMap<>();
				if (request.jobId != null) {
					params.put("job_id", request.jobId);
				}
				return params;

			}, Endpoint.Simple.emptyMap(), true, GetCalendarEventsResponse.DESERIALIZER);
}
