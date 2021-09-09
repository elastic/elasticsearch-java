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
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

// typedef: security.change_password.Request
public final class ChangePasswordRequest extends RequestBase implements ToJsonp {
	@Nullable
	private final String username;

	@Nullable
	private final JsonValue refresh;

	@Nullable
	private final String password;

	// ---------------------------------------------------------------------------------------------

	protected ChangePasswordRequest(Builder builder) {

		this.username = builder.username;
		this.refresh = builder.refresh;
		this.password = builder.password;

	}

	/**
	 * The username of the user to change the password for
	 * <p>
	 * API name: {@code username}
	 */
	@Nullable
	public String username() {
		return this.username;
	}

	/**
	 * If <code>true</code> (the default) then refresh the affected shards to make
	 * this operation visible to search, if <code>wait_for</code> then wait for a
	 * refresh to make this operation visible to search, if <code>false</code> then
	 * do nothing with refreshes.
	 * <p>
	 * API name: {@code refresh}
	 */
	@Nullable
	public JsonValue refresh() {
		return this.refresh;
	}

	/**
	 * API name: {@code password}
	 */
	@Nullable
	public String password() {
		return this.password;
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

		if (this.password != null) {

			generator.writeKey("password");
			generator.write(this.password);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ChangePasswordRequest}.
	 */
	public static class Builder implements ObjectBuilder<ChangePasswordRequest> {
		@Nullable
		private String username;

		@Nullable
		private JsonValue refresh;

		@Nullable
		private String password;

		/**
		 * The username of the user to change the password for
		 * <p>
		 * API name: {@code username}
		 */
		public Builder username(@Nullable String value) {
			this.username = value;
			return this;
		}

		/**
		 * If <code>true</code> (the default) then refresh the affected shards to make
		 * this operation visible to search, if <code>wait_for</code> then wait for a
		 * refresh to make this operation visible to search, if <code>false</code> then
		 * do nothing with refreshes.
		 * <p>
		 * API name: {@code refresh}
		 */
		public Builder refresh(@Nullable JsonValue value) {
			this.refresh = value;
			return this;
		}

		/**
		 * API name: {@code password}
		 */
		public Builder password(@Nullable String value) {
			this.password = value;
			return this;
		}

		/**
		 * Builds a {@link ChangePasswordRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ChangePasswordRequest build() {

			return new ChangePasswordRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ChangePasswordRequest
	 */
	public static final JsonpDeserializer<ChangePasswordRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ChangePasswordRequest::setupChangePasswordRequestDeserializer);

	protected static void setupChangePasswordRequestDeserializer(
			DelegatingDeserializer<ChangePasswordRequest.Builder> op) {

		op.add(Builder::password, JsonpDeserializer.stringDeserializer(), "password");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.change_password}".
	 */
	public static final Endpoint<ChangePasswordRequest, ChangePasswordResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _username = 1 << 0;

				int propsSet = 0;

				if (request.username() != null)
					propsSet |= _username;

				if (propsSet == (_username)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/user");
					buf.append("/");
					buf.append(request.username);
					buf.append("/_password");
					return buf.toString();
				}
				if (propsSet == 0) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/user");
					buf.append("/_password");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.refresh != null) {
					params.put("refresh", request.refresh.toString());
				}
				return params;

			}, Endpoint.Simple.emptyMap(), true, ChangePasswordResponse.DESERIALIZER);
}
