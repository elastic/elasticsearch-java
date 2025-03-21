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

// typedef: security.get_user.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#security.get_user.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetUserResponse implements JsonpSerializable {
	private final Map<String, User> users;

	// ---------------------------------------------------------------------------------------------

	private GetUserResponse(Builder builder) {

		this.users = ApiTypeHelper.unmodifiableRequired(builder.users, this, "users");

	}

	public static GetUserResponse of(Function<Builder, ObjectBuilder<GetUserResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Response value.
	 */
	public final Map<String, User> users() {
		return this.users;
	}

	/**
	 * Get an element of {@code users}.
	 */
	public final @Nullable User get(String key) {
		return this.users.get(key);
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		for (Map.Entry<String, User> item0 : this.users.entrySet()) {
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
	 * Builder for {@link GetUserResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<GetUserResponse> {
		private Map<String, User> users = new HashMap<>();

		/**
		 * Required - Response value.
		 * <p>
		 * Adds all entries of <code>map</code> to <code>users</code>.
		 */
		public final Builder users(Map<String, User> map) {
			this.users = _mapPutAll(this.users, map);
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * Adds an entry to <code>users</code>.
		 */
		public final Builder users(String key, User value) {
			this.users = _mapPut(this.users, key, value);
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * Adds an entry to <code>users</code> using a builder lambda.
		 */
		public final Builder users(String key, Function<User.Builder, ObjectBuilder<User>> fn) {
			return users(key, fn.apply(new User.Builder()).build());
		}

		@Override
		public Builder withJson(JsonParser parser, JsonpMapper mapper) {

			@SuppressWarnings("unchecked")
			Map<String, User> value = (Map<String, User>) JsonpDeserializer.stringMapDeserializer(User._DESERIALIZER)
					.deserialize(parser, mapper);
			return this.users(value);
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetUserResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetUserResponse build() {
			_checkSingleUse();

			return new GetUserResponse(this);
		}
	}

	public static final JsonpDeserializer<GetUserResponse> _DESERIALIZER = createGetUserResponseDeserializer();
	protected static JsonpDeserializer<GetUserResponse> createGetUserResponseDeserializer() {

		JsonpDeserializer<Map<String, User>> valueDeserializer = JsonpDeserializer
				.stringMapDeserializer(User._DESERIALIZER);

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(), (parser, mapper, event) -> new Builder()
				.users(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

}
