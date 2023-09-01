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

// typedef: ml._types.InferenceConfigUpdateContainer

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ml._types.InferenceConfigUpdateContainer">API
 *      specification</a>
 */
@JsonpDeserializable
public class InferenceConfigUpdate implements TaggedUnion<InferenceConfigUpdate.Kind, Object>, JsonpSerializable {

	/**
	 * {@link InferenceConfigUpdate} variant kinds.
	 * 
	 * @see <a href=
	 *      "../doc-files/api-spec.html#ml._types.InferenceConfigUpdateContainer">API
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

	public InferenceConfigUpdate(InferenceConfigUpdateVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._inferenceConfigUpdateKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private InferenceConfigUpdate(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static InferenceConfigUpdate of(Function<Builder, ObjectBuilder<InferenceConfigUpdate>> fn) {
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
	public TextClassificationInferenceUpdateOptions textClassification() {
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
	public ZeroShotClassificationInferenceUpdateOptions zeroShotClassification() {
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
	public FillMaskInferenceUpdateOptions fillMask() {
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
	public NerInferenceUpdateOptions ner() {
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
	public PassThroughInferenceUpdateOptions passThrough() {
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
	public TextEmbeddingInferenceUpdateOptions textEmbedding() {
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
	public TextExpansionInferenceUpdateOptions textExpansion() {
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
	public QuestionAnsweringInferenceUpdateOptions questionAnswering() {
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
				ObjectBuilder<InferenceConfigUpdate> {
		private Kind _kind;
		private Object _value;

		@Override
		protected Builder self() {
			return this;
		}
		public ObjectBuilder<InferenceConfigUpdate> regression(RegressionInferenceOptions v) {
			this._kind = Kind.Regression;
			this._value = v;
			return this;
		}

		public ObjectBuilder<InferenceConfigUpdate> regression(
				Function<RegressionInferenceOptions.Builder, ObjectBuilder<RegressionInferenceOptions>> fn) {
			return this.regression(fn.apply(new RegressionInferenceOptions.Builder()).build());
		}

		public ObjectBuilder<InferenceConfigUpdate> classification(ClassificationInferenceOptions v) {
			this._kind = Kind.Classification;
			this._value = v;
			return this;
		}

		public ObjectBuilder<InferenceConfigUpdate> classification(
				Function<ClassificationInferenceOptions.Builder, ObjectBuilder<ClassificationInferenceOptions>> fn) {
			return this.classification(fn.apply(new ClassificationInferenceOptions.Builder()).build());
		}

		public ObjectBuilder<InferenceConfigUpdate> textClassification(TextClassificationInferenceUpdateOptions v) {
			this._kind = Kind.TextClassification;
			this._value = v;
			return this;
		}

		public ObjectBuilder<InferenceConfigUpdate> textClassification(
				Function<TextClassificationInferenceUpdateOptions.Builder, ObjectBuilder<TextClassificationInferenceUpdateOptions>> fn) {
			return this.textClassification(fn.apply(new TextClassificationInferenceUpdateOptions.Builder()).build());
		}

		public ObjectBuilder<InferenceConfigUpdate> zeroShotClassification(
				ZeroShotClassificationInferenceUpdateOptions v) {
			this._kind = Kind.ZeroShotClassification;
			this._value = v;
			return this;
		}

		public ObjectBuilder<InferenceConfigUpdate> zeroShotClassification(
				Function<ZeroShotClassificationInferenceUpdateOptions.Builder, ObjectBuilder<ZeroShotClassificationInferenceUpdateOptions>> fn) {
			return this.zeroShotClassification(
					fn.apply(new ZeroShotClassificationInferenceUpdateOptions.Builder()).build());
		}

		public ObjectBuilder<InferenceConfigUpdate> fillMask(FillMaskInferenceUpdateOptions v) {
			this._kind = Kind.FillMask;
			this._value = v;
			return this;
		}

		public ObjectBuilder<InferenceConfigUpdate> fillMask(
				Function<FillMaskInferenceUpdateOptions.Builder, ObjectBuilder<FillMaskInferenceUpdateOptions>> fn) {
			return this.fillMask(fn.apply(new FillMaskInferenceUpdateOptions.Builder()).build());
		}

		public ObjectBuilder<InferenceConfigUpdate> ner(NerInferenceUpdateOptions v) {
			this._kind = Kind.Ner;
			this._value = v;
			return this;
		}

		public ObjectBuilder<InferenceConfigUpdate> ner(
				Function<NerInferenceUpdateOptions.Builder, ObjectBuilder<NerInferenceUpdateOptions>> fn) {
			return this.ner(fn.apply(new NerInferenceUpdateOptions.Builder()).build());
		}

		public ObjectBuilder<InferenceConfigUpdate> passThrough(PassThroughInferenceUpdateOptions v) {
			this._kind = Kind.PassThrough;
			this._value = v;
			return this;
		}

		public ObjectBuilder<InferenceConfigUpdate> passThrough(
				Function<PassThroughInferenceUpdateOptions.Builder, ObjectBuilder<PassThroughInferenceUpdateOptions>> fn) {
			return this.passThrough(fn.apply(new PassThroughInferenceUpdateOptions.Builder()).build());
		}

		public ObjectBuilder<InferenceConfigUpdate> textEmbedding(TextEmbeddingInferenceUpdateOptions v) {
			this._kind = Kind.TextEmbedding;
			this._value = v;
			return this;
		}

		public ObjectBuilder<InferenceConfigUpdate> textEmbedding(
				Function<TextEmbeddingInferenceUpdateOptions.Builder, ObjectBuilder<TextEmbeddingInferenceUpdateOptions>> fn) {
			return this.textEmbedding(fn.apply(new TextEmbeddingInferenceUpdateOptions.Builder()).build());
		}

		public ObjectBuilder<InferenceConfigUpdate> textExpansion(TextExpansionInferenceUpdateOptions v) {
			this._kind = Kind.TextExpansion;
			this._value = v;
			return this;
		}

		public ObjectBuilder<InferenceConfigUpdate> textExpansion(
				Function<TextExpansionInferenceUpdateOptions.Builder, ObjectBuilder<TextExpansionInferenceUpdateOptions>> fn) {
			return this.textExpansion(fn.apply(new TextExpansionInferenceUpdateOptions.Builder()).build());
		}

		public ObjectBuilder<InferenceConfigUpdate> questionAnswering(QuestionAnsweringInferenceUpdateOptions v) {
			this._kind = Kind.QuestionAnswering;
			this._value = v;
			return this;
		}

		public ObjectBuilder<InferenceConfigUpdate> questionAnswering(
				Function<QuestionAnsweringInferenceUpdateOptions.Builder, ObjectBuilder<QuestionAnsweringInferenceUpdateOptions>> fn) {
			return this.questionAnswering(fn.apply(new QuestionAnsweringInferenceUpdateOptions.Builder()).build());
		}

		public InferenceConfigUpdate build() {
			_checkSingleUse();
			return new InferenceConfigUpdate(this);
		}

	}

	protected static void setupInferenceConfigUpdateDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::regression, RegressionInferenceOptions._DESERIALIZER, "regression");
		op.add(Builder::classification, ClassificationInferenceOptions._DESERIALIZER, "classification");
		op.add(Builder::textClassification, TextClassificationInferenceUpdateOptions._DESERIALIZER,
				"text_classification");
		op.add(Builder::zeroShotClassification, ZeroShotClassificationInferenceUpdateOptions._DESERIALIZER,
				"zero_shot_classification");
		op.add(Builder::fillMask, FillMaskInferenceUpdateOptions._DESERIALIZER, "fill_mask");
		op.add(Builder::ner, NerInferenceUpdateOptions._DESERIALIZER, "ner");
		op.add(Builder::passThrough, PassThroughInferenceUpdateOptions._DESERIALIZER, "pass_through");
		op.add(Builder::textEmbedding, TextEmbeddingInferenceUpdateOptions._DESERIALIZER, "text_embedding");
		op.add(Builder::textExpansion, TextExpansionInferenceUpdateOptions._DESERIALIZER, "text_expansion");
		op.add(Builder::questionAnswering, QuestionAnsweringInferenceUpdateOptions._DESERIALIZER, "question_answering");

	}

	public static final JsonpDeserializer<InferenceConfigUpdate> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, InferenceConfigUpdate::setupInferenceConfigUpdateDeserializer, Builder::build);
}
