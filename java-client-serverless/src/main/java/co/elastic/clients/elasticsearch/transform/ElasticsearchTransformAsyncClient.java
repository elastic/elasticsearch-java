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

package co.elastic.clients.elasticsearch.transform;

import co.elastic.clients.ApiClient;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.JsonEndpoint;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.transport.endpoints.EndpointWithResponseMapperAttr;
import co.elastic.clients.util.ObjectBuilder;
import java.lang.reflect.Type;
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
	 * Delete a transform. Deletes a transform.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/delete-transform.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteTransformResponse> deleteTransform(DeleteTransformRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteTransformRequest, DeleteTransformResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteTransformRequest, DeleteTransformResponse, ErrorResponse>) DeleteTransformRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete a transform. Deletes a transform.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteTransformRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/delete-transform.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteTransformResponse> deleteTransform(
			Function<DeleteTransformRequest.Builder, ObjectBuilder<DeleteTransformRequest>> fn) {
		return deleteTransform(fn.apply(new DeleteTransformRequest.Builder()).build());
	}

	// ----- Endpoint: transform.get_transform

	/**
	 * Get transforms. Retrieves configuration information for transforms.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-transform.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetTransformResponse> getTransform(GetTransformRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetTransformRequest, GetTransformResponse, ErrorResponse> endpoint = (JsonEndpoint<GetTransformRequest, GetTransformResponse, ErrorResponse>) GetTransformRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get transforms. Retrieves configuration information for transforms.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetTransformRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-transform.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetTransformResponse> getTransform(
			Function<GetTransformRequest.Builder, ObjectBuilder<GetTransformRequest>> fn) {
		return getTransform(fn.apply(new GetTransformRequest.Builder()).build());
	}

	/**
	 * Get transforms. Retrieves configuration information for transforms.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-transform.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetTransformResponse> getTransform() {
		return this.transport.performRequestAsync(new GetTransformRequest.Builder().build(),
				GetTransformRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: transform.get_transform_stats

	/**
	 * Get transform stats. Retrieves usage information for transforms.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-transform-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetTransformStatsResponse> getTransformStats(GetTransformStatsRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetTransformStatsRequest, GetTransformStatsResponse, ErrorResponse> endpoint = (JsonEndpoint<GetTransformStatsRequest, GetTransformStatsResponse, ErrorResponse>) GetTransformStatsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get transform stats. Retrieves usage information for transforms.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetTransformStatsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-transform-stats.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetTransformStatsResponse> getTransformStats(
			Function<GetTransformStatsRequest.Builder, ObjectBuilder<GetTransformStatsRequest>> fn) {
		return getTransformStats(fn.apply(new GetTransformStatsRequest.Builder()).build());
	}

	// ----- Endpoint: transform.preview_transform

	/**
	 * Preview a transform. Generates a preview of the results that you will get
	 * when you create a transform with the same configuration.
	 * <p>
	 * It returns a maximum of 100 results. The calculations are based on all the
	 * current data in the source index. It also generates a list of mappings and
	 * settings for the destination index. These values are determined based on the
	 * field types of the source index and the transform aggregations.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/preview-transform.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TTransform> CompletableFuture<PreviewTransformResponse<TTransform>> previewTransform(
			PreviewTransformRequest request, Class<TTransform> tTransformClass) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PreviewTransformRequest, PreviewTransformResponse<TTransform>, ErrorResponse> endpoint = (JsonEndpoint<PreviewTransformRequest, PreviewTransformResponse<TTransform>, ErrorResponse>) PreviewTransformRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:transform.preview_transform.Response.TTransform",
				getDeserializer(tTransformClass));

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Preview a transform. Generates a preview of the results that you will get
	 * when you create a transform with the same configuration.
	 * <p>
	 * It returns a maximum of 100 results. The calculations are based on all the
	 * current data in the source index. It also generates a list of mappings and
	 * settings for the destination index. These values are determined based on the
	 * field types of the source index and the transform aggregations.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PreviewTransformRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/preview-transform.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TTransform> CompletableFuture<PreviewTransformResponse<TTransform>> previewTransform(
			Function<PreviewTransformRequest.Builder, ObjectBuilder<PreviewTransformRequest>> fn,
			Class<TTransform> tTransformClass) {
		return previewTransform(fn.apply(new PreviewTransformRequest.Builder()).build(), tTransformClass);
	}

	/**
	 * Preview a transform. Generates a preview of the results that you will get
	 * when you create a transform with the same configuration.
	 * <p>
	 * It returns a maximum of 100 results. The calculations are based on all the
	 * current data in the source index. It also generates a list of mappings and
	 * settings for the destination index. These values are determined based on the
	 * field types of the source index and the transform aggregations.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/preview-transform.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TTransform> CompletableFuture<PreviewTransformResponse<TTransform>> previewTransform(
			PreviewTransformRequest request, Type tTransformType) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PreviewTransformRequest, PreviewTransformResponse<TTransform>, ErrorResponse> endpoint = (JsonEndpoint<PreviewTransformRequest, PreviewTransformResponse<TTransform>, ErrorResponse>) PreviewTransformRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:transform.preview_transform.Response.TTransform",
				getDeserializer(tTransformType));

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Preview a transform. Generates a preview of the results that you will get
	 * when you create a transform with the same configuration.
	 * <p>
	 * It returns a maximum of 100 results. The calculations are based on all the
	 * current data in the source index. It also generates a list of mappings and
	 * settings for the destination index. These values are determined based on the
	 * field types of the source index and the transform aggregations.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PreviewTransformRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/preview-transform.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TTransform> CompletableFuture<PreviewTransformResponse<TTransform>> previewTransform(
			Function<PreviewTransformRequest.Builder, ObjectBuilder<PreviewTransformRequest>> fn, Type tTransformType) {
		return previewTransform(fn.apply(new PreviewTransformRequest.Builder()).build(), tTransformType);
	}

	// ----- Endpoint: transform.put_transform

	/**
	 * Create a transform. Creates a transform.
	 * <p>
	 * A transform copies data from source indices, transforms it, and persists it
	 * into an entity-centric destination index. You can also think of the
	 * destination index as a two-dimensional tabular data structure (known as a
	 * data frame). The ID for each document in the data frame is generated from a
	 * hash of the entity, so there is a unique row per entity.
	 * <p>
	 * You must choose either the latest or pivot method for your transform; you
	 * cannot use both in a single transform. If you choose to use the pivot method
	 * for your transform, the entities are defined by the set of
	 * <code>group_by</code> fields in the pivot object. If you choose to use the
	 * latest method, the entities are defined by the <code>unique_key</code> field
	 * values in the latest object.
	 * <p>
	 * You must have <code>create_index</code>, <code>index</code>, and
	 * <code>read</code> privileges on the destination index and <code>read</code>
	 * and <code>view_index_metadata</code> privileges on the source indices. When
	 * Elasticsearch security features are enabled, the transform remembers which
	 * roles the user that created it had at the time of creation and uses those
	 * same roles. If those roles do not have the required privileges on the source
	 * and destination indices, the transform fails when it attempts unauthorized
	 * operations.
	 * <p>
	 * NOTE: You must use Kibana or this API to create a transform. Do not add a
	 * transform directly into any <code>.transform-internal*</code> indices using
	 * the Elasticsearch index API. If Elasticsearch security features are enabled,
	 * do not give users any privileges on <code>.transform-internal*</code>
	 * indices. If you used transforms prior to 7.5, also do not give users any
	 * privileges on <code>.data-frame-internal*</code> indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/put-transform.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutTransformResponse> putTransform(PutTransformRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutTransformRequest, PutTransformResponse, ErrorResponse> endpoint = (JsonEndpoint<PutTransformRequest, PutTransformResponse, ErrorResponse>) PutTransformRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Create a transform. Creates a transform.
	 * <p>
	 * A transform copies data from source indices, transforms it, and persists it
	 * into an entity-centric destination index. You can also think of the
	 * destination index as a two-dimensional tabular data structure (known as a
	 * data frame). The ID for each document in the data frame is generated from a
	 * hash of the entity, so there is a unique row per entity.
	 * <p>
	 * You must choose either the latest or pivot method for your transform; you
	 * cannot use both in a single transform. If you choose to use the pivot method
	 * for your transform, the entities are defined by the set of
	 * <code>group_by</code> fields in the pivot object. If you choose to use the
	 * latest method, the entities are defined by the <code>unique_key</code> field
	 * values in the latest object.
	 * <p>
	 * You must have <code>create_index</code>, <code>index</code>, and
	 * <code>read</code> privileges on the destination index and <code>read</code>
	 * and <code>view_index_metadata</code> privileges on the source indices. When
	 * Elasticsearch security features are enabled, the transform remembers which
	 * roles the user that created it had at the time of creation and uses those
	 * same roles. If those roles do not have the required privileges on the source
	 * and destination indices, the transform fails when it attempts unauthorized
	 * operations.
	 * <p>
	 * NOTE: You must use Kibana or this API to create a transform. Do not add a
	 * transform directly into any <code>.transform-internal*</code> indices using
	 * the Elasticsearch index API. If Elasticsearch security features are enabled,
	 * do not give users any privileges on <code>.transform-internal*</code>
	 * indices. If you used transforms prior to 7.5, also do not give users any
	 * privileges on <code>.data-frame-internal*</code> indices.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutTransformRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/put-transform.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutTransformResponse> putTransform(
			Function<PutTransformRequest.Builder, ObjectBuilder<PutTransformRequest>> fn) {
		return putTransform(fn.apply(new PutTransformRequest.Builder()).build());
	}

	// ----- Endpoint: transform.reset_transform

	/**
	 * Reset a transform. Resets a transform. Before you can reset it, you must stop
	 * it; alternatively, use the <code>force</code> query parameter. If the
	 * destination index was created by the transform, it is deleted.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/reset-transform.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ResetTransformResponse> resetTransform(ResetTransformRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ResetTransformRequest, ResetTransformResponse, ErrorResponse> endpoint = (JsonEndpoint<ResetTransformRequest, ResetTransformResponse, ErrorResponse>) ResetTransformRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Reset a transform. Resets a transform. Before you can reset it, you must stop
	 * it; alternatively, use the <code>force</code> query parameter. If the
	 * destination index was created by the transform, it is deleted.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ResetTransformRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/reset-transform.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ResetTransformResponse> resetTransform(
			Function<ResetTransformRequest.Builder, ObjectBuilder<ResetTransformRequest>> fn) {
		return resetTransform(fn.apply(new ResetTransformRequest.Builder()).build());
	}

	// ----- Endpoint: transform.schedule_now_transform

	/**
	 * Schedule a transform to start now. Instantly runs a transform to process
	 * data.
	 * <p>
	 * If you _schedule_now a transform, it will process the new data instantly,
	 * without waiting for the configured frequency interval. After _schedule_now
	 * API is called, the transform will be processed again at now + frequency
	 * unless _schedule_now API is called again in the meantime.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/schedule-now-transform.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ScheduleNowTransformResponse> scheduleNowTransform(ScheduleNowTransformRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ScheduleNowTransformRequest, ScheduleNowTransformResponse, ErrorResponse> endpoint = (JsonEndpoint<ScheduleNowTransformRequest, ScheduleNowTransformResponse, ErrorResponse>) ScheduleNowTransformRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Schedule a transform to start now. Instantly runs a transform to process
	 * data.
	 * <p>
	 * If you _schedule_now a transform, it will process the new data instantly,
	 * without waiting for the configured frequency interval. After _schedule_now
	 * API is called, the transform will be processed again at now + frequency
	 * unless _schedule_now API is called again in the meantime.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ScheduleNowTransformRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/schedule-now-transform.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ScheduleNowTransformResponse> scheduleNowTransform(
			Function<ScheduleNowTransformRequest.Builder, ObjectBuilder<ScheduleNowTransformRequest>> fn) {
		return scheduleNowTransform(fn.apply(new ScheduleNowTransformRequest.Builder()).build());
	}

	// ----- Endpoint: transform.start_transform

	/**
	 * Start a transform. Starts a transform.
	 * <p>
	 * When you start a transform, it creates the destination index if it does not
	 * already exist. The <code>number_of_shards</code> is set to <code>1</code> and
	 * the <code>auto_expand_replicas</code> is set to <code>0-1</code>. If it is a
	 * pivot transform, it deduces the mapping definitions for the destination index
	 * from the source indices and the transform aggregations. If fields in the
	 * destination index are derived from scripts (as in the case of
	 * <code>scripted_metric</code> or <code>bucket_script</code> aggregations), the
	 * transform uses dynamic mappings unless an index template exists. If it is a
	 * latest transform, it does not deduce mapping definitions; it uses dynamic
	 * mappings. To use explicit mappings, create the destination index before you
	 * start the transform. Alternatively, you can create an index template, though
	 * it does not affect the deduced mappings in a pivot transform.
	 * <p>
	 * When the transform starts, a series of validations occur to ensure its
	 * success. If you deferred validation when you created the transform, they
	 * occur when you start the transform—​with the exception of privilege checks.
	 * When Elasticsearch security features are enabled, the transform remembers
	 * which roles the user that created it had at the time of creation and uses
	 * those same roles. If those roles do not have the required privileges on the
	 * source and destination indices, the transform fails when it attempts
	 * unauthorized operations.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/start-transform.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<StartTransformResponse> startTransform(StartTransformRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<StartTransformRequest, StartTransformResponse, ErrorResponse> endpoint = (JsonEndpoint<StartTransformRequest, StartTransformResponse, ErrorResponse>) StartTransformRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Start a transform. Starts a transform.
	 * <p>
	 * When you start a transform, it creates the destination index if it does not
	 * already exist. The <code>number_of_shards</code> is set to <code>1</code> and
	 * the <code>auto_expand_replicas</code> is set to <code>0-1</code>. If it is a
	 * pivot transform, it deduces the mapping definitions for the destination index
	 * from the source indices and the transform aggregations. If fields in the
	 * destination index are derived from scripts (as in the case of
	 * <code>scripted_metric</code> or <code>bucket_script</code> aggregations), the
	 * transform uses dynamic mappings unless an index template exists. If it is a
	 * latest transform, it does not deduce mapping definitions; it uses dynamic
	 * mappings. To use explicit mappings, create the destination index before you
	 * start the transform. Alternatively, you can create an index template, though
	 * it does not affect the deduced mappings in a pivot transform.
	 * <p>
	 * When the transform starts, a series of validations occur to ensure its
	 * success. If you deferred validation when you created the transform, they
	 * occur when you start the transform—​with the exception of privilege checks.
	 * When Elasticsearch security features are enabled, the transform remembers
	 * which roles the user that created it had at the time of creation and uses
	 * those same roles. If those roles do not have the required privileges on the
	 * source and destination indices, the transform fails when it attempts
	 * unauthorized operations.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link StartTransformRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/start-transform.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<StartTransformResponse> startTransform(
			Function<StartTransformRequest.Builder, ObjectBuilder<StartTransformRequest>> fn) {
		return startTransform(fn.apply(new StartTransformRequest.Builder()).build());
	}

	// ----- Endpoint: transform.stop_transform

	/**
	 * Stop transforms. Stops one or more transforms.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/stop-transform.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<StopTransformResponse> stopTransform(StopTransformRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<StopTransformRequest, StopTransformResponse, ErrorResponse> endpoint = (JsonEndpoint<StopTransformRequest, StopTransformResponse, ErrorResponse>) StopTransformRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Stop transforms. Stops one or more transforms.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link StopTransformRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/stop-transform.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<StopTransformResponse> stopTransform(
			Function<StopTransformRequest.Builder, ObjectBuilder<StopTransformRequest>> fn) {
		return stopTransform(fn.apply(new StopTransformRequest.Builder()).build());
	}

	// ----- Endpoint: transform.update_transform

	/**
	 * Update a transform. Updates certain properties of a transform.
	 * <p>
	 * All updated properties except <code>description</code> do not take effect
	 * until after the transform starts the next checkpoint, thus there is data
	 * consistency in each checkpoint. To use this API, you must have
	 * <code>read</code> and <code>view_index_metadata</code> privileges for the
	 * source indices. You must also have <code>index</code> and <code>read</code>
	 * privileges for the destination index. When Elasticsearch security features
	 * are enabled, the transform remembers which roles the user who updated it had
	 * at the time of update and runs with those privileges.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/update-transform.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<UpdateTransformResponse> updateTransform(UpdateTransformRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdateTransformRequest, UpdateTransformResponse, ErrorResponse> endpoint = (JsonEndpoint<UpdateTransformRequest, UpdateTransformResponse, ErrorResponse>) UpdateTransformRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Update a transform. Updates certain properties of a transform.
	 * <p>
	 * All updated properties except <code>description</code> do not take effect
	 * until after the transform starts the next checkpoint, thus there is data
	 * consistency in each checkpoint. To use this API, you must have
	 * <code>read</code> and <code>view_index_metadata</code> privileges for the
	 * source indices. You must also have <code>index</code> and <code>read</code>
	 * privileges for the destination index. When Elasticsearch security features
	 * are enabled, the transform remembers which roles the user who updated it had
	 * at the time of update and runs with those privileges.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateTransformRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/update-transform.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<UpdateTransformResponse> updateTransform(
			Function<UpdateTransformRequest.Builder, ObjectBuilder<UpdateTransformRequest>> fn) {
		return updateTransform(fn.apply(new UpdateTransformRequest.Builder()).build());
	}

}
