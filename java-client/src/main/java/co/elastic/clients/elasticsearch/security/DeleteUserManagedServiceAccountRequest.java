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

package co.elastic.clients.elasticsearch.security;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.Refresh;
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

// typedef: security.delete_user_managed_service_account.Request

/**
 * Delete user-managed service accounts.
 * <p>
 * Delete a service account from a namespace of your own.
 * <p>
 * Deleting an account that still has service tokens is rejected unless
 * <code>force</code> is <code>true</code>. A forced delete leaves the tokens
 * behind: they cannot authenticate while no account of that name exists, and
 * recreating the account is rejected until they are deleted.
 * <p>
 * NOTE: The <code>elastic</code> namespace is reserved for the built-in service
 * accounts that ship with Elasticsearch. A name that no user-managed service
 * account could have is rejected rather than reported as not found. The
 * <code>manage_service_account</code> privilege does not authorize this API.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#security.delete_user_managed_service_account.Request">API
 *      specification</a>
 */

public class DeleteUserManagedServiceAccountRequest extends RequestBase {
	@Nullable
	private final Boolean force;

	private final String namespace;

	@Nullable
	private final Refresh refresh;

	private final String service;

	// ---------------------------------------------------------------------------------------------

	private DeleteUserManagedServiceAccountRequest(Builder builder) {

		this.force = builder.force;
		this.namespace = ApiTypeHelper.requireNonNull(builder.namespace, this, "namespace");
		this.refresh = builder.refresh;
		this.service = ApiTypeHelper.requireNonNull(builder.service, this, "service");

	}

	public static DeleteUserManagedServiceAccountRequest of(
			Function<Builder, ObjectBuilder<DeleteUserManagedServiceAccountRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * If <code>false</code> (the default), deleting a service account that still
	 * has service tokens is rejected. If <code>true</code>, the account is deleted
	 * and its tokens are left in place.
	 * <p>
	 * API name: {@code force}
	 */
	@Nullable
	public final Boolean force() {
		return this.force;
	}

	/**
	 * Required - The namespace, which is a top-level grouping of service accounts.
	 * It must start with a letter or digit and can contain only letters, digits,
	 * hyphens, and underscores, up to a maximum of 128 characters. It cannot be
	 * <code>elastic</code>, which is reserved for built-in service accounts.
	 * <p>
	 * API name: {@code namespace}
	 */
	public final String namespace() {
		return this.namespace;
	}

	/**
	 * If <code>wait_for</code> (the default) then wait for a refresh to make this
	 * operation visible to search, if <code>true</code> then refresh the affected
	 * shards to make this operation visible to search, if <code>false</code> then
	 * do nothing with refreshes.
	 * <p>
	 * API name: {@code refresh}
	 */
	@Nullable
	public final Refresh refresh() {
		return this.refresh;
	}

	/**
	 * Required - The service name. It must start with a letter or digit and can
	 * contain only letters, digits, hyphens, and underscores, up to a maximum of
	 * 128 characters.
	 * <p>
	 * API name: {@code service}
	 */
	public final String service() {
		return this.service;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteUserManagedServiceAccountRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DeleteUserManagedServiceAccountRequest> {
		@Nullable
		private Boolean force;

		private String namespace;

		@Nullable
		private Refresh refresh;

		private String service;

		public Builder() {
		}
		private Builder(DeleteUserManagedServiceAccountRequest instance) {
			this.force = instance.force;
			this.namespace = instance.namespace;
			this.refresh = instance.refresh;
			this.service = instance.service;

		}
		/**
		 * If <code>false</code> (the default), deleting a service account that still
		 * has service tokens is rejected. If <code>true</code>, the account is deleted
		 * and its tokens are left in place.
		 * <p>
		 * API name: {@code force}
		 */
		public final Builder force(@Nullable Boolean value) {
			this.force = value;
			return this;
		}

		/**
		 * Required - The namespace, which is a top-level grouping of service accounts.
		 * It must start with a letter or digit and can contain only letters, digits,
		 * hyphens, and underscores, up to a maximum of 128 characters. It cannot be
		 * <code>elastic</code>, which is reserved for built-in service accounts.
		 * <p>
		 * API name: {@code namespace}
		 */
		public final Builder namespace(String value) {
			this.namespace = value;
			return this;
		}

		/**
		 * If <code>wait_for</code> (the default) then wait for a refresh to make this
		 * operation visible to search, if <code>true</code> then refresh the affected
		 * shards to make this operation visible to search, if <code>false</code> then
		 * do nothing with refreshes.
		 * <p>
		 * API name: {@code refresh}
		 */
		public final Builder refresh(@Nullable Refresh value) {
			this.refresh = value;
			return this;
		}

		/**
		 * Required - The service name. It must start with a letter or digit and can
		 * contain only letters, digits, hyphens, and underscores, up to a maximum of
		 * 128 characters.
		 * <p>
		 * API name: {@code service}
		 */
		public final Builder service(String value) {
			this.service = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DeleteUserManagedServiceAccountRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteUserManagedServiceAccountRequest build() {
			_checkSingleUse();

			return new DeleteUserManagedServiceAccountRequest(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.delete_user_managed_service_account}".
	 */
	public static final Endpoint<DeleteUserManagedServiceAccountRequest, DeleteUserManagedServiceAccountResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/security.delete_user_managed_service_account",

			// Request method
			request -> {
				return "DELETE";

			},

			// Request path
			request -> {
				final int _service = 1 << 0;
				final int _namespace = 1 << 1;

				int propsSet = 0;

				propsSet |= _service;
				propsSet |= _namespace;

				if (propsSet == (_namespace | _service)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/service");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.namespace, buf);
					buf.append("/");
					SimpleEndpoint.pathEncode(request.service, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _service = 1 << 0;
				final int _namespace = 1 << 1;

				int propsSet = 0;

				propsSet |= _service;
				propsSet |= _namespace;

				if (propsSet == (_namespace | _service)) {
					params.put("namespace", request.namespace);
					params.put("service", request.service);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.refresh != null) {
					params.put("refresh", request.refresh.jsonValue());
				}
				if (request.force != null) {
					params.put("force", String.valueOf(request.force));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), false, DeleteUserManagedServiceAccountResponse._DESERIALIZER);
}
