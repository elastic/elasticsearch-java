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

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.ScheduleContainer
@JsonpDeserializable
public class Schedule implements TaggedUnion<Object>, TriggerVariant, JsonpSerializable {

	public static final String CRON = "cron";
	public static final String DAILY = "daily";
	public static final String HOURLY = "hourly";
	public static final String INTERVAL = "interval";
	public static final String MONTHLY = "monthly";
	public static final String WEEKLY = "weekly";
	public static final String YEARLY = "yearly";

	/**
	 * {@link Trigger} variant type
	 */
	@Override
	public String _variantType() {
		return "schedule";
	}

	// Tagged union implementation

	private final String _type;
	private final Object _value;

	@Override
	public String _type() {
		return _type;
	}

	@Override
	public Object _get() {
		return _value;
	}

	public Schedule(ScheduleVariant value) {

		this._type = Objects.requireNonNull(value._variantType(), "variant type");
		this._value = Objects.requireNonNull(value, "variant value");

	}

	private Schedule(Builder builder) {

		this._type = Objects.requireNonNull(builder._type, "variant type");
		this._value = Objects.requireNonNull(builder._value, "variant value");

	}

	/**
	 * Get the {@code cron} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code cron} kind.
	 */
	public String cron() {
		return TaggedUnionUtils.get(this, CRON);
	}

	/**
	 * Get the {@code daily} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code daily} kind.
	 */
	public DailySchedule daily() {
		return TaggedUnionUtils.get(this, DAILY);
	}

	/**
	 * Get the {@code hourly} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code hourly} kind.
	 */
	public HourlySchedule hourly() {
		return TaggedUnionUtils.get(this, HOURLY);
	}

	/**
	 * Get the {@code interval} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code interval} kind.
	 */
	public String interval() {
		return TaggedUnionUtils.get(this, INTERVAL);
	}

	/**
	 * Get the {@code monthly} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code monthly} kind.
	 */
	public List<TimeOfMonth> monthly() {
		return TaggedUnionUtils.get(this, MONTHLY);
	}

	/**
	 * Get the {@code weekly} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code weekly} kind.
	 */
	public List<TimeOfWeek> weekly() {
		return TaggedUnionUtils.get(this, WEEKLY);
	}

	/**
	 * Get the {@code yearly} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code yearly} kind.
	 */
	public List<TimeOfYear> yearly() {
		return TaggedUnionUtils.get(this, YEARLY);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();

		generator.writeKey(_type);
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_type) {
				case CRON :
					generator.write(((String) this._value));

					break;
				case INTERVAL :
					generator.write(((String) this._value));

					break;
				case MONTHLY :
					generator.writeStartArray();
					for (TimeOfMonth item0 : ((List<TimeOfMonth>) this._value)) {
						item0.serialize(generator, mapper);

					}
					generator.writeEnd();

					break;
				case WEEKLY :
					generator.writeStartArray();
					for (TimeOfWeek item0 : ((List<TimeOfWeek>) this._value)) {
						item0.serialize(generator, mapper);

					}
					generator.writeEnd();

					break;
				case YEARLY :
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

	public static class Builder {
		private String _type;
		private Object _value;

		public ObjectBuilder<Schedule> cron(String v) {
			this._type = CRON;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<Schedule> daily(DailySchedule v) {
			this._type = DAILY;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<Schedule> daily(Function<DailySchedule.Builder, ObjectBuilder<DailySchedule>> f) {
			return this.daily(f.apply(new DailySchedule.Builder()).build());
		}

		public ObjectBuilder<Schedule> hourly(HourlySchedule v) {
			this._type = HOURLY;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<Schedule> hourly(Function<HourlySchedule.Builder, ObjectBuilder<HourlySchedule>> f) {
			return this.hourly(f.apply(new HourlySchedule.Builder()).build());
		}

		public ObjectBuilder<Schedule> interval(String v) {
			this._type = INTERVAL;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<Schedule> monthly(List<TimeOfMonth> v) {
			this._type = MONTHLY;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<Schedule> weekly(List<TimeOfWeek> v) {
			this._type = WEEKLY;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<Schedule> yearly(List<TimeOfYear> v) {
			this._type = YEARLY;
			this._value = v;
			return ObjectBuilder.constant(this.build());
		}

		protected Schedule build() {
			return new Schedule(this);
		}

	}

	protected static void setupScheduleDeserializer(DelegatingDeserializer<Builder> op) {

		op.add(Builder::cron, JsonpDeserializer.stringDeserializer(), "cron");
		op.add(Builder::daily, DailySchedule._DESERIALIZER, "daily");
		op.add(Builder::hourly, HourlySchedule._DESERIALIZER, "hourly");
		op.add(Builder::interval, JsonpDeserializer.stringDeserializer(), "interval");
		op.add(Builder::monthly, JsonpDeserializer.arrayDeserializer(TimeOfMonth._DESERIALIZER), "monthly");
		op.add(Builder::weekly, JsonpDeserializer.arrayDeserializer(TimeOfWeek._DESERIALIZER), "weekly");
		op.add(Builder::yearly, JsonpDeserializer.arrayDeserializer(TimeOfYear._DESERIALIZER), "yearly");

	}

	public static final JsonpDeserializer<Schedule> _DESERIALIZER = JsonpDeserializer.lazy(Builder::new,
			Schedule::setupScheduleDeserializer, Builder::build);
}
