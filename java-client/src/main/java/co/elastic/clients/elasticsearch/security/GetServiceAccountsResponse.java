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

import co.elastic.clients.elasticsearch.security.get_service_accounts.RoleDescriptorWrapper;
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

// typedef: security.get_service_accounts.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#security.get_service_accounts.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetServiceAccountsResponse implements JsonpSerializable {
	private final Map<String, RoleDescriptorWrapper> result;

	// ---------------------------------------------------------------------------------------------

	private GetServiceAccountsResponse(Builder builder) {

		this.result = ApiTypeHelper.unmodifiableRequired(builder.result, this, "result");

	}

	public static GetServiceAccountsResponse of(Function<Builder, ObjectBuilder<GetServiceAccountsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Response value.
	 */
	public final Map<String, RoleDescriptorWrapper> result() {
		return this.result;
	}

	/**
	 * Get an element of {@code result}.
	 */
	public final @Nullable RoleDescriptorWrapper get(String key) {
		return this.result.get(key);
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		for (Map.Entry<String, RoleDescriptorWrapper> item0 : this.result.entrySet()) {
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
	 * Builder for {@link GetServiceAccountsResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GetServiceAccountsResponse> {
		private Map<String, RoleDescriptorWrapper> result = new HashMap<>();

		/**
		 * Required - Response value.
		 * <p>
		 * Adds all entries of <code>map</code> to <code>result</code>.
		 */
		public final Builder result(Map<String, RoleDescriptorWrapper> map) {
			this.result = _mapPutAll(this.result, map);
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * Adds an entry to <code>result</code>.
		 */
		public final Builder result(String key, RoleDescriptorWrapper value) {
			this.result = _mapPut(this.result, key, value);
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * Adds an entry to <code>result</code> using a builder lambda.
		 */
		public final Builder result(String key,
				Function<RoleDescriptorWrapper.Builder, ObjectBuilder<RoleDescriptorWrapper>> fn) {
			return result(key, fn.apply(new RoleDescriptorWrapper.Builder()).build());
		}

		@Override
		public Builder withJson(JsonParser parser, JsonpMapper mapper) {

			@SuppressWarnings("unchecked")
			Map<String, RoleDescriptorWrapper> value = (Map<String, RoleDescriptorWrapper>) JsonpDeserializer
					.stringMapDeserializer(RoleDescriptorWrapper._DESERIALIZER).deserialize(parser, mapper);
			return this.result(value);
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetServiceAccountsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetServiceAccountsResponse build() {
			_checkSingleUse();

			return new GetServiceAccountsResponse(this);
		}
	}

	public static final JsonpDeserializer<GetServiceAccountsResponse> _DESERIALIZER = createGetServiceAccountsResponseDeserializer();
	protected static JsonpDeserializer<GetServiceAccountsResponse> createGetServiceAccountsResponseDeserializer() {

		JsonpDeserializer<Map<String, RoleDescriptorWrapper>> valueDeserializer = JsonpDeserializer
				.stringMapDeserializer(RoleDescriptorWrapper._DESERIALIZER);

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(), (parser, mapper, event) -> new Builder()
				.result(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

}
