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
import co.elastic.clients.transport.endpoints.BinaryResponse;
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

	// ----- Endpoint: inference.chat_completion_unified

	/**
	 * Perform chat completion inference
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/chat-completion-inference-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public BinaryResponse chatCompletionUnified(ChatCompletionUnifiedRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<ChatCompletionUnifiedRequest, BinaryResponse, ErrorResponse> endpoint = (Endpoint<ChatCompletionUnifiedRequest, BinaryResponse, ErrorResponse>) ChatCompletionUnifiedRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Perform chat completion inference
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ChatCompletionUnifiedRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/chat-completion-inference-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final BinaryResponse chatCompletionUnified(
			Function<ChatCompletionUnifiedRequest.Builder, ObjectBuilder<ChatCompletionUnifiedRequest>> fn)
			throws IOException, ElasticsearchException {
		return chatCompletionUnified(fn.apply(new ChatCompletionUnifiedRequest.Builder()).build());
	}

	// ----- Endpoint: inference.completion

	/**
	 * Perform completion inference on the service
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/post-inference-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletionResponse completion(CompletionRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<CompletionRequest, CompletionResponse, ErrorResponse> endpoint = (JsonEndpoint<CompletionRequest, CompletionResponse, ErrorResponse>) CompletionRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Perform completion inference on the service
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CompletionRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/post-inference-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletionResponse completion(Function<CompletionRequest.Builder, ObjectBuilder<CompletionRequest>> fn)
			throws IOException, ElasticsearchException {
		return completion(fn.apply(new CompletionRequest.Builder()).build());
	}

	// ----- Endpoint: inference.delete

	/**
	 * Delete an inference endpoint
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/delete-inference-api.html">Documentation
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/delete-inference-api.html">Documentation
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/get-inference-api.html">Documentation
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/get-inference-api.html">Documentation
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/get-inference-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetInferenceResponse get() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetInferenceRequest.Builder().build(), GetInferenceRequest._ENDPOINT,
				this.transportOptions);
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/put-inference-api.html">Documentation
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/put-inference-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutResponse put(Function<PutRequest.Builder, ObjectBuilder<PutRequest>> fn)
			throws IOException, ElasticsearchException {
		return put(fn.apply(new PutRequest.Builder()).build());
	}

	// ----- Endpoint: inference.put_alibabacloud

	/**
	 * Create an AlibabaCloud AI Search inference endpoint.
	 * <p>
	 * Create an inference endpoint to perform an inference task with the
	 * <code>alibabacloud-ai-search</code> service.
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/infer-service-alibabacloud-ai-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutAlibabacloudResponse putAlibabacloud(PutAlibabacloudRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutAlibabacloudRequest, PutAlibabacloudResponse, ErrorResponse> endpoint = (JsonEndpoint<PutAlibabacloudRequest, PutAlibabacloudResponse, ErrorResponse>) PutAlibabacloudRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Create an AlibabaCloud AI Search inference endpoint.
	 * <p>
	 * Create an inference endpoint to perform an inference task with the
	 * <code>alibabacloud-ai-search</code> service.
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
	 *            {@link PutAlibabacloudRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/infer-service-alibabacloud-ai-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutAlibabacloudResponse putAlibabacloud(
			Function<PutAlibabacloudRequest.Builder, ObjectBuilder<PutAlibabacloudRequest>> fn)
			throws IOException, ElasticsearchException {
		return putAlibabacloud(fn.apply(new PutAlibabacloudRequest.Builder()).build());
	}

	// ----- Endpoint: inference.put_amazonbedrock

	/**
	 * Create an Amazon Bedrock inference endpoint.
	 * <p>
	 * Creates an inference endpoint to perform an inference task with the
	 * <code>amazonbedrock</code> service. <blockquote>
	 * <p>
	 * info You need to provide the access and secret keys only once, during the
	 * inference model creation. The get inference API does not retrieve your access
	 * or secret keys. After creating the inference model, you cannot change the
	 * associated key pairs. If you want to use a different access and secret key
	 * pair, delete the inference model and recreate it with the same name and the
	 * updated keys.
	 * </p>
	 * </blockquote>
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/infer-service-amazon-bedrock.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutAmazonbedrockResponse putAmazonbedrock(PutAmazonbedrockRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutAmazonbedrockRequest, PutAmazonbedrockResponse, ErrorResponse> endpoint = (JsonEndpoint<PutAmazonbedrockRequest, PutAmazonbedrockResponse, ErrorResponse>) PutAmazonbedrockRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Create an Amazon Bedrock inference endpoint.
	 * <p>
	 * Creates an inference endpoint to perform an inference task with the
	 * <code>amazonbedrock</code> service. <blockquote>
	 * <p>
	 * info You need to provide the access and secret keys only once, during the
	 * inference model creation. The get inference API does not retrieve your access
	 * or secret keys. After creating the inference model, you cannot change the
	 * associated key pairs. If you want to use a different access and secret key
	 * pair, delete the inference model and recreate it with the same name and the
	 * updated keys.
	 * </p>
	 * </blockquote>
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
	 *            {@link PutAmazonbedrockRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/infer-service-amazon-bedrock.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutAmazonbedrockResponse putAmazonbedrock(
			Function<PutAmazonbedrockRequest.Builder, ObjectBuilder<PutAmazonbedrockRequest>> fn)
			throws IOException, ElasticsearchException {
		return putAmazonbedrock(fn.apply(new PutAmazonbedrockRequest.Builder()).build());
	}

	// ----- Endpoint: inference.put_anthropic

	/**
	 * Create an Anthropic inference endpoint.
	 * <p>
	 * Create an inference endpoint to perform an inference task with the
	 * <code>anthropic</code> service.
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/infer-service-anthropic.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutAnthropicResponse putAnthropic(PutAnthropicRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutAnthropicRequest, PutAnthropicResponse, ErrorResponse> endpoint = (JsonEndpoint<PutAnthropicRequest, PutAnthropicResponse, ErrorResponse>) PutAnthropicRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Create an Anthropic inference endpoint.
	 * <p>
	 * Create an inference endpoint to perform an inference task with the
	 * <code>anthropic</code> service.
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
	 *            {@link PutAnthropicRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/infer-service-anthropic.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutAnthropicResponse putAnthropic(
			Function<PutAnthropicRequest.Builder, ObjectBuilder<PutAnthropicRequest>> fn)
			throws IOException, ElasticsearchException {
		return putAnthropic(fn.apply(new PutAnthropicRequest.Builder()).build());
	}

	// ----- Endpoint: inference.put_azureaistudio

	/**
	 * Create an Azure AI studio inference endpoint.
	 * <p>
	 * Create an inference endpoint to perform an inference task with the
	 * <code>azureaistudio</code> service.
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/infer-service-azure-ai-studio.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutAzureaistudioResponse putAzureaistudio(PutAzureaistudioRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutAzureaistudioRequest, PutAzureaistudioResponse, ErrorResponse> endpoint = (JsonEndpoint<PutAzureaistudioRequest, PutAzureaistudioResponse, ErrorResponse>) PutAzureaistudioRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Create an Azure AI studio inference endpoint.
	 * <p>
	 * Create an inference endpoint to perform an inference task with the
	 * <code>azureaistudio</code> service.
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
	 *            {@link PutAzureaistudioRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/infer-service-azure-ai-studio.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutAzureaistudioResponse putAzureaistudio(
			Function<PutAzureaistudioRequest.Builder, ObjectBuilder<PutAzureaistudioRequest>> fn)
			throws IOException, ElasticsearchException {
		return putAzureaistudio(fn.apply(new PutAzureaistudioRequest.Builder()).build());
	}

	// ----- Endpoint: inference.put_azureopenai

	/**
	 * Create an Azure OpenAI inference endpoint.
	 * <p>
	 * Create an inference endpoint to perform an inference task with the
	 * <code>azureopenai</code> service.
	 * <p>
	 * The list of chat completion models that you can choose from in your Azure
	 * OpenAI deployment include:
	 * <ul>
	 * <li><a href=
	 * "https://learn.microsoft.com/en-us/azure/ai-services/openai/concepts/models?tabs=global-standard%2Cstandard-chat-completions#gpt-4-and-gpt-4-turbo-models">GPT-4
	 * and GPT-4 Turbo models</a></li>
	 * <li><a href=
	 * "https://learn.microsoft.com/en-us/azure/ai-services/openai/concepts/models?tabs=global-standard%2Cstandard-chat-completions#gpt-35">GPT-3.5</a></li>
	 * </ul>
	 * <p>
	 * The list of embeddings models that you can choose from in your deployment can
	 * be found in the <a href=
	 * "https://learn.microsoft.com/en-us/azure/ai-services/openai/concepts/models?tabs=global-standard%2Cstandard-chat-completions#embeddings">Azure
	 * models documentation</a>.
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/infer-service-azure-openai.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutAzureopenaiResponse putAzureopenai(PutAzureopenaiRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutAzureopenaiRequest, PutAzureopenaiResponse, ErrorResponse> endpoint = (JsonEndpoint<PutAzureopenaiRequest, PutAzureopenaiResponse, ErrorResponse>) PutAzureopenaiRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Create an Azure OpenAI inference endpoint.
	 * <p>
	 * Create an inference endpoint to perform an inference task with the
	 * <code>azureopenai</code> service.
	 * <p>
	 * The list of chat completion models that you can choose from in your Azure
	 * OpenAI deployment include:
	 * <ul>
	 * <li><a href=
	 * "https://learn.microsoft.com/en-us/azure/ai-services/openai/concepts/models?tabs=global-standard%2Cstandard-chat-completions#gpt-4-and-gpt-4-turbo-models">GPT-4
	 * and GPT-4 Turbo models</a></li>
	 * <li><a href=
	 * "https://learn.microsoft.com/en-us/azure/ai-services/openai/concepts/models?tabs=global-standard%2Cstandard-chat-completions#gpt-35">GPT-3.5</a></li>
	 * </ul>
	 * <p>
	 * The list of embeddings models that you can choose from in your deployment can
	 * be found in the <a href=
	 * "https://learn.microsoft.com/en-us/azure/ai-services/openai/concepts/models?tabs=global-standard%2Cstandard-chat-completions#embeddings">Azure
	 * models documentation</a>.
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
	 *            {@link PutAzureopenaiRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/infer-service-azure-openai.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutAzureopenaiResponse putAzureopenai(
			Function<PutAzureopenaiRequest.Builder, ObjectBuilder<PutAzureopenaiRequest>> fn)
			throws IOException, ElasticsearchException {
		return putAzureopenai(fn.apply(new PutAzureopenaiRequest.Builder()).build());
	}

	// ----- Endpoint: inference.put_cohere

	/**
	 * Create a Cohere inference endpoint.
	 * <p>
	 * Create an inference endpoint to perform an inference task with the
	 * <code>cohere</code> service.
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/infer-service-cohere.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutCohereResponse putCohere(PutCohereRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutCohereRequest, PutCohereResponse, ErrorResponse> endpoint = (JsonEndpoint<PutCohereRequest, PutCohereResponse, ErrorResponse>) PutCohereRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Create a Cohere inference endpoint.
	 * <p>
	 * Create an inference endpoint to perform an inference task with the
	 * <code>cohere</code> service.
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
	 *            {@link PutCohereRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/infer-service-cohere.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutCohereResponse putCohere(Function<PutCohereRequest.Builder, ObjectBuilder<PutCohereRequest>> fn)
			throws IOException, ElasticsearchException {
		return putCohere(fn.apply(new PutCohereRequest.Builder()).build());
	}

	// ----- Endpoint: inference.put_elasticsearch

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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/infer-service-elasticsearch.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutElasticsearchResponse putElasticsearch(PutElasticsearchRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutElasticsearchRequest, PutElasticsearchResponse, ErrorResponse> endpoint = (JsonEndpoint<PutElasticsearchRequest, PutElasticsearchResponse, ErrorResponse>) PutElasticsearchRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

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
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutElasticsearchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/infer-service-elasticsearch.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutElasticsearchResponse putElasticsearch(
			Function<PutElasticsearchRequest.Builder, ObjectBuilder<PutElasticsearchRequest>> fn)
			throws IOException, ElasticsearchException {
		return putElasticsearch(fn.apply(new PutElasticsearchRequest.Builder()).build());
	}

	// ----- Endpoint: inference.put_elser

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
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/infer-service-elser.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutElserResponse putElser(PutElserRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutElserRequest, PutElserResponse, ErrorResponse> endpoint = (JsonEndpoint<PutElserRequest, PutElserResponse, ErrorResponse>) PutElserRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

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
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutElserRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/infer-service-elser.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutElserResponse putElser(Function<PutElserRequest.Builder, ObjectBuilder<PutElserRequest>> fn)
			throws IOException, ElasticsearchException {
		return putElser(fn.apply(new PutElserRequest.Builder()).build());
	}

	// ----- Endpoint: inference.put_googleaistudio

	/**
	 * Create an Google AI Studio inference endpoint.
	 * <p>
	 * Create an inference endpoint to perform an inference task with the
	 * <code>googleaistudio</code> service.
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/infer-service-google-ai-studio.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutGoogleaistudioResponse putGoogleaistudio(PutGoogleaistudioRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutGoogleaistudioRequest, PutGoogleaistudioResponse, ErrorResponse> endpoint = (JsonEndpoint<PutGoogleaistudioRequest, PutGoogleaistudioResponse, ErrorResponse>) PutGoogleaistudioRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Create an Google AI Studio inference endpoint.
	 * <p>
	 * Create an inference endpoint to perform an inference task with the
	 * <code>googleaistudio</code> service.
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
	 *            {@link PutGoogleaistudioRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/infer-service-google-ai-studio.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutGoogleaistudioResponse putGoogleaistudio(
			Function<PutGoogleaistudioRequest.Builder, ObjectBuilder<PutGoogleaistudioRequest>> fn)
			throws IOException, ElasticsearchException {
		return putGoogleaistudio(fn.apply(new PutGoogleaistudioRequest.Builder()).build());
	}

	// ----- Endpoint: inference.put_googlevertexai

	/**
	 * Create a Google Vertex AI inference endpoint.
	 * <p>
	 * Create an inference endpoint to perform an inference task with the
	 * <code>googlevertexai</code> service.
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/infer-service-google-vertex-ai.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutGooglevertexaiResponse putGooglevertexai(PutGooglevertexaiRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutGooglevertexaiRequest, PutGooglevertexaiResponse, ErrorResponse> endpoint = (JsonEndpoint<PutGooglevertexaiRequest, PutGooglevertexaiResponse, ErrorResponse>) PutGooglevertexaiRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Create a Google Vertex AI inference endpoint.
	 * <p>
	 * Create an inference endpoint to perform an inference task with the
	 * <code>googlevertexai</code> service.
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
	 *            {@link PutGooglevertexaiRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/infer-service-google-vertex-ai.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutGooglevertexaiResponse putGooglevertexai(
			Function<PutGooglevertexaiRequest.Builder, ObjectBuilder<PutGooglevertexaiRequest>> fn)
			throws IOException, ElasticsearchException {
		return putGooglevertexai(fn.apply(new PutGooglevertexaiRequest.Builder()).build());
	}

	// ----- Endpoint: inference.put_hugging_face

	/**
	 * Create a Hugging Face inference endpoint.
	 * <p>
	 * Create an inference endpoint to perform an inference task with the
	 * <code>hugging_face</code> service.
	 * <p>
	 * You must first create an inference endpoint on the Hugging Face endpoint page
	 * to get an endpoint URL. Select the model you want to use on the new endpoint
	 * creation page (for example <code>intfloat/e5-small-v2</code>), then select
	 * the sentence embeddings task under the advanced configuration section. Create
	 * the endpoint and copy the URL after the endpoint initialization has been
	 * finished.
	 * <p>
	 * The following models are recommended for the Hugging Face service:
	 * <ul>
	 * <li><code>all-MiniLM-L6-v2</code></li>
	 * <li><code>all-MiniLM-L12-v2</code></li>
	 * <li><code>all-mpnet-base-v2</code></li>
	 * <li><code>e5-base-v2</code></li>
	 * <li><code>e5-small-v2</code></li>
	 * <li><code>multilingual-e5-base</code></li>
	 * <li><code>multilingual-e5-small</code></li>
	 * </ul>
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/infer-service-hugging-face.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutHuggingFaceResponse putHuggingFace(PutHuggingFaceRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutHuggingFaceRequest, PutHuggingFaceResponse, ErrorResponse> endpoint = (JsonEndpoint<PutHuggingFaceRequest, PutHuggingFaceResponse, ErrorResponse>) PutHuggingFaceRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Create a Hugging Face inference endpoint.
	 * <p>
	 * Create an inference endpoint to perform an inference task with the
	 * <code>hugging_face</code> service.
	 * <p>
	 * You must first create an inference endpoint on the Hugging Face endpoint page
	 * to get an endpoint URL. Select the model you want to use on the new endpoint
	 * creation page (for example <code>intfloat/e5-small-v2</code>), then select
	 * the sentence embeddings task under the advanced configuration section. Create
	 * the endpoint and copy the URL after the endpoint initialization has been
	 * finished.
	 * <p>
	 * The following models are recommended for the Hugging Face service:
	 * <ul>
	 * <li><code>all-MiniLM-L6-v2</code></li>
	 * <li><code>all-MiniLM-L12-v2</code></li>
	 * <li><code>all-mpnet-base-v2</code></li>
	 * <li><code>e5-base-v2</code></li>
	 * <li><code>e5-small-v2</code></li>
	 * <li><code>multilingual-e5-base</code></li>
	 * <li><code>multilingual-e5-small</code></li>
	 * </ul>
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
	 *            {@link PutHuggingFaceRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/infer-service-hugging-face.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutHuggingFaceResponse putHuggingFace(
			Function<PutHuggingFaceRequest.Builder, ObjectBuilder<PutHuggingFaceRequest>> fn)
			throws IOException, ElasticsearchException {
		return putHuggingFace(fn.apply(new PutHuggingFaceRequest.Builder()).build());
	}

	// ----- Endpoint: inference.put_jinaai

	/**
	 * Create an JinaAI inference endpoint.
	 * <p>
	 * Create an inference endpoint to perform an inference task with the
	 * <code>jinaai</code> service.
	 * <p>
	 * To review the available <code>rerank</code> models, refer to
	 * <a href="https://jina.ai/reranker">https://jina.ai/reranker</a>. To review
	 * the available <code>text_embedding</code> models, refer to the
	 * <a href="https://jina.ai/embeddings/">https://jina.ai/embeddings/</a>.
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/infer-service-jinaai.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutJinaaiResponse putJinaai(PutJinaaiRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutJinaaiRequest, PutJinaaiResponse, ErrorResponse> endpoint = (JsonEndpoint<PutJinaaiRequest, PutJinaaiResponse, ErrorResponse>) PutJinaaiRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Create an JinaAI inference endpoint.
	 * <p>
	 * Create an inference endpoint to perform an inference task with the
	 * <code>jinaai</code> service.
	 * <p>
	 * To review the available <code>rerank</code> models, refer to
	 * <a href="https://jina.ai/reranker">https://jina.ai/reranker</a>. To review
	 * the available <code>text_embedding</code> models, refer to the
	 * <a href="https://jina.ai/embeddings/">https://jina.ai/embeddings/</a>.
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
	 *            {@link PutJinaaiRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/infer-service-jinaai.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutJinaaiResponse putJinaai(Function<PutJinaaiRequest.Builder, ObjectBuilder<PutJinaaiRequest>> fn)
			throws IOException, ElasticsearchException {
		return putJinaai(fn.apply(new PutJinaaiRequest.Builder()).build());
	}

	// ----- Endpoint: inference.put_mistral

	/**
	 * Create a Mistral inference endpoint.
	 * <p>
	 * Creates an inference endpoint to perform an inference task with the
	 * <code>mistral</code> service.
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/{brnach}/infer-service-mistral.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutMistralResponse putMistral(PutMistralRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutMistralRequest, PutMistralResponse, ErrorResponse> endpoint = (JsonEndpoint<PutMistralRequest, PutMistralResponse, ErrorResponse>) PutMistralRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Create a Mistral inference endpoint.
	 * <p>
	 * Creates an inference endpoint to perform an inference task with the
	 * <code>mistral</code> service.
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
	 *            {@link PutMistralRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/{brnach}/infer-service-mistral.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutMistralResponse putMistral(Function<PutMistralRequest.Builder, ObjectBuilder<PutMistralRequest>> fn)
			throws IOException, ElasticsearchException {
		return putMistral(fn.apply(new PutMistralRequest.Builder()).build());
	}

	// ----- Endpoint: inference.put_openai

	/**
	 * Create an OpenAI inference endpoint.
	 * <p>
	 * Create an inference endpoint to perform an inference task with the
	 * <code>openai</code> service or <code>openai</code> compatible APIs.
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/infer-service-openai.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutOpenaiResponse putOpenai(PutOpenaiRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutOpenaiRequest, PutOpenaiResponse, ErrorResponse> endpoint = (JsonEndpoint<PutOpenaiRequest, PutOpenaiResponse, ErrorResponse>) PutOpenaiRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Create an OpenAI inference endpoint.
	 * <p>
	 * Create an inference endpoint to perform an inference task with the
	 * <code>openai</code> service or <code>openai</code> compatible APIs.
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/infer-service-openai.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutOpenaiResponse putOpenai(Function<PutOpenaiRequest.Builder, ObjectBuilder<PutOpenaiRequest>> fn)
			throws IOException, ElasticsearchException {
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/infer-service-voyageai.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutVoyageaiResponse putVoyageai(PutVoyageaiRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutVoyageaiRequest, PutVoyageaiResponse, ErrorResponse> endpoint = (JsonEndpoint<PutVoyageaiRequest, PutVoyageaiResponse, ErrorResponse>) PutVoyageaiRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/infer-service-voyageai.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutVoyageaiResponse putVoyageai(
			Function<PutVoyageaiRequest.Builder, ObjectBuilder<PutVoyageaiRequest>> fn)
			throws IOException, ElasticsearchException {
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/infer-service-watsonx-ai.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutWatsonxResponse putWatsonx(PutWatsonxRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutWatsonxRequest, PutWatsonxResponse, ErrorResponse> endpoint = (JsonEndpoint<PutWatsonxRequest, PutWatsonxResponse, ErrorResponse>) PutWatsonxRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/infer-service-watsonx-ai.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutWatsonxResponse putWatsonx(Function<PutWatsonxRequest.Builder, ObjectBuilder<PutWatsonxRequest>> fn)
			throws IOException, ElasticsearchException {
		return putWatsonx(fn.apply(new PutWatsonxRequest.Builder()).build());
	}

	// ----- Endpoint: inference.rerank

	/**
	 * Perform rereanking inference on the service
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/post-inference-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public RerankResponse rerank(RerankRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<RerankRequest, RerankResponse, ErrorResponse> endpoint = (JsonEndpoint<RerankRequest, RerankResponse, ErrorResponse>) RerankRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Perform rereanking inference on the service
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link RerankRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/post-inference-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final RerankResponse rerank(Function<RerankRequest.Builder, ObjectBuilder<RerankRequest>> fn)
			throws IOException, ElasticsearchException {
		return rerank(fn.apply(new RerankRequest.Builder()).build());
	}

	// ----- Endpoint: inference.sparse_embedding

	/**
	 * Perform sparse embedding inference on the service
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/post-inference-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public SparseEmbeddingResponse sparseEmbedding(SparseEmbeddingRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SparseEmbeddingRequest, SparseEmbeddingResponse, ErrorResponse> endpoint = (JsonEndpoint<SparseEmbeddingRequest, SparseEmbeddingResponse, ErrorResponse>) SparseEmbeddingRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Perform sparse embedding inference on the service
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SparseEmbeddingRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/post-inference-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final SparseEmbeddingResponse sparseEmbedding(
			Function<SparseEmbeddingRequest.Builder, ObjectBuilder<SparseEmbeddingRequest>> fn)
			throws IOException, ElasticsearchException {
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/stream-inference-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public BinaryResponse streamCompletion(StreamCompletionRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<StreamCompletionRequest, BinaryResponse, ErrorResponse> endpoint = (Endpoint<StreamCompletionRequest, BinaryResponse, ErrorResponse>) StreamCompletionRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/stream-inference-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final BinaryResponse streamCompletion(
			Function<StreamCompletionRequest.Builder, ObjectBuilder<StreamCompletionRequest>> fn)
			throws IOException, ElasticsearchException {
		return streamCompletion(fn.apply(new StreamCompletionRequest.Builder()).build());
	}

	// ----- Endpoint: inference.text_embedding

	/**
	 * Perform text embedding inference on the service
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/post-inference-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public TextEmbeddingResponse textEmbedding(TextEmbeddingRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<TextEmbeddingRequest, TextEmbeddingResponse, ErrorResponse> endpoint = (JsonEndpoint<TextEmbeddingRequest, TextEmbeddingResponse, ErrorResponse>) TextEmbeddingRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Perform text embedding inference on the service
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link TextEmbeddingRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/post-inference-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final TextEmbeddingResponse textEmbedding(
			Function<TextEmbeddingRequest.Builder, ObjectBuilder<TextEmbeddingRequest>> fn)
			throws IOException, ElasticsearchException {
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/update-inference-api.html">Documentation
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.18/update-inference-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final UpdateInferenceResponse update(
			Function<UpdateInferenceRequest.Builder, ObjectBuilder<UpdateInferenceRequest>> fn)
			throws IOException, ElasticsearchException {
		return update(fn.apply(new UpdateInferenceRequest.Builder()).build());
	}

}
