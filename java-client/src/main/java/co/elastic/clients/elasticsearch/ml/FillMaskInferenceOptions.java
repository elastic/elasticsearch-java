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

// typedef: ml._types.FillMaskInferenceOptions

/**
 * Fill mask inference options
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#ml._types.FillMaskInferenceOptions">API
 *      specification</a>
 */
@JsonpDeserializable
public class FillMaskInferenceOptions implements InferenceConfigCreateVariant, JsonpSerializable {
	@Nullable
	private final String maskToken;

	@Nullable
	private final Integer numTopClasses;

	@Nullable
	private final TokenizationConfig tokenization;

	@Nullable
	private final String resultsField;

	private final Vocabulary vocabulary;

	// ---------------------------------------------------------------------------------------------

	private FillMaskInferenceOptions(Builder builder) {

		this.maskToken = builder.maskToken;
		this.numTopClasses = builder.numTopClasses;
		this.tokenization = builder.tokenization;
		this.resultsField = builder.resultsField;
		this.vocabulary = ApiTypeHelper.requireNonNull(builder.vocabulary, this, "vocabulary");

	}

	public static FillMaskInferenceOptions of(Function<Builder, ObjectBuilder<FillMaskInferenceOptions>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * InferenceConfigCreate variant kind.
	 */
	@Override
	public InferenceConfigCreate.Kind _inferenceConfigCreateKind() {
		return InferenceConfigCreate.Kind.FillMask;
	}

	/**
	 * The string/token which will be removed from incoming documents and replaced
	 * with the inference prediction(s). In a response, this field contains the mask
	 * token for the specified model/tokenizer. Each model and tokenizer has a
	 * predefined mask token which cannot be changed. Thus, it is recommended not to
	 * set this value in requests. However, if this field is present in a request,
	 * its value must match the predefined value for that model/tokenizer, otherwise
	 * the request will fail.
	 * <p>
	 * API name: {@code mask_token}
	 */
	@Nullable
	public final String maskToken() {
		return this.maskToken;
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
	 * Required - API name: {@code vocabulary}
	 */
	public final Vocabulary vocabulary() {
		return this.vocabulary;
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

		if (this.maskToken != null) {
			generator.writeKey("mask_token");
			generator.write(this.maskToken);

		}
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
		generator.writeKey("vocabulary");
		this.vocabulary.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FillMaskInferenceOptions}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<FillMaskInferenceOptions> {
		@Nullable
		private String maskToken;

		@Nullable
		private Integer numTopClasses;

		@Nullable
		private TokenizationConfig tokenization;

		@Nullable
		private String resultsField;

		private Vocabulary vocabulary;

		/**
		 * The string/token which will be removed from incoming documents and replaced
		 * with the inference prediction(s). In a response, this field contains the mask
		 * token for the specified model/tokenizer. Each model and tokenizer has a
		 * predefined mask token which cannot be changed. Thus, it is recommended not to
		 * set this value in requests. However, if this field is present in a request,
		 * its value must match the predefined value for that model/tokenizer, otherwise
		 * the request will fail.
		 * <p>
		 * API name: {@code mask_token}
		 */
		public final Builder maskToken(@Nullable String value) {
			this.maskToken = value;
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
		 * The tokenization options to update when inferring
		 * <p>
		 * API name: {@code tokenization}
		 */
		public final Builder tokenization(TokenizationConfigVariant value) {
			this.tokenization = value._toTokenizationConfig();
			return this;
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
		 * Required - API name: {@code vocabulary}
		 */
		public final Builder vocabulary(Vocabulary value) {
			this.vocabulary = value;
			return this;
		}

		/**
		 * Required - API name: {@code vocabulary}
		 */
		public final Builder vocabulary(Function<Vocabulary.Builder, ObjectBuilder<Vocabulary>> fn) {
			return this.vocabulary(fn.apply(new Vocabulary.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link FillMaskInferenceOptions}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FillMaskInferenceOptions build() {
			_checkSingleUse();

			return new FillMaskInferenceOptions(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FillMaskInferenceOptions}
	 */
	public static final JsonpDeserializer<FillMaskInferenceOptions> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, FillMaskInferenceOptions::setupFillMaskInferenceOptionsDeserializer);

	protected static void setupFillMaskInferenceOptionsDeserializer(
			ObjectDeserializer<FillMaskInferenceOptions.Builder> op) {

		op.add(Builder::maskToken, JsonpDeserializer.stringDeserializer(), "mask_token");
		op.add(Builder::numTopClasses, JsonpDeserializer.integerDeserializer(), "num_top_classes");
		op.add(Builder::tokenization, TokenizationConfig._DESERIALIZER, "tokenization");
		op.add(Builder::resultsField, JsonpDeserializer.stringDeserializer(), "results_field");
		op.add(Builder::vocabulary, Vocabulary._DESERIALIZER, "vocabulary");

	}

}
