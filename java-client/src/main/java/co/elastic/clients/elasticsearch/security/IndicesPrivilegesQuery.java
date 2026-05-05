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

// typedef: security._types.IndicesPrivilegesQuery

/**
 * While creating or updating a role you can provide either a JSON structure or
 * a string to the API. However, the response provided by Elasticsearch will
 * only be string with a json-as-text content.
 * <p>
 * Since this is embedded in <code>IndicesPrivileges</code>, the same structure
 * is used for clarity in both contexts.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#security._types.IndicesPrivilegesQuery">API
 *      specification</a>
 */
@JsonpDeserializable
public class IndicesPrivilegesQuery implements TaggedUnion<IndicesPrivilegesQuery.Kind, Object>, JsonpSerializable {

	public enum Kind {
		Query, JsonText, Template

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

	private IndicesPrivilegesQuery(Kind kind, Object value) {
		this._kind = kind;
		this._value = value;
	}

	private IndicesPrivilegesQuery(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static IndicesPrivilegesQuery of(Function<Builder, ObjectBuilder<IndicesPrivilegesQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code query}?
	 */
	public boolean isQuery() {
		return _kind == Kind.Query;
	}

	/**
	 * Get the {@code query} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code query} kind.
	 */
	public Query query() {
		return TaggedUnionUtils.get(this, Kind.Query);
	}

	/**
	 * Is this variant instance of kind {@code json_text}?
	 */
	public boolean isJsonText() {
		return _kind == Kind.JsonText;
	}

	/**
	 * Get the {@code json_text} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code json_text} kind.
	 */
	public String jsonText() {
		return TaggedUnionUtils.get(this, Kind.JsonText);
	}

	/**
	 * Is this variant instance of kind {@code template}?
	 */
	public boolean isTemplate() {
		return _kind == Kind.Template;
	}

	/**
	 * Get the {@code template} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code template} kind.
	 */
	public RoleTemplateQuery template() {
		return TaggedUnionUtils.get(this, Kind.Template);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_kind) {
				case JsonText :
					generator.write(((String) this._value));

					break;
			}
		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<IndicesPrivilegesQuery> {
		private Kind _kind;
		private Object _value;

		public ObjectBuilder<IndicesPrivilegesQuery> query(Query v) {
			this._kind = Kind.Query;
			this._value = v;
			return this;
		}

		public ObjectBuilder<IndicesPrivilegesQuery> query(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.query(fn.apply(new Query.Builder()).build());
		}

		public ObjectBuilder<IndicesPrivilegesQuery> jsonText(String v) {
			this._kind = Kind.JsonText;
			this._value = v;
			return this;
		}

		public ObjectBuilder<IndicesPrivilegesQuery> template(RoleTemplateQuery v) {
			this._kind = Kind.Template;
			this._value = v;
			return this;
		}

		public ObjectBuilder<IndicesPrivilegesQuery> template(
				Function<RoleTemplateQuery.Builder, ObjectBuilder<RoleTemplateQuery>> fn) {
			return this.template(fn.apply(new RoleTemplateQuery.Builder()).build());
		}

		public IndicesPrivilegesQuery build() {
			_checkSingleUse();
			return new IndicesPrivilegesQuery(this);
		}

	}

	private static JsonpDeserializer<IndicesPrivilegesQuery> buildIndicesPrivilegesQueryDeserializer() {
		return new UnionDeserializer.Builder<IndicesPrivilegesQuery, Kind, Object>(IndicesPrivilegesQuery::new, false)
				.addMember(Kind.Query, Query._DESERIALIZER)
				.addMember(Kind.JsonText, JsonpDeserializer.stringDeserializer())
				.addMember(Kind.Template, RoleTemplateQuery._DESERIALIZER).build();
	}

	public static final JsonpDeserializer<IndicesPrivilegesQuery> _DESERIALIZER = JsonpDeserializer
			.lazy(IndicesPrivilegesQuery::buildIndicesPrivilegesQueryDeserializer);
}
