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

package co.elastic.clients.elasticsearch.security;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
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

// typedef: security._types.RoleMappingRule
@JsonpDeserializable
public class RoleMappingRule implements TaggedUnion<Object>, RoleMappingRuleVariant, JsonpSerializable {

	public static final String ANY = "any";
	public static final String ALL = "all";
	public static final String FIELD = "field";
	public static final String EXCEPT = "except";

	/**
	 * {@link RoleMappingRule} variant type
	 */
	@Override
	public String _variantType() {
		return "except";
	}

	// Tagged union implementation

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

	public RoleMappingRule(RoleMappingRuleVariant value) {

		this._type = ModelTypeHelper.requireNonNull(value._variantType(), this, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private RoleMappingRule(Builder builder) {

		this._type = ModelTypeHelper.requireNonNull(builder._type, builder, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static RoleMappingRule of(Function<Builder, ObjectBuilder<RoleMappingRule>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Get the {@code any} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code any} kind.
	 */
	public List<RoleMappingRule> any() {
		return TaggedUnionUtils.get(this, ANY);
	}

	/**
	 * Get the {@code all} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code all} kind.
	 */
	public List<RoleMappingRule> all() {
		return TaggedUnionUtils.get(this, ALL);
	}

	/**
	 * Get the {@code field} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code field} kind.
	 */
	public FieldRule field() {
		return TaggedUnionUtils.get(this, FIELD);
	}

	/**
	 * Get the {@code except} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code except} kind.
	 */
	public RoleMappingRule except() {
		return TaggedUnionUtils.get(this, EXCEPT);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();

		generator.writeKey(_type);
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_type) {
				case ANY :
					generator.writeStartArray();
					for (RoleMappingRule item0 : ((List<RoleMappingRule>) this._value)) {
						item0.serialize(generator, mapper);

					}
					generator.writeEnd();

					break;
				case ALL :
					generator.writeStartArray();
					for (RoleMappingRule item0 : ((List<RoleMappingRule>) this._value)) {
						item0.serialize(generator, mapper);

					}
					generator.writeEnd();

					break;
			}
		}

		generator.writeEnd();
	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<RoleMappingRule> {
		private String _type;
		private Object _value;

		public Builder any(List<RoleMappingRule> v) {
			this._type = ANY;
			this._value = v;
			return this;
		}

		public Builder all(List<RoleMappingRule> v) {
			this._type = ALL;
			this._value = v;
			return this;
		}

		public Builder field(FieldRule v) {
			this._type = FIELD;
			this._value = v;
			return this;
		}

		public Builder field(Function<FieldRule.Builder, ObjectBuilder<FieldRule>> f) {
			return this.field(f.apply(new FieldRule.Builder()).build());
		}

		public Builder except(RoleMappingRule v) {
			this._type = EXCEPT;
			this._value = v;
			return this;
		}

		public Builder except(Function<RoleMappingRule.Builder, ObjectBuilder<RoleMappingRule>> f) {
			return this.except(f.apply(new RoleMappingRule.Builder()).build());
		}

		public RoleMappingRule build() {
			_checkSingleUse();
			return new RoleMappingRule(this);
		}

	}

	protected static void setupRoleMappingRuleDeserializer(DelegatingDeserializer<Builder> op) {

		op.add(Builder::any, JsonpDeserializer.arrayDeserializer(RoleMappingRule._DESERIALIZER), "any");
		op.add(Builder::all, JsonpDeserializer.arrayDeserializer(RoleMappingRule._DESERIALIZER), "all");
		op.add(Builder::field, FieldRule._DESERIALIZER, "field");
		op.add(Builder::except, RoleMappingRule._DESERIALIZER, "except");

	}

	public static final JsonpDeserializer<RoleMappingRule> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RoleMappingRule::setupRoleMappingRuleDeserializer, Builder::build);
}
