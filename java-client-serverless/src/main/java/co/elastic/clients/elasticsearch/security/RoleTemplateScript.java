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

import co.elastic.clients.elasticsearch._types.StoredScriptId;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.UnionDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security._types.RoleTemplateScript

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#security._types.RoleTemplateScript">API
 *      specification</a>
 */
@JsonpDeserializable
public class RoleTemplateScript implements TaggedUnion<RoleTemplateScript.Kind, Object>, JsonpSerializable {

	public enum Kind {
		Stored, Inline

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

	private RoleTemplateScript(Kind kind, Object value) {
		this._kind = kind;
		this._value = value;
	}

	private RoleTemplateScript(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static RoleTemplateScript of(Function<Builder, ObjectBuilder<RoleTemplateScript>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code stored}?
	 */
	public boolean isStored() {
		return _kind == Kind.Stored;
	}

	/**
	 * Get the {@code stored} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code stored} kind.
	 */
	public StoredScriptId stored() {
		return TaggedUnionUtils.get(this, Kind.Stored);
	}

	/**
	 * Is this variant instance of kind {@code inline}?
	 */
	public boolean isInline() {
		return _kind == Kind.Inline;
	}

	/**
	 * Get the {@code inline} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code inline} kind.
	 */
	public RoleTemplateInlineScript inline() {
		return TaggedUnionUtils.get(this, Kind.Inline);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<RoleTemplateScript> {
		private Kind _kind;
		private Object _value;

		public ObjectBuilder<RoleTemplateScript> stored(StoredScriptId v) {
			this._kind = Kind.Stored;
			this._value = v;
			return this;
		}

		public ObjectBuilder<RoleTemplateScript> stored(
				Function<StoredScriptId.Builder, ObjectBuilder<StoredScriptId>> fn) {
			return this.stored(fn.apply(new StoredScriptId.Builder()).build());
		}

		public ObjectBuilder<RoleTemplateScript> inline(RoleTemplateInlineScript v) {
			this._kind = Kind.Inline;
			this._value = v;
			return this;
		}

		public ObjectBuilder<RoleTemplateScript> inline(
				Function<RoleTemplateInlineScript.Builder, ObjectBuilder<RoleTemplateInlineScript>> fn) {
			return this.inline(fn.apply(new RoleTemplateInlineScript.Builder()).build());
		}

		public RoleTemplateScript build() {
			_checkSingleUse();
			return new RoleTemplateScript(this);
		}

	}

	private static JsonpDeserializer<RoleTemplateScript> buildRoleTemplateScriptDeserializer() {
		return new UnionDeserializer.Builder<RoleTemplateScript, Kind, Object>(RoleTemplateScript::new, false)
				.addMember(Kind.Stored, StoredScriptId._DESERIALIZER)
				.addMember(Kind.Inline, RoleTemplateInlineScript._DESERIALIZER).build();
	}

	public static final JsonpDeserializer<RoleTemplateScript> _DESERIALIZER = JsonpDeserializer
			.lazy(RoleTemplateScript::buildRoleTemplateScriptDeserializer);
}
