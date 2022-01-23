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

package co.elastic.clients.elasticsearch.ssl;

import co.elastic.clients.ApiClient;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.JsonEndpoint;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.util.ObjectBuilder;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

/**
 * Client for the ssl namespace.
 */
public class ElasticsearchSslAsyncClient extends ApiClient<ElasticsearchTransport, ElasticsearchSslAsyncClient> {

	public ElasticsearchSslAsyncClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchSslAsyncClient(ElasticsearchTransport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchSslAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchSslAsyncClient(this.transport, transportOptions);
	}

	// ----- Endpoint: ssl.certificates

	/**
	 * Retrieves information about the X.509 certificates used to encrypt
	 * communications in the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-ssl.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<CertificatesResponse> certificates() {
		return this.transport.performRequestAsync(CertificatesRequest._INSTANCE, CertificatesRequest._ENDPOINT,
				this.transportOptions);
	}

}
