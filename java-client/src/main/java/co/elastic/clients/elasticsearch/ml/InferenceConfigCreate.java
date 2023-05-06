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

import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.InferenceConfigCreateContainer

/**
 * Inference configuration provided when storing the model config
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#ml._types.InferenceConfigCreateContainer">API
 *      specification</a>
 */
@JsonpDeserializable
public class InferenceConfigCreate implements TaggedUnion<InferenceConfigCreate.Kind, Object>, JsonpSerializable {

	/**
	 * {@link InferenceConfigCreate} variant kinds.
	 * 
	 * @see <a href=
	 *      "../doc-files/api-spec.html#ml._types.InferenceConfigCreateContainer">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		Regression("regression"),

		Classification("classification"),

		TextClassification("text_classification"),

		ZeroShotClassification("zero_shot_classification"),

		FillMask("fill_mask"),

		Ner("ner"),

		PassThrough("pass_through"),

		TextEmbedding("text_embedding"),

		TextExpansion("text_expansion"),

		QuestionAnswering("question_answering"),

		;

		private final String jsonValue;

		Kind(String jsonValue) {
			this.jsonValue = jsonValue;
		}

		public String jsonValue() {
			return this.jsonValue;
		}

	}

	private final Kind _kind;
	private final Object _value;

	@Override
	public final Kind _kind() {
		return _kind;
	}

	@Override
	public final Object _get() {
		return _value;
	}

	public InferenceConfigCreate(InferenceConfigCreateVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._inferenceConfigCreateKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private InferenceConfigCreate(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static InferenceConfigCreate of(Function<Builder, ObjectBuilder<InferenceConfigCreate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code regression}?
	 */
	public boolean isRegression() {
		return _kind == Kind.Regression;
	}

	/**
	 * Get the {@code regression} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code regression} kind.
	 */
	public RegressionInferenceOptions regression() {
		return TaggedUnionUtils.get(this, Kind.Regression);
	}

	/**
	 * Is this variant instance of kind {@code classification}?
	 */
	public boolean isClassification() {
		return _kind == Kind.Classification;
	}

	/**
	 * Get the {@code classification} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code classification} kind.
	 */
	public ClassificationInferenceOptions classification() {
		return TaggedUnionUtils.get(this, Kind.Classification);
	}

	/**
	 * Is this variant instance of kind {@code text_classification}?
	 */
	public boolean isTextClassification() {
		return _kind == Kind.TextClassification;
	}

	/**
	 * Get the {@code text_classification} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code text_classification}
	 *             kind.
	 */
	public TextClassificationInferenceOptions textClassification() {
		return TaggedUnionUtils.get(this, Kind.TextClassification);
	}

	/**
	 * Is this variant instance of kind {@code zero_shot_classification}?
	 */
	public boolean isZeroShotClassification() {
		return _kind == Kind.ZeroShotClassification;
	}

	/**
	 * Get the {@code zero_shot_classification} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the
	 *             {@code zero_shot_classification} kind.
	 */
	public ZeroShotClassificationInferenceOptions zeroShotClassification() {
		return TaggedUnionUtils.get(this, Kind.ZeroShotClassification);
	}

	/**
	 * Is this variant instance of kind {@code fill_mask}?
	 */
	public boolean isFillMask() {
		return _kind == Kind.FillMask;
	}

	/**
	 * Get the {@code fill_mask} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code fill_mask} kind.
	 */
	public FillMaskInferenceOptions fillMask() {
		return TaggedUnionUtils.get(this, Kind.FillMask);
	}

	/**
	 * Is this variant instance of kind {@code ner}?
	 */
	public boolean isNer() {
		return _kind == Kind.Ner;
	}

	/**
	 * Get the {@code ner} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code ner} kind.
	 */
	public NerInferenceOptions ner() {
		return TaggedUnionUtils.get(this, Kind.Ner);
	}

	/**
	 * Is this variant instance of kind {@code pass_through}?
	 */
	public boolean isPassThrough() {
		return _kind == Kind.PassThrough;
	}

