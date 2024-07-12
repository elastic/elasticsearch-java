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

package co.elastic.clients.elasticsearch.security.query_user;

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
import co.elastic.clients.util.ObjectBuilder;
import java.util.function.Function;

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

/**
 * Builders for {@link UserQuery} variants.
 */
public class UserQueryBuilders {
	private UserQueryBuilders() {
	}

	/**
	 * Creates a builder for the {@link IdsQuery ids} {@code UserQuery} variant.
	 */
	public static IdsQuery.Builder ids() {
		return new IdsQuery.Builder();
	}

	/**
	 * Creates a UserQuery of the {@link IdsQuery ids} {@code UserQuery} variant.
	 */
	public static UserQuery ids(Function<IdsQuery.Builder, ObjectBuilder<IdsQuery>> fn) {
		UserQuery.Builder builder = new UserQuery.Builder();
		builder.ids(fn.apply(new IdsQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link BoolQuery bool} {@code UserQuery} variant.
	 */
	public static BoolQuery.Builder bool() {
		return new BoolQuery.Builder();
	}

	/**
	 * Creates a UserQuery of the {@link BoolQuery bool} {@code UserQuery} variant.
	 */
	public static UserQuery bool(Function<BoolQuery.Builder, ObjectBuilder<BoolQuery>> fn) {
		UserQuery.Builder builder = new UserQuery.Builder();
		builder.bool(fn.apply(new BoolQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ExistsQuery exists} {@code UserQuery}
	 * variant.
	 */
	public static ExistsQuery.Builder exists() {
		return new ExistsQuery.Builder();
	}

	/**
	 * Creates a UserQuery of the {@link ExistsQuery exists} {@code UserQuery}
	 * variant.
	 */
	public static UserQuery exists(Function<ExistsQuery.Builder, ObjectBuilder<ExistsQuery>> fn) {
		UserQuery.Builder builder = new UserQuery.Builder();
		builder.exists(fn.apply(new ExistsQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link MatchQuery match} {@code UserQuery} variant.
	 */
	public static MatchQuery.Builder match() {
		return new MatchQuery.Builder();
	}

	/**
	 * Creates a UserQuery of the {@link MatchQuery match} {@code UserQuery}
	 * variant.
	 */
	public static UserQuery match(Function<MatchQuery.Builder, ObjectBuilder<MatchQuery>> fn) {
		UserQuery.Builder builder = new UserQuery.Builder();
		builder.match(fn.apply(new MatchQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link MatchAllQuery match_all} {@code UserQuery}
	 * variant.
	 */
	public static MatchAllQuery.Builder matchAll() {
		return new MatchAllQuery.Builder();
	}

	/**
	 * Creates a UserQuery of the {@link MatchAllQuery match_all} {@code UserQuery}
	 * variant.
	 */
	public static UserQuery matchAll(Function<MatchAllQuery.Builder, ObjectBuilder<MatchAllQuery>> fn) {
		UserQuery.Builder builder = new UserQuery.Builder();
		builder.matchAll(fn.apply(new MatchAllQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link PrefixQuery prefix} {@code UserQuery}
	 * variant.
	 */
	public static PrefixQuery.Builder prefix() {
		return new PrefixQuery.Builder();
	}

	/**
	 * Creates a UserQuery of the {@link PrefixQuery prefix} {@code UserQuery}
	 * variant.
	 */
	public static UserQuery prefix(Function<PrefixQuery.Builder, ObjectBuilder<PrefixQuery>> fn) {
		UserQuery.Builder builder = new UserQuery.Builder();
		builder.prefix(fn.apply(new PrefixQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link RangeQuery range} {@code UserQuery} variant.
	 */
	public static RangeQuery.Builder range() {
		return new RangeQuery.Builder();
	}

	/**
	 * Creates a UserQuery of the {@link RangeQuery range} {@code UserQuery}
	 * variant.
	 */
	public static UserQuery range(Function<RangeQuery.Builder, ObjectBuilder<RangeQuery>> fn) {
		UserQuery.Builder builder = new UserQuery.Builder();
		builder.range(fn.apply(new RangeQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SimpleQueryStringQuery simple_query_string}
	 * {@code UserQuery} variant.
	 */
	public static SimpleQueryStringQuery.Builder simpleQueryString() {
		return new SimpleQueryStringQuery.Builder();
	}

	/**
	 * Creates a UserQuery of the {@link SimpleQueryStringQuery simple_query_string}
	 * {@code UserQuery} variant.
	 */
	public static UserQuery simpleQueryString(
			Function<SimpleQueryStringQuery.Builder, ObjectBuilder<SimpleQueryStringQuery>> fn) {
		UserQuery.Builder builder = new UserQuery.Builder();
		builder.simpleQueryString(fn.apply(new SimpleQueryStringQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link TermQuery term} {@code UserQuery} variant.
	 */
	public static TermQuery.Builder term() {
		return new TermQuery.Builder();
	}

	/**
	 * Creates a UserQuery of the {@link TermQuery term} {@code UserQuery} variant.
	 */
	public static UserQuery term(Function<TermQuery.Builder, ObjectBuilder<TermQuery>> fn) {
		UserQuery.Builder builder = new UserQuery.Builder();
		builder.term(fn.apply(new TermQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link TermsQuery terms} {@code UserQuery} variant.
	 */
	public static TermsQuery.Builder terms() {
		return new TermsQuery.Builder();
	}

	/**
	 * Creates a UserQuery of the {@link TermsQuery terms} {@code UserQuery}
	 * variant.
	 */
	public static UserQuery terms(Function<TermsQuery.Builder, ObjectBuilder<TermsQuery>> fn) {
		UserQuery.Builder builder = new UserQuery.Builder();
		builder.terms(fn.apply(new TermsQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link WildcardQuery wildcard} {@code UserQuery}
	 * variant.
	 */
	public static WildcardQuery.Builder wildcard() {
		return new WildcardQuery.Builder();
	}

	/**
	 * Creates a UserQuery of the {@link WildcardQuery wildcard} {@code UserQuery}
	 * variant.
	 */
	public static UserQuery wildcard(Function<WildcardQuery.Builder, ObjectBuilder<WildcardQuery>> fn) {
		UserQuery.Builder builder = new UserQuery.Builder();
		builder.wildcard(fn.apply(new WildcardQuery.Builder()).build());
		return builder.build();
	}

}
