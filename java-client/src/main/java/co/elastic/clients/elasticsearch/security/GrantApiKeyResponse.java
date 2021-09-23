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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: security.grant_api_key.Response
public final class GrantApiKeyResponse implements JsonpSerializable {
	private final String apiKey;

	private final String id;

	private final String name;

	@Nullable
	private final JsonValue expiration;

	// ---------------------------------------------------------------------------------------------

	public GrantApiKeyResponse(Builder builder) {

		this.apiKey = Objects.requireNonNull(builder.apiKey, "api_key");
		this.id = Objects.requireNonNull(builder.id, "id");
		this.name = Objects.requireNonNull(builder.name, "name");
		this.expiration = builder.expiration;

	}

	/**
	 * API name: {@code api_key}
	 */
	public String apiKey() {
		return this.apiKey;
	}

	/**
	 * API name: {@code id}
	 */
	public String id() {
		return this.id;
	}

	/**
	 * API name: {@code name}
	 */
	public String name() {
		return this.name;
	}

	/**
	 * API name: {@code expiration}
	 */
	@Nullable
	public JsonValue expiration() {
		return this.expiration;
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

		generator.writeKey("id");
		generator.write(this.id);

		generator.writeKey("name");
		generator.write(this.name);

		if (this.expiration != null) {

			generator.writeKey("expiration");
			generator.write(this.expiration);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GrantApiKeyResponse}.
	 */
	public static class Builder implements ObjectBuilder<GrantApiKeyResponse> {
		private String apiKey;

		private String id;

		private String name;

		@Nullable
		private JsonValue expiration;

		/**
		 * API name: {@code api_key}
		 */
		public Builder apiKey(String value) {
			this.apiKey = value;
			return this;
		}

		/**
		 * API name: {@code id}
		 */
		public Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code name}
		 */
		public Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code expiration}
		 */
		public Builder expiration(@Nullable JsonValue value) {
			this.expiration = value;
			return this;
		}

		/**
		 * Builds a {@link GrantApiKeyResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GrantApiKeyResponse build() {

			return new GrantApiKeyResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GrantApiKeyResponse}
	 */
	public static final JsonpDeserializer<GrantApiKeyResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, GrantApiKeyResponse::setupGrantApiKeyResponseDeserializer);

	protected static void setupGrantApiKeyResponseDeserializer(DelegatingDeserializer<GrantApiKeyResponse.Builder> op) {

		op.add(Builder::apiKey, JsonpDeserializer.stringDeserializer(), "api_key");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::expiration, JsonpDeserializer.jsonValueDeserializer(), "expiration");

	}

}
