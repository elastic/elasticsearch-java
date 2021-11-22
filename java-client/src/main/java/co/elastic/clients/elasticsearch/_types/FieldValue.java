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
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: _types.FieldValue
// union type: Union[]
@JsonpDeserializable
public class FieldValue implements TaggedUnion<FieldValue.Kind, Object>, JsonpSerializable {

	public enum Kind {
		Double, Long, Boolean, String

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

	public FieldValue(Kind kind, Object value) {
		this._kind = kind;
		this._value = value;
	}

	public String _toJsonString() {
		switch (_kind) {
			case Double :
				return String.valueOf(this.double_());
			case Long :
				return String.valueOf(this.long_());
			case Boolean :
				return String.valueOf(this.boolean_());
			case String :
				return this.string();

			default :
				throw new IllegalStateException("Unknown kind " + _kind);
		}
	}

	private FieldValue(Builder builder) {

		this._kind = ModelTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static FieldValue of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Is this variant instance of kind {@code double}?
	 */
	public boolean isDouble() {
		return _kind == Kind.Double;
	}

	/**
	 * Get the {@code double} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code double} kind.
	 */
	public Double double_() {
		return TaggedUnionUtils.get(this, Kind.Double);
	}

	/**
	 * Is this variant instance of kind {@code long}?
	 */
	public boolean isLong() {
		return _kind == Kind.Long;
	}

	/**
	 * Get the {@code long} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code long} kind.
	 */
	public Long long_() {
		return TaggedUnionUtils.get(this, Kind.Long);
	}

	/**
	 * Is this variant instance of kind {@code boolean}?
	 */
	public boolean isBoolean() {
		return _kind == Kind.Boolean;
	}

	/**
	 * Get the {@code boolean} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code boolean} kind.
	 */
	public Boolean boolean_() {
		return TaggedUnionUtils.get(this, Kind.Boolean);
	}

	/**
	 * Is this variant instance of kind {@code string}?
	 */
	public boolean isString() {
		return _kind == Kind.String;
	}

	/**
	 * Get the {@code string} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code string} kind.
	 */
	public String string() {
		return TaggedUnionUtils.get(this, Kind.String);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_kind) {
				case Double :
					generator.write(((Double) this._value));

					break;
				case Long :
					generator.write(((Long) this._value));

					break;
				case Boolean :
					generator.write(((Boolean) this._value));

					break;
				case String :
					generator.write(((String) this._value));

					break;
			}
		}

	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<FieldValue> {
		private Kind _kind;
		private Object _value;

		public Builder double_(Double v) {
			this._kind = Kind.Double;
			this._value = v;
			return this;
		}

		public Builder long_(Long v) {
			this._kind = Kind.Long;
			this._value = v;
			return this;
		}

		public Builder boolean_(Boolean v) {
			this._kind = Kind.Boolean;
			this._value = v;
			return this;
		}

		public Builder string(String v) {
			this._kind = Kind.String;
			this._value = v;
			return this;
		}

		public FieldValue build() {
			_checkSingleUse();
			return new FieldValue(this);
		}

	}

	private static JsonpDeserializer<FieldValue> buildFieldValueDeserializer() {
		return new UnionDeserializer.Builder<FieldValue, Kind, Object>(FieldValue::new, true)
				.addMember(Kind.Double, JsonpDeserializer.doubleDeserializer())
				.addMember(Kind.Long, JsonpDeserializer.longDeserializer())
				.addMember(Kind.Boolean, JsonpDeserializer.booleanDeserializer())
				.addMember(Kind.String, JsonpDeserializer.stringDeserializer()).build();
	}

	public static final JsonpDeserializer<FieldValue> _DESERIALIZER = JsonpDeserializer
			.lazy(FieldValue::buildFieldValueDeserializer);
}
