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

package co.elastic.clients.elasticsearch.security;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonData;
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
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
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

// typedef: security.update_api_key.Request

/**
 * Update an API key.
 * <p>
 * Update attributes of an existing API key. This API supports updates to an API
 * key's access scope, expiration, and metadata.
 * <p>
 * To use this API, you must have at least the <code>manage_own_api_key</code>
 * cluster privilege. Users can only update API keys that they created or that
 * were granted to them. To update another user’s API key, use the
 * <code>run_as</code> feature to submit a request on behalf of another user.
 * <p>
 * IMPORTANT: It's not possible to use an API key as the authentication
 * credential for this API. The owner user’s credentials are required.
 * <p>
 * Use this API to update API keys created by the create API key or grant API
 * Key APIs. If you need to apply the same update to many API keys, you can use
 * the bulk update API keys API to reduce overhead. It's not possible to update
 * expired API keys or API keys that have been invalidated by the invalidate API
 * key API.
 * <p>
 * The access scope of an API key is derived from the
 * <code>role_descriptors</code> you specify in the request and a snapshot of
 * the owner user's permissions at the time of the request. The snapshot of the
 * owner's permissions is updated automatically on every call.
 * <p>
 * IMPORTANT: If you don't specify <code>role_descriptors</code> in the request,
 * a call to this API might still change the API key's access scope. This change
 * can occur if the owner user's permissions have changed since the API key was
 * created or last modified.
 * 
 * @see <a href="../doc-files/api-spec.html#security.update_api_key.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class UpdateApiKeyRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Time expiration;

	private final String id;

	private final Map<String, JsonData> metadata;

	private final Map<String, RoleDescriptor> roleDescriptors;

	// ---------------------------------------------------------------------------------------------

	private UpdateApiKeyRequest(Builder builder) {

		this.expiration = builder.expiration;
		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.metadata = ApiTypeHelper.unmodifiable(builder.metadata);
		this.roleDescriptors = ApiTypeHelper.unmodifiable(builder.roleDescriptors);

	}

	public static UpdateApiKeyRequest of(Function<Builder, ObjectBuilder<UpdateApiKeyRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The expiration time for the API key. By default, API keys never expire. This
	 * property can be omitted to leave the expiration unchanged.
	 * <p>
	 * API name: {@code expiration}
	 */
	@Nullable
	public final Time expiration() {
		return this.expiration;
	}

	/**
	 * Required - The ID of the API key to update.
	 * <p>
	 * API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Arbitrary metadata that you want to associate with the API key. It supports a
	 * nested data structure. Within the metadata object, keys beginning with
	 * <code>_</code> are reserved for system usage. When specified, this value
	 * fully replaces the metadata previously associated with the API key.
	 * <p>
	 * API name: {@code metadata}
	 */
	public final Map<String, JsonData> metadata() {
		return this.metadata;
	}

	/**
	 * The role descriptors to assign to this API key. The API key's effective
	 * permissions are an intersection of its assigned privileges and the point in
	 * time snapshot of permissions of the owner user. You can assign new privileges
	 * by specifying them in this parameter. To remove assigned privileges, you can
	 * supply an empty <code>role_descriptors</code> parameter, that is to say, an
	 * empty object <code>{}</code>. If an API key has no assigned privileges, it
	 * inherits the owner user's full permissions. The snapshot of the owner's
	 * permissions is always updated, whether you supply the
	 * <code>role_descriptors</code> parameter or not. The structure of a role
	 * descriptor is the same as the request for the create API keys API.
	 * <p>
	 * API name: {@code role_descriptors}
	 */
	public final Map<String, RoleDescriptor> roleDescriptors() {
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
			this.expiration.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.metadata)) {
			generator.writeKey("metadata");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.metadata.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.roleDescriptors)) {
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
	 * Builder for {@link UpdateApiKeyRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<UpdateApiKeyRequest> {
		@Nullable
		private Time expiration;

		private String id;

		@Nullable
		private Map<String, JsonData> metadata;

		@Nullable
		private Map<String, RoleDescriptor> roleDescriptors;

		/**
		 * The expiration time for the API key. By default, API keys never expire. This
		 * property can be omitted to leave the expiration unchanged.
		 * <p>
		 * API name: {@code expiration}
		 */
		public final Builder expiration(@Nullable Time value) {
			this.expiration = value;
			return this;
		}

		/**
		 * The expiration time for the API key. By default, API keys never expire. This
		 * property can be omitted to leave the expiration unchanged.
		 * <p>
		 * API name: {@code expiration}
		 */
		public final Builder expiration(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.expiration(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - The ID of the API key to update.
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Arbitrary metadata that you want to associate with the API key. It supports a
		 * nested data structure. Within the metadata object, keys beginning with
		 * <code>_</code> are reserved for system usage. When specified, this value
		 * fully replaces the metadata previously associated with the API key.
		 * <p>
		 * API name: {@code metadata}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>metadata</code>.
		 */
		public final Builder metadata(Map<String, JsonData> map) {
			this.metadata = _mapPutAll(this.metadata, map);
			return this;
		}

		/**
		 * Arbitrary metadata that you want to associate with the API key. It supports a
		 * nested data structure. Within the metadata object, keys beginning with
		 * <code>_</code> are reserved for system usage. When specified, this value
		 * fully replaces the metadata previously associated with the API key.
		 * <p>
		 * API name: {@code metadata}
		 * <p>
		 * Adds an entry to <code>metadata</code>.
		 */
		public final Builder metadata(String key, JsonData value) {
			this.metadata = _mapPut(this.metadata, key, value);
			return this;
		}

		/**
		 * The role descriptors to assign to this API key. The API key's effective
		 * permissions are an intersection of its assigned privileges and the point in
		 * time snapshot of permissions of the owner user. You can assign new privileges
		 * by specifying them in this parameter. To remove assigned privileges, you can
		 * supply an empty <code>role_descriptors</code> parameter, that is to say, an
		 * empty object <code>{}</code>. If an API key has no assigned privileges, it
		 * inherits the owner user's full permissions. The snapshot of the owner's
		 * permissions is always updated, whether you supply the
		 * <code>role_descriptors</code> parameter or not. The structure of a role
		 * descriptor is the same as the request for the create API keys API.
		 * <p>
		 * API name: {@code role_descriptors}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>roleDescriptors</code>.
		 */
		public final Builder roleDescriptors(Map<String, RoleDescriptor> map) {
			this.roleDescriptors = _mapPutAll(this.roleDescriptors, map);
			return this;
		}

		/**
		 * The role descriptors to assign to this API key. The API key's effective
		 * permissions are an intersection of its assigned privileges and the point in
		 * time snapshot of permissions of the owner user. You can assign new privileges
		 * by specifying them in this parameter. To remove assigned privileges, you can
		 * supply an empty <code>role_descriptors</code> parameter, that is to say, an
		 * empty object <code>{}</code>. If an API key has no assigned privileges, it
		 * inherits the owner user's full permissions. The snapshot of the owner's
		 * permissions is always updated, whether you supply the
		 * <code>role_descriptors</code> parameter or not. The structure of a role
		 * descriptor is the same as the request for the create API keys API.
		 * <p>
		 * API name: {@code role_descriptors}
		 * <p>
		 * Adds an entry to <code>roleDescriptors</code>.
		 */
		public final Builder roleDescriptors(String key, RoleDescriptor value) {
			this.roleDescriptors = _mapPut(this.roleDescriptors, key, value);
			return this;
		}

		/**
		 * The role descriptors to assign to this API key. The API key's effective
		 * permissions are an intersection of its assigned privileges and the point in
		 * time snapshot of permissions of the owner user. You can assign new privileges
		 * by specifying them in this parameter. To remove assigned privileges, you can
		 * supply an empty <code>role_descriptors</code> parameter, that is to say, an
		 * empty object <code>{}</code>. If an API key has no assigned privileges, it
		 * inherits the owner user's full permissions. The snapshot of the owner's
		 * permissions is always updated, whether you supply the
		 * <code>role_descriptors</code> parameter or not. The structure of a role
		 * descriptor is the same as the request for the create API keys API.
		 * <p>
		 * API name: {@code role_descriptors}
		 * <p>
		 * Adds an entry to <code>roleDescriptors</code> using a builder lambda.
		 */
		public final Builder roleDescriptors(String key,
				Function<RoleDescriptor.Builder, ObjectBuilder<RoleDescriptor>> fn) {
			return roleDescriptors(key, fn.apply(new RoleDescriptor.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link UpdateApiKeyRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UpdateApiKeyRequest build() {
			_checkSingleUse();

			return new UpdateApiKeyRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link UpdateApiKeyRequest}
	 */
	public static final JsonpDeserializer<UpdateApiKeyRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, UpdateApiKeyRequest::setupUpdateApiKeyRequestDeserializer);

	protected static void setupUpdateApiKeyRequestDeserializer(ObjectDeserializer<UpdateApiKeyRequest.Builder> op) {

		op.add(Builder::expiration, Time._DESERIALIZER, "expiration");
		op.add(Builder::metadata, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "metadata");
		op.add(Builder::roleDescriptors, JsonpDeserializer.stringMapDeserializer(RoleDescriptor._DESERIALIZER),
				"role_descriptors");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.update_api_key}".
	 */
	public static final Endpoint<UpdateApiKeyRequest, UpdateApiKeyResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/security.update_api_key",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _id = 1 << 0;

				int propsSet = 0;

				propsSet |= _id;

				if (propsSet == (_id)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_security");
					buf.append("/api_key");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.id, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _id = 1 << 0;

				int propsSet = 0;

				propsSet |= _id;

				if (propsSet == (_id)) {
					params.put("id", request.id);
				}
				return params;
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, UpdateApiKeyResponse._DESERIALIZER);
}
