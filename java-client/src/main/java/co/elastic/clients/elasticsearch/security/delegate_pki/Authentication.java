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

package co.elastic.clients.elasticsearch.security.delegate_pki;

import co.elastic.clients.json.JsonData;
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
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
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

// typedef: security.delegate_pki.Authentication

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#security.delegate_pki.Authentication">API
 *      specification</a>
 */
@JsonpDeserializable
public class Authentication implements JsonpSerializable {
	private final String username;

	private final List<String> roles;

	@Nullable
	private final String fullName;

	@Nullable
	private final String email;

	private final Map<String, String> token;

	private final Map<String, JsonData> metadata;

	private final boolean enabled;

	private final AuthenticationRealm authenticationRealm;

	private final AuthenticationRealm lookupRealm;

	private final String authenticationType;

	private final Map<String, String> apiKey;

	// ---------------------------------------------------------------------------------------------

	private Authentication(Builder builder) {

		this.username = ApiTypeHelper.requireNonNull(builder.username, this, "username");
		this.roles = ApiTypeHelper.unmodifiableRequired(builder.roles, this, "roles");
		this.fullName = builder.fullName;
		this.email = builder.email;
		this.token = ApiTypeHelper.unmodifiable(builder.token);
		this.metadata = ApiTypeHelper.unmodifiableRequired(builder.metadata, this, "metadata");
		this.enabled = ApiTypeHelper.requireNonNull(builder.enabled, this, "enabled", false);
		this.authenticationRealm = ApiTypeHelper.requireNonNull(builder.authenticationRealm, this,
				"authenticationRealm");
		this.lookupRealm = ApiTypeHelper.requireNonNull(builder.lookupRealm, this, "lookupRealm");
		this.authenticationType = ApiTypeHelper.requireNonNull(builder.authenticationType, this, "authenticationType");
		this.apiKey = ApiTypeHelper.unmodifiable(builder.apiKey);

	}

	public static Authentication of(Function<Builder, ObjectBuilder<Authentication>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code username}
	 */
	public final String username() {
		return this.username;
	}

	/**
	 * Required - API name: {@code roles}
	 */
	public final List<String> roles() {
		return this.roles;
	}

	/**
	 * API name: {@code full_name}
	 */
	@Nullable
	public final String fullName() {
		return this.fullName;
	}

	/**
	 * API name: {@code email}
	 */
	@Nullable
	public final String email() {
		return this.email;
	}

	/**
	 * API name: {@code token}
	 */
	public final Map<String, String> token() {
		return this.token;
	}

	/**
	 * Required - API name: {@code metadata}
	 */
	public final Map<String, JsonData> metadata() {
		return this.metadata;
	}

	/**
	 * Required - API name: {@code enabled}
	 */
	public final boolean enabled() {
		return this.enabled;
	}

	/**
	 * Required - API name: {@code authentication_realm}
	 */
	public final AuthenticationRealm authenticationRealm() {
		return this.authenticationRealm;
	}

	/**
	 * Required - API name: {@code lookup_realm}
	 */
	public final AuthenticationRealm lookupRealm() {
		return this.lookupRealm;
	}

	/**
	 * Required - API name: {@code authentication_type}
	 */
	public final String authenticationType() {
		return this.authenticationType;
	}

