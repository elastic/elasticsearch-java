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

package co.elastic.clients.elasticsearch.cat;

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
 * Client for the cat namespace.
 */
public class ElasticsearchCatAsyncClient extends ApiClient<ElasticsearchTransport, ElasticsearchCatAsyncClient> {

	public ElasticsearchCatAsyncClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchCatAsyncClient(ElasticsearchTransport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchCatAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchCatAsyncClient(this.transport, transportOptions);
	}

	// ----- Endpoint: cat.aliases

	/**
	 * Get aliases. Retrieves the cluster’s index aliases, including filter and
	 * routing information. The API does not return data stream aliases.
	 * <p>
	 * CAT APIs are only intended for human consumption using the command line or
	 * the Kibana console. They are not intended for use by applications. For
	 * application consumption, use the aliases API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-alias.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<AliasesResponse> aliases(AliasesRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<AliasesRequest, AliasesResponse, ErrorResponse> endpoint = (JsonEndpoint<AliasesRequest, AliasesResponse, ErrorResponse>) AliasesRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get aliases. Retrieves the cluster’s index aliases, including filter and
	 * routing information. The API does not return data stream aliases.
	 * <p>
	 * CAT APIs are only intended for human consumption using the command line or
	 * the Kibana console. They are not intended for use by applications. For
	 * application consumption, use the aliases API.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link AliasesRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-alias.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<AliasesResponse> aliases(
			Function<AliasesRequest.Builder, ObjectBuilder<AliasesRequest>> fn) {
		return aliases(fn.apply(new AliasesRequest.Builder()).build());
	}

	/**
	 * Get aliases. Retrieves the cluster’s index aliases, including filter and
	 * routing information. The API does not return data stream aliases.
	 * <p>
	 * CAT APIs are only intended for human consumption using the command line or
	 * the Kibana console. They are not intended for use by applications. For
	 * application consumption, use the aliases API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-alias.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<AliasesResponse> aliases() {
		return this.transport.performRequestAsync(new AliasesRequest.Builder().build(), AliasesRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.allocation

	/**
	 * Provides a snapshot of the number of shards allocated to each data node and
	 * their disk space. IMPORTANT: cat APIs are only intended for human consumption
	 * using the command line or Kibana console. They are not intended for use by
	 * applications.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-allocation.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<AllocationResponse> allocation(AllocationRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<AllocationRequest, AllocationResponse, ErrorResponse> endpoint = (JsonEndpoint<AllocationRequest, AllocationResponse, ErrorResponse>) AllocationRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Provides a snapshot of the number of shards allocated to each data node and
	 * their disk space. IMPORTANT: cat APIs are only intended for human consumption
	 * using the command line or Kibana console. They are not intended for use by
	 * applications.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link AllocationRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-allocation.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<AllocationResponse> allocation(
			Function<AllocationRequest.Builder, ObjectBuilder<AllocationRequest>> fn) {
		return allocation(fn.apply(new AllocationRequest.Builder()).build());
	}

	/**
	 * Provides a snapshot of the number of shards allocated to each data node and
	 * their disk space. IMPORTANT: cat APIs are only intended for human consumption
	 * using the command line or Kibana console. They are not intended for use by
	 * applications.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-allocation.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<AllocationResponse> allocation() {
		return this.transport.performRequestAsync(new AllocationRequest.Builder().build(), AllocationRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.component_templates

	/**
	 * Get component templates. Returns information about component templates in a
	 * cluster. Component templates are building blocks for constructing index
	 * templates that specify index mappings, settings, and aliases.
	 * <p>
	 * CAT APIs are only intended for human consumption using the command line or
	 * Kibana console. They are not intended for use by applications. For
	 * application consumption, use the get component template API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-component-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ComponentTemplatesResponse> componentTemplates(ComponentTemplatesRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ComponentTemplatesRequest, ComponentTemplatesResponse, ErrorResponse> endpoint = (JsonEndpoint<ComponentTemplatesRequest, ComponentTemplatesResponse, ErrorResponse>) ComponentTemplatesRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get component templates. Returns information about component templates in a
	 * cluster. Component templates are building blocks for constructing index
	 * templates that specify index mappings, settings, and aliases.
	 * <p>
	 * CAT APIs are only intended for human consumption using the command line or
	 * Kibana console. They are not intended for use by applications. For
	 * application consumption, use the get component template API.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ComponentTemplatesRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-component-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ComponentTemplatesResponse> componentTemplates(
			Function<ComponentTemplatesRequest.Builder, ObjectBuilder<ComponentTemplatesRequest>> fn) {
		return componentTemplates(fn.apply(new ComponentTemplatesRequest.Builder()).build());
	}

	/**
	 * Get component templates. Returns information about component templates in a
	 * cluster. Component templates are building blocks for constructing index
	 * templates that specify index mappings, settings, and aliases.
	 * <p>
	 * CAT APIs are only intended for human consumption using the command line or
	 * Kibana console. They are not intended for use by applications. For
	 * application consumption, use the get component template API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/cat-component-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ComponentTemplatesResponse> componentTemplates() {
		return this.transport.performRequestAsync(new ComponentTemplatesRequest.Builder().build(),
				ComponentTemplatesRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: cat.count

	/**
	 * Get a document count. Provides quick access to a document count for a data
	 * stream, an index, or an entire cluster. The document count only includes live
	 * documents, not deleted documents which have not yet been removed by the merge
	 * process.
	 * <p>
	 * CAT APIs are only intended for human consumption using the command line or
	 * Kibana console. They are not intended for use by applications. For
	 * application consumption, use the count API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-count.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<CountResponse> count(CountRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<CountRequest, CountResponse, ErrorResponse> endpoint = (JsonEndpoint<CountRequest, CountResponse, ErrorResponse>) CountRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get a document count. Provides quick access to a document count for a data
	 * stream, an index, or an entire cluster. The document count only includes live
	 * documents, not deleted documents which have not yet been removed by the merge
	 * process.
	 * <p>
	 * CAT APIs are only intended for human consumption using the command line or
	 * Kibana console. They are not intended for use by applications. For
	 * application consumption, use the count API.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CountRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-count.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<CountResponse> count(
			Function<CountRequest.Builder, ObjectBuilder<CountRequest>> fn) {
		return count(fn.apply(new CountRequest.Builder()).build());
	}

	/**
	 * Get a document count. Provides quick access to a document count for a data
	 * stream, an index, or an entire cluster. The document count only includes live
	 * documents, not deleted documents which have not yet been removed by the merge
	 * process.
	 * <p>
	 * CAT APIs are only intended for human consumption using the command line or
	 * Kibana console. They are not intended for use by applications. For
	 * application consumption, use the count API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-count.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<CountResponse> count() {
		return this.transport.performRequestAsync(new CountRequest.Builder().build(), CountRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.fielddata

	/**
	 * Returns the amount of heap memory currently used by the field data cache on
	 * every data node in the cluster. IMPORTANT: cat APIs are only intended for
	 * human consumption using the command line or Kibana console. They are not
	 * intended for use by applications. For application consumption, use the nodes
	 * stats API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-fielddata.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<FielddataResponse> fielddata(FielddataRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<FielddataRequest, FielddataResponse, ErrorResponse> endpoint = (JsonEndpoint<FielddataRequest, FielddataResponse, ErrorResponse>) FielddataRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns the amount of heap memory currently used by the field data cache on
	 * every data node in the cluster. IMPORTANT: cat APIs are only intended for
	 * human consumption using the command line or Kibana console. They are not
	 * intended for use by applications. For application consumption, use the nodes
	 * stats API.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link FielddataRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-fielddata.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<FielddataResponse> fielddata(
			Function<FielddataRequest.Builder, ObjectBuilder<FielddataRequest>> fn) {
		return fielddata(fn.apply(new FielddataRequest.Builder()).build());
	}

	/**
	 * Returns the amount of heap memory currently used by the field data cache on
	 * every data node in the cluster. IMPORTANT: cat APIs are only intended for
	 * human consumption using the command line or Kibana console. They are not
	 * intended for use by applications. For application consumption, use the nodes
	 * stats API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-fielddata.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<FielddataResponse> fielddata() {
		return this.transport.performRequestAsync(new FielddataRequest.Builder().build(), FielddataRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.health

	/**
	 * Returns the health status of a cluster, similar to the cluster health API.
	 * IMPORTANT: cat APIs are only intended for human consumption using the command
	 * line or Kibana console. They are not intended for use by applications. For
	 * application consumption, use the cluster health API. This API is often used
	 * to check malfunctioning clusters. To help you track cluster health alongside
	 * log files and alerting systems, the API returns timestamps in two formats:
	 * <code>HH:MM:SS</code>, which is human-readable but includes no date
	 * information; <code>Unix epoch time</code>, which is machine-sortable and
	 * includes date information. The latter format is useful for cluster recoveries
	 * that take multiple days. You can use the cat health API to verify cluster
	 * health across multiple nodes. You also can use the API to track the recovery
	 * of a large cluster over a longer period of time.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-health.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<HealthResponse> health(HealthRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<HealthRequest, HealthResponse, ErrorResponse> endpoint = (JsonEndpoint<HealthRequest, HealthResponse, ErrorResponse>) HealthRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns the health status of a cluster, similar to the cluster health API.
	 * IMPORTANT: cat APIs are only intended for human consumption using the command
	 * line or Kibana console. They are not intended for use by applications. For
	 * application consumption, use the cluster health API. This API is often used
	 * to check malfunctioning clusters. To help you track cluster health alongside
	 * log files and alerting systems, the API returns timestamps in two formats:
	 * <code>HH:MM:SS</code>, which is human-readable but includes no date
	 * information; <code>Unix epoch time</code>, which is machine-sortable and
	 * includes date information. The latter format is useful for cluster recoveries
	 * that take multiple days. You can use the cat health API to verify cluster
	 * health across multiple nodes. You also can use the API to track the recovery
	 * of a large cluster over a longer period of time.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link HealthRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-health.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<HealthResponse> health(
			Function<HealthRequest.Builder, ObjectBuilder<HealthRequest>> fn) {
		return health(fn.apply(new HealthRequest.Builder()).build());
	}

	/**
	 * Returns the health status of a cluster, similar to the cluster health API.
	 * IMPORTANT: cat APIs are only intended for human consumption using the command
	 * line or Kibana console. They are not intended for use by applications. For
	 * application consumption, use the cluster health API. This API is often used
	 * to check malfunctioning clusters. To help you track cluster health alongside
	 * log files and alerting systems, the API returns timestamps in two formats:
	 * <code>HH:MM:SS</code>, which is human-readable but includes no date
	 * information; <code>Unix epoch time</code>, which is machine-sortable and
	 * includes date information. The latter format is useful for cluster recoveries
	 * that take multiple days. You can use the cat health API to verify cluster
	 * health across multiple nodes. You also can use the API to track the recovery
	 * of a large cluster over a longer period of time.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-health.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<HealthResponse> health() {
		return this.transport.performRequestAsync(new HealthRequest.Builder().build(), HealthRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.help

	/**
	 * Get CAT help. Returns help for the CAT APIs.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<HelpResponse> help() {
		return this.transport.performRequestAsync(HelpRequest._INSTANCE, HelpRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: cat.indices

	/**
	 * Get index information. Returns high-level information about indices in a
	 * cluster, including backing indices for data streams.
	 * <p>
	 * Use this request to get the following information for each index in a
	 * cluster:
	 * <ul>
	 * <li>shard count</li>
	 * <li>document count</li>
	 * <li>deleted document count</li>
	 * <li>primary store size</li>
	 * <li>total store size of all shards, including shard replicas</li>
	 * </ul>
	 * <p>
	 * These metrics are retrieved directly from Lucene, which Elasticsearch uses
	 * internally to power indexing and search. As a result, all document counts
	 * include hidden nested documents. To get an accurate count of Elasticsearch
	 * documents, use the cat count or count APIs.
	 * <p>
	 * CAT APIs are only intended for human consumption using the command line or
	 * Kibana console. They are not intended for use by applications. For
	 * application consumption, use an index endpoint.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-indices.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<IndicesResponse> indices(IndicesRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<IndicesRequest, IndicesResponse, ErrorResponse> endpoint = (JsonEndpoint<IndicesRequest, IndicesResponse, ErrorResponse>) IndicesRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get index information. Returns high-level information about indices in a
	 * cluster, including backing indices for data streams.
	 * <p>
	 * Use this request to get the following information for each index in a
	 * cluster:
	 * <ul>
	 * <li>shard count</li>
	 * <li>document count</li>
	 * <li>deleted document count</li>
	 * <li>primary store size</li>
	 * <li>total store size of all shards, including shard replicas</li>
	 * </ul>
	 * <p>
	 * These metrics are retrieved directly from Lucene, which Elasticsearch uses
	 * internally to power indexing and search. As a result, all document counts
	 * include hidden nested documents. To get an accurate count of Elasticsearch
	 * documents, use the cat count or count APIs.
	 * <p>
	 * CAT APIs are only intended for human consumption using the command line or
	 * Kibana console. They are not intended for use by applications. For
	 * application consumption, use an index endpoint.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link IndicesRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-indices.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<IndicesResponse> indices(
			Function<IndicesRequest.Builder, ObjectBuilder<IndicesRequest>> fn) {
		return indices(fn.apply(new IndicesRequest.Builder()).build());
	}

	/**
	 * Get index information. Returns high-level information about indices in a
	 * cluster, including backing indices for data streams.
	 * <p>
	 * Use this request to get the following information for each index in a
	 * cluster:
	 * <ul>
	 * <li>shard count</li>
	 * <li>document count</li>
	 * <li>deleted document count</li>
	 * <li>primary store size</li>
	 * <li>total store size of all shards, including shard replicas</li>
	 * </ul>
	 * <p>
	 * These metrics are retrieved directly from Lucene, which Elasticsearch uses
	 * internally to power indexing and search. As a result, all document counts
	 * include hidden nested documents. To get an accurate count of Elasticsearch
	 * documents, use the cat count or count APIs.
	 * <p>
	 * CAT APIs are only intended for human consumption using the command line or
	 * Kibana console. They are not intended for use by applications. For
	 * application consumption, use an index endpoint.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-indices.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<IndicesResponse> indices() {
		return this.transport.performRequestAsync(new IndicesRequest.Builder().build(), IndicesRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.master

	/**
	 * Returns information about the master node, including the ID, bound IP
	 * address, and name. IMPORTANT: cat APIs are only intended for human
	 * consumption using the command line or Kibana console. They are not intended
	 * for use by applications. For application consumption, use the nodes info API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-master.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<MasterResponse> master() {
		return this.transport.performRequestAsync(MasterRequest._INSTANCE, MasterRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.ml_data_frame_analytics

	/**
	 * Get data frame analytics jobs. Returns configuration and usage information
	 * about data frame analytics jobs.
	 * <p>
	 * CAT APIs are only intended for human consumption using the Kibana console or
	 * command line. They are not intended for use by applications. For application
	 * consumption, use the get data frame analytics jobs statistics API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<MlDataFrameAnalyticsResponse> mlDataFrameAnalytics(MlDataFrameAnalyticsRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<MlDataFrameAnalyticsRequest, MlDataFrameAnalyticsResponse, ErrorResponse> endpoint = (JsonEndpoint<MlDataFrameAnalyticsRequest, MlDataFrameAnalyticsResponse, ErrorResponse>) MlDataFrameAnalyticsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get data frame analytics jobs. Returns configuration and usage information
	 * about data frame analytics jobs.
	 * <p>
	 * CAT APIs are only intended for human consumption using the Kibana console or
	 * command line. They are not intended for use by applications. For application
	 * consumption, use the get data frame analytics jobs statistics API.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link MlDataFrameAnalyticsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<MlDataFrameAnalyticsResponse> mlDataFrameAnalytics(
			Function<MlDataFrameAnalyticsRequest.Builder, ObjectBuilder<MlDataFrameAnalyticsRequest>> fn) {
		return mlDataFrameAnalytics(fn.apply(new MlDataFrameAnalyticsRequest.Builder()).build());
	}

	/**
	 * Get data frame analytics jobs. Returns configuration and usage information
	 * about data frame analytics jobs.
	 * <p>
	 * CAT APIs are only intended for human consumption using the Kibana console or
	 * command line. They are not intended for use by applications. For application
	 * consumption, use the get data frame analytics jobs statistics API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<MlDataFrameAnalyticsResponse> mlDataFrameAnalytics() {
		return this.transport.performRequestAsync(new MlDataFrameAnalyticsRequest.Builder().build(),
				MlDataFrameAnalyticsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: cat.ml_datafeeds

	/**
	 * Get datafeeds. Returns configuration and usage information about datafeeds.
	 * This API returns a maximum of 10,000 datafeeds. If the Elasticsearch security
	 * features are enabled, you must have <code>monitor_ml</code>,
	 * <code>monitor</code>, <code>manage_ml</code>, or <code>manage</code> cluster
	 * privileges to use this API.
	 * <p>
	 * CAT APIs are only intended for human consumption using the Kibana console or
	 * command line. They are not intended for use by applications. For application
	 * consumption, use the get datafeed statistics API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-datafeeds.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<MlDatafeedsResponse> mlDatafeeds(MlDatafeedsRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<MlDatafeedsRequest, MlDatafeedsResponse, ErrorResponse> endpoint = (JsonEndpoint<MlDatafeedsRequest, MlDatafeedsResponse, ErrorResponse>) MlDatafeedsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get datafeeds. Returns configuration and usage information about datafeeds.
	 * This API returns a maximum of 10,000 datafeeds. If the Elasticsearch security
	 * features are enabled, you must have <code>monitor_ml</code>,
	 * <code>monitor</code>, <code>manage_ml</code>, or <code>manage</code> cluster
	 * privileges to use this API.
	 * <p>
	 * CAT APIs are only intended for human consumption using the Kibana console or
	 * command line. They are not intended for use by applications. For application
	 * consumption, use the get datafeed statistics API.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link MlDatafeedsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-datafeeds.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<MlDatafeedsResponse> mlDatafeeds(
			Function<MlDatafeedsRequest.Builder, ObjectBuilder<MlDatafeedsRequest>> fn) {
		return mlDatafeeds(fn.apply(new MlDatafeedsRequest.Builder()).build());
	}

	/**
	 * Get datafeeds. Returns configuration and usage information about datafeeds.
	 * This API returns a maximum of 10,000 datafeeds. If the Elasticsearch security
	 * features are enabled, you must have <code>monitor_ml</code>,
	 * <code>monitor</code>, <code>manage_ml</code>, or <code>manage</code> cluster
	 * privileges to use this API.
	 * <p>
	 * CAT APIs are only intended for human consumption using the Kibana console or
	 * command line. They are not intended for use by applications. For application
	 * consumption, use the get datafeed statistics API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-datafeeds.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<MlDatafeedsResponse> mlDatafeeds() {
		return this.transport.performRequestAsync(new MlDatafeedsRequest.Builder().build(),
				MlDatafeedsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: cat.ml_jobs

	/**
	 * Get anomaly detection jobs. Returns configuration and usage information for
	 * anomaly detection jobs. This API returns a maximum of 10,000 jobs. If the
	 * Elasticsearch security features are enabled, you must have
	 * <code>monitor_ml</code>, <code>monitor</code>, <code>manage_ml</code>, or
	 * <code>manage</code> cluster privileges to use this API.
	 * <p>
	 * CAT APIs are only intended for human consumption using the Kibana console or
	 * command line. They are not intended for use by applications. For application
	 * consumption, use the get anomaly detection job statistics API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-anomaly-detectors.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<MlJobsResponse> mlJobs(MlJobsRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<MlJobsRequest, MlJobsResponse, ErrorResponse> endpoint = (JsonEndpoint<MlJobsRequest, MlJobsResponse, ErrorResponse>) MlJobsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get anomaly detection jobs. Returns configuration and usage information for
	 * anomaly detection jobs. This API returns a maximum of 10,000 jobs. If the
	 * Elasticsearch security features are enabled, you must have
	 * <code>monitor_ml</code>, <code>monitor</code>, <code>manage_ml</code>, or
	 * <code>manage</code> cluster privileges to use this API.
	 * <p>
	 * CAT APIs are only intended for human consumption using the Kibana console or
	 * command line. They are not intended for use by applications. For application
	 * consumption, use the get anomaly detection job statistics API.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link MlJobsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-anomaly-detectors.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<MlJobsResponse> mlJobs(
			Function<MlJobsRequest.Builder, ObjectBuilder<MlJobsRequest>> fn) {
		return mlJobs(fn.apply(new MlJobsRequest.Builder()).build());
	}

	/**
	 * Get anomaly detection jobs. Returns configuration and usage information for
	 * anomaly detection jobs. This API returns a maximum of 10,000 jobs. If the
	 * Elasticsearch security features are enabled, you must have
	 * <code>monitor_ml</code>, <code>monitor</code>, <code>manage_ml</code>, or
	 * <code>manage</code> cluster privileges to use this API.
	 * <p>
	 * CAT APIs are only intended for human consumption using the Kibana console or
	 * command line. They are not intended for use by applications. For application
	 * consumption, use the get anomaly detection job statistics API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-anomaly-detectors.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<MlJobsResponse> mlJobs() {
		return this.transport.performRequestAsync(new MlJobsRequest.Builder().build(), MlJobsRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.ml_trained_models

	/**
	 * Get trained models. Returns configuration and usage information about
	 * inference trained models.
	 * <p>
	 * CAT APIs are only intended for human consumption using the Kibana console or
	 * command line. They are not intended for use by applications. For application
	 * consumption, use the get trained models statistics API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-trained-model.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<MlTrainedModelsResponse> mlTrainedModels(MlTrainedModelsRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<MlTrainedModelsRequest, MlTrainedModelsResponse, ErrorResponse> endpoint = (JsonEndpoint<MlTrainedModelsRequest, MlTrainedModelsResponse, ErrorResponse>) MlTrainedModelsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get trained models. Returns configuration and usage information about
	 * inference trained models.
	 * <p>
	 * CAT APIs are only intended for human consumption using the Kibana console or
	 * command line. They are not intended for use by applications. For application
	 * consumption, use the get trained models statistics API.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link MlTrainedModelsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-trained-model.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<MlTrainedModelsResponse> mlTrainedModels(
			Function<MlTrainedModelsRequest.Builder, ObjectBuilder<MlTrainedModelsRequest>> fn) {
		return mlTrainedModels(fn.apply(new MlTrainedModelsRequest.Builder()).build());
	}

	/**
	 * Get trained models. Returns configuration and usage information about
	 * inference trained models.
	 * <p>
	 * CAT APIs are only intended for human consumption using the Kibana console or
	 * command line. They are not intended for use by applications. For application
	 * consumption, use the get trained models statistics API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-trained-model.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<MlTrainedModelsResponse> mlTrainedModels() {
		return this.transport.performRequestAsync(new MlTrainedModelsRequest.Builder().build(),
				MlTrainedModelsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: cat.nodeattrs

	/**
	 * Returns information about custom node attributes. IMPORTANT: cat APIs are
	 * only intended for human consumption using the command line or Kibana console.
	 * They are not intended for use by applications. For application consumption,
	 * use the nodes info API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-nodeattrs.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<NodeattrsResponse> nodeattrs() {
		return this.transport.performRequestAsync(NodeattrsRequest._INSTANCE, NodeattrsRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.nodes

	/**
	 * Returns information about the nodes in a cluster. IMPORTANT: cat APIs are
	 * only intended for human consumption using the command line or Kibana console.
	 * They are not intended for use by applications. For application consumption,
	 * use the nodes info API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-nodes.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<NodesResponse> nodes(NodesRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<NodesRequest, NodesResponse, ErrorResponse> endpoint = (JsonEndpoint<NodesRequest, NodesResponse, ErrorResponse>) NodesRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns information about the nodes in a cluster. IMPORTANT: cat APIs are
	 * only intended for human consumption using the command line or Kibana console.
	 * They are not intended for use by applications. For application consumption,
	 * use the nodes info API.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link NodesRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-nodes.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<NodesResponse> nodes(
			Function<NodesRequest.Builder, ObjectBuilder<NodesRequest>> fn) {
		return nodes(fn.apply(new NodesRequest.Builder()).build());
	}

	/**
	 * Returns information about the nodes in a cluster. IMPORTANT: cat APIs are
	 * only intended for human consumption using the command line or Kibana console.
	 * They are not intended for use by applications. For application consumption,
	 * use the nodes info API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-nodes.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<NodesResponse> nodes() {
		return this.transport.performRequestAsync(new NodesRequest.Builder().build(), NodesRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.pending_tasks

	/**
	 * Returns cluster-level changes that have not yet been executed. IMPORTANT: cat
	 * APIs are only intended for human consumption using the command line or Kibana
	 * console. They are not intended for use by applications. For application
	 * consumption, use the pending cluster tasks API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-pending-tasks.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<PendingTasksResponse> pendingTasks() {
		return this.transport.performRequestAsync(PendingTasksRequest._INSTANCE, PendingTasksRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.plugins

	/**
	 * Returns a list of plugins running on each node of a cluster. IMPORTANT: cat
	 * APIs are only intended for human consumption using the command line or Kibana
	 * console. They are not intended for use by applications. For application
	 * consumption, use the nodes info API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-plugins.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<PluginsResponse> plugins() {
		return this.transport.performRequestAsync(PluginsRequest._INSTANCE, PluginsRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.recovery

	/**
	 * Returns information about ongoing and completed shard recoveries. Shard
	 * recovery is the process of initializing a shard copy, such as restoring a
	 * primary shard from a snapshot or syncing a replica shard from a primary
	 * shard. When a shard recovery completes, the recovered shard is available for
	 * search and indexing. For data streams, the API returns information about the
	 * stream’s backing indices. IMPORTANT: cat APIs are only intended for human
	 * consumption using the command line or Kibana console. They are not intended
	 * for use by applications. For application consumption, use the index recovery
	 * API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-recovery.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<RecoveryResponse> recovery(RecoveryRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<RecoveryRequest, RecoveryResponse, ErrorResponse> endpoint = (JsonEndpoint<RecoveryRequest, RecoveryResponse, ErrorResponse>) RecoveryRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns information about ongoing and completed shard recoveries. Shard
	 * recovery is the process of initializing a shard copy, such as restoring a
	 * primary shard from a snapshot or syncing a replica shard from a primary
	 * shard. When a shard recovery completes, the recovered shard is available for
	 * search and indexing. For data streams, the API returns information about the
	 * stream’s backing indices. IMPORTANT: cat APIs are only intended for human
	 * consumption using the command line or Kibana console. They are not intended
	 * for use by applications. For application consumption, use the index recovery
	 * API.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link RecoveryRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-recovery.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<RecoveryResponse> recovery(
			Function<RecoveryRequest.Builder, ObjectBuilder<RecoveryRequest>> fn) {
		return recovery(fn.apply(new RecoveryRequest.Builder()).build());
	}

	/**
	 * Returns information about ongoing and completed shard recoveries. Shard
	 * recovery is the process of initializing a shard copy, such as restoring a
	 * primary shard from a snapshot or syncing a replica shard from a primary
	 * shard. When a shard recovery completes, the recovered shard is available for
	 * search and indexing. For data streams, the API returns information about the
	 * stream’s backing indices. IMPORTANT: cat APIs are only intended for human
	 * consumption using the command line or Kibana console. They are not intended
	 * for use by applications. For application consumption, use the index recovery
	 * API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-recovery.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<RecoveryResponse> recovery() {
		return this.transport.performRequestAsync(new RecoveryRequest.Builder().build(), RecoveryRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.repositories

	/**
	 * Returns the snapshot repositories for a cluster. IMPORTANT: cat APIs are only
	 * intended for human consumption using the command line or Kibana console. They
	 * are not intended for use by applications. For application consumption, use
	 * the get snapshot repository API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-repositories.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<RepositoriesResponse> repositories() {
		return this.transport.performRequestAsync(RepositoriesRequest._INSTANCE, RepositoriesRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.segments

	/**
	 * Returns low-level information about the Lucene segments in index shards. For
	 * data streams, the API returns information about the backing indices.
	 * IMPORTANT: cat APIs are only intended for human consumption using the command
	 * line or Kibana console. They are not intended for use by applications. For
	 * application consumption, use the index segments API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-segments.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SegmentsResponse> segments(SegmentsRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SegmentsRequest, SegmentsResponse, ErrorResponse> endpoint = (JsonEndpoint<SegmentsRequest, SegmentsResponse, ErrorResponse>) SegmentsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns low-level information about the Lucene segments in index shards. For
	 * data streams, the API returns information about the backing indices.
	 * IMPORTANT: cat APIs are only intended for human consumption using the command
	 * line or Kibana console. They are not intended for use by applications. For
	 * application consumption, use the index segments API.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SegmentsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-segments.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<SegmentsResponse> segments(
			Function<SegmentsRequest.Builder, ObjectBuilder<SegmentsRequest>> fn) {
		return segments(fn.apply(new SegmentsRequest.Builder()).build());
	}

	/**
	 * Returns low-level information about the Lucene segments in index shards. For
	 * data streams, the API returns information about the backing indices.
	 * IMPORTANT: cat APIs are only intended for human consumption using the command
	 * line or Kibana console. They are not intended for use by applications. For
	 * application consumption, use the index segments API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-segments.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SegmentsResponse> segments() {
		return this.transport.performRequestAsync(new SegmentsRequest.Builder().build(), SegmentsRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.shards

	/**
	 * Returns information about the shards in a cluster. For data streams, the API
	 * returns information about the backing indices. IMPORTANT: cat APIs are only
	 * intended for human consumption using the command line or Kibana console. They
	 * are not intended for use by applications.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-shards.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ShardsResponse> shards(ShardsRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ShardsRequest, ShardsResponse, ErrorResponse> endpoint = (JsonEndpoint<ShardsRequest, ShardsResponse, ErrorResponse>) ShardsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns information about the shards in a cluster. For data streams, the API
	 * returns information about the backing indices. IMPORTANT: cat APIs are only
	 * intended for human consumption using the command line or Kibana console. They
	 * are not intended for use by applications.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ShardsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-shards.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ShardsResponse> shards(
			Function<ShardsRequest.Builder, ObjectBuilder<ShardsRequest>> fn) {
		return shards(fn.apply(new ShardsRequest.Builder()).build());
	}

	/**
	 * Returns information about the shards in a cluster. For data streams, the API
	 * returns information about the backing indices. IMPORTANT: cat APIs are only
	 * intended for human consumption using the command line or Kibana console. They
	 * are not intended for use by applications.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-shards.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ShardsResponse> shards() {
		return this.transport.performRequestAsync(new ShardsRequest.Builder().build(), ShardsRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.snapshots

	/**
	 * Returns information about the snapshots stored in one or more repositories. A
	 * snapshot is a backup of an index or running Elasticsearch cluster. IMPORTANT:
	 * cat APIs are only intended for human consumption using the command line or
	 * Kibana console. They are not intended for use by applications. For
	 * application consumption, use the get snapshot API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SnapshotsResponse> snapshots(SnapshotsRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SnapshotsRequest, SnapshotsResponse, ErrorResponse> endpoint = (JsonEndpoint<SnapshotsRequest, SnapshotsResponse, ErrorResponse>) SnapshotsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns information about the snapshots stored in one or more repositories. A
	 * snapshot is a backup of an index or running Elasticsearch cluster. IMPORTANT:
	 * cat APIs are only intended for human consumption using the command line or
	 * Kibana console. They are not intended for use by applications. For
	 * application consumption, use the get snapshot API.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SnapshotsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<SnapshotsResponse> snapshots(
			Function<SnapshotsRequest.Builder, ObjectBuilder<SnapshotsRequest>> fn) {
		return snapshots(fn.apply(new SnapshotsRequest.Builder()).build());
	}

	/**
	 * Returns information about the snapshots stored in one or more repositories. A
	 * snapshot is a backup of an index or running Elasticsearch cluster. IMPORTANT:
	 * cat APIs are only intended for human consumption using the command line or
	 * Kibana console. They are not intended for use by applications. For
	 * application consumption, use the get snapshot API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-snapshots.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SnapshotsResponse> snapshots() {
		return this.transport.performRequestAsync(new SnapshotsRequest.Builder().build(), SnapshotsRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.tasks

	/**
	 * Returns information about tasks currently executing in the cluster.
	 * IMPORTANT: cat APIs are only intended for human consumption using the command
	 * line or Kibana console. They are not intended for use by applications. For
	 * application consumption, use the task management API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/tasks.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<TasksResponse> tasks(TasksRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<TasksRequest, TasksResponse, ErrorResponse> endpoint = (JsonEndpoint<TasksRequest, TasksResponse, ErrorResponse>) TasksRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns information about tasks currently executing in the cluster.
	 * IMPORTANT: cat APIs are only intended for human consumption using the command
	 * line or Kibana console. They are not intended for use by applications. For
	 * application consumption, use the task management API.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link TasksRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/tasks.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<TasksResponse> tasks(
			Function<TasksRequest.Builder, ObjectBuilder<TasksRequest>> fn) {
		return tasks(fn.apply(new TasksRequest.Builder()).build());
	}

	/**
	 * Returns information about tasks currently executing in the cluster.
	 * IMPORTANT: cat APIs are only intended for human consumption using the command
	 * line or Kibana console. They are not intended for use by applications. For
	 * application consumption, use the task management API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/tasks.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<TasksResponse> tasks() {
		return this.transport.performRequestAsync(new TasksRequest.Builder().build(), TasksRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.templates

	/**
	 * Returns information about index templates in a cluster. You can use index
	 * templates to apply index settings and field mappings to new indices at
	 * creation. IMPORTANT: cat APIs are only intended for human consumption using
	 * the command line or Kibana console. They are not intended for use by
	 * applications. For application consumption, use the get index template API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<TemplatesResponse> templates(TemplatesRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<TemplatesRequest, TemplatesResponse, ErrorResponse> endpoint = (JsonEndpoint<TemplatesRequest, TemplatesResponse, ErrorResponse>) TemplatesRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns information about index templates in a cluster. You can use index
	 * templates to apply index settings and field mappings to new indices at
	 * creation. IMPORTANT: cat APIs are only intended for human consumption using
	 * the command line or Kibana console. They are not intended for use by
	 * applications. For application consumption, use the get index template API.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link TemplatesRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<TemplatesResponse> templates(
			Function<TemplatesRequest.Builder, ObjectBuilder<TemplatesRequest>> fn) {
		return templates(fn.apply(new TemplatesRequest.Builder()).build());
	}

	/**
	 * Returns information about index templates in a cluster. You can use index
	 * templates to apply index settings and field mappings to new indices at
	 * creation. IMPORTANT: cat APIs are only intended for human consumption using
	 * the command line or Kibana console. They are not intended for use by
	 * applications. For application consumption, use the get index template API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-templates.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<TemplatesResponse> templates() {
		return this.transport.performRequestAsync(new TemplatesRequest.Builder().build(), TemplatesRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.thread_pool

	/**
	 * Returns thread pool statistics for each node in a cluster. Returned
	 * information includes all built-in thread pools and custom thread pools.
	 * IMPORTANT: cat APIs are only intended for human consumption using the command
	 * line or Kibana console. They are not intended for use by applications. For
	 * application consumption, use the nodes info API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-thread-pool.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ThreadPoolResponse> threadPool(ThreadPoolRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ThreadPoolRequest, ThreadPoolResponse, ErrorResponse> endpoint = (JsonEndpoint<ThreadPoolRequest, ThreadPoolResponse, ErrorResponse>) ThreadPoolRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns thread pool statistics for each node in a cluster. Returned
	 * information includes all built-in thread pools and custom thread pools.
	 * IMPORTANT: cat APIs are only intended for human consumption using the command
	 * line or Kibana console. They are not intended for use by applications. For
	 * application consumption, use the nodes info API.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ThreadPoolRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-thread-pool.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ThreadPoolResponse> threadPool(
			Function<ThreadPoolRequest.Builder, ObjectBuilder<ThreadPoolRequest>> fn) {
		return threadPool(fn.apply(new ThreadPoolRequest.Builder()).build());
	}

	/**
	 * Returns thread pool statistics for each node in a cluster. Returned
	 * information includes all built-in thread pools and custom thread pools.
	 * IMPORTANT: cat APIs are only intended for human consumption using the command
	 * line or Kibana console. They are not intended for use by applications. For
	 * application consumption, use the nodes info API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-thread-pool.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ThreadPoolResponse> threadPool() {
		return this.transport.performRequestAsync(new ThreadPoolRequest.Builder().build(), ThreadPoolRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.transforms

	/**
	 * Get transforms. Returns configuration and usage information about transforms.
	 * <p>
	 * CAT APIs are only intended for human consumption using the Kibana console or
	 * command line. They are not intended for use by applications. For application
	 * consumption, use the get transform statistics API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-transforms.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<TransformsResponse> transforms(TransformsRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<TransformsRequest, TransformsResponse, ErrorResponse> endpoint = (JsonEndpoint<TransformsRequest, TransformsResponse, ErrorResponse>) TransformsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get transforms. Returns configuration and usage information about transforms.
	 * <p>
	 * CAT APIs are only intended for human consumption using the Kibana console or
	 * command line. They are not intended for use by applications. For application
	 * consumption, use the get transform statistics API.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link TransformsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-transforms.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<TransformsResponse> transforms(
			Function<TransformsRequest.Builder, ObjectBuilder<TransformsRequest>> fn) {
		return transforms(fn.apply(new TransformsRequest.Builder()).build());
	}

	/**
	 * Get transforms. Returns configuration and usage information about transforms.
	 * <p>
	 * CAT APIs are only intended for human consumption using the Kibana console or
	 * command line. They are not intended for use by applications. For application
	 * consumption, use the get transform statistics API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/9.0/cat-transforms.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<TransformsResponse> transforms() {
		return this.transport.performRequestAsync(new TransformsRequest.Builder().build(), TransformsRequest._ENDPOINT,
				this.transportOptions);
	}

}
