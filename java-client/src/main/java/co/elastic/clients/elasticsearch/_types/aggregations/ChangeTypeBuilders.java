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
 * Builders for {@link ChangeType} variants.
 */
public class ChangeTypeBuilders {
	private ChangeTypeBuilders() {
	}

	/**
	 * Creates a builder for the {@link Dip dip} {@code ChangeType} variant.
	 */
	public static Dip.Builder dip() {
		return new Dip.Builder();
	}

	/**
	 * Creates a ChangeType of the {@link Dip dip} {@code ChangeType} variant.
	 */
	public static ChangeType dip(Function<Dip.Builder, ObjectBuilder<Dip>> fn) {
		ChangeType.Builder builder = new ChangeType.Builder();
		builder.dip(fn.apply(new Dip.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link DistributionChange distribution_change}
	 * {@code ChangeType} variant.
	 */
	public static DistributionChange.Builder distributionChange() {
		return new DistributionChange.Builder();
	}

	/**
	 * Creates a ChangeType of the {@link DistributionChange distribution_change}
	 * {@code ChangeType} variant.
	 */
	public static ChangeType distributionChange(
			Function<DistributionChange.Builder, ObjectBuilder<DistributionChange>> fn) {
		ChangeType.Builder builder = new ChangeType.Builder();
		builder.distributionChange(fn.apply(new DistributionChange.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link Indeterminable indeterminable}
	 * {@code ChangeType} variant.
	 */
	public static Indeterminable.Builder indeterminable() {
		return new Indeterminable.Builder();
	}

	/**
	 * Creates a ChangeType of the {@link Indeterminable indeterminable}
	 * {@code ChangeType} variant.
	 */
	public static ChangeType indeterminable(Function<Indeterminable.Builder, ObjectBuilder<Indeterminable>> fn) {
		ChangeType.Builder builder = new ChangeType.Builder();
		builder.indeterminable(fn.apply(new Indeterminable.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link NonStationary non_stationary}
	 * {@code ChangeType} variant.
	 */
	public static NonStationary.Builder nonStationary() {
		return new NonStationary.Builder();
	}

	/**
	 * Creates a ChangeType of the {@link NonStationary non_stationary}
	 * {@code ChangeType} variant.
	 */
	public static ChangeType nonStationary(Function<NonStationary.Builder, ObjectBuilder<NonStationary>> fn) {
		ChangeType.Builder builder = new ChangeType.Builder();
		builder.nonStationary(fn.apply(new NonStationary.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link Spike spike} {@code ChangeType} variant.
	 */
	public static Spike.Builder spike() {
		return new Spike.Builder();
	}

	/**
	 * Creates a ChangeType of the {@link Spike spike} {@code ChangeType} variant.
	 */
	public static ChangeType spike(Function<Spike.Builder, ObjectBuilder<Spike>> fn) {
		ChangeType.Builder builder = new ChangeType.Builder();
		builder.spike(fn.apply(new Spike.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link Stationary stationary} {@code ChangeType}
	 * variant.
	 */
	public static Stationary.Builder stationary() {
		return new Stationary.Builder();
	}

	/**
	 * Creates a ChangeType of the {@link Stationary stationary} {@code ChangeType}
	 * variant.
	 */
	public static ChangeType stationary(Function<Stationary.Builder, ObjectBuilder<Stationary>> fn) {
		ChangeType.Builder builder = new ChangeType.Builder();
		builder.stationary(fn.apply(new Stationary.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link StepChange step_change} {@code ChangeType}
	 * variant.
	 */
	public static StepChange.Builder stepChange() {
		return new StepChange.Builder();
	}

	/**
	 * Creates a ChangeType of the {@link StepChange step_change} {@code ChangeType}
	 * variant.
	 */
	public static ChangeType stepChange(Function<StepChange.Builder, ObjectBuilder<StepChange>> fn) {
		ChangeType.Builder builder = new ChangeType.Builder();
		builder.stepChange(fn.apply(new StepChange.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link TrendChange trend_change} {@code ChangeType}
	 * variant.
	 */
	public static TrendChange.Builder trendChange() {
		return new TrendChange.Builder();
	}

	/**
	 * Creates a ChangeType of the {@link TrendChange trend_change}
	 * {@code ChangeType} variant.
	 */
	public static ChangeType trendChange(Function<TrendChange.Builder, ObjectBuilder<TrendChange>> fn) {
		ChangeType.Builder builder = new ChangeType.Builder();
		builder.trendChange(fn.apply(new TrendChange.Builder()).build());
		return builder.build();
	}

}
