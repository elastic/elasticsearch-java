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

import co.elastic.clients.json.JsonData;
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
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security._types.FieldRule
// union type: Container[]
@JsonpDeserializable
public class FieldRule implements TaggedUnion<Object>, RoleMappingRuleVariant, JsonpSerializable {

	public static final String USERNAME = "username";
	public static final String DN = "dn";
	public static final String GROUPS = "groups";
	public static final String METADATA = "metadata";
	public static final String REALM = "realm";

	/**
	 * {@link RoleMappingRule} variant type
	 */
	@Override
	public String _variantType() {
		return "field";
	}

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

	public FieldRule(FieldRuleVariant value) {

		this._type = ModelTypeHelper.requireNonNull(value._variantType(), this, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private FieldRule(Builder builder) {

		this._type = ModelTypeHelper.requireNonNull(builder._type, builder, "<variant type>");
		this._value = ModelTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static FieldRule of(Function<Builder, ObjectBuilder<FieldRule>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code username}?
	 */
	public boolean _isUsername() {
		return USERNAME.equals(_type());
	}

	/**
	 * Get the {@code username} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code username} kind.
	 */
	public String username() {
		return TaggedUnionUtils.get(this, USERNAME);
	}

	/**
	 * Is this variant instance of kind {@code dn}?
	 */
	public boolean _isDn() {
		return DN.equals(_type());
	}

	/**
	 * Get the {@code dn} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code dn} kind.
	 */
	public List<String> dn() {
		return TaggedUnionUtils.get(this, DN);
	}

	/**
	 * Is this variant instance of kind {@code groups}?
	 */
	public boolean _isGroups() {
		return GROUPS.equals(_type());
	}

	/**
	 * Get the {@code groups} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code groups} kind.
	 */
	public List<String> groups() {
		return TaggedUnionUtils.get(this, GROUPS);
	}

	/**
	 * Is this variant instance of kind {@code metadata}?
	 */
	public boolean _isMetadata() {
		return METADATA.equals(_type());
	}

	/**
	 * Get the {@code metadata} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code metadata} kind.
	 */
	public JsonData metadata() {
		return TaggedUnionUtils.get(this, METADATA);
	}

	/**
	 * Is this variant instance of kind {@code realm}?
	 */
	public boolean _isRealm() {
		return REALM.equals(_type());
	}

	/**
	 * Get the {@code realm} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code realm} kind.
	 */
	public Realm realm() {
		return TaggedUnionUtils.get(this, REALM);
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
				case USERNAME :
					generator.write(((String) this._value));

					break;
				case DN :
					generator.writeStartArray();
					for (String item0 : ((List<String>) this._value)) {
						generator.write(item0);

					}
					generator.writeEnd();

					break;
				case GROUPS :
					generator.writeStartArray();
					for (String item0 : ((List<String>) this._value)) {
						generator.write(item0);

					}
					generator.writeEnd();

					break;
				case METADATA :
					((JsonData) this._value).serialize(generator, mapper);

					break;
			}
		}

		generator.writeEnd();

	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<FieldRule> {
		private String _type;
		private Object _value;

		public Builder username(String v) {
			this._type = USERNAME;
			this._value = v;
			return this;
		}

		public Builder dn(List<String> v) {
			this._type = DN;
			this._value = v;
			return this;
		}

		public Builder groups(List<String> v) {
			this._type = GROUPS;
			this._value = v;
			return this;
		}

		public Builder metadata(JsonData v) {
			this._type = METADATA;
			this._value = v;
			return this;
		}

		public Builder realm(Realm v) {
			this._type = REALM;
			this._value = v;
			return this;
		}

		public Builder realm(Function<Realm.Builder, ObjectBuilder<Realm>> f) {
			return this.realm(f.apply(new Realm.Builder()).build());
		}

		public FieldRule build() {
			_checkSingleUse();
			return new FieldRule(this);
		}

	}

	protected static void setupFieldRuleDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::username, JsonpDeserializer.stringDeserializer(), "username");
		op.add(Builder::dn, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "dn");
		op.add(Builder::groups, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "groups");
		op.add(Builder::metadata, JsonData._DESERIALIZER, "metadata");
		op.add(Builder::realm, Realm._DESERIALIZER, "realm");

	}

	public static final JsonpDeserializer<FieldRule> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			FieldRule::setupFieldRuleDeserializer, Builder::build);
}
