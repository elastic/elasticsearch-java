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

import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security._types.RoleMappingRule

/**
 *
 * @see <a href="../doc-files/api-spec.html#security._types.RoleMappingRule">API
 *      specification</a>
 */
@JsonpDeserializable
public class RoleMappingRule
		implements
			TaggedUnion<RoleMappingRule.Kind, Object>,
			RoleMappingRuleVariant,
			JsonpSerializable {

	/**
	 * {@link RoleMappingRule} variant kinds.
	 * 
	 * @see <a href="../doc-files/api-spec.html#security._types.RoleMappingRule">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		Any("any"),

		All("all"),

		Field("field"),

		Except("except"),

		;

		private final String jsonValue;

		Kind(String jsonValue) {
			this.jsonValue = jsonValue;
		}

		public String jsonValue() {
			return this.jsonValue;
		}

	}

	/**
	 * RoleMappingRule variant kind.
	 */
	@Override
	public RoleMappingRule.Kind _roleMappingRuleKind() {
		return RoleMappingRule.Kind.Except;
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

	public RoleMappingRule(RoleMappingRuleVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._roleMappingRuleKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private RoleMappingRule(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static RoleMappingRule of(Function<Builder, ObjectBuilder<RoleMappingRule>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code any}?
	 */
	public boolean isAny() {
		return _kind == Kind.Any;
	}

	/**
	 * Get the {@code any} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code any} kind.
	 */
	public List<RoleMappingRule> any() {
		return TaggedUnionUtils.get(this, Kind.Any);
	}

	/**
	 * Is this variant instance of kind {@code all}?
	 */
	public boolean isAll() {
		return _kind == Kind.All;
	}

	/**
	 * Get the {@code all} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code all} kind.
	 */
	public List<RoleMappingRule> all() {
		return TaggedUnionUtils.get(this, Kind.All);
	}

	/**
	 * Is this variant instance of kind {@code field}?
	 */
	public boolean isField() {
		return _kind == Kind.Field;
	}

	/**
	 * Get the {@code field} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code field} kind.
	 */
	public FieldRule field() {
		return TaggedUnionUtils.get(this, Kind.Field);
	}

	/**
	 * Is this variant instance of kind {@code except}?
	 */
	public boolean isExcept() {
		return _kind == Kind.Except;
	}

	/**
	 * Get the {@code except} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code except} kind.
	 */
	public RoleMappingRule except() {
		return TaggedUnionUtils.get(this, Kind.Except);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeStartObject();

		generator.writeKey(_kind.jsonValue());
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_kind) {
				case Any :
					generator.writeStartArray();
					for (RoleMappingRule item0 : ((List<RoleMappingRule>) this._value)) {
						item0.serialize(generator, mapper);

					}
					generator.writeEnd();

					break;
				case All :
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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<RoleMappingRule> {
		private Kind _kind;
		private Object _value;

		@Override
		protected Builder self() {
			return this;
		}
		public ObjectBuilder<RoleMappingRule> any(List<RoleMappingRule> v) {
			this._kind = Kind.Any;
			this._value = v;
			return this;
		}

		public ObjectBuilder<RoleMappingRule> all(List<RoleMappingRule> v) {
			this._kind = Kind.All;
			this._value = v;
			return this;
		}

		public ObjectBuilder<RoleMappingRule> field(FieldRule v) {
			this._kind = Kind.Field;
			this._value = v;
			return this;
		}

		public ObjectBuilder<RoleMappingRule> field(Function<FieldRule.Builder, ObjectBuilder<FieldRule>> fn) {
			return this.field(fn.apply(new FieldRule.Builder()).build());
		}

		public ObjectBuilder<RoleMappingRule> except(RoleMappingRule v) {
			this._kind = Kind.Except;
			this._value = v;
			return this;
		}

		public ObjectBuilder<RoleMappingRule> except(
				Function<RoleMappingRule.Builder, ObjectBuilder<RoleMappingRule>> fn) {
			return this.except(fn.apply(new RoleMappingRule.Builder()).build());
		}

		public RoleMappingRule build() {
			_checkSingleUse();
			return new RoleMappingRule(this);
		}

	}

	protected static void setupRoleMappingRuleDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::any, JsonpDeserializer.arrayDeserializer(RoleMappingRule._DESERIALIZER), "any");
		op.add(Builder::all, JsonpDeserializer.arrayDeserializer(RoleMappingRule._DESERIALIZER), "all");
		op.add(Builder::field, FieldRule._DESERIALIZER, "field");
		op.add(Builder::except, RoleMappingRule._DESERIALIZER, "except");

	}

	public static final JsonpDeserializer<RoleMappingRule> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RoleMappingRule::setupRoleMappingRuleDeserializer, Builder::build);
}
