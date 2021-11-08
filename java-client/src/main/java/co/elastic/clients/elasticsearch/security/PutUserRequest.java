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

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.SimpleEndpoint;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.put_user.Request
@JsonpDeserializable
public class PutUserRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final String email;

	@Nullable
	private final Boolean enabled;

	@Nullable
	private final String fullName;

	private final Map<String, JsonData> metadata;

	@Nullable
	private final String password;

	@Nullable
	private final String passwordHash;

	@Nullable
	private final JsonValue /* _types.Refresh */ refresh;

	private final List<String> roles;

	private final String username;

	// ---------------------------------------------------------------------------------------------

	private PutUserRequest(Builder builder) {

		this.email = builder.email;
		this.enabled = builder.enabled;
		this.fullName = builder.fullName;
		this.metadata = ModelTypeHelper.unmodifiable(builder.metadata);
		this.password = builder.password;
		this.passwordHash = builder.passwordHash;
		this.refresh = builder.refresh;
		this.roles = ModelTypeHelper.unmodifiable(builder.roles);
		this.username = ModelTypeHelper.requireNonNull(builder.username, this, "username");

	}

	public static PutUserRequest of(Function<Builder, ObjectBuilder<PutUserRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code email}
	 */
	@Nullable
	public final String email() {
		return this.email;
	}

	/**
	 * API name: {@code enabled}
	 */
	@Nullable
	public final Boolean enabled() {
		return this.enabled;
	}

	/**
	 * API name: {@code full_name}
	 */
	@Nullable
	public final String fullName() {
		return this.fullName;
	}

	/**
	 * API name: {@code metadata}
	 */
	public final Map<String, JsonData> metadata() {
		return this.metadata;
	}

	/**
	 * API name: {@code password}
	 */
	@Nullable
	public final String password() {
		return this.password;
	}

	/**
	 * API name: {@code password_hash}
	 */
	@Nullable
	public final String passwordHash() {
		return this.passwordHash;
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
	public final JsonValue /* _types.Refresh */ refresh() {
		return this.refresh;
	}

	/**
	 * API name: {@code roles}
	 */
	public final List<String> roles() {
		return this.roles;
	}

	/**
	 * Required - The username of the User
	 * <p>
	 * API name: {@code username}
	 */
	public final String username() {
		return this.username;
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

		if (this.email != null) {
			generator.writeKey("email");
			generator.write(this.email);

		}
		if (this.enabled != null) {
			generator.writeKey("enabled");
			generator.write(this.enabled);

		}
		if (this.fullName != null) {
			generator.writeKey("full_name");
			generator.write(this.fullName);

		}
		if (ModelTypeHelper.isDefined(this.metadata)) {
			generator.writeKey("metadata");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.metadata.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.password != null) {
			generator.writeKey("password");
			generator.write(this.password);

		}
		if (this.passwordHash != null) {
			generator.writeKey("password_hash");
			generator.write(this.passwordHash);

		}
		if (ModelTypeHelper.isDefined(this.roles)) {
			generator.writeKey("roles");
			generator.writeStartArray();
			for (String item0 : this.roles) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutUserRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<PutUserRequest> {
		@Nullable
		private String email;

		@Nullable
		private Boolean enabled;

		@Nullable
		private String fullName;

		@Nullable
		private Map<String, JsonData> metadata;

		@Nullable
		private String password;

		@Nullable
		private String passwordHash;

		@Nullable
		private JsonValue /* _types.Refresh */ refresh;

		@Nullable
		private List<String> roles;

		private String username;

		/**
		 * API name: {@code email}
		 */
		public final Builder email(@Nullable String value) {
			this.email = value;
			return this;
		}

		/**
		 * API name: {@code enabled}
		 */
		public final Builder enabled(@Nullable Boolean value) {
			this.enabled = value;
			return this;
		}

		/**
		 * API name: {@code full_name}
		 */
		public final Builder fullName(@Nullable String value) {
			this.fullName = value;
			return this;
		}

		/**
		 * API name: {@code metadata}
		 */
		public final Builder metadata(@Nullable Map<String, JsonData> value) {
			this.metadata = value;
			return this;
		}

		/**
		 * API name: {@code password}
		 */
		public final Builder password(@Nullable String value) {
			this.password = value;
			return this;
		}

		/**
		 * API name: {@code password_hash}
		 */
		public final Builder passwordHash(@Nullable String value) {
			this.passwordHash = value;
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
		public final Builder refresh(@Nullable JsonValue /* _types.Refresh */ value) {
			this.refresh = value;
			return this;
		}

		/**
		 * API name: {@code roles}
		 */
		public final Builder roles(@Nullable List<String> value) {
			this.roles = value;
			return this;
		}

		/**
		 * API name: {@code roles}
		 */
		public final Builder roles(String... value) {
			this.roles = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - The username of the User
		 * <p>
		 * API name: {@code username}
		 */
		public final Builder username(String value) {
			this.username = value;
			return this;
		}

		/**
		 * Builds a {@link PutUserRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutUserRequest build() {
			_checkSingleUse();

			return new PutUserRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutUserRequest}
	 */
	public static final JsonpDeserializer<PutUserRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PutUserRequest::setupPutUserRequestDeserializer, Builder::build);

	protected static void setupPutUserRequestDeserializer(DelegatingDeserializer<PutUserRequest.Builder> op) {

		op.add(Builder::email, JsonpDeserializer.stringDeserializer(), "email");
		op.add(Builder::enabled, JsonpDeserializer.booleanDeserializer(), "enabled");
		op.add(Builder::fullName, JsonpDeserializer.stringDeserializer(), "full_name");
		op.add(Builder::metadata, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "metadata");
		op.add(Builder::password, JsonpDeserializer.stringDeserializer(), "password");
		op.add(Builder::passwordHash, JsonpDeserializer.stringDeserializer(), "password_hash");
		op.add(Builder::roles, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "roles");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.put_user}".
	 */
	public static final Endpoint<PutUserRequest, PutUserResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _username = 1 << 0;

				int propsSet = 0;

				propsSet |= _username;

				if (propsSet == (_username)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/user");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.username, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.refresh != null) {
					params.put("refresh", JsonpUtils.toString(request.refresh));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, PutUserResponse._DESERIALIZER);
}
