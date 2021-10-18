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
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: xpack.usage.Security
@JsonpDeserializable
public final class Security extends Base {
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

	public Security(Builder builder) {
		super(builder);

		this.apiKeyService = Objects.requireNonNull(builder.apiKeyService, "api_key_service");
		this.anonymous = Objects.requireNonNull(builder.anonymous, "anonymous");
		this.audit = Objects.requireNonNull(builder.audit, "audit");
		this.fips140 = Objects.requireNonNull(builder.fips140, "fips_140");
		this.ipfilter = Objects.requireNonNull(builder.ipfilter, "ipfilter");
		this.realms = ModelTypeHelper.unmodifiableNonNull(builder.realms, "realms");
		this.roleMapping = ModelTypeHelper.unmodifiableNonNull(builder.roleMapping, "role_mapping");
		this.roles = Objects.requireNonNull(builder.roles, "roles");
		this.ssl = Objects.requireNonNull(builder.ssl, "ssl");
		this.systemKey = builder.systemKey;
		this.tokenService = Objects.requireNonNull(builder.tokenService, "token_service");
		this.operatorPrivileges = Objects.requireNonNull(builder.operatorPrivileges, "operator_privileges");

	}

	public Security(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code api_key_service}
	 */
	public FeatureToggle apiKeyService() {
		return this.apiKeyService;
	}

	/**
	 * Required - API name: {@code anonymous}
	 */
	public FeatureToggle anonymous() {
		return this.anonymous;
	}

	/**
	 * Required - API name: {@code audit}
	 */
	public Audit audit() {
		return this.audit;
	}

	/**
	 * Required - API name: {@code fips_140}
	 */
	public FeatureToggle fips140() {
		return this.fips140;
	}

	/**
	 * Required - API name: {@code ipfilter}
	 */
	public IpFilter ipfilter() {
		return this.ipfilter;
	}

	/**
	 * Required - API name: {@code realms}
	 */
	public Map<String, Realm> realms() {
		return this.realms;
	}

	/**
	 * Required - API name: {@code role_mapping}
	 */
	public Map<String, RoleMapping> roleMapping() {
		return this.roleMapping;
	}

	/**
	 * Required - API name: {@code roles}
	 */
	public SecurityRoles roles() {
		return this.roles;
	}

	/**
	 * Required - API name: {@code ssl}
	 */
	public Ssl ssl() {
		return this.ssl;
	}

	/**
	 * API name: {@code system_key}
	 */
	@Nullable
	public FeatureToggle systemKey() {
		return this.systemKey;
	}

	/**
	 * Required - API name: {@code token_service}
	 */
	public FeatureToggle tokenService() {
		return this.tokenService;
	}

