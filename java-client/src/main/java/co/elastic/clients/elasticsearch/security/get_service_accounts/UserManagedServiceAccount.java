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

package co.elastic.clients.elasticsearch.security.get_service_accounts;

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

// typedef: security.get_service_accounts.UserManagedServiceAccount

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#security.get_service_accounts.UserManagedServiceAccount">API
 *      specification</a>
 */
@JsonpDeserializable
public class UserManagedServiceAccount implements ServiceAccountInfoVariant, JsonpSerializable {
	private final List<String> roles;

	private final boolean enabled;

	// ---------------------------------------------------------------------------------------------

	private UserManagedServiceAccount(Builder builder) {

		this.roles = ApiTypeHelper.unmodifiableRequired(builder.roles, this, "roles");
		this.enabled = ApiTypeHelper.requireNonNull(builder.enabled, this, "enabled", false);

	}

	public static UserManagedServiceAccount of(Function<Builder, ObjectBuilder<UserManagedServiceAccount>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * ServiceAccountInfo variant kind.
	 */
	@Override
	public ServiceAccountInfo.Kind _serviceAccountInfoKind() {
		return ServiceAccountInfo.Kind.UserManaged;
	}

	/**
	 * Required - The names of the roles granted to the account, as they were given
	 * when it was created. They are resolved when the account authenticates.
	 * <p>
	 * API name: {@code roles}
	 */
	public final List<String> roles() {
		return this.roles;
	}

	/**
	 * Required - Whether the account can authenticate.
	 * <p>
	 * API name: {@code enabled}
	 */
	public final boolean enabled() {
		return this.enabled;
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

		generator.write("type", "user_managed");

		if (ApiTypeHelper.isDefined(this.roles)) {
			generator.writeKey("roles");
			generator.writeStartArray();
			for (String item0 : this.roles) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		generator.writeKey("enabled");
		generator.write(this.enabled);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UserManagedServiceAccount}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<UserManagedServiceAccount> {
		private List<String> roles;

		private Boolean enabled;

		public Builder() {
		}
		private Builder(UserManagedServiceAccount instance) {
			this.roles = instance.roles;
			this.enabled = instance.enabled;

		}
		/**
		 * Required - The names of the roles granted to the account, as they were given
		 * when it was created. They are resolved when the account authenticates.
		 * <p>
		 * API name: {@code roles}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>roles</code>.
		 */
		public final Builder roles(List<String> list) {
			this.roles = _listAddAll(this.roles, list);
			return this;
		}

		/**
		 * Required - The names of the roles granted to the account, as they were given
		 * when it was created. They are resolved when the account authenticates.
		 * <p>
		 * API name: {@code roles}
		 * <p>
		 * Adds one or more values to <code>roles</code>.
		 */
		public final Builder roles(String value, String... values) {
			this.roles = _listAdd(this.roles, value, values);
			return this;
		}

		/**
		 * Required - Whether the account can authenticate.
		 * <p>
		 * API name: {@code enabled}
		 */
		public final Builder enabled(boolean value) {
			this.enabled = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link UserManagedServiceAccount}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UserManagedServiceAccount build() {
			_checkSingleUse();

			return new UserManagedServiceAccount(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link UserManagedServiceAccount}
	 */
	public static final JsonpDeserializer<UserManagedServiceAccount> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, UserManagedServiceAccount::setupUserManagedServiceAccountDeserializer);

	protected static void setupUserManagedServiceAccountDeserializer(
			ObjectDeserializer<UserManagedServiceAccount.Builder> op) {

		op.add(Builder::roles, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "roles");
		op.add(Builder::enabled, JsonpDeserializer.booleanDeserializer(), "enabled");

		op.ignore("type");
	}

}
