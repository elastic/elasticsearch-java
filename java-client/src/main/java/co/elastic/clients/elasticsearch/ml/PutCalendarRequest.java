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
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.put_calendar.Request
@JsonpDeserializable
public final class PutCalendarRequest extends RequestBase implements JsonpSerializable {
	private final String calendarId;

	@Nullable
	private final String description;

	// ---------------------------------------------------------------------------------------------

	public PutCalendarRequest(Builder builder) {

		this.calendarId = Objects.requireNonNull(builder.calendarId, "calendar_id");
		this.description = builder.description;

	}

	public PutCalendarRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - A string that uniquely identifies a calendar.
	 * <p>
	 * API name: {@code calendar_id}
	 */
	public String calendarId() {
		return this.calendarId;
	}

	/**
	 * A description of the calendar.
	 * <p>
	 * API name: {@code description}
	 */
	@Nullable
	public String description() {
		return this.description;
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

		if (this.description != null) {

			generator.writeKey("description");
			generator.write(this.description);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutCalendarRequest}.
	 */
	public static class Builder implements ObjectBuilder<PutCalendarRequest> {
		private String calendarId;

		@Nullable
		private String description;

		/**
		 * Required - A string that uniquely identifies a calendar.
		 * <p>
		 * API name: {@code calendar_id}
		 */
		public Builder calendarId(String value) {
			this.calendarId = value;
			return this;
		}

		/**
		 * A description of the calendar.
		 * <p>
		 * API name: {@code description}
		 */
		public Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * Builds a {@link PutCalendarRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutCalendarRequest build() {

			return new PutCalendarRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutCalendarRequest}
	 */
	public static final JsonpDeserializer<PutCalendarRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutCalendarRequest::setupPutCalendarRequestDeserializer, Builder::build);

	protected static void setupPutCalendarRequestDeserializer(DelegatingDeserializer<PutCalendarRequest.Builder> op) {

		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.put_calendar}".
	 */
	public static final Endpoint<PutCalendarRequest, PutCalendarResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "PUT";

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
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, PutCalendarResponse._DESERIALIZER);
}
