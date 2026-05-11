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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

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

// typedef: _types.aggregations.ExtendedStatsAggregate

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.ExtendedStatsAggregate">API
 *      specification</a>
 */
@JsonpDeserializable
public class ExtendedStatsAggregate extends StatsAggregate implements AggregateVariant {
	@Nullable
	private final Double sumOfSquares;

	@Nullable
	private final Double variance;

	@Nullable
	private final Double variancePopulation;

	@Nullable
	private final Double varianceSampling;

	@Nullable
	private final Double stdDeviation;

	@Nullable
	private final Double stdDeviationPopulation;

	@Nullable
	private final Double stdDeviationSampling;

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

		this.sumOfSquares = builder.sumOfSquares;
		this.variance = builder.variance;
		this.variancePopulation = builder.variancePopulation;
		this.varianceSampling = builder.varianceSampling;
		this.stdDeviation = builder.stdDeviation;
		this.stdDeviationPopulation = builder.stdDeviationPopulation;
		this.stdDeviationSampling = builder.stdDeviationSampling;
		this.stdDeviationBounds = builder.stdDeviationBounds;
		this.sumOfSquaresAsString = builder.sumOfSquaresAsString;
		this.varianceAsString = builder.varianceAsString;
		this.variancePopulationAsString = builder.variancePopulationAsString;
		this.varianceSamplingAsString = builder.varianceSamplingAsString;
		this.stdDeviationAsString = builder.stdDeviationAsString;
		this.stdDeviationBoundsAsString = builder.stdDeviationBoundsAsString;

	}

	public static ExtendedStatsAggregate extendedStatsAggregateOf(
			Function<Builder, ObjectBuilder<ExtendedStatsAggregate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregate variant kind.
	 */
	@Override
	public Aggregate.Kind _aggregateKind() {
		return Aggregate.Kind.ExtendedStats;
	}

	/**
	 * API name: {@code sum_of_squares}
	 */
	@Nullable
	public final Double sumOfSquares() {
		return this.sumOfSquares;
	}

	/**
	 * API name: {@code variance}
	 */
	@Nullable
	public final Double variance() {
		return this.variance;
	}

	/**
	 * API name: {@code variance_population}
	 */
	@Nullable
	public final Double variancePopulation() {
		return this.variancePopulation;
	}

	/**
	 * API name: {@code variance_sampling}
	 */
	@Nullable
	public final Double varianceSampling() {
		return this.varianceSampling;
	}

	/**
	 * API name: {@code std_deviation}
	 */
	@Nullable
	public final Double stdDeviation() {
		return this.stdDeviation;
	}

	/**
	 * API name: {@code std_deviation_population}
	 */
	@Nullable
	public final Double stdDeviationPopulation() {
		return this.stdDeviationPopulation;
	}

	/**
	 * API name: {@code std_deviation_sampling}
	 */
	@Nullable
	public final Double stdDeviationSampling() {
		return this.stdDeviationSampling;
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
		if (this.sumOfSquares != null) {
			generator.writeKey("sum_of_squares");
			generator.write(this.sumOfSquares);

		}
		if (this.variance != null) {
			generator.writeKey("variance");
			generator.write(this.variance);

		}
		if (this.variancePopulation != null) {
			generator.writeKey("variance_population");
			generator.write(this.variancePopulation);

		}
		if (this.varianceSampling != null) {
			generator.writeKey("variance_sampling");
			generator.write(this.varianceSampling);

		}
		if (this.stdDeviation != null) {
			generator.writeKey("std_deviation");
			generator.write(this.stdDeviation);

		}
		if (this.stdDeviationPopulation != null) {
			generator.writeKey("std_deviation_population");
			generator.write(this.stdDeviationPopulation);

		}
		if (this.stdDeviationSampling != null) {
			generator.writeKey("std_deviation_sampling");
			generator.write(this.stdDeviationSampling);

		}
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

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				StatsAggregate.AbstractBuilder<BuilderT> {
		@Nullable
		private Double sumOfSquares;

		@Nullable
		private Double variance;

		@Nullable
		private Double variancePopulation;

		@Nullable
		private Double varianceSampling;

		@Nullable
		private Double stdDeviation;

		@Nullable
		private Double stdDeviationPopulation;

		@Nullable
		private Double stdDeviationSampling;

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
		 * API name: {@code sum_of_squares}
		 */
		public final BuilderT sumOfSquares(@Nullable Double value) {
			this.sumOfSquares = value;
			return self();
		}

		/**
		 * API name: {@code variance}
		 */
		public final BuilderT variance(@Nullable Double value) {
			this.variance = value;
			return self();
		}

		/**
		 * API name: {@code variance_population}
		 */
		public final BuilderT variancePopulation(@Nullable Double value) {
			this.variancePopulation = value;
			return self();
		}

		/**
		 * API name: {@code variance_sampling}
		 */
		public final BuilderT varianceSampling(@Nullable Double value) {
			this.varianceSampling = value;
			return self();
		}

		/**
		 * API name: {@code std_deviation}
		 */
		public final BuilderT stdDeviation(@Nullable Double value) {
			this.stdDeviation = value;
			return self();
		}

		/**
		 * API name: {@code std_deviation_population}
		 */
		public final BuilderT stdDeviationPopulation(@Nullable Double value) {
			this.stdDeviationPopulation = value;
			return self();
		}

		/**
		 * API name: {@code std_deviation_sampling}
		 */
		public final BuilderT stdDeviationSampling(@Nullable Double value) {
			this.stdDeviationSampling = value;
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
			.lazy(Builder::new, ExtendedStatsAggregate::setupExtendedStatsAggregateDeserializer);

	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupExtendedStatsAggregateDeserializer(
			ObjectDeserializer<BuilderT> op) {
		StatsAggregate.setupStatsAggregateDeserializer(op);
		op.add(AbstractBuilder::sumOfSquares, JsonpDeserializer.doubleDeserializer(), "sum_of_squares");
		op.add(AbstractBuilder::variance, JsonpDeserializer.doubleDeserializer(), "variance");
		op.add(AbstractBuilder::variancePopulation, JsonpDeserializer.doubleDeserializer(), "variance_population");
		op.add(AbstractBuilder::varianceSampling, JsonpDeserializer.doubleDeserializer(), "variance_sampling");
		op.add(AbstractBuilder::stdDeviation, JsonpDeserializer.doubleDeserializer(), "std_deviation");
		op.add(AbstractBuilder::stdDeviationPopulation, JsonpDeserializer.doubleDeserializer(),
				"std_deviation_population");
		op.add(AbstractBuilder::stdDeviationSampling, JsonpDeserializer.doubleDeserializer(), "std_deviation_sampling");
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
