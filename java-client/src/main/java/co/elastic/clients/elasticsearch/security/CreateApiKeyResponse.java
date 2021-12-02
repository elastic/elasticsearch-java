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

package co.elastic.clients.elasticsearch.security;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.create_api_key.Response

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/04a9498/specification/security/create_api_key/SecurityCreateApiKeyResponse.ts#L23-L25">API
 *      specification</a>
 */
@JsonpDeserializable
public class CreateApiKeyResponse implements JsonpSerializable {
	private final String apiKey;

	@Nullable
	private final Long expiration;

	private final String id;

	private final String name;

	// ---------------------------------------------------------------------------------------------

	private CreateApiKeyResponse(Builder builder) {

		this.apiKey = ApiTypeHelper.requireNonNull(builder.apiKey, this, "apiKey");
		this.expiration = builder.expiration;
		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");

	}

	public static CreateApiKeyResponse of(Function<Builder, ObjectBuilder<CreateApiKeyResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code api_key}
	 */
	public final String apiKey() {
		return this.apiKey;
	}

	/**
	 * API name: {@code expiration}
	 */
	@Nullable
	public final Long expiration() {
		return this.expiration;
	}

	/**
	 * Required - API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Required - API name: {@code name}
	 */
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

		generator.writeKey("api_key");
		generator.write(this.apiKey);

		if (this.expiration != null) {
			generator.writeKey("expiration");
			generator.write(this.expiration);

		}
		generator.writeKey("id");
		generator.write(this.id);

		generator.writeKey("name");
		generator.write(this.name);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CreateApiKeyResponse}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<CreateApiKeyResponse> {
		private String apiKey;

		@Nullable
		private Long expiration;

		private String id;

		private String name;

		/**
		 * Required - API name: {@code api_key}
		 */
		public final Builder apiKey(String value) {
			this.apiKey = value;
			return this;
		}

		/**
		 * API name: {@code expiration}
		 */
		public final Builder expiration(@Nullable Long value) {
			this.expiration = value;
			return this;
		}

		/**
		 * Required - API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Builds a {@link CreateApiKeyResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CreateApiKeyResponse build() {
			_checkSingleUse();

			return new CreateApiKeyResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CreateApiKeyResponse}
	 */
	public static final JsonpDeserializer<CreateApiKeyResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CreateApiKeyResponse::setupCreateApiKeyResponseDeserializer);

	protected static void setupCreateApiKeyResponseDeserializer(ObjectDeserializer<CreateApiKeyResponse.Builder> op) {

		op.add(Builder::apiKey, JsonpDeserializer.stringDeserializer(), "api_key");
		op.add(Builder::expiration, JsonpDeserializer.longDeserializer(), "expiration");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");

	}

}
