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

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Collections;
import java.util.Objects;

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

// typedef: ssl.certificates.Request

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
 * @see <a href="../doc-files/api-spec.html#ssl.certificates.Request">API
 *      specification</a>
 */

public class CertificatesRequest extends RequestBase {
	public CertificatesRequest() {
	}

	/**
	 * Singleton instance for {@link CertificatesRequest}.
	 */
	public static final CertificatesRequest _INSTANCE = new CertificatesRequest();

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ssl.certificates}".
	 */
	public static final Endpoint<CertificatesRequest, CertificatesResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/ssl.certificates",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				return "/_ssl/certificates";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), false, CertificatesResponse._DESERIALIZER);
}
