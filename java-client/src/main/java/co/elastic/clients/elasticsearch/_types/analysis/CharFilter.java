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

// typedef: _types.analysis.CharFilter
// union type: Union[]
@JsonpDeserializable
public class CharFilter implements TaggedUnion<Object>, JsonpSerializable {

	public static final String DEFINITION = "definition";
	public static final String NAME = "name";

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

	public CharFilter(String type, Object value) {
		this._type = type;
		this._value = value;
	}

	private CharFilter(Builder builder) {

		this._type = ModelTypeHelper.requireNonNull(builder._type, builder, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static CharFilter of(Function<Builder, ObjectBuilder<CharFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Get the {@code definition} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code definition} kind.
	 */
	public CharFilterDefinition definition() {
		return TaggedUnionUtils.get(this, DEFINITION);
	}

	/**
	 * Get the {@code name} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code name} kind.
	 */
	public String name() {
		return TaggedUnionUtils.get(this, NAME);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_type) {
				case NAME :
					generator.write(((String) this._value));

					break;
			}
		}

	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<CharFilter> {
		private String _type;
		private Object _value;

		public Builder definition(CharFilterDefinition v) {
			this._type = DEFINITION;
			this._value = v;
			return this;
		}

		public Builder definition(Function<CharFilterDefinition.Builder, ObjectBuilder<CharFilterDefinition>> f) {
			return this.definition(f.apply(new CharFilterDefinition.Builder()).build());
		}

		public Builder name(String v) {
			this._type = NAME;
			this._value = v;
			return this;
		}

		public CharFilter build() {
			_checkSingleUse();
			return new CharFilter(this);
		}

	}

	private static JsonpDeserializer<CharFilter> buildCharFilterDeserializer() {
		return new UnionDeserializer.Builder<>(CharFilter::new, false)
				.addMember("definition", CharFilterDefinition._DESERIALIZER)
				.addMember("name", JsonpDeserializer.stringDeserializer()).build();
	}

	public static final JsonpDeserializer<CharFilter> _DESERIALIZER = JsonpDeserializer
			.lazy(CharFilter::buildCharFilterDeserializer);
}
