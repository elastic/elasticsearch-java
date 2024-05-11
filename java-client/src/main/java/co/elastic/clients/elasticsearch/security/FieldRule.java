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

package co.elastic.clients.elasticsearch.security;

import co.elastic.clients.json.JsonData;
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
import co.elastic.clients.util.OpenTaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: security._types.FieldRule

/**
 *
 * @see <a href="../doc-files/api-spec.html#security._types.FieldRule">API
 *      specification</a>
 */
@JsonpDeserializable
public class FieldRule implements OpenTaggedUnion<FieldRule.Kind, Object>, RoleMappingRuleVariant, JsonpSerializable {

	/**
	 * {@link FieldRule} variant kinds.
	 * 
	 * @see <a href="../doc-files/api-spec.html#security._types.FieldRule">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		Username("username"),

		Dn("dn"),

		Groups("groups"),

		/** A custom {@code FieldRule} defined by a plugin */
		_Custom(null)

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
		return RoleMappingRule.Kind.Field;
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

	public FieldRule(FieldRuleVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._fieldRuleKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");
		this._customKind = null;

	}

	private FieldRule(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");
		this._customKind = builder._customKind;

	}

	public static FieldRule of(Function<Builder, ObjectBuilder<FieldRule>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code username}?
	 */
	public boolean isUsername() {
		return _kind == Kind.Username;
	}

	/**
	 * Get the {@code username} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code username} kind.
	 */
	public List<String> username() {
		return TaggedUnionUtils.get(this, Kind.Username);
	}

	/**
	 * Is this variant instance of kind {@code dn}?
	 */
	public boolean isDn() {
		return _kind == Kind.Dn;
	}

	/**
	 * Get the {@code dn} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code dn} kind.
	 */
	public List<String> dn() {
		return TaggedUnionUtils.get(this, Kind.Dn);
	}

	/**
	 * Is this variant instance of kind {@code groups}?
	 */
	public boolean isGroups() {
		return _kind == Kind.Groups;
	}

	/**
	 * Get the {@code groups} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code groups} kind.
	 */
	public List<String> groups() {
		return TaggedUnionUtils.get(this, Kind.Groups);
	}

	@Nullable
	private final String _customKind;

	/**
	 * Is this a custom {@code FieldRule} defined by a plugin?
	 */
	public boolean _isCustom() {
		return _kind == Kind._Custom;
	}

	/**
	 * Get the actual kind when {@code _kind()} equals {@link Kind#_Custom}
	 * (plugin-defined variant).
	 */
	@Nullable
	public final String _customKind() {
		return _customKind;
	}

	/**
	 * Get the custom plugin-defined variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not {@link Kind#_Custom}.
	 */
	public JsonData _custom() {
		return TaggedUnionUtils.get(this, Kind._Custom);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeStartObject();

		generator.writeKey(_kind == Kind._Custom ? _customKind : _kind.jsonValue());
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_kind) {
				case Username :
					generator.writeStartArray();
					for (String item0 : ((List<String>) this._value)) {
						generator.write(item0);

					}
					generator.writeEnd();

					break;
				case Dn :
					generator.writeStartArray();
					for (String item0 : ((List<String>) this._value)) {
						generator.write(item0);

					}
					generator.writeEnd();

					break;
				case Groups :
					generator.writeStartArray();
					for (String item0 : ((List<String>) this._value)) {
						generator.write(item0);

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

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<FieldRule> {
		private Kind _kind;
		private Object _value;
		private String _customKind;

		@Override
		protected Builder self() {
			return this;
		}
		public ObjectBuilder<FieldRule> username(List<String> v) {
			this._kind = Kind.Username;
			this._value = v;
			return this;
		}

		public ObjectBuilder<FieldRule> dn(List<String> v) {
			this._kind = Kind.Dn;
			this._value = v;
			return this;
		}

		public ObjectBuilder<FieldRule> groups(List<String> v) {
			this._kind = Kind.Groups;
			this._value = v;
			return this;
		}

		/**
		 * Define this {@code FieldRule} as a plugin-defined variant.
		 *
		 * @param name
		 *            the plugin-defined identifier
		 * @param data
		 *            the data for this custom {@code FieldRule}. It is converted
		 *            internally to {@link JsonData}.
		 */
		public ObjectBuilder<FieldRule> _custom(String name, Object data) {
			this._kind = Kind._Custom;
			this._customKind = name;
			this._value = JsonData.of(data);
			return this;
		}

		public FieldRule build() {
			_checkSingleUse();
			return new FieldRule(this);
		}

	}

	protected static void setupFieldRuleDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::username, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"username");
		op.add(Builder::dn, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "dn");
		op.add(Builder::groups, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "groups");

		op.setUnknownFieldHandler((builder, name, parser, mapper) -> {
			JsonpUtils.ensureCustomVariantsAllowed(parser, mapper);
			builder._custom(name, JsonData._DESERIALIZER.deserialize(parser, mapper));
		});

	}

	public static final JsonpDeserializer<FieldRule> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			FieldRule::setupFieldRuleDeserializer, Builder::build);
}
