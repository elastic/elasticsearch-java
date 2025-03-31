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
=======
import co.elastic.clients.elasticsearch.inference.put_voyageai.ServiceType;
import co.elastic.clients.elasticsearch.inference.put_voyageai.VoyageAIServiceSettings;
import co.elastic.clients.elasticsearch.inference.put_voyageai.VoyageAITaskSettings;
import co.elastic.clients.elasticsearch.inference.put_voyageai.VoyageAITaskType;
>>>>>>> c49af58dc (Revert "temp rebase fix")
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

// typedef: inference.put_voyageai.Request

/**
 * Create a VoyageAI inference endpoint.
 * <p>
 * Create an inference endpoint to perform an inference task with the
 * <code>voyageai</code> service.
 * <p>
 * Avoid creating multiple endpoints for the same model unless required, as each
 * endpoint consumes significant resources.
 * 
 * @see <a href="../doc-files/api-spec.html#inference.put_voyageai.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutVoyageaiRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final InferenceChunkingSettings chunkingSettings;

<<<<<<< HEAD
	private final VoyageAIServiceType service;
=======
	private final ServiceType service;
>>>>>>> c49af58dc (Revert "temp rebase fix")

	private final VoyageAIServiceSettings serviceSettings;

	@Nullable
	private final VoyageAITaskSettings taskSettings;

	private final VoyageAITaskType taskType;

	private final String voyageaiInferenceId;

	// ---------------------------------------------------------------------------------------------

	private PutVoyageaiRequest(Builder builder) {

		this.chunkingSettings = builder.chunkingSettings;
		this.service = ApiTypeHelper.requireNonNull(builder.service, this, "service");
		this.serviceSettings = ApiTypeHelper.requireNonNull(builder.serviceSettings, this, "serviceSettings");
		this.taskSettings = builder.taskSettings;
		this.taskType = ApiTypeHelper.requireNonNull(builder.taskType, this, "taskType");
		this.voyageaiInferenceId = ApiTypeHelper.requireNonNull(builder.voyageaiInferenceId, this,
				"voyageaiInferenceId");

	}

	public static PutVoyageaiRequest of(Function<Builder, ObjectBuilder<PutVoyageaiRequest>> fn) {
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
	 * Required - The type of service supported for the specified task type. In this
	 * case, <code>voyageai</code>.
	 * <p>
	 * API name: {@code service}
	 */
