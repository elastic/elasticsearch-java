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

// typedef: ml._types.TextEmbeddingInferenceOptions

/**
 * Text embedding inference options
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#ml._types.TextEmbeddingInferenceOptions">API
 *      specification</a>
 */
@JsonpDeserializable
public class TextEmbeddingInferenceOptions implements InferenceConfigCreateVariant, JsonpSerializable {
	@Nullable
	private final Integer embeddingSize;

	@Nullable
	private final TokenizationConfig tokenization;

	@Nullable
	private final String resultsField;

	// ---------------------------------------------------------------------------------------------

	private TextEmbeddingInferenceOptions(Builder builder) {

		this.embeddingSize = builder.embeddingSize;
		this.tokenization = builder.tokenization;
		this.resultsField = builder.resultsField;

	}

	public static TextEmbeddingInferenceOptions of(Function<Builder, ObjectBuilder<TextEmbeddingInferenceOptions>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * InferenceConfigCreate variant kind.
	 */
	@Override
	public InferenceConfigCreate.Kind _inferenceConfigCreateKind() {
		return InferenceConfigCreate.Kind.TextEmbedding;
	}

	/**
	 * The number of dimensions in the embedding output
	 * <p>
	 * API name: {@code embedding_size}
	 */
	@Nullable
	public final Integer embeddingSize() {
		return this.embeddingSize;
	}

	/**
	 * The tokenization options
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
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.embeddingSize != null) {
			generator.writeKey("embedding_size");
			generator.write(this.embeddingSize);

		}
		if (this.tokenization != null) {
			generator.writeKey("tokenization");
			this.tokenization.serialize(generator, mapper);

		}
		if (this.resultsField != null) {
			generator.writeKey("results_field");
			generator.write(this.resultsField);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TextEmbeddingInferenceOptions}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<TextEmbeddingInferenceOptions> {
		@Nullable
		private Integer embeddingSize;

		@Nullable
		private TokenizationConfig tokenization;

		@Nullable
		private String resultsField;

		/**
		 * The number of dimensions in the embedding output
		 * <p>
		 * API name: {@code embedding_size}
		 */
		public final Builder embeddingSize(@Nullable Integer value) {
			this.embeddingSize = value;
			return this;
		}

		/**
		 * The tokenization options
		 * <p>
		 * API name: {@code tokenization}
		 */
		public final Builder tokenization(@Nullable TokenizationConfig value) {
			this.tokenization = value;
			return this;
		}

		/**
		 * The tokenization options
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

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TextEmbeddingInferenceOptions}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TextEmbeddingInferenceOptions build() {
			_checkSingleUse();

			return new TextEmbeddingInferenceOptions(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TextEmbeddingInferenceOptions}
	 */
	public static final JsonpDeserializer<TextEmbeddingInferenceOptions> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TextEmbeddingInferenceOptions::setupTextEmbeddingInferenceOptionsDeserializer);

	protected static void setupTextEmbeddingInferenceOptionsDeserializer(
			ObjectDeserializer<TextEmbeddingInferenceOptions.Builder> op) {

		op.add(Builder::embeddingSize, JsonpDeserializer.integerDeserializer(), "embedding_size");
		op.add(Builder::tokenization, TokenizationConfig._DESERIALIZER, "tokenization");
		op.add(Builder::resultsField, JsonpDeserializer.stringDeserializer(), "results_field");

	}

}
