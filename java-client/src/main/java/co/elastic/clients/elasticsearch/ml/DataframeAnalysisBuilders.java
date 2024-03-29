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

package co.elastic.clients.elasticsearch.ml;

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
 * Builders for {@link DataframeAnalysis} variants.
 */
public class DataframeAnalysisBuilders {
	private DataframeAnalysisBuilders() {
	}

	/**
	 * Creates a builder for the {@link DataframeAnalysisClassification
	 * classification} {@code DataframeAnalysis} variant.
	 */
	public static DataframeAnalysisClassification.Builder classification() {
		return new DataframeAnalysisClassification.Builder();
	}

	/**
	 * Creates a DataframeAnalysis of the {@link DataframeAnalysisClassification
	 * classification} {@code DataframeAnalysis} variant.
	 */
	public static DataframeAnalysis classification(
			Function<DataframeAnalysisClassification.Builder, ObjectBuilder<DataframeAnalysisClassification>> fn) {
		DataframeAnalysis.Builder builder = new DataframeAnalysis.Builder();
		builder.classification(fn.apply(new DataframeAnalysisClassification.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link DataframeAnalysisOutlierDetection
	 * outlier_detection} {@code DataframeAnalysis} variant.
	 */
	public static DataframeAnalysisOutlierDetection.Builder outlierDetection() {
		return new DataframeAnalysisOutlierDetection.Builder();
	}

	/**
	 * Creates a DataframeAnalysis of the {@link DataframeAnalysisOutlierDetection
	 * outlier_detection} {@code DataframeAnalysis} variant.
	 */
	public static DataframeAnalysis outlierDetection(
			Function<DataframeAnalysisOutlierDetection.Builder, ObjectBuilder<DataframeAnalysisOutlierDetection>> fn) {
		DataframeAnalysis.Builder builder = new DataframeAnalysis.Builder();
		builder.outlierDetection(fn.apply(new DataframeAnalysisOutlierDetection.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link DataframeAnalysisRegression regression}
	 * {@code DataframeAnalysis} variant.
	 */
	public static DataframeAnalysisRegression.Builder regression() {
		return new DataframeAnalysisRegression.Builder();
	}

	/**
	 * Creates a DataframeAnalysis of the {@link DataframeAnalysisRegression
	 * regression} {@code DataframeAnalysis} variant.
	 */
	public static DataframeAnalysis regression(
			Function<DataframeAnalysisRegression.Builder, ObjectBuilder<DataframeAnalysisRegression>> fn) {
		DataframeAnalysis.Builder builder = new DataframeAnalysis.Builder();
		builder.regression(fn.apply(new DataframeAnalysisRegression.Builder()).build());
		return builder.build();
	}

}
