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

package co.elastic.clients.elasticsearch.ml.evaluate_data_frame;

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
 * Builders for {@link ResponseBody} variants.
 */
public class ResponseBodyBuilders {
	private ResponseBodyBuilders() {
	}

	/**
	 * Creates a builder for the {@link DataframeClassificationSummary
	 * classification} {@code ResponseBody} variant.
	 */
	public static DataframeClassificationSummary.Builder classification() {
		return new DataframeClassificationSummary.Builder();
	}

	/**
	 * Creates a ResponseBody of the {@link DataframeClassificationSummary
	 * classification} {@code ResponseBody} variant.
	 */
	public static ResponseBody classification(
			Function<DataframeClassificationSummary.Builder, ObjectBuilder<DataframeClassificationSummary>> fn) {
		ResponseBody.Builder builder = new ResponseBody.Builder();
		builder.classification(fn.apply(new DataframeClassificationSummary.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link DataframeOutlierDetectionSummary
	 * outlier_detection} {@code ResponseBody} variant.
	 */
	public static DataframeOutlierDetectionSummary.Builder outlierDetection() {
		return new DataframeOutlierDetectionSummary.Builder();
	}

	/**
	 * Creates a ResponseBody of the {@link DataframeOutlierDetectionSummary
	 * outlier_detection} {@code ResponseBody} variant.
	 */
	public static ResponseBody outlierDetection(
			Function<DataframeOutlierDetectionSummary.Builder, ObjectBuilder<DataframeOutlierDetectionSummary>> fn) {
		ResponseBody.Builder builder = new ResponseBody.Builder();
		builder.outlierDetection(fn.apply(new DataframeOutlierDetectionSummary.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link DataframeRegressionSummary regression}
	 * {@code ResponseBody} variant.
	 */
	public static DataframeRegressionSummary.Builder regression() {
		return new DataframeRegressionSummary.Builder();
	}

	/**
	 * Creates a ResponseBody of the {@link DataframeRegressionSummary regression}
	 * {@code ResponseBody} variant.
	 */
	public static ResponseBody regression(
			Function<DataframeRegressionSummary.Builder, ObjectBuilder<DataframeRegressionSummary>> fn) {
		ResponseBody.Builder builder = new ResponseBody.Builder();
		builder.regression(fn.apply(new DataframeRegressionSummary.Builder()).build());
		return builder.build();
	}

}
