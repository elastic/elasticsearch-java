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
 * Builders for {@link NlpInferenceConfigUpdate} variants.
 */
public class NlpInferenceConfigUpdateBuilders {
	private NlpInferenceConfigUpdateBuilders() {
	}

	/**
	 * Creates a builder for the {@link TextClassificationInferenceUpdateOptions
	 * text_classification} {@code NlpInferenceConfigUpdate} variant.
	 */
	public static TextClassificationInferenceUpdateOptions.Builder textClassification() {
		return new TextClassificationInferenceUpdateOptions.Builder();
	}

	/**
	 * Creates a NlpInferenceConfigUpdate of the
	 * {@link TextClassificationInferenceUpdateOptions text_classification}
	 * {@code NlpInferenceConfigUpdate} variant.
	 */
	public static NlpInferenceConfigUpdate textClassification(
			Function<TextClassificationInferenceUpdateOptions.Builder, ObjectBuilder<TextClassificationInferenceUpdateOptions>> fn) {
		NlpInferenceConfigUpdate.Builder builder = new NlpInferenceConfigUpdate.Builder();
		builder.textClassification(fn.apply(new TextClassificationInferenceUpdateOptions.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ZeroShotClassificationInferenceUpdateOptions
	 * zero_shot_classification} {@code NlpInferenceConfigUpdate} variant.
	 */
	public static ZeroShotClassificationInferenceUpdateOptions.Builder zeroShotClassification() {
		return new ZeroShotClassificationInferenceUpdateOptions.Builder();
	}

	/**
	 * Creates a NlpInferenceConfigUpdate of the
	 * {@link ZeroShotClassificationInferenceUpdateOptions zero_shot_classification}
	 * {@code NlpInferenceConfigUpdate} variant.
	 */
	public static NlpInferenceConfigUpdate zeroShotClassification(
			Function<ZeroShotClassificationInferenceUpdateOptions.Builder, ObjectBuilder<ZeroShotClassificationInferenceUpdateOptions>> fn) {
		NlpInferenceConfigUpdate.Builder builder = new NlpInferenceConfigUpdate.Builder();
		builder.zeroShotClassification(fn.apply(new ZeroShotClassificationInferenceUpdateOptions.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link FillMaskInferenceUpdateOptions fill_mask}
	 * {@code NlpInferenceConfigUpdate} variant.
	 */
	public static FillMaskInferenceUpdateOptions.Builder fillMask() {
		return new FillMaskInferenceUpdateOptions.Builder();
	}

	/**
	 * Creates a NlpInferenceConfigUpdate of the
	 * {@link FillMaskInferenceUpdateOptions fill_mask}
	 * {@code NlpInferenceConfigUpdate} variant.
	 */
	public static NlpInferenceConfigUpdate fillMask(
			Function<FillMaskInferenceUpdateOptions.Builder, ObjectBuilder<FillMaskInferenceUpdateOptions>> fn) {
		NlpInferenceConfigUpdate.Builder builder = new NlpInferenceConfigUpdate.Builder();
		builder.fillMask(fn.apply(new FillMaskInferenceUpdateOptions.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link NerInferenceUpdateOptions ner}
	 * {@code NlpInferenceConfigUpdate} variant.
	 */
	public static NerInferenceUpdateOptions.Builder ner() {
		return new NerInferenceUpdateOptions.Builder();
	}

	/**
	 * Creates a NlpInferenceConfigUpdate of the {@link NerInferenceUpdateOptions
	 * ner} {@code NlpInferenceConfigUpdate} variant.
	 */
	public static NlpInferenceConfigUpdate ner(
			Function<NerInferenceUpdateOptions.Builder, ObjectBuilder<NerInferenceUpdateOptions>> fn) {
		NlpInferenceConfigUpdate.Builder builder = new NlpInferenceConfigUpdate.Builder();
		builder.ner(fn.apply(new NerInferenceUpdateOptions.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link PassThroughInferenceUpdateOptions
	 * pass_through} {@code NlpInferenceConfigUpdate} variant.
	 */
	public static PassThroughInferenceUpdateOptions.Builder passThrough() {
		return new PassThroughInferenceUpdateOptions.Builder();
	}

	/**
	 * Creates a NlpInferenceConfigUpdate of the
	 * {@link PassThroughInferenceUpdateOptions pass_through}
	 * {@code NlpInferenceConfigUpdate} variant.
	 */
	public static NlpInferenceConfigUpdate passThrough(
			Function<PassThroughInferenceUpdateOptions.Builder, ObjectBuilder<PassThroughInferenceUpdateOptions>> fn) {
		NlpInferenceConfigUpdate.Builder builder = new NlpInferenceConfigUpdate.Builder();
		builder.passThrough(fn.apply(new PassThroughInferenceUpdateOptions.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link TextEmbeddingInferenceUpdateOptions
	 * text_embedding} {@code NlpInferenceConfigUpdate} variant.
	 */
	public static TextEmbeddingInferenceUpdateOptions.Builder textEmbedding() {
		return new TextEmbeddingInferenceUpdateOptions.Builder();
	}

	/**
	 * Creates a NlpInferenceConfigUpdate of the
	 * {@link TextEmbeddingInferenceUpdateOptions text_embedding}
	 * {@code NlpInferenceConfigUpdate} variant.
	 */
	public static NlpInferenceConfigUpdate textEmbedding(
			Function<TextEmbeddingInferenceUpdateOptions.Builder, ObjectBuilder<TextEmbeddingInferenceUpdateOptions>> fn) {
		NlpInferenceConfigUpdate.Builder builder = new NlpInferenceConfigUpdate.Builder();
		builder.textEmbedding(fn.apply(new TextEmbeddingInferenceUpdateOptions.Builder()).build());
		return builder.build();
	}

}
