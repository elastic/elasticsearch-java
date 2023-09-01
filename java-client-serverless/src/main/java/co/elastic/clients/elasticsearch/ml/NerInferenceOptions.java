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
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.NerInferenceOptions

/**
 * Named entity recognition options
 * 
 * @see <a href="../doc-files/api-spec.html#ml._types.NerInferenceOptions">API
 *      specification</a>
 */
@JsonpDeserializable
public class NerInferenceOptions implements InferenceConfigCreateVariant, JsonpSerializable {
	@Nullable
	private final TokenizationConfig tokenization;

	@Nullable
	private final String resultsField;

	private final List<String> classificationLabels;

	@Nullable
	private final Vocabulary vocabulary;

	// ---------------------------------------------------------------------------------------------

	private NerInferenceOptions(Builder builder) {

		this.tokenization = builder.tokenization;
		this.resultsField = builder.resultsField;
		this.classificationLabels = ApiTypeHelper.unmodifiable(builder.classificationLabels);
		this.vocabulary = builder.vocabulary;

	}

	public static NerInferenceOptions of(Function<Builder, ObjectBuilder<NerInferenceOptions>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * InferenceConfigCreate variant kind.
	 */
	@Override
	public InferenceConfigCreate.Kind _inferenceConfigCreateKind() {
		return InferenceConfigCreate.Kind.Ner;
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
	 * The token classification labels. Must be IOB formatted tags
	 * <p>
	 * API name: {@code classification_labels}
	 */
	public final List<String> classificationLabels() {
		return this.classificationLabels;
	}

	/**
	 * API name: {@code vocabulary}
	 */
	@Nullable
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

		if (this.tokenization != null) {
			generator.writeKey("tokenization");
			this.tokenization.serialize(generator, mapper);

		}
		if (this.resultsField != null) {
			generator.writeKey("results_field");
			generator.write(this.resultsField);

		}
		if (ApiTypeHelper.isDefined(this.classificationLabels)) {
			generator.writeKey("classification_labels");
			generator.writeStartArray();
			for (String item0 : this.classificationLabels) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.vocabulary != null) {
			generator.writeKey("vocabulary");
			this.vocabulary.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NerInferenceOptions}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<NerInferenceOptions> {
		@Nullable
		private TokenizationConfig tokenization;

		@Nullable
		private String resultsField;

		@Nullable
		private List<String> classificationLabels;

		@Nullable
		private Vocabulary vocabulary;

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

		/**
		 * The token classification labels. Must be IOB formatted tags
		 * <p>
		 * API name: {@code classification_labels}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>classificationLabels</code>.
		 */
		public final Builder classificationLabels(List<String> list) {
			this.classificationLabels = _listAddAll(this.classificationLabels, list);
			return this;
		}

		/**
		 * The token classification labels. Must be IOB formatted tags
		 * <p>
		 * API name: {@code classification_labels}
		 * <p>
		 * Adds one or more values to <code>classificationLabels</code>.
		 */
		public final Builder classificationLabels(String value, String... values) {
			this.classificationLabels = _listAdd(this.classificationLabels, value, values);
			return this;
		}

		/**
		 * API name: {@code vocabulary}
		 */
		public final Builder vocabulary(@Nullable Vocabulary value) {
			this.vocabulary = value;
			return this;
		}

		/**
		 * API name: {@code vocabulary}
		 */
		public final Builder vocabulary(Function<Vocabulary.Builder, ObjectBuilder<Vocabulary>> fn) {
			return this.vocabulary(fn.apply(new Vocabulary.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link NerInferenceOptions}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NerInferenceOptions build() {
			_checkSingleUse();

			return new NerInferenceOptions(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NerInferenceOptions}
	 */
	public static final JsonpDeserializer<NerInferenceOptions> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, NerInferenceOptions::setupNerInferenceOptionsDeserializer);

	protected static void setupNerInferenceOptionsDeserializer(ObjectDeserializer<NerInferenceOptions.Builder> op) {

		op.add(Builder::tokenization, TokenizationConfig._DESERIALIZER, "tokenization");
		op.add(Builder::resultsField, JsonpDeserializer.stringDeserializer(), "results_field");
		op.add(Builder::classificationLabels,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "classification_labels");
		op.add(Builder::vocabulary, Vocabulary._DESERIALIZER, "vocabulary");

	}

}
