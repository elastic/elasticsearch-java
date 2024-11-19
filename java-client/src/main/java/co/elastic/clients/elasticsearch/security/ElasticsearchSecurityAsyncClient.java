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

import co.elastic.clients.ApiClient;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.JsonEndpoint;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.transport.endpoints.BooleanResponse;
import co.elastic.clients.util.ObjectBuilder;
import java.util.concurrent.CompletableFuture;
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

	// ----- Endpoint: security.activate_user_profile

	/**
	 * Activate a user profile.
	 * <p>
	 * Create or update a user profile on behalf of another user.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-activate-user-profile.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ActivateUserProfileResponse> activateUserProfile(ActivateUserProfileRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ActivateUserProfileRequest, ActivateUserProfileResponse, ErrorResponse> endpoint = (JsonEndpoint<ActivateUserProfileRequest, ActivateUserProfileResponse, ErrorResponse>) ActivateUserProfileRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Activate a user profile.
	 * <p>
	 * Create or update a user profile on behalf of another user.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ActivateUserProfileRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-activate-user-profile.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ActivateUserProfileResponse> activateUserProfile(
			Function<ActivateUserProfileRequest.Builder, ObjectBuilder<ActivateUserProfileRequest>> fn) {
		return activateUserProfile(fn.apply(new ActivateUserProfileRequest.Builder()).build());
	}

	// ----- Endpoint: security.authenticate

	/**
	 * Authenticate a user.
	 * <p>
	 * Authenticates a user and returns information about the authenticated user.
	 * Include the user information in a
	 * <a href="https://en.wikipedia.org/wiki/Basic_access_authentication">basic
	 * auth header</a>. A successful call returns a JSON structure that shows user
	 * information such as their username, the roles that are assigned to the user,
	 * any assigned metadata, and information about the realms that authenticated
	 * and authorized the user. If the user cannot be authenticated, this API
	 * returns a 401 status code.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-authenticate.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<AuthenticateResponse> authenticate() {
		return this.transport.performRequestAsync(AuthenticateRequest._INSTANCE, AuthenticateRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: security.bulk_delete_role

	/**
	 * Bulk delete roles.
	 * <p>
	 * The role management APIs are generally the preferred way to manage roles,
	 * rather than using file-based role management. The bulk delete roles API
	 * cannot delete roles that are defined in roles files.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-bulk-delete-role.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<BulkDeleteRoleResponse> bulkDeleteRole(BulkDeleteRoleRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<BulkDeleteRoleRequest, BulkDeleteRoleResponse, ErrorResponse> endpoint = (JsonEndpoint<BulkDeleteRoleRequest, BulkDeleteRoleResponse, ErrorResponse>) BulkDeleteRoleRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Bulk delete roles.
	 * <p>
	 * The role management APIs are generally the preferred way to manage roles,
	 * rather than using file-based role management. The bulk delete roles API
	 * cannot delete roles that are defined in roles files.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link BulkDeleteRoleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-bulk-delete-role.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<BulkDeleteRoleResponse> bulkDeleteRole(
			Function<BulkDeleteRoleRequest.Builder, ObjectBuilder<BulkDeleteRoleRequest>> fn) {
		return bulkDeleteRole(fn.apply(new BulkDeleteRoleRequest.Builder()).build());
	}

	// ----- Endpoint: security.bulk_put_role

	/**
	 * Bulk create or update roles.
	 * <p>
	 * The role management APIs are generally the preferred way to manage roles,
	 * rather than using file-based role management. The bulk create or update roles
	 * API cannot update roles that are defined in roles files.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-bulk-put-role.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<BulkPutRoleResponse> bulkPutRole(BulkPutRoleRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<BulkPutRoleRequest, BulkPutRoleResponse, ErrorResponse> endpoint = (JsonEndpoint<BulkPutRoleRequest, BulkPutRoleResponse, ErrorResponse>) BulkPutRoleRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Bulk create or update roles.
	 * <p>
	 * The role management APIs are generally the preferred way to manage roles,
	 * rather than using file-based role management. The bulk create or update roles
	 * API cannot update roles that are defined in roles files.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link BulkPutRoleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-bulk-put-role.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<BulkPutRoleResponse> bulkPutRole(
			Function<BulkPutRoleRequest.Builder, ObjectBuilder<BulkPutRoleRequest>> fn) {
		return bulkPutRole(fn.apply(new BulkPutRoleRequest.Builder()).build());
	}

	// ----- Endpoint: security.change_password

	/**
	 * Change passwords.
	 * <p>
	 * Change the passwords of users in the native realm and built-in users.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-change-password.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ChangePasswordResponse> changePassword(ChangePasswordRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ChangePasswordRequest, ChangePasswordResponse, ErrorResponse> endpoint = (JsonEndpoint<ChangePasswordRequest, ChangePasswordResponse, ErrorResponse>) ChangePasswordRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Change passwords.
	 * <p>
	 * Change the passwords of users in the native realm and built-in users.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ChangePasswordRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-change-password.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ChangePasswordResponse> changePassword(
			Function<ChangePasswordRequest.Builder, ObjectBuilder<ChangePasswordRequest>> fn) {
		return changePassword(fn.apply(new ChangePasswordRequest.Builder()).build());
	}

	/**
	 * Change passwords.
	 * <p>
	 * Change the passwords of users in the native realm and built-in users.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-change-password.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ChangePasswordResponse> changePassword() {
		return this.transport.performRequestAsync(new ChangePasswordRequest.Builder().build(),
				ChangePasswordRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: security.clear_api_key_cache

	/**
	 * Clear the API key cache.
	 * <p>
	 * Evict a subset of all entries from the API key cache. The cache is also
	 * automatically cleared on state changes of the security index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-clear-api-key-cache.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ClearApiKeyCacheResponse> clearApiKeyCache(ClearApiKeyCacheRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ClearApiKeyCacheRequest, ClearApiKeyCacheResponse, ErrorResponse> endpoint = (JsonEndpoint<ClearApiKeyCacheRequest, ClearApiKeyCacheResponse, ErrorResponse>) ClearApiKeyCacheRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Clear the API key cache.
	 * <p>
	 * Evict a subset of all entries from the API key cache. The cache is also
	 * automatically cleared on state changes of the security index.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ClearApiKeyCacheRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-clear-api-key-cache.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ClearApiKeyCacheResponse> clearApiKeyCache(
			Function<ClearApiKeyCacheRequest.Builder, ObjectBuilder<ClearApiKeyCacheRequest>> fn) {
		return clearApiKeyCache(fn.apply(new ClearApiKeyCacheRequest.Builder()).build());
	}

	// ----- Endpoint: security.clear_cached_privileges

	/**
	 * Clear the privileges cache.
	 * <p>
	 * Evict privileges from the native application privilege cache. The cache is
	 * also automatically cleared for applications that have their privileges
	 * updated.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-clear-privilege-cache.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ClearCachedPrivilegesResponse> clearCachedPrivileges(
			ClearCachedPrivilegesRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ClearCachedPrivilegesRequest, ClearCachedPrivilegesResponse, ErrorResponse> endpoint = (JsonEndpoint<ClearCachedPrivilegesRequest, ClearCachedPrivilegesResponse, ErrorResponse>) ClearCachedPrivilegesRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Clear the privileges cache.
	 * <p>
	 * Evict privileges from the native application privilege cache. The cache is
	 * also automatically cleared for applications that have their privileges
	 * updated.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ClearCachedPrivilegesRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-clear-privilege-cache.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ClearCachedPrivilegesResponse> clearCachedPrivileges(
			Function<ClearCachedPrivilegesRequest.Builder, ObjectBuilder<ClearCachedPrivilegesRequest>> fn) {
		return clearCachedPrivileges(fn.apply(new ClearCachedPrivilegesRequest.Builder()).build());
	}

	// ----- Endpoint: security.clear_cached_realms

	/**
	 * Clear the user cache.
	 * <p>
	 * Evict users from the user cache. You can completely clear the cache or evict
	 * specific users.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-clear-cache.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ClearCachedRealmsResponse> clearCachedRealms(ClearCachedRealmsRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ClearCachedRealmsRequest, ClearCachedRealmsResponse, ErrorResponse> endpoint = (JsonEndpoint<ClearCachedRealmsRequest, ClearCachedRealmsResponse, ErrorResponse>) ClearCachedRealmsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Clear the user cache.
	 * <p>
	 * Evict users from the user cache. You can completely clear the cache or evict
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
			Function<ClearCachedRealmsRequest.Builder, ObjectBuilder<ClearCachedRealmsRequest>> fn) {
		return clearCachedRealms(fn.apply(new ClearCachedRealmsRequest.Builder()).build());
	}

	// ----- Endpoint: security.clear_cached_roles

	/**
	 * Clear the roles cache.
	 * <p>
	 * Evict roles from the native role cache.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-clear-role-cache.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ClearCachedRolesResponse> clearCachedRoles(ClearCachedRolesRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ClearCachedRolesRequest, ClearCachedRolesResponse, ErrorResponse> endpoint = (JsonEndpoint<ClearCachedRolesRequest, ClearCachedRolesResponse, ErrorResponse>) ClearCachedRolesRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Clear the roles cache.
	 * <p>
	 * Evict roles from the native role cache.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ClearCachedRolesRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-clear-role-cache.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ClearCachedRolesResponse> clearCachedRoles(
			Function<ClearCachedRolesRequest.Builder, ObjectBuilder<ClearCachedRolesRequest>> fn) {
		return clearCachedRoles(fn.apply(new ClearCachedRolesRequest.Builder()).build());
	}

	// ----- Endpoint: security.clear_cached_service_tokens

	/**
	 * Clear service account token caches.
	 * <p>
	 * Evict a subset of all entries from the service account token caches.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-clear-service-token-caches.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ClearCachedServiceTokensResponse> clearCachedServiceTokens(
			ClearCachedServiceTokensRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ClearCachedServiceTokensRequest, ClearCachedServiceTokensResponse, ErrorResponse> endpoint = (JsonEndpoint<ClearCachedServiceTokensRequest, ClearCachedServiceTokensResponse, ErrorResponse>) ClearCachedServiceTokensRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Clear service account token caches.
	 * <p>
	 * Evict a subset of all entries from the service account token caches.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ClearCachedServiceTokensRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-clear-service-token-caches.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ClearCachedServiceTokensResponse> clearCachedServiceTokens(
			Function<ClearCachedServiceTokensRequest.Builder, ObjectBuilder<ClearCachedServiceTokensRequest>> fn) {
		return clearCachedServiceTokens(fn.apply(new ClearCachedServiceTokensRequest.Builder()).build());
	}

	// ----- Endpoint: security.create_api_key

	/**
	 * Create an API key.
	 * <p>
	 * Create an API key for access without requiring basic authentication. A
	 * successful request returns a JSON structure that contains the API key, its
	 * unique id, and its name. If applicable, it also returns expiration
	 * information for the API key in milliseconds. NOTE: By default, API keys never
	 * expire. You can specify expiration information when you create the API keys.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-create-api-key.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<CreateApiKeyResponse> createApiKey(CreateApiKeyRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<CreateApiKeyRequest, CreateApiKeyResponse, ErrorResponse> endpoint = (JsonEndpoint<CreateApiKeyRequest, CreateApiKeyResponse, ErrorResponse>) CreateApiKeyRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Create an API key.
	 * <p>
	 * Create an API key for access without requiring basic authentication. A
	 * successful request returns a JSON structure that contains the API key, its
	 * unique id, and its name. If applicable, it also returns expiration
	 * information for the API key in milliseconds. NOTE: By default, API keys never
	 * expire. You can specify expiration information when you create the API keys.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CreateApiKeyRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-create-api-key.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<CreateApiKeyResponse> createApiKey(
			Function<CreateApiKeyRequest.Builder, ObjectBuilder<CreateApiKeyRequest>> fn) {
		return createApiKey(fn.apply(new CreateApiKeyRequest.Builder()).build());
	}

	/**
	 * Create an API key.
	 * <p>
	 * Create an API key for access without requiring basic authentication. A
	 * successful request returns a JSON structure that contains the API key, its
	 * unique id, and its name. If applicable, it also returns expiration
	 * information for the API key in milliseconds. NOTE: By default, API keys never
	 * expire. You can specify expiration information when you create the API keys.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-create-api-key.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<CreateApiKeyResponse> createApiKey() {
		return this.transport.performRequestAsync(new CreateApiKeyRequest.Builder().build(),
				CreateApiKeyRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: security.create_cross_cluster_api_key

	/**
	 * Create a cross-cluster API key.
	 * <p>
	 * Create an API key of the <code>cross_cluster</code> type for the API key
	 * based remote cluster access. A <code>cross_cluster</code> API key cannot be
	 * used to authenticate through the REST interface.
	 * <p>
	 * IMPORTANT: To authenticate this request you must use a credential that is not
	 * an API key. Even if you use an API key that has the required privilege, the
	 * API returns an error.
	 * <p>
	 * Cross-cluster API keys are created by the Elasticsearch API key service,
	 * which is automatically enabled.
	 * <p>
	 * NOTE: Unlike REST API keys, a cross-cluster API key does not capture
	 * permissions of the authenticated user. The API key’s effective permission is
	 * exactly as specified with the <code>access</code> property.
	 * <p>
	 * A successful request returns a JSON structure that contains the API key, its
	 * unique ID, and its name. If applicable, it also returns expiration
	 * information for the API key in milliseconds.
	 * <p>
	 * By default, API keys never expire. You can specify expiration information
	 * when you create the API keys.
	 * <p>
	 * Cross-cluster API keys can only be updated with the update cross-cluster API
	 * key API. Attempting to update them with the update REST API key API or the
	 * bulk update REST API keys API will result in an error.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-create-cross-cluster-api-key.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<CreateCrossClusterApiKeyResponse> createCrossClusterApiKey(
			CreateCrossClusterApiKeyRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<CreateCrossClusterApiKeyRequest, CreateCrossClusterApiKeyResponse, ErrorResponse> endpoint = (JsonEndpoint<CreateCrossClusterApiKeyRequest, CreateCrossClusterApiKeyResponse, ErrorResponse>) CreateCrossClusterApiKeyRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Create a cross-cluster API key.
	 * <p>
	 * Create an API key of the <code>cross_cluster</code> type for the API key
	 * based remote cluster access. A <code>cross_cluster</code> API key cannot be
	 * used to authenticate through the REST interface.
	 * <p>
	 * IMPORTANT: To authenticate this request you must use a credential that is not
	 * an API key. Even if you use an API key that has the required privilege, the
	 * API returns an error.
	 * <p>
	 * Cross-cluster API keys are created by the Elasticsearch API key service,
	 * which is automatically enabled.
	 * <p>
	 * NOTE: Unlike REST API keys, a cross-cluster API key does not capture
	 * permissions of the authenticated user. The API key’s effective permission is
	 * exactly as specified with the <code>access</code> property.
	 * <p>
	 * A successful request returns a JSON structure that contains the API key, its
	 * unique ID, and its name. If applicable, it also returns expiration
	 * information for the API key in milliseconds.
	 * <p>
	 * By default, API keys never expire. You can specify expiration information
	 * when you create the API keys.
	 * <p>
	 * Cross-cluster API keys can only be updated with the update cross-cluster API
	 * key API. Attempting to update them with the update REST API key API or the
	 * bulk update REST API keys API will result in an error.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CreateCrossClusterApiKeyRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-create-cross-cluster-api-key.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<CreateCrossClusterApiKeyResponse> createCrossClusterApiKey(
			Function<CreateCrossClusterApiKeyRequest.Builder, ObjectBuilder<CreateCrossClusterApiKeyRequest>> fn) {
		return createCrossClusterApiKey(fn.apply(new CreateCrossClusterApiKeyRequest.Builder()).build());
	}

	// ----- Endpoint: security.create_service_token

	/**
	 * Create a service account token.
	 * <p>
	 * Create a service accounts token for access without requiring basic
	 * authentication.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-create-service-token.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<CreateServiceTokenResponse> createServiceToken(CreateServiceTokenRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<CreateServiceTokenRequest, CreateServiceTokenResponse, ErrorResponse> endpoint = (JsonEndpoint<CreateServiceTokenRequest, CreateServiceTokenResponse, ErrorResponse>) CreateServiceTokenRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Create a service account token.
	 * <p>
	 * Create a service accounts token for access without requiring basic
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
			Function<CreateServiceTokenRequest.Builder, ObjectBuilder<CreateServiceTokenRequest>> fn) {
		return createServiceToken(fn.apply(new CreateServiceTokenRequest.Builder()).build());
	}

	// ----- Endpoint: security.delete_privileges

	/**
	 * Delete application privileges.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-delete-privilege.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeletePrivilegesResponse> deletePrivileges(DeletePrivilegesRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeletePrivilegesRequest, DeletePrivilegesResponse, ErrorResponse> endpoint = (JsonEndpoint<DeletePrivilegesRequest, DeletePrivilegesResponse, ErrorResponse>) DeletePrivilegesRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete application privileges.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeletePrivilegesRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-delete-privilege.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeletePrivilegesResponse> deletePrivileges(
			Function<DeletePrivilegesRequest.Builder, ObjectBuilder<DeletePrivilegesRequest>> fn) {
		return deletePrivileges(fn.apply(new DeletePrivilegesRequest.Builder()).build());
	}

	// ----- Endpoint: security.delete_role

	/**
	 * Delete roles.
	 * <p>
	 * Delete roles in the native realm.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-delete-role.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteRoleResponse> deleteRole(DeleteRoleRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteRoleRequest, DeleteRoleResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteRoleRequest, DeleteRoleResponse, ErrorResponse>) DeleteRoleRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete roles.
	 * <p>
	 * Delete roles in the native realm.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteRoleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-delete-role.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteRoleResponse> deleteRole(
			Function<DeleteRoleRequest.Builder, ObjectBuilder<DeleteRoleRequest>> fn) {
		return deleteRole(fn.apply(new DeleteRoleRequest.Builder()).build());
	}

	// ----- Endpoint: security.delete_role_mapping

	/**
	 * Delete role mappings.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-delete-role-mapping.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteRoleMappingResponse> deleteRoleMapping(DeleteRoleMappingRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteRoleMappingRequest, DeleteRoleMappingResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteRoleMappingRequest, DeleteRoleMappingResponse, ErrorResponse>) DeleteRoleMappingRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete role mappings.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteRoleMappingRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-delete-role-mapping.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteRoleMappingResponse> deleteRoleMapping(
			Function<DeleteRoleMappingRequest.Builder, ObjectBuilder<DeleteRoleMappingRequest>> fn) {
		return deleteRoleMapping(fn.apply(new DeleteRoleMappingRequest.Builder()).build());
	}

	// ----- Endpoint: security.delete_service_token

	/**
	 * Delete service account tokens.
	 * <p>
	 * Delete service account tokens for a service in a specified namespace.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-delete-service-token.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteServiceTokenResponse> deleteServiceToken(DeleteServiceTokenRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteServiceTokenRequest, DeleteServiceTokenResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteServiceTokenRequest, DeleteServiceTokenResponse, ErrorResponse>) DeleteServiceTokenRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete service account tokens.
	 * <p>
	 * Delete service account tokens for a service in a specified namespace.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteServiceTokenRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-delete-service-token.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteServiceTokenResponse> deleteServiceToken(
			Function<DeleteServiceTokenRequest.Builder, ObjectBuilder<DeleteServiceTokenRequest>> fn) {
		return deleteServiceToken(fn.apply(new DeleteServiceTokenRequest.Builder()).build());
	}

	// ----- Endpoint: security.delete_user

	/**
	 * Delete users.
	 * <p>
	 * Delete users from the native realm.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-delete-user.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteUserResponse> deleteUser(DeleteUserRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteUserRequest, DeleteUserResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteUserRequest, DeleteUserResponse, ErrorResponse>) DeleteUserRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete users.
	 * <p>
	 * Delete users from the native realm.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteUserRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-delete-user.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteUserResponse> deleteUser(
			Function<DeleteUserRequest.Builder, ObjectBuilder<DeleteUserRequest>> fn) {
		return deleteUser(fn.apply(new DeleteUserRequest.Builder()).build());
	}

	// ----- Endpoint: security.disable_user

	/**
	 * Disable users.
	 * <p>
	 * Disable users in the native realm.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-disable-user.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DisableUserResponse> disableUser(DisableUserRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DisableUserRequest, DisableUserResponse, ErrorResponse> endpoint = (JsonEndpoint<DisableUserRequest, DisableUserResponse, ErrorResponse>) DisableUserRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Disable users.
	 * <p>
	 * Disable users in the native realm.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DisableUserRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-disable-user.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DisableUserResponse> disableUser(
			Function<DisableUserRequest.Builder, ObjectBuilder<DisableUserRequest>> fn) {
		return disableUser(fn.apply(new DisableUserRequest.Builder()).build());
	}

	// ----- Endpoint: security.disable_user_profile

	/**
	 * Disable a user profile.
	 * <p>
	 * Disable user profiles so that they are not visible in user profile searches.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/security-api-disable-user-profile.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DisableUserProfileResponse> disableUserProfile(DisableUserProfileRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DisableUserProfileRequest, DisableUserProfileResponse, ErrorResponse> endpoint = (JsonEndpoint<DisableUserProfileRequest, DisableUserProfileResponse, ErrorResponse>) DisableUserProfileRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Disable a user profile.
	 * <p>
	 * Disable user profiles so that they are not visible in user profile searches.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DisableUserProfileRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/security-api-disable-user-profile.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DisableUserProfileResponse> disableUserProfile(
			Function<DisableUserProfileRequest.Builder, ObjectBuilder<DisableUserProfileRequest>> fn) {
		return disableUserProfile(fn.apply(new DisableUserProfileRequest.Builder()).build());
	}

	// ----- Endpoint: security.enable_user

	/**
	 * Enable users.
	 * <p>
	 * Enable users in the native realm.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-enable-user.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<EnableUserResponse> enableUser(EnableUserRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<EnableUserRequest, EnableUserResponse, ErrorResponse> endpoint = (JsonEndpoint<EnableUserRequest, EnableUserResponse, ErrorResponse>) EnableUserRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Enable users.
	 * <p>
	 * Enable users in the native realm.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link EnableUserRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-enable-user.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<EnableUserResponse> enableUser(
			Function<EnableUserRequest.Builder, ObjectBuilder<EnableUserRequest>> fn) {
		return enableUser(fn.apply(new EnableUserRequest.Builder()).build());
	}

	// ----- Endpoint: security.enable_user_profile

	/**
	 * Enable a user profile.
	 * <p>
	 * Enable user profiles to make them visible in user profile searches.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/security-api-enable-user-profile.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<EnableUserProfileResponse> enableUserProfile(EnableUserProfileRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<EnableUserProfileRequest, EnableUserProfileResponse, ErrorResponse> endpoint = (JsonEndpoint<EnableUserProfileRequest, EnableUserProfileResponse, ErrorResponse>) EnableUserProfileRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Enable a user profile.
	 * <p>
	 * Enable user profiles to make them visible in user profile searches.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link EnableUserProfileRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/security-api-enable-user-profile.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<EnableUserProfileResponse> enableUserProfile(
			Function<EnableUserProfileRequest.Builder, ObjectBuilder<EnableUserProfileRequest>> fn) {
		return enableUserProfile(fn.apply(new EnableUserProfileRequest.Builder()).build());
	}

	// ----- Endpoint: security.enroll_kibana

	/**
	 * Enroll Kibana.
	 * <p>
	 * Enable a Kibana instance to configure itself for communication with a secured
	 * Elasticsearch cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/security-api-kibana-enrollment.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<EnrollKibanaResponse> enrollKibana() {
		return this.transport.performRequestAsync(EnrollKibanaRequest._INSTANCE, EnrollKibanaRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: security.enroll_node

	/**
	 * Enroll a node.
	 * <p>
	 * Enroll a new node to allow it to join an existing cluster with security
	 * features enabled.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/security-api-node-enrollment.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<EnrollNodeResponse> enrollNode() {
		return this.transport.performRequestAsync(EnrollNodeRequest._INSTANCE, EnrollNodeRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: security.get_api_key

	/**
	 * Get API key information.
	 * <p>
	 * Retrieves information for one or more API keys. NOTE: If you have only the
	 * <code>manage_own_api_key</code> privilege, this API returns only the API keys
	 * that you own. If you have <code>read_security</code>,
	 * <code>manage_api_key</code> or greater privileges (including
	 * <code>manage_security</code>), this API returns all API keys regardless of
	 * ownership.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-api-key.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetApiKeyResponse> getApiKey(GetApiKeyRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetApiKeyRequest, GetApiKeyResponse, ErrorResponse> endpoint = (JsonEndpoint<GetApiKeyRequest, GetApiKeyResponse, ErrorResponse>) GetApiKeyRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get API key information.
	 * <p>
	 * Retrieves information for one or more API keys. NOTE: If you have only the
	 * <code>manage_own_api_key</code> privilege, this API returns only the API keys
	 * that you own. If you have <code>read_security</code>,
	 * <code>manage_api_key</code> or greater privileges (including
	 * <code>manage_security</code>), this API returns all API keys regardless of
	 * ownership.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetApiKeyRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-api-key.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetApiKeyResponse> getApiKey(
			Function<GetApiKeyRequest.Builder, ObjectBuilder<GetApiKeyRequest>> fn) {
		return getApiKey(fn.apply(new GetApiKeyRequest.Builder()).build());
	}

	/**
	 * Get API key information.
	 * <p>
	 * Retrieves information for one or more API keys. NOTE: If you have only the
	 * <code>manage_own_api_key</code> privilege, this API returns only the API keys
	 * that you own. If you have <code>read_security</code>,
	 * <code>manage_api_key</code> or greater privileges (including
	 * <code>manage_security</code>), this API returns all API keys regardless of
	 * ownership.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-api-key.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetApiKeyResponse> getApiKey() {
		return this.transport.performRequestAsync(new GetApiKeyRequest.Builder().build(), GetApiKeyRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: security.get_builtin_privileges

	/**
	 * Get builtin privileges.
	 * <p>
	 * Get the list of cluster privileges and index privileges that are available in
	 * this version of Elasticsearch.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-builtin-privileges.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<GetBuiltinPrivilegesResponse> getBuiltinPrivileges() {
		return this.transport.performRequestAsync(GetBuiltinPrivilegesRequest._INSTANCE,
				GetBuiltinPrivilegesRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: security.get_privileges

	/**
	 * Get application privileges.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-privileges.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetPrivilegesResponse> getPrivileges(GetPrivilegesRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetPrivilegesRequest, GetPrivilegesResponse, ErrorResponse> endpoint = (JsonEndpoint<GetPrivilegesRequest, GetPrivilegesResponse, ErrorResponse>) GetPrivilegesRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get application privileges.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetPrivilegesRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-privileges.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetPrivilegesResponse> getPrivileges(
			Function<GetPrivilegesRequest.Builder, ObjectBuilder<GetPrivilegesRequest>> fn) {
		return getPrivileges(fn.apply(new GetPrivilegesRequest.Builder()).build());
	}

	/**
	 * Get application privileges.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-privileges.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetPrivilegesResponse> getPrivileges() {
		return this.transport.performRequestAsync(new GetPrivilegesRequest.Builder().build(),
				GetPrivilegesRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: security.get_role

	/**
	 * Get roles.
	 * <p>
	 * Get roles in the native realm. The role management APIs are generally the
	 * preferred way to manage roles, rather than using file-based role management.
	 * The get roles API cannot retrieve roles that are defined in roles files.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-role.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetRoleResponse> getRole(GetRoleRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetRoleRequest, GetRoleResponse, ErrorResponse> endpoint = (JsonEndpoint<GetRoleRequest, GetRoleResponse, ErrorResponse>) GetRoleRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get roles.
	 * <p>
	 * Get roles in the native realm. The role management APIs are generally the
	 * preferred way to manage roles, rather than using file-based role management.
	 * The get roles API cannot retrieve roles that are defined in roles files.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetRoleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-role.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetRoleResponse> getRole(
			Function<GetRoleRequest.Builder, ObjectBuilder<GetRoleRequest>> fn) {
		return getRole(fn.apply(new GetRoleRequest.Builder()).build());
	}

	/**
	 * Get roles.
	 * <p>
	 * Get roles in the native realm. The role management APIs are generally the
	 * preferred way to manage roles, rather than using file-based role management.
	 * The get roles API cannot retrieve roles that are defined in roles files.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-role.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetRoleResponse> getRole() {
		return this.transport.performRequestAsync(new GetRoleRequest.Builder().build(), GetRoleRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: security.get_role_mapping

	/**
	 * Get role mappings.
	 * <p>
	 * Role mappings define which roles are assigned to each user. The role mapping
	 * APIs are generally the preferred way to manage role mappings rather than
	 * using role mapping files. The get role mappings API cannot retrieve role
	 * mappings that are defined in role mapping files.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-role-mapping.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetRoleMappingResponse> getRoleMapping(GetRoleMappingRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetRoleMappingRequest, GetRoleMappingResponse, ErrorResponse> endpoint = (JsonEndpoint<GetRoleMappingRequest, GetRoleMappingResponse, ErrorResponse>) GetRoleMappingRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get role mappings.
	 * <p>
	 * Role mappings define which roles are assigned to each user. The role mapping
	 * APIs are generally the preferred way to manage role mappings rather than
	 * using role mapping files. The get role mappings API cannot retrieve role
	 * mappings that are defined in role mapping files.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetRoleMappingRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-role-mapping.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetRoleMappingResponse> getRoleMapping(
			Function<GetRoleMappingRequest.Builder, ObjectBuilder<GetRoleMappingRequest>> fn) {
		return getRoleMapping(fn.apply(new GetRoleMappingRequest.Builder()).build());
	}

	/**
	 * Get role mappings.
	 * <p>
	 * Role mappings define which roles are assigned to each user. The role mapping
	 * APIs are generally the preferred way to manage role mappings rather than
	 * using role mapping files. The get role mappings API cannot retrieve role
	 * mappings that are defined in role mapping files.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-role-mapping.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetRoleMappingResponse> getRoleMapping() {
		return this.transport.performRequestAsync(new GetRoleMappingRequest.Builder().build(),
				GetRoleMappingRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: security.get_service_accounts

	/**
	 * Get service accounts.
	 * <p>
	 * Get a list of service accounts that match the provided path parameters.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-service-accounts.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetServiceAccountsResponse> getServiceAccounts(GetServiceAccountsRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetServiceAccountsRequest, GetServiceAccountsResponse, ErrorResponse> endpoint = (JsonEndpoint<GetServiceAccountsRequest, GetServiceAccountsResponse, ErrorResponse>) GetServiceAccountsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get service accounts.
	 * <p>
	 * Get a list of service accounts that match the provided path parameters.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetServiceAccountsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-service-accounts.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetServiceAccountsResponse> getServiceAccounts(
			Function<GetServiceAccountsRequest.Builder, ObjectBuilder<GetServiceAccountsRequest>> fn) {
		return getServiceAccounts(fn.apply(new GetServiceAccountsRequest.Builder()).build());
	}

	/**
	 * Get service accounts.
	 * <p>
	 * Get a list of service accounts that match the provided path parameters.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-service-accounts.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetServiceAccountsResponse> getServiceAccounts() {
		return this.transport.performRequestAsync(new GetServiceAccountsRequest.Builder().build(),
				GetServiceAccountsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: security.get_service_credentials

	/**
	 * Get service account credentials.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-service-credentials.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetServiceCredentialsResponse> getServiceCredentials(
			GetServiceCredentialsRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetServiceCredentialsRequest, GetServiceCredentialsResponse, ErrorResponse> endpoint = (JsonEndpoint<GetServiceCredentialsRequest, GetServiceCredentialsResponse, ErrorResponse>) GetServiceCredentialsRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get service account credentials.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetServiceCredentialsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-service-credentials.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetServiceCredentialsResponse> getServiceCredentials(
			Function<GetServiceCredentialsRequest.Builder, ObjectBuilder<GetServiceCredentialsRequest>> fn) {
		return getServiceCredentials(fn.apply(new GetServiceCredentialsRequest.Builder()).build());
	}

	// ----- Endpoint: security.get_token

	/**
	 * Get a token.
	 * <p>
	 * Create a bearer token for access without requiring basic authentication.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-token.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetTokenResponse> getToken(GetTokenRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetTokenRequest, GetTokenResponse, ErrorResponse> endpoint = (JsonEndpoint<GetTokenRequest, GetTokenResponse, ErrorResponse>) GetTokenRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get a token.
	 * <p>
	 * Create a bearer token for access without requiring basic authentication.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetTokenRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-token.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetTokenResponse> getToken(
			Function<GetTokenRequest.Builder, ObjectBuilder<GetTokenRequest>> fn) {
		return getToken(fn.apply(new GetTokenRequest.Builder()).build());
	}

	/**
	 * Get a token.
	 * <p>
	 * Create a bearer token for access without requiring basic authentication.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-token.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetTokenResponse> getToken() {
		return this.transport.performRequestAsync(new GetTokenRequest.Builder().build(), GetTokenRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: security.get_user

	/**
	 * Get users.
	 * <p>
	 * Get information about users in the native realm and built-in users.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-user.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetUserResponse> getUser(GetUserRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetUserRequest, GetUserResponse, ErrorResponse> endpoint = (JsonEndpoint<GetUserRequest, GetUserResponse, ErrorResponse>) GetUserRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get users.
	 * <p>
	 * Get information about users in the native realm and built-in users.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetUserRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-user.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetUserResponse> getUser(
			Function<GetUserRequest.Builder, ObjectBuilder<GetUserRequest>> fn) {
		return getUser(fn.apply(new GetUserRequest.Builder()).build());
	}

	/**
	 * Get users.
	 * <p>
	 * Get information about users in the native realm and built-in users.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-user.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetUserResponse> getUser() {
		return this.transport.performRequestAsync(new GetUserRequest.Builder().build(), GetUserRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: security.get_user_privileges

	/**
	 * Get user privileges.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-user-privileges.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetUserPrivilegesResponse> getUserPrivileges(GetUserPrivilegesRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetUserPrivilegesRequest, GetUserPrivilegesResponse, ErrorResponse> endpoint = (JsonEndpoint<GetUserPrivilegesRequest, GetUserPrivilegesResponse, ErrorResponse>) GetUserPrivilegesRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get user privileges.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetUserPrivilegesRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-user-privileges.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetUserPrivilegesResponse> getUserPrivileges(
			Function<GetUserPrivilegesRequest.Builder, ObjectBuilder<GetUserPrivilegesRequest>> fn) {
		return getUserPrivileges(fn.apply(new GetUserPrivilegesRequest.Builder()).build());
	}

	/**
	 * Get user privileges.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-user-privileges.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetUserPrivilegesResponse> getUserPrivileges() {
		return this.transport.performRequestAsync(new GetUserPrivilegesRequest.Builder().build(),
				GetUserPrivilegesRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: security.get_user_profile

	/**
	 * Get a user profile.
	 * <p>
	 * Get a user's profile using the unique profile ID.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-user-profile.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetUserProfileResponse> getUserProfile(GetUserProfileRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetUserProfileRequest, GetUserProfileResponse, ErrorResponse> endpoint = (JsonEndpoint<GetUserProfileRequest, GetUserProfileResponse, ErrorResponse>) GetUserProfileRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Get a user profile.
	 * <p>
	 * Get a user's profile using the unique profile ID.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetUserProfileRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-user-profile.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetUserProfileResponse> getUserProfile(
			Function<GetUserProfileRequest.Builder, ObjectBuilder<GetUserProfileRequest>> fn) {
		return getUserProfile(fn.apply(new GetUserProfileRequest.Builder()).build());
	}

	// ----- Endpoint: security.grant_api_key

	/**
	 * Grant an API key.
	 * <p>
	 * Create an API key on behalf of another user. This API is similar to the
	 * create API keys API, however it creates the API key for a user that is
	 * different than the user that runs the API. The caller must have
	 * authentication credentials (either an access token, or a username and
	 * password) for the user on whose behalf the API key will be created. It is not
	 * possible to use this API to create an API key without that user’s
	 * credentials. The user, for whom the authentication credentials is provided,
	 * can optionally &quot;run as&quot; (impersonate) another user. In this case,
	 * the API key will be created on behalf of the impersonated user.
	 * <p>
	 * This API is intended be used by applications that need to create and manage
	 * API keys for end users, but cannot guarantee that those users have permission
	 * to create API keys on their own behalf.
	 * <p>
	 * A successful grant API key API call returns a JSON structure that contains
	 * the API key, its unique id, and its name. If applicable, it also returns
	 * expiration information for the API key in milliseconds.
	 * <p>
	 * By default, API keys never expire. You can specify expiration information
	 * when you create the API keys.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-grant-api-key.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GrantApiKeyResponse> grantApiKey(GrantApiKeyRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GrantApiKeyRequest, GrantApiKeyResponse, ErrorResponse> endpoint = (JsonEndpoint<GrantApiKeyRequest, GrantApiKeyResponse, ErrorResponse>) GrantApiKeyRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Grant an API key.
	 * <p>
	 * Create an API key on behalf of another user. This API is similar to the
	 * create API keys API, however it creates the API key for a user that is
	 * different than the user that runs the API. The caller must have
	 * authentication credentials (either an access token, or a username and
	 * password) for the user on whose behalf the API key will be created. It is not
	 * possible to use this API to create an API key without that user’s
	 * credentials. The user, for whom the authentication credentials is provided,
	 * can optionally &quot;run as&quot; (impersonate) another user. In this case,
	 * the API key will be created on behalf of the impersonated user.
	 * <p>
	 * This API is intended be used by applications that need to create and manage
	 * API keys for end users, but cannot guarantee that those users have permission
	 * to create API keys on their own behalf.
	 * <p>
	 * A successful grant API key API call returns a JSON structure that contains
	 * the API key, its unique id, and its name. If applicable, it also returns
	 * expiration information for the API key in milliseconds.
	 * <p>
	 * By default, API keys never expire. You can specify expiration information
	 * when you create the API keys.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GrantApiKeyRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-grant-api-key.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GrantApiKeyResponse> grantApiKey(
			Function<GrantApiKeyRequest.Builder, ObjectBuilder<GrantApiKeyRequest>> fn) {
		return grantApiKey(fn.apply(new GrantApiKeyRequest.Builder()).build());
	}

	// ----- Endpoint: security.has_privileges

	/**
	 * Check user privileges.
	 * <p>
	 * Determine whether the specified user has a specified list of privileges.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-has-privileges.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<HasPrivilegesResponse> hasPrivileges(HasPrivilegesRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<HasPrivilegesRequest, HasPrivilegesResponse, ErrorResponse> endpoint = (JsonEndpoint<HasPrivilegesRequest, HasPrivilegesResponse, ErrorResponse>) HasPrivilegesRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Check user privileges.
	 * <p>
	 * Determine whether the specified user has a specified list of privileges.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link HasPrivilegesRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-has-privileges.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<HasPrivilegesResponse> hasPrivileges(
			Function<HasPrivilegesRequest.Builder, ObjectBuilder<HasPrivilegesRequest>> fn) {
		return hasPrivileges(fn.apply(new HasPrivilegesRequest.Builder()).build());
	}

	/**
	 * Check user privileges.
	 * <p>
	 * Determine whether the specified user has a specified list of privileges.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-has-privileges.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<HasPrivilegesResponse> hasPrivileges() {
		return this.transport.performRequestAsync(new HasPrivilegesRequest.Builder().build(),
				HasPrivilegesRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: security.has_privileges_user_profile

	/**
	 * Check user profile privileges.
	 * <p>
	 * Determine whether the users associated with the specified user profile IDs
	 * have all the requested privileges.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-has-privileges-user-profile.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<HasPrivilegesUserProfileResponse> hasPrivilegesUserProfile(
			HasPrivilegesUserProfileRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<HasPrivilegesUserProfileRequest, HasPrivilegesUserProfileResponse, ErrorResponse> endpoint = (JsonEndpoint<HasPrivilegesUserProfileRequest, HasPrivilegesUserProfileResponse, ErrorResponse>) HasPrivilegesUserProfileRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Check user profile privileges.
	 * <p>
	 * Determine whether the users associated with the specified user profile IDs
	 * have all the requested privileges.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link HasPrivilegesUserProfileRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-has-privileges-user-profile.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<HasPrivilegesUserProfileResponse> hasPrivilegesUserProfile(
			Function<HasPrivilegesUserProfileRequest.Builder, ObjectBuilder<HasPrivilegesUserProfileRequest>> fn) {
		return hasPrivilegesUserProfile(fn.apply(new HasPrivilegesUserProfileRequest.Builder()).build());
	}

	// ----- Endpoint: security.invalidate_api_key

	/**
	 * Invalidate API keys.
	 * <p>
	 * This API invalidates API keys created by the create API key or grant API key
	 * APIs. Invalidated API keys fail authentication, but they can still be viewed
	 * using the get API key information and query API key information APIs, for at
	 * least the configured retention period, until they are automatically deleted.
	 * The <code>manage_api_key</code> privilege allows deleting any API keys. The
	 * <code>manage_own_api_key</code> only allows deleting API keys that are owned
	 * by the user. In addition, with the <code>manage_own_api_key</code> privilege,
	 * an invalidation request must be issued in one of the three formats:
	 * <ul>
	 * <li>Set the parameter <code>owner=true</code>.</li>
	 * <li>Or, set both <code>username</code> and <code>realm_name</code> to match
	 * the user’s identity.</li>
	 * <li>Or, if the request is issued by an API key, that is to say an API key
	 * invalidates itself, specify its ID in the <code>ids</code> field.</li>
	 * </ul>
	 *
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-invalidate-api-key.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<InvalidateApiKeyResponse> invalidateApiKey(InvalidateApiKeyRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<InvalidateApiKeyRequest, InvalidateApiKeyResponse, ErrorResponse> endpoint = (JsonEndpoint<InvalidateApiKeyRequest, InvalidateApiKeyResponse, ErrorResponse>) InvalidateApiKeyRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Invalidate API keys.
	 * <p>
	 * This API invalidates API keys created by the create API key or grant API key
	 * APIs. Invalidated API keys fail authentication, but they can still be viewed
	 * using the get API key information and query API key information APIs, for at
	 * least the configured retention period, until they are automatically deleted.
	 * The <code>manage_api_key</code> privilege allows deleting any API keys. The
	 * <code>manage_own_api_key</code> only allows deleting API keys that are owned
	 * by the user. In addition, with the <code>manage_own_api_key</code> privilege,
	 * an invalidation request must be issued in one of the three formats:
	 * <ul>
	 * <li>Set the parameter <code>owner=true</code>.</li>
	 * <li>Or, set both <code>username</code> and <code>realm_name</code> to match
	 * the user’s identity.</li>
	 * <li>Or, if the request is issued by an API key, that is to say an API key
	 * invalidates itself, specify its ID in the <code>ids</code> field.</li>
	 * </ul>
	 *
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link InvalidateApiKeyRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-invalidate-api-key.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<InvalidateApiKeyResponse> invalidateApiKey(
			Function<InvalidateApiKeyRequest.Builder, ObjectBuilder<InvalidateApiKeyRequest>> fn) {
		return invalidateApiKey(fn.apply(new InvalidateApiKeyRequest.Builder()).build());
	}

	/**
	 * Invalidate API keys.
	 * <p>
	 * This API invalidates API keys created by the create API key or grant API key
	 * APIs. Invalidated API keys fail authentication, but they can still be viewed
	 * using the get API key information and query API key information APIs, for at
	 * least the configured retention period, until they are automatically deleted.
	 * The <code>manage_api_key</code> privilege allows deleting any API keys. The
	 * <code>manage_own_api_key</code> only allows deleting API keys that are owned
	 * by the user. In addition, with the <code>manage_own_api_key</code> privilege,
	 * an invalidation request must be issued in one of the three formats:
	 * <ul>
	 * <li>Set the parameter <code>owner=true</code>.</li>
	 * <li>Or, set both <code>username</code> and <code>realm_name</code> to match
	 * the user’s identity.</li>
	 * <li>Or, if the request is issued by an API key, that is to say an API key
	 * invalidates itself, specify its ID in the <code>ids</code> field.</li>
	 * </ul>
	 *
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-invalidate-api-key.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<InvalidateApiKeyResponse> invalidateApiKey() {
		return this.transport.performRequestAsync(new InvalidateApiKeyRequest.Builder().build(),
				InvalidateApiKeyRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: security.invalidate_token

	/**
	 * Invalidate a token.
	 * <p>
	 * The access tokens returned by the get token API have a finite period of time
	 * for which they are valid. After that time period, they can no longer be used.
	 * The time period is defined by the
	 * <code>xpack.security.authc.token.timeout</code> setting.
	 * <p>
	 * The refresh tokens returned by the get token API are only valid for 24 hours.
	 * They can also be used exactly once. If you want to invalidate one or more
	 * access or refresh tokens immediately, use this invalidate token API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-invalidate-token.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<InvalidateTokenResponse> invalidateToken(InvalidateTokenRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<InvalidateTokenRequest, InvalidateTokenResponse, ErrorResponse> endpoint = (JsonEndpoint<InvalidateTokenRequest, InvalidateTokenResponse, ErrorResponse>) InvalidateTokenRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Invalidate a token.
	 * <p>
	 * The access tokens returned by the get token API have a finite period of time
	 * for which they are valid. After that time period, they can no longer be used.
	 * The time period is defined by the
	 * <code>xpack.security.authc.token.timeout</code> setting.
	 * <p>
	 * The refresh tokens returned by the get token API are only valid for 24 hours.
	 * They can also be used exactly once. If you want to invalidate one or more
	 * access or refresh tokens immediately, use this invalidate token API.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link InvalidateTokenRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-invalidate-token.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<InvalidateTokenResponse> invalidateToken(
			Function<InvalidateTokenRequest.Builder, ObjectBuilder<InvalidateTokenRequest>> fn) {
		return invalidateToken(fn.apply(new InvalidateTokenRequest.Builder()).build());
	}

	/**
	 * Invalidate a token.
	 * <p>
	 * The access tokens returned by the get token API have a finite period of time
	 * for which they are valid. After that time period, they can no longer be used.
	 * The time period is defined by the
	 * <code>xpack.security.authc.token.timeout</code> setting.
	 * <p>
	 * The refresh tokens returned by the get token API are only valid for 24 hours.
	 * They can also be used exactly once. If you want to invalidate one or more
	 * access or refresh tokens immediately, use this invalidate token API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-invalidate-token.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<InvalidateTokenResponse> invalidateToken() {
		return this.transport.performRequestAsync(new InvalidateTokenRequest.Builder().build(),
				InvalidateTokenRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: security.put_privileges

	/**
	 * Create or update application privileges.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-put-privileges.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutPrivilegesResponse> putPrivileges(PutPrivilegesRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutPrivilegesRequest, PutPrivilegesResponse, ErrorResponse> endpoint = (JsonEndpoint<PutPrivilegesRequest, PutPrivilegesResponse, ErrorResponse>) PutPrivilegesRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Create or update application privileges.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutPrivilegesRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-put-privileges.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutPrivilegesResponse> putPrivileges(
			Function<PutPrivilegesRequest.Builder, ObjectBuilder<PutPrivilegesRequest>> fn) {
		return putPrivileges(fn.apply(new PutPrivilegesRequest.Builder()).build());
	}

	/**
	 * Create or update application privileges.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-put-privileges.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutPrivilegesResponse> putPrivileges() {
		return this.transport.performRequestAsync(new PutPrivilegesRequest.Builder().build(),
				PutPrivilegesRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: security.put_role

	/**
	 * Create or update roles.
	 * <p>
	 * The role management APIs are generally the preferred way to manage roles in
	 * the native realm, rather than using file-based role management. The create or
	 * update roles API cannot update roles that are defined in roles files.
	 * File-based role management is not available in Elastic Serverless.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-put-role.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutRoleResponse> putRole(PutRoleRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutRoleRequest, PutRoleResponse, ErrorResponse> endpoint = (JsonEndpoint<PutRoleRequest, PutRoleResponse, ErrorResponse>) PutRoleRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Create or update roles.
	 * <p>
	 * The role management APIs are generally the preferred way to manage roles in
	 * the native realm, rather than using file-based role management. The create or
	 * update roles API cannot update roles that are defined in roles files.
	 * File-based role management is not available in Elastic Serverless.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutRoleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-put-role.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutRoleResponse> putRole(
			Function<PutRoleRequest.Builder, ObjectBuilder<PutRoleRequest>> fn) {
		return putRole(fn.apply(new PutRoleRequest.Builder()).build());
	}

	// ----- Endpoint: security.put_role_mapping

	/**
	 * Create or update role mappings.
	 * <p>
	 * Role mappings define which roles are assigned to each user. Each mapping has
	 * rules that identify users and a list of roles that are granted to those
	 * users. The role mapping APIs are generally the preferred way to manage role
	 * mappings rather than using role mapping files. The create or update role
	 * mappings API cannot update role mappings that are defined in role mapping
	 * files.
	 * <p>
	 * This API does not create roles. Rather, it maps users to existing roles.
	 * Roles can be created by using the create or update roles API or roles files.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-put-role-mapping.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutRoleMappingResponse> putRoleMapping(PutRoleMappingRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutRoleMappingRequest, PutRoleMappingResponse, ErrorResponse> endpoint = (JsonEndpoint<PutRoleMappingRequest, PutRoleMappingResponse, ErrorResponse>) PutRoleMappingRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Create or update role mappings.
	 * <p>
	 * Role mappings define which roles are assigned to each user. Each mapping has
	 * rules that identify users and a list of roles that are granted to those
	 * users. The role mapping APIs are generally the preferred way to manage role
	 * mappings rather than using role mapping files. The create or update role
	 * mappings API cannot update role mappings that are defined in role mapping
	 * files.
	 * <p>
	 * This API does not create roles. Rather, it maps users to existing roles.
	 * Roles can be created by using the create or update roles API or roles files.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutRoleMappingRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-put-role-mapping.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutRoleMappingResponse> putRoleMapping(
			Function<PutRoleMappingRequest.Builder, ObjectBuilder<PutRoleMappingRequest>> fn) {
		return putRoleMapping(fn.apply(new PutRoleMappingRequest.Builder()).build());
	}

	// ----- Endpoint: security.put_user

	/**
	 * Create or update users.
	 * <p>
	 * A password is required for adding a new user but is optional when updating an
	 * existing user. To change a user’s password without updating any other fields,
	 * use the change password API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-put-user.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutUserResponse> putUser(PutUserRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutUserRequest, PutUserResponse, ErrorResponse> endpoint = (JsonEndpoint<PutUserRequest, PutUserResponse, ErrorResponse>) PutUserRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Create or update users.
	 * <p>
	 * A password is required for adding a new user but is optional when updating an
	 * existing user. To change a user’s password without updating any other fields,
	 * use the change password API.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutUserRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-put-user.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutUserResponse> putUser(
			Function<PutUserRequest.Builder, ObjectBuilder<PutUserRequest>> fn) {
		return putUser(fn.apply(new PutUserRequest.Builder()).build());
	}

	// ----- Endpoint: security.query_api_keys

	/**
	 * Find API keys with a query.
	 * <p>
	 * Get a paginated list of API keys and their information. You can optionally
	 * filter the results with a query.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-query-api-key.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<QueryApiKeysResponse> queryApiKeys(QueryApiKeysRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<QueryApiKeysRequest, QueryApiKeysResponse, ErrorResponse> endpoint = (JsonEndpoint<QueryApiKeysRequest, QueryApiKeysResponse, ErrorResponse>) QueryApiKeysRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Find API keys with a query.
	 * <p>
	 * Get a paginated list of API keys and their information. You can optionally
	 * filter the results with a query.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link QueryApiKeysRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-query-api-key.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<QueryApiKeysResponse> queryApiKeys(
			Function<QueryApiKeysRequest.Builder, ObjectBuilder<QueryApiKeysRequest>> fn) {
		return queryApiKeys(fn.apply(new QueryApiKeysRequest.Builder()).build());
	}

	/**
	 * Find API keys with a query.
	 * <p>
	 * Get a paginated list of API keys and their information. You can optionally
	 * filter the results with a query.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-query-api-key.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<QueryApiKeysResponse> queryApiKeys() {
		return this.transport.performRequestAsync(new QueryApiKeysRequest.Builder().build(),
				QueryApiKeysRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: security.query_role

	/**
	 * Find roles with a query.
	 * <p>
	 * Get roles in a paginated manner. You can optionally filter the results with a
	 * query.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-query-role.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<QueryRoleResponse> queryRole(QueryRoleRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<QueryRoleRequest, QueryRoleResponse, ErrorResponse> endpoint = (JsonEndpoint<QueryRoleRequest, QueryRoleResponse, ErrorResponse>) QueryRoleRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Find roles with a query.
	 * <p>
	 * Get roles in a paginated manner. You can optionally filter the results with a
	 * query.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link QueryRoleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-query-role.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<QueryRoleResponse> queryRole(
			Function<QueryRoleRequest.Builder, ObjectBuilder<QueryRoleRequest>> fn) {
		return queryRole(fn.apply(new QueryRoleRequest.Builder()).build());
	}

	/**
	 * Find roles with a query.
	 * <p>
	 * Get roles in a paginated manner. You can optionally filter the results with a
	 * query.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-query-role.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<QueryRoleResponse> queryRole() {
		return this.transport.performRequestAsync(new QueryRoleRequest.Builder().build(), QueryRoleRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: security.query_user

	/**
	 * Find users with a query.
	 * <p>
	 * Get information for users in a paginated manner. You can optionally filter
	 * the results with a query.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-query-user.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<QueryUserResponse> queryUser(QueryUserRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<QueryUserRequest, QueryUserResponse, ErrorResponse> endpoint = (JsonEndpoint<QueryUserRequest, QueryUserResponse, ErrorResponse>) QueryUserRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Find users with a query.
	 * <p>
	 * Get information for users in a paginated manner. You can optionally filter
	 * the results with a query.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link QueryUserRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-query-user.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<QueryUserResponse> queryUser(
			Function<QueryUserRequest.Builder, ObjectBuilder<QueryUserRequest>> fn) {
		return queryUser(fn.apply(new QueryUserRequest.Builder()).build());
	}

	/**
	 * Find users with a query.
	 * <p>
	 * Get information for users in a paginated manner. You can optionally filter
	 * the results with a query.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-query-user.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<QueryUserResponse> queryUser() {
		return this.transport.performRequestAsync(new QueryUserRequest.Builder().build(), QueryUserRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: security.saml_authenticate

	/**
	 * Authenticate SAML.
	 * <p>
	 * Submits a SAML response message to Elasticsearch for consumption.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-saml-authenticate.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SamlAuthenticateResponse> samlAuthenticate(SamlAuthenticateRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SamlAuthenticateRequest, SamlAuthenticateResponse, ErrorResponse> endpoint = (JsonEndpoint<SamlAuthenticateRequest, SamlAuthenticateResponse, ErrorResponse>) SamlAuthenticateRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Authenticate SAML.
	 * <p>
	 * Submits a SAML response message to Elasticsearch for consumption.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SamlAuthenticateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-saml-authenticate.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<SamlAuthenticateResponse> samlAuthenticate(
			Function<SamlAuthenticateRequest.Builder, ObjectBuilder<SamlAuthenticateRequest>> fn) {
		return samlAuthenticate(fn.apply(new SamlAuthenticateRequest.Builder()).build());
	}

	// ----- Endpoint: security.saml_complete_logout

	/**
	 * Logout of SAML completely.
	 * <p>
	 * Verifies the logout response sent from the SAML IdP.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-saml-complete-logout.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<BooleanResponse> samlCompleteLogout(SamlCompleteLogoutRequest request) {
		@SuppressWarnings("unchecked")
		Endpoint<SamlCompleteLogoutRequest, BooleanResponse, ErrorResponse> endpoint = (Endpoint<SamlCompleteLogoutRequest, BooleanResponse, ErrorResponse>) SamlCompleteLogoutRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Logout of SAML completely.
	 * <p>
	 * Verifies the logout response sent from the SAML IdP.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SamlCompleteLogoutRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-saml-complete-logout.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<BooleanResponse> samlCompleteLogout(
			Function<SamlCompleteLogoutRequest.Builder, ObjectBuilder<SamlCompleteLogoutRequest>> fn) {
		return samlCompleteLogout(fn.apply(new SamlCompleteLogoutRequest.Builder()).build());
	}

	// ----- Endpoint: security.saml_invalidate

	/**
	 * Invalidate SAML.
	 * <p>
	 * Submits a SAML LogoutRequest message to Elasticsearch for consumption.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-saml-invalidate.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SamlInvalidateResponse> samlInvalidate(SamlInvalidateRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SamlInvalidateRequest, SamlInvalidateResponse, ErrorResponse> endpoint = (JsonEndpoint<SamlInvalidateRequest, SamlInvalidateResponse, ErrorResponse>) SamlInvalidateRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Invalidate SAML.
	 * <p>
	 * Submits a SAML LogoutRequest message to Elasticsearch for consumption.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SamlInvalidateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-saml-invalidate.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<SamlInvalidateResponse> samlInvalidate(
			Function<SamlInvalidateRequest.Builder, ObjectBuilder<SamlInvalidateRequest>> fn) {
		return samlInvalidate(fn.apply(new SamlInvalidateRequest.Builder()).build());
	}

	// ----- Endpoint: security.saml_logout

	/**
	 * Logout of SAML.
	 * <p>
	 * Submits a request to invalidate an access token and refresh token.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-saml-logout.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SamlLogoutResponse> samlLogout(SamlLogoutRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SamlLogoutRequest, SamlLogoutResponse, ErrorResponse> endpoint = (JsonEndpoint<SamlLogoutRequest, SamlLogoutResponse, ErrorResponse>) SamlLogoutRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Logout of SAML.
	 * <p>
	 * Submits a request to invalidate an access token and refresh token.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SamlLogoutRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-saml-logout.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<SamlLogoutResponse> samlLogout(
			Function<SamlLogoutRequest.Builder, ObjectBuilder<SamlLogoutRequest>> fn) {
		return samlLogout(fn.apply(new SamlLogoutRequest.Builder()).build());
	}

	// ----- Endpoint: security.saml_prepare_authentication

	/**
	 * Prepare SAML authentication.
	 * <p>
	 * Creates a SAML authentication request (<code>&lt;AuthnRequest&gt;</code>) as
	 * a URL string, based on the configuration of the respective SAML realm in
	 * Elasticsearch.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-saml-prepare-authentication.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SamlPrepareAuthenticationResponse> samlPrepareAuthentication(
			SamlPrepareAuthenticationRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SamlPrepareAuthenticationRequest, SamlPrepareAuthenticationResponse, ErrorResponse> endpoint = (JsonEndpoint<SamlPrepareAuthenticationRequest, SamlPrepareAuthenticationResponse, ErrorResponse>) SamlPrepareAuthenticationRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Prepare SAML authentication.
	 * <p>
	 * Creates a SAML authentication request (<code>&lt;AuthnRequest&gt;</code>) as
	 * a URL string, based on the configuration of the respective SAML realm in
	 * Elasticsearch.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SamlPrepareAuthenticationRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-saml-prepare-authentication.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<SamlPrepareAuthenticationResponse> samlPrepareAuthentication(
			Function<SamlPrepareAuthenticationRequest.Builder, ObjectBuilder<SamlPrepareAuthenticationRequest>> fn) {
		return samlPrepareAuthentication(fn.apply(new SamlPrepareAuthenticationRequest.Builder()).build());
	}

	/**
	 * Prepare SAML authentication.
	 * <p>
	 * Creates a SAML authentication request (<code>&lt;AuthnRequest&gt;</code>) as
	 * a URL string, based on the configuration of the respective SAML realm in
	 * Elasticsearch.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-saml-prepare-authentication.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SamlPrepareAuthenticationResponse> samlPrepareAuthentication() {
		return this.transport.performRequestAsync(new SamlPrepareAuthenticationRequest.Builder().build(),
				SamlPrepareAuthenticationRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: security.saml_service_provider_metadata

	/**
	 * Create SAML service provider metadata.
	 * <p>
	 * Generate SAML metadata for a SAML 2.0 Service Provider.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-saml-sp-metadata.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SamlServiceProviderMetadataResponse> samlServiceProviderMetadata(
			SamlServiceProviderMetadataRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SamlServiceProviderMetadataRequest, SamlServiceProviderMetadataResponse, ErrorResponse> endpoint = (JsonEndpoint<SamlServiceProviderMetadataRequest, SamlServiceProviderMetadataResponse, ErrorResponse>) SamlServiceProviderMetadataRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Create SAML service provider metadata.
	 * <p>
	 * Generate SAML metadata for a SAML 2.0 Service Provider.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SamlServiceProviderMetadataRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-saml-sp-metadata.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<SamlServiceProviderMetadataResponse> samlServiceProviderMetadata(
			Function<SamlServiceProviderMetadataRequest.Builder, ObjectBuilder<SamlServiceProviderMetadataRequest>> fn) {
		return samlServiceProviderMetadata(fn.apply(new SamlServiceProviderMetadataRequest.Builder()).build());
	}

	// ----- Endpoint: security.suggest_user_profiles

	/**
	 * Suggest a user profile.
	 * <p>
	 * Get suggestions for user profiles that match specified search criteria.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/security-api-suggest-user-profile.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SuggestUserProfilesResponse> suggestUserProfiles(SuggestUserProfilesRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SuggestUserProfilesRequest, SuggestUserProfilesResponse, ErrorResponse> endpoint = (JsonEndpoint<SuggestUserProfilesRequest, SuggestUserProfilesResponse, ErrorResponse>) SuggestUserProfilesRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Suggest a user profile.
	 * <p>
	 * Get suggestions for user profiles that match specified search criteria.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SuggestUserProfilesRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/security-api-suggest-user-profile.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<SuggestUserProfilesResponse> suggestUserProfiles(
			Function<SuggestUserProfilesRequest.Builder, ObjectBuilder<SuggestUserProfilesRequest>> fn) {
		return suggestUserProfiles(fn.apply(new SuggestUserProfilesRequest.Builder()).build());
	}

	/**
	 * Suggest a user profile.
	 * <p>
	 * Get suggestions for user profiles that match specified search criteria.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/security-api-suggest-user-profile.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SuggestUserProfilesResponse> suggestUserProfiles() {
		return this.transport.performRequestAsync(new SuggestUserProfilesRequest.Builder().build(),
				SuggestUserProfilesRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: security.update_api_key

	/**
	 * Update an API key.
	 * <p>
	 * Updates attributes of an existing API key. Users can only update API keys
	 * that they created or that were granted to them. Use this API to update API
	 * keys created by the create API Key or grant API Key APIs. If you need to
	 * apply the same update to many API keys, you can use bulk update API Keys to
	 * reduce overhead. It’s not possible to update expired API keys, or API keys
	 * that have been invalidated by invalidate API Key. This API supports updates
	 * to an API key’s access scope and metadata. The access scope of an API key is
	 * derived from the <code>role_descriptors</code> you specify in the request,
	 * and a snapshot of the owner user’s permissions at the time of the request.
	 * The snapshot of the owner’s permissions is updated automatically on every
	 * call. If you don’t specify <code>role_descriptors</code> in the request, a
	 * call to this API might still change the API key’s access scope. This change
	 * can occur if the owner user’s permissions have changed since the API key was
	 * created or last modified. To update another user’s API key, use the
	 * <code>run_as</code> feature to submit a request on behalf of another user.
	 * IMPORTANT: It’s not possible to use an API key as the authentication
	 * credential for this API. To update an API key, the owner user’s credentials
	 * are required.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-update-api-key.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<UpdateApiKeyResponse> updateApiKey(UpdateApiKeyRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdateApiKeyRequest, UpdateApiKeyResponse, ErrorResponse> endpoint = (JsonEndpoint<UpdateApiKeyRequest, UpdateApiKeyResponse, ErrorResponse>) UpdateApiKeyRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Update an API key.
	 * <p>
	 * Updates attributes of an existing API key. Users can only update API keys
	 * that they created or that were granted to them. Use this API to update API
	 * keys created by the create API Key or grant API Key APIs. If you need to
	 * apply the same update to many API keys, you can use bulk update API Keys to
	 * reduce overhead. It’s not possible to update expired API keys, or API keys
	 * that have been invalidated by invalidate API Key. This API supports updates
	 * to an API key’s access scope and metadata. The access scope of an API key is
	 * derived from the <code>role_descriptors</code> you specify in the request,
	 * and a snapshot of the owner user’s permissions at the time of the request.
	 * The snapshot of the owner’s permissions is updated automatically on every
	 * call. If you don’t specify <code>role_descriptors</code> in the request, a
	 * call to this API might still change the API key’s access scope. This change
	 * can occur if the owner user’s permissions have changed since the API key was
	 * created or last modified. To update another user’s API key, use the
	 * <code>run_as</code> feature to submit a request on behalf of another user.
	 * IMPORTANT: It’s not possible to use an API key as the authentication
	 * credential for this API. To update an API key, the owner user’s credentials
	 * are required.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateApiKeyRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-update-api-key.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<UpdateApiKeyResponse> updateApiKey(
			Function<UpdateApiKeyRequest.Builder, ObjectBuilder<UpdateApiKeyRequest>> fn) {
		return updateApiKey(fn.apply(new UpdateApiKeyRequest.Builder()).build());
	}

	// ----- Endpoint: security.update_cross_cluster_api_key

	/**
	 * Update a cross-cluster API key.
	 * <p>
	 * Update the attributes of an existing cross-cluster API key, which is used for
	 * API key based remote cluster access.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-update-cross-cluster-api-key.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<UpdateCrossClusterApiKeyResponse> updateCrossClusterApiKey(
			UpdateCrossClusterApiKeyRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdateCrossClusterApiKeyRequest, UpdateCrossClusterApiKeyResponse, ErrorResponse> endpoint = (JsonEndpoint<UpdateCrossClusterApiKeyRequest, UpdateCrossClusterApiKeyResponse, ErrorResponse>) UpdateCrossClusterApiKeyRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Update a cross-cluster API key.
	 * <p>
	 * Update the attributes of an existing cross-cluster API key, which is used for
	 * API key based remote cluster access.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateCrossClusterApiKeyRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-update-cross-cluster-api-key.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<UpdateCrossClusterApiKeyResponse> updateCrossClusterApiKey(
			Function<UpdateCrossClusterApiKeyRequest.Builder, ObjectBuilder<UpdateCrossClusterApiKeyRequest>> fn) {
		return updateCrossClusterApiKey(fn.apply(new UpdateCrossClusterApiKeyRequest.Builder()).build());
	}

	// ----- Endpoint: security.update_user_profile_data

	/**
	 * Update user profile data.
	 * <p>
	 * Update specific data for the user profile that is associated with a unique
	 * ID.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-update-user-profile-data.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<UpdateUserProfileDataResponse> updateUserProfileData(
			UpdateUserProfileDataRequest request) {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdateUserProfileDataRequest, UpdateUserProfileDataResponse, ErrorResponse> endpoint = (JsonEndpoint<UpdateUserProfileDataRequest, UpdateUserProfileDataResponse, ErrorResponse>) UpdateUserProfileDataRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Update user profile data.
	 * <p>
	 * Update specific data for the user profile that is associated with a unique
	 * ID.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateUserProfileDataRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-update-user-profile-data.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<UpdateUserProfileDataResponse> updateUserProfileData(
			Function<UpdateUserProfileDataRequest.Builder, ObjectBuilder<UpdateUserProfileDataRequest>> fn) {
		return updateUserProfileData(fn.apply(new UpdateUserProfileDataRequest.Builder()).build());
	}

}
