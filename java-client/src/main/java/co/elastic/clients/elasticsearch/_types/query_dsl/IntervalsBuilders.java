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
 * Builders for {@link Intervals} variants.
 */
public class IntervalsBuilders {
	private IntervalsBuilders() {
	}

	/**
	 * Creates a builder for the {@link IntervalsAllOf all_of} {@code Intervals}
	 * variant.
	 */
	public static IntervalsAllOf.Builder allOf() {
		return new IntervalsAllOf.Builder();
	}

	/**
	 * Creates a Intervals of the {@link IntervalsAllOf all_of} {@code Intervals}
	 * variant.
	 */
	public static Intervals allOf(Function<IntervalsAllOf.Builder, ObjectBuilder<IntervalsAllOf>> fn) {
		Intervals.Builder builder = new Intervals.Builder();
		builder.allOf(fn.apply(new IntervalsAllOf.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link IntervalsAnyOf any_of} {@code Intervals}
	 * variant.
	 */
	public static IntervalsAnyOf.Builder anyOf() {
		return new IntervalsAnyOf.Builder();
	}

	/**
	 * Creates a Intervals of the {@link IntervalsAnyOf any_of} {@code Intervals}
	 * variant.
	 */
	public static Intervals anyOf(Function<IntervalsAnyOf.Builder, ObjectBuilder<IntervalsAnyOf>> fn) {
		Intervals.Builder builder = new Intervals.Builder();
		builder.anyOf(fn.apply(new IntervalsAnyOf.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link IntervalsFuzzy fuzzy} {@code Intervals}
	 * variant.
	 */
	public static IntervalsFuzzy.Builder fuzzy() {
		return new IntervalsFuzzy.Builder();
	}

	/**
	 * Creates a Intervals of the {@link IntervalsFuzzy fuzzy} {@code Intervals}
	 * variant.
	 */
	public static Intervals fuzzy(Function<IntervalsFuzzy.Builder, ObjectBuilder<IntervalsFuzzy>> fn) {
		Intervals.Builder builder = new Intervals.Builder();
		builder.fuzzy(fn.apply(new IntervalsFuzzy.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link IntervalsMatch match} {@code Intervals}
	 * variant.
	 */
	public static IntervalsMatch.Builder match() {
		return new IntervalsMatch.Builder();
	}

	/**
	 * Creates a Intervals of the {@link IntervalsMatch match} {@code Intervals}
	 * variant.
	 */
	public static Intervals match(Function<IntervalsMatch.Builder, ObjectBuilder<IntervalsMatch>> fn) {
		Intervals.Builder builder = new Intervals.Builder();
		builder.match(fn.apply(new IntervalsMatch.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link IntervalsPrefix prefix} {@code Intervals}
	 * variant.
	 */
	public static IntervalsPrefix.Builder prefix() {
		return new IntervalsPrefix.Builder();
	}

	/**
	 * Creates a Intervals of the {@link IntervalsPrefix prefix} {@code Intervals}
	 * variant.
	 */
	public static Intervals prefix(Function<IntervalsPrefix.Builder, ObjectBuilder<IntervalsPrefix>> fn) {
		Intervals.Builder builder = new Intervals.Builder();
		builder.prefix(fn.apply(new IntervalsPrefix.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link IntervalsWildcard wildcard}
	 * {@code Intervals} variant.
	 */
	public static IntervalsWildcard.Builder wildcard() {
		return new IntervalsWildcard.Builder();
	}

	/**
	 * Creates a Intervals of the {@link IntervalsWildcard wildcard}
	 * {@code Intervals} variant.
	 */
	public static Intervals wildcard(Function<IntervalsWildcard.Builder, ObjectBuilder<IntervalsWildcard>> fn) {
		Intervals.Builder builder = new Intervals.Builder();
		builder.wildcard(fn.apply(new IntervalsWildcard.Builder()).build());
		return builder.build();
	}

}
