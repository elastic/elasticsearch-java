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

// typedef: security.update_api_key.Request

/**
 * Updates attributes of an existing API key. Users can only update API keys
 * that they created or that were granted to them. Use this API to update API
 * keys created by the create API Key or grant API Key APIs. If you need to
 * apply the same update to many API keys, you can use bulk update API Keys to
 * reduce overhead. It’s not possible to update expired API keys, or API keys
 * that have been invalidated by invalidate API Key. This API supports updates
 * to an API key’s access scope and metadata. The access scope of an API key is
 * derived from the <code>role_descriptors</code> you specify in the request,
 * and a snapshot of the owner user’s permissions at the time of the request.
 * The snapshot of the owner’s permissions is updated automatically on every
 * call. If you don’t specify <code>role_descriptors</code> in the request, a
 * call to this API might still change the API key’s access scope. This change
 * can occur if the owner user’s permissions have changed since the API key was
 * created or last modified. To update another user’s API key, use the
 * <code>run_as</code> feature to submit a request on behalf of another user.
 * IMPORTANT: It’s not possible to use an API key as the authentication
 * credential for this API. To update an API key, the owner user’s credentials
 * are required.
 * 
 * @see <a href="../doc-files/api-spec.html#security.update_api_key.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class UpdateApiKeyRequest extends RequestBase implements JsonpSerializable {
	private final String id;

	private final Map<String, JsonData> metadata;

	private final Map<String, RoleDescriptor> roleDescriptors;

	// ---------------------------------------------------------------------------------------------

	private UpdateApiKeyRequest(Builder builder) {

		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.metadata = ApiTypeHelper.unmodifiable(builder.metadata);
		this.roleDescriptors = ApiTypeHelper.unmodifiable(builder.roleDescriptors);

	}

	public static UpdateApiKeyRequest of(Function<Builder, ObjectBuilder<UpdateApiKeyRequest>> fn) {
		return fn.apply(new Builder()).build();
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
	 * Arbitrary metadata that you want to associate with the API key. It supports
	 * nested data structure. Within the metadata object, keys beginning with _ are
	 * reserved for system usage.
	 * <p>
	 * API name: {@code metadata}
	 */
	public final Map<String, JsonData> metadata() {
		return this.metadata;
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
		private String id;

		@Nullable
		private Map<String, JsonData> metadata;

		@Nullable
		private Map<String, RoleDescriptor> roleDescriptors;

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
		 * Arbitrary metadata that you want to associate with the API key. It supports
		 * nested data structure. Within the metadata object, keys beginning with _ are
		 * reserved for system usage.
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
		 * Arbitrary metadata that you want to associate with the API key. It supports
		 * nested data structure. Within the metadata object, keys beginning with _ are
		 * reserved for system usage.
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
		 * <p>
		 * Adds all entries of <code>map</code> to <code>roleDescriptors</code>.
		 */
		public final Builder roleDescriptors(Map<String, RoleDescriptor> map) {
			this.roleDescriptors = _mapPutAll(this.roleDescriptors, map);
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
		 * <p>
		 * Adds an entry to <code>roleDescriptors</code>.
		 */
		public final Builder roleDescriptors(String key, RoleDescriptor value) {
			this.roleDescriptors = _mapPut(this.roleDescriptors, key, value);
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
