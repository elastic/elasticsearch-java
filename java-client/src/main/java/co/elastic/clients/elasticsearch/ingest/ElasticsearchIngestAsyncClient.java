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

package co.elastic.clients.elasticsearch.ingest;

import co.elastic.clients.base.ApiClient;
import co.elastic.clients.base.Transport;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Nullable;

/**
 * Client for the ingest namespace.
 */
public class ElasticsearchIngestAsyncClient extends ApiClient {

	public ElasticsearchIngestAsyncClient(Transport transport) {
		super(transport);
	}

	// ----- Endpoint: ingest.delete_pipeline

	/**
	 * Deletes a pipeline.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/delete-pipeline-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeletePipelineResponse> deletePipeline(DeletePipelineRequest request) throws IOException {
		return this.transport.performRequestAsync(request, DeletePipelineRequest.ENDPOINT);
	}

	/**
	 * Deletes a pipeline.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/delete-pipeline-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeletePipelineResponse> deletePipeline(
			Function<DeletePipelineRequest.Builder, ObjectBuilder<DeletePipelineRequest>> fn) throws IOException {
		return deletePipeline(fn.apply(new DeletePipelineRequest.Builder()).build());
	}

	// ----- Endpoint: ingest.geo_ip_stats

	/**
	 * Returns statistical information about geoip databases
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/geoip-stats-api.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<GeoIpStatsResponse> geoIpStats() throws IOException {
		return this.transport.performRequestAsync(GeoIpStatsRequest._INSTANCE, GeoIpStatsRequest.ENDPOINT);
	}

	// ----- Endpoint: ingest.get_pipeline

	/**
	 * Returns a pipeline.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-pipeline-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetPipelineResponse> getPipeline(GetPipelineRequest request) throws IOException {
		return this.transport.performRequestAsync(request, GetPipelineRequest.ENDPOINT);
	}

	/**
	 * Returns a pipeline.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-pipeline-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetPipelineResponse> getPipeline(
			Function<GetPipelineRequest.Builder, ObjectBuilder<GetPipelineRequest>> fn) throws IOException {
		return getPipeline(fn.apply(new GetPipelineRequest.Builder()).build());
	}

	// ----- Endpoint: ingest.processor_grok

	/**
	 * Returns a list of the built-in patterns.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/grok-processor.html#grok-processor-rest-get">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<ProcessorGrokResponse> processorGrok() throws IOException {
		return this.transport.performRequestAsync(ProcessorGrokRequest._INSTANCE, ProcessorGrokRequest.ENDPOINT);
	}

	// ----- Endpoint: ingest.put_pipeline

	/**
	 * Creates or updates a pipeline.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/put-pipeline-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutPipelineResponse> putPipeline(PutPipelineRequest request) throws IOException {
		return this.transport.performRequestAsync(request, PutPipelineRequest.ENDPOINT);
	}

	/**
	 * Creates or updates a pipeline.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/put-pipeline-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutPipelineResponse> putPipeline(
			Function<PutPipelineRequest.Builder, ObjectBuilder<PutPipelineRequest>> fn) throws IOException {
		return putPipeline(fn.apply(new PutPipelineRequest.Builder()).build());
	}

	// ----- Endpoint: ingest.simulate

	/**
	 * Allows to simulate a pipeline with example documents.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/simulate-pipeline-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SimulateResponse> simulate(SimulateRequest request) throws IOException {
		return this.transport.performRequestAsync(request, SimulateRequest.ENDPOINT);
	}

	/**
	 * Allows to simulate a pipeline with example documents.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/simulate-pipeline-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<SimulateResponse> simulate(
			Function<SimulateRequest.Builder, ObjectBuilder<SimulateRequest>> fn) throws IOException {
		return simulate(fn.apply(new SimulateRequest.Builder()).build());
	}

}
