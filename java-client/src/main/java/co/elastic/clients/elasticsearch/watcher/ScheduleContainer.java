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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.StringEnum;
import co.elastic.clients.util.TaggedUnion;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

public class ScheduleContainer extends TaggedUnion<ScheduleContainer.Tag, Object> implements ToJsonp {

	public enum Tag implements StringEnum {

		cron("cron"),

		daily("daily"),

		hourly("hourly"),

		interval("interval"),

		monthly("monthly"),

		weekly("weekly"),

		yearly("yearly"),

		;

		private final String jsonValue;

		Tag(String jsonValue) {
			this.jsonValue = jsonValue;
		}

		public String jsonValue() {
			return this.jsonValue;
		}

		public static StringEnum.Deserializer<Tag> DESERIALIZER = new StringEnum.Deserializer<>(Tag.values());
	}

	private ScheduleContainer(Builder builder) {
		super(builder.$tag, builder.$variant);

	}

	/**
	 * Is this {@link ScheduleContainer} of a {@code cron} kind?
	 */
	public boolean isCron() {
		return is(Tag.cron);
	}

	/**
	 * Get the {@code cron} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code cron} kind.
	 */
	public String cron() {
		return get(Tag.cron);
	}

	/**
	 * Is this {@link ScheduleContainer} of a {@code daily} kind?
	 */
	public boolean isDaily() {
		return is(Tag.daily);
	}

	/**
	 * Get the {@code daily} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code daily} kind.
	 */
	public DailySchedule daily() {
		return get(Tag.daily);
	}

	/**
	 * Is this {@link ScheduleContainer} of a {@code hourly} kind?
	 */
	public boolean isHourly() {
		return is(Tag.hourly);
	}

	/**
	 * Get the {@code hourly} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code hourly} kind.
	 */
	public HourlySchedule hourly() {
		return get(Tag.hourly);
	}

	/**
	 * Is this {@link ScheduleContainer} of a {@code interval} kind?
	 */
	public boolean isInterval() {
		return is(Tag.interval);
	}

	/**
	 * Get the {@code interval} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code interval} kind.
	 */
	public JsonValue interval() {
		return get(Tag.interval);
	}

	/**
	 * Is this {@link ScheduleContainer} of a {@code monthly} kind?
	 */
	public boolean isMonthly() {
		return is(Tag.monthly);
	}

	/**
	 * Get the {@code monthly} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code monthly} kind.
	 */
	public List<TimeOfMonth> monthly() {
		return get(Tag.monthly);
	}

	/**
	 * Is this {@link ScheduleContainer} of a {@code weekly} kind?
	 */
	public boolean isWeekly() {
		return is(Tag.weekly);
	}

	/**
	 * Get the {@code weekly} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code weekly} kind.
	 */
	public List<TimeOfWeek> weekly() {
		return get(Tag.weekly);
	}

	/**
	 * Is this {@link ScheduleContainer} of a {@code yearly} kind?
	 */
	public boolean isYearly() {
		return is(Tag.yearly);
	}

	/**
	 * Get the {@code yearly} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code yearly} kind.
	 */
	public List<TimeOfYear> yearly() {
		return get(Tag.yearly);
	}

	@Override
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		generator.writeKey(tag.jsonValue);
		if (value instanceof ToJsonp) {
			((ToJsonp) value).toJsonp(generator, mapper);
		} else {
			switch (this.tag) {
				case cron :
					generator.write(this.<String>get(Tag.cron));

					break;
				case interval :
					generator.write(this.<JsonValue>get(Tag.interval));

					break;
				case monthly :
					generator.writeStartArray();
					for (TimeOfMonth item0 : this.<List<TimeOfMonth>>get(Tag.monthly)) {
						item0.toJsonp(generator, mapper);

					}
					generator.writeEnd();

					break;
				case weekly :
					generator.writeStartArray();
					for (TimeOfWeek item0 : this.<List<TimeOfWeek>>get(Tag.weekly)) {
						item0.toJsonp(generator, mapper);

					}
					generator.writeEnd();

					break;
				case yearly :
					generator.writeStartArray();
					for (TimeOfYear item0 : this.<List<TimeOfYear>>get(Tag.yearly)) {
						item0.toJsonp(generator, mapper);

					}
					generator.writeEnd();

					break;
			}
		}

		generator.writeEnd();
	}
	public static class Builder {
		private Tag $tag;
		private Object $variant;

		public ObjectBuilder<ScheduleContainer> cron(String v) {
			this.$variant = v;
			this.$tag = Tag.cron;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<ScheduleContainer> daily(DailySchedule v) {
			this.$variant = v;
			this.$tag = Tag.daily;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<ScheduleContainer> daily(Function<DailySchedule.Builder, ObjectBuilder<DailySchedule>> f) {
			return this.daily(f.apply(new DailySchedule.Builder()).build());
		}

		public ObjectBuilder<ScheduleContainer> hourly(HourlySchedule v) {
			this.$variant = v;
			this.$tag = Tag.hourly;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<ScheduleContainer> hourly(
				Function<HourlySchedule.Builder, ObjectBuilder<HourlySchedule>> f) {
			return this.hourly(f.apply(new HourlySchedule.Builder()).build());
		}

		public ObjectBuilder<ScheduleContainer> interval(JsonValue v) {
			this.$variant = v;
			this.$tag = Tag.interval;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<ScheduleContainer> monthly(List<TimeOfMonth> v) {
			this.$variant = v;
			this.$tag = Tag.monthly;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<ScheduleContainer> weekly(List<TimeOfWeek> v) {
			this.$variant = v;
			this.$tag = Tag.weekly;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<ScheduleContainer> yearly(List<TimeOfYear> v) {
			this.$variant = v;
			this.$tag = Tag.yearly;
			return new ObjectBuilder.Constant<>(this.build());
		}

		protected ScheduleContainer build() {
			return new ScheduleContainer(this);
		}

	}

	// Variants can be recursive data structures. Building the union's deserializer
	// lazily
	// avoids cyclic dependencies between static class initialization code, which
	// can lead to unwanted things like NPEs or stack overflows

	public static final JsonpDeserializer<ScheduleContainer> DESERIALIZER = JsonpDeserializer
			.lazy(ScheduleContainer::buildDeserializer);

	private static JsonpDeserializer<ScheduleContainer> buildDeserializer() {
		ObjectDeserializer<Builder> op = new ObjectDeserializer<>(Builder::new);

		op.add(Builder::cron, JsonpDeserializer.stringDeserializer(), "cron");
		op.add(Builder::daily, DailySchedule.DESERIALIZER, "daily");
		op.add(Builder::hourly, HourlySchedule.DESERIALIZER, "hourly");
		op.add(Builder::interval, JsonpDeserializer.jsonValueDeserializer(), "interval");
		op.add(Builder::monthly, JsonpDeserializer.arrayDeserializer(TimeOfMonth.DESERIALIZER), "monthly");
		op.add(Builder::weekly, JsonpDeserializer.arrayDeserializer(TimeOfWeek.DESERIALIZER), "weekly");
		op.add(Builder::yearly, JsonpDeserializer.arrayDeserializer(TimeOfYear.DESERIALIZER), "yearly");

		return new BuildFunctionDeserializer<>(op, Builder::build);
	}

}
