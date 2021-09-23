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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: xpack.usage.Realm
public final class Realm extends Base {
	@Nullable
	private final List<String> name;

	@Nullable
	private final List<Number> order;

	@Nullable
	private final List<Number> size;

	@Nullable
	private final List<RealmCache> cache;

	@Nullable
	private final List<Boolean> hasAuthorizationRealms;

	@Nullable
	private final List<Boolean> hasDefaultUsernamePattern;

	@Nullable
	private final List<Boolean> hasTruststore;

	@Nullable
	private final List<Boolean> isAuthenticationDelegated;

	// ---------------------------------------------------------------------------------------------

	public Realm(Builder builder) {
		super(builder);

		this.name = builder.name;
		this.order = builder.order;
		this.size = builder.size;
		this.cache = builder.cache;
		this.hasAuthorizationRealms = builder.hasAuthorizationRealms;
		this.hasDefaultUsernamePattern = builder.hasDefaultUsernamePattern;
		this.hasTruststore = builder.hasTruststore;
		this.isAuthenticationDelegated = builder.isAuthenticationDelegated;

	}

	/**
	 * API name: {@code name}
	 */
	@Nullable
	public List<String> name() {
		return this.name;
	}

	/**
	 * API name: {@code order}
	 */
	@Nullable
	public List<Number> order() {
		return this.order;
	}

	/**
	 * API name: {@code size}
	 */
	@Nullable
	public List<Number> size() {
		return this.size;
	}

	/**
	 * API name: {@code cache}
	 */
	@Nullable
	public List<RealmCache> cache() {
		return this.cache;
	}

	/**
	 * API name: {@code has_authorization_realms}
	 */
	@Nullable
	public List<Boolean> hasAuthorizationRealms() {
		return this.hasAuthorizationRealms;
	}

	/**
	 * API name: {@code has_default_username_pattern}
	 */
	@Nullable
	public List<Boolean> hasDefaultUsernamePattern() {
		return this.hasDefaultUsernamePattern;
	}

	/**
	 * API name: {@code has_truststore}
	 */
	@Nullable
	public List<Boolean> hasTruststore() {
		return this.hasTruststore;
	}

	/**
	 * API name: {@code is_authentication_delegated}
	 */
	@Nullable
	public List<Boolean> isAuthenticationDelegated() {
		return this.isAuthenticationDelegated;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.name != null) {

			generator.writeKey("name");
			generator.writeStartArray();
			for (String item0 : this.name) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.order != null) {

			generator.writeKey("order");
			generator.writeStartArray();
			for (Number item0 : this.order) {
				generator.write(item0.doubleValue());

			}
			generator.writeEnd();

		}
		if (this.size != null) {

			generator.writeKey("size");
			generator.writeStartArray();
			for (Number item0 : this.size) {
				generator.write(item0.doubleValue());

			}
			generator.writeEnd();

		}
		if (this.cache != null) {

			generator.writeKey("cache");
			generator.writeStartArray();
			for (RealmCache item0 : this.cache) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.hasAuthorizationRealms != null) {

			generator.writeKey("has_authorization_realms");
			generator.writeStartArray();
			for (Boolean item0 : this.hasAuthorizationRealms) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.hasDefaultUsernamePattern != null) {

			generator.writeKey("has_default_username_pattern");
			generator.writeStartArray();
			for (Boolean item0 : this.hasDefaultUsernamePattern) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.hasTruststore != null) {

			generator.writeKey("has_truststore");
			generator.writeStartArray();
			for (Boolean item0 : this.hasTruststore) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.isAuthenticationDelegated != null) {

			generator.writeKey("is_authentication_delegated");
			generator.writeStartArray();
			for (Boolean item0 : this.isAuthenticationDelegated) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Realm}.
	 */
	public static class Builder extends Base.AbstractBuilder<Builder> implements ObjectBuilder<Realm> {
		@Nullable
		private List<String> name;

		@Nullable
		private List<Number> order;

		@Nullable
		private List<Number> size;

		@Nullable
		private List<RealmCache> cache;

		@Nullable
		private List<Boolean> hasAuthorizationRealms;

		@Nullable
		private List<Boolean> hasDefaultUsernamePattern;

		@Nullable
		private List<Boolean> hasTruststore;

		@Nullable
		private List<Boolean> isAuthenticationDelegated;

