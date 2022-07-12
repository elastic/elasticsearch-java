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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.UnionDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.ScheduleTimeOfDay

/**
 * A time of day, expressed either as <code>hh:mm</code>, <code>noon</code>,
 * <code>midnight</code>, or an hour/minutes structure.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#watcher._types.ScheduleTimeOfDay">API
 *      specification</a>
 */
@JsonpDeserializable
public class ScheduleTimeOfDay implements TaggedUnion<ScheduleTimeOfDay.Kind, Object>, JsonpSerializable {

	public enum Kind {
		Text, HourMinute

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

	private ScheduleTimeOfDay(Kind kind, Object value) {
		this._kind = kind;
		this._value = value;
	}

	private ScheduleTimeOfDay(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static ScheduleTimeOfDay of(Function<Builder, ObjectBuilder<ScheduleTimeOfDay>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code text}?
	 */
	public boolean isText() {
		return _kind == Kind.Text;
	}

	/**
	 * Get the {@code text} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code text} kind.
	 */
	public String text() {
		return TaggedUnionUtils.get(this, Kind.Text);
	}

	/**
	 * Is this variant instance of kind {@code hour_minute}?
	 */
	public boolean isHourMinute() {
		return _kind == Kind.HourMinute;
	}

	/**
	 * Get the {@code hour_minute} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code hour_minute} kind.
	 */
	public HourAndMinute hourMinute() {
		return TaggedUnionUtils.get(this, Kind.HourMinute);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_kind) {
				case Text :
					generator.write(((String) this._value));

					break;
			}
		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ScheduleTimeOfDay> {
		private Kind _kind;
		private Object _value;

		public ObjectBuilder<ScheduleTimeOfDay> text(String v) {
			this._kind = Kind.Text;
			this._value = v;
			return this;
		}

		public ObjectBuilder<ScheduleTimeOfDay> hourMinute(HourAndMinute v) {
			this._kind = Kind.HourMinute;
			this._value = v;
			return this;
		}

		public ObjectBuilder<ScheduleTimeOfDay> hourMinute(
				Function<HourAndMinute.Builder, ObjectBuilder<HourAndMinute>> fn) {
			return this.hourMinute(fn.apply(new HourAndMinute.Builder()).build());
		}

		public ScheduleTimeOfDay build() {
			_checkSingleUse();
			return new ScheduleTimeOfDay(this);
		}

	}

	private static JsonpDeserializer<ScheduleTimeOfDay> buildScheduleTimeOfDayDeserializer() {
		return new UnionDeserializer.Builder<ScheduleTimeOfDay, Kind, Object>(ScheduleTimeOfDay::new, false)
				.addMember(Kind.Text, JsonpDeserializer.stringDeserializer())
				.addMember(Kind.HourMinute, HourAndMinute._DESERIALIZER).build();
	}

	public static final JsonpDeserializer<ScheduleTimeOfDay> _DESERIALIZER = JsonpDeserializer
			.lazy(ScheduleTimeOfDay::buildScheduleTimeOfDayDeserializer);
}
