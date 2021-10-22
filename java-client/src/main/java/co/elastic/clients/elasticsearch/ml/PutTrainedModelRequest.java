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
import co.elastic.clients.elasticsearch._types.aggregations.InferenceConfig;
import co.elastic.clients.elasticsearch.ml.put_trained_model.Definition;
import co.elastic.clients.elasticsearch.ml.put_trained_model.Input;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.SimpleEndpoint;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.put_trained_model.Request
@JsonpDeserializable
public final class PutTrainedModelRequest extends RequestBase implements JsonpSerializable {
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

	@Nullable
	private final List<String> tags;

	// ---------------------------------------------------------------------------------------------

	public PutTrainedModelRequest(Builder builder) {

		this.compressedDefinition = builder.compressedDefinition;
		this.definition = builder.definition;
		this.description = builder.description;
		this.inferenceConfig = Objects.requireNonNull(builder.inferenceConfig, "inference_config");
		this.input = Objects.requireNonNull(builder.input, "input");
		this.metadata = builder.metadata;
		this.modelId = Objects.requireNonNull(builder.modelId, "model_id");
		this.tags = ModelTypeHelper.unmodifiable(builder.tags);

	}

	public PutTrainedModelRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * The compressed (GZipped and Base64 encoded) inference definition of the
	 * model. If compressed_definition is specified, then definition cannot be
	 * specified.
	 * <p>
	 * API name: {@code compressed_definition}
	 */
	@Nullable
	public String compressedDefinition() {
		return this.compressedDefinition;
	}

	/**
	 * The inference definition for the model. If definition is specified, then
	 * compressed_definition cannot be specified.
	 * <p>
	 * API name: {@code definition}
	 */
	@Nullable
	public Definition definition() {
		return this.definition;
	}

	/**
	 * A human-readable description of the inference trained model.
	 * <p>
	 * API name: {@code description}
	 */
	@Nullable
	public String description() {
		return this.description;
	}

	/**
	 * Required - The default configuration for inference. This can be either a
	 * regression or classification configuration. It must match the underlying
	 * definition.trained_model's target_type.
	 * <p>
	 * API name: {@code inference_config}
	 */
	public InferenceConfig inferenceConfig() {
		return this.inferenceConfig;
	}

	/**
	 * Required - The input field names for the model definition.
	 * <p>
	 * API name: {@code input}
	 */
	public Input input() {
		return this.input;
	}

	/**
	 * An object map that contains metadata about the model.
	 * <p>
	 * API name: {@code metadata}
	 */
	@Nullable
	public JsonData metadata() {
		return this.metadata;
	}

	/**
	 * Required - The unique identifier of the trained model.
	 * <p>
	 * API name: {@code model_id}
	 */
	public String modelId() {
		return this.modelId;
	}

	/**
	 * An array of tags to organize the model.
	 * <p>
	 * API name: {@code tags}
	 */
	@Nullable
	public List<String> tags() {
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
		if (this.tags != null) {

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
	public static class Builder implements ObjectBuilder<PutTrainedModelRequest> {
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
		public Builder compressedDefinition(@Nullable String value) {
			this.compressedDefinition = value;
			return this;
		}

		/**
		 * The inference definition for the model. If definition is specified, then
		 * compressed_definition cannot be specified.
		 * <p>
		 * API name: {@code definition}
		 */
		public Builder definition(@Nullable Definition value) {
			this.definition = value;
			return this;
		}

		/**
		 * The inference definition for the model. If definition is specified, then
		 * compressed_definition cannot be specified.
		 * <p>
		 * API name: {@code definition}
		 */
		public Builder definition(Function<Definition.Builder, ObjectBuilder<Definition>> fn) {
			return this.definition(fn.apply(new Definition.Builder()).build());
		}

		/**
		 * A human-readable description of the inference trained model.
		 * <p>
		 * API name: {@code description}
		 */
		public Builder description(@Nullable String value) {
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
		public Builder inferenceConfig(InferenceConfig value) {
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
		public Builder inferenceConfig(Function<InferenceConfig.Builder, ObjectBuilder<InferenceConfig>> fn) {
			return this.inferenceConfig(fn.apply(new InferenceConfig.Builder()).build());
		}

		/**
		 * Required - The input field names for the model definition.
		 * <p>
		 * API name: {@code input}
		 */
		public Builder input(Input value) {
			this.input = value;
			return this;
		}

		/**
		 * Required - The input field names for the model definition.
		 * <p>
		 * API name: {@code input}
		 */
		public Builder input(Function<Input.Builder, ObjectBuilder<Input>> fn) {
			return this.input(fn.apply(new Input.Builder()).build());
		}

		/**
		 * An object map that contains metadata about the model.
		 * <p>
		 * API name: {@code metadata}
		 */
		public Builder metadata(@Nullable JsonData value) {
			this.metadata = value;
			return this;
		}

		/**
		 * Required - The unique identifier of the trained model.
		 * <p>
		 * API name: {@code model_id}
		 */
		public Builder modelId(String value) {
			this.modelId = value;
			return this;
		}

		/**
		 * An array of tags to organize the model.
		 * <p>
		 * API name: {@code tags}
		 */
		public Builder tags(@Nullable List<String> value) {
			this.tags = value;
			return this;
		}

		/**
		 * An array of tags to organize the model.
		 * <p>
		 * API name: {@code tags}
		 */
		public Builder tags(String... value) {
			this.tags = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #tags(List)}, creating the list if needed.
		 */
		public Builder addTags(String value) {
			if (this.tags == null) {
				this.tags = new ArrayList<>();
			}
			this.tags.add(value);
			return this;
		}

		/**
		 * Builds a {@link PutTrainedModelRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutTrainedModelRequest build() {

			return new PutTrainedModelRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutTrainedModelRequest}
	 */
	public static final JsonpDeserializer<PutTrainedModelRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutTrainedModelRequest::setupPutTrainedModelRequestDeserializer, Builder::build);

	protected static void setupPutTrainedModelRequestDeserializer(
			DelegatingDeserializer<PutTrainedModelRequest.Builder> op) {

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
	public static final Endpoint<PutTrainedModelRequest, PutTrainedModelResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
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
