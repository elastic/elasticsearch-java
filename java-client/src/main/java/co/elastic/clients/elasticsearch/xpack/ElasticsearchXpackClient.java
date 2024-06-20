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

package co.elastic.clients.elasticsearch.xpack;

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
 * Client for the xpack namespace.
 */
public class ElasticsearchXpackClient extends ApiClient<ElasticsearchTransport, ElasticsearchXpackClient> {

	public ElasticsearchXpackClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchXpackClient(ElasticsearchTransport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchXpackClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchXpackClient(this.transport, transportOptions);
	}

	// ----- Endpoint: xpack.info

	/**
	 * Provides general information about the installed X-Pack features.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/info-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public XpackInfoResponse info(XpackInfoRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<XpackInfoRequest, XpackInfoResponse, ErrorResponse> endpoint = (JsonEndpoint<XpackInfoRequest, XpackInfoResponse, ErrorResponse>) XpackInfoRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Provides general information about the installed X-Pack features.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link XpackInfoRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/info-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final XpackInfoResponse info(Function<XpackInfoRequest.Builder, ObjectBuilder<XpackInfoRequest>> fn)
			throws IOException, ElasticsearchException {
		return info(fn.apply(new XpackInfoRequest.Builder()).build());
	}

	/**
	 * Provides general information about the installed X-Pack features.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/info-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public XpackInfoResponse info() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new XpackInfoRequest.Builder().build(), XpackInfoRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: xpack.usage

	/**
	 * This API provides information about which features are currently enabled and
	 * available under the current license and some usage statistics.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/usage-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public XpackUsageResponse usage(XpackUsageRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<XpackUsageRequest, XpackUsageResponse, ErrorResponse> endpoint = (JsonEndpoint<XpackUsageRequest, XpackUsageResponse, ErrorResponse>) XpackUsageRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * This API provides information about which features are currently enabled and
	 * available under the current license and some usage statistics.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link XpackUsageRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/usage-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final XpackUsageResponse usage(Function<XpackUsageRequest.Builder, ObjectBuilder<XpackUsageRequest>> fn)
			throws IOException, ElasticsearchException {
		return usage(fn.apply(new XpackUsageRequest.Builder()).build());
	}

	/**
	 * This API provides information about which features are currently enabled and
	 * available under the current license and some usage statistics.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/usage-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public XpackUsageResponse usage() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new XpackUsageRequest.Builder().build(), XpackUsageRequest._ENDPOINT,
				this.transportOptions);
	}

}
