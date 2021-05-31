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

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: security.create_api_key.Response
public final class CreateApiKeyResponse implements ToJsonp {
	private final String apiKey;

	@Nullable
	private final Number expiration;

	private final String id;

	private final String name;

	// ---------------------------------------------------------------------------------------------

	protected CreateApiKeyResponse(Builder builder) {

		this.apiKey = Objects.requireNonNull(builder.apiKey, "api_key");
		this.expiration = builder.expiration;
		this.id = Objects.requireNonNull(builder.id, "id");
		this.name = Objects.requireNonNull(builder.name, "name");

	}

	/**
	 * API name: {@code api_key}
	 */
	public String apiKey() {
		return this.apiKey;
	}

	/**
	 * API name: {@code expiration}
	 */
	@Nullable
	public Number expiration() {
		return this.expiration;
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
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("api_key");
		generator.write(this.apiKey);

		if (this.expiration != null) {

			generator.writeKey("expiration");
			generator.write(this.expiration.doubleValue());

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
	public static class Builder implements ObjectBuilder<CreateApiKeyResponse> {
		private String apiKey;

		@Nullable
		private Number expiration;

		private String id;

		private String name;

		/**
		 * API name: {@code api_key}
		 */
		public Builder apiKey(String value) {
			this.apiKey = value;
			return this;
		}

		/**
		 * API name: {@code expiration}
		 */
		public Builder expiration(@Nullable Number value) {
			this.expiration = value;
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
		 * Builds a {@link CreateApiKeyResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CreateApiKeyResponse build() {

			return new CreateApiKeyResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for CreateApiKeyResponse
	 */
	public static final JsonpValueParser<CreateApiKeyResponse> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, CreateApiKeyResponse::setupCreateApiKeyResponseParser);

	protected static void setupCreateApiKeyResponseParser(DelegatingJsonpValueParser<CreateApiKeyResponse.Builder> op) {

		op.add(Builder::apiKey, JsonpValueParser.stringParser(), "api_key");
		op.add(Builder::expiration, JsonpValueParser.numberParser(), "expiration");
		op.add(Builder::id, JsonpValueParser.stringParser(), "id");
		op.add(Builder::name, JsonpValueParser.stringParser(), "name");

	}

}
