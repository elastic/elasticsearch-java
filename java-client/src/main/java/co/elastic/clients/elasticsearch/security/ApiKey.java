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

import co.elastic.clients.elasticsearch._types.FieldValue;
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
import java.lang.Long;
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

// typedef: security._types.ApiKey

/**
 *
 * @see <a href="../doc-files/api-spec.html#security._types.ApiKey">API
 *      specification</a>
 */
@JsonpDeserializable
public class ApiKey implements JsonpSerializable {
	private final String id;

	private final String name;

	private final ApiKeyType type;

	private final long creation;

	@Nullable
	private final Long expiration;

	private final boolean invalidated;

	@Nullable
	private final Long invalidation;

	private final String username;

	private final String realm;

	@Nullable
	private final String realmType;

	private final Map<String, JsonData> metadata;

	private final Map<String, RoleDescriptor> roleDescriptors;

	private final List<Map<String, RoleDescriptor>> limitedBy;

	@Nullable
	private final Access access;

	@Nullable
	private final String certificateIdentity;

	@Nullable
	private final String profileUid;

	private final List<FieldValue> sort;

	// ---------------------------------------------------------------------------------------------

	private ApiKey(Builder builder) {

		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.type = ApiTypeHelper.requireNonNull(builder.type, this, "type");
		this.creation = ApiTypeHelper.requireNonNull(builder.creation, this, "creation", 0);
		this.expiration = builder.expiration;
		this.invalidated = ApiTypeHelper.requireNonNull(builder.invalidated, this, "invalidated", false);
		this.invalidation = builder.invalidation;
		this.username = ApiTypeHelper.requireNonNull(builder.username, this, "username");
		this.realm = ApiTypeHelper.requireNonNull(builder.realm, this, "realm");
		this.realmType = builder.realmType;
		this.metadata = ApiTypeHelper.unmodifiableRequired(builder.metadata, this, "metadata");
		this.roleDescriptors = ApiTypeHelper.unmodifiable(builder.roleDescriptors);
		this.limitedBy = ApiTypeHelper.unmodifiable(builder.limitedBy);
		this.access = builder.access;
		this.certificateIdentity = builder.certificateIdentity;
		this.profileUid = builder.profileUid;
		this.sort = ApiTypeHelper.unmodifiable(builder.sort);

	}

