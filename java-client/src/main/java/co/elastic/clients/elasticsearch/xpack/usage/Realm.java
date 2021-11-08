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
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: xpack.usage.Realm
@JsonpDeserializable
public class Realm extends Base {
	private final List<String> name;

	private final List<Long> order;

	private final List<Long> size;

	private final List<RealmCache> cache;

	private final List<Boolean> hasAuthorizationRealms;

	private final List<Boolean> hasDefaultUsernamePattern;

	private final List<Boolean> hasTruststore;

	private final List<Boolean> isAuthenticationDelegated;

	// ---------------------------------------------------------------------------------------------

	private Realm(Builder builder) {
		super(builder);

		this.name = ModelTypeHelper.unmodifiable(builder.name);
		this.order = ModelTypeHelper.unmodifiable(builder.order);
		this.size = ModelTypeHelper.unmodifiable(builder.size);
		this.cache = ModelTypeHelper.unmodifiable(builder.cache);
		this.hasAuthorizationRealms = ModelTypeHelper.unmodifiable(builder.hasAuthorizationRealms);
		this.hasDefaultUsernamePattern = ModelTypeHelper.unmodifiable(builder.hasDefaultUsernamePattern);
		this.hasTruststore = ModelTypeHelper.unmodifiable(builder.hasTruststore);
		this.isAuthenticationDelegated = ModelTypeHelper.unmodifiable(builder.isAuthenticationDelegated);

	}

	public static Realm of(Function<Builder, ObjectBuilder<Realm>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code name}
	 */
	public final List<String> name() {
		return this.name;
	}

	/**
	 * API name: {@code order}
	 */
	public final List<Long> order() {
		return this.order;
	}

	/**
	 * API name: {@code size}
	 */
	public final List<Long> size() {
		return this.size;
	}

	/**
	 * API name: {@code cache}
	 */
	public final List<RealmCache> cache() {
		return this.cache;
	}

	/**
	 * API name: {@code has_authorization_realms}
	 */
	public final List<Boolean> hasAuthorizationRealms() {
		return this.hasAuthorizationRealms;
	}

	/**
	 * API name: {@code has_default_username_pattern}
	 */
	public final List<Boolean> hasDefaultUsernamePattern() {
		return this.hasDefaultUsernamePattern;
	}

	/**
	 * API name: {@code has_truststore}
	 */
	public final List<Boolean> hasTruststore() {
		return this.hasTruststore;
	}

	/**
	 * API name: {@code is_authentication_delegated}
	 */
	public final List<Boolean> isAuthenticationDelegated() {
		return this.isAuthenticationDelegated;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (ModelTypeHelper.isDefined(this.name)) {
			generator.writeKey("name");
			generator.writeStartArray();
			for (String item0 : this.name) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.order)) {
			generator.writeKey("order");
			generator.writeStartArray();
			for (Long item0 : this.order) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.size)) {
			generator.writeKey("size");
			generator.writeStartArray();
			for (Long item0 : this.size) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.cache)) {
			generator.writeKey("cache");
			generator.writeStartArray();
			for (RealmCache item0 : this.cache) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.hasAuthorizationRealms)) {
			generator.writeKey("has_authorization_realms");
			generator.writeStartArray();
			for (Boolean item0 : this.hasAuthorizationRealms) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.hasDefaultUsernamePattern)) {
			generator.writeKey("has_default_username_pattern");
			generator.writeStartArray();
			for (Boolean item0 : this.hasDefaultUsernamePattern) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.hasTruststore)) {
			generator.writeKey("has_truststore");
			generator.writeStartArray();
			for (Boolean item0 : this.hasTruststore) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.isAuthenticationDelegated)) {
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
		private List<Long> order;

		@Nullable
		private List<Long> size;

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
		public final Builder name(@Nullable List<String> value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code name}
		 */
		public final Builder name(String... value) {
			this.name = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code order}
		 */
		public final Builder order(@Nullable List<Long> value) {
			this.order = value;
			return this;
		}

		/**
		 * API name: {@code order}
		 */
		public final Builder order(Long... value) {
			this.order = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable List<Long> value) {
			this.size = value;
			return this;
		}

		/**
		 * API name: {@code size}
		 */
		public final Builder size(Long... value) {
			this.size = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code cache}
		 */
		public final Builder cache(@Nullable List<RealmCache> value) {
			this.cache = value;
			return this;
		}

		/**
		 * API name: {@code cache}
		 */
		public final Builder cache(RealmCache... value) {
			this.cache = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code cache}
		 */
		@SafeVarargs
		public final Builder cache(Function<RealmCache.Builder, ObjectBuilder<RealmCache>>... fns) {
			this.cache = new ArrayList<>(fns.length);
			for (Function<RealmCache.Builder, ObjectBuilder<RealmCache>> fn : fns) {
				this.cache.add(fn.apply(new RealmCache.Builder()).build());
			}
			return this;
		}

		/**
		 * API name: {@code has_authorization_realms}
		 */
		public final Builder hasAuthorizationRealms(@Nullable List<Boolean> value) {
			this.hasAuthorizationRealms = value;
			return this;
		}

		/**
		 * API name: {@code has_authorization_realms}
		 */
		public final Builder hasAuthorizationRealms(Boolean... value) {
			this.hasAuthorizationRealms = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code has_default_username_pattern}
		 */
		public final Builder hasDefaultUsernamePattern(@Nullable List<Boolean> value) {
			this.hasDefaultUsernamePattern = value;
			return this;
		}

		/**
		 * API name: {@code has_default_username_pattern}
		 */
		public final Builder hasDefaultUsernamePattern(Boolean... value) {
			this.hasDefaultUsernamePattern = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code has_truststore}
		 */
		public final Builder hasTruststore(@Nullable List<Boolean> value) {
			this.hasTruststore = value;
			return this;
		}

		/**
		 * API name: {@code has_truststore}
		 */
		public final Builder hasTruststore(Boolean... value) {
			this.hasTruststore = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code is_authentication_delegated}
		 */
		public final Builder isAuthenticationDelegated(@Nullable List<Boolean> value) {
			this.isAuthenticationDelegated = value;
			return this;
		}

		/**
		 * API name: {@code is_authentication_delegated}
		 */
		public final Builder isAuthenticationDelegated(Boolean... value) {
			this.isAuthenticationDelegated = Arrays.asList(value);
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
			_checkSingleUse();

			return new Realm(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Realm}
	 */
	public static final JsonpDeserializer<Realm> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Realm::setupRealmDeserializer, Builder::build);

	protected static void setupRealmDeserializer(DelegatingDeserializer<Realm.Builder> op) {
		Base.setupBaseDeserializer(op);
		op.add(Builder::name, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "name");
		op.add(Builder::order, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.longDeserializer()), "order");
		op.add(Builder::size, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.longDeserializer()), "size");
		op.add(Builder::cache, JsonpDeserializer.arrayDeserializer(RealmCache._DESERIALIZER), "cache");
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
