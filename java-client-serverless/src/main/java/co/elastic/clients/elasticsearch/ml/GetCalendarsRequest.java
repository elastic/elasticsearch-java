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
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
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

/**
 * Retrieves configuration information for calendars.
 * 
 * @see <a href="../doc-files/api-spec.html#ml.get_calendars.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetCalendarsRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final String calendarId;

	@Nullable
	private final Integer from;

	@Nullable
	private final Page page;

	@Nullable
	private final Integer size;

	// ---------------------------------------------------------------------------------------------

	private GetCalendarsRequest(Builder builder) {

		this.calendarId = builder.calendarId;
		this.from = builder.from;
		this.page = builder.page;
		this.size = builder.size;

	}

	public static GetCalendarsRequest of(Function<Builder, ObjectBuilder<GetCalendarsRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * A string that uniquely identifies a calendar. You can get information for
	 * multiple calendars by using a comma-separated list of ids or a wildcard
	 * expression. You can get information for all calendars by using
	 * <code>_all</code> or <code>*</code> or by omitting the calendar identifier.
	 * <p>
	 * API name: {@code calendar_id}
	 */
	@Nullable
	public final String calendarId() {
		return this.calendarId;
	}

	/**
	 * Skips the specified number of calendars. This parameter is supported only
	 * when you omit the calendar identifier.
	 * <p>
	 * API name: {@code from}
	 */
	@Nullable
	public final Integer from() {
		return this.from;
	}

	/**
	 * This object is supported only when you omit the calendar identifier.
	 * <p>
	 * API name: {@code page}
	 */
	@Nullable
	public final Page page() {
		return this.page;
	}

	/**
	 * Specifies the maximum number of calendars to obtain. This parameter is
	 * supported only when you omit the calendar identifier.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
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

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GetCalendarsRequest> {
		@Nullable
		private String calendarId;

		@Nullable
		private Integer from;

		@Nullable
		private Page page;

		@Nullable
		private Integer size;

		/**
		 * A string that uniquely identifies a calendar. You can get information for
		 * multiple calendars by using a comma-separated list of ids or a wildcard
		 * expression. You can get information for all calendars by using
		 * <code>_all</code> or <code>*</code> or by omitting the calendar identifier.
		 * <p>
		 * API name: {@code calendar_id}
		 */
		public final Builder calendarId(@Nullable String value) {
			this.calendarId = value;
			return this;
		}

		/**
		 * Skips the specified number of calendars. This parameter is supported only
		 * when you omit the calendar identifier.
		 * <p>
		 * API name: {@code from}
		 */
		public final Builder from(@Nullable Integer value) {
			this.from = value;
			return this;
		}

		/**
		 * This object is supported only when you omit the calendar identifier.
		 * <p>
		 * API name: {@code page}
		 */
		public final Builder page(@Nullable Page value) {
			this.page = value;
			return this;
		}

		/**
		 * This object is supported only when you omit the calendar identifier.
		 * <p>
		 * API name: {@code page}
		 */
		public final Builder page(Function<Page.Builder, ObjectBuilder<Page>> fn) {
			return this.page(fn.apply(new Page.Builder()).build());
		}

		/**
		 * Specifies the maximum number of calendars to obtain. This parameter is
		 * supported only when you omit the calendar identifier.
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetCalendarsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetCalendarsRequest build() {
			_checkSingleUse();

			return new GetCalendarsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetCalendarsRequest}
	 */
	public static final JsonpDeserializer<GetCalendarsRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetCalendarsRequest::setupGetCalendarsRequestDeserializer);

	protected static void setupGetCalendarsRequestDeserializer(ObjectDeserializer<GetCalendarsRequest.Builder> op) {

		op.add(Builder::page, Page._DESERIALIZER, "page");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.get_calendars}".
	 */
	public static final Endpoint<GetCalendarsRequest, GetCalendarsResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ml.get_calendars",

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

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _calendarId = 1 << 0;

				int propsSet = 0;

				if (request.calendarId() != null)
					propsSet |= _calendarId;

				if (propsSet == 0) {
				}
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
				if (request.from != null) {
					params.put("from", String.valueOf(request.from));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, GetCalendarsResponse._DESERIALIZER);
}
