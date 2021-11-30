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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.start_trained_model_deployment.Request

/**
 * Starts a trained model deployment, which allocates the model to every machine
 * learning node.
 * 
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/bd953a3fc/specification/ml/start_trained_model_deployment/MlStartTrainedModelDeploymentRequest.ts#L26-L71">API
 *      specification</a>
 */

public class StartTrainedModelDeploymentRequest extends RequestBase {
	@Nullable
	private final Integer inferenceThreads;

	private final String modelId;

	@Nullable
	private final Integer modelThreads;

	@Nullable
	private final Integer queueCapacity;

	@Nullable
	private final Time timeout;

	@Nullable
	private final DeploymentState waitFor;

	// ---------------------------------------------------------------------------------------------

	private StartTrainedModelDeploymentRequest(Builder builder) {

		this.inferenceThreads = builder.inferenceThreads;
		this.modelId = ApiTypeHelper.requireNonNull(builder.modelId, this, "modelId");
		this.modelThreads = builder.modelThreads;
		this.queueCapacity = builder.queueCapacity;
		this.timeout = builder.timeout;
		this.waitFor = builder.waitFor;

	}

	public static StartTrainedModelDeploymentRequest of(
			Function<Builder, ObjectBuilder<StartTrainedModelDeploymentRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Specifies the number of threads that are used by the inference process. If
	 * you increase this value, inference speed generally increases. However, the
	 * actual number of threads is limited by the number of available CPU cores.
	 * <p>
	 * API name: {@code inference_threads}
	 */
	@Nullable
	public final Integer inferenceThreads() {
		return this.inferenceThreads;
	}

	/**
	 * Required - The unique identifier of the trained model. Currently, only
	 * PyTorch models are supported.
	 * <p>
	 * API name: {@code model_id}
	 */
	public final String modelId() {
		return this.modelId;
	}

	/**
	 * Specifies the number of threads that are used when sending inference requests
	 * to the model. If you increase this value, throughput generally increases.
	 * <p>
	 * API name: {@code model_threads}
	 */
	@Nullable
	public final Integer modelThreads() {
		return this.modelThreads;
	}

	/**
	 * Specifies the number of inference requests that are allowed in the queue.
	 * After the number of requests exceeds this value, new requests are rejected
	 * with a 429 error.
	 * <p>
	 * API name: {@code queue_capacity}
	 */
	@Nullable
	public final Integer queueCapacity() {
		return this.queueCapacity;
	}

	/**
	 * Specifies the amount of time to wait for the model to deploy.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
	}

	/**
	 * Specifies the allocation status to wait for before returning.
	 * <p>
	 * API name: {@code wait_for}
	 */
	@Nullable
	public final DeploymentState waitFor() {
		return this.waitFor;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StartTrainedModelDeploymentRequest}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<StartTrainedModelDeploymentRequest> {
		@Nullable
		private Integer inferenceThreads;

		private String modelId;

		@Nullable
		private Integer modelThreads;

		@Nullable
		private Integer queueCapacity;

		@Nullable
		private Time timeout;

		@Nullable
		private DeploymentState waitFor;

		/**
		 * Specifies the number of threads that are used by the inference process. If
		 * you increase this value, inference speed generally increases. However, the
		 * actual number of threads is limited by the number of available CPU cores.
		 * <p>
		 * API name: {@code inference_threads}
		 */
		public final Builder inferenceThreads(@Nullable Integer value) {
			this.inferenceThreads = value;
			return this;
		}

		/**
		 * Required - The unique identifier of the trained model. Currently, only
		 * PyTorch models are supported.
		 * <p>
		 * API name: {@code model_id}
		 */
		public final Builder modelId(String value) {
			this.modelId = value;
			return this;
		}

		/**
		 * Specifies the number of threads that are used when sending inference requests
		 * to the model. If you increase this value, throughput generally increases.
		 * <p>
		 * API name: {@code model_threads}
		 */
		public final Builder modelThreads(@Nullable Integer value) {
			this.modelThreads = value;
			return this;
		}

		/**
		 * Specifies the number of inference requests that are allowed in the queue.
		 * After the number of requests exceeds this value, new requests are rejected
		 * with a 429 error.
		 * <p>
		 * API name: {@code queue_capacity}
		 */
		public final Builder queueCapacity(@Nullable Integer value) {
			this.queueCapacity = value;
			return this;
		}

		/**
		 * Specifies the amount of time to wait for the model to deploy.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Specifies the amount of time to wait for the model to deploy.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Specifies the allocation status to wait for before returning.
		 * <p>
		 * API name: {@code wait_for}
		 */
		public final Builder waitFor(@Nullable DeploymentState value) {
			this.waitFor = value;
			return this;
		}

		/**
		 * Builds a {@link StartTrainedModelDeploymentRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StartTrainedModelDeploymentRequest build() {
			_checkSingleUse();

			return new StartTrainedModelDeploymentRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.start_trained_model_deployment}".
	 */
	public static final Endpoint<StartTrainedModelDeploymentRequest, StartTrainedModelDeploymentResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ml.start_trained_model_deployment",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _modelId = 1 << 0;

				int propsSet = 0;

				propsSet |= _modelId;

				if (propsSet == (_modelId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/trained_models");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.modelId, buf);
					buf.append("/deployment");
					buf.append("/_start");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.inferenceThreads != null) {
					params.put("inference_threads", String.valueOf(request.inferenceThreads));
				}
				if (request.waitFor != null) {
					params.put("wait_for", request.waitFor.jsonValue());
				}
				if (request.modelThreads != null) {
					params.put("model_threads", String.valueOf(request.modelThreads));
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				if (request.queueCapacity != null) {
					params.put("queue_capacity", String.valueOf(request.queueCapacity));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, StartTrainedModelDeploymentResponse._DESERIALIZER);
}
