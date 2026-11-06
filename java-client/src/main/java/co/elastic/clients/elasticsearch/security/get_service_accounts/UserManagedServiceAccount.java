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
import java.lang.Long;
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

	@Nullable
	private final String description;

	@Nullable
	private final ServiceAccountAuthor createdBy;

	@Nullable
	private final Long createdAt;

	@Nullable
	private final String createdByProfileUid;

	@Nullable
	private final ServiceAccountAuthor updatedBy;

	@Nullable
	private final Long updatedAt;

	@Nullable
	private final String updatedByProfileUid;

	// ---------------------------------------------------------------------------------------------

	protected UserManagedServiceAccount(AbstractBuilder<?> builder) {

		this.roles = ApiTypeHelper.unmodifiableRequired(builder.roles, this, "roles");
		this.enabled = ApiTypeHelper.requireNonNull(builder.enabled, this, "enabled", false);
		this.description = builder.description;
		this.createdBy = builder.createdBy;
		this.createdAt = builder.createdAt;
		this.createdByProfileUid = builder.createdByProfileUid;
		this.updatedBy = builder.updatedBy;
		this.updatedAt = builder.updatedAt;
		this.updatedByProfileUid = builder.updatedByProfileUid;

	}

	public static UserManagedServiceAccount userManagedServiceAccountOf(
			Function<Builder, ObjectBuilder<UserManagedServiceAccount>> fn) {
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
	 * Required - The names of the roles granted to the account, as sent on the last
	 * PUT of the account. They are resolved when the account authenticates.
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
	 * A free-text description of the account, as sent on the last PUT of the
	 * account. It has no meaning to Elasticsearch. Absent when the account has no
	 * description.
	 * <p>
	 * API name: {@code description}
	 */
	@Nullable
	public final String description() {
		return this.description;
	}

	/**
	 * The user who created the account. Absent for an account that was created
	 * before Elasticsearch recorded its creator.
	 * <p>
	 * API name: {@code created_by}
	 */
	@Nullable
	public final ServiceAccountAuthor createdBy() {
		return this.createdBy;
	}

	/**
	 * When the account was created, in milliseconds since the Unix epoch. Absent
	 * for an account that was created before Elasticsearch recorded its creation
	 * time.
	 * <p>
	 * API name: {@code created_at}
	 */
	@Nullable
	public final Long createdAt() {
		return this.createdAt;
	}

	/**
	 * The profile UID of the user who created the account. Returned only when
	 * <code>with_profile_uid</code> is <code>true</code> and that user has an
	 * activated user profile.
	 * <p>
	 * API name: {@code created_by_profile_uid}
	 */
	@Nullable
	public final String createdByProfileUid() {
		return this.createdByProfileUid;
	}

	/**
	 * The user who last replaced the account with the put user-managed service
	 * account API. Absent until the account is first replaced.
	 * <p>
	 * API name: {@code updated_by}
	 */
	@Nullable
	public final ServiceAccountAuthor updatedBy() {
		return this.updatedBy;
	}

	/**
	 * When the account was last replaced, in milliseconds since the Unix epoch.
	 * Absent until the account is first replaced.
	 * <p>
	 * API name: {@code updated_at}
	 */
	@Nullable
	public final Long updatedAt() {
		return this.updatedAt;
	}

	/**
	 * The profile UID of the user who last replaced the account. Returned only when
	 * <code>with_profile_uid</code> is <code>true</code> and that user has an
	 * activated user profile.
	 * <p>
	 * API name: {@code updated_by_profile_uid}
	 */
	@Nullable
	public final String updatedByProfileUid() {
		return this.updatedByProfileUid;
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

		if (this.description != null) {
			generator.writeKey("description");
			generator.write(this.description);

		}
		if (this.createdBy != null) {
			generator.writeKey("created_by");
			this.createdBy.serialize(generator, mapper);

		}
		if (this.createdAt != null) {
			generator.writeKey("created_at");
			generator.write(this.createdAt);

		}
		if (this.createdByProfileUid != null) {
			generator.writeKey("created_by_profile_uid");
			generator.write(this.createdByProfileUid);

		}
		if (this.updatedBy != null) {
			generator.writeKey("updated_by");
			this.updatedBy.serialize(generator, mapper);

		}
		if (this.updatedAt != null) {
			generator.writeKey("updated_at");
			generator.write(this.updatedAt);

		}
		if (this.updatedByProfileUid != null) {
			generator.writeKey("updated_by_profile_uid");
			generator.write(this.updatedByProfileUid);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UserManagedServiceAccount}.
	 */

	public static class Builder extends UserManagedServiceAccount.AbstractBuilder<Builder>
			implements
				ObjectBuilder<UserManagedServiceAccount> {
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

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				WithJsonObjectBuilderBase<BuilderT> {
		private List<String> roles;

		private Boolean enabled;

		@Nullable
		private String description;

		@Nullable
		private ServiceAccountAuthor createdBy;

		@Nullable
		private Long createdAt;

		@Nullable
		private String createdByProfileUid;

		@Nullable
		private ServiceAccountAuthor updatedBy;

		@Nullable
		private Long updatedAt;

		@Nullable
		private String updatedByProfileUid;

		/**
		 * Required - The names of the roles granted to the account, as sent on the last
		 * PUT of the account. They are resolved when the account authenticates.
		 * <p>
		 * API name: {@code roles}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>roles</code>.
		 */
		public final BuilderT roles(List<String> list) {
			this.roles = _listAddAll(this.roles, list);
			return self();
		}

		/**
		 * Required - The names of the roles granted to the account, as sent on the last
		 * PUT of the account. They are resolved when the account authenticates.
		 * <p>
		 * API name: {@code roles}
		 * <p>
		 * Adds one or more values to <code>roles</code>.
		 */
		public final BuilderT roles(String value, String... values) {
			this.roles = _listAdd(this.roles, value, values);
			return self();
		}

		/**
		 * Required - Whether the account can authenticate.
		 * <p>
		 * API name: {@code enabled}
		 */
		public final BuilderT enabled(boolean value) {
			this.enabled = value;
			return self();
		}

		/**
		 * A free-text description of the account, as sent on the last PUT of the
		 * account. It has no meaning to Elasticsearch. Absent when the account has no
		 * description.
		 * <p>
		 * API name: {@code description}
		 */
		public final BuilderT description(@Nullable String value) {
			this.description = value;
			return self();
		}

		/**
		 * The user who created the account. Absent for an account that was created
		 * before Elasticsearch recorded its creator.
		 * <p>
		 * API name: {@code created_by}
		 */
		public final BuilderT createdBy(@Nullable ServiceAccountAuthor value) {
			this.createdBy = value;
			return self();
		}

		/**
		 * The user who created the account. Absent for an account that was created
		 * before Elasticsearch recorded its creator.
		 * <p>
		 * API name: {@code created_by}
		 */
		public final BuilderT createdBy(
				Function<ServiceAccountAuthor.Builder, ObjectBuilder<ServiceAccountAuthor>> fn) {
			return this.createdBy(fn.apply(new ServiceAccountAuthor.Builder()).build());
		}

		/**
		 * When the account was created, in milliseconds since the Unix epoch. Absent
		 * for an account that was created before Elasticsearch recorded its creation
		 * time.
		 * <p>
		 * API name: {@code created_at}
		 */
		public final BuilderT createdAt(@Nullable Long value) {
			this.createdAt = value;
			return self();
		}

		/**
		 * The profile UID of the user who created the account. Returned only when
		 * <code>with_profile_uid</code> is <code>true</code> and that user has an
		 * activated user profile.
		 * <p>
		 * API name: {@code created_by_profile_uid}
		 */
		public final BuilderT createdByProfileUid(@Nullable String value) {
			this.createdByProfileUid = value;
			return self();
		}

		/**
		 * The user who last replaced the account with the put user-managed service
		 * account API. Absent until the account is first replaced.
		 * <p>
		 * API name: {@code updated_by}
		 */
		public final BuilderT updatedBy(@Nullable ServiceAccountAuthor value) {
			this.updatedBy = value;
			return self();
		}

		/**
		 * The user who last replaced the account with the put user-managed service
		 * account API. Absent until the account is first replaced.
		 * <p>
		 * API name: {@code updated_by}
		 */
		public final BuilderT updatedBy(
				Function<ServiceAccountAuthor.Builder, ObjectBuilder<ServiceAccountAuthor>> fn) {
			return this.updatedBy(fn.apply(new ServiceAccountAuthor.Builder()).build());
		}

		/**
		 * When the account was last replaced, in milliseconds since the Unix epoch.
		 * Absent until the account is first replaced.
		 * <p>
		 * API name: {@code updated_at}
		 */
		public final BuilderT updatedAt(@Nullable Long value) {
			this.updatedAt = value;
			return self();
		}

		/**
		 * The profile UID of the user who last replaced the account. Returned only when
		 * <code>with_profile_uid</code> is <code>true</code> and that user has an
		 * activated user profile.
		 * <p>
		 * API name: {@code updated_by_profile_uid}
		 */
		public final BuilderT updatedByProfileUid(@Nullable String value) {
			this.updatedByProfileUid = value;
			return self();
		}

		protected AbstractBuilder() {
		}

		protected AbstractBuilder(UserManagedServiceAccount instance) {
			this.roles = instance.roles;
			this.enabled = instance.enabled;
			this.description = instance.description;
			this.createdBy = instance.createdBy;
			this.createdAt = instance.createdAt;
			this.createdByProfileUid = instance.createdByProfileUid;
			this.updatedBy = instance.updatedBy;
			this.updatedAt = instance.updatedAt;
			this.updatedByProfileUid = instance.updatedByProfileUid;

		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link UserManagedServiceAccount}
	 */
	public static final JsonpDeserializer<UserManagedServiceAccount> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, UserManagedServiceAccount::setupUserManagedServiceAccountDeserializer);

	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupUserManagedServiceAccountDeserializer(
			ObjectDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::roles, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"roles");
		op.add(AbstractBuilder::enabled, JsonpDeserializer.booleanDeserializer(), "enabled");
		op.add(AbstractBuilder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(AbstractBuilder::createdBy, ServiceAccountAuthor._DESERIALIZER, "created_by");
		op.add(AbstractBuilder::createdAt, JsonpDeserializer.longDeserializer(), "created_at");
		op.add(AbstractBuilder::createdByProfileUid, JsonpDeserializer.stringDeserializer(), "created_by_profile_uid");
		op.add(AbstractBuilder::updatedBy, ServiceAccountAuthor._DESERIALIZER, "updated_by");
		op.add(AbstractBuilder::updatedAt, JsonpDeserializer.longDeserializer(), "updated_at");
		op.add(AbstractBuilder::updatedByProfileUid, JsonpDeserializer.stringDeserializer(), "updated_by_profile_uid");

		op.ignore("type");
	}

}
