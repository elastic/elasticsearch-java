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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.QuestionAnsweringInferenceOptions

/**
 * Question answering inference options
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#ml._types.QuestionAnsweringInferenceOptions">API
 *      specification</a>
 */
@JsonpDeserializable
public class QuestionAnsweringInferenceOptions implements InferenceConfigCreateVariant, JsonpSerializable {
	@Nullable
	private final Integer numTopClasses;

	@Nullable
	private final TokenizationConfig tokenization;

	@Nullable
	private final String resultsField;

	@Nullable
	private final Integer maxAnswerLength;

	// ---------------------------------------------------------------------------------------------

	private QuestionAnsweringInferenceOptions(Builder builder) {

		this.numTopClasses = builder.numTopClasses;
		this.tokenization = builder.tokenization;
		this.resultsField = builder.resultsField;
		this.maxAnswerLength = builder.maxAnswerLength;

	}

	public static QuestionAnsweringInferenceOptions of(
			Function<Builder, ObjectBuilder<QuestionAnsweringInferenceOptions>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * InferenceConfigCreate variant kind.
	 */
	@Override
	public InferenceConfigCreate.Kind _inferenceConfigCreateKind() {
		return InferenceConfigCreate.Kind.QuestionAnswering;
	}

	/**
	 * Specifies the number of top class predictions to return. Defaults to 0.
	 * <p>
	 * API name: {@code num_top_classes}
	 */
	@Nullable
	public final Integer numTopClasses() {
		return this.numTopClasses;
	}

	/**
	 * The tokenization options to update when inferring
	 * <p>
	 * API name: {@code tokenization}
	 */
	@Nullable
	public final TokenizationConfig tokenization() {
		return this.tokenization;
	}

	/**
	 * The field that is added to incoming documents to contain the inference
	 * prediction. Defaults to predicted_value.
	 * <p>
	 * API name: {@code results_field}
	 */
	@Nullable
	public final String resultsField() {
		return this.resultsField;
	}

	/**
	 * The maximum answer length to consider
	 * <p>
	 * API name: {@code max_answer_length}
	 */
	@Nullable
	public final Integer maxAnswerLength() {
		return this.maxAnswerLength;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.numTopClasses != null) {
			generator.writeKey("num_top_classes");
			generator.write(this.numTopClasses);

		}
		if (this.tokenization != null) {
			generator.writeKey("tokenization");
			this.tokenization.serialize(generator, mapper);

		}
		if (this.resultsField != null) {
			generator.writeKey("results_field");
			generator.write(this.resultsField);

		}
		if (this.maxAnswerLength != null) {
			generator.writeKey("max_answer_length");
			generator.write(this.maxAnswerLength);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link QuestionAnsweringInferenceOptions}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<QuestionAnsweringInferenceOptions> {
		@Nullable
		private Integer numTopClasses;

		@Nullable
		private TokenizationConfig tokenization;

		@Nullable
		private String resultsField;

		@Nullable
		private Integer maxAnswerLength;

		/**
		 * Specifies the number of top class predictions to return. Defaults to 0.
		 * <p>
		 * API name: {@code num_top_classes}
		 */
		public final Builder numTopClasses(@Nullable Integer value) {
			this.numTopClasses = value;
			return this;
		}

		/**
		 * The tokenization options to update when inferring
		 * <p>
		 * API name: {@code tokenization}
		 */
		public final Builder tokenization(@Nullable TokenizationConfig value) {
			this.tokenization = value;
			return this;
		}

		/**
		 * The tokenization options to update when inferring
		 * <p>
		 * API name: {@code tokenization}
		 */
		public final Builder tokenization(Function<TokenizationConfig.Builder, ObjectBuilder<TokenizationConfig>> fn) {
			return this.tokenization(fn.apply(new TokenizationConfig.Builder()).build());
		}

		/**
		 * The field that is added to incoming documents to contain the inference
		 * prediction. Defaults to predicted_value.
		 * <p>
		 * API name: {@code results_field}
		 */
		public final Builder resultsField(@Nullable String value) {
			this.resultsField = value;
			return this;
		}

		/**
		 * The maximum answer length to consider
		 * <p>
		 * API name: {@code max_answer_length}
		 */
		public final Builder maxAnswerLength(@Nullable Integer value) {
			this.maxAnswerLength = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link QuestionAnsweringInferenceOptions}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public QuestionAnsweringInferenceOptions build() {
			_checkSingleUse();

			return new QuestionAnsweringInferenceOptions(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link QuestionAnsweringInferenceOptions}
	 */
	public static final JsonpDeserializer<QuestionAnsweringInferenceOptions> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, QuestionAnsweringInferenceOptions::setupQuestionAnsweringInferenceOptionsDeserializer);

	protected static void setupQuestionAnsweringInferenceOptionsDeserializer(
			ObjectDeserializer<QuestionAnsweringInferenceOptions.Builder> op) {

		op.add(Builder::numTopClasses, JsonpDeserializer.integerDeserializer(), "num_top_classes");
		op.add(Builder::tokenization, TokenizationConfig._DESERIALIZER, "tokenization");
		op.add(Builder::resultsField, JsonpDeserializer.stringDeserializer(), "results_field");
		op.add(Builder::maxAnswerLength, JsonpDeserializer.integerDeserializer(), "max_answer_length");

	}

}
