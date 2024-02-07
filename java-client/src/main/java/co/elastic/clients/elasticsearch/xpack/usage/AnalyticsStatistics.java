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

package co.elastic.clients.elasticsearch.xpack.usage;

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
import java.lang.Long;
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

// typedef: xpack.usage.AnalyticsStatistics

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#xpack.usage.AnalyticsStatistics">API
 *      specification</a>
 */
@JsonpDeserializable
public class AnalyticsStatistics implements JsonpSerializable {
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

	private AnalyticsStatistics(Builder builder) {

		this.boxplotUsage = ApiTypeHelper.requireNonNull(builder.boxplotUsage, this, "boxplotUsage");
		this.cumulativeCardinalityUsage = ApiTypeHelper.requireNonNull(builder.cumulativeCardinalityUsage, this,
				"cumulativeCardinalityUsage");
		this.stringStatsUsage = ApiTypeHelper.requireNonNull(builder.stringStatsUsage, this, "stringStatsUsage");
		this.topMetricsUsage = ApiTypeHelper.requireNonNull(builder.topMetricsUsage, this, "topMetricsUsage");
		this.tTestUsage = ApiTypeHelper.requireNonNull(builder.tTestUsage, this, "tTestUsage");
		this.movingPercentilesUsage = ApiTypeHelper.requireNonNull(builder.movingPercentilesUsage, this,
				"movingPercentilesUsage");
		this.normalizeUsage = ApiTypeHelper.requireNonNull(builder.normalizeUsage, this, "normalizeUsage");
		this.rateUsage = ApiTypeHelper.requireNonNull(builder.rateUsage, this, "rateUsage");
		this.multiTermsUsage = builder.multiTermsUsage;

	}

	public static AnalyticsStatistics of(Function<Builder, ObjectBuilder<AnalyticsStatistics>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code boxplot_usage}
	 */
	public final long boxplotUsage() {
		return this.boxplotUsage;
	}

	/**
	 * Required - API name: {@code cumulative_cardinality_usage}
	 */
	public final long cumulativeCardinalityUsage() {
		return this.cumulativeCardinalityUsage;
	}

	/**
	 * Required - API name: {@code string_stats_usage}
	 */
	public final long stringStatsUsage() {
		return this.stringStatsUsage;
	}

	/**
	 * Required - API name: {@code top_metrics_usage}
	 */
	public final long topMetricsUsage() {
		return this.topMetricsUsage;
	}

	/**
	 * Required - API name: {@code t_test_usage}
	 */
	public final long tTestUsage() {
		return this.tTestUsage;
	}

	/**
	 * Required - API name: {@code moving_percentiles_usage}
	 */
	public final long movingPercentilesUsage() {
		return this.movingPercentilesUsage;
	}

	/**
	 * Required - API name: {@code normalize_usage}
	 */
	public final long normalizeUsage() {
		return this.normalizeUsage;
	}

	/**
	 * Required - API name: {@code rate_usage}
	 */
	public final long rateUsage() {
		return this.rateUsage;
	}

	/**
	 * API name: {@code multi_terms_usage}
	 */
	@Nullable
	public final Long multiTermsUsage() {
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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AnalyticsStatistics}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<AnalyticsStatistics> {
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
		public final Builder boxplotUsage(long value) {
			this.boxplotUsage = value;
			return this;
		}

		/**
		 * Required - API name: {@code cumulative_cardinality_usage}
		 */
		public final Builder cumulativeCardinalityUsage(long value) {
			this.cumulativeCardinalityUsage = value;
			return this;
		}

		/**
		 * Required - API name: {@code string_stats_usage}
		 */
		public final Builder stringStatsUsage(long value) {
			this.stringStatsUsage = value;
			return this;
		}

		/**
		 * Required - API name: {@code top_metrics_usage}
		 */
		public final Builder topMetricsUsage(long value) {
			this.topMetricsUsage = value;
			return this;
		}

		/**
		 * Required - API name: {@code t_test_usage}
		 */
		public final Builder tTestUsage(long value) {
			this.tTestUsage = value;
			return this;
		}

		/**
		 * Required - API name: {@code moving_percentiles_usage}
		 */
		public final Builder movingPercentilesUsage(long value) {
			this.movingPercentilesUsage = value;
			return this;
		}

		/**
		 * Required - API name: {@code normalize_usage}
		 */
		public final Builder normalizeUsage(long value) {
			this.normalizeUsage = value;
			return this;
		}

		/**
		 * Required - API name: {@code rate_usage}
		 */
		public final Builder rateUsage(long value) {
			this.rateUsage = value;
			return this;
		}

		/**
		 * API name: {@code multi_terms_usage}
		 */
		public final Builder multiTermsUsage(@Nullable Long value) {
			this.multiTermsUsage = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AnalyticsStatistics}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AnalyticsStatistics build() {
			_checkSingleUse();

			return new AnalyticsStatistics(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AnalyticsStatistics}
	 */
	public static final JsonpDeserializer<AnalyticsStatistics> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, AnalyticsStatistics::setupAnalyticsStatisticsDeserializer);

	protected static void setupAnalyticsStatisticsDeserializer(ObjectDeserializer<AnalyticsStatistics.Builder> op) {

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
