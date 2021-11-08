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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.get_calendars.Response
@JsonpDeserializable
public class GetCalendarsResponse implements JsonpSerializable {
	private final List<Calendar> calendars;

	private final long count;

	// ---------------------------------------------------------------------------------------------

	private GetCalendarsResponse(Builder builder) {

		this.calendars = ModelTypeHelper.unmodifiableRequired(builder.calendars, this, "calendars");
		this.count = ModelTypeHelper.requireNonNull(builder.count, this, "count");

	}

	public static GetCalendarsResponse of(Function<Builder, ObjectBuilder<GetCalendarsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code calendars}
	 */
	public final List<Calendar> calendars() {
		return this.calendars;
	}

	/**
	 * Required - API name: {@code count}
	 */
	public final long count() {
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

		if (ModelTypeHelper.isDefined(this.calendars)) {
			generator.writeKey("calendars");
			generator.writeStartArray();
			for (Calendar item0 : this.calendars) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("count");
		generator.write(this.count);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetCalendarsResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GetCalendarsResponse> {
		private List<Calendar> calendars;

		private Long count;

		/**
		 * Required - API name: {@code calendars}
		 */
		public final Builder calendars(List<Calendar> value) {
			this.calendars = value;
			return this;
		}

		/**
		 * Required - API name: {@code calendars}
		 */
		public final Builder calendars(Calendar... value) {
			this.calendars = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code calendars}
		 */
		@SafeVarargs
		public final Builder calendars(Function<Calendar.Builder, ObjectBuilder<Calendar>>... fns) {
			this.calendars = new ArrayList<>(fns.length);
			for (Function<Calendar.Builder, ObjectBuilder<Calendar>> fn : fns) {
				this.calendars.add(fn.apply(new Calendar.Builder()).build());
			}
			return this;
		}

		/**
		 * Required - API name: {@code count}
		 */
		public final Builder count(long value) {
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
			_checkSingleUse();

			return new GetCalendarsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetCalendarsResponse}
	 */
	public static final JsonpDeserializer<GetCalendarsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetCalendarsResponse::setupGetCalendarsResponseDeserializer, Builder::build);

	protected static void setupGetCalendarsResponseDeserializer(
			DelegatingDeserializer<GetCalendarsResponse.Builder> op) {

		op.add(Builder::calendars, JsonpDeserializer.arrayDeserializer(Calendar._DESERIALIZER), "calendars");
		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");

	}

}
