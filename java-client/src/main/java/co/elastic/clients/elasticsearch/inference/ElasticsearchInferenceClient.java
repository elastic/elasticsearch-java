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

import co.elastic.clients.ApiClient;
import co.elastic.clients.elasticsearch._types.ElasticsearchException;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.JsonEndpoint;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
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

/**
 * Client for the inference namespace.
 */
public class ElasticsearchInferenceClient extends ApiClient<ElasticsearchTransport, ElasticsearchInferenceClient> {

	public ElasticsearchInferenceClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchInferenceClient(ElasticsearchTransport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchInferenceClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchInferenceClient(this.transport, transportOptions);
	}

	// ----- Endpoint: inference.delete

	/**
	 * Delete an inference endpoint
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-inference-delete">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteInferenceResponse delete(DeleteInferenceRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteInferenceRequest, DeleteInferenceResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteInferenceRequest, DeleteInferenceResponse, ErrorResponse>) DeleteInferenceRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete an inference endpoint
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteInferenceRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-inference-delete">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteInferenceResponse delete(
			Function<DeleteInferenceRequest.Builder, ObjectBuilder<DeleteInferenceRequest>> fn)
			throws IOException, ElasticsearchException {
		return delete(fn.apply(new DeleteInferenceRequest.Builder()).build());
	}

	// ----- Endpoint: inference.get

	/**
	 * Get an inference endpoint
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-inference-get">Documentation
	 *      on elastic.co</a>
	 */

