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

// typedef: inference.put_elser.Request

/**
 * Create an ELSER inference endpoint.
 * <p>
 * Create an inference endpoint to perform an inference task with the
 * <code>elser</code> service. You can also deploy ELSER by using the
 * Elasticsearch inference integration. <blockquote>
 * <p>
 * info Your Elasticsearch deployment contains a preconfigured ELSER inference
 * endpoint, you only need to create the enpoint using the API if you want to
 * customize the settings.
 * </p>
 * </blockquote>
 * <p>
 * The API request will automatically download and deploy the ELSER model if it
 * isn't already downloaded. <blockquote>
 * <p>
 * info You might see a 502 bad gateway error in the response when using the
 * Kibana Console. This error usually just reflects a timeout, while the model
 * downloads in the background. You can check the download progress in the
 * Machine Learning UI. If using the Python client, you can set the timeout
 * parameter to a higher value.
 * </p>
 * </blockquote>
 * <p>
 * After creating the endpoint, wait for the model deployment to complete before
 * using it. To verify the deployment status, use the get trained model
 * statistics API. Look for
 * <code>&quot;state&quot;: &quot;fully_allocated&quot;</code> in the response
 * and ensure that the <code>&quot;allocation_count&quot;</code> matches the
 * <code>&quot;target_allocation_count&quot;</code>. Avoid creating multiple
 * endpoints for the same model unless required, as each endpoint consumes
 * significant resources.
 * 
 * @see <a href="../doc-files/api-spec.html#inference.put_elser.Request">API
 *      specification</a>
 * @deprecated 8.16.0 The elser service is deprecated and will be removed in a
 *             future release. Use the Elasticsearch inference integration
 *             instead, with model_id included in the service_settings.
 */
@Deprecated
@JsonpDeserializable
public class PutElserRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final InferenceChunkingSettings chunkingSettings;

	private final String elserInferenceId;

	private final ElserServiceType service;

	private final ElserServiceSettings serviceSettings;

	private final ElserTaskType taskType;

	@Nullable
	private final Time timeout;

	// ---------------------------------------------------------------------------------------------

	private PutElserRequest(Builder builder) {

		this.chunkingSettings = builder.chunkingSettings;
		this.elserInferenceId = ApiTypeHelper.requireNonNull(builder.elserInferenceId, this, "elserInferenceId");
		this.service = ApiTypeHelper.requireNonNull(builder.service, this, "service");
		this.serviceSettings = ApiTypeHelper.requireNonNull(builder.serviceSettings, this, "serviceSettings");
		this.taskType = ApiTypeHelper.requireNonNull(builder.taskType, this, "taskType");
		this.timeout = builder.timeout;

	}

	public static PutElserRequest of(Function<Builder, ObjectBuilder<PutElserRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The chunking configuration object. Note that for ELSER endpoints, the
	 * max_chunk_size may not exceed <code>300</code>.
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
	 * API name: {@code elser_inference_id}
	 */
	public final String elserInferenceId() {
		return this.elserInferenceId;
	}

	/**
	 * Required - The type of service supported for the specified task type. In this
	 * case, <code>elser</code>.
	 * <p>
	 * API name: {@code service}
	 */
	public final ElserServiceType service() {
		return this.service;
	}

	/**
	 * Required - Settings used to install the inference model. These settings are
	 * specific to the <code>elser</code> service.
	 * <p>
	 * API name: {@code service_settings}
	 */
	public final ElserServiceSettings serviceSettings() {
		return this.serviceSettings;
	}

	/**
	 * Required - The type of the inference task that the model will perform.
	 * <p>
	 * API name: {@code task_type}
	 */
	public final ElserTaskType taskType() {
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
	 * Builder for {@link PutElserRequest}.
	 */
	@Deprecated
	public static class Builder extends RequestBase.AbstractBuilder<Builder> implements ObjectBuilder<PutElserRequest> {
		@Nullable
		private InferenceChunkingSettings chunkingSettings;

		private String elserInferenceId;

		private ElserServiceType service;

		private ElserServiceSettings serviceSettings;

		private ElserTaskType taskType;

		@Nullable
		private Time timeout;

		/**
		 * The chunking configuration object. Note that for ELSER endpoints, the
		 * max_chunk_size may not exceed <code>300</code>.
		 * <p>
		 * API name: {@code chunking_settings}
		 */
		public final Builder chunkingSettings(@Nullable InferenceChunkingSettings value) {
			this.chunkingSettings = value;
			return this;
		}

		/**
		 * The chunking configuration object. Note that for ELSER endpoints, the
		 * max_chunk_size may not exceed <code>300</code>.
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
		 * API name: {@code elser_inference_id}
		 */
		public final Builder elserInferenceId(String value) {
			this.elserInferenceId = value;
			return this;
		}

		/**
		 * Required - The type of service supported for the specified task type. In this
		 * case, <code>elser</code>.
		 * <p>
		 * API name: {@code service}
		 */
		public final Builder service(ElserServiceType value) {
			this.service = value;
			return this;
		}

		/**
		 * Required - Settings used to install the inference model. These settings are
		 * specific to the <code>elser</code> service.
		 * <p>
		 * API name: {@code service_settings}
		 */
		public final Builder serviceSettings(ElserServiceSettings value) {
			this.serviceSettings = value;
			return this;
		}

		/**
		 * Required - Settings used to install the inference model. These settings are
		 * specific to the <code>elser</code> service.
		 * <p>
		 * API name: {@code service_settings}
		 */
		public final Builder serviceSettings(
				Function<ElserServiceSettings.Builder, ObjectBuilder<ElserServiceSettings>> fn) {
			return this.serviceSettings(fn.apply(new ElserServiceSettings.Builder()).build());
		}

		/**
		 * Required - The type of the inference task that the model will perform.
		 * <p>
		 * API name: {@code task_type}
		 */
		public final Builder taskType(ElserTaskType value) {
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
		 * Builds a {@link PutElserRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutElserRequest build() {
			_checkSingleUse();

			return new PutElserRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutElserRequest}
	 */
	public static final JsonpDeserializer<PutElserRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PutElserRequest::setupPutElserRequestDeserializer);

	protected static void setupPutElserRequestDeserializer(ObjectDeserializer<PutElserRequest.Builder> op) {

		op.add(Builder::chunkingSettings, InferenceChunkingSettings._DESERIALIZER, "chunking_settings");
		op.add(Builder::service, ElserServiceType._DESERIALIZER, "service");
		op.add(Builder::serviceSettings, ElserServiceSettings._DESERIALIZER, "service_settings");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code inference.put_elser}".
	 */
	public static final Endpoint<PutElserRequest, PutElserResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/inference.put_elser",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _taskType = 1 << 0;
				final int _elserInferenceId = 1 << 1;

				int propsSet = 0;

				propsSet |= _taskType;
				propsSet |= _elserInferenceId;

				if (propsSet == (_taskType | _elserInferenceId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_inference");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.taskType.jsonValue(), buf);
					buf.append("/");
					SimpleEndpoint.pathEncode(request.elserInferenceId, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _taskType = 1 << 0;
				final int _elserInferenceId = 1 << 1;

				int propsSet = 0;

				propsSet |= _taskType;
				propsSet |= _elserInferenceId;

				if (propsSet == (_taskType | _elserInferenceId)) {
					params.put("taskType", request.taskType.jsonValue());
					params.put("elserInferenceId", request.elserInferenceId);
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

			}, SimpleEndpoint.emptyMap(), true, PutElserResponse._DESERIALIZER);
}
