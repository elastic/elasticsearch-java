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
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.UnionDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
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

// typedef: watcher._types.TimeOfDay
// union type: Union[]
@JsonpDeserializable
public class TimeOfDay implements TaggedUnion<Object>, JsonpSerializable {

	public static final String TEXT = "text";
	public static final String HOUR_MINUTE = "hour_minute";

	private final String _type;
	private final Object _value;

	@Override
	public final String _type() {
		return _type;
	}

	@Override
	public final Object _get() {
		return _value;
	}

	public TimeOfDay(String type, Object value) {
		this._type = type;
		this._value = value;
	}

	private TimeOfDay(Builder builder) {

		this._type = ModelTypeHelper.requireNonNull(builder._type, builder, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static TimeOfDay of(Function<Builder, ObjectBuilder<TimeOfDay>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code text}?
	 */
	public boolean _isText() {
		return TEXT.equals(_type());
	}

	/**
	 * Get the {@code text} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code text} kind.
	 */
	public String text() {
		return TaggedUnionUtils.get(this, TEXT);
	}

	/**
	 * Is this variant instance of kind {@code hour_minute}?
	 */
	public boolean _isHourMinute() {
		return HOUR_MINUTE.equals(_type());
	}

	/**
	 * Get the {@code hour_minute} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code hour_minute} kind.
	 */
	public HourAndMinute hourMinute() {
		return TaggedUnionUtils.get(this, HOUR_MINUTE);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_type) {
				case TEXT :
					generator.write(((String) this._value));

					break;
			}
		}

	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<TimeOfDay> {
		private String _type;
		private Object _value;

		public Builder text(String v) {
			this._type = TEXT;
			this._value = v;
			return this;
		}

		public Builder hourMinute(HourAndMinute v) {
			this._type = HOUR_MINUTE;
			this._value = v;
			return this;
		}

		public Builder hourMinute(Function<HourAndMinute.Builder, ObjectBuilder<HourAndMinute>> f) {
			return this.hourMinute(f.apply(new HourAndMinute.Builder()).build());
		}

		public TimeOfDay build() {
			_checkSingleUse();
			return new TimeOfDay(this);
		}

	}

	private static JsonpDeserializer<TimeOfDay> buildTimeOfDayDeserializer() {
		return new UnionDeserializer.Builder<>(TimeOfDay::new, false)
				.addMember("text", JsonpDeserializer.stringDeserializer())
				.addMember("hour_minute", HourAndMinute._DESERIALIZER).build();
	}

	public static final JsonpDeserializer<TimeOfDay> _DESERIALIZER = JsonpDeserializer
			.lazy(TimeOfDay::buildTimeOfDayDeserializer);
}
