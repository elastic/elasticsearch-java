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
 * Builders for {@link DataframeEvaluation} variants.
 */
public class DataframeEvaluationBuilders {
	private DataframeEvaluationBuilders() {
	}

	/**
	 * Creates a builder for the {@link DataframeEvaluationClassification
	 * classification} {@code DataframeEvaluation} variant.
	 */
	public static DataframeEvaluationClassification.Builder classification() {
		return new DataframeEvaluationClassification.Builder();
	}

	/**
	 * Creates a DataframeEvaluation of the {@link DataframeEvaluationClassification
	 * classification} {@code DataframeEvaluation} variant.
	 */
	public static DataframeEvaluation classification(
			Function<DataframeEvaluationClassification.Builder, ObjectBuilder<DataframeEvaluationClassification>> fn) {
		DataframeEvaluation.Builder builder = new DataframeEvaluation.Builder();
		builder.classification(fn.apply(new DataframeEvaluationClassification.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link DataframeEvaluationOutlierDetection
	 * outlier_detection} {@code DataframeEvaluation} variant.
	 */
	public static DataframeEvaluationOutlierDetection.Builder outlierDetection() {
		return new DataframeEvaluationOutlierDetection.Builder();
	}

	/**
	 * Creates a DataframeEvaluation of the
	 * {@link DataframeEvaluationOutlierDetection outlier_detection}
	 * {@code DataframeEvaluation} variant.
	 */
	public static DataframeEvaluation outlierDetection(
			Function<DataframeEvaluationOutlierDetection.Builder, ObjectBuilder<DataframeEvaluationOutlierDetection>> fn) {
		DataframeEvaluation.Builder builder = new DataframeEvaluation.Builder();
		builder.outlierDetection(fn.apply(new DataframeEvaluationOutlierDetection.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link DataframeEvaluationRegression regression}
	 * {@code DataframeEvaluation} variant.
	 */
	public static DataframeEvaluationRegression.Builder regression() {
		return new DataframeEvaluationRegression.Builder();
	}

	/**
	 * Creates a DataframeEvaluation of the {@link DataframeEvaluationRegression
	 * regression} {@code DataframeEvaluation} variant.
	 */
	public static DataframeEvaluation regression(
			Function<DataframeEvaluationRegression.Builder, ObjectBuilder<DataframeEvaluationRegression>> fn) {
		DataframeEvaluation.Builder builder = new DataframeEvaluation.Builder();
		builder.regression(fn.apply(new DataframeEvaluationRegression.Builder()).build());
		return builder.build();
	}

}
