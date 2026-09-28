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

}
