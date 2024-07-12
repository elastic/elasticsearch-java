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

package co.elastic.clients.elasticsearch.security.query_role;

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
 * Builders for {@link RoleQuery} variants.
 */
public class RoleQueryBuilders {
	private RoleQueryBuilders() {
	}

	/**
	 * Creates a builder for the {@link BoolQuery bool} {@code RoleQuery} variant.
	 */
	public static BoolQuery.Builder bool() {
		return new BoolQuery.Builder();
	}

	/**
	 * Creates a RoleQuery of the {@link BoolQuery bool} {@code RoleQuery} variant.
	 */
	public static RoleQuery bool(Function<BoolQuery.Builder, ObjectBuilder<BoolQuery>> fn) {
		RoleQuery.Builder builder = new RoleQuery.Builder();
		builder.bool(fn.apply(new BoolQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ExistsQuery exists} {@code RoleQuery}
	 * variant.
	 */
	public static ExistsQuery.Builder exists() {
		return new ExistsQuery.Builder();
	}

	/**
	 * Creates a RoleQuery of the {@link ExistsQuery exists} {@code RoleQuery}
	 * variant.
	 */
	public static RoleQuery exists(Function<ExistsQuery.Builder, ObjectBuilder<ExistsQuery>> fn) {
		RoleQuery.Builder builder = new RoleQuery.Builder();
		builder.exists(fn.apply(new ExistsQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link IdsQuery ids} {@code RoleQuery} variant.
	 */
	public static IdsQuery.Builder ids() {
		return new IdsQuery.Builder();
	}

	/**
	 * Creates a RoleQuery of the {@link IdsQuery ids} {@code RoleQuery} variant.
	 */
	public static RoleQuery ids(Function<IdsQuery.Builder, ObjectBuilder<IdsQuery>> fn) {
		RoleQuery.Builder builder = new RoleQuery.Builder();
		builder.ids(fn.apply(new IdsQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link MatchQuery match} {@code RoleQuery} variant.
	 */
	public static MatchQuery.Builder match() {
		return new MatchQuery.Builder();
	}

	/**
	 * Creates a RoleQuery of the {@link MatchQuery match} {@code RoleQuery}
	 * variant.
	 */
	public static RoleQuery match(Function<MatchQuery.Builder, ObjectBuilder<MatchQuery>> fn) {
		RoleQuery.Builder builder = new RoleQuery.Builder();
		builder.match(fn.apply(new MatchQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link MatchAllQuery match_all} {@code RoleQuery}
	 * variant.
	 */
	public static MatchAllQuery.Builder matchAll() {
		return new MatchAllQuery.Builder();
	}

	/**
	 * Creates a RoleQuery of the {@link MatchAllQuery match_all} {@code RoleQuery}
	 * variant.
	 */
	public static RoleQuery matchAll(Function<MatchAllQuery.Builder, ObjectBuilder<MatchAllQuery>> fn) {
		RoleQuery.Builder builder = new RoleQuery.Builder();
		builder.matchAll(fn.apply(new MatchAllQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link PrefixQuery prefix} {@code RoleQuery}
	 * variant.
	 */
	public static PrefixQuery.Builder prefix() {
		return new PrefixQuery.Builder();
	}

	/**
	 * Creates a RoleQuery of the {@link PrefixQuery prefix} {@code RoleQuery}
	 * variant.
	 */
	public static RoleQuery prefix(Function<PrefixQuery.Builder, ObjectBuilder<PrefixQuery>> fn) {
		RoleQuery.Builder builder = new RoleQuery.Builder();
		builder.prefix(fn.apply(new PrefixQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link RangeQuery range} {@code RoleQuery} variant.
	 */
	public static RangeQuery.Builder range() {
		return new RangeQuery.Builder();
	}

	/**
	 * Creates a RoleQuery of the {@link RangeQuery range} {@code RoleQuery}
	 * variant.
	 */
	public static RoleQuery range(Function<RangeQuery.Builder, ObjectBuilder<RangeQuery>> fn) {
		RoleQuery.Builder builder = new RoleQuery.Builder();
		builder.range(fn.apply(new RangeQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SimpleQueryStringQuery simple_query_string}
	 * {@code RoleQuery} variant.
	 */
	public static SimpleQueryStringQuery.Builder simpleQueryString() {
		return new SimpleQueryStringQuery.Builder();
	}

	/**
	 * Creates a RoleQuery of the {@link SimpleQueryStringQuery simple_query_string}
	 * {@code RoleQuery} variant.
	 */
	public static RoleQuery simpleQueryString(
			Function<SimpleQueryStringQuery.Builder, ObjectBuilder<SimpleQueryStringQuery>> fn) {
		RoleQuery.Builder builder = new RoleQuery.Builder();
		builder.simpleQueryString(fn.apply(new SimpleQueryStringQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link TermQuery term} {@code RoleQuery} variant.
	 */
	public static TermQuery.Builder term() {
		return new TermQuery.Builder();
	}

	/**
	 * Creates a RoleQuery of the {@link TermQuery term} {@code RoleQuery} variant.
	 */
	public static RoleQuery term(Function<TermQuery.Builder, ObjectBuilder<TermQuery>> fn) {
		RoleQuery.Builder builder = new RoleQuery.Builder();
		builder.term(fn.apply(new TermQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link TermsQuery terms} {@code RoleQuery} variant.
	 */
	public static TermsQuery.Builder terms() {
		return new TermsQuery.Builder();
	}

	/**
	 * Creates a RoleQuery of the {@link TermsQuery terms} {@code RoleQuery}
	 * variant.
	 */
	public static RoleQuery terms(Function<TermsQuery.Builder, ObjectBuilder<TermsQuery>> fn) {
		RoleQuery.Builder builder = new RoleQuery.Builder();
		builder.terms(fn.apply(new TermsQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link WildcardQuery wildcard} {@code RoleQuery}
	 * variant.
	 */
	public static WildcardQuery.Builder wildcard() {
		return new WildcardQuery.Builder();
	}

	/**
	 * Creates a RoleQuery of the {@link WildcardQuery wildcard} {@code RoleQuery}
	 * variant.
	 */
	public static RoleQuery wildcard(Function<WildcardQuery.Builder, ObjectBuilder<WildcardQuery>> fn) {
		RoleQuery.Builder builder = new RoleQuery.Builder();
		builder.wildcard(fn.apply(new WildcardQuery.Builder()).build());
		return builder.build();
	}

}
