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

import co.elastic.clients.elasticsearch._types.aggregations.CardinalityAggregation;
import co.elastic.clients.elasticsearch._types.aggregations.CompositeAggregation;
import co.elastic.clients.elasticsearch._types.aggregations.DateRangeAggregation;
import co.elastic.clients.elasticsearch._types.aggregations.MissingAggregation;
import co.elastic.clients.elasticsearch._types.aggregations.RangeAggregation;
import co.elastic.clients.elasticsearch._types.aggregations.TermsAggregation;
import co.elastic.clients.elasticsearch._types.aggregations.ValueCountAggregation;
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
 * Builders for {@link ApiKeyAggregation} variants.
 */
public class ApiKeyAggregationBuilders {
	private ApiKeyAggregationBuilders() {
	}

	/**
	 * Creates a builder for the {@link CardinalityAggregation cardinality}
	 * {@code ApiKeyAggregation} variant.
	 */
	public static CardinalityAggregation.Builder cardinality() {
		return new CardinalityAggregation.Builder();
	}

	/**
	 * Creates a ApiKeyAggregation of the {@link CardinalityAggregation cardinality}
	 * {@code ApiKeyAggregation} variant.
	 */
	public static ApiKeyAggregation cardinality(
			Function<CardinalityAggregation.Builder, ObjectBuilder<CardinalityAggregation>> fn) {
		ApiKeyAggregation.Builder builder = new ApiKeyAggregation.Builder();
		builder.cardinality(fn.apply(new CardinalityAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link CompositeAggregation composite}
	 * {@code ApiKeyAggregation} variant.
	 */
	public static CompositeAggregation.Builder composite() {
		return new CompositeAggregation.Builder();
	}

	/**
	 * Creates a ApiKeyAggregation of the {@link CompositeAggregation composite}
	 * {@code ApiKeyAggregation} variant.
	 */
	public static ApiKeyAggregation composite(
			Function<CompositeAggregation.Builder, ObjectBuilder<CompositeAggregation>> fn) {
		ApiKeyAggregation.Builder builder = new ApiKeyAggregation.Builder();
		builder.composite(fn.apply(new CompositeAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link DateRangeAggregation date_range}
	 * {@code ApiKeyAggregation} variant.
	 */
	public static DateRangeAggregation.Builder dateRange() {
		return new DateRangeAggregation.Builder();
	}

	/**
	 * Creates a ApiKeyAggregation of the {@link DateRangeAggregation date_range}
	 * {@code ApiKeyAggregation} variant.
	 */
	public static ApiKeyAggregation dateRange(
			Function<DateRangeAggregation.Builder, ObjectBuilder<DateRangeAggregation>> fn) {
		ApiKeyAggregation.Builder builder = new ApiKeyAggregation.Builder();
		builder.dateRange(fn.apply(new DateRangeAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ApiKeyQuery filter}
	 * {@code ApiKeyAggregation} variant.
	 */
	public static ApiKeyQuery.Builder filter() {
		return new ApiKeyQuery.Builder();
	}

	/**
	 * Creates a ApiKeyAggregation of the {@link ApiKeyQuery filter}
	 * {@code ApiKeyAggregation} variant.
	 */
	public static ApiKeyAggregation filter(Function<ApiKeyQuery.Builder, ObjectBuilder<ApiKeyQuery>> fn) {
		ApiKeyAggregation.Builder builder = new ApiKeyAggregation.Builder();
		builder.filter(fn.apply(new ApiKeyQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ApiKeyFiltersAggregation filters}
	 * {@code ApiKeyAggregation} variant.
	 */
	public static ApiKeyFiltersAggregation.Builder filters() {
		return new ApiKeyFiltersAggregation.Builder();
	}

	/**
	 * Creates a ApiKeyAggregation of the {@link ApiKeyFiltersAggregation filters}
	 * {@code ApiKeyAggregation} variant.
	 */
	public static ApiKeyAggregation filters(
			Function<ApiKeyFiltersAggregation.Builder, ObjectBuilder<ApiKeyFiltersAggregation>> fn) {
		ApiKeyAggregation.Builder builder = new ApiKeyAggregation.Builder();
		builder.filters(fn.apply(new ApiKeyFiltersAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link MissingAggregation missing}
	 * {@code ApiKeyAggregation} variant.
	 */
	public static MissingAggregation.Builder missing() {
		return new MissingAggregation.Builder();
	}

	/**
	 * Creates a ApiKeyAggregation of the {@link MissingAggregation missing}
	 * {@code ApiKeyAggregation} variant.
	 */
	public static ApiKeyAggregation missing(
			Function<MissingAggregation.Builder, ObjectBuilder<MissingAggregation>> fn) {
		ApiKeyAggregation.Builder builder = new ApiKeyAggregation.Builder();
		builder.missing(fn.apply(new MissingAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link RangeAggregation range}
	 * {@code ApiKeyAggregation} variant.
	 */
	public static RangeAggregation.Builder range() {
		return new RangeAggregation.Builder();
	}

	/**
	 * Creates a ApiKeyAggregation of the {@link RangeAggregation range}
	 * {@code ApiKeyAggregation} variant.
	 */
	public static ApiKeyAggregation range(Function<RangeAggregation.Builder, ObjectBuilder<RangeAggregation>> fn) {
		ApiKeyAggregation.Builder builder = new ApiKeyAggregation.Builder();
		builder.range(fn.apply(new RangeAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link TermsAggregation terms}
	 * {@code ApiKeyAggregation} variant.
	 */
	public static TermsAggregation.Builder terms() {
		return new TermsAggregation.Builder();
	}

	/**
	 * Creates a ApiKeyAggregation of the {@link TermsAggregation terms}
	 * {@code ApiKeyAggregation} variant.
	 */
	public static ApiKeyAggregation terms(Function<TermsAggregation.Builder, ObjectBuilder<TermsAggregation>> fn) {
		ApiKeyAggregation.Builder builder = new ApiKeyAggregation.Builder();
		builder.terms(fn.apply(new TermsAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ValueCountAggregation value_count}
	 * {@code ApiKeyAggregation} variant.
	 */
	public static ValueCountAggregation.Builder valueCount() {
		return new ValueCountAggregation.Builder();
	}

	/**
	 * Creates a ApiKeyAggregation of the {@link ValueCountAggregation value_count}
	 * {@code ApiKeyAggregation} variant.
	 */
	public static ApiKeyAggregation valueCount(
			Function<ValueCountAggregation.Builder, ObjectBuilder<ValueCountAggregation>> fn) {
		ApiKeyAggregation.Builder builder = new ApiKeyAggregation.Builder();
		builder.valueCount(fn.apply(new ValueCountAggregation.Builder()).build());
		return builder.build();
	}

}
