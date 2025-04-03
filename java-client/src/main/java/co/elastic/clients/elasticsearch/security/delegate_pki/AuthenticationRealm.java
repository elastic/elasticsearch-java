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
import java.lang.String;
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

// typedef: security.delegate_pki.AuthenticationRealm

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#security.delegate_pki.AuthenticationRealm">API
 *      specification</a>
 */
@JsonpDeserializable
public class AuthenticationRealm implements JsonpSerializable {
	private final String name;

	private final String type;

	@Nullable
	private final String domain;

	// ---------------------------------------------------------------------------------------------

	private AuthenticationRealm(Builder builder) {

		this.name = ApiTypeHelper.requireNonNullWithDefault(builder.name, this, "name", this.name());
		this.type = ApiTypeHelper.requireNonNullWithDefault(builder.type, this, "type", this.type());
		this.domain = builder.domain;

	}

	public static AuthenticationRealm of(Function<Builder, ObjectBuilder<AuthenticationRealm>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Required - API name: {@code type}
	 */
	public final String type() {
		return this.type;
	}

	/**
	 * API name: {@code domain}
	 */
	@Nullable
	public final String domain() {
		return this.domain;
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

		generator.writeKey("name");
		generator.write(this.name);

		generator.writeKey("type");
		generator.write(this.type);

		if (this.domain != null) {
			generator.writeKey("domain");
			generator.write(this.domain);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AuthenticationRealm}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<AuthenticationRealm> {
		private String name;

		private String type;

		@Nullable
		private String domain;

		/**
		 * Required - API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - API name: {@code type}
		 */
		public final Builder type(String value) {
			this.type = value;
			return this;
		}

		/**
		 * API name: {@code domain}
		 */
		public final Builder domain(@Nullable String value) {
			this.domain = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AuthenticationRealm}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AuthenticationRealm build() {
			_checkSingleUse();

			return new AuthenticationRealm(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AuthenticationRealm}
	 */
	public static final JsonpDeserializer<AuthenticationRealm> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, AuthenticationRealm::setupAuthenticationRealmDeserializer);

	protected static void setupAuthenticationRealmDeserializer(ObjectDeserializer<AuthenticationRealm.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");
		op.add(Builder::domain, JsonpDeserializer.stringDeserializer(), "domain");

	}

}
