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

package co.elastic.clients.elasticsearch.security.get_api_key;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: security.get_api_key.ApiKey
public final class ApiKey implements JsonpSerializable {
	private final Number creation;

	@Nullable
	private final Number expiration;

	private final String id;

	private final Boolean invalidated;

	private final String name;

	private final String realm;

	private final String username;

	@Nullable
	private final Map<String, JsonData> metadata;

	// ---------------------------------------------------------------------------------------------

	public ApiKey(Builder builder) {

		this.creation = Objects.requireNonNull(builder.creation, "creation");
		this.expiration = builder.expiration;
		this.id = Objects.requireNonNull(builder.id, "id");
		this.invalidated = Objects.requireNonNull(builder.invalidated, "invalidated");
		this.name = Objects.requireNonNull(builder.name, "name");
		this.realm = Objects.requireNonNull(builder.realm, "realm");
		this.username = Objects.requireNonNull(builder.username, "username");
		this.metadata = builder.metadata;

	}

	/**
	 * API name: {@code creation}
	 */
	public Number creation() {
		return this.creation;
	}

	/**
	 * API name: {@code expiration}
	 */
	@Nullable
	public Number expiration() {
		return this.expiration;
	}

	/**
	 * API name: {@code id}
	 */
	public String id() {
		return this.id;
	}

	/**
	 * API name: {@code invalidated}
	 */
	public Boolean invalidated() {
		return this.invalidated;
	}

	/**
	 * API name: {@code name}
	 */
	public String name() {
		return this.name;
	}

	/**
	 * API name: {@code realm}
	 */
	public String realm() {
		return this.realm;
	}

	/**
	 * API name: {@code username}
	 */
	public String username() {
		return this.username;
	}

	/**
	 * API name: {@code metadata}
	 */
	@Nullable
	public Map<String, JsonData> metadata() {
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

		generator.writeKey("creation");
		generator.write(this.creation.doubleValue());

		if (this.expiration != null) {

			generator.writeKey("expiration");
			generator.write(this.expiration.doubleValue());

		}

		generator.writeKey("id");
		generator.write(this.id);

		generator.writeKey("invalidated");
		generator.write(this.invalidated);

		generator.writeKey("name");
		generator.write(this.name);

		generator.writeKey("realm");
		generator.write(this.realm);

		generator.writeKey("username");
		generator.write(this.username);

		if (this.metadata != null) {

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
	 * Builder for {@link ApiKey}.
	 */
	public static class Builder implements ObjectBuilder<ApiKey> {
		private Number creation;

		@Nullable
		private Number expiration;

		private String id;

		private Boolean invalidated;

		private String name;

		private String realm;

		private String username;

		@Nullable
		private Map<String, JsonData> metadata;

		/**
		 * API name: {@code creation}
		 */
		public Builder creation(Number value) {
			this.creation = value;
			return this;
		}

		/**
		 * API name: {@code expiration}
		 */
		public Builder expiration(@Nullable Number value) {
			this.expiration = value;
			return this;
		}

		/**
		 * API name: {@code id}
		 */
		public Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code invalidated}
		 */
		public Builder invalidated(Boolean value) {
			this.invalidated = value;
			return this;
		}

		/**
		 * API name: {@code name}
		 */
		public Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code realm}
		 */
		public Builder realm(String value) {
			this.realm = value;
			return this;
		}

		/**
		 * API name: {@code username}
		 */
		public Builder username(String value) {
			this.username = value;
			return this;
		}

		/**
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
		 * Builds a {@link ApiKey}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ApiKey build() {

			return new ApiKey(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ApiKey}
	 */
	public static final JsonpDeserializer<ApiKey> DESERIALIZER = ObjectBuilderDeserializer.createForObject(Builder::new,
			ApiKey::setupApiKeyDeserializer);

	protected static void setupApiKeyDeserializer(DelegatingDeserializer<ApiKey.Builder> op) {

		op.add(Builder::creation, JsonpDeserializer.numberDeserializer(), "creation");
		op.add(Builder::expiration, JsonpDeserializer.numberDeserializer(), "expiration");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::invalidated, JsonpDeserializer.booleanDeserializer(), "invalidated");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::realm, JsonpDeserializer.stringDeserializer(), "realm");
		op.add(Builder::username, JsonpDeserializer.stringDeserializer(), "username");
		op.add(Builder::metadata, JsonpDeserializer.stringMapDeserializer(JsonData.DESERIALIZER), "metadata");

	}

}
