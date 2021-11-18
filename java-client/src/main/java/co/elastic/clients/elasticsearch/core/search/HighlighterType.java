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

package co.elastic.clients.elasticsearch.core.search;

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

// typedef: _global.search._types.HighlighterType
// union type: Union[]
@JsonpDeserializable
public class HighlighterType implements TaggedUnion<Object>, JsonpSerializable {

	public static final String BUILTIN = "builtin";
	public static final String CUSTOM = "custom";

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

	public HighlighterType(String type, Object value) {
		this._type = type;
		this._value = value;
	}

	public String _toJsonString() {
		switch (_type) {
			case "builtin" :
				return this.builtin().jsonValue();
			case "custom" :
				return this.custom();

			default :
				throw new IllegalStateException("Unknown type " + _type);
		}
	}
	private HighlighterType(Builder builder) {

		this._type = ModelTypeHelper.requireNonNull(builder._type, builder, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static HighlighterType of(Function<Builder, ObjectBuilder<HighlighterType>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Get the {@code builtin} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code builtin} kind.
	 */
	public BuiltinHighlighterType builtin() {
		return TaggedUnionUtils.get(this, BUILTIN);
	}

	/**
	 * Get the {@code custom} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code custom} kind.
	 */
	public String custom() {
		return TaggedUnionUtils.get(this, CUSTOM);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_type) {
				case CUSTOM :
					generator.write(((String) this._value));

					break;
			}
		}

	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<HighlighterType> {
		private String _type;
		private Object _value;

		public Builder builtin(BuiltinHighlighterType v) {
			this._type = BUILTIN;
			this._value = v;
			return this;
		}

		public Builder custom(String v) {
			this._type = CUSTOM;
			this._value = v;
			return this;
		}

		public HighlighterType build() {
			_checkSingleUse();
			return new HighlighterType(this);
		}

	}

	private static JsonpDeserializer<HighlighterType> buildHighlighterTypeDeserializer() {
		return new UnionDeserializer.Builder<>(HighlighterType::new, true)
				.addMember("builtin", BuiltinHighlighterType._DESERIALIZER)
				.addMember("custom", JsonpDeserializer.stringDeserializer()).build();
	}

	public static final JsonpDeserializer<HighlighterType> _DESERIALIZER = JsonpDeserializer
			.lazy(HighlighterType::buildHighlighterTypeDeserializer);
}
