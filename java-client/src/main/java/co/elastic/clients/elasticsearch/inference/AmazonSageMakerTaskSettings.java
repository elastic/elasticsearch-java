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

package co.elastic.clients.elasticsearch.inference;

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

// typedef: inference._types.AmazonSageMakerTaskSettings

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.AmazonSageMakerTaskSettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class AmazonSageMakerTaskSettings implements JsonpSerializable {
	@Nullable
	private final String customAttributes;

	@Nullable
	private final String enableExplanations;

	@Nullable
	private final String inferenceId;

	@Nullable
	private final String sessionId;

	@Nullable
	private final String targetVariant;

	// ---------------------------------------------------------------------------------------------

	private AmazonSageMakerTaskSettings(Builder builder) {

		this.customAttributes = builder.customAttributes;
		this.enableExplanations = builder.enableExplanations;
		this.inferenceId = builder.inferenceId;
		this.sessionId = builder.sessionId;
		this.targetVariant = builder.targetVariant;

	}

	public static AmazonSageMakerTaskSettings of(Function<Builder, ObjectBuilder<AmazonSageMakerTaskSettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The AWS custom attributes passed verbatim through to the model running in the
	 * SageMaker Endpoint. Values will be returned in the
	 * <code>X-elastic-sagemaker-custom-attributes</code> header.
	 * <p>
	 * API name: {@code custom_attributes}
	 */
	@Nullable
	public final String customAttributes() {
		return this.customAttributes;
	}

	/**
	 * The optional JMESPath expression used to override the EnableExplanations
	 * provided during endpoint creation.
	 * <p>
	 * API name: {@code enable_explanations}
	 */
	@Nullable
	public final String enableExplanations() {
		return this.enableExplanations;
	}

	/**
	 * The capture data ID when enabled in the endpoint.
	 * <p>
	 * API name: {@code inference_id}
	 */
	@Nullable
	public final String inferenceId() {
		return this.inferenceId;
	}

	/**
	 * The stateful session identifier for a new or existing session. New sessions
	 * will be returned in the <code>X-elastic-sagemaker-new-session-id</code>
	 * header. Closed sessions will be returned in the
	 * <code>X-elastic-sagemaker-closed-session-id</code> header.
	 * <p>
	 * API name: {@code session_id}
	 */
	@Nullable
	public final String sessionId() {
		return this.sessionId;
	}

	/**
	 * Specifies the variant when running with multi-variant Endpoints.
	 * <p>
	 * API name: {@code target_variant}
	 */
	@Nullable
	public final String targetVariant() {
		return this.targetVariant;
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

		if (this.customAttributes != null) {
			generator.writeKey("custom_attributes");
			generator.write(this.customAttributes);

		}
		if (this.enableExplanations != null) {
			generator.writeKey("enable_explanations");
			generator.write(this.enableExplanations);

		}
		if (this.inferenceId != null) {
			generator.writeKey("inference_id");
			generator.write(this.inferenceId);

		}
		if (this.sessionId != null) {
			generator.writeKey("session_id");
			generator.write(this.sessionId);

		}
		if (this.targetVariant != null) {
			generator.writeKey("target_variant");
			generator.write(this.targetVariant);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AmazonSageMakerTaskSettings}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<AmazonSageMakerTaskSettings> {
		@Nullable
		private String customAttributes;

		@Nullable
		private String enableExplanations;

		@Nullable
		private String inferenceId;

		@Nullable
		private String sessionId;

		@Nullable
		private String targetVariant;

		/**
		 * The AWS custom attributes passed verbatim through to the model running in the
		 * SageMaker Endpoint. Values will be returned in the
		 * <code>X-elastic-sagemaker-custom-attributes</code> header.
		 * <p>
		 * API name: {@code custom_attributes}
		 */
		public final Builder customAttributes(@Nullable String value) {
			this.customAttributes = value;
			return this;
		}

		/**
		 * The optional JMESPath expression used to override the EnableExplanations
		 * provided during endpoint creation.
		 * <p>
		 * API name: {@code enable_explanations}
		 */
		public final Builder enableExplanations(@Nullable String value) {
			this.enableExplanations = value;
			return this;
		}

		/**
		 * The capture data ID when enabled in the endpoint.
		 * <p>
		 * API name: {@code inference_id}
		 */
		public final Builder inferenceId(@Nullable String value) {
			this.inferenceId = value;
			return this;
		}

		/**
		 * The stateful session identifier for a new or existing session. New sessions
		 * will be returned in the <code>X-elastic-sagemaker-new-session-id</code>
		 * header. Closed sessions will be returned in the
		 * <code>X-elastic-sagemaker-closed-session-id</code> header.
		 * <p>
		 * API name: {@code session_id}
		 */
		public final Builder sessionId(@Nullable String value) {
			this.sessionId = value;
			return this;
		}

		/**
		 * Specifies the variant when running with multi-variant Endpoints.
		 * <p>
		 * API name: {@code target_variant}
		 */
		public final Builder targetVariant(@Nullable String value) {
			this.targetVariant = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AmazonSageMakerTaskSettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AmazonSageMakerTaskSettings build() {
			_checkSingleUse();

			return new AmazonSageMakerTaskSettings(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AmazonSageMakerTaskSettings}
	 */
	public static final JsonpDeserializer<AmazonSageMakerTaskSettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, AmazonSageMakerTaskSettings::setupAmazonSageMakerTaskSettingsDeserializer);

	protected static void setupAmazonSageMakerTaskSettingsDeserializer(
			ObjectDeserializer<AmazonSageMakerTaskSettings.Builder> op) {

		op.add(Builder::customAttributes, JsonpDeserializer.stringDeserializer(), "custom_attributes");
		op.add(Builder::enableExplanations, JsonpDeserializer.stringDeserializer(), "enable_explanations");
		op.add(Builder::inferenceId, JsonpDeserializer.stringDeserializer(), "inference_id");
		op.add(Builder::sessionId, JsonpDeserializer.stringDeserializer(), "session_id");
		op.add(Builder::targetVariant, JsonpDeserializer.stringDeserializer(), "target_variant");

	}

}
