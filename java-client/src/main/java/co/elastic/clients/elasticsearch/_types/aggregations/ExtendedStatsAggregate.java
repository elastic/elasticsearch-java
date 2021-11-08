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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.ExtendedStatsAggregate
@JsonpDeserializable
public class ExtendedStatsAggregate extends StatsAggregate implements AggregateVariant {
	private final double sumOfSquares;

	private final double variance;

	private final double variancePopulation;

	private final double varianceSampling;

	private final double stdDeviation;

	@Nullable
	private final StandardDeviationBounds stdDeviationBounds;

	@Nullable
	private final String sumOfSquaresAsString;

	@Nullable
	private final String varianceAsString;

	@Nullable
	private final String variancePopulationAsString;

	@Nullable
	private final String varianceSamplingAsString;

	@Nullable
	private final String stdDeviationAsString;

	@Nullable
	private final StandardDeviationBoundsAsString stdDeviationBoundsAsString;

	// ---------------------------------------------------------------------------------------------

	protected ExtendedStatsAggregate(AbstractBuilder<?> builder) {
		super(builder);

		this.sumOfSquares = ModelTypeHelper.requireNonNull(builder.sumOfSquares, this, "sumOfSquares");
		this.variance = ModelTypeHelper.requireNonNull(builder.variance, this, "variance");
		this.variancePopulation = ModelTypeHelper.requireNonNull(builder.variancePopulation, this,
				"variancePopulation");
		this.varianceSampling = ModelTypeHelper.requireNonNull(builder.varianceSampling, this, "varianceSampling");
		this.stdDeviation = ModelTypeHelper.requireNonNull(builder.stdDeviation, this, "stdDeviation");
		this.stdDeviationBounds = builder.stdDeviationBounds;
		this.sumOfSquaresAsString = builder.sumOfSquaresAsString;
		this.varianceAsString = builder.varianceAsString;
		this.variancePopulationAsString = builder.variancePopulationAsString;
		this.varianceSamplingAsString = builder.varianceSamplingAsString;
		this.stdDeviationAsString = builder.stdDeviationAsString;
		this.stdDeviationBoundsAsString = builder.stdDeviationBoundsAsString;

	}

	/**
	 * {@link Aggregate} variant type
	 */
	@Override
	public String _variantType() {
		return "extended_stats";
	}

	/**
	 * Required - API name: {@code sum_of_squares}
	 */
	public final double sumOfSquares() {
		return this.sumOfSquares;
	}

	/**
	 * Required - API name: {@code variance}
	 */
	public final double variance() {
		return this.variance;
	}

	/**
	 * Required - API name: {@code variance_population}
	 */
	public final double variancePopulation() {
		return this.variancePopulation;
	}

	/**
	 * Required - API name: {@code variance_sampling}
	 */
	public final double varianceSampling() {
		return this.varianceSampling;
	}

	/**
	 * Required - API name: {@code std_deviation}
	 */
	public final double stdDeviation() {
		return this.stdDeviation;
	}

	/**
	 * API name: {@code std_deviation_bounds}
	 */
	@Nullable
	public final StandardDeviationBounds stdDeviationBounds() {
		return this.stdDeviationBounds;
	}

	/**
	 * API name: {@code sum_of_squares_as_string}
	 */
	@Nullable
	public final String sumOfSquaresAsString() {
		return this.sumOfSquaresAsString;
	}

	/**
	 * API name: {@code variance_as_string}
	 */
	@Nullable
	public final String varianceAsString() {
		return this.varianceAsString;
	}

	/**
	 * API name: {@code variance_population_as_string}
	 */
	@Nullable
	public final String variancePopulationAsString() {
		return this.variancePopulationAsString;
	}

	/**
	 * API name: {@code variance_sampling_as_string}
	 */
	@Nullable
	public final String varianceSamplingAsString() {
		return this.varianceSamplingAsString;
	}

