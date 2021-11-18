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
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.FieldValue
// union type: Union[]
@JsonpDeserializable
public class FieldValue implements TaggedUnion<Object>, JsonpSerializable {

	public static final String DOUBLE = "double";
	public static final String LONG = "long";
	public static final String BOOLEAN = "boolean";
	public static final String STRING = "string";

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

	public FieldValue(String type, Object value) {
		this._type = type;
		this._value = value;
	}

	public String _toJsonString() {
		switch (_type) {
			case "double" :
				return String.valueOf(this.double_());
			case "long" :
				return String.valueOf(this.long_());
			case "boolean" :
				return String.valueOf(this.boolean_());
			case "string" :
				return this.string();

			default :
				throw new IllegalStateException("Unknown type " + _type);
		}
	}
	private FieldValue(Builder builder) {

		this._type = ModelTypeHelper.requireNonNull(builder._type, builder, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static FieldValue of(Function<Builder, ObjectBuilder<FieldValue>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Get the {@code double} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code double} kind.
	 */
	public Double double_() {
		return TaggedUnionUtils.get(this, DOUBLE);
	}

	/**
	 * Get the {@code long} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code long} kind.
	 */
	public Long long_() {
		return TaggedUnionUtils.get(this, LONG);
	}

	/**
	 * Get the {@code boolean} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code boolean} kind.
	 */
	public Boolean boolean_() {
		return TaggedUnionUtils.get(this, BOOLEAN);
	}

	/**
	 * Get the {@code string} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code string} kind.
	 */
	public String string() {
		return TaggedUnionUtils.get(this, STRING);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_type) {
				case DOUBLE :
					generator.write(((Double) this._value));

					break;
				case LONG :
					generator.write(((Long) this._value));

					break;
				case BOOLEAN :
					generator.write(((Boolean) this._value));

					break;
				case STRING :
					generator.write(((String) this._value));

					break;
			}
		}

	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<FieldValue> {
		private String _type;
		private Object _value;

		public Builder double_(Double v) {
			this._type = DOUBLE;
			this._value = v;
			return this;
		}

		public Builder long_(Long v) {
			this._type = LONG;
			this._value = v;
			return this;
		}

		public Builder boolean_(Boolean v) {
			this._type = BOOLEAN;
			this._value = v;
			return this;
		}

		public Builder string(String v) {
			this._type = STRING;
			this._value = v;
			return this;
		}

		public FieldValue build() {
			_checkSingleUse();
			return new FieldValue(this);
		}

	}

	private static JsonpDeserializer<FieldValue> buildFieldValueDeserializer() {
		return new UnionDeserializer.Builder<>(FieldValue::new, true)
				.addMember("double", JsonpDeserializer.doubleDeserializer())
				.addMember("long", JsonpDeserializer.longDeserializer())
				.addMember("boolean", JsonpDeserializer.booleanDeserializer())
				.addMember("string", JsonpDeserializer.stringDeserializer()).build();
	}

	public static final JsonpDeserializer<FieldValue> _DESERIALIZER = JsonpDeserializer
			.lazy(FieldValue::buildFieldValueDeserializer);
}
