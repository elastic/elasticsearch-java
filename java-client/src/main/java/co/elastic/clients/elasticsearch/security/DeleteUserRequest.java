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

package co.elastic.clients.elasticsearch.security;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.SimpleEndpoint;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.delete_user.Request

public final class DeleteUserRequest extends RequestBase {
	@Nullable
	private final JsonValue /* _types.Refresh */ refresh;

	private final String username;

	// ---------------------------------------------------------------------------------------------

	public DeleteUserRequest(Builder builder) {

		this.refresh = builder.refresh;
		this.username = Objects.requireNonNull(builder.username, "username");

	}

	public DeleteUserRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * If <code>true</code> (the default) then refresh the affected shards to make
	 * this operation visible to search, if <code>wait_for</code> then wait for a
	 * refresh to make this operation visible to search, if <code>false</code> then
	 * do nothing with refreshes.
	 * <p>
	 * API name: {@code refresh}
	 */
	@Nullable
	public JsonValue /* _types.Refresh */ refresh() {
		return this.refresh;
	}

	/**
	 * Required - username
	 * <p>
	 * API name: {@code username}
	 */
	public String username() {
		return this.username;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteUserRequest}.
	 */
	public static class Builder implements ObjectBuilder<DeleteUserRequest> {
		@Nullable
		private JsonValue /* _types.Refresh */ refresh;

		private String username;

		/**
		 * If <code>true</code> (the default) then refresh the affected shards to make
		 * this operation visible to search, if <code>wait_for</code> then wait for a
		 * refresh to make this operation visible to search, if <code>false</code> then
		 * do nothing with refreshes.
		 * <p>
		 * API name: {@code refresh}
		 */
		public Builder refresh(@Nullable JsonValue /* _types.Refresh */ value) {
			this.refresh = value;
			return this;
		}

		/**
		 * Required - username
		 * <p>
		 * API name: {@code username}
		 */
		public Builder username(String value) {
			this.username = value;
			return this;
		}

		/**
		 * Builds a {@link DeleteUserRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteUserRequest build() {

			return new DeleteUserRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.delete_user}".
	 */
	public static final Endpoint<DeleteUserRequest, DeleteUserResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "DELETE";

			},

			// Request path
			request -> {
				final int _username = 1 << 0;

				int propsSet = 0;

				propsSet |= _username;

				if (propsSet == (_username)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/user");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.username, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.refresh != null) {
					params.put("refresh", JsonpUtils.toString(request.refresh));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, DeleteUserResponse._DESERIALIZER);
}
