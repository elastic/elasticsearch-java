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

package co.elastic.clients.elasticsearch.xpack.usage;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: xpack.usage.AnalyticsStatistics
public final class AnalyticsStatistics implements JsonpSerializable {
	private final Number boxplotUsage;

	private final Number cumulativeCardinalityUsage;

	private final Number stringStatsUsage;

	private final Number topMetricsUsage;

	private final Number tTestUsage;

	private final Number movingPercentilesUsage;

	private final Number normalizeUsage;

	private final Number rateUsage;

	@Nullable
	private final Number multiTermsUsage;

	// ---------------------------------------------------------------------------------------------

	public AnalyticsStatistics(Builder builder) {

		this.boxplotUsage = Objects.requireNonNull(builder.boxplotUsage, "boxplot_usage");
		this.cumulativeCardinalityUsage = Objects.requireNonNull(builder.cumulativeCardinalityUsage,
				"cumulative_cardinality_usage");
		this.stringStatsUsage = Objects.requireNonNull(builder.stringStatsUsage, "string_stats_usage");
		this.topMetricsUsage = Objects.requireNonNull(builder.topMetricsUsage, "top_metrics_usage");
		this.tTestUsage = Objects.requireNonNull(builder.tTestUsage, "t_test_usage");
		this.movingPercentilesUsage = Objects.requireNonNull(builder.movingPercentilesUsage,
				"moving_percentiles_usage");
		this.normalizeUsage = Objects.requireNonNull(builder.normalizeUsage, "normalize_usage");
		this.rateUsage = Objects.requireNonNull(builder.rateUsage, "rate_usage");
		this.multiTermsUsage = builder.multiTermsUsage;

	}

	/**
	 * API name: {@code boxplot_usage}
	 */
	public Number boxplotUsage() {
		return this.boxplotUsage;
	}

	/**
	 * API name: {@code cumulative_cardinality_usage}
	 */
	public Number cumulativeCardinalityUsage() {
		return this.cumulativeCardinalityUsage;
	}

	/**
	 * API name: {@code string_stats_usage}
	 */
	public Number stringStatsUsage() {
		return this.stringStatsUsage;
	}

	/**
	 * API name: {@code top_metrics_usage}
	 */
	public Number topMetricsUsage() {
		return this.topMetricsUsage;
	}

	/**
	 * API name: {@code t_test_usage}
	 */
	public Number tTestUsage() {
		return this.tTestUsage;
	}

	/**
	 * API name: {@code moving_percentiles_usage}
	 */
	public Number movingPercentilesUsage() {
		return this.movingPercentilesUsage;
	}

	/**
	 * API name: {@code normalize_usage}
	 */
	public Number normalizeUsage() {
		return this.normalizeUsage;
	}

	/**
	 * API name: {@code rate_usage}
	 */
	public Number rateUsage() {
		return this.rateUsage;
	}

	/**
	 * API name: {@code multi_terms_usage}
	 */
	@Nullable
	public Number multiTermsUsage() {
		return this.multiTermsUsage;
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

		generator.writeKey("boxplot_usage");
		generator.write(this.boxplotUsage.doubleValue());

		generator.writeKey("cumulative_cardinality_usage");
		generator.write(this.cumulativeCardinalityUsage.doubleValue());

		generator.writeKey("string_stats_usage");
		generator.write(this.stringStatsUsage.doubleValue());

		generator.writeKey("top_metrics_usage");
		generator.write(this.topMetricsUsage.doubleValue());

		generator.writeKey("t_test_usage");
		generator.write(this.tTestUsage.doubleValue());

		generator.writeKey("moving_percentiles_usage");
		generator.write(this.movingPercentilesUsage.doubleValue());

		generator.writeKey("normalize_usage");
		generator.write(this.normalizeUsage.doubleValue());

		generator.writeKey("rate_usage");
		generator.write(this.rateUsage.doubleValue());

		if (this.multiTermsUsage != null) {

			generator.writeKey("multi_terms_usage");
			generator.write(this.multiTermsUsage.doubleValue());

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AnalyticsStatistics}.
	 */
	public static class Builder implements ObjectBuilder<AnalyticsStatistics> {
		private Number boxplotUsage;

		private Number cumulativeCardinalityUsage;

		private Number stringStatsUsage;

		private Number topMetricsUsage;

		private Number tTestUsage;

		private Number movingPercentilesUsage;

		private Number normalizeUsage;

		private Number rateUsage;

		@Nullable
		private Number multiTermsUsage;

		/**
		 * API name: {@code boxplot_usage}
		 */
		public Builder boxplotUsage(Number value) {
			this.boxplotUsage = value;
			return this;
		}

		/**
		 * API name: {@code cumulative_cardinality_usage}
		 */
		public Builder cumulativeCardinalityUsage(Number value) {
			this.cumulativeCardinalityUsage = value;
			return this;
		}

		/**
		 * API name: {@code string_stats_usage}
		 */
		public Builder stringStatsUsage(Number value) {
			this.stringStatsUsage = value;
			return this;
		}

		/**
		 * API name: {@code top_metrics_usage}
		 */
		public Builder topMetricsUsage(Number value) {
			this.topMetricsUsage = value;
			return this;
		}

		/**
		 * API name: {@code t_test_usage}
		 */
		public Builder tTestUsage(Number value) {
			this.tTestUsage = value;
			return this;
		}

		/**
		 * API name: {@code moving_percentiles_usage}
		 */
		public Builder movingPercentilesUsage(Number value) {
			this.movingPercentilesUsage = value;
			return this;
		}

		/**
		 * API name: {@code normalize_usage}
		 */
		public Builder normalizeUsage(Number value) {
			this.normalizeUsage = value;
			return this;
		}

		/**
		 * API name: {@code rate_usage}
		 */
		public Builder rateUsage(Number value) {
			this.rateUsage = value;
			return this;
		}

		/**
		 * API name: {@code multi_terms_usage}
		 */
		public Builder multiTermsUsage(@Nullable Number value) {
			this.multiTermsUsage = value;
			return this;
		}

		/**
		 * Builds a {@link AnalyticsStatistics}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AnalyticsStatistics build() {

			return new AnalyticsStatistics(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AnalyticsStatistics}
	 */
	public static final JsonpDeserializer<AnalyticsStatistics> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, AnalyticsStatistics::setupAnalyticsStatisticsDeserializer);

	protected static void setupAnalyticsStatisticsDeserializer(DelegatingDeserializer<AnalyticsStatistics.Builder> op) {

		op.add(Builder::boxplotUsage, JsonpDeserializer.numberDeserializer(), "boxplot_usage");
		op.add(Builder::cumulativeCardinalityUsage, JsonpDeserializer.numberDeserializer(),
				"cumulative_cardinality_usage");
		op.add(Builder::stringStatsUsage, JsonpDeserializer.numberDeserializer(), "string_stats_usage");
		op.add(Builder::topMetricsUsage, JsonpDeserializer.numberDeserializer(), "top_metrics_usage");
		op.add(Builder::tTestUsage, JsonpDeserializer.numberDeserializer(), "t_test_usage");
		op.add(Builder::movingPercentilesUsage, JsonpDeserializer.numberDeserializer(), "moving_percentiles_usage");
		op.add(Builder::normalizeUsage, JsonpDeserializer.numberDeserializer(), "normalize_usage");
		op.add(Builder::rateUsage, JsonpDeserializer.numberDeserializer(), "rate_usage");
		op.add(Builder::multiTermsUsage, JsonpDeserializer.numberDeserializer(), "multi_terms_usage");

	}

}
