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
import java.lang.Integer;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.get_calendars.Request
@JsonpDeserializable
public final class GetCalendarsRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final String calendarId;

	@Nullable
	private final Integer from;

	@Nullable
	private final Integer size;

	@Nullable
	private final Page page;

	// ---------------------------------------------------------------------------------------------

	public GetCalendarsRequest(Builder builder) {

		this.calendarId = builder.calendarId;
		this.from = builder.from;
		this.size = builder.size;
		this.page = builder.page;

	}

	public GetCalendarsRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * A string that uniquely identifies a calendar.
	 * <p>
	 * API name: {@code calendar_id}
	 */
	@Nullable
	public String calendarId() {
		return this.calendarId;
	}

	/**
	 * Skips the specified number of calendars.
	 * <p>
	 * API name: {@code from}
	 */
	@Nullable
	public Integer from() {
		return this.from;
	}

	/**
	 * Specifies the maximum number of calendars to obtain.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public Integer size() {
		return this.size;
	}

	/**
	 * API name: {@code page}
	 */
	@Nullable
	public Page page() {
		return this.page;
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

		if (this.page != null) {

			generator.writeKey("page");
			this.page.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetCalendarsRequest}.
	 */
	public static class Builder implements ObjectBuilder<GetCalendarsRequest> {
		@Nullable
		private String calendarId;

		@Nullable
		private Integer from;

		@Nullable
		private Integer size;

		@Nullable
		private Page page;

		/**
		 * A string that uniquely identifies a calendar.
		 * <p>
		 * API name: {@code calendar_id}
		 */
		public Builder calendarId(@Nullable String value) {
			this.calendarId = value;
			return this;
		}

		/**
		 * Skips the specified number of calendars.
		 * <p>
		 * API name: {@code from}
		 */
		public Builder from(@Nullable Integer value) {
			this.from = value;
			return this;
		}

		/**
		 * Specifies the maximum number of calendars to obtain.
		 * <p>
		 * API name: {@code size}
		 */
		public Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * API name: {@code page}
		 */
		public Builder page(@Nullable Page value) {
			this.page = value;
			return this;
		}

		/**
		 * API name: {@code page}
		 */
		public Builder page(Function<Page.Builder, ObjectBuilder<Page>> fn) {
			return this.page(fn.apply(new Page.Builder()).build());
		}

		/**
		 * Builds a {@link GetCalendarsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetCalendarsRequest build() {

			return new GetCalendarsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetCalendarsRequest}
	 */
	public static final JsonpDeserializer<GetCalendarsRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetCalendarsRequest::setupGetCalendarsRequestDeserializer, Builder::build);

	protected static void setupGetCalendarsRequestDeserializer(DelegatingDeserializer<GetCalendarsRequest.Builder> op) {

		op.add(Builder::page, Page._DESERIALIZER, "page");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.get_calendars}".
	 */
	public static final Endpoint<GetCalendarsRequest, GetCalendarsResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
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

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/calendars");
					return buf.toString();
				}
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
				Map<String, String> params = new HashMap<>();
				if (request.from != null) {
					params.put("from", String.valueOf(request.from));
				}
				if (request.size != null) {
					params.put("size", String.valueOf(request.size));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, GetCalendarsResponse._DESERIALIZER);
}
