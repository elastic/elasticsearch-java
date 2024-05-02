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

package co.elastic.clients.elasticsearch.connector;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
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
import java.lang.Integer;
import java.lang.String;
import java.util.Collections;
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

// typedef: connector.list.Request

/**
 * Returns existing connectors.
 * 
 * @see <a href="../doc-files/api-spec.html#connector.list.Request">API
 *      specification</a>
 */

public class ListRequest extends RequestBase {
	private final List<String> connectorName;

	@Nullable
	private final Integer from;

	private final List<String> indexName;

	@Nullable
	private final String query;

	private final List<String> serviceType;

	@Nullable
	private final Integer size;

	// ---------------------------------------------------------------------------------------------

	private ListRequest(Builder builder) {

		this.connectorName = ApiTypeHelper.unmodifiable(builder.connectorName);
		this.from = builder.from;
		this.indexName = ApiTypeHelper.unmodifiable(builder.indexName);
		this.query = builder.query;
		this.serviceType = ApiTypeHelper.unmodifiable(builder.serviceType);
		this.size = builder.size;

	}

	public static ListRequest of(Function<Builder, ObjectBuilder<ListRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * A comma-separated list of connector names to fetch connector documents for
	 * <p>
	 * API name: {@code connector_name}
	 */
	public final List<String> connectorName() {
		return this.connectorName;
	}

	/**
	 * Starting offset (default: 0)
	 * <p>
	 * API name: {@code from}
	 */
	@Nullable
	public final Integer from() {
		return this.from;
	}

	/**
	 * A comma-separated list of connector index names to fetch connector documents
	 * for
	 * <p>
	 * API name: {@code index_name}
	 */
	public final List<String> indexName() {
		return this.indexName;
	}

	/**
	 * A wildcard query string that filters connectors with matching name,
	 * description or index name
	 * <p>
	 * API name: {@code query}
	 */
	@Nullable
	public final String query() {
		return this.query;
	}

	/**
	 * A comma-separated list of connector service types to fetch connector
	 * documents for
	 * <p>
	 * API name: {@code service_type}
	 */
	public final List<String> serviceType() {
		return this.serviceType;
	}

	/**
	 * Specifies a max number of results to get
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ListRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder> implements ObjectBuilder<ListRequest> {
		@Nullable
		private List<String> connectorName;

		@Nullable
		private Integer from;

		@Nullable
		private List<String> indexName;

		@Nullable
		private String query;

		@Nullable
		private List<String> serviceType;

		@Nullable
		private Integer size;

		/**
		 * A comma-separated list of connector names to fetch connector documents for
		 * <p>
		 * API name: {@code connector_name}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>connectorName</code>.
		 */
		public final Builder connectorName(List<String> list) {
			this.connectorName = _listAddAll(this.connectorName, list);
			return this;
		}

		/**
		 * A comma-separated list of connector names to fetch connector documents for
		 * <p>
		 * API name: {@code connector_name}
		 * <p>
		 * Adds one or more values to <code>connectorName</code>.
		 */
		public final Builder connectorName(String value, String... values) {
			this.connectorName = _listAdd(this.connectorName, value, values);
			return this;
		}

		/**
		 * Starting offset (default: 0)
		 * <p>
		 * API name: {@code from}
		 */
		public final Builder from(@Nullable Integer value) {
			this.from = value;
			return this;
		}

		/**
		 * A comma-separated list of connector index names to fetch connector documents
		 * for
		 * <p>
		 * API name: {@code index_name}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>indexName</code>.
		 */
		public final Builder indexName(List<String> list) {
			this.indexName = _listAddAll(this.indexName, list);
			return this;
		}

		/**
		 * A comma-separated list of connector index names to fetch connector documents
		 * for
		 * <p>
		 * API name: {@code index_name}
		 * <p>
		 * Adds one or more values to <code>indexName</code>.
		 */
		public final Builder indexName(String value, String... values) {
			this.indexName = _listAdd(this.indexName, value, values);
			return this;
		}

		/**
		 * A wildcard query string that filters connectors with matching name,
		 * description or index name
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(@Nullable String value) {
			this.query = value;
			return this;
		}

		/**
		 * A comma-separated list of connector service types to fetch connector
		 * documents for
		 * <p>
		 * API name: {@code service_type}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>serviceType</code>.
		 */
		public final Builder serviceType(List<String> list) {
			this.serviceType = _listAddAll(this.serviceType, list);
			return this;
		}

		/**
		 * A comma-separated list of connector service types to fetch connector
		 * documents for
		 * <p>
		 * API name: {@code service_type}
		 * <p>
		 * Adds one or more values to <code>serviceType</code>.
		 */
		public final Builder serviceType(String value, String... values) {
			this.serviceType = _listAdd(this.serviceType, value, values);
			return this;
		}

		/**
		 * Specifies a max number of results to get
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ListRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ListRequest build() {
			_checkSingleUse();

			return new ListRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code connector.list}".
	 */
	public static final Endpoint<ListRequest, ListResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/connector.list",

			// Request method
			request -> {
				return "GET";

			},

			// Request path
			request -> {
				return "/_connector";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (ApiTypeHelper.isDefined(request.serviceType)) {
					params.put("service_type",
							request.serviceType.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (request.size != null) {
					params.put("size", String.valueOf(request.size));
				}
				if (request.query != null) {
					params.put("query", request.query);
				}
				if (request.from != null) {
					params.put("from", String.valueOf(request.from));
				}
				if (ApiTypeHelper.isDefined(request.connectorName)) {
					params.put("connector_name",
							request.connectorName.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				if (ApiTypeHelper.isDefined(request.indexName)) {
					params.put("index_name", request.indexName.stream().map(v -> v).collect(Collectors.joining(",")));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, ListResponse._DESERIALIZER);
}
