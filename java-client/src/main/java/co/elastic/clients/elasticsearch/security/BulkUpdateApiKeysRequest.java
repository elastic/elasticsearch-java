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
import java.util.List;
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

// typedef: security.bulk_update_api_keys.Request

/**
 * Bulk update API keys.
 * <p>
 * Update the attributes for multiple API keys.
 * <p>
 * IMPORTANT: It is not possible to use an API key as the authentication
 * credential for this API. To update API keys, the owner user's credentials are
 * required.
 * <p>
 * This API is similar to the update API key API but enables you to apply the
 * same update to multiple API keys in one API call. This operation can greatly
 * improve performance over making individual updates.
 * <p>
 * It is not possible to update expired or invalidated API keys.
 * <p>
 * This API supports updates to API key access scope, metadata and expiration.
 * The access scope of each API key is derived from the
 * <code>role_descriptors</code> you specify in the request and a snapshot of
 * the owner user's permissions at the time of the request. The snapshot of the
 * owner's permissions is updated automatically on every call.
 * <p>
 * IMPORTANT: If you don't specify <code>role_descriptors</code> in the request,
 * a call to this API might still change an API key's access scope. This change
 * can occur if the owner user's permissions have changed since the API key was
 * created or last modified.
 * <p>
 * A successful request returns a JSON structure that contains the IDs of all
 * updated API keys, the IDs of API keys that already had the requested changes
 * and did not require an update, and error details for any failed update.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#security.bulk_update_api_keys.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class BulkUpdateApiKeysRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Time expiration;

	private final List<String> ids;

	private final Map<String, JsonData> metadata;

	private final Map<String, RoleDescriptor> roleDescriptors;

	// ---------------------------------------------------------------------------------------------

	private BulkUpdateApiKeysRequest(Builder builder) {

		this.expiration = builder.expiration;
		this.ids = ApiTypeHelper.unmodifiableRequired(builder.ids, this, "ids");
		this.metadata = ApiTypeHelper.unmodifiable(builder.metadata);
		this.roleDescriptors = ApiTypeHelper.unmodifiable(builder.roleDescriptors);

	}

	public static BulkUpdateApiKeysRequest of(Function<Builder, ObjectBuilder<BulkUpdateApiKeysRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Expiration time for the API keys. By default, API keys never expire. This
	 * property can be omitted to leave the value unchanged.
	 * <p>
	 * API name: {@code expiration}
	 */
	@Nullable
	public final Time expiration() {
		return this.expiration;
	}

	/**
	 * Required - The API key identifiers.
	 * <p>
	 * API name: {@code ids}
	 */
	public final List<String> ids() {
		return this.ids;
	}

	/**
	 * Arbitrary nested metadata to associate with the API keys. Within the
	 * <code>metadata</code> object, top-level keys beginning with an underscore
	 * (<code>_</code>) are reserved for system usage. Any information specified
	 * with this parameter fully replaces metadata previously associated with the
	 * API key.
	 * <p>
	 * API name: {@code metadata}
	 */
	public final Map<String, JsonData> metadata() {
		return this.metadata;
	}

	/**
	 * The role descriptors to assign to the API keys. An API key's effective
	 * permissions are an intersection of its assigned privileges and the
	 * point-in-time snapshot of permissions of the owner user. You can assign new
	 * privileges by specifying them in this parameter. To remove assigned
	 * privileges, supply the <code>role_descriptors</code> parameter as an empty
	 * object <code>{}</code>. If an API key has no assigned privileges, it inherits
	 * the owner user's full permissions. The snapshot of the owner's permissions is
	 * always updated, whether you supply the <code>role_descriptors</code>
	 * parameter. The structure of a role descriptor is the same as the request for
	 * the create API keys API.
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
		if (ApiTypeHelper.isDefined(this.ids)) {
			generator.writeKey("ids");
			generator.writeStartArray();
			for (String item0 : this.ids) {
				generator.write(item0);

			}
			generator.writeEnd();

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
	 * Builder for {@link BulkUpdateApiKeysRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<BulkUpdateApiKeysRequest> {
		@Nullable
		private Time expiration;

		private List<String> ids;

		@Nullable
		private Map<String, JsonData> metadata;

		@Nullable
		private Map<String, RoleDescriptor> roleDescriptors;

		/**
		 * Expiration time for the API keys. By default, API keys never expire. This
		 * property can be omitted to leave the value unchanged.
		 * <p>
		 * API name: {@code expiration}
		 */
		public final Builder expiration(@Nullable Time value) {
			this.expiration = value;
			return this;
		}

		/**
		 * Expiration time for the API keys. By default, API keys never expire. This
		 * property can be omitted to leave the value unchanged.
		 * <p>
		 * API name: {@code expiration}
		 */
		public final Builder expiration(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.expiration(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - The API key identifiers.
		 * <p>
		 * API name: {@code ids}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>ids</code>.
		 */
		public final Builder ids(List<String> list) {
			this.ids = _listAddAll(this.ids, list);
			return this;
		}

		/**
		 * Required - The API key identifiers.
		 * <p>
		 * API name: {@code ids}
		 * <p>
		 * Adds one or more values to <code>ids</code>.
		 */
		public final Builder ids(String value, String... values) {
			this.ids = _listAdd(this.ids, value, values);
			return this;
		}

		/**
		 * Arbitrary nested metadata to associate with the API keys. Within the
		 * <code>metadata</code> object, top-level keys beginning with an underscore
		 * (<code>_</code>) are reserved for system usage. Any information specified
		 * with this parameter fully replaces metadata previously associated with the
		 * API key.
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
		 * Arbitrary nested metadata to associate with the API keys. Within the
		 * <code>metadata</code> object, top-level keys beginning with an underscore
		 * (<code>_</code>) are reserved for system usage. Any information specified
		 * with this parameter fully replaces metadata previously associated with the
		 * API key.
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
		 * The role descriptors to assign to the API keys. An API key's effective
		 * permissions are an intersection of its assigned privileges and the
		 * point-in-time snapshot of permissions of the owner user. You can assign new
		 * privileges by specifying them in this parameter. To remove assigned
		 * privileges, supply the <code>role_descriptors</code> parameter as an empty
		 * object <code>{}</code>. If an API key has no assigned privileges, it inherits
		 * the owner user's full permissions. The snapshot of the owner's permissions is
		 * always updated, whether you supply the <code>role_descriptors</code>
		 * parameter. The structure of a role descriptor is the same as the request for
		 * the create API keys API.
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
		 * The role descriptors to assign to the API keys. An API key's effective
		 * permissions are an intersection of its assigned privileges and the
		 * point-in-time snapshot of permissions of the owner user. You can assign new
		 * privileges by specifying them in this parameter. To remove assigned
		 * privileges, supply the <code>role_descriptors</code> parameter as an empty
		 * object <code>{}</code>. If an API key has no assigned privileges, it inherits
		 * the owner user's full permissions. The snapshot of the owner's permissions is
		 * always updated, whether you supply the <code>role_descriptors</code>
		 * parameter. The structure of a role descriptor is the same as the request for
		 * the create API keys API.
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
		 * The role descriptors to assign to the API keys. An API key's effective
		 * permissions are an intersection of its assigned privileges and the
		 * point-in-time snapshot of permissions of the owner user. You can assign new
		 * privileges by specifying them in this parameter. To remove assigned
		 * privileges, supply the <code>role_descriptors</code> parameter as an empty
		 * object <code>{}</code>. If an API key has no assigned privileges, it inherits
		 * the owner user's full permissions. The snapshot of the owner's permissions is
		 * always updated, whether you supply the <code>role_descriptors</code>
		 * parameter. The structure of a role descriptor is the same as the request for
		 * the create API keys API.
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
		 * Builds a {@link BulkUpdateApiKeysRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public BulkUpdateApiKeysRequest build() {
			_checkSingleUse();

			return new BulkUpdateApiKeysRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link BulkUpdateApiKeysRequest}
	 */
	public static final JsonpDeserializer<BulkUpdateApiKeysRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, BulkUpdateApiKeysRequest::setupBulkUpdateApiKeysRequestDeserializer);

	protected static void setupBulkUpdateApiKeysRequestDeserializer(
			ObjectDeserializer<BulkUpdateApiKeysRequest.Builder> op) {

		op.add(Builder::expiration, Time._DESERIALIZER, "expiration");
		op.add(Builder::ids, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "ids");
		op.add(Builder::metadata, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "metadata");
		op.add(Builder::roleDescriptors, JsonpDeserializer.stringMapDeserializer(RoleDescriptor._DESERIALIZER),
				"role_descriptors");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.bulk_update_api_keys}".
	 */
	public static final Endpoint<BulkUpdateApiKeysRequest, BulkUpdateApiKeysResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/security.bulk_update_api_keys",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_security/api_key/_bulk_update";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, BulkUpdateApiKeysResponse._DESERIALIZER);
}
