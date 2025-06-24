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
import co.elastic.clients.elasticsearch._types.ElasticsearchException;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.JsonEndpoint;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.transport.endpoints.EndpointWithResponseMapperAttr;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.lang.reflect.Type;
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
	 * Delete a rollup job.
	 * <p>
	 * A job must be stopped before it can be deleted. If you attempt to delete a
	 * started job, an error occurs. Similarly, if you attempt to delete a
	 * nonexistent job, an exception occurs.
	 * <p>
	 * IMPORTANT: When you delete a job, you remove only the process that is
	 * actively monitoring and rolling up data. The API does not delete any
	 * previously rolled up data. This is by design; a user may wish to roll up a
	 * static data set. Because the data set is static, after it has been fully
	 * rolled up there is no need to keep the indexing rollup job around (as there
	 * will be no new data). Thus the job can be deleted, leaving behind the rolled
	 * up data for analysis. If you wish to also remove the rollup data and the
	 * rollup index contains the data for only a single job, you can delete the
	 * whole rollup index. If the rollup index stores data from several jobs, you
	 * must issue a delete-by-query that targets the rollup job's identifier in the
	 * rollup index. For example:
	 * 
	 * <pre>
	 * <code>POST my_rollup_index/_delete_by_query
	 * {
	 *   &quot;query&quot;: {
	 *     &quot;term&quot;: {
	 *       &quot;_rollup.id&quot;: &quot;the_rollup_job_id&quot;
	 *     }
	 *   }
	 * }
	 * </code>
	 * </pre>
	 *
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-rollup-delete-job">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteJobResponse deleteJob(DeleteJobRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteJobRequest, DeleteJobResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteJobRequest, DeleteJobResponse, ErrorResponse>) DeleteJobRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete a rollup job.
	 * <p>
	 * A job must be stopped before it can be deleted. If you attempt to delete a
	 * started job, an error occurs. Similarly, if you attempt to delete a
	 * nonexistent job, an exception occurs.
	 * <p>
	 * IMPORTANT: When you delete a job, you remove only the process that is
	 * actively monitoring and rolling up data. The API does not delete any
	 * previously rolled up data. This is by design; a user may wish to roll up a
	 * static data set. Because the data set is static, after it has been fully
	 * rolled up there is no need to keep the indexing rollup job around (as there
	 * will be no new data). Thus the job can be deleted, leaving behind the rolled
	 * up data for analysis. If you wish to also remove the rollup data and the
	 * rollup index contains the data for only a single job, you can delete the
	 * whole rollup index. If the rollup index stores data from several jobs, you
	 * must issue a delete-by-query that targets the rollup job's identifier in the
	 * rollup index. For example:
	 * 
	 * <pre>
	 * <code>POST my_rollup_index/_delete_by_query
	 * {
	 *   &quot;query&quot;: {
	 *     &quot;term&quot;: {
	 *       &quot;_rollup.id&quot;: &quot;the_rollup_job_id&quot;
	 *     }
	 *   }
	 * }
	 * </code>
	 * </pre>
	 *
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteJobRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-rollup-delete-job">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteJobResponse deleteJob(Function<DeleteJobRequest.Builder, ObjectBuilder<DeleteJobRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteJob(fn.apply(new DeleteJobRequest.Builder()).build());
	}

	// ----- Endpoint: rollup.get_jobs

	/**
	 * Get rollup job information. Get the configuration, stats, and status of
	 * rollup jobs.
	 * <p>
	 * NOTE: This API returns only active (both <code>STARTED</code> and
	 * <code>STOPPED</code>) jobs. If a job was created, ran for a while, then was
	 * deleted, the API does not return any details about it. For details about a
	 * historical rollup job, the rollup capabilities API may be more useful.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-rollup-get-jobs">Documentation
	 *      on elastic.co</a>
	 */

	public GetJobsResponse getJobs(GetJobsRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetJobsRequest, GetJobsResponse, ErrorResponse> endpoint = (JsonEndpoint<GetJobsRequest, GetJobsResponse, ErrorResponse>) GetJobsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get rollup job information. Get the configuration, stats, and status of
	 * rollup jobs.
	 * <p>
	 * NOTE: This API returns only active (both <code>STARTED</code> and
	 * <code>STOPPED</code>) jobs. If a job was created, ran for a while, then was
	 * deleted, the API does not return any details about it. For details about a
	 * historical rollup job, the rollup capabilities API may be more useful.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetJobsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-rollup-get-jobs">Documentation
	 *      on elastic.co</a>
	 */

	public final GetJobsResponse getJobs(Function<GetJobsRequest.Builder, ObjectBuilder<GetJobsRequest>> fn)
			throws IOException, ElasticsearchException {
		return getJobs(fn.apply(new GetJobsRequest.Builder()).build());
	}

	/**
	 * Get rollup job information. Get the configuration, stats, and status of
	 * rollup jobs.
	 * <p>
	 * NOTE: This API returns only active (both <code>STARTED</code> and
	 * <code>STOPPED</code>) jobs. If a job was created, ran for a while, then was
	 * deleted, the API does not return any details about it. For details about a
	 * historical rollup job, the rollup capabilities API may be more useful.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-rollup-get-jobs">Documentation
	 *      on elastic.co</a>
	 */

	public GetJobsResponse getJobs() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetJobsRequest.Builder().build(), GetJobsRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: rollup.get_rollup_caps

	/**
	 * Get the rollup job capabilities. Get the capabilities of any rollup jobs that
	 * have been configured for a specific index or index pattern.
	 * <p>
	 * This API is useful because a rollup job is often configured to rollup only a
	 * subset of fields from the source index. Furthermore, only certain
	 * aggregations can be configured for various fields, leading to a limited
	 * subset of functionality depending on that configuration. This API enables you
	 * to inspect an index and determine:
	 * <ol>
	 * <li>Does this index have associated rollup data somewhere in the
	 * cluster?</li>
	 * <li>If yes to the first question, what fields were rolled up, what
	 * aggregations can be performed, and where does the data live?</li>
	 * </ol>
	 *
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-rollup-get-rollup-caps">Documentation
	 *      on elastic.co</a>
	 */

	public GetRollupCapsResponse getRollupCaps(GetRollupCapsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetRollupCapsRequest, GetRollupCapsResponse, ErrorResponse> endpoint = (JsonEndpoint<GetRollupCapsRequest, GetRollupCapsResponse, ErrorResponse>) GetRollupCapsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get the rollup job capabilities. Get the capabilities of any rollup jobs that
	 * have been configured for a specific index or index pattern.
	 * <p>
	 * This API is useful because a rollup job is often configured to rollup only a
	 * subset of fields from the source index. Furthermore, only certain
	 * aggregations can be configured for various fields, leading to a limited
	 * subset of functionality depending on that configuration. This API enables you
	 * to inspect an index and determine:
	 * <ol>
	 * <li>Does this index have associated rollup data somewhere in the
	 * cluster?</li>
	 * <li>If yes to the first question, what fields were rolled up, what
	 * aggregations can be performed, and where does the data live?</li>
	 * </ol>
	 *
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetRollupCapsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-rollup-get-rollup-caps">Documentation
	 *      on elastic.co</a>
	 */

	public final GetRollupCapsResponse getRollupCaps(
			Function<GetRollupCapsRequest.Builder, ObjectBuilder<GetRollupCapsRequest>> fn)
			throws IOException, ElasticsearchException {
		return getRollupCaps(fn.apply(new GetRollupCapsRequest.Builder()).build());
	}

	/**
	 * Get the rollup job capabilities. Get the capabilities of any rollup jobs that
	 * have been configured for a specific index or index pattern.
	 * <p>
	 * This API is useful because a rollup job is often configured to rollup only a
	 * subset of fields from the source index. Furthermore, only certain
	 * aggregations can be configured for various fields, leading to a limited
	 * subset of functionality depending on that configuration. This API enables you
	 * to inspect an index and determine:
	 * <ol>
	 * <li>Does this index have associated rollup data somewhere in the
	 * cluster?</li>
	 * <li>If yes to the first question, what fields were rolled up, what
	 * aggregations can be performed, and where does the data live?</li>
	 * </ol>
	 *
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-rollup-get-rollup-caps">Documentation
	 *      on elastic.co</a>
	 */

	public GetRollupCapsResponse getRollupCaps() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetRollupCapsRequest.Builder().build(), GetRollupCapsRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: rollup.get_rollup_index_caps

	/**
	 * Get the rollup index capabilities. Get the rollup capabilities of all jobs
	 * inside of a rollup index. A single rollup index may store the data for
	 * multiple rollup jobs and may have a variety of capabilities depending on
	 * those jobs. This API enables you to determine:
	 * <ul>
	 * <li>What jobs are stored in an index (or indices specified via a
	 * pattern)?</li>
	 * <li>What target indices were rolled up, what fields were used in those
	 * rollups, and what aggregations can be performed on each job?</li>
	 * </ul>
	 *
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-rollup-get-rollup-index-caps">Documentation
	 *      on elastic.co</a>
	 */

	public GetRollupIndexCapsResponse getRollupIndexCaps(GetRollupIndexCapsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetRollupIndexCapsRequest, GetRollupIndexCapsResponse, ErrorResponse> endpoint = (JsonEndpoint<GetRollupIndexCapsRequest, GetRollupIndexCapsResponse, ErrorResponse>) GetRollupIndexCapsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get the rollup index capabilities. Get the rollup capabilities of all jobs
	 * inside of a rollup index. A single rollup index may store the data for
	 * multiple rollup jobs and may have a variety of capabilities depending on
	 * those jobs. This API enables you to determine:
	 * <ul>
	 * <li>What jobs are stored in an index (or indices specified via a
	 * pattern)?</li>
	 * <li>What target indices were rolled up, what fields were used in those
	 * rollups, and what aggregations can be performed on each job?</li>
	 * </ul>
	 *
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetRollupIndexCapsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-rollup-get-rollup-index-caps">Documentation
	 *      on elastic.co</a>
	 */

	public final GetRollupIndexCapsResponse getRollupIndexCaps(
			Function<GetRollupIndexCapsRequest.Builder, ObjectBuilder<GetRollupIndexCapsRequest>> fn)
			throws IOException, ElasticsearchException {
		return getRollupIndexCaps(fn.apply(new GetRollupIndexCapsRequest.Builder()).build());
	}

	// ----- Endpoint: rollup.put_job

	/**
	 * Create a rollup job.
	 * <p>
	 * WARNING: From 8.15.0, calling this API in a cluster with no rollup usage will
	 * fail with a message about the deprecation and planned removal of rollup
	 * features. A cluster needs to contain either a rollup job or a rollup index in
	 * order for this API to be allowed to run.
	 * <p>
	 * The rollup job configuration contains all the details about how the job
	 * should run, when it indexes documents, and what future queries will be able
	 * to run against the rollup index.
	 * <p>
	 * There are three main sections to the job configuration: the logistical
	 * details about the job (for example, the cron schedule), the fields that are
	 * used for grouping, and what metrics to collect for each group.
	 * <p>
	 * Jobs are created in a <code>STOPPED</code> state. You can start them with the
	 * start rollup jobs API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-rollup-put-job">Documentation
	 *      on elastic.co</a>
	 */

	public PutJobResponse putJob(PutJobRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutJobRequest, PutJobResponse, ErrorResponse> endpoint = (JsonEndpoint<PutJobRequest, PutJobResponse, ErrorResponse>) PutJobRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Create a rollup job.
	 * <p>
	 * WARNING: From 8.15.0, calling this API in a cluster with no rollup usage will
	 * fail with a message about the deprecation and planned removal of rollup
	 * features. A cluster needs to contain either a rollup job or a rollup index in
	 * order for this API to be allowed to run.
	 * <p>
	 * The rollup job configuration contains all the details about how the job
	 * should run, when it indexes documents, and what future queries will be able
	 * to run against the rollup index.
	 * <p>
	 * There are three main sections to the job configuration: the logistical
	 * details about the job (for example, the cron schedule), the fields that are
	 * used for grouping, and what metrics to collect for each group.
	 * <p>
	 * Jobs are created in a <code>STOPPED</code> state. You can start them with the
	 * start rollup jobs API.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutJobRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-rollup-put-job">Documentation
	 *      on elastic.co</a>
	 */

	public final PutJobResponse putJob(Function<PutJobRequest.Builder, ObjectBuilder<PutJobRequest>> fn)
			throws IOException, ElasticsearchException {
		return putJob(fn.apply(new PutJobRequest.Builder()).build());
	}

	// ----- Endpoint: rollup.rollup_search

	/**
	 * Search rolled-up data. The rollup search endpoint is needed because,
	 * internally, rolled-up documents utilize a different document structure than
	 * the original data. It rewrites standard Query DSL into a format that matches
	 * the rollup documents then takes the response and rewrites it back to what a
	 * client would expect given the original query.
	 * <p>
	 * The request body supports a subset of features from the regular search API.
	 * The following functionality is not available:
	 * <p>
	 * <code>size</code>: Because rollups work on pre-aggregated data, no search
	 * hits can be returned and so size must be set to zero or omitted entirely.
	 * <code>highlighter</code>, <code>suggestors</code>, <code>post_filter</code>,
	 * <code>profile</code>, <code>explain</code>: These are similarly disallowed.
	 * <p>
	 * <strong>Searching both historical rollup and non-rollup data</strong>
	 * <p>
	 * The rollup search API has the capability to search across both
	 * &quot;live&quot; non-rollup data and the aggregated rollup data. This is done
	 * by simply adding the live indices to the URI. For example:
	 * 
	 * <pre>
	 * <code>GET sensor-1,sensor_rollup/_rollup_search
	 * {
	 *   &quot;size&quot;: 0,
	 *   &quot;aggregations&quot;: {
	 *      &quot;max_temperature&quot;: {
	 *       &quot;max&quot;: {
	 *         &quot;field&quot;: &quot;temperature&quot;
	 *       }
	 *     }
	 *   }
	 * }
	 * </code>
	 * </pre>
	 * <p>
	 * The rollup search endpoint does two things when the search runs:
	 * <ul>
	 * <li>The original request is sent to the non-rollup index unaltered.</li>
	 * <li>A rewritten version of the original request is sent to the rollup
	 * index.</li>
	 * </ul>
	 * <p>
	 * When the two responses are received, the endpoint rewrites the rollup
	 * response and merges the two together. During the merging process, if there is
	 * any overlap in buckets between the two responses, the buckets from the
	 * non-rollup index are used.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-rollup-rollup-search">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> RollupSearchResponse<TDocument> rollupSearch(RollupSearchRequest request,
			Class<TDocument> tDocumentClass) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<RollupSearchRequest, RollupSearchResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<RollupSearchRequest, RollupSearchResponse<TDocument>, ErrorResponse>) RollupSearchRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:rollup.rollup_search.Response.TDocument",
				getDeserializer(tDocumentClass));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Search rolled-up data. The rollup search endpoint is needed because,
	 * internally, rolled-up documents utilize a different document structure than
	 * the original data. It rewrites standard Query DSL into a format that matches
	 * the rollup documents then takes the response and rewrites it back to what a
	 * client would expect given the original query.
	 * <p>
	 * The request body supports a subset of features from the regular search API.
	 * The following functionality is not available:
	 * <p>
	 * <code>size</code>: Because rollups work on pre-aggregated data, no search
	 * hits can be returned and so size must be set to zero or omitted entirely.
	 * <code>highlighter</code>, <code>suggestors</code>, <code>post_filter</code>,
	 * <code>profile</code>, <code>explain</code>: These are similarly disallowed.
	 * <p>
	 * <strong>Searching both historical rollup and non-rollup data</strong>
	 * <p>
	 * The rollup search API has the capability to search across both
	 * &quot;live&quot; non-rollup data and the aggregated rollup data. This is done
	 * by simply adding the live indices to the URI. For example:
	 * 
	 * <pre>
	 * <code>GET sensor-1,sensor_rollup/_rollup_search
	 * {
	 *   &quot;size&quot;: 0,
	 *   &quot;aggregations&quot;: {
	 *      &quot;max_temperature&quot;: {
	 *       &quot;max&quot;: {
	 *         &quot;field&quot;: &quot;temperature&quot;
	 *       }
	 *     }
	 *   }
	 * }
	 * </code>
	 * </pre>
	 * <p>
	 * The rollup search endpoint does two things when the search runs:
	 * <ul>
	 * <li>The original request is sent to the non-rollup index unaltered.</li>
	 * <li>A rewritten version of the original request is sent to the rollup
	 * index.</li>
	 * </ul>
	 * <p>
	 * When the two responses are received, the endpoint rewrites the rollup
	 * response and merges the two together. During the merging process, if there is
	 * any overlap in buckets between the two responses, the buckets from the
	 * non-rollup index are used.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link RollupSearchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-rollup-rollup-search">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> RollupSearchResponse<TDocument> rollupSearch(
			Function<RollupSearchRequest.Builder, ObjectBuilder<RollupSearchRequest>> fn,
			Class<TDocument> tDocumentClass) throws IOException, ElasticsearchException {
		return rollupSearch(fn.apply(new RollupSearchRequest.Builder()).build(), tDocumentClass);
	}

	/**
	 * Overload of {@link #rollupSearch(RollupSearchRequest, Class)}, where Class is
	 * defined as Void, meaning the documents will not be deserialized.
	 */

	public RollupSearchResponse<Void> rollupSearch(RollupSearchRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<RollupSearchRequest, RollupSearchResponse<Void>, ErrorResponse> endpoint = (JsonEndpoint<RollupSearchRequest, RollupSearchResponse<Void>, ErrorResponse>) RollupSearchRequest._ENDPOINT;
		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Overload of {@link #rollupSearch(Function, Class)}, where Class is defined as
	 * Void, meaning the documents will not be deserialized.
	 */

	public final RollupSearchResponse<Void> rollupSearch(
			Function<RollupSearchRequest.Builder, ObjectBuilder<RollupSearchRequest>> fn)
			throws IOException, ElasticsearchException {
		return rollupSearch(fn.apply(new RollupSearchRequest.Builder()).build(), Void.class);
	}

	/**
	 * Search rolled-up data. The rollup search endpoint is needed because,
	 * internally, rolled-up documents utilize a different document structure than
	 * the original data. It rewrites standard Query DSL into a format that matches
	 * the rollup documents then takes the response and rewrites it back to what a
	 * client would expect given the original query.
	 * <p>
	 * The request body supports a subset of features from the regular search API.
	 * The following functionality is not available:
	 * <p>
	 * <code>size</code>: Because rollups work on pre-aggregated data, no search
	 * hits can be returned and so size must be set to zero or omitted entirely.
	 * <code>highlighter</code>, <code>suggestors</code>, <code>post_filter</code>,
	 * <code>profile</code>, <code>explain</code>: These are similarly disallowed.
	 * <p>
	 * <strong>Searching both historical rollup and non-rollup data</strong>
	 * <p>
	 * The rollup search API has the capability to search across both
	 * &quot;live&quot; non-rollup data and the aggregated rollup data. This is done
	 * by simply adding the live indices to the URI. For example:
	 * 
	 * <pre>
	 * <code>GET sensor-1,sensor_rollup/_rollup_search
	 * {
	 *   &quot;size&quot;: 0,
	 *   &quot;aggregations&quot;: {
	 *      &quot;max_temperature&quot;: {
	 *       &quot;max&quot;: {
	 *         &quot;field&quot;: &quot;temperature&quot;
	 *       }
	 *     }
	 *   }
	 * }
	 * </code>
	 * </pre>
	 * <p>
	 * The rollup search endpoint does two things when the search runs:
	 * <ul>
	 * <li>The original request is sent to the non-rollup index unaltered.</li>
	 * <li>A rewritten version of the original request is sent to the rollup
	 * index.</li>
	 * </ul>
	 * <p>
	 * When the two responses are received, the endpoint rewrites the rollup
	 * response and merges the two together. During the merging process, if there is
	 * any overlap in buckets between the two responses, the buckets from the
	 * non-rollup index are used.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-rollup-rollup-search">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> RollupSearchResponse<TDocument> rollupSearch(RollupSearchRequest request, Type tDocumentType)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<RollupSearchRequest, RollupSearchResponse<TDocument>, ErrorResponse> endpoint = (JsonEndpoint<RollupSearchRequest, RollupSearchResponse<TDocument>, ErrorResponse>) RollupSearchRequest._ENDPOINT;
		endpoint = new EndpointWithResponseMapperAttr<>(endpoint,
				"co.elastic.clients:Deserializer:rollup.rollup_search.Response.TDocument",
				getDeserializer(tDocumentType));

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Search rolled-up data. The rollup search endpoint is needed because,
	 * internally, rolled-up documents utilize a different document structure than
	 * the original data. It rewrites standard Query DSL into a format that matches
	 * the rollup documents then takes the response and rewrites it back to what a
	 * client would expect given the original query.
	 * <p>
	 * The request body supports a subset of features from the regular search API.
	 * The following functionality is not available:
	 * <p>
	 * <code>size</code>: Because rollups work on pre-aggregated data, no search
	 * hits can be returned and so size must be set to zero or omitted entirely.
	 * <code>highlighter</code>, <code>suggestors</code>, <code>post_filter</code>,
	 * <code>profile</code>, <code>explain</code>: These are similarly disallowed.
	 * <p>
	 * <strong>Searching both historical rollup and non-rollup data</strong>
	 * <p>
	 * The rollup search API has the capability to search across both
	 * &quot;live&quot; non-rollup data and the aggregated rollup data. This is done
	 * by simply adding the live indices to the URI. For example:
	 * 
	 * <pre>
	 * <code>GET sensor-1,sensor_rollup/_rollup_search
	 * {
	 *   &quot;size&quot;: 0,
	 *   &quot;aggregations&quot;: {
	 *      &quot;max_temperature&quot;: {
	 *       &quot;max&quot;: {
	 *         &quot;field&quot;: &quot;temperature&quot;
	 *       }
	 *     }
	 *   }
	 * }
	 * </code>
	 * </pre>
	 * <p>
	 * The rollup search endpoint does two things when the search runs:
	 * <ul>
	 * <li>The original request is sent to the non-rollup index unaltered.</li>
	 * <li>A rewritten version of the original request is sent to the rollup
	 * index.</li>
	 * </ul>
	 * <p>
	 * When the two responses are received, the endpoint rewrites the rollup
	 * response and merges the two together. During the merging process, if there is
	 * any overlap in buckets between the two responses, the buckets from the
	 * non-rollup index are used.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link RollupSearchRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-rollup-rollup-search">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> RollupSearchResponse<TDocument> rollupSearch(
			Function<RollupSearchRequest.Builder, ObjectBuilder<RollupSearchRequest>> fn, Type tDocumentType)
			throws IOException, ElasticsearchException {
		return rollupSearch(fn.apply(new RollupSearchRequest.Builder()).build(), tDocumentType);
	}

	// ----- Endpoint: rollup.start_job

	/**
	 * Start rollup jobs. If you try to start a job that does not exist, an
	 * exception occurs. If you try to start a job that is already started, nothing
	 * happens.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-rollup-start-job">Documentation
	 *      on elastic.co</a>
	 */

	public StartJobResponse startJob(StartJobRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<StartJobRequest, StartJobResponse, ErrorResponse> endpoint = (JsonEndpoint<StartJobRequest, StartJobResponse, ErrorResponse>) StartJobRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Start rollup jobs. If you try to start a job that does not exist, an
	 * exception occurs. If you try to start a job that is already started, nothing
	 * happens.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link StartJobRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-rollup-start-job">Documentation
	 *      on elastic.co</a>
	 */

	public final StartJobResponse startJob(Function<StartJobRequest.Builder, ObjectBuilder<StartJobRequest>> fn)
			throws IOException, ElasticsearchException {
		return startJob(fn.apply(new StartJobRequest.Builder()).build());
	}

	// ----- Endpoint: rollup.stop_job

	/**
	 * Stop rollup jobs. If you try to stop a job that does not exist, an exception
	 * occurs. If you try to stop a job that is already stopped, nothing happens.
	 * <p>
	 * Since only a stopped job can be deleted, it can be useful to block the API
	 * until the indexer has fully stopped. This is accomplished with the
	 * <code>wait_for_completion</code> query parameter, and optionally a timeout.
	 * For example:
	 * 
	 * <pre>
	 * <code>POST _rollup/job/sensor/_stop?wait_for_completion=true&amp;timeout=10s
	 * </code>
	 * </pre>
	 * <p>
	 * The parameter blocks the API call from returning until either the job has
	 * moved to STOPPED or the specified time has elapsed. If the specified time
	 * elapses without the job moving to STOPPED, a timeout exception occurs.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-rollup-stop-job">Documentation
	 *      on elastic.co</a>
	 */

	public StopJobResponse stopJob(StopJobRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<StopJobRequest, StopJobResponse, ErrorResponse> endpoint = (JsonEndpoint<StopJobRequest, StopJobResponse, ErrorResponse>) StopJobRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Stop rollup jobs. If you try to stop a job that does not exist, an exception
	 * occurs. If you try to stop a job that is already stopped, nothing happens.
	 * <p>
	 * Since only a stopped job can be deleted, it can be useful to block the API
	 * until the indexer has fully stopped. This is accomplished with the
	 * <code>wait_for_completion</code> query parameter, and optionally a timeout.
	 * For example:
	 * 
	 * <pre>
	 * <code>POST _rollup/job/sensor/_stop?wait_for_completion=true&amp;timeout=10s
	 * </code>
	 * </pre>
	 * <p>
	 * The parameter blocks the API call from returning until either the job has
	 * moved to STOPPED or the specified time has elapsed. If the specified time
	 * elapses without the job moving to STOPPED, a timeout exception occurs.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link StopJobRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-rollup-stop-job">Documentation
	 *      on elastic.co</a>
	 */

	public final StopJobResponse stopJob(Function<StopJobRequest.Builder, ObjectBuilder<StopJobRequest>> fn)
			throws IOException, ElasticsearchException {
		return stopJob(fn.apply(new StopJobRequest.Builder()).build());
	}

}
