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

// typedef: security.get_service_accounts.ServiceAccountAuthorApiKey

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#security.get_service_accounts.ServiceAccountAuthorApiKey">API
 *      specification</a>
 */
@JsonpDeserializable
public class ServiceAccountAuthorApiKey implements JsonpSerializable {
	private final String id;

	@Nullable
	private final String name;

	// ---------------------------------------------------------------------------------------------

	private ServiceAccountAuthorApiKey(Builder builder) {

		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.name = builder.name;

	}

	public static ServiceAccountAuthorApiKey of(Function<Builder, ObjectBuilder<ServiceAccountAuthorApiKey>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The ID of the API key.
	 * <p>
	 * API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * The name that the API key had when the request was made. Absent when the API
	 * key has no name.
	 * <p>
	 * API name: {@code name}
	 */
	@Nullable
	public final String name() {
		return this.name;
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

		if (this.name != null) {
			generator.writeKey("name");
			generator.write(this.name);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ServiceAccountAuthorApiKey}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ServiceAccountAuthorApiKey> {
		private String id;

		@Nullable
		private String name;

		public Builder() {
		}
		private Builder(ServiceAccountAuthorApiKey instance) {
			this.id = instance.id;
			this.name = instance.name;

		}
		/**
		 * Required - The ID of the API key.
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * The name that the API key had when the request was made. Absent when the API
		 * key has no name.
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(@Nullable String value) {
			this.name = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ServiceAccountAuthorApiKey}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ServiceAccountAuthorApiKey build() {
			_checkSingleUse();

			return new ServiceAccountAuthorApiKey(this);
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
	 * Json deserializer for {@link ServiceAccountAuthorApiKey}
	 */
	public static final JsonpDeserializer<ServiceAccountAuthorApiKey> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ServiceAccountAuthorApiKey::setupServiceAccountAuthorApiKeyDeserializer);

	protected static void setupServiceAccountAuthorApiKeyDeserializer(
			ObjectDeserializer<ServiceAccountAuthorApiKey.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");

	}

}
