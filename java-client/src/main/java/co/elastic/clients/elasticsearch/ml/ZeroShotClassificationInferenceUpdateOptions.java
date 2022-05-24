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

// typedef: ml._types.ZeroShotClassificationInferenceUpdateOptions

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ml._types.ZeroShotClassificationInferenceUpdateOptions">API
 *      specification</a>
 */
@JsonpDeserializable
public class ZeroShotClassificationInferenceUpdateOptions implements InferenceConfigUpdateVariant, JsonpSerializable {
	@Nullable
	private final NlpTokenizationUpdateOptions tokenization;

	@Nullable
	private final String resultsField;

	@Nullable
	private final Boolean multiLabel;

	private final List<String> labels;

	// ---------------------------------------------------------------------------------------------

	private ZeroShotClassificationInferenceUpdateOptions(Builder builder) {

		this.tokenization = builder.tokenization;
		this.resultsField = builder.resultsField;
		this.multiLabel = builder.multiLabel;
		this.labels = ApiTypeHelper.unmodifiableRequired(builder.labels, this, "labels");

	}

	public static ZeroShotClassificationInferenceUpdateOptions of(
			Function<Builder, ObjectBuilder<ZeroShotClassificationInferenceUpdateOptions>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * InferenceConfigUpdate variant kind.
	 */
	@Override
	public InferenceConfigUpdate.Kind _inferenceConfigUpdateKind() {
		return InferenceConfigUpdate.Kind.ZeroShotClassification;
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
	 * Update the configured multi label option. Indicates if more than one true
	 * label exists. Defaults to the configured value.
	 * <p>
	 * API name: {@code multi_label}
	 */
	@Nullable
	public final Boolean multiLabel() {
		return this.multiLabel;
	}

	/**
	 * Required - The labels to predict.
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
	 * Builder for {@link ZeroShotClassificationInferenceUpdateOptions}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ZeroShotClassificationInferenceUpdateOptions> {
		@Nullable
		private NlpTokenizationUpdateOptions tokenization;

		@Nullable
		private String resultsField;

		@Nullable
		private Boolean multiLabel;

		private List<String> labels;

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
		 * Update the configured multi label option. Indicates if more than one true
		 * label exists. Defaults to the configured value.
		 * <p>
		 * API name: {@code multi_label}
		 */
		public final Builder multiLabel(@Nullable Boolean value) {
			this.multiLabel = value;
			return this;
		}

		/**
		 * Required - The labels to predict.
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
		 * Required - The labels to predict.
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
		 * Builds a {@link ZeroShotClassificationInferenceUpdateOptions}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ZeroShotClassificationInferenceUpdateOptions build() {
			_checkSingleUse();

			return new ZeroShotClassificationInferenceUpdateOptions(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ZeroShotClassificationInferenceUpdateOptions}
	 */
	public static final JsonpDeserializer<ZeroShotClassificationInferenceUpdateOptions> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					ZeroShotClassificationInferenceUpdateOptions::setupZeroShotClassificationInferenceUpdateOptionsDeserializer);

	protected static void setupZeroShotClassificationInferenceUpdateOptionsDeserializer(
			ObjectDeserializer<ZeroShotClassificationInferenceUpdateOptions.Builder> op) {

		op.add(Builder::tokenization, NlpTokenizationUpdateOptions._DESERIALIZER, "tokenization");
		op.add(Builder::resultsField, JsonpDeserializer.stringDeserializer(), "results_field");
		op.add(Builder::multiLabel, JsonpDeserializer.booleanDeserializer(), "multi_label");
		op.add(Builder::labels, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "labels");

	}

}
