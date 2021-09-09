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

package co.elastic.clients.elasticsearch.api.dangling_indices;

import co.elastic.clients.base.ApiClient;
import co.elastic.clients.base.Transport;
import co.elastic.clients.elasticsearch.dangling_indices.DeleteDanglingIndexRequest;
import co.elastic.clients.elasticsearch.dangling_indices.DeleteDanglingIndexResponse;
import co.elastic.clients.elasticsearch.dangling_indices.ImportDanglingIndexRequest;
import co.elastic.clients.elasticsearch.dangling_indices.ImportDanglingIndexResponse;
import co.elastic.clients.elasticsearch.dangling_indices.ListDanglingIndicesRequest;
import co.elastic.clients.elasticsearch.dangling_indices.ListDanglingIndicesResponse;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.elasticsearch.client.RequestOptions;

/**
 * Client for the dangling_indices namespace.
 */
public class DanglingIndicesClient extends ApiClient<DanglingIndicesClient> {

	public DanglingIndicesClient(Transport transport) {
		super(transport, null);
	}

	public DanglingIndicesClient(Transport transport, RequestOptions options) {
		super(transport, options);
	}

	// ----- Endpoint: dangling_indices.delete_dangling_index

	/**
	 * Deletes the specified dangling index
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-gateway-dangling-indices.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteDanglingIndexResponse deleteDanglingIndex(DeleteDanglingIndexRequest request) throws IOException {
		return this.transport.performRequest(request, DeleteDanglingIndexRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Deletes the specified dangling index
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-gateway-dangling-indices.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteDanglingIndexResponse deleteDanglingIndex(
			Function<DeleteDanglingIndexRequest.Builder, ObjectBuilder<DeleteDanglingIndexRequest>> fn)
			throws IOException {
		return deleteDanglingIndex(fn.apply(new DeleteDanglingIndexRequest.Builder()).build());
	}

	// ----- Endpoint: dangling_indices.import_dangling_index

	/**
	 * Imports the specified dangling index
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-gateway-dangling-indices.html">Documentation
	 *      on elastic.co</a>
	 */

	public ImportDanglingIndexResponse importDanglingIndex(ImportDanglingIndexRequest request) throws IOException {
		return this.transport.performRequest(request, ImportDanglingIndexRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Imports the specified dangling index
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-gateway-dangling-indices.html">Documentation
	 *      on elastic.co</a>
	 */

	public final ImportDanglingIndexResponse importDanglingIndex(
			Function<ImportDanglingIndexRequest.Builder, ObjectBuilder<ImportDanglingIndexRequest>> fn)
			throws IOException {
		return importDanglingIndex(fn.apply(new ImportDanglingIndexRequest.Builder()).build());
	}

	// ----- Endpoint: dangling_indices.list_dangling_indices

	/**
	 * Returns all dangling indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-gateway-dangling-indices.html">Documentation
	 *      on elastic.co</a>
	 */
	public ListDanglingIndicesResponse listDanglingIndices() throws IOException {
		return this.transport.performRequest(ListDanglingIndicesRequest.INSTANCE, ListDanglingIndicesRequest.ENDPOINT,
				this.requestOptions);
	}

	// ----- Misc

	/**
	 * Creates a new {@link #DanglingIndicesClient} with specific request options.
	 */
	@Override
	public DanglingIndicesClient withRequestOptions(@Nullable RequestOptions options) {
		return new DanglingIndicesClient(transport, options);
	}

	/**
	 * Creates a new {@link #DanglingIndicesClient} with specific request options,
	 * inheriting existing options.
	 *
	 * @param fn
	 *            a function taking an options builder initialized with the current
	 *            request options, or initialized with default values.
	 */
	public DanglingIndicesClient withRequestOptions(Function<RequestOptions.Builder, RequestOptions.Builder> fn) {
		RequestOptions.Builder builder = requestOptions == null
				? RequestOptions.DEFAULT.toBuilder()
				: requestOptions.toBuilder();

		return withRequestOptions(fn.apply(builder).build());
	}
}
