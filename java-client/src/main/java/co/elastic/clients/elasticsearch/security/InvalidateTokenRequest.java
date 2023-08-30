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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.invalidate_token.Request

/**
 * Invalidates one or more access tokens or refresh tokens.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#security.invalidate_token.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class InvalidateTokenRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final String realmName;

	@Nullable
	private final String refreshToken;

	@Nullable
	private final String token;

	@Nullable
	private final String username;

	// ---------------------------------------------------------------------------------------------

	private InvalidateTokenRequest(Builder builder) {

		this.realmName = builder.realmName;
		this.refreshToken = builder.refreshToken;
		this.token = builder.token;
		this.username = builder.username;

	}

	public static InvalidateTokenRequest of(Function<Builder, ObjectBuilder<InvalidateTokenRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code realm_name}
	 */
	@Nullable
	public final String realmName() {
		return this.realmName;
	}

	/**
	 * API name: {@code refresh_token}
	 */
	@Nullable
	public final String refreshToken() {
		return this.refreshToken;
	}

	/**
	 * API name: {@code token}
	 */
	@Nullable
	public final String token() {
		return this.token;
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

		if (this.realmName != null) {
			generator.writeKey("realm_name");
			generator.write(this.realmName);

		}
		if (this.refreshToken != null) {
			generator.writeKey("refresh_token");
			generator.write(this.refreshToken);

		}
		if (this.token != null) {
			generator.writeKey("token");
			generator.write(this.token);

		}
		if (this.username != null) {
			generator.writeKey("username");
			generator.write(this.username);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link InvalidateTokenRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<InvalidateTokenRequest> {
		@Nullable
		private String realmName;

		@Nullable
		private String refreshToken;

		@Nullable
		private String token;

		@Nullable
		private String username;

		/**
		 * API name: {@code realm_name}
		 */
		public final Builder realmName(@Nullable String value) {
			this.realmName = value;
			return this;
		}

		/**
		 * API name: {@code refresh_token}
		 */
		public final Builder refreshToken(@Nullable String value) {
			this.refreshToken = value;
			return this;
		}

		/**
		 * API name: {@code token}
		 */
		public final Builder token(@Nullable String value) {
			this.token = value;
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
		 * Builds a {@link InvalidateTokenRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public InvalidateTokenRequest build() {
			_checkSingleUse();

			return new InvalidateTokenRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link InvalidateTokenRequest}
	 */
	public static final JsonpDeserializer<InvalidateTokenRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, InvalidateTokenRequest::setupInvalidateTokenRequestDeserializer);

	protected static void setupInvalidateTokenRequestDeserializer(
			ObjectDeserializer<InvalidateTokenRequest.Builder> op) {

		op.add(Builder::realmName, JsonpDeserializer.stringDeserializer(), "realm_name");
		op.add(Builder::refreshToken, JsonpDeserializer.stringDeserializer(), "refresh_token");
		op.add(Builder::token, JsonpDeserializer.stringDeserializer(), "token");
		op.add(Builder::username, JsonpDeserializer.stringDeserializer(), "username");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.invalidate_token}".
	 */
	public static final Endpoint<InvalidateTokenRequest, InvalidateTokenResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/security.invalidate_token",

			// Request method
			request -> {
				return "DELETE";

			},

			// Request path
			request -> {
				return "/_security/oauth2/token";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, InvalidateTokenResponse._DESERIALIZER);
}
