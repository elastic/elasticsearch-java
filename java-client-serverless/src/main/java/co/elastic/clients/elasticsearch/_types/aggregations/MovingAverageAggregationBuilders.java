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

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.util.ObjectBuilder;
import java.util.function.Function;

/**
 * Builders for {@link MovingAverageAggregation} variants.
 */
public class MovingAverageAggregationBuilders {
	private MovingAverageAggregationBuilders() {
	}

	/**
	 * Creates a builder for the {@link EwmaMovingAverageAggregation ewma}
	 * {@code MovingAverageAggregation} variant.
	 */
	public static EwmaMovingAverageAggregation.Builder ewma() {
		return new EwmaMovingAverageAggregation.Builder();
	}

	/**
	 * Creates a MovingAverageAggregation of the {@link EwmaMovingAverageAggregation
	 * ewma} {@code MovingAverageAggregation} variant.
	 */
	public static MovingAverageAggregation ewma(
			Function<EwmaMovingAverageAggregation.Builder, ObjectBuilder<EwmaMovingAverageAggregation>> fn) {
		MovingAverageAggregation.Builder builder = new MovingAverageAggregation.Builder();
		builder.ewma(fn.apply(new EwmaMovingAverageAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link HoltMovingAverageAggregation holt}
	 * {@code MovingAverageAggregation} variant.
	 */
	public static HoltMovingAverageAggregation.Builder holt() {
		return new HoltMovingAverageAggregation.Builder();
	}

	/**
	 * Creates a MovingAverageAggregation of the {@link HoltMovingAverageAggregation
	 * holt} {@code MovingAverageAggregation} variant.
	 */
	public static MovingAverageAggregation holt(
			Function<HoltMovingAverageAggregation.Builder, ObjectBuilder<HoltMovingAverageAggregation>> fn) {
		MovingAverageAggregation.Builder builder = new MovingAverageAggregation.Builder();
		builder.holt(fn.apply(new HoltMovingAverageAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link HoltWintersMovingAverageAggregation
	 * holt_winters} {@code MovingAverageAggregation} variant.
	 */
	public static HoltWintersMovingAverageAggregation.Builder holtWinters() {
		return new HoltWintersMovingAverageAggregation.Builder();
	}

	/**
	 * Creates a MovingAverageAggregation of the
	 * {@link HoltWintersMovingAverageAggregation holt_winters}
	 * {@code MovingAverageAggregation} variant.
	 */
	public static MovingAverageAggregation holtWinters(
			Function<HoltWintersMovingAverageAggregation.Builder, ObjectBuilder<HoltWintersMovingAverageAggregation>> fn) {
		MovingAverageAggregation.Builder builder = new MovingAverageAggregation.Builder();
		builder.holtWinters(fn.apply(new HoltWintersMovingAverageAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link LinearMovingAverageAggregation linear}
	 * {@code MovingAverageAggregation} variant.
	 */
	public static LinearMovingAverageAggregation.Builder linear() {
		return new LinearMovingAverageAggregation.Builder();
	}

	/**
	 * Creates a MovingAverageAggregation of the
	 * {@link LinearMovingAverageAggregation linear}
	 * {@code MovingAverageAggregation} variant.
	 */
	public static MovingAverageAggregation linear(
			Function<LinearMovingAverageAggregation.Builder, ObjectBuilder<LinearMovingAverageAggregation>> fn) {
		MovingAverageAggregation.Builder builder = new MovingAverageAggregation.Builder();
		builder.linear(fn.apply(new LinearMovingAverageAggregation.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link SimpleMovingAverageAggregation simple}
	 * {@code MovingAverageAggregation} variant.
	 */
	public static SimpleMovingAverageAggregation.Builder simple() {
		return new SimpleMovingAverageAggregation.Builder();
	}

	/**
	 * Creates a MovingAverageAggregation of the
	 * {@link SimpleMovingAverageAggregation simple}
	 * {@code MovingAverageAggregation} variant.
	 */
	public static MovingAverageAggregation simple(
			Function<SimpleMovingAverageAggregation.Builder, ObjectBuilder<SimpleMovingAverageAggregation>> fn) {
		MovingAverageAggregation.Builder builder = new MovingAverageAggregation.Builder();
		builder.simple(fn.apply(new SimpleMovingAverageAggregation.Builder()).build());
		return builder.build();
	}

}
