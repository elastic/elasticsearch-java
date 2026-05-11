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
import co.elastic.clients.elasticsearch._types.Time;
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

// typedef: inference.put_fireworksai.Request

/**
 * Create a Fireworks AI inference endpoint.
 * <p>
 * Create an inference endpoint to perform an inference task with the
 * <code>fireworksai</code> service.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#inference.put_fireworksai.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutFireworksaiRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final InferenceChunkingSettings chunkingSettings;

	private final String fireworksaiInferenceId;

	private final FireworksAIServiceType service;

	private final FireworksAIServiceSettings serviceSettings;

	@Nullable
	private final FireworksAITaskSettings taskSettings;

	private final FireworksAITaskType taskType;

	@Nullable
	private final Time timeout;

	// ---------------------------------------------------------------------------------------------

	private PutFireworksaiRequest(Builder builder) {

		this.chunkingSettings = builder.chunkingSettings;
		this.fireworksaiInferenceId = ApiTypeHelper.requireNonNull(builder.fireworksaiInferenceId, this,
				"fireworksaiInferenceId");
		this.service = ApiTypeHelper.requireNonNull(builder.service, this, "service");
		this.serviceSettings = ApiTypeHelper.requireNonNull(builder.serviceSettings, this, "serviceSettings");
		this.taskSettings = builder.taskSettings;
		this.taskType = ApiTypeHelper.requireNonNull(builder.taskType, this, "taskType");
		this.timeout = builder.timeout;

	}

	public static PutFireworksaiRequest of(Function<Builder, ObjectBuilder<PutFireworksaiRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The chunking configuration object. Applies only to the
	 * <code>text_embedding</code> task type. Not applicable to the
	 * <code>completion</code> or <code>chat_completion</code> task types.
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
	 * API name: {@code fireworksai_inference_id}
	 */
	public final String fireworksaiInferenceId() {
		return this.fireworksaiInferenceId;
	}

	/**
	 * Required - The type of service supported for the specified task type. In this
	 * case, <code>fireworksai</code>.
	 * <p>
	 * API name: {@code service}
	 */
	public final FireworksAIServiceType service() {
		return this.service;
	}

	/**
	 * Required - Settings used to install the inference model. These settings are
	 * specific to the <code>fireworksai</code> service.
	 * <p>
	 * API name: {@code service_settings}
	 */
	public final FireworksAIServiceSettings serviceSettings() {
		return this.serviceSettings;
	}

	/**
	 * Settings to configure the inference task. Applies only to the
	 * <code>completion</code> or <code>chat_completion</code> task types. Not
	 * applicable to the <code>text_embedding</code> task type. These settings are
	 * specific to the task type you specified.
	 * <p>
	 * API name: {@code task_settings}
	 */
	@Nullable
	public final FireworksAITaskSettings taskSettings() {
		return this.taskSettings;
	}

	/**
	 * Required - The type of the inference task that the model will perform.
	 * <p>
	 * API name: {@code task_type}
	 */
	public final FireworksAITaskType taskType() {
		return this.taskType;
	}

	/**
	 * Specifies the amount of time to wait for the inference endpoint to be
	 * created.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
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
	 * Builder for {@link PutFireworksaiRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PutFireworksaiRequest> {
		@Nullable
		private InferenceChunkingSettings chunkingSettings;

		private String fireworksaiInferenceId;

		private FireworksAIServiceType service;

		private FireworksAIServiceSettings serviceSettings;

		@Nullable
		private FireworksAITaskSettings taskSettings;

		private FireworksAITaskType taskType;

		@Nullable
		private Time timeout;

		public Builder() {
		}
		private Builder(PutFireworksaiRequest instance) {
			this.chunkingSettings = instance.chunkingSettings;
			this.fireworksaiInferenceId = instance.fireworksaiInferenceId;
			this.service = instance.service;
			this.serviceSettings = instance.serviceSettings;
			this.taskSettings = instance.taskSettings;
			this.taskType = instance.taskType;
			this.timeout = instance.timeout;

		}
		/**
		 * The chunking configuration object. Applies only to the
		 * <code>text_embedding</code> task type. Not applicable to the
		 * <code>completion</code> or <code>chat_completion</code> task types.
		 * <p>
		 * API name: {@code chunking_settings}
		 */
		public final Builder chunkingSettings(@Nullable InferenceChunkingSettings value) {
			this.chunkingSettings = value;
			return this;
		}

		/**
		 * The chunking configuration object. Applies only to the
		 * <code>text_embedding</code> task type. Not applicable to the
		 * <code>completion</code> or <code>chat_completion</code> task types.
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
		 * API name: {@code fireworksai_inference_id}
		 */
		public final Builder fireworksaiInferenceId(String value) {
			this.fireworksaiInferenceId = value;
			return this;
		}

		/**
		 * Required - The type of service supported for the specified task type. In this
		 * case, <code>fireworksai</code>.
		 * <p>
		 * API name: {@code service}
		 */
		public final Builder service(FireworksAIServiceType value) {
			this.service = value;
			return this;
		}

		/**
		 * Required - Settings used to install the inference model. These settings are
		 * specific to the <code>fireworksai</code> service.
		 * <p>
		 * API name: {@code service_settings}
		 */
		public final Builder serviceSettings(FireworksAIServiceSettings value) {
			this.serviceSettings = value;
			return this;
		}

		/**
		 * Required - Settings used to install the inference model. These settings are
		 * specific to the <code>fireworksai</code> service.
		 * <p>
		 * API name: {@code service_settings}
		 */
		public final Builder serviceSettings(
				Function<FireworksAIServiceSettings.Builder, ObjectBuilder<FireworksAIServiceSettings>> fn) {
			return this.serviceSettings(fn.apply(new FireworksAIServiceSettings.Builder()).build());
		}

		/**
		 * Settings to configure the inference task. Applies only to the
		 * <code>completion</code> or <code>chat_completion</code> task types. Not
		 * applicable to the <code>text_embedding</code> task type. These settings are
		 * specific to the task type you specified.
		 * <p>
		 * API name: {@code task_settings}
		 */
		public final Builder taskSettings(@Nullable FireworksAITaskSettings value) {
			this.taskSettings = value;
			return this;
		}

		/**
		 * Settings to configure the inference task. Applies only to the
		 * <code>completion</code> or <code>chat_completion</code> task types. Not
		 * applicable to the <code>text_embedding</code> task type. These settings are
		 * specific to the task type you specified.
		 * <p>
		 * API name: {@code task_settings}
		 */
		public final Builder taskSettings(
				Function<FireworksAITaskSettings.Builder, ObjectBuilder<FireworksAITaskSettings>> fn) {
			return this.taskSettings(fn.apply(new FireworksAITaskSettings.Builder()).build());
		}

		/**
		 * Required - The type of the inference task that the model will perform.
		 * <p>
		 * API name: {@code task_type}
		 */
		public final Builder taskType(FireworksAITaskType value) {
			this.taskType = value;
			return this;
		}

		/**
		 * Specifies the amount of time to wait for the inference endpoint to be
		 * created.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Specifies the amount of time to wait for the inference endpoint to be
		 * created.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeout(fn.apply(new Time.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutFireworksaiRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutFireworksaiRequest build() {
			_checkSingleUse();

			return new PutFireworksaiRequest(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutFireworksaiRequest}
	 */
	public static final JsonpDeserializer<PutFireworksaiRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutFireworksaiRequest::setupPutFireworksaiRequestDeserializer);

	protected static void setupPutFireworksaiRequestDeserializer(ObjectDeserializer<PutFireworksaiRequest.Builder> op) {

		op.add(Builder::chunkingSettings, InferenceChunkingSettings._DESERIALIZER, "chunking_settings");
		op.add(Builder::service, FireworksAIServiceType._DESERIALIZER, "service");
		op.add(Builder::serviceSettings, FireworksAIServiceSettings._DESERIALIZER, "service_settings");
		op.add(Builder::taskSettings, FireworksAITaskSettings._DESERIALIZER, "task_settings");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code inference.put_fireworksai}".
	 */
	public static final Endpoint<PutFireworksaiRequest, PutFireworksaiResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/inference.put_fireworksai",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _fireworksaiInferenceId = 1 << 0;
				final int _taskType = 1 << 1;

				int propsSet = 0;

				propsSet |= _fireworksaiInferenceId;
				propsSet |= _taskType;

				if (propsSet == (_taskType | _fireworksaiInferenceId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_inference");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.taskType.jsonValue(), buf);
					buf.append("/");
					SimpleEndpoint.pathEncode(request.fireworksaiInferenceId, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _fireworksaiInferenceId = 1 << 0;
				final int _taskType = 1 << 1;

				int propsSet = 0;

				propsSet |= _fireworksaiInferenceId;
				propsSet |= _taskType;

				if (propsSet == (_taskType | _fireworksaiInferenceId)) {
					params.put("taskType", request.taskType.jsonValue());
					params.put("fireworksaiInferenceId", request.fireworksaiInferenceId);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, PutFireworksaiResponse._DESERIALIZER);
}
