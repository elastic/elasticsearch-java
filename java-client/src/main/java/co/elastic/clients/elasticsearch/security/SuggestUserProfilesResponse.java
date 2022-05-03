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

import co.elastic.clients.elasticsearch.security.suggest_user_profiles.TotalUserProfiles;
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
import java.lang.Long;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.suggest_user_profiles.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#security.suggest_user_profiles.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class SuggestUserProfilesResponse implements JsonpSerializable {
	private final TotalUserProfiles total;

	private final long took;

	private final List<UserProfile> profiles;

	// ---------------------------------------------------------------------------------------------

	private SuggestUserProfilesResponse(Builder builder) {

		this.total = ApiTypeHelper.requireNonNull(builder.total, this, "total");
		this.took = ApiTypeHelper.requireNonNull(builder.took, this, "took");
		this.profiles = ApiTypeHelper.unmodifiableRequired(builder.profiles, this, "profiles");

	}

	public static SuggestUserProfilesResponse of(Function<Builder, ObjectBuilder<SuggestUserProfilesResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code total}
	 */
	public final TotalUserProfiles total() {
		return this.total;
	}

	/**
	 * Required - API name: {@code took}
	 */
	public final long took() {
		return this.took;
	}

	/**
	 * Required - API name: {@code profiles}
	 */
	public final List<UserProfile> profiles() {
		return this.profiles;
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

		generator.writeKey("total");
		this.total.serialize(generator, mapper);

		generator.writeKey("took");
		generator.write(this.took);

		if (ApiTypeHelper.isDefined(this.profiles)) {
			generator.writeKey("profiles");
			generator.writeStartArray();
			for (UserProfile item0 : this.profiles) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SuggestUserProfilesResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<SuggestUserProfilesResponse> {
		private TotalUserProfiles total;

		private Long took;

		private List<UserProfile> profiles;

		/**
		 * Required - API name: {@code total}
		 */
		public final Builder total(TotalUserProfiles value) {
			this.total = value;
			return this;
		}

		/**
		 * Required - API name: {@code total}
		 */
		public final Builder total(Function<TotalUserProfiles.Builder, ObjectBuilder<TotalUserProfiles>> fn) {
			return this.total(fn.apply(new TotalUserProfiles.Builder()).build());
		}

		/**
		 * Required - API name: {@code took}
		 */
		public final Builder took(long value) {
			this.took = value;
			return this;
		}

		/**
		 * Required - API name: {@code profiles}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>profiles</code>.
		 */
		public final Builder profiles(List<UserProfile> list) {
			this.profiles = _listAddAll(this.profiles, list);
			return this;
		}

		/**
		 * Required - API name: {@code profiles}
		 * <p>
		 * Adds one or more values to <code>profiles</code>.
		 */
		public final Builder profiles(UserProfile value, UserProfile... values) {
			this.profiles = _listAdd(this.profiles, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code profiles}
		 * <p>
		 * Adds a value to <code>profiles</code> using a builder lambda.
		 */
		public final Builder profiles(Function<UserProfile.Builder, ObjectBuilder<UserProfile>> fn) {
			return profiles(fn.apply(new UserProfile.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SuggestUserProfilesResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SuggestUserProfilesResponse build() {
			_checkSingleUse();

			return new SuggestUserProfilesResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SuggestUserProfilesResponse}
	 */
	public static final JsonpDeserializer<SuggestUserProfilesResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SuggestUserProfilesResponse::setupSuggestUserProfilesResponseDeserializer);

	protected static void setupSuggestUserProfilesResponseDeserializer(
			ObjectDeserializer<SuggestUserProfilesResponse.Builder> op) {

		op.add(Builder::total, TotalUserProfiles._DESERIALIZER, "total");
		op.add(Builder::took, JsonpDeserializer.longDeserializer(), "took");
		op.add(Builder::profiles, JsonpDeserializer.arrayDeserializer(UserProfile._DESERIALIZER), "profiles");

	}

}
