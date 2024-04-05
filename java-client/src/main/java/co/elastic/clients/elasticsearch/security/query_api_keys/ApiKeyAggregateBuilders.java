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

import co.elastic.clients.elasticsearch._types.aggregations.CardinalityAggregate;
import co.elastic.clients.elasticsearch._types.aggregations.CompositeAggregate;
import co.elastic.clients.elasticsearch._types.aggregations.DateRangeAggregate;
import co.elastic.clients.elasticsearch._types.aggregations.DoubleTermsAggregate;
import co.elastic.clients.elasticsearch._types.aggregations.FilterAggregate;
import co.elastic.clients.elasticsearch._types.aggregations.FiltersAggregate;
import co.elastic.clients.elasticsearch._types.aggregations.LongTermsAggregate;
import co.elastic.clients.elasticsearch._types.aggregations.MissingAggregate;
import co.elastic.clients.elasticsearch._types.aggregations.MultiTermsAggregate;
import co.elastic.clients.elasticsearch._types.aggregations.RangeAggregate;
import co.elastic.clients.elasticsearch._types.aggregations.StringTermsAggregate;
import co.elastic.clients.elasticsearch._types.aggregations.UnmappedTermsAggregate;
import co.elastic.clients.elasticsearch._types.aggregations.ValueCountAggregate;
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
 * Builders for {@link ApiKeyAggregate} variants.
 */
public class ApiKeyAggregateBuilders {
	private ApiKeyAggregateBuilders() {
	}

	/**
	 * Creates a builder for the {@link CardinalityAggregate cardinality}
	 * {@code ApiKeyAggregate} variant.
	 */
	public static CardinalityAggregate.Builder cardinality() {
		return new CardinalityAggregate.Builder();
	}

