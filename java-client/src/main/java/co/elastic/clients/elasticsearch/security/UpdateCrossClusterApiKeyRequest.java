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

// typedef: security.update_cross_cluster_api_key.Request

/**
 * Update a cross-cluster API key.
 * <p>
 * Update the attributes of an existing cross-cluster API key, which is used for
 * API key based remote cluster access.
 * <p>
 * To use this API, you must have at least the <code>manage_security</code>
 * cluster privilege. Users can only update API keys that they created. To
 * update another user's API key, use the <code>run_as</code> feature to submit
 * a request on behalf of another user.
 * <p>
 * IMPORTANT: It's not possible to use an API key as the authentication
 * credential for this API. To update an API key, the owner user's credentials
 * are required.
 * <p>
 * It's not possible to update expired API keys, or API keys that have been
 * invalidated by the invalidate API key API.
 * <p>
 * This API supports updates to an API key's access scope, metadata, and
 * expiration. The owner user's information, such as the <code>username</code>
 * and <code>realm</code>, is also updated automatically on every call.
 * <p>
 * NOTE: This API cannot update REST API keys, which should be updated by either
 * the update API key or bulk update API keys API.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#security.update_cross_cluster_api_key.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class UpdateCrossClusterApiKeyRequest extends RequestBase implements JsonpSerializable {
	private final Access access;

	@Nullable
	private final Time expiration;

	private final String id;

	private final Map<String, JsonData> metadata;

	// ---------------------------------------------------------------------------------------------

	private UpdateCrossClusterApiKeyRequest(Builder builder) {

		this.access = ApiTypeHelper.requireNonNullWithDefault(builder.access, this, "access", this.access());
		this.expiration = builder.expiration;
		this.id = ApiTypeHelper.requireNonNullWithDefault(builder.id, this, "id", this.id());
		this.metadata = ApiTypeHelper.unmodifiable(builder.metadata);

	}

	public static UpdateCrossClusterApiKeyRequest of(
			Function<Builder, ObjectBuilder<UpdateCrossClusterApiKeyRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The access to be granted to this API key. The access is composed
	 * of permissions for cross cluster search and cross cluster replication. At
	 * least one of them must be specified. When specified, the new access
	 * assignment fully replaces the previously assigned access.
	 * <p>
	 * API name: {@code access}
	 */
	public final Access access() {
		return this.access;
	}

	/**
	 * The expiration time for the API key. By default, API keys never expire. This
	 * property can be omitted to leave the value unchanged.
	 * <p>
	 * API name: {@code expiration}
	 */
	@Nullable
	public final Time expiration() {
		return this.expiration;
	}

	/**
	 * Required - The ID of the cross-cluster API key to update.
	 * <p>
	 * API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Arbitrary metadata that you want to associate with the API key. It supports
	 * nested data structure. Within the metadata object, keys beginning with
	 * <code>_</code> are reserved for system usage. When specified, this
	 * information fully replaces metadata previously associated with the API key.
	 * <p>
	 * API name: {@code metadata}
	 */
	public final Map<String, JsonData> metadata() {
		return this.metadata;
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

		generator.writeKey("access");
		this.access.serialize(generator, mapper);

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

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UpdateCrossClusterApiKeyRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<UpdateCrossClusterApiKeyRequest> {
		private Access access;

		@Nullable
		private Time expiration;

		private String id;

		@Nullable
		private Map<String, JsonData> metadata;

		/**
		 * Required - The access to be granted to this API key. The access is composed
		 * of permissions for cross cluster search and cross cluster replication. At
		 * least one of them must be specified. When specified, the new access
		 * assignment fully replaces the previously assigned access.
		 * <p>
		 * API name: {@code access}
		 */
		public final Builder access(Access value) {
			this.access = value;
			return this;
		}

		/**
		 * Required - The access to be granted to this API key. The access is composed
		 * of permissions for cross cluster search and cross cluster replication. At
		 * least one of them must be specified. When specified, the new access
		 * assignment fully replaces the previously assigned access.
		 * <p>
		 * API name: {@code access}
		 */
		public final Builder access(Function<Access.Builder, ObjectBuilder<Access>> fn) {
			return this.access(fn.apply(new Access.Builder()).build());
		}

		/**
		 * The expiration time for the API key. By default, API keys never expire. This
		 * property can be omitted to leave the value unchanged.
		 * <p>
		 * API name: {@code expiration}
		 */
		public final Builder expiration(@Nullable Time value) {
			this.expiration = value;
			return this;
		}

		/**
		 * The expiration time for the API key. By default, API keys never expire. This
		 * property can be omitted to leave the value unchanged.
		 * <p>
		 * API name: {@code expiration}
		 */
		public final Builder expiration(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.expiration(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - The ID of the cross-cluster API key to update.
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Arbitrary metadata that you want to associate with the API key. It supports
		 * nested data structure. Within the metadata object, keys beginning with
		 * <code>_</code> are reserved for system usage. When specified, this
		 * information fully replaces metadata previously associated with the API key.
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
		 * nested data structure. Within the metadata object, keys beginning with
		 * <code>_</code> are reserved for system usage. When specified, this
		 * information fully replaces metadata previously associated with the API key.
		 * <p>
		 * API name: {@code metadata}
		 * <p>
		 * Adds an entry to <code>metadata</code>.
		 */
		public final Builder metadata(String key, JsonData value) {
			this.metadata = _mapPut(this.metadata, key, value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link UpdateCrossClusterApiKeyRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UpdateCrossClusterApiKeyRequest build() {
			_checkSingleUse();

			return new UpdateCrossClusterApiKeyRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link UpdateCrossClusterApiKeyRequest}
	 */
	public static final JsonpDeserializer<UpdateCrossClusterApiKeyRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, UpdateCrossClusterApiKeyRequest::setupUpdateCrossClusterApiKeyRequestDeserializer);

	protected static void setupUpdateCrossClusterApiKeyRequestDeserializer(
			ObjectDeserializer<UpdateCrossClusterApiKeyRequest.Builder> op) {

		op.add(Builder::access, Access._DESERIALIZER, "access");
		op.add(Builder::expiration, Time._DESERIALIZER, "expiration");
		op.add(Builder::metadata, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "metadata");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.update_cross_cluster_api_key}".
	 */
	public static final Endpoint<UpdateCrossClusterApiKeyRequest, UpdateCrossClusterApiKeyResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/security.update_cross_cluster_api_key",

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
					buf.append("/cross_cluster");
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

			}, SimpleEndpoint.emptyMap(), true, UpdateCrossClusterApiKeyResponse._DESERIALIZER);
}
