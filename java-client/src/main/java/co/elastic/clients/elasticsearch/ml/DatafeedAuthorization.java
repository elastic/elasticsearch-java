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

package co.elastic.clients.elasticsearch.ml;

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

// typedef: ml._types.DatafeedAuthorization

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml._types.DatafeedAuthorization">API
 *      specification</a>
 */
@JsonpDeserializable
public class DatafeedAuthorization implements JsonpSerializable {
	@Nullable
	private final ApiKeyAuthorization apiKey;

	private final List<String> roles;

	@Nullable
	private final String serviceAccount;

	// ---------------------------------------------------------------------------------------------

	private DatafeedAuthorization(Builder builder) {

		this.apiKey = builder.apiKey;
		this.roles = ApiTypeHelper.unmodifiable(builder.roles);
		this.serviceAccount = builder.serviceAccount;

	}

	public static DatafeedAuthorization of(Function<Builder, ObjectBuilder<DatafeedAuthorization>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * If an API key was used for the most recent update to the datafeed, its name
	 * and identifier are listed in the response.
	 * <p>
	 * API name: {@code api_key}
	 */
	@Nullable
	public final ApiKeyAuthorization apiKey() {
		return this.apiKey;
	}

	/**
	 * If a user ID was used for the most recent update to the datafeed, its roles
	 * at the time of the update are listed in the response.
	 * <p>
	 * API name: {@code roles}
	 */
	public final List<String> roles() {
		return this.roles;
	}

	/**
	 * If a service account was used for the most recent update to the datafeed, the
	 * account name is listed in the response.
	 * <p>
	 * API name: {@code service_account}
	 */
	@Nullable
	public final String serviceAccount() {
		return this.serviceAccount;
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

		if (this.apiKey != null) {
			generator.writeKey("api_key");
			this.apiKey.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.roles)) {
			generator.writeKey("roles");
			generator.writeStartArray();
			for (String item0 : this.roles) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.serviceAccount != null) {
			generator.writeKey("service_account");
			generator.write(this.serviceAccount);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DatafeedAuthorization}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DatafeedAuthorization> {
		@Nullable
		private ApiKeyAuthorization apiKey;

		@Nullable
		private List<String> roles;

		@Nullable
		private String serviceAccount;

		/**
		 * If an API key was used for the most recent update to the datafeed, its name
		 * and identifier are listed in the response.
		 * <p>
		 * API name: {@code api_key}
		 */
		public final Builder apiKey(@Nullable ApiKeyAuthorization value) {
			this.apiKey = value;
			return this;
		}

		/**
		 * If an API key was used for the most recent update to the datafeed, its name
		 * and identifier are listed in the response.
		 * <p>
		 * API name: {@code api_key}
		 */
		public final Builder apiKey(Function<ApiKeyAuthorization.Builder, ObjectBuilder<ApiKeyAuthorization>> fn) {
			return this.apiKey(fn.apply(new ApiKeyAuthorization.Builder()).build());
		}

		/**
		 * If a user ID was used for the most recent update to the datafeed, its roles
		 * at the time of the update are listed in the response.
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
		 * If a user ID was used for the most recent update to the datafeed, its roles
		 * at the time of the update are listed in the response.
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
		 * If a service account was used for the most recent update to the datafeed, the
		 * account name is listed in the response.
		 * <p>
		 * API name: {@code service_account}
		 */
		public final Builder serviceAccount(@Nullable String value) {
			this.serviceAccount = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DatafeedAuthorization}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DatafeedAuthorization build() {
			_checkSingleUse();

			return new DatafeedAuthorization(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DatafeedAuthorization}
	 */
	public static final JsonpDeserializer<DatafeedAuthorization> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DatafeedAuthorization::setupDatafeedAuthorizationDeserializer);

	protected static void setupDatafeedAuthorizationDeserializer(ObjectDeserializer<DatafeedAuthorization.Builder> op) {

		op.add(Builder::apiKey, ApiKeyAuthorization._DESERIALIZER, "api_key");
		op.add(Builder::roles, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "roles");
		op.add(Builder::serviceAccount, JsonpDeserializer.stringDeserializer(), "service_account");

	}

}
