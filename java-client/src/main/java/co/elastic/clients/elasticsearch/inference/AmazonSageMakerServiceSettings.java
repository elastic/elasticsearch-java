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

// typedef: inference._types.AmazonSageMakerServiceSettings

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.AmazonSageMakerServiceSettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class AmazonSageMakerServiceSettings implements JsonpSerializable {
	private final String accessKey;

	private final String endpointName;

	private final AmazonSageMakerApi api;

	private final String region;

	private final String secretKey;

	@Nullable
	private final String targetModel;

	@Nullable
	private final String targetContainerHostname;

	@Nullable
	private final String inferenceComponentName;

	@Nullable
	private final Integer batchSize;

	@Nullable
	private final Integer dimensions;

	// ---------------------------------------------------------------------------------------------

	private AmazonSageMakerServiceSettings(Builder builder) {

		this.accessKey = ApiTypeHelper.requireNonNull(builder.accessKey, this, "accessKey");
		this.endpointName = ApiTypeHelper.requireNonNull(builder.endpointName, this, "endpointName");
		this.api = ApiTypeHelper.requireNonNull(builder.api, this, "api");
		this.region = ApiTypeHelper.requireNonNull(builder.region, this, "region");
		this.secretKey = ApiTypeHelper.requireNonNull(builder.secretKey, this, "secretKey");
		this.targetModel = builder.targetModel;
		this.targetContainerHostname = builder.targetContainerHostname;
		this.inferenceComponentName = builder.inferenceComponentName;
		this.batchSize = builder.batchSize;
		this.dimensions = builder.dimensions;

	}

	public static AmazonSageMakerServiceSettings of(
			Function<Builder, ObjectBuilder<AmazonSageMakerServiceSettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - A valid AWS access key that has permissions to use Amazon
	 * SageMaker and access to models for invoking requests.
	 * <p>
	 * API name: {@code access_key}
	 */
	public final String accessKey() {
		return this.accessKey;
	}

	/**
	 * Required - The name of the SageMaker endpoint.
	 * <p>
	 * API name: {@code endpoint_name}
	 */
	public final String endpointName() {
		return this.endpointName;
	}

	/**
	 * Required - The API format to use when calling SageMaker. Elasticsearch will
	 * convert the POST _inference request to this data format when invoking the
	 * SageMaker endpoint.
	 * <p>
	 * API name: {@code api}
	 */
	public final AmazonSageMakerApi api() {
		return this.api;
	}

	/**
	 * Required - The region that your endpoint or Amazon Resource Name (ARN) is
	 * deployed in. The list of available regions per model can be found in the
	 * Amazon SageMaker documentation.
	 * <p>
	 * API name: {@code region}
	 */
	public final String region() {
		return this.region;
	}

	/**
	 * Required - A valid AWS secret key that is paired with the
	 * <code>access_key</code>. For information about creating and managing access
	 * and secret keys, refer to the AWS documentation.
	 * <p>
	 * API name: {@code secret_key}
	 */
	public final String secretKey() {
		return this.secretKey;
	}

	/**
	 * The model ID when calling a multi-model endpoint.
	 * <p>
	 * API name: {@code target_model}
	 */
	@Nullable
	public final String targetModel() {
		return this.targetModel;
	}

	/**
	 * The container to directly invoke when calling a multi-container endpoint.
	 * <p>
	 * API name: {@code target_container_hostname}
	 */
	@Nullable
	public final String targetContainerHostname() {
		return this.targetContainerHostname;
	}

	/**
	 * The inference component to directly invoke when calling a multi-component
	 * endpoint.
	 * <p>
	 * API name: {@code inference_component_name}
	 */
	@Nullable
	public final String inferenceComponentName() {
		return this.inferenceComponentName;
	}

	/**
	 * The maximum number of inputs in each batch. This value is used by inference
	 * ingestion pipelines when processing semantic values. It correlates to the
	 * number of times the SageMaker endpoint is invoked (one per batch of input).
	 * <p>
	 * API name: {@code batch_size}
	 */
	@Nullable
	public final Integer batchSize() {
		return this.batchSize;
	}

	/**
	 * The number of dimensions returned by the text embedding models. If this value
	 * is not provided, then it is guessed by making invoking the endpoint for the
	 * <code>text_embedding</code> task.
	 * <p>
	 * API name: {@code dimensions}
	 */
	@Nullable
	public final Integer dimensions() {
		return this.dimensions;
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

		generator.writeKey("access_key");
		generator.write(this.accessKey);

		generator.writeKey("endpoint_name");
		generator.write(this.endpointName);

		generator.writeKey("api");
		this.api.serialize(generator, mapper);
		generator.writeKey("region");
		generator.write(this.region);

		generator.writeKey("secret_key");
		generator.write(this.secretKey);

		if (this.targetModel != null) {
			generator.writeKey("target_model");
			generator.write(this.targetModel);

		}
		if (this.targetContainerHostname != null) {
			generator.writeKey("target_container_hostname");
			generator.write(this.targetContainerHostname);

		}
		if (this.inferenceComponentName != null) {
			generator.writeKey("inference_component_name");
			generator.write(this.inferenceComponentName);

		}
		if (this.batchSize != null) {
			generator.writeKey("batch_size");
			generator.write(this.batchSize);

		}
		if (this.dimensions != null) {
			generator.writeKey("dimensions");
			generator.write(this.dimensions);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AmazonSageMakerServiceSettings}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<AmazonSageMakerServiceSettings> {
		private String accessKey;

		private String endpointName;

		private AmazonSageMakerApi api;

		private String region;

		private String secretKey;

		@Nullable
		private String targetModel;

		@Nullable
		private String targetContainerHostname;

		@Nullable
		private String inferenceComponentName;

		@Nullable
		private Integer batchSize;

		@Nullable
		private Integer dimensions;

		/**
		 * Required - A valid AWS access key that has permissions to use Amazon
		 * SageMaker and access to models for invoking requests.
		 * <p>
		 * API name: {@code access_key}
		 */
		public final Builder accessKey(String value) {
			this.accessKey = value;
			return this;
		}

		/**
		 * Required - The name of the SageMaker endpoint.
		 * <p>
		 * API name: {@code endpoint_name}
		 */
		public final Builder endpointName(String value) {
			this.endpointName = value;
			return this;
		}

		/**
		 * Required - The API format to use when calling SageMaker. Elasticsearch will
		 * convert the POST _inference request to this data format when invoking the
		 * SageMaker endpoint.
		 * <p>
		 * API name: {@code api}
		 */
		public final Builder api(AmazonSageMakerApi value) {
			this.api = value;
			return this;
		}

		/**
		 * Required - The region that your endpoint or Amazon Resource Name (ARN) is
		 * deployed in. The list of available regions per model can be found in the
		 * Amazon SageMaker documentation.
		 * <p>
		 * API name: {@code region}
		 */
		public final Builder region(String value) {
			this.region = value;
			return this;
		}

		/**
		 * Required - A valid AWS secret key that is paired with the
		 * <code>access_key</code>. For information about creating and managing access
		 * and secret keys, refer to the AWS documentation.
		 * <p>
		 * API name: {@code secret_key}
		 */
		public final Builder secretKey(String value) {
			this.secretKey = value;
			return this;
		}

		/**
		 * The model ID when calling a multi-model endpoint.
		 * <p>
		 * API name: {@code target_model}
		 */
		public final Builder targetModel(@Nullable String value) {
			this.targetModel = value;
			return this;
		}

		/**
		 * The container to directly invoke when calling a multi-container endpoint.
		 * <p>
		 * API name: {@code target_container_hostname}
		 */
		public final Builder targetContainerHostname(@Nullable String value) {
			this.targetContainerHostname = value;
			return this;
		}

		/**
		 * The inference component to directly invoke when calling a multi-component
		 * endpoint.
		 * <p>
		 * API name: {@code inference_component_name}
		 */
		public final Builder inferenceComponentName(@Nullable String value) {
			this.inferenceComponentName = value;
			return this;
		}

		/**
		 * The maximum number of inputs in each batch. This value is used by inference
		 * ingestion pipelines when processing semantic values. It correlates to the
		 * number of times the SageMaker endpoint is invoked (one per batch of input).
		 * <p>
		 * API name: {@code batch_size}
		 */
		public final Builder batchSize(@Nullable Integer value) {
			this.batchSize = value;
			return this;
		}

		/**
		 * The number of dimensions returned by the text embedding models. If this value
		 * is not provided, then it is guessed by making invoking the endpoint for the
		 * <code>text_embedding</code> task.
		 * <p>
		 * API name: {@code dimensions}
		 */
		public final Builder dimensions(@Nullable Integer value) {
			this.dimensions = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AmazonSageMakerServiceSettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AmazonSageMakerServiceSettings build() {
			_checkSingleUse();

			return new AmazonSageMakerServiceSettings(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AmazonSageMakerServiceSettings}
	 */
	public static final JsonpDeserializer<AmazonSageMakerServiceSettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, AmazonSageMakerServiceSettings::setupAmazonSageMakerServiceSettingsDeserializer);

	protected static void setupAmazonSageMakerServiceSettingsDeserializer(
			ObjectDeserializer<AmazonSageMakerServiceSettings.Builder> op) {

		op.add(Builder::accessKey, JsonpDeserializer.stringDeserializer(), "access_key");
		op.add(Builder::endpointName, JsonpDeserializer.stringDeserializer(), "endpoint_name");
		op.add(Builder::api, AmazonSageMakerApi._DESERIALIZER, "api");
		op.add(Builder::region, JsonpDeserializer.stringDeserializer(), "region");
		op.add(Builder::secretKey, JsonpDeserializer.stringDeserializer(), "secret_key");
		op.add(Builder::targetModel, JsonpDeserializer.stringDeserializer(), "target_model");
		op.add(Builder::targetContainerHostname, JsonpDeserializer.stringDeserializer(), "target_container_hostname");
		op.add(Builder::inferenceComponentName, JsonpDeserializer.stringDeserializer(), "inference_component_name");
		op.add(Builder::batchSize, JsonpDeserializer.integerDeserializer(), "batch_size");
		op.add(Builder::dimensions, JsonpDeserializer.integerDeserializer(), "dimensions");

	}

}
