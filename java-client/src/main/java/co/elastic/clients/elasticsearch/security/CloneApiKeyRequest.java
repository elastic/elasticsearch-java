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
import co.elastic.clients.elasticsearch._types.Refresh;
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

// typedef: security.clone_api_key.Request

/**
 * Clone an API key.
 * <p>
 * Create a copy of an existing API key with a new ID. The cloned key inherits
 * the role descriptors of the source key. This is intended for applications
 * (such as Kibana) that need to create API keys on behalf of a user using an
 * existing API key credential, since derived API keys (API keys created by API
 * keys) are not otherwise supported.
 * 
 * @see <a href="../doc-files/api-spec.html#security.clone_api_key.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class CloneApiKeyRequest extends RequestBase implements JsonpSerializable {
	private final String apiKey;

	@Nullable
	private final Time expiration;

	private final Map<String, JsonData> metadata;

	@Nullable
	private final String name;

	@Nullable
	private final Refresh refresh;

	// ---------------------------------------------------------------------------------------------

	private CloneApiKeyRequest(Builder builder) {

		this.apiKey = ApiTypeHelper.requireNonNull(builder.apiKey, this, "apiKey");
		this.expiration = builder.expiration;
		this.metadata = ApiTypeHelper.unmodifiable(builder.metadata);
		this.name = builder.name;
		this.refresh = builder.refresh;

	}

	public static CloneApiKeyRequest of(Function<Builder, ObjectBuilder<CloneApiKeyRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The credentials of the API key to clone. This is the secret value
	 * returned when the key was originally created.
	 * <p>
	 * API name: {@code api_key}
	 */
	public final String apiKey() {
		return this.apiKey;
	}

	/**
	 * The expiration time for the cloned API key. By default, API keys never
	 * expire. Set to <code>null</code> to explicitly create a key with no
	 * expiration.
	 * <p>
	 * API name: {@code expiration}
	 */
	@Nullable
	public final Time expiration() {
		return this.expiration;
	}

	/**
	 * Arbitrary metadata to associate with the cloned API key. It supports nested
	 * data structure. Within the metadata object, keys beginning with
	 * <code>_</code> are reserved for system usage.
	 * <p>
	 * API name: {@code metadata}
	 */
	public final Map<String, JsonData> metadata() {
		return this.metadata;
	}

	/**
	 * A name for the cloned API key. If not provided, the name of the source key is
	 * used.
	 * <p>
	 * API name: {@code name}
	 */
	@Nullable
	public final String name() {
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
	public final Refresh refresh() {
		return this.refresh;
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

		generator.writeKey("api_key");
		generator.write(this.apiKey);

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
		if (this.name != null) {
			generator.writeKey("name");
			generator.write(this.name);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CloneApiKeyRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<CloneApiKeyRequest> {
		private String apiKey;

		@Nullable
		private Time expiration;

		@Nullable
		private Map<String, JsonData> metadata;

		@Nullable
		private String name;

		@Nullable
		private Refresh refresh;

		public Builder() {
		}
		private Builder(CloneApiKeyRequest instance) {
			this.apiKey = instance.apiKey;
			this.expiration = instance.expiration;
			this.metadata = instance.metadata;
			this.name = instance.name;
			this.refresh = instance.refresh;

		}
		/**
		 * Required - The credentials of the API key to clone. This is the secret value
		 * returned when the key was originally created.
		 * <p>
		 * API name: {@code api_key}
		 */
		public final Builder apiKey(String value) {
			this.apiKey = value;
			return this;
		}

		/**
		 * The expiration time for the cloned API key. By default, API keys never
		 * expire. Set to <code>null</code> to explicitly create a key with no
		 * expiration.
		 * <p>
		 * API name: {@code expiration}
		 */
		public final Builder expiration(@Nullable Time value) {
			this.expiration = value;
			return this;
		}

		/**
		 * The expiration time for the cloned API key. By default, API keys never
		 * expire. Set to <code>null</code> to explicitly create a key with no
		 * expiration.
		 * <p>
		 * API name: {@code expiration}
		 */
		public final Builder expiration(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.expiration(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Arbitrary metadata to associate with the cloned API key. It supports nested
		 * data structure. Within the metadata object, keys beginning with
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
		 * Arbitrary metadata to associate with the cloned API key. It supports nested
		 * data structure. Within the metadata object, keys beginning with
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
		 * A name for the cloned API key. If not provided, the name of the source key is
		 * used.
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(@Nullable String value) {
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
		public final Builder refresh(@Nullable Refresh value) {
			this.refresh = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CloneApiKeyRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CloneApiKeyRequest build() {
			_checkSingleUse();

			return new CloneApiKeyRequest(this);
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
	 * Json deserializer for {@link CloneApiKeyRequest}
	 */
	public static final JsonpDeserializer<CloneApiKeyRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CloneApiKeyRequest::setupCloneApiKeyRequestDeserializer);

	protected static void setupCloneApiKeyRequestDeserializer(ObjectDeserializer<CloneApiKeyRequest.Builder> op) {

		op.add(Builder::apiKey, JsonpDeserializer.stringDeserializer(), "api_key");
		op.add(Builder::expiration, Time._DESERIALIZER, "expiration");
		op.add(Builder::metadata, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "metadata");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.clone_api_key}".
	 */
	public static final Endpoint<CloneApiKeyRequest, CloneApiKeyResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/security.clone_api_key",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_security/api_key/clone";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.refresh != null) {
					params.put("refresh", request.refresh.jsonValue());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, CloneApiKeyResponse._DESERIALIZER);
}
