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

// typedef: inference.put_groq.Request

/**
 * Create a Groq inference endpoint.
 * <p>
 * Create an inference endpoint to perform an inference task with the
 * <code>groq</code> service.
 * 
 * @see <a href="../doc-files/api-spec.html#inference.put_groq.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutGroqRequest extends RequestBase implements JsonpSerializable {
	private final String groqInferenceId;

	private final GroqServiceType service;

	private final GroqServiceSettings serviceSettings;

	private final GroqTaskType taskType;

	@Nullable
	private final Time timeout;

	// ---------------------------------------------------------------------------------------------

	private PutGroqRequest(Builder builder) {

		this.groqInferenceId = ApiTypeHelper.requireNonNull(builder.groqInferenceId, this, "groqInferenceId");
		this.service = ApiTypeHelper.requireNonNull(builder.service, this, "service");
		this.serviceSettings = ApiTypeHelper.requireNonNull(builder.serviceSettings, this, "serviceSettings");
		this.taskType = ApiTypeHelper.requireNonNull(builder.taskType, this, "taskType");
		this.timeout = builder.timeout;

	}

	public static PutGroqRequest of(Function<Builder, ObjectBuilder<PutGroqRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The unique identifier of the inference endpoint.
	 * <p>
	 * API name: {@code groq_inference_id}
	 */
	public final String groqInferenceId() {
		return this.groqInferenceId;
	}

	/**
	 * Required - The type of service supported for the specified task type. In this
	 * case, <code>groq</code>.
	 * <p>
	 * API name: {@code service}
	 */
	public final GroqServiceType service() {
		return this.service;
	}

	/**
	 * Required - Settings used to install the inference model. These settings are
	 * specific to the <code>groq</code> service.
	 * <p>
	 * API name: {@code service_settings}
	 */
	public final GroqServiceSettings serviceSettings() {
		return this.serviceSettings;
	}

	/**
	 * Required - The type of the inference task that the model will perform.
	 * <p>
	 * API name: {@code task_type}
	 */
	public final GroqTaskType taskType() {
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

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutGroqRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder> implements ObjectBuilder<PutGroqRequest> {
		private String groqInferenceId;

		private GroqServiceType service;

		private GroqServiceSettings serviceSettings;

		private GroqTaskType taskType;

		@Nullable
		private Time timeout;

		/**
		 * Required - The unique identifier of the inference endpoint.
		 * <p>
		 * API name: {@code groq_inference_id}
		 */
		public final Builder groqInferenceId(String value) {
			this.groqInferenceId = value;
			return this;
		}

		/**
		 * Required - The type of service supported for the specified task type. In this
		 * case, <code>groq</code>.
		 * <p>
		 * API name: {@code service}
		 */
		public final Builder service(GroqServiceType value) {
			this.service = value;
			return this;
		}

		/**
		 * Required - Settings used to install the inference model. These settings are
		 * specific to the <code>groq</code> service.
		 * <p>
		 * API name: {@code service_settings}
		 */
		public final Builder serviceSettings(GroqServiceSettings value) {
			this.serviceSettings = value;
			return this;
		}

		/**
		 * Required - Settings used to install the inference model. These settings are
		 * specific to the <code>groq</code> service.
		 * <p>
		 * API name: {@code service_settings}
		 */
		public final Builder serviceSettings(
				Function<GroqServiceSettings.Builder, ObjectBuilder<GroqServiceSettings>> fn) {
			return this.serviceSettings(fn.apply(new GroqServiceSettings.Builder()).build());
		}

		/**
		 * Required - The type of the inference task that the model will perform.
		 * <p>
		 * API name: {@code task_type}
		 */
		public final Builder taskType(GroqTaskType value) {
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
		 * Builds a {@link PutGroqRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutGroqRequest build() {
			_checkSingleUse();

			return new PutGroqRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutGroqRequest}
	 */
	public static final JsonpDeserializer<PutGroqRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PutGroqRequest::setupPutGroqRequestDeserializer);

	protected static void setupPutGroqRequestDeserializer(ObjectDeserializer<PutGroqRequest.Builder> op) {

		op.add(Builder::service, GroqServiceType._DESERIALIZER, "service");
		op.add(Builder::serviceSettings, GroqServiceSettings._DESERIALIZER, "service_settings");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code inference.put_groq}".
	 */
	public static final Endpoint<PutGroqRequest, PutGroqResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/inference.put_groq",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _taskType = 1 << 0;
				final int _groqInferenceId = 1 << 1;

				int propsSet = 0;

				propsSet |= _taskType;
				propsSet |= _groqInferenceId;

				if (propsSet == (_taskType | _groqInferenceId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_inference");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.taskType.jsonValue(), buf);
					buf.append("/");
					SimpleEndpoint.pathEncode(request.groqInferenceId, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _taskType = 1 << 0;
				final int _groqInferenceId = 1 << 1;

				int propsSet = 0;

				propsSet |= _taskType;
				propsSet |= _groqInferenceId;

				if (propsSet == (_taskType | _groqInferenceId)) {
					params.put("taskType", request.taskType.jsonValue());
					params.put("groqInferenceId", request.groqInferenceId);
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

			}, SimpleEndpoint.emptyMap(), true, PutGroqResponse._DESERIALIZER);
}
