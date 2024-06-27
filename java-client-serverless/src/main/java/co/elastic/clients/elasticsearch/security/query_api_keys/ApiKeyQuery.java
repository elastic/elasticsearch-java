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

package co.elastic.clients.elasticsearch.security.query_api_keys;

import co.elastic.clients.elasticsearch._types.query_dsl.BoolQuery;
import co.elastic.clients.elasticsearch._types.query_dsl.ExistsQuery;
import co.elastic.clients.elasticsearch._types.query_dsl.IdsQuery;
import co.elastic.clients.elasticsearch._types.query_dsl.MatchAllQuery;
import co.elastic.clients.elasticsearch._types.query_dsl.MatchQuery;
import co.elastic.clients.elasticsearch._types.query_dsl.PrefixQuery;
import co.elastic.clients.elasticsearch._types.query_dsl.RangeQuery;
import co.elastic.clients.elasticsearch._types.query_dsl.SimpleQueryStringQuery;
import co.elastic.clients.elasticsearch._types.query_dsl.TermQuery;
import co.elastic.clients.elasticsearch._types.query_dsl.TermsQuery;
import co.elastic.clients.elasticsearch._types.query_dsl.WildcardQuery;
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

// typedef: security.query_api_keys.ApiKeyQueryContainer

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#security.query_api_keys.ApiKeyQueryContainer">API
 *      specification</a>
 */
