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
import co.elastic.clients.elasticsearch.security.create_api_key.RoleDescriptor;
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
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.create_api_key.Request
@JsonpDeserializable
public final class CreateApiKeyRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final String expiration;

	@Nullable
	private final Map<String, JsonData> metadata;

	@Nullable
	private final String name;

	@Nullable
	private final JsonValue /* _types.Refresh */ refresh;

	@Nullable
	private final Map<String, RoleDescriptor> roleDescriptors;

	// ---------------------------------------------------------------------------------------------

	public CreateApiKeyRequest(Builder builder) {

		this.expiration = builder.expiration;
		this.metadata = ModelTypeHelper.unmodifiable(builder.metadata);
		this.name = builder.name;
		this.refresh = builder.refresh;
		this.roleDescriptors = ModelTypeHelper.unmodifiable(builder.roleDescriptors);

	}

	public CreateApiKeyRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Expiration time for the API key. By default, API keys never expire.
	 * <p>
	 * API name: {@code expiration}
	 */
	@Nullable
	public String expiration() {
		return this.expiration;
	}

	/**
	 * Arbitrary metadata that you want to associate with the API key. It supports
	 * nested data structure. Within the metadata object, keys beginning with _ are
	 * reserved for system usage.
	 * <p>
	 * API name: {@code metadata}
	 */
	@Nullable
	public Map<String, JsonData> metadata() {
		return this.metadata;
	}

	/**
	 * Specifies the name for this API key.
	 * <p>
	 * API name: {@code name}
	 */
	@Nullable
	public String name() {
		return this.name;
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
	public JsonValue /* _types.Refresh */ refresh() {
		return this.refresh;
	}

	/**
	 * An array of role descriptors for this API key. This parameter is optional.
	 * When it is not specified or is an empty array, then the API key will have a
	 * point in time snapshot of permissions of the authenticated user. If you
	 * supply role descriptors then the resultant permissions would be an
	 * intersection of API keys permissions and authenticated user’s permissions
	 * thereby limiting the access scope for API keys. The structure of role
	 * descriptor is the same as the request for create role API. For more details,
	 * see create or update roles API.
	 * <p>
	 * API name: {@code role_descriptors}
	 */
	@Nullable
	public Map<String, RoleDescriptor> roleDescriptors() {
		return this.roleDescriptors;
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

		if (this.expiration != null) {

			generator.writeKey("expiration");
			generator.write(this.expiration);

		}
		if (this.metadata != null) {

			generator.writeKey("metadata");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.metadata.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.name != null) {

			generator.writeKey("name");
			generator.write(this.name);

		}
		if (this.roleDescriptors != null) {

			generator.writeKey("role_descriptors");
			generator.writeStartObject();
			for (Map.Entry<String, RoleDescriptor> item0 : this.roleDescriptors.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CreateApiKeyRequest}.
	 */
	public static class Builder implements ObjectBuilder<CreateApiKeyRequest> {
		@Nullable
		private String expiration;

		@Nullable
		private Map<String, JsonData> metadata;

		@Nullable
		private String name;

		@Nullable
		private JsonValue /* _types.Refresh */ refresh;

		@Nullable
		private Map<String, RoleDescriptor> roleDescriptors;

		/**
		 * Expiration time for the API key. By default, API keys never expire.
		 * <p>
		 * API name: {@code expiration}
		 */
		public Builder expiration(@Nullable String value) {
			this.expiration = value;
			return this;
		}

		/**
		 * Arbitrary metadata that you want to associate with the API key. It supports
		 * nested data structure. Within the metadata object, keys beginning with _ are
		 * reserved for system usage.
		 * <p>
		 * API name: {@code metadata}
		 */
		public Builder metadata(@Nullable Map<String, JsonData> value) {
			this.metadata = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #metadata(Map)}, creating the map if needed.
		 */
		public Builder putMetadata(String key, JsonData value) {
			if (this.metadata == null) {
				this.metadata = new HashMap<>();
			}
			this.metadata.put(key, value);
			return this;
		}

		/**
		 * Specifies the name for this API key.
		 * <p>
		 * API name: {@code name}
		 */
		public Builder name(@Nullable String value) {
			this.name = value;
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
		public Builder refresh(@Nullable JsonValue /* _types.Refresh */ value) {
			this.refresh = value;
			return this;
		}

		/**
		 * An array of role descriptors for this API key. This parameter is optional.
		 * When it is not specified or is an empty array, then the API key will have a
		 * point in time snapshot of permissions of the authenticated user. If you
		 * supply role descriptors then the resultant permissions would be an
		 * intersection of API keys permissions and authenticated user’s permissions
		 * thereby limiting the access scope for API keys. The structure of role
		 * descriptor is the same as the request for create role API. For more details,
		 * see create or update roles API.
		 * <p>
		 * API name: {@code role_descriptors}
		 */
		public Builder roleDescriptors(@Nullable Map<String, RoleDescriptor> value) {
			this.roleDescriptors = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #roleDescriptors(Map)}, creating the map if needed.
		 */
		public Builder putRoleDescriptors(String key, RoleDescriptor value) {
			if (this.roleDescriptors == null) {
				this.roleDescriptors = new HashMap<>();
			}
			this.roleDescriptors.put(key, value);
			return this;
		}

		/**
		 * Set {@link #roleDescriptors(Map)} to a singleton map.
		 */
		public Builder roleDescriptors(String key, Function<RoleDescriptor.Builder, ObjectBuilder<RoleDescriptor>> fn) {
			return this.roleDescriptors(Collections.singletonMap(key, fn.apply(new RoleDescriptor.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #roleDescriptors(Map)}, creating the map if needed.
		 */
		public Builder putRoleDescriptors(String key,
				Function<RoleDescriptor.Builder, ObjectBuilder<RoleDescriptor>> fn) {
			return this.putRoleDescriptors(key, fn.apply(new RoleDescriptor.Builder()).build());
		}

		/**
		 * Builds a {@link CreateApiKeyRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CreateApiKeyRequest build() {

			return new CreateApiKeyRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CreateApiKeyRequest}
	 */
	public static final JsonpDeserializer<CreateApiKeyRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CreateApiKeyRequest::setupCreateApiKeyRequestDeserializer, Builder::build);

	protected static void setupCreateApiKeyRequestDeserializer(DelegatingDeserializer<CreateApiKeyRequest.Builder> op) {

		op.add(Builder::expiration, JsonpDeserializer.stringDeserializer(), "expiration");
		op.add(Builder::metadata, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "metadata");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::roleDescriptors, JsonpDeserializer.stringMapDeserializer(RoleDescriptor._DESERIALIZER),
				"role_descriptors");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.create_api_key}".
	 */
	public static final Endpoint<CreateApiKeyRequest, CreateApiKeyResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				return "/_security/api_key";

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.refresh != null) {
					params.put("refresh", JsonpUtils.toString(request.refresh));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, CreateApiKeyResponse._DESERIALIZER);
}
