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

package co.elastic.clients.elasticsearch.esql;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.BinaryEndpoint;
import co.elastic.clients.transport.endpoints.BinaryResponse;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
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

// typedef: esql.async_query_stop.Request

/**
 * Stop async ES|QL query.
 * <p>
 * This API interrupts the query execution and returns the results so far. If
 * the Elasticsearch security features are enabled, only the user who first
 * submitted the ES|QL query can stop it.
 * 
 * @see <a href="../doc-files/api-spec.html#esql.async_query_stop.Request">API
 *      specification</a>
 */

public class AsyncQueryStopRequest extends RequestBase {
	@Nullable
	private final Boolean dropNullColumns;

	private final String id;

	// ---------------------------------------------------------------------------------------------

	private AsyncQueryStopRequest(Builder builder) {

		this.dropNullColumns = builder.dropNullColumns;
		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");

	}

	public static AsyncQueryStopRequest of(Function<Builder, ObjectBuilder<AsyncQueryStopRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Indicates whether columns that are entirely <code>null</code> will be removed
	 * from the <code>columns</code> and <code>values</code> portion of the results.
	 * If <code>true</code>, the response will include an extra section under the
	 * name <code>all_columns</code> which has the name of all the columns.
	 * <p>
	 * API name: {@code drop_null_columns}
	 */
	@Nullable
	public final Boolean dropNullColumns() {
		return this.dropNullColumns;
	}

	/**
	 * Required - The unique identifier of the query. A query ID is provided in the
	 * ES|QL async query API response for a query that does not complete in the
	 * designated time. A query ID is also provided when the request was submitted
	 * with the <code>keep_on_completion</code> parameter set to <code>true</code>.
	 * <p>
	 * API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AsyncQueryStopRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<AsyncQueryStopRequest> {
		@Nullable
		private Boolean dropNullColumns;

		private String id;

		/**
		 * Indicates whether columns that are entirely <code>null</code> will be removed
		 * from the <code>columns</code> and <code>values</code> portion of the results.
		 * If <code>true</code>, the response will include an extra section under the
		 * name <code>all_columns</code> which has the name of all the columns.
		 * <p>
		 * API name: {@code drop_null_columns}
		 */
		public final Builder dropNullColumns(@Nullable Boolean value) {
			this.dropNullColumns = value;
			return this;
		}

		/**
		 * Required - The unique identifier of the query. A query ID is provided in the
		 * ES|QL async query API response for a query that does not complete in the
		 * designated time. A query ID is also provided when the request was submitted
		 * with the <code>keep_on_completion</code> parameter set to <code>true</code>.
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AsyncQueryStopRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AsyncQueryStopRequest build() {
			_checkSingleUse();

			return new AsyncQueryStopRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code esql.async_query_stop}".
	 */
	public static final Endpoint<AsyncQueryStopRequest, BinaryResponse, ErrorResponse> _ENDPOINT = new BinaryEndpoint<>(
			"es/esql.async_query_stop",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _id = 1 << 0;

				int propsSet = 0;

				propsSet |= _id;

				if (propsSet == (_id)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_query");
					buf.append("/async");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.id, buf);
					buf.append("/stop");
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _id = 1 << 0;

				int propsSet = 0;

				propsSet |= _id;

				if (propsSet == (_id)) {
					params.put("id", request.id);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.dropNullColumns != null) {
					params.put("drop_null_columns", String.valueOf(request.dropNullColumns));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, null);
}
