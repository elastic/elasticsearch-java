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

import co.elastic.clients.elasticsearch.security.get_user_profile.GetUserProfileErrors;
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
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.get_user_profile.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#security.get_user_profile.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetUserProfileResponse implements JsonpSerializable {
	private final List<UserProfileWithMetadata> profiles;

	@Nullable
	private final GetUserProfileErrors errors;

	// ---------------------------------------------------------------------------------------------

	private GetUserProfileResponse(Builder builder) {

		this.profiles = ApiTypeHelper.unmodifiableRequired(builder.profiles, this, "profiles");
		this.errors = builder.errors;

	}

	public static GetUserProfileResponse of(Function<Builder, ObjectBuilder<GetUserProfileResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code profiles}
	 */
	public final List<UserProfileWithMetadata> profiles() {
		return this.profiles;
	}

	/**
	 * API name: {@code errors}
	 */
	@Nullable
	public final GetUserProfileErrors errors() {
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

		if (ApiTypeHelper.isDefined(this.profiles)) {
			generator.writeKey("profiles");
			generator.writeStartArray();
			for (UserProfileWithMetadata item0 : this.profiles) {
				item0.serialize(generator, mapper);

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
	 * Builder for {@link GetUserProfileResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GetUserProfileResponse> {
		private List<UserProfileWithMetadata> profiles;

		@Nullable
		private GetUserProfileErrors errors;

		/**
		 * Required - API name: {@code profiles}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>profiles</code>.
		 */
		public final Builder profiles(List<UserProfileWithMetadata> list) {
			this.profiles = _listAddAll(this.profiles, list);
			return this;
		}

		/**
		 * Required - API name: {@code profiles}
		 * <p>
		 * Adds one or more values to <code>profiles</code>.
		 */
		public final Builder profiles(UserProfileWithMetadata value, UserProfileWithMetadata... values) {
			this.profiles = _listAdd(this.profiles, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code profiles}
		 * <p>
		 * Adds a value to <code>profiles</code> using a builder lambda.
		 */
		public final Builder profiles(
				Function<UserProfileWithMetadata.Builder, ObjectBuilder<UserProfileWithMetadata>> fn) {
			return profiles(fn.apply(new UserProfileWithMetadata.Builder()).build());
		}

		/**
		 * API name: {@code errors}
		 */
		public final Builder errors(@Nullable GetUserProfileErrors value) {
			this.errors = value;
			return this;
		}

		/**
		 * API name: {@code errors}
		 */
		public final Builder errors(Function<GetUserProfileErrors.Builder, ObjectBuilder<GetUserProfileErrors>> fn) {
			return this.errors(fn.apply(new GetUserProfileErrors.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetUserProfileResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetUserProfileResponse build() {
			_checkSingleUse();

			return new GetUserProfileResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetUserProfileResponse}
	 */
	public static final JsonpDeserializer<GetUserProfileResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetUserProfileResponse::setupGetUserProfileResponseDeserializer);

	protected static void setupGetUserProfileResponseDeserializer(
			ObjectDeserializer<GetUserProfileResponse.Builder> op) {

		op.add(Builder::profiles, JsonpDeserializer.arrayDeserializer(UserProfileWithMetadata._DESERIALIZER),
				"profiles");
		op.add(Builder::errors, GetUserProfileErrors._DESERIALIZER, "errors");

	}

}
