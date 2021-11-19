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

package co.elastic.clients.elasticsearch._types.aggregations;

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
import java.lang.Double;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.FieldDateMath
// union type: Union[]
@JsonpDeserializable
public class FieldDateMath implements TaggedUnion<Object>, JsonpSerializable {

	public static final String EXPR = "expr";
	public static final String VALUE = "value";

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

	public FieldDateMath(String type, Object value) {
		this._type = type;
		this._value = value;
	}

	public String _toJsonString() {
		switch (_type) {
			case "expr" :
				return this.expr();
			case "value" :
				return String.valueOf(this.value());

			default :
				throw new IllegalStateException("Unknown type " + _type);
		}
	}
	private FieldDateMath(Builder builder) {

		this._type = ModelTypeHelper.requireNonNull(builder._type, builder, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static FieldDateMath of(Function<Builder, ObjectBuilder<FieldDateMath>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code expr}?
	 */
	public boolean _isExpr() {
		return EXPR.equals(_type());
	}

	/**
	 * Get the {@code expr} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code expr} kind.
	 */
	public String expr() {
		return TaggedUnionUtils.get(this, EXPR);
	}

	/**
	 * Is this variant instance of kind {@code value}?
	 */
	public boolean _isValue() {
		return VALUE.equals(_type());
	}

	/**
	 * Get the {@code value} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code value} kind.
	 */
	public Double value() {
		return TaggedUnionUtils.get(this, VALUE);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_type) {
				case EXPR :
					generator.write(((String) this._value));

					break;
				case VALUE :
					generator.write(((Double) this._value));

					break;
			}
		}

	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<FieldDateMath> {
		private String _type;
		private Object _value;

		public Builder expr(String v) {
			this._type = EXPR;
			this._value = v;
			return this;
		}

		public Builder value(Double v) {
			this._type = VALUE;
			this._value = v;
			return this;
		}

		public FieldDateMath build() {
			_checkSingleUse();
			return new FieldDateMath(this);
		}

	}

	private static JsonpDeserializer<FieldDateMath> buildFieldDateMathDeserializer() {
		return new UnionDeserializer.Builder<>(FieldDateMath::new, false)
				.addMember("expr", JsonpDeserializer.stringDeserializer())
				.addMember("value", JsonpDeserializer.doubleDeserializer()).build();
	}

	public static final JsonpDeserializer<FieldDateMath> _DESERIALIZER = JsonpDeserializer
			.lazy(FieldDateMath::buildFieldDateMathDeserializer);
}
