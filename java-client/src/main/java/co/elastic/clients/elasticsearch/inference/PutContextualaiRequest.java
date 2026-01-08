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

// typedef: inference.put_contextualai.Request

/**
 * Create an Contextual AI inference endpoint.
 * <p>
 * Create an inference endpoint to perform an inference task with the
 * <code>contexualai</code> service.
 * <p>
 * To review the available <code>rerank</code> models, refer to <a href=
 * "https://docs.contextual.ai/api-reference/rerank/rerank#body-model">https://docs.contextual.ai/api-reference/rerank/rerank#body-model</a>.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#inference.put_contextualai.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutContextualaiRequest extends RequestBase implements JsonpSerializable {
	private final String contextualaiInferenceId;

	private final ContextualAIServiceType service;

	private final ContextualAIServiceSettings serviceSettings;

	@Nullable
	private final ContextualAITaskSettings taskSettings;

	private final TaskTypeContextualAI taskType;

	@Nullable
	private final Time timeout;

	// ---------------------------------------------------------------------------------------------

	private PutContextualaiRequest(Builder builder) {

		this.contextualaiInferenceId = ApiTypeHelper.requireNonNull(builder.contextualaiInferenceId, this,
				"contextualaiInferenceId");
		this.service = ApiTypeHelper.requireNonNull(builder.service, this, "service");
		this.serviceSettings = ApiTypeHelper.requireNonNull(builder.serviceSettings, this, "serviceSettings");
		this.taskSettings = builder.taskSettings;
		this.taskType = ApiTypeHelper.requireNonNull(builder.taskType, this, "taskType");
		this.timeout = builder.timeout;

	}

	public static PutContextualaiRequest of(Function<Builder, ObjectBuilder<PutContextualaiRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The unique identifier of the inference endpoint.
	 * <p>
	 * API name: {@code contextualai_inference_id}
	 */
	public final String contextualaiInferenceId() {
		return this.contextualaiInferenceId;
	}

	/**
	 * Required - The type of service supported for the specified task type. In this
	 * case, <code>contextualai</code>.
	 * <p>
	 * API name: {@code service}
	 */
	public final ContextualAIServiceType service() {
		return this.service;
	}

	/**
	 * Required - Settings used to install the inference model. These settings are
	 * specific to the <code>contextualai</code> service.
	 * <p>
	 * API name: {@code service_settings}
	 */
	public final ContextualAIServiceSettings serviceSettings() {
		return this.serviceSettings;
	}

	/**
	 * Settings to configure the inference task. These settings are specific to the
	 * task type you specified.
	 * <p>
	 * API name: {@code task_settings}
	 */
	@Nullable
	public final ContextualAITaskSettings taskSettings() {
		return this.taskSettings;
	}

	/**
	 * Required - The type of the inference task that the model will perform.
	 * <p>
	 * API name: {@code task_type}
	 */
	public final TaskTypeContextualAI taskType() {
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
	 * Builder for {@link PutContextualaiRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PutContextualaiRequest> {
		private String contextualaiInferenceId;

		private ContextualAIServiceType service;

		private ContextualAIServiceSettings serviceSettings;

		@Nullable
		private ContextualAITaskSettings taskSettings;

		private TaskTypeContextualAI taskType;

		@Nullable
		private Time timeout;

		/**
		 * Required - The unique identifier of the inference endpoint.
		 * <p>
		 * API name: {@code contextualai_inference_id}
		 */
		public final Builder contextualaiInferenceId(String value) {
			this.contextualaiInferenceId = value;
			return this;
		}

		/**
		 * Required - The type of service supported for the specified task type. In this
		 * case, <code>contextualai</code>.
		 * <p>
		 * API name: {@code service}
		 */
		public final Builder service(ContextualAIServiceType value) {
			this.service = value;
			return this;
		}

		/**
		 * Required - Settings used to install the inference model. These settings are
		 * specific to the <code>contextualai</code> service.
		 * <p>
		 * API name: {@code service_settings}
		 */
		public final Builder serviceSettings(ContextualAIServiceSettings value) {
			this.serviceSettings = value;
			return this;
		}

		/**
		 * Required - Settings used to install the inference model. These settings are
		 * specific to the <code>contextualai</code> service.
		 * <p>
		 * API name: {@code service_settings}
		 */
		public final Builder serviceSettings(
				Function<ContextualAIServiceSettings.Builder, ObjectBuilder<ContextualAIServiceSettings>> fn) {
			return this.serviceSettings(fn.apply(new ContextualAIServiceSettings.Builder()).build());
		}

		/**
		 * Settings to configure the inference task. These settings are specific to the
		 * task type you specified.
		 * <p>
		 * API name: {@code task_settings}
		 */
		public final Builder taskSettings(@Nullable ContextualAITaskSettings value) {
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
				Function<ContextualAITaskSettings.Builder, ObjectBuilder<ContextualAITaskSettings>> fn) {
			return this.taskSettings(fn.apply(new ContextualAITaskSettings.Builder()).build());
		}

		/**
		 * Required - The type of the inference task that the model will perform.
		 * <p>
		 * API name: {@code task_type}
		 */
		public final Builder taskType(TaskTypeContextualAI value) {
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
		 * Builds a {@link PutContextualaiRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutContextualaiRequest build() {
			_checkSingleUse();

			return new PutContextualaiRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutContextualaiRequest}
	 */
	public static final JsonpDeserializer<PutContextualaiRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutContextualaiRequest::setupPutContextualaiRequestDeserializer);

	protected static void setupPutContextualaiRequestDeserializer(
			ObjectDeserializer<PutContextualaiRequest.Builder> op) {

		op.add(Builder::service, ContextualAIServiceType._DESERIALIZER, "service");
		op.add(Builder::serviceSettings, ContextualAIServiceSettings._DESERIALIZER, "service_settings");
		op.add(Builder::taskSettings, ContextualAITaskSettings._DESERIALIZER, "task_settings");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code inference.put_contextualai}".
	 */
	public static final Endpoint<PutContextualaiRequest, PutContextualaiResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/inference.put_contextualai",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _contextualaiInferenceId = 1 << 0;
				final int _taskType = 1 << 1;

				int propsSet = 0;

				propsSet |= _contextualaiInferenceId;
				propsSet |= _taskType;

				if (propsSet == (_taskType | _contextualaiInferenceId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_inference");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.taskType.jsonValue(), buf);
					buf.append("/");
					SimpleEndpoint.pathEncode(request.contextualaiInferenceId, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _contextualaiInferenceId = 1 << 0;
				final int _taskType = 1 << 1;

				int propsSet = 0;

				propsSet |= _contextualaiInferenceId;
				propsSet |= _taskType;

				if (propsSet == (_taskType | _contextualaiInferenceId)) {
					params.put("taskType", request.taskType.jsonValue());
					params.put("contextualaiInferenceId", request.contextualaiInferenceId);
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

			}, SimpleEndpoint.emptyMap(), true, PutContextualaiResponse._DESERIALIZER);
}
