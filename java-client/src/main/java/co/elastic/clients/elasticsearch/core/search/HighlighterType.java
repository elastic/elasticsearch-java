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

// typedef: _global.search._types.HighlighterType

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.search._types.HighlighterType">API
 *      specification</a>
 */
@JsonpDeserializable
public class HighlighterType implements TaggedUnion<HighlighterType.Kind, Object>, JsonpSerializable {

	public enum Kind {
		Builtin, Custom

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

	private HighlighterType(Kind kind, Object value) {
		this._kind = kind;
		this._value = value;
	}

	public String _toJsonString() {
		switch (_kind) {
			case Builtin :
				return this.builtin().jsonValue();
			case Custom :
				return this.custom();

			default :
				throw new IllegalStateException("Unknown kind " + _kind);
		}
	}

	private HighlighterType(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static HighlighterType of(Function<Builder, ObjectBuilder<HighlighterType>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code builtin}?
	 */
	public boolean isBuiltin() {
		return _kind == Kind.Builtin;
	}

	/**
	 * Get the {@code builtin} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code builtin} kind.
	 */
	public BuiltinHighlighterType builtin() {
		return TaggedUnionUtils.get(this, Kind.Builtin);
	}

	/**
	 * Is this variant instance of kind {@code custom}?
	 */
	public boolean isCustom() {
		return _kind == Kind.Custom;
	}

	/**
	 * Get the {@code custom} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code custom} kind.
	 */
	public String custom() {
		return TaggedUnionUtils.get(this, Kind.Custom);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_kind) {
				case Custom :
					generator.write(((String) this._value));

					break;
			}
		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<HighlighterType> {
		private Kind _kind;
		private Object _value;

		public ObjectBuilder<HighlighterType> builtin(BuiltinHighlighterType v) {
			this._kind = Kind.Builtin;
			this._value = v;
			return this;
		}

		public ObjectBuilder<HighlighterType> custom(String v) {
			this._kind = Kind.Custom;
			this._value = v;
			return this;
		}

		public HighlighterType build() {
			_checkSingleUse();
			return new HighlighterType(this);
		}

	}

	private static JsonpDeserializer<HighlighterType> buildHighlighterTypeDeserializer() {
		return new UnionDeserializer.Builder<HighlighterType, Kind, Object>(HighlighterType::new, true)
				.addMember(Kind.Builtin, BuiltinHighlighterType._DESERIALIZER)
				.addMember(Kind.Custom, JsonpDeserializer.stringDeserializer()).build();
	}

	public static final JsonpDeserializer<HighlighterType> _DESERIALIZER = JsonpDeserializer
			.lazy(HighlighterType::buildHighlighterTypeDeserializer);
}
