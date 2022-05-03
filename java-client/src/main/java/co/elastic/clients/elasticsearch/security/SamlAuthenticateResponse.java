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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.saml_authenticate.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#security.saml_authenticate.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class SamlAuthenticateResponse implements JsonpSerializable {
	private final String accessToken;

	private final String username;

	private final int expiresIn;

	private final String refreshToken;

	private final String realm;

	// ---------------------------------------------------------------------------------------------

	private SamlAuthenticateResponse(Builder builder) {

		this.accessToken = ApiTypeHelper.requireNonNull(builder.accessToken, this, "accessToken");
		this.username = ApiTypeHelper.requireNonNull(builder.username, this, "username");
		this.expiresIn = ApiTypeHelper.requireNonNull(builder.expiresIn, this, "expiresIn");
		this.refreshToken = ApiTypeHelper.requireNonNull(builder.refreshToken, this, "refreshToken");
		this.realm = ApiTypeHelper.requireNonNull(builder.realm, this, "realm");

	}

	public static SamlAuthenticateResponse of(Function<Builder, ObjectBuilder<SamlAuthenticateResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code access_token}
	 */
	public final String accessToken() {
		return this.accessToken;
	}

	/**
	 * Required - API name: {@code username}
	 */
	public final String username() {
		return this.username;
	}

	/**
	 * Required - API name: {@code expires_in}
	 */
	public final int expiresIn() {
		return this.expiresIn;
	}

	/**
	 * Required - API name: {@code refresh_token}
	 */
	public final String refreshToken() {
		return this.refreshToken;
	}

	/**
	 * Required - API name: {@code realm}
	 */
	public final String realm() {
		return this.realm;
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

		generator.writeKey("access_token");
		generator.write(this.accessToken);

		generator.writeKey("username");
		generator.write(this.username);

		generator.writeKey("expires_in");
		generator.write(this.expiresIn);

		generator.writeKey("refresh_token");
		generator.write(this.refreshToken);

		generator.writeKey("realm");
		generator.write(this.realm);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SamlAuthenticateResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<SamlAuthenticateResponse> {
		private String accessToken;

		private String username;

		private Integer expiresIn;

		private String refreshToken;

		private String realm;

		/**
		 * Required - API name: {@code access_token}
		 */
		public final Builder accessToken(String value) {
			this.accessToken = value;
			return this;
		}

		/**
		 * Required - API name: {@code username}
		 */
		public final Builder username(String value) {
			this.username = value;
			return this;
		}

		/**
		 * Required - API name: {@code expires_in}
		 */
		public final Builder expiresIn(int value) {
			this.expiresIn = value;
			return this;
		}

		/**
		 * Required - API name: {@code refresh_token}
		 */
		public final Builder refreshToken(String value) {
			this.refreshToken = value;
			return this;
		}

		/**
		 * Required - API name: {@code realm}
		 */
		public final Builder realm(String value) {
			this.realm = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SamlAuthenticateResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SamlAuthenticateResponse build() {
			_checkSingleUse();

			return new SamlAuthenticateResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SamlAuthenticateResponse}
	 */
	public static final JsonpDeserializer<SamlAuthenticateResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SamlAuthenticateResponse::setupSamlAuthenticateResponseDeserializer);

	protected static void setupSamlAuthenticateResponseDeserializer(
			ObjectDeserializer<SamlAuthenticateResponse.Builder> op) {

		op.add(Builder::accessToken, JsonpDeserializer.stringDeserializer(), "access_token");
		op.add(Builder::username, JsonpDeserializer.stringDeserializer(), "username");
		op.add(Builder::expiresIn, JsonpDeserializer.integerDeserializer(), "expires_in");
		op.add(Builder::refreshToken, JsonpDeserializer.stringDeserializer(), "refresh_token");
		op.add(Builder::realm, JsonpDeserializer.stringDeserializer(), "realm");

	}

}
