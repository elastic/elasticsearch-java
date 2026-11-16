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

package co.elastic.clients.elasticsearch.prometheus;

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
 * Client for the prometheus namespace.
 */
public class ElasticsearchPrometheusClient extends ApiClient<ElasticsearchTransport, ElasticsearchPrometheusClient> {

	public ElasticsearchPrometheusClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchPrometheusClient(ElasticsearchTransport transport,
			@Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchPrometheusClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchPrometheusClient(this.transport, transportOptions);
	}

	// ----- Endpoint: prometheus.status_buildinfo

	/**
	 * Get Prometheus build information.
	 * <p>
	 * Get Elasticsearch build information in the format of the Prometheus
	 * <code>/api/v1/status/buildinfo</code> endpoint. Prometheus-compatible
	 * clients, such as Grafana, call this endpoint to identify the backend and the
	 * features it supports.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch#TODO">Documentation
	 *      on elastic.co</a>
	 */

	public StatusBuildinfoResponse statusBuildinfo(StatusBuildinfoRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<StatusBuildinfoRequest, StatusBuildinfoResponse, ErrorResponse> endpoint = (JsonEndpoint<StatusBuildinfoRequest, StatusBuildinfoResponse, ErrorResponse>) StatusBuildinfoRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get Prometheus build information.
	 * <p>
	 * Get Elasticsearch build information in the format of the Prometheus
	 * <code>/api/v1/status/buildinfo</code> endpoint. Prometheus-compatible
	 * clients, such as Grafana, call this endpoint to identify the backend and the
	 * features it supports.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link StatusBuildinfoRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch#TODO">Documentation
	 *      on elastic.co</a>
	 */

	public final StatusBuildinfoResponse statusBuildinfo(
			Function<StatusBuildinfoRequest.Builder, ObjectBuilder<StatusBuildinfoRequest>> fn)
			throws IOException, ElasticsearchException {
		return statusBuildinfo(fn.apply(new StatusBuildinfoRequest.Builder()).build());
	}

	/**
	 * Get Prometheus build information.
	 * <p>
	 * Get Elasticsearch build information in the format of the Prometheus
	 * <code>/api/v1/status/buildinfo</code> endpoint. Prometheus-compatible
	 * clients, such as Grafana, call this endpoint to identify the backend and the
	 * features it supports.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch#TODO">Documentation
	 *      on elastic.co</a>
	 */

	public StatusBuildinfoResponse statusBuildinfo() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new StatusBuildinfoRequest.Builder().build(),
				StatusBuildinfoRequest._ENDPOINT, this.transportOptions);
	}

}
