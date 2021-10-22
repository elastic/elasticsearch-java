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
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.function.Function;
import javax.annotation.Nullable;

/**
 * Client for the transform namespace.
 */
public class ElasticsearchTransformClient extends ApiClient<ElasticsearchTransformClient> {

	public ElasticsearchTransformClient(Transport transport) {
		super(transport, null);
	}

	public ElasticsearchTransformClient(Transport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchTransformClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchTransformClient(this.transport, transportOptions);
	}

	// ----- Endpoint: transform.delete_transform

	/**
	 * Deletes an existing transform.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/delete-transform.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteTransformResponse deleteTransform(DeleteTransformRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequest(request, DeleteTransformRequest.ENDPOINT, this.transportOptions);
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

	public final DeleteTransformResponse deleteTransform(
			Function<DeleteTransformRequest.Builder, ObjectBuilder<DeleteTransformRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteTransform(fn.apply(new DeleteTransformRequest.Builder()).build());
	}

	// ----- Endpoint: transform.get_transform

	/**
	 * Retrieves configuration information for transforms.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-transform.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetTransformResponse getTransform(GetTransformRequest request) throws IOException, ElasticsearchException {
		return this.transport.performRequest(request, GetTransformRequest.ENDPOINT, this.transportOptions);
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

	public final GetTransformResponse getTransform(
			Function<GetTransformRequest.Builder, ObjectBuilder<GetTransformRequest>> fn)
			throws IOException, ElasticsearchException {
		return getTransform(fn.apply(new GetTransformRequest.Builder()).build());
	}

	/**
	 * Retrieves configuration information for transforms.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-transform.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetTransformResponse getTransform() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetTransformRequest.Builder().build(), GetTransformRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: transform.get_transform_stats

	/**
	 * Retrieves usage information for transforms.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-transform-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetTransformStatsResponse getTransformStats(GetTransformStatsRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequest(request, GetTransformStatsRequest.ENDPOINT, this.transportOptions);
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

	public final GetTransformStatsResponse getTransformStats(
			Function<GetTransformStatsRequest.Builder, ObjectBuilder<GetTransformStatsRequest>> fn)
			throws IOException, ElasticsearchException {
		return getTransformStats(fn.apply(new GetTransformStatsRequest.Builder()).build());
	}

	// ----- Endpoint: transform.preview_transform

	/**
	 * Previews a transform.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/preview-transform.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TTransform> PreviewTransformResponse<TTransform> previewTransform(PreviewTransformRequest request,
			Class<TTransform> tTransformClass) throws IOException, ElasticsearchException {
		return this.transport.performRequest(request,
				PreviewTransformRequest.createPreviewTransformEndpoint(getDeserializer(tTransformClass)),
				this.transportOptions);
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

	public final <TTransform> PreviewTransformResponse<TTransform> previewTransform(
			Function<PreviewTransformRequest.Builder, ObjectBuilder<PreviewTransformRequest>> fn,
			Class<TTransform> tTransformClass) throws IOException, ElasticsearchException {
		return previewTransform(fn.apply(new PreviewTransformRequest.Builder()).build(), tTransformClass);
	}

	// ----- Endpoint: transform.put_transform

	/**
	 * Instantiates a transform.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/put-transform.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutTransformResponse putTransform(PutTransformRequest request) throws IOException, ElasticsearchException {
		return this.transport.performRequest(request, PutTransformRequest.ENDPOINT, this.transportOptions);
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

	public final PutTransformResponse putTransform(
			Function<PutTransformRequest.Builder, ObjectBuilder<PutTransformRequest>> fn)
			throws IOException, ElasticsearchException {
		return putTransform(fn.apply(new PutTransformRequest.Builder()).build());
	}

	// ----- Endpoint: transform.start_transform

	/**
	 * Starts one or more transforms.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/start-transform.html">Documentation
	 *      on elastic.co</a>
	 */

	public StartTransformResponse startTransform(StartTransformRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequest(request, StartTransformRequest.ENDPOINT, this.transportOptions);
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

	public final StartTransformResponse startTransform(
			Function<StartTransformRequest.Builder, ObjectBuilder<StartTransformRequest>> fn)
			throws IOException, ElasticsearchException {
		return startTransform(fn.apply(new StartTransformRequest.Builder()).build());
	}

	// ----- Endpoint: transform.stop_transform

	/**
	 * Stops one or more transforms.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/stop-transform.html">Documentation
	 *      on elastic.co</a>
	 */

	public StopTransformResponse stopTransform(StopTransformRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequest(request, StopTransformRequest.ENDPOINT, this.transportOptions);
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

	public final StopTransformResponse stopTransform(
			Function<StopTransformRequest.Builder, ObjectBuilder<StopTransformRequest>> fn)
			throws IOException, ElasticsearchException {
		return stopTransform(fn.apply(new StopTransformRequest.Builder()).build());
	}

	// ----- Endpoint: transform.update_transform

	/**
	 * Updates certain properties of a transform.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/update-transform.html">Documentation
	 *      on elastic.co</a>
	 */

	public UpdateTransformResponse updateTransform(UpdateTransformRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequest(request, UpdateTransformRequest.ENDPOINT, this.transportOptions);
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

	public final UpdateTransformResponse updateTransform(
			Function<UpdateTransformRequest.Builder, ObjectBuilder<UpdateTransformRequest>> fn)
			throws IOException, ElasticsearchException {
		return updateTransform(fn.apply(new UpdateTransformRequest.Builder()).build());
	}

}