	/**
	 * Creates a ApiKeyAggregate of the {@link CardinalityAggregate cardinality}
	 * {@code ApiKeyAggregate} variant.
	 */
	public static ApiKeyAggregate cardinality(
			Function<CardinalityAggregate.Builder, ObjectBuilder<CardinalityAggregate>> fn) {
		ApiKeyAggregate.Builder builder = new ApiKeyAggregate.Builder();
		builder.cardinality(fn.apply(new CardinalityAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link CompositeAggregate composite}
	 * {@code ApiKeyAggregate} variant.
	 */
	public static CompositeAggregate.Builder composite() {
		return new CompositeAggregate.Builder();
	}

	/**
	 * Creates a ApiKeyAggregate of the {@link CompositeAggregate composite}
	 * {@code ApiKeyAggregate} variant.
	 */
	public static ApiKeyAggregate composite(
			Function<CompositeAggregate.Builder, ObjectBuilder<CompositeAggregate>> fn) {
		ApiKeyAggregate.Builder builder = new ApiKeyAggregate.Builder();
		builder.composite(fn.apply(new CompositeAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link DateRangeAggregate date_range}
	 * {@code ApiKeyAggregate} variant.
	 */
	public static DateRangeAggregate.Builder dateRange() {
		return new DateRangeAggregate.Builder();
	}

	/**
	 * Creates a ApiKeyAggregate of the {@link DateRangeAggregate date_range}
	 * {@code ApiKeyAggregate} variant.
	 */
	public static ApiKeyAggregate dateRange(
			Function<DateRangeAggregate.Builder, ObjectBuilder<DateRangeAggregate>> fn) {
		ApiKeyAggregate.Builder builder = new ApiKeyAggregate.Builder();
		builder.dateRange(fn.apply(new DateRangeAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link DoubleTermsAggregate dterms}
	 * {@code ApiKeyAggregate} variant.
	 */
	public static DoubleTermsAggregate.Builder dterms() {
		return new DoubleTermsAggregate.Builder();
	}

	/**
	 * Creates a ApiKeyAggregate of the {@link DoubleTermsAggregate dterms}
	 * {@code ApiKeyAggregate} variant.
	 */
	public static ApiKeyAggregate dterms(
			Function<DoubleTermsAggregate.Builder, ObjectBuilder<DoubleTermsAggregate>> fn) {
		ApiKeyAggregate.Builder builder = new ApiKeyAggregate.Builder();
		builder.dterms(fn.apply(new DoubleTermsAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link FilterAggregate filter}
	 * {@code ApiKeyAggregate} variant.
	 */
	public static FilterAggregate.Builder filter() {
		return new FilterAggregate.Builder();
	}

	/**
	 * Creates a ApiKeyAggregate of the {@link FilterAggregate filter}
	 * {@code ApiKeyAggregate} variant.
	 */
	public static ApiKeyAggregate filter(Function<FilterAggregate.Builder, ObjectBuilder<FilterAggregate>> fn) {
		ApiKeyAggregate.Builder builder = new ApiKeyAggregate.Builder();
		builder.filter(fn.apply(new FilterAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link FiltersAggregate filters}
	 * {@code ApiKeyAggregate} variant.
	 */
	public static FiltersAggregate.Builder filters() {
		return new FiltersAggregate.Builder();
	}

	/**
	 * Creates a ApiKeyAggregate of the {@link FiltersAggregate filters}
	 * {@code ApiKeyAggregate} variant.
	 */
	public static ApiKeyAggregate filters(Function<FiltersAggregate.Builder, ObjectBuilder<FiltersAggregate>> fn) {
		ApiKeyAggregate.Builder builder = new ApiKeyAggregate.Builder();
		builder.filters(fn.apply(new FiltersAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link LongTermsAggregate lterms}
	 * {@code ApiKeyAggregate} variant.
	 */
	public static LongTermsAggregate.Builder lterms() {
		return new LongTermsAggregate.Builder();
	}

	/**
	 * Creates a ApiKeyAggregate of the {@link LongTermsAggregate lterms}
	 * {@code ApiKeyAggregate} variant.
	 */
	public static ApiKeyAggregate lterms(Function<LongTermsAggregate.Builder, ObjectBuilder<LongTermsAggregate>> fn) {
		ApiKeyAggregate.Builder builder = new ApiKeyAggregate.Builder();
		builder.lterms(fn.apply(new LongTermsAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link MissingAggregate missing}
	 * {@code ApiKeyAggregate} variant.
	 */
	public static MissingAggregate.Builder missing() {
		return new MissingAggregate.Builder();
	}

	/**
	 * Creates a ApiKeyAggregate of the {@link MissingAggregate missing}
	 * {@code ApiKeyAggregate} variant.
	 */
	public static ApiKeyAggregate missing(Function<MissingAggregate.Builder, ObjectBuilder<MissingAggregate>> fn) {
		ApiKeyAggregate.Builder builder = new ApiKeyAggregate.Builder();
		builder.missing(fn.apply(new MissingAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link MultiTermsAggregate multi_terms}
	 * {@code ApiKeyAggregate} variant.
	 */
	public static MultiTermsAggregate.Builder multiTerms() {
		return new MultiTermsAggregate.Builder();
	}

	/**
	 * Creates a ApiKeyAggregate of the {@link MultiTermsAggregate multi_terms}
	 * {@code ApiKeyAggregate} variant.
	 */
	public static ApiKeyAggregate multiTerms(
			Function<MultiTermsAggregate.Builder, ObjectBuilder<MultiTermsAggregate>> fn) {
		ApiKeyAggregate.Builder builder = new ApiKeyAggregate.Builder();
		builder.multiTerms(fn.apply(new MultiTermsAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link RangeAggregate range}
	 * {@code ApiKeyAggregate} variant.
	 */
	public static RangeAggregate.Builder range() {
		return new RangeAggregate.Builder();
	}

	/**
	 * Creates a ApiKeyAggregate of the {@link RangeAggregate range}
	 * {@code ApiKeyAggregate} variant.
	 */
	public static ApiKeyAggregate range(Function<RangeAggregate.Builder, ObjectBuilder<RangeAggregate>> fn) {
		ApiKeyAggregate.Builder builder = new ApiKeyAggregate.Builder();
		builder.range(fn.apply(new RangeAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link StringTermsAggregate sterms}
	 * {@code ApiKeyAggregate} variant.
	 */
	public static StringTermsAggregate.Builder sterms() {
		return new StringTermsAggregate.Builder();
	}

	/**
	 * Creates a ApiKeyAggregate of the {@link StringTermsAggregate sterms}
	 * {@code ApiKeyAggregate} variant.
	 */
	public static ApiKeyAggregate sterms(
			Function<StringTermsAggregate.Builder, ObjectBuilder<StringTermsAggregate>> fn) {
		ApiKeyAggregate.Builder builder = new ApiKeyAggregate.Builder();
		builder.sterms(fn.apply(new StringTermsAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link UnmappedTermsAggregate umterms}
	 * {@code ApiKeyAggregate} variant.
	 */
	public static UnmappedTermsAggregate.Builder umterms() {
		return new UnmappedTermsAggregate.Builder();
	}

	/**
	 * Creates a ApiKeyAggregate of the {@link UnmappedTermsAggregate umterms}
	 * {@code ApiKeyAggregate} variant.
	 */
	public static ApiKeyAggregate umterms(
			Function<UnmappedTermsAggregate.Builder, ObjectBuilder<UnmappedTermsAggregate>> fn) {
		ApiKeyAggregate.Builder builder = new ApiKeyAggregate.Builder();
		builder.umterms(fn.apply(new UnmappedTermsAggregate.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ValueCountAggregate value_count}
	 * {@code ApiKeyAggregate} variant.
	 */
	public static ValueCountAggregate.Builder valueCount() {
		return new ValueCountAggregate.Builder();
	}

	/**
	 * Creates a ApiKeyAggregate of the {@link ValueCountAggregate value_count}
	 * {@code ApiKeyAggregate} variant.
	 */
	public static ApiKeyAggregate valueCount(
			Function<ValueCountAggregate.Builder, ObjectBuilder<ValueCountAggregate>> fn) {
		ApiKeyAggregate.Builder builder = new ApiKeyAggregate.Builder();
		builder.valueCount(fn.apply(new ValueCountAggregate.Builder()).build());
		return builder.build();
	}

}
