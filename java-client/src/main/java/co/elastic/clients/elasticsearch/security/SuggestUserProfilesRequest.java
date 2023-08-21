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
import co.elastic.clients.elasticsearch.security.suggest_user_profiles.Hint;
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
import java.lang.Long;
import java.lang.String;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security.suggest_user_profiles.Request

/**
 * Get suggestions for user profiles that match specified search criteria.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#security.suggest_user_profiles.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class SuggestUserProfilesRequest extends RequestBase implements JsonpSerializable {
	private final List<String> data;

	@Nullable
	private final Hint hint;

	@Nullable
	private final String name;

	@Nullable
	private final Long size;

	// ---------------------------------------------------------------------------------------------

	private SuggestUserProfilesRequest(Builder builder) {

		this.data = ApiTypeHelper.unmodifiable(builder.data);
		this.hint = builder.hint;
		this.name = builder.name;
		this.size = builder.size;

	}

	public static SuggestUserProfilesRequest of(Function<Builder, ObjectBuilder<SuggestUserProfilesRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * List of filters for the <code>data</code> field of the profile document. To
	 * return all content use <code>data=*</code>. To return a subset of content use
	 * <code>data=&lt;key&gt;</code> to retrieve content nested under the specified
	 * <code>&lt;key&gt;</code>. By default returns no <code>data</code> content.
	 * <p>
	 * API name: {@code data}
	 */
	public final List<String> data() {
		return this.data;
	}

	/**
	 * Extra search criteria to improve relevance of the suggestion result. Profiles
	 * matching the spcified hint are ranked higher in the response. Profiles not
	 * matching the hint don't exclude the profile from the response as long as the
	 * profile matches the <code>name</code> field query.
	 * <p>
	 * API name: {@code hint}
	 */
	@Nullable
	public final Hint hint() {
		return this.hint;
	}

	/**
	 * Query string used to match name-related fields in user profile documents.
	 * Name-related fields are the user's <code>username</code>,
	 * <code>full_name</code>, and <code>email</code>.
	 * <p>
	 * API name: {@code name}
	 */
	@Nullable
	public final String name() {
		return this.name;
	}

	/**
	 * Number of profiles to return.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final Long size() {
		return this.size;
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

		if (ApiTypeHelper.isDefined(this.data)) {
			generator.writeKey("data");
			generator.writeStartArray();
			for (String item0 : this.data) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.hint != null) {
			generator.writeKey("hint");
			this.hint.serialize(generator, mapper);

		}
		if (this.name != null) {
			generator.writeKey("name");
			generator.write(this.name);

		}
		if (this.size != null) {
			generator.writeKey("size");
			generator.write(this.size);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SuggestUserProfilesRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<SuggestUserProfilesRequest> {
		@Nullable
		private List<String> data;

		@Nullable
		private Hint hint;

		@Nullable
		private String name;

		@Nullable
		private Long size;

		/**
		 * List of filters for the <code>data</code> field of the profile document. To
		 * return all content use <code>data=*</code>. To return a subset of content use
		 * <code>data=&lt;key&gt;</code> to retrieve content nested under the specified
		 * <code>&lt;key&gt;</code>. By default returns no <code>data</code> content.
		 * <p>
		 * API name: {@code data}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>data</code>.
		 */
		public final Builder data(List<String> list) {
			this.data = _listAddAll(this.data, list);
			return this;
		}

		/**
		 * List of filters for the <code>data</code> field of the profile document. To
		 * return all content use <code>data=*</code>. To return a subset of content use
		 * <code>data=&lt;key&gt;</code> to retrieve content nested under the specified
		 * <code>&lt;key&gt;</code>. By default returns no <code>data</code> content.
		 * <p>
		 * API name: {@code data}
		 * <p>
		 * Adds one or more values to <code>data</code>.
		 */
		public final Builder data(String value, String... values) {
			this.data = _listAdd(this.data, value, values);
			return this;
		}

		/**
		 * Extra search criteria to improve relevance of the suggestion result. Profiles
		 * matching the spcified hint are ranked higher in the response. Profiles not
		 * matching the hint don't exclude the profile from the response as long as the
		 * profile matches the <code>name</code> field query.
		 * <p>
		 * API name: {@code hint}
		 */
		public final Builder hint(@Nullable Hint value) {
			this.hint = value;
			return this;
		}

		/**
		 * Extra search criteria to improve relevance of the suggestion result. Profiles
		 * matching the spcified hint are ranked higher in the response. Profiles not
		 * matching the hint don't exclude the profile from the response as long as the
		 * profile matches the <code>name</code> field query.
		 * <p>
		 * API name: {@code hint}
		 */
		public final Builder hint(Function<Hint.Builder, ObjectBuilder<Hint>> fn) {
			return this.hint(fn.apply(new Hint.Builder()).build());
		}

		/**
		 * Query string used to match name-related fields in user profile documents.
		 * Name-related fields are the user's <code>username</code>,
		 * <code>full_name</code>, and <code>email</code>.
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(@Nullable String value) {
			this.name = value;
			return this;
		}

		/**
		 * Number of profiles to return.
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Long value) {
			this.size = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SuggestUserProfilesRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SuggestUserProfilesRequest build() {
			_checkSingleUse();

			return new SuggestUserProfilesRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SuggestUserProfilesRequest}
	 */
	public static final JsonpDeserializer<SuggestUserProfilesRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SuggestUserProfilesRequest::setupSuggestUserProfilesRequestDeserializer);

	protected static void setupSuggestUserProfilesRequestDeserializer(
			ObjectDeserializer<SuggestUserProfilesRequest.Builder> op) {

		op.add(Builder::data, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "data");
		op.add(Builder::hint, Hint._DESERIALIZER, "hint");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::size, JsonpDeserializer.longDeserializer(), "size");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.suggest_user_profiles}".
	 */
	public static final Endpoint<SuggestUserProfilesRequest, SuggestUserProfilesResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/security.suggest_user_profiles",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_security/profile/_suggest";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, SuggestUserProfilesResponse._DESERIALIZER);
}
