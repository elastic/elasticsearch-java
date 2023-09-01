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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch._types.query_dsl;

import co.elastic.clients.util.ObjectBuilder;
import java.util.function.Function;

/**
 * Builders for {@link SpanQuery} variants.
 */
public class SpanQueryBuilders {
	private SpanQueryBuilders() {
	}

	/**
	 * Creates a builder for the {@link SpanContainingQuery span_containing}
	 * {@code SpanQuery} variant.
	 */
	public static SpanContainingQuery.Builder spanContaining() {
		return new SpanContainingQuery.Builder();
	}

	/**
	 * Creates a SpanQuery of the {@link SpanContainingQuery span_containing}
	 * {@code SpanQuery} variant.
	 */
	public static SpanQuery spanContaining(
			Function<SpanContainingQuery.Builder, ObjectBuilder<SpanContainingQuery>> fn) {
		SpanQuery.Builder builder = new SpanQuery.Builder();
		builder.spanContaining(fn.apply(new SpanContainingQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SpanFieldMaskingQuery field_masking_span}
	 * {@code SpanQuery} variant.
	 */
	public static SpanFieldMaskingQuery.Builder fieldMaskingSpan() {
		return new SpanFieldMaskingQuery.Builder();
	}

	/**
	 * Creates a SpanQuery of the {@link SpanFieldMaskingQuery field_masking_span}
	 * {@code SpanQuery} variant.
	 */
	public static SpanQuery fieldMaskingSpan(
			Function<SpanFieldMaskingQuery.Builder, ObjectBuilder<SpanFieldMaskingQuery>> fn) {
		SpanQuery.Builder builder = new SpanQuery.Builder();
		builder.fieldMaskingSpan(fn.apply(new SpanFieldMaskingQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SpanFirstQuery span_first} {@code SpanQuery}
	 * variant.
	 */
	public static SpanFirstQuery.Builder spanFirst() {
		return new SpanFirstQuery.Builder();
	}

	/**
	 * Creates a SpanQuery of the {@link SpanFirstQuery span_first}
	 * {@code SpanQuery} variant.
	 */
	public static SpanQuery spanFirst(Function<SpanFirstQuery.Builder, ObjectBuilder<SpanFirstQuery>> fn) {
		SpanQuery.Builder builder = new SpanQuery.Builder();
		builder.spanFirst(fn.apply(new SpanFirstQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SpanGapQuery span_gap} {@code SpanQuery}
	 * variant.
	 */
	public static SpanGapQuery.Builder spanGap() {
		return new SpanGapQuery.Builder();
	}

	/**
	 * Creates a SpanQuery of the {@link SpanGapQuery span_gap} {@code SpanQuery}
	 * variant.
	 */
	public static SpanQuery spanGap(Function<SpanGapQuery.Builder, ObjectBuilder<SpanGapQuery>> fn) {
		SpanQuery.Builder builder = new SpanQuery.Builder();
		builder.spanGap(fn.apply(new SpanGapQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SpanMultiTermQuery span_multi}
	 * {@code SpanQuery} variant.
	 */
	public static SpanMultiTermQuery.Builder spanMulti() {
		return new SpanMultiTermQuery.Builder();
	}

	/**
	 * Creates a SpanQuery of the {@link SpanMultiTermQuery span_multi}
	 * {@code SpanQuery} variant.
	 */
	public static SpanQuery spanMulti(Function<SpanMultiTermQuery.Builder, ObjectBuilder<SpanMultiTermQuery>> fn) {
		SpanQuery.Builder builder = new SpanQuery.Builder();
		builder.spanMulti(fn.apply(new SpanMultiTermQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SpanNearQuery span_near} {@code SpanQuery}
	 * variant.
	 */
	public static SpanNearQuery.Builder spanNear() {
		return new SpanNearQuery.Builder();
	}

	/**
	 * Creates a SpanQuery of the {@link SpanNearQuery span_near} {@code SpanQuery}
	 * variant.
	 */
	public static SpanQuery spanNear(Function<SpanNearQuery.Builder, ObjectBuilder<SpanNearQuery>> fn) {
		SpanQuery.Builder builder = new SpanQuery.Builder();
		builder.spanNear(fn.apply(new SpanNearQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SpanNotQuery span_not} {@code SpanQuery}
	 * variant.
	 */
	public static SpanNotQuery.Builder spanNot() {
		return new SpanNotQuery.Builder();
	}

	/**
	 * Creates a SpanQuery of the {@link SpanNotQuery span_not} {@code SpanQuery}
	 * variant.
	 */
	public static SpanQuery spanNot(Function<SpanNotQuery.Builder, ObjectBuilder<SpanNotQuery>> fn) {
		SpanQuery.Builder builder = new SpanQuery.Builder();
		builder.spanNot(fn.apply(new SpanNotQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SpanOrQuery span_or} {@code SpanQuery}
	 * variant.
	 */
	public static SpanOrQuery.Builder spanOr() {
		return new SpanOrQuery.Builder();
	}

	/**
	 * Creates a SpanQuery of the {@link SpanOrQuery span_or} {@code SpanQuery}
	 * variant.
	 */
	public static SpanQuery spanOr(Function<SpanOrQuery.Builder, ObjectBuilder<SpanOrQuery>> fn) {
		SpanQuery.Builder builder = new SpanQuery.Builder();
		builder.spanOr(fn.apply(new SpanOrQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SpanTermQuery span_term} {@code SpanQuery}
	 * variant.
	 */
	public static SpanTermQuery.Builder spanTerm() {
		return new SpanTermQuery.Builder();
	}

	/**
	 * Creates a SpanQuery of the {@link SpanTermQuery span_term} {@code SpanQuery}
	 * variant.
	 */
	public static SpanQuery spanTerm(Function<SpanTermQuery.Builder, ObjectBuilder<SpanTermQuery>> fn) {
		SpanQuery.Builder builder = new SpanQuery.Builder();
		builder.spanTerm(fn.apply(new SpanTermQuery.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SpanWithinQuery span_within}
	 * {@code SpanQuery} variant.
	 */
	public static SpanWithinQuery.Builder spanWithin() {
		return new SpanWithinQuery.Builder();
	}

	/**
	 * Creates a SpanQuery of the {@link SpanWithinQuery span_within}
	 * {@code SpanQuery} variant.
	 */
	public static SpanQuery spanWithin(Function<SpanWithinQuery.Builder, ObjectBuilder<SpanWithinQuery>> fn) {
		SpanQuery.Builder builder = new SpanQuery.Builder();
		builder.spanWithin(fn.apply(new SpanWithinQuery.Builder()).build());
		return builder.build();
	}

}
