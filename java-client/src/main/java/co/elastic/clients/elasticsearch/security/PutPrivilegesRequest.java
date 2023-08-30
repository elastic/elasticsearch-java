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

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.Refresh;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch.security.put_privileges.Actions;
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
import jakarta.json.stream.JsonParser;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.put_privileges.Request

/**
 * Adds or updates application privileges.
 * 
 * @see <a href="../doc-files/api-spec.html#security.put_privileges.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutPrivilegesRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Refresh refresh;

	private final Map<String, Map<String, Actions>> privileges;

	// ---------------------------------------------------------------------------------------------

	private PutPrivilegesRequest(Builder builder) {

		this.refresh = builder.refresh;
		this.privileges = ApiTypeHelper.unmodifiableRequired(builder.privileges, this, "privileges");

	}

	public static PutPrivilegesRequest of(Function<Builder, ObjectBuilder<PutPrivilegesRequest>> fn) {
		return fn.apply(new Builder()).build();
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
	 * Required - Request body.
	 */
	public final Map<String, Map<String, Actions>> privileges() {
		return this.privileges;
	}

	/**
	 * Get an element of {@code privileges}.
	 */
	public final @Nullable Map<String, Actions> get(String key) {
		return this.privileges.get(key);
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		for (Map.Entry<String, Map<String, Actions>> item0 : this.privileges.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.writeStartObject();
			if (item0.getValue() != null) {
				for (Map.Entry<String, Actions> item1 : item0.getValue().entrySet()) {
					generator.writeKey(item1.getKey());
					item1.getValue().serialize(generator, mapper);

				}
			}
			generator.writeEnd();

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutPrivilegesRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PutPrivilegesRequest> {
		@Nullable
		private Refresh refresh;

		private Map<String, Map<String, Actions>> privileges = new HashMap<>();

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

		/**
		 * Required - Request body.
		 * <p>
		 * Adds all entries of <code>map</code> to <code>privileges</code>.
		 */
		public final Builder privileges(Map<String, Map<String, Actions>> map) {
			this.privileges = _mapPutAll(this.privileges, map);
			return this;
		}

		/**
		 * Required - Request body.
		 * <p>
		 * Adds an entry to <code>privileges</code>.
		 */
		public final Builder privileges(String key, Map<String, Actions> value) {
			this.privileges = _mapPut(this.privileges, key, value);
			return this;
		}

		@Override
		public Builder withJson(JsonParser parser, JsonpMapper mapper) {

			@SuppressWarnings("unchecked")
			Map<String, Map<String, Actions>> value = (Map<String, Map<String, Actions>>) JsonpDeserializer
					.stringMapDeserializer(JsonpDeserializer.stringMapDeserializer(Actions._DESERIALIZER))
					.deserialize(parser, mapper);
			return this.privileges(value);
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutPrivilegesRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutPrivilegesRequest build() {
			_checkSingleUse();

			return new PutPrivilegesRequest(this);
		}
	}

	public static final JsonpDeserializer<PutPrivilegesRequest> _DESERIALIZER = createPutPrivilegesRequestDeserializer();
	protected static JsonpDeserializer<PutPrivilegesRequest> createPutPrivilegesRequestDeserializer() {

		JsonpDeserializer<Map<String, Map<String, Actions>>> valueDeserializer = JsonpDeserializer
				.stringMapDeserializer(JsonpDeserializer.stringMapDeserializer(Actions._DESERIALIZER));

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(), (parser, mapper, event) -> new Builder()
				.privileges(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.put_privileges}".
	 */
	public static final Endpoint<PutPrivilegesRequest, PutPrivilegesResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/security.put_privileges",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				return "/_security/privilege";

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

			}, SimpleEndpoint.emptyMap(), true, PutPrivilegesResponse._DESERIALIZER);
}
