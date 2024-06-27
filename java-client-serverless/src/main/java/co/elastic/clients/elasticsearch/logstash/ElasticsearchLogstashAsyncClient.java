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

package co.elastic.clients.elasticsearch.logstash;

import co.elastic.clients.ApiClient;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.JsonEndpoint;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.transport.endpoints.BooleanResponse;
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
 * Client for the logstash namespace.
 */
public class ElasticsearchLogstashAsyncClient
		extends
			ApiClient<ElasticsearchTransport, ElasticsearchLogstashAsyncClient> {

	public ElasticsearchLogstashAsyncClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchLogstashAsyncClient(ElasticsearchTransport transport,
			@Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchLogstashAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchLogstashAsyncClient(this.transport, transportOptions);
	}

	// ----- Endpoint: logstash.delete_pipeline

	/**
	 * Deletes a pipeline used for Logstash Central Management.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/logstash-api-delete-pipeline.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<BooleanResponse> deletePipeline(DeletePipelineRequest request) {
		@SuppressWarnings("unchecked")
		Endpoint<DeletePipelineRequest, BooleanResponse, ErrorResponse> endpoint = (Endpoint<DeletePipelineRequest, BooleanResponse, ErrorResponse>) DeletePipelineRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Deletes a pipeline used for Logstash Central Management.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeletePipelineRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/logstash-api-delete-pipeline.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<BooleanResponse> deletePipeline(
			Function<DeletePipelineRequest.Builder, ObjectBuilder<DeletePipelineRequest>> fn) {
		return deletePipeline(fn.apply(new DeletePipelineRequest.Builder()).build());
	}

	// ----- Endpoint: logstash.get_pipeline

	/**
	 * Retrieves pipelines used for Logstash Central Management.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/logstash-api-get-pipeline.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetPipelineResponse> getPipeline(GetPipelineRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetPipelineRequest, GetPipelineResponse, ErrorResponse> endpoint = (JsonEndpoint<GetPipelineRequest, GetPipelineResponse, ErrorResponse>) GetPipelineRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Retrieves pipelines used for Logstash Central Management.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetPipelineRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/logstash-api-get-pipeline.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetPipelineResponse> getPipeline(
			Function<GetPipelineRequest.Builder, ObjectBuilder<GetPipelineRequest>> fn) {
		return getPipeline(fn.apply(new GetPipelineRequest.Builder()).build());
	}

	/**
	 * Retrieves pipelines used for Logstash Central Management.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/logstash-api-get-pipeline.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetPipelineResponse> getPipeline() {
		return this.transport.performRequestAsync(new GetPipelineRequest.Builder().build(),
				GetPipelineRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: logstash.put_pipeline

	/**
	 * Creates or updates a pipeline used for Logstash Central Management.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/logstash-api-put-pipeline.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<BooleanResponse> putPipeline(PutPipelineRequest request) {
		@SuppressWarnings("unchecked")
		Endpoint<PutPipelineRequest, BooleanResponse, ErrorResponse> endpoint = (Endpoint<PutPipelineRequest, BooleanResponse, ErrorResponse>) PutPipelineRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Creates or updates a pipeline used for Logstash Central Management.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutPipelineRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/logstash-api-put-pipeline.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<BooleanResponse> putPipeline(
			Function<PutPipelineRequest.Builder, ObjectBuilder<PutPipelineRequest>> fn) {
		return putPipeline(fn.apply(new PutPipelineRequest.Builder()).build());
	}

}
