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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.ExpandWildcard;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

// typedef: indices.get_data_stream.Request

/**
 * Retrieves information about one or more data streams.
 * 
 * @see <a href="../doc-files/api-spec.html#indices.get_data_stream.Request">API
 *      specification</a>
 */

public class GetDataStreamRequest extends RequestBase {
	private final List<ExpandWildcard> expandWildcards;

	@Nullable
	private final Boolean includeDefaults;

	private final List<String> name;

	// ---------------------------------------------------------------------------------------------

	private GetDataStreamRequest(Builder builder) {

		this.expandWildcards = ApiTypeHelper.unmodifiable(builder.expandWildcards);
		this.includeDefaults = builder.includeDefaults;
		this.name = ApiTypeHelper.unmodifiable(builder.name);

	}

	public static GetDataStreamRequest of(Function<Builder, ObjectBuilder<GetDataStreamRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Type of data stream that wildcard patterns can match. Supports
	 * comma-separated values, such as <code>open,hidden</code>.
	 * <p>
	 * API name: {@code expand_wildcards}
	 */
	public final List<ExpandWildcard> expandWildcards() {
		return this.expandWildcards;
	}

	/**
	 * If true, returns all relevant default configurations for the index template.
	 * <p>
	 * API name: {@code include_defaults}
	 */
	@Nullable
	public final Boolean includeDefaults() {
		return this.includeDefaults;
	}

	/**
	 * Comma-separated list of data stream names used to limit the request. Wildcard
	 * (<code>*</code>) expressions are supported. If omitted, all data streams are
	 * returned.
	 * <p>
	 * API name: {@code name}
	 */
	public final List<String> name() {
		return this.name;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetDataStreamRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GetDataStreamRequest> {
		@Nullable
		private List<ExpandWildcard> expandWildcards;

		@Nullable
		private Boolean includeDefaults;

		@Nullable
		private List<String> name;

		/**
		 * Type of data stream that wildcard patterns can match. Supports
		 * comma-separated values, such as <code>open,hidden</code>.
		 * <p>
		 * API name: {@code expand_wildcards}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>expandWildcards</code>.
		 */
		public final Builder expandWildcards(List<ExpandWildcard> list) {
			this.expandWildcards = _listAddAll(this.expandWildcards, list);
			return this;
		}

		/**
		 * Type of data stream that wildcard patterns can match. Supports
		 * comma-separated values, such as <code>open,hidden</code>.
		 * <p>
		 * API name: {@code expand_wildcards}
		 * <p>
		 * Adds one or more values to <code>expandWildcards</code>.
		 */
		public final Builder expandWildcards(ExpandWildcard value, ExpandWildcard... values) {
			this.expandWildcards = _listAdd(this.expandWildcards, value, values);
			return this;
		}

		/**
		 * If true, returns all relevant default configurations for the index template.
		 * <p>
		 * API name: {@code include_defaults}
		 */
		public final Builder includeDefaults(@Nullable Boolean value) {
			this.includeDefaults = value;
			return this;
		}

		/**
		 * Comma-separated list of data stream names used to limit the request. Wildcard
		 * (<code>*</code>) expressions are supported. If omitted, all data streams are
		 * returned.
		 * <p>
		 * API name: {@code name}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>name</code>.
		 */
		public final Builder name(List<String> list) {
			this.name = _listAddAll(this.name, list);
			return this;
		}

		/**
		 * Comma-separated list of data stream names used to limit the request. Wildcard
		 * (<code>*</code>) expressions are supported. If omitted, all data streams are
		 * returned.
		 * <p>
		 * API name: {@code name}
		 * <p>
		 * Adds one or more values to <code>name</code>.
		 */
		public final Builder name(String value, String... values) {
			this.name = _listAdd(this.name, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetDataStreamRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetDataStreamRequest build() {
			_checkSingleUse();

			return new GetDataStreamRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.get_data_stream}".
	 */
	public static final Endpoint<GetDataStreamRequest, GetDataStreamResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/indices.get_data_stream",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				final int _name = 1 << 0;

				int propsSet = 0;

				if (ApiTypeHelper.isDefined(request.name()))
					propsSet |= _name;

				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_data_stream");
					return buf.toString();
				}
				if (propsSet == (_name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_data_stream");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.name.stream().map(v -> v).collect(Collectors.joining(",")), buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _name = 1 << 0;

				int propsSet = 0;

				if (ApiTypeHelper.isDefined(request.name()))
					propsSet |= _name;

				if (propsSet == 0) {
				}
				if (propsSet == (_name)) {
					params.put("name", request.name.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (ApiTypeHelper.isDefined(request.expandWildcards)) {
					params.put("expand_wildcards",
							request.expandWildcards.stream().map(v -> v.jsonValue()).collect(Collectors.joining(",")));
				}
				if (request.includeDefaults != null) {
					params.put("include_defaults", String.valueOf(request.includeDefaults));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, GetDataStreamResponse._DESERIALIZER);
}
