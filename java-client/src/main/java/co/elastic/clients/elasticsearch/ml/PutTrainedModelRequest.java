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

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch.ml.put_trained_model.Definition;
import co.elastic.clients.elasticsearch.ml.put_trained_model.Input;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.put_trained_model.Request

/**
 * Enables you to supply a trained model that is not created by data frame
 * analytics.
 * 
 * @see <a href="../doc-files/api-spec.html#ml.put_trained_model.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutTrainedModelRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final String compressedDefinition;

	@Nullable
	private final Boolean deferDefinitionDecompression;

	@Nullable
	private final Definition definition;

	@Nullable
	private final String description;

	@Nullable
	private final InferenceConfigCreate inferenceConfig;

	@Nullable
	private final Input input;

	@Nullable
	private final JsonData metadata;

	private final String modelId;

	@Nullable
	private final Long modelSizeBytes;

	@Nullable
	private final TrainedModelType modelType;

	private final List<String> tags;

	// ---------------------------------------------------------------------------------------------

	private PutTrainedModelRequest(Builder builder) {

		this.compressedDefinition = builder.compressedDefinition;
		this.deferDefinitionDecompression = builder.deferDefinitionDecompression;
		this.definition = builder.definition;
		this.description = builder.description;
		this.inferenceConfig = builder.inferenceConfig;
		this.input = builder.input;
		this.metadata = builder.metadata;
		this.modelId = ApiTypeHelper.requireNonNull(builder.modelId, this, "modelId");
		this.modelSizeBytes = builder.modelSizeBytes;
		this.modelType = builder.modelType;
		this.tags = ApiTypeHelper.unmodifiable(builder.tags);

	}

	public static PutTrainedModelRequest of(Function<Builder, ObjectBuilder<PutTrainedModelRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The compressed (GZipped and Base64 encoded) inference definition of the
	 * model. If compressed_definition is specified, then definition cannot be
	 * specified.
	 * <p>
	 * API name: {@code compressed_definition}
	 */
	@Nullable
	public final String compressedDefinition() {
		return this.compressedDefinition;
	}

	/**
	 * If set to <code>true</code> and a <code>compressed_definition</code> is
	 * provided, the request defers definition decompression and skips relevant
	 * validations.
	 * <p>
	 * API name: {@code defer_definition_decompression}
	 */
	@Nullable
	public final Boolean deferDefinitionDecompression() {
		return this.deferDefinitionDecompression;
	}

	/**
	 * The inference definition for the model. If definition is specified, then
	 * compressed_definition cannot be specified.
	 * <p>
	 * API name: {@code definition}
	 */
	@Nullable
	public final Definition definition() {
		return this.definition;
	}

	/**
	 * A human-readable description of the inference trained model.
	 * <p>
	 * API name: {@code description}
	 */
	@Nullable
	public final String description() {
		return this.description;
	}

	/**
	 * The default configuration for inference. This can be either a regression or
	 * classification configuration. It must match the underlying
	 * definition.trained_model's target_type. For pre-packaged models such as ELSER
	 * the config is not required.
	 * <p>
	 * API name: {@code inference_config}
	 */
	@Nullable
	public final InferenceConfigCreate inferenceConfig() {
		return this.inferenceConfig;
	}

	/**
	 * The input field names for the model definition.
	 * <p>
	 * API name: {@code input}
	 */
	@Nullable
	public final Input input() {
		return this.input;
	}

	/**
	 * An object map that contains metadata about the model.
	 * <p>
	 * API name: {@code metadata}
	 */
	@Nullable
	public final JsonData metadata() {
		return this.metadata;
	}

	/**
	 * Required - The unique identifier of the trained model.
	 * <p>
	 * API name: {@code model_id}
	 */
	public final String modelId() {
		return this.modelId;
	}

	/**
	 * The estimated memory usage in bytes to keep the trained model in memory. This
	 * property is supported only if defer_definition_decompression is true or the
	 * model definition is not supplied.
	 * <p>
	 * API name: {@code model_size_bytes}
	 */
	@Nullable
	public final Long modelSizeBytes() {
		return this.modelSizeBytes;
	}

	/**
	 * The model type.
	 * <p>
	 * API name: {@code model_type}
	 */
	@Nullable
	public final TrainedModelType modelType() {
		return this.modelType;
	}

	/**
	 * An array of tags to organize the model.
	 * <p>
	 * API name: {@code tags}
	 */
	public final List<String> tags() {
		return this.tags;
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

		if (this.compressedDefinition != null) {
			generator.writeKey("compressed_definition");
			generator.write(this.compressedDefinition);

		}
		if (this.definition != null) {
			generator.writeKey("definition");
			this.definition.serialize(generator, mapper);

		}
		if (this.description != null) {
			generator.writeKey("description");
			generator.write(this.description);

		}
		if (this.inferenceConfig != null) {
			generator.writeKey("inference_config");
			this.inferenceConfig.serialize(generator, mapper);

		}
		if (this.input != null) {
			generator.writeKey("input");
			this.input.serialize(generator, mapper);

		}
		if (this.metadata != null) {
			generator.writeKey("metadata");
			this.metadata.serialize(generator, mapper);

		}
		if (this.modelSizeBytes != null) {
			generator.writeKey("model_size_bytes");
			generator.write(this.modelSizeBytes);

		}
		if (this.modelType != null) {
			generator.writeKey("model_type");
			this.modelType.serialize(generator, mapper);
		}
		if (ApiTypeHelper.isDefined(this.tags)) {
			generator.writeKey("tags");
			generator.writeStartArray();
			for (String item0 : this.tags) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutTrainedModelRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PutTrainedModelRequest> {
		@Nullable
		private String compressedDefinition;

		@Nullable
		private Boolean deferDefinitionDecompression;

		@Nullable
		private Definition definition;

		@Nullable
		private String description;

		@Nullable
		private InferenceConfigCreate inferenceConfig;

		@Nullable
		private Input input;

		@Nullable
		private JsonData metadata;

		private String modelId;

		@Nullable
		private Long modelSizeBytes;

		@Nullable
		private TrainedModelType modelType;

		@Nullable
		private List<String> tags;

		/**
		 * The compressed (GZipped and Base64 encoded) inference definition of the
		 * model. If compressed_definition is specified, then definition cannot be
		 * specified.
		 * <p>
		 * API name: {@code compressed_definition}
		 */
		public final Builder compressedDefinition(@Nullable String value) {
			this.compressedDefinition = value;
			return this;
		}

		/**
		 * If set to <code>true</code> and a <code>compressed_definition</code> is
		 * provided, the request defers definition decompression and skips relevant
		 * validations.
		 * <p>
		 * API name: {@code defer_definition_decompression}
		 */
		public final Builder deferDefinitionDecompression(@Nullable Boolean value) {
			this.deferDefinitionDecompression = value;
			return this;
		}

		/**
		 * The inference definition for the model. If definition is specified, then
		 * compressed_definition cannot be specified.
		 * <p>
		 * API name: {@code definition}
		 */
		public final Builder definition(@Nullable Definition value) {
			this.definition = value;
			return this;
		}

		/**
		 * The inference definition for the model. If definition is specified, then
		 * compressed_definition cannot be specified.
		 * <p>
		 * API name: {@code definition}
		 */
		public final Builder definition(Function<Definition.Builder, ObjectBuilder<Definition>> fn) {
			return this.definition(fn.apply(new Definition.Builder()).build());
		}

		/**
		 * A human-readable description of the inference trained model.
		 * <p>
		 * API name: {@code description}
		 */
		public final Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * The default configuration for inference. This can be either a regression or
		 * classification configuration. It must match the underlying
		 * definition.trained_model's target_type. For pre-packaged models such as ELSER
		 * the config is not required.
		 * <p>
		 * API name: {@code inference_config}
		 */
		public final Builder inferenceConfig(@Nullable InferenceConfigCreate value) {
			this.inferenceConfig = value;
			return this;
		}

		/**
		 * The default configuration for inference. This can be either a regression or
		 * classification configuration. It must match the underlying
		 * definition.trained_model's target_type. For pre-packaged models such as ELSER
		 * the config is not required.
		 * <p>
		 * API name: {@code inference_config}
		 */
		public final Builder inferenceConfig(
				Function<InferenceConfigCreate.Builder, ObjectBuilder<InferenceConfigCreate>> fn) {
			return this.inferenceConfig(fn.apply(new InferenceConfigCreate.Builder()).build());
		}

		/**
		 * The input field names for the model definition.
		 * <p>
		 * API name: {@code input}
		 */
		public final Builder input(@Nullable Input value) {
			this.input = value;
			return this;
		}

		/**
		 * The input field names for the model definition.
		 * <p>
		 * API name: {@code input}
		 */
		public final Builder input(Function<Input.Builder, ObjectBuilder<Input>> fn) {
			return this.input(fn.apply(new Input.Builder()).build());
		}

		/**
		 * An object map that contains metadata about the model.
		 * <p>
		 * API name: {@code metadata}
		 */
		public final Builder metadata(@Nullable JsonData value) {
			this.metadata = value;
			return this;
		}

		/**
		 * Required - The unique identifier of the trained model.
		 * <p>
		 * API name: {@code model_id}
		 */
		public final Builder modelId(String value) {
			this.modelId = value;
			return this;
		}

		/**
		 * The estimated memory usage in bytes to keep the trained model in memory. This
		 * property is supported only if defer_definition_decompression is true or the
		 * model definition is not supplied.
		 * <p>
		 * API name: {@code model_size_bytes}
		 */
		public final Builder modelSizeBytes(@Nullable Long value) {
			this.modelSizeBytes = value;
			return this;
		}

		/**
		 * The model type.
		 * <p>
		 * API name: {@code model_type}
		 */
		public final Builder modelType(@Nullable TrainedModelType value) {
			this.modelType = value;
			return this;
		}

		/**
		 * An array of tags to organize the model.
		 * <p>
		 * API name: {@code tags}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>tags</code>.
		 */
		public final Builder tags(List<String> list) {
			this.tags = _listAddAll(this.tags, list);
			return this;
		}

		/**
		 * An array of tags to organize the model.
		 * <p>
		 * API name: {@code tags}
		 * <p>
		 * Adds one or more values to <code>tags</code>.
		 */
		public final Builder tags(String value, String... values) {
			this.tags = _listAdd(this.tags, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutTrainedModelRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutTrainedModelRequest build() {
			_checkSingleUse();

			return new PutTrainedModelRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutTrainedModelRequest}
	 */
	public static final JsonpDeserializer<PutTrainedModelRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutTrainedModelRequest::setupPutTrainedModelRequestDeserializer);

	protected static void setupPutTrainedModelRequestDeserializer(
			ObjectDeserializer<PutTrainedModelRequest.Builder> op) {

		op.add(Builder::compressedDefinition, JsonpDeserializer.stringDeserializer(), "compressed_definition");
		op.add(Builder::definition, Definition._DESERIALIZER, "definition");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::inferenceConfig, InferenceConfigCreate._DESERIALIZER, "inference_config");
		op.add(Builder::input, Input._DESERIALIZER, "input");
		op.add(Builder::metadata, JsonData._DESERIALIZER, "metadata");
		op.add(Builder::modelSizeBytes, JsonpDeserializer.longDeserializer(), "model_size_bytes");
		op.add(Builder::modelType, TrainedModelType._DESERIALIZER, "model_type");
		op.add(Builder::tags, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "tags");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.put_trained_model}".
	 */
	public static final Endpoint<PutTrainedModelRequest, PutTrainedModelResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ml.put_trained_model",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _modelId = 1 << 0;

				int propsSet = 0;

				propsSet |= _modelId;

				if (propsSet == (_modelId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/trained_models");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.modelId, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _modelId = 1 << 0;

				int propsSet = 0;

				propsSet |= _modelId;

				if (propsSet == (_modelId)) {
					params.put("modelId", request.modelId);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.deferDefinitionDecompression != null) {
					params.put("defer_definition_decompression", String.valueOf(request.deferDefinitionDecompression));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, PutTrainedModelResponse._DESERIALIZER);
}
