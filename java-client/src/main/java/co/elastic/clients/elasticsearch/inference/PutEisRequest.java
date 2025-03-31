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

// typedef: inference.put_eis.Request

/**
 * Create an Elastic Inference Service (EIS) inference endpoint.
 * <p>
 * Create an inference endpoint to perform an inference task through the Elastic
 * Inference Service (EIS).
 * 
 * @see <a href="../doc-files/api-spec.html#inference.put_eis.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutEisRequest extends RequestBase implements JsonpSerializable {
	private final String eisInferenceId;

	private final EisServiceType service;

	private final EisServiceSettings serviceSettings;

	private final EisTaskType taskType;

	// ---------------------------------------------------------------------------------------------

	private PutEisRequest(Builder builder) {

		this.eisInferenceId = ApiTypeHelper.requireNonNull(builder.eisInferenceId, this, "eisInferenceId");
		this.service = ApiTypeHelper.requireNonNull(builder.service, this, "service");
		this.serviceSettings = ApiTypeHelper.requireNonNull(builder.serviceSettings, this, "serviceSettings");
		this.taskType = ApiTypeHelper.requireNonNull(builder.taskType, this, "taskType");

	}

	public static PutEisRequest of(Function<Builder, ObjectBuilder<PutEisRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The unique identifier of the inference endpoint.
	 * <p>
	 * API name: {@code eis_inference_id}
	 */
	public final String eisInferenceId() {
		return this.eisInferenceId;
	}

	/**
	 * Required - The type of service supported for the specified task type. In this
	 * case, <code>elastic</code>.
	 * <p>
	 * API name: {@code service}
	 */
	public final EisServiceType service() {
		return this.service;
	}

	/**
	 * Required - Settings used to install the inference model. These settings are
	 * specific to the <code>elastic</code> service.
	 * <p>
	 * API name: {@code service_settings}
	 */
	public final EisServiceSettings serviceSettings() {
		return this.serviceSettings;
	}

	/**
	 * Required - The type of the inference task that the model will perform. NOTE:
	 * The <code>chat_completion</code> task type only supports streaming and only
	 * through the _stream API.
	 * <p>
	 * API name: {@code task_type}
	 */
	public final EisTaskType taskType() {
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

		generator.writeKey("service");
		this.service.serialize(generator, mapper);
		generator.writeKey("service_settings");
		this.serviceSettings.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutEisRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder> implements ObjectBuilder<PutEisRequest> {
		private String eisInferenceId;

		private EisServiceType service;

		private EisServiceSettings serviceSettings;

		private EisTaskType taskType;

		/**
		 * Required - The unique identifier of the inference endpoint.
		 * <p>
		 * API name: {@code eis_inference_id}
		 */
		public final Builder eisInferenceId(String value) {
			this.eisInferenceId = value;
			return this;
		}

		/**
		 * Required - The type of service supported for the specified task type. In this
		 * case, <code>elastic</code>.
		 * <p>
		 * API name: {@code service}
		 */
		public final Builder service(EisServiceType value) {
			this.service = value;
			return this;
		}

		/**
		 * Required - Settings used to install the inference model. These settings are
		 * specific to the <code>elastic</code> service.
		 * <p>
		 * API name: {@code service_settings}
		 */
		public final Builder serviceSettings(EisServiceSettings value) {
			this.serviceSettings = value;
			return this;
		}

		/**
		 * Required - Settings used to install the inference model. These settings are
		 * specific to the <code>elastic</code> service.
		 * <p>
		 * API name: {@code service_settings}
		 */
		public final Builder serviceSettings(
				Function<EisServiceSettings.Builder, ObjectBuilder<EisServiceSettings>> fn) {
			return this.serviceSettings(fn.apply(new EisServiceSettings.Builder()).build());
		}

		/**
		 * Required - The type of the inference task that the model will perform. NOTE:
		 * The <code>chat_completion</code> task type only supports streaming and only
		 * through the _stream API.
		 * <p>
		 * API name: {@code task_type}
		 */
		public final Builder taskType(EisTaskType value) {
			this.taskType = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutEisRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutEisRequest build() {
			_checkSingleUse();

			return new PutEisRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutEisRequest}
	 */
	public static final JsonpDeserializer<PutEisRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PutEisRequest::setupPutEisRequestDeserializer);

	protected static void setupPutEisRequestDeserializer(ObjectDeserializer<PutEisRequest.Builder> op) {

		op.add(Builder::service, EisServiceType._DESERIALIZER, "service");
		op.add(Builder::serviceSettings, EisServiceSettings._DESERIALIZER, "service_settings");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code inference.put_eis}".
	 */
	public static final Endpoint<PutEisRequest, PutEisResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/inference.put_eis",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _eisInferenceId = 1 << 0;
				final int _taskType = 1 << 1;

				int propsSet = 0;

				propsSet |= _eisInferenceId;
				propsSet |= _taskType;

				if (propsSet == (_taskType | _eisInferenceId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_inference");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.taskType.jsonValue(), buf);
					buf.append("/");
					SimpleEndpoint.pathEncode(request.eisInferenceId, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _eisInferenceId = 1 << 0;
				final int _taskType = 1 << 1;

				int propsSet = 0;

				propsSet |= _eisInferenceId;
				propsSet |= _taskType;

				if (propsSet == (_taskType | _eisInferenceId)) {
					params.put("taskType", request.taskType.jsonValue());
					params.put("eisInferenceId", request.eisInferenceId);
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, PutEisResponse._DESERIALIZER);
}
