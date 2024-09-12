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
 * Client for the cat namespace.
 */
public class ElasticsearchCatClient extends ApiClient<ElasticsearchTransport, ElasticsearchCatClient> {

	public ElasticsearchCatClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchCatClient(ElasticsearchTransport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchCatClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchCatClient(this.transport, transportOptions);
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/cat-alias.html">Documentation
	 *      on elastic.co</a>
	 */

	public AliasesResponse aliases(AliasesRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<AliasesRequest, AliasesResponse, ErrorResponse> endpoint = (JsonEndpoint<AliasesRequest, AliasesResponse, ErrorResponse>) AliasesRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/cat-alias.html">Documentation
	 *      on elastic.co</a>
	 */

	public final AliasesResponse aliases(Function<AliasesRequest.Builder, ObjectBuilder<AliasesRequest>> fn)
			throws IOException, ElasticsearchException {
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/cat-alias.html">Documentation
	 *      on elastic.co</a>
	 */

	public AliasesResponse aliases() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new AliasesRequest.Builder().build(), AliasesRequest._ENDPOINT,
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

	public ComponentTemplatesResponse componentTemplates(ComponentTemplatesRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ComponentTemplatesRequest, ComponentTemplatesResponse, ErrorResponse> endpoint = (JsonEndpoint<ComponentTemplatesRequest, ComponentTemplatesResponse, ErrorResponse>) ComponentTemplatesRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final ComponentTemplatesResponse componentTemplates(
			Function<ComponentTemplatesRequest.Builder, ObjectBuilder<ComponentTemplatesRequest>> fn)
			throws IOException, ElasticsearchException {
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

	public ComponentTemplatesResponse componentTemplates() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new ComponentTemplatesRequest.Builder().build(),
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/cat-count.html">Documentation
	 *      on elastic.co</a>
	 */

	public CountResponse count(CountRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<CountRequest, CountResponse, ErrorResponse> endpoint = (JsonEndpoint<CountRequest, CountResponse, ErrorResponse>) CountRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/cat-count.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CountResponse count(Function<CountRequest.Builder, ObjectBuilder<CountRequest>> fn)
			throws IOException, ElasticsearchException {
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/cat-count.html">Documentation
	 *      on elastic.co</a>
	 */

	public CountResponse count() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new CountRequest.Builder().build(), CountRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.help

	/**
	 * Get CAT help. Returns help for the CAT APIs.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/cat.html">Documentation
	 *      on elastic.co</a>
	 */
	public HelpResponse help() throws IOException, ElasticsearchException {
		return this.transport.performRequest(HelpRequest._INSTANCE, HelpRequest._ENDPOINT, this.transportOptions);
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/cat-indices.html">Documentation
	 *      on elastic.co</a>
	 */

	public IndicesResponse indices(IndicesRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<IndicesRequest, IndicesResponse, ErrorResponse> endpoint = (JsonEndpoint<IndicesRequest, IndicesResponse, ErrorResponse>) IndicesRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/cat-indices.html">Documentation
	 *      on elastic.co</a>
	 */

	public final IndicesResponse indices(Function<IndicesRequest.Builder, ObjectBuilder<IndicesRequest>> fn)
			throws IOException, ElasticsearchException {
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/cat-indices.html">Documentation
	 *      on elastic.co</a>
	 */

	public IndicesResponse indices() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new IndicesRequest.Builder().build(), IndicesRequest._ENDPOINT,
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/cat-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public MlDataFrameAnalyticsResponse mlDataFrameAnalytics(MlDataFrameAnalyticsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<MlDataFrameAnalyticsRequest, MlDataFrameAnalyticsResponse, ErrorResponse> endpoint = (JsonEndpoint<MlDataFrameAnalyticsRequest, MlDataFrameAnalyticsResponse, ErrorResponse>) MlDataFrameAnalyticsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/cat-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public final MlDataFrameAnalyticsResponse mlDataFrameAnalytics(
			Function<MlDataFrameAnalyticsRequest.Builder, ObjectBuilder<MlDataFrameAnalyticsRequest>> fn)
			throws IOException, ElasticsearchException {
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/cat-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public MlDataFrameAnalyticsResponse mlDataFrameAnalytics() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new MlDataFrameAnalyticsRequest.Builder().build(),
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/cat-datafeeds.html">Documentation
	 *      on elastic.co</a>
	 */

	public MlDatafeedsResponse mlDatafeeds(MlDatafeedsRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<MlDatafeedsRequest, MlDatafeedsResponse, ErrorResponse> endpoint = (JsonEndpoint<MlDatafeedsRequest, MlDatafeedsResponse, ErrorResponse>) MlDatafeedsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/cat-datafeeds.html">Documentation
	 *      on elastic.co</a>
	 */

	public final MlDatafeedsResponse mlDatafeeds(
			Function<MlDatafeedsRequest.Builder, ObjectBuilder<MlDatafeedsRequest>> fn)
			throws IOException, ElasticsearchException {
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/cat-datafeeds.html">Documentation
	 *      on elastic.co</a>
	 */

	public MlDatafeedsResponse mlDatafeeds() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new MlDatafeedsRequest.Builder().build(), MlDatafeedsRequest._ENDPOINT,
				this.transportOptions);
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/cat-anomaly-detectors.html">Documentation
	 *      on elastic.co</a>
	 */

	public MlJobsResponse mlJobs(MlJobsRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<MlJobsRequest, MlJobsResponse, ErrorResponse> endpoint = (JsonEndpoint<MlJobsRequest, MlJobsResponse, ErrorResponse>) MlJobsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/cat-anomaly-detectors.html">Documentation
	 *      on elastic.co</a>
	 */

	public final MlJobsResponse mlJobs(Function<MlJobsRequest.Builder, ObjectBuilder<MlJobsRequest>> fn)
			throws IOException, ElasticsearchException {
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/cat-anomaly-detectors.html">Documentation
	 *      on elastic.co</a>
	 */

	public MlJobsResponse mlJobs() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new MlJobsRequest.Builder().build(), MlJobsRequest._ENDPOINT,
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/cat-trained-model.html">Documentation
	 *      on elastic.co</a>
	 */

	public MlTrainedModelsResponse mlTrainedModels(MlTrainedModelsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<MlTrainedModelsRequest, MlTrainedModelsResponse, ErrorResponse> endpoint = (JsonEndpoint<MlTrainedModelsRequest, MlTrainedModelsResponse, ErrorResponse>) MlTrainedModelsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/cat-trained-model.html">Documentation
	 *      on elastic.co</a>
	 */

	public final MlTrainedModelsResponse mlTrainedModels(
			Function<MlTrainedModelsRequest.Builder, ObjectBuilder<MlTrainedModelsRequest>> fn)
			throws IOException, ElasticsearchException {
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/cat-trained-model.html">Documentation
	 *      on elastic.co</a>
	 */

	public MlTrainedModelsResponse mlTrainedModels() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new MlTrainedModelsRequest.Builder().build(),
				MlTrainedModelsRequest._ENDPOINT, this.transportOptions);
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/cat-transforms.html">Documentation
	 *      on elastic.co</a>
	 */

	public TransformsResponse transforms(TransformsRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<TransformsRequest, TransformsResponse, ErrorResponse> endpoint = (JsonEndpoint<TransformsRequest, TransformsResponse, ErrorResponse>) TransformsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/cat-transforms.html">Documentation
	 *      on elastic.co</a>
	 */

	public final TransformsResponse transforms(Function<TransformsRequest.Builder, ObjectBuilder<TransformsRequest>> fn)
			throws IOException, ElasticsearchException {
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
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/cat-transforms.html">Documentation
	 *      on elastic.co</a>
	 */

	public TransformsResponse transforms() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new TransformsRequest.Builder().build(), TransformsRequest._ENDPOINT,
				this.transportOptions);
	}

}
