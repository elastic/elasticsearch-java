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
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch.security.has_privileges_user_profile.PrivilegesCheck;
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
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.has_privileges_user_profile.Request

/**
 * Determines whether the users associated with the specified profile IDs have
 * all the requested privileges.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#security.has_privileges_user_profile.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class HasPrivilegesUserProfileRequest extends RequestBase implements JsonpSerializable {
	private final PrivilegesCheck privileges;

	private final List<String> uids;

	// ---------------------------------------------------------------------------------------------

	private HasPrivilegesUserProfileRequest(Builder builder) {

		this.privileges = ApiTypeHelper.requireNonNull(builder.privileges, this, "privileges");
		this.uids = ApiTypeHelper.unmodifiableRequired(builder.uids, this, "uids");

	}

	public static HasPrivilegesUserProfileRequest of(
			Function<Builder, ObjectBuilder<HasPrivilegesUserProfileRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code privileges}
	 */
	public final PrivilegesCheck privileges() {
		return this.privileges;
	}

	/**
	 * Required - A list of profile IDs. The privileges are checked for associated
	 * users of the profiles.
	 * <p>
	 * API name: {@code uids}
	 */
	public final List<String> uids() {
		return this.uids;
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

		generator.writeKey("privileges");
		this.privileges.serialize(generator, mapper);

		if (ApiTypeHelper.isDefined(this.uids)) {
			generator.writeKey("uids");
			generator.writeStartArray();
			for (String item0 : this.uids) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HasPrivilegesUserProfileRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<HasPrivilegesUserProfileRequest> {
		private PrivilegesCheck privileges;

		private List<String> uids;

		/**
		 * Required - API name: {@code privileges}
		 */
		public final Builder privileges(PrivilegesCheck value) {
			this.privileges = value;
			return this;
		}

		/**
		 * Required - API name: {@code privileges}
		 */
		public final Builder privileges(Function<PrivilegesCheck.Builder, ObjectBuilder<PrivilegesCheck>> fn) {
			return this.privileges(fn.apply(new PrivilegesCheck.Builder()).build());
		}

		/**
		 * Required - A list of profile IDs. The privileges are checked for associated
		 * users of the profiles.
		 * <p>
		 * API name: {@code uids}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>uids</code>.
		 */
		public final Builder uids(List<String> list) {
			this.uids = _listAddAll(this.uids, list);
			return this;
		}

		/**
		 * Required - A list of profile IDs. The privileges are checked for associated
		 * users of the profiles.
		 * <p>
		 * API name: {@code uids}
		 * <p>
		 * Adds one or more values to <code>uids</code>.
		 */
		public final Builder uids(String value, String... values) {
			this.uids = _listAdd(this.uids, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link HasPrivilegesUserProfileRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HasPrivilegesUserProfileRequest build() {
			_checkSingleUse();

			return new HasPrivilegesUserProfileRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link HasPrivilegesUserProfileRequest}
	 */
	public static final JsonpDeserializer<HasPrivilegesUserProfileRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, HasPrivilegesUserProfileRequest::setupHasPrivilegesUserProfileRequestDeserializer);

	protected static void setupHasPrivilegesUserProfileRequestDeserializer(
			ObjectDeserializer<HasPrivilegesUserProfileRequest.Builder> op) {

		op.add(Builder::privileges, PrivilegesCheck._DESERIALIZER, "privileges");
		op.add(Builder::uids, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "uids");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.has_privileges_user_profile}".
	 */
	public static final Endpoint<HasPrivilegesUserProfileRequest, HasPrivilegesUserProfileResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/security.has_privileges_user_profile",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_security/profile/_has_privileges";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, HasPrivilegesUserProfileResponse._DESERIALIZER);
}
