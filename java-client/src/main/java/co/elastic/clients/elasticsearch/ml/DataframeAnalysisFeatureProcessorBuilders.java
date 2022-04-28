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
 * Builders for {@link DataframeAnalysisFeatureProcessor} variants.
 */
public class DataframeAnalysisFeatureProcessorBuilders {
	private DataframeAnalysisFeatureProcessorBuilders() {
	}

	/**
	 * Creates a builder for the
	 * {@link DataframeAnalysisFeatureProcessorFrequencyEncoding frequency_encoding}
	 * {@code DataframeAnalysisFeatureProcessor} variant.
	 */
	public static DataframeAnalysisFeatureProcessorFrequencyEncoding.Builder frequencyEncoding() {
		return new DataframeAnalysisFeatureProcessorFrequencyEncoding.Builder();
	}

	/**
	 * Creates a DataframeAnalysisFeatureProcessor of the
	 * {@link DataframeAnalysisFeatureProcessorFrequencyEncoding frequency_encoding}
	 * {@code DataframeAnalysisFeatureProcessor} variant.
	 */
	public static DataframeAnalysisFeatureProcessor frequencyEncoding(
			Function<DataframeAnalysisFeatureProcessorFrequencyEncoding.Builder, ObjectBuilder<DataframeAnalysisFeatureProcessorFrequencyEncoding>> fn) {
		DataframeAnalysisFeatureProcessor.Builder builder = new DataframeAnalysisFeatureProcessor.Builder();
		builder.frequencyEncoding(fn.apply(new DataframeAnalysisFeatureProcessorFrequencyEncoding.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the
	 * {@link DataframeAnalysisFeatureProcessorMultiEncoding multi_encoding}
	 * {@code DataframeAnalysisFeatureProcessor} variant.
	 */
	public static DataframeAnalysisFeatureProcessorMultiEncoding.Builder multiEncoding() {
		return new DataframeAnalysisFeatureProcessorMultiEncoding.Builder();
	}

	/**
	 * Creates a DataframeAnalysisFeatureProcessor of the
	 * {@link DataframeAnalysisFeatureProcessorMultiEncoding multi_encoding}
	 * {@code DataframeAnalysisFeatureProcessor} variant.
	 */
	public static DataframeAnalysisFeatureProcessor multiEncoding(
			Function<DataframeAnalysisFeatureProcessorMultiEncoding.Builder, ObjectBuilder<DataframeAnalysisFeatureProcessorMultiEncoding>> fn) {
		DataframeAnalysisFeatureProcessor.Builder builder = new DataframeAnalysisFeatureProcessor.Builder();
		builder.multiEncoding(fn.apply(new DataframeAnalysisFeatureProcessorMultiEncoding.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the
	 * {@link DataframeAnalysisFeatureProcessorNGramEncoding n_gram_encoding}
	 * {@code DataframeAnalysisFeatureProcessor} variant.
	 */
	public static DataframeAnalysisFeatureProcessorNGramEncoding.Builder nGramEncoding() {
		return new DataframeAnalysisFeatureProcessorNGramEncoding.Builder();
	}

	/**
	 * Creates a DataframeAnalysisFeatureProcessor of the
	 * {@link DataframeAnalysisFeatureProcessorNGramEncoding n_gram_encoding}
	 * {@code DataframeAnalysisFeatureProcessor} variant.
	 */
	public static DataframeAnalysisFeatureProcessor nGramEncoding(
			Function<DataframeAnalysisFeatureProcessorNGramEncoding.Builder, ObjectBuilder<DataframeAnalysisFeatureProcessorNGramEncoding>> fn) {
		DataframeAnalysisFeatureProcessor.Builder builder = new DataframeAnalysisFeatureProcessor.Builder();
		builder.nGramEncoding(fn.apply(new DataframeAnalysisFeatureProcessorNGramEncoding.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the
	 * {@link DataframeAnalysisFeatureProcessorOneHotEncoding one_hot_encoding}
	 * {@code DataframeAnalysisFeatureProcessor} variant.
	 */
	public static DataframeAnalysisFeatureProcessorOneHotEncoding.Builder oneHotEncoding() {
		return new DataframeAnalysisFeatureProcessorOneHotEncoding.Builder();
	}

	/**
	 * Creates a DataframeAnalysisFeatureProcessor of the
	 * {@link DataframeAnalysisFeatureProcessorOneHotEncoding one_hot_encoding}
	 * {@code DataframeAnalysisFeatureProcessor} variant.
	 */
	public static DataframeAnalysisFeatureProcessor oneHotEncoding(
			Function<DataframeAnalysisFeatureProcessorOneHotEncoding.Builder, ObjectBuilder<DataframeAnalysisFeatureProcessorOneHotEncoding>> fn) {
		DataframeAnalysisFeatureProcessor.Builder builder = new DataframeAnalysisFeatureProcessor.Builder();
		builder.oneHotEncoding(fn.apply(new DataframeAnalysisFeatureProcessorOneHotEncoding.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the
	 * {@link DataframeAnalysisFeatureProcessorTargetMeanEncoding
	 * target_mean_encoding} {@code DataframeAnalysisFeatureProcessor} variant.
	 */
	public static DataframeAnalysisFeatureProcessorTargetMeanEncoding.Builder targetMeanEncoding() {
		return new DataframeAnalysisFeatureProcessorTargetMeanEncoding.Builder();
	}

	/**
	 * Creates a DataframeAnalysisFeatureProcessor of the
	 * {@link DataframeAnalysisFeatureProcessorTargetMeanEncoding
	 * target_mean_encoding} {@code DataframeAnalysisFeatureProcessor} variant.
	 */
	public static DataframeAnalysisFeatureProcessor targetMeanEncoding(
			Function<DataframeAnalysisFeatureProcessorTargetMeanEncoding.Builder, ObjectBuilder<DataframeAnalysisFeatureProcessorTargetMeanEncoding>> fn) {
		DataframeAnalysisFeatureProcessor.Builder builder = new DataframeAnalysisFeatureProcessor.Builder();
		builder.targetMeanEncoding(fn.apply(new DataframeAnalysisFeatureProcessorTargetMeanEncoding.Builder()).build());
		return builder.build();
	}

}
