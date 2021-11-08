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
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.get_api_key.ApiKey
@JsonpDeserializable
public class ApiKey implements JsonpSerializable {
	private final long creation;

	@Nullable
	private final Long expiration;

	private final String id;

	private final boolean invalidated;

	private final String name;

	private final String realm;

	private final String username;

	private final Map<String, JsonData> metadata;

	// ---------------------------------------------------------------------------------------------

	private ApiKey(Builder builder) {

		this.creation = ModelTypeHelper.requireNonNull(builder.creation, this, "creation");
		this.expiration = builder.expiration;
		this.id = ModelTypeHelper.requireNonNull(builder.id, this, "id");
		this.invalidated = ModelTypeHelper.requireNonNull(builder.invalidated, this, "invalidated");
		this.name = ModelTypeHelper.requireNonNull(builder.name, this, "name");
		this.realm = ModelTypeHelper.requireNonNull(builder.realm, this, "realm");
		this.username = ModelTypeHelper.requireNonNull(builder.username, this, "username");
		this.metadata = ModelTypeHelper.unmodifiable(builder.metadata);

	}

	public static ApiKey of(Function<Builder, ObjectBuilder<ApiKey>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code creation}
	 */
	public final long creation() {
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
	 * Required - API name: {@code invalidated}
	 */
	public final boolean invalidated() {
		return this.invalidated;
	}

	/**
	 * Required - API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Required - API name: {@code realm}
	 */
	public final String realm() {
		return this.realm;
	}

	/**
	 * Required - API name: {@code username}
	 */
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

		generator.writeKey("creation");
		generator.write(this.creation);

		if (this.expiration != null) {
			generator.writeKey("expiration");
			generator.write(this.expiration);

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

		if (ModelTypeHelper.isDefined(this.metadata)) {
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
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ApiKey> {
		private Long creation;

		@Nullable
		private Long expiration;

		private String id;

		private Boolean invalidated;

		private String name;

		private String realm;

		private String username;

		@Nullable
		private Map<String, JsonData> metadata;

		/**
		 * Required - API name: {@code creation}
		 */
		public final Builder creation(long value) {
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
		 * Required - API name: {@code invalidated}
		 */
		public final Builder invalidated(boolean value) {
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
		 * Required - API name: {@code realm}
		 */
		public final Builder realm(String value) {
			this.realm = value;
			return this;
		}

		/**
		 * Required - API name: {@code username}
		 */
		public final Builder username(String value) {
			this.username = value;
			return this;
		}

		/**
		 * API name: {@code metadata}
		 */
		public final Builder metadata(@Nullable Map<String, JsonData> value) {
			this.metadata = value;
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
			ApiKey::setupApiKeyDeserializer, Builder::build);

	protected static void setupApiKeyDeserializer(DelegatingDeserializer<ApiKey.Builder> op) {

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
