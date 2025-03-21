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
import jakarta.json.stream.JsonParser;
import java.lang.String;
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

// typedef: security.get_role_mapping.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#security.get_role_mapping.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetRoleMappingResponse implements JsonpSerializable {
	private final Map<String, RoleMapping> roleMappings;

	// ---------------------------------------------------------------------------------------------

	private GetRoleMappingResponse(Builder builder) {

		this.roleMappings = ApiTypeHelper.unmodifiableRequired(builder.roleMappings, this, "roleMappings");

	}

	public static GetRoleMappingResponse of(Function<Builder, ObjectBuilder<GetRoleMappingResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Response value.
	 */
	public final Map<String, RoleMapping> roleMappings() {
		return this.roleMappings;
	}

	/**
	 * Get an element of {@code roleMappings}.
	 */
	public final @Nullable RoleMapping get(String key) {
		return this.roleMappings.get(key);
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		for (Map.Entry<String, RoleMapping> item0 : this.roleMappings.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetRoleMappingResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GetRoleMappingResponse> {
		private Map<String, RoleMapping> roleMappings = new HashMap<>();

		/**
		 * Required - Response value.
		 * <p>
		 * Adds all entries of <code>map</code> to <code>roleMappings</code>.
		 */
		public final Builder roleMappings(Map<String, RoleMapping> map) {
			this.roleMappings = _mapPutAll(this.roleMappings, map);
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * Adds an entry to <code>roleMappings</code>.
		 */
		public final Builder roleMappings(String key, RoleMapping value) {
			this.roleMappings = _mapPut(this.roleMappings, key, value);
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * Adds an entry to <code>roleMappings</code> using a builder lambda.
		 */
		public final Builder roleMappings(String key, Function<RoleMapping.Builder, ObjectBuilder<RoleMapping>> fn) {
			return roleMappings(key, fn.apply(new RoleMapping.Builder()).build());
		}

		@Override
		public Builder withJson(JsonParser parser, JsonpMapper mapper) {

			@SuppressWarnings("unchecked")
			Map<String, RoleMapping> value = (Map<String, RoleMapping>) JsonpDeserializer
					.stringMapDeserializer(RoleMapping._DESERIALIZER).deserialize(parser, mapper);
			return this.roleMappings(value);
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetRoleMappingResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetRoleMappingResponse build() {
			_checkSingleUse();

			return new GetRoleMappingResponse(this);
		}
	}

	public static final JsonpDeserializer<GetRoleMappingResponse> _DESERIALIZER = createGetRoleMappingResponseDeserializer();
	protected static JsonpDeserializer<GetRoleMappingResponse> createGetRoleMappingResponseDeserializer() {

		JsonpDeserializer<Map<String, RoleMapping>> valueDeserializer = JsonpDeserializer
				.stringMapDeserializer(RoleMapping._DESERIALIZER);

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(), (parser, mapper, event) -> new Builder()
				.roleMappings(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

}
