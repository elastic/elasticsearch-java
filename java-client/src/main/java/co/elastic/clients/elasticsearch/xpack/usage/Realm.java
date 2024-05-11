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

package co.elastic.clients.elasticsearch.xpack.usage;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
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

// typedef: xpack.usage.Realm

/**
 *
 * @see <a href="../../doc-files/api-spec.html#xpack.usage.Realm">API
 *      specification</a>
 */
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

		this.name = ApiTypeHelper.unmodifiable(builder.name);
		this.order = ApiTypeHelper.unmodifiable(builder.order);
		this.size = ApiTypeHelper.unmodifiable(builder.size);
		this.cache = ApiTypeHelper.unmodifiable(builder.cache);
		this.hasAuthorizationRealms = ApiTypeHelper.unmodifiable(builder.hasAuthorizationRealms);
		this.hasDefaultUsernamePattern = ApiTypeHelper.unmodifiable(builder.hasDefaultUsernamePattern);
		this.hasTruststore = ApiTypeHelper.unmodifiable(builder.hasTruststore);
		this.isAuthenticationDelegated = ApiTypeHelper.unmodifiable(builder.isAuthenticationDelegated);

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
		if (ApiTypeHelper.isDefined(this.name)) {
			generator.writeKey("name");
			generator.writeStartArray();
			for (String item0 : this.name) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.order)) {
			generator.writeKey("order");
			generator.writeStartArray();
			for (Long item0 : this.order) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.size)) {
			generator.writeKey("size");
			generator.writeStartArray();
			for (Long item0 : this.size) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.cache)) {
			generator.writeKey("cache");
			generator.writeStartArray();
			for (RealmCache item0 : this.cache) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.hasAuthorizationRealms)) {
			generator.writeKey("has_authorization_realms");
			generator.writeStartArray();
			for (Boolean item0 : this.hasAuthorizationRealms) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.hasDefaultUsernamePattern)) {
			generator.writeKey("has_default_username_pattern");
			generator.writeStartArray();
			for (Boolean item0 : this.hasDefaultUsernamePattern) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.hasTruststore)) {
			generator.writeKey("has_truststore");
			generator.writeStartArray();
			for (Boolean item0 : this.hasTruststore) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.isAuthenticationDelegated)) {
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
		 * <p>
		 * Adds all elements of <code>list</code> to <code>name</code>.
		 */
		public final Builder name(List<String> list) {
			this.name = _listAddAll(this.name, list);
			return this;
		}

		/**
		 * API name: {@code name}
		 * <p>
		 * Adds one or more values to <code>name</code>.
		 */
		public final Builder name(String value, String... values) {
			this.name = _listAdd(this.name, value, values);
			return this;
		}

		/**
		 * API name: {@code order}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>order</code>.
		 */
		public final Builder order(List<Long> list) {
			this.order = _listAddAll(this.order, list);
			return this;
		}

		/**
		 * API name: {@code order}
		 * <p>
		 * Adds one or more values to <code>order</code>.
		 */
		public final Builder order(Long value, Long... values) {
			this.order = _listAdd(this.order, value, values);
			return this;
		}

		/**
		 * API name: {@code size}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>size</code>.
		 */
		public final Builder size(List<Long> list) {
			this.size = _listAddAll(this.size, list);
			return this;
		}

		/**
		 * API name: {@code size}
		 * <p>
		 * Adds one or more values to <code>size</code>.
		 */
		public final Builder size(Long value, Long... values) {
			this.size = _listAdd(this.size, value, values);
			return this;
		}

		/**
		 * API name: {@code cache}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>cache</code>.
		 */
		public final Builder cache(List<RealmCache> list) {
			this.cache = _listAddAll(this.cache, list);
			return this;
		}

		/**
		 * API name: {@code cache}
		 * <p>
		 * Adds one or more values to <code>cache</code>.
		 */
		public final Builder cache(RealmCache value, RealmCache... values) {
			this.cache = _listAdd(this.cache, value, values);
			return this;
		}

		/**
		 * API name: {@code cache}
		 * <p>
		 * Adds a value to <code>cache</code> using a builder lambda.
		 */
		public final Builder cache(Function<RealmCache.Builder, ObjectBuilder<RealmCache>> fn) {
			return cache(fn.apply(new RealmCache.Builder()).build());
		}

		/**
		 * API name: {@code has_authorization_realms}
		 * <p>
		 * Adds all elements of <code>list</code> to
		 * <code>hasAuthorizationRealms</code>.
		 */
		public final Builder hasAuthorizationRealms(List<Boolean> list) {
			this.hasAuthorizationRealms = _listAddAll(this.hasAuthorizationRealms, list);
			return this;
		}

		/**
		 * API name: {@code has_authorization_realms}
		 * <p>
		 * Adds one or more values to <code>hasAuthorizationRealms</code>.
		 */
		public final Builder hasAuthorizationRealms(Boolean value, Boolean... values) {
			this.hasAuthorizationRealms = _listAdd(this.hasAuthorizationRealms, value, values);
			return this;
		}

		/**
		 * API name: {@code has_default_username_pattern}
		 * <p>
		 * Adds all elements of <code>list</code> to
		 * <code>hasDefaultUsernamePattern</code>.
		 */
		public final Builder hasDefaultUsernamePattern(List<Boolean> list) {
			this.hasDefaultUsernamePattern = _listAddAll(this.hasDefaultUsernamePattern, list);
			return this;
		}

		/**
		 * API name: {@code has_default_username_pattern}
		 * <p>
		 * Adds one or more values to <code>hasDefaultUsernamePattern</code>.
		 */
		public final Builder hasDefaultUsernamePattern(Boolean value, Boolean... values) {
			this.hasDefaultUsernamePattern = _listAdd(this.hasDefaultUsernamePattern, value, values);
			return this;
		}

		/**
		 * API name: {@code has_truststore}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>hasTruststore</code>.
		 */
		public final Builder hasTruststore(List<Boolean> list) {
			this.hasTruststore = _listAddAll(this.hasTruststore, list);
			return this;
		}

		/**
		 * API name: {@code has_truststore}
		 * <p>
		 * Adds one or more values to <code>hasTruststore</code>.
		 */
		public final Builder hasTruststore(Boolean value, Boolean... values) {
			this.hasTruststore = _listAdd(this.hasTruststore, value, values);
			return this;
		}

		/**
		 * API name: {@code is_authentication_delegated}
		 * <p>
		 * Adds all elements of <code>list</code> to
		 * <code>isAuthenticationDelegated</code>.
		 */
		public final Builder isAuthenticationDelegated(List<Boolean> list) {
			this.isAuthenticationDelegated = _listAddAll(this.isAuthenticationDelegated, list);
			return this;
		}

		/**
		 * API name: {@code is_authentication_delegated}
		 * <p>
		 * Adds one or more values to <code>isAuthenticationDelegated</code>.
		 */
		public final Builder isAuthenticationDelegated(Boolean value, Boolean... values) {
			this.isAuthenticationDelegated = _listAdd(this.isAuthenticationDelegated, value, values);
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
			Realm::setupRealmDeserializer);

	protected static void setupRealmDeserializer(ObjectDeserializer<Realm.Builder> op) {
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
