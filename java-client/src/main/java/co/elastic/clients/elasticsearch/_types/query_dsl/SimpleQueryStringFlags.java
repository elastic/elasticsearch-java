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

package co.elastic.clients.elasticsearch._types.query_dsl;

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

// typedef: _types.query_dsl.SimpleQueryStringFlags
// union type: Union[]
@JsonpDeserializable
public class SimpleQueryStringFlags implements TaggedUnion<Object>, JsonpSerializable {

	public static final String SINGLE = "single";
	public static final String MULTIPLE = "multiple";

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

	public SimpleQueryStringFlags(String type, Object value) {
		this._type = type;
		this._value = value;
	}

	public String _toJsonString() {
		switch (_type) {
			case "single" :
				return this.single().jsonValue();
			case "multiple" :
				return this.multiple();

			default :
				throw new IllegalStateException("Unknown type " + _type);
		}
	}
	private SimpleQueryStringFlags(Builder builder) {

		this._type = ModelTypeHelper.requireNonNull(builder._type, builder, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static SimpleQueryStringFlags of(Function<Builder, ObjectBuilder<SimpleQueryStringFlags>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code single}?
	 */
	public boolean _isSingle() {
		return SINGLE.equals(_type());
	}

	/**
	 * Get the {@code single} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code single} kind.
	 */
	public SimpleQueryStringFlag single() {
		return TaggedUnionUtils.get(this, SINGLE);
	}

	/**
	 * Is this variant instance of kind {@code multiple}?
	 */
	public boolean _isMultiple() {
		return MULTIPLE.equals(_type());
	}

	/**
	 * Get the {@code multiple} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code multiple} kind.
	 */
	public String multiple() {
		return TaggedUnionUtils.get(this, MULTIPLE);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_type) {
				case MULTIPLE :
					generator.write(((String) this._value));

					break;
			}
		}

	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<SimpleQueryStringFlags> {
		private String _type;
		private Object _value;

		public Builder single(SimpleQueryStringFlag v) {
			this._type = SINGLE;
			this._value = v;
			return this;
		}

		public Builder multiple(String v) {
			this._type = MULTIPLE;
			this._value = v;
			return this;
		}

		public SimpleQueryStringFlags build() {
			_checkSingleUse();
			return new SimpleQueryStringFlags(this);
		}

	}

	private static JsonpDeserializer<SimpleQueryStringFlags> buildSimpleQueryStringFlagsDeserializer() {
		return new UnionDeserializer.Builder<>(SimpleQueryStringFlags::new, true)
				.addMember("single", SimpleQueryStringFlag._DESERIALIZER)
				.addMember("multiple", JsonpDeserializer.stringDeserializer()).build();
	}

	public static final JsonpDeserializer<SimpleQueryStringFlags> _DESERIALIZER = JsonpDeserializer
			.lazy(SimpleQueryStringFlags::buildSimpleQueryStringFlagsDeserializer);
}
