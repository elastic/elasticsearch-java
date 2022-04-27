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

import co.elastic.clients.elasticsearch._types.Script;
import co.elastic.clients.util.ObjectBuilder;
import java.util.function.Function;

/**
 * Builders for {@link IntervalsFilter} variants.
 */
public class IntervalsFilterBuilders {
	private IntervalsFilterBuilders() {
	}

	/**
	 * Creates a builder for the {@link Intervals after} {@code IntervalsFilter}
	 * variant.
	 */
	public static Intervals.Builder after() {
		return new Intervals.Builder();
	}

	/**
	 * Creates a IntervalsFilter of the {@link Intervals after}
	 * {@code IntervalsFilter} variant.
	 */
	public static IntervalsFilter after(Function<Intervals.Builder, ObjectBuilder<Intervals>> fn) {
		IntervalsFilter.Builder builder = new IntervalsFilter.Builder();
		builder.after(fn.apply(new Intervals.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link Intervals before} {@code IntervalsFilter}
	 * variant.
	 */
	public static Intervals.Builder before() {
		return new Intervals.Builder();
	}

	/**
	 * Creates a IntervalsFilter of the {@link Intervals before}
	 * {@code IntervalsFilter} variant.
	 */
	public static IntervalsFilter before(Function<Intervals.Builder, ObjectBuilder<Intervals>> fn) {
		IntervalsFilter.Builder builder = new IntervalsFilter.Builder();
		builder.before(fn.apply(new Intervals.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link Intervals contained_by}
	 * {@code IntervalsFilter} variant.
	 */
	public static Intervals.Builder containedBy() {
		return new Intervals.Builder();
	}

	/**
	 * Creates a IntervalsFilter of the {@link Intervals contained_by}
	 * {@code IntervalsFilter} variant.
	 */
	public static IntervalsFilter containedBy(Function<Intervals.Builder, ObjectBuilder<Intervals>> fn) {
		IntervalsFilter.Builder builder = new IntervalsFilter.Builder();
		builder.containedBy(fn.apply(new Intervals.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link Intervals containing}
	 * {@code IntervalsFilter} variant.
	 */
	public static Intervals.Builder containing() {
		return new Intervals.Builder();
	}

	/**
	 * Creates a IntervalsFilter of the {@link Intervals containing}
	 * {@code IntervalsFilter} variant.
	 */
	public static IntervalsFilter containing(Function<Intervals.Builder, ObjectBuilder<Intervals>> fn) {
		IntervalsFilter.Builder builder = new IntervalsFilter.Builder();
		builder.containing(fn.apply(new Intervals.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link Intervals not_contained_by}
	 * {@code IntervalsFilter} variant.
	 */
	public static Intervals.Builder notContainedBy() {
		return new Intervals.Builder();
	}

	/**
	 * Creates a IntervalsFilter of the {@link Intervals not_contained_by}
	 * {@code IntervalsFilter} variant.
	 */
	public static IntervalsFilter notContainedBy(Function<Intervals.Builder, ObjectBuilder<Intervals>> fn) {
		IntervalsFilter.Builder builder = new IntervalsFilter.Builder();
		builder.notContainedBy(fn.apply(new Intervals.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link Intervals not_containing}
	 * {@code IntervalsFilter} variant.
	 */
	public static Intervals.Builder notContaining() {
		return new Intervals.Builder();
	}

	/**
	 * Creates a IntervalsFilter of the {@link Intervals not_containing}
	 * {@code IntervalsFilter} variant.
	 */
	public static IntervalsFilter notContaining(Function<Intervals.Builder, ObjectBuilder<Intervals>> fn) {
		IntervalsFilter.Builder builder = new IntervalsFilter.Builder();
		builder.notContaining(fn.apply(new Intervals.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link Intervals not_overlapping}
	 * {@code IntervalsFilter} variant.
	 */
	public static Intervals.Builder notOverlapping() {
		return new Intervals.Builder();
	}

	/**
	 * Creates a IntervalsFilter of the {@link Intervals not_overlapping}
	 * {@code IntervalsFilter} variant.
	 */
	public static IntervalsFilter notOverlapping(Function<Intervals.Builder, ObjectBuilder<Intervals>> fn) {
		IntervalsFilter.Builder builder = new IntervalsFilter.Builder();
		builder.notOverlapping(fn.apply(new Intervals.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link Intervals overlapping}
	 * {@code IntervalsFilter} variant.
	 */
	public static Intervals.Builder overlapping() {
		return new Intervals.Builder();
	}

	/**
	 * Creates a IntervalsFilter of the {@link Intervals overlapping}
	 * {@code IntervalsFilter} variant.
	 */
	public static IntervalsFilter overlapping(Function<Intervals.Builder, ObjectBuilder<Intervals>> fn) {
		IntervalsFilter.Builder builder = new IntervalsFilter.Builder();
		builder.overlapping(fn.apply(new Intervals.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link Script script} {@code IntervalsFilter}
	 * variant.
	 */
	public static Script.Builder script() {
		return new Script.Builder();
	}

	/**
	 * Creates a IntervalsFilter of the {@link Script script}
	 * {@code IntervalsFilter} variant.
	 */
	public static IntervalsFilter script(Function<Script.Builder, ObjectBuilder<Script>> fn) {
		IntervalsFilter.Builder builder = new IntervalsFilter.Builder();
		builder.script(fn.apply(new Script.Builder()).build());
		return builder.build();
	}

}
