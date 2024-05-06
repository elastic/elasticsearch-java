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

	// ----- Endpoint: inference.delete_model

	/**
	 * Delete model in the Inference API
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/delete-inference-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteModelResponse deleteModel(DeleteModelRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteModelRequest, DeleteModelResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteModelRequest, DeleteModelResponse, ErrorResponse>) DeleteModelRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete model in the Inference API
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteModelRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/delete-inference-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteModelResponse deleteModel(
			Function<DeleteModelRequest.Builder, ObjectBuilder<DeleteModelRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteModel(fn.apply(new DeleteModelRequest.Builder()).build());
	}

	// ----- Endpoint: inference.get_model

	/**
	 * Get a model in the Inference API
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-inference-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetModelResponse getModel(GetModelRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetModelRequest, GetModelResponse, ErrorResponse> endpoint = (JsonEndpoint<GetModelRequest, GetModelResponse, ErrorResponse>) GetModelRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get a model in the Inference API
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetModelRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-inference-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetModelResponse getModel(Function<GetModelRequest.Builder, ObjectBuilder<GetModelRequest>> fn)
			throws IOException, ElasticsearchException {
		return getModel(fn.apply(new GetModelRequest.Builder()).build());
	}

	/**
	 * Get a model in the Inference API
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-inference-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetModelResponse getModel() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetModelRequest.Builder().build(), GetModelRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: inference.inference

	/**
	 * Perform inference on a model
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/post-inference-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public InferenceResponse inference(InferenceRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<InferenceRequest, InferenceResponse, ErrorResponse> endpoint = (JsonEndpoint<InferenceRequest, InferenceResponse, ErrorResponse>) InferenceRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Perform inference on a model
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link InferenceRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/post-inference-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final InferenceResponse inference(Function<InferenceRequest.Builder, ObjectBuilder<InferenceRequest>> fn)
			throws IOException, ElasticsearchException {
		return inference(fn.apply(new InferenceRequest.Builder()).build());
	}

	// ----- Endpoint: inference.put_model

	/**
	 * Configure a model for use in the Inference API
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/put-inference-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutModelResponse putModel(PutModelRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutModelRequest, PutModelResponse, ErrorResponse> endpoint = (JsonEndpoint<PutModelRequest, PutModelResponse, ErrorResponse>) PutModelRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Configure a model for use in the Inference API
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutModelRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/put-inference-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutModelResponse putModel(Function<PutModelRequest.Builder, ObjectBuilder<PutModelRequest>> fn)
			throws IOException, ElasticsearchException {
		return putModel(fn.apply(new PutModelRequest.Builder()).build());
	}

}