		/**
		 * API name: {@code name}
		 */
		public Builder name(@Nullable List<String> value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code name}
		 */
		public Builder name(String... value) {
			this.name = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #name(List)}, creating the list if needed.
		 */
		public Builder addName(String value) {
			if (this.name == null) {
				this.name = new ArrayList<>();
			}
			this.name.add(value);
			return this;
		}

		/**
		 * API name: {@code order}
		 */
		public Builder order(@Nullable List<Number> value) {
			this.order = value;
			return this;
		}

		/**
		 * API name: {@code order}
		 */
		public Builder order(Number... value) {
			this.order = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #order(List)}, creating the list if needed.
		 */
		public Builder addOrder(Number value) {
			if (this.order == null) {
				this.order = new ArrayList<>();
			}
			this.order.add(value);
			return this;
		}

		/**
		 * API name: {@code size}
		 */
		public Builder size(@Nullable List<Number> value) {
			this.size = value;
			return this;
		}

		/**
		 * API name: {@code size}
		 */
		public Builder size(Number... value) {
			this.size = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #size(List)}, creating the list if needed.
		 */
		public Builder addSize(Number value) {
			if (this.size == null) {
				this.size = new ArrayList<>();
			}
			this.size.add(value);
			return this;
		}

		/**
		 * API name: {@code cache}
		 */
		public Builder cache(@Nullable List<RealmCache> value) {
			this.cache = value;
			return this;
		}

		/**
		 * API name: {@code cache}
		 */
		public Builder cache(RealmCache... value) {
			this.cache = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #cache(List)}, creating the list if needed.
		 */
		public Builder addCache(RealmCache value) {
			if (this.cache == null) {
				this.cache = new ArrayList<>();
			}
			this.cache.add(value);
			return this;
		}

		/**
		 * Set {@link #cache(List)} to a singleton list.
		 */
		public Builder cache(Function<RealmCache.Builder, ObjectBuilder<RealmCache>> fn) {
			return this.cache(fn.apply(new RealmCache.Builder()).build());
		}

		/**
		 * Add a value to {@link #cache(List)}, creating the list if needed.
		 */
		public Builder addCache(Function<RealmCache.Builder, ObjectBuilder<RealmCache>> fn) {
			return this.addCache(fn.apply(new RealmCache.Builder()).build());
		}

		/**
		 * API name: {@code has_authorization_realms}
		 */
		public Builder hasAuthorizationRealms(@Nullable List<Boolean> value) {
			this.hasAuthorizationRealms = value;
			return this;
		}

		/**
		 * API name: {@code has_authorization_realms}
		 */
		public Builder hasAuthorizationRealms(Boolean... value) {
			this.hasAuthorizationRealms = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #hasAuthorizationRealms(List)}, creating the list if
		 * needed.
		 */
		public Builder addHasAuthorizationRealms(Boolean value) {
			if (this.hasAuthorizationRealms == null) {
				this.hasAuthorizationRealms = new ArrayList<>();
			}
			this.hasAuthorizationRealms.add(value);
			return this;
		}

		/**
		 * API name: {@code has_default_username_pattern}
		 */
		public Builder hasDefaultUsernamePattern(@Nullable List<Boolean> value) {
			this.hasDefaultUsernamePattern = value;
			return this;
		}

		/**
		 * API name: {@code has_default_username_pattern}
		 */
		public Builder hasDefaultUsernamePattern(Boolean... value) {
			this.hasDefaultUsernamePattern = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #hasDefaultUsernamePattern(List)}, creating the list if
		 * needed.
		 */
		public Builder addHasDefaultUsernamePattern(Boolean value) {
			if (this.hasDefaultUsernamePattern == null) {
				this.hasDefaultUsernamePattern = new ArrayList<>();
			}
			this.hasDefaultUsernamePattern.add(value);
			return this;
		}

		/**
		 * API name: {@code has_truststore}
		 */
		public Builder hasTruststore(@Nullable List<Boolean> value) {
			this.hasTruststore = value;
			return this;
		}

		/**
		 * API name: {@code has_truststore}
		 */
		public Builder hasTruststore(Boolean... value) {
			this.hasTruststore = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #hasTruststore(List)}, creating the list if needed.
		 */
		public Builder addHasTruststore(Boolean value) {
			if (this.hasTruststore == null) {
				this.hasTruststore = new ArrayList<>();
			}
			this.hasTruststore.add(value);
			return this;
		}

		/**
		 * API name: {@code is_authentication_delegated}
		 */
		public Builder isAuthenticationDelegated(@Nullable List<Boolean> value) {
			this.isAuthenticationDelegated = value;
			return this;
		}

		/**
		 * API name: {@code is_authentication_delegated}
		 */
		public Builder isAuthenticationDelegated(Boolean... value) {
			this.isAuthenticationDelegated = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #isAuthenticationDelegated(List)}, creating the list if
		 * needed.
		 */
		public Builder addIsAuthenticationDelegated(Boolean value) {
			if (this.isAuthenticationDelegated == null) {
				this.isAuthenticationDelegated = new ArrayList<>();
			}
			this.isAuthenticationDelegated.add(value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Realm}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Realm build() {

			return new Realm(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Realm}
	 */
	public static final JsonpDeserializer<Realm> DESERIALIZER = ObjectBuilderDeserializer.createForObject(Builder::new,
			Realm::setupRealmDeserializer);

	protected static void setupRealmDeserializer(DelegatingDeserializer<Realm.Builder> op) {
		Base.setupBaseDeserializer(op);
		op.add(Builder::name, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "name");
		op.add(Builder::order, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.numberDeserializer()), "order");
		op.add(Builder::size, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.numberDeserializer()), "size");
		op.add(Builder::cache, JsonpDeserializer.arrayDeserializer(RealmCache.DESERIALIZER), "cache");
		op.add(Builder::hasAuthorizationRealms,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.booleanDeserializer()),
				"has_authorization_realms");
		op.add(Builder::hasDefaultUsernamePattern,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.booleanDeserializer()),
				"has_default_username_pattern");
		op.add(Builder::hasTruststore, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.booleanDeserializer()),
				"has_truststore");
		op.add(Builder::isAuthenticationDelegated,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.booleanDeserializer()),
				"is_authentication_delegated");

	}

}
