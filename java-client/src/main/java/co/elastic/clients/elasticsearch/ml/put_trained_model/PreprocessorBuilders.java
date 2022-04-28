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

package co.elastic.clients.elasticsearch.ml.put_trained_model;

import co.elastic.clients.util.ObjectBuilder;
import java.util.function.Function;

/**
 * Builders for {@link Preprocessor} variants.
 */
public class PreprocessorBuilders {
	private PreprocessorBuilders() {
	}

	/**
	 * Creates a builder for the {@link FrequencyEncodingPreprocessor
	 * frequency_encoding} {@code Preprocessor} variant.
	 */
	public static FrequencyEncodingPreprocessor.Builder frequencyEncoding() {
		return new FrequencyEncodingPreprocessor.Builder();
	}

	/**
	 * Creates a Preprocessor of the {@link FrequencyEncodingPreprocessor
	 * frequency_encoding} {@code Preprocessor} variant.
	 */
	public static Preprocessor frequencyEncoding(
			Function<FrequencyEncodingPreprocessor.Builder, ObjectBuilder<FrequencyEncodingPreprocessor>> fn) {
		Preprocessor.Builder builder = new Preprocessor.Builder();
		builder.frequencyEncoding(fn.apply(new FrequencyEncodingPreprocessor.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link OneHotEncodingPreprocessor one_hot_encoding}
	 * {@code Preprocessor} variant.
	 */
	public static OneHotEncodingPreprocessor.Builder oneHotEncoding() {
		return new OneHotEncodingPreprocessor.Builder();
	}

	/**
	 * Creates a Preprocessor of the {@link OneHotEncodingPreprocessor
	 * one_hot_encoding} {@code Preprocessor} variant.
	 */
	public static Preprocessor oneHotEncoding(
			Function<OneHotEncodingPreprocessor.Builder, ObjectBuilder<OneHotEncodingPreprocessor>> fn) {
		Preprocessor.Builder builder = new Preprocessor.Builder();
		builder.oneHotEncoding(fn.apply(new OneHotEncodingPreprocessor.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link TargetMeanEncodingPreprocessor
	 * target_mean_encoding} {@code Preprocessor} variant.
	 */
	public static TargetMeanEncodingPreprocessor.Builder targetMeanEncoding() {
		return new TargetMeanEncodingPreprocessor.Builder();
	}

	/**
	 * Creates a Preprocessor of the {@link TargetMeanEncodingPreprocessor
	 * target_mean_encoding} {@code Preprocessor} variant.
	 */
	public static Preprocessor targetMeanEncoding(
			Function<TargetMeanEncodingPreprocessor.Builder, ObjectBuilder<TargetMeanEncodingPreprocessor>> fn) {
		Preprocessor.Builder builder = new Preprocessor.Builder();
		builder.targetMeanEncoding(fn.apply(new TargetMeanEncodingPreprocessor.Builder()).build());
		return builder.build();
	}

}