	/**
	 * Required - API name: {@code operator_privileges}
	 */
	public Base operatorPrivileges() {
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

		generator.writeKey("realms");
		generator.writeStartObject();
		for (Map.Entry<String, Realm> item0 : this.realms.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("role_mapping");
		generator.writeStartObject();
		for (Map.Entry<String, RoleMapping> item0 : this.roleMapping.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}
		generator.writeEnd();

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
		public Builder apiKeyService(FeatureToggle value) {
			this.apiKeyService = value;
			return this;
		}

		/**
		 * Required - API name: {@code api_key_service}
		 */
		public Builder apiKeyService(Function<FeatureToggle.Builder, ObjectBuilder<FeatureToggle>> fn) {
			return this.apiKeyService(fn.apply(new FeatureToggle.Builder()).build());
		}

		/**
		 * Required - API name: {@code anonymous}
		 */
		public Builder anonymous(FeatureToggle value) {
			this.anonymous = value;
			return this;
		}

		/**
		 * Required - API name: {@code anonymous}
		 */
		public Builder anonymous(Function<FeatureToggle.Builder, ObjectBuilder<FeatureToggle>> fn) {
			return this.anonymous(fn.apply(new FeatureToggle.Builder()).build());
		}

		/**
		 * Required - API name: {@code audit}
		 */
		public Builder audit(Audit value) {
			this.audit = value;
			return this;
		}

		/**
		 * Required - API name: {@code audit}
		 */
		public Builder audit(Function<Audit.Builder, ObjectBuilder<Audit>> fn) {
			return this.audit(fn.apply(new Audit.Builder()).build());
		}

		/**
		 * Required - API name: {@code fips_140}
		 */
		public Builder fips140(FeatureToggle value) {
			this.fips140 = value;
			return this;
		}

		/**
		 * Required - API name: {@code fips_140}
		 */
		public Builder fips140(Function<FeatureToggle.Builder, ObjectBuilder<FeatureToggle>> fn) {
			return this.fips140(fn.apply(new FeatureToggle.Builder()).build());
		}

		/**
		 * Required - API name: {@code ipfilter}
		 */
		public Builder ipfilter(IpFilter value) {
			this.ipfilter = value;
			return this;
		}

		/**
		 * Required - API name: {@code ipfilter}
		 */
		public Builder ipfilter(Function<IpFilter.Builder, ObjectBuilder<IpFilter>> fn) {
			return this.ipfilter(fn.apply(new IpFilter.Builder()).build());
		}

		/**
		 * Required - API name: {@code realms}
		 */
		public Builder realms(Map<String, Realm> value) {
			this.realms = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #realms(Map)}, creating the map if needed.
		 */
		public Builder putRealms(String key, Realm value) {
			if (this.realms == null) {
				this.realms = new HashMap<>();
			}
			this.realms.put(key, value);
			return this;
		}

		/**
		 * Set {@link #realms(Map)} to a singleton map.
		 */
		public Builder realms(String key, Function<Realm.Builder, ObjectBuilder<Realm>> fn) {
			return this.realms(Collections.singletonMap(key, fn.apply(new Realm.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #realms(Map)}, creating the map if needed.
		 */
		public Builder putRealms(String key, Function<Realm.Builder, ObjectBuilder<Realm>> fn) {
			return this.putRealms(key, fn.apply(new Realm.Builder()).build());
		}

		/**
		 * Required - API name: {@code role_mapping}
		 */
		public Builder roleMapping(Map<String, RoleMapping> value) {
			this.roleMapping = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #roleMapping(Map)}, creating the map if needed.
		 */
		public Builder putRoleMapping(String key, RoleMapping value) {
			if (this.roleMapping == null) {
				this.roleMapping = new HashMap<>();
			}
			this.roleMapping.put(key, value);
			return this;
		}

		/**
		 * Set {@link #roleMapping(Map)} to a singleton map.
		 */
		public Builder roleMapping(String key, Function<RoleMapping.Builder, ObjectBuilder<RoleMapping>> fn) {
			return this.roleMapping(Collections.singletonMap(key, fn.apply(new RoleMapping.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #roleMapping(Map)}, creating the map if needed.
		 */
		public Builder putRoleMapping(String key, Function<RoleMapping.Builder, ObjectBuilder<RoleMapping>> fn) {
			return this.putRoleMapping(key, fn.apply(new RoleMapping.Builder()).build());
		}

		/**
		 * Required - API name: {@code roles}
		 */
		public Builder roles(SecurityRoles value) {
			this.roles = value;
			return this;
		}

		/**
		 * Required - API name: {@code roles}
		 */
		public Builder roles(Function<SecurityRoles.Builder, ObjectBuilder<SecurityRoles>> fn) {
			return this.roles(fn.apply(new SecurityRoles.Builder()).build());
		}

		/**
		 * Required - API name: {@code ssl}
		 */
		public Builder ssl(Ssl value) {
			this.ssl = value;
			return this;
		}

		/**
		 * Required - API name: {@code ssl}
		 */
		public Builder ssl(Function<Ssl.Builder, ObjectBuilder<Ssl>> fn) {
			return this.ssl(fn.apply(new Ssl.Builder()).build());
		}

		/**
		 * API name: {@code system_key}
		 */
		public Builder systemKey(@Nullable FeatureToggle value) {
			this.systemKey = value;
			return this;
		}

		/**
		 * API name: {@code system_key}
		 */
		public Builder systemKey(Function<FeatureToggle.Builder, ObjectBuilder<FeatureToggle>> fn) {
			return this.systemKey(fn.apply(new FeatureToggle.Builder()).build());
		}

		/**
		 * Required - API name: {@code token_service}
		 */
		public Builder tokenService(FeatureToggle value) {
			this.tokenService = value;
			return this;
		}

		/**
		 * Required - API name: {@code token_service}
		 */
		public Builder tokenService(Function<FeatureToggle.Builder, ObjectBuilder<FeatureToggle>> fn) {
			return this.tokenService(fn.apply(new FeatureToggle.Builder()).build());
		}

		/**
		 * Required - API name: {@code operator_privileges}
		 */
		public Builder operatorPrivileges(Base value) {
			this.operatorPrivileges = value;
			return this;
		}

		/**
		 * Required - API name: {@code operator_privileges}
		 */
		public Builder operatorPrivileges(Function<Base.Builder, ObjectBuilder<Base>> fn) {
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
