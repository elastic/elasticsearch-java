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

package co.elastic.clients.elasticsearch.simulate;

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
 * Client for the simulate namespace.
 */
public class ElasticsearchSimulateClient extends ApiClient<ElasticsearchTransport, ElasticsearchSimulateClient> {

	public ElasticsearchSimulateClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchSimulateClient(ElasticsearchTransport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchSimulateClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchSimulateClient(this.transport, transportOptions);
	}

	// ----- Endpoint: simulate.ingest

	/**
	 * Simulate data ingestion. Run ingest pipelines against a set of provided
	 * documents, optionally with substitute pipeline definitions, to simulate
	 * ingesting data into an index.
	 * <p>
	 * This API is meant to be used for troubleshooting or pipeline development, as
	 * it does not actually index any data into Elasticsearch.
	 * <p>
	 * The API runs the default and final pipeline for that index against a set of
	 * documents provided in the body of the request. If a pipeline contains a
	 * reroute processor, it follows that reroute processor to the new index,
	 * running that index's pipelines as well the same way that a non-simulated
	 * ingest would. No data is indexed into Elasticsearch. Instead, the transformed
	 * document is returned, along with the list of pipelines that have been run and
	 * the name of the index where the document would have been indexed if this were
	 * not a simulation. The transformed document is validated against the mappings
	 * that would apply to this index, and any validation error is reported in the
	 * result.
	 * <p>
	 * This API differs from the simulate pipeline API in that you specify a single
	 * pipeline for that API, and it runs only that one pipeline. The simulate
	 * pipeline API is more useful for developing a single pipeline, while the
	 * simulate ingest API is more useful for troubleshooting the interaction of the
	 * various pipelines that get applied when ingesting into an index.
	 * <p>
	 * By default, the pipeline definitions that are currently in the system are
	 * used. However, you can supply substitute pipeline definitions in the body of
	 * the request. These will be used in place of the pipeline definitions that are
	 * already in the system. This can be used to replace existing pipeline
	 * definitions or to create new ones. The pipeline substitutions are used only
	 * within this request.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-simulate-ingest">Documentation
	 *      on elastic.co</a>
	 */

	public IngestResponse ingest(IngestRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<IngestRequest, IngestResponse, ErrorResponse> endpoint = (JsonEndpoint<IngestRequest, IngestResponse, ErrorResponse>) IngestRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Simulate data ingestion. Run ingest pipelines against a set of provided
	 * documents, optionally with substitute pipeline definitions, to simulate
	 * ingesting data into an index.
	 * <p>
	 * This API is meant to be used for troubleshooting or pipeline development, as
	 * it does not actually index any data into Elasticsearch.
	 * <p>
	 * The API runs the default and final pipeline for that index against a set of
	 * documents provided in the body of the request. If a pipeline contains a
	 * reroute processor, it follows that reroute processor to the new index,
	 * running that index's pipelines as well the same way that a non-simulated
	 * ingest would. No data is indexed into Elasticsearch. Instead, the transformed
	 * document is returned, along with the list of pipelines that have been run and
	 * the name of the index where the document would have been indexed if this were
	 * not a simulation. The transformed document is validated against the mappings
	 * that would apply to this index, and any validation error is reported in the
	 * result.
	 * <p>
	 * This API differs from the simulate pipeline API in that you specify a single
	 * pipeline for that API, and it runs only that one pipeline. The simulate
	 * pipeline API is more useful for developing a single pipeline, while the
	 * simulate ingest API is more useful for troubleshooting the interaction of the
	 * various pipelines that get applied when ingesting into an index.
	 * <p>
	 * By default, the pipeline definitions that are currently in the system are
	 * used. However, you can supply substitute pipeline definitions in the body of
	 * the request. These will be used in place of the pipeline definitions that are
	 * already in the system. This can be used to replace existing pipeline
	 * definitions or to create new ones. The pipeline substitutions are used only
	 * within this request.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link IngestRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/v9/operation/operation-simulate-ingest">Documentation
	 *      on elastic.co</a>
	 */

	public final IngestResponse ingest(Function<IngestRequest.Builder, ObjectBuilder<IngestRequest>> fn)
			throws IOException, ElasticsearchException {
		return ingest(fn.apply(new IngestRequest.Builder()).build());
	}

}