	/**
	 * API name: {@code std_deviation_as_string}
	 */
	@Nullable
	public final String stdDeviationAsString() {
		return this.stdDeviationAsString;
	}

	/**
	 * API name: {@code std_deviation_bounds_as_string}
	 */
	@Nullable
	public final StandardDeviationBoundsAsString stdDeviationBoundsAsString() {
		return this.stdDeviationBoundsAsString;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("sum_of_squares");
		generator.write(this.sumOfSquares);

		generator.writeKey("variance");
		generator.write(this.variance);

		generator.writeKey("variance_population");
		generator.write(this.variancePopulation);

		generator.writeKey("variance_sampling");
		generator.write(this.varianceSampling);

		generator.writeKey("std_deviation");
		generator.write(this.stdDeviation);

		if (this.stdDeviationBounds != null) {
			generator.writeKey("std_deviation_bounds");
			this.stdDeviationBounds.serialize(generator, mapper);

		}
		if (this.sumOfSquaresAsString != null) {
			generator.writeKey("sum_of_squares_as_string");
			generator.write(this.sumOfSquaresAsString);

		}
		if (this.varianceAsString != null) {
			generator.writeKey("variance_as_string");
			generator.write(this.varianceAsString);

		}
		if (this.variancePopulationAsString != null) {
			generator.writeKey("variance_population_as_string");
			generator.write(this.variancePopulationAsString);

		}
		if (this.varianceSamplingAsString != null) {
			generator.writeKey("variance_sampling_as_string");
			generator.write(this.varianceSamplingAsString);

		}
		if (this.stdDeviationAsString != null) {
			generator.writeKey("std_deviation_as_string");
			generator.write(this.stdDeviationAsString);

		}
		if (this.stdDeviationBoundsAsString != null) {
			generator.writeKey("std_deviation_bounds_as_string");
			this.stdDeviationBoundsAsString.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExtendedStatsAggregate}.
	 */
	public static class Builder extends ExtendedStatsAggregate.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ExtendedStatsAggregate> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ExtendedStatsAggregate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExtendedStatsAggregate build() {
			_checkSingleUse();

			return new ExtendedStatsAggregate(this);
		}
	}

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				StatsAggregate.AbstractBuilder<BuilderT> {
		private Double sumOfSquares;

		private Double variance;

		private Double variancePopulation;

		private Double varianceSampling;

		private Double stdDeviation;

		@Nullable
		private StandardDeviationBounds stdDeviationBounds;

		@Nullable
		private String sumOfSquaresAsString;

		@Nullable
		private String varianceAsString;

		@Nullable
		private String variancePopulationAsString;

		@Nullable
		private String varianceSamplingAsString;

		@Nullable
		private String stdDeviationAsString;

		@Nullable
		private StandardDeviationBoundsAsString stdDeviationBoundsAsString;

		/**
		 * Required - API name: {@code sum_of_squares}
		 */
		public final BuilderT sumOfSquares(double value) {
			this.sumOfSquares = value;
			return self();
		}

		/**
		 * Required - API name: {@code variance}
		 */
		public final BuilderT variance(double value) {
			this.variance = value;
			return self();
		}

		/**
		 * Required - API name: {@code variance_population}
		 */
		public final BuilderT variancePopulation(double value) {
			this.variancePopulation = value;
			return self();
		}

		/**
		 * Required - API name: {@code variance_sampling}
		 */
		public final BuilderT varianceSampling(double value) {
			this.varianceSampling = value;
			return self();
		}

		/**
		 * Required - API name: {@code std_deviation}
		 */
		public final BuilderT stdDeviation(double value) {
			this.stdDeviation = value;
			return self();
		}

		/**
		 * API name: {@code std_deviation_bounds}
		 */
		public final BuilderT stdDeviationBounds(@Nullable StandardDeviationBounds value) {
			this.stdDeviationBounds = value;
			return self();
		}

		/**
		 * API name: {@code std_deviation_bounds}
		 */
		public final BuilderT stdDeviationBounds(
				Function<StandardDeviationBounds.Builder, ObjectBuilder<StandardDeviationBounds>> fn) {
			return this.stdDeviationBounds(fn.apply(new StandardDeviationBounds.Builder()).build());
		}

		/**
		 * API name: {@code sum_of_squares_as_string}
		 */
		public final BuilderT sumOfSquaresAsString(@Nullable String value) {
			this.sumOfSquaresAsString = value;
			return self();
		}

		/**
		 * API name: {@code variance_as_string}
		 */
		public final BuilderT varianceAsString(@Nullable String value) {
			this.varianceAsString = value;
			return self();
		}

		/**
		 * API name: {@code variance_population_as_string}
		 */
		public final BuilderT variancePopulationAsString(@Nullable String value) {
			this.variancePopulationAsString = value;
			return self();
		}

		/**
		 * API name: {@code variance_sampling_as_string}
		 */
		public final BuilderT varianceSamplingAsString(@Nullable String value) {
			this.varianceSamplingAsString = value;
			return self();
		}

		/**
		 * API name: {@code std_deviation_as_string}
		 */
		public final BuilderT stdDeviationAsString(@Nullable String value) {
			this.stdDeviationAsString = value;
			return self();
		}

		/**
		 * API name: {@code std_deviation_bounds_as_string}
		 */
		public final BuilderT stdDeviationBoundsAsString(@Nullable StandardDeviationBoundsAsString value) {
			this.stdDeviationBoundsAsString = value;
			return self();
		}

		/**
		 * API name: {@code std_deviation_bounds_as_string}
		 */
		public final BuilderT stdDeviationBoundsAsString(
				Function<StandardDeviationBoundsAsString.Builder, ObjectBuilder<StandardDeviationBoundsAsString>> fn) {
			return this.stdDeviationBoundsAsString(fn.apply(new StandardDeviationBoundsAsString.Builder()).build());
		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ExtendedStatsAggregate}
	 */
	public static final JsonpDeserializer<ExtendedStatsAggregate> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ExtendedStatsAggregate::setupExtendedStatsAggregateDeserializer, Builder::build);

	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupExtendedStatsAggregateDeserializer(
			DelegatingDeserializer<BuilderT> op) {
		StatsAggregate.setupStatsAggregateDeserializer(op);
		op.add(AbstractBuilder::sumOfSquares, JsonpDeserializer.doubleDeserializer(), "sum_of_squares");
		op.add(AbstractBuilder::variance, JsonpDeserializer.doubleDeserializer(), "variance");
		op.add(AbstractBuilder::variancePopulation, JsonpDeserializer.doubleDeserializer(), "variance_population");
		op.add(AbstractBuilder::varianceSampling, JsonpDeserializer.doubleDeserializer(), "variance_sampling");
		op.add(AbstractBuilder::stdDeviation, JsonpDeserializer.doubleDeserializer(), "std_deviation");
		op.add(AbstractBuilder::stdDeviationBounds, StandardDeviationBounds._DESERIALIZER, "std_deviation_bounds");
		op.add(AbstractBuilder::sumOfSquaresAsString, JsonpDeserializer.stringDeserializer(),
				"sum_of_squares_as_string");
		op.add(AbstractBuilder::varianceAsString, JsonpDeserializer.stringDeserializer(), "variance_as_string");
		op.add(AbstractBuilder::variancePopulationAsString, JsonpDeserializer.stringDeserializer(),
				"variance_population_as_string");
		op.add(AbstractBuilder::varianceSamplingAsString, JsonpDeserializer.stringDeserializer(),
				"variance_sampling_as_string");
		op.add(AbstractBuilder::stdDeviationAsString, JsonpDeserializer.stringDeserializer(),
				"std_deviation_as_string");
		op.add(AbstractBuilder::stdDeviationBoundsAsString, StandardDeviationBoundsAsString._DESERIALIZER,
				"std_deviation_bounds_as_string");

	}

}
