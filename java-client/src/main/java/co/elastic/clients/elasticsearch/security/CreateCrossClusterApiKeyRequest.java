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

// typedef: security.create_cross_cluster_api_key.Request

/**
 * Create a cross-cluster API key.
 * <p>
 * Create an API key of the <code>cross_cluster</code> type for the API key
 * based remote cluster access. A <code>cross_cluster</code> API key cannot be
 * used to authenticate through the REST interface.
 * <p>
 * IMPORTANT: To authenticate this request you must use a credential that is not
 * an API key. Even if you use an API key that has the required privilege, the
 * API returns an error.
 * <p>
 * Cross-cluster API keys are created by the Elasticsearch API key service,
 * which is automatically enabled.
 * <p>
 * NOTE: Unlike REST API keys, a cross-cluster API key does not capture
 * permissions of the authenticated user. The API key’s effective permission is
 * exactly as specified with the <code>access</code> property.
 * <p>
 * A successful request returns a JSON structure that contains the API key, its
 * unique ID, and its name. If applicable, it also returns expiration
 * information for the API key in milliseconds.
 * <p>
 * By default, API keys never expire. You can specify expiration information
 * when you create the API keys.
 * <p>
 * Cross-cluster API keys can only be updated with the update cross-cluster API
 * key API. Attempting to update them with the update REST API key API or the
 * bulk update REST API keys API will result in an error.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#security.create_cross_cluster_api_key.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class CreateCrossClusterApiKeyRequest extends RequestBase implements JsonpSerializable {
	private final Access access;

	@Nullable
	private final Time expiration;

	private final Map<String, JsonData> metadata;

	private final String name;

	// ---------------------------------------------------------------------------------------------

	private CreateCrossClusterApiKeyRequest(Builder builder) {

		this.access = ApiTypeHelper.requireNonNull(builder.access, this, "access");
		this.expiration = builder.expiration;
		this.metadata = ApiTypeHelper.unmodifiable(builder.metadata);
		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");

	}

	public static CreateCrossClusterApiKeyRequest of(
			Function<Builder, ObjectBuilder<CreateCrossClusterApiKeyRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The access to be granted to this API key. The access is composed
	 * of permissions for cross-cluster search and cross-cluster replication. At
	 * least one of them must be specified.
	 * <p>
	 * NOTE: No explicit privileges should be specified for either search or
	 * replication access. The creation process automatically converts the access
	 * specification to a role descriptor which has relevant privileges assigned
	 * accordingly.
	 * <p>
	 * API name: {@code access}
	 */
	public final Access access() {
		return this.access;
	}

	/**
	 * Expiration time for the API key. By default, API keys never expire.
	 * <p>
	 * API name: {@code expiration}
	 */
	@Nullable
	public final Time expiration() {
		return this.expiration;
	}

	/**
	 * Arbitrary metadata that you want to associate with the API key. It supports
	 * nested data structure. Within the metadata object, keys beginning with
	 * <code>_</code> are reserved for system usage.
	 * <p>
	 * API name: {@code metadata}
	 */
	public final Map<String, JsonData> metadata() {
		return this.metadata;
	}

	/**
	 * Required - Specifies the name for this API key.
	 * <p>
	 * API name: {@code name}
	 */
	public final String name() {
		return this.name;
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
		generator.writeKey("name");
		generator.write(this.name);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CreateCrossClusterApiKeyRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<CreateCrossClusterApiKeyRequest> {
		private Access access;

		@Nullable
		private Time expiration;

		@Nullable
		private Map<String, JsonData> metadata;

		private String name;

		public Builder() {
		}
		private Builder(CreateCrossClusterApiKeyRequest instance) {
			this.access = instance.access;
			this.expiration = instance.expiration;
			this.metadata = instance.metadata;
			this.name = instance.name;

		}
		/**
		 * Required - The access to be granted to this API key. The access is composed
		 * of permissions for cross-cluster search and cross-cluster replication. At
		 * least one of them must be specified.
		 * <p>
		 * NOTE: No explicit privileges should be specified for either search or
		 * replication access. The creation process automatically converts the access
		 * specification to a role descriptor which has relevant privileges assigned
		 * accordingly.
		 * <p>
		 * API name: {@code access}
		 */
		public final Builder access(Access value) {
			this.access = value;
			return this;
		}

		/**
		 * Required - The access to be granted to this API key. The access is composed
		 * of permissions for cross-cluster search and cross-cluster replication. At
		 * least one of them must be specified.
		 * <p>
		 * NOTE: No explicit privileges should be specified for either search or
		 * replication access. The creation process automatically converts the access
		 * specification to a role descriptor which has relevant privileges assigned
		 * accordingly.
		 * <p>
		 * API name: {@code access}
		 */
		public final Builder access(Function<Access.Builder, ObjectBuilder<Access>> fn) {
			return this.access(fn.apply(new Access.Builder()).build());
		}

		/**
		 * Expiration time for the API key. By default, API keys never expire.
		 * <p>
		 * API name: {@code expiration}
		 */
		public final Builder expiration(@Nullable Time value) {
			this.expiration = value;
			return this;
		}

		/**
		 * Expiration time for the API key. By default, API keys never expire.
		 * <p>
		 * API name: {@code expiration}
		 */
		public final Builder expiration(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.expiration(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Arbitrary metadata that you want to associate with the API key. It supports
		 * nested data structure. Within the metadata object, keys beginning with
		 * <code>_</code> are reserved for system usage.
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
		 * <code>_</code> are reserved for system usage.
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
		 * Required - Specifies the name for this API key.
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CreateCrossClusterApiKeyRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CreateCrossClusterApiKeyRequest build() {
			_checkSingleUse();

			return new CreateCrossClusterApiKeyRequest(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CreateCrossClusterApiKeyRequest}
	 */
	public static final JsonpDeserializer<CreateCrossClusterApiKeyRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CreateCrossClusterApiKeyRequest::setupCreateCrossClusterApiKeyRequestDeserializer);

	protected static void setupCreateCrossClusterApiKeyRequestDeserializer(
			ObjectDeserializer<CreateCrossClusterApiKeyRequest.Builder> op) {

		op.add(Builder::access, Access._DESERIALIZER, "access");
		op.add(Builder::expiration, Time._DESERIALIZER, "expiration");
		op.add(Builder::metadata, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "metadata");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.create_cross_cluster_api_key}".
	 */
	public static final Endpoint<CreateCrossClusterApiKeyRequest, CreateCrossClusterApiKeyResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/security.create_cross_cluster_api_key",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_security/cross_cluster/api_key";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, CreateCrossClusterApiKeyResponse._DESERIALIZER);
}
