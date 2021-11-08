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
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.delete_role.Request

public class DeleteRoleRequest extends RequestBase {
	private final String name;

	@Nullable
	private final JsonValue /* _types.Refresh */ refresh;

	// ---------------------------------------------------------------------------------------------

	private DeleteRoleRequest(Builder builder) {

		this.name = ModelTypeHelper.requireNonNull(builder.name, this, "name");
		this.refresh = builder.refresh;

	}

	public static DeleteRoleRequest of(Function<Builder, ObjectBuilder<DeleteRoleRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Role name
	 * <p>
	 * API name: {@code name}
	 */
	public final String name() {
		return this.name;
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
	public final JsonValue /* _types.Refresh */ refresh() {
		return this.refresh;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteRoleRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<DeleteRoleRequest> {
		private String name;

		@Nullable
		private JsonValue /* _types.Refresh */ refresh;

		/**
		 * Required - Role name
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * If <code>true</code> (the default) then refresh the affected shards to make
		 * this operation visible to search, if <code>wait_for</code> then wait for a
		 * refresh to make this operation visible to search, if <code>false</code> then
		 * do nothing with refreshes.
		 * <p>
		 * API name: {@code refresh}
		 */
		public final Builder refresh(@Nullable JsonValue /* _types.Refresh */ value) {
			this.refresh = value;
			return this;
		}

		/**
		 * Builds a {@link DeleteRoleRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteRoleRequest build() {
			_checkSingleUse();

			return new DeleteRoleRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.delete_role}".
	 */
	public static final Endpoint<DeleteRoleRequest, DeleteRoleResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "DELETE";

			},

			// Request path
			request -> {
				final int _name = 1 << 0;

				int propsSet = 0;

				propsSet |= _name;

				if (propsSet == (_name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/role");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.name, buf);
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

			}, SimpleEndpoint.emptyMap(), false, DeleteRoleResponse._DESERIALIZER);
}
