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
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.ZeroShotClassificationInferenceOptions

/**
 * Zero shot classification configuration options
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#ml._types.ZeroShotClassificationInferenceOptions">API
 *      specification</a>
 */
@JsonpDeserializable
public class ZeroShotClassificationInferenceOptions implements InferenceConfigCreateVariant, JsonpSerializable {
	@Nullable
	private final TokenizationConfig tokenization;

	@Nullable
	private final String hypothesisTemplate;

	private final List<String> classificationLabels;

	@Nullable
	private final String resultsField;

	@Nullable
	private final Boolean multiLabel;

	private final List<String> labels;

	// ---------------------------------------------------------------------------------------------

	private ZeroShotClassificationInferenceOptions(Builder builder) {

		this.tokenization = builder.tokenization;
		this.hypothesisTemplate = builder.hypothesisTemplate;
		this.classificationLabels = ApiTypeHelper.unmodifiableRequired(builder.classificationLabels, this,
				"classificationLabels");
		this.resultsField = builder.resultsField;
		this.multiLabel = builder.multiLabel;
		this.labels = ApiTypeHelper.unmodifiable(builder.labels);

	}

	public static ZeroShotClassificationInferenceOptions of(
			Function<Builder, ObjectBuilder<ZeroShotClassificationInferenceOptions>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * InferenceConfigCreate variant kind.
	 */
	@Override
	public InferenceConfigCreate.Kind _inferenceConfigCreateKind() {
		return InferenceConfigCreate.Kind.ZeroShotClassification;
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
	 * Hypothesis template used when tokenizing labels for prediction
	 * <p>
	 * API name: {@code hypothesis_template}
	 */
	@Nullable
	public final String hypothesisTemplate() {
		return this.hypothesisTemplate;
	}

	/**
	 * Required - The zero shot classification labels indicating entailment,
	 * neutral, and contradiction Must contain exactly and only entailment, neutral,
	 * and contradiction
	 * <p>
	 * API name: {@code classification_labels}
	 */
	public final List<String> classificationLabels() {
		return this.classificationLabels;
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
	 * Indicates if more than one true label exists.
	 * <p>
	 * API name: {@code multi_label}
	 */
	@Nullable
	public final Boolean multiLabel() {
		return this.multiLabel;
	}

	/**
	 * The labels to predict.
	 * <p>
	 * API name: {@code labels}
	 */
	public final List<String> labels() {
		return this.labels;
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
		if (this.hypothesisTemplate != null) {
			generator.writeKey("hypothesis_template");
			generator.write(this.hypothesisTemplate);

		}
		if (ApiTypeHelper.isDefined(this.classificationLabels)) {
			generator.writeKey("classification_labels");
			generator.writeStartArray();
			for (String item0 : this.classificationLabels) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.resultsField != null) {
			generator.writeKey("results_field");
			generator.write(this.resultsField);

		}
		if (this.multiLabel != null) {
			generator.writeKey("multi_label");
			generator.write(this.multiLabel);

		}
		if (ApiTypeHelper.isDefined(this.labels)) {
			generator.writeKey("labels");
			generator.writeStartArray();
			for (String item0 : this.labels) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ZeroShotClassificationInferenceOptions}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ZeroShotClassificationInferenceOptions> {
		@Nullable
		private TokenizationConfig tokenization;

		@Nullable
		private String hypothesisTemplate;

		private List<String> classificationLabels;

		@Nullable
		private String resultsField;

		@Nullable
		private Boolean multiLabel;

		@Nullable
		private List<String> labels;

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
		 * Hypothesis template used when tokenizing labels for prediction
		 * <p>
		 * API name: {@code hypothesis_template}
		 */
		public final Builder hypothesisTemplate(@Nullable String value) {
			this.hypothesisTemplate = value;
			return this;
		}

		/**
		 * Required - The zero shot classification labels indicating entailment,
		 * neutral, and contradiction Must contain exactly and only entailment, neutral,
		 * and contradiction
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
		 * Required - The zero shot classification labels indicating entailment,
		 * neutral, and contradiction Must contain exactly and only entailment, neutral,
		 * and contradiction
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
		 * Indicates if more than one true label exists.
		 * <p>
		 * API name: {@code multi_label}
		 */
		public final Builder multiLabel(@Nullable Boolean value) {
			this.multiLabel = value;
			return this;
		}

		/**
		 * The labels to predict.
		 * <p>
		 * API name: {@code labels}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>labels</code>.
		 */
		public final Builder labels(List<String> list) {
			this.labels = _listAddAll(this.labels, list);
			return this;
		}

		/**
		 * The labels to predict.
		 * <p>
		 * API name: {@code labels}
		 * <p>
		 * Adds one or more values to <code>labels</code>.
		 */
		public final Builder labels(String value, String... values) {
			this.labels = _listAdd(this.labels, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ZeroShotClassificationInferenceOptions}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ZeroShotClassificationInferenceOptions build() {
			_checkSingleUse();

			return new ZeroShotClassificationInferenceOptions(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ZeroShotClassificationInferenceOptions}
	 */
	public static final JsonpDeserializer<ZeroShotClassificationInferenceOptions> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					ZeroShotClassificationInferenceOptions::setupZeroShotClassificationInferenceOptionsDeserializer);

	protected static void setupZeroShotClassificationInferenceOptionsDeserializer(
			ObjectDeserializer<ZeroShotClassificationInferenceOptions.Builder> op) {

		op.add(Builder::tokenization, TokenizationConfig._DESERIALIZER, "tokenization");
		op.add(Builder::hypothesisTemplate, JsonpDeserializer.stringDeserializer(), "hypothesis_template");
		op.add(Builder::classificationLabels,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "classification_labels");
		op.add(Builder::resultsField, JsonpDeserializer.stringDeserializer(), "results_field");
		op.add(Builder::multiLabel, JsonpDeserializer.booleanDeserializer(), "multi_label");
		op.add(Builder::labels, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "labels");

	}

}
