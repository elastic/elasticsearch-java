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

package co.elastic.clients.elasticsearch.ml;

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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.ApiKeyAuthorization

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml._types.ApiKeyAuthorization">API
 *      specification</a>
 */
@JsonpDeserializable
public class ApiKeyAuthorization implements JsonpSerializable {
	private final String id;

	private final String name;

	// ---------------------------------------------------------------------------------------------

	private ApiKeyAuthorization(Builder builder) {

		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");

	}

	public static ApiKeyAuthorization of(Function<Builder, ObjectBuilder<ApiKeyAuthorization>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The identifier for the API key.
	 * <p>
	 * API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Required - The name of the API key.
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

		generator.writeKey("id");
		generator.write(this.id);

		generator.writeKey("name");
		generator.write(this.name);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ApiKeyAuthorization}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ApiKeyAuthorization> {
		private String id;

		private String name;

		/**
		 * Required - The identifier for the API key.
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - The name of the API key.
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
		 * Builds a {@link ApiKeyAuthorization}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ApiKeyAuthorization build() {
			_checkSingleUse();

			return new ApiKeyAuthorization(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ApiKeyAuthorization}
	 */
	public static final JsonpDeserializer<ApiKeyAuthorization> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ApiKeyAuthorization::setupApiKeyAuthorizationDeserializer);

	protected static void setupApiKeyAuthorizationDeserializer(ObjectDeserializer<ApiKeyAuthorization.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");

	}

}
