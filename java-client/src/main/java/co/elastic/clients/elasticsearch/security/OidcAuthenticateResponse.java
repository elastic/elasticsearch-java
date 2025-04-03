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

// typedef: security.oidc_authenticate.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#security.oidc_authenticate.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class OidcAuthenticateResponse implements JsonpSerializable {
	private final String accessToken;

	private final int expiresIn;

	private final String refreshToken;

	private final String type;

	// ---------------------------------------------------------------------------------------------

	private OidcAuthenticateResponse(Builder builder) {

		this.accessToken = ApiTypeHelper.requireNonNullWithDefault(builder.accessToken, this, "accessToken",
				this.accessToken());
		this.expiresIn = ApiTypeHelper.requireNonNullWithDefault(builder.expiresIn, this, "expiresIn",
				this.expiresIn());
		this.refreshToken = ApiTypeHelper.requireNonNullWithDefault(builder.refreshToken, this, "refreshToken",
				this.refreshToken());
		this.type = ApiTypeHelper.requireNonNullWithDefault(builder.type, this, "type", this.type());

	}

	public static OidcAuthenticateResponse of(Function<Builder, ObjectBuilder<OidcAuthenticateResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The Elasticsearch access token.
	 * <p>
	 * API name: {@code access_token}
	 */
	public final String accessToken() {
		return this.accessToken;
	}

	/**
	 * Required - The duration (in seconds) of the tokens.
	 * <p>
	 * API name: {@code expires_in}
	 */
	public final int expiresIn() {
		return this.expiresIn;
	}

	/**
	 * Required - The Elasticsearch refresh token.
	 * <p>
	 * API name: {@code refresh_token}
	 */
	public final String refreshToken() {
		return this.refreshToken;
	}

	/**
	 * Required - The type of token.
	 * <p>
	 * API name: {@code type}
	 */
	public final String type() {
		return this.type;
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

		generator.writeKey("expires_in");
		generator.write(this.expiresIn);

		generator.writeKey("refresh_token");
		generator.write(this.refreshToken);

		generator.writeKey("type");
		generator.write(this.type);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link OidcAuthenticateResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<OidcAuthenticateResponse> {
		private String accessToken;

		private Integer expiresIn;

		private String refreshToken;

		private String type;

		/**
		 * Required - The Elasticsearch access token.
		 * <p>
		 * API name: {@code access_token}
		 */
		public final Builder accessToken(String value) {
			this.accessToken = value;
			return this;
		}

		/**
		 * Required - The duration (in seconds) of the tokens.
		 * <p>
		 * API name: {@code expires_in}
		 */
		public final Builder expiresIn(int value) {
			this.expiresIn = value;
			return this;
		}

		/**
		 * Required - The Elasticsearch refresh token.
		 * <p>
		 * API name: {@code refresh_token}
		 */
		public final Builder refreshToken(String value) {
			this.refreshToken = value;
			return this;
		}

		/**
		 * Required - The type of token.
		 * <p>
		 * API name: {@code type}
		 */
		public final Builder type(String value) {
			this.type = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link OidcAuthenticateResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public OidcAuthenticateResponse build() {
			_checkSingleUse();

			return new OidcAuthenticateResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link OidcAuthenticateResponse}
	 */
	public static final JsonpDeserializer<OidcAuthenticateResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, OidcAuthenticateResponse::setupOidcAuthenticateResponseDeserializer);

	protected static void setupOidcAuthenticateResponseDeserializer(
			ObjectDeserializer<OidcAuthenticateResponse.Builder> op) {

		op.add(Builder::accessToken, JsonpDeserializer.stringDeserializer(), "access_token");
		op.add(Builder::expiresIn, JsonpDeserializer.integerDeserializer(), "expires_in");
		op.add(Builder::refreshToken, JsonpDeserializer.stringDeserializer(), "refresh_token");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");

	}

}
