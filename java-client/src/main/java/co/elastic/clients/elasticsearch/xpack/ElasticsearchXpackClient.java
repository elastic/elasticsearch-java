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

package co.elastic.clients.elasticsearch.xpack;

import co.elastic.clients.base.ApiClient;
import co.elastic.clients.base.Transport;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.function.Function;
import javax.annotation.Nullable;

/**
 * Client for the xpack namespace.
 */
public class ElasticsearchXpackClient extends ApiClient {

	public ElasticsearchXpackClient(Transport transport) {
		super(transport);
	}

	// ----- Endpoint: xpack.info

	/**
	 * Retrieves information about the installed X-Pack features.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/info-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public XpackInfoResponse info(XpackInfoRequest request) throws IOException {
		return this.transport.performRequest(request, XpackInfoRequest.ENDPOINT);
	}

	/**
	 * Retrieves information about the installed X-Pack features.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/info-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final XpackInfoResponse info(Function<XpackInfoRequest.Builder, ObjectBuilder<XpackInfoRequest>> fn)
			throws IOException {
		return info(fn.apply(new XpackInfoRequest.Builder()).build());
	}

	// ----- Endpoint: xpack.usage

	/**
	 * Retrieves usage information about the installed X-Pack features.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/usage-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public UsageResponse usage(UsageRequest request) throws IOException {
		return this.transport.performRequest(request, UsageRequest.ENDPOINT);
	}

	/**
	 * Retrieves usage information about the installed X-Pack features.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/usage-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final UsageResponse usage(Function<UsageRequest.Builder, ObjectBuilder<UsageRequest>> fn)
			throws IOException {
		return usage(fn.apply(new UsageRequest.Builder()).build());
	}

}
