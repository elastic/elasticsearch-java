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
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.DateOrEpochMillis

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.DateOrEpochMillis">API
 *      specification</a>
 */
@JsonpDeserializable
public class DateOrEpochMillis implements TaggedUnion<DateOrEpochMillis.Kind, Object>, JsonpSerializable {

	public enum Kind {
		Date, Millis

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

	private DateOrEpochMillis(Kind kind, Object value) {
		this._kind = kind;
		this._value = value;
	}

	public String _toJsonString() {
		switch (_kind) {
			case Date :
				return this.date();
			case Millis :
				return String.valueOf(this.millis());

			default :
				throw new IllegalStateException("Unknown kind " + _kind);
		}
	}

	private DateOrEpochMillis(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static DateOrEpochMillis of(Function<Builder, ObjectBuilder<DateOrEpochMillis>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code date}?
	 */
	public boolean isDate() {
		return _kind == Kind.Date;
	}

	/**
	 * Get the {@code date} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code date} kind.
	 */
	public String date() {
		return TaggedUnionUtils.get(this, Kind.Date);
	}

	/**
	 * Is this variant instance of kind {@code millis}?
	 */
	public boolean isMillis() {
		return _kind == Kind.Millis;
	}

	/**
	 * Get the {@code millis} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code millis} kind.
	 */
	public Long millis() {
		return TaggedUnionUtils.get(this, Kind.Millis);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_kind) {
				case Date :
					generator.write(((String) this._value));

					break;
				case Millis :
					generator.write(((Long) this._value));

					break;
			}
		}

	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<DateOrEpochMillis> {
		private Kind _kind;
		private Object _value;

		public ObjectBuilder<DateOrEpochMillis> date(String v) {
			this._kind = Kind.Date;
			this._value = v;
			return this;
		}

		public ObjectBuilder<DateOrEpochMillis> millis(Long v) {
			this._kind = Kind.Millis;
			this._value = v;
			return this;
		}

		public DateOrEpochMillis build() {
			_checkSingleUse();
			return new DateOrEpochMillis(this);
		}

	}

	private static JsonpDeserializer<DateOrEpochMillis> buildDateOrEpochMillisDeserializer() {
		return new UnionDeserializer.Builder<DateOrEpochMillis, Kind, Object>(DateOrEpochMillis::new, false)
				.addMember(Kind.Date, JsonpDeserializer.stringDeserializer())
				.addMember(Kind.Millis, JsonpDeserializer.longDeserializer()).build();
	}

	public static final JsonpDeserializer<DateOrEpochMillis> _DESERIALIZER = JsonpDeserializer
			.lazy(DateOrEpochMillis::buildDateOrEpochMillisDeserializer);
}
