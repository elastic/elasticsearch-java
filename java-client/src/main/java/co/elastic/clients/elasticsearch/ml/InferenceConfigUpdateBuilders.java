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
 * Builders for {@link InferenceConfigUpdate} variants.
 */
public class InferenceConfigUpdateBuilders {
	private InferenceConfigUpdateBuilders() {
	}

	/**
	 * Creates a builder for the {@link RegressionInferenceOptions regression}
	 * {@code InferenceConfigUpdate} variant.
	 */
	public static RegressionInferenceOptions.Builder regression() {
		return new RegressionInferenceOptions.Builder();
	}

	/**
	 * Creates a InferenceConfigUpdate of the {@link RegressionInferenceOptions
	 * regression} {@code InferenceConfigUpdate} variant.
	 */
	public static InferenceConfigUpdate regression(
			Function<RegressionInferenceOptions.Builder, ObjectBuilder<RegressionInferenceOptions>> fn) {
		InferenceConfigUpdate.Builder builder = new InferenceConfigUpdate.Builder();
		builder.regression(fn.apply(new RegressionInferenceOptions.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ClassificationInferenceOptions
	 * classification} {@code InferenceConfigUpdate} variant.
	 */
	public static ClassificationInferenceOptions.Builder classification() {
		return new ClassificationInferenceOptions.Builder();
	}

	/**
	 * Creates a InferenceConfigUpdate of the {@link ClassificationInferenceOptions
	 * classification} {@code InferenceConfigUpdate} variant.
	 */
	public static InferenceConfigUpdate classification(
			Function<ClassificationInferenceOptions.Builder, ObjectBuilder<ClassificationInferenceOptions>> fn) {
		InferenceConfigUpdate.Builder builder = new InferenceConfigUpdate.Builder();
		builder.classification(fn.apply(new ClassificationInferenceOptions.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link TextClassificationInferenceUpdateOptions
	 * text_classification} {@code InferenceConfigUpdate} variant.
	 */
	public static TextClassificationInferenceUpdateOptions.Builder textClassification() {
		return new TextClassificationInferenceUpdateOptions.Builder();
	}

	/**
	 * Creates a InferenceConfigUpdate of the
	 * {@link TextClassificationInferenceUpdateOptions text_classification}
	 * {@code InferenceConfigUpdate} variant.
	 */
	public static InferenceConfigUpdate textClassification(
			Function<TextClassificationInferenceUpdateOptions.Builder, ObjectBuilder<TextClassificationInferenceUpdateOptions>> fn) {
		InferenceConfigUpdate.Builder builder = new InferenceConfigUpdate.Builder();
		builder.textClassification(fn.apply(new TextClassificationInferenceUpdateOptions.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ZeroShotClassificationInferenceUpdateOptions
	 * zero_shot_classification} {@code InferenceConfigUpdate} variant.
	 */
	public static ZeroShotClassificationInferenceUpdateOptions.Builder zeroShotClassification() {
		return new ZeroShotClassificationInferenceUpdateOptions.Builder();
	}

	/**
	 * Creates a InferenceConfigUpdate of the
	 * {@link ZeroShotClassificationInferenceUpdateOptions zero_shot_classification}
	 * {@code InferenceConfigUpdate} variant.
	 */
	public static InferenceConfigUpdate zeroShotClassification(
			Function<ZeroShotClassificationInferenceUpdateOptions.Builder, ObjectBuilder<ZeroShotClassificationInferenceUpdateOptions>> fn) {
		InferenceConfigUpdate.Builder builder = new InferenceConfigUpdate.Builder();
		builder.zeroShotClassification(fn.apply(new ZeroShotClassificationInferenceUpdateOptions.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link FillMaskInferenceUpdateOptions fill_mask}
	 * {@code InferenceConfigUpdate} variant.
	 */
	public static FillMaskInferenceUpdateOptions.Builder fillMask() {
		return new FillMaskInferenceUpdateOptions.Builder();
	}

	/**
	 * Creates a InferenceConfigUpdate of the {@link FillMaskInferenceUpdateOptions
	 * fill_mask} {@code InferenceConfigUpdate} variant.
	 */
	public static InferenceConfigUpdate fillMask(
			Function<FillMaskInferenceUpdateOptions.Builder, ObjectBuilder<FillMaskInferenceUpdateOptions>> fn) {
		InferenceConfigUpdate.Builder builder = new InferenceConfigUpdate.Builder();
		builder.fillMask(fn.apply(new FillMaskInferenceUpdateOptions.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link NerInferenceUpdateOptions ner}
	 * {@code InferenceConfigUpdate} variant.
	 */
	public static NerInferenceUpdateOptions.Builder ner() {
		return new NerInferenceUpdateOptions.Builder();
	}

	/**
	 * Creates a InferenceConfigUpdate of the {@link NerInferenceUpdateOptions ner}
	 * {@code InferenceConfigUpdate} variant.
	 */
	public static InferenceConfigUpdate ner(
			Function<NerInferenceUpdateOptions.Builder, ObjectBuilder<NerInferenceUpdateOptions>> fn) {
		InferenceConfigUpdate.Builder builder = new InferenceConfigUpdate.Builder();
		builder.ner(fn.apply(new NerInferenceUpdateOptions.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link PassThroughInferenceUpdateOptions
	 * pass_through} {@code InferenceConfigUpdate} variant.
	 */
	public static PassThroughInferenceUpdateOptions.Builder passThrough() {
		return new PassThroughInferenceUpdateOptions.Builder();
	}

	/**
	 * Creates a InferenceConfigUpdate of the
	 * {@link PassThroughInferenceUpdateOptions pass_through}
	 * {@code InferenceConfigUpdate} variant.
	 */
	public static InferenceConfigUpdate passThrough(
			Function<PassThroughInferenceUpdateOptions.Builder, ObjectBuilder<PassThroughInferenceUpdateOptions>> fn) {
		InferenceConfigUpdate.Builder builder = new InferenceConfigUpdate.Builder();
		builder.passThrough(fn.apply(new PassThroughInferenceUpdateOptions.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link TextEmbeddingInferenceUpdateOptions
	 * text_embedding} {@code InferenceConfigUpdate} variant.
	 */
	public static TextEmbeddingInferenceUpdateOptions.Builder textEmbedding() {
		return new TextEmbeddingInferenceUpdateOptions.Builder();
	}

	/**
	 * Creates a InferenceConfigUpdate of the
	 * {@link TextEmbeddingInferenceUpdateOptions text_embedding}
	 * {@code InferenceConfigUpdate} variant.
	 */
	public static InferenceConfigUpdate textEmbedding(
			Function<TextEmbeddingInferenceUpdateOptions.Builder, ObjectBuilder<TextEmbeddingInferenceUpdateOptions>> fn) {
		InferenceConfigUpdate.Builder builder = new InferenceConfigUpdate.Builder();
		builder.textEmbedding(fn.apply(new TextEmbeddingInferenceUpdateOptions.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link TextExpansionInferenceUpdateOptions
	 * text_expansion} {@code InferenceConfigUpdate} variant.
	 */
	public static TextExpansionInferenceUpdateOptions.Builder textExpansion() {
		return new TextExpansionInferenceUpdateOptions.Builder();
	}

	/**
	 * Creates a InferenceConfigUpdate of the
	 * {@link TextExpansionInferenceUpdateOptions text_expansion}
	 * {@code InferenceConfigUpdate} variant.
	 */
	public static InferenceConfigUpdate textExpansion(
			Function<TextExpansionInferenceUpdateOptions.Builder, ObjectBuilder<TextExpansionInferenceUpdateOptions>> fn) {
		InferenceConfigUpdate.Builder builder = new InferenceConfigUpdate.Builder();
		builder.textExpansion(fn.apply(new TextExpansionInferenceUpdateOptions.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link QuestionAnsweringInferenceUpdateOptions
	 * question_answering} {@code InferenceConfigUpdate} variant.
	 */
	public static QuestionAnsweringInferenceUpdateOptions.Builder questionAnswering() {
		return new QuestionAnsweringInferenceUpdateOptions.Builder();
	}

	/**
	 * Creates a InferenceConfigUpdate of the
	 * {@link QuestionAnsweringInferenceUpdateOptions question_answering}
	 * {@code InferenceConfigUpdate} variant.
	 */
	public static InferenceConfigUpdate questionAnswering(
			Function<QuestionAnsweringInferenceUpdateOptions.Builder, ObjectBuilder<QuestionAnsweringInferenceUpdateOptions>> fn) {
		InferenceConfigUpdate.Builder builder = new InferenceConfigUpdate.Builder();
		builder.questionAnswering(fn.apply(new QuestionAnsweringInferenceUpdateOptions.Builder()).build());
		return builder.build();
	}

}
