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

import co.elastic.clients.elasticsearch.security.has_privileges_user_profile.HasPrivilegesUserProfileErrors;
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
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.has_privileges_user_profile.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#security.has_privileges_user_profile.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class HasPrivilegesUserProfileResponse implements JsonpSerializable {
	private final List<String> hasPrivilegeUids;

	@Nullable
	private final HasPrivilegesUserProfileErrors errors;

	// ---------------------------------------------------------------------------------------------

	private HasPrivilegesUserProfileResponse(Builder builder) {

		this.hasPrivilegeUids = ApiTypeHelper.unmodifiableRequired(builder.hasPrivilegeUids, this, "hasPrivilegeUids");
		this.errors = builder.errors;

	}

	public static HasPrivilegesUserProfileResponse of(
			Function<Builder, ObjectBuilder<HasPrivilegesUserProfileResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The subset of the requested profile IDs of the users that have all
	 * the requested privileges.
	 * <p>
	 * API name: {@code has_privilege_uids}
	 */
	public final List<String> hasPrivilegeUids() {
		return this.hasPrivilegeUids;
	}

	/**
	 * The subset of the requested profile IDs for which an error was encountered.
	 * It does not include the missing profile IDs or the profile IDs of the users
	 * that do not have all the requested privileges. This field is absent if empty.
	 * <p>
	 * API name: {@code errors}
	 */
	@Nullable
	public final HasPrivilegesUserProfileErrors errors() {
		return this.errors;
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

		if (ApiTypeHelper.isDefined(this.hasPrivilegeUids)) {
			generator.writeKey("has_privilege_uids");
			generator.writeStartArray();
			for (String item0 : this.hasPrivilegeUids) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.errors != null) {
			generator.writeKey("errors");
			this.errors.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HasPrivilegesUserProfileResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<HasPrivilegesUserProfileResponse> {
		private List<String> hasPrivilegeUids;

		@Nullable
		private HasPrivilegesUserProfileErrors errors;

		/**
		 * Required - The subset of the requested profile IDs of the users that have all
		 * the requested privileges.
		 * <p>
		 * API name: {@code has_privilege_uids}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>hasPrivilegeUids</code>.
		 */
		public final Builder hasPrivilegeUids(List<String> list) {
			this.hasPrivilegeUids = _listAddAll(this.hasPrivilegeUids, list);
			return this;
		}

		/**
		 * Required - The subset of the requested profile IDs of the users that have all
		 * the requested privileges.
		 * <p>
		 * API name: {@code has_privilege_uids}
		 * <p>
		 * Adds one or more values to <code>hasPrivilegeUids</code>.
		 */
		public final Builder hasPrivilegeUids(String value, String... values) {
			this.hasPrivilegeUids = _listAdd(this.hasPrivilegeUids, value, values);
			return this;
		}

		/**
		 * The subset of the requested profile IDs for which an error was encountered.
		 * It does not include the missing profile IDs or the profile IDs of the users
		 * that do not have all the requested privileges. This field is absent if empty.
		 * <p>
		 * API name: {@code errors}
		 */
		public final Builder errors(@Nullable HasPrivilegesUserProfileErrors value) {
			this.errors = value;
			return this;
		}

		/**
		 * The subset of the requested profile IDs for which an error was encountered.
		 * It does not include the missing profile IDs or the profile IDs of the users
		 * that do not have all the requested privileges. This field is absent if empty.
		 * <p>
		 * API name: {@code errors}
		 */
		public final Builder errors(
				Function<HasPrivilegesUserProfileErrors.Builder, ObjectBuilder<HasPrivilegesUserProfileErrors>> fn) {
			return this.errors(fn.apply(new HasPrivilegesUserProfileErrors.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link HasPrivilegesUserProfileResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HasPrivilegesUserProfileResponse build() {
			_checkSingleUse();

			return new HasPrivilegesUserProfileResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link HasPrivilegesUserProfileResponse}
	 */
	public static final JsonpDeserializer<HasPrivilegesUserProfileResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, HasPrivilegesUserProfileResponse::setupHasPrivilegesUserProfileResponseDeserializer);

	protected static void setupHasPrivilegesUserProfileResponseDeserializer(
			ObjectDeserializer<HasPrivilegesUserProfileResponse.Builder> op) {

		op.add(Builder::hasPrivilegeUids, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"has_privilege_uids");
		op.add(Builder::errors, HasPrivilegesUserProfileErrors._DESERIALIZER, "errors");

	}

}
