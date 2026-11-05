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

package co.elastic.clients.elasticsearch.security.query_service_accounts;

import co.elastic.clients.elasticsearch._types.query_dsl.BoolQuery;
import co.elastic.clients.elasticsearch._types.query_dsl.ExistsQuery;
import co.elastic.clients.elasticsearch._types.query_dsl.IdsQuery;
import co.elastic.clients.elasticsearch._types.query_dsl.MatchAllQuery;
import co.elastic.clients.elasticsearch._types.query_dsl.RangeQuery;
import co.elastic.clients.elasticsearch._types.query_dsl.SimpleQueryStringQuery;
import co.elastic.clients.elasticsearch._types.query_dsl.TermsQuery;
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
 * Builders for {@link ServiceAccountQuery} variants.
 * <p>
 * Variants <code>match</code>, <code>prefix</code>, <code>term</code>,
 * <code>wildcard</code> are not available here as they don't have a dedicated
 * class. Use {@link ServiceAccountQuery}'s builder for these.
 * 
 */
public class ServiceAccountQueryBuilders {
	private ServiceAccountQueryBuilders() {
	}

	/**
	 * Creates a builder for the {@link BoolQuery bool} {@code ServiceAccountQuery}
	 * variant.
	 */
	public static BoolQuery.Builder bool() {
		return new BoolQuery.Builder();
	}

	/**
	 * Creates a ServiceAccountQuery of the {@link BoolQuery bool}
	 * {@code ServiceAccountQuery} variant.
	 */
	public static ServiceAccountQuery bool(Function<BoolQuery.Builder, ObjectBuilder<BoolQuery>> fn) {
		ServiceAccountQuery.Builder builder = new ServiceAccountQuery.Builder();
		builder.bool(fn.apply(new BoolQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ExistsQuery exists}
	 * {@code ServiceAccountQuery} variant.
	 */
	public static ExistsQuery.Builder exists() {
		return new ExistsQuery.Builder();
	}

	/**
	 * Creates a ServiceAccountQuery of the {@link ExistsQuery exists}
	 * {@code ServiceAccountQuery} variant.
	 */
	public static ServiceAccountQuery exists(Function<ExistsQuery.Builder, ObjectBuilder<ExistsQuery>> fn) {
		ServiceAccountQuery.Builder builder = new ServiceAccountQuery.Builder();
		builder.exists(fn.apply(new ExistsQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link IdsQuery ids} {@code ServiceAccountQuery}
	 * variant.
	 */
	public static IdsQuery.Builder ids() {
		return new IdsQuery.Builder();
	}

	/**
	 * Creates a ServiceAccountQuery of the {@link IdsQuery ids}
	 * {@code ServiceAccountQuery} variant.
	 */
	public static ServiceAccountQuery ids(Function<IdsQuery.Builder, ObjectBuilder<IdsQuery>> fn) {
		ServiceAccountQuery.Builder builder = new ServiceAccountQuery.Builder();
		builder.ids(fn.apply(new IdsQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link MatchAllQuery match_all}
	 * {@code ServiceAccountQuery} variant.
	 */
	public static MatchAllQuery.Builder matchAll() {
		return new MatchAllQuery.Builder();
	}

	/**
	 * Creates a ServiceAccountQuery of the {@link MatchAllQuery match_all}
	 * {@code ServiceAccountQuery} variant.
	 */
	public static ServiceAccountQuery matchAll(Function<MatchAllQuery.Builder, ObjectBuilder<MatchAllQuery>> fn) {
		ServiceAccountQuery.Builder builder = new ServiceAccountQuery.Builder();
		builder.matchAll(fn.apply(new MatchAllQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link RangeQuery range}
	 * {@code ServiceAccountQuery} variant.
	 */
	public static RangeQuery.Builder range() {
		return new RangeQuery.Builder();
	}

	/**
	 * Creates a ServiceAccountQuery of the {@link RangeQuery range}
	 * {@code ServiceAccountQuery} variant.
	 */
	public static ServiceAccountQuery range(Function<RangeQuery.Builder, ObjectBuilder<RangeQuery>> fn) {
		ServiceAccountQuery.Builder builder = new ServiceAccountQuery.Builder();
		builder.range(fn.apply(new RangeQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SimpleQueryStringQuery simple_query_string}
	 * {@code ServiceAccountQuery} variant.
	 */
	public static SimpleQueryStringQuery.Builder simpleQueryString() {
		return new SimpleQueryStringQuery.Builder();
	}

	/**
	 * Creates a ServiceAccountQuery of the {@link SimpleQueryStringQuery
	 * simple_query_string} {@code ServiceAccountQuery} variant.
	 */
	public static ServiceAccountQuery simpleQueryString(
			Function<SimpleQueryStringQuery.Builder, ObjectBuilder<SimpleQueryStringQuery>> fn) {
		ServiceAccountQuery.Builder builder = new ServiceAccountQuery.Builder();
		builder.simpleQueryString(fn.apply(new SimpleQueryStringQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link TermsQuery terms}
	 * {@code ServiceAccountQuery} variant.
	 */
	public static TermsQuery.Builder terms() {
		return new TermsQuery.Builder();
	}

	/**
	 * Creates a ServiceAccountQuery of the {@link TermsQuery terms}
	 * {@code ServiceAccountQuery} variant.
	 */
	public static ServiceAccountQuery terms(Function<TermsQuery.Builder, ObjectBuilder<TermsQuery>> fn) {
		ServiceAccountQuery.Builder builder = new ServiceAccountQuery.Builder();
		builder.terms(fn.apply(new TermsQuery.Builder()).build());
		return builder.build();
	}

}
