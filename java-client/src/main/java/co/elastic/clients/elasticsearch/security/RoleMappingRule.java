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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.TaggedUnion;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security._types.RoleMappingRule
public class RoleMappingRule extends TaggedUnion<Object> implements JsonpSerializable {

	public static final String ANY = "any";
	public static final String ALL = "all";
	public static final String FIELD = "field";
	public static final String EXCEPT = "except";

	private RoleMappingRule(Builder builder) {
		super(builder.$tag, builder.$variant);

	}

	/**
	 * Get the {@code any} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code any} kind.
	 */
	public List<co.elastic.clients.elasticsearch.security.RoleMappingRule> any() {
		return _get(ANY);
	}

	/**
	 * Get the {@code all} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code all} kind.
	 */
	public List<co.elastic.clients.elasticsearch.security.RoleMappingRule> all() {
		return _get(ALL);
	}

	/**
	 * Get the {@code field} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code field} kind.
	 */
	public FieldRule field() {
		return _get(FIELD);
	}

	/**
	 * Get the {@code except} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code except} kind.
	 */
	public co.elastic.clients.elasticsearch.security.RoleMappingRule except() {
		return _get(EXCEPT);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		generator.writeKey(_type);
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_type) {
				case ANY :
					generator.writeStartArray();
					for (co.elastic.clients.elasticsearch.security.RoleMappingRule item0 : this.<List<co.elastic.clients.elasticsearch.security.RoleMappingRule>>_get(
							ANY)) {
						item0.serialize(generator, mapper);

					}
					generator.writeEnd();

					break;
				case ALL :
					generator.writeStartArray();
					for (co.elastic.clients.elasticsearch.security.RoleMappingRule item0 : this.<List<co.elastic.clients.elasticsearch.security.RoleMappingRule>>_get(
							ALL)) {
						item0.serialize(generator, mapper);

					}
					generator.writeEnd();

					break;
			}
		}

		generator.writeEnd();
	}
	public static class Builder {
		private String $tag;
		private Object $variant;

		public ObjectBuilder<RoleMappingRule> any(List<co.elastic.clients.elasticsearch.security.RoleMappingRule> v) {
			this.$variant = v;
			this.$tag = ANY;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<RoleMappingRule> all(List<co.elastic.clients.elasticsearch.security.RoleMappingRule> v) {
			this.$variant = v;
			this.$tag = ALL;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<RoleMappingRule> field(FieldRule v) {
			this.$variant = v;
			this.$tag = FIELD;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<RoleMappingRule> field(Function<FieldRule.Builder, ObjectBuilder<FieldRule>> f) {
			return this.field(f.apply(new FieldRule.Builder()).build());
		}

		public ObjectBuilder<RoleMappingRule> except(co.elastic.clients.elasticsearch.security.RoleMappingRule v) {
			this.$variant = v;
			this.$tag = EXCEPT;
			return ObjectBuilder.constant(this.build());
		}

		public ObjectBuilder<RoleMappingRule> except(
				Function<co.elastic.clients.elasticsearch.security.RoleMappingRule.Builder, ObjectBuilder<co.elastic.clients.elasticsearch.security.RoleMappingRule>> f) {
			return this
					.except(f.apply(new co.elastic.clients.elasticsearch.security.RoleMappingRule.Builder()).build());
		}

		protected RoleMappingRule build() {
			return new RoleMappingRule(this);
		}

	}

	protected static void setupRoleMappingRuleDeserializer(DelegatingDeserializer<Builder> op) {
		op.add(Builder::any, JsonpDeserializer
				.arrayDeserializer(co.elastic.clients.elasticsearch.security.RoleMappingRule.DESERIALIZER), "any");
		op.add(Builder::all, JsonpDeserializer
				.arrayDeserializer(co.elastic.clients.elasticsearch.security.RoleMappingRule.DESERIALIZER), "all");
		op.add(Builder::field, FieldRule.DESERIALIZER, "field");
		op.add(Builder::except, co.elastic.clients.elasticsearch.security.RoleMappingRule.DESERIALIZER, "except");

	}

	// Variants can be recursive data structures. Building the union's deserializer
	// lazily avoids cyclic dependencies between static class initialization code,
	// which can lead to unwanted things like NPEs or stack overflows

	public static final JsonpDeserializer<RoleMappingRule> DESERIALIZER = JsonpDeserializer.lazy(Builder::new,
			RoleMappingRule::setupRoleMappingRuleDeserializer, Builder::build);
}
