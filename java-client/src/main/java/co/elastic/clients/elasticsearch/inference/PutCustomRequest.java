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

// typedef: inference.put_custom.Request

/**
 * Create a custom inference endpoint.
 * <p>
 * The custom service gives more control over how to interact with external
 * inference services that aren't explicitly supported through dedicated
 * integrations. The custom service gives you the ability to define the headers,
 * url, query parameters, request body, and secrets. The custom service supports
 * the template replacement functionality, which enables you to define a
 * template that can be replaced with the value associated with that key.
 * Templates are portions of a string that start with <code>${</code> and end
 * with <code>}</code>. The parameters <code>secret_parameters</code> and
 * <code>task_settings</code> are checked for keys for template replacement.
 * Template replacement is supported in the <code>request</code>,
 * <code>headers</code>, <code>url</code>, and <code>query_parameters</code>. If
 * the definition (key) is not found for a template, an error message is
 * returned. In case of an endpoint definition like the following:
 * 
 * <pre>
 * <code>PUT _inference/text_embedding/test-text-embedding
 * {
 *   &quot;service&quot;: &quot;custom&quot;,
 *   &quot;service_settings&quot;: {
 *      &quot;secret_parameters&quot;: {
 *           &quot;api_key&quot;: &quot;&lt;some api key&gt;&quot;
 *      },
 *      &quot;url&quot;: &quot;...endpoints.huggingface.cloud/v1/embeddings&quot;,
 *      &quot;headers&quot;: {
 *          &quot;Authorization&quot;: &quot;Bearer ${api_key}&quot;,
 *          &quot;Content-Type&quot;: &quot;application/json&quot;
 *      },
 *      &quot;request&quot;: &quot;{\&quot;input\&quot;: ${input}}&quot;,
 *      &quot;response&quot;: {
 *          &quot;json_parser&quot;: {
 *              &quot;text_embeddings&quot;:&quot;$.data[*].embedding[*]&quot;
 *          }
 *      }
 *   }
 * }
 * </code>
 * </pre>
 * <p>
 * To replace <code>${api_key}</code> the <code>secret_parameters</code> and
 * <code>task_settings</code> are checked for a key named <code>api_key</code>.
 * <blockquote>
 * <p>
 * info Templates should not be surrounded by quotes.
 * </p>
 * </blockquote>
 * <p>
 * Pre-defined templates:
 * <ul>
 * <li><code>${input}</code> refers to the array of input strings that comes
 * from the <code>input</code> field of the subsequent inference requests.</li>
 * <li><code>${input_type}</code> refers to the input type translation
 * values.</li>
 * <li><code>${query}</code> refers to the query field used specifically for
 * reranking tasks.</li>
 * <li><code>${top_n}</code> refers to the <code>top_n</code> field available
 * when performing rerank requests.</li>
 * <li><code>${return_documents}</code> refers to the
 * <code>return_documents</code> field available when performing rerank
 * requests.</li>
 * </ul>
 *
 * @see <a href="../doc-files/api-spec.html#inference.put_custom.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutCustomRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final InferenceChunkingSettings chunkingSettings;

	private final String customInferenceId;

	private final CustomServiceType service;

	private final CustomServiceSettings serviceSettings;

	@Nullable
	private final CustomTaskSettings taskSettings;

	private final CustomTaskType taskType;

	// ---------------------------------------------------------------------------------------------

	private PutCustomRequest(Builder builder) {

		this.chunkingSettings = builder.chunkingSettings;
		this.customInferenceId = ApiTypeHelper.requireNonNull(builder.customInferenceId, this, "customInferenceId");
		this.service = ApiTypeHelper.requireNonNull(builder.service, this, "service");
		this.serviceSettings = ApiTypeHelper.requireNonNull(builder.serviceSettings, this, "serviceSettings");
		this.taskSettings = builder.taskSettings;
		this.taskType = ApiTypeHelper.requireNonNull(builder.taskType, this, "taskType");

	}

	public static PutCustomRequest of(Function<Builder, ObjectBuilder<PutCustomRequest>> fn) {
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
	 * API name: {@code custom_inference_id}
	 */
	public final String customInferenceId() {
		return this.customInferenceId;
	}

	/**
	 * Required - The type of service supported for the specified task type. In this
	 * case, <code>custom</code>.
	 * <p>
	 * API name: {@code service}
	 */
	public final CustomServiceType service() {
		return this.service;
	}

	/**
	 * Required - Settings used to install the inference model. These settings are
	 * specific to the <code>custom</code> service.
	 * <p>
	 * API name: {@code service_settings}
	 */
	public final CustomServiceSettings serviceSettings() {
		return this.serviceSettings;
	}

	/**
	 * Settings to configure the inference task. These settings are specific to the
	 * task type you specified.
	 * <p>
	 * API name: {@code task_settings}
	 */
	@Nullable
	public final CustomTaskSettings taskSettings() {
		return this.taskSettings;
	}

	/**
	 * Required - The type of the inference task that the model will perform.
	 * <p>
	 * API name: {@code task_type}
	 */
	public final CustomTaskType taskType() {
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
	 * Builder for {@link PutCustomRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PutCustomRequest> {
		@Nullable
		private InferenceChunkingSettings chunkingSettings;

		private String customInferenceId;

		private CustomServiceType service;

		private CustomServiceSettings serviceSettings;

		@Nullable
		private CustomTaskSettings taskSettings;

		private CustomTaskType taskType;

		public Builder() {
		}
		private Builder(PutCustomRequest instance) {
			this.chunkingSettings = instance.chunkingSettings;
			this.customInferenceId = instance.customInferenceId;
			this.service = instance.service;
			this.serviceSettings = instance.serviceSettings;
			this.taskSettings = instance.taskSettings;
			this.taskType = instance.taskType;

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
		 * API name: {@code custom_inference_id}
		 */
		public final Builder customInferenceId(String value) {
			this.customInferenceId = value;
			return this;
		}

		/**
		 * Required - The type of service supported for the specified task type. In this
		 * case, <code>custom</code>.
		 * <p>
		 * API name: {@code service}
		 */
		public final Builder service(CustomServiceType value) {
			this.service = value;
			return this;
		}

		/**
		 * Required - Settings used to install the inference model. These settings are
		 * specific to the <code>custom</code> service.
		 * <p>
		 * API name: {@code service_settings}
		 */
		public final Builder serviceSettings(CustomServiceSettings value) {
			this.serviceSettings = value;
			return this;
		}

		/**
		 * Required - Settings used to install the inference model. These settings are
		 * specific to the <code>custom</code> service.
		 * <p>
		 * API name: {@code service_settings}
		 */
		public final Builder serviceSettings(
				Function<CustomServiceSettings.Builder, ObjectBuilder<CustomServiceSettings>> fn) {
			return this.serviceSettings(fn.apply(new CustomServiceSettings.Builder()).build());
		}

		/**
		 * Settings to configure the inference task. These settings are specific to the
		 * task type you specified.
		 * <p>
		 * API name: {@code task_settings}
		 */
		public final Builder taskSettings(@Nullable CustomTaskSettings value) {
			this.taskSettings = value;
			return this;
		}

		/**
		 * Settings to configure the inference task. These settings are specific to the
		 * task type you specified.
		 * <p>
		 * API name: {@code task_settings}
		 */
		public final Builder taskSettings(Function<CustomTaskSettings.Builder, ObjectBuilder<CustomTaskSettings>> fn) {
			return this.taskSettings(fn.apply(new CustomTaskSettings.Builder()).build());
		}

		/**
		 * Required - The type of the inference task that the model will perform.
		 * <p>
		 * API name: {@code task_type}
		 */
		public final Builder taskType(CustomTaskType value) {
			this.taskType = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutCustomRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutCustomRequest build() {
			_checkSingleUse();

			return new PutCustomRequest(this);
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
	 * Json deserializer for {@link PutCustomRequest}
	 */
	public static final JsonpDeserializer<PutCustomRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PutCustomRequest::setupPutCustomRequestDeserializer);

	protected static void setupPutCustomRequestDeserializer(ObjectDeserializer<PutCustomRequest.Builder> op) {

		op.add(Builder::chunkingSettings, InferenceChunkingSettings._DESERIALIZER, "chunking_settings");
		op.add(Builder::service, CustomServiceType._DESERIALIZER, "service");
		op.add(Builder::serviceSettings, CustomServiceSettings._DESERIALIZER, "service_settings");
		op.add(Builder::taskSettings, CustomTaskSettings._DESERIALIZER, "task_settings");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code inference.put_custom}".
	 */
	public static final Endpoint<PutCustomRequest, PutCustomResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/inference.put_custom",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _taskType = 1 << 0;
				final int _customInferenceId = 1 << 1;

				int propsSet = 0;

				propsSet |= _taskType;
				propsSet |= _customInferenceId;

				if (propsSet == (_taskType | _customInferenceId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_inference");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.taskType.jsonValue(), buf);
					buf.append("/");
					SimpleEndpoint.pathEncode(request.customInferenceId, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _taskType = 1 << 0;
				final int _customInferenceId = 1 << 1;

				int propsSet = 0;

				propsSet |= _taskType;
				propsSet |= _customInferenceId;

				if (propsSet == (_taskType | _customInferenceId)) {
					params.put("taskType", request.taskType.jsonValue());
					params.put("customInferenceId", request.customInferenceId);
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, PutCustomResponse._DESERIALIZER);
}
