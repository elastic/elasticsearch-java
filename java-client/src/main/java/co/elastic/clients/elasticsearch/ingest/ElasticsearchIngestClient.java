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

package co.elastic.clients.elasticsearch.ingest;

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
 * Client for the ingest namespace.
 */
public class ElasticsearchIngestClient extends ApiClient<ElasticsearchTransport, ElasticsearchIngestClient> {

	public ElasticsearchIngestClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchIngestClient(ElasticsearchTransport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchIngestClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchIngestClient(this.transport, transportOptions);
	}

	// ----- Endpoint: ingest.delete_geoip_database

	/**
	 * Deletes a geoip database configuration.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/delete-geoip-database-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteGeoipDatabaseResponse deleteGeoipDatabase(DeleteGeoipDatabaseRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteGeoipDatabaseRequest, DeleteGeoipDatabaseResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteGeoipDatabaseRequest, DeleteGeoipDatabaseResponse, ErrorResponse>) DeleteGeoipDatabaseRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Deletes a geoip database configuration.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteGeoipDatabaseRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/delete-geoip-database-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteGeoipDatabaseResponse deleteGeoipDatabase(
			Function<DeleteGeoipDatabaseRequest.Builder, ObjectBuilder<DeleteGeoipDatabaseRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteGeoipDatabase(fn.apply(new DeleteGeoipDatabaseRequest.Builder()).build());
	}

	// ----- Endpoint: ingest.delete_pipeline

	/**
	 * Deletes one or more existing ingest pipeline.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/delete-pipeline-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeletePipelineResponse deletePipeline(DeletePipelineRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeletePipelineRequest, DeletePipelineResponse, ErrorResponse> endpoint = (JsonEndpoint<DeletePipelineRequest, DeletePipelineResponse, ErrorResponse>) DeletePipelineRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Deletes one or more existing ingest pipeline.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeletePipelineRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/delete-pipeline-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeletePipelineResponse deletePipeline(
			Function<DeletePipelineRequest.Builder, ObjectBuilder<DeletePipelineRequest>> fn)
			throws IOException, ElasticsearchException {
		return deletePipeline(fn.apply(new DeletePipelineRequest.Builder()).build());
	}

	// ----- Endpoint: ingest.geo_ip_stats

	/**
	 * Gets download statistics for GeoIP2 databases used with the geoip processor.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/geoip-processor.html">Documentation
	 *      on elastic.co</a>
	 */
	public GeoIpStatsResponse geoIpStats() throws IOException, ElasticsearchException {
		return this.transport.performRequest(GeoIpStatsRequest._INSTANCE, GeoIpStatsRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: ingest.get_geoip_database

	/**
	 * Returns information about one or more geoip database configurations.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-geoip-database-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetGeoipDatabaseResponse getGeoipDatabase(GetGeoipDatabaseRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetGeoipDatabaseRequest, GetGeoipDatabaseResponse, ErrorResponse> endpoint = (JsonEndpoint<GetGeoipDatabaseRequest, GetGeoipDatabaseResponse, ErrorResponse>) GetGeoipDatabaseRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns information about one or more geoip database configurations.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetGeoipDatabaseRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-geoip-database-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetGeoipDatabaseResponse getGeoipDatabase(
			Function<GetGeoipDatabaseRequest.Builder, ObjectBuilder<GetGeoipDatabaseRequest>> fn)
			throws IOException, ElasticsearchException {
		return getGeoipDatabase(fn.apply(new GetGeoipDatabaseRequest.Builder()).build());
	}

	/**
	 * Returns information about one or more geoip database configurations.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-geoip-database-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetGeoipDatabaseResponse getGeoipDatabase() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetGeoipDatabaseRequest.Builder().build(),
				GetGeoipDatabaseRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: ingest.get_pipeline

	/**
	 * Returns information about one or more ingest pipelines. This API returns a
	 * local reference of the pipeline.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-pipeline-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetPipelineResponse getPipeline(GetPipelineRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetPipelineRequest, GetPipelineResponse, ErrorResponse> endpoint = (JsonEndpoint<GetPipelineRequest, GetPipelineResponse, ErrorResponse>) GetPipelineRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns information about one or more ingest pipelines. This API returns a
	 * local reference of the pipeline.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetPipelineRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-pipeline-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetPipelineResponse getPipeline(
			Function<GetPipelineRequest.Builder, ObjectBuilder<GetPipelineRequest>> fn)
			throws IOException, ElasticsearchException {
		return getPipeline(fn.apply(new GetPipelineRequest.Builder()).build());
	}

	/**
	 * Returns information about one or more ingest pipelines. This API returns a
	 * local reference of the pipeline.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-pipeline-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetPipelineResponse getPipeline() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetPipelineRequest.Builder().build(), GetPipelineRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: ingest.processor_grok

	/**
	 * Extracts structured fields out of a single text field within a document. You
	 * choose which field to extract matched fields from, as well as the grok
	 * pattern you expect will match. A grok pattern is like a regular expression
	 * that supports aliased expressions that can be reused.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/grok-processor.html">Documentation
	 *      on elastic.co</a>
	 */
	public ProcessorGrokResponse processorGrok() throws IOException, ElasticsearchException {
		return this.transport.performRequest(ProcessorGrokRequest._INSTANCE, ProcessorGrokRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: ingest.put_geoip_database

	/**
	 * Returns information about one or more geoip database configurations.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/put-geoip-database-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutGeoipDatabaseResponse putGeoipDatabase(PutGeoipDatabaseRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutGeoipDatabaseRequest, PutGeoipDatabaseResponse, ErrorResponse> endpoint = (JsonEndpoint<PutGeoipDatabaseRequest, PutGeoipDatabaseResponse, ErrorResponse>) PutGeoipDatabaseRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns information about one or more geoip database configurations.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutGeoipDatabaseRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/put-geoip-database-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutGeoipDatabaseResponse putGeoipDatabase(
			Function<PutGeoipDatabaseRequest.Builder, ObjectBuilder<PutGeoipDatabaseRequest>> fn)
			throws IOException, ElasticsearchException {
		return putGeoipDatabase(fn.apply(new PutGeoipDatabaseRequest.Builder()).build());
	}

	// ----- Endpoint: ingest.put_pipeline

	/**
	 * Creates or updates an ingest pipeline. Changes made using this API take
	 * effect immediately.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/ingest.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutPipelineResponse putPipeline(PutPipelineRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutPipelineRequest, PutPipelineResponse, ErrorResponse> endpoint = (JsonEndpoint<PutPipelineRequest, PutPipelineResponse, ErrorResponse>) PutPipelineRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Creates or updates an ingest pipeline. Changes made using this API take
	 * effect immediately.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutPipelineRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/ingest.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutPipelineResponse putPipeline(
			Function<PutPipelineRequest.Builder, ObjectBuilder<PutPipelineRequest>> fn)
			throws IOException, ElasticsearchException {
		return putPipeline(fn.apply(new PutPipelineRequest.Builder()).build());
	}

	// ----- Endpoint: ingest.simulate

	/**
	 * Executes an ingest pipeline against a set of provided documents.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/simulate-pipeline-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public SimulateResponse simulate(SimulateRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SimulateRequest, SimulateResponse, ErrorResponse> endpoint = (JsonEndpoint<SimulateRequest, SimulateResponse, ErrorResponse>) SimulateRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Executes an ingest pipeline against a set of provided documents.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SimulateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/simulate-pipeline-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final SimulateResponse simulate(Function<SimulateRequest.Builder, ObjectBuilder<SimulateRequest>> fn)
			throws IOException, ElasticsearchException {
		return simulate(fn.apply(new SimulateRequest.Builder()).build());
	}

}
