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
	 * Shows information about currently configured aliases to indices including
	 * filter and routing infos.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.11/cat-alias.html">Documentation
	 *      on elastic.co</a>
	 */

	public AliasesResponse aliases(AliasesRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<AliasesRequest, AliasesResponse, ErrorResponse> endpoint = (JsonEndpoint<AliasesRequest, AliasesResponse, ErrorResponse>) AliasesRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Shows information about currently configured aliases to indices including
	 * filter and routing infos.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link AliasesRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.11/cat-alias.html">Documentation
	 *      on elastic.co</a>
	 */

	public final AliasesResponse aliases(Function<AliasesRequest.Builder, ObjectBuilder<AliasesRequest>> fn)
			throws IOException, ElasticsearchException {
		return aliases(fn.apply(new AliasesRequest.Builder()).build());
	}

	/**
	 * Shows information about currently configured aliases to indices including
	 * filter and routing infos.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.11/cat-alias.html">Documentation
	 *      on elastic.co</a>
	 */

	public AliasesResponse aliases() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new AliasesRequest.Builder().build(), AliasesRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.component_templates

	/**
	 * Returns information about existing component_templates templates.
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
	 * Returns information about existing component_templates templates.
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
	 * Returns information about existing component_templates templates.
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
	 * Provides quick access to the document count of the entire cluster, or
	 * individual indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.11/cat-count.html">Documentation
	 *      on elastic.co</a>
	 */

	public CountResponse count(CountRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<CountRequest, CountResponse, ErrorResponse> endpoint = (JsonEndpoint<CountRequest, CountResponse, ErrorResponse>) CountRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Provides quick access to the document count of the entire cluster, or
	 * individual indices.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CountRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.11/cat-count.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CountResponse count(Function<CountRequest.Builder, ObjectBuilder<CountRequest>> fn)
			throws IOException, ElasticsearchException {
		return count(fn.apply(new CountRequest.Builder()).build());
	}

	/**
	 * Provides quick access to the document count of the entire cluster, or
	 * individual indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.11/cat-count.html">Documentation
	 *      on elastic.co</a>
	 */

	public CountResponse count() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new CountRequest.Builder().build(), CountRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.help

	/**
	 * Returns help for the Cat APIs.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.11/cat.html">Documentation
	 *      on elastic.co</a>
	 */
	public HelpResponse help() throws IOException, ElasticsearchException {
		return this.transport.performRequest(HelpRequest._INSTANCE, HelpRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: cat.indices

	/**
	 * Returns information about indices: number of primaries and replicas, document
	 * counts, disk size, ...
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.11/cat-indices.html">Documentation
	 *      on elastic.co</a>
	 */

	public IndicesResponse indices(IndicesRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<IndicesRequest, IndicesResponse, ErrorResponse> endpoint = (JsonEndpoint<IndicesRequest, IndicesResponse, ErrorResponse>) IndicesRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Returns information about indices: number of primaries and replicas, document
	 * counts, disk size, ...
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link IndicesRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.11/cat-indices.html">Documentation
	 *      on elastic.co</a>
	 */

	public final IndicesResponse indices(Function<IndicesRequest.Builder, ObjectBuilder<IndicesRequest>> fn)
			throws IOException, ElasticsearchException {
		return indices(fn.apply(new IndicesRequest.Builder()).build());
	}

	/**
	 * Returns information about indices: number of primaries and replicas, document
	 * counts, disk size, ...
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.11/cat-indices.html">Documentation
	 *      on elastic.co</a>
	 */

	public IndicesResponse indices() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new IndicesRequest.Builder().build(), IndicesRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.ml_data_frame_analytics

	/**
	 * Gets configuration and usage information about data frame analytics jobs.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.11/cat-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public MlDataFrameAnalyticsResponse mlDataFrameAnalytics(MlDataFrameAnalyticsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<MlDataFrameAnalyticsRequest, MlDataFrameAnalyticsResponse, ErrorResponse> endpoint = (JsonEndpoint<MlDataFrameAnalyticsRequest, MlDataFrameAnalyticsResponse, ErrorResponse>) MlDataFrameAnalyticsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Gets configuration and usage information about data frame analytics jobs.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link MlDataFrameAnalyticsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.11/cat-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public final MlDataFrameAnalyticsResponse mlDataFrameAnalytics(
			Function<MlDataFrameAnalyticsRequest.Builder, ObjectBuilder<MlDataFrameAnalyticsRequest>> fn)
			throws IOException, ElasticsearchException {
		return mlDataFrameAnalytics(fn.apply(new MlDataFrameAnalyticsRequest.Builder()).build());
	}

	/**
	 * Gets configuration and usage information about data frame analytics jobs.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.11/cat-dfanalytics.html">Documentation
	 *      on elastic.co</a>
	 */

	public MlDataFrameAnalyticsResponse mlDataFrameAnalytics() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new MlDataFrameAnalyticsRequest.Builder().build(),
				MlDataFrameAnalyticsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: cat.ml_datafeeds

	/**
	 * Gets configuration and usage information about datafeeds.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.11/cat-datafeeds.html">Documentation
	 *      on elastic.co</a>
	 */

	public MlDatafeedsResponse mlDatafeeds(MlDatafeedsRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<MlDatafeedsRequest, MlDatafeedsResponse, ErrorResponse> endpoint = (JsonEndpoint<MlDatafeedsRequest, MlDatafeedsResponse, ErrorResponse>) MlDatafeedsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Gets configuration and usage information about datafeeds.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link MlDatafeedsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.11/cat-datafeeds.html">Documentation
	 *      on elastic.co</a>
	 */

	public final MlDatafeedsResponse mlDatafeeds(
			Function<MlDatafeedsRequest.Builder, ObjectBuilder<MlDatafeedsRequest>> fn)
			throws IOException, ElasticsearchException {
		return mlDatafeeds(fn.apply(new MlDatafeedsRequest.Builder()).build());
	}

	/**
	 * Gets configuration and usage information about datafeeds.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.11/cat-datafeeds.html">Documentation
	 *      on elastic.co</a>
	 */

	public MlDatafeedsResponse mlDatafeeds() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new MlDatafeedsRequest.Builder().build(), MlDatafeedsRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.ml_jobs

	/**
	 * Gets configuration and usage information about anomaly detection jobs.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.11/cat-anomaly-detectors.html">Documentation
	 *      on elastic.co</a>
	 */

	public MlJobsResponse mlJobs(MlJobsRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<MlJobsRequest, MlJobsResponse, ErrorResponse> endpoint = (JsonEndpoint<MlJobsRequest, MlJobsResponse, ErrorResponse>) MlJobsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Gets configuration and usage information about anomaly detection jobs.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link MlJobsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.11/cat-anomaly-detectors.html">Documentation
	 *      on elastic.co</a>
	 */

	public final MlJobsResponse mlJobs(Function<MlJobsRequest.Builder, ObjectBuilder<MlJobsRequest>> fn)
			throws IOException, ElasticsearchException {
		return mlJobs(fn.apply(new MlJobsRequest.Builder()).build());
	}

	/**
	 * Gets configuration and usage information about anomaly detection jobs.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.11/cat-anomaly-detectors.html">Documentation
	 *      on elastic.co</a>
	 */

	public MlJobsResponse mlJobs() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new MlJobsRequest.Builder().build(), MlJobsRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: cat.ml_trained_models

	/**
	 * Gets configuration and usage information about inference trained models.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.11/cat-trained-model.html">Documentation
	 *      on elastic.co</a>
	 */

	public MlTrainedModelsResponse mlTrainedModels(MlTrainedModelsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<MlTrainedModelsRequest, MlTrainedModelsResponse, ErrorResponse> endpoint = (JsonEndpoint<MlTrainedModelsRequest, MlTrainedModelsResponse, ErrorResponse>) MlTrainedModelsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Gets configuration and usage information about inference trained models.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link MlTrainedModelsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.11/cat-trained-model.html">Documentation
	 *      on elastic.co</a>
	 */

	public final MlTrainedModelsResponse mlTrainedModels(
			Function<MlTrainedModelsRequest.Builder, ObjectBuilder<MlTrainedModelsRequest>> fn)
			throws IOException, ElasticsearchException {
		return mlTrainedModels(fn.apply(new MlTrainedModelsRequest.Builder()).build());
	}

	/**
	 * Gets configuration and usage information about inference trained models.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.11/cat-trained-model.html">Documentation
	 *      on elastic.co</a>
	 */

	public MlTrainedModelsResponse mlTrainedModels() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new MlTrainedModelsRequest.Builder().build(),
				MlTrainedModelsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: cat.transforms

	/**
	 * Gets configuration and usage information about transforms.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.11/cat-transforms.html">Documentation
	 *      on elastic.co</a>
	 */

	public TransformsResponse transforms(TransformsRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<TransformsRequest, TransformsResponse, ErrorResponse> endpoint = (JsonEndpoint<TransformsRequest, TransformsResponse, ErrorResponse>) TransformsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Gets configuration and usage information about transforms.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link TransformsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.11/cat-transforms.html">Documentation
	 *      on elastic.co</a>
	 */

	public final TransformsResponse transforms(Function<TransformsRequest.Builder, ObjectBuilder<TransformsRequest>> fn)
			throws IOException, ElasticsearchException {
		return transforms(fn.apply(new TransformsRequest.Builder()).build());
	}

	/**
	 * Gets configuration and usage information about transforms.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/8.11/cat-transforms.html">Documentation
	 *      on elastic.co</a>
	 */

	public TransformsResponse transforms() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new TransformsRequest.Builder().build(), TransformsRequest._ENDPOINT,
				this.transportOptions);
	}

}
