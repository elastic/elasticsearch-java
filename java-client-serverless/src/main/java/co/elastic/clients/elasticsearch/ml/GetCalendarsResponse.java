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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.get_calendars.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml.get_calendars.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetCalendarsResponse implements JsonpSerializable {
	private final List<Calendar> calendars;

	private final long count;

	// ---------------------------------------------------------------------------------------------

	private GetCalendarsResponse(Builder builder) {

		this.calendars = ApiTypeHelper.unmodifiableRequired(builder.calendars, this, "calendars");
		this.count = ApiTypeHelper.requireNonNull(builder.count, this, "count");

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

		if (ApiTypeHelper.isDefined(this.calendars)) {
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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetCalendarsResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GetCalendarsResponse> {
		private List<Calendar> calendars;

		private Long count;

		/**
		 * Required - API name: {@code calendars}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>calendars</code>.
		 */
		public final Builder calendars(List<Calendar> list) {
			this.calendars = _listAddAll(this.calendars, list);
			return this;
		}

		/**
		 * Required - API name: {@code calendars}
		 * <p>
		 * Adds one or more values to <code>calendars</code>.
		 */
		public final Builder calendars(Calendar value, Calendar... values) {
			this.calendars = _listAdd(this.calendars, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code calendars}
		 * <p>
		 * Adds a value to <code>calendars</code> using a builder lambda.
		 */
		public final Builder calendars(Function<Calendar.Builder, ObjectBuilder<Calendar>> fn) {
			return calendars(fn.apply(new Calendar.Builder()).build());
		}

		/**
		 * Required - API name: {@code count}
		 */
		public final Builder count(long value) {
			this.count = value;
			return this;
		}

		@Override
		protected Builder self() {
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
			.lazy(Builder::new, GetCalendarsResponse::setupGetCalendarsResponseDeserializer);

	protected static void setupGetCalendarsResponseDeserializer(ObjectDeserializer<GetCalendarsResponse.Builder> op) {

		op.add(Builder::calendars, JsonpDeserializer.arrayDeserializer(Calendar._DESERIALIZER), "calendars");
		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");

	}

}