	public GetInferenceResponse get(GetInferenceRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetInferenceRequest, GetInferenceResponse, ErrorResponse> endpoint = (JsonEndpoint<GetInferenceRequest, GetInferenceResponse, ErrorResponse>) GetInferenceRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get an inference endpoint
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetInferenceRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-inference-get">Documentation
	 *      on elastic.co</a>
	 */

	public final GetInferenceResponse get(Function<GetInferenceRequest.Builder, ObjectBuilder<GetInferenceRequest>> fn)
			throws IOException, ElasticsearchException {
		return get(fn.apply(new GetInferenceRequest.Builder()).build());
	}

	/**
	 * Get an inference endpoint
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-inference-get">Documentation
	 *      on elastic.co</a>
	 */

	public GetInferenceResponse get() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetInferenceRequest.Builder().build(), GetInferenceRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: inference.inference

	/**
	 * Perform inference on the service.
	 * <p>
	 * This API enables you to use machine learning models to perform specific tasks
	 * on data that you provide as an input. It returns a response with the results
	 * of the tasks. The inference endpoint you use can perform one specific task
	 * that has been defined when the endpoint was created with the create inference
	 * API. <blockquote>
	 * <p>
	 * info The inference APIs enable you to use certain services, such as built-in
	 * machine learning models (ELSER, E5), models uploaded through Eland, Cohere,
	 * OpenAI, Azure, Google AI Studio, Google Vertex AI, Anthropic, Watsonx.ai, or
	 * Hugging Face. For built-in models and models uploaded through Eland, the
	 * inference APIs offer an alternative way to use and manage trained models.
	 * However, if you do not plan to use the inference APIs to use these models or
	 * if you want to use non-NLP models, use the machine learning trained model
	 * APIs.
	 * </p>
	 * </blockquote>
	 *
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-inference-inference">Documentation
	 *      on elastic.co</a>
	 */

	public InferenceResponse inference(InferenceRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<InferenceRequest, InferenceResponse, ErrorResponse> endpoint = (JsonEndpoint<InferenceRequest, InferenceResponse, ErrorResponse>) InferenceRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Perform inference on the service.
	 * <p>
	 * This API enables you to use machine learning models to perform specific tasks
	 * on data that you provide as an input. It returns a response with the results
	 * of the tasks. The inference endpoint you use can perform one specific task
	 * that has been defined when the endpoint was created with the create inference
	 * API. <blockquote>
	 * <p>
	 * info The inference APIs enable you to use certain services, such as built-in
	 * machine learning models (ELSER, E5), models uploaded through Eland, Cohere,
	 * OpenAI, Azure, Google AI Studio, Google Vertex AI, Anthropic, Watsonx.ai, or
	 * Hugging Face. For built-in models and models uploaded through Eland, the
	 * inference APIs offer an alternative way to use and manage trained models.
	 * However, if you do not plan to use the inference APIs to use these models or
	 * if you want to use non-NLP models, use the machine learning trained model
	 * APIs.
	 * </p>
	 * </blockquote>
	 *
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link InferenceRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-inference-inference">Documentation
	 *      on elastic.co</a>
	 */

	public final InferenceResponse inference(Function<InferenceRequest.Builder, ObjectBuilder<InferenceRequest>> fn)
			throws IOException, ElasticsearchException {
		return inference(fn.apply(new InferenceRequest.Builder()).build());
	}

	// ----- Endpoint: inference.put

	/**
	 * Create an inference endpoint. When you create an inference endpoint, the
	 * associated machine learning model is automatically deployed if it is not
	 * already running. After creating the endpoint, wait for the model deployment
	 * to complete before using it. To verify the deployment status, use the get
	 * trained model statistics API. Look for
	 * <code>&quot;state&quot;: &quot;fully_allocated&quot;</code> in the response
	 * and ensure that the <code>&quot;allocation_count&quot;</code> matches the
	 * <code>&quot;target_allocation_count&quot;</code>. Avoid creating multiple
	 * endpoints for the same model unless required, as each endpoint consumes
	 * significant resources.
	 * <p>
	 * IMPORTANT: The inference APIs enable you to use certain services, such as
	 * built-in machine learning models (ELSER, E5), models uploaded through Eland,
	 * Cohere, OpenAI, Mistral, Azure OpenAI, Google AI Studio, Google Vertex AI,
	 * Anthropic, Watsonx.ai, or Hugging Face. For built-in models and models
	 * uploaded through Eland, the inference APIs offer an alternative way to use
	 * and manage trained models. However, if you do not plan to use the inference
	 * APIs to use these models or if you want to use non-NLP models, use the
	 * machine learning trained model APIs.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-inference-put">Documentation
	 *      on elastic.co</a>
	 */

	public PutResponse put(PutRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutRequest, PutResponse, ErrorResponse> endpoint = (JsonEndpoint<PutRequest, PutResponse, ErrorResponse>) PutRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Create an inference endpoint. When you create an inference endpoint, the
	 * associated machine learning model is automatically deployed if it is not
	 * already running. After creating the endpoint, wait for the model deployment
	 * to complete before using it. To verify the deployment status, use the get
	 * trained model statistics API. Look for
	 * <code>&quot;state&quot;: &quot;fully_allocated&quot;</code> in the response
	 * and ensure that the <code>&quot;allocation_count&quot;</code> matches the
	 * <code>&quot;target_allocation_count&quot;</code>. Avoid creating multiple
	 * endpoints for the same model unless required, as each endpoint consumes
	 * significant resources.
	 * <p>
	 * IMPORTANT: The inference APIs enable you to use certain services, such as
	 * built-in machine learning models (ELSER, E5), models uploaded through Eland,
	 * Cohere, OpenAI, Mistral, Azure OpenAI, Google AI Studio, Google Vertex AI,
	 * Anthropic, Watsonx.ai, or Hugging Face. For built-in models and models
	 * uploaded through Eland, the inference APIs offer an alternative way to use
	 * and manage trained models. However, if you do not plan to use the inference
	 * APIs to use these models or if you want to use non-NLP models, use the
	 * machine learning trained model APIs.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-inference-put">Documentation
	 *      on elastic.co</a>
	 */

	public final PutResponse put(Function<PutRequest.Builder, ObjectBuilder<PutRequest>> fn)
			throws IOException, ElasticsearchException {
		return put(fn.apply(new PutRequest.Builder()).build());
	}

	// ----- Endpoint: inference.update

	/**
	 * Update an inference endpoint.
	 * <p>
	 * Modify <code>task_settings</code>, secrets (within
	 * <code>service_settings</code>), or <code>num_allocations</code> for an
	 * inference endpoint, depending on the specific endpoint service and
	 * <code>task_type</code>.
	 * <p>
	 * IMPORTANT: The inference APIs enable you to use certain services, such as
	 * built-in machine learning models (ELSER, E5), models uploaded through Eland,
	 * Cohere, OpenAI, Azure, Google AI Studio, Google Vertex AI, Anthropic,
	 * Watsonx.ai, or Hugging Face. For built-in models and models uploaded through
	 * Eland, the inference APIs offer an alternative way to use and manage trained
	 * models. However, if you do not plan to use the inference APIs to use these
	 * models or if you want to use non-NLP models, use the machine learning trained
	 * model APIs.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-inference-update">Documentation
	 *      on elastic.co</a>
	 */

	public UpdateInferenceResponse update(UpdateInferenceRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdateInferenceRequest, UpdateInferenceResponse, ErrorResponse> endpoint = (JsonEndpoint<UpdateInferenceRequest, UpdateInferenceResponse, ErrorResponse>) UpdateInferenceRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Update an inference endpoint.
	 * <p>
	 * Modify <code>task_settings</code>, secrets (within
	 * <code>service_settings</code>), or <code>num_allocations</code> for an
	 * inference endpoint, depending on the specific endpoint service and
	 * <code>task_type</code>.
	 * <p>
	 * IMPORTANT: The inference APIs enable you to use certain services, such as
	 * built-in machine learning models (ELSER, E5), models uploaded through Eland,
	 * Cohere, OpenAI, Azure, Google AI Studio, Google Vertex AI, Anthropic,
	 * Watsonx.ai, or Hugging Face. For built-in models and models uploaded through
	 * Eland, the inference APIs offer an alternative way to use and manage trained
	 * models. However, if you do not plan to use the inference APIs to use these
	 * models or if you want to use non-NLP models, use the machine learning trained
	 * model APIs.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateInferenceRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-inference-update">Documentation
	 *      on elastic.co</a>
	 */

	public final UpdateInferenceResponse update(
			Function<UpdateInferenceRequest.Builder, ObjectBuilder<UpdateInferenceRequest>> fn)
			throws IOException, ElasticsearchException {
		return update(fn.apply(new UpdateInferenceRequest.Builder()).build());
	}

}
