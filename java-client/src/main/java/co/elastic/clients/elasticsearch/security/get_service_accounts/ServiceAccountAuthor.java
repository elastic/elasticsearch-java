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

// typedef: security.get_service_accounts.ServiceAccountAuthor

/**
 * The user who wrote a user-managed service account. If the request ran as
 * another user, that user is recorded. If the request was made with an API key,
 * the owner of the key is recorded, from the owner's own realm, together with
 * the key itself. For an older API key that does not record its owner's realm,
 * the realm is the API key realm, <code>_es_api_key</code>.
 * 
 * @see <a href=
 *      "../../doc-files/api-spec.html#security.get_service_accounts.ServiceAccountAuthor">API
 *      specification</a>
 */
@JsonpDeserializable
public class ServiceAccountAuthor implements JsonpSerializable {
	private final String username;

	private final String realm;

	private final String realmType;

	@Nullable
	private final ServiceAccountAuthorApiKey apiKey;

	// ---------------------------------------------------------------------------------------------

	private ServiceAccountAuthor(Builder builder) {

		this.username = ApiTypeHelper.requireNonNull(builder.username, this, "username");
		this.realm = ApiTypeHelper.requireNonNull(builder.realm, this, "realm");
		this.realmType = ApiTypeHelper.requireNonNull(builder.realmType, this, "realmType");
		this.apiKey = builder.apiKey;

	}

	public static ServiceAccountAuthor of(Function<Builder, ObjectBuilder<ServiceAccountAuthor>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The username of the user.
	 * <p>
	 * API name: {@code username}
	 */
	public final String username() {
		return this.username;
	}

	/**
	 * Required - The name of the realm that authenticated the user.
	 * <p>
	 * API name: {@code realm}
	 */
	public final String realm() {
		return this.realm;
	}

	/**
	 * Required - The type of the realm that authenticated the user.
	 * <p>
	 * API name: {@code realm_type}
	 */
	public final String realmType() {
		return this.realmType;
	}

	/**
	 * The API key that the request was made with. Absent when the request was not
	 * made with an API key, or when the API key ran as another user.
	 * <p>
	 * API name: {@code api_key}
	 */
	@Nullable
	public final ServiceAccountAuthorApiKey apiKey() {
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

		generator.writeKey("realm");
		generator.write(this.realm);

		generator.writeKey("realm_type");
		generator.write(this.realmType);

		if (this.apiKey != null) {
			generator.writeKey("api_key");
			this.apiKey.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ServiceAccountAuthor}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ServiceAccountAuthor> {
		private String username;

		private String realm;

		private String realmType;

		@Nullable
		private ServiceAccountAuthorApiKey apiKey;

		public Builder() {
		}
		private Builder(ServiceAccountAuthor instance) {
			this.username = instance.username;
			this.realm = instance.realm;
			this.realmType = instance.realmType;
			this.apiKey = instance.apiKey;

		}
		/**
		 * Required - The username of the user.
		 * <p>
		 * API name: {@code username}
		 */
		public final Builder username(String value) {
			this.username = value;
			return this;
		}

		/**
		 * Required - The name of the realm that authenticated the user.
		 * <p>
		 * API name: {@code realm}
		 */
		public final Builder realm(String value) {
			this.realm = value;
			return this;
		}

		/**
		 * Required - The type of the realm that authenticated the user.
		 * <p>
		 * API name: {@code realm_type}
		 */
		public final Builder realmType(String value) {
			this.realmType = value;
			return this;
		}

		/**
		 * The API key that the request was made with. Absent when the request was not
		 * made with an API key, or when the API key ran as another user.
		 * <p>
		 * API name: {@code api_key}
		 */
		public final Builder apiKey(@Nullable ServiceAccountAuthorApiKey value) {
			this.apiKey = value;
			return this;
		}

		/**
		 * The API key that the request was made with. Absent when the request was not
		 * made with an API key, or when the API key ran as another user.
		 * <p>
		 * API name: {@code api_key}
		 */
		public final Builder apiKey(
				Function<ServiceAccountAuthorApiKey.Builder, ObjectBuilder<ServiceAccountAuthorApiKey>> fn) {
			return this.apiKey(fn.apply(new ServiceAccountAuthorApiKey.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ServiceAccountAuthor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ServiceAccountAuthor build() {
			_checkSingleUse();

			return new ServiceAccountAuthor(this);
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
	 * Json deserializer for {@link ServiceAccountAuthor}
	 */
	public static final JsonpDeserializer<ServiceAccountAuthor> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ServiceAccountAuthor::setupServiceAccountAuthorDeserializer);

	protected static void setupServiceAccountAuthorDeserializer(ObjectDeserializer<ServiceAccountAuthor.Builder> op) {

		op.add(Builder::username, JsonpDeserializer.stringDeserializer(), "username");
		op.add(Builder::realm, JsonpDeserializer.stringDeserializer(), "realm");
		op.add(Builder::realmType, JsonpDeserializer.stringDeserializer(), "realm_type");
		op.add(Builder::apiKey, ServiceAccountAuthorApiKey._DESERIALIZER, "api_key");

	}

}
