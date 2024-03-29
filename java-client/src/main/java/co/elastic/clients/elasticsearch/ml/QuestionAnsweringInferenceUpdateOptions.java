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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

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

// typedef: ml._types.QuestionAnsweringInferenceUpdateOptions

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ml._types.QuestionAnsweringInferenceUpdateOptions">API
 *      specification</a>
 */
@JsonpDeserializable
public class QuestionAnsweringInferenceUpdateOptions implements InferenceConfigUpdateVariant, JsonpSerializable {
	private final String question;

	@Nullable
	private final Integer numTopClasses;

	@Nullable
	private final NlpTokenizationUpdateOptions tokenization;

	@Nullable
	private final String resultsField;

	@Nullable
	private final Integer maxAnswerLength;

	// ---------------------------------------------------------------------------------------------

	private QuestionAnsweringInferenceUpdateOptions(Builder builder) {

		this.question = ApiTypeHelper.requireNonNull(builder.question, this, "question");
		this.numTopClasses = builder.numTopClasses;
		this.tokenization = builder.tokenization;
		this.resultsField = builder.resultsField;
		this.maxAnswerLength = builder.maxAnswerLength;

	}

	public static QuestionAnsweringInferenceUpdateOptions of(
			Function<Builder, ObjectBuilder<QuestionAnsweringInferenceUpdateOptions>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * InferenceConfigUpdate variant kind.
	 */
	@Override
	public InferenceConfigUpdate.Kind _inferenceConfigUpdateKind() {
		return InferenceConfigUpdate.Kind.QuestionAnswering;
	}

	/**
	 * Required - The question to answer given the inference context
	 * <p>
	 * API name: {@code question}
	 */
	public final String question() {
		return this.question;
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
	public final NlpTokenizationUpdateOptions tokenization() {
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
	 * The maximum answer length to consider for extraction
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

		generator.writeKey("question");
		generator.write(this.question);

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
	 * Builder for {@link QuestionAnsweringInferenceUpdateOptions}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<QuestionAnsweringInferenceUpdateOptions> {
		private String question;

		@Nullable
		private Integer numTopClasses;

		@Nullable
		private NlpTokenizationUpdateOptions tokenization;

		@Nullable
		private String resultsField;

		@Nullable
		private Integer maxAnswerLength;

		/**
		 * Required - The question to answer given the inference context
		 * <p>
		 * API name: {@code question}
		 */
		public final Builder question(String value) {
			this.question = value;
			return this;
		}

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
		public final Builder tokenization(@Nullable NlpTokenizationUpdateOptions value) {
			this.tokenization = value;
			return this;
		}

		/**
		 * The tokenization options to update when inferring
		 * <p>
		 * API name: {@code tokenization}
		 */
		public final Builder tokenization(
				Function<NlpTokenizationUpdateOptions.Builder, ObjectBuilder<NlpTokenizationUpdateOptions>> fn) {
			return this.tokenization(fn.apply(new NlpTokenizationUpdateOptions.Builder()).build());
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
		 * The maximum answer length to consider for extraction
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
		 * Builds a {@link QuestionAnsweringInferenceUpdateOptions}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public QuestionAnsweringInferenceUpdateOptions build() {
			_checkSingleUse();

			return new QuestionAnsweringInferenceUpdateOptions(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link QuestionAnsweringInferenceUpdateOptions}
	 */
	public static final JsonpDeserializer<QuestionAnsweringInferenceUpdateOptions> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					QuestionAnsweringInferenceUpdateOptions::setupQuestionAnsweringInferenceUpdateOptionsDeserializer);

	protected static void setupQuestionAnsweringInferenceUpdateOptionsDeserializer(
			ObjectDeserializer<QuestionAnsweringInferenceUpdateOptions.Builder> op) {

		op.add(Builder::question, JsonpDeserializer.stringDeserializer(), "question");
		op.add(Builder::numTopClasses, JsonpDeserializer.integerDeserializer(), "num_top_classes");
		op.add(Builder::tokenization, NlpTokenizationUpdateOptions._DESERIALIZER, "tokenization");
		op.add(Builder::resultsField, JsonpDeserializer.stringDeserializer(), "results_field");
		op.add(Builder::maxAnswerLength, JsonpDeserializer.integerDeserializer(), "max_answer_length");

	}

}
