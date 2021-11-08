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

package co.elastic.clients.elasticsearch.xpack.usage;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.MapBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: xpack.usage.Security
@JsonpDeserializable
public class Security extends Base {
	private final FeatureToggle apiKeyService;

	private final FeatureToggle anonymous;

	private final Audit audit;

	private final FeatureToggle fips140;

	private final IpFilter ipfilter;

	private final Map<String, Realm> realms;

	private final Map<String, RoleMapping> roleMapping;

	private final SecurityRoles roles;

	private final Ssl ssl;

	@Nullable
	private final FeatureToggle systemKey;

	private final FeatureToggle tokenService;

	private final Base operatorPrivileges;

	// ---------------------------------------------------------------------------------------------

	private Security(Builder builder) {
		super(builder);

		this.apiKeyService = ModelTypeHelper.requireNonNull(builder.apiKeyService, this, "apiKeyService");
		this.anonymous = ModelTypeHelper.requireNonNull(builder.anonymous, this, "anonymous");
		this.audit = ModelTypeHelper.requireNonNull(builder.audit, this, "audit");
		this.fips140 = ModelTypeHelper.requireNonNull(builder.fips140, this, "fips140");
		this.ipfilter = ModelTypeHelper.requireNonNull(builder.ipfilter, this, "ipfilter");
		this.realms = ModelTypeHelper.unmodifiableRequired(builder.realms, this, "realms");
		this.roleMapping = ModelTypeHelper.unmodifiableRequired(builder.roleMapping, this, "roleMapping");
		this.roles = ModelTypeHelper.requireNonNull(builder.roles, this, "roles");
		this.ssl = ModelTypeHelper.requireNonNull(builder.ssl, this, "ssl");
		this.systemKey = builder.systemKey;
		this.tokenService = ModelTypeHelper.requireNonNull(builder.tokenService, this, "tokenService");
		this.operatorPrivileges = ModelTypeHelper.requireNonNull(builder.operatorPrivileges, this,
				"operatorPrivileges");

	}

	public static Security of(Function<Builder, ObjectBuilder<Security>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code api_key_service}
	 */
	public final FeatureToggle apiKeyService() {
		return this.apiKeyService;
	}

	/**
	 * Required - API name: {@code anonymous}
	 */
	public final FeatureToggle anonymous() {
		return this.anonymous;
	}

	/**
	 * Required - API name: {@code audit}
	 */
	public final Audit audit() {
		return this.audit;
	}

	/**
	 * Required - API name: {@code fips_140}
	 */
	public final FeatureToggle fips140() {
		return this.fips140;
	}

	/**
	 * Required - API name: {@code ipfilter}
	 */
	public final IpFilter ipfilter() {
		return this.ipfilter;
	}

	/**
	 * Required - API name: {@code realms}
	 */
	public final Map<String, Realm> realms() {
		return this.realms;
	}

	/**
	 * Required - API name: {@code role_mapping}
	 */
	public final Map<String, RoleMapping> roleMapping() {
		return this.roleMapping;
	}

	/**
	 * Required - API name: {@code roles}
	 */
	public final SecurityRoles roles() {
		return this.roles;
	}

	/**
	 * Required - API name: {@code ssl}
	 */
	public final Ssl ssl() {
		return this.ssl;
	}

	/**
	 * API name: {@code system_key}
	 */
	@Nullable
	public final FeatureToggle systemKey() {
		return this.systemKey;
	}

	/**
	 * Required - API name: {@code token_service}
	 */
	public final FeatureToggle tokenService() {
		return this.tokenService;
	}

