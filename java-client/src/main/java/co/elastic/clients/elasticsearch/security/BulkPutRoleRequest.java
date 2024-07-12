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

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.Refresh;
import co.elastic.clients.elasticsearch._types.RequestBase;
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
import java.lang.String;
import java.util.Collections;
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

// typedef: security.bulk_put_role.Request

/**
 * The role management APIs are generally the preferred way to manage roles,
 * rather than using file-based role management. The bulk create or update roles
 * API cannot update roles that are defined in roles files.
 * 
 * @see <a href="../doc-files/api-spec.html#security.bulk_put_role.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class BulkPutRoleRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Refresh refresh;

	private final Map<String, RoleDescriptor> roles;

	// ---------------------------------------------------------------------------------------------

	private BulkPutRoleRequest(Builder builder) {

		this.refresh = builder.refresh;
		this.roles = ApiTypeHelper.unmodifiableRequired(builder.roles, this, "roles");

	}

	public static BulkPutRoleRequest of(Function<Builder, ObjectBuilder<BulkPutRoleRequest>> fn) {
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
	 * Required - A dictionary of role name to RoleDescriptor objects to add or
	 * update
	 * <p>
	 * API name: {@code roles}
	 */
	public final Map<String, RoleDescriptor> roles() {
		return this.roles;
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

		if (ApiTypeHelper.isDefined(this.roles)) {
			generator.writeKey("roles");
			generator.writeStartObject();
			for (Map.Entry<String, RoleDescriptor> item0 : this.roles.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link BulkPutRoleRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<BulkPutRoleRequest> {
		@Nullable
		private Refresh refresh;

		private Map<String, RoleDescriptor> roles;

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
		 * Required - A dictionary of role name to RoleDescriptor objects to add or
		 * update
		 * <p>
		 * API name: {@code roles}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>roles</code>.
		 */
		public final Builder roles(Map<String, RoleDescriptor> map) {
			this.roles = _mapPutAll(this.roles, map);
			return this;
		}

		/**
		 * Required - A dictionary of role name to RoleDescriptor objects to add or
		 * update
		 * <p>
		 * API name: {@code roles}
		 * <p>
		 * Adds an entry to <code>roles</code>.
		 */
		public final Builder roles(String key, RoleDescriptor value) {
			this.roles = _mapPut(this.roles, key, value);
			return this;
		}

		/**
		 * Required - A dictionary of role name to RoleDescriptor objects to add or
		 * update
		 * <p>
		 * API name: {@code roles}
		 * <p>
		 * Adds an entry to <code>roles</code> using a builder lambda.
		 */
		public final Builder roles(String key, Function<RoleDescriptor.Builder, ObjectBuilder<RoleDescriptor>> fn) {
			return roles(key, fn.apply(new RoleDescriptor.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link BulkPutRoleRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public BulkPutRoleRequest build() {
			_checkSingleUse();

			return new BulkPutRoleRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link BulkPutRoleRequest}
	 */
	public static final JsonpDeserializer<BulkPutRoleRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, BulkPutRoleRequest::setupBulkPutRoleRequestDeserializer);

	protected static void setupBulkPutRoleRequestDeserializer(ObjectDeserializer<BulkPutRoleRequest.Builder> op) {

		op.add(Builder::roles, JsonpDeserializer.stringMapDeserializer(RoleDescriptor._DESERIALIZER), "roles");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.bulk_put_role}".
	 */
	public static final Endpoint<BulkPutRoleRequest, BulkPutRoleResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/security.bulk_put_role",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_security/role";

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

			}, SimpleEndpoint.emptyMap(), true, BulkPutRoleResponse._DESERIALIZER);
}
