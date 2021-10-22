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

package co.elastic.clients.elasticsearch.async_search;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.SimpleEndpoint;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: async_search.delete.Request

public final class DeleteAsyncSearchRequest extends RequestBase {
	private final String id;

	// ---------------------------------------------------------------------------------------------

	public DeleteAsyncSearchRequest(Builder builder) {

		this.id = Objects.requireNonNull(builder.id, "id");

	}

	public DeleteAsyncSearchRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - The async search ID
	 * <p>
	 * API name: {@code id}
	 */
	public String id() {
		return this.id;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteAsyncSearchRequest}.
	 */
	public static class Builder implements ObjectBuilder<DeleteAsyncSearchRequest> {
		private String id;

		/**
		 * Required - The async search ID
		 * <p>
		 * API name: {@code id}
		 */
		public Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Builds a {@link DeleteAsyncSearchRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteAsyncSearchRequest build() {

			return new DeleteAsyncSearchRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code async_search.delete}".
	 */
	public static final Endpoint<DeleteAsyncSearchRequest, DeleteAsyncSearchResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
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
					buf.append("/_async_search");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.id, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), false, DeleteAsyncSearchResponse._DESERIALIZER);
}
