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

import co.elastic.clients.json.BuildFunctionDeserializer;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.TaggedUnion;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security._types.FieldRule
public class FieldRule extends TaggedUnion<Object> implements JsonpSerializable {

	public static final String USERNAME = "username";
	public static final String DN = "dn";
	public static final String GROUPS = "groups";
	public static final String METADATA = "metadata";
	public static final String REALM = "realm";

	private FieldRule(Builder builder) {
		super(builder.$tag, builder.$variant);

	}

	/**
	 * Get the {@code username} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code username} kind.
	 */
	public String username() {
		return _get(USERNAME);
	}

	/**
	 * Get the {@code dn} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code dn} kind.
	 */
	public List<String> dn() {
		return _get(DN);
	}

	/**
	 * Get the {@code groups} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code groups} kind.
	 */
	public List<String> groups() {
		return _get(GROUPS);
	}

	/**
	 * Get the {@code metadata} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code metadata} kind.
	 */
	public JsonData metadata() {
		return _get(METADATA);
	}

	/**
	 * Get the {@code realm} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code realm} kind.
	 */
	public Realm realm() {
		return _get(REALM);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		generator.writeKey(_type);
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_type) {
				case USERNAME :
					generator.write(this.<String>_get(USERNAME));

					break;
				case DN :
					generator.writeStartArray();
					for (String item0 : this.<List<String>>_get(DN)) {
						generator.write(item0);

					}
					generator.writeEnd();

					break;
				case GROUPS :
					generator.writeStartArray();
					for (String item0 : this.<List<String>>_get(GROUPS)) {
						generator.write(item0);

					}
					generator.writeEnd();

					break;
				case METADATA :
					this.<JsonData>_get(METADATA).serialize(generator, mapper);

					break;
			}
		}

		generator.writeEnd();
	}
	public static class Builder {
		private String $tag;
		private Object $variant;

		public ObjectBuilder<FieldRule> username(String v) {
			this.$variant = v;
			this.$tag = USERNAME;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<FieldRule> dn(List<String> v) {
			this.$variant = v;
			this.$tag = DN;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<FieldRule> groups(List<String> v) {
			this.$variant = v;
			this.$tag = GROUPS;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<FieldRule> metadata(JsonData v) {
			this.$variant = v;
			this.$tag = METADATA;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<FieldRule> realm(Realm v) {
			this.$variant = v;
			this.$tag = REALM;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<FieldRule> realm(Function<Realm.Builder, ObjectBuilder<Realm>> f) {
			return this.realm(f.apply(new Realm.Builder()).build());
		}

		protected FieldRule build() {
			return new FieldRule(this);
		}

	}

	protected static void setupFieldRuleDeserializer(DelegatingDeserializer<Builder> op) {
		op.add(Builder::username, JsonpDeserializer.stringDeserializer(), "username");
		op.add(Builder::dn, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "dn");
		op.add(Builder::groups, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "groups");
		op.add(Builder::metadata, JsonData.DESERIALIZER, "metadata");
		op.add(Builder::realm, Realm.DESERIALIZER, "realm");

	}

	// Variants can be recursive data structures. Building the union's deserializer
	// lazily avoids cyclic dependencies between static class initialization code,
	// which can lead to unwanted things like NPEs or stack overflows

	public static final JsonpDeserializer<FieldRule> DESERIALIZER = JsonpDeserializer.lazy(Builder::new,
			FieldRule::setupFieldRuleDeserializer, Builder::build);
}
