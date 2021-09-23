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

import co.elastic.clients.json.BuildFunctionDeserializer;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.InstanceDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.TaggedUnion;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.ScheduleContainer
public class Schedule extends TaggedUnion<Object> implements Trigger, JsonpSerializable {

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
	public String _type() {
		return "schedule";
	}

	private Schedule(Builder builder) {
		super(builder.$tag, builder.$variant);

	}

	/**
	 * Get the {@code cron} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code cron} kind.
	 */
	public String cron() {
		return _get(CRON);
	}

	/**
	 * Get the {@code daily} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code daily} kind.
	 */
	public DailySchedule daily() {
		return _get(DAILY);
	}

	/**
	 * Get the {@code hourly} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code hourly} kind.
	 */
	public HourlySchedule hourly() {
		return _get(HOURLY);
	}

	/**
	 * Get the {@code interval} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code interval} kind.
	 */
	public JsonValue interval() {
		return _get(INTERVAL);
	}

	/**
	 * Get the {@code monthly} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code monthly} kind.
	 */
	public List<TimeOfMonth> monthly() {
		return _get(MONTHLY);
	}

	/**
	 * Get the {@code weekly} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code weekly} kind.
	 */
	public List<TimeOfWeek> weekly() {
		return _get(WEEKLY);
	}

	/**
	 * Get the {@code yearly} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code yearly} kind.
	 */
	public List<TimeOfYear> yearly() {
		return _get(YEARLY);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		generator.writeKey(_type);
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_type) {
				case CRON :
					generator.write(this.<String>_get(CRON));

					break;
				case INTERVAL :
					generator.write(this.<JsonValue>_get(INTERVAL));

					break;
				case MONTHLY :
					generator.writeStartArray();
					for (TimeOfMonth item0 : this.<List<TimeOfMonth>>_get(MONTHLY)) {
						item0.serialize(generator, mapper);

					}
					generator.writeEnd();

					break;
				case WEEKLY :
					generator.writeStartArray();
					for (TimeOfWeek item0 : this.<List<TimeOfWeek>>_get(WEEKLY)) {
						item0.serialize(generator, mapper);

					}
					generator.writeEnd();

					break;
				case YEARLY :
					generator.writeStartArray();
					for (TimeOfYear item0 : this.<List<TimeOfYear>>_get(YEARLY)) {
						item0.serialize(generator, mapper);

					}
					generator.writeEnd();

					break;
			}
		}

		generator.writeEnd();
	}
	public static class Builder {
		private String $tag;
		private Object $variant;

		public ObjectBuilder<Schedule> cron(String v) {
			this.$variant = v;
			this.$tag = CRON;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<Schedule> daily(DailySchedule v) {
			this.$variant = v;
			this.$tag = DAILY;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<Schedule> daily(Function<DailySchedule.Builder, ObjectBuilder<DailySchedule>> f) {
			return this.daily(f.apply(new DailySchedule.Builder()).build());
		}

		public ObjectBuilder<Schedule> hourly(HourlySchedule v) {
			this.$variant = v;
			this.$tag = HOURLY;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<Schedule> hourly(Function<HourlySchedule.Builder, ObjectBuilder<HourlySchedule>> f) {
			return this.hourly(f.apply(new HourlySchedule.Builder()).build());
		}

		public ObjectBuilder<Schedule> interval(JsonValue v) {
			this.$variant = v;
			this.$tag = INTERVAL;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<Schedule> monthly(List<TimeOfMonth> v) {
			this.$variant = v;
			this.$tag = MONTHLY;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<Schedule> weekly(List<TimeOfWeek> v) {
			this.$variant = v;
			this.$tag = WEEKLY;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<Schedule> yearly(List<TimeOfYear> v) {
			this.$variant = v;
			this.$tag = YEARLY;
			return ObjectBuilder.constant(this.build());
		}

		protected Schedule build() {
			return new Schedule(this);
		}

	}

	protected static void setupScheduleDeserializer(DelegatingDeserializer<Builder> op) {
		op.add(Builder::cron, JsonpDeserializer.stringDeserializer(), "cron");
		op.add(Builder::daily, DailySchedule.DESERIALIZER, "daily");
		op.add(Builder::hourly, HourlySchedule.DESERIALIZER, "hourly");
		op.add(Builder::interval, JsonpDeserializer.jsonValueDeserializer(), "interval");
		op.add(Builder::monthly, JsonpDeserializer.arrayDeserializer(TimeOfMonth.DESERIALIZER), "monthly");
		op.add(Builder::weekly, JsonpDeserializer.arrayDeserializer(TimeOfWeek.DESERIALIZER), "weekly");
		op.add(Builder::yearly, JsonpDeserializer.arrayDeserializer(TimeOfYear.DESERIALIZER), "yearly");

	}

	// Variants can be recursive data structures. Building the union's deserializer
	// lazily avoids cyclic dependencies between static class initialization code,
	// which can lead to unwanted things like NPEs or stack overflows

	public static final InstanceDeserializer<Builder, ObjectBuilder<Schedule>> $BUILDER_DESERIALIZER = JsonpDeserializer
			.lazyInstance(Builder::new, Schedule::setupScheduleDeserializer, Builder::build);
}
