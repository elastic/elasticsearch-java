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
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.JsonEndpoint;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import javax.annotation.Nullable;

/**
 * Client for the security namespace.
 */
public class ElasticsearchSecurityAsyncClient
		extends
			ApiClient<ElasticsearchTransport, ElasticsearchSecurityAsyncClient> {

	public ElasticsearchSecurityAsyncClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchSecurityAsyncClient(ElasticsearchTransport transport,
			@Nullable TransportOptions transportOptions) {
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
		return this.transport.performRequestAsync(AuthenticateRequest._INSTANCE, AuthenticateRequest._ENDPOINT,
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
		@SuppressWarnings("unchecked")
		JsonEndpoint<ChangePasswordRequest, ChangePasswordResponse, ErrorResponse> endpoint = (JsonEndpoint<ChangePasswordRequest, ChangePasswordResponse, ErrorResponse>) ChangePasswordRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
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

	public final CompletableFuture<ChangePasswordResponse> changePassword(Consumer<ChangePasswordRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		ChangePasswordRequest.Builder builder = new ChangePasswordRequest.Builder();
		fn.accept(builder);
		return changePassword(builder.build());
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
				ChangePasswordRequest._ENDPOINT, this.transportOptions);
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
		@SuppressWarnings("unchecked")
		JsonEndpoint<ClearApiKeyCacheRequest, ClearApiKeyCacheResponse, ErrorResponse> endpoint = (JsonEndpoint<ClearApiKeyCacheRequest, ClearApiKeyCacheResponse, ErrorResponse>) ClearApiKeyCacheRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
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
			Consumer<ClearApiKeyCacheRequest.Builder> fn) throws IOException, ElasticsearchException {
		ClearApiKeyCacheRequest.Builder builder = new ClearApiKeyCacheRequest.Builder();
		fn.accept(builder);
		return clearApiKeyCache(builder.build());
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
		@SuppressWarnings("unchecked")
		JsonEndpoint<ClearCachedPrivilegesRequest, ClearCachedPrivilegesResponse, ErrorResponse> endpoint = (JsonEndpoint<ClearCachedPrivilegesRequest, ClearCachedPrivilegesResponse, ErrorResponse>) ClearCachedPrivilegesRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
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
			Consumer<ClearCachedPrivilegesRequest.Builder> fn) throws IOException, ElasticsearchException {
		ClearCachedPrivilegesRequest.Builder builder = new ClearCachedPrivilegesRequest.Builder();
		fn.accept(builder);
		return clearCachedPrivileges(builder.build());
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
		@SuppressWarnings("unchecked")
		JsonEndpoint<ClearCachedRealmsRequest, ClearCachedRealmsResponse, ErrorResponse> endpoint = (JsonEndpoint<ClearCachedRealmsRequest, ClearCachedRealmsResponse, ErrorResponse>) ClearCachedRealmsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
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
			Consumer<ClearCachedRealmsRequest.Builder> fn) throws IOException, ElasticsearchException {
		ClearCachedRealmsRequest.Builder builder = new ClearCachedRealmsRequest.Builder();
		fn.accept(builder);
		return clearCachedRealms(builder.build());
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
		@SuppressWarnings("unchecked")
		JsonEndpoint<ClearCachedRolesRequest, ClearCachedRolesResponse, ErrorResponse> endpoint = (JsonEndpoint<ClearCachedRolesRequest, ClearCachedRolesResponse, ErrorResponse>) ClearCachedRolesRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
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
			Consumer<ClearCachedRolesRequest.Builder> fn) throws IOException, ElasticsearchException {
		ClearCachedRolesRequest.Builder builder = new ClearCachedRolesRequest.Builder();
		fn.accept(builder);
		return clearCachedRoles(builder.build());
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
		@SuppressWarnings("unchecked")
		JsonEndpoint<ClearCachedServiceTokensRequest, ClearCachedServiceTokensResponse, ErrorResponse> endpoint = (JsonEndpoint<ClearCachedServiceTokensRequest, ClearCachedServiceTokensResponse, ErrorResponse>) ClearCachedServiceTokensRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
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
			Consumer<ClearCachedServiceTokensRequest.Builder> fn) throws IOException, ElasticsearchException {
		ClearCachedServiceTokensRequest.Builder builder = new ClearCachedServiceTokensRequest.Builder();
		fn.accept(builder);
		return clearCachedServiceTokens(builder.build());
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
		@SuppressWarnings("unchecked")
		JsonEndpoint<CreateApiKeyRequest, CreateApiKeyResponse, ErrorResponse> endpoint = (JsonEndpoint<CreateApiKeyRequest, CreateApiKeyResponse, ErrorResponse>) CreateApiKeyRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
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

	public final CompletableFuture<CreateApiKeyResponse> createApiKey(Consumer<CreateApiKeyRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		CreateApiKeyRequest.Builder builder = new CreateApiKeyRequest.Builder();
		fn.accept(builder);
		return createApiKey(builder.build());
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
				CreateApiKeyRequest._ENDPOINT, this.transportOptions);
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
		@SuppressWarnings("unchecked")
		JsonEndpoint<CreateServiceTokenRequest, CreateServiceTokenResponse, ErrorResponse> endpoint = (JsonEndpoint<CreateServiceTokenRequest, CreateServiceTokenResponse, ErrorResponse>) CreateServiceTokenRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
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
			Consumer<CreateServiceTokenRequest.Builder> fn) throws IOException, ElasticsearchException {
		CreateServiceTokenRequest.Builder builder = new CreateServiceTokenRequest.Builder();
		fn.accept(builder);
		return createServiceToken(builder.build());
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
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeletePrivilegesRequest, DeletePrivilegesResponse, ErrorResponse> endpoint = (JsonEndpoint<DeletePrivilegesRequest, DeletePrivilegesResponse, ErrorResponse>) DeletePrivilegesRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
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
			Consumer<DeletePrivilegesRequest.Builder> fn) throws IOException, ElasticsearchException {
		DeletePrivilegesRequest.Builder builder = new DeletePrivilegesRequest.Builder();
		fn.accept(builder);
		return deletePrivileges(builder.build());
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
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteRoleRequest, DeleteRoleResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteRoleRequest, DeleteRoleResponse, ErrorResponse>) DeleteRoleRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
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

	public final CompletableFuture<DeleteRoleResponse> deleteRole(Consumer<DeleteRoleRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		DeleteRoleRequest.Builder builder = new DeleteRoleRequest.Builder();
		fn.accept(builder);
		return deleteRole(builder.build());
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
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteRoleMappingRequest, DeleteRoleMappingResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteRoleMappingRequest, DeleteRoleMappingResponse, ErrorResponse>) DeleteRoleMappingRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
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
			Consumer<DeleteRoleMappingRequest.Builder> fn) throws IOException, ElasticsearchException {
		DeleteRoleMappingRequest.Builder builder = new DeleteRoleMappingRequest.Builder();
		fn.accept(builder);
		return deleteRoleMapping(builder.build());
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
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteServiceTokenRequest, DeleteServiceTokenResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteServiceTokenRequest, DeleteServiceTokenResponse, ErrorResponse>) DeleteServiceTokenRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
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
			Consumer<DeleteServiceTokenRequest.Builder> fn) throws IOException, ElasticsearchException {
		DeleteServiceTokenRequest.Builder builder = new DeleteServiceTokenRequest.Builder();
		fn.accept(builder);
		return deleteServiceToken(builder.build());
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
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteUserRequest, DeleteUserResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteUserRequest, DeleteUserResponse, ErrorResponse>) DeleteUserRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
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

	public final CompletableFuture<DeleteUserResponse> deleteUser(Consumer<DeleteUserRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		DeleteUserRequest.Builder builder = new DeleteUserRequest.Builder();
		fn.accept(builder);
		return deleteUser(builder.build());
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
		@SuppressWarnings("unchecked")
		JsonEndpoint<DisableUserRequest, DisableUserResponse, ErrorResponse> endpoint = (JsonEndpoint<DisableUserRequest, DisableUserResponse, ErrorResponse>) DisableUserRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
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

	public final CompletableFuture<DisableUserResponse> disableUser(Consumer<DisableUserRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		DisableUserRequest.Builder builder = new DisableUserRequest.Builder();
		fn.accept(builder);
		return disableUser(builder.build());
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
		@SuppressWarnings("unchecked")
		JsonEndpoint<EnableUserRequest, EnableUserResponse, ErrorResponse> endpoint = (JsonEndpoint<EnableUserRequest, EnableUserResponse, ErrorResponse>) EnableUserRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
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

	public final CompletableFuture<EnableUserResponse> enableUser(Consumer<EnableUserRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		EnableUserRequest.Builder builder = new EnableUserRequest.Builder();
		fn.accept(builder);
		return enableUser(builder.build());
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
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetApiKeyRequest, GetApiKeyResponse, ErrorResponse> endpoint = (JsonEndpoint<GetApiKeyRequest, GetApiKeyResponse, ErrorResponse>) GetApiKeyRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
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

	public final CompletableFuture<GetApiKeyResponse> getApiKey(Consumer<GetApiKeyRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		GetApiKeyRequest.Builder builder = new GetApiKeyRequest.Builder();
		fn.accept(builder);
		return getApiKey(builder.build());
	}

	/**
	 * Retrieves information for one or more API keys.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-api-key.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetApiKeyResponse> getApiKey() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new GetApiKeyRequest.Builder().build(), GetApiKeyRequest._ENDPOINT,
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
				GetBuiltinPrivilegesRequest._ENDPOINT, this.transportOptions);
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
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetPrivilegesRequest, GetPrivilegesResponse, ErrorResponse> endpoint = (JsonEndpoint<GetPrivilegesRequest, GetPrivilegesResponse, ErrorResponse>) GetPrivilegesRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
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

	public final CompletableFuture<GetPrivilegesResponse> getPrivileges(Consumer<GetPrivilegesRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		GetPrivilegesRequest.Builder builder = new GetPrivilegesRequest.Builder();
		fn.accept(builder);
		return getPrivileges(builder.build());
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
				GetPrivilegesRequest._ENDPOINT, this.transportOptions);
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
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetRoleRequest, GetRoleResponse, ErrorResponse> endpoint = (JsonEndpoint<GetRoleRequest, GetRoleResponse, ErrorResponse>) GetRoleRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
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

	public final CompletableFuture<GetRoleResponse> getRole(Consumer<GetRoleRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		GetRoleRequest.Builder builder = new GetRoleRequest.Builder();
		fn.accept(builder);
		return getRole(builder.build());
	}

	/**
	 * Retrieves roles in the native realm.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-role.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetRoleResponse> getRole() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new GetRoleRequest.Builder().build(), GetRoleRequest._ENDPOINT,
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
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetRoleMappingRequest, GetRoleMappingResponse, ErrorResponse> endpoint = (JsonEndpoint<GetRoleMappingRequest, GetRoleMappingResponse, ErrorResponse>) GetRoleMappingRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
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

	public final CompletableFuture<GetRoleMappingResponse> getRoleMapping(Consumer<GetRoleMappingRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		GetRoleMappingRequest.Builder builder = new GetRoleMappingRequest.Builder();
		fn.accept(builder);
		return getRoleMapping(builder.build());
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
				GetRoleMappingRequest._ENDPOINT, this.transportOptions);
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
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetServiceAccountsRequest, GetServiceAccountsResponse, ErrorResponse> endpoint = (JsonEndpoint<GetServiceAccountsRequest, GetServiceAccountsResponse, ErrorResponse>) GetServiceAccountsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
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
			Consumer<GetServiceAccountsRequest.Builder> fn) throws IOException, ElasticsearchException {
		GetServiceAccountsRequest.Builder builder = new GetServiceAccountsRequest.Builder();
		fn.accept(builder);
		return getServiceAccounts(builder.build());
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
				GetServiceAccountsRequest._ENDPOINT, this.transportOptions);
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
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetServiceCredentialsRequest, GetServiceCredentialsResponse, ErrorResponse> endpoint = (JsonEndpoint<GetServiceCredentialsRequest, GetServiceCredentialsResponse, ErrorResponse>) GetServiceCredentialsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
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
			Consumer<GetServiceCredentialsRequest.Builder> fn) throws IOException, ElasticsearchException {
		GetServiceCredentialsRequest.Builder builder = new GetServiceCredentialsRequest.Builder();
		fn.accept(builder);
		return getServiceCredentials(builder.build());
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
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetTokenRequest, GetTokenResponse, ErrorResponse> endpoint = (JsonEndpoint<GetTokenRequest, GetTokenResponse, ErrorResponse>) GetTokenRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
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

	public final CompletableFuture<GetTokenResponse> getToken(Consumer<GetTokenRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		GetTokenRequest.Builder builder = new GetTokenRequest.Builder();
		fn.accept(builder);
		return getToken(builder.build());
	}

	/**
	 * Creates a bearer token for access without requiring basic authentication.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-token.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetTokenResponse> getToken() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new GetTokenRequest.Builder().build(), GetTokenRequest._ENDPOINT,
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
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetUserRequest, GetUserResponse, ErrorResponse> endpoint = (JsonEndpoint<GetUserRequest, GetUserResponse, ErrorResponse>) GetUserRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
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

	public final CompletableFuture<GetUserResponse> getUser(Consumer<GetUserRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		GetUserRequest.Builder builder = new GetUserRequest.Builder();
		fn.accept(builder);
		return getUser(builder.build());
	}

	/**
	 * Retrieves information about users in the native realm and built-in users.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-user.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetUserResponse> getUser() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new GetUserRequest.Builder().build(), GetUserRequest._ENDPOINT,
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
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetUserPrivilegesRequest, GetUserPrivilegesResponse, ErrorResponse> endpoint = (JsonEndpoint<GetUserPrivilegesRequest, GetUserPrivilegesResponse, ErrorResponse>) GetUserPrivilegesRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
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
			Consumer<GetUserPrivilegesRequest.Builder> fn) throws IOException, ElasticsearchException {
		GetUserPrivilegesRequest.Builder builder = new GetUserPrivilegesRequest.Builder();
		fn.accept(builder);
		return getUserPrivileges(builder.build());
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
				GetUserPrivilegesRequest._ENDPOINT, this.transportOptions);
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
		@SuppressWarnings("unchecked")
		JsonEndpoint<GrantApiKeyRequest, GrantApiKeyResponse, ErrorResponse> endpoint = (JsonEndpoint<GrantApiKeyRequest, GrantApiKeyResponse, ErrorResponse>) GrantApiKeyRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
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

	public final CompletableFuture<GrantApiKeyResponse> grantApiKey(Consumer<GrantApiKeyRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		GrantApiKeyRequest.Builder builder = new GrantApiKeyRequest.Builder();
		fn.accept(builder);
		return grantApiKey(builder.build());
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
		@SuppressWarnings("unchecked")
		JsonEndpoint<HasPrivilegesRequest, HasPrivilegesResponse, ErrorResponse> endpoint = (JsonEndpoint<HasPrivilegesRequest, HasPrivilegesResponse, ErrorResponse>) HasPrivilegesRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
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

	public final CompletableFuture<HasPrivilegesResponse> hasPrivileges(Consumer<HasPrivilegesRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		HasPrivilegesRequest.Builder builder = new HasPrivilegesRequest.Builder();
		fn.accept(builder);
		return hasPrivileges(builder.build());
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
				HasPrivilegesRequest._ENDPOINT, this.transportOptions);
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
		@SuppressWarnings("unchecked")
		JsonEndpoint<InvalidateApiKeyRequest, InvalidateApiKeyResponse, ErrorResponse> endpoint = (JsonEndpoint<InvalidateApiKeyRequest, InvalidateApiKeyResponse, ErrorResponse>) InvalidateApiKeyRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
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
			Consumer<InvalidateApiKeyRequest.Builder> fn) throws IOException, ElasticsearchException {
		InvalidateApiKeyRequest.Builder builder = new InvalidateApiKeyRequest.Builder();
		fn.accept(builder);
		return invalidateApiKey(builder.build());
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
				InvalidateApiKeyRequest._ENDPOINT, this.transportOptions);
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
		@SuppressWarnings("unchecked")
		JsonEndpoint<InvalidateTokenRequest, InvalidateTokenResponse, ErrorResponse> endpoint = (JsonEndpoint<InvalidateTokenRequest, InvalidateTokenResponse, ErrorResponse>) InvalidateTokenRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
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

	public final CompletableFuture<InvalidateTokenResponse> invalidateToken(Consumer<InvalidateTokenRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		InvalidateTokenRequest.Builder builder = new InvalidateTokenRequest.Builder();
		fn.accept(builder);
		return invalidateToken(builder.build());
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
				InvalidateTokenRequest._ENDPOINT, this.transportOptions);
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
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutPrivilegesRequest, PutPrivilegesResponse, ErrorResponse> endpoint = (JsonEndpoint<PutPrivilegesRequest, PutPrivilegesResponse, ErrorResponse>) PutPrivilegesRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
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

	public final CompletableFuture<PutPrivilegesResponse> putPrivileges(Consumer<PutPrivilegesRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		PutPrivilegesRequest.Builder builder = new PutPrivilegesRequest.Builder();
		fn.accept(builder);
		return putPrivileges(builder.build());
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
				PutPrivilegesRequest._ENDPOINT, this.transportOptions);
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
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutRoleRequest, PutRoleResponse, ErrorResponse> endpoint = (JsonEndpoint<PutRoleRequest, PutRoleResponse, ErrorResponse>) PutRoleRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
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

	public final CompletableFuture<PutRoleResponse> putRole(Consumer<PutRoleRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		PutRoleRequest.Builder builder = new PutRoleRequest.Builder();
		fn.accept(builder);
		return putRole(builder.build());
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
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutRoleMappingRequest, PutRoleMappingResponse, ErrorResponse> endpoint = (JsonEndpoint<PutRoleMappingRequest, PutRoleMappingResponse, ErrorResponse>) PutRoleMappingRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
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

	public final CompletableFuture<PutRoleMappingResponse> putRoleMapping(Consumer<PutRoleMappingRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		PutRoleMappingRequest.Builder builder = new PutRoleMappingRequest.Builder();
		fn.accept(builder);
		return putRoleMapping(builder.build());
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
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutUserRequest, PutUserResponse, ErrorResponse> endpoint = (JsonEndpoint<PutUserRequest, PutUserResponse, ErrorResponse>) PutUserRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
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

	public final CompletableFuture<PutUserResponse> putUser(Consumer<PutUserRequest.Builder> fn)
			throws IOException, ElasticsearchException {
		PutUserRequest.Builder builder = new PutUserRequest.Builder();
		fn.accept(builder);
		return putUser(builder.build());
	}

}
