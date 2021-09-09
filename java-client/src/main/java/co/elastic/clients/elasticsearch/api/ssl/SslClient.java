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

package co.elastic.clients.elasticsearch.api.ssl;

import co.elastic.clients.base.ApiClient;
import co.elastic.clients.base.Transport;
import co.elastic.clients.elasticsearch.ssl.CertificatesRequest;
import co.elastic.clients.elasticsearch.ssl.CertificatesResponse;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.elasticsearch.client.RequestOptions;

/**
 * Client for the ssl namespace.
 */
public class SslClient extends ApiClient<SslClient> {

	public SslClient(Transport transport) {
		super(transport, null);
	}

	public SslClient(Transport transport, RequestOptions options) {
		super(transport, options);
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
	public CertificatesResponse certificates() throws IOException {
		return this.transport.performRequest(CertificatesRequest.INSTANCE, CertificatesRequest.ENDPOINT,
				this.requestOptions);
	}

	// ----- Misc

	/**
	 * Creates a new {@link #SslClient} with specific request options.
	 */
	@Override
	public SslClient withRequestOptions(@Nullable RequestOptions options) {
		return new SslClient(transport, options);
	}

	/**
	 * Creates a new {@link #SslClient} with specific request options, inheriting
	 * existing options.
	 *
	 * @param fn
	 *            a function taking an options builder initialized with the current
	 *            request options, or initialized with default values.
	 */
	public SslClient withRequestOptions(Function<RequestOptions.Builder, RequestOptions.Builder> fn) {
		RequestOptions.Builder builder = requestOptions == null
				? RequestOptions.DEFAULT.toBuilder()
				: requestOptions.toBuilder();

		return withRequestOptions(fn.apply(builder).build());
	}
}
