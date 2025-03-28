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
import co.elastic.clients.elasticsearch.inference.put_watsonx.ServiceType;
import co.elastic.clients.elasticsearch.inference.put_watsonx.WatsonxServiceSettings;
import co.elastic.clients.elasticsearch.inference.put_watsonx.WatsonxTaskType;
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

// typedef: inference.put_watsonx.Request

/**
 * Create a Watsonx inference endpoint.
 * <p>
 * Create an inference endpoint to perform an inference task with the
 * <code>watsonxai</code> service. You need an IBM Cloud Databases for
 * Elasticsearch deployment to use the <code>watsonxai</code> inference service.
 * You can provision one through the IBM catalog, the Cloud Databases CLI
 * plug-in, the Cloud Databases API, or Terraform.
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
 * @see <a href="../doc-files/api-spec.html#inference.put_watsonx.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutWatsonxRequest extends RequestBase implements JsonpSerializable {
	private final ServiceType service;

	private final WatsonxServiceSettings serviceSettings;

	private final WatsonxTaskType taskType;

	private final String watsonxInferenceId;

	// ---------------------------------------------------------------------------------------------

	private PutWatsonxRequest(Builder builder) {

		this.service = ApiTypeHelper.requireNonNull(builder.service, this, "service");
		this.serviceSettings = ApiTypeHelper.requireNonNull(builder.serviceSettings, this, "serviceSettings");
		this.taskType = ApiTypeHelper.requireNonNull(builder.taskType, this, "taskType");
		this.watsonxInferenceId = ApiTypeHelper.requireNonNull(builder.watsonxInferenceId, this, "watsonxInferenceId");

	}

	public static PutWatsonxRequest of(Function<Builder, ObjectBuilder<PutWatsonxRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The type of service supported for the specified task type. In this
	 * case, <code>watsonxai</code>.
	 * <p>
	 * API name: {@code service}
	 */
	public final ServiceType service() {
		return this.service;
	}

	/**
	 * Required - Settings used to install the inference model. These settings are
	 * specific to the <code>watsonxai</code> service.
	 * <p>
	 * API name: {@code service_settings}
	 */
	public final WatsonxServiceSettings serviceSettings() {
		return this.serviceSettings;
	}

	/**
	 * Required - The task type. The only valid task type for the model to perform
	 * is <code>text_embedding</code>.
	 * <p>
	 * API name: {@code task_type}
	 */
	public final WatsonxTaskType taskType() {
		return this.taskType;
	}

	/**
	 * Required - The unique identifier of the inference endpoint.
	 * <p>
	 * API name: {@code watsonx_inference_id}
	 */
	public final String watsonxInferenceId() {
		return this.watsonxInferenceId;
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

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutWatsonxRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PutWatsonxRequest> {
		private ServiceType service;

		private WatsonxServiceSettings serviceSettings;

		private WatsonxTaskType taskType;

		private String watsonxInferenceId;

		/**
		 * Required - The type of service supported for the specified task type. In this
		 * case, <code>watsonxai</code>.
		 * <p>
		 * API name: {@code service}
		 */
		public final Builder service(ServiceType value) {
			this.service = value;
			return this;
		}

		/**
		 * Required - Settings used to install the inference model. These settings are
		 * specific to the <code>watsonxai</code> service.
		 * <p>
		 * API name: {@code service_settings}
		 */
		public final Builder serviceSettings(WatsonxServiceSettings value) {
			this.serviceSettings = value;
			return this;
		}

		/**
		 * Required - Settings used to install the inference model. These settings are
		 * specific to the <code>watsonxai</code> service.
		 * <p>
		 * API name: {@code service_settings}
		 */
		public final Builder serviceSettings(
				Function<WatsonxServiceSettings.Builder, ObjectBuilder<WatsonxServiceSettings>> fn) {
			return this.serviceSettings(fn.apply(new WatsonxServiceSettings.Builder()).build());
		}

		/**
		 * Required - The task type. The only valid task type for the model to perform
		 * is <code>text_embedding</code>.
		 * <p>
		 * API name: {@code task_type}
		 */
		public final Builder taskType(WatsonxTaskType value) {
			this.taskType = value;
			return this;
		}

		/**
		 * Required - The unique identifier of the inference endpoint.
		 * <p>
		 * API name: {@code watsonx_inference_id}
		 */
		public final Builder watsonxInferenceId(String value) {
			this.watsonxInferenceId = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutWatsonxRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutWatsonxRequest build() {
			_checkSingleUse();

			return new PutWatsonxRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutWatsonxRequest}
	 */
	public static final JsonpDeserializer<PutWatsonxRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutWatsonxRequest::setupPutWatsonxRequestDeserializer);

	protected static void setupPutWatsonxRequestDeserializer(ObjectDeserializer<PutWatsonxRequest.Builder> op) {

		op.add(Builder::service, ServiceType._DESERIALIZER, "service");
		op.add(Builder::serviceSettings, WatsonxServiceSettings._DESERIALIZER, "service_settings");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code inference.put_watsonx}".
	 */
	public static final Endpoint<PutWatsonxRequest, PutWatsonxResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/inference.put_watsonx",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _watsonxInferenceId = 1 << 0;
				final int _taskType = 1 << 1;

				int propsSet = 0;

				propsSet |= _watsonxInferenceId;
				propsSet |= _taskType;

				if (propsSet == (_taskType | _watsonxInferenceId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_inference");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.taskType.jsonValue(), buf);
					buf.append("/");
					SimpleEndpoint.pathEncode(request.watsonxInferenceId, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _watsonxInferenceId = 1 << 0;
				final int _taskType = 1 << 1;

				int propsSet = 0;

				propsSet |= _watsonxInferenceId;
				propsSet |= _taskType;

				if (propsSet == (_taskType | _watsonxInferenceId)) {
					params.put("taskType", request.taskType.jsonValue());
					params.put("watsonxInferenceId", request.watsonxInferenceId);
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, PutWatsonxResponse._DESERIALIZER);
}
