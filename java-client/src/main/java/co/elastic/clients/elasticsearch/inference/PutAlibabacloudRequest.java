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

// typedef: inference.put_alibabacloud.Request

/**
 * Create an AlibabaCloud AI Search inference endpoint.
 * <p>
 * Create an inference endpoint to perform an inference task with the
 * <code>alibabacloud-ai-search</code> service.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#inference.put_alibabacloud.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutAlibabacloudRequest extends RequestBase implements JsonpSerializable {
	private final String alibabacloudInferenceId;

	@Nullable
	private final InferenceChunkingSettings chunkingSettings;

	private final AlibabaCloudServiceType service;

	private final AlibabaCloudServiceSettings serviceSettings;

	@Nullable
	private final AlibabaCloudTaskSettings taskSettings;

	private final AlibabaCloudTaskType taskType;

	@Nullable
	private final Time timeout;

	// ---------------------------------------------------------------------------------------------

	private PutAlibabacloudRequest(Builder builder) {

		this.alibabacloudInferenceId = ApiTypeHelper.requireNonNull(builder.alibabacloudInferenceId, this,
				"alibabacloudInferenceId");
		this.chunkingSettings = builder.chunkingSettings;
		this.service = ApiTypeHelper.requireNonNull(builder.service, this, "service");
		this.serviceSettings = ApiTypeHelper.requireNonNull(builder.serviceSettings, this, "serviceSettings");
		this.taskSettings = builder.taskSettings;
		this.taskType = ApiTypeHelper.requireNonNull(builder.taskType, this, "taskType");
		this.timeout = builder.timeout;

	}

	public static PutAlibabacloudRequest of(Function<Builder, ObjectBuilder<PutAlibabacloudRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The unique identifier of the inference endpoint.
	 * <p>
	 * API name: {@code alibabacloud_inference_id}
	 */
	public final String alibabacloudInferenceId() {
		return this.alibabacloudInferenceId;
	}

	/**
	 * The chunking configuration object. Applies only to the
	 * <code>sparse_embedding</code> or <code>text_embedding</code> task types. Not
	 * applicable to the <code>rerank</code> or <code>completion</code> task types.
	 * <p>
	 * API name: {@code chunking_settings}
	 */
	@Nullable
	public final InferenceChunkingSettings chunkingSettings() {
		return this.chunkingSettings;
	}

	/**
	 * Required - The type of service supported for the specified task type. In this
	 * case, <code>alibabacloud-ai-search</code>.
	 * <p>
	 * API name: {@code service}
	 */
	public final AlibabaCloudServiceType service() {
		return this.service;
	}

	/**
	 * Required - Settings used to install the inference model. These settings are
	 * specific to the <code>alibabacloud-ai-search</code> service.
	 * <p>
	 * API name: {@code service_settings}
	 */
	public final AlibabaCloudServiceSettings serviceSettings() {
		return this.serviceSettings;
	}

	/**
	 * Settings to configure the inference task. These settings are specific to the
	 * task type you specified.
	 * <p>
	 * API name: {@code task_settings}
	 */
	@Nullable
	public final AlibabaCloudTaskSettings taskSettings() {
		return this.taskSettings;
	}

	/**
	 * Required - The type of the inference task that the model will perform.
	 * <p>
	 * API name: {@code task_type}
	 */
	public final AlibabaCloudTaskType taskType() {
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
	 * Builder for {@link PutAlibabacloudRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PutAlibabacloudRequest> {
		private String alibabacloudInferenceId;

		@Nullable
		private InferenceChunkingSettings chunkingSettings;

		private AlibabaCloudServiceType service;

		private AlibabaCloudServiceSettings serviceSettings;

		@Nullable
		private AlibabaCloudTaskSettings taskSettings;

		private AlibabaCloudTaskType taskType;

		@Nullable
		private Time timeout;

		public Builder() {
		}
		private Builder(PutAlibabacloudRequest instance) {
			this.alibabacloudInferenceId = instance.alibabacloudInferenceId;
			this.chunkingSettings = instance.chunkingSettings;
			this.service = instance.service;
			this.serviceSettings = instance.serviceSettings;
			this.taskSettings = instance.taskSettings;
			this.taskType = instance.taskType;
			this.timeout = instance.timeout;

		}
		/**
		 * Required - The unique identifier of the inference endpoint.
		 * <p>
		 * API name: {@code alibabacloud_inference_id}
		 */
		public final Builder alibabacloudInferenceId(String value) {
			this.alibabacloudInferenceId = value;
			return this;
		}

		/**
		 * The chunking configuration object. Applies only to the
		 * <code>sparse_embedding</code> or <code>text_embedding</code> task types. Not
		 * applicable to the <code>rerank</code> or <code>completion</code> task types.
		 * <p>
		 * API name: {@code chunking_settings}
		 */
		public final Builder chunkingSettings(@Nullable InferenceChunkingSettings value) {
			this.chunkingSettings = value;
			return this;
		}

		/**
		 * The chunking configuration object. Applies only to the
		 * <code>sparse_embedding</code> or <code>text_embedding</code> task types. Not
		 * applicable to the <code>rerank</code> or <code>completion</code> task types.
		 * <p>
		 * API name: {@code chunking_settings}
		 */
		public final Builder chunkingSettings(
				Function<InferenceChunkingSettings.Builder, ObjectBuilder<InferenceChunkingSettings>> fn) {
			return this.chunkingSettings(fn.apply(new InferenceChunkingSettings.Builder()).build());
		}

		/**
		 * Required - The type of service supported for the specified task type. In this
		 * case, <code>alibabacloud-ai-search</code>.
		 * <p>
		 * API name: {@code service}
		 */
		public final Builder service(AlibabaCloudServiceType value) {
			this.service = value;
			return this;
		}

		/**
		 * Required - Settings used to install the inference model. These settings are
		 * specific to the <code>alibabacloud-ai-search</code> service.
		 * <p>
		 * API name: {@code service_settings}
		 */
		public final Builder serviceSettings(AlibabaCloudServiceSettings value) {
			this.serviceSettings = value;
			return this;
		}

		/**
		 * Required - Settings used to install the inference model. These settings are
		 * specific to the <code>alibabacloud-ai-search</code> service.
		 * <p>
		 * API name: {@code service_settings}
		 */
		public final Builder serviceSettings(
				Function<AlibabaCloudServiceSettings.Builder, ObjectBuilder<AlibabaCloudServiceSettings>> fn) {
			return this.serviceSettings(fn.apply(new AlibabaCloudServiceSettings.Builder()).build());
		}

		/**
		 * Settings to configure the inference task. These settings are specific to the
		 * task type you specified.
		 * <p>
		 * API name: {@code task_settings}
		 */
		public final Builder taskSettings(@Nullable AlibabaCloudTaskSettings value) {
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
				Function<AlibabaCloudTaskSettings.Builder, ObjectBuilder<AlibabaCloudTaskSettings>> fn) {
			return this.taskSettings(fn.apply(new AlibabaCloudTaskSettings.Builder()).build());
		}

		/**
		 * Required - The type of the inference task that the model will perform.
		 * <p>
		 * API name: {@code task_type}
		 */
		public final Builder taskType(AlibabaCloudTaskType value) {
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
		 * Builds a {@link PutAlibabacloudRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutAlibabacloudRequest build() {
			_checkSingleUse();

			return new PutAlibabacloudRequest(this);
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
	 * Json deserializer for {@link PutAlibabacloudRequest}
	 */
	public static final JsonpDeserializer<PutAlibabacloudRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutAlibabacloudRequest::setupPutAlibabacloudRequestDeserializer);

	protected static void setupPutAlibabacloudRequestDeserializer(
			ObjectDeserializer<PutAlibabacloudRequest.Builder> op) {

		op.add(Builder::chunkingSettings, InferenceChunkingSettings._DESERIALIZER, "chunking_settings");
		op.add(Builder::service, AlibabaCloudServiceType._DESERIALIZER, "service");
		op.add(Builder::serviceSettings, AlibabaCloudServiceSettings._DESERIALIZER, "service_settings");
		op.add(Builder::taskSettings, AlibabaCloudTaskSettings._DESERIALIZER, "task_settings");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code inference.put_alibabacloud}".
	 */
	public static final Endpoint<PutAlibabacloudRequest, PutAlibabacloudResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/inference.put_alibabacloud",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _taskType = 1 << 0;
				final int _alibabacloudInferenceId = 1 << 1;

				int propsSet = 0;

				propsSet |= _taskType;
				propsSet |= _alibabacloudInferenceId;

				if (propsSet == (_taskType | _alibabacloudInferenceId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_inference");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.taskType.jsonValue(), buf);
					buf.append("/");
					SimpleEndpoint.pathEncode(request.alibabacloudInferenceId, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _taskType = 1 << 0;
				final int _alibabacloudInferenceId = 1 << 1;

				int propsSet = 0;

				propsSet |= _taskType;
				propsSet |= _alibabacloudInferenceId;

				if (propsSet == (_taskType | _alibabacloudInferenceId)) {
					params.put("taskType", request.taskType.jsonValue());
					params.put("alibabacloudInferenceId", request.alibabacloudInferenceId);
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

			}, SimpleEndpoint.emptyMap(), true, PutAlibabacloudResponse._DESERIALIZER);
}
