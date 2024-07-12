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

package co.elastic.clients.elasticsearch._types.query_dsl;

import co.elastic.clients.elasticsearch.security.query_api_keys.ApiKeyQuery;
import co.elastic.clients.elasticsearch.security.query_api_keys.ApiKeyQueryVariant;
import co.elastic.clients.elasticsearch.security.query_role.RoleQuery;
import co.elastic.clients.elasticsearch.security.query_role.RoleQueryVariant;
import co.elastic.clients.elasticsearch.security.query_user.UserQuery;
import co.elastic.clients.elasticsearch.security.query_user.UserQueryVariant;
import co.elastic.clients.json.JsonEnum;
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

// typedef: _types.query_dsl.RangeQuery

/**
 *
 * @see <a href="../../doc-files/api-spec.html#_types.query_dsl.RangeQuery">API
 *      specification</a>
 */
@JsonpDeserializable
public class RangeQuery
		implements
			TaggedUnion<RangeQuery.Kind, RangeQueryVariant>,
			ApiKeyQueryVariant,
			QueryVariant,
			RoleQueryVariant,
			UserQueryVariant,
			JsonpSerializable {

	/**
	 * {@link RangeQuery} variant kinds.
	 * 
	 * @see <a href="../../doc-files/api-spec.html#_types.query_dsl.RangeQuery">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		Date("date"),

		Number("number"),

		Term("term"),

		Untyped("untyped"),

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
	 * ApiKeyQuery variant kind.
	 */
	@Override
	public ApiKeyQuery.Kind _apiKeyQueryKind() {
		return ApiKeyQuery.Kind.Range;
	}

	/**
	 * Query variant kind.
	 */
	@Override
	public Query.Kind _queryKind() {
		return Query.Kind.Range;
	}

	/**
	 * RoleQuery variant kind.
	 */
	@Override
	public RoleQuery.Kind _roleQueryKind() {
		return RoleQuery.Kind.Range;
	}

	/**
	 * UserQuery variant kind.
	 */
	@Override
	public UserQuery.Kind _userQueryKind() {
		return UserQuery.Kind.Range;
	}

	private final Kind _kind;
	private final RangeQueryVariant _value;

	@Override
	public final Kind _kind() {
		return _kind;
	}

	@Override
	public final RangeQueryVariant _get() {
		return _value;
	}

	public RangeQuery(RangeQueryVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._rangeQueryKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private RangeQuery(Kind kind, RangeQueryVariant value) {
		this._kind = kind;
		this._value = value;
	}

	private RangeQuery(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static RangeQuery of(Function<Builder, ObjectBuilder<RangeQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code date}?
	 */
	public boolean isDate() {
		return _kind == Kind.Date;
	}

	/**
	 * Get the {@code date} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code date} kind.
	 */
	public DateRangeQuery date() {
		return TaggedUnionUtils.get(this, Kind.Date);
	}

	/**
	 * Is this variant instance of kind {@code number}?
	 */
	public boolean isNumber() {
		return _kind == Kind.Number;
	}

	/**
	 * Get the {@code number} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code number} kind.
	 */
	public NumberRangeQuery number() {
		return TaggedUnionUtils.get(this, Kind.Number);
	}

	/**
	 * Is this variant instance of kind {@code term}?
	 */
	public boolean isTerm() {
		return _kind == Kind.Term;
	}

	/**
	 * Get the {@code term} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code term} kind.
	 */
	public TermRangeQuery term() {
		return TaggedUnionUtils.get(this, Kind.Term);
	}

	/**
	 * Is this variant instance of kind {@code untyped}?
	 */
	public boolean isUntyped() {
		return _kind == Kind.Untyped;
	}

	/**
	 * Get the {@code untyped} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code untyped} kind.
	 */
	public UntypedRangeQuery untyped() {
		return TaggedUnionUtils.get(this, Kind.Untyped);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		mapper.serialize(_value, generator);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<RangeQuery> {
		private Kind _kind;
		private RangeQueryVariant _value;

		public ObjectBuilder<RangeQuery> date(DateRangeQuery v) {
			this._kind = Kind.Date;
			this._value = v;
			return this;
		}

		public ObjectBuilder<RangeQuery> date(Function<DateRangeQuery.Builder, ObjectBuilder<DateRangeQuery>> fn) {
			return this.date(fn.apply(new DateRangeQuery.Builder()).build());
		}

		public ObjectBuilder<RangeQuery> number(NumberRangeQuery v) {
			this._kind = Kind.Number;
			this._value = v;
			return this;
		}

		public ObjectBuilder<RangeQuery> number(
				Function<NumberRangeQuery.Builder, ObjectBuilder<NumberRangeQuery>> fn) {
			return this.number(fn.apply(new NumberRangeQuery.Builder()).build());
		}

		public ObjectBuilder<RangeQuery> term(TermRangeQuery v) {
			this._kind = Kind.Term;
			this._value = v;
			return this;
		}

		public ObjectBuilder<RangeQuery> term(Function<TermRangeQuery.Builder, ObjectBuilder<TermRangeQuery>> fn) {
			return this.term(fn.apply(new TermRangeQuery.Builder()).build());
		}

		public ObjectBuilder<RangeQuery> untyped(UntypedRangeQuery v) {
			this._kind = Kind.Untyped;
			this._value = v;
			return this;
		}

		public ObjectBuilder<RangeQuery> untyped(
				Function<UntypedRangeQuery.Builder, ObjectBuilder<UntypedRangeQuery>> fn) {
			return this.untyped(fn.apply(new UntypedRangeQuery.Builder()).build());
		}

		public RangeQuery build() {
			_checkSingleUse();
			return new RangeQuery(this);
		}

	}

	private static JsonpDeserializer<RangeQuery> buildRangeQueryDeserializer() {
		return new UnionDeserializer.Builder<RangeQuery, Kind, RangeQueryVariant>(RangeQuery::new, false)
				.addMember(Kind.Untyped, UntypedRangeQuery._DESERIALIZER).build();
	}

	public static final JsonpDeserializer<RangeQuery> _DESERIALIZER = JsonpDeserializer
			.lazy(RangeQuery::buildRangeQueryDeserializer);
}
