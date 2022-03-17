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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.invalidate_api_key.Request

/**
 * Invalidates one or more API keys.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#security.invalidate_api_key.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class InvalidateApiKeyRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final String id;

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

	private InvalidateApiKeyRequest(Builder builder) {

		this.id = builder.id;
		this.ids = ApiTypeHelper.unmodifiable(builder.ids);
		this.name = builder.name;
		this.owner = builder.owner;
		this.realmName = builder.realmName;
		this.username = builder.username;

	}

	public static InvalidateApiKeyRequest of(Function<Builder, ObjectBuilder<InvalidateApiKeyRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code id}
	 */
	@Nullable
	public final String id() {
		return this.id;
	}

	/**
	 * API name: {@code ids}
	 */
	public final List<String> ids() {
		return this.ids;
	}

	/**
	 * API name: {@code name}
	 */
	@Nullable
	public final String name() {
		return this.name;
	}

	/**
	 * API name: {@code owner}
	 */
	@Nullable
	public final Boolean owner() {
		return this.owner;
	}

	/**
	 * API name: {@code realm_name}
	 */
	@Nullable
	public final String realmName() {
		return this.realmName;
	}

	/**
	 * API name: {@code username}
	 */
	@Nullable
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

		if (this.id != null) {
			generator.writeKey("id");
			generator.write(this.id);

		}
		if (ApiTypeHelper.isDefined(this.ids)) {
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

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<InvalidateApiKeyRequest> {
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
		public final Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code ids}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>ids</code>.
		 */
		public final Builder ids(List<String> list) {
			this.ids = _listAddAll(this.ids, list);
			return this;
		}

		/**
		 * API name: {@code ids}
		 * <p>
		 * Adds one or more values to <code>ids</code>.
		 */
		public final Builder ids(String value, String... values) {
			this.ids = _listAdd(this.ids, value, values);
			return this;
		}

		/**
		 * API name: {@code name}
		 */
		public final Builder name(@Nullable String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code owner}
		 */
		public final Builder owner(@Nullable Boolean value) {
			this.owner = value;
			return this;
		}

		/**
		 * API name: {@code realm_name}
		 */
		public final Builder realmName(@Nullable String value) {
			this.realmName = value;
			return this;
		}

		/**
		 * API name: {@code username}
		 */
		public final Builder username(@Nullable String value) {
			this.username = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link InvalidateApiKeyRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public InvalidateApiKeyRequest build() {
			_checkSingleUse();

			return new InvalidateApiKeyRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link InvalidateApiKeyRequest}
	 */
	public static final JsonpDeserializer<InvalidateApiKeyRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, InvalidateApiKeyRequest::setupInvalidateApiKeyRequestDeserializer);

	protected static void setupInvalidateApiKeyRequestDeserializer(
			ObjectDeserializer<InvalidateApiKeyRequest.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::ids, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "ids");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::owner, JsonpDeserializer.booleanDeserializer(), "owner");
		op.add(Builder::realmName, JsonpDeserializer.stringDeserializer(), "realm_name");
		op.add(Builder::username, JsonpDeserializer.stringDeserializer(), "username");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.invalidate_api_key}".
	 */
	public static final Endpoint<InvalidateApiKeyRequest, InvalidateApiKeyResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/security.invalidate_api_key",

			// Request method
			request -> {
				return "DELETE";

			},

			// Request path
			request -> {
				return "/_security/api_key";

			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, InvalidateApiKeyResponse._DESERIALIZER);
}