	/**
	 * Required - API name: {@code operator_privileges}
	 */
	public final Base operatorPrivileges() {
		return this.operatorPrivileges;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("api_key_service");
		this.apiKeyService.serialize(generator, mapper);

		generator.writeKey("anonymous");
		this.anonymous.serialize(generator, mapper);

		generator.writeKey("audit");
		this.audit.serialize(generator, mapper);

		generator.writeKey("fips_140");
		this.fips140.serialize(generator, mapper);

		generator.writeKey("ipfilter");
		this.ipfilter.serialize(generator, mapper);

		if (ModelTypeHelper.isDefined(this.realms)) {
			generator.writeKey("realms");
			generator.writeStartObject();
			for (Map.Entry<String, Realm> item0 : this.realms.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.roleMapping)) {
			generator.writeKey("role_mapping");
			generator.writeStartObject();
			for (Map.Entry<String, RoleMapping> item0 : this.roleMapping.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("roles");
		this.roles.serialize(generator, mapper);

		generator.writeKey("ssl");
		this.ssl.serialize(generator, mapper);

		if (this.systemKey != null) {
			generator.writeKey("system_key");
			this.systemKey.serialize(generator, mapper);

		}
		generator.writeKey("token_service");
		this.tokenService.serialize(generator, mapper);

		generator.writeKey("operator_privileges");
		this.operatorPrivileges.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Security}.
	 */
	public static class Builder extends Base.AbstractBuilder<Builder> implements ObjectBuilder<Security> {
		private FeatureToggle apiKeyService;

		private FeatureToggle anonymous;

		private Audit audit;

		private FeatureToggle fips140;

		private IpFilter ipfilter;

		private Map<String, Realm> realms;

		private Map<String, RoleMapping> roleMapping;

		private SecurityRoles roles;

		private Ssl ssl;

		@Nullable
		private FeatureToggle systemKey;

		private FeatureToggle tokenService;

		private Base operatorPrivileges;

		/**
		 * Required - API name: {@code api_key_service}
		 */
		public final Builder apiKeyService(FeatureToggle value) {
			this.apiKeyService = value;
			return this;
		}

		/**
		 * Required - API name: {@code api_key_service}
		 */
		public final Builder apiKeyService(Function<FeatureToggle.Builder, ObjectBuilder<FeatureToggle>> fn) {
			return this.apiKeyService(fn.apply(new FeatureToggle.Builder()).build());
		}

		/**
		 * Required - API name: {@code anonymous}
		 */
		public final Builder anonymous(FeatureToggle value) {
			this.anonymous = value;
			return this;
		}

		/**
		 * Required - API name: {@code anonymous}
		 */
		public final Builder anonymous(Function<FeatureToggle.Builder, ObjectBuilder<FeatureToggle>> fn) {
			return this.anonymous(fn.apply(new FeatureToggle.Builder()).build());
		}

		/**
		 * Required - API name: {@code audit}
		 */
		public final Builder audit(Audit value) {
			this.audit = value;
			return this;
		}

		/**
		 * Required - API name: {@code audit}
		 */
		public final Builder audit(Function<Audit.Builder, ObjectBuilder<Audit>> fn) {
			return this.audit(fn.apply(new Audit.Builder()).build());
		}

		/**
		 * Required - API name: {@code fips_140}
		 */
		public final Builder fips140(FeatureToggle value) {
			this.fips140 = value;
			return this;
		}

		/**
		 * Required - API name: {@code fips_140}
		 */
		public final Builder fips140(Function<FeatureToggle.Builder, ObjectBuilder<FeatureToggle>> fn) {
			return this.fips140(fn.apply(new FeatureToggle.Builder()).build());
		}

		/**
		 * Required - API name: {@code ipfilter}
		 */
		public final Builder ipfilter(IpFilter value) {
			this.ipfilter = value;
			return this;
		}

		/**
		 * Required - API name: {@code ipfilter}
		 */
		public final Builder ipfilter(Function<IpFilter.Builder, ObjectBuilder<IpFilter>> fn) {
			return this.ipfilter(fn.apply(new IpFilter.Builder()).build());
		}

		/**
		 * Required - API name: {@code realms}
		 */
		public final Builder realms(Map<String, Realm> value) {
			this.realms = value;
			return this;
		}

		/**
		 * Set {@link #realms(Map)} to a singleton map.
		 */
		public Builder realms(String key, Function<Realm.Builder, ObjectBuilder<Realm>> fn) {
			return this.realms(Collections.singletonMap(key, fn.apply(new Realm.Builder()).build()));
		}

		public final Builder realms(
				Function<MapBuilder<String, Realm, Realm.Builder>, ObjectBuilder<Map<String, Realm>>> fn) {
			return realms(fn.apply(new MapBuilder<>(Realm.Builder::new)).build());
		}

		/**
		 * Required - API name: {@code role_mapping}
		 */
		public final Builder roleMapping(Map<String, RoleMapping> value) {
			this.roleMapping = value;
			return this;
		}

		/**
		 * Set {@link #roleMapping(Map)} to a singleton map.
		 */
		public Builder roleMapping(String key, Function<RoleMapping.Builder, ObjectBuilder<RoleMapping>> fn) {
			return this.roleMapping(Collections.singletonMap(key, fn.apply(new RoleMapping.Builder()).build()));
		}

		public final Builder roleMapping(
				Function<MapBuilder<String, RoleMapping, RoleMapping.Builder>, ObjectBuilder<Map<String, RoleMapping>>> fn) {
			return roleMapping(fn.apply(new MapBuilder<>(RoleMapping.Builder::new)).build());
		}

		/**
		 * Required - API name: {@code roles}
		 */
		public final Builder roles(SecurityRoles value) {
			this.roles = value;
			return this;
		}

		/**
		 * Required - API name: {@code roles}
		 */
		public final Builder roles(Function<SecurityRoles.Builder, ObjectBuilder<SecurityRoles>> fn) {
			return this.roles(fn.apply(new SecurityRoles.Builder()).build());
		}

		/**
		 * Required - API name: {@code ssl}
		 */
		public final Builder ssl(Ssl value) {
			this.ssl = value;
			return this;
		}

		/**
		 * Required - API name: {@code ssl}
		 */
		public final Builder ssl(Function<Ssl.Builder, ObjectBuilder<Ssl>> fn) {
			return this.ssl(fn.apply(new Ssl.Builder()).build());
		}

		/**
		 * API name: {@code system_key}
		 */
		public final Builder systemKey(@Nullable FeatureToggle value) {
			this.systemKey = value;
			return this;
		}

		/**
		 * API name: {@code system_key}
		 */
		public final Builder systemKey(Function<FeatureToggle.Builder, ObjectBuilder<FeatureToggle>> fn) {
			return this.systemKey(fn.apply(new FeatureToggle.Builder()).build());
		}

		/**
		 * Required - API name: {@code token_service}
		 */
		public final Builder tokenService(FeatureToggle value) {
			this.tokenService = value;
			return this;
		}

		/**
		 * Required - API name: {@code token_service}
		 */
		public final Builder tokenService(Function<FeatureToggle.Builder, ObjectBuilder<FeatureToggle>> fn) {
			return this.tokenService(fn.apply(new FeatureToggle.Builder()).build());
		}

		/**
		 * Required - API name: {@code operator_privileges}
		 */
		public final Builder operatorPrivileges(Base value) {
			this.operatorPrivileges = value;
			return this;
		}

		/**
		 * Required - API name: {@code operator_privileges}
		 */
		public final Builder operatorPrivileges(Function<Base.Builder, ObjectBuilder<Base>> fn) {
			return this.operatorPrivileges(fn.apply(new Base.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Security}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Security build() {
			_checkSingleUse();

			return new Security(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Security}
	 */
	public static final JsonpDeserializer<Security> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Security::setupSecurityDeserializer, Builder::build);

	protected static void setupSecurityDeserializer(DelegatingDeserializer<Security.Builder> op) {
		Base.setupBaseDeserializer(op);
		op.add(Builder::apiKeyService, FeatureToggle._DESERIALIZER, "api_key_service");
		op.add(Builder::anonymous, FeatureToggle._DESERIALIZER, "anonymous");
		op.add(Builder::audit, Audit._DESERIALIZER, "audit");
		op.add(Builder::fips140, FeatureToggle._DESERIALIZER, "fips_140");
		op.add(Builder::ipfilter, IpFilter._DESERIALIZER, "ipfilter");
		op.add(Builder::realms, JsonpDeserializer.stringMapDeserializer(Realm._DESERIALIZER), "realms");
		op.add(Builder::roleMapping, JsonpDeserializer.stringMapDeserializer(RoleMapping._DESERIALIZER),
				"role_mapping");
		op.add(Builder::roles, SecurityRoles._DESERIALIZER, "roles");
		op.add(Builder::ssl, Ssl._DESERIALIZER, "ssl");
		op.add(Builder::systemKey, FeatureToggle._DESERIALIZER, "system_key");
		op.add(Builder::tokenService, FeatureToggle._DESERIALIZER, "token_service");
		op.add(Builder::operatorPrivileges, Base._DESERIALIZER, "operator_privileges");

	}

}
