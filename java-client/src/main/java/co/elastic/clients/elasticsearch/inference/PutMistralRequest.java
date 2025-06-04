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

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
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
import java.util.HashMap;
import java.util.Map;
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

// typedef: inference.put_mistral.Request

/**
 * Create a Mistral inference endpoint.
 * <p>
 * Creates an inference endpoint to perform an inference task with the
 * <code>mistral</code> service.
 * 
 * @see <a href="../doc-files/api-spec.html#inference.put_mistral.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutMistralRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final InferenceChunkingSettings chunkingSettings;

	private final String mistralInferenceId;

	private final MistralServiceType service;

	private final MistralServiceSettings serviceSettings;

	private final MistralTaskType taskType;

	// ---------------------------------------------------------------------------------------------

	private PutMistralRequest(Builder builder) {

		this.chunkingSettings = builder.chunkingSettings;
		this.mistralInferenceId = ApiTypeHelper.requireNonNull(builder.mistralInferenceId, this, "mistralInferenceId");
		this.service = ApiTypeHelper.requireNonNull(builder.service, this, "service");
		this.serviceSettings = ApiTypeHelper.requireNonNull(builder.serviceSettings, this, "serviceSettings");
		this.taskType = ApiTypeHelper.requireNonNull(builder.taskType, this, "taskType");

	}

	public static PutMistralRequest of(Function<Builder, ObjectBuilder<PutMistralRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The chunking configuration object.
	 * <p>
	 * API name: {@code chunking_settings}
	 */
	@Nullable
	public final InferenceChunkingSettings chunkingSettings() {
		return this.chunkingSettings;
	}

	/**
	 * Required - The unique identifier of the inference endpoint.
	 * <p>
	 * API name: {@code mistral_inference_id}
	 */
	public final String mistralInferenceId() {
		return this.mistralInferenceId;
	}

	/**
	 * Required - The type of service supported for the specified task type. In this
	 * case, <code>mistral</code>.
	 * <p>
	 * API name: {@code service}
	 */
	public final MistralServiceType service() {
		return this.service;
	}

	/**
	 * Required - Settings used to install the inference model. These settings are
	 * specific to the <code>mistral</code> service.
	 * <p>
	 * API name: {@code service_settings}
	 */
	public final MistralServiceSettings serviceSettings() {
		return this.serviceSettings;
	}

	/**
	 * Required - The task type. The only valid task type for the model to perform
	 * is <code>text_embedding</code>.
	 * <p>
	 * API name: {@code task_type}
	 */
	public final MistralTaskType taskType() {
		return this.taskType;
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

		if (this.chunkingSettings != null) {
			generator.writeKey("chunking_settings");
			this.chunkingSettings.serialize(generator, mapper);

		}
		generator.writeKey("service");
		this.service.serialize(generator, mapper);
		generator.writeKey("service_settings");
		this.serviceSettings.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutMistralRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PutMistralRequest> {
		@Nullable
		private InferenceChunkingSettings chunkingSettings;

		private String mistralInferenceId;

		private MistralServiceType service;

		private MistralServiceSettings serviceSettings;

		private MistralTaskType taskType;

		/**
		 * The chunking configuration object.
		 * <p>
		 * API name: {@code chunking_settings}
		 */
		public final Builder chunkingSettings(@Nullable InferenceChunkingSettings value) {
			this.chunkingSettings = value;
			return this;
		}

		/**
		 * The chunking configuration object.
		 * <p>
		 * API name: {@code chunking_settings}
		 */
		public final Builder chunkingSettings(
				Function<InferenceChunkingSettings.Builder, ObjectBuilder<InferenceChunkingSettings>> fn) {
			return this.chunkingSettings(fn.apply(new InferenceChunkingSettings.Builder()).build());
		}

		/**
		 * Required - The unique identifier of the inference endpoint.
		 * <p>
		 * API name: {@code mistral_inference_id}
		 */
		public final Builder mistralInferenceId(String value) {
			this.mistralInferenceId = value;
			return this;
		}

		/**
		 * Required - The type of service supported for the specified task type. In this
		 * case, <code>mistral</code>.
		 * <p>
		 * API name: {@code service}
		 */
		public final Builder service(MistralServiceType value) {
			this.service = value;
			return this;
		}

		/**
		 * Required - Settings used to install the inference model. These settings are
		 * specific to the <code>mistral</code> service.
		 * <p>
		 * API name: {@code service_settings}
		 */
		public final Builder serviceSettings(MistralServiceSettings value) {
			this.serviceSettings = value;
			return this;
		}

		/**
		 * Required - Settings used to install the inference model. These settings are
		 * specific to the <code>mistral</code> service.
		 * <p>
		 * API name: {@code service_settings}
		 */
		public final Builder serviceSettings(
				Function<MistralServiceSettings.Builder, ObjectBuilder<MistralServiceSettings>> fn) {
			return this.serviceSettings(fn.apply(new MistralServiceSettings.Builder()).build());
		}

		/**
		 * Required - The task type. The only valid task type for the model to perform
		 * is <code>text_embedding</code>.
		 * <p>
		 * API name: {@code task_type}
		 */
		public final Builder taskType(MistralTaskType value) {
			this.taskType = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutMistralRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutMistralRequest build() {
			_checkSingleUse();

			return new PutMistralRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutMistralRequest}
	 */
	public static final JsonpDeserializer<PutMistralRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutMistralRequest::setupPutMistralRequestDeserializer);

	protected static void setupPutMistralRequestDeserializer(ObjectDeserializer<PutMistralRequest.Builder> op) {

		op.add(Builder::chunkingSettings, InferenceChunkingSettings._DESERIALIZER, "chunking_settings");
		op.add(Builder::service, MistralServiceType._DESERIALIZER, "service");
		op.add(Builder::serviceSettings, MistralServiceSettings._DESERIALIZER, "service_settings");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code inference.put_mistral}".
	 */
	public static final Endpoint<PutMistralRequest, PutMistralResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/inference.put_mistral",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _mistralInferenceId = 1 << 0;
				final int _taskType = 1 << 1;

				int propsSet = 0;

				propsSet |= _mistralInferenceId;
				propsSet |= _taskType;

				if (propsSet == (_taskType | _mistralInferenceId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_inference");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.taskType.jsonValue(), buf);
					buf.append("/");
					SimpleEndpoint.pathEncode(request.mistralInferenceId, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _mistralInferenceId = 1 << 0;
				final int _taskType = 1 << 1;

				int propsSet = 0;

				propsSet |= _mistralInferenceId;
				propsSet |= _taskType;

				if (propsSet == (_taskType | _mistralInferenceId)) {
					params.put("taskType", request.taskType.jsonValue());
					params.put("mistralInferenceId", request.mistralInferenceId);
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, PutMistralResponse._DESERIALIZER);
}
