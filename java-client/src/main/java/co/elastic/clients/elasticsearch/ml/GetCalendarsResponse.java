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

import co.elastic.clients.elasticsearch.ml.get_calendars.Calendar;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.get_calendars.Response
public final class GetCalendarsResponse implements JsonpSerializable {
	private final List<Calendar> calendars;

	private final Number count;

	// ---------------------------------------------------------------------------------------------

	public GetCalendarsResponse(Builder builder) {

		this.calendars = Objects.requireNonNull(builder.calendars, "calendars");
		this.count = Objects.requireNonNull(builder.count, "count");

	}

	/**
	 * API name: {@code calendars}
	 */
	public List<Calendar> calendars() {
		return this.calendars;
	}

	/**
	 * API name: {@code count}
	 */
	public Number count() {
		return this.count;
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

		generator.writeKey("calendars");
		generator.writeStartArray();
		for (Calendar item0 : this.calendars) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("count");
		generator.write(this.count.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetCalendarsResponse}.
	 */
	public static class Builder implements ObjectBuilder<GetCalendarsResponse> {
		private List<Calendar> calendars;

		private Number count;

		/**
		 * API name: {@code calendars}
		 */
		public Builder calendars(List<Calendar> value) {
			this.calendars = value;
			return this;
		}

		/**
		 * API name: {@code calendars}
		 */
		public Builder calendars(Calendar... value) {
			this.calendars = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #calendars(List)}, creating the list if needed.
		 */
		public Builder addCalendars(Calendar value) {
			if (this.calendars == null) {
				this.calendars = new ArrayList<>();
			}
			this.calendars.add(value);
			return this;
		}

		/**
		 * Set {@link #calendars(List)} to a singleton list.
		 */
		public Builder calendars(Function<Calendar.Builder, ObjectBuilder<Calendar>> fn) {
			return this.calendars(fn.apply(new Calendar.Builder()).build());
		}

		/**
		 * Add a value to {@link #calendars(List)}, creating the list if needed.
		 */
		public Builder addCalendars(Function<Calendar.Builder, ObjectBuilder<Calendar>> fn) {
			return this.addCalendars(fn.apply(new Calendar.Builder()).build());
		}

		/**
		 * API name: {@code count}
		 */
		public Builder count(Number value) {
			this.count = value;
			return this;
		}

		/**
		 * Builds a {@link GetCalendarsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetCalendarsResponse build() {

			return new GetCalendarsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetCalendarsResponse}
	 */
	public static final JsonpDeserializer<GetCalendarsResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, GetCalendarsResponse::setupGetCalendarsResponseDeserializer);

	protected static void setupGetCalendarsResponseDeserializer(
			DelegatingDeserializer<GetCalendarsResponse.Builder> op) {

		op.add(Builder::calendars, JsonpDeserializer.arrayDeserializer(Calendar.DESERIALIZER), "calendars");
		op.add(Builder::count, JsonpDeserializer.numberDeserializer(), "count");

	}

}
