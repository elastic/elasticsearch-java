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

package co.elastic.clients.elasticsearch.monitoring;

import co.elastic.clients.ApiClient;
import co.elastic.clients.elasticsearch._types.ElasticsearchException;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.function.Function;
import javax.annotation.Nullable;

/**
 * Client for the monitoring namespace.
 */
public class ElasticsearchMonitoringClient extends ApiClient<ElasticsearchMonitoringClient> {

	public ElasticsearchMonitoringClient(Transport transport) {
		super(transport, null);
	}

	public ElasticsearchMonitoringClient(Transport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchMonitoringClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchMonitoringClient(this.transport, transportOptions);
	}

	// ----- Endpoint: monitoring.bulk

	/**
	 * Used by the monitoring features to send monitoring data.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/monitor-elasticsearch-cluster.html">Documentation
	 *      on elastic.co</a>
	 */

	public BulkResponse bulk(BulkRequest request) throws IOException, ElasticsearchException {
		return this.transport.performRequest(request, BulkRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Used by the monitoring features to send monitoring data.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link BulkRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/monitor-elasticsearch-cluster.html">Documentation
	 *      on elastic.co</a>
	 */

	public final BulkResponse bulk(Function<BulkRequest.Builder, ObjectBuilder<BulkRequest>> fn)
			throws IOException, ElasticsearchException {
		return bulk(fn.apply(new BulkRequest.Builder()).build());
	}

}
