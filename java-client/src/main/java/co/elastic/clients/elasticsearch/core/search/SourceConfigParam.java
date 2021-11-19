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
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: _global.search._types.SourceConfigParam
// union type: Union[]
@JsonpDeserializable
public class SourceConfigParam implements TaggedUnion<Object>, JsonpSerializable {

	public static final String FIELDS = "fields";
	public static final String FETCH = "fetch";

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

	public SourceConfigParam(String type, Object value) {
		this._type = type;
		this._value = value;
	}

	public String _toJsonString() {
		switch (_type) {
			case "fields" :
				return this.fields().stream().map(v -> v).collect(Collectors.joining(","));
			case "fetch" :
				return String.valueOf(this.fetch());

			default :
				throw new IllegalStateException("Unknown type " + _type);
		}
	}
	private SourceConfigParam(Builder builder) {

		this._type = ModelTypeHelper.requireNonNull(builder._type, builder, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static SourceConfigParam of(Function<Builder, ObjectBuilder<SourceConfigParam>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code fields}?
	 */
	public boolean _isFields() {
		return FIELDS.equals(_type());
	}

	/**
	 * Get the {@code fields} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code fields} kind.
	 */
	public List<String> fields() {
		return TaggedUnionUtils.get(this, FIELDS);
	}

	/**
	 * Is this variant instance of kind {@code fetch}?
	 */
	public boolean _isFetch() {
		return FETCH.equals(_type());
	}

	/**
	 * Get the {@code fetch} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code fetch} kind.
	 */
	public Boolean fetch() {
		return TaggedUnionUtils.get(this, FETCH);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_type) {
				case FIELDS :
					generator.writeStartArray();
					for (String item0 : ((List<String>) this._value)) {
						generator.write(item0);

					}
					generator.writeEnd();

					break;
				case FETCH :
					generator.write(((Boolean) this._value));

					break;
			}
		}

	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<SourceConfigParam> {
		private String _type;
		private Object _value;

		public Builder fields(List<String> v) {
			this._type = FIELDS;
			this._value = v;
			return this;
		}

		public Builder fetch(Boolean v) {
			this._type = FETCH;
			this._value = v;
			return this;
		}

		public SourceConfigParam build() {
			_checkSingleUse();
			return new SourceConfigParam(this);
		}

	}

	private static JsonpDeserializer<SourceConfigParam> buildSourceConfigParamDeserializer() {
		return new UnionDeserializer.Builder<>(SourceConfigParam::new, false)
				.addMember("fields", JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()))
				.addMember("fetch", JsonpDeserializer.booleanDeserializer()).build();
	}

	public static final JsonpDeserializer<SourceConfigParam> _DESERIALIZER = JsonpDeserializer
			.lazy(SourceConfigParam::buildSourceConfigParamDeserializer);
}
