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
import co.elastic.clients.transport.endpoints.BooleanResponse;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.function.Function;
import javax.annotation.Nullable;

/**
 * Client for the security namespace.
 */
public class ElasticsearchSecurityClient extends ApiClient<ElasticsearchTransport, ElasticsearchSecurityClient> {

	public ElasticsearchSecurityClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchSecurityClient(ElasticsearchTransport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchSecurityClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchSecurityClient(this.transport, transportOptions);
	}

	// ----- Endpoint: security.activate_user_profile

	/**
	 * Creates or updates the user profile on behalf of another user.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-activate-user-profile.html">Documentation
	 *      on elastic.co</a>
	 */

	public ActivateUserProfileResponse activateUserProfile(ActivateUserProfileRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ActivateUserProfileRequest, ActivateUserProfileResponse, ErrorResponse> endpoint = (JsonEndpoint<ActivateUserProfileRequest, ActivateUserProfileResponse, ErrorResponse>) ActivateUserProfileRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Creates or updates the user profile on behalf of another user.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ActivateUserProfileRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-activate-user-profile.html">Documentation
	 *      on elastic.co</a>
	 */

	public final ActivateUserProfileResponse activateUserProfile(
			Function<ActivateUserProfileRequest.Builder, ObjectBuilder<ActivateUserProfileRequest>> fn)
			throws IOException, ElasticsearchException {
		return activateUserProfile(fn.apply(new ActivateUserProfileRequest.Builder()).build());
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
	public AuthenticateResponse authenticate() throws IOException, ElasticsearchException {
		return this.transport.performRequest(AuthenticateRequest._INSTANCE, AuthenticateRequest._ENDPOINT,
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

	public ChangePasswordResponse changePassword(ChangePasswordRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ChangePasswordRequest, ChangePasswordResponse, ErrorResponse> endpoint = (JsonEndpoint<ChangePasswordRequest, ChangePasswordResponse, ErrorResponse>) ChangePasswordRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final ChangePasswordResponse changePassword(
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

	public ChangePasswordResponse changePassword() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new ChangePasswordRequest.Builder().build(),
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

	public ClearApiKeyCacheResponse clearApiKeyCache(ClearApiKeyCacheRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ClearApiKeyCacheRequest, ClearApiKeyCacheResponse, ErrorResponse> endpoint = (JsonEndpoint<ClearApiKeyCacheRequest, ClearApiKeyCacheResponse, ErrorResponse>) ClearApiKeyCacheRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final ClearApiKeyCacheResponse clearApiKeyCache(
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

	public ClearCachedPrivilegesResponse clearCachedPrivileges(ClearCachedPrivilegesRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ClearCachedPrivilegesRequest, ClearCachedPrivilegesResponse, ErrorResponse> endpoint = (JsonEndpoint<ClearCachedPrivilegesRequest, ClearCachedPrivilegesResponse, ErrorResponse>) ClearCachedPrivilegesRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final ClearCachedPrivilegesResponse clearCachedPrivileges(
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

	public ClearCachedRealmsResponse clearCachedRealms(ClearCachedRealmsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ClearCachedRealmsRequest, ClearCachedRealmsResponse, ErrorResponse> endpoint = (JsonEndpoint<ClearCachedRealmsRequest, ClearCachedRealmsResponse, ErrorResponse>) ClearCachedRealmsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final ClearCachedRealmsResponse clearCachedRealms(
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

	public ClearCachedRolesResponse clearCachedRoles(ClearCachedRolesRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ClearCachedRolesRequest, ClearCachedRolesResponse, ErrorResponse> endpoint = (JsonEndpoint<ClearCachedRolesRequest, ClearCachedRolesResponse, ErrorResponse>) ClearCachedRolesRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final ClearCachedRolesResponse clearCachedRoles(
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

	public ClearCachedServiceTokensResponse clearCachedServiceTokens(ClearCachedServiceTokensRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ClearCachedServiceTokensRequest, ClearCachedServiceTokensResponse, ErrorResponse> endpoint = (JsonEndpoint<ClearCachedServiceTokensRequest, ClearCachedServiceTokensResponse, ErrorResponse>) ClearCachedServiceTokensRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final ClearCachedServiceTokensResponse clearCachedServiceTokens(
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

	public CreateApiKeyResponse createApiKey(CreateApiKeyRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<CreateApiKeyRequest, CreateApiKeyResponse, ErrorResponse> endpoint = (JsonEndpoint<CreateApiKeyRequest, CreateApiKeyResponse, ErrorResponse>) CreateApiKeyRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final CreateApiKeyResponse createApiKey(
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

	public CreateApiKeyResponse createApiKey() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new CreateApiKeyRequest.Builder().build(), CreateApiKeyRequest._ENDPOINT,
				this.transportOptions);
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

	public CreateServiceTokenResponse createServiceToken(CreateServiceTokenRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<CreateServiceTokenRequest, CreateServiceTokenResponse, ErrorResponse> endpoint = (JsonEndpoint<CreateServiceTokenRequest, CreateServiceTokenResponse, ErrorResponse>) CreateServiceTokenRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final CreateServiceTokenResponse createServiceToken(
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

	public DeletePrivilegesResponse deletePrivileges(DeletePrivilegesRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeletePrivilegesRequest, DeletePrivilegesResponse, ErrorResponse> endpoint = (JsonEndpoint<DeletePrivilegesRequest, DeletePrivilegesResponse, ErrorResponse>) DeletePrivilegesRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final DeletePrivilegesResponse deletePrivileges(
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

	public DeleteRoleResponse deleteRole(DeleteRoleRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteRoleRequest, DeleteRoleResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteRoleRequest, DeleteRoleResponse, ErrorResponse>) DeleteRoleRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final DeleteRoleResponse deleteRole(Function<DeleteRoleRequest.Builder, ObjectBuilder<DeleteRoleRequest>> fn)
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

	public DeleteRoleMappingResponse deleteRoleMapping(DeleteRoleMappingRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteRoleMappingRequest, DeleteRoleMappingResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteRoleMappingRequest, DeleteRoleMappingResponse, ErrorResponse>) DeleteRoleMappingRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final DeleteRoleMappingResponse deleteRoleMapping(
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

	public DeleteServiceTokenResponse deleteServiceToken(DeleteServiceTokenRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteServiceTokenRequest, DeleteServiceTokenResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteServiceTokenRequest, DeleteServiceTokenResponse, ErrorResponse>) DeleteServiceTokenRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final DeleteServiceTokenResponse deleteServiceToken(
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

	public DeleteUserResponse deleteUser(DeleteUserRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteUserRequest, DeleteUserResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteUserRequest, DeleteUserResponse, ErrorResponse>) DeleteUserRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final DeleteUserResponse deleteUser(Function<DeleteUserRequest.Builder, ObjectBuilder<DeleteUserRequest>> fn)
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

	public DisableUserResponse disableUser(DisableUserRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DisableUserRequest, DisableUserResponse, ErrorResponse> endpoint = (JsonEndpoint<DisableUserRequest, DisableUserResponse, ErrorResponse>) DisableUserRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final DisableUserResponse disableUser(
			Function<DisableUserRequest.Builder, ObjectBuilder<DisableUserRequest>> fn)
			throws IOException, ElasticsearchException {
		return disableUser(fn.apply(new DisableUserRequest.Builder()).build());
	}

	// ----- Endpoint: security.disable_user_profile

	/**
	 * Disables a user profile so it's not visible in user profile searches.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/security-api-disable-user-profile.html">Documentation
	 *      on elastic.co</a>
	 */

	public DisableUserProfileResponse disableUserProfile(DisableUserProfileRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DisableUserProfileRequest, DisableUserProfileResponse, ErrorResponse> endpoint = (JsonEndpoint<DisableUserProfileRequest, DisableUserProfileResponse, ErrorResponse>) DisableUserProfileRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Disables a user profile so it's not visible in user profile searches.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DisableUserProfileRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/security-api-disable-user-profile.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DisableUserProfileResponse disableUserProfile(
			Function<DisableUserProfileRequest.Builder, ObjectBuilder<DisableUserProfileRequest>> fn)
			throws IOException, ElasticsearchException {
		return disableUserProfile(fn.apply(new DisableUserProfileRequest.Builder()).build());
	}

	// ----- Endpoint: security.enable_user

	/**
	 * Enables users in the native realm.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-enable-user.html">Documentation
	 *      on elastic.co</a>
	 */

	public EnableUserResponse enableUser(EnableUserRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<EnableUserRequest, EnableUserResponse, ErrorResponse> endpoint = (JsonEndpoint<EnableUserRequest, EnableUserResponse, ErrorResponse>) EnableUserRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final EnableUserResponse enableUser(Function<EnableUserRequest.Builder, ObjectBuilder<EnableUserRequest>> fn)
			throws IOException, ElasticsearchException {
		return enableUser(fn.apply(new EnableUserRequest.Builder()).build());
	}

	// ----- Endpoint: security.enable_user_profile

	/**
	 * Enables a user profile so it's visible in user profile searches.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/security-api-enable-user-profile.html">Documentation
	 *      on elastic.co</a>
	 */

	public EnableUserProfileResponse enableUserProfile(EnableUserProfileRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<EnableUserProfileRequest, EnableUserProfileResponse, ErrorResponse> endpoint = (JsonEndpoint<EnableUserProfileRequest, EnableUserProfileResponse, ErrorResponse>) EnableUserProfileRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Enables a user profile so it's visible in user profile searches.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link EnableUserProfileRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/security-api-enable-user-profile.html">Documentation
	 *      on elastic.co</a>
	 */

	public final EnableUserProfileResponse enableUserProfile(
			Function<EnableUserProfileRequest.Builder, ObjectBuilder<EnableUserProfileRequest>> fn)
			throws IOException, ElasticsearchException {
		return enableUserProfile(fn.apply(new EnableUserProfileRequest.Builder()).build());
	}

	// ----- Endpoint: security.enroll_kibana

	/**
	 * Allows a kibana instance to configure itself to communicate with a secured
	 * elasticsearch cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/security-api-kibana-enrollment.html">Documentation
	 *      on elastic.co</a>
	 */
	public EnrollKibanaResponse enrollKibana() throws IOException, ElasticsearchException {
		return this.transport.performRequest(EnrollKibanaRequest._INSTANCE, EnrollKibanaRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: security.enroll_node

	/**
	 * Allows a new node to enroll to an existing cluster with security enabled.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/security-api-node-enrollment.html">Documentation
	 *      on elastic.co</a>
	 */
	public EnrollNodeResponse enrollNode() throws IOException, ElasticsearchException {
		return this.transport.performRequest(EnrollNodeRequest._INSTANCE, EnrollNodeRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: security.get_api_key

	/**
	 * Retrieves information for one or more API keys.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-api-key.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetApiKeyResponse getApiKey(GetApiKeyRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetApiKeyRequest, GetApiKeyResponse, ErrorResponse> endpoint = (JsonEndpoint<GetApiKeyRequest, GetApiKeyResponse, ErrorResponse>) GetApiKeyRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final GetApiKeyResponse getApiKey(Function<GetApiKeyRequest.Builder, ObjectBuilder<GetApiKeyRequest>> fn)
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

	public GetApiKeyResponse getApiKey() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetApiKeyRequest.Builder().build(), GetApiKeyRequest._ENDPOINT,
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
	public GetBuiltinPrivilegesResponse getBuiltinPrivileges() throws IOException, ElasticsearchException {
		return this.transport.performRequest(GetBuiltinPrivilegesRequest._INSTANCE,
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

	public GetPrivilegesResponse getPrivileges(GetPrivilegesRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetPrivilegesRequest, GetPrivilegesResponse, ErrorResponse> endpoint = (JsonEndpoint<GetPrivilegesRequest, GetPrivilegesResponse, ErrorResponse>) GetPrivilegesRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final GetPrivilegesResponse getPrivileges(
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

	public GetPrivilegesResponse getPrivileges() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetPrivilegesRequest.Builder().build(), GetPrivilegesRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: security.get_role

	/**
	 * Retrieves roles in the native realm.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-role.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetRoleResponse getRole(GetRoleRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetRoleRequest, GetRoleResponse, ErrorResponse> endpoint = (JsonEndpoint<GetRoleRequest, GetRoleResponse, ErrorResponse>) GetRoleRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final GetRoleResponse getRole(Function<GetRoleRequest.Builder, ObjectBuilder<GetRoleRequest>> fn)
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

	public GetRoleResponse getRole() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetRoleRequest.Builder().build(), GetRoleRequest._ENDPOINT,
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

	public GetRoleMappingResponse getRoleMapping(GetRoleMappingRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetRoleMappingRequest, GetRoleMappingResponse, ErrorResponse> endpoint = (JsonEndpoint<GetRoleMappingRequest, GetRoleMappingResponse, ErrorResponse>) GetRoleMappingRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final GetRoleMappingResponse getRoleMapping(
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

	public GetRoleMappingResponse getRoleMapping() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetRoleMappingRequest.Builder().build(),
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

	public GetServiceAccountsResponse getServiceAccounts(GetServiceAccountsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetServiceAccountsRequest, GetServiceAccountsResponse, ErrorResponse> endpoint = (JsonEndpoint<GetServiceAccountsRequest, GetServiceAccountsResponse, ErrorResponse>) GetServiceAccountsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final GetServiceAccountsResponse getServiceAccounts(
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

	public GetServiceAccountsResponse getServiceAccounts() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetServiceAccountsRequest.Builder().build(),
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

	public GetServiceCredentialsResponse getServiceCredentials(GetServiceCredentialsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetServiceCredentialsRequest, GetServiceCredentialsResponse, ErrorResponse> endpoint = (JsonEndpoint<GetServiceCredentialsRequest, GetServiceCredentialsResponse, ErrorResponse>) GetServiceCredentialsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final GetServiceCredentialsResponse getServiceCredentials(
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

	public GetTokenResponse getToken(GetTokenRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetTokenRequest, GetTokenResponse, ErrorResponse> endpoint = (JsonEndpoint<GetTokenRequest, GetTokenResponse, ErrorResponse>) GetTokenRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final GetTokenResponse getToken(Function<GetTokenRequest.Builder, ObjectBuilder<GetTokenRequest>> fn)
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

	public GetTokenResponse getToken() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetTokenRequest.Builder().build(), GetTokenRequest._ENDPOINT,
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

	public GetUserResponse getUser(GetUserRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetUserRequest, GetUserResponse, ErrorResponse> endpoint = (JsonEndpoint<GetUserRequest, GetUserResponse, ErrorResponse>) GetUserRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final GetUserResponse getUser(Function<GetUserRequest.Builder, ObjectBuilder<GetUserRequest>> fn)
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

	public GetUserResponse getUser() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetUserRequest.Builder().build(), GetUserRequest._ENDPOINT,
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

	public GetUserPrivilegesResponse getUserPrivileges(GetUserPrivilegesRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetUserPrivilegesRequest, GetUserPrivilegesResponse, ErrorResponse> endpoint = (JsonEndpoint<GetUserPrivilegesRequest, GetUserPrivilegesResponse, ErrorResponse>) GetUserPrivilegesRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final GetUserPrivilegesResponse getUserPrivileges(
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

	public GetUserPrivilegesResponse getUserPrivileges() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetUserPrivilegesRequest.Builder().build(),
				GetUserPrivilegesRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: security.get_user_profile

	/**
	 * Retrieves user profile for the given unique ID.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-user-profile.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetUserProfileResponse getUserProfile(GetUserProfileRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetUserProfileRequest, GetUserProfileResponse, ErrorResponse> endpoint = (JsonEndpoint<GetUserProfileRequest, GetUserProfileResponse, ErrorResponse>) GetUserProfileRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Retrieves user profile for the given unique ID.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetUserProfileRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-user-profile.html">Documentation
	 *      on elastic.co</a>
	 */

	public final GetUserProfileResponse getUserProfile(
			Function<GetUserProfileRequest.Builder, ObjectBuilder<GetUserProfileRequest>> fn)
			throws IOException, ElasticsearchException {
		return getUserProfile(fn.apply(new GetUserProfileRequest.Builder()).build());
	}

	// ----- Endpoint: security.grant_api_key

	/**
	 * Creates an API key on behalf of another user.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-grant-api-key.html">Documentation
	 *      on elastic.co</a>
	 */

	public GrantApiKeyResponse grantApiKey(GrantApiKeyRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GrantApiKeyRequest, GrantApiKeyResponse, ErrorResponse> endpoint = (JsonEndpoint<GrantApiKeyRequest, GrantApiKeyResponse, ErrorResponse>) GrantApiKeyRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final GrantApiKeyResponse grantApiKey(
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

	public HasPrivilegesResponse hasPrivileges(HasPrivilegesRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<HasPrivilegesRequest, HasPrivilegesResponse, ErrorResponse> endpoint = (JsonEndpoint<HasPrivilegesRequest, HasPrivilegesResponse, ErrorResponse>) HasPrivilegesRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final HasPrivilegesResponse hasPrivileges(
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

	public HasPrivilegesResponse hasPrivileges() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new HasPrivilegesRequest.Builder().build(), HasPrivilegesRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: security.has_privileges_user_profile

	/**
	 * Determines whether the users associated with the specified profile IDs have
	 * all the requested privileges.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-has-privileges-user-profile.html">Documentation
	 *      on elastic.co</a>
	 */

	public HasPrivilegesUserProfileResponse hasPrivilegesUserProfile(HasPrivilegesUserProfileRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<HasPrivilegesUserProfileRequest, HasPrivilegesUserProfileResponse, ErrorResponse> endpoint = (JsonEndpoint<HasPrivilegesUserProfileRequest, HasPrivilegesUserProfileResponse, ErrorResponse>) HasPrivilegesUserProfileRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Determines whether the users associated with the specified profile IDs have
	 * all the requested privileges.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link HasPrivilegesUserProfileRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-has-privileges-user-profile.html">Documentation
	 *      on elastic.co</a>
	 */

	public final HasPrivilegesUserProfileResponse hasPrivilegesUserProfile(
			Function<HasPrivilegesUserProfileRequest.Builder, ObjectBuilder<HasPrivilegesUserProfileRequest>> fn)
			throws IOException, ElasticsearchException {
		return hasPrivilegesUserProfile(fn.apply(new HasPrivilegesUserProfileRequest.Builder()).build());
	}

	// ----- Endpoint: security.invalidate_api_key

	/**
	 * Invalidates one or more API keys.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-invalidate-api-key.html">Documentation
	 *      on elastic.co</a>
	 */

	public InvalidateApiKeyResponse invalidateApiKey(InvalidateApiKeyRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<InvalidateApiKeyRequest, InvalidateApiKeyResponse, ErrorResponse> endpoint = (JsonEndpoint<InvalidateApiKeyRequest, InvalidateApiKeyResponse, ErrorResponse>) InvalidateApiKeyRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final InvalidateApiKeyResponse invalidateApiKey(
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

	public InvalidateApiKeyResponse invalidateApiKey() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new InvalidateApiKeyRequest.Builder().build(),
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

	public InvalidateTokenResponse invalidateToken(InvalidateTokenRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<InvalidateTokenRequest, InvalidateTokenResponse, ErrorResponse> endpoint = (JsonEndpoint<InvalidateTokenRequest, InvalidateTokenResponse, ErrorResponse>) InvalidateTokenRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final InvalidateTokenResponse invalidateToken(
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

	public InvalidateTokenResponse invalidateToken() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new InvalidateTokenRequest.Builder().build(),
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

	public PutPrivilegesResponse putPrivileges(PutPrivilegesRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutPrivilegesRequest, PutPrivilegesResponse, ErrorResponse> endpoint = (JsonEndpoint<PutPrivilegesRequest, PutPrivilegesResponse, ErrorResponse>) PutPrivilegesRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final PutPrivilegesResponse putPrivileges(
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

	public PutPrivilegesResponse putPrivileges() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new PutPrivilegesRequest.Builder().build(), PutPrivilegesRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: security.put_role

	/**
	 * Adds and updates roles in the native realm.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-put-role.html">Documentation
	 *      on elastic.co</a>
	 */

	public PutRoleResponse putRole(PutRoleRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutRoleRequest, PutRoleResponse, ErrorResponse> endpoint = (JsonEndpoint<PutRoleRequest, PutRoleResponse, ErrorResponse>) PutRoleRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final PutRoleResponse putRole(Function<PutRoleRequest.Builder, ObjectBuilder<PutRoleRequest>> fn)
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

	public PutRoleMappingResponse putRoleMapping(PutRoleMappingRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutRoleMappingRequest, PutRoleMappingResponse, ErrorResponse> endpoint = (JsonEndpoint<PutRoleMappingRequest, PutRoleMappingResponse, ErrorResponse>) PutRoleMappingRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final PutRoleMappingResponse putRoleMapping(
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

	public PutUserResponse putUser(PutUserRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutUserRequest, PutUserResponse, ErrorResponse> endpoint = (JsonEndpoint<PutUserRequest, PutUserResponse, ErrorResponse>) PutUserRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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

	public final PutUserResponse putUser(Function<PutUserRequest.Builder, ObjectBuilder<PutUserRequest>> fn)
			throws IOException, ElasticsearchException {
		return putUser(fn.apply(new PutUserRequest.Builder()).build());
	}

	// ----- Endpoint: security.query_api_keys

	/**
	 * Retrieves information for API keys using a subset of query DSL
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-query-api-key.html">Documentation
	 *      on elastic.co</a>
	 */

	public QueryApiKeysResponse queryApiKeys(QueryApiKeysRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<QueryApiKeysRequest, QueryApiKeysResponse, ErrorResponse> endpoint = (JsonEndpoint<QueryApiKeysRequest, QueryApiKeysResponse, ErrorResponse>) QueryApiKeysRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Retrieves information for API keys using a subset of query DSL
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link QueryApiKeysRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-query-api-key.html">Documentation
	 *      on elastic.co</a>
	 */

	public final QueryApiKeysResponse queryApiKeys(
			Function<QueryApiKeysRequest.Builder, ObjectBuilder<QueryApiKeysRequest>> fn)
			throws IOException, ElasticsearchException {
		return queryApiKeys(fn.apply(new QueryApiKeysRequest.Builder()).build());
	}

	/**
	 * Retrieves information for API keys using a subset of query DSL
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-query-api-key.html">Documentation
	 *      on elastic.co</a>
	 */

	public QueryApiKeysResponse queryApiKeys() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new QueryApiKeysRequest.Builder().build(), QueryApiKeysRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: security.saml_authenticate

	/**
	 * Exchanges a SAML Response message for an Elasticsearch access token and
	 * refresh token pair
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-saml-authenticate.html">Documentation
	 *      on elastic.co</a>
	 */

	public SamlAuthenticateResponse samlAuthenticate(SamlAuthenticateRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SamlAuthenticateRequest, SamlAuthenticateResponse, ErrorResponse> endpoint = (JsonEndpoint<SamlAuthenticateRequest, SamlAuthenticateResponse, ErrorResponse>) SamlAuthenticateRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Exchanges a SAML Response message for an Elasticsearch access token and
	 * refresh token pair
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SamlAuthenticateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-saml-authenticate.html">Documentation
	 *      on elastic.co</a>
	 */

	public final SamlAuthenticateResponse samlAuthenticate(
			Function<SamlAuthenticateRequest.Builder, ObjectBuilder<SamlAuthenticateRequest>> fn)
			throws IOException, ElasticsearchException {
		return samlAuthenticate(fn.apply(new SamlAuthenticateRequest.Builder()).build());
	}

	// ----- Endpoint: security.saml_complete_logout

	/**
	 * Verifies the logout response sent from the SAML IdP
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-saml-complete-logout.html">Documentation
	 *      on elastic.co</a>
	 */

	public BooleanResponse samlCompleteLogout(SamlCompleteLogoutRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SamlCompleteLogoutRequest, BooleanResponse, ErrorResponse> endpoint = (JsonEndpoint<SamlCompleteLogoutRequest, BooleanResponse, ErrorResponse>) SamlCompleteLogoutRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Verifies the logout response sent from the SAML IdP
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SamlCompleteLogoutRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-saml-complete-logout.html">Documentation
	 *      on elastic.co</a>
	 */

	public final BooleanResponse samlCompleteLogout(
			Function<SamlCompleteLogoutRequest.Builder, ObjectBuilder<SamlCompleteLogoutRequest>> fn)
			throws IOException, ElasticsearchException {
		return samlCompleteLogout(fn.apply(new SamlCompleteLogoutRequest.Builder()).build());
	}

	// ----- Endpoint: security.saml_invalidate

	/**
	 * Consumes a SAML LogoutRequest
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-saml-invalidate.html">Documentation
	 *      on elastic.co</a>
	 */

	public SamlInvalidateResponse samlInvalidate(SamlInvalidateRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SamlInvalidateRequest, SamlInvalidateResponse, ErrorResponse> endpoint = (JsonEndpoint<SamlInvalidateRequest, SamlInvalidateResponse, ErrorResponse>) SamlInvalidateRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Consumes a SAML LogoutRequest
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SamlInvalidateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-saml-invalidate.html">Documentation
	 *      on elastic.co</a>
	 */

	public final SamlInvalidateResponse samlInvalidate(
			Function<SamlInvalidateRequest.Builder, ObjectBuilder<SamlInvalidateRequest>> fn)
			throws IOException, ElasticsearchException {
		return samlInvalidate(fn.apply(new SamlInvalidateRequest.Builder()).build());
	}

	// ----- Endpoint: security.saml_logout

	/**
	 * Invalidates an access token and a refresh token that were generated via the
	 * SAML Authenticate API
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-saml-logout.html">Documentation
	 *      on elastic.co</a>
	 */

	public SamlLogoutResponse samlLogout(SamlLogoutRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SamlLogoutRequest, SamlLogoutResponse, ErrorResponse> endpoint = (JsonEndpoint<SamlLogoutRequest, SamlLogoutResponse, ErrorResponse>) SamlLogoutRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Invalidates an access token and a refresh token that were generated via the
	 * SAML Authenticate API
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SamlLogoutRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-saml-logout.html">Documentation
	 *      on elastic.co</a>
	 */

	public final SamlLogoutResponse samlLogout(Function<SamlLogoutRequest.Builder, ObjectBuilder<SamlLogoutRequest>> fn)
			throws IOException, ElasticsearchException {
		return samlLogout(fn.apply(new SamlLogoutRequest.Builder()).build());
	}

	// ----- Endpoint: security.saml_prepare_authentication

	/**
	 * Creates a SAML authentication request
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-saml-prepare-authentication.html">Documentation
	 *      on elastic.co</a>
	 */

	public SamlPrepareAuthenticationResponse samlPrepareAuthentication(SamlPrepareAuthenticationRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SamlPrepareAuthenticationRequest, SamlPrepareAuthenticationResponse, ErrorResponse> endpoint = (JsonEndpoint<SamlPrepareAuthenticationRequest, SamlPrepareAuthenticationResponse, ErrorResponse>) SamlPrepareAuthenticationRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Creates a SAML authentication request
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SamlPrepareAuthenticationRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-saml-prepare-authentication.html">Documentation
	 *      on elastic.co</a>
	 */

	public final SamlPrepareAuthenticationResponse samlPrepareAuthentication(
			Function<SamlPrepareAuthenticationRequest.Builder, ObjectBuilder<SamlPrepareAuthenticationRequest>> fn)
			throws IOException, ElasticsearchException {
		return samlPrepareAuthentication(fn.apply(new SamlPrepareAuthenticationRequest.Builder()).build());
	}

	/**
	 * Creates a SAML authentication request
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-saml-prepare-authentication.html">Documentation
	 *      on elastic.co</a>
	 */

	public SamlPrepareAuthenticationResponse samlPrepareAuthentication() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new SamlPrepareAuthenticationRequest.Builder().build(),
				SamlPrepareAuthenticationRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: security.saml_service_provider_metadata

	/**
	 * Generates SAML metadata for the Elastic stack SAML 2.0 Service Provider
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-saml-sp-metadata.html">Documentation
	 *      on elastic.co</a>
	 */

	public SamlServiceProviderMetadataResponse samlServiceProviderMetadata(SamlServiceProviderMetadataRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SamlServiceProviderMetadataRequest, SamlServiceProviderMetadataResponse, ErrorResponse> endpoint = (JsonEndpoint<SamlServiceProviderMetadataRequest, SamlServiceProviderMetadataResponse, ErrorResponse>) SamlServiceProviderMetadataRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Generates SAML metadata for the Elastic stack SAML 2.0 Service Provider
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SamlServiceProviderMetadataRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-saml-sp-metadata.html">Documentation
	 *      on elastic.co</a>
	 */

	public final SamlServiceProviderMetadataResponse samlServiceProviderMetadata(
			Function<SamlServiceProviderMetadataRequest.Builder, ObjectBuilder<SamlServiceProviderMetadataRequest>> fn)
			throws IOException, ElasticsearchException {
		return samlServiceProviderMetadata(fn.apply(new SamlServiceProviderMetadataRequest.Builder()).build());
	}

	// ----- Endpoint: security.suggest_user_profiles

	/**
	 * Get suggestions for user profiles that match specified search criteria.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/security-api-suggest-user-profile.html">Documentation
	 *      on elastic.co</a>
	 */

	public SuggestUserProfilesResponse suggestUserProfiles(SuggestUserProfilesRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SuggestUserProfilesRequest, SuggestUserProfilesResponse, ErrorResponse> endpoint = (JsonEndpoint<SuggestUserProfilesRequest, SuggestUserProfilesResponse, ErrorResponse>) SuggestUserProfilesRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get suggestions for user profiles that match specified search criteria.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SuggestUserProfilesRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/security-api-suggest-user-profile.html">Documentation
	 *      on elastic.co</a>
	 */

	public final SuggestUserProfilesResponse suggestUserProfiles(
			Function<SuggestUserProfilesRequest.Builder, ObjectBuilder<SuggestUserProfilesRequest>> fn)
			throws IOException, ElasticsearchException {
		return suggestUserProfiles(fn.apply(new SuggestUserProfilesRequest.Builder()).build());
	}

	/**
	 * Get suggestions for user profiles that match specified search criteria.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/security-api-suggest-user-profile.html">Documentation
	 *      on elastic.co</a>
	 */

	public SuggestUserProfilesResponse suggestUserProfiles() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new SuggestUserProfilesRequest.Builder().build(),
				SuggestUserProfilesRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: security.update_user_profile_data

	/**
	 * Update application specific data for the user profile of the given unique ID.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-update-user-profile-data.html">Documentation
	 *      on elastic.co</a>
	 */

	public UpdateUserProfileDataResponse updateUserProfileData(UpdateUserProfileDataRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdateUserProfileDataRequest, UpdateUserProfileDataResponse, ErrorResponse> endpoint = (JsonEndpoint<UpdateUserProfileDataRequest, UpdateUserProfileDataResponse, ErrorResponse>) UpdateUserProfileDataRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Update application specific data for the user profile of the given unique ID.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateUserProfileDataRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-update-user-profile-data.html">Documentation
	 *      on elastic.co</a>
	 */

	public final UpdateUserProfileDataResponse updateUserProfileData(
			Function<UpdateUserProfileDataRequest.Builder, ObjectBuilder<UpdateUserProfileDataRequest>> fn)
			throws IOException, ElasticsearchException {
		return updateUserProfileData(fn.apply(new UpdateUserProfileDataRequest.Builder()).build());
	}

}
