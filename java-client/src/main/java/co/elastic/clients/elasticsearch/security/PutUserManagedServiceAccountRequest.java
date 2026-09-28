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
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
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

// typedef: security.put_user_managed_service_account.Request

/**
 * Create user-managed service accounts.
 * <p>
 * Create a service account in a namespace of your own, or replace one that
 * already exists. A replacement is not a partial update: every write applies
 * the defaults, so an account that was disabled and is then written again
 * without <code>enabled</code> comes back enabled.
 * <p>
 * Creating an account whose name still has leftover service tokens is rejected.
 * Delete those tokens first.
 * <p>
 * NOTE: The <code>elastic</code> namespace is reserved for the built-in service
 * accounts that ship with Elasticsearch. The
 * <code>manage_service_account</code> privilege does not authorize this API.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#security.put_user_managed_service_account.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutUserManagedServiceAccountRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Boolean enabled;

	private final String namespace;

	@Nullable
	private final Refresh refresh;

	private final List<String> roles;

	private final String service;

	// ---------------------------------------------------------------------------------------------

	private PutUserManagedServiceAccountRequest(Builder builder) {

		this.enabled = builder.enabled;
		this.namespace = ApiTypeHelper.requireNonNull(builder.namespace, this, "namespace");
		this.refresh = builder.refresh;
		this.roles = ApiTypeHelper.unmodifiableRequired(builder.roles, this, "roles");
		this.service = ApiTypeHelper.requireNonNull(builder.service, this, "service");

	}

	public static PutUserManagedServiceAccountRequest of(
			Function<Builder, ObjectBuilder<PutUserManagedServiceAccountRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Whether the account can authenticate. Tokens can still be created for a
	 * disabled account; they just cannot be used until the account is enabled.
	 * <p>
	 * API name: {@code enabled}
	 */
	@Nullable
	public final Boolean enabled() {
		return this.enabled;
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
	 * Required - The names of the roles to grant to the service account, up to a
	 * maximum of 1000. The roles are resolved when the account authenticates, so
	 * they do not have to exist yet.
	 * <p>
	 * API name: {@code roles}
	 */
	public final List<String> roles() {
		return this.roles;
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

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.enabled != null) {
			generator.writeKey("enabled");
			generator.write(this.enabled);

		}
		if (ApiTypeHelper.isDefined(this.roles)) {
			generator.writeKey("roles");
			generator.writeStartArray();
			for (String item0 : this.roles) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutUserManagedServiceAccountRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PutUserManagedServiceAccountRequest> {
		@Nullable
		private Boolean enabled;

		private String namespace;

		@Nullable
		private Refresh refresh;

		private List<String> roles;

		private String service;

		public Builder() {
		}
		private Builder(PutUserManagedServiceAccountRequest instance) {
			this.enabled = instance.enabled;
			this.namespace = instance.namespace;
			this.refresh = instance.refresh;
			this.roles = instance.roles;
			this.service = instance.service;

		}
		/**
		 * Whether the account can authenticate. Tokens can still be created for a
		 * disabled account; they just cannot be used until the account is enabled.
		 * <p>
		 * API name: {@code enabled}
		 */
		public final Builder enabled(@Nullable Boolean value) {
			this.enabled = value;
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
		 * Required - The names of the roles to grant to the service account, up to a
		 * maximum of 1000. The roles are resolved when the account authenticates, so
		 * they do not have to exist yet.
		 * <p>
		 * API name: {@code roles}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>roles</code>.
		 */
		public final Builder roles(List<String> list) {
			this.roles = _listAddAll(this.roles, list);
			return this;
		}

		/**
		 * Required - The names of the roles to grant to the service account, up to a
		 * maximum of 1000. The roles are resolved when the account authenticates, so
		 * they do not have to exist yet.
		 * <p>
		 * API name: {@code roles}
		 * <p>
		 * Adds one or more values to <code>roles</code>.
		 */
		public final Builder roles(String value, String... values) {
			this.roles = _listAdd(this.roles, value, values);
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
		 * Builds a {@link PutUserManagedServiceAccountRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutUserManagedServiceAccountRequest build() {
			_checkSingleUse();

			return new PutUserManagedServiceAccountRequest(this);
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
	 * Json deserializer for {@link PutUserManagedServiceAccountRequest}
	 */
	public static final JsonpDeserializer<PutUserManagedServiceAccountRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					PutUserManagedServiceAccountRequest::setupPutUserManagedServiceAccountRequestDeserializer);

	protected static void setupPutUserManagedServiceAccountRequestDeserializer(
			ObjectDeserializer<PutUserManagedServiceAccountRequest.Builder> op) {

		op.add(Builder::enabled, JsonpDeserializer.booleanDeserializer(), "enabled");
		op.add(Builder::roles, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "roles");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.put_user_managed_service_account}".
	 */
	public static final Endpoint<PutUserManagedServiceAccountRequest, PutUserManagedServiceAccountResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/security.put_user_managed_service_account",

			// Request method
			request -> {
				return "PUT";

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
				return params;

			}, SimpleEndpoint.emptyMap(), true, PutUserManagedServiceAccountResponse._DESERIALIZER);
}
