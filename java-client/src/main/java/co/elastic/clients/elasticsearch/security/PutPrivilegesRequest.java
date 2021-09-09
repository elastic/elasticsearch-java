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

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch.security.put_privileges.Actions;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: security.put_privileges.Request
public final class PutPrivilegesRequest extends RequestBase implements ToJsonp {
	@Nullable
	private final JsonValue refresh;

	private final Map<String, Map<String, Actions>> value;

	// ---------------------------------------------------------------------------------------------

	protected PutPrivilegesRequest(Builder builder) {

		this.refresh = builder.refresh;
		this.value = Objects.requireNonNull(builder.value, "value");

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
	public JsonValue refresh() {
		return this.refresh;
	}

	/**
	 * Request body.
	 * <p>
	 * API name: {@code value}
	 */
	public Map<String, Map<String, Actions>> value() {
		return this.value;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		for (Map.Entry<String, Map<String, Actions>> item0 : this.value.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.writeStartObject();
			for (Map.Entry<String, Actions> item1 : item0.getValue().entrySet()) {
				generator.writeKey(item1.getKey());
				item1.getValue().toJsonp(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutPrivilegesRequest}.
	 */
	public static class Builder implements ObjectBuilder<PutPrivilegesRequest> {
		@Nullable
		private JsonValue refresh;

		private Map<String, Map<String, Actions>> value;

		/**
		 * If <code>true</code> (the default) then refresh the affected shards to make
		 * this operation visible to search, if <code>wait_for</code> then wait for a
		 * refresh to make this operation visible to search, if <code>false</code> then
		 * do nothing with refreshes.
		 * <p>
		 * API name: {@code refresh}
		 */
		public Builder refresh(@Nullable JsonValue value) {
			this.refresh = value;
			return this;
		}

		/**
		 * Request body.
		 * <p>
		 * API name: {@code value}
		 */
		public Builder value(Map<String, Map<String, Actions>> value) {
			this.value = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #value(Map)}, creating the map if needed.
		 */
		public Builder putValue(String key, Map<String, Actions> value) {
			if (this.value == null) {
				this.value = new HashMap<>();
			}
			this.value.put(key, value);
			return this;
		}

		/**
		 * Builds a {@link PutPrivilegesRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutPrivilegesRequest build() {

			return new PutPrivilegesRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for PutPrivilegesRequest
	 */
	public static final JsonpDeserializer<PutPrivilegesRequest> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, PutPrivilegesRequest::setupPutPrivilegesRequestDeserializer);

	protected static void setupPutPrivilegesRequestDeserializer(
			DelegatingDeserializer<PutPrivilegesRequest.Builder> op) {

		op.add(Builder::value,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringMapDeserializer(Actions.DESERIALIZER)),
				"value");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.put_privileges}".
	 */
	public static final Endpoint<PutPrivilegesRequest, PutPrivilegesResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				return "/_security/privilege/";

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.refresh != null) {
					params.put("refresh", request.refresh.toString());
				}
				return params;

			}, Endpoint.Simple.emptyMap(), true, PutPrivilegesResponse.DESERIALIZER);
}
