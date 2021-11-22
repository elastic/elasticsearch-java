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

package co.elastic.clients.elasticsearch.transform;

import co.elastic.clients.ApiClient;
import co.elastic.clients.elasticsearch._types.ElasticsearchException;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.transport.endpoints.EndpointWithResponseMapperAttr;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import javax.annotation.Nullable;

/**
 * Client for the transform namespace.
 */
public class ElasticsearchTransformAsyncClient
		extends
			ApiClient<ElasticsearchTransport, ElasticsearchTransformAsyncClient> {

	public ElasticsearchTransformAsyncClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchTransformAsyncClient(ElasticsearchTransport transport,
			@Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchTransformAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchTransformAsyncClient(this.transport, transportOptions);
	}

	// ----- Endpoint: transform.delete_transform

	/**
	 * Deletes an existing transform.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/delete-transform.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteTransformResponse> deleteTransform(DeleteTransformRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<DeleteTransformRequest, DeleteTransformResponse, ErrorResponse> endpoint = (Endpoint<DeleteTransformRequest, DeleteTransformResponse, ErrorResponse>) DeleteTransformRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Deletes an existing transform.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteTransformRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/delete-transform.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteTransformResponse> deleteTransform(Consumer<DeleteTransformRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		DeleteTransformRequest.Builder builder = new DeleteTransformRequest.Builder();
		fn.accept(builder);
		return deleteTransform(builder.build());
	}

	// ----- Endpoint: transform.get_transform

	/**
	 * Retrieves configuration information for transforms.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-transform.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetTransformResponse> getTransform(GetTransformRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<GetTransformRequest, GetTransformResponse, ErrorResponse> endpoint = (Endpoint<GetTransformRequest, GetTransformResponse, ErrorResponse>) GetTransformRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Retrieves configuration information for transforms.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetTransformRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-transform.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetTransformResponse> getTransform(Consumer<GetTransformRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		GetTransformRequest.Builder builder = new GetTransformRequest.Builder();
		fn.accept(builder);
		return getTransform(builder.build());
	}

	/**
	 * Retrieves configuration information for transforms.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-transform.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetTransformResponse> getTransform() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new GetTransformRequest.Builder().build(),
				GetTransformRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: transform.get_transform_stats

	/**
	 * Retrieves usage information for transforms.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-transform-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetTransformStatsResponse> getTransformStats(GetTransformStatsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<GetTransformStatsRequest, GetTransformStatsResponse, ErrorResponse> endpoint = (Endpoint<GetTransformStatsRequest, GetTransformStatsResponse, ErrorResponse>) GetTransformStatsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Retrieves usage information for transforms.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetTransformStatsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-transform-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetTransformStatsResponse> getTransformStats(
			Consumer<GetTransformStatsRequest.Builder> fn) throws IOException, ElasticsearchException {
		GetTransformStatsRequest.Builder builder = new GetTransformStatsRequest.Builder();
		fn.accept(builder);
		return getTransformStats(builder.build());
	}

	// ----- Endpoint: transform.preview_transform

	/**
	 * Previews a transform.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/preview-transform.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TTransform> CompletableFuture<PreviewTransformResponse<TTransform>> previewTransform(
			PreviewTransformRequest request, Class<TTransform> tTransformClass)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<PreviewTransformRequest, PreviewTransformResponse<TTransform>, ErrorResponse> endpoint = (Endpoint<PreviewTransformRequest, PreviewTransformResponse<TTransform>, ErrorResponse>) PreviewTransformRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:transform.preview_transform.TTransform",
				getDeserializer(tTransformClass));

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Previews a transform.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PreviewTransformRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/preview-transform.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TTransform> CompletableFuture<PreviewTransformResponse<TTransform>> previewTransform(
			Consumer<PreviewTransformRequest.Builder> fn, Class<TTransform> tTransformClass)
			throws IOException, ElasticsearchException {
		PreviewTransformRequest.Builder builder = new PreviewTransformRequest.Builder();
		fn.accept(builder);
		return previewTransform(builder.build(), tTransformClass);
	}

	// ----- Endpoint: transform.put_transform

	/**
	 * Instantiates a transform.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/put-transform.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutTransformResponse> putTransform(PutTransformRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<PutTransformRequest, PutTransformResponse, ErrorResponse> endpoint = (Endpoint<PutTransformRequest, PutTransformResponse, ErrorResponse>) PutTransformRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Instantiates a transform.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutTransformRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/put-transform.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutTransformResponse> putTransform(Consumer<PutTransformRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		PutTransformRequest.Builder builder = new PutTransformRequest.Builder();
		fn.accept(builder);
		return putTransform(builder.build());
	}

	// ----- Endpoint: transform.start_transform

	/**
	 * Starts one or more transforms.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/start-transform.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<StartTransformResponse> startTransform(StartTransformRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<StartTransformRequest, StartTransformResponse, ErrorResponse> endpoint = (Endpoint<StartTransformRequest, StartTransformResponse, ErrorResponse>) StartTransformRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Starts one or more transforms.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link StartTransformRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/start-transform.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<StartTransformResponse> startTransform(Consumer<StartTransformRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		StartTransformRequest.Builder builder = new StartTransformRequest.Builder();
		fn.accept(builder);
		return startTransform(builder.build());
	}

	// ----- Endpoint: transform.stop_transform

	/**
	 * Stops one or more transforms.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/stop-transform.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<StopTransformResponse> stopTransform(StopTransformRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<StopTransformRequest, StopTransformResponse, ErrorResponse> endpoint = (Endpoint<StopTransformRequest, StopTransformResponse, ErrorResponse>) StopTransformRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Stops one or more transforms.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link StopTransformRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/stop-transform.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<StopTransformResponse> stopTransform(Consumer<StopTransformRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		StopTransformRequest.Builder builder = new StopTransformRequest.Builder();
		fn.accept(builder);
		return stopTransform(builder.build());
	}

	// ----- Endpoint: transform.update_transform

	/**
	 * Updates certain properties of a transform.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/update-transform.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<UpdateTransformResponse> updateTransform(UpdateTransformRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<UpdateTransformRequest, UpdateTransformResponse, ErrorResponse> endpoint = (Endpoint<UpdateTransformRequest, UpdateTransformResponse, ErrorResponse>) UpdateTransformRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Updates certain properties of a transform.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateTransformRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/update-transform.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<UpdateTransformResponse> updateTransform(Consumer<UpdateTransformRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		UpdateTransformRequest.Builder builder = new UpdateTransformRequest.Builder();
		fn.accept(builder);
		return updateTransform(builder.build());
	}

}
