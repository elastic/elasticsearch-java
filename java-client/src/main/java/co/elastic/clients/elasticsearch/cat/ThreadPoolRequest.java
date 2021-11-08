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

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.SimpleEndpoint;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: cat.thread_pool.Request

public class ThreadPoolRequest extends CatRequestBase {
	@Nullable
	private final JsonValue /* Union(_types.Size | internal.boolean) */ size;

	private final List<String> threadPoolPatterns;

	// ---------------------------------------------------------------------------------------------

	private ThreadPoolRequest(Builder builder) {

		this.size = builder.size;
		this.threadPoolPatterns = ModelTypeHelper.unmodifiable(builder.threadPoolPatterns);

	}

	public static ThreadPoolRequest of(Function<Builder, ObjectBuilder<ThreadPoolRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code size}
	 */
	@Nullable
	public final JsonValue /* Union(_types.Size | internal.boolean) */ size() {
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
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ThreadPoolRequest> {
		@Nullable
		private JsonValue /* Union(_types.Size | internal.boolean) */ size;

		@Nullable
		private List<String> threadPoolPatterns;

		/**
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable JsonValue /* Union(_types.Size | internal.boolean) */ value) {
			this.size = value;
			return this;
		}

		/**
		 * A comma-separated list of regular-expressions to filter the thread pools in
		 * the output
		 * <p>
		 * API name: {@code thread_pool_patterns}
		 */
		public final Builder threadPoolPatterns(@Nullable List<String> value) {
			this.threadPoolPatterns = value;
			return this;
		}

		/**
		 * A comma-separated list of regular-expressions to filter the thread pools in
		 * the output
		 * <p>
		 * API name: {@code thread_pool_patterns}
		 */
		public final Builder threadPoolPatterns(String... value) {
			this.threadPoolPatterns = Arrays.asList(value);
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
	public static final Endpoint<ThreadPoolRequest, ThreadPoolResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _threadPoolPatterns = 1 << 0;

				int propsSet = 0;

				if (ModelTypeHelper.isDefined(request.threadPoolPatterns()))
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
					params.put("size", JsonpUtils.toString(request.size));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, ThreadPoolResponse._DESERIALIZER);
}
