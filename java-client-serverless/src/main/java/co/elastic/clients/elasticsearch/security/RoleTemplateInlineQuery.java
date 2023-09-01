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

import co.elastic.clients.elasticsearch._types.query_dsl.Query;
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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security._types.RoleTemplateInlineQuery

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#security._types.RoleTemplateInlineQuery">API
 *      specification</a>
 */
@JsonpDeserializable
public class RoleTemplateInlineQuery implements TaggedUnion<RoleTemplateInlineQuery.Kind, Object>, JsonpSerializable {

	public enum Kind {
		QueryObject, QueryString

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

	private RoleTemplateInlineQuery(Kind kind, Object value) {
		this._kind = kind;
		this._value = value;
	}

	private RoleTemplateInlineQuery(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static RoleTemplateInlineQuery of(Function<Builder, ObjectBuilder<RoleTemplateInlineQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code query_object}?
	 */
	public boolean isQueryObject() {
		return _kind == Kind.QueryObject;
	}

	/**
	 * Get the {@code query_object} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code query_object} kind.
	 */
	public Query queryObject() {
		return TaggedUnionUtils.get(this, Kind.QueryObject);
	}

	/**
	 * Is this variant instance of kind {@code query_string}?
	 */
	public boolean isQueryString() {
		return _kind == Kind.QueryString;
	}

	/**
	 * Get the {@code query_string} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code query_string} kind.
	 */
	public String queryString() {
		return TaggedUnionUtils.get(this, Kind.QueryString);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_kind) {
				case QueryString :
					generator.write(((String) this._value));

					break;
			}
		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<RoleTemplateInlineQuery> {
		private Kind _kind;
		private Object _value;

		public ObjectBuilder<RoleTemplateInlineQuery> queryObject(Query v) {
			this._kind = Kind.QueryObject;
			this._value = v;
			return this;
		}

		public ObjectBuilder<RoleTemplateInlineQuery> queryObject(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.queryObject(fn.apply(new Query.Builder()).build());
		}

		public ObjectBuilder<RoleTemplateInlineQuery> queryString(String v) {
			this._kind = Kind.QueryString;
			this._value = v;
			return this;
		}

		public RoleTemplateInlineQuery build() {
			_checkSingleUse();
			return new RoleTemplateInlineQuery(this);
		}

	}

	private static JsonpDeserializer<RoleTemplateInlineQuery> buildRoleTemplateInlineQueryDeserializer() {
		return new UnionDeserializer.Builder<RoleTemplateInlineQuery, Kind, Object>(RoleTemplateInlineQuery::new, false)
				.addMember(Kind.QueryObject, Query._DESERIALIZER)
				.addMember(Kind.QueryString, JsonpDeserializer.stringDeserializer()).build();
	}

	public static final JsonpDeserializer<RoleTemplateInlineQuery> _DESERIALIZER = JsonpDeserializer
			.lazy(RoleTemplateInlineQuery::buildRoleTemplateInlineQueryDeserializer);
}
