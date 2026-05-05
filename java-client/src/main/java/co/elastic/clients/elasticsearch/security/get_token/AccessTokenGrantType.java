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

package co.elastic.clients.elasticsearch.security.get_token;

import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;

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
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#security.get_token.AccessTokenGrantType">API
 *      specification</a>
 */
@JsonpDeserializable
public enum AccessTokenGrantType implements JsonEnum {
	/**
	 * This grant type implements the Resource Owner Password Credentials Grant of
	 * OAuth2. In this grant, a trusted client exchanges the end user's credentials
	 * for an access token and (possibly) a refresh token. The request needs to be
	 * made by an authenticated user but happens on behalf of another authenticated
	 * user (the one whose credentials are passed as request parameters). This grant
	 * type is not suitable or designed for the self-service user creation of
	 * tokens.
	 */
	Password("password"),

	/**
	 * This grant type implements the Client Credentials Grant of OAuth2. It is
	 * geared for machine to machine communication and is not suitable or designed
	 * for the self-service user creation of tokens. It generates only access tokens
	 * that cannot be refreshed. The premise is that the entity that uses
	 * <code>client_credentials</code> has constant access to a set of (client, not
	 * end-user) credentials and can authenticate itself at will.
	 */
	ClientCredentials("client_credentials"),

	/**
	 * This grant type is supported internally and implements SPNEGO based Kerberos
	 * support. The <code>_kerberos</code> grant type may change from version to
	 * version.
	 */
	Kerberos("_kerberos"),

	/**
	 * This grant type implements the Refresh Token Grant of OAuth2. In this grant a
	 * user exchanges a previously issued refresh token for a new access token and a
	 * new refresh token.
	 */
	RefreshToken("refresh_token"),

	;

	private final String jsonValue;

	AccessTokenGrantType(String jsonValue) {
		this.jsonValue = jsonValue;
	}

	public String jsonValue() {
		return this.jsonValue;
	}

	public static final JsonEnum.Deserializer<AccessTokenGrantType> _DESERIALIZER = new JsonEnum.Deserializer<>(
			AccessTokenGrantType.values());
}
