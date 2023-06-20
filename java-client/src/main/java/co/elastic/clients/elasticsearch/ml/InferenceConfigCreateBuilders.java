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
 * Builders for {@link InferenceConfigCreate} variants.
 */
public class InferenceConfigCreateBuilders {
	private InferenceConfigCreateBuilders() {
	}

	/**
	 * Creates a builder for the {@link RegressionInferenceOptions regression}
	 * {@code InferenceConfigCreate} variant.
	 */
	public static RegressionInferenceOptions.Builder regression() {
		return new RegressionInferenceOptions.Builder();
	}

	/**
	 * Creates a InferenceConfigCreate of the {@link RegressionInferenceOptions
	 * regression} {@code InferenceConfigCreate} variant.
	 */
	public static InferenceConfigCreate regression(
			Function<RegressionInferenceOptions.Builder, ObjectBuilder<RegressionInferenceOptions>> fn) {
		InferenceConfigCreate.Builder builder = new InferenceConfigCreate.Builder();
		builder.regression(fn.apply(new RegressionInferenceOptions.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ClassificationInferenceOptions
	 * classification} {@code InferenceConfigCreate} variant.
	 */
	public static ClassificationInferenceOptions.Builder classification() {
		return new ClassificationInferenceOptions.Builder();
	}

	/**
	 * Creates a InferenceConfigCreate of the {@link ClassificationInferenceOptions
	 * classification} {@code InferenceConfigCreate} variant.
	 */
	public static InferenceConfigCreate classification(
			Function<ClassificationInferenceOptions.Builder, ObjectBuilder<ClassificationInferenceOptions>> fn) {
		InferenceConfigCreate.Builder builder = new InferenceConfigCreate.Builder();
		builder.classification(fn.apply(new ClassificationInferenceOptions.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link TextClassificationInferenceOptions
	 * text_classification} {@code InferenceConfigCreate} variant.
	 */
	public static TextClassificationInferenceOptions.Builder textClassification() {
		return new TextClassificationInferenceOptions.Builder();
	}

	/**
	 * Creates a InferenceConfigCreate of the
	 * {@link TextClassificationInferenceOptions text_classification}
	 * {@code InferenceConfigCreate} variant.
	 */
	public static InferenceConfigCreate textClassification(
			Function<TextClassificationInferenceOptions.Builder, ObjectBuilder<TextClassificationInferenceOptions>> fn) {
		InferenceConfigCreate.Builder builder = new InferenceConfigCreate.Builder();
		builder.textClassification(fn.apply(new TextClassificationInferenceOptions.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link ZeroShotClassificationInferenceOptions
	 * zero_shot_classification} {@code InferenceConfigCreate} variant.
	 */
	public static ZeroShotClassificationInferenceOptions.Builder zeroShotClassification() {
		return new ZeroShotClassificationInferenceOptions.Builder();
	}

	/**
	 * Creates a InferenceConfigCreate of the
	 * {@link ZeroShotClassificationInferenceOptions zero_shot_classification}
	 * {@code InferenceConfigCreate} variant.
	 */
	public static InferenceConfigCreate zeroShotClassification(
			Function<ZeroShotClassificationInferenceOptions.Builder, ObjectBuilder<ZeroShotClassificationInferenceOptions>> fn) {
		InferenceConfigCreate.Builder builder = new InferenceConfigCreate.Builder();
		builder.zeroShotClassification(fn.apply(new ZeroShotClassificationInferenceOptions.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link FillMaskInferenceOptions fill_mask}
	 * {@code InferenceConfigCreate} variant.
	 */
	public static FillMaskInferenceOptions.Builder fillMask() {
		return new FillMaskInferenceOptions.Builder();
	}

	/**
	 * Creates a InferenceConfigCreate of the {@link FillMaskInferenceOptions
	 * fill_mask} {@code InferenceConfigCreate} variant.
	 */
	public static InferenceConfigCreate fillMask(
			Function<FillMaskInferenceOptions.Builder, ObjectBuilder<FillMaskInferenceOptions>> fn) {
		InferenceConfigCreate.Builder builder = new InferenceConfigCreate.Builder();
		builder.fillMask(fn.apply(new FillMaskInferenceOptions.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link NerInferenceOptions ner}
	 * {@code InferenceConfigCreate} variant.
	 */
	public static NerInferenceOptions.Builder ner() {
		return new NerInferenceOptions.Builder();
	}

	/**
	 * Creates a InferenceConfigCreate of the {@link NerInferenceOptions ner}
	 * {@code InferenceConfigCreate} variant.
	 */
	public static InferenceConfigCreate ner(
			Function<NerInferenceOptions.Builder, ObjectBuilder<NerInferenceOptions>> fn) {
		InferenceConfigCreate.Builder builder = new InferenceConfigCreate.Builder();
		builder.ner(fn.apply(new NerInferenceOptions.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link PassThroughInferenceOptions pass_through}
	 * {@code InferenceConfigCreate} variant.
	 */
	public static PassThroughInferenceOptions.Builder passThrough() {
		return new PassThroughInferenceOptions.Builder();
	}

	/**
	 * Creates a InferenceConfigCreate of the {@link PassThroughInferenceOptions
	 * pass_through} {@code InferenceConfigCreate} variant.
	 */
	public static InferenceConfigCreate passThrough(
			Function<PassThroughInferenceOptions.Builder, ObjectBuilder<PassThroughInferenceOptions>> fn) {
		InferenceConfigCreate.Builder builder = new InferenceConfigCreate.Builder();
		builder.passThrough(fn.apply(new PassThroughInferenceOptions.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link TextEmbeddingInferenceOptions
	 * text_embedding} {@code InferenceConfigCreate} variant.
	 */
	public static TextEmbeddingInferenceOptions.Builder textEmbedding() {
		return new TextEmbeddingInferenceOptions.Builder();
	}

	/**
	 * Creates a InferenceConfigCreate of the {@link TextEmbeddingInferenceOptions
	 * text_embedding} {@code InferenceConfigCreate} variant.
	 */
	public static InferenceConfigCreate textEmbedding(
			Function<TextEmbeddingInferenceOptions.Builder, ObjectBuilder<TextEmbeddingInferenceOptions>> fn) {
		InferenceConfigCreate.Builder builder = new InferenceConfigCreate.Builder();
		builder.textEmbedding(fn.apply(new TextEmbeddingInferenceOptions.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link TextExpansionInferenceOptions
	 * text_expansion} {@code InferenceConfigCreate} variant.
	 */
	public static TextExpansionInferenceOptions.Builder textExpansion() {
		return new TextExpansionInferenceOptions.Builder();
	}

	/**
	 * Creates a InferenceConfigCreate of the {@link TextExpansionInferenceOptions
	 * text_expansion} {@code InferenceConfigCreate} variant.
	 */
	public static InferenceConfigCreate textExpansion(
			Function<TextExpansionInferenceOptions.Builder, ObjectBuilder<TextExpansionInferenceOptions>> fn) {
		InferenceConfigCreate.Builder builder = new InferenceConfigCreate.Builder();
		builder.textExpansion(fn.apply(new TextExpansionInferenceOptions.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link QuestionAnsweringInferenceOptions
	 * question_answering} {@code InferenceConfigCreate} variant.
	 */
	public static QuestionAnsweringInferenceOptions.Builder questionAnswering() {
		return new QuestionAnsweringInferenceOptions.Builder();
	}

	/**
	 * Creates a InferenceConfigCreate of the
	 * {@link QuestionAnsweringInferenceOptions question_answering}
	 * {@code InferenceConfigCreate} variant.
	 */
	public static InferenceConfigCreate questionAnswering(
			Function<QuestionAnsweringInferenceOptions.Builder, ObjectBuilder<QuestionAnsweringInferenceOptions>> fn) {
		InferenceConfigCreate.Builder builder = new InferenceConfigCreate.Builder();
		builder.questionAnswering(fn.apply(new QuestionAnsweringInferenceOptions.Builder()).build());
		return builder.build();
	}

}
