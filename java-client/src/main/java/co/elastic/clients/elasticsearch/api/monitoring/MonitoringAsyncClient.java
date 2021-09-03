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

package co.elastic.clients.elasticsearch.api.monitoring;

import co.elastic.clients.base.ApiClient;
import co.elastic.clients.base.Transport;
import co.elastic.clients.elasticsearch.monitoring.BulkRequest;
import co.elastic.clients.elasticsearch.monitoring.BulkResponse;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.elasticsearch.client.RequestOptions;

/**
 * Client for the monitoring namespace.
 */
public class MonitoringAsyncClient extends ApiClient<MonitoringAsyncClient> {

	public MonitoringAsyncClient(Transport transport) {
		super(transport, null);
	}

	public MonitoringAsyncClient(Transport transport, RequestOptions options) {
		super(transport, options);
	}

	// ----- Endpoint: monitoring.bulk

	/**
	 * Used by the monitoring features to send monitoring data.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/monitor-elasticsearch-cluster.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<BulkResponse> bulk(BulkRequest request) throws IOException {
		return this.transport.performRequestAsync(request, BulkRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Used by the monitoring features to send monitoring data.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/monitor-elasticsearch-cluster.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<BulkResponse> bulk(Function<BulkRequest.Builder, ObjectBuilder<BulkRequest>> fn)
			throws IOException {
		return bulk(fn.apply(new BulkRequest.Builder()).build());
	}

	// ----- Misc

	/**
	 * Creates a new {@link #MonitoringAsyncClient} with specific request options.
	 */
	@Override
	public MonitoringAsyncClient withRequestOptions(@Nullable RequestOptions options) {
		return new MonitoringAsyncClient(transport, options);
	}

	/**
	 * Creates a new {@link #MonitoringAsyncClient} with specific request options,
	 * inheriting existing options.
	 *
	 * @param fn
	 *            a function taking an options builder initialized with the current
	 *            request options, or initialized with default values.
	 */
	public MonitoringAsyncClient withRequestOptions(Function<RequestOptions.Builder, RequestOptions.Builder> fn) {
		RequestOptions.Builder builder = requestOptions == null
				? RequestOptions.DEFAULT.toBuilder()
				: requestOptions.toBuilder();

		return withRequestOptions(fn.apply(builder).build());
	}
}
