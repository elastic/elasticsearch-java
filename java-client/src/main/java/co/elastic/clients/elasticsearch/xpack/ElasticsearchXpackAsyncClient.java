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
 * Client for the xpack namespace.
 */
public class ElasticsearchXpackAsyncClient extends ApiClient<ElasticsearchTransport, ElasticsearchXpackAsyncClient> {

	public ElasticsearchXpackAsyncClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchXpackAsyncClient(ElasticsearchTransport transport,
			@Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchXpackAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchXpackAsyncClient(this.transport, transportOptions);
	}

	// ----- Endpoint: xpack.info

	/**
	 * Get information.
	 * <p>
	 * The information provided by the API includes:
	 * <ul>
	 * <li>Build information including the build number and timestamp.</li>
	 * <li>License information about the currently installed license.</li>
	 * <li>Feature information for the features that are currently enabled and
	 * available under the current license.</li>
	 * </ul>
	 *
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-info">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<XpackInfoResponse> info(XpackInfoRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<XpackInfoRequest, XpackInfoResponse, ErrorResponse> endpoint = (JsonEndpoint<XpackInfoRequest, XpackInfoResponse, ErrorResponse>) XpackInfoRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get information.
	 * <p>
	 * The information provided by the API includes:
	 * <ul>
	 * <li>Build information including the build number and timestamp.</li>
	 * <li>License information about the currently installed license.</li>
	 * <li>Feature information for the features that are currently enabled and
	 * available under the current license.</li>
	 * </ul>
	 *
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link XpackInfoRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-info">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<XpackInfoResponse> info(
			Function<XpackInfoRequest.Builder, ObjectBuilder<XpackInfoRequest>> fn) {
		return info(fn.apply(new XpackInfoRequest.Builder()).build());
	}

	/**
	 * Get information.
	 * <p>
	 * The information provided by the API includes:
	 * <ul>
	 * <li>Build information including the build number and timestamp.</li>
	 * <li>License information about the currently installed license.</li>
	 * <li>Feature information for the features that are currently enabled and
	 * available under the current license.</li>
	 * </ul>
	 *
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-info">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<XpackInfoResponse> info() {
		return this.transport.performRequestAsync(new XpackInfoRequest.Builder().build(), XpackInfoRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: xpack.usage

	/**
	 * Get usage information.
	 * <p>
	 * Get information about the features that are currently enabled and available
	 * under the current license. The API also provides some usage statistics.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/group/endpoint-xpack">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<XpackUsageResponse> usage(XpackUsageRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<XpackUsageRequest, XpackUsageResponse, ErrorResponse> endpoint = (JsonEndpoint<XpackUsageRequest, XpackUsageResponse, ErrorResponse>) XpackUsageRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get usage information.
	 * <p>
	 * Get information about the features that are currently enabled and available
	 * under the current license. The API also provides some usage statistics.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link XpackUsageRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/group/endpoint-xpack">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<XpackUsageResponse> usage(
			Function<XpackUsageRequest.Builder, ObjectBuilder<XpackUsageRequest>> fn) {
		return usage(fn.apply(new XpackUsageRequest.Builder()).build());
	}

	/**
	 * Get usage information.
	 * <p>
	 * Get information about the features that are currently enabled and available
	 * under the current license. The API also provides some usage statistics.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/group/endpoint-xpack">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<XpackUsageResponse> usage() {
		return this.transport.performRequestAsync(new XpackUsageRequest.Builder().build(), XpackUsageRequest._ENDPOINT,
				this.transportOptions);
	}

}
