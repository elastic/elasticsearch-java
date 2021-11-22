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

package co.elastic.clients.elasticsearch.rollup;

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
import java.util.function.Consumer;
import javax.annotation.Nullable;

/**
 * Client for the rollup namespace.
 */
public class ElasticsearchRollupClient extends ApiClient<ElasticsearchTransport, ElasticsearchRollupClient> {

	public ElasticsearchRollupClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchRollupClient(ElasticsearchTransport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchRollupClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchRollupClient(this.transport, transportOptions);
	}

	// ----- Endpoint: rollup.delete_job

	/**
	 * Deletes an existing rollup job.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/rollup-delete-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteJobResponse deleteJob(DeleteJobRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<DeleteJobRequest, DeleteJobResponse, ErrorResponse> endpoint = (Endpoint<DeleteJobRequest, DeleteJobResponse, ErrorResponse>) DeleteJobRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final DeleteJobResponse deleteJob(Consumer<DeleteJobRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		DeleteJobRequest.Builder builder = new DeleteJobRequest.Builder();
		fn.accept(builder);
		return deleteJob(builder.build());
	}

	// ----- Endpoint: rollup.get_jobs

	/**
	 * Retrieves the configuration, stats, and status of rollup jobs.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/rollup-get-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetJobsResponse getJobs(GetJobsRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<GetJobsRequest, GetJobsResponse, ErrorResponse> endpoint = (Endpoint<GetJobsRequest, GetJobsResponse, ErrorResponse>) GetJobsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final GetJobsResponse getJobs(Consumer<GetJobsRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		GetJobsRequest.Builder builder = new GetJobsRequest.Builder();
		fn.accept(builder);
		return getJobs(builder.build());
	}

	/**
	 * Retrieves the configuration, stats, and status of rollup jobs.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/rollup-get-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetJobsResponse getJobs() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetJobsRequest.Builder().build(), GetJobsRequest._ENDPOINT,
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

	public GetRollupCapsResponse getRollupCaps(GetRollupCapsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<GetRollupCapsRequest, GetRollupCapsResponse, ErrorResponse> endpoint = (Endpoint<GetRollupCapsRequest, GetRollupCapsResponse, ErrorResponse>) GetRollupCapsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final GetRollupCapsResponse getRollupCaps(Consumer<GetRollupCapsRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		GetRollupCapsRequest.Builder builder = new GetRollupCapsRequest.Builder();
		fn.accept(builder);
		return getRollupCaps(builder.build());
	}

	/**
	 * Returns the capabilities of any rollup jobs that have been configured for a
	 * specific index or index pattern.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/rollup-get-rollup-caps.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetRollupCapsResponse getRollupCaps() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetRollupCapsRequest.Builder().build(), GetRollupCapsRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: rollup.get_rollup_index_caps

	/**
	 * Returns the rollup capabilities of all jobs inside of a rollup index (e.g.
	 * the index where rollup data is stored).
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/rollup-get-rollup-index-caps.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetRollupIndexCapsResponse getRollupIndexCaps(GetRollupIndexCapsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<GetRollupIndexCapsRequest, GetRollupIndexCapsResponse, ErrorResponse> endpoint = (Endpoint<GetRollupIndexCapsRequest, GetRollupIndexCapsResponse, ErrorResponse>) GetRollupIndexCapsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns the rollup capabilities of all jobs inside of a rollup index (e.g.
	 * the index where rollup data is stored).
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetRollupIndexCapsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/rollup-get-rollup-index-caps.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetRollupIndexCapsResponse getRollupIndexCaps(Consumer<GetRollupIndexCapsRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		GetRollupIndexCapsRequest.Builder builder = new GetRollupIndexCapsRequest.Builder();
		fn.accept(builder);
		return getRollupIndexCaps(builder.build());
	}

	// ----- Endpoint: rollup.put_job

	/**
	 * Creates a rollup job.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/rollup-put-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutJobResponse putJob(PutJobRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<PutJobRequest, PutJobResponse, ErrorResponse> endpoint = (Endpoint<PutJobRequest, PutJobResponse, ErrorResponse>) PutJobRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final PutJobResponse putJob(Consumer<PutJobRequest.Builder> fn) throws IOException, ElasticsearchException {
		PutJobRequest.Builder builder = new PutJobRequest.Builder();
		fn.accept(builder);
		return putJob(builder.build());
	}

	// ----- Endpoint: rollup.rollup

	/**
	 * Rollup an index
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/xpack-rollup.html">Documentation
	 *      on elastic.co</a>
	 */

	public RollupResponse rollup(RollupRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<RollupRequest, RollupResponse, ErrorResponse> endpoint = (Endpoint<RollupRequest, RollupResponse, ErrorResponse>) RollupRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Rollup an index
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link RollupRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/xpack-rollup.html">Documentation
	 *      on elastic.co</a>
	 */

	public final RollupResponse rollup(Consumer<RollupRequest.Builder> fn) throws IOException, ElasticsearchException {
		RollupRequest.Builder builder = new RollupRequest.Builder();
		fn.accept(builder);
		return rollup(builder.build());
	}

	// ----- Endpoint: rollup.rollup_search

	/**
	 * Enables searching rolled-up data using the standard query DSL.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/rollup-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> RollupSearchResponse<TDocument> rollupSearch(RollupSearchRequest request,
			Class<TDocument> tDocumentClass) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<RollupSearchRequest, RollupSearchResponse<TDocument>, ErrorResponse> endpoint = (Endpoint<RollupSearchRequest, RollupSearchResponse<TDocument>, ErrorResponse>) RollupSearchRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:rollup.rollup_search.TDocument", getDeserializer(tDocumentClass));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Enables searching rolled-up data using the standard query DSL.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link RollupSearchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/rollup-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> RollupSearchResponse<TDocument> rollupSearch(Consumer<RollupSearchRequest.Builder> fn,
			Class<TDocument> tDocumentClass) throws IOException, ElasticsearchException {
		RollupSearchRequest.Builder builder = new RollupSearchRequest.Builder();
		fn.accept(builder);
		return rollupSearch(builder.build(), tDocumentClass);
	}

	// ----- Endpoint: rollup.start_job

	/**
	 * Starts an existing, stopped rollup job.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/rollup-start-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public StartJobResponse startJob(StartJobRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<StartJobRequest, StartJobResponse, ErrorResponse> endpoint = (Endpoint<StartJobRequest, StartJobResponse, ErrorResponse>) StartJobRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final StartJobResponse startJob(Consumer<StartJobRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		StartJobRequest.Builder builder = new StartJobRequest.Builder();
		fn.accept(builder);
		return startJob(builder.build());
	}

	// ----- Endpoint: rollup.stop_job

	/**
	 * Stops an existing, started rollup job.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/rollup-stop-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public StopJobResponse stopJob(StopJobRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<StopJobRequest, StopJobResponse, ErrorResponse> endpoint = (Endpoint<StopJobRequest, StopJobResponse, ErrorResponse>) StopJobRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final StopJobResponse stopJob(Consumer<StopJobRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		StopJobRequest.Builder builder = new StopJobRequest.Builder();
		fn.accept(builder);
		return stopJob(builder.build());
	}

}
