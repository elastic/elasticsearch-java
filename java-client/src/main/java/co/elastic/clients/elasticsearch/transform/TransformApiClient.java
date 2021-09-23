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

import co.elastic.clients.base.ApiClient;
import co.elastic.clients.base.Transport;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.elasticsearch.client.RequestOptions;

/**
 * Client for the transform namespace.
 */
public class TransformApiClient extends ApiClient<TransformApiClient> {

	public TransformApiClient(Transport transport) {
		super(transport, null);
	}

	public TransformApiClient(Transport transport, RequestOptions options) {
		super(transport, options);
	}

	// ----- Endpoint: transform.delete_transform

	/**
	 * Deletes an existing transform.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/delete-transform.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteTransformResponse deleteTransform(DeleteTransformRequest request) throws IOException {
		return this.transport.performRequest(request, DeleteTransformRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Deletes an existing transform.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/delete-transform.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteTransformResponse deleteTransform(
			Function<DeleteTransformRequest.Builder, ObjectBuilder<DeleteTransformRequest>> fn) throws IOException {
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

	public GetTransformResponse getTransform(GetTransformRequest request) throws IOException {
		return this.transport.performRequest(request, GetTransformRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Retrieves configuration information for transforms.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-transform.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetTransformResponse getTransform(
			Function<GetTransformRequest.Builder, ObjectBuilder<GetTransformRequest>> fn) throws IOException {
		return getTransform(fn.apply(new GetTransformRequest.Builder()).build());
	}

	// ----- Endpoint: transform.get_transform_stats

	/**
	 * Retrieves usage information for transforms.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-transform-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetTransformStatsResponse getTransformStats(GetTransformStatsRequest request) throws IOException {
		return this.transport.performRequest(request, GetTransformStatsRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Retrieves usage information for transforms.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-transform-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetTransformStatsResponse getTransformStats(
			Function<GetTransformStatsRequest.Builder, ObjectBuilder<GetTransformStatsRequest>> fn) throws IOException {
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
			Class<TTransform> tTransformClass) throws IOException {
		return this.transport.performRequest(request,
				PreviewTransformRequest.createPreviewTransformEndpoint(getDeserializer(tTransformClass)),
				this.requestOptions);
	}

	/**
	 * Previews a transform.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/preview-transform.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TTransform> PreviewTransformResponse<TTransform> previewTransform(
			Function<PreviewTransformRequest.Builder, ObjectBuilder<PreviewTransformRequest>> fn,
			Class<TTransform> tTransformClass) throws IOException {
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

	public PutTransformResponse putTransform(PutTransformRequest request) throws IOException {
		return this.transport.performRequest(request, PutTransformRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Instantiates a transform.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/put-transform.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutTransformResponse putTransform(
			Function<PutTransformRequest.Builder, ObjectBuilder<PutTransformRequest>> fn) throws IOException {
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

	public StartTransformResponse startTransform(StartTransformRequest request) throws IOException {
		return this.transport.performRequest(request, StartTransformRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Starts one or more transforms.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/start-transform.html">Documentation
	 *      on elastic.co</a>
	 */

	public final StartTransformResponse startTransform(
			Function<StartTransformRequest.Builder, ObjectBuilder<StartTransformRequest>> fn) throws IOException {
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

	public StopTransformResponse stopTransform(StopTransformRequest request) throws IOException {
		return this.transport.performRequest(request, StopTransformRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Stops one or more transforms.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/stop-transform.html">Documentation
	 *      on elastic.co</a>
	 */

	public final StopTransformResponse stopTransform(
			Function<StopTransformRequest.Builder, ObjectBuilder<StopTransformRequest>> fn) throws IOException {
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

	public UpdateTransformResponse updateTransform(UpdateTransformRequest request) throws IOException {
		return this.transport.performRequest(request, UpdateTransformRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Updates certain properties of a transform.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/update-transform.html">Documentation
	 *      on elastic.co</a>
	 */

	public final UpdateTransformResponse updateTransform(
			Function<UpdateTransformRequest.Builder, ObjectBuilder<UpdateTransformRequest>> fn) throws IOException {
		return updateTransform(fn.apply(new UpdateTransformRequest.Builder()).build());
	}

	// ----- Misc

	/**
	 * Creates a new {@link #TransformApiClient} with specific request options.
	 */
	@Override
	public TransformApiClient withRequestOptions(@Nullable RequestOptions options) {
		return new TransformApiClient(transport, options);
	}

	/**
	 * Creates a new {@link #TransformApiClient} with specific request options,
	 * inheriting existing options.
	 *
	 * @param fn
	 *            a function taking an options builder initialized with the current
	 *            request options, or initialized with default values.
	 */
	public TransformApiClient withRequestOptions(Function<RequestOptions.Builder, RequestOptions.Builder> fn) {
		RequestOptions.Builder builder = requestOptions == null
				? RequestOptions.DEFAULT.toBuilder()
				: requestOptions.toBuilder();

		return withRequestOptions(fn.apply(builder).build());
	}
}
