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

import co.elastic.clients.elasticsearch.security.get_role.Role;
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

// typedef: security.get_role.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#security.get_role.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetRoleResponse implements JsonpSerializable {
	private final Map<String, Role> roles;

	// ---------------------------------------------------------------------------------------------

	private GetRoleResponse(Builder builder) {

		this.roles = ApiTypeHelper.unmodifiableRequired(builder.roles, this, "roles");

	}

	public static GetRoleResponse of(Function<Builder, ObjectBuilder<GetRoleResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Response value.
	 */
	public final Map<String, Role> roles() {
		return this.roles;
	}

	/**
	 * Get an element of {@code roles}.
	 */
	public final @Nullable Role get(String key) {
		return this.roles.get(key);
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		for (Map.Entry<String, Role> item0 : this.roles.entrySet()) {
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
	 * Builder for {@link GetRoleResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<GetRoleResponse> {
		private Map<String, Role> roles = new HashMap<>();

		/**
		 * Required - Response value.
		 * <p>
		 * Adds all entries of <code>map</code> to <code>roles</code>.
		 */
		public final Builder roles(Map<String, Role> map) {
			this.roles = _mapPutAll(this.roles, map);
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * Adds an entry to <code>roles</code>.
		 */
		public final Builder roles(String key, Role value) {
			this.roles = _mapPut(this.roles, key, value);
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * Adds an entry to <code>roles</code> using a builder lambda.
		 */
		public final Builder roles(String key, Function<Role.Builder, ObjectBuilder<Role>> fn) {
			return roles(key, fn.apply(new Role.Builder()).build());
		}

		@Override
		public Builder withJson(JsonParser parser, JsonpMapper mapper) {

			@SuppressWarnings("unchecked")
			Map<String, Role> value = (Map<String, Role>) JsonpDeserializer.stringMapDeserializer(Role._DESERIALIZER)
					.deserialize(parser, mapper);
			return this.roles(value);
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetRoleResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetRoleResponse build() {
			_checkSingleUse();

			return new GetRoleResponse(this);
		}
	}

	public static final JsonpDeserializer<GetRoleResponse> _DESERIALIZER = createGetRoleResponseDeserializer();
	protected static JsonpDeserializer<GetRoleResponse> createGetRoleResponseDeserializer() {

		JsonpDeserializer<Map<String, Role>> valueDeserializer = JsonpDeserializer
				.stringMapDeserializer(Role._DESERIALIZER);

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(), (parser, mapper, event) -> new Builder()
				.roles(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

}
