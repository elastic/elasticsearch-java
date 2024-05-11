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

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch.cat.thread_pool.ThreadPoolSize;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
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

// typedef: cat.thread_pool.Request

/**
 * Returns cluster-wide thread pool statistics per node. By default the active,
 * queue and rejected statistics are returned for all thread pools.
 * 
 * @see <a href="../doc-files/api-spec.html#cat.thread_pool.Request">API
 *      specification</a>
 */

public class ThreadPoolRequest extends CatRequestBase {
	@Nullable
	private final ThreadPoolSize size;

	private final List<String> threadPoolPatterns;

	// ---------------------------------------------------------------------------------------------

	private ThreadPoolRequest(Builder builder) {

		this.size = builder.size;
		this.threadPoolPatterns = ApiTypeHelper.unmodifiable(builder.threadPoolPatterns);

	}

	public static ThreadPoolRequest of(Function<Builder, ObjectBuilder<ThreadPoolRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The multiplier in which to display values
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final ThreadPoolSize size() {
		return this.size;
	}

	/**
	 * A comma-separated list of regular-expressions to filter the thread pools in
	 * the output
	 * <p>
	 * API name: {@code thread_pool_patterns}
	 */
	public final List<String> threadPoolPatterns() {
		return this.threadPoolPatterns;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ThreadPoolRequest}.
	 */

	public static class Builder extends CatRequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ThreadPoolRequest> {
		@Nullable
		private ThreadPoolSize size;

		@Nullable
		private List<String> threadPoolPatterns;

		/**
		 * The multiplier in which to display values
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable ThreadPoolSize value) {
			this.size = value;
			return this;
		}

		/**
		 * A comma-separated list of regular-expressions to filter the thread pools in
		 * the output
		 * <p>
		 * API name: {@code thread_pool_patterns}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>threadPoolPatterns</code>.
		 */
		public final Builder threadPoolPatterns(List<String> list) {
			this.threadPoolPatterns = _listAddAll(this.threadPoolPatterns, list);
			return this;
		}

		/**
		 * A comma-separated list of regular-expressions to filter the thread pools in
		 * the output
		 * <p>
		 * API name: {@code thread_pool_patterns}
		 * <p>
		 * Adds one or more values to <code>threadPoolPatterns</code>.
		 */
		public final Builder threadPoolPatterns(String value, String... values) {
			this.threadPoolPatterns = _listAdd(this.threadPoolPatterns, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ThreadPoolRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ThreadPoolRequest build() {
			_checkSingleUse();

			return new ThreadPoolRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code cat.thread_pool}".
	 */
	public static final Endpoint<ThreadPoolRequest, ThreadPoolResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/cat.thread_pool",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _threadPoolPatterns = 1 << 0;

				int propsSet = 0;

				if (ApiTypeHelper.isDefined(request.threadPoolPatterns()))
					propsSet |= _threadPoolPatterns;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_cat");
					buf.append("/thread_pool");
					return buf.toString();
				}
				if (propsSet == (_threadPoolPatterns)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_cat");
					buf.append("/thread_pool");
					buf.append("/");
					SimpleEndpoint.pathEncode(
							request.threadPoolPatterns.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				params.put("format", "json");
				if (request.size != null) {
					params.put("size", request.size.jsonValue());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, ThreadPoolResponse._DESERIALIZER);
}
