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

package co.elastic.clients.elasticsearch.migration;

import co.elastic.clients.base.ApiClient;
import co.elastic.clients.base.Transport;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.elasticsearch.client.RequestOptions;

/**
 * Client for the migration namespace.
 */
public class MigrationApiClient extends ApiClient<MigrationApiClient> {

	public MigrationApiClient(Transport transport) {
		super(transport, null);
	}

	public MigrationApiClient(Transport transport, RequestOptions options) {
		super(transport, options);
	}

	// ----- Endpoint: migration.deprecations

	/**
	 * Retrieves information about different cluster, node, and index level settings
	 * that use deprecated features that will be removed or changed in the next
	 * major version.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/migration-api-deprecation.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeprecationsResponse deprecations(DeprecationsRequest request) throws IOException {
		return this.transport.performRequest(request, DeprecationsRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Retrieves information about different cluster, node, and index level settings
	 * that use deprecated features that will be removed or changed in the next
	 * major version.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/migration-api-deprecation.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeprecationsResponse deprecations(
			Function<DeprecationsRequest.Builder, ObjectBuilder<DeprecationsRequest>> fn) throws IOException {
		return deprecations(fn.apply(new DeprecationsRequest.Builder()).build());
	}

	// ----- Misc

	/**
	 * Creates a new {@link #MigrationApiClient} with specific request options.
	 */
	@Override
	public MigrationApiClient withRequestOptions(@Nullable RequestOptions options) {
		return new MigrationApiClient(transport, options);
	}

	/**
	 * Creates a new {@link #MigrationApiClient} with specific request options,
	 * inheriting existing options.
	 *
	 * @param fn
	 *            a function taking an options builder initialized with the current
	 *            request options, or initialized with default values.
	 */
	public MigrationApiClient withRequestOptions(Function<RequestOptions.Builder, RequestOptions.Builder> fn) {
		RequestOptions.Builder builder = requestOptions == null
				? RequestOptions.DEFAULT.toBuilder()
				: requestOptions.toBuilder();

		return withRequestOptions(fn.apply(builder).build());
	}
}
