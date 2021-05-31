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

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

// typedef: security.invalidate_api_key.Request
public final class InvalidateApiKeyRequest extends RequestBase implements ToJsonp {
	@Nullable
	private final String id;

	@Nullable
	private final List<String> ids;

	@Nullable
	private final String name;

	@Nullable
	private final Boolean owner;

	@Nullable
	private final String realmName;

	@Nullable
	private final String username;

	// ---------------------------------------------------------------------------------------------

	protected InvalidateApiKeyRequest(Builder builder) {

		this.id = builder.id;
		this.ids = builder.ids;
		this.name = builder.name;
		this.owner = builder.owner;
		this.realmName = builder.realmName;
		this.username = builder.username;

	}

	/**
	 * API name: {@code id}
	 */
	@Nullable
	public String id() {
		return this.id;
	}

	/**
	 * API name: {@code ids}
	 */
	@Nullable
	public List<String> ids() {
		return this.ids;
	}

	/**
	 * API name: {@code name}
	 */
	@Nullable
	public String name() {
		return this.name;
	}

	/**
	 * API name: {@code owner}
	 */
	@Nullable
	public Boolean owner() {
		return this.owner;
	}

	/**
	 * API name: {@code realm_name}
	 */
	@Nullable
	public String realmName() {
		return this.realmName;
	}

	/**
	 * API name: {@code username}
	 */
	@Nullable
	public String username() {
		return this.username;
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

		if (this.id != null) {

			generator.writeKey("id");
			generator.write(this.id);

		}
		if (this.ids != null) {

			generator.writeKey("ids");
			generator.writeStartArray();
			for (String item0 : this.ids) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.name != null) {

			generator.writeKey("name");
			generator.write(this.name);

		}
		if (this.owner != null) {

			generator.writeKey("owner");
			generator.write(this.owner);

		}
		if (this.realmName != null) {

			generator.writeKey("realm_name");
			generator.write(this.realmName);

		}
		if (this.username != null) {

			generator.writeKey("username");
			generator.write(this.username);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link InvalidateApiKeyRequest}.
	 */
	public static class Builder implements ObjectBuilder<InvalidateApiKeyRequest> {
		@Nullable
		private String id;

		@Nullable
		private List<String> ids;

		@Nullable
		private String name;

		@Nullable
		private Boolean owner;

		@Nullable
		private String realmName;

		@Nullable
		private String username;

		/**
		 * API name: {@code id}
		 */
		public Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code ids}
		 */
		public Builder ids(@Nullable List<String> value) {
			this.ids = value;
			return this;
		}

		/**
		 * API name: {@code ids}
		 */
		public Builder ids(String... value) {
			this.ids = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #ids(List)}, creating the list if needed.
		 */
		public Builder addIds(String value) {
			if (this.ids == null) {
				this.ids = new ArrayList<>();
			}
			this.ids.add(value);
			return this;
		}

		/**
		 * API name: {@code name}
		 */
		public Builder name(@Nullable String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code owner}
		 */
		public Builder owner(@Nullable Boolean value) {
			this.owner = value;
			return this;
		}

		/**
		 * API name: {@code realm_name}
		 */
		public Builder realmName(@Nullable String value) {
			this.realmName = value;
			return this;
		}

		/**
		 * API name: {@code username}
		 */
		public Builder username(@Nullable String value) {
			this.username = value;
			return this;
		}

		/**
		 * Builds a {@link InvalidateApiKeyRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public InvalidateApiKeyRequest build() {

			return new InvalidateApiKeyRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for InvalidateApiKeyRequest
	 */
	public static final JsonpValueParser<InvalidateApiKeyRequest> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, InvalidateApiKeyRequest::setupInvalidateApiKeyRequestParser);

	protected static void setupInvalidateApiKeyRequestParser(
			DelegatingJsonpValueParser<InvalidateApiKeyRequest.Builder> op) {

		op.add(Builder::id, JsonpValueParser.stringParser(), "id");
		op.add(Builder::ids, JsonpValueParser.arrayParser(JsonpValueParser.stringParser()), "ids");
		op.add(Builder::name, JsonpValueParser.stringParser(), "name");
		op.add(Builder::owner, JsonpValueParser.booleanParser(), "owner");
		op.add(Builder::realmName, JsonpValueParser.stringParser(), "realm_name");
		op.add(Builder::username, JsonpValueParser.stringParser(), "username");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.invalidate_api_key}".
	 */
	public static final Endpoint<InvalidateApiKeyRequest, InvalidateApiKeyResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> "DELETE",

			// Request path
			request -> {
				StringBuilder buf = new StringBuilder();
				buf.append("/_security");
				buf.append("/api_key");
				return buf.toString();

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, Endpoint.Simple.emptyMap(), true, InvalidateApiKeyResponse.JSONP_PARSER);
}
