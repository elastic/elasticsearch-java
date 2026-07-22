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

package co.elastic.clients.elasticsearch.encryption;

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
 * Client for the encryption namespace.
 */
public class ElasticsearchEncryptionClient extends ApiClient<ElasticsearchTransport, ElasticsearchEncryptionClient> {

	public ElasticsearchEncryptionClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchEncryptionClient(ElasticsearchTransport transport,
			@Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchEncryptionClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchEncryptionClient(this.transport, transportOptions);
	}

	// ----- Endpoint: encryption.reset

	/**
	 * Reset the project encryption key.
	 * <p>
	 * Destroy the current project encryption key (PEK) and generate a new one. This
	 * is the recovery path for when the on-disk encrypted PEK becomes permanently
	 * inaccessible, for example because the key encryption material protecting it
	 * was lost.
	 * <p>
	 * All data that was encrypted under the destroyed key becomes permanently
	 * unrecoverable. Each feature that stores encrypted data decides how to handle
	 * its own data during the reset: some features drop the encrypted values
	 * entirely, while others preserve the rest of the affected data and only clear
	 * the values that can no longer be decrypted.
	 * <p>
	 * Because this operation causes permanent data loss, it requires the
	 * <code>accept_data_loss</code> query parameter to be set to <code>true</code>.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch#TODO">Documentation
	 *      on elastic.co</a>
	 */

	public ResetResponse reset(ResetRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ResetRequest, ResetResponse, ErrorResponse> endpoint = (JsonEndpoint<ResetRequest, ResetResponse, ErrorResponse>) ResetRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Reset the project encryption key.
	 * <p>
	 * Destroy the current project encryption key (PEK) and generate a new one. This
	 * is the recovery path for when the on-disk encrypted PEK becomes permanently
	 * inaccessible, for example because the key encryption material protecting it
	 * was lost.
	 * <p>
	 * All data that was encrypted under the destroyed key becomes permanently
	 * unrecoverable. Each feature that stores encrypted data decides how to handle
	 * its own data during the reset: some features drop the encrypted values
	 * entirely, while others preserve the rest of the affected data and only clear
	 * the values that can no longer be decrypted.
	 * <p>
	 * Because this operation causes permanent data loss, it requires the
	 * <code>accept_data_loss</code> query parameter to be set to <code>true</code>.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ResetRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch#TODO">Documentation
	 *      on elastic.co</a>
	 */

	public final ResetResponse reset(Function<ResetRequest.Builder, ObjectBuilder<ResetRequest>> fn)
			throws IOException, ElasticsearchException {
		return reset(fn.apply(new ResetRequest.Builder()).build());
	}

}
