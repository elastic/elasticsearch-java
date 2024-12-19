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
 * Client for the ingest namespace.
 */
public class ElasticsearchIngestAsyncClient extends ApiClient<ElasticsearchTransport, ElasticsearchIngestAsyncClient> {

	public ElasticsearchIngestAsyncClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchIngestAsyncClient(ElasticsearchTransport transport,
			@Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchIngestAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchIngestAsyncClient(this.transport, transportOptions);
	}

	// ----- Endpoint: ingest.delete_geoip_database

	/**
	 * Delete GeoIP database configurations. Delete one or more IP geolocation
	 * database configurations.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/delete-geoip-database-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteGeoipDatabaseResponse> deleteGeoipDatabase(DeleteGeoipDatabaseRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteGeoipDatabaseRequest, DeleteGeoipDatabaseResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteGeoipDatabaseRequest, DeleteGeoipDatabaseResponse, ErrorResponse>) DeleteGeoipDatabaseRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete GeoIP database configurations. Delete one or more IP geolocation
	 * database configurations.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteGeoipDatabaseRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/delete-geoip-database-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteGeoipDatabaseResponse> deleteGeoipDatabase(
			Function<DeleteGeoipDatabaseRequest.Builder, ObjectBuilder<DeleteGeoipDatabaseRequest>> fn) {
		return deleteGeoipDatabase(fn.apply(new DeleteGeoipDatabaseRequest.Builder()).build());
	}

	// ----- Endpoint: ingest.delete_ip_location_database

	/**
	 * Deletes an IP location database configuration.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/delete-ip-location-database-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteIpLocationDatabaseResponse> deleteIpLocationDatabase(
			DeleteIpLocationDatabaseRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteIpLocationDatabaseRequest, DeleteIpLocationDatabaseResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteIpLocationDatabaseRequest, DeleteIpLocationDatabaseResponse, ErrorResponse>) DeleteIpLocationDatabaseRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Deletes an IP location database configuration.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteIpLocationDatabaseRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/delete-ip-location-database-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteIpLocationDatabaseResponse> deleteIpLocationDatabase(
			Function<DeleteIpLocationDatabaseRequest.Builder, ObjectBuilder<DeleteIpLocationDatabaseRequest>> fn) {
		return deleteIpLocationDatabase(fn.apply(new DeleteIpLocationDatabaseRequest.Builder()).build());
	}

	// ----- Endpoint: ingest.delete_pipeline

	/**
	 * Delete pipelines. Delete one or more ingest pipelines.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/delete-pipeline-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeletePipelineResponse> deletePipeline(DeletePipelineRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeletePipelineRequest, DeletePipelineResponse, ErrorResponse> endpoint = (JsonEndpoint<DeletePipelineRequest, DeletePipelineResponse, ErrorResponse>) DeletePipelineRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete pipelines. Delete one or more ingest pipelines.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeletePipelineRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/delete-pipeline-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeletePipelineResponse> deletePipeline(
			Function<DeletePipelineRequest.Builder, ObjectBuilder<DeletePipelineRequest>> fn) {
		return deletePipeline(fn.apply(new DeletePipelineRequest.Builder()).build());
	}

	// ----- Endpoint: ingest.geo_ip_stats

	/**
	 * Get GeoIP statistics. Get download statistics for GeoIP2 databases that are
	 * used with the GeoIP processor.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/geoip-processor.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<GeoIpStatsResponse> geoIpStats() {
		return this.transport.performRequestAsync(GeoIpStatsRequest._INSTANCE, GeoIpStatsRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: ingest.get_geoip_database

	/**
	 * Get GeoIP database configurations. Get information about one or more IP
	 * geolocation database configurations.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-geoip-database-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetGeoipDatabaseResponse> getGeoipDatabase(GetGeoipDatabaseRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetGeoipDatabaseRequest, GetGeoipDatabaseResponse, ErrorResponse> endpoint = (JsonEndpoint<GetGeoipDatabaseRequest, GetGeoipDatabaseResponse, ErrorResponse>) GetGeoipDatabaseRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get GeoIP database configurations. Get information about one or more IP
	 * geolocation database configurations.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetGeoipDatabaseRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-geoip-database-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetGeoipDatabaseResponse> getGeoipDatabase(
			Function<GetGeoipDatabaseRequest.Builder, ObjectBuilder<GetGeoipDatabaseRequest>> fn) {
		return getGeoipDatabase(fn.apply(new GetGeoipDatabaseRequest.Builder()).build());
	}

	/**
	 * Get GeoIP database configurations. Get information about one or more IP
	 * geolocation database configurations.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-geoip-database-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetGeoipDatabaseResponse> getGeoipDatabase() {
		return this.transport.performRequestAsync(new GetGeoipDatabaseRequest.Builder().build(),
				GetGeoipDatabaseRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: ingest.get_ip_location_database

	/**
	 * Returns information about one or more IP location database configurations.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-ip-location-database-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetIpLocationDatabaseResponse> getIpLocationDatabase(
			GetIpLocationDatabaseRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetIpLocationDatabaseRequest, GetIpLocationDatabaseResponse, ErrorResponse> endpoint = (JsonEndpoint<GetIpLocationDatabaseRequest, GetIpLocationDatabaseResponse, ErrorResponse>) GetIpLocationDatabaseRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns information about one or more IP location database configurations.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetIpLocationDatabaseRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-ip-location-database-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetIpLocationDatabaseResponse> getIpLocationDatabase(
			Function<GetIpLocationDatabaseRequest.Builder, ObjectBuilder<GetIpLocationDatabaseRequest>> fn) {
		return getIpLocationDatabase(fn.apply(new GetIpLocationDatabaseRequest.Builder()).build());
	}

	/**
	 * Returns information about one or more IP location database configurations.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-ip-location-database-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetIpLocationDatabaseResponse> getIpLocationDatabase() {
		return this.transport.performRequestAsync(new GetIpLocationDatabaseRequest.Builder().build(),
				GetIpLocationDatabaseRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: ingest.get_pipeline

	/**
	 * Get pipelines. Get information about one or more ingest pipelines. This API
	 * returns a local reference of the pipeline.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-pipeline-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetPipelineResponse> getPipeline(GetPipelineRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetPipelineRequest, GetPipelineResponse, ErrorResponse> endpoint = (JsonEndpoint<GetPipelineRequest, GetPipelineResponse, ErrorResponse>) GetPipelineRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get pipelines. Get information about one or more ingest pipelines. This API
	 * returns a local reference of the pipeline.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetPipelineRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-pipeline-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetPipelineResponse> getPipeline(
			Function<GetPipelineRequest.Builder, ObjectBuilder<GetPipelineRequest>> fn) {
		return getPipeline(fn.apply(new GetPipelineRequest.Builder()).build());
	}

	/**
	 * Get pipelines. Get information about one or more ingest pipelines. This API
	 * returns a local reference of the pipeline.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/get-pipeline-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetPipelineResponse> getPipeline() {
		return this.transport.performRequestAsync(new GetPipelineRequest.Builder().build(),
				GetPipelineRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: ingest.processor_grok

	/**
	 * Run a grok processor. Extract structured fields out of a single text field
	 * within a document. You must choose which field to extract matched fields
	 * from, as well as the grok pattern you expect will match. A grok pattern is
	 * like a regular expression that supports aliased expressions that can be
	 * reused.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/grok-processor.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<ProcessorGrokResponse> processorGrok() {
		return this.transport.performRequestAsync(ProcessorGrokRequest._INSTANCE, ProcessorGrokRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: ingest.put_geoip_database

	/**
	 * Create or update GeoIP database configurations. Create or update IP
	 * geolocation database configurations.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/put-geoip-database-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutGeoipDatabaseResponse> putGeoipDatabase(PutGeoipDatabaseRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutGeoipDatabaseRequest, PutGeoipDatabaseResponse, ErrorResponse> endpoint = (JsonEndpoint<PutGeoipDatabaseRequest, PutGeoipDatabaseResponse, ErrorResponse>) PutGeoipDatabaseRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Create or update GeoIP database configurations. Create or update IP
	 * geolocation database configurations.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutGeoipDatabaseRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/put-geoip-database-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutGeoipDatabaseResponse> putGeoipDatabase(
			Function<PutGeoipDatabaseRequest.Builder, ObjectBuilder<PutGeoipDatabaseRequest>> fn) {
		return putGeoipDatabase(fn.apply(new PutGeoipDatabaseRequest.Builder()).build());
	}

	// ----- Endpoint: ingest.put_ip_location_database

	/**
	 * Returns information about one or more IP location database configurations.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/put-ip-location-database-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutIpLocationDatabaseResponse> putIpLocationDatabase(
			PutIpLocationDatabaseRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutIpLocationDatabaseRequest, PutIpLocationDatabaseResponse, ErrorResponse> endpoint = (JsonEndpoint<PutIpLocationDatabaseRequest, PutIpLocationDatabaseResponse, ErrorResponse>) PutIpLocationDatabaseRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns information about one or more IP location database configurations.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutIpLocationDatabaseRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/put-ip-location-database-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutIpLocationDatabaseResponse> putIpLocationDatabase(
			Function<PutIpLocationDatabaseRequest.Builder, ObjectBuilder<PutIpLocationDatabaseRequest>> fn) {
		return putIpLocationDatabase(fn.apply(new PutIpLocationDatabaseRequest.Builder()).build());
	}

	// ----- Endpoint: ingest.put_pipeline

	/**
	 * Create or update a pipeline. Changes made using this API take effect
	 * immediately.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/ingest.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutPipelineResponse> putPipeline(PutPipelineRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutPipelineRequest, PutPipelineResponse, ErrorResponse> endpoint = (JsonEndpoint<PutPipelineRequest, PutPipelineResponse, ErrorResponse>) PutPipelineRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Create or update a pipeline. Changes made using this API take effect
	 * immediately.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutPipelineRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.17/ingest.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutPipelineResponse> putPipeline(
			Function<PutPipelineRequest.Builder, ObjectBuilder<PutPipelineRequest>> fn) {
		return putPipeline(fn.apply(new PutPipelineRequest.Builder()).build());
	}

	// ----- Endpoint: ingest.simulate

	/**
	 * Simulate a pipeline. Run an ingest pipeline against a set of provided
	 * documents. You can either specify an existing pipeline to use with the
	 * provided documents or supply a pipeline definition in the body of the
	 * request.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/simulate-pipeline-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SimulateResponse> simulate(SimulateRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SimulateRequest, SimulateResponse, ErrorResponse> endpoint = (JsonEndpoint<SimulateRequest, SimulateResponse, ErrorResponse>) SimulateRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Simulate a pipeline. Run an ingest pipeline against a set of provided
	 * documents. You can either specify an existing pipeline to use with the
	 * provided documents or supply a pipeline definition in the body of the
	 * request.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SimulateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/simulate-pipeline-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<SimulateResponse> simulate(
			Function<SimulateRequest.Builder, ObjectBuilder<SimulateRequest>> fn) {
		return simulate(fn.apply(new SimulateRequest.Builder()).build());
	}

}
