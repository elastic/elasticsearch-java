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
import co.elastic.clients.elasticsearch.security.grant_api_key.ApiKeyGrantType;
import co.elastic.clients.elasticsearch.security.grant_api_key.GrantApiKey;
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
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.grant_api_key.Request

/**
 * Creates an API key on behalf of another user.
 * 
 * @see <a href="../doc-files/api-spec.html#security.grant_api_key.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class GrantApiKeyRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final String accessToken;

	private final GrantApiKey apiKey;

	private final ApiKeyGrantType grantType;

	@Nullable
	private final String password;

	@Nullable
	private final String username;

	// ---------------------------------------------------------------------------------------------

	private GrantApiKeyRequest(Builder builder) {

		this.accessToken = builder.accessToken;
		this.apiKey = ApiTypeHelper.requireNonNull(builder.apiKey, this, "apiKey");
		this.grantType = ApiTypeHelper.requireNonNull(builder.grantType, this, "grantType");
		this.password = builder.password;
		this.username = builder.username;

	}

	public static GrantApiKeyRequest of(Function<Builder, ObjectBuilder<GrantApiKeyRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code access_token}
	 */
	@Nullable
	public final String accessToken() {
		return this.accessToken;
	}

	/**
	 * Required - API name: {@code api_key}
	 */
	public final GrantApiKey apiKey() {
		return this.apiKey;
	}

	/**
	 * Required - API name: {@code grant_type}
	 */
	public final ApiKeyGrantType grantType() {
		return this.grantType;
	}

	/**
	 * API name: {@code password}
	 */
	@Nullable
	public final String password() {
		return this.password;
	}

	/**
	 * API name: {@code username}
	 */
	@Nullable
	public final String username() {
		return this.username;
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

		if (this.accessToken != null) {
			generator.writeKey("access_token");
			generator.write(this.accessToken);

		}
		generator.writeKey("api_key");
		this.apiKey.serialize(generator, mapper);

		generator.writeKey("grant_type");
		this.grantType.serialize(generator, mapper);
		if (this.password != null) {
			generator.writeKey("password");
			generator.write(this.password);

		}
		if (this.username != null) {
			generator.writeKey("username");
			generator.write(this.username);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GrantApiKeyRequest}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GrantApiKeyRequest> {
		@Nullable
		private String accessToken;

		private GrantApiKey apiKey;

		private ApiKeyGrantType grantType;

		@Nullable
		private String password;

		@Nullable
		private String username;

		/**
		 * API name: {@code access_token}
		 */
		public final Builder accessToken(@Nullable String value) {
			this.accessToken = value;
			return this;
		}

		/**
		 * Required - API name: {@code api_key}
		 */
		public final Builder apiKey(GrantApiKey value) {
			this.apiKey = value;
			return this;
		}

		/**
		 * Required - API name: {@code api_key}
		 */
		public final Builder apiKey(Function<GrantApiKey.Builder, ObjectBuilder<GrantApiKey>> fn) {
			return this.apiKey(fn.apply(new GrantApiKey.Builder()).build());
		}

		/**
		 * Required - API name: {@code grant_type}
		 */
		public final Builder grantType(ApiKeyGrantType value) {
			this.grantType = value;
			return this;
		}

		/**
		 * API name: {@code password}
		 */
		public final Builder password(@Nullable String value) {
			this.password = value;
			return this;
		}

		/**
		 * API name: {@code username}
		 */
		public final Builder username(@Nullable String value) {
			this.username = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GrantApiKeyRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GrantApiKeyRequest build() {
			_checkSingleUse();

			return new GrantApiKeyRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GrantApiKeyRequest}
	 */
	public static final JsonpDeserializer<GrantApiKeyRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GrantApiKeyRequest::setupGrantApiKeyRequestDeserializer);

	protected static void setupGrantApiKeyRequestDeserializer(ObjectDeserializer<GrantApiKeyRequest.Builder> op) {

		op.add(Builder::accessToken, JsonpDeserializer.stringDeserializer(), "access_token");
		op.add(Builder::apiKey, GrantApiKey._DESERIALIZER, "api_key");
		op.add(Builder::grantType, ApiKeyGrantType._DESERIALIZER, "grant_type");
		op.add(Builder::password, JsonpDeserializer.stringDeserializer(), "password");
		op.add(Builder::username, JsonpDeserializer.stringDeserializer(), "username");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.grant_api_key}".
	 */
	public static final Endpoint<GrantApiKeyRequest, GrantApiKeyResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/security.grant_api_key",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_security/api_key/grant";

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, GrantApiKeyResponse._DESERIALIZER);
}
