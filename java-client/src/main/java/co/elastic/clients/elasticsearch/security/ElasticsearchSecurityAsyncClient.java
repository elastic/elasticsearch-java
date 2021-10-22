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

import co.elastic.clients.ApiClient;
import co.elastic.clients.elasticsearch._types.ElasticsearchException;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Nullable;

/**
 * Client for the security namespace.
 */
public class ElasticsearchSecurityAsyncClient extends ApiClient<ElasticsearchSecurityAsyncClient> {

	public ElasticsearchSecurityAsyncClient(Transport transport) {
		super(transport, null);
	}

	public ElasticsearchSecurityAsyncClient(Transport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchSecurityAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchSecurityAsyncClient(this.transport, transportOptions);
	}

	// ----- Endpoint: security.authenticate

	/**
	 * Enables authentication as a user and retrieve information about the
	 * authenticated user.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-authenticate.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<AuthenticateResponse> authenticate() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(AuthenticateRequest._INSTANCE, AuthenticateRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: security.change_password

	/**
	 * Changes the passwords of users in the native realm and built-in users.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-change-password.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ChangePasswordResponse> changePassword(ChangePasswordRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, ChangePasswordRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Changes the passwords of users in the native realm and built-in users.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ChangePasswordRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-change-password.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ChangePasswordResponse> changePassword(
			Function<ChangePasswordRequest.Builder, ObjectBuilder<ChangePasswordRequest>> fn)
			throws IOException, ElasticsearchException {
		return changePassword(fn.apply(new ChangePasswordRequest.Builder()).build());
	}

	/**
	 * Changes the passwords of users in the native realm and built-in users.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-change-password.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ChangePasswordResponse> changePassword() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new ChangePasswordRequest.Builder().build(),
				ChangePasswordRequest.ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: security.clear_api_key_cache

	/**
	 * Clear a subset or all entries from the API key cache.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-clear-api-key-cache.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ClearApiKeyCacheResponse> clearApiKeyCache(ClearApiKeyCacheRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, ClearApiKeyCacheRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Clear a subset or all entries from the API key cache.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ClearApiKeyCacheRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-clear-api-key-cache.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ClearApiKeyCacheResponse> clearApiKeyCache(
			Function<ClearApiKeyCacheRequest.Builder, ObjectBuilder<ClearApiKeyCacheRequest>> fn)
			throws IOException, ElasticsearchException {
		return clearApiKeyCache(fn.apply(new ClearApiKeyCacheRequest.Builder()).build());
	}

	// ----- Endpoint: security.clear_cached_privileges

	/**
	 * Evicts application privileges from the native application privileges cache.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-clear-privilege-cache.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ClearCachedPrivilegesResponse> clearCachedPrivileges(ClearCachedPrivilegesRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, ClearCachedPrivilegesRequest.ENDPOINT,
				this.transportOptions);
	}

	/**
	 * Evicts application privileges from the native application privileges cache.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ClearCachedPrivilegesRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-clear-privilege-cache.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ClearCachedPrivilegesResponse> clearCachedPrivileges(
			Function<ClearCachedPrivilegesRequest.Builder, ObjectBuilder<ClearCachedPrivilegesRequest>> fn)
			throws IOException, ElasticsearchException {
		return clearCachedPrivileges(fn.apply(new ClearCachedPrivilegesRequest.Builder()).build());
	}

	// ----- Endpoint: security.clear_cached_realms

	/**
	 * Evicts users from the user cache. Can completely clear the cache or evict
	 * specific users.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-clear-cache.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ClearCachedRealmsResponse> clearCachedRealms(ClearCachedRealmsRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, ClearCachedRealmsRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Evicts users from the user cache. Can completely clear the cache or evict
	 * specific users.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ClearCachedRealmsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-clear-cache.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ClearCachedRealmsResponse> clearCachedRealms(
			Function<ClearCachedRealmsRequest.Builder, ObjectBuilder<ClearCachedRealmsRequest>> fn)
			throws IOException, ElasticsearchException {
		return clearCachedRealms(fn.apply(new ClearCachedRealmsRequest.Builder()).build());
	}

	// ----- Endpoint: security.clear_cached_roles

	/**
	 * Evicts roles from the native role cache.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-clear-role-cache.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ClearCachedRolesResponse> clearCachedRoles(ClearCachedRolesRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, ClearCachedRolesRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Evicts roles from the native role cache.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ClearCachedRolesRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-clear-role-cache.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ClearCachedRolesResponse> clearCachedRoles(
			Function<ClearCachedRolesRequest.Builder, ObjectBuilder<ClearCachedRolesRequest>> fn)
			throws IOException, ElasticsearchException {
		return clearCachedRoles(fn.apply(new ClearCachedRolesRequest.Builder()).build());
	}

	// ----- Endpoint: security.clear_cached_service_tokens

	/**
	 * Evicts tokens from the service account token caches.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-clear-service-token-caches.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ClearCachedServiceTokensResponse> clearCachedServiceTokens(
			ClearCachedServiceTokensRequest request) throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, ClearCachedServiceTokensRequest.ENDPOINT,
				this.transportOptions);
	}

	/**
	 * Evicts tokens from the service account token caches.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ClearCachedServiceTokensRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-clear-service-token-caches.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ClearCachedServiceTokensResponse> clearCachedServiceTokens(
			Function<ClearCachedServiceTokensRequest.Builder, ObjectBuilder<ClearCachedServiceTokensRequest>> fn)
			throws IOException, ElasticsearchException {
		return clearCachedServiceTokens(fn.apply(new ClearCachedServiceTokensRequest.Builder()).build());
	}

	// ----- Endpoint: security.create_api_key

	/**
	 * Creates an API key for access without requiring basic authentication.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-create-api-key.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<CreateApiKeyResponse> createApiKey(CreateApiKeyRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, CreateApiKeyRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Creates an API key for access without requiring basic authentication.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CreateApiKeyRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-create-api-key.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<CreateApiKeyResponse> createApiKey(
			Function<CreateApiKeyRequest.Builder, ObjectBuilder<CreateApiKeyRequest>> fn)
			throws IOException, ElasticsearchException {
		return createApiKey(fn.apply(new CreateApiKeyRequest.Builder()).build());
	}

	/**
	 * Creates an API key for access without requiring basic authentication.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-create-api-key.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<CreateApiKeyResponse> createApiKey() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new CreateApiKeyRequest.Builder().build(),
				CreateApiKeyRequest.ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: security.create_service_token

	/**
	 * Creates a service account token for access without requiring basic
	 * authentication.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-create-service-token.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<CreateServiceTokenResponse> createServiceToken(CreateServiceTokenRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, CreateServiceTokenRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Creates a service account token for access without requiring basic
	 * authentication.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CreateServiceTokenRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-create-service-token.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<CreateServiceTokenResponse> createServiceToken(
			Function<CreateServiceTokenRequest.Builder, ObjectBuilder<CreateServiceTokenRequest>> fn)
			throws IOException, ElasticsearchException {
		return createServiceToken(fn.apply(new CreateServiceTokenRequest.Builder()).build());
	}

	// ----- Endpoint: security.delete_privileges

	/**
	 * Removes application privileges.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-delete-privilege.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeletePrivilegesResponse> deletePrivileges(DeletePrivilegesRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, DeletePrivilegesRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Removes application privileges.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeletePrivilegesRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-delete-privilege.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeletePrivilegesResponse> deletePrivileges(
			Function<DeletePrivilegesRequest.Builder, ObjectBuilder<DeletePrivilegesRequest>> fn)
			throws IOException, ElasticsearchException {
		return deletePrivileges(fn.apply(new DeletePrivilegesRequest.Builder()).build());
	}

	// ----- Endpoint: security.delete_role

	/**
	 * Removes roles in the native realm.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-delete-role.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteRoleResponse> deleteRole(DeleteRoleRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, DeleteRoleRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Removes roles in the native realm.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteRoleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-delete-role.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteRoleResponse> deleteRole(
			Function<DeleteRoleRequest.Builder, ObjectBuilder<DeleteRoleRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteRole(fn.apply(new DeleteRoleRequest.Builder()).build());
	}

	// ----- Endpoint: security.delete_role_mapping

	/**
	 * Removes role mappings.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-delete-role-mapping.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteRoleMappingResponse> deleteRoleMapping(DeleteRoleMappingRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, DeleteRoleMappingRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Removes role mappings.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteRoleMappingRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-delete-role-mapping.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteRoleMappingResponse> deleteRoleMapping(
			Function<DeleteRoleMappingRequest.Builder, ObjectBuilder<DeleteRoleMappingRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteRoleMapping(fn.apply(new DeleteRoleMappingRequest.Builder()).build());
	}

	// ----- Endpoint: security.delete_service_token

	/**
	 * Deletes a service account token.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-delete-service-token.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteServiceTokenResponse> deleteServiceToken(DeleteServiceTokenRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, DeleteServiceTokenRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Deletes a service account token.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteServiceTokenRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-delete-service-token.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteServiceTokenResponse> deleteServiceToken(
			Function<DeleteServiceTokenRequest.Builder, ObjectBuilder<DeleteServiceTokenRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteServiceToken(fn.apply(new DeleteServiceTokenRequest.Builder()).build());
	}

	// ----- Endpoint: security.delete_user

	/**
	 * Deletes users from the native realm.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-delete-user.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteUserResponse> deleteUser(DeleteUserRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, DeleteUserRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Deletes users from the native realm.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteUserRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-delete-user.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteUserResponse> deleteUser(
			Function<DeleteUserRequest.Builder, ObjectBuilder<DeleteUserRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteUser(fn.apply(new DeleteUserRequest.Builder()).build());
	}

	// ----- Endpoint: security.disable_user

	/**
	 * Disables users in the native realm.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-disable-user.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DisableUserResponse> disableUser(DisableUserRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, DisableUserRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Disables users in the native realm.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DisableUserRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-disable-user.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DisableUserResponse> disableUser(
			Function<DisableUserRequest.Builder, ObjectBuilder<DisableUserRequest>> fn)
			throws IOException, ElasticsearchException {
		return disableUser(fn.apply(new DisableUserRequest.Builder()).build());
	}

	// ----- Endpoint: security.enable_user

	/**
	 * Enables users in the native realm.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-enable-user.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<EnableUserResponse> enableUser(EnableUserRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, EnableUserRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Enables users in the native realm.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link EnableUserRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-enable-user.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<EnableUserResponse> enableUser(
			Function<EnableUserRequest.Builder, ObjectBuilder<EnableUserRequest>> fn)
			throws IOException, ElasticsearchException {
		return enableUser(fn.apply(new EnableUserRequest.Builder()).build());
	}

	// ----- Endpoint: security.get_api_key

	/**
	 * Retrieves information for one or more API keys.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-api-key.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetApiKeyResponse> getApiKey(GetApiKeyRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, GetApiKeyRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Retrieves information for one or more API keys.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetApiKeyRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-api-key.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetApiKeyResponse> getApiKey(
			Function<GetApiKeyRequest.Builder, ObjectBuilder<GetApiKeyRequest>> fn)
			throws IOException, ElasticsearchException {
		return getApiKey(fn.apply(new GetApiKeyRequest.Builder()).build());
	}

	/**
	 * Retrieves information for one or more API keys.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-api-key.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetApiKeyResponse> getApiKey() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new GetApiKeyRequest.Builder().build(), GetApiKeyRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: security.get_builtin_privileges

	/**
	 * Retrieves the list of cluster privileges and index privileges that are
	 * available in this version of Elasticsearch.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-builtin-privileges.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<GetBuiltinPrivilegesResponse> getBuiltinPrivileges()
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(GetBuiltinPrivilegesRequest._INSTANCE,
				GetBuiltinPrivilegesRequest.ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: security.get_privileges

	/**
	 * Retrieves application privileges.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-privileges.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetPrivilegesResponse> getPrivileges(GetPrivilegesRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, GetPrivilegesRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Retrieves application privileges.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetPrivilegesRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-privileges.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetPrivilegesResponse> getPrivileges(
			Function<GetPrivilegesRequest.Builder, ObjectBuilder<GetPrivilegesRequest>> fn)
			throws IOException, ElasticsearchException {
		return getPrivileges(fn.apply(new GetPrivilegesRequest.Builder()).build());
	}

	/**
	 * Retrieves application privileges.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-privileges.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetPrivilegesResponse> getPrivileges() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new GetPrivilegesRequest.Builder().build(),
				GetPrivilegesRequest.ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: security.get_role

	/**
	 * Retrieves roles in the native realm.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-role.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetRoleResponse> getRole(GetRoleRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, GetRoleRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Retrieves roles in the native realm.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetRoleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-role.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetRoleResponse> getRole(
			Function<GetRoleRequest.Builder, ObjectBuilder<GetRoleRequest>> fn)
			throws IOException, ElasticsearchException {
		return getRole(fn.apply(new GetRoleRequest.Builder()).build());
	}

	/**
	 * Retrieves roles in the native realm.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-role.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetRoleResponse> getRole() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new GetRoleRequest.Builder().build(), GetRoleRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: security.get_role_mapping

	/**
	 * Retrieves role mappings.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-role-mapping.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetRoleMappingResponse> getRoleMapping(GetRoleMappingRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, GetRoleMappingRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Retrieves role mappings.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetRoleMappingRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-role-mapping.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetRoleMappingResponse> getRoleMapping(
			Function<GetRoleMappingRequest.Builder, ObjectBuilder<GetRoleMappingRequest>> fn)
			throws IOException, ElasticsearchException {
		return getRoleMapping(fn.apply(new GetRoleMappingRequest.Builder()).build());
	}

	/**
	 * Retrieves role mappings.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-role-mapping.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetRoleMappingResponse> getRoleMapping() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new GetRoleMappingRequest.Builder().build(),
				GetRoleMappingRequest.ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: security.get_service_accounts

	/**
	 * Retrieves information about service accounts.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-service-accounts.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetServiceAccountsResponse> getServiceAccounts(GetServiceAccountsRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, GetServiceAccountsRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Retrieves information about service accounts.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetServiceAccountsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-service-accounts.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetServiceAccountsResponse> getServiceAccounts(
			Function<GetServiceAccountsRequest.Builder, ObjectBuilder<GetServiceAccountsRequest>> fn)
			throws IOException, ElasticsearchException {
		return getServiceAccounts(fn.apply(new GetServiceAccountsRequest.Builder()).build());
	}

	/**
	 * Retrieves information about service accounts.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-service-accounts.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetServiceAccountsResponse> getServiceAccounts()
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new GetServiceAccountsRequest.Builder().build(),
				GetServiceAccountsRequest.ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: security.get_service_credentials

	/**
	 * Retrieves information of all service credentials for a service account.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-service-credentials.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetServiceCredentialsResponse> getServiceCredentials(GetServiceCredentialsRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, GetServiceCredentialsRequest.ENDPOINT,
				this.transportOptions);
	}

	/**
	 * Retrieves information of all service credentials for a service account.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetServiceCredentialsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-service-credentials.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetServiceCredentialsResponse> getServiceCredentials(
			Function<GetServiceCredentialsRequest.Builder, ObjectBuilder<GetServiceCredentialsRequest>> fn)
			throws IOException, ElasticsearchException {
		return getServiceCredentials(fn.apply(new GetServiceCredentialsRequest.Builder()).build());
	}

	// ----- Endpoint: security.get_token

	/**
	 * Creates a bearer token for access without requiring basic authentication.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-token.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetTokenResponse> getToken(GetTokenRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, GetTokenRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Creates a bearer token for access without requiring basic authentication.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetTokenRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-token.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetTokenResponse> getToken(
			Function<GetTokenRequest.Builder, ObjectBuilder<GetTokenRequest>> fn)
			throws IOException, ElasticsearchException {
		return getToken(fn.apply(new GetTokenRequest.Builder()).build());
	}

	/**
	 * Creates a bearer token for access without requiring basic authentication.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-token.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetTokenResponse> getToken() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new GetTokenRequest.Builder().build(), GetTokenRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: security.get_user

	/**
	 * Retrieves information about users in the native realm and built-in users.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-user.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetUserResponse> getUser(GetUserRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, GetUserRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Retrieves information about users in the native realm and built-in users.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetUserRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-user.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetUserResponse> getUser(
			Function<GetUserRequest.Builder, ObjectBuilder<GetUserRequest>> fn)
			throws IOException, ElasticsearchException {
		return getUser(fn.apply(new GetUserRequest.Builder()).build());
	}

	/**
	 * Retrieves information about users in the native realm and built-in users.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-user.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetUserResponse> getUser() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new GetUserRequest.Builder().build(), GetUserRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: security.get_user_privileges

	/**
	 * Retrieves security privileges for the logged in user.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-user-privileges.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetUserPrivilegesResponse> getUserPrivileges(GetUserPrivilegesRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, GetUserPrivilegesRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Retrieves security privileges for the logged in user.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetUserPrivilegesRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-user-privileges.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetUserPrivilegesResponse> getUserPrivileges(
			Function<GetUserPrivilegesRequest.Builder, ObjectBuilder<GetUserPrivilegesRequest>> fn)
			throws IOException, ElasticsearchException {
		return getUserPrivileges(fn.apply(new GetUserPrivilegesRequest.Builder()).build());
	}

	/**
	 * Retrieves security privileges for the logged in user.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-user-privileges.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetUserPrivilegesResponse> getUserPrivileges() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new GetUserPrivilegesRequest.Builder().build(),
				GetUserPrivilegesRequest.ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: security.grant_api_key

	/**
	 * Creates an API key on behalf of another user.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-grant-api-key.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GrantApiKeyResponse> grantApiKey(GrantApiKeyRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, GrantApiKeyRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Creates an API key on behalf of another user.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GrantApiKeyRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-grant-api-key.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GrantApiKeyResponse> grantApiKey(
			Function<GrantApiKeyRequest.Builder, ObjectBuilder<GrantApiKeyRequest>> fn)
			throws IOException, ElasticsearchException {
		return grantApiKey(fn.apply(new GrantApiKeyRequest.Builder()).build());
	}

	// ----- Endpoint: security.has_privileges

	/**
	 * Determines whether the specified user has a specified list of privileges.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-has-privileges.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<HasPrivilegesResponse> hasPrivileges(HasPrivilegesRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, HasPrivilegesRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Determines whether the specified user has a specified list of privileges.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link HasPrivilegesRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-has-privileges.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<HasPrivilegesResponse> hasPrivileges(
			Function<HasPrivilegesRequest.Builder, ObjectBuilder<HasPrivilegesRequest>> fn)
			throws IOException, ElasticsearchException {
		return hasPrivileges(fn.apply(new HasPrivilegesRequest.Builder()).build());
	}

	/**
	 * Determines whether the specified user has a specified list of privileges.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-has-privileges.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<HasPrivilegesResponse> hasPrivileges() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new HasPrivilegesRequest.Builder().build(),
				HasPrivilegesRequest.ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: security.invalidate_api_key

	/**
	 * Invalidates one or more API keys.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-invalidate-api-key.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<InvalidateApiKeyResponse> invalidateApiKey(InvalidateApiKeyRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, InvalidateApiKeyRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Invalidates one or more API keys.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link InvalidateApiKeyRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-invalidate-api-key.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<InvalidateApiKeyResponse> invalidateApiKey(
			Function<InvalidateApiKeyRequest.Builder, ObjectBuilder<InvalidateApiKeyRequest>> fn)
			throws IOException, ElasticsearchException {
		return invalidateApiKey(fn.apply(new InvalidateApiKeyRequest.Builder()).build());
	}

	/**
	 * Invalidates one or more API keys.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-invalidate-api-key.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<InvalidateApiKeyResponse> invalidateApiKey() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new InvalidateApiKeyRequest.Builder().build(),
				InvalidateApiKeyRequest.ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: security.invalidate_token

	/**
	 * Invalidates one or more access tokens or refresh tokens.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-invalidate-token.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<InvalidateTokenResponse> invalidateToken(InvalidateTokenRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, InvalidateTokenRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Invalidates one or more access tokens or refresh tokens.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link InvalidateTokenRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-invalidate-token.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<InvalidateTokenResponse> invalidateToken(
			Function<InvalidateTokenRequest.Builder, ObjectBuilder<InvalidateTokenRequest>> fn)
			throws IOException, ElasticsearchException {
		return invalidateToken(fn.apply(new InvalidateTokenRequest.Builder()).build());
	}

	/**
	 * Invalidates one or more access tokens or refresh tokens.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-invalidate-token.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<InvalidateTokenResponse> invalidateToken() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new InvalidateTokenRequest.Builder().build(),
				InvalidateTokenRequest.ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: security.put_privileges

	/**
	 * Adds or updates application privileges.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-put-privileges.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutPrivilegesResponse> putPrivileges(PutPrivilegesRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, PutPrivilegesRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Adds or updates application privileges.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutPrivilegesRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-put-privileges.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutPrivilegesResponse> putPrivileges(
			Function<PutPrivilegesRequest.Builder, ObjectBuilder<PutPrivilegesRequest>> fn)
			throws IOException, ElasticsearchException {
		return putPrivileges(fn.apply(new PutPrivilegesRequest.Builder()).build());
	}

	/**
	 * Adds or updates application privileges.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-put-privileges.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutPrivilegesResponse> putPrivileges() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new PutPrivilegesRequest.Builder().build(),
				PutPrivilegesRequest.ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: security.put_role

	/**
	 * Adds and updates roles in the native realm.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-put-role.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutRoleResponse> putRole(PutRoleRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, PutRoleRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Adds and updates roles in the native realm.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutRoleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-put-role.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutRoleResponse> putRole(
			Function<PutRoleRequest.Builder, ObjectBuilder<PutRoleRequest>> fn)
			throws IOException, ElasticsearchException {
		return putRole(fn.apply(new PutRoleRequest.Builder()).build());
	}

	// ----- Endpoint: security.put_role_mapping

	/**
	 * Creates and updates role mappings.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-put-role-mapping.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutRoleMappingResponse> putRoleMapping(PutRoleMappingRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, PutRoleMappingRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Creates and updates role mappings.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutRoleMappingRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-put-role-mapping.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutRoleMappingResponse> putRoleMapping(
			Function<PutRoleMappingRequest.Builder, ObjectBuilder<PutRoleMappingRequest>> fn)
			throws IOException, ElasticsearchException {
		return putRoleMapping(fn.apply(new PutRoleMappingRequest.Builder()).build());
	}

	// ----- Endpoint: security.put_user

	/**
	 * Adds and updates users in the native realm. These users are commonly referred
	 * to as native users.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-put-user.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutUserResponse> putUser(PutUserRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, PutUserRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Adds and updates users in the native realm. These users are commonly referred
	 * to as native users.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutUserRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-put-user.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutUserResponse> putUser(
			Function<PutUserRequest.Builder, ObjectBuilder<PutUserRequest>> fn)
			throws IOException, ElasticsearchException {
		return putUser(fn.apply(new PutUserRequest.Builder()).build());
	}

}
