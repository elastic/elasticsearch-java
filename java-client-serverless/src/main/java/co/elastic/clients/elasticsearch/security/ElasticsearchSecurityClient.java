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

	// ----- Endpoint: security.authenticate

	/**
	 * Authenticate a user. Authenticates a user and returns information about the
	 * authenticated user. Include the user information in a
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
	public AuthenticateResponse authenticate() throws IOException, ElasticsearchException {
		return this.transport.performRequest(AuthenticateRequest._INSTANCE, AuthenticateRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: security.create_api_key

	/**
	 * Create an API key. Creates an API key for access without requiring basic
	 * authentication. A successful request returns a JSON structure that contains
	 * the API key, its unique id, and its name. If applicable, it also returns
	 * expiration information for the API key in milliseconds. NOTE: By default, API
	 * keys never expire. You can specify expiration information when you create the
	 * API keys.
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
	 * Create an API key. Creates an API key for access without requiring basic
	 * authentication. A successful request returns a JSON structure that contains
	 * the API key, its unique id, and its name. If applicable, it also returns
	 * expiration information for the API key in milliseconds. NOTE: By default, API
	 * keys never expire. You can specify expiration information when you create the
	 * API keys.
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
	 * Create an API key. Creates an API key for access without requiring basic
	 * authentication. A successful request returns a JSON structure that contains
	 * the API key, its unique id, and its name. If applicable, it also returns
	 * expiration information for the API key in milliseconds. NOTE: By default, API
	 * keys never expire. You can specify expiration information when you create the
	 * API keys.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-create-api-key.html">Documentation
	 *      on elastic.co</a>
	 */

	public CreateApiKeyResponse createApiKey() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new CreateApiKeyRequest.Builder().build(), CreateApiKeyRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: security.get_api_key

	/**
	 * Get API key information. Retrieves information for one or more API keys.
	 * NOTE: If you have only the <code>manage_own_api_key</code> privilege, this
	 * API returns only the API keys that you own. If you have
	 * <code>read_security</code>, <code>manage_api_key</code> or greater privileges
	 * (including <code>manage_security</code>), this API returns all API keys
	 * regardless of ownership.
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
	 * Get API key information. Retrieves information for one or more API keys.
	 * NOTE: If you have only the <code>manage_own_api_key</code> privilege, this
	 * API returns only the API keys that you own. If you have
	 * <code>read_security</code>, <code>manage_api_key</code> or greater privileges
	 * (including <code>manage_security</code>), this API returns all API keys
	 * regardless of ownership.
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
	 * Get API key information. Retrieves information for one or more API keys.
	 * NOTE: If you have only the <code>manage_own_api_key</code> privilege, this
	 * API returns only the API keys that you own. If you have
	 * <code>read_security</code>, <code>manage_api_key</code> or greater privileges
	 * (including <code>manage_security</code>), this API returns all API keys
	 * regardless of ownership.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-get-api-key.html">Documentation
	 *      on elastic.co</a>
	 */

	public GetApiKeyResponse getApiKey() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetApiKeyRequest.Builder().build(), GetApiKeyRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: security.has_privileges

	/**
	 * Check user privileges. Determines whether the specified user has a specified
	 * list of privileges.
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
	 * Check user privileges. Determines whether the specified user has a specified
	 * list of privileges.
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
	 * Check user privileges. Determines whether the specified user has a specified
	 * list of privileges.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-has-privileges.html">Documentation
	 *      on elastic.co</a>
	 */

	public HasPrivilegesResponse hasPrivileges() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new HasPrivilegesRequest.Builder().build(), HasPrivilegesRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: security.invalidate_api_key

	/**
	 * Invalidate API keys. Invalidates one or more API keys. The
	 * <code>manage_api_key</code> privilege allows deleting any API keys. The
	 * <code>manage_own_api_key</code> only allows deleting API keys that are owned
	 * by the user. In addition, with the <code>manage_own_api_key</code> privilege,
	 * an invalidation request must be issued in one of the three formats:
	 * <ul>
	 * <li>Set the parameter <code>owner=true</code>.</li>
	 * <li>Or, set both <code>username</code> and <code>realm_name</code> to match
	 * the user’s identity.</li>
	 * <li>Or, if the request is issued by an API key, i.e. an API key invalidates
	 * itself, specify its ID in the <code>ids</code> field.</li>
	 * </ul>
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
	 * Invalidate API keys. Invalidates one or more API keys. The
	 * <code>manage_api_key</code> privilege allows deleting any API keys. The
	 * <code>manage_own_api_key</code> only allows deleting API keys that are owned
	 * by the user. In addition, with the <code>manage_own_api_key</code> privilege,
	 * an invalidation request must be issued in one of the three formats:
	 * <ul>
	 * <li>Set the parameter <code>owner=true</code>.</li>
	 * <li>Or, set both <code>username</code> and <code>realm_name</code> to match
	 * the user’s identity.</li>
	 * <li>Or, if the request is issued by an API key, i.e. an API key invalidates
	 * itself, specify its ID in the <code>ids</code> field.</li>
	 * </ul>
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
	 * Invalidate API keys. Invalidates one or more API keys. The
	 * <code>manage_api_key</code> privilege allows deleting any API keys. The
	 * <code>manage_own_api_key</code> only allows deleting API keys that are owned
	 * by the user. In addition, with the <code>manage_own_api_key</code> privilege,
	 * an invalidation request must be issued in one of the three formats:
	 * <ul>
	 * <li>Set the parameter <code>owner=true</code>.</li>
	 * <li>Or, set both <code>username</code> and <code>realm_name</code> to match
	 * the user’s identity.</li>
	 * <li>Or, if the request is issued by an API key, i.e. an API key invalidates
	 * itself, specify its ID in the <code>ids</code> field.</li>
	 * </ul>
	 *
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-invalidate-api-key.html">Documentation
	 *      on elastic.co</a>
	 */

	public InvalidateApiKeyResponse invalidateApiKey() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new InvalidateApiKeyRequest.Builder().build(),
				InvalidateApiKeyRequest._ENDPOINT, this.transportOptions);
	}

	// ----- Endpoint: security.query_api_keys

	/**
	 * Query API keys. Retrieves a paginated list of API keys and their information.
	 * You can optionally filter the results with a query.
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
	 * Query API keys. Retrieves a paginated list of API keys and their information.
	 * You can optionally filter the results with a query.
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
	 * Query API keys. Retrieves a paginated list of API keys and their information.
	 * You can optionally filter the results with a query.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-query-api-key.html">Documentation
	 *      on elastic.co</a>
	 */

	public QueryApiKeysResponse queryApiKeys() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new QueryApiKeysRequest.Builder().build(), QueryApiKeysRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: security.update_api_key

	/**
	 * Update an API key. Updates attributes of an existing API key. Users can only
	 * update API keys that they created or that were granted to them. Use this API
	 * to update API keys created by the create API Key or grant API Key APIs. If
	 * you need to apply the same update to many API keys, you can use bulk update
	 * API Keys to reduce overhead. It’s not possible to update expired API keys, or
	 * API keys that have been invalidated by invalidate API Key. This API supports
	 * updates to an API key’s access scope and metadata. The access scope of an API
	 * key is derived from the <code>role_descriptors</code> you specify in the
	 * request, and a snapshot of the owner user’s permissions at the time of the
	 * request. The snapshot of the owner’s permissions is updated automatically on
	 * every call. If you don’t specify <code>role_descriptors</code> in the
	 * request, a call to this API might still change the API key’s access scope.
	 * This change can occur if the owner user’s permissions have changed since the
	 * API key was created or last modified. To update another user’s API key, use
	 * the <code>run_as</code> feature to submit a request on behalf of another
	 * user. IMPORTANT: It’s not possible to use an API key as the authentication
	 * credential for this API. To update an API key, the owner user’s credentials
	 * are required.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/security-api-update-api-key.html">Documentation
	 *      on elastic.co</a>
	 */

	public UpdateApiKeyResponse updateApiKey(UpdateApiKeyRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<UpdateApiKeyRequest, UpdateApiKeyResponse, ErrorResponse> endpoint = (JsonEndpoint<UpdateApiKeyRequest, UpdateApiKeyResponse, ErrorResponse>) UpdateApiKeyRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Update an API key. Updates attributes of an existing API key. Users can only
	 * update API keys that they created or that were granted to them. Use this API
	 * to update API keys created by the create API Key or grant API Key APIs. If
	 * you need to apply the same update to many API keys, you can use bulk update
	 * API Keys to reduce overhead. It’s not possible to update expired API keys, or
	 * API keys that have been invalidated by invalidate API Key. This API supports
	 * updates to an API key’s access scope and metadata. The access scope of an API
	 * key is derived from the <code>role_descriptors</code> you specify in the
	 * request, and a snapshot of the owner user’s permissions at the time of the
	 * request. The snapshot of the owner’s permissions is updated automatically on
	 * every call. If you don’t specify <code>role_descriptors</code> in the
	 * request, a call to this API might still change the API key’s access scope.
	 * This change can occur if the owner user’s permissions have changed since the
	 * API key was created or last modified. To update another user’s API key, use
	 * the <code>run_as</code> feature to submit a request on behalf of another
	 * user. IMPORTANT: It’s not possible to use an API key as the authentication
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

	public final UpdateApiKeyResponse updateApiKey(
			Function<UpdateApiKeyRequest.Builder, ObjectBuilder<UpdateApiKeyRequest>> fn)
			throws IOException, ElasticsearchException {
		return updateApiKey(fn.apply(new UpdateApiKeyRequest.Builder()).build());
	}

}
