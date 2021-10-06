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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: xpack.usage.AnalyticsStatistics
@JsonpDeserializable
public final class AnalyticsStatistics implements JsonpSerializable {
	private final long boxplotUsage;

	private final long cumulativeCardinalityUsage;

	private final long stringStatsUsage;

	private final long topMetricsUsage;

	private final long tTestUsage;

	private final long movingPercentilesUsage;

	private final long normalizeUsage;

	private final long rateUsage;

	@Nullable
	private final Long multiTermsUsage;

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

	public AnalyticsStatistics(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code boxplot_usage}
	 */
	public long boxplotUsage() {
		return this.boxplotUsage;
	}

	/**
	 * Required - API name: {@code cumulative_cardinality_usage}
	 */
	public long cumulativeCardinalityUsage() {
		return this.cumulativeCardinalityUsage;
	}

	/**
	 * Required - API name: {@code string_stats_usage}
	 */
	public long stringStatsUsage() {
		return this.stringStatsUsage;
	}

	/**
	 * Required - API name: {@code top_metrics_usage}
	 */
	public long topMetricsUsage() {
		return this.topMetricsUsage;
	}

	/**
	 * Required - API name: {@code t_test_usage}
	 */
	public long tTestUsage() {
		return this.tTestUsage;
	}

	/**
	 * Required - API name: {@code moving_percentiles_usage}
	 */
	public long movingPercentilesUsage() {
		return this.movingPercentilesUsage;
	}

	/**
	 * Required - API name: {@code normalize_usage}
	 */
	public long normalizeUsage() {
		return this.normalizeUsage;
	}

	/**
	 * Required - API name: {@code rate_usage}
	 */
	public long rateUsage() {
		return this.rateUsage;
	}

	/**
	 * API name: {@code multi_terms_usage}
	 */
	@Nullable
	public Long multiTermsUsage() {
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
		generator.write(this.boxplotUsage);

		generator.writeKey("cumulative_cardinality_usage");
		generator.write(this.cumulativeCardinalityUsage);

		generator.writeKey("string_stats_usage");
		generator.write(this.stringStatsUsage);

		generator.writeKey("top_metrics_usage");
		generator.write(this.topMetricsUsage);

		generator.writeKey("t_test_usage");
		generator.write(this.tTestUsage);

		generator.writeKey("moving_percentiles_usage");
		generator.write(this.movingPercentilesUsage);

		generator.writeKey("normalize_usage");
		generator.write(this.normalizeUsage);

		generator.writeKey("rate_usage");
		generator.write(this.rateUsage);

		if (this.multiTermsUsage != null) {

			generator.writeKey("multi_terms_usage");
			generator.write(this.multiTermsUsage);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AnalyticsStatistics}.
	 */
	public static class Builder implements ObjectBuilder<AnalyticsStatistics> {
		private Long boxplotUsage;

		private Long cumulativeCardinalityUsage;

		private Long stringStatsUsage;

		private Long topMetricsUsage;

		private Long tTestUsage;

		private Long movingPercentilesUsage;

		private Long normalizeUsage;

		private Long rateUsage;

		@Nullable
		private Long multiTermsUsage;

		/**
		 * Required - API name: {@code boxplot_usage}
		 */
		public Builder boxplotUsage(long value) {
			this.boxplotUsage = value;
			return this;
		}

		/**
		 * Required - API name: {@code cumulative_cardinality_usage}
		 */
		public Builder cumulativeCardinalityUsage(long value) {
			this.cumulativeCardinalityUsage = value;
			return this;
		}

		/**
		 * Required - API name: {@code string_stats_usage}
		 */
		public Builder stringStatsUsage(long value) {
			this.stringStatsUsage = value;
			return this;
		}

		/**
		 * Required - API name: {@code top_metrics_usage}
		 */
		public Builder topMetricsUsage(long value) {
			this.topMetricsUsage = value;
			return this;
		}

		/**
		 * Required - API name: {@code t_test_usage}
		 */
		public Builder tTestUsage(long value) {
			this.tTestUsage = value;
			return this;
		}

		/**
		 * Required - API name: {@code moving_percentiles_usage}
		 */
		public Builder movingPercentilesUsage(long value) {
			this.movingPercentilesUsage = value;
			return this;
		}

		/**
		 * Required - API name: {@code normalize_usage}
		 */
		public Builder normalizeUsage(long value) {
			this.normalizeUsage = value;
			return this;
		}

		/**
		 * Required - API name: {@code rate_usage}
		 */
		public Builder rateUsage(long value) {
			this.rateUsage = value;
			return this;
		}

		/**
		 * API name: {@code multi_terms_usage}
		 */
		public Builder multiTermsUsage(@Nullable Long value) {
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
	public static final JsonpDeserializer<AnalyticsStatistics> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, AnalyticsStatistics::setupAnalyticsStatisticsDeserializer, Builder::build);

	protected static void setupAnalyticsStatisticsDeserializer(DelegatingDeserializer<AnalyticsStatistics.Builder> op) {

		op.add(Builder::boxplotUsage, JsonpDeserializer.longDeserializer(), "boxplot_usage");
		op.add(Builder::cumulativeCardinalityUsage, JsonpDeserializer.longDeserializer(),
				"cumulative_cardinality_usage");
		op.add(Builder::stringStatsUsage, JsonpDeserializer.longDeserializer(), "string_stats_usage");
		op.add(Builder::topMetricsUsage, JsonpDeserializer.longDeserializer(), "top_metrics_usage");
		op.add(Builder::tTestUsage, JsonpDeserializer.longDeserializer(), "t_test_usage");
		op.add(Builder::movingPercentilesUsage, JsonpDeserializer.longDeserializer(), "moving_percentiles_usage");
		op.add(Builder::normalizeUsage, JsonpDeserializer.longDeserializer(), "normalize_usage");
		op.add(Builder::rateUsage, JsonpDeserializer.longDeserializer(), "rate_usage");
		op.add(Builder::multiTermsUsage, JsonpDeserializer.longDeserializer(), "multi_terms_usage");

	}

}
