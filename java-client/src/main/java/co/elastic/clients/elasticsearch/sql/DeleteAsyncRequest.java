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

package co.elastic.clients.elasticsearch.sql;

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
import java.lang.String;
import java.util.Collections;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: sql.delete_async.Request

/**
 * Deletes an async SQL search or a stored synchronous SQL search. If the search
 * is still running, the API cancels it.
 * 
 * @see <a href="../doc-files/api-spec.html#sql.delete_async.Request">API
 *      specification</a>
 */

public class DeleteAsyncRequest extends RequestBase {
	private final String id;

	// ---------------------------------------------------------------------------------------------

	private DeleteAsyncRequest(Builder builder) {

		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");

	}

	public static DeleteAsyncRequest of(Function<Builder, ObjectBuilder<DeleteAsyncRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The async search ID
	 * <p>
	 * API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteAsyncRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DeleteAsyncRequest> {
		private String id;

		/**
		 * Required - The async search ID
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
		 * Builds a {@link DeleteAsyncRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteAsyncRequest build() {
			_checkSingleUse();

			return new DeleteAsyncRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code sql.delete_async}".
	 */
	public static final Endpoint<DeleteAsyncRequest, DeleteAsyncResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/sql.delete_async",

			// Request method
			request -> {
				return "DELETE";

			},

			// Request path
			request -> {
				final int _id = 1 << 0;

				int propsSet = 0;

				propsSet |= _id;

				if (propsSet == (_id)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_sql");
					buf.append("/async");
					buf.append("/delete");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.id, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), false, DeleteAsyncResponse._DESERIALIZER);
}
