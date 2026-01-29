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

// typedef: inference.put_googleaistudio.Request

/**
 * Create an Google AI Studio inference endpoint.
 * <p>
 * Create an inference endpoint to perform an inference task with the
 * <code>googleaistudio</code> service.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#inference.put_googleaistudio.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutGoogleaistudioRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final InferenceChunkingSettings chunkingSettings;

	private final String googleaistudioInferenceId;

	private final GoogleAiServiceType service;

	private final GoogleAiStudioServiceSettings serviceSettings;

	private final GoogleAiStudioTaskType taskType;

	@Nullable
	private final Time timeout;

	// ---------------------------------------------------------------------------------------------

	private PutGoogleaistudioRequest(Builder builder) {

		this.chunkingSettings = builder.chunkingSettings;
		this.googleaistudioInferenceId = ApiTypeHelper.requireNonNull(builder.googleaistudioInferenceId, this,
				"googleaistudioInferenceId");
		this.service = ApiTypeHelper.requireNonNull(builder.service, this, "service");
		this.serviceSettings = ApiTypeHelper.requireNonNull(builder.serviceSettings, this, "serviceSettings");
		this.taskType = ApiTypeHelper.requireNonNull(builder.taskType, this, "taskType");
		this.timeout = builder.timeout;

	}

	public static PutGoogleaistudioRequest of(Function<Builder, ObjectBuilder<PutGoogleaistudioRequest>> fn) {
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
	 * API name: {@code googleaistudio_inference_id}
	 */
	public final String googleaistudioInferenceId() {
		return this.googleaistudioInferenceId;
	}

	/**
	 * Required - The type of service supported for the specified task type. In this
	 * case, <code>googleaistudio</code>.
	 * <p>
	 * API name: {@code service}
	 */
	public final GoogleAiServiceType service() {
		return this.service;
	}

	/**
	 * Required - Settings used to install the inference model. These settings are
	 * specific to the <code>googleaistudio</code> service.
	 * <p>
	 * API name: {@code service_settings}
	 */
	public final GoogleAiStudioServiceSettings serviceSettings() {
		return this.serviceSettings;
	}

	/**
	 * Required - The type of the inference task that the model will perform.
	 * <p>
	 * API name: {@code task_type}
	 */
	public final GoogleAiStudioTaskType taskType() {
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

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutGoogleaistudioRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PutGoogleaistudioRequest> {
		@Nullable
		private InferenceChunkingSettings chunkingSettings;

		private String googleaistudioInferenceId;

		private GoogleAiServiceType service;

		private GoogleAiStudioServiceSettings serviceSettings;

		private GoogleAiStudioTaskType taskType;

		@Nullable
		private Time timeout;

		public Builder() {
		}
		private Builder(PutGoogleaistudioRequest instance) {
			this.chunkingSettings = instance.chunkingSettings;
			this.googleaistudioInferenceId = instance.googleaistudioInferenceId;
			this.service = instance.service;
			this.serviceSettings = instance.serviceSettings;
			this.taskType = instance.taskType;
			this.timeout = instance.timeout;

		}
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
		 * API name: {@code googleaistudio_inference_id}
		 */
		public final Builder googleaistudioInferenceId(String value) {
			this.googleaistudioInferenceId = value;
			return this;
		}

		/**
		 * Required - The type of service supported for the specified task type. In this
		 * case, <code>googleaistudio</code>.
		 * <p>
		 * API name: {@code service}
		 */
		public final Builder service(GoogleAiServiceType value) {
			this.service = value;
			return this;
		}

		/**
		 * Required - Settings used to install the inference model. These settings are
		 * specific to the <code>googleaistudio</code> service.
		 * <p>
		 * API name: {@code service_settings}
		 */
		public final Builder serviceSettings(GoogleAiStudioServiceSettings value) {
			this.serviceSettings = value;
			return this;
		}

		/**
		 * Required - Settings used to install the inference model. These settings are
		 * specific to the <code>googleaistudio</code> service.
		 * <p>
		 * API name: {@code service_settings}
		 */
		public final Builder serviceSettings(
				Function<GoogleAiStudioServiceSettings.Builder, ObjectBuilder<GoogleAiStudioServiceSettings>> fn) {
			return this.serviceSettings(fn.apply(new GoogleAiStudioServiceSettings.Builder()).build());
		}

		/**
		 * Required - The type of the inference task that the model will perform.
		 * <p>
		 * API name: {@code task_type}
		 */
		public final Builder taskType(GoogleAiStudioTaskType value) {
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
		 * Builds a {@link PutGoogleaistudioRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutGoogleaistudioRequest build() {
			_checkSingleUse();

			return new PutGoogleaistudioRequest(this);
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
	 * Json deserializer for {@link PutGoogleaistudioRequest}
	 */
	public static final JsonpDeserializer<PutGoogleaistudioRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutGoogleaistudioRequest::setupPutGoogleaistudioRequestDeserializer);

	protected static void setupPutGoogleaistudioRequestDeserializer(
			ObjectDeserializer<PutGoogleaistudioRequest.Builder> op) {

		op.add(Builder::chunkingSettings, InferenceChunkingSettings._DESERIALIZER, "chunking_settings");
		op.add(Builder::service, GoogleAiServiceType._DESERIALIZER, "service");
		op.add(Builder::serviceSettings, GoogleAiStudioServiceSettings._DESERIALIZER, "service_settings");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code inference.put_googleaistudio}".
	 */
	public static final Endpoint<PutGoogleaistudioRequest, PutGoogleaistudioResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/inference.put_googleaistudio",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _googleaistudioInferenceId = 1 << 0;
				final int _taskType = 1 << 1;

				int propsSet = 0;

				propsSet |= _googleaistudioInferenceId;
				propsSet |= _taskType;

				if (propsSet == (_taskType | _googleaistudioInferenceId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_inference");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.taskType.jsonValue(), buf);
					buf.append("/");
					SimpleEndpoint.pathEncode(request.googleaistudioInferenceId, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _googleaistudioInferenceId = 1 << 0;
				final int _taskType = 1 << 1;

				int propsSet = 0;

				propsSet |= _googleaistudioInferenceId;
				propsSet |= _taskType;

				if (propsSet == (_taskType | _googleaistudioInferenceId)) {
					params.put("taskType", request.taskType.jsonValue());
					params.put("googleaistudioInferenceId", request.googleaistudioInferenceId);
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

			}, SimpleEndpoint.emptyMap(), true, PutGoogleaistudioResponse._DESERIALIZER);
}
