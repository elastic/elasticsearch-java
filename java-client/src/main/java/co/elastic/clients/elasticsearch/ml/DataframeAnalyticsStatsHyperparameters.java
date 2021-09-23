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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.DataframeAnalyticsStatsHyperparameters
public final class DataframeAnalyticsStatsHyperparameters implements JsonpSerializable {
	private final Hyperparameters hyperparameters;

	private final Number iteration;

	private final String timestamp;

	private final TimingStats timingStats;

	private final ValidationLoss validationLoss;

	// ---------------------------------------------------------------------------------------------

	public DataframeAnalyticsStatsHyperparameters(Builder builder) {

		this.hyperparameters = Objects.requireNonNull(builder.hyperparameters, "hyperparameters");
		this.iteration = Objects.requireNonNull(builder.iteration, "iteration");
		this.timestamp = Objects.requireNonNull(builder.timestamp, "timestamp");
		this.timingStats = Objects.requireNonNull(builder.timingStats, "timing_stats");
		this.validationLoss = Objects.requireNonNull(builder.validationLoss, "validation_loss");

	}

	/**
	 * API name: {@code hyperparameters}
	 */
	public Hyperparameters hyperparameters() {
		return this.hyperparameters;
	}

	/**
	 * The number of iterations on the analysis.
	 * <p>
	 * API name: {@code iteration}
	 */
	public Number iteration() {
		return this.iteration;
	}

	/**
	 * API name: {@code timestamp}
	 */
	public String timestamp() {
		return this.timestamp;
	}

	/**
	 * API name: {@code timing_stats}
	 */
	public TimingStats timingStats() {
		return this.timingStats;
	}

	/**
	 * API name: {@code validation_loss}
	 */
	public ValidationLoss validationLoss() {
		return this.validationLoss;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("hyperparameters");
		this.hyperparameters.serialize(generator, mapper);

		generator.writeKey("iteration");
		generator.write(this.iteration.doubleValue());

		generator.writeKey("timestamp");
		generator.write(this.timestamp);

		generator.writeKey("timing_stats");
		this.timingStats.serialize(generator, mapper);

		generator.writeKey("validation_loss");
		this.validationLoss.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeAnalyticsStatsHyperparameters}.
	 */
	public static class Builder implements ObjectBuilder<DataframeAnalyticsStatsHyperparameters> {
		private Hyperparameters hyperparameters;

		private Number iteration;

		private String timestamp;

		private TimingStats timingStats;

		private ValidationLoss validationLoss;

		/**
		 * API name: {@code hyperparameters}
		 */
		public Builder hyperparameters(Hyperparameters value) {
			this.hyperparameters = value;
			return this;
		}

		/**
		 * API name: {@code hyperparameters}
		 */
		public Builder hyperparameters(Function<Hyperparameters.Builder, ObjectBuilder<Hyperparameters>> fn) {
			return this.hyperparameters(fn.apply(new Hyperparameters.Builder()).build());
		}

		/**
		 * The number of iterations on the analysis.
		 * <p>
		 * API name: {@code iteration}
		 */
		public Builder iteration(Number value) {
			this.iteration = value;
			return this;
		}

		/**
		 * API name: {@code timestamp}
		 */
		public Builder timestamp(String value) {
			this.timestamp = value;
			return this;
		}

		/**
		 * API name: {@code timing_stats}
		 */
		public Builder timingStats(TimingStats value) {
			this.timingStats = value;
			return this;
		}

		/**
		 * API name: {@code timing_stats}
		 */
		public Builder timingStats(Function<TimingStats.Builder, ObjectBuilder<TimingStats>> fn) {
			return this.timingStats(fn.apply(new TimingStats.Builder()).build());
		}

		/**
		 * API name: {@code validation_loss}
		 */
		public Builder validationLoss(ValidationLoss value) {
			this.validationLoss = value;
			return this;
		}

		/**
		 * API name: {@code validation_loss}
		 */
		public Builder validationLoss(Function<ValidationLoss.Builder, ObjectBuilder<ValidationLoss>> fn) {
			return this.validationLoss(fn.apply(new ValidationLoss.Builder()).build());
		}

		/**
		 * Builds a {@link DataframeAnalyticsStatsHyperparameters}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeAnalyticsStatsHyperparameters build() {

			return new DataframeAnalyticsStatsHyperparameters(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataframeAnalyticsStatsHyperparameters}
	 */
	public static final JsonpDeserializer<DataframeAnalyticsStatsHyperparameters> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new,
					DataframeAnalyticsStatsHyperparameters::setupDataframeAnalyticsStatsHyperparametersDeserializer);

	protected static void setupDataframeAnalyticsStatsHyperparametersDeserializer(
			DelegatingDeserializer<DataframeAnalyticsStatsHyperparameters.Builder> op) {

		op.add(Builder::hyperparameters, Hyperparameters.DESERIALIZER, "hyperparameters");
		op.add(Builder::iteration, JsonpDeserializer.numberDeserializer(), "iteration");
		op.add(Builder::timestamp, JsonpDeserializer.stringDeserializer(), "timestamp");
		op.add(Builder::timingStats, TimingStats.DESERIALIZER, "timing_stats");
		op.add(Builder::validationLoss, ValidationLoss.DESERIALIZER, "validation_loss");

	}

}
