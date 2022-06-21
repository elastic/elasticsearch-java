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

package co.elastic.clients.elasticsearch._types.analysis;

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

// typedef: _types.analysis.TokenFilter

/**
 *
 * @see <a href="../../doc-files/api-spec.html#_types.analysis.TokenFilter">API
 *      specification</a>
 */
@JsonpDeserializable
public class TokenFilter implements TaggedUnion<TokenFilter.Kind, Object>, JsonpSerializable {

	public enum Kind {
		Definition, Name

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

	private TokenFilter(Kind kind, Object value) {
		this._kind = kind;
		this._value = value;
	}

	private TokenFilter(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static TokenFilter of(Function<Builder, ObjectBuilder<TokenFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code definition}?
	 */
	public boolean isDefinition() {
		return _kind == Kind.Definition;
	}

	/**
	 * Get the {@code definition} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code definition} kind.
	 */
	public TokenFilterDefinition definition() {
		return TaggedUnionUtils.get(this, Kind.Definition);
	}

	/**
	 * Is this variant instance of kind {@code name}?
	 */
	public boolean isName() {
		return _kind == Kind.Name;
	}

	/**
	 * Get the {@code name} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code name} kind.
	 */
	public String name() {
		return TaggedUnionUtils.get(this, Kind.Name);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_kind) {
				case Name :
					generator.write(((String) this._value));

					break;
			}
		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<TokenFilter> {
		private Kind _kind;
		private Object _value;

		public ObjectBuilder<TokenFilter> definition(TokenFilterDefinition v) {
			this._kind = Kind.Definition;
			this._value = v;
			return this;
		}

		public ObjectBuilder<TokenFilter> definition(
				Function<TokenFilterDefinition.Builder, ObjectBuilder<TokenFilterDefinition>> fn) {
			return this.definition(fn.apply(new TokenFilterDefinition.Builder()).build());
		}

		public ObjectBuilder<TokenFilter> name(String v) {
			this._kind = Kind.Name;
			this._value = v;
			return this;
		}

		public TokenFilter build() {
			_checkSingleUse();
			return new TokenFilter(this);
		}

	}

	private static JsonpDeserializer<TokenFilter> buildTokenFilterDeserializer() {
		return new UnionDeserializer.Builder<TokenFilter, Kind, Object>(TokenFilter::new, false)
				.addMember(Kind.Definition, TokenFilterDefinition._DESERIALIZER)
				.addMember(Kind.Name, JsonpDeserializer.stringDeserializer()).build();
	}

	public static final JsonpDeserializer<TokenFilter> _DESERIALIZER = JsonpDeserializer
			.lazy(TokenFilter::buildTokenFilterDeserializer);
}
