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

package co.elastic.clients.elasticsearch.rollup;

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
 * Client for the rollup namespace.
 */
public class ElasticsearchRollupAsyncClient extends ApiClient<ElasticsearchTransport, ElasticsearchRollupAsyncClient> {

	public ElasticsearchRollupAsyncClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchRollupAsyncClient(ElasticsearchTransport transport,
			@Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchRollupAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchRollupAsyncClient(this.transport, transportOptions);
	}

	// ----- Endpoint: rollup.delete_job

	/**
	 * Deletes an existing rollup job.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/rollup-delete-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteJobResponse> deleteJob(DeleteJobRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteJobRequest, DeleteJobResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteJobRequest, DeleteJobResponse, ErrorResponse>) DeleteJobRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Deletes an existing rollup job.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteJobRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/rollup-delete-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteJobResponse> deleteJob(
			Function<DeleteJobRequest.Builder, ObjectBuilder<DeleteJobRequest>> fn) {
		return deleteJob(fn.apply(new DeleteJobRequest.Builder()).build());
	}

	// ----- Endpoint: rollup.get_jobs

	/**
	 * Retrieves the configuration, stats, and status of rollup jobs.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/rollup-get-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetJobsResponse> getJobs(GetJobsRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetJobsRequest, GetJobsResponse, ErrorResponse> endpoint = (JsonEndpoint<GetJobsRequest, GetJobsResponse, ErrorResponse>) GetJobsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Retrieves the configuration, stats, and status of rollup jobs.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetJobsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/rollup-get-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetJobsResponse> getJobs(
			Function<GetJobsRequest.Builder, ObjectBuilder<GetJobsRequest>> fn) {
		return getJobs(fn.apply(new GetJobsRequest.Builder()).build());
	}

	/**
	 * Retrieves the configuration, stats, and status of rollup jobs.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/rollup-get-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetJobsResponse> getJobs() {
		return this.transport.performRequestAsync(new GetJobsRequest.Builder().build(), GetJobsRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: rollup.get_rollup_caps

	/**
	 * Returns the capabilities of any rollup jobs that have been configured for a
	 * specific index or index pattern.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/rollup-get-rollup-caps.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetRollupCapsResponse> getRollupCaps(GetRollupCapsRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetRollupCapsRequest, GetRollupCapsResponse, ErrorResponse> endpoint = (JsonEndpoint<GetRollupCapsRequest, GetRollupCapsResponse, ErrorResponse>) GetRollupCapsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns the capabilities of any rollup jobs that have been configured for a
	 * specific index or index pattern.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetRollupCapsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/rollup-get-rollup-caps.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetRollupCapsResponse> getRollupCaps(
			Function<GetRollupCapsRequest.Builder, ObjectBuilder<GetRollupCapsRequest>> fn) {
		return getRollupCaps(fn.apply(new GetRollupCapsRequest.Builder()).build());
	}

	/**
	 * Returns the capabilities of any rollup jobs that have been configured for a
	 * specific index or index pattern.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/rollup-get-rollup-caps.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetRollupCapsResponse> getRollupCaps() {
		return this.transport.performRequestAsync(new GetRollupCapsRequest.Builder().build(),
				GetRollupCapsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: rollup.get_rollup_index_caps

	/**
	 * Returns the rollup capabilities of all jobs inside of a rollup index (for
	 * example, the index where rollup data is stored).
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/rollup-get-rollup-index-caps.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetRollupIndexCapsResponse> getRollupIndexCaps(GetRollupIndexCapsRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetRollupIndexCapsRequest, GetRollupIndexCapsResponse, ErrorResponse> endpoint = (JsonEndpoint<GetRollupIndexCapsRequest, GetRollupIndexCapsResponse, ErrorResponse>) GetRollupIndexCapsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns the rollup capabilities of all jobs inside of a rollup index (for
	 * example, the index where rollup data is stored).
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetRollupIndexCapsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/rollup-get-rollup-index-caps.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetRollupIndexCapsResponse> getRollupIndexCaps(
			Function<GetRollupIndexCapsRequest.Builder, ObjectBuilder<GetRollupIndexCapsRequest>> fn) {
		return getRollupIndexCaps(fn.apply(new GetRollupIndexCapsRequest.Builder()).build());
	}

	// ----- Endpoint: rollup.put_job

	/**
	 * Creates a rollup job.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/rollup-put-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutJobResponse> putJob(PutJobRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutJobRequest, PutJobResponse, ErrorResponse> endpoint = (JsonEndpoint<PutJobRequest, PutJobResponse, ErrorResponse>) PutJobRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Creates a rollup job.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutJobRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/rollup-put-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutJobResponse> putJob(
			Function<PutJobRequest.Builder, ObjectBuilder<PutJobRequest>> fn) {
		return putJob(fn.apply(new PutJobRequest.Builder()).build());
	}

	// ----- Endpoint: rollup.rollup_search

	/**
	 * Enables searching rolled-up data using the standard Query DSL.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/rollup-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> CompletableFuture<RollupSearchResponse<TDocument>> rollupSearch(RollupSearchRequest request,
			Class<TDocument> tDocumentClass) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<RollupSearchRequest, RollupSearchResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<RollupSearchRequest, RollupSearchResponse<TDocument>, ErrorResponse>) RollupSearchRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:rollup.rollup_search.Response.TDocument",
				getDeserializer(tDocumentClass));

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Enables searching rolled-up data using the standard Query DSL.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link RollupSearchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/rollup-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> CompletableFuture<RollupSearchResponse<TDocument>> rollupSearch(
			Function<RollupSearchRequest.Builder, ObjectBuilder<RollupSearchRequest>> fn,
			Class<TDocument> tDocumentClass) {
		return rollupSearch(fn.apply(new RollupSearchRequest.Builder()).build(), tDocumentClass);
	}

	/**
	 * Enables searching rolled-up data using the standard Query DSL.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/rollup-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> CompletableFuture<RollupSearchResponse<TDocument>> rollupSearch(RollupSearchRequest request,
			Type tDocumentType) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<RollupSearchRequest, RollupSearchResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<RollupSearchRequest, RollupSearchResponse<TDocument>, ErrorResponse>) RollupSearchRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:rollup.rollup_search.Response.TDocument",
				getDeserializer(tDocumentType));

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Enables searching rolled-up data using the standard Query DSL.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link RollupSearchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/rollup-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> CompletableFuture<RollupSearchResponse<TDocument>> rollupSearch(
			Function<RollupSearchRequest.Builder, ObjectBuilder<RollupSearchRequest>> fn, Type tDocumentType) {
		return rollupSearch(fn.apply(new RollupSearchRequest.Builder()).build(), tDocumentType);
	}

	// ----- Endpoint: rollup.start_job

	/**
	 * Starts an existing, stopped rollup job.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/rollup-start-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<StartJobResponse> startJob(StartJobRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<StartJobRequest, StartJobResponse, ErrorResponse> endpoint = (JsonEndpoint<StartJobRequest, StartJobResponse, ErrorResponse>) StartJobRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Starts an existing, stopped rollup job.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link StartJobRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/rollup-start-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<StartJobResponse> startJob(
			Function<StartJobRequest.Builder, ObjectBuilder<StartJobRequest>> fn) {
		return startJob(fn.apply(new StartJobRequest.Builder()).build());
	}

	// ----- Endpoint: rollup.stop_job

	/**
	 * Stops an existing, started rollup job.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/rollup-stop-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<StopJobResponse> stopJob(StopJobRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<StopJobRequest, StopJobResponse, ErrorResponse> endpoint = (JsonEndpoint<StopJobRequest, StopJobResponse, ErrorResponse>) StopJobRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Stops an existing, started rollup job.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link StopJobRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/rollup-stop-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<StopJobResponse> stopJob(
			Function<StopJobRequest.Builder, ObjectBuilder<StopJobRequest>> fn) {
		return stopJob(fn.apply(new StopJobRequest.Builder()).build());
	}

}
