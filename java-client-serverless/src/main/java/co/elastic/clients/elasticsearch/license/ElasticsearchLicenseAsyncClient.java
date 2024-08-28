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

package co.elastic.clients.elasticsearch.license;

import co.elastic.clients.ApiClient;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.JsonEndpoint;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.util.ObjectBuilder;
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
 * Client for the license namespace.
 */
public class ElasticsearchLicenseAsyncClient
		extends
			ApiClient<ElasticsearchTransport, ElasticsearchLicenseAsyncClient> {

	public ElasticsearchLicenseAsyncClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchLicenseAsyncClient(ElasticsearchTransport transport,
			@Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchLicenseAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchLicenseAsyncClient(this.transport, transportOptions);
	}

	// ----- Endpoint: license.get

	/**
	 * Get license information. Returns information about your Elastic license,
	 * including its type, its status, when it was issued, and when it expires. For
	 * more information about the different types of licenses, refer to
	 * <a href="https://www.elastic.co/subscriptions">Elastic Stack
	 * subscriptions</a>.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-license.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetLicenseResponse> get(GetLicenseRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetLicenseRequest, GetLicenseResponse, ErrorResponse> endpoint = (JsonEndpoint<GetLicenseRequest, GetLicenseResponse, ErrorResponse>) GetLicenseRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get license information. Returns information about your Elastic license,
	 * including its type, its status, when it was issued, and when it expires. For
	 * more information about the different types of licenses, refer to
	 * <a href="https://www.elastic.co/subscriptions">Elastic Stack
	 * subscriptions</a>.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetLicenseRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-license.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetLicenseResponse> get(
			Function<GetLicenseRequest.Builder, ObjectBuilder<GetLicenseRequest>> fn) {
		return get(fn.apply(new GetLicenseRequest.Builder()).build());
	}

	/**
	 * Get license information. Returns information about your Elastic license,
	 * including its type, its status, when it was issued, and when it expires. For
	 * more information about the different types of licenses, refer to
	 * <a href="https://www.elastic.co/subscriptions">Elastic Stack
	 * subscriptions</a>.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-license.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetLicenseResponse> get() {
		return this.transport.performRequestAsync(new GetLicenseRequest.Builder().build(), GetLicenseRequest._ENDPOINT,
				this.transportOptions);
	}

}