	/**
	 * Get the {@code pass_through} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code pass_through} kind.
	 */
	public PassThroughInferenceOptions passThrough() {
		return TaggedUnionUtils.get(this, Kind.PassThrough);
	}

	/**
	 * Is this variant instance of kind {@code text_embedding}?
	 */
	public boolean isTextEmbedding() {
		return _kind == Kind.TextEmbedding;
	}

	/**
	 * Get the {@code text_embedding} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code text_embedding} kind.
	 */
	public TextEmbeddingInferenceOptions textEmbedding() {
		return TaggedUnionUtils.get(this, Kind.TextEmbedding);
	}

	/**
	 * Is this variant instance of kind {@code text_expansion}?
	 */
	public boolean isTextExpansion() {
		return _kind == Kind.TextExpansion;
	}

	/**
	 * Get the {@code text_expansion} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code text_expansion} kind.
	 */
	public TextExpansionInferenceOptions textExpansion() {
		return TaggedUnionUtils.get(this, Kind.TextExpansion);
	}

	/**
	 * Is this variant instance of kind {@code question_answering}?
	 */
	public boolean isQuestionAnswering() {
		return _kind == Kind.QuestionAnswering;
	}

	/**
	 * Get the {@code question_answering} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code question_answering}
	 *             kind.
	 */
	public QuestionAnsweringInferenceOptions questionAnswering() {
		return TaggedUnionUtils.get(this, Kind.QuestionAnswering);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeStartObject();

		generator.writeKey(_kind.jsonValue());
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		}

