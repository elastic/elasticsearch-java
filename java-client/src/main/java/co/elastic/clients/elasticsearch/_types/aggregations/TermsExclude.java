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
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: _types.aggregations.TermsExclude
// union type: Union[]
@JsonpDeserializable
public class TermsExclude implements TaggedUnion<Object>, JsonpSerializable {

	public static final String TERMS = "terms";
	public static final String REGEXP = "regexp";

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

	public TermsExclude(String type, Object value) {
		this._type = type;
		this._value = value;
	}

	public String _toJsonString() {
		switch (_type) {
			case "terms" :
				return this.terms().stream().map(v -> v).collect(Collectors.joining(","));
			case "regexp" :
				return this.regexp();

			default :
				throw new IllegalStateException("Unknown type " + _type);
		}
	}
	private TermsExclude(Builder builder) {

		this._type = ModelTypeHelper.requireNonNull(builder._type, builder, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static TermsExclude of(Function<Builder, ObjectBuilder<TermsExclude>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code terms}?
	 */
	public boolean _isTerms() {
		return TERMS.equals(_type());
	}

	/**
	 * Get the {@code terms} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code terms} kind.
	 */
	public List<String> terms() {
		return TaggedUnionUtils.get(this, TERMS);
	}

	/**
	 * Is this variant instance of kind {@code regexp}?
	 */
	public boolean _isRegexp() {
		return REGEXP.equals(_type());
	}

	/**
	 * Get the {@code regexp} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code regexp} kind.
	 */
	public String regexp() {
		return TaggedUnionUtils.get(this, REGEXP);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_type) {
				case TERMS :
					generator.writeStartArray();
					for (String item0 : ((List<String>) this._value)) {
						generator.write(item0);

					}
					generator.writeEnd();

					break;
				case REGEXP :
					generator.write(((String) this._value));

					break;
			}
		}

	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<TermsExclude> {
		private String _type;
		private Object _value;

		public Builder terms(List<String> v) {
			this._type = TERMS;
			this._value = v;
			return this;
		}

		public Builder regexp(String v) {
			this._type = REGEXP;
			this._value = v;
			return this;
		}

		public TermsExclude build() {
			_checkSingleUse();
			return new TermsExclude(this);
		}

	}

	private static JsonpDeserializer<TermsExclude> buildTermsExcludeDeserializer() {
		return new UnionDeserializer.Builder<>(TermsExclude::new, false)
				.addMember("terms", JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()))
				.addMember("regexp", JsonpDeserializer.stringDeserializer()).build();
	}

	public static final JsonpDeserializer<TermsExclude> _DESERIALIZER = JsonpDeserializer
			.lazy(TermsExclude::buildTermsExcludeDeserializer);
}
