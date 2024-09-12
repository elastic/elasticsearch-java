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

package co.elastic.clients.elasticsearch.cluster;

import co.elastic.clients.ApiClient;
import co.elastic.clients.elasticsearch._types.ElasticsearchException;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.JsonEndpoint;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.transport.endpoints.BooleanResponse;
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
 * Client for the cluster namespace.
 */
public class ElasticsearchClusterClient extends ApiClient<ElasticsearchTransport, ElasticsearchClusterClient> {

	public ElasticsearchClusterClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchClusterClient(ElasticsearchTransport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchClusterClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchClusterClient(this.transport, transportOptions);
	}

	// ----- Endpoint: cluster.delete_component_template

	/**
	 * Delete component templates. Deletes component templates. Component templates
	 * are building blocks for constructing index templates that specify index
	 * mappings, settings, and aliases.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/indices-component-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteComponentTemplateResponse deleteComponentTemplate(DeleteComponentTemplateRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteComponentTemplateRequest, DeleteComponentTemplateResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteComponentTemplateRequest, DeleteComponentTemplateResponse, ErrorResponse>) DeleteComponentTemplateRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete component templates. Deletes component templates. Component templates
	 * are building blocks for constructing index templates that specify index
	 * mappings, settings, and aliases.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteComponentTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/indices-component-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteComponentTemplateResponse deleteComponentTemplate(
			Function<DeleteComponentTemplateRequest.Builder, ObjectBuilder<DeleteComponentTemplateRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteComponentTemplate(fn.apply(new DeleteComponentTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: cluster.exists_component_template

	/**
	 * Check component templates. Returns information about whether a particular
	 * component template exists.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/indices-component-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public BooleanResponse existsComponentTemplate(ExistsComponentTemplateRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<ExistsComponentTemplateRequest, BooleanResponse, ErrorResponse> endpoint = (Endpoint<ExistsComponentTemplateRequest, BooleanResponse, ErrorResponse>) ExistsComponentTemplateRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Check component templates. Returns information about whether a particular
	 * component template exists.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ExistsComponentTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/indices-component-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public final BooleanResponse existsComponentTemplate(
			Function<ExistsComponentTemplateRequest.Builder, ObjectBuilder<ExistsComponentTemplateRequest>> fn)
			throws IOException, ElasticsearchException {
		return existsComponentTemplate(fn.apply(new ExistsComponentTemplateRequest.Builder()).build());
	}

	// ----- Endpoint: cluster.get_component_template

	/**
	 * Get component templates. Retrieves information about component templates.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/indices-component-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetComponentTemplateResponse getComponentTemplate(GetComponentTemplateRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetComponentTemplateRequest, GetComponentTemplateResponse, ErrorResponse> endpoint = (JsonEndpoint<GetComponentTemplateRequest, GetComponentTemplateResponse, ErrorResponse>) GetComponentTemplateRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get component templates. Retrieves information about component templates.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetComponentTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/indices-component-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetComponentTemplateResponse getComponentTemplate(
			Function<GetComponentTemplateRequest.Builder, ObjectBuilder<GetComponentTemplateRequest>> fn)
			throws IOException, ElasticsearchException {
		return getComponentTemplate(fn.apply(new GetComponentTemplateRequest.Builder()).build());
	}

	/**
	 * Get component templates. Retrieves information about component templates.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/indices-component-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetComponentTemplateResponse getComponentTemplate() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetComponentTemplateRequest.Builder().build(),
				GetComponentTemplateRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: cluster.info

	/**
	 * Get cluster info. Returns basic information about the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/cluster-info.html">Documentation
	 *      on elastic.co</a>
	 */

	public ClusterInfoResponse info(ClusterInfoRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ClusterInfoRequest, ClusterInfoResponse, ErrorResponse> endpoint = (JsonEndpoint<ClusterInfoRequest, ClusterInfoResponse, ErrorResponse>) ClusterInfoRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get cluster info. Returns basic information about the cluster.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ClusterInfoRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/cluster-info.html">Documentation
	 *      on elastic.co</a>
	 */

	public final ClusterInfoResponse info(Function<ClusterInfoRequest.Builder, ObjectBuilder<ClusterInfoRequest>> fn)
			throws IOException, ElasticsearchException {
		return info(fn.apply(new ClusterInfoRequest.Builder()).build());
	}

	// ----- Endpoint: cluster.put_component_template

	/**
	 * Create or update a component template. Creates or updates a component
	 * template. Component templates are building blocks for constructing index
	 * templates that specify index mappings, settings, and aliases.
	 * <p>
	 * An index template can be composed of multiple component templates. To use a
	 * component template, specify it in an index template’s
	 * <code>composed_of</code> list. Component templates are only applied to new
	 * data streams and indices as part of a matching index template.
	 * <p>
	 * Settings and mappings specified directly in the index template or the create
	 * index request override any settings or mappings specified in a component
	 * template.
	 * <p>
	 * Component templates are only used during index creation. For data streams,
	 * this includes data stream creation and the creation of a stream’s backing
	 * indices. Changes to component templates do not affect existing indices,
	 * including a stream’s backing indices.
	 * <p>
	 * You can use C-style <code>/* *\/</code> block comments in component
	 * templates. You can include comments anywhere in the request body except
	 * before the opening curly bracket.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/indices-component-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutComponentTemplateResponse putComponentTemplate(PutComponentTemplateRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutComponentTemplateRequest, PutComponentTemplateResponse, ErrorResponse> endpoint = (JsonEndpoint<PutComponentTemplateRequest, PutComponentTemplateResponse, ErrorResponse>) PutComponentTemplateRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Create or update a component template. Creates or updates a component
	 * template. Component templates are building blocks for constructing index
	 * templates that specify index mappings, settings, and aliases.
	 * <p>
	 * An index template can be composed of multiple component templates. To use a
	 * component template, specify it in an index template’s
	 * <code>composed_of</code> list. Component templates are only applied to new
	 * data streams and indices as part of a matching index template.
	 * <p>
	 * Settings and mappings specified directly in the index template or the create
	 * index request override any settings or mappings specified in a component
	 * template.
	 * <p>
	 * Component templates are only used during index creation. For data streams,
	 * this includes data stream creation and the creation of a stream’s backing
	 * indices. Changes to component templates do not affect existing indices,
	 * including a stream’s backing indices.
	 * <p>
	 * You can use C-style <code>/* *\/</code> block comments in component
	 * templates. You can include comments anywhere in the request body except
	 * before the opening curly bracket.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutComponentTemplateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/999.99/indices-component-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PutComponentTemplateResponse putComponentTemplate(
			Function<PutComponentTemplateRequest.Builder, ObjectBuilder<PutComponentTemplateRequest>> fn)
			throws IOException, ElasticsearchException {
		return putComponentTemplate(fn.apply(new PutComponentTemplateRequest.Builder()).build());
	}

}