		generator.writeEnd();

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<InferenceConfigCreate> {
		private Kind _kind;
		private Object _value;

		@Override
		protected Builder self() {
			return this;
		}
		public ObjectBuilder<InferenceConfigCreate> regression(RegressionInferenceOptions v) {
			this._kind = Kind.Regression;
			this._value = v;
			return this;
		}

		public ObjectBuilder<InferenceConfigCreate> regression(
				Function<RegressionInferenceOptions.Builder, ObjectBuilder<RegressionInferenceOptions>> fn) {
			return this.regression(fn.apply(new RegressionInferenceOptions.Builder()).build());
		}

		public ObjectBuilder<InferenceConfigCreate> classification(ClassificationInferenceOptions v) {
			this._kind = Kind.Classification;
			this._value = v;
			return this;
		}

		public ObjectBuilder<InferenceConfigCreate> classification(
				Function<ClassificationInferenceOptions.Builder, ObjectBuilder<ClassificationInferenceOptions>> fn) {
			return this.classification(fn.apply(new ClassificationInferenceOptions.Builder()).build());
		}

		public ObjectBuilder<InferenceConfigCreate> textClassification(TextClassificationInferenceOptions v) {
			this._kind = Kind.TextClassification;
			this._value = v;
			return this;
		}

		public ObjectBuilder<InferenceConfigCreate> textClassification(
				Function<TextClassificationInferenceOptions.Builder, ObjectBuilder<TextClassificationInferenceOptions>> fn) {
			return this.textClassification(fn.apply(new TextClassificationInferenceOptions.Builder()).build());
		}

		public ObjectBuilder<InferenceConfigCreate> zeroShotClassification(ZeroShotClassificationInferenceOptions v) {
			this._kind = Kind.ZeroShotClassification;
			this._value = v;
			return this;
		}

		public ObjectBuilder<InferenceConfigCreate> zeroShotClassification(
				Function<ZeroShotClassificationInferenceOptions.Builder, ObjectBuilder<ZeroShotClassificationInferenceOptions>> fn) {
			return this.zeroShotClassification(fn.apply(new ZeroShotClassificationInferenceOptions.Builder()).build());
		}

		public ObjectBuilder<InferenceConfigCreate> fillMask(FillMaskInferenceOptions v) {
			this._kind = Kind.FillMask;
			this._value = v;
			return this;
		}

		public ObjectBuilder<InferenceConfigCreate> fillMask(
				Function<FillMaskInferenceOptions.Builder, ObjectBuilder<FillMaskInferenceOptions>> fn) {
			return this.fillMask(fn.apply(new FillMaskInferenceOptions.Builder()).build());
		}

		public ObjectBuilder<InferenceConfigCreate> ner(NerInferenceOptions v) {
			this._kind = Kind.Ner;
			this._value = v;
			return this;
		}

		public ObjectBuilder<InferenceConfigCreate> ner(
				Function<NerInferenceOptions.Builder, ObjectBuilder<NerInferenceOptions>> fn) {
			return this.ner(fn.apply(new NerInferenceOptions.Builder()).build());
		}

		public ObjectBuilder<InferenceConfigCreate> passThrough(PassThroughInferenceOptions v) {
			this._kind = Kind.PassThrough;
			this._value = v;
			return this;
		}

		public ObjectBuilder<InferenceConfigCreate> passThrough(
				Function<PassThroughInferenceOptions.Builder, ObjectBuilder<PassThroughInferenceOptions>> fn) {
			return this.passThrough(fn.apply(new PassThroughInferenceOptions.Builder()).build());
		}

		public ObjectBuilder<InferenceConfigCreate> textEmbedding(TextEmbeddingInferenceOptions v) {
			this._kind = Kind.TextEmbedding;
			this._value = v;
			return this;
		}

		public ObjectBuilder<InferenceConfigCreate> textEmbedding(
				Function<TextEmbeddingInferenceOptions.Builder, ObjectBuilder<TextEmbeddingInferenceOptions>> fn) {
			return this.textEmbedding(fn.apply(new TextEmbeddingInferenceOptions.Builder()).build());
		}

		public ObjectBuilder<InferenceConfigCreate> textExpansion(TextExpansionInferenceOptions v) {
			this._kind = Kind.TextExpansion;
			this._value = v;
			return this;
		}

		public ObjectBuilder<InferenceConfigCreate> textExpansion(
				Function<TextExpansionInferenceOptions.Builder, ObjectBuilder<TextExpansionInferenceOptions>> fn) {
			return this.textExpansion(fn.apply(new TextExpansionInferenceOptions.Builder()).build());
		}

		public ObjectBuilder<InferenceConfigCreate> questionAnswering(QuestionAnsweringInferenceOptions v) {
			this._kind = Kind.QuestionAnswering;
			this._value = v;
			return this;
		}

		public ObjectBuilder<InferenceConfigCreate> questionAnswering(
				Function<QuestionAnsweringInferenceOptions.Builder, ObjectBuilder<QuestionAnsweringInferenceOptions>> fn) {
			return this.questionAnswering(fn.apply(new QuestionAnsweringInferenceOptions.Builder()).build());
		}

		public InferenceConfigCreate build() {
			_checkSingleUse();
			return new InferenceConfigCreate(this);
		}

	}

	protected static void setupInferenceConfigCreateDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::regression, RegressionInferenceOptions._DESERIALIZER, "regression");
		op.add(Builder::classification, ClassificationInferenceOptions._DESERIALIZER, "classification");
		op.add(Builder::textClassification, TextClassificationInferenceOptions._DESERIALIZER, "text_classification");
		op.add(Builder::zeroShotClassification, ZeroShotClassificationInferenceOptions._DESERIALIZER,
				"zero_shot_classification");
		op.add(Builder::fillMask, FillMaskInferenceOptions._DESERIALIZER, "fill_mask");
		op.add(Builder::ner, NerInferenceOptions._DESERIALIZER, "ner");
		op.add(Builder::passThrough, PassThroughInferenceOptions._DESERIALIZER, "pass_through");
		op.add(Builder::textEmbedding, TextEmbeddingInferenceOptions._DESERIALIZER, "text_embedding");
		op.add(Builder::textExpansion, TextExpansionInferenceOptions._DESERIALIZER, "text_expansion");
		op.add(Builder::questionAnswering, QuestionAnsweringInferenceOptions._DESERIALIZER, "question_answering");

	}

	public static final JsonpDeserializer<InferenceConfigCreate> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, InferenceConfigCreate::setupInferenceConfigCreateDeserializer, Builder::build);
}