@JsonpDeserializable
public class ApiKeyQuery
		implements
			OpenTaggedUnion<ApiKeyQuery.Kind, Object>,
			ApiKeyAggregationVariant,
			JsonpSerializable {

	/**
	 * {@link ApiKeyQuery} variant kinds.
	 * 
	 * @see <a href=
	 *      "../../doc-files/api-spec.html#security.query_api_keys.ApiKeyQueryContainer">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		Bool("bool"),

		Exists("exists"),

		Ids("ids"),

		Match("match"),

		MatchAll("match_all"),

		Prefix("prefix"),

		Range("range"),

		SimpleQueryString("simple_query_string"),

		Term("term"),

		Terms("terms"),

		Wildcard("wildcard"),

		/** A custom {@code ApiKeyQuery} defined by a plugin */
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
	 * ApiKeyAggregation variant kind.
	 */
	@Override
	public ApiKeyAggregation.Kind _apiKeyAggregationKind() {
		return ApiKeyAggregation.Kind.Filter;
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

	public ApiKeyQuery(ApiKeyQueryVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._apiKeyQueryKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");
		this._customKind = null;

	}

	private ApiKeyQuery(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");
		this._customKind = builder._customKind;

	}

	public static ApiKeyQuery of(Function<Builder, ObjectBuilder<ApiKeyQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code bool}?
	 */
	public boolean isBool() {
		return _kind == Kind.Bool;
	}

	/**
	 * Get the {@code bool} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code bool} kind.
	 */
	public BoolQuery bool() {
		return TaggedUnionUtils.get(this, Kind.Bool);
	}

	/**
	 * Is this variant instance of kind {@code exists}?
	 */
	public boolean isExists() {
		return _kind == Kind.Exists;
	}

	/**
	 * Get the {@code exists} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code exists} kind.
	 */
	public ExistsQuery exists() {
		return TaggedUnionUtils.get(this, Kind.Exists);
	}

	/**
	 * Is this variant instance of kind {@code ids}?
	 */
	public boolean isIds() {
		return _kind == Kind.Ids;
	}

	/**
	 * Get the {@code ids} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code ids} kind.
	 */
	public IdsQuery ids() {
		return TaggedUnionUtils.get(this, Kind.Ids);
	}

	/**
	 * Is this variant instance of kind {@code match}?
	 */
	public boolean isMatch() {
		return _kind == Kind.Match;
	}

	/**
	 * Get the {@code match} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code match} kind.
	 */
	public MatchQuery match() {
		return TaggedUnionUtils.get(this, Kind.Match);
	}

	/**
	 * Is this variant instance of kind {@code match_all}?
	 */
	public boolean isMatchAll() {
		return _kind == Kind.MatchAll;
	}

	/**
	 * Get the {@code match_all} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code match_all} kind.
	 */
	public MatchAllQuery matchAll() {
		return TaggedUnionUtils.get(this, Kind.MatchAll);
	}

	/**
	 * Is this variant instance of kind {@code prefix}?
	 */
	public boolean isPrefix() {
		return _kind == Kind.Prefix;
	}

	/**
	 * Get the {@code prefix} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code prefix} kind.
	 */
	public PrefixQuery prefix() {
		return TaggedUnionUtils.get(this, Kind.Prefix);
	}

	/**
	 * Is this variant instance of kind {@code range}?
	 */
	public boolean isRange() {
		return _kind == Kind.Range;
	}

	/**
	 * Get the {@code range} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code range} kind.
	 */
	public RangeQuery range() {
		return TaggedUnionUtils.get(this, Kind.Range);
	}

	/**
	 * Is this variant instance of kind {@code simple_query_string}?
	 */
	public boolean isSimpleQueryString() {
		return _kind == Kind.SimpleQueryString;
	}

	/**
	 * Get the {@code simple_query_string} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code simple_query_string}
	 *             kind.
	 */
	public SimpleQueryStringQuery simpleQueryString() {
		return TaggedUnionUtils.get(this, Kind.SimpleQueryString);
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
	public TermQuery term() {
		return TaggedUnionUtils.get(this, Kind.Term);
	}

	/**
	 * Is this variant instance of kind {@code terms}?
	 */
	public boolean isTerms() {
		return _kind == Kind.Terms;
	}

	/**
	 * Get the {@code terms} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code terms} kind.
	 */
	public TermsQuery terms() {
		return TaggedUnionUtils.get(this, Kind.Terms);
	}

	/**
	 * Is this variant instance of kind {@code wildcard}?
	 */
	public boolean isWildcard() {
		return _kind == Kind.Wildcard;
	}

	/**
	 * Get the {@code wildcard} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code wildcard} kind.
	 */
	public WildcardQuery wildcard() {
		return TaggedUnionUtils.get(this, Kind.Wildcard);
	}

	@Nullable
	private final String _customKind;

	/**
	 * Is this a custom {@code ApiKeyQuery} defined by a plugin?
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
		}

		generator.writeEnd();

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ApiKeyQuery> {
		private Kind _kind;
		private Object _value;
		private String _customKind;

		@Override
		protected Builder self() {
			return this;
		}
		public ObjectBuilder<ApiKeyQuery> bool(BoolQuery v) {
			this._kind = Kind.Bool;
			this._value = v;
			return this;
		}

		public ObjectBuilder<ApiKeyQuery> bool(Function<BoolQuery.Builder, ObjectBuilder<BoolQuery>> fn) {
			return this.bool(fn.apply(new BoolQuery.Builder()).build());
		}

		public ObjectBuilder<ApiKeyQuery> exists(ExistsQuery v) {
			this._kind = Kind.Exists;
			this._value = v;
			return this;
		}

		public ObjectBuilder<ApiKeyQuery> exists(Function<ExistsQuery.Builder, ObjectBuilder<ExistsQuery>> fn) {
			return this.exists(fn.apply(new ExistsQuery.Builder()).build());
		}

		public ObjectBuilder<ApiKeyQuery> ids(IdsQuery v) {
			this._kind = Kind.Ids;
			this._value = v;
			return this;
		}

		public ObjectBuilder<ApiKeyQuery> ids(Function<IdsQuery.Builder, ObjectBuilder<IdsQuery>> fn) {
			return this.ids(fn.apply(new IdsQuery.Builder()).build());
		}

		public ObjectBuilder<ApiKeyQuery> match(MatchQuery v) {
			this._kind = Kind.Match;
			this._value = v;
			return this;
		}

		public ObjectBuilder<ApiKeyQuery> match(Function<MatchQuery.Builder, ObjectBuilder<MatchQuery>> fn) {
			return this.match(fn.apply(new MatchQuery.Builder()).build());
		}

		public ObjectBuilder<ApiKeyQuery> matchAll(MatchAllQuery v) {
			this._kind = Kind.MatchAll;
			this._value = v;
			return this;
		}

		public ObjectBuilder<ApiKeyQuery> matchAll(Function<MatchAllQuery.Builder, ObjectBuilder<MatchAllQuery>> fn) {
			return this.matchAll(fn.apply(new MatchAllQuery.Builder()).build());
		}

		public ObjectBuilder<ApiKeyQuery> prefix(PrefixQuery v) {
			this._kind = Kind.Prefix;
			this._value = v;
			return this;
		}

		public ObjectBuilder<ApiKeyQuery> prefix(Function<PrefixQuery.Builder, ObjectBuilder<PrefixQuery>> fn) {
			return this.prefix(fn.apply(new PrefixQuery.Builder()).build());
		}

		public ObjectBuilder<ApiKeyQuery> range(RangeQuery v) {
			this._kind = Kind.Range;
			this._value = v;
			return this;
		}

		public ObjectBuilder<ApiKeyQuery> range(Function<RangeQuery.Builder, ObjectBuilder<RangeQuery>> fn) {
			return this.range(fn.apply(new RangeQuery.Builder()).build());
		}

		public ObjectBuilder<ApiKeyQuery> simpleQueryString(SimpleQueryStringQuery v) {
			this._kind = Kind.SimpleQueryString;
			this._value = v;
			return this;
		}

		public ObjectBuilder<ApiKeyQuery> simpleQueryString(
				Function<SimpleQueryStringQuery.Builder, ObjectBuilder<SimpleQueryStringQuery>> fn) {
			return this.simpleQueryString(fn.apply(new SimpleQueryStringQuery.Builder()).build());
		}

		public ObjectBuilder<ApiKeyQuery> term(TermQuery v) {
			this._kind = Kind.Term;
			this._value = v;
			return this;
		}

		public ObjectBuilder<ApiKeyQuery> term(Function<TermQuery.Builder, ObjectBuilder<TermQuery>> fn) {
			return this.term(fn.apply(new TermQuery.Builder()).build());
		}

		public ObjectBuilder<ApiKeyQuery> terms(TermsQuery v) {
			this._kind = Kind.Terms;
			this._value = v;
			return this;
		}

		public ObjectBuilder<ApiKeyQuery> terms(Function<TermsQuery.Builder, ObjectBuilder<TermsQuery>> fn) {
			return this.terms(fn.apply(new TermsQuery.Builder()).build());
		}

		public ObjectBuilder<ApiKeyQuery> wildcard(WildcardQuery v) {
			this._kind = Kind.Wildcard;
			this._value = v;
			return this;
		}

		public ObjectBuilder<ApiKeyQuery> wildcard(Function<WildcardQuery.Builder, ObjectBuilder<WildcardQuery>> fn) {
			return this.wildcard(fn.apply(new WildcardQuery.Builder()).build());
		}

		/**
		 * Define this {@code ApiKeyQuery} as a plugin-defined variant.
		 *
		 * @param name
		 *            the plugin-defined identifier
		 * @param data
		 *            the data for this custom {@code ApiKeyQuery}. It is converted
		 *            internally to {@link JsonData}.
		 */
		public ObjectBuilder<ApiKeyQuery> _custom(String name, Object data) {
			this._kind = Kind._Custom;
			this._customKind = name;
			this._value = JsonData.of(data);
			return this;
		}

		public ApiKeyQuery build() {
			_checkSingleUse();
			return new ApiKeyQuery(this);
		}

	}

	protected static void setupApiKeyQueryDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::bool, BoolQuery._DESERIALIZER, "bool");
		op.add(Builder::exists, ExistsQuery._DESERIALIZER, "exists");
		op.add(Builder::ids, IdsQuery._DESERIALIZER, "ids");
		op.add(Builder::match, MatchQuery._DESERIALIZER, "match");
		op.add(Builder::matchAll, MatchAllQuery._DESERIALIZER, "match_all");
		op.add(Builder::prefix, PrefixQuery._DESERIALIZER, "prefix");
		op.add(Builder::range, RangeQuery._DESERIALIZER, "range");
		op.add(Builder::simpleQueryString, SimpleQueryStringQuery._DESERIALIZER, "simple_query_string");
		op.add(Builder::term, TermQuery._DESERIALIZER, "term");
		op.add(Builder::terms, TermsQuery._DESERIALIZER, "terms");
		op.add(Builder::wildcard, WildcardQuery._DESERIALIZER, "wildcard");

		op.setUnknownFieldHandler((builder, name, parser, mapper) -> {
			JsonpUtils.ensureCustomVariantsAllowed(parser, mapper);
			builder._custom(name, JsonData._DESERIALIZER.deserialize(parser, mapper));
		});

	}

	public static final JsonpDeserializer<ApiKeyQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ApiKeyQuery::setupApiKeyQueryDeserializer, Builder::build);
}