	/**
	 * API name: {@code api_key}
	 */
	public final Map<String, String> apiKey() {
		return this.apiKey;
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

		generator.writeKey("username");
		generator.write(this.username);

		if (ApiTypeHelper.isDefined(this.roles)) {
			generator.writeKey("roles");
			generator.writeStartArray();
			for (String item0 : this.roles) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.fullName != null) {
			generator.writeKey("full_name");
			generator.write(this.fullName);

		}
		if (this.email != null) {
			generator.writeKey("email");
			generator.write(this.email);

		}
		if (ApiTypeHelper.isDefined(this.token)) {
			generator.writeKey("token");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.token.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.metadata)) {
			generator.writeKey("metadata");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.metadata.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("enabled");
		generator.write(this.enabled);

		generator.writeKey("authentication_realm");
		this.authenticationRealm.serialize(generator, mapper);

		generator.writeKey("lookup_realm");
		this.lookupRealm.serialize(generator, mapper);

		generator.writeKey("authentication_type");
		generator.write(this.authenticationType);

		if (ApiTypeHelper.isDefined(this.apiKey)) {
			generator.writeKey("api_key");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.apiKey.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Authentication}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Authentication> {
		private String username;

		private List<String> roles;

		@Nullable
		private String fullName;

		@Nullable
		private String email;

		@Nullable
		private Map<String, String> token;

		private Map<String, JsonData> metadata;

		private Boolean enabled;

		private AuthenticationRealm authenticationRealm;

		private AuthenticationRealm lookupRealm;

		private String authenticationType;

		@Nullable
		private Map<String, String> apiKey;

		/**
		 * Required - API name: {@code username}
		 */
		public final Builder username(String value) {
			this.username = value;
			return this;
		}

		/**
		 * Required - API name: {@code roles}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>roles</code>.
		 */
		public final Builder roles(List<String> list) {
			this.roles = _listAddAll(this.roles, list);
			return this;
		}

		/**
		 * Required - API name: {@code roles}
		 * <p>
		 * Adds one or more values to <code>roles</code>.
		 */
		public final Builder roles(String value, String... values) {
			this.roles = _listAdd(this.roles, value, values);
			return this;
		}

		/**
		 * API name: {@code full_name}
		 */
		public final Builder fullName(@Nullable String value) {
			this.fullName = value;
			return this;
		}

		/**
		 * API name: {@code email}
		 */
		public final Builder email(@Nullable String value) {
			this.email = value;
			return this;
		}

		/**
		 * API name: {@code token}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>token</code>.
		 */
		public final Builder token(Map<String, String> map) {
			this.token = _mapPutAll(this.token, map);
			return this;
		}

		/**
		 * API name: {@code token}
		 * <p>
		 * Adds an entry to <code>token</code>.
		 */
		public final Builder token(String key, String value) {
			this.token = _mapPut(this.token, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code metadata}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>metadata</code>.
		 */
		public final Builder metadata(Map<String, JsonData> map) {
			this.metadata = _mapPutAll(this.metadata, map);
			return this;
		}

		/**
		 * Required - API name: {@code metadata}
		 * <p>
		 * Adds an entry to <code>metadata</code>.
		 */
		public final Builder metadata(String key, JsonData value) {
			this.metadata = _mapPut(this.metadata, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code enabled}
		 */
		public final Builder enabled(boolean value) {
			this.enabled = value;
			return this;
		}

		/**
		 * Required - API name: {@code authentication_realm}
		 */
		public final Builder authenticationRealm(AuthenticationRealm value) {
			this.authenticationRealm = value;
			return this;
		}

		/**
		 * Required - API name: {@code authentication_realm}
		 */
		public final Builder authenticationRealm(
				Function<AuthenticationRealm.Builder, ObjectBuilder<AuthenticationRealm>> fn) {
			return this.authenticationRealm(fn.apply(new AuthenticationRealm.Builder()).build());
		}

		/**
		 * Required - API name: {@code lookup_realm}
		 */
		public final Builder lookupRealm(AuthenticationRealm value) {
			this.lookupRealm = value;
			return this;
		}

		/**
		 * Required - API name: {@code lookup_realm}
		 */
		public final Builder lookupRealm(Function<AuthenticationRealm.Builder, ObjectBuilder<AuthenticationRealm>> fn) {
			return this.lookupRealm(fn.apply(new AuthenticationRealm.Builder()).build());
		}

		/**
		 * Required - API name: {@code authentication_type}
		 */
		public final Builder authenticationType(String value) {
			this.authenticationType = value;
			return this;
		}

		/**
		 * API name: {@code api_key}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>apiKey</code>.
		 */
		public final Builder apiKey(Map<String, String> map) {
			this.apiKey = _mapPutAll(this.apiKey, map);
			return this;
		}

		/**
		 * API name: {@code api_key}
		 * <p>
		 * Adds an entry to <code>apiKey</code>.
		 */
		public final Builder apiKey(String key, String value) {
			this.apiKey = _mapPut(this.apiKey, key, value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Authentication}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Authentication build() {
			_checkSingleUse();

			return new Authentication(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Authentication}
	 */
	public static final JsonpDeserializer<Authentication> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Authentication::setupAuthenticationDeserializer);

	protected static void setupAuthenticationDeserializer(ObjectDeserializer<Authentication.Builder> op) {

		op.add(Builder::username, JsonpDeserializer.stringDeserializer(), "username");
		op.add(Builder::roles, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "roles");
		op.add(Builder::fullName, JsonpDeserializer.stringDeserializer(), "full_name");
		op.add(Builder::email, JsonpDeserializer.stringDeserializer(), "email");
		op.add(Builder::token, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"token");
		op.add(Builder::metadata, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "metadata");
		op.add(Builder::enabled, JsonpDeserializer.booleanDeserializer(), "enabled");
		op.add(Builder::authenticationRealm, AuthenticationRealm._DESERIALIZER, "authentication_realm");
		op.add(Builder::lookupRealm, AuthenticationRealm._DESERIALIZER, "lookup_realm");
		op.add(Builder::authenticationType, JsonpDeserializer.stringDeserializer(), "authentication_type");
		op.add(Builder::apiKey, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"api_key");

	}

}