	public static ApiKey of(Function<Builder, ObjectBuilder<ApiKey>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Id for the API key
	 * <p>
	 * API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Required - Name of the API key.
	 * <p>
	 * API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Required - The type of the API key (e.g. <code>rest</code> or
	 * <code>cross_cluster</code>).
	 * <p>
	 * API name: {@code type}
	 */
	public final ApiKeyType type() {
		return this.type;
	}

	/**
	 * Required - Creation time for the API key in milliseconds.
	 * <p>
	 * API name: {@code creation}
	 */
	public final long creation() {
		return this.creation;
	}

	/**
	 * Expiration time for the API key in milliseconds.
	 * <p>
	 * API name: {@code expiration}
	 */
	@Nullable
	public final Long expiration() {
		return this.expiration;
	}

	/**
	 * Required - Invalidation status for the API key. If the key has been
	 * invalidated, it has a value of <code>true</code>. Otherwise, it is
	 * <code>false</code>.
	 * <p>
	 * API name: {@code invalidated}
	 */
	public final boolean invalidated() {
		return this.invalidated;
	}

	/**
	 * If the key has been invalidated, invalidation time in milliseconds.
	 * <p>
	 * API name: {@code invalidation}
	 */
	@Nullable
	public final Long invalidation() {
		return this.invalidation;
	}

	/**
	 * Required - Principal for which this API key was created
	 * <p>
	 * API name: {@code username}
	 */
	public final String username() {
		return this.username;
	}

	/**
	 * Required - Realm name of the principal for which this API key was created.
	 * <p>
	 * API name: {@code realm}
	 */
	public final String realm() {
		return this.realm;
	}

	/**
	 * Realm type of the principal for which this API key was created
	 * <p>
	 * API name: {@code realm_type}
	 */
	@Nullable
	public final String realmType() {
		return this.realmType;
	}

	/**
	 * Required - Metadata of the API key
	 * <p>
	 * API name: {@code metadata}
	 */
	public final Map<String, JsonData> metadata() {
		return this.metadata;
	}

	/**
	 * The role descriptors assigned to this API key when it was created or last
	 * updated. An empty role descriptor means the API key inherits the owner user’s
	 * permissions.
	 * <p>
	 * API name: {@code role_descriptors}
	 */
	public final Map<String, RoleDescriptor> roleDescriptors() {
		return this.roleDescriptors;
	}

	/**
	 * The owner user’s permissions associated with the API key. It is a
	 * point-in-time snapshot captured at creation and subsequent updates. An API
	 * key’s effective permissions are an intersection of its assigned privileges
	 * and the owner user’s permissions.
	 * <p>
	 * API name: {@code limited_by}
	 */
	public final List<Map<String, RoleDescriptor>> limitedBy() {
		return this.limitedBy;
	}

	/**
	 * The access granted to cross-cluster API keys. The access is composed of
	 * permissions for cross cluster search and cross cluster replication. At least
	 * one of them must be specified. When specified, the new access assignment
	 * fully replaces the previously assigned access.
	 * <p>
	 * API name: {@code access}
	 */
	@Nullable
	public final Access access() {
		return this.access;
	}

	/**
	 * The certificate identity associated with a cross-cluster API key. Restricts
	 * the API key to connections authenticated by a specific TLS certificate. Only
	 * applicable to cross-cluster API keys.
	 * <p>
	 * API name: {@code certificate_identity}
	 */
	@Nullable
	public final String certificateIdentity() {
		return this.certificateIdentity;
	}

	/**
	 * The profile uid for the API key owner principal, if requested and if it
	 * exists
	 * <p>
	 * API name: {@code profile_uid}
	 */
	@Nullable
	public final String profileUid() {
		return this.profileUid;
	}

	/**
	 * Sorting values when using the <code>sort</code> parameter with the
	 * <code>security.query_api_keys</code> API.
	 * <p>
	 * API name: {@code _sort}
	 */
	public final List<FieldValue> sort() {
		return this.sort;
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

		generator.writeKey("id");
		generator.write(this.id);

		generator.writeKey("name");
		generator.write(this.name);

		generator.writeKey("type");
		this.type.serialize(generator, mapper);
		generator.writeKey("creation");
		generator.write(this.creation);

		if (this.expiration != null) {
			generator.writeKey("expiration");
			generator.write(this.expiration);

		}
		generator.writeKey("invalidated");
		generator.write(this.invalidated);

		if (this.invalidation != null) {
			generator.writeKey("invalidation");
			generator.write(this.invalidation);

		}
		generator.writeKey("username");
		generator.write(this.username);

		generator.writeKey("realm");
		generator.write(this.realm);

		if (this.realmType != null) {
			generator.writeKey("realm_type");
			generator.write(this.realmType);

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
		if (ApiTypeHelper.isDefined(this.roleDescriptors)) {
			generator.writeKey("role_descriptors");
			generator.writeStartObject();
			for (Map.Entry<String, RoleDescriptor> item0 : this.roleDescriptors.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.limitedBy)) {
			generator.writeKey("limited_by");
			generator.writeStartArray();
			for (Map<String, RoleDescriptor> item0 : this.limitedBy) {
				generator.writeStartObject();
				if (item0 != null) {
					for (Map.Entry<String, RoleDescriptor> item1 : item0.entrySet()) {
						generator.writeKey(item1.getKey());
						item1.getValue().serialize(generator, mapper);

					}
				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}
		if (this.access != null) {
			generator.writeKey("access");
			this.access.serialize(generator, mapper);

		}
		if (this.certificateIdentity != null) {
			generator.writeKey("certificate_identity");
			generator.write(this.certificateIdentity);

		}
		if (this.profileUid != null) {
			generator.writeKey("profile_uid");
			generator.write(this.profileUid);

		}
		if (ApiTypeHelper.isDefined(this.sort)) {
			generator.writeKey("_sort");
			generator.writeStartArray();
			for (FieldValue item0 : this.sort) {
				item0.serialize(generator, mapper);

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
	 * Builder for {@link ApiKey}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ApiKey> {
		private String id;

		private String name;

		private ApiKeyType type;

		private Long creation;

		@Nullable
		private Long expiration;

		private Boolean invalidated;

		@Nullable
		private Long invalidation;

		private String username;

		private String realm;

		@Nullable
		private String realmType;

		private Map<String, JsonData> metadata;

		@Nullable
		private Map<String, RoleDescriptor> roleDescriptors;

		@Nullable
		private List<Map<String, RoleDescriptor>> limitedBy;

		@Nullable
		private Access access;

		@Nullable
		private String certificateIdentity;

		@Nullable
		private String profileUid;

		@Nullable
		private List<FieldValue> sort;

		public Builder() {
		}
		private Builder(ApiKey instance) {
			this.id = instance.id;
			this.name = instance.name;
			this.type = instance.type;
			this.creation = instance.creation;
			this.expiration = instance.expiration;
			this.invalidated = instance.invalidated;
			this.invalidation = instance.invalidation;
			this.username = instance.username;
			this.realm = instance.realm;
			this.realmType = instance.realmType;
			this.metadata = instance.metadata;
			this.roleDescriptors = instance.roleDescriptors;
			this.limitedBy = instance.limitedBy;
			this.access = instance.access;
			this.certificateIdentity = instance.certificateIdentity;
			this.profileUid = instance.profileUid;
			this.sort = instance.sort;

		}
		/**
		 * Required - Id for the API key
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - Name of the API key.
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - The type of the API key (e.g. <code>rest</code> or
		 * <code>cross_cluster</code>).
		 * <p>
		 * API name: {@code type}
		 */
		public final Builder type(ApiKeyType value) {
			this.type = value;
			return this;
		}

		/**
		 * Required - Creation time for the API key in milliseconds.
		 * <p>
		 * API name: {@code creation}
		 */
		public final Builder creation(long value) {
			this.creation = value;
			return this;
		}

		/**
		 * Expiration time for the API key in milliseconds.
		 * <p>
		 * API name: {@code expiration}
		 */
		public final Builder expiration(@Nullable Long value) {
			this.expiration = value;
			return this;
		}

		/**
		 * Required - Invalidation status for the API key. If the key has been
		 * invalidated, it has a value of <code>true</code>. Otherwise, it is
		 * <code>false</code>.
		 * <p>
		 * API name: {@code invalidated}
		 */
		public final Builder invalidated(boolean value) {
			this.invalidated = value;
			return this;
		}

		/**
		 * If the key has been invalidated, invalidation time in milliseconds.
		 * <p>
		 * API name: {@code invalidation}
		 */
		public final Builder invalidation(@Nullable Long value) {
			this.invalidation = value;
			return this;
		}

		/**
		 * Required - Principal for which this API key was created
		 * <p>
		 * API name: {@code username}
		 */
		public final Builder username(String value) {
			this.username = value;
			return this;
		}

		/**
		 * Required - Realm name of the principal for which this API key was created.
		 * <p>
		 * API name: {@code realm}
		 */
		public final Builder realm(String value) {
			this.realm = value;
			return this;
		}

		/**
		 * Realm type of the principal for which this API key was created
		 * <p>
		 * API name: {@code realm_type}
		 */
		public final Builder realmType(@Nullable String value) {
			this.realmType = value;
			return this;
		}

		/**
		 * Required - Metadata of the API key
		 * <p>
		 * API name: {@code metadata}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>metadata</code>.
		 */
		public final Builder metadata(Map<String, JsonData> map) {
			this.metadata = _mapPutAll(this.metadata, map);
			return this;
		}

		/**
		 * Required - Metadata of the API key
		 * <p>
		 * API name: {@code metadata}
		 * <p>
		 * Adds an entry to <code>metadata</code>.
		 */
		public final Builder metadata(String key, JsonData value) {
			this.metadata = _mapPut(this.metadata, key, value);
			return this;
		}

		/**
		 * The role descriptors assigned to this API key when it was created or last
		 * updated. An empty role descriptor means the API key inherits the owner user’s
		 * permissions.
		 * <p>
		 * API name: {@code role_descriptors}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>roleDescriptors</code>.
		 */
		public final Builder roleDescriptors(Map<String, RoleDescriptor> map) {
			this.roleDescriptors = _mapPutAll(this.roleDescriptors, map);
			return this;
		}

		/**
		 * The role descriptors assigned to this API key when it was created or last
		 * updated. An empty role descriptor means the API key inherits the owner user’s
		 * permissions.
		 * <p>
		 * API name: {@code role_descriptors}
		 * <p>
		 * Adds an entry to <code>roleDescriptors</code>.
		 */
		public final Builder roleDescriptors(String key, RoleDescriptor value) {
			this.roleDescriptors = _mapPut(this.roleDescriptors, key, value);
			return this;
		}

		/**
		 * The role descriptors assigned to this API key when it was created or last
		 * updated. An empty role descriptor means the API key inherits the owner user’s
		 * permissions.
		 * <p>
		 * API name: {@code role_descriptors}
		 * <p>
		 * Adds an entry to <code>roleDescriptors</code> using a builder lambda.
		 */
		public final Builder roleDescriptors(String key,
				Function<RoleDescriptor.Builder, ObjectBuilder<RoleDescriptor>> fn) {
			return roleDescriptors(key, fn.apply(new RoleDescriptor.Builder()).build());
		}

		/**
		 * The owner user’s permissions associated with the API key. It is a
		 * point-in-time snapshot captured at creation and subsequent updates. An API
		 * key’s effective permissions are an intersection of its assigned privileges
		 * and the owner user’s permissions.
		 * <p>
		 * API name: {@code limited_by}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>limitedBy</code>.
		 */
		public final Builder limitedBy(List<Map<String, RoleDescriptor>> list) {
			this.limitedBy = _listAddAll(this.limitedBy, list);
			return this;
		}

		/**
		 * The owner user’s permissions associated with the API key. It is a
		 * point-in-time snapshot captured at creation and subsequent updates. An API
		 * key’s effective permissions are an intersection of its assigned privileges
		 * and the owner user’s permissions.
		 * <p>
		 * API name: {@code limited_by}
		 * <p>
		 * Adds one or more values to <code>limitedBy</code>.
		 */
		public final Builder limitedBy(Map<String, RoleDescriptor> value, Map<String, RoleDescriptor>... values) {
			this.limitedBy = _listAdd(this.limitedBy, value, values);
			return this;
		}

		/**
		 * The access granted to cross-cluster API keys. The access is composed of
		 * permissions for cross cluster search and cross cluster replication. At least
		 * one of them must be specified. When specified, the new access assignment
		 * fully replaces the previously assigned access.
		 * <p>
		 * API name: {@code access}
		 */
		public final Builder access(@Nullable Access value) {
			this.access = value;
			return this;
		}

		/**
		 * The access granted to cross-cluster API keys. The access is composed of
		 * permissions for cross cluster search and cross cluster replication. At least
		 * one of them must be specified. When specified, the new access assignment
		 * fully replaces the previously assigned access.
		 * <p>
		 * API name: {@code access}
		 */
		public final Builder access(Function<Access.Builder, ObjectBuilder<Access>> fn) {
			return this.access(fn.apply(new Access.Builder()).build());
		}

		/**
		 * The certificate identity associated with a cross-cluster API key. Restricts
		 * the API key to connections authenticated by a specific TLS certificate. Only
		 * applicable to cross-cluster API keys.
		 * <p>
		 * API name: {@code certificate_identity}
		 */
		public final Builder certificateIdentity(@Nullable String value) {
			this.certificateIdentity = value;
			return this;
		}

		/**
		 * The profile uid for the API key owner principal, if requested and if it
		 * exists
		 * <p>
		 * API name: {@code profile_uid}
		 */
		public final Builder profileUid(@Nullable String value) {
			this.profileUid = value;
			return this;
		}

		/**
		 * Sorting values when using the <code>sort</code> parameter with the
		 * <code>security.query_api_keys</code> API.
		 * <p>
		 * API name: {@code _sort}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>sort</code>.
		 */
		public final Builder sort(List<FieldValue> list) {
			this.sort = _listAddAll(this.sort, list);
			return this;
		}

		/**
		 * Sorting values when using the <code>sort</code> parameter with the
		 * <code>security.query_api_keys</code> API.
		 * <p>
		 * API name: {@code _sort}
		 * <p>
		 * Adds one or more values to <code>sort</code>.
		 */
		public final Builder sort(FieldValue value, FieldValue... values) {
			this.sort = _listAdd(this.sort, value, values);
			return this;
		}

		/**
		 * Sorting values when using the <code>sort</code> parameter with the
		 * <code>security.query_api_keys</code> API.
		 * <p>
		 * API name: {@code _sort}
		 * <p>
		 * Adds one or more values to <code>sort</code>.
		 */
		public final Builder sort(String value, String... values) {
			this.sort = _listAdd(this.sort, FieldValue.of(value));
			for (String v : values) {
				_listAdd(this.sort, FieldValue.of(v));
			}
			return this;
		}

		/**
		 * Sorting values when using the <code>sort</code> parameter with the
		 * <code>security.query_api_keys</code> API.
		 * <p>
		 * API name: {@code _sort}
		 * <p>
		 * Adds one or more values to <code>sort</code>.
		 */
		public final Builder sort(long value, long... values) {
			this.sort = _listAdd(this.sort, FieldValue.of(value));
			for (long v : values) {
				_listAdd(this.sort, FieldValue.of(v));
			}
			return this;
		}

		/**
		 * Sorting values when using the <code>sort</code> parameter with the
		 * <code>security.query_api_keys</code> API.
		 * <p>
		 * API name: {@code _sort}
		 * <p>
		 * Adds one or more values to <code>sort</code>.
		 */
		public final Builder sort(double value, double... values) {
			this.sort = _listAdd(this.sort, FieldValue.of(value));
			for (double v : values) {
				_listAdd(this.sort, FieldValue.of(v));
			}
			return this;
		}

		/**
		 * Sorting values when using the <code>sort</code> parameter with the
		 * <code>security.query_api_keys</code> API.
		 * <p>
		 * API name: {@code _sort}
		 * <p>
		 * Adds one or more values to <code>sort</code>.
		 */
		public final Builder sort(boolean value, boolean... values) {
			this.sort = _listAdd(this.sort, FieldValue.of(value));
			for (boolean v : values) {
				_listAdd(this.sort, FieldValue.of(v));
			}
			return this;
		}

		/**
		 * Sorting values when using the <code>sort</code> parameter with the
		 * <code>security.query_api_keys</code> API.
		 * <p>
		 * API name: {@code _sort}
		 * <p>
		 * Adds a value to <code>sort</code> using a builder lambda.
		 */
		public final Builder sort(Function<FieldValue.Builder, ObjectBuilder<FieldValue>> fn) {
			return sort(fn.apply(new FieldValue.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ApiKey}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ApiKey build() {
			_checkSingleUse();

			return new ApiKey(this);
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
	 * Json deserializer for {@link ApiKey}
	 */
	public static final JsonpDeserializer<ApiKey> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ApiKey::setupApiKeyDeserializer);

	protected static void setupApiKeyDeserializer(ObjectDeserializer<ApiKey.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::type, ApiKeyType._DESERIALIZER, "type");
		op.add(Builder::creation, JsonpDeserializer.longDeserializer(), "creation");
		op.add(Builder::expiration, JsonpDeserializer.longDeserializer(), "expiration");
		op.add(Builder::invalidated, JsonpDeserializer.booleanDeserializer(), "invalidated");
		op.add(Builder::invalidation, JsonpDeserializer.longDeserializer(), "invalidation");
		op.add(Builder::username, JsonpDeserializer.stringDeserializer(), "username");
		op.add(Builder::realm, JsonpDeserializer.stringDeserializer(), "realm");
		op.add(Builder::realmType, JsonpDeserializer.stringDeserializer(), "realm_type");
		op.add(Builder::metadata, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "metadata");
		op.add(Builder::roleDescriptors, JsonpDeserializer.stringMapDeserializer(RoleDescriptor._DESERIALIZER),
				"role_descriptors");
		op.add(Builder::limitedBy, JsonpDeserializer.arrayDeserializer(
				JsonpDeserializer.stringMapDeserializer(RoleDescriptor._DESERIALIZER)), "limited_by");
		op.add(Builder::access, Access._DESERIALIZER, "access");
		op.add(Builder::certificateIdentity, JsonpDeserializer.stringDeserializer(), "certificate_identity");
		op.add(Builder::profileUid, JsonpDeserializer.stringDeserializer(), "profile_uid");
		op.add(Builder::sort, JsonpDeserializer.arrayDeserializer(FieldValue._DESERIALIZER), "_sort");

	}

}
