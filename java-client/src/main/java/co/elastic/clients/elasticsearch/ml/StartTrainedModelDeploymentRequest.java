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
 *      "../doc-files/api-spec.html#ml.start_trained_model_deployment.Request">API
 *      specification</a>
 */

public class StartTrainedModelDeploymentRequest extends RequestBase {
	@Nullable
	private final String cacheSize;

	private final String modelId;

	@Nullable
	private final Integer numberOfAllocations;

	@Nullable
	private final TrainingPriority priority;

	@Nullable
	private final Integer queueCapacity;

	@Nullable
	private final Integer threadsPerAllocation;

	@Nullable
	private final Time timeout;

	@Nullable
	private final DeploymentAllocationState waitFor;

	// ---------------------------------------------------------------------------------------------

	private StartTrainedModelDeploymentRequest(Builder builder) {

		this.cacheSize = builder.cacheSize;
		this.modelId = ApiTypeHelper.requireNonNull(builder.modelId, this, "modelId");
		this.numberOfAllocations = builder.numberOfAllocations;
		this.priority = builder.priority;
		this.queueCapacity = builder.queueCapacity;
		this.threadsPerAllocation = builder.threadsPerAllocation;
		this.timeout = builder.timeout;
		this.waitFor = builder.waitFor;

	}

	public static StartTrainedModelDeploymentRequest of(
			Function<Builder, ObjectBuilder<StartTrainedModelDeploymentRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The inference cache size (in memory outside the JVM heap) per node for the
	 * model. The default value is the same size as the
	 * <code>model_size_bytes</code>. To disable the cache, <code>0b</code> can be
	 * provided.
	 * <p>
	 * API name: {@code cache_size}
	 */
	@Nullable
	public final String cacheSize() {
		return this.cacheSize;
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
	 * The number of model allocations on each node where the model is deployed. All
	 * allocations on a node share the same copy of the model in memory but use a
	 * separate set of threads to evaluate the model. Increasing this value
	 * generally increases the throughput. If this setting is greater than the
	 * number of hardware threads it will automatically be changed to a value less
	 * than the number of hardware threads.
	 * <p>
	 * API name: {@code number_of_allocations}
	 */
	@Nullable
	public final Integer numberOfAllocations() {
		return this.numberOfAllocations;
	}

	/**
	 * The deployment priority.
	 * <p>
	 * API name: {@code priority}
	 */
	@Nullable
	public final TrainingPriority priority() {
		return this.priority;
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
	 * Sets the number of threads used by each model allocation during inference.
	 * This generally increases the inference speed. The inference process is a
	 * compute-bound process; any number greater than the number of available
	 * hardware threads on the machine does not increase the inference speed. If
	 * this setting is greater than the number of hardware threads it will
	 * automatically be changed to a value less than the number of hardware threads.
	 * <p>
	 * API name: {@code threads_per_allocation}
	 */
	@Nullable
	public final Integer threadsPerAllocation() {
		return this.threadsPerAllocation;
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
	public final DeploymentAllocationState waitFor() {
		return this.waitFor;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StartTrainedModelDeploymentRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<StartTrainedModelDeploymentRequest> {
		@Nullable
		private String cacheSize;

		private String modelId;

		@Nullable
		private Integer numberOfAllocations;

		@Nullable
		private TrainingPriority priority;

		@Nullable
		private Integer queueCapacity;

		@Nullable
		private Integer threadsPerAllocation;

		@Nullable
		private Time timeout;

		@Nullable
		private DeploymentAllocationState waitFor;

		/**
		 * The inference cache size (in memory outside the JVM heap) per node for the
		 * model. The default value is the same size as the
		 * <code>model_size_bytes</code>. To disable the cache, <code>0b</code> can be
		 * provided.
		 * <p>
		 * API name: {@code cache_size}
		 */
		public final Builder cacheSize(@Nullable String value) {
			this.cacheSize = value;
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
		 * The number of model allocations on each node where the model is deployed. All
		 * allocations on a node share the same copy of the model in memory but use a
		 * separate set of threads to evaluate the model. Increasing this value
		 * generally increases the throughput. If this setting is greater than the
		 * number of hardware threads it will automatically be changed to a value less
		 * than the number of hardware threads.
		 * <p>
		 * API name: {@code number_of_allocations}
		 */
		public final Builder numberOfAllocations(@Nullable Integer value) {
			this.numberOfAllocations = value;
			return this;
		}

		/**
		 * The deployment priority.
		 * <p>
		 * API name: {@code priority}
		 */
		public final Builder priority(@Nullable TrainingPriority value) {
			this.priority = value;
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
		 * Sets the number of threads used by each model allocation during inference.
		 * This generally increases the inference speed. The inference process is a
		 * compute-bound process; any number greater than the number of available
		 * hardware threads on the machine does not increase the inference speed. If
		 * this setting is greater than the number of hardware threads it will
		 * automatically be changed to a value less than the number of hardware threads.
		 * <p>
		 * API name: {@code threads_per_allocation}
		 */
		public final Builder threadsPerAllocation(@Nullable Integer value) {
			this.threadsPerAllocation = value;
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
		public final Builder waitFor(@Nullable DeploymentAllocationState value) {
			this.waitFor = value;
			return this;
		}

		@Override
		protected Builder self() {
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

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _modelId = 1 << 0;

				int propsSet = 0;

				propsSet |= _modelId;

				if (propsSet == (_modelId)) {
					params.put("modelId", request.modelId);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.cacheSize != null) {
					params.put("cache_size", request.cacheSize);
				}
				if (request.threadsPerAllocation != null) {
					params.put("threads_per_allocation", String.valueOf(request.threadsPerAllocation));
				}
				if (request.waitFor != null) {
					params.put("wait_for", request.waitFor.jsonValue());
				}
				if (request.numberOfAllocations != null) {
					params.put("number_of_allocations", String.valueOf(request.numberOfAllocations));
				}
				if (request.priority != null) {
					params.put("priority", request.priority.jsonValue());
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
