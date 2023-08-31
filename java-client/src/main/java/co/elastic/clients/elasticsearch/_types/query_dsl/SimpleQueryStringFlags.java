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

// typedef: _types.query_dsl.SimpleQueryStringFlags

/**
 * Query flags can be either a single flag or a combination of flags, e.g.
 * <code>OR|AND|PREFIX</code>
 * 
 * @see <a href=
 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.11/query-dsl-simple-query-string-query.html#supported-flags">Documentation
 *      on elastic.co</a>
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.query_dsl.SimpleQueryStringFlags">API
 *      specification</a>
 */
@JsonpDeserializable
public class SimpleQueryStringFlags implements TaggedUnion<SimpleQueryStringFlags.Kind, Object>, JsonpSerializable {

	public enum Kind {
		Single, Multiple

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

	private SimpleQueryStringFlags(Kind kind, Object value) {
		this._kind = kind;
		this._value = value;
	}

	public String _toJsonString() {
		switch (_kind) {
			case Single :
				return this.single().jsonValue();
			case Multiple :
				return this.multiple();

			default :
				throw new IllegalStateException("Unknown kind " + _kind);
		}
	}

	private SimpleQueryStringFlags(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static SimpleQueryStringFlags of(Function<Builder, ObjectBuilder<SimpleQueryStringFlags>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code single}?
	 */
	public boolean isSingle() {
		return _kind == Kind.Single;
	}

	/**
	 * Get the {@code single} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code single} kind.
	 */
	public SimpleQueryStringFlag single() {
		return TaggedUnionUtils.get(this, Kind.Single);
	}

	/**
	 * Is this variant instance of kind {@code multiple}?
	 */
	public boolean isMultiple() {
		return _kind == Kind.Multiple;
	}

	/**
	 * Get the {@code multiple} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code multiple} kind.
	 */
	public String multiple() {
		return TaggedUnionUtils.get(this, Kind.Multiple);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_kind) {
				case Multiple :
					generator.write(((String) this._value));

					break;
			}
		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<SimpleQueryStringFlags> {
		private Kind _kind;
		private Object _value;

		public ObjectBuilder<SimpleQueryStringFlags> single(SimpleQueryStringFlag v) {
			this._kind = Kind.Single;
			this._value = v;
			return this;
		}

		public ObjectBuilder<SimpleQueryStringFlags> multiple(String v) {
			this._kind = Kind.Multiple;
			this._value = v;
			return this;
		}

		public SimpleQueryStringFlags build() {
			_checkSingleUse();
			return new SimpleQueryStringFlags(this);
		}

	}

	private static JsonpDeserializer<SimpleQueryStringFlags> buildSimpleQueryStringFlagsDeserializer() {
		return new UnionDeserializer.Builder<SimpleQueryStringFlags, Kind, Object>(SimpleQueryStringFlags::new, true)
				.addMember(Kind.Single, SimpleQueryStringFlag._DESERIALIZER)
				.addMember(Kind.Multiple, JsonpDeserializer.stringDeserializer()).build();
	}

	public static final JsonpDeserializer<SimpleQueryStringFlags> _DESERIALIZER = JsonpDeserializer
			.lazy(SimpleQueryStringFlags::buildSimpleQueryStringFlagsDeserializer);
}
