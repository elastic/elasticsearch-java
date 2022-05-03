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

import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security._types.ApiKey

/**
 *
 * @see <a href="../doc-files/api-spec.html#security._types.ApiKey">API
 *      specification</a>
 */
@JsonpDeserializable
public class ApiKey implements JsonpSerializable {
	@Nullable
	private final Long creation;

	@Nullable
	private final Long expiration;

	private final String id;

	@Nullable
	private final Boolean invalidated;

	private final String name;

	@Nullable
	private final String realm;

	@Nullable
	private final String username;

	private final Map<String, JsonData> metadata;

	// ---------------------------------------------------------------------------------------------

	private ApiKey(Builder builder) {

		this.creation = builder.creation;
		this.expiration = builder.expiration;
		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.invalidated = builder.invalidated;
		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.realm = builder.realm;
		this.username = builder.username;
		this.metadata = ApiTypeHelper.unmodifiable(builder.metadata);

	}

	public static ApiKey of(Function<Builder, ObjectBuilder<ApiKey>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code creation}
	 */
	@Nullable
	public final Long creation() {
		return this.creation;
	}

	/**
	 * API name: {@code expiration}
	 */
	@Nullable
	public final Long expiration() {
		return this.expiration;
	}

	/**
	 * Required - API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * API name: {@code invalidated}
	 */
	@Nullable
	public final Boolean invalidated() {
		return this.invalidated;
	}

	/**
	 * Required - API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * API name: {@code realm}
	 */
	@Nullable
	public final String realm() {
		return this.realm;
	}

	/**
	 * API name: {@code username}
	 */
	@Nullable
	public final String username() {
		return this.username;
	}

	/**
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

		if (this.creation != null) {
			generator.writeKey("creation");
			generator.write(this.creation);

		}
		if (this.expiration != null) {
			generator.writeKey("expiration");
			generator.write(this.expiration);

		}
		generator.writeKey("id");
		generator.write(this.id);

		if (this.invalidated != null) {
			generator.writeKey("invalidated");
			generator.write(this.invalidated);

		}
		generator.writeKey("name");
		generator.write(this.name);

		if (this.realm != null) {
			generator.writeKey("realm");
			generator.write(this.realm);

		}
		if (this.username != null) {
			generator.writeKey("username");
			generator.write(this.username);

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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ApiKey}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ApiKey> {
		@Nullable
		private Long creation;

		@Nullable
		private Long expiration;

		private String id;

		@Nullable
		private Boolean invalidated;

		private String name;

		@Nullable
		private String realm;

		@Nullable
		private String username;

		@Nullable
		private Map<String, JsonData> metadata;

		/**
		 * API name: {@code creation}
		 */
		public final Builder creation(@Nullable Long value) {
			this.creation = value;
			return this;
		}

		/**
		 * API name: {@code expiration}
		 */
		public final Builder expiration(@Nullable Long value) {
			this.expiration = value;
			return this;
		}

		/**
		 * Required - API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code invalidated}
		 */
		public final Builder invalidated(@Nullable Boolean value) {
			this.invalidated = value;
			return this;
		}

		/**
		 * Required - API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code realm}
		 */
		public final Builder realm(@Nullable String value) {
			this.realm = value;
			return this;
		}

		/**
		 * API name: {@code username}
		 */
		public final Builder username(@Nullable String value) {
			this.username = value;
			return this;
		}

		/**
		 * API name: {@code metadata}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>metadata</code>.
		 */
		public final Builder metadata(Map<String, JsonData> map) {
			this.metadata = _mapPutAll(this.metadata, map);
			return this;
		}

		/**
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
		 * Builds a {@link ApiKey}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ApiKey build() {
			_checkSingleUse();

			return new ApiKey(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ApiKey}
	 */
	public static final JsonpDeserializer<ApiKey> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ApiKey::setupApiKeyDeserializer);

	protected static void setupApiKeyDeserializer(ObjectDeserializer<ApiKey.Builder> op) {

		op.add(Builder::creation, JsonpDeserializer.longDeserializer(), "creation");
		op.add(Builder::expiration, JsonpDeserializer.longDeserializer(), "expiration");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::invalidated, JsonpDeserializer.booleanDeserializer(), "invalidated");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::realm, JsonpDeserializer.stringDeserializer(), "realm");
		op.add(Builder::username, JsonpDeserializer.stringDeserializer(), "username");
		op.add(Builder::metadata, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "metadata");

	}

}
