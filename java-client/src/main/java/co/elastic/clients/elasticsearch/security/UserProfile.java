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

import co.elastic.clients.json.JsonData;
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
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: security._types.UserProfile

/**
 *
 * @see <a href="../doc-files/api-spec.html#security._types.UserProfile">API
 *      specification</a>
 */
@JsonpDeserializable
public class UserProfile implements JsonpSerializable {
	private final String uid;

	private final UserProfileUser user;

	private final Map<String, JsonData> data;

	private final Map<String, JsonData> labels;

	@Nullable
	private final Boolean enabled;

	// ---------------------------------------------------------------------------------------------

	protected UserProfile(AbstractBuilder<?> builder) {

		this.uid = ApiTypeHelper.requireNonNull(builder.uid, this, "uid");
		this.user = ApiTypeHelper.requireNonNull(builder.user, this, "user");
		this.data = ApiTypeHelper.unmodifiableRequired(builder.data, this, "data");
		this.labels = ApiTypeHelper.unmodifiableRequired(builder.labels, this, "labels");
		this.enabled = builder.enabled;

	}

	public static UserProfile userProfileOf(Function<Builder, ObjectBuilder<UserProfile>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code uid}
	 */
	public final String uid() {
		return this.uid;
	}

	/**
	 * Required - API name: {@code user}
	 */
	public final UserProfileUser user() {
		return this.user;
	}

	/**
	 * Required - API name: {@code data}
	 */
	public final Map<String, JsonData> data() {
		return this.data;
	}

	/**
	 * Required - API name: {@code labels}
	 */
	public final Map<String, JsonData> labels() {
		return this.labels;
	}

	/**
	 * API name: {@code enabled}
	 */
	@Nullable
	public final Boolean enabled() {
		return this.enabled;
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

		generator.writeKey("uid");
		generator.write(this.uid);

		generator.writeKey("user");
		this.user.serialize(generator, mapper);

		if (ApiTypeHelper.isDefined(this.data)) {
			generator.writeKey("data");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.data.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.labels)) {
			generator.writeKey("labels");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.labels.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.enabled != null) {
			generator.writeKey("enabled");
			generator.write(this.enabled);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UserProfile}.
	 */

	public static class Builder extends UserProfile.AbstractBuilder<Builder> implements ObjectBuilder<UserProfile> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link UserProfile}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UserProfile build() {
			_checkSingleUse();

			return new UserProfile(this);
		}
	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				WithJsonObjectBuilderBase<BuilderT> {
		private String uid;

		private UserProfileUser user;

		private Map<String, JsonData> data;

		private Map<String, JsonData> labels;

		@Nullable
		private Boolean enabled;

		/**
		 * Required - API name: {@code uid}
		 */
		public final BuilderT uid(String value) {
			this.uid = value;
			return self();
		}

		/**
		 * Required - API name: {@code user}
		 */
		public final BuilderT user(UserProfileUser value) {
			this.user = value;
			return self();
		}

		/**
		 * Required - API name: {@code user}
		 */
		public final BuilderT user(Function<UserProfileUser.Builder, ObjectBuilder<UserProfileUser>> fn) {
			return this.user(fn.apply(new UserProfileUser.Builder()).build());
		}

		/**
		 * Required - API name: {@code data}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>data</code>.
		 */
		public final BuilderT data(Map<String, JsonData> map) {
			this.data = _mapPutAll(this.data, map);
			return self();
		}

		/**
		 * Required - API name: {@code data}
		 * <p>
		 * Adds an entry to <code>data</code>.
		 */
		public final BuilderT data(String key, JsonData value) {
			this.data = _mapPut(this.data, key, value);
			return self();
		}

		/**
		 * Required - API name: {@code labels}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>labels</code>.
		 */
		public final BuilderT labels(Map<String, JsonData> map) {
			this.labels = _mapPutAll(this.labels, map);
			return self();
		}

		/**
		 * Required - API name: {@code labels}
		 * <p>
		 * Adds an entry to <code>labels</code>.
		 */
		public final BuilderT labels(String key, JsonData value) {
			this.labels = _mapPut(this.labels, key, value);
			return self();
		}

		/**
		 * API name: {@code enabled}
		 */
		public final BuilderT enabled(@Nullable Boolean value) {
			this.enabled = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link UserProfile}
	 */
	public static final JsonpDeserializer<UserProfile> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			UserProfile::setupUserProfileDeserializer);

	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupUserProfileDeserializer(
			ObjectDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::uid, JsonpDeserializer.stringDeserializer(), "uid");
		op.add(AbstractBuilder::user, UserProfileUser._DESERIALIZER, "user");
		op.add(AbstractBuilder::data, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "data");
		op.add(AbstractBuilder::labels, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "labels");
		op.add(AbstractBuilder::enabled, JsonpDeserializer.booleanDeserializer(), "enabled");

	}

}
