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

import co.elastic.clients.util.ObjectBuilder;
import java.util.function.Function;

/**
 * Builders for {@link DataframeAnalyticsStats} variants.
 */
public class DataframeAnalyticsStatsBuilders {
	private DataframeAnalyticsStatsBuilders() {
	}

	/**
	 * Creates a builder for the {@link DataframeAnalyticsStatsHyperparameters
	 * classification_stats} {@code DataframeAnalyticsStats} variant.
	 */
	public static DataframeAnalyticsStatsHyperparameters.Builder classificationStats() {
		return new DataframeAnalyticsStatsHyperparameters.Builder();
	}

	/**
	 * Creates a DataframeAnalyticsStats of the
	 * {@link DataframeAnalyticsStatsHyperparameters classification_stats}
	 * {@code DataframeAnalyticsStats} variant.
	 */
	public static DataframeAnalyticsStats classificationStats(
			Function<DataframeAnalyticsStatsHyperparameters.Builder, ObjectBuilder<DataframeAnalyticsStatsHyperparameters>> fn) {
		DataframeAnalyticsStats.Builder builder = new DataframeAnalyticsStats.Builder();
		builder.classificationStats(fn.apply(new DataframeAnalyticsStatsHyperparameters.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link DataframeAnalyticsStatsOutlierDetection
	 * outlier_detection_stats} {@code DataframeAnalyticsStats} variant.
	 */
	public static DataframeAnalyticsStatsOutlierDetection.Builder outlierDetectionStats() {
		return new DataframeAnalyticsStatsOutlierDetection.Builder();
	}

	/**
	 * Creates a DataframeAnalyticsStats of the
	 * {@link DataframeAnalyticsStatsOutlierDetection outlier_detection_stats}
	 * {@code DataframeAnalyticsStats} variant.
	 */
	public static DataframeAnalyticsStats outlierDetectionStats(
			Function<DataframeAnalyticsStatsOutlierDetection.Builder, ObjectBuilder<DataframeAnalyticsStatsOutlierDetection>> fn) {
		DataframeAnalyticsStats.Builder builder = new DataframeAnalyticsStats.Builder();
		builder.outlierDetectionStats(fn.apply(new DataframeAnalyticsStatsOutlierDetection.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link DataframeAnalyticsStatsHyperparameters
	 * regression_stats} {@code DataframeAnalyticsStats} variant.
	 */
	public static DataframeAnalyticsStatsHyperparameters.Builder regressionStats() {
		return new DataframeAnalyticsStatsHyperparameters.Builder();
	}

	/**
	 * Creates a DataframeAnalyticsStats of the
	 * {@link DataframeAnalyticsStatsHyperparameters regression_stats}
	 * {@code DataframeAnalyticsStats} variant.
	 */
	public static DataframeAnalyticsStats regressionStats(
			Function<DataframeAnalyticsStatsHyperparameters.Builder, ObjectBuilder<DataframeAnalyticsStatsHyperparameters>> fn) {
		DataframeAnalyticsStats.Builder builder = new DataframeAnalyticsStats.Builder();
		builder.regressionStats(fn.apply(new DataframeAnalyticsStatsHyperparameters.Builder()).build());
		return builder.build();
	}

}
