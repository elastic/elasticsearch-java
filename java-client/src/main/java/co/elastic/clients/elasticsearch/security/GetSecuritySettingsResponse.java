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

// typedef: security.get_settings.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#security.get_settings.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetSecuritySettingsResponse implements JsonpSerializable {
	private final SecuritySettings security;

	private final SecuritySettings securityProfile;

	private final SecuritySettings securityTokens;

	// ---------------------------------------------------------------------------------------------

	private GetSecuritySettingsResponse(Builder builder) {

		this.security = ApiTypeHelper.requireNonNullWithDefault(builder.security, this, "security", this.security());
		this.securityProfile = ApiTypeHelper.requireNonNullWithDefault(builder.securityProfile, this, "securityProfile",
				this.securityProfile());
		this.securityTokens = ApiTypeHelper.requireNonNullWithDefault(builder.securityTokens, this, "securityTokens",
				this.securityTokens());

	}

	public static GetSecuritySettingsResponse of(Function<Builder, ObjectBuilder<GetSecuritySettingsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Settings for the index used for most security configuration,
	 * including native realm users and roles configured with the API.
	 * <p>
	 * API name: {@code security}
	 */
	public final SecuritySettings security() {
		return this.security;
	}

	/**
	 * Required - Settings for the index used to store profile information.
	 * <p>
	 * API name: {@code security-profile}
	 */
	public final SecuritySettings securityProfile() {
		return this.securityProfile;
	}

	/**
	 * Required - Settings for the index used to store tokens.
	 * <p>
	 * API name: {@code security-tokens}
	 */
	public final SecuritySettings securityTokens() {
		return this.securityTokens;
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

		generator.writeKey("security");
		this.security.serialize(generator, mapper);

		generator.writeKey("security-profile");
		this.securityProfile.serialize(generator, mapper);

		generator.writeKey("security-tokens");
		this.securityTokens.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetSecuritySettingsResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GetSecuritySettingsResponse> {
		private SecuritySettings security;

		private SecuritySettings securityProfile;

		private SecuritySettings securityTokens;

		/**
		 * Required - Settings for the index used for most security configuration,
		 * including native realm users and roles configured with the API.
		 * <p>
		 * API name: {@code security}
		 */
		public final Builder security(SecuritySettings value) {
			this.security = value;
			return this;
		}

		/**
		 * Required - Settings for the index used for most security configuration,
		 * including native realm users and roles configured with the API.
		 * <p>
		 * API name: {@code security}
		 */
		public final Builder security(Function<SecuritySettings.Builder, ObjectBuilder<SecuritySettings>> fn) {
			return this.security(fn.apply(new SecuritySettings.Builder()).build());
		}

		/**
		 * Required - Settings for the index used to store profile information.
		 * <p>
		 * API name: {@code security-profile}
		 */
		public final Builder securityProfile(SecuritySettings value) {
			this.securityProfile = value;
			return this;
		}

		/**
		 * Required - Settings for the index used to store profile information.
		 * <p>
		 * API name: {@code security-profile}
		 */
		public final Builder securityProfile(Function<SecuritySettings.Builder, ObjectBuilder<SecuritySettings>> fn) {
			return this.securityProfile(fn.apply(new SecuritySettings.Builder()).build());
		}

		/**
		 * Required - Settings for the index used to store tokens.
		 * <p>
		 * API name: {@code security-tokens}
		 */
		public final Builder securityTokens(SecuritySettings value) {
			this.securityTokens = value;
			return this;
		}

		/**
		 * Required - Settings for the index used to store tokens.
		 * <p>
		 * API name: {@code security-tokens}
		 */
		public final Builder securityTokens(Function<SecuritySettings.Builder, ObjectBuilder<SecuritySettings>> fn) {
			return this.securityTokens(fn.apply(new SecuritySettings.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetSecuritySettingsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetSecuritySettingsResponse build() {
			_checkSingleUse();

			return new GetSecuritySettingsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetSecuritySettingsResponse}
	 */
	public static final JsonpDeserializer<GetSecuritySettingsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetSecuritySettingsResponse::setupGetSecuritySettingsResponseDeserializer);

	protected static void setupGetSecuritySettingsResponseDeserializer(
			ObjectDeserializer<GetSecuritySettingsResponse.Builder> op) {

		op.add(Builder::security, SecuritySettings._DESERIALIZER, "security");
		op.add(Builder::securityProfile, SecuritySettings._DESERIALIZER, "security-profile");
		op.add(Builder::securityTokens, SecuritySettings._DESERIALIZER, "security-tokens");

	}

}
