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

import co.elastic.clients.elasticsearch._types.Bytes;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
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

// typedef: cat.shards.Request

/**
 * Returns information about the shards in a cluster. For data streams, the API
 * returns information about the backing indices. IMPORTANT: cat APIs are only
 * intended for human consumption using the command line or Kibana console. They
 * are not intended for use by applications.
 * 
 * @see <a href="../doc-files/api-spec.html#cat.shards.Request">API
 *      specification</a>
 */

public class ShardsRequest extends CatRequestBase {
	@Nullable
	private final Bytes bytes;

	private final List<String> index;

	// ---------------------------------------------------------------------------------------------

	private ShardsRequest(Builder builder) {

		this.bytes = builder.bytes;
		this.index = ApiTypeHelper.unmodifiable(builder.index);

	}

	public static ShardsRequest of(Function<Builder, ObjectBuilder<ShardsRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The unit used to display byte values.
	 * <p>
	 * API name: {@code bytes}
	 */
	@Nullable
	public final Bytes bytes() {
		return this.bytes;
	}

	/**
	 * A comma-separated list of data streams, indices, and aliases used to limit
	 * the request. Supports wildcards (<code>*</code>). To target all data streams
	 * and indices, omit this parameter or use <code>*</code> or <code>_all</code>.
	 * <p>
	 * API name: {@code index}
	 */
	public final List<String> index() {
		return this.index;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShardsRequest}.
	 */

	public static class Builder extends CatRequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<ShardsRequest> {
		@Nullable
		private Bytes bytes;

		@Nullable
		private List<String> index;

		/**
		 * The unit used to display byte values.
		 * <p>
		 * API name: {@code bytes}
		 */
		public final Builder bytes(@Nullable Bytes value) {
			this.bytes = value;
			return this;
		}

		/**
		 * A comma-separated list of data streams, indices, and aliases used to limit
		 * the request. Supports wildcards (<code>*</code>). To target all data streams
		 * and indices, omit this parameter or use <code>*</code> or <code>_all</code>.
		 * <p>
		 * API name: {@code index}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>index</code>.
		 */
		public final Builder index(List<String> list) {
			this.index = _listAddAll(this.index, list);
			return this;
		}

		/**
		 * A comma-separated list of data streams, indices, and aliases used to limit
		 * the request. Supports wildcards (<code>*</code>). To target all data streams
		 * and indices, omit this parameter or use <code>*</code> or <code>_all</code>.
		 * <p>
		 * API name: {@code index}
		 * <p>
		 * Adds one or more values to <code>index</code>.
		 */
		public final Builder index(String value, String... values) {
			this.index = _listAdd(this.index, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ShardsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardsRequest build() {
			_checkSingleUse();

			return new ShardsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code cat.shards}".
	 */
	public static final Endpoint<ShardsRequest, ShardsResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/cat.shards",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _index = 1 << 0;

				int propsSet = 0;

				if (ApiTypeHelper.isDefined(request.index()))
					propsSet |= _index;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_cat");
					buf.append("/shards");
					return buf.toString();
				}
				if (propsSet == (_index)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_cat");
					buf.append("/shards");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.index.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _index = 1 << 0;

				int propsSet = 0;

				if (ApiTypeHelper.isDefined(request.index()))
					propsSet |= _index;

				if (propsSet == 0) {
				}
				if (propsSet == (_index)) {
					params.put("index", request.index.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				params.put("format", "json");
				if (request.bytes != null) {
					params.put("bytes", request.bytes.jsonValue());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, ShardsResponse._DESERIALIZER);
}
