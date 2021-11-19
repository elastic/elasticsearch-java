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

package co.elastic.clients.elasticsearch._types;

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
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.Time
// union type: Union[]
@JsonpDeserializable
public class Time implements TaggedUnion<Object>, JsonpSerializable {

	public static final String OFFSET = "offset";
	public static final String TIME = "time";

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

	public Time(String type, Object value) {
		this._type = type;
		this._value = value;
	}

	public String _toJsonString() {
		switch (_type) {
			case "offset" :
				return String.valueOf(this.offset());
			case "time" :
				return this.time();

			default :
				throw new IllegalStateException("Unknown type " + _type);
		}
	}
	private Time(Builder builder) {

		this._type = ModelTypeHelper.requireNonNull(builder._type, builder, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static Time of(Function<Builder, ObjectBuilder<Time>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code offset}?
	 */
	public boolean _isOffset() {
		return OFFSET.equals(_type());
	}

	/**
	 * Get the {@code offset} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code offset} kind.
	 */
	public Integer offset() {
		return TaggedUnionUtils.get(this, OFFSET);
	}

	/**
	 * Is this variant instance of kind {@code time}?
	 */
	public boolean _isTime() {
		return TIME.equals(_type());
	}

	/**
	 * Get the {@code time} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code time} kind.
	 */
	public String time() {
		return TaggedUnionUtils.get(this, TIME);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_type) {
				case OFFSET :
					generator.write(((Integer) this._value));

					break;
				case TIME :
					generator.write(((String) this._value));

					break;
			}
		}

	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Time> {
		private String _type;
		private Object _value;

		public Builder offset(Integer v) {
			this._type = OFFSET;
			this._value = v;
			return this;
		}

		public Builder time(String v) {
			this._type = TIME;
			this._value = v;
			return this;
		}

		public Time build() {
			_checkSingleUse();
			return new Time(this);
		}

	}

	private static JsonpDeserializer<Time> buildTimeDeserializer() {
		return new UnionDeserializer.Builder<>(Time::new, false)
				.addMember("offset", JsonpDeserializer.integerDeserializer())
				.addMember("time", JsonpDeserializer.stringDeserializer()).build();
	}

	public static final JsonpDeserializer<Time> _DESERIALIZER = JsonpDeserializer.lazy(Time::buildTimeDeserializer);
}
