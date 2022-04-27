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
 * Builders for {@link IntervalsQuery} variants.
 */
public class IntervalsQueryBuilders {
	private IntervalsQueryBuilders() {
	}

	/**
	 * Creates a builder for the {@link IntervalsAllOf all_of}
	 * {@code IntervalsQuery} variant.
	 */
	public static IntervalsAllOf.Builder allOf() {
		return new IntervalsAllOf.Builder();
	}

	/**
	 * Creates a IntervalsQuery of the {@link IntervalsAllOf all_of}
	 * {@code IntervalsQuery} variant.
	 */
	public static IntervalsQuery allOf(Function<IntervalsAllOf.Builder, ObjectBuilder<IntervalsAllOf>> fn) {
		IntervalsQuery.Builder builder = new IntervalsQuery.Builder();
		builder.allOf(fn.apply(new IntervalsAllOf.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link IntervalsAnyOf any_of}
	 * {@code IntervalsQuery} variant.
	 */
	public static IntervalsAnyOf.Builder anyOf() {
		return new IntervalsAnyOf.Builder();
	}

	/**
	 * Creates a IntervalsQuery of the {@link IntervalsAnyOf any_of}
	 * {@code IntervalsQuery} variant.
	 */
	public static IntervalsQuery anyOf(Function<IntervalsAnyOf.Builder, ObjectBuilder<IntervalsAnyOf>> fn) {
		IntervalsQuery.Builder builder = new IntervalsQuery.Builder();
		builder.anyOf(fn.apply(new IntervalsAnyOf.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link IntervalsFuzzy fuzzy} {@code IntervalsQuery}
	 * variant.
	 */
	public static IntervalsFuzzy.Builder fuzzy() {
		return new IntervalsFuzzy.Builder();
	}

	/**
	 * Creates a IntervalsQuery of the {@link IntervalsFuzzy fuzzy}
	 * {@code IntervalsQuery} variant.
	 */
	public static IntervalsQuery fuzzy(Function<IntervalsFuzzy.Builder, ObjectBuilder<IntervalsFuzzy>> fn) {
		IntervalsQuery.Builder builder = new IntervalsQuery.Builder();
		builder.fuzzy(fn.apply(new IntervalsFuzzy.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link IntervalsMatch match} {@code IntervalsQuery}
	 * variant.
	 */
	public static IntervalsMatch.Builder match() {
		return new IntervalsMatch.Builder();
	}

	/**
	 * Creates a IntervalsQuery of the {@link IntervalsMatch match}
	 * {@code IntervalsQuery} variant.
	 */
	public static IntervalsQuery match(Function<IntervalsMatch.Builder, ObjectBuilder<IntervalsMatch>> fn) {
		IntervalsQuery.Builder builder = new IntervalsQuery.Builder();
		builder.match(fn.apply(new IntervalsMatch.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link IntervalsPrefix prefix}
	 * {@code IntervalsQuery} variant.
	 */
	public static IntervalsPrefix.Builder prefix() {
		return new IntervalsPrefix.Builder();
	}

	/**
	 * Creates a IntervalsQuery of the {@link IntervalsPrefix prefix}
	 * {@code IntervalsQuery} variant.
	 */
	public static IntervalsQuery prefix(Function<IntervalsPrefix.Builder, ObjectBuilder<IntervalsPrefix>> fn) {
		IntervalsQuery.Builder builder = new IntervalsQuery.Builder();
		builder.prefix(fn.apply(new IntervalsPrefix.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link IntervalsWildcard wildcard}
	 * {@code IntervalsQuery} variant.
	 */
	public static IntervalsWildcard.Builder wildcard() {
		return new IntervalsWildcard.Builder();
	}

	/**
	 * Creates a IntervalsQuery of the {@link IntervalsWildcard wildcard}
	 * {@code IntervalsQuery} variant.
	 */
	public static IntervalsQuery wildcard(Function<IntervalsWildcard.Builder, ObjectBuilder<IntervalsWildcard>> fn) {
		IntervalsQuery.Builder builder = new IntervalsQuery.Builder();
		builder.wildcard(fn.apply(new IntervalsWildcard.Builder()).build());
		return builder.build();
	}

}
