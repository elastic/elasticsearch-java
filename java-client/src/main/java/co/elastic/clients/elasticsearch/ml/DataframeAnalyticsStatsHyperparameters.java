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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.DataframeAnalyticsStatsHyperparameters

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ml._types.DataframeAnalyticsStatsHyperparameters">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataframeAnalyticsStatsHyperparameters implements DataframeAnalyticsStatsVariant, JsonpSerializable {
	private final Hyperparameters hyperparameters;

	private final int iteration;

	private final long timestamp;

	private final TimingStats timingStats;

	private final ValidationLoss validationLoss;

	// ---------------------------------------------------------------------------------------------

	private DataframeAnalyticsStatsHyperparameters(Builder builder) {

		this.hyperparameters = ApiTypeHelper.requireNonNull(builder.hyperparameters, this, "hyperparameters");
		this.iteration = ApiTypeHelper.requireNonNull(builder.iteration, this, "iteration");
		this.timestamp = ApiTypeHelper.requireNonNull(builder.timestamp, this, "timestamp");
		this.timingStats = ApiTypeHelper.requireNonNull(builder.timingStats, this, "timingStats");
		this.validationLoss = ApiTypeHelper.requireNonNull(builder.validationLoss, this, "validationLoss");

	}

	public static DataframeAnalyticsStatsHyperparameters of(
			Function<Builder, ObjectBuilder<DataframeAnalyticsStatsHyperparameters>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * DataframeAnalyticsStats variant kind.
	 */
	@Override
	public DataframeAnalyticsStats.Kind _dataframeAnalyticsStatsKind() {
		return DataframeAnalyticsStats.Kind.RegressionStats;
	}

	/**
	 * Required - API name: {@code hyperparameters}
	 */
	public final Hyperparameters hyperparameters() {
		return this.hyperparameters;
	}

	/**
	 * Required - The number of iterations on the analysis.
	 * <p>
	 * API name: {@code iteration}
	 */
	public final int iteration() {
		return this.iteration;
	}

	/**
	 * Required - API name: {@code timestamp}
	 */
	public final long timestamp() {
		return this.timestamp;
	}

	/**
	 * Required - API name: {@code timing_stats}
	 */
	public final TimingStats timingStats() {
		return this.timingStats;
	}

	/**
	 * Required - API name: {@code validation_loss}
	 */
	public final ValidationLoss validationLoss() {
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
		generator.write(this.iteration);

		generator.writeKey("timestamp");
		generator.write(this.timestamp);

		generator.writeKey("timing_stats");
		this.timingStats.serialize(generator, mapper);

		generator.writeKey("validation_loss");
		this.validationLoss.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeAnalyticsStatsHyperparameters}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DataframeAnalyticsStatsHyperparameters> {
		private Hyperparameters hyperparameters;

		private Integer iteration;

		private Long timestamp;

		private TimingStats timingStats;

		private ValidationLoss validationLoss;

		/**
		 * Required - API name: {@code hyperparameters}
		 */
		public final Builder hyperparameters(Hyperparameters value) {
			this.hyperparameters = value;
			return this;
		}

		/**
		 * Required - API name: {@code hyperparameters}
		 */
		public final Builder hyperparameters(Function<Hyperparameters.Builder, ObjectBuilder<Hyperparameters>> fn) {
			return this.hyperparameters(fn.apply(new Hyperparameters.Builder()).build());
		}

		/**
		 * Required - The number of iterations on the analysis.
		 * <p>
		 * API name: {@code iteration}
		 */
		public final Builder iteration(int value) {
			this.iteration = value;
			return this;
		}

		/**
		 * Required - API name: {@code timestamp}
		 */
		public final Builder timestamp(long value) {
			this.timestamp = value;
			return this;
		}

		/**
		 * Required - API name: {@code timing_stats}
		 */
		public final Builder timingStats(TimingStats value) {
			this.timingStats = value;
			return this;
		}

		/**
		 * Required - API name: {@code timing_stats}
		 */
		public final Builder timingStats(Function<TimingStats.Builder, ObjectBuilder<TimingStats>> fn) {
			return this.timingStats(fn.apply(new TimingStats.Builder()).build());
		}

		/**
		 * Required - API name: {@code validation_loss}
		 */
		public final Builder validationLoss(ValidationLoss value) {
			this.validationLoss = value;
			return this;
		}

		/**
		 * Required - API name: {@code validation_loss}
		 */
		public final Builder validationLoss(Function<ValidationLoss.Builder, ObjectBuilder<ValidationLoss>> fn) {
			return this.validationLoss(fn.apply(new ValidationLoss.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataframeAnalyticsStatsHyperparameters}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeAnalyticsStatsHyperparameters build() {
			_checkSingleUse();

			return new DataframeAnalyticsStatsHyperparameters(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataframeAnalyticsStatsHyperparameters}
	 */
	public static final JsonpDeserializer<DataframeAnalyticsStatsHyperparameters> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					DataframeAnalyticsStatsHyperparameters::setupDataframeAnalyticsStatsHyperparametersDeserializer);

	protected static void setupDataframeAnalyticsStatsHyperparametersDeserializer(
			ObjectDeserializer<DataframeAnalyticsStatsHyperparameters.Builder> op) {

		op.add(Builder::hyperparameters, Hyperparameters._DESERIALIZER, "hyperparameters");
		op.add(Builder::iteration, JsonpDeserializer.integerDeserializer(), "iteration");
		op.add(Builder::timestamp, JsonpDeserializer.longDeserializer(), "timestamp");
		op.add(Builder::timingStats, TimingStats._DESERIALIZER, "timing_stats");
		op.add(Builder::validationLoss, ValidationLoss._DESERIALIZER, "validation_loss");

	}

}
