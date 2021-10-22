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
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Nullable;

/**
 * Client for the rollup namespace.
 */
public class ElasticsearchRollupAsyncClient extends ApiClient<ElasticsearchRollupAsyncClient> {

	public ElasticsearchRollupAsyncClient(Transport transport) {
		super(transport, null);
	}

	public ElasticsearchRollupAsyncClient(Transport transport, @Nullable TransportOptions transportOptions) {
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

	public CompletableFuture<DeleteJobResponse> deleteJob(DeleteJobRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, DeleteJobRequest.ENDPOINT, this.transportOptions);
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
			Function<DeleteJobRequest.Builder, ObjectBuilder<DeleteJobRequest>> fn)
			throws IOException, ElasticsearchException {
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

	public CompletableFuture<GetJobsResponse> getJobs(GetJobsRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, GetJobsRequest.ENDPOINT, this.transportOptions);
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
			Function<GetJobsRequest.Builder, ObjectBuilder<GetJobsRequest>> fn)
			throws IOException, ElasticsearchException {
		return getJobs(fn.apply(new GetJobsRequest.Builder()).build());
	}

	/**
	 * Retrieves the configuration, stats, and status of rollup jobs.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/rollup-get-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetJobsResponse> getJobs() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new GetJobsRequest.Builder().build(), GetJobsRequest.ENDPOINT,
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

	public CompletableFuture<GetRollupCapsResponse> getRollupCaps(GetRollupCapsRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, GetRollupCapsRequest.ENDPOINT, this.transportOptions);
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
			Function<GetRollupCapsRequest.Builder, ObjectBuilder<GetRollupCapsRequest>> fn)
			throws IOException, ElasticsearchException {
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

	public CompletableFuture<GetRollupCapsResponse> getRollupCaps() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new GetRollupCapsRequest.Builder().build(),
				GetRollupCapsRequest.ENDPOINT, this.transportOptions);
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

	public CompletableFuture<GetRollupIndexCapsResponse> getRollupIndexCaps(GetRollupIndexCapsRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, GetRollupIndexCapsRequest.ENDPOINT, this.transportOptions);
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

	public final CompletableFuture<GetRollupIndexCapsResponse> getRollupIndexCaps(
			Function<GetRollupIndexCapsRequest.Builder, ObjectBuilder<GetRollupIndexCapsRequest>> fn)
			throws IOException, ElasticsearchException {
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

	public CompletableFuture<PutJobResponse> putJob(PutJobRequest request) throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, PutJobRequest.ENDPOINT, this.transportOptions);
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
			Function<PutJobRequest.Builder, ObjectBuilder<PutJobRequest>> fn)
			throws IOException, ElasticsearchException {
		return putJob(fn.apply(new PutJobRequest.Builder()).build());
	}

	// ----- Endpoint: rollup.rollup

	/**
	 * Rollup an index
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/xpack-rollup.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<RollupResponse> rollup(RollupRequest request) throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, RollupRequest.ENDPOINT, this.transportOptions);
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

	public final CompletableFuture<RollupResponse> rollup(
			Function<RollupRequest.Builder, ObjectBuilder<RollupRequest>> fn)
			throws IOException, ElasticsearchException {
		return rollup(fn.apply(new RollupRequest.Builder()).build());
	}

	// ----- Endpoint: rollup.rollup_search

	/**
	 * Enables searching rolled-up data using the standard query DSL.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/rollup-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> CompletableFuture<RollupSearchResponse<TDocument>> rollupSearch(RollupSearchRequest request,
			Class<TDocument> tDocumentClass) throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request,
				RollupSearchRequest.createRollupSearchEndpoint(getDeserializer(tDocumentClass)), this.transportOptions);
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

	public final <TDocument> CompletableFuture<RollupSearchResponse<TDocument>> rollupSearch(
			Function<RollupSearchRequest.Builder, ObjectBuilder<RollupSearchRequest>> fn,
			Class<TDocument> tDocumentClass) throws IOException, ElasticsearchException {
		return rollupSearch(fn.apply(new RollupSearchRequest.Builder()).build(), tDocumentClass);
	}

	// ----- Endpoint: rollup.start_job

	/**
	 * Starts an existing, stopped rollup job.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/rollup-start-job.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<StartJobResponse> startJob(StartJobRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, StartJobRequest.ENDPOINT, this.transportOptions);
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
			Function<StartJobRequest.Builder, ObjectBuilder<StartJobRequest>> fn)
			throws IOException, ElasticsearchException {
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

	public CompletableFuture<StopJobResponse> stopJob(StopJobRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, StopJobRequest.ENDPOINT, this.transportOptions);
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
			Function<StopJobRequest.Builder, ObjectBuilder<StopJobRequest>> fn)
			throws IOException, ElasticsearchException {
		return stopJob(fn.apply(new StopJobRequest.Builder()).build());
	}

}
