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
	 * Get SSL certificates.
	 * <p>
	 * Get information about the X.509 certificates that are used to encrypt
	 * communications in the cluster. The API returns a list that includes
	 * certificates from all TLS contexts including:
	 * <ul>
	 * <li>Settings for transport and HTTP interfaces</li>
	 * <li>TLS settings that are used within authentication realms</li>
	 * <li>TLS settings for remote monitoring exporters</li>
	 * </ul>
	 * <p>
	 * The list includes certificates that are used for configuring trust, such as
	 * those configured in the <code>xpack.security.transport.ssl.truststore</code>
	 * and <code>xpack.security.transport.ssl.certificate_authorities</code>
	 * settings. It also includes certificates that are used for configuring server
	 * identity, such as <code>xpack.security.http.ssl.keystore</code> and
	 * <code>xpack.security.http.ssl.certificate settings</code>.
	 * <p>
	 * The list does not include certificates that are sourced from the default SSL
	 * context of the Java Runtime Environment (JRE), even if those certificates are
	 * in use within Elasticsearch.
	 * <p>
	 * NOTE: When a PKCS#11 token is configured as the truststore of the JRE, the
	 * API returns all the certificates that are included in the PKCS#11 token
	 * irrespective of whether these are used in the Elasticsearch TLS
	 * configuration.
	 * <p>
	 * If Elasticsearch is configured to use a keystore or truststore, the API
	 * output includes all certificates in that store, even though some of the
	 * certificates might not be in active use within the cluster.
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
