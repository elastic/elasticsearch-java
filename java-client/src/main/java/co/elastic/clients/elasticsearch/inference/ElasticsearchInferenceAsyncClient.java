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
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.JsonEndpoint;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.transport.endpoints.BinaryResponse;
import co.elastic.clients.util.ObjectBuilder;
import java.util.concurrent.CompletableFuture;
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
public class ElasticsearchInferenceAsyncClient
		extends
			ApiClient<ElasticsearchTransport, ElasticsearchInferenceAsyncClient> {

	public ElasticsearchInferenceAsyncClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchInferenceAsyncClient(ElasticsearchTransport transport,
			@Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchInferenceAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchInferenceAsyncClient(this.transport, transportOptions);
	}

	// ----- Endpoint: inference.chat_completion_unified

	/**
	 * Perform chat completion inference
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-inference-unified-inference">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<BinaryResponse> chatCompletionUnified(ChatCompletionUnifiedRequest request) {
		@SuppressWarnings("unchecked")
		Endpoint<ChatCompletionUnifiedRequest, BinaryResponse, ErrorResponse> endpoint = (Endpoint<ChatCompletionUnifiedRequest, BinaryResponse, ErrorResponse>) ChatCompletionUnifiedRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Perform chat completion inference
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ChatCompletionUnifiedRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-inference-unified-inference">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<BinaryResponse> chatCompletionUnified(
			Function<ChatCompletionUnifiedRequest.Builder, ObjectBuilder<ChatCompletionUnifiedRequest>> fn) {
		return chatCompletionUnified(fn.apply(new ChatCompletionUnifiedRequest.Builder()).build());
	}

	// ----- Endpoint: inference.completion

	/**
	 * Perform completion inference on the service
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-inference-inference">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<CompletionResponse> completion(CompletionRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<CompletionRequest, CompletionResponse, ErrorResponse> endpoint = (JsonEndpoint<CompletionRequest, CompletionResponse, ErrorResponse>) CompletionRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Perform completion inference on the service
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CompletionRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-inference-inference">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<CompletionResponse> completion(
			Function<CompletionRequest.Builder, ObjectBuilder<CompletionRequest>> fn) {
		return completion(fn.apply(new CompletionRequest.Builder()).build());
	}

	// ----- Endpoint: inference.delete

	/**
	 * Delete an inference endpoint
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-inference-delete">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteInferenceResponse> delete(DeleteInferenceRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteInferenceRequest, DeleteInferenceResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteInferenceRequest, DeleteInferenceResponse, ErrorResponse>) DeleteInferenceRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
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

	public final CompletableFuture<DeleteInferenceResponse> delete(
			Function<DeleteInferenceRequest.Builder, ObjectBuilder<DeleteInferenceRequest>> fn) {
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

	public CompletableFuture<GetInferenceResponse> get(GetInferenceRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetInferenceRequest, GetInferenceResponse, ErrorResponse> endpoint = (JsonEndpoint<GetInferenceRequest, GetInferenceResponse, ErrorResponse>) GetInferenceRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
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

	public final CompletableFuture<GetInferenceResponse> get(
			Function<GetInferenceRequest.Builder, ObjectBuilder<GetInferenceRequest>> fn) {
		return get(fn.apply(new GetInferenceRequest.Builder()).build());
	}

	/**
	 * Get an inference endpoint
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-inference-get">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetInferenceResponse> get() {
		return this.transport.performRequestAsync(new GetInferenceRequest.Builder().build(),
				GetInferenceRequest._ENDPOINT, this.transportOptions);
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

	public CompletableFuture<PutResponse> put(PutRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutRequest, PutResponse, ErrorResponse> endpoint = (JsonEndpoint<PutRequest, PutResponse, ErrorResponse>) PutRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
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

	public final CompletableFuture<PutResponse> put(Function<PutRequest.Builder, ObjectBuilder<PutRequest>> fn) {
		return put(fn.apply(new PutRequest.Builder()).build());
	}

	// ----- Endpoint: inference.put_eis

	/**
	 * Create an Elastic Inference Service (EIS) inference endpoint.
	 * <p>
	 * Create an inference endpoint to perform an inference task through the Elastic
	 * Inference Service (EIS).
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/infer-service-eis.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutEisResponse> putEis(PutEisRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutEisRequest, PutEisResponse, ErrorResponse> endpoint = (JsonEndpoint<PutEisRequest, PutEisResponse, ErrorResponse>) PutEisRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Create an Elastic Inference Service (EIS) inference endpoint.
	 * <p>
	 * Create an inference endpoint to perform an inference task through the Elastic
	 * Inference Service (EIS).
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutEisRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/infer-service-eis.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutEisResponse> putEis(
			Function<PutEisRequest.Builder, ObjectBuilder<PutEisRequest>> fn) {
		return putEis(fn.apply(new PutEisRequest.Builder()).build());
	}

	// ----- Endpoint: inference.put_openai

	/**
	 * Create an OpenAI inference endpoint.
	 * <p>
	 * Create an inference endpoint to perform an inference task with the
	 * <code>openai</code> service.
	 * <p>
	 * When you create an inference endpoint, the associated machine learning model
	 * is automatically deployed if it is not already running. After creating the
	 * endpoint, wait for the model deployment to complete before using it. To
	 * verify the deployment status, use the get trained model statistics API. Look
	 * for <code>&quot;state&quot;: &quot;fully_allocated&quot;</code> in the
	 * response and ensure that the <code>&quot;allocation_count&quot;</code>
	 * matches the <code>&quot;target_allocation_count&quot;</code>. Avoid creating
	 * multiple endpoints for the same model unless required, as each endpoint
	 * consumes significant resources.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/infer-service-openai.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutOpenaiResponse> putOpenai(PutOpenaiRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutOpenaiRequest, PutOpenaiResponse, ErrorResponse> endpoint = (JsonEndpoint<PutOpenaiRequest, PutOpenaiResponse, ErrorResponse>) PutOpenaiRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Create an OpenAI inference endpoint.
	 * <p>
	 * Create an inference endpoint to perform an inference task with the
	 * <code>openai</code> service.
	 * <p>
	 * When you create an inference endpoint, the associated machine learning model
	 * is automatically deployed if it is not already running. After creating the
	 * endpoint, wait for the model deployment to complete before using it. To
	 * verify the deployment status, use the get trained model statistics API. Look
	 * for <code>&quot;state&quot;: &quot;fully_allocated&quot;</code> in the
	 * response and ensure that the <code>&quot;allocation_count&quot;</code>
	 * matches the <code>&quot;target_allocation_count&quot;</code>. Avoid creating
	 * multiple endpoints for the same model unless required, as each endpoint
	 * consumes significant resources.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutOpenaiRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/infer-service-openai.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutOpenaiResponse> putOpenai(
			Function<PutOpenaiRequest.Builder, ObjectBuilder<PutOpenaiRequest>> fn) {
		return putOpenai(fn.apply(new PutOpenaiRequest.Builder()).build());
	}

	// ----- Endpoint: inference.put_voyageai

	/**
	 * Create a VoyageAI inference endpoint.
	 * <p>
	 * Create an inference endpoint to perform an inference task with the
	 * <code>voyageai</code> service.
	 * <p>
	 * Avoid creating multiple endpoints for the same model unless required, as each
	 * endpoint consumes significant resources.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-inference-put-voyageai">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutVoyageaiResponse> putVoyageai(PutVoyageaiRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutVoyageaiRequest, PutVoyageaiResponse, ErrorResponse> endpoint = (JsonEndpoint<PutVoyageaiRequest, PutVoyageaiResponse, ErrorResponse>) PutVoyageaiRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Create a VoyageAI inference endpoint.
	 * <p>
	 * Create an inference endpoint to perform an inference task with the
	 * <code>voyageai</code> service.
	 * <p>
	 * Avoid creating multiple endpoints for the same model unless required, as each
	 * endpoint consumes significant resources.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutVoyageaiRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-inference-put-voyageai">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutVoyageaiResponse> putVoyageai(
			Function<PutVoyageaiRequest.Builder, ObjectBuilder<PutVoyageaiRequest>> fn) {
		return putVoyageai(fn.apply(new PutVoyageaiRequest.Builder()).build());
	}

	// ----- Endpoint: inference.put_watsonx

	/**
	 * Create a Watsonx inference endpoint.
	 * <p>
	 * Create an inference endpoint to perform an inference task with the
	 * <code>watsonxai</code> service. You need an IBM Cloud Databases for
	 * Elasticsearch deployment to use the <code>watsonxai</code> inference service.
	 * You can provision one through the IBM catalog, the Cloud Databases CLI
	 * plug-in, the Cloud Databases API, or Terraform.
	 * <p>
	 * When you create an inference endpoint, the associated machine learning model
	 * is automatically deployed if it is not already running. After creating the
	 * endpoint, wait for the model deployment to complete before using it. To
	 * verify the deployment status, use the get trained model statistics API. Look
	 * for <code>&quot;state&quot;: &quot;fully_allocated&quot;</code> in the
	 * response and ensure that the <code>&quot;allocation_count&quot;</code>
	 * matches the <code>&quot;target_allocation_count&quot;</code>. Avoid creating
	 * multiple endpoints for the same model unless required, as each endpoint
	 * consumes significant resources.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-inference-put-watsonx">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutWatsonxResponse> putWatsonx(PutWatsonxRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutWatsonxRequest, PutWatsonxResponse, ErrorResponse> endpoint = (JsonEndpoint<PutWatsonxRequest, PutWatsonxResponse, ErrorResponse>) PutWatsonxRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Create a Watsonx inference endpoint.
	 * <p>
	 * Create an inference endpoint to perform an inference task with the
	 * <code>watsonxai</code> service. You need an IBM Cloud Databases for
	 * Elasticsearch deployment to use the <code>watsonxai</code> inference service.
	 * You can provision one through the IBM catalog, the Cloud Databases CLI
	 * plug-in, the Cloud Databases API, or Terraform.
	 * <p>
	 * When you create an inference endpoint, the associated machine learning model
	 * is automatically deployed if it is not already running. After creating the
	 * endpoint, wait for the model deployment to complete before using it. To
	 * verify the deployment status, use the get trained model statistics API. Look
	 * for <code>&quot;state&quot;: &quot;fully_allocated&quot;</code> in the
	 * response and ensure that the <code>&quot;allocation_count&quot;</code>
	 * matches the <code>&quot;target_allocation_count&quot;</code>. Avoid creating
	 * multiple endpoints for the same model unless required, as each endpoint
	 * consumes significant resources.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutWatsonxRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-inference-put-watsonx">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutWatsonxResponse> putWatsonx(
			Function<PutWatsonxRequest.Builder, ObjectBuilder<PutWatsonxRequest>> fn) {
		return putWatsonx(fn.apply(new PutWatsonxRequest.Builder()).build());
	}

	// ----- Endpoint: inference.rerank

	/**
	 * Perform rereanking inference on the service
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-inference-inference">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<RerankResponse> rerank(RerankRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<RerankRequest, RerankResponse, ErrorResponse> endpoint = (JsonEndpoint<RerankRequest, RerankResponse, ErrorResponse>) RerankRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Perform rereanking inference on the service
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link RerankRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-inference-inference">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<RerankResponse> rerank(
			Function<RerankRequest.Builder, ObjectBuilder<RerankRequest>> fn) {
		return rerank(fn.apply(new RerankRequest.Builder()).build());
	}

	// ----- Endpoint: inference.sparse_embedding

	/**
	 * Perform sparse embedding inference on the service
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-inference-inference">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SparseEmbeddingResponse> sparseEmbedding(SparseEmbeddingRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SparseEmbeddingRequest, SparseEmbeddingResponse, ErrorResponse> endpoint = (JsonEndpoint<SparseEmbeddingRequest, SparseEmbeddingResponse, ErrorResponse>) SparseEmbeddingRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Perform sparse embedding inference on the service
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SparseEmbeddingRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-inference-inference">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<SparseEmbeddingResponse> sparseEmbedding(
			Function<SparseEmbeddingRequest.Builder, ObjectBuilder<SparseEmbeddingRequest>> fn) {
		return sparseEmbedding(fn.apply(new SparseEmbeddingRequest.Builder()).build());
	}

	// ----- Endpoint: inference.stream_completion

	/**
	 * Perform streaming inference. Get real-time responses for completion tasks by
	 * delivering answers incrementally, reducing response times during computation.
	 * This API works only with the completion task type.
	 * <p>
	 * IMPORTANT: The inference APIs enable you to use certain services, such as
	 * built-in machine learning models (ELSER, E5), models uploaded through Eland,
	 * Cohere, OpenAI, Azure, Google AI Studio, Google Vertex AI, Anthropic,
	 * Watsonx.ai, or Hugging Face. For built-in models and models uploaded through
	 * Eland, the inference APIs offer an alternative way to use and manage trained
	 * models. However, if you do not plan to use the inference APIs to use these
	 * models or if you want to use non-NLP models, use the machine learning trained
	 * model APIs.
	 * <p>
	 * This API requires the <code>monitor_inference</code> cluster privilege (the
	 * built-in <code>inference_admin</code> and <code>inference_user</code> roles
	 * grant this privilege). You must use a client that supports streaming.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-inference-stream-inference">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<BinaryResponse> streamCompletion(StreamCompletionRequest request) {
		@SuppressWarnings("unchecked")
		Endpoint<StreamCompletionRequest, BinaryResponse, ErrorResponse> endpoint = (Endpoint<StreamCompletionRequest, BinaryResponse, ErrorResponse>) StreamCompletionRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Perform streaming inference. Get real-time responses for completion tasks by
	 * delivering answers incrementally, reducing response times during computation.
	 * This API works only with the completion task type.
	 * <p>
	 * IMPORTANT: The inference APIs enable you to use certain services, such as
	 * built-in machine learning models (ELSER, E5), models uploaded through Eland,
	 * Cohere, OpenAI, Azure, Google AI Studio, Google Vertex AI, Anthropic,
	 * Watsonx.ai, or Hugging Face. For built-in models and models uploaded through
	 * Eland, the inference APIs offer an alternative way to use and manage trained
	 * models. However, if you do not plan to use the inference APIs to use these
	 * models or if you want to use non-NLP models, use the machine learning trained
	 * model APIs.
	 * <p>
	 * This API requires the <code>monitor_inference</code> cluster privilege (the
	 * built-in <code>inference_admin</code> and <code>inference_user</code> roles
	 * grant this privilege). You must use a client that supports streaming.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link StreamCompletionRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-inference-stream-inference">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<BinaryResponse> streamCompletion(
			Function<StreamCompletionRequest.Builder, ObjectBuilder<StreamCompletionRequest>> fn) {
		return streamCompletion(fn.apply(new StreamCompletionRequest.Builder()).build());
	}

	// ----- Endpoint: inference.text_embedding

	/**
	 * Perform text embedding inference on the service
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-inference-inference">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<TextEmbeddingResponse> textEmbedding(TextEmbeddingRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<TextEmbeddingRequest, TextEmbeddingResponse, ErrorResponse> endpoint = (JsonEndpoint<TextEmbeddingRequest, TextEmbeddingResponse, ErrorResponse>) TextEmbeddingRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Perform text embedding inference on the service
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link TextEmbeddingRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-inference-inference">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<TextEmbeddingResponse> textEmbedding(
			Function<TextEmbeddingRequest.Builder, ObjectBuilder<TextEmbeddingRequest>> fn) {
		return textEmbedding(fn.apply(new TextEmbeddingRequest.Builder()).build());
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

	public CompletableFuture<UpdateInferenceResponse> update(UpdateInferenceRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdateInferenceRequest, UpdateInferenceResponse, ErrorResponse> endpoint = (JsonEndpoint<UpdateInferenceRequest, UpdateInferenceResponse, ErrorResponse>) UpdateInferenceRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
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

	public final CompletableFuture<UpdateInferenceResponse> update(
			Function<UpdateInferenceRequest.Builder, ObjectBuilder<UpdateInferenceRequest>> fn) {
		return update(fn.apply(new UpdateInferenceRequest.Builder()).build());
	}

}
