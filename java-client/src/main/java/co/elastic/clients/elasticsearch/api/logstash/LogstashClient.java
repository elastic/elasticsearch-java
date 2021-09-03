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

package co.elastic.clients.elasticsearch.api.logstash;

import co.elastic.clients.base.ApiClient;
import co.elastic.clients.base.Transport;
import co.elastic.clients.elasticsearch.logstash.PipelineDeleteRequest;
import co.elastic.clients.elasticsearch.logstash.PipelineDeleteResponse;
import co.elastic.clients.elasticsearch.logstash.PipelineGetRequest;
import co.elastic.clients.elasticsearch.logstash.PipelineGetResponse;
import co.elastic.clients.elasticsearch.logstash.PipelinePutRequest;
import co.elastic.clients.elasticsearch.logstash.PipelinePutResponse;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.elasticsearch.client.RequestOptions;

/**
 * Client for the logstash namespace.
 */
public class LogstashClient extends ApiClient<LogstashClient> {

	public LogstashClient(Transport transport) {
		super(transport, null);
	}

	public LogstashClient(Transport transport, RequestOptions options) {
		super(transport, options);
	}

	// ----- Endpoint: logstash.delete_pipeline

	/**
	 * Deletes Logstash Pipelines used by Central Management
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/logstash-api-delete-pipeline.html">Documentation
	 *      on elastic.co</a>
	 */

	public PipelineDeleteResponse deletePipeline(PipelineDeleteRequest request) throws IOException {
		return this.transport.performRequest(request, PipelineDeleteRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Deletes Logstash Pipelines used by Central Management
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/logstash-api-delete-pipeline.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PipelineDeleteResponse deletePipeline(
			Function<PipelineDeleteRequest.Builder, ObjectBuilder<PipelineDeleteRequest>> fn) throws IOException {
		return deletePipeline(fn.apply(new PipelineDeleteRequest.Builder()).build());
	}

	// ----- Endpoint: logstash.get_pipeline

	/**
	 * Retrieves Logstash Pipelines used by Central Management
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/logstash-api-get-pipeline.html">Documentation
	 *      on elastic.co</a>
	 */

	public PipelineGetResponse getPipeline(PipelineGetRequest request) throws IOException {
		return this.transport.performRequest(request, PipelineGetRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Retrieves Logstash Pipelines used by Central Management
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/logstash-api-get-pipeline.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PipelineGetResponse getPipeline(
			Function<PipelineGetRequest.Builder, ObjectBuilder<PipelineGetRequest>> fn) throws IOException {
		return getPipeline(fn.apply(new PipelineGetRequest.Builder()).build());
	}

	// ----- Endpoint: logstash.put_pipeline

	/**
	 * Adds and updates Logstash Pipelines used for Central Management
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/logstash-api-put-pipeline.html">Documentation
	 *      on elastic.co</a>
	 */

	public PipelinePutResponse putPipeline(PipelinePutRequest request) throws IOException {
		return this.transport.performRequest(request, PipelinePutRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Adds and updates Logstash Pipelines used for Central Management
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/logstash-api-put-pipeline.html">Documentation
	 *      on elastic.co</a>
	 */

	public final PipelinePutResponse putPipeline(
			Function<PipelinePutRequest.Builder, ObjectBuilder<PipelinePutRequest>> fn) throws IOException {
		return putPipeline(fn.apply(new PipelinePutRequest.Builder()).build());
	}

	// ----- Misc

	/**
	 * Creates a new {@link #LogstashClient} with specific request options.
	 */
	@Override
	public LogstashClient withRequestOptions(@Nullable RequestOptions options) {
		return new LogstashClient(transport, options);
	}

	/**
	 * Creates a new {@link #LogstashClient} with specific request options,
	 * inheriting existing options.
	 *
	 * @param fn
	 *            a function taking an options builder initialized with the current
	 *            request options, or initialized with default values.
	 */
	public LogstashClient withRequestOptions(Function<RequestOptions.Builder, RequestOptions.Builder> fn) {
		RequestOptions.Builder builder = requestOptions == null
				? RequestOptions.DEFAULT.toBuilder()
				: requestOptions.toBuilder();

		return withRequestOptions(fn.apply(builder).build());
	}
}
