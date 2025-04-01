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

package co.elastic.clients.elasticsearch._types.aggregations;

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
 * Builders for {@link AggregationRange} variants.
 */
public class AggregationRangeBuilders {
	private AggregationRangeBuilders() {
	}

	/**
	 * Creates a builder for the {@link DateAggregationRange date}
	 * {@code AggregationRange} variant.
	 */
	public static DateAggregationRange.Builder date() {
		return new DateAggregationRange.Builder();
	}

	/**
	 * Creates a AggregationRange of the {@link DateAggregationRange date}
	 * {@code AggregationRange} variant.
	 */
	public static AggregationRange date(
			Function<DateAggregationRange.Builder, ObjectBuilder<DateAggregationRange>> fn) {
		AggregationRange.Builder builder = new AggregationRange.Builder();
		builder.date(fn.apply(new DateAggregationRange.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link NumberAggregationRange number}
	 * {@code AggregationRange} variant.
	 */
	public static NumberAggregationRange.Builder number() {
		return new NumberAggregationRange.Builder();
	}

	/**
	 * Creates a AggregationRange of the {@link NumberAggregationRange number}
	 * {@code AggregationRange} variant.
	 */
	public static AggregationRange number(
			Function<NumberAggregationRange.Builder, ObjectBuilder<NumberAggregationRange>> fn) {
		AggregationRange.Builder builder = new AggregationRange.Builder();
		builder.number(fn.apply(new NumberAggregationRange.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link TermAggregationRange term}
	 * {@code AggregationRange} variant.
	 */
	public static TermAggregationRange.Builder term() {
		return new TermAggregationRange.Builder();
	}

	/**
	 * Creates a AggregationRange of the {@link TermAggregationRange term}
	 * {@code AggregationRange} variant.
	 */
	public static AggregationRange term(
			Function<TermAggregationRange.Builder, ObjectBuilder<TermAggregationRange>> fn) {
		AggregationRange.Builder builder = new AggregationRange.Builder();
		builder.term(fn.apply(new TermAggregationRange.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link UntypedAggregationRange untyped}
	 * {@code AggregationRange} variant.
	 */
	public static UntypedAggregationRange.Builder untyped() {
		return new UntypedAggregationRange.Builder();
	}

	/**
	 * Creates a AggregationRange of the {@link UntypedAggregationRange untyped}
	 * {@code AggregationRange} variant.
	 */
	public static AggregationRange untyped(
			Function<UntypedAggregationRange.Builder, ObjectBuilder<UntypedAggregationRange>> fn) {
		AggregationRange.Builder builder = new AggregationRange.Builder();
		builder.untyped(fn.apply(new UntypedAggregationRange.Builder()).build());
		return builder.build();
	}

}
