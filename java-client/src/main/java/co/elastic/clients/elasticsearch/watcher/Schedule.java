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

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.lang.String;
import java.util.List;
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

// typedef: watcher._types.ScheduleContainer

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#watcher._types.ScheduleContainer">API
 *      specification</a>
 */
@JsonpDeserializable
public class Schedule implements TaggedUnion<Schedule.Kind, Object>, TriggerVariant, JsonpSerializable {

	/**
	 * {@link Schedule} variant kinds.
	 * 
	 * @see <a href=
	 *      "../doc-files/api-spec.html#watcher._types.ScheduleContainer">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		Cron("cron"),

		Daily("daily"),

		Hourly("hourly"),

		Interval("interval"),

		Monthly("monthly"),

		Weekly("weekly"),

		Yearly("yearly"),

		;

		private final String jsonValue;

		Kind(String jsonValue) {
			this.jsonValue = jsonValue;
		}

		public String jsonValue() {
			return this.jsonValue;
		}

	}

	/**
	 * Trigger variant kind.
	 */
	@Override
	public Trigger.Kind _triggerKind() {
		return Trigger.Kind.Schedule;
	}

	private final Kind _kind;
	private final Object _value;

	@Override
	public final Kind _kind() {
		return _kind;
	}

	@Override
	public final Object _get() {
		return _value;
	}

	public Schedule(ScheduleVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._scheduleKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private Schedule(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static Schedule of(Function<Builder, ObjectBuilder<Schedule>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code cron}?
	 */
	public boolean isCron() {
		return _kind == Kind.Cron;
	}

	/**
	 * Get the {@code cron} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code cron} kind.
	 */
	public String cron() {
		return TaggedUnionUtils.get(this, Kind.Cron);
	}

	/**
	 * Is this variant instance of kind {@code daily}?
	 */
	public boolean isDaily() {
		return _kind == Kind.Daily;
	}

	/**
	 * Get the {@code daily} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code daily} kind.
	 */
	public DailySchedule daily() {
		return TaggedUnionUtils.get(this, Kind.Daily);
	}

	/**
	 * Is this variant instance of kind {@code hourly}?
	 */
	public boolean isHourly() {
		return _kind == Kind.Hourly;
	}

	/**
	 * Get the {@code hourly} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code hourly} kind.
	 */
	public HourlySchedule hourly() {
		return TaggedUnionUtils.get(this, Kind.Hourly);
	}

	/**
	 * Is this variant instance of kind {@code interval}?
	 */
	public boolean isInterval() {
		return _kind == Kind.Interval;
	}

	/**
	 * Get the {@code interval} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code interval} kind.
	 */
	public Time interval() {
		return TaggedUnionUtils.get(this, Kind.Interval);
	}

	/**
	 * Is this variant instance of kind {@code monthly}?
	 */
	public boolean isMonthly() {
		return _kind == Kind.Monthly;
	}

	/**
	 * Get the {@code monthly} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code monthly} kind.
	 */
	public List<TimeOfMonth> monthly() {
		return TaggedUnionUtils.get(this, Kind.Monthly);
	}

	/**
	 * Is this variant instance of kind {@code weekly}?
	 */
	public boolean isWeekly() {
		return _kind == Kind.Weekly;
	}

	/**
	 * Get the {@code weekly} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code weekly} kind.
	 */
	public List<TimeOfWeek> weekly() {
		return TaggedUnionUtils.get(this, Kind.Weekly);
	}

	/**
	 * Is this variant instance of kind {@code yearly}?
	 */
	public boolean isYearly() {
		return _kind == Kind.Yearly;
	}

	/**
	 * Get the {@code yearly} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code yearly} kind.
	 */
	public List<TimeOfYear> yearly() {
		return TaggedUnionUtils.get(this, Kind.Yearly);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeStartObject();

		generator.writeKey(_kind.jsonValue());
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_kind) {
				case Cron :
					generator.write(((String) this._value));

					break;
				case Monthly :
					generator.writeStartArray();
					for (TimeOfMonth item0 : ((List<TimeOfMonth>) this._value)) {
						item0.serialize(generator, mapper);

					}
					generator.writeEnd();

					break;
				case Weekly :
					generator.writeStartArray();
					for (TimeOfWeek item0 : ((List<TimeOfWeek>) this._value)) {
						item0.serialize(generator, mapper);

					}
					generator.writeEnd();

					break;
				case Yearly :
					generator.writeStartArray();
					for (TimeOfYear item0 : ((List<TimeOfYear>) this._value)) {
						item0.serialize(generator, mapper);

					}
					generator.writeEnd();

					break;
			}
		}

		generator.writeEnd();

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Schedule> {
		private Kind _kind;
		private Object _value;

		@Override
		protected Builder self() {
			return this;
		}
		public ObjectBuilder<Schedule> cron(String v) {
			this._kind = Kind.Cron;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Schedule> daily(DailySchedule v) {
			this._kind = Kind.Daily;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Schedule> daily(Function<DailySchedule.Builder, ObjectBuilder<DailySchedule>> fn) {
			return this.daily(fn.apply(new DailySchedule.Builder()).build());
		}

		public ObjectBuilder<Schedule> hourly(HourlySchedule v) {
			this._kind = Kind.Hourly;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Schedule> hourly(Function<HourlySchedule.Builder, ObjectBuilder<HourlySchedule>> fn) {
			return this.hourly(fn.apply(new HourlySchedule.Builder()).build());
		}

		public ObjectBuilder<Schedule> interval(Time v) {
			this._kind = Kind.Interval;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Schedule> interval(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.interval(fn.apply(new Time.Builder()).build());
		}

		public ObjectBuilder<Schedule> monthly(List<TimeOfMonth> v) {
			this._kind = Kind.Monthly;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Schedule> weekly(List<TimeOfWeek> v) {
			this._kind = Kind.Weekly;
			this._value = v;
			return this;
		}

		public ObjectBuilder<Schedule> yearly(List<TimeOfYear> v) {
			this._kind = Kind.Yearly;
			this._value = v;
			return this;
		}

		public Schedule build() {
			_checkSingleUse();
			return new Schedule(this);
		}

	}

	protected static void setupScheduleDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::cron, JsonpDeserializer.stringDeserializer(), "cron");
		op.add(Builder::daily, DailySchedule._DESERIALIZER, "daily");
		op.add(Builder::hourly, HourlySchedule._DESERIALIZER, "hourly");
		op.add(Builder::interval, Time._DESERIALIZER, "interval");
		op.add(Builder::monthly, JsonpDeserializer.arrayDeserializer(TimeOfMonth._DESERIALIZER), "monthly");
		op.add(Builder::weekly, JsonpDeserializer.arrayDeserializer(TimeOfWeek._DESERIALIZER), "weekly");
		op.add(Builder::yearly, JsonpDeserializer.arrayDeserializer(TimeOfYear._DESERIALIZER), "yearly");

	}

	public static final JsonpDeserializer<Schedule> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Schedule::setupScheduleDeserializer, Builder::build);
}
