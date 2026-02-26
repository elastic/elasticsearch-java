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

// typedef: inference.put_elasticsearch.Request

/**
 * Create an Elasticsearch inference endpoint.
 * <p>
 * Create an inference endpoint to perform an inference task with the
 * <code>elasticsearch</code> service. <blockquote>
 * <p>
 * info Your Elasticsearch deployment contains preconfigured ELSER and E5
 * inference endpoints, you only need to create the enpoints using the API if
 * you want to customize the settings.
 * </p>
 * </blockquote>
 * <p>
 * If you use the ELSER or the E5 model through the <code>elasticsearch</code>
 * service, the API request will automatically download and deploy the model if
 * it isn't downloaded yet. <blockquote>
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
 * @see <a href=
 *      "../doc-files/api-spec.html#inference.put_elasticsearch.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutElasticsearchRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final InferenceChunkingSettings chunkingSettings;

	private final String elasticsearchInferenceId;

	private final ElasticsearchServiceType service;

	private final ElasticsearchServiceSettings serviceSettings;

	@Nullable
	private final ElasticsearchTaskSettings taskSettings;

	private final ElasticsearchTaskType taskType;

	@Nullable
	private final Time timeout;

	// ---------------------------------------------------------------------------------------------

	private PutElasticsearchRequest(Builder builder) {

		this.chunkingSettings = builder.chunkingSettings;
		this.elasticsearchInferenceId = ApiTypeHelper.requireNonNull(builder.elasticsearchInferenceId, this,
				"elasticsearchInferenceId");
		this.service = ApiTypeHelper.requireNonNull(builder.service, this, "service");
		this.serviceSettings = ApiTypeHelper.requireNonNull(builder.serviceSettings, this, "serviceSettings");
		this.taskSettings = builder.taskSettings;
		this.taskType = ApiTypeHelper.requireNonNull(builder.taskType, this, "taskType");
		this.timeout = builder.timeout;

	}

	public static PutElasticsearchRequest of(Function<Builder, ObjectBuilder<PutElasticsearchRequest>> fn) {
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
	 * Required - The unique identifier of the inference endpoint. The must not
	 * match the <code>model_id</code>.
	 * <p>
	 * API name: {@code elasticsearch_inference_id}
	 */
	public final String elasticsearchInferenceId() {
		return this.elasticsearchInferenceId;
	}

	/**
	 * Required - The type of service supported for the specified task type. In this
	 * case, <code>elasticsearch</code>.
	 * <p>
	 * API name: {@code service}
	 */
	public final ElasticsearchServiceType service() {
		return this.service;
	}

	/**
	 * Required - Settings used to install the inference model. These settings are
	 * specific to the <code>elasticsearch</code> service.
	 * <p>
	 * API name: {@code service_settings}
	 */
	public final ElasticsearchServiceSettings serviceSettings() {
		return this.serviceSettings;
	}

	/**
	 * Settings to configure the inference task. These settings are specific to the
	 * task type you specified.
	 * <p>
	 * API name: {@code task_settings}
	 */
	@Nullable
	public final ElasticsearchTaskSettings taskSettings() {
		return this.taskSettings;
	}

	/**
	 * Required - The type of the inference task that the model will perform.
	 * <p>
	 * API name: {@code task_type}
	 */
	public final ElasticsearchTaskType taskType() {
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
	 * Builder for {@link PutElasticsearchRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PutElasticsearchRequest> {
		@Nullable
		private InferenceChunkingSettings chunkingSettings;

		private String elasticsearchInferenceId;

		private ElasticsearchServiceType service;

		private ElasticsearchServiceSettings serviceSettings;

		@Nullable
		private ElasticsearchTaskSettings taskSettings;

		private ElasticsearchTaskType taskType;

		@Nullable
		private Time timeout;

		public Builder() {
		}
		private Builder(PutElasticsearchRequest instance) {
			this.chunkingSettings = instance.chunkingSettings;
			this.elasticsearchInferenceId = instance.elasticsearchInferenceId;
			this.service = instance.service;
			this.serviceSettings = instance.serviceSettings;
			this.taskSettings = instance.taskSettings;
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
		 * Required - The unique identifier of the inference endpoint. The must not
		 * match the <code>model_id</code>.
		 * <p>
		 * API name: {@code elasticsearch_inference_id}
		 */
		public final Builder elasticsearchInferenceId(String value) {
			this.elasticsearchInferenceId = value;
			return this;
		}

		/**
		 * Required - The type of service supported for the specified task type. In this
		 * case, <code>elasticsearch</code>.
		 * <p>
		 * API name: {@code service}
		 */
		public final Builder service(ElasticsearchServiceType value) {
			this.service = value;
			return this;
		}

		/**
		 * Required - Settings used to install the inference model. These settings are
		 * specific to the <code>elasticsearch</code> service.
		 * <p>
		 * API name: {@code service_settings}
		 */
		public final Builder serviceSettings(ElasticsearchServiceSettings value) {
			this.serviceSettings = value;
			return this;
		}

		/**
		 * Required - Settings used to install the inference model. These settings are
		 * specific to the <code>elasticsearch</code> service.
		 * <p>
		 * API name: {@code service_settings}
		 */
		public final Builder serviceSettings(
				Function<ElasticsearchServiceSettings.Builder, ObjectBuilder<ElasticsearchServiceSettings>> fn) {
			return this.serviceSettings(fn.apply(new ElasticsearchServiceSettings.Builder()).build());
		}

		/**
		 * Settings to configure the inference task. These settings are specific to the
		 * task type you specified.
		 * <p>
		 * API name: {@code task_settings}
		 */
		public final Builder taskSettings(@Nullable ElasticsearchTaskSettings value) {
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
				Function<ElasticsearchTaskSettings.Builder, ObjectBuilder<ElasticsearchTaskSettings>> fn) {
			return this.taskSettings(fn.apply(new ElasticsearchTaskSettings.Builder()).build());
		}

		/**
		 * Required - The type of the inference task that the model will perform.
		 * <p>
		 * API name: {@code task_type}
		 */
		public final Builder taskType(ElasticsearchTaskType value) {
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
		 * Builds a {@link PutElasticsearchRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutElasticsearchRequest build() {
			_checkSingleUse();

			return new PutElasticsearchRequest(this);
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
	 * Json deserializer for {@link PutElasticsearchRequest}
	 */
	public static final JsonpDeserializer<PutElasticsearchRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutElasticsearchRequest::setupPutElasticsearchRequestDeserializer);

	protected static void setupPutElasticsearchRequestDeserializer(
			ObjectDeserializer<PutElasticsearchRequest.Builder> op) {

		op.add(Builder::chunkingSettings, InferenceChunkingSettings._DESERIALIZER, "chunking_settings");
		op.add(Builder::service, ElasticsearchServiceType._DESERIALIZER, "service");
		op.add(Builder::serviceSettings, ElasticsearchServiceSettings._DESERIALIZER, "service_settings");
		op.add(Builder::taskSettings, ElasticsearchTaskSettings._DESERIALIZER, "task_settings");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code inference.put_elasticsearch}".
	 */
	public static final Endpoint<PutElasticsearchRequest, PutElasticsearchResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/inference.put_elasticsearch",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _taskType = 1 << 0;
				final int _elasticsearchInferenceId = 1 << 1;

				int propsSet = 0;

				propsSet |= _taskType;
				propsSet |= _elasticsearchInferenceId;

				if (propsSet == (_taskType | _elasticsearchInferenceId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_inference");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.taskType.jsonValue(), buf);
					buf.append("/");
					SimpleEndpoint.pathEncode(request.elasticsearchInferenceId, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _taskType = 1 << 0;
				final int _elasticsearchInferenceId = 1 << 1;

				int propsSet = 0;

				propsSet |= _taskType;
				propsSet |= _elasticsearchInferenceId;

				if (propsSet == (_taskType | _elasticsearchInferenceId)) {
					params.put("taskType", request.taskType.jsonValue());
					params.put("elasticsearchInferenceId", request.elasticsearchInferenceId);
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

			}, SimpleEndpoint.emptyMap(), true, PutElasticsearchResponse._DESERIALIZER);
}
