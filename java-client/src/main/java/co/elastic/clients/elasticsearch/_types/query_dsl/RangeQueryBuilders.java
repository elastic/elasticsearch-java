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
 * Builders for {@link RangeQuery} variants.
 */
public class RangeQueryBuilders {
	private RangeQueryBuilders() {
	}

	/**
	 * Creates a builder for the {@link DateRangeQuery date} {@code RangeQuery}
	 * variant.
	 */
	public static DateRangeQuery.Builder date() {
		return new DateRangeQuery.Builder();
	}

	/**
	 * Creates a RangeQuery of the {@link DateRangeQuery date} {@code RangeQuery}
	 * variant.
	 */
	public static RangeQuery date(Function<DateRangeQuery.Builder, ObjectBuilder<DateRangeQuery>> fn) {
		RangeQuery.Builder builder = new RangeQuery.Builder();
		builder.date(fn.apply(new DateRangeQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link NumberRangeQuery number} {@code RangeQuery}
	 * variant.
	 */
	public static NumberRangeQuery.Builder number() {
		return new NumberRangeQuery.Builder();
	}

	/**
	 * Creates a RangeQuery of the {@link NumberRangeQuery number}
	 * {@code RangeQuery} variant.
	 */
	public static RangeQuery number(Function<NumberRangeQuery.Builder, ObjectBuilder<NumberRangeQuery>> fn) {
		RangeQuery.Builder builder = new RangeQuery.Builder();
		builder.number(fn.apply(new NumberRangeQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link TermRangeQuery term} {@code RangeQuery}
	 * variant.
	 */
	public static TermRangeQuery.Builder term() {
		return new TermRangeQuery.Builder();
	}

	/**
	 * Creates a RangeQuery of the {@link TermRangeQuery term} {@code RangeQuery}
	 * variant.
	 */
	public static RangeQuery term(Function<TermRangeQuery.Builder, ObjectBuilder<TermRangeQuery>> fn) {
		RangeQuery.Builder builder = new RangeQuery.Builder();
		builder.term(fn.apply(new TermRangeQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link UntypedRangeQuery untyped}
	 * {@code RangeQuery} variant.
	 */
	public static UntypedRangeQuery.Builder untyped() {
		return new UntypedRangeQuery.Builder();
	}

	/**
	 * Creates a RangeQuery of the {@link UntypedRangeQuery untyped}
	 * {@code RangeQuery} variant.
	 */
	public static RangeQuery untyped(Function<UntypedRangeQuery.Builder, ObjectBuilder<UntypedRangeQuery>> fn) {
		RangeQuery.Builder builder = new RangeQuery.Builder();
		builder.untyped(fn.apply(new UntypedRangeQuery.Builder()).build());
		return builder.build();
	}

}
