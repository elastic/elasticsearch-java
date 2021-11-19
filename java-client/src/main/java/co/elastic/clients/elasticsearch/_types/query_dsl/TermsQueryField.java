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

import co.elastic.clients.elasticsearch._types.FieldValue;
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
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.TermsQueryField
// union type: Union[]
@JsonpDeserializable
public class TermsQueryField implements TaggedUnion<Object>, JsonpSerializable {

	public static final String VALUE = "value";
	public static final String LOOKUP = "lookup";

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

	public TermsQueryField(String type, Object value) {
		this._type = type;
		this._value = value;
	}

	private TermsQueryField(Builder builder) {

		this._type = ModelTypeHelper.requireNonNull(builder._type, builder, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static TermsQueryField of(Function<Builder, ObjectBuilder<TermsQueryField>> fn) {
		return fn.apply(new Builder()).build();
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
	public List<FieldValue> value() {
		return TaggedUnionUtils.get(this, VALUE);
	}

	/**
	 * Is this variant instance of kind {@code lookup}?
	 */
	public boolean _isLookup() {
		return LOOKUP.equals(_type());
	}

	/**
	 * Get the {@code lookup} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code lookup} kind.
	 */
	public TermsLookup lookup() {
		return TaggedUnionUtils.get(this, LOOKUP);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_type) {
				case VALUE :
					generator.writeStartArray();
					for (FieldValue item0 : ((List<FieldValue>) this._value)) {
						item0.serialize(generator, mapper);

					}
					generator.writeEnd();

					break;
			}
		}

	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<TermsQueryField> {
		private String _type;
		private Object _value;

		public Builder value(List<FieldValue> v) {
			this._type = VALUE;
			this._value = v;
			return this;
		}

		public Builder lookup(TermsLookup v) {
			this._type = LOOKUP;
			this._value = v;
			return this;
		}

		public Builder lookup(Function<TermsLookup.Builder, ObjectBuilder<TermsLookup>> f) {
			return this.lookup(f.apply(new TermsLookup.Builder()).build());
		}

		public TermsQueryField build() {
			_checkSingleUse();
			return new TermsQueryField(this);
		}

	}

	private static JsonpDeserializer<TermsQueryField> buildTermsQueryFieldDeserializer() {
		return new UnionDeserializer.Builder<>(TermsQueryField::new, false)
				.addMember("value", JsonpDeserializer.arrayDeserializer(FieldValue._DESERIALIZER))
				.addMember("lookup", TermsLookup._DESERIALIZER).build();
	}

	public static final JsonpDeserializer<TermsQueryField> _DESERIALIZER = JsonpDeserializer
			.lazy(TermsQueryField::buildTermsQueryFieldDeserializer);
}
