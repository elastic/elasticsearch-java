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

package co.elastic.clients.elasticsearch.cat;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: cat.thread_pool.Request
public final class ThreadPoolRequest extends CatRequestBase {
	@Nullable
	private final List<String> threadPoolPatterns;

	@Nullable
	private final JsonValue size;

	// ---------------------------------------------------------------------------------------------

	public ThreadPoolRequest(Builder builder) {

		this.threadPoolPatterns = builder.threadPoolPatterns;
		this.size = builder.size;

	}

	/**
	 * A comma-separated list of regular-expressions to filter the thread pools in
	 * the output
	 * <p>
	 * API name: {@code thread_pool_patterns}
	 */
	@Nullable
	public List<String> threadPoolPatterns() {
		return this.threadPoolPatterns;
	}

	/**
	 * API name: {@code size}
	 */
	@Nullable
	public JsonValue size() {
		return this.size;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ThreadPoolRequest}.
	 */
	public static class Builder implements ObjectBuilder<ThreadPoolRequest> {
		@Nullable
		private List<String> threadPoolPatterns;

		@Nullable
		private JsonValue size;

		/**
		 * A comma-separated list of regular-expressions to filter the thread pools in
		 * the output
		 * <p>
		 * API name: {@code thread_pool_patterns}
		 */
		public Builder threadPoolPatterns(@Nullable List<String> value) {
			this.threadPoolPatterns = value;
			return this;
		}

		/**
		 * A comma-separated list of regular-expressions to filter the thread pools in
		 * the output
		 * <p>
		 * API name: {@code thread_pool_patterns}
		 */
		public Builder threadPoolPatterns(String... value) {
			this.threadPoolPatterns = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #threadPoolPatterns(List)}, creating the list if
		 * needed.
		 */
		public Builder addThreadPoolPatterns(String value) {
			if (this.threadPoolPatterns == null) {
				this.threadPoolPatterns = new ArrayList<>();
			}
			this.threadPoolPatterns.add(value);
			return this;
		}

		/**
		 * API name: {@code size}
		 */
		public Builder size(@Nullable JsonValue value) {
			this.size = value;
			return this;
		}

		/**
		 * Builds a {@link ThreadPoolRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ThreadPoolRequest build() {

			return new ThreadPoolRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code cat.thread_pool}".
	 */
	public static final Endpoint<ThreadPoolRequest, ThreadPoolResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _threadPoolPatterns = 1 << 0;

				int propsSet = 0;

				if (request.threadPoolPatterns() != null)
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
					buf.append(request.threadPoolPatterns.stream().map(v -> v).collect(Collectors.joining(",")));
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.size != null) {
					params.put("size", request.size.toString());
				}
				return params;

			}, Endpoint.Simple.emptyMap(), false, ThreadPoolResponse.DESERIALIZER);
}