<<<<<<< HEAD
	public final VoyageAIServiceType service() {
=======
	public final ServiceType service() {
>>>>>>> c49af58dc (Revert "temp rebase fix")
		return this.service;
	}

	/**
	 * Required - Settings used to install the inference model. These settings are
	 * specific to the <code>voyageai</code> service.
	 * <p>
	 * API name: {@code service_settings}
	 */
	public final VoyageAIServiceSettings serviceSettings() {
		return this.serviceSettings;
	}

	/**
	 * Settings to configure the inference task. These settings are specific to the
	 * task type you specified.
	 * <p>
	 * API name: {@code task_settings}
	 */
	@Nullable
	public final VoyageAITaskSettings taskSettings() {
		return this.taskSettings;
	}

	/**
	 * Required - The type of the inference task that the model will perform.
	 * <p>
	 * API name: {@code task_type}
	 */
	public final VoyageAITaskType taskType() {
		return this.taskType;
	}

	/**
	 * Required - The unique identifier of the inference endpoint.
	 * <p>
	 * API name: {@code voyageai_inference_id}
	 */
	public final String voyageaiInferenceId() {
		return this.voyageaiInferenceId;
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

		if (this.taskSettings != null) {
			generator.writeKey("task_settings");
			this.taskSettings.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutVoyageaiRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PutVoyageaiRequest> {
		@Nullable
		private InferenceChunkingSettings chunkingSettings;

<<<<<<< HEAD
		private VoyageAIServiceType service;
=======
		private ServiceType service;
>>>>>>> c49af58dc (Revert "temp rebase fix")

		private VoyageAIServiceSettings serviceSettings;

		@Nullable
		private VoyageAITaskSettings taskSettings;

		private VoyageAITaskType taskType;

		private String voyageaiInferenceId;

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
		 * Required - The type of service supported for the specified task type. In this
		 * case, <code>voyageai</code>.
		 * <p>
		 * API name: {@code service}
		 */
<<<<<<< HEAD
		public final Builder service(VoyageAIServiceType value) {
=======
		public final Builder service(ServiceType value) {
>>>>>>> c49af58dc (Revert "temp rebase fix")
			this.service = value;
			return this;
		}

		/**
		 * Required - Settings used to install the inference model. These settings are
		 * specific to the <code>voyageai</code> service.
		 * <p>
		 * API name: {@code service_settings}
		 */
		public final Builder serviceSettings(VoyageAIServiceSettings value) {
			this.serviceSettings = value;
			return this;
		}

		/**
		 * Required - Settings used to install the inference model. These settings are
		 * specific to the <code>voyageai</code> service.
		 * <p>
		 * API name: {@code service_settings}
		 */
		public final Builder serviceSettings(
				Function<VoyageAIServiceSettings.Builder, ObjectBuilder<VoyageAIServiceSettings>> fn) {
			return this.serviceSettings(fn.apply(new VoyageAIServiceSettings.Builder()).build());
		}

		/**
		 * Settings to configure the inference task. These settings are specific to the
		 * task type you specified.
		 * <p>
		 * API name: {@code task_settings}
		 */
		public final Builder taskSettings(@Nullable VoyageAITaskSettings value) {
			this.taskSettings = value;
			return this;
		}

		/**
		 * Settings to configure the inference task. These settings are specific to the
		 * task type you specified.
		 * <p>
		 * API name: {@code task_settings}
		 */
		public final Builder taskSettings(
				Function<VoyageAITaskSettings.Builder, ObjectBuilder<VoyageAITaskSettings>> fn) {
			return this.taskSettings(fn.apply(new VoyageAITaskSettings.Builder()).build());
		}

		/**
		 * Required - The type of the inference task that the model will perform.
		 * <p>
		 * API name: {@code task_type}
		 */
		public final Builder taskType(VoyageAITaskType value) {
			this.taskType = value;
			return this;
		}

		/**
		 * Required - The unique identifier of the inference endpoint.
		 * <p>
		 * API name: {@code voyageai_inference_id}
		 */
		public final Builder voyageaiInferenceId(String value) {
			this.voyageaiInferenceId = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutVoyageaiRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutVoyageaiRequest build() {
			_checkSingleUse();

			return new PutVoyageaiRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutVoyageaiRequest}
	 */
	public static final JsonpDeserializer<PutVoyageaiRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutVoyageaiRequest::setupPutVoyageaiRequestDeserializer);

	protected static void setupPutVoyageaiRequestDeserializer(ObjectDeserializer<PutVoyageaiRequest.Builder> op) {

		op.add(Builder::chunkingSettings, InferenceChunkingSettings._DESERIALIZER, "chunking_settings");
<<<<<<< HEAD
		op.add(Builder::service, VoyageAIServiceType._DESERIALIZER, "service");
=======
		op.add(Builder::service, ServiceType._DESERIALIZER, "service");
>>>>>>> c49af58dc (Revert "temp rebase fix")
		op.add(Builder::serviceSettings, VoyageAIServiceSettings._DESERIALIZER, "service_settings");
		op.add(Builder::taskSettings, VoyageAITaskSettings._DESERIALIZER, "task_settings");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code inference.put_voyageai}".
	 */
	public static final Endpoint<PutVoyageaiRequest, PutVoyageaiResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/inference.put_voyageai",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _voyageaiInferenceId = 1 << 0;
				final int _taskType = 1 << 1;

				int propsSet = 0;

				propsSet |= _voyageaiInferenceId;
				propsSet |= _taskType;

				if (propsSet == (_taskType | _voyageaiInferenceId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_inference");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.taskType.jsonValue(), buf);
					buf.append("/");
					SimpleEndpoint.pathEncode(request.voyageaiInferenceId, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _voyageaiInferenceId = 1 << 0;
				final int _taskType = 1 << 1;

				int propsSet = 0;

				propsSet |= _voyageaiInferenceId;
				propsSet |= _taskType;

				if (propsSet == (_taskType | _voyageaiInferenceId)) {
					params.put("taskType", request.taskType.jsonValue());
					params.put("voyageaiInferenceId", request.voyageaiInferenceId);
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, PutVoyageaiResponse._DESERIALIZER);
}
