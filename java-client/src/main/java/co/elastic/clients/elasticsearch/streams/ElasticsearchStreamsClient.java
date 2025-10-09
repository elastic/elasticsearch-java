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

package co.elastic.clients.elasticsearch.streams;

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
 * Client for the streams namespace.
 */
public class ElasticsearchStreamsClient extends ApiClient<ElasticsearchTransport, ElasticsearchStreamsClient> {

	public ElasticsearchStreamsClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchStreamsClient(ElasticsearchTransport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchStreamsClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchStreamsClient(this.transport, transportOptions);
	}

	// ----- Endpoint: streams.logs_disable

	/**
	 * Disable logs stream.
	 * <p>
	 * Turn off the logs stream feature for this cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch#TODO">Documentation
	 *      on elastic.co</a>
	 */

	public LogsDisableResponse logsDisable(LogsDisableRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<LogsDisableRequest, LogsDisableResponse, ErrorResponse> endpoint = (JsonEndpoint<LogsDisableRequest, LogsDisableResponse, ErrorResponse>) LogsDisableRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Disable logs stream.
	 * <p>
	 * Turn off the logs stream feature for this cluster.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link LogsDisableRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch#TODO">Documentation
	 *      on elastic.co</a>
	 */

	public final LogsDisableResponse logsDisable(
			Function<LogsDisableRequest.Builder, ObjectBuilder<LogsDisableRequest>> fn)
			throws IOException, ElasticsearchException {
		return logsDisable(fn.apply(new LogsDisableRequest.Builder()).build());
	}

	/**
	 * Disable logs stream.
	 * <p>
	 * Turn off the logs stream feature for this cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch#TODO">Documentation
	 *      on elastic.co</a>
	 */

	public LogsDisableResponse logsDisable() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new LogsDisableRequest.Builder().build(), LogsDisableRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: streams.logs_enable

	/**
	 * Enable logs stream.
	 * <p>
	 * Turn on the logs stream feature for this cluster.
	 * <p>
	 * NOTE: To protect existing data, this feature can be turned on only if the
	 * cluster does not have existing indices or data streams that match the pattern
	 * <code>logs|logs.*</code>. If those indices or data streams exist, a
	 * <code>409 - Conflict</code> response and error is returned.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch#TODO">Documentation
	 *      on elastic.co</a>
	 */

	public LogsEnableResponse logsEnable(LogsEnableRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<LogsEnableRequest, LogsEnableResponse, ErrorResponse> endpoint = (JsonEndpoint<LogsEnableRequest, LogsEnableResponse, ErrorResponse>) LogsEnableRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Enable logs stream.
	 * <p>
	 * Turn on the logs stream feature for this cluster.
	 * <p>
	 * NOTE: To protect existing data, this feature can be turned on only if the
	 * cluster does not have existing indices or data streams that match the pattern
	 * <code>logs|logs.*</code>. If those indices or data streams exist, a
	 * <code>409 - Conflict</code> response and error is returned.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link LogsEnableRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch#TODO">Documentation
	 *      on elastic.co</a>
	 */

	public final LogsEnableResponse logsEnable(Function<LogsEnableRequest.Builder, ObjectBuilder<LogsEnableRequest>> fn)
			throws IOException, ElasticsearchException {
		return logsEnable(fn.apply(new LogsEnableRequest.Builder()).build());
	}

	/**
	 * Enable logs stream.
	 * <p>
	 * Turn on the logs stream feature for this cluster.
	 * <p>
	 * NOTE: To protect existing data, this feature can be turned on only if the
	 * cluster does not have existing indices or data streams that match the pattern
	 * <code>logs|logs.*</code>. If those indices or data streams exist, a
	 * <code>409 - Conflict</code> response and error is returned.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch#TODO">Documentation
	 *      on elastic.co</a>
	 */

	public LogsEnableResponse logsEnable() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new LogsEnableRequest.Builder().build(), LogsEnableRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: streams.status

	/**
	 * Get the status of streams.
	 * <p>
	 * Get the current status for all types of streams.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch#TODO">Documentation
	 *      on elastic.co</a>
	 */

	public StreamsStatusResponse status(StreamsStatusRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<StreamsStatusRequest, StreamsStatusResponse, ErrorResponse> endpoint = (JsonEndpoint<StreamsStatusRequest, StreamsStatusResponse, ErrorResponse>) StreamsStatusRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get the status of streams.
	 * <p>
	 * Get the current status for all types of streams.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link StreamsStatusRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch#TODO">Documentation
	 *      on elastic.co</a>
	 */

	public final StreamsStatusResponse status(
			Function<StreamsStatusRequest.Builder, ObjectBuilder<StreamsStatusRequest>> fn)
			throws IOException, ElasticsearchException {
		return status(fn.apply(new StreamsStatusRequest.Builder()).build());
	}

	/**
	 * Get the status of streams.
	 * <p>
	 * Get the current status for all types of streams.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch#TODO">Documentation
	 *      on elastic.co</a>
	 */

	public StreamsStatusResponse status() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new StreamsStatusRequest.Builder().build(), StreamsStatusRequest._ENDPOINT,
				this.transportOptions);
	}

}
