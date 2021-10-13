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

package co.elastic.clients.elasticsearch.security.grant_api_key;

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
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.grant_api_key.ApiKey
@JsonpDeserializable
public final class ApiKey implements JsonpSerializable {
	private final String name;

	@Nullable
	private final String expiration;

	@Nullable
	private final List<Map<String, JsonData>> roleDescriptors;

	// ---------------------------------------------------------------------------------------------

	public ApiKey(Builder builder) {

		this.name = Objects.requireNonNull(builder.name, "name");
		this.expiration = builder.expiration;
		this.roleDescriptors = ModelTypeHelper.unmodifiable(builder.roleDescriptors);

	}

	public ApiKey(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code name}
	 */
	public String name() {
		return this.name;
	}

	/**
	 * API name: {@code expiration}
	 */
	@Nullable
	public String expiration() {
		return this.expiration;
	}

	/**
	 * API name: {@code role_descriptors}
	 */
	@Nullable
	public List<Map<String, JsonData>> roleDescriptors() {
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

		generator.writeKey("name");
		generator.write(this.name);

		if (this.expiration != null) {

			generator.writeKey("expiration");
			generator.write(this.expiration);

		}
		if (this.roleDescriptors != null) {

			generator.writeKey("role_descriptors");
			generator.writeStartArray();
			for (Map<String, JsonData> item0 : this.roleDescriptors) {
				generator.writeStartObject();
				for (Map.Entry<String, JsonData> item1 : item0.entrySet()) {
					generator.writeKey(item1.getKey());
					item1.getValue().serialize(generator, mapper);

				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ApiKey}.
	 */
	public static class Builder implements ObjectBuilder<ApiKey> {
		private String name;

		@Nullable
		private String expiration;

		@Nullable
		private List<Map<String, JsonData>> roleDescriptors;

		/**
		 * Required - API name: {@code name}
		 */
		public Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code expiration}
		 */
		public Builder expiration(@Nullable String value) {
			this.expiration = value;
			return this;
		}

		/**
		 * API name: {@code role_descriptors}
		 */
		public Builder roleDescriptors(@Nullable List<Map<String, JsonData>> value) {
			this.roleDescriptors = value;
			return this;
		}

		/**
		 * API name: {@code role_descriptors}
		 */
		public Builder roleDescriptors(Map<String, JsonData>... value) {
			this.roleDescriptors = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #roleDescriptors(List)}, creating the list if needed.
		 */
		public Builder addRoleDescriptors(Map<String, JsonData> value) {
			if (this.roleDescriptors == null) {
				this.roleDescriptors = new ArrayList<>();
			}
			this.roleDescriptors.add(value);
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
	public static final JsonpDeserializer<ApiKey> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ApiKey::setupApiKeyDeserializer, Builder::build);

	protected static void setupApiKeyDeserializer(DelegatingDeserializer<ApiKey.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::expiration, JsonpDeserializer.stringDeserializer(), "expiration");
		op.add(Builder::roleDescriptors,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER)),
				"role_descriptors");

	}

}
