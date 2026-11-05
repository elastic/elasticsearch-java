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

package co.elastic.clients.elasticsearch.data_recovery;

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
 * Client for the data_recovery namespace.
 */
public class ElasticsearchDataRecoveryClient
		extends
			ApiClient<ElasticsearchTransport, ElasticsearchDataRecoveryClient> {

	public ElasticsearchDataRecoveryClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchDataRecoveryClient(ElasticsearchTransport transport,
			@Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchDataRecoveryClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchDataRecoveryClient(this.transport, transportOptions);
	}

	// ----- Endpoint: data_recovery.get_recovery

	/**
	 * Get a recovery.
	 * <p>
	 * Get the status and details of a recovery that was started with the start
	 * recovery API. This API is intended for internal operator use. The progress of
	 * a running recovery is reported as a percentage, and the repository and audit
	 * details of the recovery are not exposed.
	 * 
	 * @see <a href="https://www.elastic.co">Documentation on elastic.co</a>
	 */

	public GetRecoveryResponse getRecovery(GetRecoveryRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetRecoveryRequest, GetRecoveryResponse, ErrorResponse> endpoint = (JsonEndpoint<GetRecoveryRequest, GetRecoveryResponse, ErrorResponse>) GetRecoveryRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get a recovery.
	 * <p>
	 * Get the status and details of a recovery that was started with the start
	 * recovery API. This API is intended for internal operator use. The progress of
	 * a running recovery is reported as a percentage, and the repository and audit
	 * details of the recovery are not exposed.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetRecoveryRequest}
	 * @see <a href="https://www.elastic.co">Documentation on elastic.co</a>
	 */

	public final GetRecoveryResponse getRecovery(
			Function<GetRecoveryRequest.Builder, ObjectBuilder<GetRecoveryRequest>> fn)
			throws IOException, ElasticsearchException {
		return getRecovery(fn.apply(new GetRecoveryRequest.Builder()).build());
	}

	// ----- Endpoint: data_recovery.get_recovery_points

	/**
	 * Get recovery points.
	 * <p>
	 * Get recovery points from the platform-managed data recovery repository. This
	 * API is intended for internal operator use. Recovery points are returned in
	 * descending order by end time. Repository, snapshot, and policy identifiers
	 * are not exposed.
	 * 
	 * @see <a href="https://www.elastic.co">Documentation on elastic.co</a>
	 */

	public GetRecoveryPointsResponse getRecoveryPoints(GetRecoveryPointsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetRecoveryPointsRequest, GetRecoveryPointsResponse, ErrorResponse> endpoint = (JsonEndpoint<GetRecoveryPointsRequest, GetRecoveryPointsResponse, ErrorResponse>) GetRecoveryPointsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get recovery points.
	 * <p>
	 * Get recovery points from the platform-managed data recovery repository. This
	 * API is intended for internal operator use. Recovery points are returned in
	 * descending order by end time. Repository, snapshot, and policy identifiers
	 * are not exposed.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetRecoveryPointsRequest}
	 * @see <a href="https://www.elastic.co">Documentation on elastic.co</a>
	 */

	public final GetRecoveryPointsResponse getRecoveryPoints(
			Function<GetRecoveryPointsRequest.Builder, ObjectBuilder<GetRecoveryPointsRequest>> fn)
			throws IOException, ElasticsearchException {
		return getRecoveryPoints(fn.apply(new GetRecoveryPointsRequest.Builder()).build());
	}

	/**
	 * Get recovery points.
	 * <p>
	 * Get recovery points from the platform-managed data recovery repository. This
	 * API is intended for internal operator use. Recovery points are returned in
	 * descending order by end time. Repository, snapshot, and policy identifiers
	 * are not exposed.
	 * 
	 * @see <a href="https://www.elastic.co">Documentation on elastic.co</a>
	 */

	public GetRecoveryPointsResponse getRecoveryPoints() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetRecoveryPointsRequest.Builder().build(),
				GetRecoveryPointsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: data_recovery.get_recovery_sources

	/**
	 * Get recovery sources.
	 * <p>
	 * Get the logical sources captured at an exact recovery point in the
	 * platform-managed data recovery repository. This API is intended for internal
	 * operator use. Repository, snapshot, and policy identifiers are not exposed.
	 * 
	 * @see <a href="https://www.elastic.co">Documentation on elastic.co</a>
	 */

	public GetRecoverySourcesResponse getRecoverySources(GetRecoverySourcesRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetRecoverySourcesRequest, GetRecoverySourcesResponse, ErrorResponse> endpoint = (JsonEndpoint<GetRecoverySourcesRequest, GetRecoverySourcesResponse, ErrorResponse>) GetRecoverySourcesRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get recovery sources.
	 * <p>
	 * Get the logical sources captured at an exact recovery point in the
	 * platform-managed data recovery repository. This API is intended for internal
	 * operator use. Repository, snapshot, and policy identifiers are not exposed.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetRecoverySourcesRequest}
	 * @see <a href="https://www.elastic.co">Documentation on elastic.co</a>
	 */

	public final GetRecoverySourcesResponse getRecoverySources(
			Function<GetRecoverySourcesRequest.Builder, ObjectBuilder<GetRecoverySourcesRequest>> fn)
			throws IOException, ElasticsearchException {
		return getRecoverySources(fn.apply(new GetRecoverySourcesRequest.Builder()).build());
	}

	// ----- Endpoint: data_recovery.get_rpo_series

	/**
	 * Get the recovery point objective series.
	 * <p>
	 * Get, for each bucket in the half-open range <code>[start, end)</code>, the
	 * maximum age that the newest recoverable state reached during that bucket.
	 * This API is intended for internal operator use. The range is divided into at
	 * most 1,000 buckets. A bucket has no value if no retained recovery point
	 * covers its start.
	 * 
	 * @see <a href="https://www.elastic.co">Documentation on elastic.co</a>
	 */

	public GetRpoSeriesResponse getRpoSeries(GetRpoSeriesRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetRpoSeriesRequest, GetRpoSeriesResponse, ErrorResponse> endpoint = (JsonEndpoint<GetRpoSeriesRequest, GetRpoSeriesResponse, ErrorResponse>) GetRpoSeriesRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get the recovery point objective series.
	 * <p>
	 * Get, for each bucket in the half-open range <code>[start, end)</code>, the
	 * maximum age that the newest recoverable state reached during that bucket.
	 * This API is intended for internal operator use. The range is divided into at
	 * most 1,000 buckets. A bucket has no value if no retained recovery point
	 * covers its start.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetRpoSeriesRequest}
	 * @see <a href="https://www.elastic.co">Documentation on elastic.co</a>
	 */

	public final GetRpoSeriesResponse getRpoSeries(
			Function<GetRpoSeriesRequest.Builder, ObjectBuilder<GetRpoSeriesRequest>> fn)
			throws IOException, ElasticsearchException {
		return getRpoSeries(fn.apply(new GetRpoSeriesRequest.Builder()).build());
	}

	/**
	 * Get the recovery point objective series.
	 * <p>
	 * Get, for each bucket in the half-open range <code>[start, end)</code>, the
	 * maximum age that the newest recoverable state reached during that bucket.
	 * This API is intended for internal operator use. The range is divided into at
	 * most 1,000 buckets. A bucket has no value if no retained recovery point
	 * covers its start.
	 * 
	 * @see <a href="https://www.elastic.co">Documentation on elastic.co</a>
	 */

	public GetRpoSeriesResponse getRpoSeries() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetRpoSeriesRequest.Builder().build(), GetRpoSeriesRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: data_recovery.list_recoveries

	/**
	 * List recoveries.
	 * <p>
	 * List the recoveries that were started with the start recovery API, including
	 * those that have finished. This API is intended for internal operator use.
	 * Recoveries are ordered by start time, and the most recent are returned first
	 * by default. To retrieve further pages, pass the start time and identifier of
	 * the last recovery of a page as <code>search_after_started_at</code> and
	 * <code>search_after_recovery_id</code>.
	 * 
	 * @see <a href="https://www.elastic.co">Documentation on elastic.co</a>
	 */

	public ListRecoveriesResponse listRecoveries(ListRecoveriesRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ListRecoveriesRequest, ListRecoveriesResponse, ErrorResponse> endpoint = (JsonEndpoint<ListRecoveriesRequest, ListRecoveriesResponse, ErrorResponse>) ListRecoveriesRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * List recoveries.
	 * <p>
	 * List the recoveries that were started with the start recovery API, including
	 * those that have finished. This API is intended for internal operator use.
	 * Recoveries are ordered by start time, and the most recent are returned first
	 * by default. To retrieve further pages, pass the start time and identifier of
	 * the last recovery of a page as <code>search_after_started_at</code> and
	 * <code>search_after_recovery_id</code>.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ListRecoveriesRequest}
	 * @see <a href="https://www.elastic.co">Documentation on elastic.co</a>
	 */

	public final ListRecoveriesResponse listRecoveries(
			Function<ListRecoveriesRequest.Builder, ObjectBuilder<ListRecoveriesRequest>> fn)
			throws IOException, ElasticsearchException {
		return listRecoveries(fn.apply(new ListRecoveriesRequest.Builder()).build());
	}

	/**
	 * List recoveries.
	 * <p>
	 * List the recoveries that were started with the start recovery API, including
	 * those that have finished. This API is intended for internal operator use.
	 * Recoveries are ordered by start time, and the most recent are returned first
	 * by default. To retrieve further pages, pass the start time and identifier of
	 * the last recovery of a page as <code>search_after_started_at</code> and
	 * <code>search_after_recovery_id</code>.
	 * 
	 * @see <a href="https://www.elastic.co">Documentation on elastic.co</a>
	 */

	public ListRecoveriesResponse listRecoveries() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new ListRecoveriesRequest.Builder().build(),
				ListRecoveriesRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: data_recovery.start_recovery

	/**
	 * Start a recovery.
	 * <p>
	 * Start recovering indices and data streams from a recovery point. This API is
	 * intended for internal operator use. Depending on the mode, the sources are
	 * either replaced with their state at the recovery point, over the data that
	 * currently exists, or recovered under new names. The recovery runs in the
	 * background, so the API returns with a <code>202 Accepted</code> status once
	 * it has started.
	 * 
	 * @see <a href="https://www.elastic.co">Documentation on elastic.co</a>
	 */

	public StartRecoveryResponse startRecovery(StartRecoveryRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<StartRecoveryRequest, StartRecoveryResponse, ErrorResponse> endpoint = (JsonEndpoint<StartRecoveryRequest, StartRecoveryResponse, ErrorResponse>) StartRecoveryRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Start a recovery.
	 * <p>
	 * Start recovering indices and data streams from a recovery point. This API is
	 * intended for internal operator use. Depending on the mode, the sources are
	 * either replaced with their state at the recovery point, over the data that
	 * currently exists, or recovered under new names. The recovery runs in the
	 * background, so the API returns with a <code>202 Accepted</code> status once
	 * it has started.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link StartRecoveryRequest}
	 * @see <a href="https://www.elastic.co">Documentation on elastic.co</a>
	 */

	public final StartRecoveryResponse startRecovery(
			Function<StartRecoveryRequest.Builder, ObjectBuilder<StartRecoveryRequest>> fn)
			throws IOException, ElasticsearchException {
		return startRecovery(fn.apply(new StartRecoveryRequest.Builder()).build());
	}

}
