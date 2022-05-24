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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.NerInferenceUpdateOptions

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ml._types.NerInferenceUpdateOptions">API
 *      specification</a>
 */
@JsonpDeserializable
public class NerInferenceUpdateOptions implements InferenceConfigUpdateVariant, JsonpSerializable {
	@Nullable
	private final NlpTokenizationUpdateOptions tokenization;

	@Nullable
	private final String resultsField;

	// ---------------------------------------------------------------------------------------------

	private NerInferenceUpdateOptions(Builder builder) {

		this.tokenization = builder.tokenization;
		this.resultsField = builder.resultsField;

	}

	public static NerInferenceUpdateOptions of(Function<Builder, ObjectBuilder<NerInferenceUpdateOptions>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * InferenceConfigUpdate variant kind.
	 */
	@Override
	public InferenceConfigUpdate.Kind _inferenceConfigUpdateKind() {
		return InferenceConfigUpdate.Kind.Ner;
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

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NerInferenceUpdateOptions}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<NerInferenceUpdateOptions> {
		@Nullable
		private NlpTokenizationUpdateOptions tokenization;

		@Nullable
		private String resultsField;

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

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link NerInferenceUpdateOptions}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NerInferenceUpdateOptions build() {
			_checkSingleUse();

			return new NerInferenceUpdateOptions(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NerInferenceUpdateOptions}
	 */
	public static final JsonpDeserializer<NerInferenceUpdateOptions> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, NerInferenceUpdateOptions::setupNerInferenceUpdateOptionsDeserializer);

	protected static void setupNerInferenceUpdateOptionsDeserializer(
			ObjectDeserializer<NerInferenceUpdateOptions.Builder> op) {

		op.add(Builder::tokenization, NlpTokenizationUpdateOptions._DESERIALIZER, "tokenization");
		op.add(Builder::resultsField, JsonpDeserializer.stringDeserializer(), "results_field");

	}

}
