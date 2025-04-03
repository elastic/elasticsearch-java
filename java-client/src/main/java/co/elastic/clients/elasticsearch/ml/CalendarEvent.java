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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.DateTime;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: ml._types.CalendarEvent

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml._types.CalendarEvent">API
 *      specification</a>
 */
@JsonpDeserializable
public class CalendarEvent implements JsonpSerializable {
	@Nullable
	private final String calendarId;

	@Nullable
	private final String eventId;

	private final String description;

	private final DateTime endTime;

	private final DateTime startTime;

	@Nullable
	private final Boolean skipResult;

	@Nullable
	private final Boolean skipModelUpdate;

	@Nullable
	private final Integer forceTimeShift;

	// ---------------------------------------------------------------------------------------------

	private CalendarEvent(Builder builder) {

		this.calendarId = builder.calendarId;
		this.eventId = builder.eventId;
		this.description = ApiTypeHelper.requireNonNull(builder.description, this, "description");
		this.endTime = ApiTypeHelper.requireNonNull(builder.endTime, this, "endTime");
		this.startTime = ApiTypeHelper.requireNonNull(builder.startTime, this, "startTime");
		this.skipResult = builder.skipResult;
		this.skipModelUpdate = builder.skipModelUpdate;
		this.forceTimeShift = builder.forceTimeShift;

	}

	public static CalendarEvent of(Function<Builder, ObjectBuilder<CalendarEvent>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * A string that uniquely identifies a calendar.
	 * <p>
	 * API name: {@code calendar_id}
	 */
	@Nullable
	public final String calendarId() {
		return this.calendarId;
	}

	/**
	 * API name: {@code event_id}
	 */
	@Nullable
	public final String eventId() {
		return this.eventId;
	}

	/**
	 * Required - A description of the scheduled event.
	 * <p>
	 * API name: {@code description}
	 */
	public final String description() {
		return this.description;
	}

	/**
	 * Required - The timestamp for the end of the scheduled event in milliseconds
	 * since the epoch or ISO 8601 format.
	 * <p>
	 * API name: {@code end_time}
	 */
	public final DateTime endTime() {
		return this.endTime;
	}

	/**
	 * Required - The timestamp for the beginning of the scheduled event in
	 * milliseconds since the epoch or ISO 8601 format.
	 * <p>
	 * API name: {@code start_time}
	 */
	public final DateTime startTime() {
		return this.startTime;
	}

	/**
	 * When true the model will not create results for this calendar period.
	 * <p>
	 * API name: {@code skip_result}
	 */
	@Nullable
	public final Boolean skipResult() {
		return this.skipResult;
	}

	/**
	 * When true the model will not be updated for this calendar period.
	 * <p>
	 * API name: {@code skip_model_update}
	 */
	@Nullable
	public final Boolean skipModelUpdate() {
		return this.skipModelUpdate;
	}

	/**
	 * Shift time by this many seconds. For example adjust time for daylight savings
	 * changes
	 * <p>
	 * API name: {@code force_time_shift}
	 */
	@Nullable
	public final Integer forceTimeShift() {
		return this.forceTimeShift;
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

		if (this.calendarId != null) {
			generator.writeKey("calendar_id");
			generator.write(this.calendarId);

		}
		if (this.eventId != null) {
			generator.writeKey("event_id");
			generator.write(this.eventId);

		}
		generator.writeKey("description");
		generator.write(this.description);

		generator.writeKey("end_time");
		this.endTime.serialize(generator, mapper);
		generator.writeKey("start_time");
		this.startTime.serialize(generator, mapper);
		if (this.skipResult != null) {
			generator.writeKey("skip_result");
			generator.write(this.skipResult);

		}
		if (this.skipModelUpdate != null) {
			generator.writeKey("skip_model_update");
			generator.write(this.skipModelUpdate);

		}
		if (this.forceTimeShift != null) {
			generator.writeKey("force_time_shift");
			generator.write(this.forceTimeShift);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CalendarEvent}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<CalendarEvent> {
		@Nullable
		private String calendarId;

		@Nullable
		private String eventId;

		private String description;

		private DateTime endTime;

		private DateTime startTime;

		@Nullable
		private Boolean skipResult;

		@Nullable
		private Boolean skipModelUpdate;

		@Nullable
		private Integer forceTimeShift;

		/**
		 * A string that uniquely identifies a calendar.
		 * <p>
		 * API name: {@code calendar_id}
		 */
		public final Builder calendarId(@Nullable String value) {
			this.calendarId = value;
			return this;
		}

		/**
		 * API name: {@code event_id}
		 */
		public final Builder eventId(@Nullable String value) {
			this.eventId = value;
			return this;
		}

		/**
		 * Required - A description of the scheduled event.
		 * <p>
		 * API name: {@code description}
		 */
		public final Builder description(String value) {
			this.description = value;
			return this;
		}

		/**
		 * Required - The timestamp for the end of the scheduled event in milliseconds
		 * since the epoch or ISO 8601 format.
		 * <p>
		 * API name: {@code end_time}
		 */
		public final Builder endTime(DateTime value) {
			this.endTime = value;
			return this;
		}

		/**
		 * Required - The timestamp for the beginning of the scheduled event in
		 * milliseconds since the epoch or ISO 8601 format.
		 * <p>
		 * API name: {@code start_time}
		 */
		public final Builder startTime(DateTime value) {
			this.startTime = value;
			return this;
		}

		/**
		 * When true the model will not create results for this calendar period.
		 * <p>
		 * API name: {@code skip_result}
		 */
		public final Builder skipResult(@Nullable Boolean value) {
			this.skipResult = value;
			return this;
		}

		/**
		 * When true the model will not be updated for this calendar period.
		 * <p>
		 * API name: {@code skip_model_update}
		 */
		public final Builder skipModelUpdate(@Nullable Boolean value) {
			this.skipModelUpdate = value;
			return this;
		}

		/**
		 * Shift time by this many seconds. For example adjust time for daylight savings
		 * changes
		 * <p>
		 * API name: {@code force_time_shift}
		 */
		public final Builder forceTimeShift(@Nullable Integer value) {
			this.forceTimeShift = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CalendarEvent}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CalendarEvent build() {
			_checkSingleUse();

			return new CalendarEvent(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CalendarEvent}
	 */
	public static final JsonpDeserializer<CalendarEvent> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			CalendarEvent::setupCalendarEventDeserializer);

	protected static void setupCalendarEventDeserializer(ObjectDeserializer<CalendarEvent.Builder> op) {

		op.add(Builder::calendarId, JsonpDeserializer.stringDeserializer(), "calendar_id");
		op.add(Builder::eventId, JsonpDeserializer.stringDeserializer(), "event_id");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::endTime, DateTime._DESERIALIZER, "end_time");
		op.add(Builder::startTime, DateTime._DESERIALIZER, "start_time");
		op.add(Builder::skipResult, JsonpDeserializer.booleanDeserializer(), "skip_result");
		op.add(Builder::skipModelUpdate, JsonpDeserializer.booleanDeserializer(), "skip_model_update");
		op.add(Builder::forceTimeShift, JsonpDeserializer.integerDeserializer(), "force_time_shift");

	}

}
