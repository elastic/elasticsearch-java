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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
import co.elastic.clients.elasticsearch.inference.put_hugging_face.HuggingFaceServiceSettings;
import co.elastic.clients.elasticsearch.inference.put_hugging_face.HuggingFaceTaskType;
import co.elastic.clients.elasticsearch.inference.put_hugging_face.ServiceType;
>>>>>>> 03828daff (regen from latest spec)
=======
import co.elastic.clients.elasticsearch.inference.put_hugging_face.HuggingFaceServiceSettings;
import co.elastic.clients.elasticsearch.inference.put_hugging_face.HuggingFaceTaskType;
import co.elastic.clients.elasticsearch.inference.put_hugging_face.ServiceType;
>>>>>>> c49af58dc (Revert "temp rebase fix")
=======
>>>>>>> b5f478d93 ([codegen] update to latest spec and generator)
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

// typedef: inference.put_hugging_face.Request

/**
 * Create a Hugging Face inference endpoint.
 * <p>
 * Create an inference endpoint to perform an inference task with the
 * <code>hugging_face</code> service.
 * <p>
 * You must first create an inference endpoint on the Hugging Face endpoint page
 * to get an endpoint URL. Select the model you want to use on the new endpoint
 * creation page (for example <code>intfloat/e5-small-v2</code>), then select
 * the sentence embeddings task under the advanced configuration section. Create
 * the endpoint and copy the URL after the endpoint initialization has been
 * finished.
 * <p>
 * The following models are recommended for the Hugging Face service:
 * <ul>
 * <li><code>all-MiniLM-L6-v2</code></li>
 * <li><code>all-MiniLM-L12-v2</code></li>
 * <li><code>all-mpnet-base-v2</code></li>
 * <li><code>e5-base-v2</code></li>
 * <li><code>e5-small-v2</code></li>
 * <li><code>multilingual-e5-base</code></li>
 * <li><code>multilingual-e5-small</code></li>
 * </ul>
 * <p>
 * When you create an inference endpoint, the associated machine learning model
 * is automatically deployed if it is not already running. After creating the
 * endpoint, wait for the model deployment to complete before using it. To
 * verify the deployment status, use the get trained model statistics API. Look
 * for <code>&quot;state&quot;: &quot;fully_allocated&quot;</code> in the
 * response and ensure that the <code>&quot;allocation_count&quot;</code>
 * matches the <code>&quot;target_allocation_count&quot;</code>. Avoid creating
 * multiple endpoints for the same model unless required, as each endpoint
 * consumes significant resources.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#inference.put_hugging_face.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutHuggingFaceRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final InferenceChunkingSettings chunkingSettings;

	private final String huggingfaceInferenceId;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
	private final HuggingFaceServiceType service;
=======
	private final ServiceType service;
>>>>>>> 03828daff (regen from latest spec)
=======
	private final ServiceType service;
>>>>>>> c49af58dc (Revert "temp rebase fix")
=======
	private final HuggingFaceServiceType service;
>>>>>>> b5f478d93 ([codegen] update to latest spec and generator)

	private final HuggingFaceServiceSettings serviceSettings;

	private final HuggingFaceTaskType taskType;

	// ---------------------------------------------------------------------------------------------

	private PutHuggingFaceRequest(Builder builder) {

		this.chunkingSettings = builder.chunkingSettings;
		this.huggingfaceInferenceId = ApiTypeHelper.requireNonNull(builder.huggingfaceInferenceId, this,
				"huggingfaceInferenceId");
		this.service = ApiTypeHelper.requireNonNull(builder.service, this, "service");
		this.serviceSettings = ApiTypeHelper.requireNonNull(builder.serviceSettings, this, "serviceSettings");
		this.taskType = ApiTypeHelper.requireNonNull(builder.taskType, this, "taskType");

	}

	public static PutHuggingFaceRequest of(Function<Builder, ObjectBuilder<PutHuggingFaceRequest>> fn) {
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
	 * API name: {@code huggingface_inference_id}
	 */
	public final String huggingfaceInferenceId() {
		return this.huggingfaceInferenceId;
	}

	/**
	 * Required - The type of service supported for the specified task type. In this
	 * case, <code>hugging_face</code>.
	 * <p>
	 * API name: {@code service}
	 */
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
	public final HuggingFaceServiceType service() {
=======
	public final ServiceType service() {
>>>>>>> 03828daff (regen from latest spec)
=======
	public final ServiceType service() {
>>>>>>> c49af58dc (Revert "temp rebase fix")
=======
	public final HuggingFaceServiceType service() {
>>>>>>> b5f478d93 ([codegen] update to latest spec and generator)
		return this.service;
	}

	/**
	 * Required - Settings used to install the inference model. These settings are
	 * specific to the <code>hugging_face</code> service.
	 * <p>
	 * API name: {@code service_settings}
	 */
	public final HuggingFaceServiceSettings serviceSettings() {
		return this.serviceSettings;
	}

	/**
	 * Required - The type of the inference task that the model will perform.
	 * <p>
	 * API name: {@code task_type}
	 */
	public final HuggingFaceTaskType taskType() {
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
	 * Builder for {@link PutHuggingFaceRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PutHuggingFaceRequest> {
		@Nullable
		private InferenceChunkingSettings chunkingSettings;

		private String huggingfaceInferenceId;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
		private HuggingFaceServiceType service;
=======
		private ServiceType service;
>>>>>>> 03828daff (regen from latest spec)
=======
		private ServiceType service;
>>>>>>> c49af58dc (Revert "temp rebase fix")
=======
		private HuggingFaceServiceType service;
>>>>>>> b5f478d93 ([codegen] update to latest spec and generator)

		private HuggingFaceServiceSettings serviceSettings;

		private HuggingFaceTaskType taskType;

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
		 * API name: {@code huggingface_inference_id}
		 */
		public final Builder huggingfaceInferenceId(String value) {
			this.huggingfaceInferenceId = value;
			return this;
		}

		/**
		 * Required - The type of service supported for the specified task type. In this
		 * case, <code>hugging_face</code>.
		 * <p>
		 * API name: {@code service}
		 */
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
		public final Builder service(HuggingFaceServiceType value) {
=======
		public final Builder service(ServiceType value) {
>>>>>>> 03828daff (regen from latest spec)
=======
		public final Builder service(ServiceType value) {
>>>>>>> c49af58dc (Revert "temp rebase fix")
=======
		public final Builder service(HuggingFaceServiceType value) {
>>>>>>> b5f478d93 ([codegen] update to latest spec and generator)
			this.service = value;
			return this;
		}

		/**
		 * Required - Settings used to install the inference model. These settings are
		 * specific to the <code>hugging_face</code> service.
		 * <p>
		 * API name: {@code service_settings}
		 */
		public final Builder serviceSettings(HuggingFaceServiceSettings value) {
			this.serviceSettings = value;
			return this;
		}

		/**
		 * Required - Settings used to install the inference model. These settings are
		 * specific to the <code>hugging_face</code> service.
		 * <p>
		 * API name: {@code service_settings}
		 */
		public final Builder serviceSettings(
				Function<HuggingFaceServiceSettings.Builder, ObjectBuilder<HuggingFaceServiceSettings>> fn) {
			return this.serviceSettings(fn.apply(new HuggingFaceServiceSettings.Builder()).build());
		}

		/**
		 * Required - The type of the inference task that the model will perform.
		 * <p>
		 * API name: {@code task_type}
		 */
		public final Builder taskType(HuggingFaceTaskType value) {
			this.taskType = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutHuggingFaceRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutHuggingFaceRequest build() {
			_checkSingleUse();

			return new PutHuggingFaceRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutHuggingFaceRequest}
	 */
	public static final JsonpDeserializer<PutHuggingFaceRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutHuggingFaceRequest::setupPutHuggingFaceRequestDeserializer);

	protected static void setupPutHuggingFaceRequestDeserializer(ObjectDeserializer<PutHuggingFaceRequest.Builder> op) {

		op.add(Builder::chunkingSettings, InferenceChunkingSettings._DESERIALIZER, "chunking_settings");
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
		op.add(Builder::service, HuggingFaceServiceType._DESERIALIZER, "service");
=======
		op.add(Builder::service, ServiceType._DESERIALIZER, "service");
>>>>>>> 03828daff (regen from latest spec)
=======
		op.add(Builder::service, ServiceType._DESERIALIZER, "service");
>>>>>>> c49af58dc (Revert "temp rebase fix")
=======
		op.add(Builder::service, HuggingFaceServiceType._DESERIALIZER, "service");
>>>>>>> b5f478d93 ([codegen] update to latest spec and generator)
		op.add(Builder::serviceSettings, HuggingFaceServiceSettings._DESERIALIZER, "service_settings");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code inference.put_hugging_face}".
	 */
	public static final Endpoint<PutHuggingFaceRequest, PutHuggingFaceResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/inference.put_hugging_face",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _taskType = 1 << 0;
				final int _huggingfaceInferenceId = 1 << 1;

				int propsSet = 0;

				propsSet |= _taskType;
				propsSet |= _huggingfaceInferenceId;

				if (propsSet == (_taskType | _huggingfaceInferenceId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_inference");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.taskType.jsonValue(), buf);
					buf.append("/");
					SimpleEndpoint.pathEncode(request.huggingfaceInferenceId, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _taskType = 1 << 0;
				final int _huggingfaceInferenceId = 1 << 1;

				int propsSet = 0;

				propsSet |= _taskType;
				propsSet |= _huggingfaceInferenceId;

				if (propsSet == (_taskType | _huggingfaceInferenceId)) {
					params.put("taskType", request.taskType.jsonValue());
					params.put("huggingfaceInferenceId", request.huggingfaceInferenceId);
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, PutHuggingFaceResponse._DESERIALIZER);
}
