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
	 * Activate a user profile.
	 * <p>
	 * Create or update a user profile on behalf of another user.
	 * <p>
	 * NOTE: The user profile feature is designed only for use by Kibana and
	 * Elastic's Observability, Enterprise Search, and Elastic Security solutions.
	 * Individual users and external applications should not call this API directly.
	 * The calling application must have either an <code>access_token</code> or a
	 * combination of <code>username</code> and <code>password</code> for the user
	 * that the profile document is intended for. Elastic reserves the right to
	 * change or remove this feature in future releases without prior notice.
	 * <p>
	 * This API creates or updates a profile document for end users with information
	 * that is extracted from the user's authentication object including
	 * <code>username</code>, <code>full_name,</code> <code>roles</code>, and the
	 * authentication realm. For example, in the JWT <code>access_token</code> case,
	 * the profile user's <code>username</code> is extracted from the JWT token
	 * claim pointed to by the <code>claims.principal</code> setting of the JWT
	 * realm that authenticated the token.
	 * <p>
	 * When updating a profile document, the API enables the document if it was
	 * disabled. Any updates do not change existing content for either the
	 * <code>labels</code> or <code>data</code> fields.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-activate-user-profile">Documentation
	 *      on elastic.co</a>
	 */

	public ActivateUserProfileResponse activateUserProfile(ActivateUserProfileRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ActivateUserProfileRequest, ActivateUserProfileResponse, ErrorResponse> endpoint = (JsonEndpoint<ActivateUserProfileRequest, ActivateUserProfileResponse, ErrorResponse>) ActivateUserProfileRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Activate a user profile.
	 * <p>
	 * Create or update a user profile on behalf of another user.
	 * <p>
	 * NOTE: The user profile feature is designed only for use by Kibana and
	 * Elastic's Observability, Enterprise Search, and Elastic Security solutions.
	 * Individual users and external applications should not call this API directly.
	 * The calling application must have either an <code>access_token</code> or a
	 * combination of <code>username</code> and <code>password</code> for the user
	 * that the profile document is intended for. Elastic reserves the right to
	 * change or remove this feature in future releases without prior notice.
	 * <p>
	 * This API creates or updates a profile document for end users with information
	 * that is extracted from the user's authentication object including
	 * <code>username</code>, <code>full_name,</code> <code>roles</code>, and the
	 * authentication realm. For example, in the JWT <code>access_token</code> case,
	 * the profile user's <code>username</code> is extracted from the JWT token
	 * claim pointed to by the <code>claims.principal</code> setting of the JWT
	 * realm that authenticated the token.
	 * <p>
	 * When updating a profile document, the API enables the document if it was
	 * disabled. Any updates do not change existing content for either the
	 * <code>labels</code> or <code>data</code> fields.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ActivateUserProfileRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-activate-user-profile">Documentation
	 *      on elastic.co</a>
	 */

	public final ActivateUserProfileResponse activateUserProfile(
			Function<ActivateUserProfileRequest.Builder, ObjectBuilder<ActivateUserProfileRequest>> fn)
			throws IOException, ElasticsearchException {
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-authenticate">Documentation
	 *      on elastic.co</a>
	 */
	public AuthenticateResponse authenticate() throws IOException, ElasticsearchException {
		return this.transport.performRequest(AuthenticateRequest._INSTANCE, AuthenticateRequest._ENDPOINT,
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-bulk-delete-role">Documentation
	 *      on elastic.co</a>
	 */

	public BulkDeleteRoleResponse bulkDeleteRole(BulkDeleteRoleRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<BulkDeleteRoleRequest, BulkDeleteRoleResponse, ErrorResponse> endpoint = (JsonEndpoint<BulkDeleteRoleRequest, BulkDeleteRoleResponse, ErrorResponse>) BulkDeleteRoleRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-bulk-delete-role">Documentation
	 *      on elastic.co</a>
	 */

	public final BulkDeleteRoleResponse bulkDeleteRole(
			Function<BulkDeleteRoleRequest.Builder, ObjectBuilder<BulkDeleteRoleRequest>> fn)
			throws IOException, ElasticsearchException {
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-bulk-put-role">Documentation
	 *      on elastic.co</a>
	 */

	public BulkPutRoleResponse bulkPutRole(BulkPutRoleRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<BulkPutRoleRequest, BulkPutRoleResponse, ErrorResponse> endpoint = (JsonEndpoint<BulkPutRoleRequest, BulkPutRoleResponse, ErrorResponse>) BulkPutRoleRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-bulk-put-role">Documentation
	 *      on elastic.co</a>
	 */

	public final BulkPutRoleResponse bulkPutRole(
			Function<BulkPutRoleRequest.Builder, ObjectBuilder<BulkPutRoleRequest>> fn)
			throws IOException, ElasticsearchException {
		return bulkPutRole(fn.apply(new BulkPutRoleRequest.Builder()).build());
	}

	// ----- Endpoint: security.bulk_update_api_keys

	/**
	 * Bulk update API keys. Update the attributes for multiple API keys.
	 * <p>
	 * IMPORTANT: It is not possible to use an API key as the authentication
	 * credential for this API. To update API keys, the owner user's credentials are
	 * required.
	 * <p>
	 * This API is similar to the update API key API but enables you to apply the
	 * same update to multiple API keys in one API call. This operation can greatly
	 * improve performance over making individual updates.
	 * <p>
	 * It is not possible to update expired or invalidated API keys.
	 * <p>
	 * This API supports updates to API key access scope, metadata and expiration.
	 * The access scope of each API key is derived from the
	 * <code>role_descriptors</code> you specify in the request and a snapshot of
	 * the owner user's permissions at the time of the request. The snapshot of the
	 * owner's permissions is updated automatically on every call.
	 * <p>
	 * IMPORTANT: If you don't specify <code>role_descriptors</code> in the request,
	 * a call to this API might still change an API key's access scope. This change
	 * can occur if the owner user's permissions have changed since the API key was
	 * created or last modified.
	 * <p>
	 * A successful request returns a JSON structure that contains the IDs of all
	 * updated API keys, the IDs of API keys that already had the requested changes
	 * and did not require an update, and error details for any failed update.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-bulk-update-api-keys">Documentation
	 *      on elastic.co</a>
	 */

	public BulkUpdateApiKeysResponse bulkUpdateApiKeys(BulkUpdateApiKeysRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<BulkUpdateApiKeysRequest, BulkUpdateApiKeysResponse, ErrorResponse> endpoint = (JsonEndpoint<BulkUpdateApiKeysRequest, BulkUpdateApiKeysResponse, ErrorResponse>) BulkUpdateApiKeysRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Bulk update API keys. Update the attributes for multiple API keys.
	 * <p>
	 * IMPORTANT: It is not possible to use an API key as the authentication
	 * credential for this API. To update API keys, the owner user's credentials are
	 * required.
	 * <p>
	 * This API is similar to the update API key API but enables you to apply the
	 * same update to multiple API keys in one API call. This operation can greatly
	 * improve performance over making individual updates.
	 * <p>
	 * It is not possible to update expired or invalidated API keys.
	 * <p>
	 * This API supports updates to API key access scope, metadata and expiration.
	 * The access scope of each API key is derived from the
	 * <code>role_descriptors</code> you specify in the request and a snapshot of
	 * the owner user's permissions at the time of the request. The snapshot of the
	 * owner's permissions is updated automatically on every call.
	 * <p>
	 * IMPORTANT: If you don't specify <code>role_descriptors</code> in the request,
	 * a call to this API might still change an API key's access scope. This change
	 * can occur if the owner user's permissions have changed since the API key was
	 * created or last modified.
	 * <p>
	 * A successful request returns a JSON structure that contains the IDs of all
	 * updated API keys, the IDs of API keys that already had the requested changes
	 * and did not require an update, and error details for any failed update.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link BulkUpdateApiKeysRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-bulk-update-api-keys">Documentation
	 *      on elastic.co</a>
	 */

	public final BulkUpdateApiKeysResponse bulkUpdateApiKeys(
			Function<BulkUpdateApiKeysRequest.Builder, ObjectBuilder<BulkUpdateApiKeysRequest>> fn)
			throws IOException, ElasticsearchException {
		return bulkUpdateApiKeys(fn.apply(new BulkUpdateApiKeysRequest.Builder()).build());
	}

	// ----- Endpoint: security.change_password

	/**
	 * Change passwords.
	 * <p>
	 * Change the passwords of users in the native realm and built-in users.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-change-password">Documentation
	 *      on elastic.co</a>
	 */

	public ChangePasswordResponse changePassword(ChangePasswordRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ChangePasswordRequest, ChangePasswordResponse, ErrorResponse> endpoint = (JsonEndpoint<ChangePasswordRequest, ChangePasswordResponse, ErrorResponse>) ChangePasswordRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-change-password">Documentation
	 *      on elastic.co</a>
	 */

	public final ChangePasswordResponse changePassword(
			Function<ChangePasswordRequest.Builder, ObjectBuilder<ChangePasswordRequest>> fn)
			throws IOException, ElasticsearchException {
		return changePassword(fn.apply(new ChangePasswordRequest.Builder()).build());
	}

	/**
	 * Change passwords.
	 * <p>
	 * Change the passwords of users in the native realm and built-in users.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-change-password">Documentation
	 *      on elastic.co</a>
	 */

	public ChangePasswordResponse changePassword() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new ChangePasswordRequest.Builder().build(),
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-clear-api-key-cache">Documentation
	 *      on elastic.co</a>
	 */

	public ClearApiKeyCacheResponse clearApiKeyCache(ClearApiKeyCacheRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ClearApiKeyCacheRequest, ClearApiKeyCacheResponse, ErrorResponse> endpoint = (JsonEndpoint<ClearApiKeyCacheRequest, ClearApiKeyCacheResponse, ErrorResponse>) ClearApiKeyCacheRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-clear-api-key-cache">Documentation
	 *      on elastic.co</a>
	 */

	public final ClearApiKeyCacheResponse clearApiKeyCache(
			Function<ClearApiKeyCacheRequest.Builder, ObjectBuilder<ClearApiKeyCacheRequest>> fn)
			throws IOException, ElasticsearchException {
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-clear-cached-privileges">Documentation
	 *      on elastic.co</a>
	 */

	public ClearCachedPrivilegesResponse clearCachedPrivileges(ClearCachedPrivilegesRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ClearCachedPrivilegesRequest, ClearCachedPrivilegesResponse, ErrorResponse> endpoint = (JsonEndpoint<ClearCachedPrivilegesRequest, ClearCachedPrivilegesResponse, ErrorResponse>) ClearCachedPrivilegesRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-clear-cached-privileges">Documentation
	 *      on elastic.co</a>
	 */

	public final ClearCachedPrivilegesResponse clearCachedPrivileges(
			Function<ClearCachedPrivilegesRequest.Builder, ObjectBuilder<ClearCachedPrivilegesRequest>> fn)
			throws IOException, ElasticsearchException {
		return clearCachedPrivileges(fn.apply(new ClearCachedPrivilegesRequest.Builder()).build());
	}

	// ----- Endpoint: security.clear_cached_realms

	/**
	 * Clear the user cache.
	 * <p>
	 * Evict users from the user cache. You can completely clear the cache or evict
	 * specific users.
	 * <p>
	 * User credentials are cached in memory on each node to avoid connecting to a
	 * remote authentication service or hitting the disk for every incoming request.
	 * There are realm settings that you can use to configure the user cache. For
	 * more information, refer to the documentation about controlling the user
	 * cache.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-clear-cached-realms">Documentation
	 *      on elastic.co</a>
	 */

	public ClearCachedRealmsResponse clearCachedRealms(ClearCachedRealmsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ClearCachedRealmsRequest, ClearCachedRealmsResponse, ErrorResponse> endpoint = (JsonEndpoint<ClearCachedRealmsRequest, ClearCachedRealmsResponse, ErrorResponse>) ClearCachedRealmsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Clear the user cache.
	 * <p>
	 * Evict users from the user cache. You can completely clear the cache or evict
	 * specific users.
	 * <p>
	 * User credentials are cached in memory on each node to avoid connecting to a
	 * remote authentication service or hitting the disk for every incoming request.
	 * There are realm settings that you can use to configure the user cache. For
	 * more information, refer to the documentation about controlling the user
	 * cache.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ClearCachedRealmsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-clear-cached-realms">Documentation
	 *      on elastic.co</a>
	 */

	public final ClearCachedRealmsResponse clearCachedRealms(
			Function<ClearCachedRealmsRequest.Builder, ObjectBuilder<ClearCachedRealmsRequest>> fn)
			throws IOException, ElasticsearchException {
		return clearCachedRealms(fn.apply(new ClearCachedRealmsRequest.Builder()).build());
	}

	// ----- Endpoint: security.clear_cached_roles

	/**
	 * Clear the roles cache.
	 * <p>
	 * Evict roles from the native role cache.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-clear-cached-roles">Documentation
	 *      on elastic.co</a>
	 */

	public ClearCachedRolesResponse clearCachedRoles(ClearCachedRolesRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ClearCachedRolesRequest, ClearCachedRolesResponse, ErrorResponse> endpoint = (JsonEndpoint<ClearCachedRolesRequest, ClearCachedRolesResponse, ErrorResponse>) ClearCachedRolesRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-clear-cached-roles">Documentation
	 *      on elastic.co</a>
	 */

	public final ClearCachedRolesResponse clearCachedRoles(
			Function<ClearCachedRolesRequest.Builder, ObjectBuilder<ClearCachedRolesRequest>> fn)
			throws IOException, ElasticsearchException {
		return clearCachedRoles(fn.apply(new ClearCachedRolesRequest.Builder()).build());
	}

	// ----- Endpoint: security.clear_cached_service_tokens

	/**
	 * Clear service account token caches.
	 * <p>
	 * Evict a subset of all entries from the service account token caches. Two
	 * separate caches exist for service account tokens: one cache for tokens backed
	 * by the <code>service_tokens</code> file, and another for tokens backed by the
	 * <code>.security</code> index. This API clears matching entries from both
	 * caches.
	 * <p>
	 * The cache for service account tokens backed by the <code>.security</code>
	 * index is cleared automatically on state changes of the security index. The
	 * cache for tokens backed by the <code>service_tokens</code> file is cleared
	 * automatically on file changes.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-clear-cached-service-tokens">Documentation
	 *      on elastic.co</a>
	 */

	public ClearCachedServiceTokensResponse clearCachedServiceTokens(ClearCachedServiceTokensRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ClearCachedServiceTokensRequest, ClearCachedServiceTokensResponse, ErrorResponse> endpoint = (JsonEndpoint<ClearCachedServiceTokensRequest, ClearCachedServiceTokensResponse, ErrorResponse>) ClearCachedServiceTokensRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Clear service account token caches.
	 * <p>
	 * Evict a subset of all entries from the service account token caches. Two
	 * separate caches exist for service account tokens: one cache for tokens backed
	 * by the <code>service_tokens</code> file, and another for tokens backed by the
	 * <code>.security</code> index. This API clears matching entries from both
	 * caches.
	 * <p>
	 * The cache for service account tokens backed by the <code>.security</code>
	 * index is cleared automatically on state changes of the security index. The
	 * cache for tokens backed by the <code>service_tokens</code> file is cleared
	 * automatically on file changes.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ClearCachedServiceTokensRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-clear-cached-service-tokens">Documentation
	 *      on elastic.co</a>
	 */

	public final ClearCachedServiceTokensResponse clearCachedServiceTokens(
			Function<ClearCachedServiceTokensRequest.Builder, ObjectBuilder<ClearCachedServiceTokensRequest>> fn)
			throws IOException, ElasticsearchException {
		return clearCachedServiceTokens(fn.apply(new ClearCachedServiceTokensRequest.Builder()).build());
	}

	// ----- Endpoint: security.create_api_key

	/**
	 * Create an API key.
	 * <p>
	 * Create an API key for access without requiring basic authentication.
	 * <p>
	 * IMPORTANT: If the credential that is used to authenticate this request is an
	 * API key, the derived API key cannot have any privileges. If you specify
	 * privileges, the API returns an error.
	 * <p>
	 * A successful request returns a JSON structure that contains the API key, its
	 * unique id, and its name. If applicable, it also returns expiration
	 * information for the API key in milliseconds.
	 * <p>
	 * NOTE: By default, API keys never expire. You can specify expiration
	 * information when you create the API keys.
	 * <p>
	 * The API keys are created by the Elasticsearch API key service, which is
	 * automatically enabled. To configure or turn off the API key service, refer to
	 * API key service setting documentation.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-create-api-key">Documentation
	 *      on elastic.co</a>
	 */

	public CreateApiKeyResponse createApiKey(CreateApiKeyRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<CreateApiKeyRequest, CreateApiKeyResponse, ErrorResponse> endpoint = (JsonEndpoint<CreateApiKeyRequest, CreateApiKeyResponse, ErrorResponse>) CreateApiKeyRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Create an API key.
	 * <p>
	 * Create an API key for access without requiring basic authentication.
	 * <p>
	 * IMPORTANT: If the credential that is used to authenticate this request is an
	 * API key, the derived API key cannot have any privileges. If you specify
	 * privileges, the API returns an error.
	 * <p>
	 * A successful request returns a JSON structure that contains the API key, its
	 * unique id, and its name. If applicable, it also returns expiration
	 * information for the API key in milliseconds.
	 * <p>
	 * NOTE: By default, API keys never expire. You can specify expiration
	 * information when you create the API keys.
	 * <p>
	 * The API keys are created by the Elasticsearch API key service, which is
	 * automatically enabled. To configure or turn off the API key service, refer to
	 * API key service setting documentation.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CreateApiKeyRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-create-api-key">Documentation
	 *      on elastic.co</a>
	 */

	public final CreateApiKeyResponse createApiKey(
			Function<CreateApiKeyRequest.Builder, ObjectBuilder<CreateApiKeyRequest>> fn)
			throws IOException, ElasticsearchException {
		return createApiKey(fn.apply(new CreateApiKeyRequest.Builder()).build());
	}

	/**
	 * Create an API key.
	 * <p>
	 * Create an API key for access without requiring basic authentication.
	 * <p>
	 * IMPORTANT: If the credential that is used to authenticate this request is an
	 * API key, the derived API key cannot have any privileges. If you specify
	 * privileges, the API returns an error.
	 * <p>
	 * A successful request returns a JSON structure that contains the API key, its
	 * unique id, and its name. If applicable, it also returns expiration
	 * information for the API key in milliseconds.
	 * <p>
	 * NOTE: By default, API keys never expire. You can specify expiration
	 * information when you create the API keys.
	 * <p>
	 * The API keys are created by the Elasticsearch API key service, which is
	 * automatically enabled. To configure or turn off the API key service, refer to
	 * API key service setting documentation.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-create-api-key">Documentation
	 *      on elastic.co</a>
	 */

	public CreateApiKeyResponse createApiKey() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new CreateApiKeyRequest.Builder().build(), CreateApiKeyRequest._ENDPOINT,
				this.transportOptions);
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-create-cross-cluster-api-key">Documentation
	 *      on elastic.co</a>
	 */

	public CreateCrossClusterApiKeyResponse createCrossClusterApiKey(CreateCrossClusterApiKeyRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<CreateCrossClusterApiKeyRequest, CreateCrossClusterApiKeyResponse, ErrorResponse> endpoint = (JsonEndpoint<CreateCrossClusterApiKeyRequest, CreateCrossClusterApiKeyResponse, ErrorResponse>) CreateCrossClusterApiKeyRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-create-cross-cluster-api-key">Documentation
	 *      on elastic.co</a>
	 */

	public final CreateCrossClusterApiKeyResponse createCrossClusterApiKey(
			Function<CreateCrossClusterApiKeyRequest.Builder, ObjectBuilder<CreateCrossClusterApiKeyRequest>> fn)
			throws IOException, ElasticsearchException {
		return createCrossClusterApiKey(fn.apply(new CreateCrossClusterApiKeyRequest.Builder()).build());
	}

	// ----- Endpoint: security.create_service_token

	/**
	 * Create a service account token.
	 * <p>
	 * Create a service accounts token for access without requiring basic
	 * authentication.
	 * <p>
	 * NOTE: Service account tokens never expire. You must actively delete them if
	 * they are no longer needed.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-create-service-token">Documentation
	 *      on elastic.co</a>
	 */

	public CreateServiceTokenResponse createServiceToken(CreateServiceTokenRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<CreateServiceTokenRequest, CreateServiceTokenResponse, ErrorResponse> endpoint = (JsonEndpoint<CreateServiceTokenRequest, CreateServiceTokenResponse, ErrorResponse>) CreateServiceTokenRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Create a service account token.
	 * <p>
	 * Create a service accounts token for access without requiring basic
	 * authentication.
	 * <p>
	 * NOTE: Service account tokens never expire. You must actively delete them if
	 * they are no longer needed.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link CreateServiceTokenRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-create-service-token">Documentation
	 *      on elastic.co</a>
	 */

	public final CreateServiceTokenResponse createServiceToken(
			Function<CreateServiceTokenRequest.Builder, ObjectBuilder<CreateServiceTokenRequest>> fn)
			throws IOException, ElasticsearchException {
		return createServiceToken(fn.apply(new CreateServiceTokenRequest.Builder()).build());
	}

	// ----- Endpoint: security.delegate_pki

	/**
	 * Delegate PKI authentication.
	 * <p>
	 * This API implements the exchange of an X509Certificate chain for an
	 * Elasticsearch access token. The certificate chain is validated, according to
	 * RFC 5280, by sequentially considering the trust configuration of every
	 * installed PKI realm that has <code>delegation.enabled</code> set to
	 * <code>true</code>. A successfully trusted client certificate is also subject
	 * to the validation of the subject distinguished name according to thw
	 * <code>username_pattern</code> of the respective realm.
	 * <p>
	 * This API is called by smart and trusted proxies, such as Kibana, which
	 * terminate the user's TLS session but still want to authenticate the user by
	 * using a PKI realm—-​as if the user connected directly to Elasticsearch.
	 * <p>
	 * IMPORTANT: The association between the subject public key in the target
	 * certificate and the corresponding private key is not validated. This is part
	 * of the TLS authentication process and it is delegated to the proxy that calls
	 * this API. The proxy is trusted to have performed the TLS authentication and
	 * this API translates that authentication into an Elasticsearch access token.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-delegate-pki">Documentation
	 *      on elastic.co</a>
	 */

	public DelegatePkiResponse delegatePki(DelegatePkiRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DelegatePkiRequest, DelegatePkiResponse, ErrorResponse> endpoint = (JsonEndpoint<DelegatePkiRequest, DelegatePkiResponse, ErrorResponse>) DelegatePkiRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Delegate PKI authentication.
	 * <p>
	 * This API implements the exchange of an X509Certificate chain for an
	 * Elasticsearch access token. The certificate chain is validated, according to
	 * RFC 5280, by sequentially considering the trust configuration of every
	 * installed PKI realm that has <code>delegation.enabled</code> set to
	 * <code>true</code>. A successfully trusted client certificate is also subject
	 * to the validation of the subject distinguished name according to thw
	 * <code>username_pattern</code> of the respective realm.
	 * <p>
	 * This API is called by smart and trusted proxies, such as Kibana, which
	 * terminate the user's TLS session but still want to authenticate the user by
	 * using a PKI realm—-​as if the user connected directly to Elasticsearch.
	 * <p>
	 * IMPORTANT: The association between the subject public key in the target
	 * certificate and the corresponding private key is not validated. This is part
	 * of the TLS authentication process and it is delegated to the proxy that calls
	 * this API. The proxy is trusted to have performed the TLS authentication and
	 * this API translates that authentication into an Elasticsearch access token.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DelegatePkiRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-delegate-pki">Documentation
	 *      on elastic.co</a>
	 */

	public final DelegatePkiResponse delegatePki(
			Function<DelegatePkiRequest.Builder, ObjectBuilder<DelegatePkiRequest>> fn)
			throws IOException, ElasticsearchException {
		return delegatePki(fn.apply(new DelegatePkiRequest.Builder()).build());
	}

	// ----- Endpoint: security.delete_privileges

	/**
	 * Delete application privileges.
	 * <p>
	 * To use this API, you must have one of the following privileges:
	 * <ul>
	 * <li>The <code>manage_security</code> cluster privilege (or a greater
	 * privilege such as <code>all</code>).</li>
	 * <li>The &quot;Manage Application Privileges&quot; global privilege for the
	 * application being referenced in the request.</li>
	 * </ul>
	 *
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-delete-privileges">Documentation
	 *      on elastic.co</a>
	 */

	public DeletePrivilegesResponse deletePrivileges(DeletePrivilegesRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeletePrivilegesRequest, DeletePrivilegesResponse, ErrorResponse> endpoint = (JsonEndpoint<DeletePrivilegesRequest, DeletePrivilegesResponse, ErrorResponse>) DeletePrivilegesRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete application privileges.
	 * <p>
	 * To use this API, you must have one of the following privileges:
	 * <ul>
	 * <li>The <code>manage_security</code> cluster privilege (or a greater
	 * privilege such as <code>all</code>).</li>
	 * <li>The &quot;Manage Application Privileges&quot; global privilege for the
	 * application being referenced in the request.</li>
	 * </ul>
	 *
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeletePrivilegesRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-delete-privileges">Documentation
	 *      on elastic.co</a>
	 */

	public final DeletePrivilegesResponse deletePrivileges(
			Function<DeletePrivilegesRequest.Builder, ObjectBuilder<DeletePrivilegesRequest>> fn)
			throws IOException, ElasticsearchException {
		return deletePrivileges(fn.apply(new DeletePrivilegesRequest.Builder()).build());
	}

	// ----- Endpoint: security.delete_role

	/**
	 * Delete roles.
	 * <p>
	 * Delete roles in the native realm. The role management APIs are generally the
	 * preferred way to manage roles, rather than using file-based role management.
	 * The delete roles API cannot remove roles that are defined in roles files.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-delete-role">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteRoleResponse deleteRole(DeleteRoleRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteRoleRequest, DeleteRoleResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteRoleRequest, DeleteRoleResponse, ErrorResponse>) DeleteRoleRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete roles.
	 * <p>
	 * Delete roles in the native realm. The role management APIs are generally the
	 * preferred way to manage roles, rather than using file-based role management.
	 * The delete roles API cannot remove roles that are defined in roles files.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteRoleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-delete-role">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteRoleResponse deleteRole(Function<DeleteRoleRequest.Builder, ObjectBuilder<DeleteRoleRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteRole(fn.apply(new DeleteRoleRequest.Builder()).build());
	}

	// ----- Endpoint: security.delete_role_mapping

	/**
	 * Delete role mappings.
	 * <p>
	 * Role mappings define which roles are assigned to each user. The role mapping
	 * APIs are generally the preferred way to manage role mappings rather than
	 * using role mapping files. The delete role mappings API cannot remove role
	 * mappings that are defined in role mapping files.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-delete-role-mapping">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteRoleMappingResponse deleteRoleMapping(DeleteRoleMappingRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteRoleMappingRequest, DeleteRoleMappingResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteRoleMappingRequest, DeleteRoleMappingResponse, ErrorResponse>) DeleteRoleMappingRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Delete role mappings.
	 * <p>
	 * Role mappings define which roles are assigned to each user. The role mapping
	 * APIs are generally the preferred way to manage role mappings rather than
	 * using role mapping files. The delete role mappings API cannot remove role
	 * mappings that are defined in role mapping files.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteRoleMappingRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-delete-role-mapping">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteRoleMappingResponse deleteRoleMapping(
			Function<DeleteRoleMappingRequest.Builder, ObjectBuilder<DeleteRoleMappingRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteRoleMapping(fn.apply(new DeleteRoleMappingRequest.Builder()).build());
	}

	// ----- Endpoint: security.delete_service_token

	/**
	 * Delete service account tokens.
	 * <p>
	 * Delete service account tokens for a service in a specified namespace.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-delete-service-token">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteServiceTokenResponse deleteServiceToken(DeleteServiceTokenRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteServiceTokenRequest, DeleteServiceTokenResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteServiceTokenRequest, DeleteServiceTokenResponse, ErrorResponse>) DeleteServiceTokenRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-delete-service-token">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteServiceTokenResponse deleteServiceToken(
			Function<DeleteServiceTokenRequest.Builder, ObjectBuilder<DeleteServiceTokenRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteServiceToken(fn.apply(new DeleteServiceTokenRequest.Builder()).build());
	}

	// ----- Endpoint: security.delete_user

	/**
	 * Delete users.
	 * <p>
	 * Delete users from the native realm.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-delete-user">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteUserResponse deleteUser(DeleteUserRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteUserRequest, DeleteUserResponse, ErrorResponse> endpoint = (JsonEndpoint<DeleteUserRequest, DeleteUserResponse, ErrorResponse>) DeleteUserRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-delete-user">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteUserResponse deleteUser(Function<DeleteUserRequest.Builder, ObjectBuilder<DeleteUserRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteUser(fn.apply(new DeleteUserRequest.Builder()).build());
	}

	// ----- Endpoint: security.disable_user

	/**
	 * Disable users.
	 * <p>
	 * Disable users in the native realm. By default, when you create users, they
	 * are enabled. You can use this API to revoke a user's access to Elasticsearch.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-disable-user">Documentation
	 *      on elastic.co</a>
	 */

	public DisableUserResponse disableUser(DisableUserRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DisableUserRequest, DisableUserResponse, ErrorResponse> endpoint = (JsonEndpoint<DisableUserRequest, DisableUserResponse, ErrorResponse>) DisableUserRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Disable users.
	 * <p>
	 * Disable users in the native realm. By default, when you create users, they
	 * are enabled. You can use this API to revoke a user's access to Elasticsearch.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DisableUserRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-disable-user">Documentation
	 *      on elastic.co</a>
	 */

	public final DisableUserResponse disableUser(
			Function<DisableUserRequest.Builder, ObjectBuilder<DisableUserRequest>> fn)
			throws IOException, ElasticsearchException {
		return disableUser(fn.apply(new DisableUserRequest.Builder()).build());
	}

	// ----- Endpoint: security.disable_user_profile

	/**
	 * Disable a user profile.
	 * <p>
	 * Disable user profiles so that they are not visible in user profile searches.
	 * <p>
	 * NOTE: The user profile feature is designed only for use by Kibana and
	 * Elastic's Observability, Enterprise Search, and Elastic Security solutions.
	 * Individual users and external applications should not call this API directly.
	 * Elastic reserves the right to change or remove this feature in future
	 * releases without prior notice.
	 * <p>
	 * When you activate a user profile, its automatically enabled and visible in
	 * user profile searches. You can use the disable user profile API to disable a
	 * user profile so it’s not visible in these searches. To re-enable a disabled
	 * user profile, use the enable user profile API .
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-disable-user-profile">Documentation
	 *      on elastic.co</a>
	 */

	public DisableUserProfileResponse disableUserProfile(DisableUserProfileRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DisableUserProfileRequest, DisableUserProfileResponse, ErrorResponse> endpoint = (JsonEndpoint<DisableUserProfileRequest, DisableUserProfileResponse, ErrorResponse>) DisableUserProfileRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Disable a user profile.
	 * <p>
	 * Disable user profiles so that they are not visible in user profile searches.
	 * <p>
	 * NOTE: The user profile feature is designed only for use by Kibana and
	 * Elastic's Observability, Enterprise Search, and Elastic Security solutions.
	 * Individual users and external applications should not call this API directly.
	 * Elastic reserves the right to change or remove this feature in future
	 * releases without prior notice.
	 * <p>
	 * When you activate a user profile, its automatically enabled and visible in
	 * user profile searches. You can use the disable user profile API to disable a
	 * user profile so it’s not visible in these searches. To re-enable a disabled
	 * user profile, use the enable user profile API .
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DisableUserProfileRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-disable-user-profile">Documentation
	 *      on elastic.co</a>
	 */

	public final DisableUserProfileResponse disableUserProfile(
			Function<DisableUserProfileRequest.Builder, ObjectBuilder<DisableUserProfileRequest>> fn)
			throws IOException, ElasticsearchException {
		return disableUserProfile(fn.apply(new DisableUserProfileRequest.Builder()).build());
	}

	// ----- Endpoint: security.enable_user

	/**
	 * Enable users.
	 * <p>
	 * Enable users in the native realm. By default, when you create users, they are
	 * enabled.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-enable-user">Documentation
	 *      on elastic.co</a>
	 */

	public EnableUserResponse enableUser(EnableUserRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<EnableUserRequest, EnableUserResponse, ErrorResponse> endpoint = (JsonEndpoint<EnableUserRequest, EnableUserResponse, ErrorResponse>) EnableUserRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Enable users.
	 * <p>
	 * Enable users in the native realm. By default, when you create users, they are
	 * enabled.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link EnableUserRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-enable-user">Documentation
	 *      on elastic.co</a>
	 */

	public final EnableUserResponse enableUser(Function<EnableUserRequest.Builder, ObjectBuilder<EnableUserRequest>> fn)
			throws IOException, ElasticsearchException {
		return enableUser(fn.apply(new EnableUserRequest.Builder()).build());
	}

	// ----- Endpoint: security.enable_user_profile

	/**
	 * Enable a user profile.
	 * <p>
	 * Enable user profiles to make them visible in user profile searches.
	 * <p>
	 * NOTE: The user profile feature is designed only for use by Kibana and
	 * Elastic's Observability, Enterprise Search, and Elastic Security solutions.
	 * Individual users and external applications should not call this API directly.
	 * Elastic reserves the right to change or remove this feature in future
	 * releases without prior notice.
	 * <p>
	 * When you activate a user profile, it's automatically enabled and visible in
	 * user profile searches. If you later disable the user profile, you can use the
	 * enable user profile API to make the profile visible in these searches again.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-enable-user-profile">Documentation
	 *      on elastic.co</a>
	 */

	public EnableUserProfileResponse enableUserProfile(EnableUserProfileRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<EnableUserProfileRequest, EnableUserProfileResponse, ErrorResponse> endpoint = (JsonEndpoint<EnableUserProfileRequest, EnableUserProfileResponse, ErrorResponse>) EnableUserProfileRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Enable a user profile.
	 * <p>
	 * Enable user profiles to make them visible in user profile searches.
	 * <p>
	 * NOTE: The user profile feature is designed only for use by Kibana and
	 * Elastic's Observability, Enterprise Search, and Elastic Security solutions.
	 * Individual users and external applications should not call this API directly.
	 * Elastic reserves the right to change or remove this feature in future
	 * releases without prior notice.
	 * <p>
	 * When you activate a user profile, it's automatically enabled and visible in
	 * user profile searches. If you later disable the user profile, you can use the
	 * enable user profile API to make the profile visible in these searches again.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link EnableUserProfileRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-enable-user-profile">Documentation
	 *      on elastic.co</a>
	 */

	public final EnableUserProfileResponse enableUserProfile(
			Function<EnableUserProfileRequest.Builder, ObjectBuilder<EnableUserProfileRequest>> fn)
			throws IOException, ElasticsearchException {
		return enableUserProfile(fn.apply(new EnableUserProfileRequest.Builder()).build());
	}

	// ----- Endpoint: security.enroll_kibana

	/**
	 * Enroll Kibana.
	 * <p>
	 * Enable a Kibana instance to configure itself for communication with a secured
	 * Elasticsearch cluster.
	 * <p>
	 * NOTE: This API is currently intended for internal use only by Kibana. Kibana
	 * uses this API internally to configure itself for communications with an
	 * Elasticsearch cluster that already has security features enabled.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-enroll-kibana">Documentation
	 *      on elastic.co</a>
	 */
	public EnrollKibanaResponse enrollKibana() throws IOException, ElasticsearchException {
		return this.transport.performRequest(EnrollKibanaRequest._INSTANCE, EnrollKibanaRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: security.enroll_node

	/**
	 * Enroll a node.
	 * <p>
	 * Enroll a new node to allow it to join an existing cluster with security
	 * features enabled.
	 * <p>
	 * The response contains all the necessary information for the joining node to
	 * bootstrap discovery and security related settings so that it can successfully
	 * join the cluster. The response contains key and certificate material that
	 * allows the caller to generate valid signed certificates for the HTTP layer of
	 * all nodes in the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-enroll-node">Documentation
	 *      on elastic.co</a>
	 */
	public EnrollNodeResponse enrollNode() throws IOException, ElasticsearchException {
		return this.transport.performRequest(EnrollNodeRequest._INSTANCE, EnrollNodeRequest._ENDPOINT,
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-get-api-key">Documentation
	 *      on elastic.co</a>
	 */

	public GetApiKeyResponse getApiKey(GetApiKeyRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetApiKeyRequest, GetApiKeyResponse, ErrorResponse> endpoint = (JsonEndpoint<GetApiKeyRequest, GetApiKeyResponse, ErrorResponse>) GetApiKeyRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-get-api-key">Documentation
	 *      on elastic.co</a>
	 */

	public final GetApiKeyResponse getApiKey(Function<GetApiKeyRequest.Builder, ObjectBuilder<GetApiKeyRequest>> fn)
			throws IOException, ElasticsearchException {
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-get-api-key">Documentation
	 *      on elastic.co</a>
	 */

	public GetApiKeyResponse getApiKey() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetApiKeyRequest.Builder().build(), GetApiKeyRequest._ENDPOINT,
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-get-builtin-privileges">Documentation
	 *      on elastic.co</a>
	 */
	public GetBuiltinPrivilegesResponse getBuiltinPrivileges() throws IOException, ElasticsearchException {
		return this.transport.performRequest(GetBuiltinPrivilegesRequest._INSTANCE,
				GetBuiltinPrivilegesRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: security.get_privileges

	/**
	 * Get application privileges.
	 * <p>
	 * To use this API, you must have one of the following privileges:
	 * <ul>
	 * <li>The <code>read_security</code> cluster privilege (or a greater privilege
	 * such as <code>manage_security</code> or <code>all</code>).</li>
	 * <li>The &quot;Manage Application Privileges&quot; global privilege for the
	 * application being referenced in the request.</li>
	 * </ul>
	 *
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-get-privileges">Documentation
	 *      on elastic.co</a>
	 */

	public GetPrivilegesResponse getPrivileges(GetPrivilegesRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetPrivilegesRequest, GetPrivilegesResponse, ErrorResponse> endpoint = (JsonEndpoint<GetPrivilegesRequest, GetPrivilegesResponse, ErrorResponse>) GetPrivilegesRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get application privileges.
	 * <p>
	 * To use this API, you must have one of the following privileges:
	 * <ul>
	 * <li>The <code>read_security</code> cluster privilege (or a greater privilege
	 * such as <code>manage_security</code> or <code>all</code>).</li>
	 * <li>The &quot;Manage Application Privileges&quot; global privilege for the
	 * application being referenced in the request.</li>
	 * </ul>
	 *
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetPrivilegesRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-get-privileges">Documentation
	 *      on elastic.co</a>
	 */

	public final GetPrivilegesResponse getPrivileges(
			Function<GetPrivilegesRequest.Builder, ObjectBuilder<GetPrivilegesRequest>> fn)
			throws IOException, ElasticsearchException {
		return getPrivileges(fn.apply(new GetPrivilegesRequest.Builder()).build());
	}

	/**
	 * Get application privileges.
	 * <p>
	 * To use this API, you must have one of the following privileges:
	 * <ul>
	 * <li>The <code>read_security</code> cluster privilege (or a greater privilege
	 * such as <code>manage_security</code> or <code>all</code>).</li>
	 * <li>The &quot;Manage Application Privileges&quot; global privilege for the
	 * application being referenced in the request.</li>
	 * </ul>
	 *
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-get-privileges">Documentation
	 *      on elastic.co</a>
	 */

	public GetPrivilegesResponse getPrivileges() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetPrivilegesRequest.Builder().build(), GetPrivilegesRequest._ENDPOINT,
				this.transportOptions);
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-get-role">Documentation
	 *      on elastic.co</a>
	 */

	public GetRoleResponse getRole(GetRoleRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetRoleRequest, GetRoleResponse, ErrorResponse> endpoint = (JsonEndpoint<GetRoleRequest, GetRoleResponse, ErrorResponse>) GetRoleRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-get-role">Documentation
	 *      on elastic.co</a>
	 */

	public final GetRoleResponse getRole(Function<GetRoleRequest.Builder, ObjectBuilder<GetRoleRequest>> fn)
			throws IOException, ElasticsearchException {
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-get-role">Documentation
	 *      on elastic.co</a>
	 */

	public GetRoleResponse getRole() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetRoleRequest.Builder().build(), GetRoleRequest._ENDPOINT,
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-get-role-mapping">Documentation
	 *      on elastic.co</a>
	 */

	public GetRoleMappingResponse getRoleMapping(GetRoleMappingRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetRoleMappingRequest, GetRoleMappingResponse, ErrorResponse> endpoint = (JsonEndpoint<GetRoleMappingRequest, GetRoleMappingResponse, ErrorResponse>) GetRoleMappingRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-get-role-mapping">Documentation
	 *      on elastic.co</a>
	 */

	public final GetRoleMappingResponse getRoleMapping(
			Function<GetRoleMappingRequest.Builder, ObjectBuilder<GetRoleMappingRequest>> fn)
			throws IOException, ElasticsearchException {
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-get-role-mapping">Documentation
	 *      on elastic.co</a>
	 */

	public GetRoleMappingResponse getRoleMapping() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetRoleMappingRequest.Builder().build(),
				GetRoleMappingRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: security.get_service_accounts

	/**
	 * Get service accounts.
	 * <p>
	 * Get a list of service accounts that match the provided path parameters.
	 * <p>
	 * NOTE: Currently, only the <code>elastic/fleet-server</code> service account
	 * is available.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-get-service-accounts">Documentation
	 *      on elastic.co</a>
	 */

	public GetServiceAccountsResponse getServiceAccounts(GetServiceAccountsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetServiceAccountsRequest, GetServiceAccountsResponse, ErrorResponse> endpoint = (JsonEndpoint<GetServiceAccountsRequest, GetServiceAccountsResponse, ErrorResponse>) GetServiceAccountsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get service accounts.
	 * <p>
	 * Get a list of service accounts that match the provided path parameters.
	 * <p>
	 * NOTE: Currently, only the <code>elastic/fleet-server</code> service account
	 * is available.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetServiceAccountsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-get-service-accounts">Documentation
	 *      on elastic.co</a>
	 */

	public final GetServiceAccountsResponse getServiceAccounts(
			Function<GetServiceAccountsRequest.Builder, ObjectBuilder<GetServiceAccountsRequest>> fn)
			throws IOException, ElasticsearchException {
		return getServiceAccounts(fn.apply(new GetServiceAccountsRequest.Builder()).build());
	}

	/**
	 * Get service accounts.
	 * <p>
	 * Get a list of service accounts that match the provided path parameters.
	 * <p>
	 * NOTE: Currently, only the <code>elastic/fleet-server</code> service account
	 * is available.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-get-service-accounts">Documentation
	 *      on elastic.co</a>
	 */

	public GetServiceAccountsResponse getServiceAccounts() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetServiceAccountsRequest.Builder().build(),
				GetServiceAccountsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: security.get_service_credentials

	/**
	 * Get service account credentials.
	 * <p>
	 * To use this API, you must have at least the <code>read_security</code>
	 * cluster privilege (or a greater privilege such as
	 * <code>manage_service_account</code> or <code>manage_security</code>).
	 * <p>
	 * The response includes service account tokens that were created with the
	 * create service account tokens API as well as file-backed tokens from all
	 * nodes of the cluster.
	 * <p>
	 * NOTE: For tokens backed by the <code>service_tokens</code> file, the API
	 * collects them from all nodes of the cluster. Tokens with the same name from
	 * different nodes are assumed to be the same token and are only counted once
	 * towards the total number of service tokens.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-get-service-credentials">Documentation
	 *      on elastic.co</a>
	 */

	public GetServiceCredentialsResponse getServiceCredentials(GetServiceCredentialsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetServiceCredentialsRequest, GetServiceCredentialsResponse, ErrorResponse> endpoint = (JsonEndpoint<GetServiceCredentialsRequest, GetServiceCredentialsResponse, ErrorResponse>) GetServiceCredentialsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get service account credentials.
	 * <p>
	 * To use this API, you must have at least the <code>read_security</code>
	 * cluster privilege (or a greater privilege such as
	 * <code>manage_service_account</code> or <code>manage_security</code>).
	 * <p>
	 * The response includes service account tokens that were created with the
	 * create service account tokens API as well as file-backed tokens from all
	 * nodes of the cluster.
	 * <p>
	 * NOTE: For tokens backed by the <code>service_tokens</code> file, the API
	 * collects them from all nodes of the cluster. Tokens with the same name from
	 * different nodes are assumed to be the same token and are only counted once
	 * towards the total number of service tokens.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetServiceCredentialsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-get-service-credentials">Documentation
	 *      on elastic.co</a>
	 */

	public final GetServiceCredentialsResponse getServiceCredentials(
			Function<GetServiceCredentialsRequest.Builder, ObjectBuilder<GetServiceCredentialsRequest>> fn)
			throws IOException, ElasticsearchException {
		return getServiceCredentials(fn.apply(new GetServiceCredentialsRequest.Builder()).build());
	}

	// ----- Endpoint: security.get_settings

	/**
	 * Get security index settings.
	 * <p>
	 * Get the user-configurable settings for the security internal index
	 * (<code>.security</code> and associated indices). Only a subset of the index
	 * settings — those that are user-configurable—will be shown. This includes:
	 * <ul>
	 * <li><code>index.auto_expand_replicas</code></li>
	 * <li><code>index.number_of_replicas</code></li>
	 * </ul>
	 *
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-get-settings">Documentation
	 *      on elastic.co</a>
	 */

	public GetSecuritySettingsResponse getSettings(GetSecuritySettingsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetSecuritySettingsRequest, GetSecuritySettingsResponse, ErrorResponse> endpoint = (JsonEndpoint<GetSecuritySettingsRequest, GetSecuritySettingsResponse, ErrorResponse>) GetSecuritySettingsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get security index settings.
	 * <p>
	 * Get the user-configurable settings for the security internal index
	 * (<code>.security</code> and associated indices). Only a subset of the index
	 * settings — those that are user-configurable—will be shown. This includes:
	 * <ul>
	 * <li><code>index.auto_expand_replicas</code></li>
	 * <li><code>index.number_of_replicas</code></li>
	 * </ul>
	 *
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetSecuritySettingsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-get-settings">Documentation
	 *      on elastic.co</a>
	 */

	public final GetSecuritySettingsResponse getSettings(
			Function<GetSecuritySettingsRequest.Builder, ObjectBuilder<GetSecuritySettingsRequest>> fn)
			throws IOException, ElasticsearchException {
		return getSettings(fn.apply(new GetSecuritySettingsRequest.Builder()).build());
	}

	/**
	 * Get security index settings.
	 * <p>
	 * Get the user-configurable settings for the security internal index
	 * (<code>.security</code> and associated indices). Only a subset of the index
	 * settings — those that are user-configurable—will be shown. This includes:
	 * <ul>
	 * <li><code>index.auto_expand_replicas</code></li>
	 * <li><code>index.number_of_replicas</code></li>
	 * </ul>
	 *
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-get-settings">Documentation
	 *      on elastic.co</a>
	 */

	public GetSecuritySettingsResponse getSettings() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetSecuritySettingsRequest.Builder().build(),
				GetSecuritySettingsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: security.get_token

	/**
	 * Get a token.
	 * <p>
	 * Create a bearer token for access without requiring basic authentication. The
	 * tokens are created by the Elasticsearch Token Service, which is automatically
	 * enabled when you configure TLS on the HTTP interface. Alternatively, you can
	 * explicitly enable the <code>xpack.security.authc.token.enabled</code>
	 * setting. When you are running in production mode, a bootstrap check prevents
	 * you from enabling the token service unless you also enable TLS on the HTTP
	 * interface.
	 * <p>
	 * The get token API takes the same parameters as a typical OAuth 2.0 token API
	 * except for the use of a JSON request body.
	 * <p>
	 * A successful get token API call returns a JSON structure that contains the
	 * access token, the amount of time (seconds) that the token expires in, the
	 * type, and the scope if available.
	 * <p>
	 * The tokens returned by the get token API have a finite period of time for
	 * which they are valid and after that time period, they can no longer be used.
	 * That time period is defined by the
	 * <code>xpack.security.authc.token.timeout</code> setting. If you want to
	 * invalidate a token immediately, you can do so by using the invalidate token
	 * API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-get-token">Documentation
	 *      on elastic.co</a>
	 */

	public GetTokenResponse getToken(GetTokenRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetTokenRequest, GetTokenResponse, ErrorResponse> endpoint = (JsonEndpoint<GetTokenRequest, GetTokenResponse, ErrorResponse>) GetTokenRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get a token.
	 * <p>
	 * Create a bearer token for access without requiring basic authentication. The
	 * tokens are created by the Elasticsearch Token Service, which is automatically
	 * enabled when you configure TLS on the HTTP interface. Alternatively, you can
	 * explicitly enable the <code>xpack.security.authc.token.enabled</code>
	 * setting. When you are running in production mode, a bootstrap check prevents
	 * you from enabling the token service unless you also enable TLS on the HTTP
	 * interface.
	 * <p>
	 * The get token API takes the same parameters as a typical OAuth 2.0 token API
	 * except for the use of a JSON request body.
	 * <p>
	 * A successful get token API call returns a JSON structure that contains the
	 * access token, the amount of time (seconds) that the token expires in, the
	 * type, and the scope if available.
	 * <p>
	 * The tokens returned by the get token API have a finite period of time for
	 * which they are valid and after that time period, they can no longer be used.
	 * That time period is defined by the
	 * <code>xpack.security.authc.token.timeout</code> setting. If you want to
	 * invalidate a token immediately, you can do so by using the invalidate token
	 * API.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetTokenRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-get-token">Documentation
	 *      on elastic.co</a>
	 */

	public final GetTokenResponse getToken(Function<GetTokenRequest.Builder, ObjectBuilder<GetTokenRequest>> fn)
			throws IOException, ElasticsearchException {
		return getToken(fn.apply(new GetTokenRequest.Builder()).build());
	}

	/**
	 * Get a token.
	 * <p>
	 * Create a bearer token for access without requiring basic authentication. The
	 * tokens are created by the Elasticsearch Token Service, which is automatically
	 * enabled when you configure TLS on the HTTP interface. Alternatively, you can
	 * explicitly enable the <code>xpack.security.authc.token.enabled</code>
	 * setting. When you are running in production mode, a bootstrap check prevents
	 * you from enabling the token service unless you also enable TLS on the HTTP
	 * interface.
	 * <p>
	 * The get token API takes the same parameters as a typical OAuth 2.0 token API
	 * except for the use of a JSON request body.
	 * <p>
	 * A successful get token API call returns a JSON structure that contains the
	 * access token, the amount of time (seconds) that the token expires in, the
	 * type, and the scope if available.
	 * <p>
	 * The tokens returned by the get token API have a finite period of time for
	 * which they are valid and after that time period, they can no longer be used.
	 * That time period is defined by the
	 * <code>xpack.security.authc.token.timeout</code> setting. If you want to
	 * invalidate a token immediately, you can do so by using the invalidate token
	 * API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-get-token">Documentation
	 *      on elastic.co</a>
	 */

	public GetTokenResponse getToken() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetTokenRequest.Builder().build(), GetTokenRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: security.get_user

	/**
	 * Get users.
	 * <p>
	 * Get information about users in the native realm and built-in users.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-get-user">Documentation
	 *      on elastic.co</a>
	 */

	public GetUserResponse getUser(GetUserRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetUserRequest, GetUserResponse, ErrorResponse> endpoint = (JsonEndpoint<GetUserRequest, GetUserResponse, ErrorResponse>) GetUserRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-get-user">Documentation
	 *      on elastic.co</a>
	 */

	public final GetUserResponse getUser(Function<GetUserRequest.Builder, ObjectBuilder<GetUserRequest>> fn)
			throws IOException, ElasticsearchException {
		return getUser(fn.apply(new GetUserRequest.Builder()).build());
	}

	/**
	 * Get users.
	 * <p>
	 * Get information about users in the native realm and built-in users.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-get-user">Documentation
	 *      on elastic.co</a>
	 */

	public GetUserResponse getUser() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetUserRequest.Builder().build(), GetUserRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: security.get_user_privileges

	/**
	 * Get user privileges.
	 * <p>
	 * Get the security privileges for the logged in user. All users can use this
	 * API, but only to determine their own privileges. To check the privileges of
	 * other users, you must use the run as feature. To check whether a user has a
	 * specific list of privileges, use the has privileges API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-get-user-privileges">Documentation
	 *      on elastic.co</a>
	 */
	public GetUserPrivilegesResponse getUserPrivileges() throws IOException, ElasticsearchException {
		return this.transport.performRequest(GetUserPrivilegesRequest._INSTANCE, GetUserPrivilegesRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: security.get_user_profile

	/**
	 * Get a user profile.
	 * <p>
	 * Get a user's profile using the unique profile ID.
	 * <p>
	 * NOTE: The user profile feature is designed only for use by Kibana and
	 * Elastic's Observability, Enterprise Search, and Elastic Security solutions.
	 * Individual users and external applications should not call this API directly.
	 * Elastic reserves the right to change or remove this feature in future
	 * releases without prior notice.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-get-user-profile">Documentation
	 *      on elastic.co</a>
	 */

	public GetUserProfileResponse getUserProfile(GetUserProfileRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetUserProfileRequest, GetUserProfileResponse, ErrorResponse> endpoint = (JsonEndpoint<GetUserProfileRequest, GetUserProfileResponse, ErrorResponse>) GetUserProfileRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Get a user profile.
	 * <p>
	 * Get a user's profile using the unique profile ID.
	 * <p>
	 * NOTE: The user profile feature is designed only for use by Kibana and
	 * Elastic's Observability, Enterprise Search, and Elastic Security solutions.
	 * Individual users and external applications should not call this API directly.
	 * Elastic reserves the right to change or remove this feature in future
	 * releases without prior notice.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetUserProfileRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-get-user-profile">Documentation
	 *      on elastic.co</a>
	 */

	public final GetUserProfileResponse getUserProfile(
			Function<GetUserProfileRequest.Builder, ObjectBuilder<GetUserProfileRequest>> fn)
			throws IOException, ElasticsearchException {
		return getUserProfile(fn.apply(new GetUserProfileRequest.Builder()).build());
	}

	// ----- Endpoint: security.grant_api_key

	/**
	 * Grant an API key.
	 * <p>
	 * Create an API key on behalf of another user. This API is similar to the
	 * create API keys API, however it creates the API key for a user that is
	 * different than the user that runs the API. The caller must have
	 * authentication credentials for the user on whose behalf the API key will be
	 * created. It is not possible to use this API to create an API key without that
	 * user's credentials. The supported user authentication credential types are:
	 * <ul>
	 * <li>username and password</li>
	 * <li>Elasticsearch access tokens</li>
	 * <li>JWTs</li>
	 * </ul>
	 * <p>
	 * The user, for whom the authentication credentials is provided, can optionally
	 * &quot;run as&quot; (impersonate) another user. In this case, the API key will
	 * be created on behalf of the impersonated user.
	 * <p>
	 * This API is intended be used by applications that need to create and manage
	 * API keys for end users, but cannot guarantee that those users have permission
	 * to create API keys on their own behalf. The API keys are created by the
	 * Elasticsearch API key service, which is automatically enabled.
	 * <p>
	 * A successful grant API key API call returns a JSON structure that contains
	 * the API key, its unique id, and its name. If applicable, it also returns
	 * expiration information for the API key in milliseconds.
	 * <p>
	 * By default, API keys never expire. You can specify expiration information
	 * when you create the API keys.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-grant-api-key">Documentation
	 *      on elastic.co</a>
	 */

	public GrantApiKeyResponse grantApiKey(GrantApiKeyRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GrantApiKeyRequest, GrantApiKeyResponse, ErrorResponse> endpoint = (JsonEndpoint<GrantApiKeyRequest, GrantApiKeyResponse, ErrorResponse>) GrantApiKeyRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Grant an API key.
	 * <p>
	 * Create an API key on behalf of another user. This API is similar to the
	 * create API keys API, however it creates the API key for a user that is
	 * different than the user that runs the API. The caller must have
	 * authentication credentials for the user on whose behalf the API key will be
	 * created. It is not possible to use this API to create an API key without that
	 * user's credentials. The supported user authentication credential types are:
	 * <ul>
	 * <li>username and password</li>
	 * <li>Elasticsearch access tokens</li>
	 * <li>JWTs</li>
	 * </ul>
	 * <p>
	 * The user, for whom the authentication credentials is provided, can optionally
	 * &quot;run as&quot; (impersonate) another user. In this case, the API key will
	 * be created on behalf of the impersonated user.
	 * <p>
	 * This API is intended be used by applications that need to create and manage
	 * API keys for end users, but cannot guarantee that those users have permission
	 * to create API keys on their own behalf. The API keys are created by the
	 * Elasticsearch API key service, which is automatically enabled.
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-grant-api-key">Documentation
	 *      on elastic.co</a>
	 */

	public final GrantApiKeyResponse grantApiKey(
			Function<GrantApiKeyRequest.Builder, ObjectBuilder<GrantApiKeyRequest>> fn)
			throws IOException, ElasticsearchException {
		return grantApiKey(fn.apply(new GrantApiKeyRequest.Builder()).build());
	}

	// ----- Endpoint: security.has_privileges

	/**
	 * Check user privileges.
	 * <p>
	 * Determine whether the specified user has a specified list of privileges. All
	 * users can use this API, but only to determine their own privileges. To check
	 * the privileges of other users, you must use the run as feature.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-has-privileges">Documentation
	 *      on elastic.co</a>
	 */

	public HasPrivilegesResponse hasPrivileges(HasPrivilegesRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<HasPrivilegesRequest, HasPrivilegesResponse, ErrorResponse> endpoint = (JsonEndpoint<HasPrivilegesRequest, HasPrivilegesResponse, ErrorResponse>) HasPrivilegesRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Check user privileges.
	 * <p>
	 * Determine whether the specified user has a specified list of privileges. All
	 * users can use this API, but only to determine their own privileges. To check
	 * the privileges of other users, you must use the run as feature.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link HasPrivilegesRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-has-privileges">Documentation
	 *      on elastic.co</a>
	 */

	public final HasPrivilegesResponse hasPrivileges(
			Function<HasPrivilegesRequest.Builder, ObjectBuilder<HasPrivilegesRequest>> fn)
			throws IOException, ElasticsearchException {
		return hasPrivileges(fn.apply(new HasPrivilegesRequest.Builder()).build());
	}

	/**
	 * Check user privileges.
	 * <p>
	 * Determine whether the specified user has a specified list of privileges. All
	 * users can use this API, but only to determine their own privileges. To check
	 * the privileges of other users, you must use the run as feature.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-has-privileges">Documentation
	 *      on elastic.co</a>
	 */

	public HasPrivilegesResponse hasPrivileges() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new HasPrivilegesRequest.Builder().build(), HasPrivilegesRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: security.has_privileges_user_profile

	/**
	 * Check user profile privileges.
	 * <p>
	 * Determine whether the users associated with the specified user profile IDs
	 * have all the requested privileges.
	 * <p>
	 * NOTE: The user profile feature is designed only for use by Kibana and
	 * Elastic's Observability, Enterprise Search, and Elastic Security solutions.
	 * Individual users and external applications should not call this API directly.
	 * Elastic reserves the right to change or remove this feature in future
	 * releases without prior notice.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-has-privileges-user-profile">Documentation
	 *      on elastic.co</a>
	 */

	public HasPrivilegesUserProfileResponse hasPrivilegesUserProfile(HasPrivilegesUserProfileRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<HasPrivilegesUserProfileRequest, HasPrivilegesUserProfileResponse, ErrorResponse> endpoint = (JsonEndpoint<HasPrivilegesUserProfileRequest, HasPrivilegesUserProfileResponse, ErrorResponse>) HasPrivilegesUserProfileRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Check user profile privileges.
	 * <p>
	 * Determine whether the users associated with the specified user profile IDs
	 * have all the requested privileges.
	 * <p>
	 * NOTE: The user profile feature is designed only for use by Kibana and
	 * Elastic's Observability, Enterprise Search, and Elastic Security solutions.
	 * Individual users and external applications should not call this API directly.
	 * Elastic reserves the right to change or remove this feature in future
	 * releases without prior notice.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link HasPrivilegesUserProfileRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-has-privileges-user-profile">Documentation
	 *      on elastic.co</a>
	 */

	public final HasPrivilegesUserProfileResponse hasPrivilegesUserProfile(
			Function<HasPrivilegesUserProfileRequest.Builder, ObjectBuilder<HasPrivilegesUserProfileRequest>> fn)
			throws IOException, ElasticsearchException {
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
	 * <p>
	 * To use this API, you must have at least the <code>manage_security</code>,
	 * <code>manage_api_key</code>, or <code>manage_own_api_key</code> cluster
	 * privileges. The <code>manage_security</code> privilege allows deleting any
	 * API key, including both REST and cross cluster API keys. The
	 * <code>manage_api_key</code> privilege allows deleting any REST API key, but
	 * not cross cluster API keys. The <code>manage_own_api_key</code> only allows
	 * deleting REST API keys that are owned by the user. In addition, with the
	 * <code>manage_own_api_key</code> privilege, an invalidation request must be
	 * issued in one of the three formats:
	 * <ul>
	 * <li>Set the parameter <code>owner=true</code>.</li>
	 * <li>Or, set both <code>username</code> and <code>realm_name</code> to match
	 * the user's identity.</li>
	 * <li>Or, if the request is issued by an API key, that is to say an API key
	 * invalidates itself, specify its ID in the <code>ids</code> field.</li>
	 * </ul>
	 *
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-invalidate-api-key">Documentation
	 *      on elastic.co</a>
	 */

	public InvalidateApiKeyResponse invalidateApiKey(InvalidateApiKeyRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<InvalidateApiKeyRequest, InvalidateApiKeyResponse, ErrorResponse> endpoint = (JsonEndpoint<InvalidateApiKeyRequest, InvalidateApiKeyResponse, ErrorResponse>) InvalidateApiKeyRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Invalidate API keys.
	 * <p>
	 * This API invalidates API keys created by the create API key or grant API key
	 * APIs. Invalidated API keys fail authentication, but they can still be viewed
	 * using the get API key information and query API key information APIs, for at
	 * least the configured retention period, until they are automatically deleted.
	 * <p>
	 * To use this API, you must have at least the <code>manage_security</code>,
	 * <code>manage_api_key</code>, or <code>manage_own_api_key</code> cluster
	 * privileges. The <code>manage_security</code> privilege allows deleting any
	 * API key, including both REST and cross cluster API keys. The
	 * <code>manage_api_key</code> privilege allows deleting any REST API key, but
	 * not cross cluster API keys. The <code>manage_own_api_key</code> only allows
	 * deleting REST API keys that are owned by the user. In addition, with the
	 * <code>manage_own_api_key</code> privilege, an invalidation request must be
	 * issued in one of the three formats:
	 * <ul>
	 * <li>Set the parameter <code>owner=true</code>.</li>
	 * <li>Or, set both <code>username</code> and <code>realm_name</code> to match
	 * the user's identity.</li>
	 * <li>Or, if the request is issued by an API key, that is to say an API key
	 * invalidates itself, specify its ID in the <code>ids</code> field.</li>
	 * </ul>
	 *
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link InvalidateApiKeyRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-invalidate-api-key">Documentation
	 *      on elastic.co</a>
	 */

	public final InvalidateApiKeyResponse invalidateApiKey(
			Function<InvalidateApiKeyRequest.Builder, ObjectBuilder<InvalidateApiKeyRequest>> fn)
			throws IOException, ElasticsearchException {
		return invalidateApiKey(fn.apply(new InvalidateApiKeyRequest.Builder()).build());
	}

	/**
	 * Invalidate API keys.
	 * <p>
	 * This API invalidates API keys created by the create API key or grant API key
	 * APIs. Invalidated API keys fail authentication, but they can still be viewed
	 * using the get API key information and query API key information APIs, for at
	 * least the configured retention period, until they are automatically deleted.
	 * <p>
	 * To use this API, you must have at least the <code>manage_security</code>,
	 * <code>manage_api_key</code>, or <code>manage_own_api_key</code> cluster
	 * privileges. The <code>manage_security</code> privilege allows deleting any
	 * API key, including both REST and cross cluster API keys. The
	 * <code>manage_api_key</code> privilege allows deleting any REST API key, but
	 * not cross cluster API keys. The <code>manage_own_api_key</code> only allows
	 * deleting REST API keys that are owned by the user. In addition, with the
	 * <code>manage_own_api_key</code> privilege, an invalidation request must be
	 * issued in one of the three formats:
	 * <ul>
	 * <li>Set the parameter <code>owner=true</code>.</li>
	 * <li>Or, set both <code>username</code> and <code>realm_name</code> to match
	 * the user's identity.</li>
	 * <li>Or, if the request is issued by an API key, that is to say an API key
	 * invalidates itself, specify its ID in the <code>ids</code> field.</li>
	 * </ul>
	 *
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-invalidate-api-key">Documentation
	 *      on elastic.co</a>
	 */

	public InvalidateApiKeyResponse invalidateApiKey() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new InvalidateApiKeyRequest.Builder().build(),
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
	 * <p>
	 * NOTE: While all parameters are optional, at least one of them is required.
	 * More specifically, either one of <code>token</code> or
	 * <code>refresh_token</code> parameters is required. If none of these two are
	 * specified, then <code>realm_name</code> and/or <code>username</code> need to
	 * be specified.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-invalidate-token">Documentation
	 *      on elastic.co</a>
	 */

	public InvalidateTokenResponse invalidateToken(InvalidateTokenRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<InvalidateTokenRequest, InvalidateTokenResponse, ErrorResponse> endpoint = (JsonEndpoint<InvalidateTokenRequest, InvalidateTokenResponse, ErrorResponse>) InvalidateTokenRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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
	 * <p>
	 * NOTE: While all parameters are optional, at least one of them is required.
	 * More specifically, either one of <code>token</code> or
	 * <code>refresh_token</code> parameters is required. If none of these two are
	 * specified, then <code>realm_name</code> and/or <code>username</code> need to
	 * be specified.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link InvalidateTokenRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-invalidate-token">Documentation
	 *      on elastic.co</a>
	 */

	public final InvalidateTokenResponse invalidateToken(
			Function<InvalidateTokenRequest.Builder, ObjectBuilder<InvalidateTokenRequest>> fn)
			throws IOException, ElasticsearchException {
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
	 * <p>
	 * NOTE: While all parameters are optional, at least one of them is required.
	 * More specifically, either one of <code>token</code> or
	 * <code>refresh_token</code> parameters is required. If none of these two are
	 * specified, then <code>realm_name</code> and/or <code>username</code> need to
	 * be specified.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-invalidate-token">Documentation
	 *      on elastic.co</a>
	 */

	public InvalidateTokenResponse invalidateToken() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new InvalidateTokenRequest.Builder().build(),
				InvalidateTokenRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: security.oidc_authenticate

	/**
	 * Authenticate OpenID Connect.
	 * <p>
	 * Exchange an OpenID Connect authentication response message for an
	 * Elasticsearch internal access token and refresh token that can be
	 * subsequently used for authentication.
	 * <p>
	 * Elasticsearch exposes all the necessary OpenID Connect related functionality
	 * with the OpenID Connect APIs. These APIs are used internally by Kibana in
	 * order to provide OpenID Connect based authentication, but can also be used by
	 * other, custom web applications or other clients.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-oidc-authenticate">Documentation
	 *      on elastic.co</a>
	 */

	public OidcAuthenticateResponse oidcAuthenticate(OidcAuthenticateRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<OidcAuthenticateRequest, OidcAuthenticateResponse, ErrorResponse> endpoint = (JsonEndpoint<OidcAuthenticateRequest, OidcAuthenticateResponse, ErrorResponse>) OidcAuthenticateRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Authenticate OpenID Connect.
	 * <p>
	 * Exchange an OpenID Connect authentication response message for an
	 * Elasticsearch internal access token and refresh token that can be
	 * subsequently used for authentication.
	 * <p>
	 * Elasticsearch exposes all the necessary OpenID Connect related functionality
	 * with the OpenID Connect APIs. These APIs are used internally by Kibana in
	 * order to provide OpenID Connect based authentication, but can also be used by
	 * other, custom web applications or other clients.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link OidcAuthenticateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-oidc-authenticate">Documentation
	 *      on elastic.co</a>
	 */

	public final OidcAuthenticateResponse oidcAuthenticate(
			Function<OidcAuthenticateRequest.Builder, ObjectBuilder<OidcAuthenticateRequest>> fn)
			throws IOException, ElasticsearchException {
		return oidcAuthenticate(fn.apply(new OidcAuthenticateRequest.Builder()).build());
	}

	// ----- Endpoint: security.oidc_logout

	/**
	 * Logout of OpenID Connect.
	 * <p>
	 * Invalidate an access token and a refresh token that were generated as a
	 * response to the <code>/_security/oidc/authenticate</code> API.
	 * <p>
	 * If the OpenID Connect authentication realm in Elasticsearch is accordingly
	 * configured, the response to this call will contain a URI pointing to the end
	 * session endpoint of the OpenID Connect Provider in order to perform single
	 * logout.
	 * <p>
	 * Elasticsearch exposes all the necessary OpenID Connect related functionality
	 * with the OpenID Connect APIs. These APIs are used internally by Kibana in
	 * order to provide OpenID Connect based authentication, but can also be used by
	 * other, custom web applications or other clients.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-oidc-logout">Documentation
	 *      on elastic.co</a>
	 */

	public OidcLogoutResponse oidcLogout(OidcLogoutRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<OidcLogoutRequest, OidcLogoutResponse, ErrorResponse> endpoint = (JsonEndpoint<OidcLogoutRequest, OidcLogoutResponse, ErrorResponse>) OidcLogoutRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Logout of OpenID Connect.
	 * <p>
	 * Invalidate an access token and a refresh token that were generated as a
	 * response to the <code>/_security/oidc/authenticate</code> API.
	 * <p>
	 * If the OpenID Connect authentication realm in Elasticsearch is accordingly
	 * configured, the response to this call will contain a URI pointing to the end
	 * session endpoint of the OpenID Connect Provider in order to perform single
	 * logout.
	 * <p>
	 * Elasticsearch exposes all the necessary OpenID Connect related functionality
	 * with the OpenID Connect APIs. These APIs are used internally by Kibana in
	 * order to provide OpenID Connect based authentication, but can also be used by
	 * other, custom web applications or other clients.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link OidcLogoutRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-oidc-logout">Documentation
	 *      on elastic.co</a>
	 */

	public final OidcLogoutResponse oidcLogout(Function<OidcLogoutRequest.Builder, ObjectBuilder<OidcLogoutRequest>> fn)
			throws IOException, ElasticsearchException {
		return oidcLogout(fn.apply(new OidcLogoutRequest.Builder()).build());
	}

	// ----- Endpoint: security.oidc_prepare_authentication

	/**
	 * Prepare OpenID connect authentication.
	 * <p>
	 * Create an oAuth 2.0 authentication request as a URL string based on the
	 * configuration of the OpenID Connect authentication realm in Elasticsearch.
	 * <p>
	 * The response of this API is a URL pointing to the Authorization Endpoint of
	 * the configured OpenID Connect Provider, which can be used to redirect the
	 * browser of the user in order to continue the authentication process.
	 * <p>
	 * Elasticsearch exposes all the necessary OpenID Connect related functionality
	 * with the OpenID Connect APIs. These APIs are used internally by Kibana in
	 * order to provide OpenID Connect based authentication, but can also be used by
	 * other, custom web applications or other clients.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-oidc-prepare-authentication">Documentation
	 *      on elastic.co</a>
	 */

	public OidcPrepareAuthenticationResponse oidcPrepareAuthentication(OidcPrepareAuthenticationRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<OidcPrepareAuthenticationRequest, OidcPrepareAuthenticationResponse, ErrorResponse> endpoint = (JsonEndpoint<OidcPrepareAuthenticationRequest, OidcPrepareAuthenticationResponse, ErrorResponse>) OidcPrepareAuthenticationRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Prepare OpenID connect authentication.
	 * <p>
	 * Create an oAuth 2.0 authentication request as a URL string based on the
	 * configuration of the OpenID Connect authentication realm in Elasticsearch.
	 * <p>
	 * The response of this API is a URL pointing to the Authorization Endpoint of
	 * the configured OpenID Connect Provider, which can be used to redirect the
	 * browser of the user in order to continue the authentication process.
	 * <p>
	 * Elasticsearch exposes all the necessary OpenID Connect related functionality
	 * with the OpenID Connect APIs. These APIs are used internally by Kibana in
	 * order to provide OpenID Connect based authentication, but can also be used by
	 * other, custom web applications or other clients.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link OidcPrepareAuthenticationRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-oidc-prepare-authentication">Documentation
	 *      on elastic.co</a>
	 */

	public final OidcPrepareAuthenticationResponse oidcPrepareAuthentication(
			Function<OidcPrepareAuthenticationRequest.Builder, ObjectBuilder<OidcPrepareAuthenticationRequest>> fn)
			throws IOException, ElasticsearchException {
		return oidcPrepareAuthentication(fn.apply(new OidcPrepareAuthenticationRequest.Builder()).build());
	}

	/**
	 * Prepare OpenID connect authentication.
	 * <p>
	 * Create an oAuth 2.0 authentication request as a URL string based on the
	 * configuration of the OpenID Connect authentication realm in Elasticsearch.
	 * <p>
	 * The response of this API is a URL pointing to the Authorization Endpoint of
	 * the configured OpenID Connect Provider, which can be used to redirect the
	 * browser of the user in order to continue the authentication process.
	 * <p>
	 * Elasticsearch exposes all the necessary OpenID Connect related functionality
	 * with the OpenID Connect APIs. These APIs are used internally by Kibana in
	 * order to provide OpenID Connect based authentication, but can also be used by
	 * other, custom web applications or other clients.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-oidc-prepare-authentication">Documentation
	 *      on elastic.co</a>
	 */

	public OidcPrepareAuthenticationResponse oidcPrepareAuthentication() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new OidcPrepareAuthenticationRequest.Builder().build(),
				OidcPrepareAuthenticationRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: security.put_privileges

	/**
	 * Create or update application privileges.
	 * <p>
	 * To use this API, you must have one of the following privileges:
	 * <ul>
	 * <li>The <code>manage_security</code> cluster privilege (or a greater
	 * privilege such as <code>all</code>).</li>
	 * <li>The &quot;Manage Application Privileges&quot; global privilege for the
	 * application being referenced in the request.</li>
	 * </ul>
	 * <p>
	 * Application names are formed from a prefix, with an optional suffix that
	 * conform to the following rules:
	 * <ul>
	 * <li>The prefix must begin with a lowercase ASCII letter.</li>
	 * <li>The prefix must contain only ASCII letters or digits.</li>
	 * <li>The prefix must be at least 3 characters long.</li>
	 * <li>If the suffix exists, it must begin with either a dash <code>-</code> or
	 * <code>_</code>.</li>
	 * <li>The suffix cannot contain any of the following characters:
	 * <code>\</code>, <code>/</code>, <code>*</code>, <code>?</code>,
	 * <code>&quot;</code>, <code>&lt;</code>, <code>&gt;</code>, <code>|</code>,
	 * <code>,</code>, <code>*</code>.</li>
	 * <li>No part of the name can contain whitespace.</li>
	 * </ul>
	 * <p>
	 * Privilege names must begin with a lowercase ASCII letter and must contain
	 * only ASCII letters and digits along with the characters <code>_</code>,
	 * <code>-</code>, and <code>.</code>.
	 * <p>
	 * Action names can contain any number of printable ASCII characters and must
	 * contain at least one of the following characters: <code>/</code>,
	 * <code>*</code>, <code>:</code>.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-put-privileges">Documentation
	 *      on elastic.co</a>
	 */

	public PutPrivilegesResponse putPrivileges(PutPrivilegesRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutPrivilegesRequest, PutPrivilegesResponse, ErrorResponse> endpoint = (JsonEndpoint<PutPrivilegesRequest, PutPrivilegesResponse, ErrorResponse>) PutPrivilegesRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Create or update application privileges.
	 * <p>
	 * To use this API, you must have one of the following privileges:
	 * <ul>
	 * <li>The <code>manage_security</code> cluster privilege (or a greater
	 * privilege such as <code>all</code>).</li>
	 * <li>The &quot;Manage Application Privileges&quot; global privilege for the
	 * application being referenced in the request.</li>
	 * </ul>
	 * <p>
	 * Application names are formed from a prefix, with an optional suffix that
	 * conform to the following rules:
	 * <ul>
	 * <li>The prefix must begin with a lowercase ASCII letter.</li>
	 * <li>The prefix must contain only ASCII letters or digits.</li>
	 * <li>The prefix must be at least 3 characters long.</li>
	 * <li>If the suffix exists, it must begin with either a dash <code>-</code> or
	 * <code>_</code>.</li>
	 * <li>The suffix cannot contain any of the following characters:
	 * <code>\</code>, <code>/</code>, <code>*</code>, <code>?</code>,
	 * <code>&quot;</code>, <code>&lt;</code>, <code>&gt;</code>, <code>|</code>,
	 * <code>,</code>, <code>*</code>.</li>
	 * <li>No part of the name can contain whitespace.</li>
	 * </ul>
	 * <p>
	 * Privilege names must begin with a lowercase ASCII letter and must contain
	 * only ASCII letters and digits along with the characters <code>_</code>,
	 * <code>-</code>, and <code>.</code>.
	 * <p>
	 * Action names can contain any number of printable ASCII characters and must
	 * contain at least one of the following characters: <code>/</code>,
	 * <code>*</code>, <code>:</code>.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutPrivilegesRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-put-privileges">Documentation
	 *      on elastic.co</a>
	 */

	public final PutPrivilegesResponse putPrivileges(
			Function<PutPrivilegesRequest.Builder, ObjectBuilder<PutPrivilegesRequest>> fn)
			throws IOException, ElasticsearchException {
		return putPrivileges(fn.apply(new PutPrivilegesRequest.Builder()).build());
	}

	/**
	 * Create or update application privileges.
	 * <p>
	 * To use this API, you must have one of the following privileges:
	 * <ul>
	 * <li>The <code>manage_security</code> cluster privilege (or a greater
	 * privilege such as <code>all</code>).</li>
	 * <li>The &quot;Manage Application Privileges&quot; global privilege for the
	 * application being referenced in the request.</li>
	 * </ul>
	 * <p>
	 * Application names are formed from a prefix, with an optional suffix that
	 * conform to the following rules:
	 * <ul>
	 * <li>The prefix must begin with a lowercase ASCII letter.</li>
	 * <li>The prefix must contain only ASCII letters or digits.</li>
	 * <li>The prefix must be at least 3 characters long.</li>
	 * <li>If the suffix exists, it must begin with either a dash <code>-</code> or
	 * <code>_</code>.</li>
	 * <li>The suffix cannot contain any of the following characters:
	 * <code>\</code>, <code>/</code>, <code>*</code>, <code>?</code>,
	 * <code>&quot;</code>, <code>&lt;</code>, <code>&gt;</code>, <code>|</code>,
	 * <code>,</code>, <code>*</code>.</li>
	 * <li>No part of the name can contain whitespace.</li>
	 * </ul>
	 * <p>
	 * Privilege names must begin with a lowercase ASCII letter and must contain
	 * only ASCII letters and digits along with the characters <code>_</code>,
	 * <code>-</code>, and <code>.</code>.
	 * <p>
	 * Action names can contain any number of printable ASCII characters and must
	 * contain at least one of the following characters: <code>/</code>,
	 * <code>*</code>, <code>:</code>.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-put-privileges">Documentation
	 *      on elastic.co</a>
	 */

	public PutPrivilegesResponse putPrivileges() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new PutPrivilegesRequest.Builder().build(), PutPrivilegesRequest._ENDPOINT,
				this.transportOptions);
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-put-role">Documentation
	 *      on elastic.co</a>
	 */

	public PutRoleResponse putRole(PutRoleRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutRoleRequest, PutRoleResponse, ErrorResponse> endpoint = (JsonEndpoint<PutRoleRequest, PutRoleResponse, ErrorResponse>) PutRoleRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-put-role">Documentation
	 *      on elastic.co</a>
	 */

	public final PutRoleResponse putRole(Function<PutRoleRequest.Builder, ObjectBuilder<PutRoleRequest>> fn)
			throws IOException, ElasticsearchException {
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
	 * NOTE: This API does not create roles. Rather, it maps users to existing
	 * roles. Roles can be created by using the create or update roles API or roles
	 * files.
	 * <p>
	 * <strong>Role templates</strong>
	 * <p>
	 * The most common use for role mappings is to create a mapping from a known
	 * value on the user to a fixed role name. For example, all users in the
	 * <code>cn=admin,dc=example,dc=com</code> LDAP group should be given the
	 * superuser role in Elasticsearch. The <code>roles</code> field is used for
	 * this purpose.
	 * <p>
	 * For more complex needs, it is possible to use Mustache templates to
	 * dynamically determine the names of the roles that should be granted to the
	 * user. The <code>role_templates</code> field is used for this purpose.
	 * <p>
	 * NOTE: To use role templates successfully, the relevant scripting feature must
	 * be enabled. Otherwise, all attempts to create a role mapping with role
	 * templates fail.
	 * <p>
	 * All of the user fields that are available in the role mapping rules are also
	 * available in the role templates. Thus it is possible to assign a user to a
	 * role that reflects their username, their groups, or the name of the realm to
	 * which they authenticated.
	 * <p>
	 * By default a template is evaluated to produce a single string that is the
	 * name of the role which should be assigned to the user. If the format of the
	 * template is set to &quot;json&quot; then the template is expected to produce
	 * a JSON string or an array of JSON strings for the role names.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-put-role-mapping">Documentation
	 *      on elastic.co</a>
	 */

	public PutRoleMappingResponse putRoleMapping(PutRoleMappingRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutRoleMappingRequest, PutRoleMappingResponse, ErrorResponse> endpoint = (JsonEndpoint<PutRoleMappingRequest, PutRoleMappingResponse, ErrorResponse>) PutRoleMappingRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
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
	 * NOTE: This API does not create roles. Rather, it maps users to existing
	 * roles. Roles can be created by using the create or update roles API or roles
	 * files.
	 * <p>
	 * <strong>Role templates</strong>
	 * <p>
	 * The most common use for role mappings is to create a mapping from a known
	 * value on the user to a fixed role name. For example, all users in the
	 * <code>cn=admin,dc=example,dc=com</code> LDAP group should be given the
	 * superuser role in Elasticsearch. The <code>roles</code> field is used for
	 * this purpose.
	 * <p>
	 * For more complex needs, it is possible to use Mustache templates to
	 * dynamically determine the names of the roles that should be granted to the
	 * user. The <code>role_templates</code> field is used for this purpose.
	 * <p>
	 * NOTE: To use role templates successfully, the relevant scripting feature must
	 * be enabled. Otherwise, all attempts to create a role mapping with role
	 * templates fail.
	 * <p>
	 * All of the user fields that are available in the role mapping rules are also
	 * available in the role templates. Thus it is possible to assign a user to a
	 * role that reflects their username, their groups, or the name of the realm to
	 * which they authenticated.
	 * <p>
	 * By default a template is evaluated to produce a single string that is the
	 * name of the role which should be assigned to the user. If the format of the
	 * template is set to &quot;json&quot; then the template is expected to produce
	 * a JSON string or an array of JSON strings for the role names.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutRoleMappingRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-put-role-mapping">Documentation
	 *      on elastic.co</a>
	 */

	public final PutRoleMappingResponse putRoleMapping(
			Function<PutRoleMappingRequest.Builder, ObjectBuilder<PutRoleMappingRequest>> fn)
			throws IOException, ElasticsearchException {
		return putRoleMapping(fn.apply(new PutRoleMappingRequest.Builder()).build());
	}

	// ----- Endpoint: security.put_user

	/**
	 * Create or update users.
	 * <p>
	 * Add and update users in the native realm. A password is required for adding a
	 * new user but is optional when updating an existing user. To change a user's
	 * password without updating any other fields, use the change password API.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-put-user">Documentation
	 *      on elastic.co</a>
	 */

	public PutUserResponse putUser(PutUserRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutUserRequest, PutUserResponse, ErrorResponse> endpoint = (JsonEndpoint<PutUserRequest, PutUserResponse, ErrorResponse>) PutUserRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Create or update users.
	 * <p>
	 * Add and update users in the native realm. A password is required for adding a
	 * new user but is optional when updating an existing user. To change a user's
	 * password without updating any other fields, use the change password API.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutUserRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-put-user">Documentation
	 *      on elastic.co</a>
	 */

	public final PutUserResponse putUser(Function<PutUserRequest.Builder, ObjectBuilder<PutUserRequest>> fn)
			throws IOException, ElasticsearchException {
		return putUser(fn.apply(new PutUserRequest.Builder()).build());
	}

	// ----- Endpoint: security.query_api_keys

	/**
	 * Find API keys with a query.
	 * <p>
	 * Get a paginated list of API keys and their information. You can optionally
	 * filter the results with a query.
	 * <p>
	 * To use this API, you must have at least the <code>manage_own_api_key</code>
	 * or the <code>read_security</code> cluster privileges. If you have only the
	 * <code>manage_own_api_key</code> privilege, this API returns only the API keys
	 * that you own. If you have the <code>read_security</code>,
	 * <code>manage_api_key</code>, or greater privileges (including
	 * <code>manage_security</code>), this API returns all API keys regardless of
	 * ownership. Refer to the linked documentation for examples of how to find API
	 * keys:
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-query-api-keys">Documentation
	 *      on elastic.co</a>
	 */

	public QueryApiKeysResponse queryApiKeys(QueryApiKeysRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<QueryApiKeysRequest, QueryApiKeysResponse, ErrorResponse> endpoint = (JsonEndpoint<QueryApiKeysRequest, QueryApiKeysResponse, ErrorResponse>) QueryApiKeysRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Find API keys with a query.
	 * <p>
	 * Get a paginated list of API keys and their information. You can optionally
	 * filter the results with a query.
	 * <p>
	 * To use this API, you must have at least the <code>manage_own_api_key</code>
	 * or the <code>read_security</code> cluster privileges. If you have only the
	 * <code>manage_own_api_key</code> privilege, this API returns only the API keys
	 * that you own. If you have the <code>read_security</code>,
	 * <code>manage_api_key</code>, or greater privileges (including
	 * <code>manage_security</code>), this API returns all API keys regardless of
	 * ownership. Refer to the linked documentation for examples of how to find API
	 * keys:
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link QueryApiKeysRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-query-api-keys">Documentation
	 *      on elastic.co</a>
	 */

	public final QueryApiKeysResponse queryApiKeys(
			Function<QueryApiKeysRequest.Builder, ObjectBuilder<QueryApiKeysRequest>> fn)
			throws IOException, ElasticsearchException {
		return queryApiKeys(fn.apply(new QueryApiKeysRequest.Builder()).build());
	}

	/**
	 * Find API keys with a query.
	 * <p>
	 * Get a paginated list of API keys and their information. You can optionally
	 * filter the results with a query.
	 * <p>
	 * To use this API, you must have at least the <code>manage_own_api_key</code>
	 * or the <code>read_security</code> cluster privileges. If you have only the
	 * <code>manage_own_api_key</code> privilege, this API returns only the API keys
	 * that you own. If you have the <code>read_security</code>,
	 * <code>manage_api_key</code>, or greater privileges (including
	 * <code>manage_security</code>), this API returns all API keys regardless of
	 * ownership. Refer to the linked documentation for examples of how to find API
	 * keys:
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-query-api-keys">Documentation
	 *      on elastic.co</a>
	 */

	public QueryApiKeysResponse queryApiKeys() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new QueryApiKeysRequest.Builder().build(), QueryApiKeysRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: security.query_role

	/**
	 * Find roles with a query.
	 * <p>
	 * Get roles in a paginated manner. The role management APIs are generally the
	 * preferred way to manage roles, rather than using file-based role management.
	 * The query roles API does not retrieve roles that are defined in roles files,
	 * nor built-in ones. You can optionally filter the results with a query. Also,
	 * the results can be paginated and sorted.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-query-role">Documentation
	 *      on elastic.co</a>
	 */

	public QueryRoleResponse queryRole(QueryRoleRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<QueryRoleRequest, QueryRoleResponse, ErrorResponse> endpoint = (JsonEndpoint<QueryRoleRequest, QueryRoleResponse, ErrorResponse>) QueryRoleRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Find roles with a query.
	 * <p>
	 * Get roles in a paginated manner. The role management APIs are generally the
	 * preferred way to manage roles, rather than using file-based role management.
	 * The query roles API does not retrieve roles that are defined in roles files,
	 * nor built-in ones. You can optionally filter the results with a query. Also,
	 * the results can be paginated and sorted.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link QueryRoleRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-query-role">Documentation
	 *      on elastic.co</a>
	 */

	public final QueryRoleResponse queryRole(Function<QueryRoleRequest.Builder, ObjectBuilder<QueryRoleRequest>> fn)
			throws IOException, ElasticsearchException {
		return queryRole(fn.apply(new QueryRoleRequest.Builder()).build());
	}

	/**
	 * Find roles with a query.
	 * <p>
	 * Get roles in a paginated manner. The role management APIs are generally the
	 * preferred way to manage roles, rather than using file-based role management.
	 * The query roles API does not retrieve roles that are defined in roles files,
	 * nor built-in ones. You can optionally filter the results with a query. Also,
	 * the results can be paginated and sorted.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-query-role">Documentation
	 *      on elastic.co</a>
	 */

	public QueryRoleResponse queryRole() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new QueryRoleRequest.Builder().build(), QueryRoleRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: security.query_user

	/**
	 * Find users with a query.
	 * <p>
	 * Get information for users in a paginated manner. You can optionally filter
	 * the results with a query.
	 * <p>
	 * NOTE: As opposed to the get user API, built-in users are excluded from the
	 * result. This API is only for native users.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-query-user">Documentation
	 *      on elastic.co</a>
	 */

	public QueryUserResponse queryUser(QueryUserRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<QueryUserRequest, QueryUserResponse, ErrorResponse> endpoint = (JsonEndpoint<QueryUserRequest, QueryUserResponse, ErrorResponse>) QueryUserRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Find users with a query.
	 * <p>
	 * Get information for users in a paginated manner. You can optionally filter
	 * the results with a query.
	 * <p>
	 * NOTE: As opposed to the get user API, built-in users are excluded from the
	 * result. This API is only for native users.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link QueryUserRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-query-user">Documentation
	 *      on elastic.co</a>
	 */

	public final QueryUserResponse queryUser(Function<QueryUserRequest.Builder, ObjectBuilder<QueryUserRequest>> fn)
			throws IOException, ElasticsearchException {
		return queryUser(fn.apply(new QueryUserRequest.Builder()).build());
	}

	/**
	 * Find users with a query.
	 * <p>
	 * Get information for users in a paginated manner. You can optionally filter
	 * the results with a query.
	 * <p>
	 * NOTE: As opposed to the get user API, built-in users are excluded from the
	 * result. This API is only for native users.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-query-user">Documentation
	 *      on elastic.co</a>
	 */

	public QueryUserResponse queryUser() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new QueryUserRequest.Builder().build(), QueryUserRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: security.saml_authenticate

	/**
	 * Authenticate SAML.
	 * <p>
	 * Submit a SAML response message to Elasticsearch for consumption.
	 * <p>
	 * NOTE: This API is intended for use by custom web applications other than
	 * Kibana. If you are using Kibana, refer to the documentation for configuring
	 * SAML single-sign-on on the Elastic Stack.
	 * <p>
	 * The SAML message that is submitted can be:
	 * <ul>
	 * <li>A response to a SAML authentication request that was previously created
	 * using the SAML prepare authentication API.</li>
	 * <li>An unsolicited SAML message in the case of an IdP-initiated single
	 * sign-on (SSO) flow.</li>
	 * </ul>
	 * <p>
	 * In either case, the SAML message needs to be a base64 encoded XML document
	 * with a root element of <code>&lt;Response&gt;</code>.
	 * <p>
	 * After successful validation, Elasticsearch responds with an Elasticsearch
	 * internal access token and refresh token that can be subsequently used for
	 * authentication. This API endpoint essentially exchanges SAML responses that
	 * indicate successful authentication in the IdP for Elasticsearch access and
	 * refresh tokens, which can be used for authentication against Elasticsearch.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-saml-authenticate">Documentation
	 *      on elastic.co</a>
	 */

	public SamlAuthenticateResponse samlAuthenticate(SamlAuthenticateRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SamlAuthenticateRequest, SamlAuthenticateResponse, ErrorResponse> endpoint = (JsonEndpoint<SamlAuthenticateRequest, SamlAuthenticateResponse, ErrorResponse>) SamlAuthenticateRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Authenticate SAML.
	 * <p>
	 * Submit a SAML response message to Elasticsearch for consumption.
	 * <p>
	 * NOTE: This API is intended for use by custom web applications other than
	 * Kibana. If you are using Kibana, refer to the documentation for configuring
	 * SAML single-sign-on on the Elastic Stack.
	 * <p>
	 * The SAML message that is submitted can be:
	 * <ul>
	 * <li>A response to a SAML authentication request that was previously created
	 * using the SAML prepare authentication API.</li>
	 * <li>An unsolicited SAML message in the case of an IdP-initiated single
	 * sign-on (SSO) flow.</li>
	 * </ul>
	 * <p>
	 * In either case, the SAML message needs to be a base64 encoded XML document
	 * with a root element of <code>&lt;Response&gt;</code>.
	 * <p>
	 * After successful validation, Elasticsearch responds with an Elasticsearch
	 * internal access token and refresh token that can be subsequently used for
	 * authentication. This API endpoint essentially exchanges SAML responses that
	 * indicate successful authentication in the IdP for Elasticsearch access and
	 * refresh tokens, which can be used for authentication against Elasticsearch.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SamlAuthenticateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-saml-authenticate">Documentation
	 *      on elastic.co</a>
	 */

	public final SamlAuthenticateResponse samlAuthenticate(
			Function<SamlAuthenticateRequest.Builder, ObjectBuilder<SamlAuthenticateRequest>> fn)
			throws IOException, ElasticsearchException {
		return samlAuthenticate(fn.apply(new SamlAuthenticateRequest.Builder()).build());
	}

	// ----- Endpoint: security.saml_complete_logout

	/**
	 * Logout of SAML completely.
	 * <p>
	 * Verifies the logout response sent from the SAML IdP.
	 * <p>
	 * NOTE: This API is intended for use by custom web applications other than
	 * Kibana. If you are using Kibana, refer to the documentation for configuring
	 * SAML single-sign-on on the Elastic Stack.
	 * <p>
	 * The SAML IdP may send a logout response back to the SP after handling the
	 * SP-initiated SAML Single Logout. This API verifies the response by ensuring
	 * the content is relevant and validating its signature. An empty response is
	 * returned if the verification process is successful. The response can be sent
	 * by the IdP with either the HTTP-Redirect or the HTTP-Post binding. The caller
	 * of this API must prepare the request accordingly so that this API can handle
	 * either of them.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-saml-complete-logout">Documentation
	 *      on elastic.co</a>
	 */

	public BooleanResponse samlCompleteLogout(SamlCompleteLogoutRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<SamlCompleteLogoutRequest, BooleanResponse, ErrorResponse> endpoint = (Endpoint<SamlCompleteLogoutRequest, BooleanResponse, ErrorResponse>) SamlCompleteLogoutRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Logout of SAML completely.
	 * <p>
	 * Verifies the logout response sent from the SAML IdP.
	 * <p>
	 * NOTE: This API is intended for use by custom web applications other than
	 * Kibana. If you are using Kibana, refer to the documentation for configuring
	 * SAML single-sign-on on the Elastic Stack.
	 * <p>
	 * The SAML IdP may send a logout response back to the SP after handling the
	 * SP-initiated SAML Single Logout. This API verifies the response by ensuring
	 * the content is relevant and validating its signature. An empty response is
	 * returned if the verification process is successful. The response can be sent
	 * by the IdP with either the HTTP-Redirect or the HTTP-Post binding. The caller
	 * of this API must prepare the request accordingly so that this API can handle
	 * either of them.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SamlCompleteLogoutRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-saml-complete-logout">Documentation
	 *      on elastic.co</a>
	 */

	public final BooleanResponse samlCompleteLogout(
			Function<SamlCompleteLogoutRequest.Builder, ObjectBuilder<SamlCompleteLogoutRequest>> fn)
			throws IOException, ElasticsearchException {
		return samlCompleteLogout(fn.apply(new SamlCompleteLogoutRequest.Builder()).build());
	}

	// ----- Endpoint: security.saml_invalidate

	/**
	 * Invalidate SAML.
	 * <p>
	 * Submit a SAML LogoutRequest message to Elasticsearch for consumption.
	 * <p>
	 * NOTE: This API is intended for use by custom web applications other than
	 * Kibana. If you are using Kibana, refer to the documentation for configuring
	 * SAML single-sign-on on the Elastic Stack.
	 * <p>
	 * The logout request comes from the SAML IdP during an IdP initiated Single
	 * Logout. The custom web application can use this API to have Elasticsearch
	 * process the <code>LogoutRequest</code>. After successful validation of the
	 * request, Elasticsearch invalidates the access token and refresh token that
	 * corresponds to that specific SAML principal and provides a URL that contains
	 * a SAML LogoutResponse message. Thus the user can be redirected back to their
	 * IdP.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-saml-invalidate">Documentation
	 *      on elastic.co</a>
	 */

	public SamlInvalidateResponse samlInvalidate(SamlInvalidateRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SamlInvalidateRequest, SamlInvalidateResponse, ErrorResponse> endpoint = (JsonEndpoint<SamlInvalidateRequest, SamlInvalidateResponse, ErrorResponse>) SamlInvalidateRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Invalidate SAML.
	 * <p>
	 * Submit a SAML LogoutRequest message to Elasticsearch for consumption.
	 * <p>
	 * NOTE: This API is intended for use by custom web applications other than
	 * Kibana. If you are using Kibana, refer to the documentation for configuring
	 * SAML single-sign-on on the Elastic Stack.
	 * <p>
	 * The logout request comes from the SAML IdP during an IdP initiated Single
	 * Logout. The custom web application can use this API to have Elasticsearch
	 * process the <code>LogoutRequest</code>. After successful validation of the
	 * request, Elasticsearch invalidates the access token and refresh token that
	 * corresponds to that specific SAML principal and provides a URL that contains
	 * a SAML LogoutResponse message. Thus the user can be redirected back to their
	 * IdP.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SamlInvalidateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-saml-invalidate">Documentation
	 *      on elastic.co</a>
	 */

	public final SamlInvalidateResponse samlInvalidate(
			Function<SamlInvalidateRequest.Builder, ObjectBuilder<SamlInvalidateRequest>> fn)
			throws IOException, ElasticsearchException {
		return samlInvalidate(fn.apply(new SamlInvalidateRequest.Builder()).build());
	}

	// ----- Endpoint: security.saml_logout

	/**
	 * Logout of SAML.
	 * <p>
	 * Submits a request to invalidate an access token and refresh token.
	 * <p>
	 * NOTE: This API is intended for use by custom web applications other than
	 * Kibana. If you are using Kibana, refer to the documentation for configuring
	 * SAML single-sign-on on the Elastic Stack.
	 * <p>
	 * This API invalidates the tokens that were generated for a user by the SAML
	 * authenticate API. If the SAML realm in Elasticsearch is configured
	 * accordingly and the SAML IdP supports this, the Elasticsearch response
	 * contains a URL to redirect the user to the IdP that contains a SAML logout
	 * request (starting an SP-initiated SAML Single Logout).
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-saml-logout">Documentation
	 *      on elastic.co</a>
	 */

	public SamlLogoutResponse samlLogout(SamlLogoutRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SamlLogoutRequest, SamlLogoutResponse, ErrorResponse> endpoint = (JsonEndpoint<SamlLogoutRequest, SamlLogoutResponse, ErrorResponse>) SamlLogoutRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Logout of SAML.
	 * <p>
	 * Submits a request to invalidate an access token and refresh token.
	 * <p>
	 * NOTE: This API is intended for use by custom web applications other than
	 * Kibana. If you are using Kibana, refer to the documentation for configuring
	 * SAML single-sign-on on the Elastic Stack.
	 * <p>
	 * This API invalidates the tokens that were generated for a user by the SAML
	 * authenticate API. If the SAML realm in Elasticsearch is configured
	 * accordingly and the SAML IdP supports this, the Elasticsearch response
	 * contains a URL to redirect the user to the IdP that contains a SAML logout
	 * request (starting an SP-initiated SAML Single Logout).
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SamlLogoutRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-saml-logout">Documentation
	 *      on elastic.co</a>
	 */

	public final SamlLogoutResponse samlLogout(Function<SamlLogoutRequest.Builder, ObjectBuilder<SamlLogoutRequest>> fn)
			throws IOException, ElasticsearchException {
		return samlLogout(fn.apply(new SamlLogoutRequest.Builder()).build());
	}

	// ----- Endpoint: security.saml_prepare_authentication

	/**
	 * Prepare SAML authentication.
	 * <p>
	 * Create a SAML authentication request (<code>&lt;AuthnRequest&gt;</code>) as a
	 * URL string based on the configuration of the respective SAML realm in
	 * Elasticsearch.
	 * <p>
	 * NOTE: This API is intended for use by custom web applications other than
	 * Kibana. If you are using Kibana, refer to the documentation for configuring
	 * SAML single-sign-on on the Elastic Stack.
	 * <p>
	 * This API returns a URL pointing to the SAML Identity Provider. You can use
	 * the URL to redirect the browser of the user in order to continue the
	 * authentication process. The URL includes a single parameter named
	 * <code>SAMLRequest</code>, which contains a SAML Authentication request that
	 * is deflated and Base64 encoded. If the configuration dictates that SAML
	 * authentication requests should be signed, the URL has two extra parameters
	 * named <code>SigAlg</code> and <code>Signature</code>. These parameters
	 * contain the algorithm used for the signature and the signature value itself.
	 * It also returns a random string that uniquely identifies this SAML
	 * Authentication request. The caller of this API needs to store this identifier
	 * as it needs to be used in a following step of the authentication process.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-saml-prepare-authentication">Documentation
	 *      on elastic.co</a>
	 */

	public SamlPrepareAuthenticationResponse samlPrepareAuthentication(SamlPrepareAuthenticationRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SamlPrepareAuthenticationRequest, SamlPrepareAuthenticationResponse, ErrorResponse> endpoint = (JsonEndpoint<SamlPrepareAuthenticationRequest, SamlPrepareAuthenticationResponse, ErrorResponse>) SamlPrepareAuthenticationRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Prepare SAML authentication.
	 * <p>
	 * Create a SAML authentication request (<code>&lt;AuthnRequest&gt;</code>) as a
	 * URL string based on the configuration of the respective SAML realm in
	 * Elasticsearch.
	 * <p>
	 * NOTE: This API is intended for use by custom web applications other than
	 * Kibana. If you are using Kibana, refer to the documentation for configuring
	 * SAML single-sign-on on the Elastic Stack.
	 * <p>
	 * This API returns a URL pointing to the SAML Identity Provider. You can use
	 * the URL to redirect the browser of the user in order to continue the
	 * authentication process. The URL includes a single parameter named
	 * <code>SAMLRequest</code>, which contains a SAML Authentication request that
	 * is deflated and Base64 encoded. If the configuration dictates that SAML
	 * authentication requests should be signed, the URL has two extra parameters
	 * named <code>SigAlg</code> and <code>Signature</code>. These parameters
	 * contain the algorithm used for the signature and the signature value itself.
	 * It also returns a random string that uniquely identifies this SAML
	 * Authentication request. The caller of this API needs to store this identifier
	 * as it needs to be used in a following step of the authentication process.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SamlPrepareAuthenticationRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-saml-prepare-authentication">Documentation
	 *      on elastic.co</a>
	 */

	public final SamlPrepareAuthenticationResponse samlPrepareAuthentication(
			Function<SamlPrepareAuthenticationRequest.Builder, ObjectBuilder<SamlPrepareAuthenticationRequest>> fn)
			throws IOException, ElasticsearchException {
		return samlPrepareAuthentication(fn.apply(new SamlPrepareAuthenticationRequest.Builder()).build());
	}

	/**
	 * Prepare SAML authentication.
	 * <p>
	 * Create a SAML authentication request (<code>&lt;AuthnRequest&gt;</code>) as a
	 * URL string based on the configuration of the respective SAML realm in
	 * Elasticsearch.
	 * <p>
	 * NOTE: This API is intended for use by custom web applications other than
	 * Kibana. If you are using Kibana, refer to the documentation for configuring
	 * SAML single-sign-on on the Elastic Stack.
	 * <p>
	 * This API returns a URL pointing to the SAML Identity Provider. You can use
	 * the URL to redirect the browser of the user in order to continue the
	 * authentication process. The URL includes a single parameter named
	 * <code>SAMLRequest</code>, which contains a SAML Authentication request that
	 * is deflated and Base64 encoded. If the configuration dictates that SAML
	 * authentication requests should be signed, the URL has two extra parameters
	 * named <code>SigAlg</code> and <code>Signature</code>. These parameters
	 * contain the algorithm used for the signature and the signature value itself.
	 * It also returns a random string that uniquely identifies this SAML
	 * Authentication request. The caller of this API needs to store this identifier
	 * as it needs to be used in a following step of the authentication process.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-saml-prepare-authentication">Documentation
	 *      on elastic.co</a>
	 */

	public SamlPrepareAuthenticationResponse samlPrepareAuthentication() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new SamlPrepareAuthenticationRequest.Builder().build(),
				SamlPrepareAuthenticationRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: security.saml_service_provider_metadata

	/**
	 * Create SAML service provider metadata.
	 * <p>
	 * Generate SAML metadata for a SAML 2.0 Service Provider.
	 * <p>
	 * The SAML 2.0 specification provides a mechanism for Service Providers to
	 * describe their capabilities and configuration using a metadata file. This API
	 * generates Service Provider metadata based on the configuration of a SAML
	 * realm in Elasticsearch.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-saml-service-provider-metadata">Documentation
	 *      on elastic.co</a>
	 */

	public SamlServiceProviderMetadataResponse samlServiceProviderMetadata(SamlServiceProviderMetadataRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SamlServiceProviderMetadataRequest, SamlServiceProviderMetadataResponse, ErrorResponse> endpoint = (JsonEndpoint<SamlServiceProviderMetadataRequest, SamlServiceProviderMetadataResponse, ErrorResponse>) SamlServiceProviderMetadataRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Create SAML service provider metadata.
	 * <p>
	 * Generate SAML metadata for a SAML 2.0 Service Provider.
	 * <p>
	 * The SAML 2.0 specification provides a mechanism for Service Providers to
	 * describe their capabilities and configuration using a metadata file. This API
	 * generates Service Provider metadata based on the configuration of a SAML
	 * realm in Elasticsearch.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SamlServiceProviderMetadataRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-saml-service-provider-metadata">Documentation
	 *      on elastic.co</a>
	 */

	public final SamlServiceProviderMetadataResponse samlServiceProviderMetadata(
			Function<SamlServiceProviderMetadataRequest.Builder, ObjectBuilder<SamlServiceProviderMetadataRequest>> fn)
			throws IOException, ElasticsearchException {
		return samlServiceProviderMetadata(fn.apply(new SamlServiceProviderMetadataRequest.Builder()).build());
	}

	// ----- Endpoint: security.suggest_user_profiles

	/**
	 * Suggest a user profile.
	 * <p>
	 * Get suggestions for user profiles that match specified search criteria.
	 * <p>
	 * NOTE: The user profile feature is designed only for use by Kibana and
	 * Elastic's Observability, Enterprise Search, and Elastic Security solutions.
	 * Individual users and external applications should not call this API directly.
	 * Elastic reserves the right to change or remove this feature in future
	 * releases without prior notice.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-suggest-user-profiles">Documentation
	 *      on elastic.co</a>
	 */

	public SuggestUserProfilesResponse suggestUserProfiles(SuggestUserProfilesRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<SuggestUserProfilesRequest, SuggestUserProfilesResponse, ErrorResponse> endpoint = (JsonEndpoint<SuggestUserProfilesRequest, SuggestUserProfilesResponse, ErrorResponse>) SuggestUserProfilesRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Suggest a user profile.
	 * <p>
	 * Get suggestions for user profiles that match specified search criteria.
	 * <p>
	 * NOTE: The user profile feature is designed only for use by Kibana and
	 * Elastic's Observability, Enterprise Search, and Elastic Security solutions.
	 * Individual users and external applications should not call this API directly.
	 * Elastic reserves the right to change or remove this feature in future
	 * releases without prior notice.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link SuggestUserProfilesRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-suggest-user-profiles">Documentation
	 *      on elastic.co</a>
	 */

	public final SuggestUserProfilesResponse suggestUserProfiles(
			Function<SuggestUserProfilesRequest.Builder, ObjectBuilder<SuggestUserProfilesRequest>> fn)
			throws IOException, ElasticsearchException {
		return suggestUserProfiles(fn.apply(new SuggestUserProfilesRequest.Builder()).build());
	}

	/**
	 * Suggest a user profile.
	 * <p>
	 * Get suggestions for user profiles that match specified search criteria.
	 * <p>
	 * NOTE: The user profile feature is designed only for use by Kibana and
	 * Elastic's Observability, Enterprise Search, and Elastic Security solutions.
	 * Individual users and external applications should not call this API directly.
	 * Elastic reserves the right to change or remove this feature in future
	 * releases without prior notice.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-suggest-user-profiles">Documentation
	 *      on elastic.co</a>
	 */

	public SuggestUserProfilesResponse suggestUserProfiles() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new SuggestUserProfilesRequest.Builder().build(),
				SuggestUserProfilesRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: security.update_api_key

	/**
	 * Update an API key.
	 * <p>
	 * Update attributes of an existing API key. This API supports updates to an API
	 * key's access scope, expiration, and metadata.
	 * <p>
	 * To use this API, you must have at least the <code>manage_own_api_key</code>
	 * cluster privilege. Users can only update API keys that they created or that
	 * were granted to them. To update another user’s API key, use the
	 * <code>run_as</code> feature to submit a request on behalf of another user.
	 * <p>
	 * IMPORTANT: It's not possible to use an API key as the authentication
	 * credential for this API. The owner user’s credentials are required.
	 * <p>
	 * Use this API to update API keys created by the create API key or grant API
	 * Key APIs. If you need to apply the same update to many API keys, you can use
	 * the bulk update API keys API to reduce overhead. It's not possible to update
	 * expired API keys or API keys that have been invalidated by the invalidate API
	 * key API.
	 * <p>
	 * The access scope of an API key is derived from the
	 * <code>role_descriptors</code> you specify in the request and a snapshot of
	 * the owner user's permissions at the time of the request. The snapshot of the
	 * owner's permissions is updated automatically on every call.
	 * <p>
	 * IMPORTANT: If you don't specify <code>role_descriptors</code> in the request,
	 * a call to this API might still change the API key's access scope. This change
	 * can occur if the owner user's permissions have changed since the API key was
	 * created or last modified.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-update-api-key">Documentation
	 *      on elastic.co</a>
	 */

	public UpdateApiKeyResponse updateApiKey(UpdateApiKeyRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdateApiKeyRequest, UpdateApiKeyResponse, ErrorResponse> endpoint = (JsonEndpoint<UpdateApiKeyRequest, UpdateApiKeyResponse, ErrorResponse>) UpdateApiKeyRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Update an API key.
	 * <p>
	 * Update attributes of an existing API key. This API supports updates to an API
	 * key's access scope, expiration, and metadata.
	 * <p>
	 * To use this API, you must have at least the <code>manage_own_api_key</code>
	 * cluster privilege. Users can only update API keys that they created or that
	 * were granted to them. To update another user’s API key, use the
	 * <code>run_as</code> feature to submit a request on behalf of another user.
	 * <p>
	 * IMPORTANT: It's not possible to use an API key as the authentication
	 * credential for this API. The owner user’s credentials are required.
	 * <p>
	 * Use this API to update API keys created by the create API key or grant API
	 * Key APIs. If you need to apply the same update to many API keys, you can use
	 * the bulk update API keys API to reduce overhead. It's not possible to update
	 * expired API keys or API keys that have been invalidated by the invalidate API
	 * key API.
	 * <p>
	 * The access scope of an API key is derived from the
	 * <code>role_descriptors</code> you specify in the request and a snapshot of
	 * the owner user's permissions at the time of the request. The snapshot of the
	 * owner's permissions is updated automatically on every call.
	 * <p>
	 * IMPORTANT: If you don't specify <code>role_descriptors</code> in the request,
	 * a call to this API might still change the API key's access scope. This change
	 * can occur if the owner user's permissions have changed since the API key was
	 * created or last modified.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateApiKeyRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-update-api-key">Documentation
	 *      on elastic.co</a>
	 */

	public final UpdateApiKeyResponse updateApiKey(
			Function<UpdateApiKeyRequest.Builder, ObjectBuilder<UpdateApiKeyRequest>> fn)
			throws IOException, ElasticsearchException {
		return updateApiKey(fn.apply(new UpdateApiKeyRequest.Builder()).build());
	}

	// ----- Endpoint: security.update_cross_cluster_api_key

	/**
	 * Update a cross-cluster API key.
	 * <p>
	 * Update the attributes of an existing cross-cluster API key, which is used for
	 * API key based remote cluster access.
	 * <p>
	 * To use this API, you must have at least the <code>manage_security</code>
	 * cluster privilege. Users can only update API keys that they created. To
	 * update another user's API key, use the <code>run_as</code> feature to submit
	 * a request on behalf of another user.
	 * <p>
	 * IMPORTANT: It's not possible to use an API key as the authentication
	 * credential for this API. To update an API key, the owner user's credentials
	 * are required.
	 * <p>
	 * It's not possible to update expired API keys, or API keys that have been
	 * invalidated by the invalidate API key API.
	 * <p>
	 * This API supports updates to an API key's access scope, metadata, and
	 * expiration. The owner user's information, such as the <code>username</code>
	 * and <code>realm</code>, is also updated automatically on every call.
	 * <p>
	 * NOTE: This API cannot update REST API keys, which should be updated by either
	 * the update API key or bulk update API keys API.
	 * <p>
	 * To learn more about how to use this API, refer to the <a href=
	 * "https://www.elastic.co/docs/reference/elasticsearch/rest-apis/update-cc-api-key-examples">Update
	 * cross cluter API key API examples page</a>.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-update-cross-cluster-api-key">Documentation
	 *      on elastic.co</a>
	 */

	public UpdateCrossClusterApiKeyResponse updateCrossClusterApiKey(UpdateCrossClusterApiKeyRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdateCrossClusterApiKeyRequest, UpdateCrossClusterApiKeyResponse, ErrorResponse> endpoint = (JsonEndpoint<UpdateCrossClusterApiKeyRequest, UpdateCrossClusterApiKeyResponse, ErrorResponse>) UpdateCrossClusterApiKeyRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Update a cross-cluster API key.
	 * <p>
	 * Update the attributes of an existing cross-cluster API key, which is used for
	 * API key based remote cluster access.
	 * <p>
	 * To use this API, you must have at least the <code>manage_security</code>
	 * cluster privilege. Users can only update API keys that they created. To
	 * update another user's API key, use the <code>run_as</code> feature to submit
	 * a request on behalf of another user.
	 * <p>
	 * IMPORTANT: It's not possible to use an API key as the authentication
	 * credential for this API. To update an API key, the owner user's credentials
	 * are required.
	 * <p>
	 * It's not possible to update expired API keys, or API keys that have been
	 * invalidated by the invalidate API key API.
	 * <p>
	 * This API supports updates to an API key's access scope, metadata, and
	 * expiration. The owner user's information, such as the <code>username</code>
	 * and <code>realm</code>, is also updated automatically on every call.
	 * <p>
	 * NOTE: This API cannot update REST API keys, which should be updated by either
	 * the update API key or bulk update API keys API.
	 * <p>
	 * To learn more about how to use this API, refer to the <a href=
	 * "https://www.elastic.co/docs/reference/elasticsearch/rest-apis/update-cc-api-key-examples">Update
	 * cross cluter API key API examples page</a>.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateCrossClusterApiKeyRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-update-cross-cluster-api-key">Documentation
	 *      on elastic.co</a>
	 */

	public final UpdateCrossClusterApiKeyResponse updateCrossClusterApiKey(
			Function<UpdateCrossClusterApiKeyRequest.Builder, ObjectBuilder<UpdateCrossClusterApiKeyRequest>> fn)
			throws IOException, ElasticsearchException {
		return updateCrossClusterApiKey(fn.apply(new UpdateCrossClusterApiKeyRequest.Builder()).build());
	}

	// ----- Endpoint: security.update_settings

	/**
	 * Update security index settings.
	 * <p>
	 * Update the user-configurable settings for the security internal index
	 * (<code>.security</code> and associated indices). Only a subset of settings
	 * are allowed to be modified. This includes
	 * <code>index.auto_expand_replicas</code> and
	 * <code>index.number_of_replicas</code>.
	 * <p>
	 * NOTE: If <code>index.auto_expand_replicas</code> is set,
	 * <code>index.number_of_replicas</code> will be ignored during updates.
	 * <p>
	 * If a specific index is not in use on the system and settings are provided for
	 * it, the request will be rejected. This API does not yet support configuring
	 * the settings for indices before they are in use.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-update-settings">Documentation
	 *      on elastic.co</a>
	 */

	public UpdateSettingsResponse updateSettings(UpdateSettingsRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdateSettingsRequest, UpdateSettingsResponse, ErrorResponse> endpoint = (JsonEndpoint<UpdateSettingsRequest, UpdateSettingsResponse, ErrorResponse>) UpdateSettingsRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Update security index settings.
	 * <p>
	 * Update the user-configurable settings for the security internal index
	 * (<code>.security</code> and associated indices). Only a subset of settings
	 * are allowed to be modified. This includes
	 * <code>index.auto_expand_replicas</code> and
	 * <code>index.number_of_replicas</code>.
	 * <p>
	 * NOTE: If <code>index.auto_expand_replicas</code> is set,
	 * <code>index.number_of_replicas</code> will be ignored during updates.
	 * <p>
	 * If a specific index is not in use on the system and settings are provided for
	 * it, the request will be rejected. This API does not yet support configuring
	 * the settings for indices before they are in use.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateSettingsRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-update-settings">Documentation
	 *      on elastic.co</a>
	 */

	public final UpdateSettingsResponse updateSettings(
			Function<UpdateSettingsRequest.Builder, ObjectBuilder<UpdateSettingsRequest>> fn)
			throws IOException, ElasticsearchException {
		return updateSettings(fn.apply(new UpdateSettingsRequest.Builder()).build());
	}

	/**
	 * Update security index settings.
	 * <p>
	 * Update the user-configurable settings for the security internal index
	 * (<code>.security</code> and associated indices). Only a subset of settings
	 * are allowed to be modified. This includes
	 * <code>index.auto_expand_replicas</code> and
	 * <code>index.number_of_replicas</code>.
	 * <p>
	 * NOTE: If <code>index.auto_expand_replicas</code> is set,
	 * <code>index.number_of_replicas</code> will be ignored during updates.
	 * <p>
	 * If a specific index is not in use on the system and settings are provided for
	 * it, the request will be rejected. This API does not yet support configuring
	 * the settings for indices before they are in use.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-update-settings">Documentation
	 *      on elastic.co</a>
	 */

	public UpdateSettingsResponse updateSettings() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new UpdateSettingsRequest.Builder().build(),
				UpdateSettingsRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: security.update_user_profile_data

	/**
	 * Update user profile data.
	 * <p>
	 * Update specific data for the user profile that is associated with a unique
	 * ID.
	 * <p>
	 * NOTE: The user profile feature is designed only for use by Kibana and
	 * Elastic's Observability, Enterprise Search, and Elastic Security solutions.
	 * Individual users and external applications should not call this API directly.
	 * Elastic reserves the right to change or remove this feature in future
	 * releases without prior notice.
	 * <p>
	 * To use this API, you must have one of the following privileges:
	 * <ul>
	 * <li>The <code>manage_user_profile</code> cluster privilege.</li>
	 * <li>The <code>update_profile_data</code> global privilege for the namespaces
	 * that are referenced in the request.</li>
	 * </ul>
	 * <p>
	 * This API updates the <code>labels</code> and <code>data</code> fields of an
	 * existing user profile document with JSON objects. New keys and their values
	 * are added to the profile document and conflicting keys are replaced by data
	 * that's included in the request.
	 * <p>
	 * For both labels and data, content is namespaced by the top-level fields. The
	 * <code>update_profile_data</code> global privilege grants privileges for
	 * updating only the allowed namespaces.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-update-user-profile-data">Documentation
	 *      on elastic.co</a>
	 */

	public UpdateUserProfileDataResponse updateUserProfileData(UpdateUserProfileDataRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdateUserProfileDataRequest, UpdateUserProfileDataResponse, ErrorResponse> endpoint = (JsonEndpoint<UpdateUserProfileDataRequest, UpdateUserProfileDataResponse, ErrorResponse>) UpdateUserProfileDataRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Update user profile data.
	 * <p>
	 * Update specific data for the user profile that is associated with a unique
	 * ID.
	 * <p>
	 * NOTE: The user profile feature is designed only for use by Kibana and
	 * Elastic's Observability, Enterprise Search, and Elastic Security solutions.
	 * Individual users and external applications should not call this API directly.
	 * Elastic reserves the right to change or remove this feature in future
	 * releases without prior notice.
	 * <p>
	 * To use this API, you must have one of the following privileges:
	 * <ul>
	 * <li>The <code>manage_user_profile</code> cluster privilege.</li>
	 * <li>The <code>update_profile_data</code> global privilege for the namespaces
	 * that are referenced in the request.</li>
	 * </ul>
	 * <p>
	 * This API updates the <code>labels</code> and <code>data</code> fields of an
	 * existing user profile document with JSON objects. New keys and their values
	 * are added to the profile document and conflicting keys are replaced by data
	 * that's included in the request.
	 * <p>
	 * For both labels and data, content is namespaced by the top-level fields. The
	 * <code>update_profile_data</code> global privilege grants privileges for
	 * updating only the allowed namespaces.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link UpdateUserProfileDataRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/docs/api/doc/elasticsearch/operation/operation-security-update-user-profile-data">Documentation
	 *      on elastic.co</a>
	 */

	public final UpdateUserProfileDataResponse updateUserProfileData(
			Function<UpdateUserProfileDataRequest.Builder, ObjectBuilder<UpdateUserProfileDataRequest>> fn)
			throws IOException, ElasticsearchException {
		return updateUserProfileData(fn.apply(new UpdateUserProfileDataRequest.Builder()).build());
	}

}
