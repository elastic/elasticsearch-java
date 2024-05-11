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

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.aggregations.InferenceConfig;
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
import java.lang.String;
import java.util.Collections;
import java.util.List;
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
	private final Definition definition;

	@Nullable
	private final String description;

	private final InferenceConfig inferenceConfig;

	private final Input input;

	@Nullable
	private final JsonData metadata;

	private final String modelId;

	private final List<String> tags;

	// ---------------------------------------------------------------------------------------------

	private PutTrainedModelRequest(Builder builder) {

		this.compressedDefinition = builder.compressedDefinition;
		this.definition = builder.definition;
		this.description = builder.description;
		this.inferenceConfig = ApiTypeHelper.requireNonNull(builder.inferenceConfig, this, "inferenceConfig");
		this.input = ApiTypeHelper.requireNonNull(builder.input, this, "input");
		this.metadata = builder.metadata;
		this.modelId = ApiTypeHelper.requireNonNull(builder.modelId, this, "modelId");
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
	 * Required - The default configuration for inference. This can be either a
	 * regression or classification configuration. It must match the underlying
	 * definition.trained_model's target_type.
	 * <p>
	 * API name: {@code inference_config}
	 */
	public final InferenceConfig inferenceConfig() {
		return this.inferenceConfig;
	}

	/**
	 * Required - The input field names for the model definition.
	 * <p>
	 * API name: {@code input}
	 */
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
		generator.writeKey("inference_config");
		this.inferenceConfig.serialize(generator, mapper);

		generator.writeKey("input");
		this.input.serialize(generator, mapper);

		if (this.metadata != null) {
			generator.writeKey("metadata");
			this.metadata.serialize(generator, mapper);

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
		private Definition definition;

		@Nullable
		private String description;

		private InferenceConfig inferenceConfig;

		private Input input;

		@Nullable
		private JsonData metadata;

		private String modelId;

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
		 * Required - The default configuration for inference. This can be either a
		 * regression or classification configuration. It must match the underlying
		 * definition.trained_model's target_type.
		 * <p>
		 * API name: {@code inference_config}
		 */
		public final Builder inferenceConfig(InferenceConfig value) {
			this.inferenceConfig = value;
			return this;
		}

		/**
		 * Required - The default configuration for inference. This can be either a
		 * regression or classification configuration. It must match the underlying
		 * definition.trained_model's target_type.
		 * <p>
		 * API name: {@code inference_config}
		 */
		public final Builder inferenceConfig(Function<InferenceConfig.Builder, ObjectBuilder<InferenceConfig>> fn) {
			return this.inferenceConfig(fn.apply(new InferenceConfig.Builder()).build());
		}

		/**
		 * Required - The input field names for the model definition.
		 * <p>
		 * API name: {@code input}
		 */
		public final Builder input(Input value) {
			this.input = value;
			return this;
		}

		/**
		 * Required - The input field names for the model definition.
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
		op.add(Builder::inferenceConfig, InferenceConfig._DESERIALIZER, "inference_config");
		op.add(Builder::input, Input._DESERIALIZER, "input");
		op.add(Builder::metadata, JsonData._DESERIALIZER, "metadata");
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

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, PutTrainedModelResponse._DESERIALIZER);
}
